package com.p7700g.p99005;

import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.p7700g.p99005.jm3;

/* compiled from: GMSLocationController.java */
/* loaded from: classes3.dex */
public class ti3 extends ej3 {
    public static final int n = 30000;
    private static xi3 o;
    public static d p;

    /* compiled from: GMSLocationController.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        @Override // java.lang.Runnable
        public void run() {
            try {
                Thread.sleep(ti3.s());
                jm3.a(jm3.u0.WARN, "Location permission exists but GoogleApiClient timed out. Maybe related to mismatch google-play aar versions.");
                ej3.e();
                ej3.m(ej3.k);
            } catch (InterruptedException unused) {
            }
        }
    }

    /* compiled from: GMSLocationController.java */
    /* loaded from: classes3.dex */
    public static class b {
        public static Location a(GoogleApiClient googleApiClient) {
            synchronized (ej3.h) {
                if (googleApiClient.isConnected()) {
                    return LocationServices.FusedLocationApi.getLastLocation(googleApiClient);
                }
                return null;
            }
        }

        public static void b(GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
            try {
                synchronized (ej3.h) {
                    if (Looper.myLooper() == null) {
                        Looper.prepare();
                    }
                    if (googleApiClient.isConnected()) {
                        LocationServices.FusedLocationApi.requestLocationUpdates(googleApiClient, locationRequest, locationListener);
                    }
                }
            } catch (Throwable th) {
                jm3.b(jm3.u0.WARN, "FusedLocationApi.requestLocationUpdates failed!", th);
            }
        }
    }

    /* compiled from: GMSLocationController.java */
    /* loaded from: classes3.dex */
    public static class c implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener {
        private c() {
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnected(Bundle bundle) {
            synchronized (ej3.h) {
                if (ti3.o != null && ti3.o.c() != null) {
                    jm3.u0 u0Var = jm3.u0.DEBUG;
                    jm3.a(u0Var, "GMSLocationController GoogleApiClientListener onConnected lastLocation: " + ej3.l);
                    if (ej3.l == null) {
                        ej3.l = b.a(ti3.o.c());
                        jm3.a(u0Var, "GMSLocationController GoogleApiClientListener lastLocation: " + ej3.l);
                        Location location = ej3.l;
                        if (location != null) {
                            ej3.d(location);
                        }
                    }
                    ti3.p = new d(ti3.o.c());
                    return;
                }
                jm3.a(jm3.u0.DEBUG, "GMSLocationController GoogleApiClientListener onConnected googleApiClient not available, returning");
            }
        }

        @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
        public void onConnectionFailed(@x1 ConnectionResult connectionResult) {
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.a(u0Var, "GMSLocationController GoogleApiClientListener onConnectionSuspended connectionResult: " + connectionResult);
            ti3.e();
        }

        @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
        public void onConnectionSuspended(int i) {
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.a(u0Var, "GMSLocationController GoogleApiClientListener onConnectionSuspended i: " + i);
            ti3.e();
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* compiled from: GMSLocationController.java */
    /* loaded from: classes3.dex */
    public static class d implements LocationListener {
        private GoogleApiClient a;

        public d(GoogleApiClient googleApiClient) {
            this.a = googleApiClient;
            a();
        }

        private void a() {
            long j = jm3.u1() ? ej3.c : ej3.d;
            if (this.a != null) {
                LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
                jm3.a(jm3.u0.DEBUG, "GMSLocationController GoogleApiClient requestLocationUpdates!");
                b.b(this.a, priority, this);
            }
        }

        public void b(Location location) {
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.a(u0Var, "GMSLocationController onLocationChanged: " + location);
            ej3.l = location;
        }
    }

    public static void e() {
        synchronized (ej3.h) {
            xi3 xi3Var = o;
            if (xi3Var != null) {
                xi3Var.b();
            }
            o = null;
        }
    }

    public static void l() {
        synchronized (ej3.h) {
            jm3.a(jm3.u0.DEBUG, "GMSLocationController onFocusChange!");
            xi3 xi3Var = o;
            if (xi3Var != null && xi3Var.c().isConnected()) {
                xi3 xi3Var2 = o;
                if (xi3Var2 != null) {
                    GoogleApiClient c2 = xi3Var2.c();
                    if (p != null) {
                        LocationServices.FusedLocationApi.removeLocationUpdates(c2, p);
                    }
                    p = new d(c2);
                }
            }
        }
    }

    public static void p() {
        t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int s() {
        return 30000;
    }

    private static void t() {
        Location location;
        if (ej3.j != null) {
            return;
        }
        synchronized (ej3.h) {
            u();
            if (o != null && (location = ej3.l) != null) {
                ej3.d(location);
            }
            c cVar = new c(null);
            xi3 xi3Var = new xi3(new GoogleApiClient.Builder(ej3.k).addApi(LocationServices.API).addConnectionCallbacks(cVar).addOnConnectionFailedListener(cVar).setHandler(ej3.h().s).build());
            o = xi3Var;
            xi3Var.a();
        }
    }

    private static void u() {
        Thread thread = new Thread(new a(), "OS_GMS_LOCATION_FALLBACK");
        ej3.j = thread;
        thread.start();
    }
}