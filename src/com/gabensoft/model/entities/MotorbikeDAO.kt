package com.gabensoft.model.entities

import com.gabensoft.model.dto.MotorbikeDTO
import com.gabensoft.model.utils.FuelType

class MotorbikeDAO {
    private var motorbikes: ArrayList<MotorbikeDTO> = ArrayList()

    fun create(id: Int, licensePlate: String, seats: Int, engineSize: Int, fuelType: FuelType) {
        motorbikes.firstOrNull { it.id == id }?: run {
            motorbikes.add(MotorbikeDTO(id, licensePlate, seats, engineSize, fuelType))
        }
    }

    fun read(id: Int): MotorbikeDTO? = motorbikes.find { it.id == id }

    fun searchByLicensePlate(licensePlate: String) = motorbikes.filter { it.licensePlate.contains(licensePlate) }

    fun searchBySeats(seats: Int) = motorbikes.filter { it.seats == seats }

    fun searchByEngineSize(engineSize: Int) = motorbikes.filter { it.engineSize == engineSize }

    fun searchByFuelType(fuelType: FuelType) = motorbikes.filter { it.fuelType == fuelType }

    fun update(motorbike: MotorbikeDTO, licensePlate: String, seats: Int, engineSize: Int, fuelType: FuelType) {
        motorbikes.firstOrNull { it == motorbike }?.let {
            it.licensePlate = licensePlate
            it.seats = seats
            it.engineSize = engineSize
            it.fuelType = fuelType
        }
    }

    fun delete(motorbike: MotorbikeDTO) = motorbikes.remove(motorbike)
}