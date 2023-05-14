package com.devedroy.hospitalktor.data.dto

data class Doctor(
    val _id: String,
    val arrivalTime: String,
    val departTime: String,
    val name: String,
    val qualification: String,
    val specilization: String
)