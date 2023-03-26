package com.p7700g.p99005;

import android.util.SizeF;

/* compiled from: SizeFCompat.java */
/* loaded from: classes.dex */
public final class np {
    private final float a;
    private final float b;

    /* compiled from: SizeFCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        @x1
        @e1
        public static SizeF a(@x1 np npVar) {
            jp.l(npVar);
            return new SizeF(npVar.b(), npVar.a());
        }

        @x1
        @e1
        public static np b(@x1 SizeF sizeF) {
            jp.l(sizeF);
            return new np(sizeF.getWidth(), sizeF.getHeight());
        }
    }

    public np(float f, float f2) {
        this.a = jp.d(f, "width");
        this.b = jp.d(f2, "height");
    }

    @e2(21)
    @x1
    public static np d(@x1 SizeF sizeF) {
        return a.b(sizeF);
    }

    public float a() {
        return this.b;
    }

    public float b() {
        return this.a;
    }

    @e2(21)
    @x1
    public SizeF c() {
        return a.a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof np) {
            np npVar = (np) obj;
            return npVar.a == this.a && npVar.b == this.b;
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.a) ^ Float.floatToIntBits(this.b);
    }

    @x1
    public String toString() {
        return this.a + "x" + this.b;
    }
}