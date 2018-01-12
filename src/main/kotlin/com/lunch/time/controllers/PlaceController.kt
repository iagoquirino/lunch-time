package com.lunch.time.controllers

import com.lunch.time.model.ChoiceInformation
import com.lunch.time.model.ChoiceResult
import com.lunch.time.service.PlaceService
import org.springframework.http.ResponseEntity
import org.springframework.http.ResponseEntity.ok
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/places")
class PlaceController(val service: PlaceService) {

    @PostMapping(value = ["/go"])
    fun go(@RequestBody information: ChoiceInformation): ResponseEntity<ChoiceResult> {
        val place = service.go(information)
        return ok(ChoiceResult(information, place))
    }

}
