package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import java.util.Set;

/* compiled from: MotionWidget.java */
/* loaded from: classes.dex */
public class t8 implements aa {
    public static final int A = Integer.MIN_VALUE;
    public static final int B = 1;
    public static final int h = 0;
    public static final int i = 1;
    private static final int j = -1;
    private static final int k = -2;
    public static final int l = 0;
    public static final int m = 4;
    private static final int n = -3;
    private static final int o = -4;
    public static final int p = 0;
    public static final int q = 1;
    public static final int r = 2;
    public static final int s = 3;
    public static final int t = 4;
    public static final int u = -1;
    public static final int v = 0;
    public static final int w = 0;
    public static final int x = -1;
    public static final int y = -1;
    public static final int z = -2;
    public mb C;
    public a D;
    public b E;
    private float F;
    public float G;

    /* compiled from: MotionWidget.java */
    /* loaded from: classes.dex */
    public static class a {
        private static final int a = -2;
        private static final int b = -1;
        private static final int c = -3;
        public int d = -1;
        public int e = 0;
        public String f = null;
        public int g = -1;
        public int h = 0;
        public float i = Float.NaN;
        public int j = -1;
        public float k = Float.NaN;
        public float l = Float.NaN;
        public int m = -1;
        public String n = null;
        public int o = -3;
        public int p = -1;
    }

    /* compiled from: MotionWidget.java */
    /* loaded from: classes.dex */
    public static class b {
        public int a = 4;
        public int b = 0;
        public float c = 1.0f;
        public float d = Float.NaN;
    }

    public t8() {
        this.C = new mb();
        this.D = new a();
        this.E = new b();
    }

    public float A(int i2) {
        switch (i2) {
            case 303:
                return this.C.r;
            case 304:
                return this.C.m;
            case 305:
                return this.C.n;
            case 306:
                return this.C.o;
            case 307:
            default:
                return Float.NaN;
            case 308:
                return this.C.j;
            case 309:
                return this.C.k;
            case 310:
                return this.C.l;
            case 311:
                return this.C.p;
            case 312:
                return this.C.q;
            case 313:
                return this.C.h;
            case 314:
                return this.C.i;
            case 315:
                return this.F;
            case aa.a.q /* 316 */:
                return this.G;
        }
    }

    public int B() {
        return this.E.a;
    }

    public mb C() {
        return this.C;
    }

    public int D() {
        mb mbVar = this.C;
        return mbVar.f - mbVar.d;
    }

    public int E() {
        return this.C.d;
    }

    public int F() {
        return this.C.e;
    }

    public void G(int i2, int i3, int i4, int i5) {
        H(i2, i3, i4, i5);
    }

    public void H(int i2, int i3, int i4, int i5) {
        if (this.C == null) {
            this.C = new mb((zb) null);
        }
        mb mbVar = this.C;
        mbVar.e = i3;
        mbVar.d = i2;
        mbVar.f = i4;
        mbVar.g = i5;
    }

    public void I(String str, int i2, float f) {
        this.C.v(str, i2, f);
    }

    public void J(String str, int i2, int i3) {
        this.C.w(str, i2, i3);
    }

    public void K(String str, int i2, String str2) {
        this.C.x(str, i2, str2);
    }

    public void L(String str, int i2, boolean z2) {
        this.C.y(str, i2, z2);
    }

    public void M(o8 o8Var, float[] fArr) {
        this.C.v(o8Var.c, aa.b.k, fArr[0]);
    }

    public void N(float f) {
        this.C.h = f;
    }

    public void O(float f) {
        this.C.i = f;
    }

    public void P(float f) {
        this.C.j = f;
    }

    public void Q(float f) {
        this.C.k = f;
    }

    public void R(float f) {
        this.C.l = f;
    }

    public void S(float f) {
        this.C.p = f;
    }

    public void T(float f) {
        this.C.q = f;
    }

    public void U(float f) {
        this.C.m = f;
    }

    public void V(float f) {
        this.C.n = f;
    }

    public void W(float f) {
        this.C.o = f;
    }

    public boolean X(int i2, float f) {
        switch (i2) {
            case 303:
                this.C.r = f;
                return true;
            case 304:
                this.C.m = f;
                return true;
            case 305:
                this.C.n = f;
                return true;
            case 306:
                this.C.o = f;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.C.j = f;
                return true;
            case 309:
                this.C.k = f;
                return true;
            case 310:
                this.C.l = f;
                return true;
            case 311:
                this.C.p = f;
                return true;
            case 312:
                this.C.q = f;
                return true;
            case 313:
                this.C.h = f;
                return true;
            case 314:
                this.C.i = f;
                return true;
            case 315:
                this.F = f;
                return true;
            case aa.a.q /* 316 */:
                this.G = f;
                return true;
        }
    }

    public boolean Y(int i2, float f) {
        switch (i2) {
            case 600:
                this.D.i = f;
                return true;
            case 601:
                this.D.k = f;
                return true;
            case 602:
                this.D.l = f;
                return true;
            default:
                return false;
        }
    }

    public boolean Z(int i2, int i3) {
        switch (i2) {
            case 605:
                this.D.d = i3;
                return true;
            case 606:
                this.D.e = i3;
                return true;
            case 607:
                this.D.g = i3;
                return true;
            case 608:
                this.D.h = i3;
                return true;
            case 609:
                this.D.j = i3;
                return true;
            case 610:
                this.D.m = i3;
                return true;
            case 611:
                this.D.o = i3;
                return true;
            case 612:
                this.D.p = i3;
                return true;
            default:
                return false;
        }
    }

    @Override // com.p7700g.p99005.aa
    public boolean a(int i2, int i3) {
        return X(i2, i3);
    }

    public boolean a0(int i2, String str) {
        if (i2 == 603) {
            this.D.f = str;
            return true;
        } else if (i2 != 604) {
            return false;
        } else {
            this.D.n = str;
            return true;
        }
    }

    @Override // com.p7700g.p99005.aa
    public boolean b(int i2, float f) {
        if (X(i2, f)) {
            return true;
        }
        return Y(i2, f);
    }

    public void b0(int i2) {
        this.E.a = i2;
    }

    @Override // com.p7700g.p99005.aa
    public boolean c(int i2, String str) {
        return a0(i2, str);
    }

    @Override // com.p7700g.p99005.aa
    public boolean d(int i2, boolean z2) {
        return false;
    }

    @Override // com.p7700g.p99005.aa
    public int e(String str) {
        int a2 = z9.a(str);
        return a2 != -1 ? a2 : ea.a(str);
    }

    public t8 f(int i2) {
        return null;
    }

    public float g() {
        return this.E.c;
    }

    public int h() {
        return this.C.g;
    }

    public p8 i(String str) {
        return this.C.g(str);
    }

    public Set<String> j() {
        return this.C.h();
    }

    public int k() {
        mb mbVar = this.C;
        return mbVar.g - mbVar.e;
    }

    public int l() {
        return this.C.d;
    }

    public String m() {
        return this.C.k();
    }

    public t8 n() {
        return null;
    }

    public float o() {
        return this.C.h;
    }

    public float p() {
        return this.C.i;
    }

    public int q() {
        return this.C.f;
    }

    public float r() {
        return this.C.j;
    }

    public float s() {
        return this.C.k;
    }

    public float t() {
        return this.C.l;
    }

    public String toString() {
        return this.C.d + ", " + this.C.e + ", " + this.C.f + ", " + this.C.g;
    }

    public float u() {
        return this.C.p;
    }

    public float v() {
        return this.C.q;
    }

    public int w() {
        return this.C.e;
    }

    public float x() {
        return this.C.m;
    }

    public float y() {
        return this.C.n;
    }

    public float z() {
        return this.C.o;
    }

    public t8(mb mbVar) {
        this.C = new mb();
        this.D = new a();
        this.E = new b();
        this.C = mbVar;
    }
}