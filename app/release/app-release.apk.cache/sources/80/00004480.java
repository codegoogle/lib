package com.p7700g.p99005;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;

/* compiled from: NavUtils.java */
/* loaded from: classes.dex */
public final class gg {
    private static final String a = "NavUtils";
    public static final String b = "android.support.PARENT_ACTIVITY";

    /* compiled from: NavUtils.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static Intent a(Activity activity) {
            return activity.getParentActivityIntent();
        }

        @e1
        public static boolean b(Activity activity, Intent intent) {
            return activity.navigateUpTo(intent);
        }

        @e1
        public static boolean c(Activity activity, Intent intent) {
            return activity.shouldUpRecreateTask(intent);
        }
    }

    private gg() {
    }

    @z1
    public static Intent a(@x1 Activity activity) {
        Intent a2 = a.a(activity);
        if (a2 != null) {
            return a2;
        }
        String d = d(activity);
        if (d == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, d);
        try {
            if (e(activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @z1
    public static Intent b(@x1 Context context, @x1 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String e = e(context, componentName);
        if (e == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), e);
        if (e(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    @z1
    public static Intent c(@x1 Context context, @x1 Class<?> cls) throws PackageManager.NameNotFoundException {
        String e = e(context, new ComponentName(context, cls));
        if (e == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(context, e);
        if (e(context, componentName) == null) {
            return Intent.makeMainActivity(componentName);
        }
        return new Intent().setComponent(componentName);
    }

    @z1
    public static String d(@x1 Activity activity) {
        try {
            return e(activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @z1
    public static String e(@x1 Context context, @x1 ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        PackageManager packageManager = context.getPackageManager();
        int i = Build.VERSION.SDK_INT;
        int i2 = 640;
        if (i >= 29) {
            i2 = 269222528;
        } else if (i >= 24) {
            i2 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i2);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString(b)) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    public static void f(@x1 Activity activity) {
        Intent a2 = a(activity);
        if (a2 != null) {
            g(activity, a2);
            return;
        }
        StringBuilder G = wo1.G("Activity ");
        G.append(activity.getClass().getSimpleName());
        G.append(" does not have a parent activity name specified. (Did you forget to add the android.support.PARENT_ACTIVITY <meta-data>  element in your manifest?)");
        throw new IllegalArgumentException(G.toString());
    }

    public static void g(@x1 Activity activity, @x1 Intent intent) {
        a.b(activity, intent);
    }

    public static boolean h(@x1 Activity activity, @x1 Intent intent) {
        return a.c(activity, intent);
    }
}