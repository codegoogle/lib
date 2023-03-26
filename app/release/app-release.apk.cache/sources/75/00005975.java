package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.p7700g.p99005.q71;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: NetworkStatusProvider.java */
/* loaded from: classes.dex */
public class r71 extends o71 {
    @r2
    public static final int d = 30;
    private static final int e = 5;
    @x1
    private final List<ScanResult> f;
    @x1
    private final h31 g;
    @x1
    private q71 h;
    @z1
    private ScheduledFuture i;
    @x1
    private final ScheduledExecutorService j;
    @x1
    @SuppressLint({"MissingPermission"})
    private final Runnable k;

    /* compiled from: NetworkStatusProvider.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WifiManager wifiManager = r71.this.b;
            if (wifiManager == null || !wifiManager.isWifiEnabled()) {
                return;
            }
            List<ScanResult> scanResults = r71.this.b.getScanResults();
            if (scanResults != null && scanResults.size() != 0) {
                o71.a.c("got %d scan results, cache", Integer.valueOf(scanResults.size()));
                boolean z = r71.this.f.size() != 0;
                for (ScanResult scanResult : scanResults) {
                    if (!r71.this.k(scanResult)) {
                        r71.this.f.add(scanResult);
                    }
                }
                q71 c = r71.this.c();
                if (r71.this.h.equals(c) && z) {
                    return;
                }
                o71.a.c("Notify on scan results available hasCache: %s last: %s current: %s", Boolean.valueOf(z), r71.this.h, c);
                r71.this.h = c;
                r71.this.g.e(new s71());
                return;
            }
            o71.a.c("got empty scan results, reschedule", new Object[0]);
            r71.this.n();
        }
    }

    /* compiled from: NetworkStatusProvider.java */
    /* loaded from: classes.dex */
    public class b extends BroadcastReceiver {
        private b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(@x1 Context context, @x1 Intent intent) {
            o71.a.c("Got system notification scan results available", new Object[0]);
            r71.this.n();
        }

        public /* synthetic */ b(r71 r71Var, a aVar) {
            this();
        }
    }

    public r71(@x1 Context context, @z1 WifiManager wifiManager, @z1 ConnectivityManager connectivityManager, @x1 h31 h31Var, @x1 me1 me1Var, @x1 ScheduledExecutorService scheduledExecutorService) {
        super(wifiManager, connectivityManager);
        this.f = new CopyOnWriteArrayList();
        this.k = new a();
        this.g = h31Var;
        this.j = scheduledExecutorService;
        this.h = c();
        me1Var.c("scan-cache", new nc1() { // from class: com.p7700g.p99005.n71
            @Override // com.p7700g.p99005.nc1
            public final void a(qc1 qc1Var) {
                r71.this.m(qc1Var);
            }
        });
        n();
        context.registerReceiver(new b(this, null), new IntentFilter("android.net.wifi.SCAN_RESULTS"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean k(@x1 ScanResult scanResult) {
        for (ScanResult scanResult2 : this.f) {
            if (scanResult2.SSID.equals(scanResult.SSID) && scanResult2.BSSID.equals(scanResult.BSSID)) {
                return true;
            }
        }
        return false;
    }

    private /* synthetic */ void l(qc1 qc1Var) {
        n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            o71.a.c("Already scheduled. Skip", new Object[0]);
            return;
        }
        o71.a.c("Scheduling scan results runnable", new Object[0]);
        if (this.f.size() == 0) {
            this.i = this.j.schedule(this.k, 5L, TimeUnit.SECONDS);
        } else {
            this.i = this.j.schedule(this.k, 30L, TimeUnit.SECONDS);
        }
    }

    @Override // com.p7700g.p99005.o71
    @x1
    public q71.a d(@x1 WifiInfo wifiInfo) {
        o71.a.c("Check network security on %d scan results", Integer.valueOf(this.f.size()));
        for (ScanResult scanResult : this.f) {
            String a2 = a(wifiInfo.getSSID());
            String a3 = a(wifiInfo.getBSSID());
            String a4 = a(scanResult.SSID);
            String a5 = a(scanResult.BSSID);
            if (a4.equals(a2) && a5.equals(a3)) {
                if (scanResult.capabilities.contains("WPA")) {
                    return q71.a.SECURE;
                }
                return q71.a.OPEN;
            }
        }
        return q71.a.UNKNOWN;
    }

    public /* synthetic */ void m(qc1 qc1Var) {
        n();
    }
}