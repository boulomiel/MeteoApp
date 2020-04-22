package com.rubenmimoun.meteoapp

import android.content.Context
import android.content.SharedPreferences
import android.location.Location
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.google.android.material.snackbar.Snackbar
import com.rubenmimoun.meteoapp.helper.LocationHelper
import com.rubenmimoun.meteoapp.model.Weather
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {


    private val  viewModel : ActivityModel by lazy {
        ViewModelProviders.of(this).get(ActivityModel::class.java)
    }

    private val PREF_NAME = "weatherlist"
    private var mWeather : Weather? = null


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)


        viewModel.location.observe(this, Observer {
            Log.i("user location" ,"${it.latitude} : ${it.longitude}")

        })

        viewModel.weatherData.observe(this, Observer { weather ->

            Log.i("Weather object", weather.toString())
            temperature.text = "Temperature: \n ${weather.temp}"
            cityName.text = weather.name
            feelsLike.text = "Feels like : \n ${weather.feels_Like}"
            humidity.text = "Humidity : \n ${weather.feels_Like}"
            windspeed.text = "Wind speed : \n ${weather.feels_Like}"

            mWeather = weather

        })



        LocationHelper().startListeningUserLocation(this, object : LocationHelper.MyLocationListener{
            override fun onLocationChanged(location: Location) {
              viewModel.fetchLocation(location)
            }

        })


        fab.setOnClickListener { view ->
            var list = mutableListOf<Weather>()
            if(mWeather != null){
              list = viewModel.processEvents(mutableListOf(mWeather!!))
            }

            }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }



}
