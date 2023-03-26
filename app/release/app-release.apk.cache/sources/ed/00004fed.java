package com.p7700g.p99005;

import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ULongRange.kt */
@dr4(markerClass = {go4.class})
@vo4(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B\"\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\u0012\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0015H\u0086\u0002ø\u0001\u0000J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0013\u0010\b\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\n\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/ULongProgression;", "", "Lkotlin/ULong;", com.anythink.expressad.foundation.d.c.bR, "endInclusive", "step", "", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", "J", "last", "getStep", "()J", "equals", "", "other", "", "hashCode", "", "isEmpty", "iterator", "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.5")
/* loaded from: classes3.dex */
public class m55 implements Iterable<nq4>, n35 {
    @NotNull
    public static final a s = new a(null);
    private final long t;
    private final long u;
    private final long v;

    /* compiled from: ULongRange.kt */
    @vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlin/ranges/ULongProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/ULongProgression;", "rangeStart", "Lkotlin/ULong;", "rangeEnd", "step", "", "fromClosedRange-7ftBX0g", "(JJJ)Lkotlin/ranges/ULongProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final m55 a(long j, long j2, long j3) {
            return new m55(j, j2, j3, null);
        }
    }

    private m55(long j, long j2, long j3) {
        if (j3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (j3 != Long.MIN_VALUE) {
            this.t = j;
            this.u = px4.c(j, j2, j3);
            this.v = j3;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
    }

    public /* synthetic */ m55(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }

    public final long e() {
        return this.t;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof m55) {
            if (!isEmpty() || !((m55) obj).isEmpty()) {
                m55 m55Var = (m55) obj;
                if (this.t != m55Var.t || this.u != m55Var.u || this.v != m55Var.v) {
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
        long j = this.t;
        long j2 = this.u;
        long j3 = this.v;
        return ((int) (j3 ^ (j3 >>> 32))) + (((((int) nq4.h(j ^ nq4.h(j >>> 32))) * 31) + ((int) nq4.h(j2 ^ nq4.h(j2 >>> 32)))) * 31);
    }

    public final long i() {
        return this.v;
    }

    public boolean isEmpty() {
        int i = (this.v > 0L ? 1 : (this.v == 0L ? 0 : -1));
        int g = br4.g(this.t, this.u);
        if (i > 0) {
            if (g > 0) {
                return true;
            }
        } else if (g < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<nq4> iterator() {
        return new n55(this.t, this.u, this.v, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        long j;
        if (this.v > 0) {
            sb = new StringBuilder();
            sb.append((Object) nq4.X0(this.t));
            sb.append("..");
            sb.append((Object) nq4.X0(this.u));
            sb.append(" step ");
            j = this.v;
        } else {
            sb = new StringBuilder();
            sb.append((Object) nq4.X0(this.t));
            sb.append(" downTo ");
            sb.append((Object) nq4.X0(this.u));
            sb.append(" step ");
            j = -this.v;
        }
        sb.append(j);
        return sb.toString();
    }
}