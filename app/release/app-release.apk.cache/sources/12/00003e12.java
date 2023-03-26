package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Progressions.kt */
@vo4(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0002\u0010\u0006J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\t\u0010\u0014\u001a\u00020\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0007\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/LongProgression;", "", "", com.anythink.expressad.foundation.d.c.bR, "endInclusive", "step", "(JJJ)V", "first", "getFirst", "()J", "last", "getLast", "getStep", "equals", "", "other", "", "hashCode", "", "isEmpty", "iterator", "Lkotlin/collections/LongIterator;", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public class d55 implements Iterable<Long>, n35 {
    @NotNull
    public static final a s = new a(null);
    private final long t;
    private final long u;
    private final long v;

    /* compiled from: Progressions.kt */
    @vo4(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lkotlin/ranges/LongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/LongProgression;", "rangeStart", "", "rangeEnd", "step", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final d55 a(long j, long j2, long j3) {
            return new d55(j, j2, j3);
        }
    }

    public d55(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 != Long.MIN_VALUE) {
            this.t = j;
            this.u = lx4.d(j, j2, j3);
            this.v = j3;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    }

    public final long e() {
        return this.t;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof d55) {
            if (!isEmpty() || !((d55) obj).isEmpty()) {
                d55 d55Var = (d55) obj;
                if (this.t != d55Var.t || this.u != d55Var.u || this.v != d55Var.v) {
                }
            }
            return true;
        }
        return false;
    }

    public final long h() {
        return this.u;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = 31;
        long j2 = this.t;
        long j3 = this.u;
        long j4 = (((j2 ^ (j2 >>> 32)) * j) + (j3 ^ (j3 >>> 32))) * j;
        long j5 = this.v;
        return (int) (j4 + (j5 ^ (j5 >>> 32)));
    }

    public final long i() {
        return this.v;
    }

    public boolean isEmpty() {
        int i = (this.v > 0L ? 1 : (this.v == 0L ? 0 : -1));
        long j = this.t;
        long j2 = this.u;
        if (i > 0) {
            if (j > j2) {
                return true;
            }
        } else if (j < j2) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    /* renamed from: m */
    public gt4 iterator() {
        return new e55(this.t, this.u, this.v);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.v > 0) {
            sb = new StringBuilder();
            sb.append(this.t);
            sb.append("..");
            sb.append(this.u);
            sb.append(" step ");
            j = this.v;
        } else {
            sb = new StringBuilder();
            sb.append(this.t);
            sb.append(" downTo ");
            sb.append(this.u);
            sb.append(" step ");
            j = -this.v;
        }
        sb.append(j);
        return sb.toString();
    }
}