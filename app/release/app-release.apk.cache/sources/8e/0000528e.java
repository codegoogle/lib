package com.p7700g.p99005;

import android.graphics.PointF;

/* compiled from: PathSegment.java */
/* loaded from: classes.dex */
public final class nj {
    private final PointF a;
    private final float b;
    private final PointF c;
    private final float d;

    public nj(@x1 PointF pointF, float f, @x1 PointF pointF2, float f2) {
        this.a = (PointF) jp.m(pointF, "start == null");
        this.b = f;
        this.c = (PointF) jp.m(pointF2, "end == null");
        this.d = f2;
    }

    @x1
    public PointF a() {
        return this.c;
    }

    public float b() {
        return this.d;
    }

    @x1
    public PointF c() {
        return this.a;
    }

    public float d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof nj) {
            nj njVar = (nj) obj;
            return Float.compare(this.b, njVar.b) == 0 && Float.compare(this.d, njVar.d) == 0 && this.a.equals(njVar.a) && this.c.equals(njVar.c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        float f = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31)) * 31;
        float f2 = this.d;
        return hashCode2 + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0);
    }

    public String toString() {
        StringBuilder G = wo1.G("PathSegment{start=");
        G.append(this.a);
        G.append(", startFraction=");
        G.append(this.b);
        G.append(", end=");
        G.append(this.c);
        G.append(", endFraction=");
        G.append(this.d);
        G.append('}');
        return G.toString();
    }
}