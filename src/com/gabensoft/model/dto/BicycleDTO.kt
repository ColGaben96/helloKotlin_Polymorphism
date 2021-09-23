package com.gabensoft.model.dto

import com.gabensoft.model.TwoWheelVehicle
import com.gabensoft.model.utils.FuelType
import java.io.Serializable

data class BicycleDTO(override val id: Int, override var licensePlate: String, override var seats: Int,
                      override var engineSize: Int, override var fuelType: FuelType) :
    TwoWheelVehicle(id, licensePlate, seats, engineSize, fuelType), Serializable
