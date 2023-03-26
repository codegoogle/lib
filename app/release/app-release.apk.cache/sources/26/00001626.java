package com.facebook.shimmer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.facebook.shimmer.b;
import com.p7700g.p99005.c2;
import com.p7700g.p99005.g1;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.w0;
import com.p7700g.p99005.wo1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: Shimmer.java */
/* loaded from: classes2.dex */
public class c {
    private static final int a = 4;
    public final float[] b = new float[4];
    public final int[] c = new int[4];
    public final RectF d = new RectF();
    public int e = 0;
    @w0
    public int f = -1;
    @w0
    public int g = 1291845631;
    public int h = 0;
    public int i = 0;
    public int j = 0;
    public float k = 1.0f;
    public float l = 1.0f;
    public float m = 0.0f;
    public float n = 0.5f;
    public float o = 20.0f;
    public boolean p = true;
    public boolean q = true;
    public boolean r = true;
    public int s = -1;
    public int t = 1;
    public long u = 1000;
    public long v;

    /* compiled from: Shimmer.java */
    /* loaded from: classes2.dex */
    public static class a extends b<a> {
        public a() {
            this.a.r = true;
        }

        @Override // com.facebook.shimmer.c.b
        /* renamed from: x */
        public a f() {
            return this;
        }
    }

    /* compiled from: Shimmer.java */
    /* loaded from: classes2.dex */
    public static abstract class b<T extends b<T>> {
        public final c a = new c();

        private static float b(float f, float f2, float f3) {
            return Math.min(f2, Math.max(f, f3));
        }

        public c a() {
            this.a.c();
            this.a.d();
            return this.a;
        }

        public T c(Context context, AttributeSet attributeSet) {
            return d(context.obtainStyledAttributes(attributeSet, b.c.a, 0, 0));
        }

        public T d(TypedArray typedArray) {
            int i = b.c.e;
            if (typedArray.hasValue(i)) {
                i(typedArray.getBoolean(i, this.a.p));
            }
            int i2 = b.c.b;
            if (typedArray.hasValue(i2)) {
                g(typedArray.getBoolean(i2, this.a.q));
            }
            int i3 = b.c.c;
            if (typedArray.hasValue(i3)) {
                h(typedArray.getFloat(i3, 0.3f));
            }
            int i4 = b.c.m;
            if (typedArray.hasValue(i4)) {
                p(typedArray.getFloat(i4, 1.0f));
            }
            int i5 = b.c.i;
            if (typedArray.hasValue(i5)) {
                l(typedArray.getInt(i5, (int) this.a.u));
            }
            int i6 = b.c.p;
            if (typedArray.hasValue(i6)) {
                r(typedArray.getInt(i6, this.a.s));
            }
            int i7 = b.c.q;
            if (typedArray.hasValue(i7)) {
                s(typedArray.getInt(i7, (int) this.a.v));
            }
            int i8 = b.c.r;
            if (typedArray.hasValue(i8)) {
                t(typedArray.getInt(i8, this.a.t));
            }
            int i9 = b.c.g;
            if (typedArray.hasValue(i9)) {
                int i10 = typedArray.getInt(i9, this.a.e);
                if (i10 == 1) {
                    j(1);
                } else if (i10 == 2) {
                    j(2);
                } else if (i10 != 3) {
                    j(0);
                } else {
                    j(3);
                }
            }
            int i11 = b.c.s;
            if (typedArray.hasValue(i11)) {
                if (typedArray.getInt(i11, this.a.h) != 1) {
                    u(0);
                } else {
                    u(1);
                }
            }
            int i12 = b.c.h;
            if (typedArray.hasValue(i12)) {
                k(typedArray.getFloat(i12, this.a.n));
            }
            int i13 = b.c.k;
            if (typedArray.hasValue(i13)) {
                n(typedArray.getDimensionPixelSize(i13, this.a.i));
            }
            int i14 = b.c.j;
            if (typedArray.hasValue(i14)) {
                m(typedArray.getDimensionPixelSize(i14, this.a.j));
            }
            int i15 = b.c.o;
            if (typedArray.hasValue(i15)) {
                q(typedArray.getFloat(i15, this.a.m));
            }
            int i16 = b.c.u;
            if (typedArray.hasValue(i16)) {
                w(typedArray.getFloat(i16, this.a.k));
            }
            int i17 = b.c.l;
            if (typedArray.hasValue(i17)) {
                o(typedArray.getFloat(i17, this.a.l));
            }
            int i18 = b.c.t;
            if (typedArray.hasValue(i18)) {
                v(typedArray.getFloat(i18, this.a.o));
            }
            return f();
        }

        public T e(c cVar) {
            j(cVar.e);
            u(cVar.h);
            n(cVar.i);
            m(cVar.j);
            w(cVar.k);
            o(cVar.l);
            q(cVar.m);
            k(cVar.n);
            v(cVar.o);
            i(cVar.p);
            g(cVar.q);
            r(cVar.s);
            t(cVar.t);
            s(cVar.v);
            l(cVar.u);
            c cVar2 = this.a;
            cVar2.g = cVar.g;
            cVar2.f = cVar.f;
            return f();
        }

        public abstract T f();

        public T g(boolean z) {
            this.a.q = z;
            return f();
        }

        public T h(@g1(from = 0.0d, to = 1.0d) float f) {
            c cVar = this.a;
            cVar.g = (((int) (b(0.0f, 1.0f, f) * 255.0f)) << 24) | (cVar.g & sr.s);
            return f();
        }

        public T i(boolean z) {
            this.a.p = z;
            return f();
        }

        public T j(int i) {
            this.a.e = i;
            return f();
        }

        public T k(float f) {
            if (f >= 0.0f) {
                this.a.n = f;
                return f();
            }
            throw new IllegalArgumentException("Given invalid dropoff value: " + f);
        }

        public T l(long j) {
            if (j >= 0) {
                this.a.u = j;
                return f();
            }
            throw new IllegalArgumentException(wo1.p("Given a negative duration: ", j));
        }

        public T m(@c2 int i) {
            if (i >= 0) {
                this.a.j = i;
                return f();
            }
            throw new IllegalArgumentException(wo1.l("Given invalid height: ", i));
        }

        public T n(@c2 int i) {
            if (i >= 0) {
                this.a.i = i;
                return f();
            }
            throw new IllegalArgumentException(wo1.l("Given invalid width: ", i));
        }

        public T o(float f) {
            if (f >= 0.0f) {
                this.a.l = f;
                return f();
            }
            throw new IllegalArgumentException("Given invalid height ratio: " + f);
        }

        public T p(@g1(from = 0.0d, to = 1.0d) float f) {
            c cVar = this.a;
            cVar.f = (((int) (b(0.0f, 1.0f, f) * 255.0f)) << 24) | (cVar.f & sr.s);
            return f();
        }

        public T q(float f) {
            if (f >= 0.0f) {
                this.a.m = f;
                return f();
            }
            throw new IllegalArgumentException("Given invalid intensity value: " + f);
        }

        public T r(int i) {
            this.a.s = i;
            return f();
        }

        public T s(long j) {
            if (j >= 0) {
                this.a.v = j;
                return f();
            }
            throw new IllegalArgumentException(wo1.p("Given a negative repeat delay: ", j));
        }

        public T t(int i) {
            this.a.t = i;
            return f();
        }

        public T u(int i) {
            this.a.h = i;
            return f();
        }

        public T v(float f) {
            this.a.o = f;
            return f();
        }

        public T w(float f) {
            if (f >= 0.0f) {
                this.a.k = f;
                return f();
            }
            throw new IllegalArgumentException("Given invalid width ratio: " + f);
        }
    }

    /* compiled from: Shimmer.java */
    /* renamed from: com.facebook.shimmer.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0101c extends b<C0101c> {
        public C0101c() {
            this.a.r = false;
        }

        public C0101c A(@w0 int i) {
            this.a.f = i;
            return f();
        }

        @Override // com.facebook.shimmer.c.b
        /* renamed from: x */
        public C0101c d(TypedArray typedArray) {
            super.d(typedArray);
            int i = b.c.d;
            if (typedArray.hasValue(i)) {
                z(typedArray.getColor(i, this.a.g));
            }
            int i2 = b.c.n;
            if (typedArray.hasValue(i2)) {
                A(typedArray.getColor(i2, this.a.f));
            }
            return f();
        }

        @Override // com.facebook.shimmer.c.b
        /* renamed from: y */
        public C0101c f() {
            return this;
        }

        public C0101c z(@w0 int i) {
            c cVar = this.a;
            cVar.g = (i & sr.s) | (cVar.g & sr.t);
            return f();
        }
    }

    /* compiled from: Shimmer.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface d {
        public static final int R = 0;
        public static final int S = 1;
        public static final int T = 2;
        public static final int U = 3;
    }

    /* compiled from: Shimmer.java */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface e {
        public static final int V = 0;
        public static final int W = 1;
    }

    public int a(int i) {
        int i2 = this.j;
        return i2 > 0 ? i2 : Math.round(this.l * i);
    }

    public void b(int i, int i2) {
        int round;
        double max = Math.max(i, i2);
        float f = -(Math.round(((float) ((max / Math.sin(1.5707963267948966d - Math.toRadians(this.o % 90.0f))) - max)) / 2.0f) * 3);
        this.d.set(f, f, e(i) + round, a(i2) + round);
    }

    public void c() {
        if (this.h != 1) {
            int[] iArr = this.c;
            int i = this.g;
            iArr[0] = i;
            int i2 = this.f;
            iArr[1] = i2;
            iArr[2] = i2;
            iArr[3] = i;
            return;
        }
        int[] iArr2 = this.c;
        int i3 = this.f;
        iArr2[0] = i3;
        iArr2[1] = i3;
        int i4 = this.g;
        iArr2[2] = i4;
        iArr2[3] = i4;
    }

    public void d() {
        if (this.h != 1) {
            this.b[0] = Math.max(((1.0f - this.m) - this.n) / 2.0f, 0.0f);
            this.b[1] = Math.max(((1.0f - this.m) - 0.001f) / 2.0f, 0.0f);
            this.b[2] = Math.min(((this.m + 1.0f) + 0.001f) / 2.0f, 1.0f);
            this.b[3] = Math.min(((this.m + 1.0f) + this.n) / 2.0f, 1.0f);
            return;
        }
        float[] fArr = this.b;
        fArr[0] = 0.0f;
        fArr[1] = Math.min(this.m, 1.0f);
        this.b[2] = Math.min(this.m + this.n, 1.0f);
        this.b[3] = 1.0f;
    }

    public int e(int i) {
        int i2 = this.i;
        return i2 > 0 ? i2 : Math.round(this.k * i);
    }
}