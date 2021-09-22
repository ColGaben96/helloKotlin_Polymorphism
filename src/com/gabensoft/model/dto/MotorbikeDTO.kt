package com.gabensoft.model.dto

import com.gabensoft.model.TwoWheelVehicle
import com.gabensoft.model.utils.FuelType
import java.io.Serializable

data class MotorbikeDTO(override val id: Int, override val licensePlate: String, override val seats: Int,
                        override val engineSize: Int, override val fuelType: FuelType) :
    TwoWheelVehicle(id, licensePlate, seats, engineSize, fuelType), Serializable
