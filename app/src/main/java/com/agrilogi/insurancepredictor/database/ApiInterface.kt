package com.agrilogi.insurancepredictor.database

import okhttp3.RequestBody
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiInterface {
    @POST("/ml-tester")
    suspend fun getCharge(@Body requestBody: RequestBody): Response<ResponseBody>
}