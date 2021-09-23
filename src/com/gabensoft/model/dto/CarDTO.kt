package com.gabensoft.model.dto

import com.gabensoft.model.FourWheelVehicle
import com.gabensoft.model.utils.FuelType
import java.io.Serializable

data class CarDTO(override val id: Int, override var licensePlate: String, override var seats: Int,
                  override var engineSize: Float, override var fuelType: FuelType) :
    FourWheelVehicle(id, licensePlate, seats, engineSize, fuelType), Serializable
