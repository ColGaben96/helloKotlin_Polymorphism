package com.gabensoft.model.persistence

import java.sql.Connection
import java.sql.DriverManager
import java.sql.ResultSet
import java.sql.Statement

class dbConn {

    private lateinit var statement: Statement
    private lateinit var resultSet: ResultSet
    private lateinit var connection: Connection

    fun insertCar(id: Int, licensePlate: String, seats: Int, engineSize: Float, fuelType: String) {
        Class.forName("com.mysql.cj.jdbc.Driver")
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/$SCHEMA", USER, PASSWORD)
        statement = connection.createStatement()
        var result = statement.executeUpdate("INSERT INTO car VALUES (id, licensePlate, seats, engineSize, fuelType)")
        connection.close()
    }

    fun insertBicycle(id: Int, licensePlate: String, seats: Int, engineSize: Int, fuelType: String) {
        Class.forName("com.mysql.cj.jdbc.Driver")
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/$SCHEMA", USER, PASSWORD)
        statement = connection.createStatement()
        var result = statement.executeUpdate("INSERT INTO bicycle VALUES (id, licensePlate, seats, engineSize, fuelType)")
        connection.close()
    }

    fun insertSuv(id: Int, licensePlate: String, seats: Int, engineSize: Float, fuelType: String) {
        Class.forName("com.mysql.cj.jdbc.Driver")
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/$SCHEMA", USER, PASSWORD)
        statement = connection.createStatement()
        var result = statement.executeUpdate("INSERT INTO suv VALUES (id, licensePlate, seats, engineSize, fuelType)")
        connection.close()
    }

    fun insertMotorbike(id: Int, licensePlate: String, seats: Int, engineSize: Int, fuelType: String) {
        Class.forName("com.mysql.cj.jdbc.Driver")
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/$SCHEMA", USER, PASSWORD)
        statement = connection.createStatement()
        var result = statement.executeUpdate("INSERT INTO motorbike VALUES (id, licensePlate, seats, engineSize, fuelType)")
        connection.close()
    }

    companion object {
        const val USER = "appUser"
        const val PASSWORD = "123456aB!"
        const val SCHEMA = "vehiclesdb"
    }
}