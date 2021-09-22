package com.gabensoft.model

import com.gabensoft.model.utils.FuelType

abstract class FourWheelVehicle(open val id: Int, open val licensePlate: String, open val seats: Int,
                                open val engineSize: Float, open val fuelType: FuelType) : Vehicle
