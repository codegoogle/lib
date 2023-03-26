package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Ranges.kt */
@vo4(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0013\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/ClosedDoubleRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", com.anythink.expressad.foundation.d.c.bR, "endInclusive", "(DD)V", "_endInclusive", "_start", "getEndInclusive", "()Ljava/lang/Double;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "lessThanOrEquals", "a", "b", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class v45 implements x45<Double> {
    private final double s;
    private final double t;

    public v45(double d, double d2) {
        this.s = d;
        this.t = d2;
    }

    @Override // com.p7700g.p99005.x45, com.p7700g.p99005.y45
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return e(((Number) comparable).doubleValue());
    }

    @Override // com.p7700g.p99005.x45
    public /* bridge */ /* synthetic */ boolean b(Double d, Double d2) {
        return h(d.doubleValue(), d2.doubleValue());
    }

    public boolean e(double d) {
        return d >= this.s && d <= this.t;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof v45) {
            if (isEmpty() && ((v45) obj).isEmpty()) {
                return true;
            }
            v45 v45Var = (v45) obj;
            if (this.s == v45Var.s) {
                if (this.t == v45Var.t) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p7700g.p99005.y45
    @NotNull
    /* renamed from: f */
    public Double d() {
        return Double.valueOf(this.t);
    }

    @Override // com.p7700g.p99005.y45
    @NotNull
    /* renamed from: g */
    public Double c() {
        return Double.valueOf(this.s);
    }

    public boolean h(double d, double d2) {
        return d <= d2;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Double.valueOf(this.s).hashCode() * 31) + Double.valueOf(this.t).hashCode();
    }

    @Override // com.p7700g.p99005.x45, com.p7700g.p99005.y45
    public boolean isEmpty() {
        return this.s > this.t;
    }

    @NotNull
    public String toString() {
        return this.s + ".." + this.t;
    }
}