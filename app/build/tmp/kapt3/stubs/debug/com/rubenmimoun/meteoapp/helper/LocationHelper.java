package com.rubenmimoun.meteoapp.helper;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fR\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0017"}, d2 = {"Lcom/rubenmimoun/meteoapp/helper/LocationHelper;", "", "()V", "LOCATION_REFRESH_DISTANCE", "", "getLOCATION_REFRESH_DISTANCE", "()I", "LOCATION_REFRESH_TIME", "getLOCATION_REFRESH_TIME", "MY_PERMISSIONS_REQUEST_LOCATION", "getMY_PERMISSIONS_REQUEST_LOCATION", "myLocationListener", "Lcom/rubenmimoun/meteoapp/helper/LocationHelper$MyLocationListener;", "getMyLocationListener", "()Lcom/rubenmimoun/meteoapp/helper/LocationHelper$MyLocationListener;", "setMyLocationListener", "(Lcom/rubenmimoun/meteoapp/helper/LocationHelper$MyLocationListener;)V", "startListeningUserLocation", "", "context", "Landroid/content/Context;", "myListener", "MyLocationListener", "app_debug"})
public final class LocationHelper {
    private final int LOCATION_REFRESH_TIME = 3000;
    private final int LOCATION_REFRESH_DISTANCE = 30;
    private final int MY_PERMISSIONS_REQUEST_LOCATION = 100;
    @org.jetbrains.annotations.Nullable()
    private com.rubenmimoun.meteoapp.helper.LocationHelper.MyLocationListener myLocationListener;
    
    public final int getLOCATION_REFRESH_TIME() {
        return 0;
    }
    
    public final int getLOCATION_REFRESH_DISTANCE() {
        return 0;
    }
    
    public final int getMY_PERMISSIONS_REQUEST_LOCATION() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.rubenmimoun.meteoapp.helper.LocationHelper.MyLocationListener getMyLocationListener() {
        return null;
    }
    
    public final void setMyLocationListener(@org.jetbrains.annotations.Nullable()
    com.rubenmimoun.meteoapp.helper.LocationHelper.MyLocationListener p0) {
    }
    
    public final void startListeningUserLocation(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.rubenmimoun.meteoapp.helper.LocationHelper.MyLocationListener myListener) {
    }
    
    public LocationHelper() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/rubenmimoun/meteoapp/helper/LocationHelper$MyLocationListener;", "", "onLocationChanged", "", "location", "Landroid/location/Location;", "app_debug"})
    public static abstract interface MyLocationListener {
        
        public abstract void onLocationChanged(@org.jetbrains.annotations.NotNull()
        android.location.Location location);
    }
}