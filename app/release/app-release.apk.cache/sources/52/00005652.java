package com.p7700g.p99005;

import android.content.Context;
import android.os.Binder;
import android.os.Process;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PermissionChecker.java */
/* loaded from: classes.dex */
public final class ph {
    public static final int a = 0;
    public static final int b = -1;
    public static final int c = -2;

    /* compiled from: PermissionChecker.java */
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface a {
    }

    private ph() {
    }

    public static int a(@x1 Context context, @x1 String str) {
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int b(@x1 Context context, @x1 String str, @z1 String str2) {
        if (Binder.getCallingPid() == Process.myPid()) {
            return -1;
        }
        return c(context, str, Binder.getCallingPid(), Binder.getCallingUid(), str2);
    }

    public static int c(@x1 Context context, @x1 String str, int i, int i2, @z1 String str2) {
        int e;
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String f = zf.f(str);
        if (f == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (Process.myUid() == i2 && ep.a(context.getPackageName(), str2)) {
            e = zf.a(context, i2, f, str2);
        } else {
            e = zf.e(context, f, str2);
        }
        return e == 0 ? 0 : -2;
    }

    public static int d(@x1 Context context, @x1 String str) {
        return c(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}