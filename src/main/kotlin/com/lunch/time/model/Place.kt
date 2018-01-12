package com.lunch.time.model

import com.lunch.time.model.enums.Price
import com.lunch.time.model.enums.Time
import javax.persistence.*
import javax.persistence.GenerationType.AUTO

@Entity
data class Place(
        var name: String = "",
        @Enumerated(EnumType.STRING) var time: Time = Time.NORMAL,
        @Enumerated(EnumType.STRING) var price: Price = Price.NORMAL,
        @Id @GeneratedValue(strategy = AUTO) var id: Long? = null
)
