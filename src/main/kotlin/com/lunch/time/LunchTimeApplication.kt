package com.lunch.time

import com.lunch.time.model.Place
import com.lunch.time.model.PlaceRepository
import com.lunch.time.model.enums.Price
import com.lunch.time.model.enums.Time
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import javax.annotation.PostConstruct

@SpringBootApplication
class LunchTimeApplication(var repository: PlaceRepository) {

    @PostConstruct
    fun init() {
        repository.save(Place("Shopping Dom Pedro", Time.LATE, Price.NORMAL))
        repository.save(Place("Rolinha", Time.NORMAL, Price.NORMAL))
        repository.save(Place("Ganash", Time.NORMAL, Price.CHEAP))
        repository.save(Place("Villani", Time.NORMAL, Price.CHEAP))
        repository.save(Place("Careca", Time.LATE, Price.NORMAL))
        repository.save(Place("Telecamp", Time.FAST, Price.CHEAP))
        repository.save(Place("Nono", Time.FAST, Price.CHEAP))
        repository.save(Place("Big Jack", Time.LATE, Price.EXPENSIVE))
        repository.save(Place("Outback", Time.LATE, Price.EXPENSIVE))
        repository.save(Place("Lado B", Time.NORMAL, Price.EXPENSIVE))
        repository.save(Place("Aulus", Time.NORMAL, Price.NORMAL))
        repository.save(Place("Chinelinho", Time.NORMAL, Price.CHEAP))
        repository.save(Place("Moqueca", Time.LATE, Price.EXPENSIVE))
        repository.save(Place("Oliveira", Time.NORMAL, Price.NORMAL))
        repository.save(Place("Baru", Time.NORMAL, Price.NORMAL))
        repository.save(Place("Pepe Looco", Time.NORMAL, Price.NORMAL))
        repository.save(Place("Si Señor", Time.LATE, Price.EXPENSIVE))
        repository.save(Place("Nashi", Time.LATE, Price.EXPENSIVE))
        repository.save(Place("Joe & Leos", Time.LATE, Price.EXPENSIVE))
        repository.save(Place("Frango Atropelado", Time.LATE, Price.NORMAL))
        repository.save(Place("Picanharia", Time.LATE, Price.EXPENSIVE))
        repository.save(Place("Fritz", Time.NORMAL, Price.NORMAL))
        repository.save(Place("Armazém Nobre", Time.LATE, Price.NORMAL))
        repository.save(Place("Jamie Italian", Time.LATE, Price.EXPENSIVE))
        repository.save(Place("Madeiro", Time.LATE, Price.EXPENSIVE))
        repository.save(Place("ZinBar", Time.LATE, Price.NORMAL))
    }

}

fun main(args: Array<String>) {
    SpringApplication.run(LunchTimeApplication::class.java, *args)
}
