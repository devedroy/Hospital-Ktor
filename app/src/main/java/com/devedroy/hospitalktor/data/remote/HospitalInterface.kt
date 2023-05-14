package com.devedroy.hospitalktor.data.remote

import com.devedroy.hospitalktor.data.dto.HospitalResponseItem
import retrofit2.Call
import retrofit2.http.GET

interface HospitalInterface {
    @GET("/hospitals")
    fun getHospitals(): Call<List<HospitalResponseItem>>
}