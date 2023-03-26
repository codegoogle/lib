package com.p7700g.p99005;

import com.ironsource.mediationsdk.utils.IronSourceConstants;

/* compiled from: Dependency.java */
/* loaded from: classes3.dex */
public final class zo2 {
    private final Class<?> a;
    private final int b;
    private final int c;

    private zo2(Class<?> cls, int i, int i2) {
        this.a = (Class) ip2.c(cls, "Null dependency anInterface.");
        this.b = i;
        this.c = i2;
    }

    public static zo2 a(Class<?> cls) {
        return new zo2(cls, 0, 2);
    }

    private static String b(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "deferred";
                }
                throw new AssertionError(wo1.l("Unsupported injection: ", i));
            }
            return IronSourceConstants.EVENTS_PROVIDER;
        }
        return "direct";
    }

    @Deprecated
    public static zo2 h(Class<?> cls) {
        return new zo2(cls, 0, 0);
    }

    public static zo2 i(Class<?> cls) {
        return new zo2(cls, 0, 1);
    }

    public static zo2 j(Class<?> cls) {
        return new zo2(cls, 1, 0);
    }

    public static zo2 k(Class<?> cls) {
        return new zo2(cls, 1, 1);
    }

    public static zo2 l(Class<?> cls) {
        return new zo2(cls, 2, 0);
    }

    public static zo2 m(Class<?> cls) {
        return new zo2(cls, 2, 1);
    }

    public Class<?> c() {
        return this.a;
    }

    public boolean d() {
        return this.c == 2;
    }

    public boolean e() {
        return this.c == 0;
    }

    public boolean equals(Object obj) {
        if (obj instanceof zo2) {
            zo2 zo2Var = (zo2) obj;
            return this.a == zo2Var.a && this.b == zo2Var.b && this.c == zo2Var.c;
        }
        return false;
    }

    public boolean f() {
        return this.b == 1;
    }

    public boolean g() {
        return this.b == 2;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : la1.a);
        sb.append(", injection=");
        return wo1.C(sb, b(this.c), "}");
    }
}