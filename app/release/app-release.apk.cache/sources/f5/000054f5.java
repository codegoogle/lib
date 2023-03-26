package com.p7700g.p99005;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* compiled from: DataCollectionConfigStorage.java */
/* loaded from: classes3.dex */
public class os2 {
    private static final String a = "com.google.firebase.common.prefs:";
    @r2
    public static final String b = "firebase_data_collection_default_enabled";
    private final Context c;
    private final SharedPreferences d;
    private final lq2 e;
    private boolean f;

    public os2(Context context, String str, lq2 lq2Var) {
        Context a2 = a(context);
        this.c = a2;
        this.d = a2.getSharedPreferences(a + str, 0);
        this.e = lq2Var;
        this.f = c();
    }

    private static Context a(Context context) {
        return Build.VERSION.SDK_INT < 24 ? context : gh.b(context);
    }

    private boolean c() {
        if (this.d.contains(b)) {
            return this.d.getBoolean(b, true);
        }
        return d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.c.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.c.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(b)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(b);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z) {
        if (this.f != z) {
            this.f = z;
            this.e.c(new jq2<>(nn2.class, new nn2(z)));
        }
    }

    public synchronized boolean b() {
        return this.f;
    }

    public synchronized void e(Boolean bool) {
        if (bool == null) {
            this.d.edit().remove(b).apply();
            f(d());
        } else {
            boolean equals = Boolean.TRUE.equals(bool);
            this.d.edit().putBoolean(b, equals).apply();
            f(equals);
        }
    }
}