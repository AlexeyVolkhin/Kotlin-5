package ru.otus.cars


object GazStation {
    fun carRefuel(car: Car, fuelNumber: Int) {
        val fuelType = car.carOutput.getFuelType()
        try {
            car.tank.TankMouth().addFuel(fuelNumber, fuelType)
        } catch (e: Exception) {
            println("Упс... Мы бесплатно проведем очистку топливной системы")
        }
    }
}