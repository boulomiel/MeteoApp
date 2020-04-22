package com.rubenmimoun.meteoapp

import android.content.SharedPreferences
import android.location.Location
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rubenmimoun.meteoapp.connections.WeatherApi
import com.rubenmimoun.meteoapp.helper.apiKey
import com.rubenmimoun.meteoapp.model.Weather
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class ActivityModel : ViewModel() {

    var location = MutableLiveData<Location>()
    var weatherData = MutableLiveData<Weather>()
    var visitedList = mutableListOf<Weather>()
    val weatherLiveData = MutableLiveData<List<Weather>>()

    private val disposables = CompositeDisposable()




    var weatherApi = WeatherApi.create()

     fun processEvents(newWeathers: List<Weather>) : MutableList<Weather> {
        var updatedList = newWeathers + visitedList
        visitedList = updatedList.toMutableList()
        weatherLiveData.value = visitedList

         return visitedList

    }



    fun fetchLocation(mLocation: Location){
        location.value = mLocation


        var apiReponse = weatherApi.fetchWeather(location.value!!.latitude, location.value!!.longitude, apiKey)

        val locationObservable =
            apiReponse
                .filter{response ->
            (200..300).contains(response.code())
        }
            .map { response->
                response.body()
            }
                .map {objects ->
                Weather.fromAnyDict(objects)
            }
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                { events ->
                    weatherData.value = events
                },
                { error -> println("Events Error ::: ${error.message}") }
            )

        disposables.add(locationObservable)


    }

}