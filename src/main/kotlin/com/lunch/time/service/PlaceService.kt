package com.lunch.time.service

import com.lunch.time.model.ChoiceInformation
import com.lunch.time.model.Place
import com.lunch.time.model.PlaceRepository
import org.springframework.stereotype.Service
import java.util.*
import java.util.stream.Collectors
import javax.transaction.Transactional


@Service
@Transactional
class PlaceService(val repository: PlaceRepository) {

    var lastPlace: Place? = null

    fun go(choiceInformation: ChoiceInformation): Place {
        val filteredList = repository.findByNameNotLikeAndTimeEqualsAndPriceEquals(
                choiceInformation.lastPlaceVisited,
                choiceInformation.time,
                choiceInformation.price
        ).filter({ p ->
            p != lastPlace
        }).collect(Collectors.toList())
        Collections.shuffle(filteredList)
        val place = filteredList.stream()
                .findAny()
                .orElseThrow({ IllegalArgumentException("Place not found") })
        lastPlace = place
        return place
    }

}
