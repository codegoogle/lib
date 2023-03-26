package com.p7700g.p99005;

/* compiled from: SizeMismatchException.java */
/* loaded from: classes3.dex */
public class z14 extends RuntimeException {
    private static final long s = 1;
    private static String t = a("ipaddress.address.error");

    public z14(l24 l24Var, l24 l24Var2) {
        super(l24Var + ", " + l24Var2 + ", " + t + " " + a("ipaddress.error.sizeMismatch"));
    }

    public static String a(String str) {
        return d14.a(str);
    }
}