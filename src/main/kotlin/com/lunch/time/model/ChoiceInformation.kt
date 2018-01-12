package com.lunch.time.model

import com.lunch.time.model.enums.Price
import com.lunch.time.model.enums.Time

data class ChoiceInformation(
        var lastPlaceVisited: String = "",
        var time: Time = Time.NORMAL,
        var price: Price = Price.NORMAL
)
