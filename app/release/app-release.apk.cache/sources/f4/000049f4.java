package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Regex.kt */
@vo4(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lkotlin/text/MatchGroup;", "", "value", "", "range", "Lkotlin/ranges/IntRange;", "(Ljava/lang/String;Lkotlin/ranges/IntRange;)V", "getRange", "()Lkotlin/ranges/IntRange;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class j85 {
    @NotNull
    private final String a;
    @NotNull
    private final c55 b;

    public j85(@NotNull String str, @NotNull c55 c55Var) {
        c25.p(str, "value");
        c25.p(c55Var, "range");
        this.a = str;
        this.b = c55Var;
    }

    public static /* synthetic */ j85 d(j85 j85Var, String str, c55 c55Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = j85Var.a;
        }
        if ((i & 2) != 0) {
            c55Var = j85Var.b;
        }
        return j85Var.c(str, c55Var);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    @NotNull
    public final c55 b() {
        return this.b;
    }

    @NotNull
    public final j85 c(@NotNull String str, @NotNull c55 c55Var) {
        c25.p(str, "value");
        c25.p(c55Var, "range");
        return new j85(str, c55Var);
    }

    @NotNull
    public final c55 e() {
        return this.b;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j85) {
            j85 j85Var = (j85) obj;
            return c25.g(this.a, j85Var.a) && c25.g(this.b, j85Var.b);
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
        StringBuilder G = wo1.G("MatchGroup(value=");
        G.append(this.a);
        G.append(", range=");
        G.append(this.b);
        G.append(')');
        return G.toString();
    }
}