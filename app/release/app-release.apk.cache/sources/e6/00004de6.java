package com.p7700g.p99005;

import android.text.TextUtils;

/* compiled from: Header.java */
/* loaded from: classes3.dex */
public final class l43 {
    private final String a;
    private final String b;

    public l43(String name, String value) {
        this.a = name;
        this.b = value;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || l43.class != o.getClass()) {
            return false;
        }
        l43 l43Var = (l43) o;
        return TextUtils.equals(this.a, l43Var.a) && TextUtils.equals(this.b, l43Var.b);
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public String toString() {
        StringBuilder G = wo1.G("Header[name=");
        G.append(this.a);
        G.append(",value=");
        return wo1.C(G, this.b, "]");
    }
}