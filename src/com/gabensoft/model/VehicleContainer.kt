package com.gabensoft.model

import com.gabensoft.model.entities.BicycleDAO
import com.gabensoft.model.entities.CarDAO
import com.gabensoft.model.entities.MotorbikeDAO
import com.gabensoft.model.entities.SUVDAO

class VehicleContainer {
    private val bicycles: BicycleDAO = BicycleDAO()
    private val motorbike: MotorbikeDAO = MotorbikeDAO()
    private val car: CarDAO = CarDAO()
    private val suv: SUVDAO = SUVDAO()
}