package com.p7700g.p99005;

import com.p7700g.p99005.ga2;

/* compiled from: HarmonizedColorsOptions.java */
/* loaded from: classes3.dex */
public class ic2 {
    @x1
    @y0
    private final int[] a;
    @z1
    private final gc2 b;
    @q0
    private final int c;

    /* compiled from: HarmonizedColorsOptions.java */
    /* loaded from: classes3.dex */
    public static class b {
        @z1
        private gc2 b;
        @x1
        @y0
        private int[] a = new int[0];
        @q0
        private int c = ga2.c.f3;

        @x1
        public ic2 d() {
            return new ic2(this);
        }

        @x1
        public b e(@q0 int i) {
            this.c = i;
            return this;
        }

        @x1
        public b f(@z1 gc2 gc2Var) {
            this.b = gc2Var;
            return this;
        }

        @x1
        public b g(@x1 @y0 int[] iArr) {
            this.a = iArr;
            return this;
        }
    }

    @x1
    public static ic2 a() {
        return new b().f(gc2.c()).d();
    }

    @q0
    public int b() {
        return this.c;
    }

    @z1
    public gc2 c() {
        return this.b;
    }

    @x1
    @y0
    public int[] d() {
        return this.a;
    }

    @m2
    public int e(@m2 int i) {
        gc2 gc2Var = this.b;
        return (gc2Var == null || gc2Var.e() == 0) ? i : this.b.e();
    }

    private ic2(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
    }
}