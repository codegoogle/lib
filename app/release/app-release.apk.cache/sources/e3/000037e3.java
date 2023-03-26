package com.onesignal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.p7700g.p99005.wl3;
import com.p7700g.p99005.z1;

/* loaded from: classes3.dex */
public class SyncService extends Service {
    @Override // android.app.Service
    @z1
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        wl3.r().b(this, new wl3.a(this));
        return 1;
    }
}