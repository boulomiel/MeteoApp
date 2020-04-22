package com.rubenmimoun.meteoapp.connections;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJB\u0010\u0002\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0005j\u0002`\u00060\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\'JL\u0010\f\u001a(\u0012$\u0012\"\u0012\u001e\u0012\u001c\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0005j\u0002`\u00060\rj\u0002`\u000e0\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u000bH\'\u00a8\u0006\u0010"}, d2 = {"Lcom/rubenmimoun/meteoapp/connections/WeatherApi;", "", "fetchWeather", "Lio/reactivex/Observable;", "Lretrofit2/Response;", "", "Lcom/rubenmimoun/meteoapp/helper/AnyDict;", "lat", "", "lon", "apiKey", "", "fetchWeatherArray", "", "Lcom/rubenmimoun/meteoapp/helper/ArrayAnyDict;", "Companion", "app_debug"})
public abstract interface WeatherApi {
    public static final com.rubenmimoun.meteoapp.connections.WeatherApi.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "weather")
    public abstract io.reactivex.Observable<retrofit2.Response<java.util.Map<java.lang.Object, java.lang.Object>>> fetchWeather(@retrofit2.http.Query(value = "lat")
    double lat, @retrofit2.http.Query(value = "lon")
    double lon, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appid")
    java.lang.String apiKey);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "weather")
    public abstract io.reactivex.Observable<retrofit2.Response<java.util.Map<java.lang.Object, java.lang.Object>[]>> fetchWeatherArray(@retrofit2.http.Query(value = "lat")
    double lat, @retrofit2.http.Query(value = "lon")
    double lon, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "appid")
    java.lang.String apiKey);
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/rubenmimoun/meteoapp/connections/WeatherApi$Companion;", "", "()V", "create", "Lcom/rubenmimoun/meteoapp/connections/WeatherApi;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.rubenmimoun.meteoapp.connections.WeatherApi create() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}