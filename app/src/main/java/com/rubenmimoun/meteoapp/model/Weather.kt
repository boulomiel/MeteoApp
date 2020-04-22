package com.rubenmimoun.meteoapp.model

import com.rubenmimoun.meteoapp.helper.AnyDict
import com.rubenmimoun.meteoapp.helper.ArrayAnyDict
import java.util.*

data class Weather(
    val name: String,
    val temp: Double,
    val feels_Like: Double,
    val humidity : Double,
    val speedWind : Double
    ) {

    companion object {
        @Suppress("UNCHECKED_CAST")
        fun fromAnyDict(dict: AnyDict): Weather? {
            val main = dict["main"] as? AnyDict
            val wind = dict["wind"] as? AnyDict
            val name = dict["name"] as? String
            val temp = main?.get("temp") as? Double
            val feels_like = main?.get("feels_like") as? Double
            var humidity = main?.get("humidity") as? Double
            val speedWind =  wind?.get("speed") as? Double

            if (name == null  || temp == null || feels_like == null
                || humidity == null || speedWind == null 
            ) {
                return null
            }

            return Weather(name,temp,feels_like,humidity,speedWind)
        }


    }
}
