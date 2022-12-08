package com.example.myapplication

import retrofit2.Call
import retrofit2.http.GET

interface Api {

    @GET("products")
    fun getData(): Call<List<myDataItem>>

}