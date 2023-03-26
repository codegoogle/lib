package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes2.dex */
public final class h {
    public static final String a = "layout";
    public static final String b = "id";
    public static final String c = "drawable";
    public static final String d = "color";
    public static final String e = "style";
    public static final String f = "anim";
    public static final String g = "string";
    public static final int h = -1;
    private static final String i = "ResourceUtil";

    public static Resources a(Context context) {
        if (context != null) {
            try {
                return context.getResources();
            } catch (Exception e2) {
                n.d(i, "Resource error:" + e2.getMessage());
            }
        }
        return null;
    }

    public static int a(Context context, String str, String str2) {
        String str3;
        try {
            try {
                str3 = com.anythink.expressad.foundation.b.a.b().a();
            } catch (Exception unused) {
                n.d(i, "ATSDKContext.getInstance() is null resName:".concat(String.valueOf(str)));
            }
            if (v.a(str3) && context != null) {
                str3 = context.getPackageName();
            }
            if (v.a(str3) || context == null) {
                return -1;
            }
            return context.getResources().getIdentifier(str, str2, str3);
        } catch (Exception unused2) {
            n.d(i, "Resource not found resName:".concat(String.valueOf(str)));
            return -1;
        }
    }
}