package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c03 {
    private final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public c03(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return (this.b || this.d) ? false : true;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c03) {
            c03 c03Var = (c03) obj;
            return this.a == c03Var.a && this.b == c03Var.b && this.c == c03Var.c && this.d == c03Var.d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z = this.a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        ?? r2 = this.b;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (i + i2) * 31;
        ?? r22 = this.c;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (i3 + i4) * 31;
        boolean z2 = this.d;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("PrivacyConfig(enableCcpa=");
        G.append(this.a);
        G.append(", enableCoppa=");
        G.append(this.b);
        G.append(", enableGdpr=");
        G.append(this.c);
        G.append(", dntLocation=");
        G.append(this.d);
        G.append(')');
        return G.toString();
    }
}