package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class t13 {
    @NotNull
    private final String a;
    @NotNull
    private final a b;

    /* loaded from: classes3.dex */
    public enum a {
        INTERSTITIAL,
        NATIVE_OR_BANNER,
        APP_OPEN,
        REWARDED
    }

    public t13(@NotNull String str, @NotNull a aVar) {
        c25.p(str, "unitId");
        c25.p(aVar, "type");
        this.a = str;
        this.b = aVar;
    }

    public static /* synthetic */ t13 d(t13 t13Var, String str, a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = t13Var.a;
        }
        if ((i & 2) != 0) {
            aVar = t13Var.b;
        }
        return t13Var.c(str, aVar);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final a b() {
        return this.b;
    }

    @NotNull
    public final t13 c(@NotNull String str, @NotNull a aVar) {
        c25.p(str, "unitId");
        c25.p(aVar, "type");
        return new t13(str, aVar);
    }

    @NotNull
    public final a e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t13) {
            t13 t13Var = (t13) obj;
            return c25.g(this.a, t13Var.a) && this.b == t13Var.b;
        }
        return false;
    }

    @NotNull
    public final String f() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("PrefetchUnit(unitId=");
        G.append(this.a);
        G.append(", type=");
        G.append(this.b);
        G.append(')');
        return G.toString();
    }
}