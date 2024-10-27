package com.naeemnoman.serialno3.resetapi_dipti_amad_l4_04_17

import retrofit2.http.GET

interface Apiservice_04_17 {

    @GET("products")
    suspend fun getProducts(): List<Product_04_17>

}