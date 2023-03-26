package com.p7700g.p99005;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;

/* compiled from: AppOpsManagerCompat.java */
/* loaded from: classes.dex */
public final class zf {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;

    /* compiled from: AppOpsManagerCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static int a(AppOpsManager appOpsManager, String str, int i, String str2) {
            return appOpsManager.noteOp(str, i, str2);
        }

        @e1
        public static int b(AppOpsManager appOpsManager, String str, int i, String str2) {
            return appOpsManager.noteOpNoThrow(str, i, str2);
        }
    }

    /* compiled from: AppOpsManagerCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static <T> T a(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        @e1
        public static int b(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOp(str, str2);
        }

        @e1
        public static int c(AppOpsManager appOpsManager, String str, String str2) {
            return appOpsManager.noteProxyOpNoThrow(str, str2);
        }

        @e1
        public static String d(String str) {
            return AppOpsManager.permissionToOp(str);
        }
    }

    /* compiled from: AppOpsManagerCompat.java */
    @e2(29)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static int a(@z1 AppOpsManager appOpsManager, @x1 String str, int i, @x1 String str2) {
            if (appOpsManager == null) {
                return 1;
            }
            return appOpsManager.checkOpNoThrow(str, i, str2);
        }

        @x1
        @e1
        public static String b(@x1 Context context) {
            return context.getOpPackageName();
        }

        @e1
        @z1
        public static AppOpsManager c(@x1 Context context) {
            return (AppOpsManager) context.getSystemService(AppOpsManager.class);
        }
    }

    private zf() {
    }

    public static int a(@x1 Context context, int i, @x1 String str, @x1 String str2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AppOpsManager c2 = c.c(context);
            int a2 = c.a(c2, str, Binder.getCallingUid(), str2);
            return a2 != 0 ? a2 : c.a(c2, str, i, c.b(context));
        }
        return e(context, str, str2);
    }

    public static int b(@x1 Context context, @x1 String str, int i, @x1 String str2) {
        return a.a((AppOpsManager) context.getSystemService("appops"), str, i, str2);
    }

    public static int c(@x1 Context context, @x1 String str, int i, @x1 String str2) {
        return a.b((AppOpsManager) context.getSystemService("appops"), str, i, str2);
    }

    public static int d(@x1 Context context, @x1 String str, @x1 String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.b((AppOpsManager) b.a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    public static int e(@x1 Context context, @x1 String str, @x1 String str2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.c((AppOpsManager) b.a(context, AppOpsManager.class), str, str2);
        }
        return 1;
    }

    @z1
    public static String f(@x1 String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return b.d(str);
        }
        return null;
    }
}