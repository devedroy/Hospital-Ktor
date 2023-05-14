package com.devedroy.hospitalktor

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.devedroy.hospitalktor.data.dto.HospitalResponseItem
import com.devedroy.hospitalktor.data.remote.RetrofitInstance
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getHospitals()
    }

    private fun getHospitals() {
        val hospitals = RetrofitInstance.hospitalInstance.getHospitals()
        hospitals.enqueue(object : Callback<List<HospitalResponseItem>> {

            override fun onResponse(
                call: Call<List<HospitalResponseItem>>,
                response: Response<List<HospitalResponseItem>>
            ) {
                Log.d("RetrofitResponse", response.body().toString())
            }

            override fun onFailure(call: Call<List<HospitalResponseItem>>, t: Throwable) {
                Log.d("RetrofitResponse", "Failed to get response")
            }
        })
    }
}


