package com.rubenmimoun.meteoapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000b\u00a8\u0006\u0019"}, d2 = {"Lcom/rubenmimoun/meteoapp/ActivityModel;", "Landroidx/lifecycle/ViewModel;", "()V", "disposables", "Lio/reactivex/disposables/CompositeDisposable;", "location", "Landroidx/lifecycle/MutableLiveData;", "Landroid/location/Location;", "getLocation", "()Landroidx/lifecycle/MutableLiveData;", "setLocation", "(Landroidx/lifecycle/MutableLiveData;)V", "weatherApi", "Lcom/rubenmimoun/meteoapp/connections/WeatherApi;", "getWeatherApi", "()Lcom/rubenmimoun/meteoapp/connections/WeatherApi;", "setWeatherApi", "(Lcom/rubenmimoun/meteoapp/connections/WeatherApi;)V", "weatherData", "Lcom/rubenmimoun/meteoapp/model/Weather;", "getWeatherData", "setWeatherData", "fetchLocation", "", "mLocation", "app_debug"})
public final class ActivityModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<android.location.Location> location;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.MutableLiveData<com.rubenmimoun.meteoapp.model.Weather> weatherData;
    private final io.reactivex.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    private com.rubenmimoun.meteoapp.connections.WeatherApi weatherApi;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<android.location.Location> getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<android.location.Location> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.rubenmimoun.meteoapp.model.Weather> getWeatherData() {
        return null;
    }
    
    public final void setWeatherData(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.rubenmimoun.meteoapp.model.Weather> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.rubenmimoun.meteoapp.connections.WeatherApi getWeatherApi() {
        return null;
    }
    
    public final void setWeatherApi(@org.jetbrains.annotations.NotNull()
    com.rubenmimoun.meteoapp.connections.WeatherApi p0) {
    }
    
    public final void fetchLocation(@org.jetbrains.annotations.NotNull()
    android.location.Location mLocation) {
    }
    
    public ActivityModel() {
        super();
    }
}