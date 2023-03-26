package com.anythink.expressad.foundation.h;

import android.text.TextUtils;
import com.p7700g.p99005.pg1;

/* loaded from: classes2.dex */
public final class v {
    private static final String a = "StringUtils";

    public static boolean a(String str) {
        return str == null || TextUtils.isEmpty(str.trim()) || pg1.d.equals(str);
    }

    public static boolean b(String str) {
        return (str == null || TextUtils.isEmpty(str.trim()) || pg1.d.equals(str)) ? false : true;
    }
}