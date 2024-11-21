package ru.otus.cars

class Tank(val fuelType: FuelType) {
    var fuelValue = 0


    inner class TankMouth() {
        fun addFuel(value: Int, type: FuelType) {
            if (type != this@Tank.fuelType) {
                println("НЕ ТО ТОПЛИВО! ВИУ-ВИУ! ТЫ АРЕСТОВАН ЗА ТУПОСТЬ")
                throw Exception("НЕ ТО ТОПЛИВО! ВИУ-ВИУ! ТЫ АРЕСТОВАН ЗА ТУПОСТЬ")
                return
            }
            fuelValue += value
            println("Заправлено литров топлива: $value")

        }


    }
}