package com.gabensoft.model

import com.gabensoft.model.entities.BicycleDAO
import com.gabensoft.model.entities.CarDAO
import com.gabensoft.model.entities.MotorbikeDAO
import com.gabensoft.model.entities.SUVDAO
import com.gabensoft.model.persistence.dbConn
import com.gabensoft.model.utils.FuelType

class VehicleContainer {
    private val bicycles: BicycleDAO = BicycleDAO()
    private val motorbike: MotorbikeDAO = MotorbikeDAO()
    private val car: CarDAO = CarDAO()
    private val suv: SUVDAO = SUVDAO()
    private val db: dbConn = dbConn()

    fun createBicycle(id: Int, licensePlate: String, seats: Int, engineSize: Int, fuelType: FuelType) {
        bicycles.create(id, licensePlate, seats, engineSize, fuelType)
        db.insertBicycle(id,  licensePlate, seats, engineSize, fuelType.toString())
    }
}