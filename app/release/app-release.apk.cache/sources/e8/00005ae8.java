package com.p7700g.p99005;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.p7700g.p99005.ry1;
import java.util.Map;

/* compiled from: BaseRequestOptions.java */
/* loaded from: classes2.dex */
public abstract class ry1<T extends ry1<T>> implements Cloneable {
    private static final int A = 256;
    private static final int B = 512;
    private static final int C = 1024;
    private static final int D = 2048;
    private static final int E = 4096;
    private static final int F = 8192;
    private static final int G = 16384;
    private static final int H = 32768;
    private static final int I = 65536;
    private static final int J = 131072;
    private static final int K = 262144;
    private static final int L = 524288;
    private static final int M = 1048576;
    private static final int s = -1;
    private static final int t = 2;
    private static final int u = 4;
    private static final int v = 8;
    private static final int w = 16;
    private static final int x = 32;
    private static final int y = 64;
    private static final int z = 128;
    private boolean A0;
    @z1
    private Resources.Theme B0;
    private boolean C0;
    private boolean D0;
    private boolean E0;
    private boolean G0;
    private int N;
    @z1
    private Drawable R;
    private int S;
    @z1
    private Drawable T;
    private int U;
    private boolean Z;
    @z1
    private Drawable v0;
    private int w0;
    private float O = 1.0f;
    @x1
    private qr1 P = qr1.e;
    @x1
    private fp1 Q = fp1.NORMAL;
    private boolean V = true;
    private int W = -1;
    private int X = -1;
    @x1
    private gq1 Y = i02.c();
    private boolean u0 = true;
    @x1
    private jq1 x0 = new jq1();
    @x1
    private Map<Class<?>, nq1<?>> y0 = new m02();
    @x1
    private Class<?> z0 = Object.class;
    private boolean F0 = true;

    @x1
    private T G0(@x1 nv1 nv1Var, @x1 nq1<Bitmap> nq1Var) {
        return Q0(nv1Var, nq1Var, false);
    }

    @x1
    private T P0(@x1 nv1 nv1Var, @x1 nq1<Bitmap> nq1Var) {
        return Q0(nv1Var, nq1Var, true);
    }

    @x1
    private T Q0(@x1 nv1 nv1Var, @x1 nq1<Bitmap> nq1Var, boolean z2) {
        T I0;
        if (z2) {
            I0 = e1(nv1Var, nq1Var);
        } else {
            I0 = I0(nv1Var, nq1Var);
        }
        I0.F0 = true;
        return I0;
    }

    private T R0() {
        return this;
    }

    private boolean r0(int i) {
        return s0(this.N, i);
    }

    private static boolean s0(int i, int i2) {
        return (i & i2) != 0;
    }

    @x1
    @u0
    public T A() {
        return T0(ov1.f, Boolean.FALSE);
    }

    @x1
    public T A0() {
        this.A0 = true;
        return R0();
    }

    @x1
    @u0
    public T B(@x1 qr1 qr1Var) {
        if (this.C0) {
            return (T) clone().B(qr1Var);
        }
        this.P = (qr1) x02.d(qr1Var);
        this.N |= 4;
        return S0();
    }

    @x1
    @u0
    public T B0(boolean z2) {
        if (this.C0) {
            return (T) clone().B0(z2);
        }
        this.E0 = z2;
        this.N |= 524288;
        return S0();
    }

    @x1
    @u0
    public T C() {
        return T0(bx1.b, Boolean.TRUE);
    }

    @x1
    @u0
    public T C0() {
        return I0(nv1.e, new jv1());
    }

    @x1
    @u0
    public T D() {
        if (this.C0) {
            return (T) clone().D();
        }
        this.y0.clear();
        int i = this.N & (-2049);
        this.N = i;
        this.Z = false;
        int i2 = i & (-131073);
        this.N = i2;
        this.u0 = false;
        this.N = i2 | 65536;
        this.F0 = true;
        return S0();
    }

    @x1
    @u0
    public T D0() {
        return G0(nv1.d, new kv1());
    }

    @x1
    @u0
    public T E(@x1 nv1 nv1Var) {
        return T0(nv1.h, x02.d(nv1Var));
    }

    @x1
    @u0
    public T E0() {
        return I0(nv1.e, new lv1());
    }

    @x1
    @u0
    public T F0() {
        return G0(nv1.c, new sv1());
    }

    @x1
    @u0
    public T G(@x1 Bitmap.CompressFormat compressFormat) {
        return T0(cv1.b, x02.d(compressFormat));
    }

    @x1
    @u0
    public T H(@p1(from = 0, to = 100) int i) {
        return T0(cv1.a, Integer.valueOf(i));
    }

    @x1
    @u0
    public T H0(@x1 nq1<Bitmap> nq1Var) {
        return b1(nq1Var, false);
    }

    @x1
    @u0
    public T I(@f1 int i) {
        if (this.C0) {
            return (T) clone().I(i);
        }
        this.S = i;
        int i2 = this.N | 32;
        this.N = i2;
        this.R = null;
        this.N = i2 & (-17);
        return S0();
    }

    @x1
    public final T I0(@x1 nv1 nv1Var, @x1 nq1<Bitmap> nq1Var) {
        if (this.C0) {
            return (T) clone().I0(nv1Var, nq1Var);
        }
        E(nv1Var);
        return b1(nq1Var, false);
    }

    @x1
    @u0
    public T J(@z1 Drawable drawable) {
        if (this.C0) {
            return (T) clone().J(drawable);
        }
        this.R = drawable;
        int i = this.N | 16;
        this.N = i;
        this.S = 0;
        this.N = i & (-33);
        return S0();
    }

    @x1
    @u0
    public <Y> T J0(@x1 Class<Y> cls, @x1 nq1<Y> nq1Var) {
        return g1(cls, nq1Var, false);
    }

    @x1
    @u0
    public T K0(int i) {
        return L0(i, i);
    }

    @x1
    @u0
    public T L(@f1 int i) {
        if (this.C0) {
            return (T) clone().L(i);
        }
        this.w0 = i;
        int i2 = this.N | 16384;
        this.N = i2;
        this.v0 = null;
        this.N = i2 & (-8193);
        return S0();
    }

    @x1
    @u0
    public T L0(int i, int i2) {
        if (this.C0) {
            return (T) clone().L0(i, i2);
        }
        this.X = i;
        this.W = i2;
        this.N |= 512;
        return S0();
    }

    @x1
    @u0
    public T M(@z1 Drawable drawable) {
        if (this.C0) {
            return (T) clone().M(drawable);
        }
        this.v0 = drawable;
        int i = this.N | 8192;
        this.N = i;
        this.w0 = 0;
        this.N = i & (-16385);
        return S0();
    }

    @x1
    @u0
    public T M0(@f1 int i) {
        if (this.C0) {
            return (T) clone().M0(i);
        }
        this.U = i;
        int i2 = this.N | 128;
        this.N = i2;
        this.T = null;
        this.N = i2 & (-65);
        return S0();
    }

    @x1
    @u0
    public T N() {
        return P0(nv1.c, new sv1());
    }

    @x1
    @u0
    public T N0(@z1 Drawable drawable) {
        if (this.C0) {
            return (T) clone().N0(drawable);
        }
        this.T = drawable;
        int i = this.N | 64;
        this.N = i;
        this.U = 0;
        this.N = i & (-129);
        return S0();
    }

    @x1
    @u0
    public T O(@x1 bq1 bq1Var) {
        x02.d(bq1Var);
        return (T) T0(ov1.b, bq1Var).T0(bx1.a, bq1Var);
    }

    @x1
    @u0
    public T O0(@x1 fp1 fp1Var) {
        if (this.C0) {
            return (T) clone().O0(fp1Var);
        }
        this.Q = (fp1) x02.d(fp1Var);
        this.N |= 8;
        return S0();
    }

    @x1
    @u0
    public T P(@p1(from = 0) long j) {
        return T0(hw1.d, Long.valueOf(j));
    }

    @x1
    public final qr1 Q() {
        return this.P;
    }

    public final int R() {
        return this.S;
    }

    @z1
    public final Drawable S() {
        return this.R;
    }

    @x1
    public final T S0() {
        if (!this.A0) {
            return R0();
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    @z1
    public final Drawable T() {
        return this.v0;
    }

    @x1
    @u0
    public <Y> T T0(@x1 iq1<Y> iq1Var, @x1 Y y2) {
        if (this.C0) {
            return (T) clone().T0(iq1Var, y2);
        }
        x02.d(iq1Var);
        x02.d(y2);
        this.x0.e(iq1Var, y2);
        return S0();
    }

    public final int U() {
        return this.w0;
    }

    @x1
    @u0
    public T U0(@x1 gq1 gq1Var) {
        if (this.C0) {
            return (T) clone().U0(gq1Var);
        }
        this.Y = (gq1) x02.d(gq1Var);
        this.N |= 1024;
        return S0();
    }

    public final boolean V() {
        return this.E0;
    }

    @x1
    @u0
    public T V0(@g1(from = 0.0d, to = 1.0d) float f) {
        if (this.C0) {
            return (T) clone().V0(f);
        }
        if (f >= 0.0f && f <= 1.0f) {
            this.O = f;
            this.N |= 2;
            return S0();
        }
        throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
    }

    @x1
    @u0
    public T W0(boolean z2) {
        if (this.C0) {
            return (T) clone().W0(true);
        }
        this.V = !z2;
        this.N |= 256;
        return S0();
    }

    @x1
    public final jq1 X() {
        return this.x0;
    }

    @x1
    @u0
    public T Y0(@z1 Resources.Theme theme) {
        if (this.C0) {
            return (T) clone().Y0(theme);
        }
        this.B0 = theme;
        this.N |= 32768;
        return S0();
    }

    public final int Z() {
        return this.W;
    }

    @x1
    @u0
    public T Z0(@p1(from = 0) int i) {
        return T0(pu1.a, Integer.valueOf(i));
    }

    public final int a0() {
        return this.X;
    }

    @x1
    @u0
    public T a1(@x1 nq1<Bitmap> nq1Var) {
        return b1(nq1Var, true);
    }

    @x1
    @u0
    public T b(@x1 ry1<?> ry1Var) {
        if (this.C0) {
            return (T) clone().b(ry1Var);
        }
        if (s0(ry1Var.N, 2)) {
            this.O = ry1Var.O;
        }
        if (s0(ry1Var.N, 262144)) {
            this.D0 = ry1Var.D0;
        }
        if (s0(ry1Var.N, 1048576)) {
            this.G0 = ry1Var.G0;
        }
        if (s0(ry1Var.N, 4)) {
            this.P = ry1Var.P;
        }
        if (s0(ry1Var.N, 8)) {
            this.Q = ry1Var.Q;
        }
        if (s0(ry1Var.N, 16)) {
            this.R = ry1Var.R;
            this.S = 0;
            this.N &= -33;
        }
        if (s0(ry1Var.N, 32)) {
            this.S = ry1Var.S;
            this.R = null;
            this.N &= -17;
        }
        if (s0(ry1Var.N, 64)) {
            this.T = ry1Var.T;
            this.U = 0;
            this.N &= -129;
        }
        if (s0(ry1Var.N, 128)) {
            this.U = ry1Var.U;
            this.T = null;
            this.N &= -65;
        }
        if (s0(ry1Var.N, 256)) {
            this.V = ry1Var.V;
        }
        if (s0(ry1Var.N, 512)) {
            this.X = ry1Var.X;
            this.W = ry1Var.W;
        }
        if (s0(ry1Var.N, 1024)) {
            this.Y = ry1Var.Y;
        }
        if (s0(ry1Var.N, 4096)) {
            this.z0 = ry1Var.z0;
        }
        if (s0(ry1Var.N, 8192)) {
            this.v0 = ry1Var.v0;
            this.w0 = 0;
            this.N &= -16385;
        }
        if (s0(ry1Var.N, 16384)) {
            this.w0 = ry1Var.w0;
            this.v0 = null;
            this.N &= -8193;
        }
        if (s0(ry1Var.N, 32768)) {
            this.B0 = ry1Var.B0;
        }
        if (s0(ry1Var.N, 65536)) {
            this.u0 = ry1Var.u0;
        }
        if (s0(ry1Var.N, 131072)) {
            this.Z = ry1Var.Z;
        }
        if (s0(ry1Var.N, 2048)) {
            this.y0.putAll(ry1Var.y0);
            this.F0 = ry1Var.F0;
        }
        if (s0(ry1Var.N, 524288)) {
            this.E0 = ry1Var.E0;
        }
        if (!this.u0) {
            this.y0.clear();
            int i = this.N & (-2049);
            this.N = i;
            this.Z = false;
            this.N = i & (-131073);
            this.F0 = true;
        }
        this.N |= ry1Var.N;
        this.x0.d(ry1Var.x0);
        return S0();
    }

    @z1
    public final Drawable b0() {
        return this.T;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @x1
    public T b1(@x1 nq1<Bitmap> nq1Var, boolean z2) {
        if (this.C0) {
            return (T) clone().b1(nq1Var, z2);
        }
        qv1 qv1Var = new qv1(nq1Var, z2);
        g1(Bitmap.class, nq1Var, z2);
        g1(Drawable.class, qv1Var, z2);
        g1(BitmapDrawable.class, qv1Var.c(), z2);
        g1(vw1.class, new yw1(nq1Var), z2);
        return S0();
    }

    @x1
    public T c() {
        if (this.A0 && !this.C0) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.C0 = true;
        return A0();
    }

    public final int c0() {
        return this.U;
    }

    @x1
    public final fp1 d0() {
        return this.Q;
    }

    @x1
    public final Class<?> e0() {
        return this.z0;
    }

    @x1
    @u0
    public final T e1(@x1 nv1 nv1Var, @x1 nq1<Bitmap> nq1Var) {
        if (this.C0) {
            return (T) clone().e1(nv1Var, nq1Var);
        }
        E(nv1Var);
        return a1(nq1Var);
    }

    public boolean equals(Object obj) {
        if (obj instanceof ry1) {
            ry1 ry1Var = (ry1) obj;
            return Float.compare(ry1Var.O, this.O) == 0 && this.S == ry1Var.S && z02.d(this.R, ry1Var.R) && this.U == ry1Var.U && z02.d(this.T, ry1Var.T) && this.w0 == ry1Var.w0 && z02.d(this.v0, ry1Var.v0) && this.V == ry1Var.V && this.W == ry1Var.W && this.X == ry1Var.X && this.Z == ry1Var.Z && this.u0 == ry1Var.u0 && this.D0 == ry1Var.D0 && this.E0 == ry1Var.E0 && this.P.equals(ry1Var.P) && this.Q == ry1Var.Q && this.x0.equals(ry1Var.x0) && this.y0.equals(ry1Var.y0) && this.z0.equals(ry1Var.z0) && z02.d(this.Y, ry1Var.Y) && z02.d(this.B0, ry1Var.B0);
        }
        return false;
    }

    @x1
    public final gq1 f0() {
        return this.Y;
    }

    @x1
    @u0
    public <Y> T f1(@x1 Class<Y> cls, @x1 nq1<Y> nq1Var) {
        return g1(cls, nq1Var, true);
    }

    public final float g0() {
        return this.O;
    }

    @x1
    public <Y> T g1(@x1 Class<Y> cls, @x1 nq1<Y> nq1Var, boolean z2) {
        if (this.C0) {
            return (T) clone().g1(cls, nq1Var, z2);
        }
        x02.d(cls);
        x02.d(nq1Var);
        this.y0.put(cls, nq1Var);
        int i = this.N | 2048;
        this.N = i;
        this.u0 = true;
        int i2 = i | 65536;
        this.N = i2;
        this.F0 = false;
        if (z2) {
            this.N = i2 | 131072;
            this.Z = true;
        }
        return S0();
    }

    @z1
    public final Resources.Theme h0() {
        return this.B0;
    }

    @x1
    @u0
    public T h1(@x1 nq1<Bitmap>... nq1VarArr) {
        if (nq1VarArr.length > 1) {
            return b1(new hq1(nq1VarArr), true);
        }
        if (nq1VarArr.length == 1) {
            return a1(nq1VarArr[0]);
        }
        return S0();
    }

    public int hashCode() {
        return z02.q(this.B0, z02.q(this.Y, z02.q(this.z0, z02.q(this.y0, z02.q(this.x0, z02.q(this.Q, z02.q(this.P, z02.s(this.E0, z02.s(this.D0, z02.s(this.u0, z02.s(this.Z, z02.p(this.X, z02.p(this.W, z02.s(this.V, z02.q(this.v0, z02.p(this.w0, z02.q(this.T, z02.p(this.U, z02.q(this.R, z02.p(this.S, z02.m(this.O)))))))))))))))))))));
    }

    @x1
    public final Map<Class<?>, nq1<?>> i0() {
        return this.y0;
    }

    @x1
    @u0
    @Deprecated
    public T i1(@x1 nq1<Bitmap>... nq1VarArr) {
        return b1(new hq1(nq1VarArr), true);
    }

    public final boolean j0() {
        return this.G0;
    }

    @x1
    @u0
    public T j1(boolean z2) {
        if (this.C0) {
            return (T) clone().j1(z2);
        }
        this.G0 = z2;
        this.N |= 1048576;
        return S0();
    }

    public final boolean k0() {
        return this.D0;
    }

    @x1
    @u0
    public T k1(boolean z2) {
        if (this.C0) {
            return (T) clone().k1(z2);
        }
        this.D0 = z2;
        this.N |= 262144;
        return S0();
    }

    public final boolean l0() {
        return this.C0;
    }

    public final boolean m0() {
        return r0(4);
    }

    public final boolean n0() {
        return this.A0;
    }

    public final boolean o0() {
        return this.V;
    }

    @x1
    @u0
    public T p() {
        return e1(nv1.e, new jv1());
    }

    public final boolean p0() {
        return r0(8);
    }

    public boolean q0() {
        return this.F0;
    }

    @x1
    @u0
    public T t() {
        return P0(nv1.d, new kv1());
    }

    public final boolean t0() {
        return r0(256);
    }

    @x1
    @u0
    public T u() {
        return e1(nv1.d, new lv1());
    }

    public final boolean u0() {
        return this.u0;
    }

    public final boolean v0() {
        return this.Z;
    }

    @Override // 
    @u0
    /* renamed from: x */
    public T clone() {
        try {
            T t2 = (T) super.clone();
            jq1 jq1Var = new jq1();
            t2.x0 = jq1Var;
            jq1Var.d(this.x0);
            m02 m02Var = new m02();
            t2.y0 = m02Var;
            m02Var.putAll(this.y0);
            t2.A0 = false;
            t2.C0 = false;
            return t2;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @x1
    @u0
    public T y(@x1 Class<?> cls) {
        if (this.C0) {
            return (T) clone().y(cls);
        }
        this.z0 = (Class) x02.d(cls);
        this.N |= 4096;
        return S0();
    }

    public final boolean y0() {
        return r0(2048);
    }

    public final boolean z0() {
        return z02.w(this.X, this.W);
    }
}