package com.p7700g.p99005;

import android.text.TextUtils;

/* compiled from: DatabaseUtilsCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class vi {
    private vi() {
    }

    @Deprecated
    public static String[] a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        String[] strArr3 = new String[strArr.length + strArr2.length];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }

    @Deprecated
    public static String b(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : TextUtils.isEmpty(str2) ? str : wo1.w("(", str, ") AND (", str2, ")");
    }
}