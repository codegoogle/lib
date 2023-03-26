package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executors;

/* compiled from: PackageManagerCompat.java */
/* loaded from: classes.dex */
public final class oh {
    @i2({i2.a.LIBRARY})
    public static final String a = "PackageManagerCompat";
    @SuppressLint({"ActionValue"})
    public static final String b = "android.intent.action.AUTO_REVOKE_PERMISSIONS";

    /* compiled from: PackageManagerCompat.java */
    @e2(30)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        public static boolean a(@x1 Context context) {
            return !context.getPackageManager().isAutoRevokeWhitelisted();
        }
    }

    /* compiled from: PackageManagerCompat.java */
    @i2({i2.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    private oh() {
    }

    @i2({i2.a.LIBRARY})
    public static boolean a(@x1 PackageManager packageManager) {
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 30;
        boolean z2 = i >= 23 && i < 30;
        boolean z3 = b(packageManager) != null;
        if (z) {
            return true;
        }
        return z2 && z3;
    }

    @i2({i2.a.LIBRARY})
    @z1
    public static String b(@x1 PackageManager packageManager) {
        String str = null;
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent(b).setData(Uri.fromParts("package", "com.example", null)), 0)) {
            String str2 = resolveInfo.activityInfo.packageName;
            if (packageManager.checkPermission("android.permission.PACKAGE_VERIFICATION_AGENT", str2) == 0) {
                if (str != null) {
                    return str;
                }
                str = str2;
            }
        }
        return str;
    }

    @x1
    public static gn2<Integer> c(@x1 Context context) {
        d8<Integer> v = d8.v();
        if (!ln.a(context)) {
            v.q(0);
            return v;
        } else if (!a(context.getPackageManager())) {
            v.q(1);
            return v;
        } else {
            int i = context.getApplicationInfo().targetSdkVersion;
            if (i < 30) {
                v.q(0);
                return v;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                if (a.a(context)) {
                    v.q(Integer.valueOf(i >= 31 ? 5 : 4));
                } else {
                    v.q(2);
                }
                return v;
            } else if (i2 == 30) {
                v.q(Integer.valueOf(a.a(context) ? 4 : 2));
                return v;
            } else {
                final uh uhVar = new uh(context);
                v.a(new Runnable() { // from class: com.p7700g.p99005.ch
                    @Override // java.lang.Runnable
                    public final void run() {
                        uh.this.b();
                    }
                }, Executors.newSingleThreadExecutor());
                uhVar.a(v);
                return v;
            }
        }
    }
}