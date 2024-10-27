package com.naeemnoman.serialno3.resetapi_dipti_amad_l4_04_17

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiInstance_04_17 {


    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.escuelajs.co/api/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiservice0417 = retrofit.create(Apiservice_04_17::class.java)


}