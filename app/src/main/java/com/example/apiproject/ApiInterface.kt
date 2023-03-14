package com.example.apiproject

import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {
    @GET("product")
    fun getProductData() : Call<myData>

}