package com.p7700g.p99005;

import android.graphics.Insets;
import android.graphics.Rect;
import com.p7700g.p99005.i2;

/* compiled from: Insets.java */
/* loaded from: classes.dex */
public final class hj {
    @x1
    public static final hj a = new hj(0, 0, 0, 0);
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    /* compiled from: Insets.java */
    @e2(29)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static Insets a(int i, int i2, int i3, int i4) {
            return Insets.of(i, i2, i3, i4);
        }
    }

    private hj(int i, int i2, int i3, int i4) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }

    @x1
    public static hj a(@x1 hj hjVar, @x1 hj hjVar2) {
        return d(hjVar.b + hjVar2.b, hjVar.c + hjVar2.c, hjVar.d + hjVar2.d, hjVar.e + hjVar2.e);
    }

    @x1
    public static hj b(@x1 hj hjVar, @x1 hj hjVar2) {
        return d(Math.max(hjVar.b, hjVar2.b), Math.max(hjVar.c, hjVar2.c), Math.max(hjVar.d, hjVar2.d), Math.max(hjVar.e, hjVar2.e));
    }

    @x1
    public static hj c(@x1 hj hjVar, @x1 hj hjVar2) {
        return d(Math.min(hjVar.b, hjVar2.b), Math.min(hjVar.c, hjVar2.c), Math.min(hjVar.d, hjVar2.d), Math.min(hjVar.e, hjVar2.e));
    }

    @x1
    public static hj d(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return a;
        }
        return new hj(i, i2, i3, i4);
    }

    @x1
    public static hj e(@x1 Rect rect) {
        return d(rect.left, rect.top, rect.right, rect.bottom);
    }

    @x1
    public static hj f(@x1 hj hjVar, @x1 hj hjVar2) {
        return d(hjVar.b - hjVar2.b, hjVar.c - hjVar2.c, hjVar.d - hjVar2.d, hjVar.e - hjVar2.e);
    }

    @e2(api = 29)
    @x1
    public static hj g(@x1 Insets insets) {
        return d(insets.left, insets.top, insets.right, insets.bottom);
    }

    @e2(api = 29)
    @Deprecated
    @i2({i2.a.LIBRARY_GROUP_PREFIX})
    @x1
    public static hj i(@x1 Insets insets) {
        return g(insets);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hj.class != obj.getClass()) {
            return false;
        }
        hj hjVar = (hj) obj;
        return this.e == hjVar.e && this.b == hjVar.b && this.d == hjVar.d && this.c == hjVar.c;
    }

    @e2(29)
    @x1
    public Insets h() {
        return a.a(this.b, this.c, this.d, this.e);
    }

    public int hashCode() {
        return (((((this.b * 31) + this.c) * 31) + this.d) * 31) + this.e;
    }

    @x1
    public String toString() {
        StringBuilder G = wo1.G("Insets{left=");
        G.append(this.b);
        G.append(", top=");
        G.append(this.c);
        G.append(", right=");
        G.append(this.d);
        G.append(", bottom=");
        return wo1.y(G, this.e, '}');
    }
}