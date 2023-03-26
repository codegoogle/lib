package com.p7700g.p99005;

import com.p7700g.p99005.j14;

/* compiled from: PrefixLenException.java */
/* loaded from: classes3.dex */
public class y14 extends c14 {
    private static final long u = 1;

    public y14(int i) {
        super(c14.t + " " + a("ipaddress.error.prefixSize"));
    }

    public static String a(String str) {
        return d14.a(str);
    }

    public y14(l24 l24Var, int i) {
        super(l24Var + ", " + c14.t + " " + a("ipaddress.error.prefixSize"));
    }

    public y14(int i, j14.b bVar) {
        super(bVar + " /" + i + ", " + c14.t + " " + a("ipaddress.error.prefixSize"));
    }

    public y14(CharSequence charSequence, j14.b bVar, Throwable th) {
        super(bVar + " /" + ((Object) charSequence) + ", " + c14.t + " " + a("ipaddress.error.invalidCIDRPrefix"), th);
    }
}