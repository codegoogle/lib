package com.p7700g.p99005;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: LifecycleService.java */
/* loaded from: classes.dex */
public class uz extends Service implements qz {
    private final i00 s = new i00(this);

    @Override // com.p7700g.p99005.qz
    @x1
    public mz getLifecycle() {
        return this.s.a();
    }

    @Override // android.app.Service
    @t0
    @z1
    public IBinder onBind(@x1 Intent intent) {
        this.s.b();
        return null;
    }

    @Override // android.app.Service
    @t0
    public void onCreate() {
        this.s.c();
        super.onCreate();
    }

    @Override // android.app.Service
    @t0
    public void onDestroy() {
        this.s.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    @t0
    public void onStart(@x1 Intent intent, int i) {
        this.s.e();
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    @t0
    public int onStartCommand(@x1 Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}