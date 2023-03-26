package com.p7700g.p99005;

/* compiled from: AddressConversionException.java */
/* loaded from: classes3.dex */
public class r04 extends RuntimeException {
    private static final long s = 1;
    private static String t = a("ipaddress.address.error");

    public r04(l24 l24Var) {
        super(l24Var + ", " + t + " " + a("ipaddress.error.version.mismatch"));
    }

    public static String a(String str) {
        return d14.a(str);
    }

    public r04(l24 l24Var, l24 l24Var2) {
        super(l24Var + ", " + l24Var2 + ", " + t + " " + a("ipaddress.error.version.mismatch"));
    }

    public r04(l24 l24Var, l24 l24Var2, String str) {
        super(l24Var + ", " + l24Var2 + ", " + t + " " + a(str));
    }
}