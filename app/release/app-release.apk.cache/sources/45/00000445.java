package com.anythink.basead.c;

import com.p7700g.p99005.wo1;

/* loaded from: classes2.dex */
public final class e {
    public String a;
    public String b;

    public e(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        StringBuilder sb = new StringBuilder("code[ ");
        sb.append(this.a);
        sb.append(" ],desc[ ");
        return wo1.C(sb, this.b, " ]");
    }
}