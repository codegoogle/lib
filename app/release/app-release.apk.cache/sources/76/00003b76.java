package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Tuples.kt */
@vo4(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0006\u001a\u00028\u0000\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00028\u0002¢\u0006\u0002\u0010\tJ\u000e\u0010\u000f\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0010\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0011\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\u000bJ>\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00028\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00012\b\b\u0002\u0010\b\u001a\u00028\u0002HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\u0006\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\b\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u001c"}, d2 = {"Lkotlin/Triple;", bx.B4, AFHydra.EV_BYTECOUNT, "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "first", "second", "third", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "getThird", "component1", "component2", "component3", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Triple;", "equals", "", "other", "", "hashCode", "", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class bq4<A, B, C> implements Serializable {
    private final A s;
    private final B t;
    private final C u;

    public bq4(A a, B b, C c) {
        this.s = a;
        this.t = b;
        this.u = c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ bq4 m(bq4 bq4Var, Object obj, Object obj2, Object obj3, int i, Object obj4) {
        if ((i & 1) != 0) {
            obj = bq4Var.s;
        }
        if ((i & 2) != 0) {
            obj2 = bq4Var.t;
        }
        if ((i & 4) != 0) {
            obj3 = bq4Var.u;
        }
        return bq4Var.i(obj, obj2, obj3);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bq4) {
            bq4 bq4Var = (bq4) obj;
            return c25.g(this.s, bq4Var.s) && c25.g(this.t, bq4Var.t) && c25.g(this.u, bq4Var.u);
        }
        return false;
    }

    public final A f() {
        return this.s;
    }

    public final B g() {
        return this.t;
    }

    public final C h() {
        return this.u;
    }

    public int hashCode() {
        A a = this.s;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.t;
        int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
        C c = this.u;
        return hashCode2 + (c != null ? c.hashCode() : 0);
    }

    @NotNull
    public final bq4<A, B, C> i(A a, B b, C c) {
        return new bq4<>(a, b, c);
    }

    public final A n() {
        return this.s;
    }

    public final B o() {
        return this.t;
    }

    public final C p() {
        return this.u;
    }

    @NotNull
    public String toString() {
        StringBuilder F = wo1.F('(');
        F.append(this.s);
        F.append(", ");
        F.append(this.t);
        F.append(", ");
        F.append(this.u);
        F.append(')');
        return F.toString();
    }
}