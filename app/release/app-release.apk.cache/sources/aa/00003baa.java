package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-messaging@@22.0.0 */
/* loaded from: classes3.dex */
public class bu2 {
    private final Context a;
    @GuardedBy("this")
    private String b;
    @GuardedBy("this")
    private String c;
    @GuardedBy("this")
    private int d;
    @GuardedBy("this")
    private int e = 0;

    public bu2(Context context) {
        this.a = context;
    }

    public static String c(pn2 pn2Var) {
        String m = pn2Var.q().m();
        if (m != null) {
            return m;
        }
        String j = pn2Var.q().j();
        if (j.startsWith("1:")) {
            String[] split = j.split(":");
            if (split.length < 2) {
                return null;
            }
            String str = split[1];
            if (str.isEmpty()) {
                return null;
            }
            return str;
        }
        return j;
    }

    private PackageInfo f(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            String.valueOf(e).length();
            return null;
        }
    }

    private synchronized void h() {
        PackageInfo f = f(this.a.getPackageName());
        if (f != null) {
            this.b = Integer.toString(f.versionCode);
            this.c = f.versionName;
        }
    }

    public synchronized String a() {
        if (this.b == null) {
            h();
        }
        return this.b;
    }

    public synchronized String b() {
        if (this.c == null) {
            h();
        }
        return this.c;
    }

    public synchronized int d() {
        PackageInfo f;
        if (this.d == 0 && (f = f("com.google.android.gms")) != null) {
            this.d = f.versionCode;
        }
        return this.d;
    }

    public synchronized int e() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            return 0;
        }
        int i2 = 1;
        if (!PlatformVersion.isAtLeastO()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.e = 2;
            return 2;
        }
        if (PlatformVersion.isAtLeastO()) {
            this.e = 2;
            i2 = 2;
        } else {
            this.e = 1;
        }
        return i2;
    }

    public boolean g() {
        return e() != 0;
    }
}