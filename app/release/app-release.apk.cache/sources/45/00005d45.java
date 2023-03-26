package com.p7700g.p99005;

/* compiled from: IncompatibleAddressException.java */
/* loaded from: classes3.dex */
public class t14 extends RuntimeException {
    private static final long s = 4;
    private static String t = a("ipaddress.address.error");

    public t14(l24 l24Var, String str) {
        super(l24Var + ", " + t + " " + a(str));
    }

    public static String a(String str) {
        return d14.a(str);
    }

    public t14(CharSequence charSequence, String str) {
        super(((Object) charSequence) + ", " + t + " " + a(str));
    }

    public t14(long j, long j2, String str) {
        super(j + "-" + j2 + ", " + t + " " + a(str));
    }

    public t14(long j, long j2, long j3, String str) {
        super(j + "-" + j2 + " /" + j3 + ", " + t + " " + a(str));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public t14(String str, String str2, String str3, String str4) {
        super(r3.toString());
        StringBuilder N = wo1.N(str, "-", str2, " /", str3);
        N.append(", ");
        N.append(t);
        N.append(" ");
        N.append(a(str4));
    }

    public t14(l24 l24Var, int i, String str) {
        super(l24Var + " /" + i + ", " + t + " " + a(str));
    }

    public t14(l24 l24Var, int i, l24 l24Var2, int i2, String str) {
        super((i + 1) + ":" + l24Var + ", " + (i2 + 1) + ":" + l24Var2 + ", " + t + " " + a(str));
    }

    public t14(l24 l24Var, l24 l24Var2, String str) {
        super(l24Var + ", " + l24Var2 + ", " + t + " " + a(str));
    }
}