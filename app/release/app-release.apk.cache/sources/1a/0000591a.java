package com.p7700g.p99005;

/* compiled from: Target.java */
/* loaded from: classes3.dex */
public final class qz2 {
    @x1
    public static final qz2 a;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 0;
    public static final int f = 1;
    public static final int g = 2;
    private static final float h = 0.3f;
    private static final float i = 0.5f;
    private static final float j = 0.7f;
    private static final float k = 1.0f;
    private static final float l = 0.35f;
    private static final float m = 0.24f;
    private static final float n = 0.52f;
    private static final float o = 0.24f;
    public final float[] p;
    public final float[] q;
    public final float[] r;
    public boolean s;

    static {
        qz2 qz2Var = new qz2();
        a = qz2Var;
        l(qz2Var);
        m(qz2Var);
    }

    public qz2() {
        float[] fArr = new float[3];
        this.p = fArr;
        float[] fArr2 = new float[3];
        this.q = fArr2;
        this.r = new float[3];
        this.s = true;
        o(fArr);
        o(fArr2);
        n();
    }

    private static void l(qz2 target) {
        float[] fArr = target.q;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    private static void m(qz2 target) {
        float[] fArr = target.p;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    private void n() {
        float[] fArr = this.r;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    private static void o(final float[] values) {
        values[0] = 0.0f;
        values[1] = 0.5f;
        values[2] = 1.0f;
    }

    public float a() {
        return this.r[1];
    }

    @g1(from = zg2.s, to = 1.0d)
    public float b() {
        return this.q[2];
    }

    @g1(from = zg2.s, to = 1.0d)
    public float c() {
        return this.p[2];
    }

    @g1(from = zg2.s, to = 1.0d)
    public float d() {
        return this.q[0];
    }

    @g1(from = zg2.s, to = 1.0d)
    public float e() {
        return this.p[0];
    }

    public float f() {
        return this.r[2];
    }

    public float g() {
        return this.r[0];
    }

    @g1(from = zg2.s, to = 1.0d)
    public float h() {
        return this.q[1];
    }

    @g1(from = zg2.s, to = 1.0d)
    public float i() {
        return this.p[1];
    }

    public boolean j() {
        return this.s;
    }

    public void k() {
        float[] fArr;
        float f2 = 0.0f;
        for (float f3 : this.r) {
            if (f3 > 0.0f) {
                f2 += f3;
            }
        }
        if (f2 != 0.0f) {
            int length = this.r.length;
            for (int i2 = 0; i2 < length; i2++) {
                float[] fArr2 = this.r;
                if (fArr2[i2] > 0.0f) {
                    fArr2[i2] = fArr2[i2] / f2;
                }
            }
        }
    }

    /* compiled from: Target.java */
    /* loaded from: classes3.dex */
    public static final class a {
        private final qz2 a;

        public a() {
            this.a = new qz2();
        }

        @x1
        public qz2 a() {
            return this.a;
        }

        @x1
        public a b(boolean exclusive) {
            this.a.s = exclusive;
            return this;
        }

        @x1
        public a c(@g1(from = 0.0d, to = 1.0d) float value) {
            this.a.q[2] = value;
            return this;
        }

        @x1
        public a d(@g1(from = 0.0d, to = 1.0d) float value) {
            this.a.q[0] = value;
            return this;
        }

        @x1
        public a e(@g1(from = 0.0d) float weight) {
            this.a.r[2] = weight;
            return this;
        }

        @x1
        public a f(@g1(from = 0.0d) float weight) {
            this.a.r[0] = weight;
            return this;
        }

        public a(@x1 qz2 target) {
            this.a = new qz2(target);
        }
    }

    public qz2(@x1 qz2 from) {
        float[] fArr = new float[3];
        this.p = fArr;
        float[] fArr2 = new float[3];
        this.q = fArr2;
        float[] fArr3 = new float[3];
        this.r = fArr3;
        this.s = true;
        System.arraycopy(from.p, 0, fArr, 0, fArr.length);
        System.arraycopy(from.q, 0, fArr2, 0, fArr2.length);
        System.arraycopy(from.r, 0, fArr3, 0, fArr3.length);
    }
}