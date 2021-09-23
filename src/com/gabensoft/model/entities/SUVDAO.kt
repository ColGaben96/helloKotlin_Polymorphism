package com.gabensoft.model.entities

import com.gabensoft.model.dto.SUVDTO
import com.gabensoft.model.utils.FuelType

class SUVDAO {
    private var suvs: ArrayList<SUVDTO> = ArrayList()

    fun create(id: Int, licensePlate: String, seats: Int, engineSize: Float, fuelType: FuelType) {
        suvs.firstOrNull { it.id == id } ?: run { suvs.add(SUVDTO(id, licensePlate, seats, engineSize, fuelType)) }
    }

    fun read(id: Int): SUVDTO? = suvs.find { it.id == id }

    fun searchByLicensePlate(licensePlate: String): List<SUVDTO> = suvs.filter { it.licensePlate.contains(licensePlate) }

    fun searchBySeats(seats: Int): List<SUVDTO> = suvs.filter { it.seats == seats }

    fun searchByEngineSize(engineSize: Float): List<SUVDTO> = suvs.filter { it.engineSize == engineSize }

    fun searchByFuelType(fuelType: FuelType): List<SUVDTO> = suvs.filter { it.fuelType == fuelType }

    fun update(suv: SUVDTO, licensePlate: String, seats: Int, engineSize: Float, fuelType: FuelType) {
        suvs.firstOrNull { it == suv }?.let {
            it.licensePlate = licensePlate
            it.seats = seats
            it.engineSize = engineSize
            it.fuelType = fuelType
        }
    }

    fun delete(suv: SUVDTO) = suvs.remove(suv)
}