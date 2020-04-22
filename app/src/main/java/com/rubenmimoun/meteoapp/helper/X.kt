package com.rubenmimoun.meteoapp.helper

import android.annotation.SuppressLint
import java.text.DateFormat.getDateTimeInstance

@SuppressLint("SimpleDateFormat")


val baseUrl = "https://api.openweathermap.org/data/2.5/"
val apiKey = "GET-AN-API-KEY"
typealias ArrayAnyDict = Array<AnyDict>
typealias AnyDict = Map<Any,Any>



fun toDate(timeStamp : String) : String {
    val sdf = getDateTimeInstance()
   // val format = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'")
    val date = java.util.Date(timeStamp.toLong() * 1000)
   return sdf.format(date)
}



