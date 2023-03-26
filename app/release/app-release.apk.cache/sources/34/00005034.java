package com.p7700g.p99005;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;
import android.telephony.TelephonyManager;

/* compiled from: ManagerProvider.java */
/* loaded from: classes2.dex */
public class ma1 {
    @x1
    private final Context a;
    @z1
    private WifiManager b;
    @z1
    private TelephonyManager c;
    @z1
    private ConnectivityManager d;

    public ma1(@x1 Context context) {
        this.a = context;
    }

    @z1
    public synchronized ConnectivityManager a() {
        if (this.d == null) {
            this.d = (ConnectivityManager) this.a.getSystemService("connectivity");
        }
        return this.d;
    }

    @z1
    public synchronized TelephonyManager b() {
        if (this.c == null) {
            this.c = (TelephonyManager) this.a.getApplicationContext().getSystemService("phone");
        }
        return this.c;
    }

    @z1
    public synchronized WifiManager c() {
        if (this.b == null) {
            this.b = (WifiManager) this.a.getApplicationContext().getSystemService(k21.b);
        }
        return this.b;
    }
}