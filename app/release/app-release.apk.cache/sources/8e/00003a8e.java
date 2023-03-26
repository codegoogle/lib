package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* compiled from: NetworkAlarmStateListener.java */
/* loaded from: classes2.dex */
public class b91 extends BroadcastReceiver {
    public static final String a = "android.net.conn.CONNECTIVITY_CHANGE";
    public final String b;
    private boolean c;
    public a d;

    /* compiled from: NetworkAlarmStateListener.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a();
    }

    public b91(@x1 Context context, @x1 a aVar) {
        this.b = context.getPackageName();
        this.d = aVar;
    }

    @SuppressLint({"MissingPermission"})
    private boolean a(@x1 Context context) {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public void b(@x1 Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(a);
        context.registerReceiver(this, intentFilter);
        this.c = true;
    }

    public void c(@x1 Context context) {
        if (this.c) {
            context.unregisterReceiver(this);
            this.c = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@x1 Context context, @x1 Intent intent) {
        if (a(context)) {
            this.d.a();
        }
    }
}