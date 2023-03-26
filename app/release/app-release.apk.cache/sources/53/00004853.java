package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import com.microsoft.appcenter.utils.PrefStorageConstants;

/* compiled from: PackageManagerHelper.java */
/* loaded from: classes.dex */
public class if0 {
    private static final String a = tb0.f("PackageManagerHelper");

    private if0() {
    }

    public static boolean a(Context context, Class<?> klazz) {
        return b(context, klazz.getName());
    }

    public static boolean b(Context context, String className) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, className)) == 1;
    }

    public static void c(@x1 Context context, @x1 Class<?> klazz, boolean enabled) {
        String str = PrefStorageConstants.KEY_ENABLED;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, klazz.getName()), enabled ? 1 : 2, 1);
            tb0 c = tb0.c();
            String str2 = a;
            Object[] objArr = new Object[2];
            objArr[0] = klazz.getName();
            objArr[1] = enabled ? PrefStorageConstants.KEY_ENABLED : "disabled";
            c.a(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e) {
            tb0 c2 = tb0.c();
            String str3 = a;
            Object[] objArr2 = new Object[2];
            objArr2[0] = klazz.getName();
            if (!enabled) {
                str = "disabled";
            }
            objArr2[1] = str;
            c2.a(str3, String.format("%s could not be %s", objArr2), e);
        }
    }
}