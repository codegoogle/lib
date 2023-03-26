package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Tuples.kt */
@vo4(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012\u00060\u0003j\u0002`\u0004B\u0015\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00028\u0001¢\u0006\u0002\u0010\u0007J\u000e\u0010\f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\tJ\u000e\u0010\r\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\tJ.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00028\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\u000b\u0010\t¨\u0006\u0018"}, d2 = {"Lkotlin/Pair;", bx.B4, AFHydra.EV_BYTECOUNT, "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class hp4<A, B> implements Serializable {
    private final A s;
    private final B t;

    public hp4(A a, B b) {
        this.s = a;
        this.t = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ hp4 i(hp4 hp4Var, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = hp4Var.s;
        }
        if ((i & 2) != 0) {
            obj2 = hp4Var.t;
        }
        return hp4Var.h(obj, obj2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hp4) {
            hp4 hp4Var = (hp4) obj;
            return c25.g(this.s, hp4Var.s) && c25.g(this.t, hp4Var.t);
        }
        return false;
    }

    public final A f() {
        return this.s;
    }

    public final B g() {
        return this.t;
    }

    @NotNull
    public final hp4<A, B> h(A a, B b) {
        return new hp4<>(a, b);
    }

    public int hashCode() {
        A a = this.s;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.t;
        return hashCode + (b != null ? b.hashCode() : 0);
    }

    public final A m() {
        return this.s;
    }

    public final B n() {
        return this.t;
    }

    @NotNull
    public String toString() {
        StringBuilder F = wo1.F('(');
        F.append(this.s);
        F.append(", ");
        F.append(this.t);
        F.append(')');
        return F.toString();
    }
}