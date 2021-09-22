package com.gabensoft.model.dto

import com.gabensoft.model.FourWheelVehicle
import com.gabensoft.model.utils.FuelType
import java.io.Serializable

data class SUVDTO(override val id: Int, override val licensePlate: String, override val seats: Int,
                  override val engineSize: Float, override val fuelType: FuelType) :
    FourWheelVehicle(id, licensePlate, seats, engineSize, fuelType), Serializable
