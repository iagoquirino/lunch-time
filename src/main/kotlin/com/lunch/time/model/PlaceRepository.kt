package com.lunch.time.model

import com.lunch.time.model.enums.Price
import com.lunch.time.model.enums.Time
import org.springframework.data.repository.CrudRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource
import org.springframework.data.rest.core.annotation.RestResource
import java.util.stream.Stream

@RepositoryRestResource(collectionResourceRel = "places", path = "places")
interface PlaceRepository : CrudRepository<Place, Long> {

    @RestResource(exported = false)
    fun findByNameNotLikeAndTimeEqualsAndPriceEquals(name: String, time: Time, price: Price): Stream<Place>

}
