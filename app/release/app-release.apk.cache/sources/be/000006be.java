package com.anythink.core.common.j;

/* loaded from: classes2.dex */
public final class o {
    public static String a(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        if (length == length2) {
            return str;
        }
        int abs = Math.abs(length2 - length);
        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < abs; i++) {
            sb.append(" ");
        }
        return sb.toString();
    }
}