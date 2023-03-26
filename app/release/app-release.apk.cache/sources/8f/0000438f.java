package com.p7700g.p99005;

/* compiled from: HostNameException.java */
/* loaded from: classes3.dex */
public class g14 extends d14 {
    private static final long u = 4;
    private static String v = d14.a("ipaddress.host.error");

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g14(String str, int i) {
        super(r3.toString());
        StringBuilder L = wo1.L(str, " ");
        L.append(v);
        L.append(" ");
        L.append(d14.a("ipaddress.host.error.invalid.character.at.index"));
        L.append(gl4.R);
        L.append(i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g14(String str, int i, Throwable th) {
        super(r3.toString(), th);
        StringBuilder L = wo1.L(str, " ");
        L.append(v);
        L.append(" ");
        L.append(d14.a("ipaddress.host.error.invalid.character.at.index"));
        L.append(gl4.R);
        L.append(i);
    }

    public g14(String str, String str2) {
        super(str, v, str2);
    }

    public g14(String str, a14 a14Var, String str2) {
        super(str, v, str2, a14Var);
    }
}