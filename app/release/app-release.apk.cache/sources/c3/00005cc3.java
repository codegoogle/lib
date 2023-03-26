package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;
import org.xbill.DNS.WKSRecord;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public class su2 implements Runnable {
    private static final Object s = new Object();
    @k1("TOPIC_SYNC_TASK_LOCK")
    private static Boolean t;
    @k1("TOPIC_SYNC_TASK_LOCK")
    private static Boolean u;
    private final Context v;
    private final bu2 w;
    private final PowerManager.WakeLock x;
    private final ru2 y;
    private final long z;

    /* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
    @r2
    /* loaded from: classes3.dex */
    public class a extends BroadcastReceiver {
        @z1
        @k1("this")
        private su2 a;

        public a(su2 su2Var) {
            this.a = su2Var;
        }

        public void a() {
            su2.j();
            su2.this.v.registerReceiver(this, new IntentFilter(b91.a));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            su2 su2Var = this.a;
            if (su2Var == null) {
                return;
            }
            if (su2Var.i()) {
                su2.j();
                this.a.y.l(this.a, 0L);
                context.unregisterReceiver(this);
                this.a = null;
            }
        }
    }

    public su2(ru2 ru2Var, Context context, bu2 bu2Var, long j) {
        this.y = ru2Var;
        this.v = context;
        this.z = j;
        this.w = bu2Var;
        this.x = ((PowerManager) context.getSystemService("power")).newWakeLock(1, rs2.b);
    }

    private static String e(String str) {
        return wo1.D(new StringBuilder(str.length() + WKSRecord.Service.BL_IDM), "Missing Permission: ", str, ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (s) {
            Boolean bool = u;
            if (bool == null) {
                booleanValue = g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            u = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (z || !Log.isLoggable(rs2.a, 3)) {
            return z;
        }
        e(str);
        return false;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (s) {
            Boolean bool = t;
            if (bool == null) {
                booleanValue = g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            t = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        boolean z;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.v.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z = activeNetworkInfo.isConnected();
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean j() {
        return Log.isLoggable(rs2.a, 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable(rs2.a, 3));
    }

    @Override // java.lang.Runnable
    @SuppressLint({"Wakelock"})
    public void run() {
        if (h(this.v)) {
            this.x.acquire(rs2.c);
        }
        try {
            try {
                this.y.n(true);
                if (!this.w.g()) {
                    this.y.n(false);
                    if (h(this.v)) {
                        try {
                            this.x.release();
                        } catch (RuntimeException unused) {
                        }
                    }
                } else if (f(this.v) && !i()) {
                    new a(this).a();
                    if (h(this.v)) {
                        try {
                            this.x.release();
                        } catch (RuntimeException unused2) {
                        }
                    }
                } else {
                    if (this.y.r()) {
                        this.y.n(false);
                    } else {
                        this.y.s(this.z);
                    }
                    if (h(this.v)) {
                        try {
                            this.x.release();
                        } catch (RuntimeException unused3) {
                        }
                    }
                }
            } catch (IOException e) {
                String valueOf = String.valueOf(e.getMessage());
                if (valueOf.length() != 0) {
                    "Failed to sync topics. Won't retry sync. ".concat(valueOf);
                } else {
                    new String("Failed to sync topics. Won't retry sync. ");
                }
                this.y.n(false);
                if (h(this.v)) {
                    try {
                        this.x.release();
                    } catch (RuntimeException unused4) {
                    }
                }
            }
        } catch (Throwable th) {
            if (h(this.v)) {
                try {
                    this.x.release();
                } catch (RuntimeException unused5) {
                }
            }
            throw th;
        }
    }
}