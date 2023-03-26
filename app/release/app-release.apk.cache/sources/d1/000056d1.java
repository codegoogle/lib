package com.p7700g.p99005;

import android.graphics.Bitmap;

/* compiled from: PreFillType.java */
/* loaded from: classes2.dex */
public final class pt1 {
    @r2
    public static final Bitmap.Config a = Bitmap.Config.RGB_565;
    private final int b;
    private final int c;
    private final Bitmap.Config d;
    private final int e;

    /* compiled from: PreFillType.java */
    /* loaded from: classes2.dex */
    public static class a {
        private final int a;
        private final int b;
        private Bitmap.Config c;
        private int d;

        public a(int i) {
            this(i, i);
        }

        public pt1 a() {
            return new pt1(this.a, this.b, this.c, this.d);
        }

        public Bitmap.Config b() {
            return this.c;
        }

        public a c(@z1 Bitmap.Config config) {
            this.c = config;
            return this;
        }

        public a d(int i) {
            if (i > 0) {
                this.d = i;
                return this;
            }
            throw new IllegalArgumentException("Weight must be > 0");
        }

        public a(int i, int i2) {
            this.d = 1;
            if (i <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if (i2 > 0) {
                this.a = i;
                this.b = i2;
                return;
            }
            throw new IllegalArgumentException("Height must be > 0");
        }
    }

    public pt1(int i, int i2, Bitmap.Config config, int i3) {
        this.d = (Bitmap.Config) x02.e(config, "Config must not be null");
        this.b = i;
        this.c = i2;
        this.e = i3;
    }

    public Bitmap.Config a() {
        return this.d;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.e;
    }

    public int d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof pt1) {
            pt1 pt1Var = (pt1) obj;
            return this.c == pt1Var.c && this.b == pt1Var.b && this.e == pt1Var.e && this.d == pt1Var.d;
        }
        return false;
    }

    public int hashCode() {
        return ((this.d.hashCode() + (((this.b * 31) + this.c) * 31)) * 31) + this.e;
    }

    public String toString() {
        StringBuilder G = wo1.G("PreFillSize{width=");
        G.append(this.b);
        G.append(", height=");
        G.append(this.c);
        G.append(", config=");
        G.append(this.d);
        G.append(", weight=");
        return wo1.y(G, this.e, '}');
    }
}