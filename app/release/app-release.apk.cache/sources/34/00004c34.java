package com.p7700g.p99005;

/* compiled from: VpnTransportException.java */
/* loaded from: classes2.dex */
public class kc1 extends gc1 {
    public static final int s = -11;
    private final int t;
    @x1
    private final String u;

    public kc1(int i, @x1 String str) {
        this(i, str, "", null);
    }

    public static boolean g(int i) {
        return i > 0 || i == -11;
    }

    @x1
    public String f() {
        return this.u;
    }

    public int getCode() {
        return this.t;
    }

    public kc1(int i, @z1 Throwable th) {
        this(i, wo1.l("VpnTransportException code=", i), "", th);
    }

    public kc1(int i, @x1 String str, @x1 String str2) {
        this(i, str, str2, null);
    }

    public kc1(int i, @x1 String str, @x1 String str2, @z1 Throwable th) {
        super(str, th);
        this.t = i;
        this.u = str2;
    }
}