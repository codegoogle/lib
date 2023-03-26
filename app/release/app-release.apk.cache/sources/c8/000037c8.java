package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.p7700g.p99005.nj3;
import com.p7700g.p99005.z1;

/* loaded from: classes3.dex */
public class NotificationOpenedActivityHMS extends Activity {
    private void a() {
        b(getIntent());
        finish();
    }

    private void b(@z1 Intent intent) {
        nj3.b(this, intent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a();
    }
}