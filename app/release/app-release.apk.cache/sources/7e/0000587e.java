package com.p7700g.p99005;

import com.p7700g.p99005.mn4;

/* compiled from: EntityTag.java */
/* loaded from: classes3.dex */
public class qm4 {
    private static final mn4.a<qm4> a = mn4.g().b(qm4.class);
    private String b;
    private boolean c;

    public qm4(String str) {
        this(str, false);
    }

    public static qm4 c(String str) throws IllegalArgumentException {
        return a.a(str);
    }

    public String a() {
        return this.b;
    }

    public boolean b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof qm4)) {
            return super.equals(obj);
        }
        qm4 qm4Var = (qm4) obj;
        return this.b.equals(qm4Var.a()) && this.c == qm4Var.b();
    }

    public int hashCode() {
        String str = this.b;
        return ((51 + (str != null ? str.hashCode() : 0)) * 17) + (this.c ? 1 : 0);
    }

    public String toString() {
        return a.b(this);
    }

    public qm4(String str, boolean z) {
        if (str != null) {
            this.b = str;
            this.c = z;
            return;
        }
        throw new IllegalArgumentException("value==null");
    }
}