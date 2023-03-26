package com.p7700g.p99005;

import android.os.Build;
import android.telephony.SubscriptionManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: SubscriptionManagerCompat.java */
@e2(22)
/* loaded from: classes.dex */
public class wn {
    private static Method a;

    /* compiled from: SubscriptionManagerCompat.java */
    @e2(29)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static int a(int i) {
            return SubscriptionManager.getSlotIndex(i);
        }
    }

    private wn() {
    }

    public static int a(int i) {
        if (i == -1) {
            return -1;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            return a.a(i);
        }
        try {
            if (a == null) {
                if (i2 >= 26) {
                    a = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
                } else {
                    a = SubscriptionManager.class.getDeclaredMethod("getSlotId", Integer.TYPE);
                }
                a.setAccessible(true);
            }
            Integer num = (Integer) a.invoke(null, Integer.valueOf(i));
            if (num != null) {
                return num.intValue();
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
        return -1;
    }
}