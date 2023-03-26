package com.anythink.expressad.foundation.g.f.c;

import android.text.TextUtils;
import com.p7700g.p99005.wo1;

/* loaded from: classes2.dex */
public final class c {
    private final String a;
    private final String b;

    public c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass()) {
            c cVar = (c) obj;
            if (TextUtils.equals(this.a, cVar.a) && TextUtils.equals(this.b, cVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header[name=");
        sb.append(this.a);
        sb.append(",value=");
        return wo1.C(sb, this.b, "]");
    }
}