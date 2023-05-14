package com.devedroy.hospitalktor.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://hospitalapi.vercel.app/"


object RetrofitInstance {
    val hospitalInstance: HospitalInterface

    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        hospitalInstance = retrofit.create(HospitalInterface::class.java)
    }
}