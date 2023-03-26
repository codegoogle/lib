package com.p7700g.p99005;

/* compiled from: NoCredsSourceException.java */
/* loaded from: classes2.dex */
public class zb1 extends gc1 {
    @x1
    private static final String s = "Null";
    @x1
    private static final String t = "Empty";
    @x1
    private final String u;

    public zb1(@x1 String str, @x1 String str2) {
        super(str);
        this.u = str2;
    }

    @x1
    public static gc1 f() {
        return new zb1("CredentialsContentProvider returned empty response", t);
    }

    @x1
    public static gc1 g() {
        return new zb1("CredentialsContentProvider returned null result", s);
    }

    @Override // com.p7700g.p99005.gc1
    @x1
    public String toTrackerName() {
        StringBuilder G = wo1.G("NoCredsSourceException:");
        G.append(this.u);
        return G.toString();
    }
}