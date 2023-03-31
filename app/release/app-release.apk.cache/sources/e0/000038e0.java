package com.p7700g.p99005;

import android.app.Activity;
import android.content.Intent;
import com.google.ads.Activity.QurekaActivity;

/* compiled from: Qureka_AppOpen.java */
/* loaded from: classes3.dex */
public class ag3 {
    private static final String a = "AppOpenManager";
    public static wg3 b;

    public static void a(wg3 monAdsClickListner) {
        b = monAdsClickListner;
    }

    public static void b(Activity activity) {
        Intent intent = new Intent(activity, QurekaActivity.class);
        intent.putExtra(QurekaActivity.W, QurekaActivity.U);
        activity.startActivity(intent);
        QurekaActivity.v0(b);
    }
}