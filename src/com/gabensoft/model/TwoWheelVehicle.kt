package com.gabensoft.model

import com.gabensoft.model.utils.FuelType

abstract class TwoWheelVehicle(open val id: Int, open val licensePlate: String, open val seats: Int,
                               open val engineSize: Int, open val fuelType: FuelType) : Vehicle
