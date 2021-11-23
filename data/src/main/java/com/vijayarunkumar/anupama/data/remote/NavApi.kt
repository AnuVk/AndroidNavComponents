package com.vijayarunkumar.anupama.data.remote

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface NavApi {
    @GET("v1/1/filter.php")
    fun getMenuInfo(@Query("c") category:String): Single<InfoApiContract.MealInfo>

}