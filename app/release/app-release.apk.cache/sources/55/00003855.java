package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Progressions.kt */
@vo4(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\t\u0010\u0013\u001a\u00020\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/IntProgression;", "", "", com.anythink.expressad.foundation.d.c.bR, "endInclusive", "step", "(III)V", "first", "getFirst", "()I", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "Lkotlin/collections/IntIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public class a55 implements Iterable<Integer>, n35 {
    @NotNull
    public static final a s = new a(null);
    private final int t;
    private final int u;
    private final int v;

    /* compiled from: Progressions.kt */
    @vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/IntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/IntProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a55 a(int i, int i2, int i3) {
            return new a55(i, i2, i3);
        }
    }

    public a55(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 != Integer.MIN_VALUE) {
            this.t = i;
            this.u = lx4.c(i, i2, i3);
            this.v = i3;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }

    public final int e() {
        return this.t;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof a55) {
            if (!isEmpty() || !((a55) obj).isEmpty()) {
                a55 a55Var = (a55) obj;
                if (this.t != a55Var.t || this.u != a55Var.u || this.v != a55Var.v) {
                }
            }
            return true;
        }
        return false;
    }

    public final int h() {
        return this.u;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.t * 31) + this.u) * 31) + this.v;
    }

    public final int i() {
        return this.v;
    }

    public boolean isEmpty() {
        if (this.v > 0) {
            if (this.t > this.u) {
                return true;
            }
        } else if (this.t < this.u) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: m */
    public ft4 iterator() {
        return new b55(this.t, this.u, this.v);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.v > 0) {
            sb = new StringBuilder();
            sb.append(this.t);
            sb.append("..");
            sb.append(this.u);
            sb.append(" step ");
            i = this.v;
        } else {
            sb = new StringBuilder();
            sb.append(this.t);
            sb.append(" downTo ");
            sb.append(this.u);
            sb.append(" step ");
            i = -this.v;
        }
        sb.append(i);
        return sb.toString();
    }
}