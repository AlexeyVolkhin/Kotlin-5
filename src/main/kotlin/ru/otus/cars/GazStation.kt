package ru.otus.cars


object GazStation {
    fun carRefuelPropane(car: Car,  fuelNumber: Int) {
        try {
            car.tank.TankMouth().addFuel(fuelNumber, FuelType.PROPANE)
        } catch (e: Exception) {
            println("Упс... Мы бесплатно проведем очистку топливной системы")
        }
    }
    fun carRefuelPetrol(car: Car,  fuelNumber: Int) {
        try {
            car.tank.TankMouth().addFuel(fuelNumber, FuelType.PETROL)
        } catch (e: Exception) {
            println("Упс... Мы бесплатно проведем очистку топливной системы")
        }
    }
}