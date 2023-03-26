package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Ranges.kt */
@vo4(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0096\u0002J\u0013\u0010\u000e\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0016J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0006\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\t¨\u0006\u0019"}, d2 = {"Lkotlin/ranges/ClosedFloatRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", com.anythink.expressad.foundation.d.c.bR, "endInclusive", "(FF)V", "_endInclusive", "_start", "getEndInclusive", "()Ljava/lang/Float;", "getStart", "contains", "", "value", "equals", "other", "", "hashCode", "", "isEmpty", "lessThanOrEquals", "a", "b", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class w45 implements x45<Float> {
    private final float s;
    private final float t;

    public w45(float f, float f2) {
        this.s = f;
        this.t = f2;
    }

    @Override // com.p7700g.p99005.x45, com.p7700g.p99005.y45
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return e(((Number) comparable).floatValue());
    }

    @Override // com.p7700g.p99005.x45
    public /* bridge */ /* synthetic */ boolean b(Float f, Float f2) {
        return h(f.floatValue(), f2.floatValue());
    }

    public boolean e(float f) {
        return f >= this.s && f <= this.t;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof w45) {
            if (isEmpty() && ((w45) obj).isEmpty()) {
                return true;
            }
            w45 w45Var = (w45) obj;
            if (this.s == w45Var.s) {
                if (this.t == w45Var.t) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.p7700g.p99005.y45
    @NotNull
    /* renamed from: f */
    public Float d() {
        return Float.valueOf(this.t);
    }

    @Override // com.p7700g.p99005.y45
    @NotNull
    /* renamed from: g */
    public Float c() {
        return Float.valueOf(this.s);
    }

    public boolean h(float f, float f2) {
        return f <= f2;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.valueOf(this.s).hashCode() * 31) + Float.valueOf(this.t).hashCode();
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