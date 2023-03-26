package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.p7700g.p99005.ij3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.uy;
import com.p7700g.p99005.z1;

/* loaded from: classes3.dex */
public class FCMIntentService extends IntentService {

    /* loaded from: classes3.dex */
    public class a implements ij3.e {
        public final /* synthetic */ Intent a;

        public a(Intent intent) {
            this.a = intent;
        }

        @Override // com.p7700g.p99005.ij3.e
        public void a(@z1 ij3.f fVar) {
            uy.completeWakefulIntent(this.a);
        }
    }

    public FCMIntentService() {
        super("FCMIntentService");
        setIntentRedelivery(true);
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        jm3.q1(this);
        ij3.h(this, extras, new a(intent));
    }
}