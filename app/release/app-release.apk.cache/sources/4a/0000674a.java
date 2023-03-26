package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.pm.PermissionInfo;
import android.os.Build;
import com.p7700g.p99005.i2;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: PermissionInfoCompat.java */
/* loaded from: classes.dex */
public final class yh {

    /* compiled from: PermissionInfoCompat.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static int a(PermissionInfo permissionInfo) {
            return permissionInfo.getProtection();
        }

        @e1
        public static int b(PermissionInfo permissionInfo) {
            return permissionInfo.getProtectionFlags();
        }
    }

    /* compiled from: PermissionInfoCompat.java */
    @i2({i2.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface b {
    }

    /* compiled from: PermissionInfoCompat.java */
    @SuppressLint({"UniqueConstants"})
    @i2({i2.a.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface c {
    }

    private yh() {
    }

    @SuppressLint({"WrongConstant"})
    public static int a(@x1 PermissionInfo permissionInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.a(permissionInfo);
        }
        return permissionInfo.protectionLevel & 15;
    }

    @SuppressLint({"WrongConstant"})
    public static int b(@x1 PermissionInfo permissionInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(permissionInfo);
        }
        return permissionInfo.protectionLevel & (-16);
    }
}