package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.ij3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

@e2(api = 21)
/* loaded from: classes3.dex */
public class FCMIntentJobService extends JobIntentService {
    public static final String D = "Bundle:Parcelable:Extras";
    private static final int E = 123890;

    /* loaded from: classes3.dex */
    public class a implements ij3.e {
        public a() {
        }

        @Override // com.p7700g.p99005.ij3.e
        public void a(@z1 ij3.f fVar) {
        }
    }

    public static void l(Context context, Intent intent) {
        JobIntentService.d(context, FCMIntentJobService.class, E, intent, false);
    }

    @Override // com.onesignal.JobIntentService
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // com.onesignal.JobIntentService
    public void h(@x1 Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        jm3.q1(this);
        ij3.h(this, extras, new a());
    }

    @Override // com.onesignal.JobIntentService
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // com.onesignal.JobIntentService
    public /* bridge */ /* synthetic */ void k(boolean z) {
        super.k(z);
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(@x1 Intent intent) {
        return super.onBind(intent);
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(@z1 Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}