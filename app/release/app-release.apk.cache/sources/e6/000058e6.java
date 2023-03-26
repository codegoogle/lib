package com.p7700g.p99005;

import com.p7700g.p99005.pu;

/* compiled from: FlingAnimation.java */
/* loaded from: classes.dex */
public final class qu extends pu<qu> {
    private final a G;

    /* compiled from: FlingAnimation.java */
    /* loaded from: classes.dex */
    public static final class a implements tu {
        private static final float a = -4.2f;
        private static final float b = 62.5f;
        private float d;
        private float c = a;
        private final pu.p e = new pu.p();

        @Override // com.p7700g.p99005.tu
        public boolean a(float f, float f2) {
            return Math.abs(f2) < this.d;
        }

        @Override // com.p7700g.p99005.tu
        public float b(float f, float f2) {
            return f2 * this.c;
        }

        public float c() {
            return this.c / a;
        }

        public void d(float f) {
            this.c = f * a;
        }

        public void e(float f) {
            this.d = f * b;
        }

        public pu.p f(float f, float f2, long j) {
            float f3 = (float) j;
            this.e.b = (float) (Math.exp((f3 / 1000.0f) * this.c) * f2);
            pu.p pVar = this.e;
            float f4 = this.c;
            pVar.a = (float) ((Math.exp((f4 * f3) / 1000.0f) * (f2 / f4)) + (f - (f2 / f4)));
            pu.p pVar2 = this.e;
            if (a(pVar2.a, pVar2.b)) {
                this.e.b = 0.0f;
            }
            return this.e;
        }
    }

    public qu(su suVar) {
        super(suVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }

    public qu A(@g1(from = 0.0d, fromInclusive = false) float f) {
        if (f > 0.0f) {
            this.G.d(f);
            return this;
        }
        throw new IllegalArgumentException("Friction must be positive");
    }

    @Override // com.p7700g.p99005.pu
    /* renamed from: B */
    public qu p(float f) {
        super.p(f);
        return this;
    }

    @Override // com.p7700g.p99005.pu
    /* renamed from: C */
    public qu q(float f) {
        super.q(f);
        return this;
    }

    @Override // com.p7700g.p99005.pu
    /* renamed from: D */
    public qu u(float f) {
        super.u(f);
        return this;
    }

    @Override // com.p7700g.p99005.pu
    public float f(float f, float f2) {
        return this.G.b(f, f2);
    }

    @Override // com.p7700g.p99005.pu
    public boolean j(float f, float f2) {
        return f >= this.A || f <= this.B || this.G.a(f, f2);
    }

    @Override // com.p7700g.p99005.pu
    public void v(float f) {
        this.G.e(f);
    }

    @Override // com.p7700g.p99005.pu
    public boolean y(long j) {
        pu.p f = this.G.f(this.v, this.u, j);
        float f2 = f.a;
        this.v = f2;
        float f3 = f.b;
        this.u = f3;
        float f4 = this.B;
        if (f2 < f4) {
            this.v = f4;
            return true;
        }
        float f5 = this.A;
        if (f2 <= f5) {
            return j(f2, f3);
        }
        this.v = f5;
        return true;
    }

    public float z() {
        return this.G.c();
    }

    public <K> qu(K k, ru<K> ruVar) {
        super(k, ruVar);
        a aVar = new a();
        this.G = aVar;
        aVar.e(i());
    }
}