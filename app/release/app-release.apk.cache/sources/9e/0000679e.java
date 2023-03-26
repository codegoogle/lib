package com.p7700g.p99005;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import java.util.List;

/* compiled from: LocationListenerCompat.java */
/* loaded from: classes.dex */
public interface yl extends LocationListener {
    @Override // android.location.LocationListener
    void onFlushComplete(int i);

    @Override // android.location.LocationListener
    void onLocationChanged(@x1 List<Location> list);

    @Override // android.location.LocationListener
    void onProviderDisabled(@x1 String str);

    @Override // android.location.LocationListener
    void onProviderEnabled(@x1 String str);

    @Override // android.location.LocationListener
    void onStatusChanged(@x1 String str, int i, @z1 Bundle bundle);
}