package com.anythink.expressad.foundation.h;

import android.content.Context;

/* loaded from: classes2.dex */
public class c {
    private static void a() {
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            Class<?> cls = Class.forName("com.anythink.expressad.atsignalcommon.webEnvCheck.WebEnvCheckEntry");
            cls.getMethod("check", Context.class).invoke(cls.newInstance(), context);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}