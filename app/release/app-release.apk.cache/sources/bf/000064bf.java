package com.p7700g.p99005;

/* compiled from: NetworkMismatchException.java */
/* loaded from: classes3.dex */
public class x14 extends RuntimeException {
    private static final long s = 1;
    private static String t = a("ipaddress.address.error");

    public x14(l24 l24Var) {
        super(l24Var + ", " + t + " " + a("ipaddress.error.mixedNetworks"));
    }

    public static String a(String str) {
        return d14.a(str);
    }

    public x14(l24 l24Var, l24 l24Var2) {
        super(l24Var + ", " + l24Var2 + ", " + t + " " + a("ipaddress.error.mixedNetworks"));
    }
}