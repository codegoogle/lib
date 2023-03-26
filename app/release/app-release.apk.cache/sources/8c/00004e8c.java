package com.p7700g.p99005;

import java.util.ArrayList;

/* compiled from: MimeTypeFilter.java */
/* loaded from: classes.dex */
public final class lh {
    private lh() {
    }

    @z1
    public static String a(@z1 String str, @x1 String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (e(split, str2.split("/"))) {
                return str2;
            }
        }
        return null;
    }

    @z1
    public static String b(@z1 String[] strArr, @x1 String str) {
        if (strArr == null) {
            return null;
        }
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (e(str2.split("/"), split)) {
                return str2;
            }
        }
        return null;
    }

    public static boolean c(@z1 String str, @x1 String str2) {
        if (str == null) {
            return false;
        }
        return e(str.split("/"), str2.split("/"));
    }

    @x1
    public static String[] d(@z1 String[] strArr, @x1 String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (e(str2.split("/"), split)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static boolean e(@x1 String[] strArr, @x1 String[] strArr2) {
        if (strArr2.length == 2) {
            if (!strArr2[0].isEmpty() && !strArr2[1].isEmpty()) {
                if (strArr.length != 2) {
                    return false;
                }
                if (tm4.g.equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
                    return tm4.g.equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
                }
                return false;
            }
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
        throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
    }
}