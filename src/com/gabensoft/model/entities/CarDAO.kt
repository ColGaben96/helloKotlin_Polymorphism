package com.gabensoft.model.entities

import com.gabensoft.model.dto.CarDTO
import com.gabensoft.model.utils.FuelType

class CarDAO {
    private var cars: ArrayList<CarDTO> = ArrayList()

    fun create(id: Int, licensePlate: String, seats: Int, engineSize: Float, fuelType: FuelType) {
        cars.firstOrNull { it.id == id } ?: run { cars.add(CarDTO(id, licensePlate, seats, engineSize, fuelType)) }
    }

    fun read(id: Int): CarDTO? = cars.find { it.id == id }

    fun searchByLicensePlate(licensePlate: String): List<CarDTO> = cars.filter { it.licensePlate.contains(licensePlate) }

    fun searchBySeats(seats: Int): List<CarDTO> = cars.filter { it.seats == seats }

    fun searchByEngineSize(engineSize: Float): List<CarDTO> = cars.filter { it.engineSize == engineSize }

    fun searchByFuelType(fuelType: FuelType): List<CarDTO> = cars.filter { it.fuelType == fuelType }

    fun update(car: CarDTO, licensePlate: String, seats: Int, engineSize: Float, fuelType: FuelType) {
        cars.firstOrNull { it == car } ?.let {
            it.licensePlate = licensePlate
            it.seats = seats
            it.engineSize = engineSize
            it.fuelType = fuelType
        }
    }

    fun delete(car: CarDTO) = cars.remove(car)
}