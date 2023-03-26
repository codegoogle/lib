package com.p7700g.p99005;

/* compiled from: AddressPositionException.java */
/* loaded from: classes3.dex */
public class t04 extends c14 {
    private static final long u = 1;

    public t04(int i) {
        super(i + ", " + c14.t + " " + a("ipaddress.error.invalid.position"));
    }

    public static String a(String str) {
        return d14.a(str);
    }

    public t04(l24 l24Var, int i) {
        super(l24Var + ", " + i + ", " + c14.t + " " + a("ipaddress.error.invalid.position"));
    }

    public t04(l24 l24Var, int i, int i2) {
        super(l24Var + ", " + i + ", " + i2 + ", " + c14.t + " " + a("ipaddress.error.invalid.position"));
    }
}