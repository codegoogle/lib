package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.p7700g.p99005.q71;
import java.util.concurrent.Executors;

/* compiled from: BaseNetworkStatusProvider.java */
/* loaded from: classes.dex */
public abstract class o71 {
    @x1
    public static final kj1 a = kj1.b("NetworkStatusProvider");
    @z1
    public final WifiManager b;
    @z1
    private final ConnectivityManager c;

    public o71(@z1 WifiManager wifiManager, @z1 ConnectivityManager connectivityManager) {
        this.b = wifiManager;
        this.c = connectivityManager;
    }

    @x1
    @SuppressLint({"WifiManagerPotentialLeak"})
    public static o71 b(@x1 Context context, @x1 h31 h31Var, @x1 me1 me1Var) {
        WifiManager wifiManager = (WifiManager) context.getSystemService(k21.b);
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 29) {
            return new r71(context, wifiManager, connectivityManager, h31Var, me1Var, Executors.newSingleThreadScheduledExecutor());
        }
        return new p71(wifiManager, connectivityManager);
    }

    @x1
    public String a(@z1 String str) {
        return str != null ? str.replace("\"", "") : "";
    }

    @x1
    @SuppressLint({"MissingPermission"})
    public synchronized q71 c() {
        q71.b bVar;
        String str;
        String str2;
        q71.a aVar;
        NetworkInfo activeNetworkInfo;
        WifiInfo connectionInfo;
        NetworkInfo.DetailedState detailedStateOf;
        bVar = q71.b.NONE;
        str = "";
        str2 = "";
        aVar = q71.a.UNKNOWN;
        WifiManager wifiManager = this.b;
        if (wifiManager != null && (connectionInfo = wifiManager.getConnectionInfo()) != null && ((detailedStateOf = WifiInfo.getDetailedStateOf(connectionInfo.getSupplicantState())) == NetworkInfo.DetailedState.CONNECTED || detailedStateOf == NetworkInfo.DetailedState.OBTAINING_IPADDR)) {
            str = a(connectionInfo.getSSID());
            str2 = a(connectionInfo.getBSSID());
            aVar = d(connectionInfo);
        }
        ConnectivityManager connectivityManager = this.c;
        if (connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnectedOrConnecting()) {
            int type = activeNetworkInfo.getType();
            if (type == 0) {
                bVar = q71.b.MOBILE;
            } else if (type == 1) {
                bVar = q71.b.WIFI;
            } else if (type == 9) {
                bVar = q71.b.LAN;
            }
        }
        return new q71(bVar, str, str2, aVar);
    }

    @x1
    @SuppressLint({"MissingPermission"})
    public abstract q71.a d(@x1 WifiInfo wifiInfo);
}