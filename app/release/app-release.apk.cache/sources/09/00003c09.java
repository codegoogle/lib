package com.p7700g.p99005;

import java.math.BigInteger;

/* compiled from: AddressValueException.java */
/* loaded from: classes3.dex */
public class c14 extends RuntimeException {
    private static final long s = 1;
    public static String t = a("ipaddress.address.error");

    public c14(long j) {
        super(j + ", " + t + " " + a("ipaddress.error.exceeds.size"));
    }

    public static String a(String str) {
        return d14.a(str);
    }

    public c14(String str, long j) {
        super(j + ", " + t + " " + a(str));
    }

    public c14(BigInteger bigInteger) {
        super(bigInteger + ", " + t + " " + a("ipaddress.error.exceeds.size"));
    }

    public c14(l24 l24Var, l24 l24Var2, int i) {
        super(i + ", " + l24Var + ", " + l24Var2 + ", " + t + " " + a("ipaddress.error.exceeds.size"));
    }

    public c14(l24 l24Var, l24 l24Var2) {
        super(l24Var + ", " + l24Var2 + ", " + t + " " + a("ipaddress.error.exceeds.size"));
    }

    public c14(l24 l24Var, String str) {
        super(l24Var + ", " + t + " " + a(str));
    }

    public c14(String str) {
        super(str);
    }

    public c14(String str, Throwable th) {
        super(str, th);
    }
}