package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.onesignal.OSUtils;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.qm3;

/* compiled from: BadgeCountUpdater.java */
/* loaded from: classes3.dex */
public class ki3 {
    private static int a = -1;

    private static boolean a(Context context) {
        int i = a;
        if (i != -1) {
            return i == 1;
        }
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle != null) {
                a = "DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 0 : 1;
            } else {
                a = 1;
            }
        } catch (PackageManager.NameNotFoundException e) {
            a = 0;
            jm3.b(jm3.u0.ERROR, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e);
        }
        return a == 1;
    }

    private static boolean b(Context context) {
        return a(context) && OSUtils.a(context);
    }

    public static void c(pm3 pm3Var, Context context) {
        if (b(context)) {
            if (Build.VERSION.SDK_INT >= 23) {
                f(context);
            } else {
                e(pm3Var, context);
            }
        }
    }

    public static void d(int i, Context context) {
        if (a(context)) {
            try {
                hp3.b(context, i);
            } catch (gp3 unused) {
            }
        }
    }

    private static void e(pm3 pm3Var, Context context) {
        Cursor b = pm3Var.b(qm3.b.a, null, rm3.r().toString(), null, null, null, null, kj3.b);
        int count = b.getCount();
        b.close();
        d(count, context);
    }

    @e2(api = 23)
    private static void f(Context context) {
        int i = 0;
        for (StatusBarNotification statusBarNotification : um3.d(context)) {
            if (!kj3.f(statusBarNotification)) {
                i++;
            }
        }
        d(i, context);
    }
}