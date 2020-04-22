package com.rubenmimoun.meteoapp.connections

import com.rubenmimoun.meteoapp.helper.AnyDict
import com.rubenmimoun.meteoapp.helper.ArrayAnyDict
import com.rubenmimoun.meteoapp.helper.baseUrl
import io.reactivex.Observable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi{

    companion object{
        fun create() : WeatherApi {

            val logging =  HttpLoggingInterceptor()
            logging.level = HttpLoggingInterceptor.Level.BODY
            val client  = OkHttpClient.Builder()
                .addInterceptor(logging)
                .build()

            val retrofit =  Retrofit.Builder()
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(baseUrl)
                .build()

            return retrofit.create(WeatherApi::class.java)


        }
    }

    @GET("weather")
    fun fetchWeather(@Query("lat") lat: Double,
                     @Query ("lon") lon : Double,
                     @Query("appid") apiKey : String)
    : Observable<Response<AnyDict>>

    @GET("weather")
    fun fetchWeatherArray(@Query("lat") lat: Double,
                     @Query ("lon") lon : Double,
                     @Query("appid") apiKey : String)
            : Observable<Response<ArrayAnyDict>>




}