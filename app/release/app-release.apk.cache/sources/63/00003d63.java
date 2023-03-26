package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: IndexedValue.kt */
@vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0002\u0010\u0006J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\nJ(\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0005\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lkotlin/collections/IndexedValue;", "T", "", la1.l, "", "value", "(ILjava/lang/Object;)V", "getIndex", "()I", "getValue", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "component2", "copy", "(ILjava/lang/Object;)Lkotlin/collections/IndexedValue;", "equals", "", "other", "hashCode", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class ct4<T> {
    private final int a;
    private final T b;

    public ct4(int i, T t) {
        this.a = i;
        this.b = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ct4 d(ct4 ct4Var, int i, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = ct4Var.a;
        }
        if ((i2 & 2) != 0) {
            obj = ct4Var.b;
        }
        return ct4Var.c(i, obj);
    }

    public final int a() {
        return this.a;
    }

    public final T b() {
        return this.b;
    }

    @NotNull
    public final ct4<T> c(int i, T t) {
        return new ct4<>(i, t);
    }

    public final int e() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ct4) {
            ct4 ct4Var = (ct4) obj;
            return this.a == ct4Var.a && c25.g(this.b, ct4Var.b);
        }
        return false;
    }

    public final T f() {
        return this.b;
    }

    public int hashCode() {
        int i = this.a * 31;
        T t = this.b;
        return i + (t == null ? 0 : t.hashCode());
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("IndexedValue(index=");
        G.append(this.a);
        G.append(", value=");
        G.append(this.b);
        G.append(')');
        return G.toString();
    }
}