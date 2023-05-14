package com.devedroy.hospitalktor.data.dto


data class HospitalResponseItem(
    val __v: Int,
    val _id: String,
    val address: String,
    val departments: List<Department>,
    val location: Location,
    val name: String,
    val rating: Int,
    val surgeries: List<Surgery>,
    val test: List<Any>,
    val tests: List<Test>
)