package com.gabensoft.model.entities

import com.gabensoft.model.dto.BicycleDTO
import com.gabensoft.model.utils.FuelType

class BicycleDAO {
    private var bicycles: ArrayList<BicycleDTO> = ArrayList()

    fun create(id: Int, licensePlate: String, seats: Int, engineSize: Int, fuelType: FuelType) {
        bicycles.firstOrNull { it.id == id }?: run {
            bicycles.add(BicycleDTO(id, licensePlate, seats, engineSize, fuelType))
        }
    }

    fun read(id: Int): BicycleDTO? = bicycles.find { it.id == id }

    fun searchByLicensePlane(licensePlate: String): List<BicycleDTO> = bicycles.filter { it.licensePlate.contains(licensePlate) }

    fun searchBySeats(seats: Int): List<BicycleDTO> = bicycles.filter { it.seats == seats }

    fun searchByEngineSize(engineSize: Int): List<BicycleDTO> = bicycles.filter { it.engineSize == engineSize }

    fun searchByFuelType(fuelType: FuelType): List<BicycleDTO> = bicycles.filter { it.fuelType == fuelType }

    fun update(bicycle: BicycleDTO, licensePlate: String, seats: Int, engineSize: Int, fuelType: FuelType) {
        bicycles.firstOrNull { it == bicycle }?.let {
            it.licensePlate = licensePlate
            it.seats = seats
            it.engineSize = engineSize
            it.fuelType = fuelType
        }
    }

    fun delete(bicycle: BicycleDTO) = bicycles.remove(bicycle)
}