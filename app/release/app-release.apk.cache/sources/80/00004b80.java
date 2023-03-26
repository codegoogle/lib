package com.p7700g.p99005;

import java.util.Collections;
import java.util.Map;

/* compiled from: ResponseBuilderHeaders.java */
/* loaded from: classes3.dex */
public final class jw3 {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    private static final Map<String, Integer> h = b();
    private static final String[] i = a();

    private static String[] a() {
        Map<String, Integer> b2 = b();
        String[] strArr = new String[b2.size()];
        for (Map.Entry<String, Integer> entry : b2.entrySet()) {
            strArr[entry.getValue().intValue()] = entry.getKey();
        }
        return strArr;
    }

    private static Map<String, Integer> b() {
        cx3 cx3Var = new cx3(kx3.s);
        cx3Var.put(sm4.f, 0);
        cx3Var.put(sm4.h, 1);
        cx3Var.put(sm4.j, 2);
        cx3Var.put("Content-Type", 3);
        cx3Var.put(sm4.m, 4);
        cx3Var.put(sm4.t, 5);
        cx3Var.put("Location", 6);
        return Collections.unmodifiableMap(cx3Var);
    }

    public static Integer c(String str) {
        return h.get(str);
    }

    public static String d(int i2) {
        return i[i2];
    }

    public static int e() {
        return h.size();
    }
}