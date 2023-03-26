package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UIntRange.kt */
@dr4(markerClass = {go4.class})
@vo4(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010(\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0017\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\"\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u0012\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0086\u0002ø\u0001\u0000J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u0013\u0010\b\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0013\u0010\n\u001a\u00020\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lkotlin/ranges/UIntProgression;", "", "Lkotlin/UInt;", com.anythink.expressad.foundation.d.c.bR, "endInclusive", "step", "", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "first", AFHydra.STATUS_IDLE, "last", "getStep", "()I", "equals", "", "other", "", "hashCode", "isEmpty", "iterator", "", "toString", "", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
@tp4(version = "1.5")
/* loaded from: classes3.dex */
public class j55 implements Iterable<jq4>, n35 {
    @NotNull
    public static final a s = new a(null);
    private final int t;
    private final int u;
    private final int v;

    /* compiled from: UIntRange.kt */
    @vo4(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lkotlin/ranges/UIntProgression$Companion;", "", "()V", "fromClosedRange", "Lkotlin/ranges/UIntProgression;", "rangeStart", "Lkotlin/UInt;", "rangeEnd", "step", "", "fromClosedRange-Nkh28Cs", "(III)Lkotlin/ranges/UIntProgression;", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final j55 a(int i, int i2, int i3) {
            return new j55(i, i2, i3, null);
        }
    }

    private j55(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 != Integer.MIN_VALUE) {
            this.t = i;
            this.u = px4.d(i, i2, i3);
            this.v = i3;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }

    public /* synthetic */ j55(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }

    public final int e() {
        return this.t;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof j55) {
            if (!isEmpty() || !((j55) obj).isEmpty()) {
                j55 j55Var = (j55) obj;
                if (this.t != j55Var.t || this.u != j55Var.u || this.v != j55Var.v) {
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
            if (br4.c(this.t, this.u) > 0) {
                return true;
            }
        } else if (br4.c(this.t, this.u) < 0) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<jq4> iterator() {
        return new k55(this.t, this.u, this.v, null);
    }

    @NotNull
    public String toString() {
        StringBuilder sb;
        int i;
        if (this.v > 0) {
            sb = new StringBuilder();
            sb.append((Object) jq4.X0(this.t));
            sb.append("..");
            sb.append((Object) jq4.X0(this.u));
            sb.append(" step ");
            i = this.v;
        } else {
            sb = new StringBuilder();
            sb.append((Object) jq4.X0(this.t));
            sb.append(" downTo ");
            sb.append((Object) jq4.X0(this.u));
            sb.append(" step ");
            i = -this.v;
        }
        sb.append(i);
        return sb.toString();
    }
}