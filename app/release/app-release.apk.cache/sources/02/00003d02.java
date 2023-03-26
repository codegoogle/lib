package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: ConnectivityManagerCompat.java */
/* loaded from: classes.dex */
public final class cm {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;

    /* compiled from: ConnectivityManagerCompat.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        @h2("android.permission.ACCESS_NETWORK_STATE")
        public static boolean a(ConnectivityManager connectivityManager) {
            return connectivityManager.isActiveNetworkMetered();
        }
    }

    /* compiled from: ConnectivityManagerCompat.java */
    @e2(24)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static int a(ConnectivityManager connectivityManager) {
            return connectivityManager.getRestrictBackgroundStatus();
        }
    }

    /* compiled from: ConnectivityManagerCompat.java */
    @i2({i2.a.u})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    private cm() {
    }

    @z1
    @SuppressLint({"ReferencesDeprecated"})
    @h2("android.permission.ACCESS_NETWORK_STATE")
    public static NetworkInfo a(@x1 ConnectivityManager connectivityManager, @x1 Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo != null) {
            return connectivityManager.getNetworkInfo(networkInfo.getType());
        }
        return null;
    }

    public static int b(@x1 ConnectivityManager connectivityManager) {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.a(connectivityManager);
        }
        return 3;
    }

    @h2("android.permission.ACCESS_NETWORK_STATE")
    public static boolean c(@x1 ConnectivityManager connectivityManager) {
        return a.a(connectivityManager);
    }
}