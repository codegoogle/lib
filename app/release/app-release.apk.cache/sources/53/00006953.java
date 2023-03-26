package com.p7700g.p99005;

import android.location.Location;
import com.huawei.hmf.tasks.OnFailureListener;
import com.huawei.hmf.tasks.OnSuccessListener;
import com.huawei.hms.location.FusedLocationProviderClient;
import com.huawei.hms.location.LocationCallback;
import com.huawei.hms.location.LocationRequest;
import com.huawei.hms.location.LocationResult;
import com.huawei.hms.location.LocationServices;
import com.p7700g.p99005.jm3;

/* compiled from: HMSLocationController.java */
/* loaded from: classes3.dex */
public class zi3 extends ej3 {
    private static FusedLocationProviderClient n;
    public static c o;

    /* compiled from: HMSLocationController.java */
    /* loaded from: classes3.dex */
    public class a implements OnFailureListener {
        public void a(Exception exc) {
            jm3.b(jm3.u0.ERROR, "Huawei LocationServices getLastLocation failed!", exc);
            zi3.e();
        }
    }

    /* compiled from: HMSLocationController.java */
    /* loaded from: classes3.dex */
    public class b implements OnSuccessListener<Location> {
        /* renamed from: a */
        public void b(Location location) {
            jm3.u0 u0Var = jm3.u0.WARN;
            jm3.a(u0Var, "Huawei LocationServices getLastLocation returned location: " + location);
            if (location == null) {
                zi3.e();
                return;
            }
            ej3.l = location;
            ej3.d(location);
            zi3.o = new c(zi3.n);
        }
    }

    /* compiled from: HMSLocationController.java */
    /* loaded from: classes3.dex */
    public static class c extends LocationCallback {
        private FusedLocationProviderClient a;

        public c(FusedLocationProviderClient fusedLocationProviderClient) {
            this.a = fusedLocationProviderClient;
            a();
        }

        private void a() {
            long j = jm3.u1() ? ej3.c : ej3.d;
            LocationRequest priority = LocationRequest.create().setFastestInterval(j).setInterval(j).setMaxWaitTime((long) (j * 1.5d)).setPriority(102);
            jm3.a(jm3.u0.DEBUG, "HMSLocationController Huawei LocationServices requestLocationUpdates!");
            this.a.requestLocationUpdates(priority, this, ej3.h().getLooper());
        }

        public void b(LocationResult locationResult) {
            jm3.u0 u0Var = jm3.u0.DEBUG;
            jm3.a(u0Var, "HMSLocationController onLocationResult: " + locationResult);
            if (locationResult != null) {
                ej3.l = locationResult.getLastLocation();
            }
        }
    }

    public static void e() {
        synchronized (ej3.h) {
            n = null;
        }
    }

    public static void l() {
        synchronized (ej3.h) {
            jm3.a(jm3.u0.DEBUG, "HMSLocationController onFocusChange!");
            if (ej3.k() && n == null) {
                return;
            }
            FusedLocationProviderClient fusedLocationProviderClient = n;
            if (fusedLocationProviderClient != null) {
                c cVar = o;
                if (cVar != null) {
                    fusedLocationProviderClient.removeLocationUpdates(cVar);
                }
                o = new c(n);
            }
        }
    }

    public static void p() {
        r();
    }

    private static void r() {
        synchronized (ej3.h) {
            if (n == null) {
                try {
                    n = LocationServices.getFusedLocationProviderClient(ej3.k);
                } catch (Exception e) {
                    jm3.u0 u0Var = jm3.u0.ERROR;
                    jm3.a(u0Var, "Huawei LocationServices getFusedLocationProviderClient failed! " + e);
                    e();
                    return;
                }
            }
            Location location = ej3.l;
            if (location != null) {
                ej3.d(location);
            } else {
                n.getLastLocation().addOnSuccessListener(new b()).addOnFailureListener(new a());
            }
        }
    }
}