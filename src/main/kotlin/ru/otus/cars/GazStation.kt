package ru.otus.cars

import ru.otus.cars.Tank.Companion.FuelType

object GazStation {
    fun carRefuel(car: Car, fuelType: FuelType, fuelNumber: Int) {
        try {
            car.tank.TankMouth().addFuel(fuelNumber, fuelType)
        } catch (e: Exception) {
            println("Упс... Мы бесплатно проведем очистку топливной системы")
        }
    }
}