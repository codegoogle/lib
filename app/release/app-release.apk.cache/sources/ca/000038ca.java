package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.gms.ads.AdError;
import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.aa;
import com.p7700g.p99005.bf;
import com.p7700g.p99005.ff;
import com.p7700g.p99005.we;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet.java */
/* loaded from: classes.dex */
public class af {
    public static final int A = 2;
    private static final int A0 = 36;
    private static final int A1 = 88;
    public static final int B = 3;
    private static final int B0 = 37;
    private static final int B1 = 89;
    public static final int C = 4;
    private static final int C0 = 38;
    private static final int C1 = 90;
    public static final int D = 5;
    private static final int D0 = 39;
    private static final int D1 = 91;
    public static final int E = 6;
    private static final int E0 = 40;
    private static final int E1 = 92;
    public static final int F = 7;
    private static final int F0 = 41;
    private static final int F1 = 93;
    public static final int G = 8;
    private static final int G0 = 42;
    private static final int G1 = 94;
    public static final int H = 0;
    private static final int H0 = 43;
    private static final int H1 = 95;
    public static final int I = 1;
    private static final int I0 = 44;
    private static final int I1 = 96;
    public static final int J = 0;
    private static final int J0 = 45;
    private static final int J1 = 97;
    public static final int K = 1;
    private static final int K0 = 46;
    private static final int K1 = 98;
    public static final int L = 2;
    private static final int L0 = 47;
    private static final int L1 = 99;
    private static final boolean M = false;
    private static final int M0 = 48;
    private static final String M1 = "weight";
    private static final int N0 = 49;
    private static final String N1 = "ratio";
    private static final int O = 1;
    private static final int O0 = 50;
    private static final String O1 = "parent";
    private static final int P0 = 51;
    private static final int Q0 = 52;
    private static final int R = 1;
    private static final int R0 = 53;
    private static final int S = 2;
    private static final int S0 = 54;
    private static final int T = 3;
    private static final int T0 = 55;
    private static final int U = 4;
    private static final int U0 = 56;
    private static final int V = 5;
    private static final int V0 = 57;
    private static final int W = 6;
    private static final int W0 = 58;
    private static final int X = 7;
    private static final int X0 = 59;
    private static final int Y = 8;
    private static final int Y0 = 60;
    private static final int Z = 9;
    private static final int Z0 = 61;
    private static final String a = "ConstraintSet";
    private static final int a0 = 10;
    private static final int a1 = 62;
    private static final String b = "XML parser error must be within a Constraint ";
    private static final int b0 = 11;
    private static final int b1 = 63;
    private static final int c = -1;
    private static final int c0 = 12;
    private static final int c1 = 64;
    private static final int d = -2;
    private static final int d0 = 13;
    private static final int d1 = 65;
    private static final int e = -3;
    private static final int e0 = 14;
    private static final int e1 = 66;
    private static final int f = -4;
    private static final int f0 = 15;
    private static final int f1 = 67;
    public static final int g = 0;
    private static final int g0 = 16;
    private static final int g1 = 68;
    public static final int h = 1;
    private static final int h0 = 17;
    private static final int h1 = 69;
    public static final int i = 2;
    private static final int i0 = 18;
    private static final int i1 = 70;
    public static final int j = 3;
    private static final int j0 = 19;
    private static final int j1 = 71;
    public static final int k = 4;
    private static final int k0 = 20;
    private static final int k1 = 72;
    public static final int l = -1;
    private static final int l0 = 21;
    private static final int l1 = 73;
    public static final int m = 0;
    private static final int m0 = 22;
    private static final int m1 = 74;
    public static final int n = -2;
    private static final int n0 = 23;
    private static final int n1 = 75;
    public static final int o = 1;
    private static final int o0 = 24;
    private static final int o1 = 76;
    public static final int p = 0;
    private static final int p0 = 25;
    private static final int p1 = 77;
    public static final int q = 2;
    private static final int q0 = 26;
    private static final int q1 = 78;
    public static final int r = 0;
    private static final int r0 = 27;
    private static final int r1 = 79;
    public static final int s = 0;
    private static final int s0 = 28;
    private static final int s1 = 80;
    public static final int t = 1;
    private static final int t0 = 29;
    private static final int t1 = 81;
    public static final int u = 0;
    private static final int u0 = 30;
    private static final int u1 = 82;
    public static final int v = 1;
    private static final int v0 = 31;
    private static final int v1 = 83;
    public static final int w = 0;
    private static final int w0 = 32;
    private static final int w1 = 84;
    public static final int x = 4;
    private static final int x0 = 33;
    private static final int x1 = 85;
    public static final int y = 8;
    private static final int y0 = 34;
    private static final int y1 = 86;
    public static final int z = 1;
    private static final int z0 = 35;
    private static final int z1 = 87;
    private boolean P1;
    public String Q1;
    public String R1 = "";
    public int S1 = 0;
    private HashMap<String, we> T1 = new HashMap<>();
    private boolean U1 = true;
    private HashMap<Integer, a> V1 = new HashMap<>();
    private static final int[] N = {0, 4, 8};
    private static SparseIntArray P = new SparseIntArray();
    private static SparseIntArray Q = new SparseIntArray();

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public String b;
        public final d c = new d();
        public final c d = new c();
        public final b e = new b();
        public final e f = new e();
        public HashMap<String, we> g = new HashMap<>();
        public C0144a h;

        /* compiled from: ConstraintSet.java */
        /* renamed from: com.p7700g.p99005.af$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0144a {
            private static final int a = 4;
            private static final int b = 10;
            private static final int c = 10;
            private static final int d = 5;
            public int[] e = new int[10];
            public int[] f = new int[10];
            public int g = 0;
            public int[] h = new int[10];
            public float[] i = new float[10];
            public int j = 0;
            public int[] k = new int[5];
            public String[] l = new String[5];
            public int m = 0;
            public int[] n = new int[4];
            public boolean[] o = new boolean[4];
            public int p = 0;

            public void a(int type, float value) {
                int i = this.j;
                int[] iArr = this.h;
                if (i >= iArr.length) {
                    this.h = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.i;
                    this.i = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.h;
                int i2 = this.j;
                iArr2[i2] = type;
                float[] fArr2 = this.i;
                this.j = i2 + 1;
                fArr2[i2] = value;
            }

            public void b(int type, int value) {
                int i = this.g;
                int[] iArr = this.e;
                if (i >= iArr.length) {
                    this.e = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f;
                    this.f = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.e;
                int i2 = this.g;
                iArr3[i2] = type;
                int[] iArr4 = this.f;
                this.g = i2 + 1;
                iArr4[i2] = value;
            }

            public void c(int type, String value) {
                int i = this.m;
                int[] iArr = this.k;
                if (i >= iArr.length) {
                    this.k = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.l;
                    this.l = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.k;
                int i2 = this.m;
                iArr2[i2] = type;
                String[] strArr2 = this.l;
                this.m = i2 + 1;
                strArr2[i2] = value;
            }

            public void d(int type, boolean value) {
                int i = this.p;
                int[] iArr = this.n;
                if (i >= iArr.length) {
                    this.n = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.o;
                    this.o = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.n;
                int i2 = this.p;
                iArr2[i2] = type;
                boolean[] zArr2 = this.o;
                this.p = i2 + 1;
                zArr2[i2] = value;
            }

            public void e(a c2) {
                for (int i = 0; i < this.g; i++) {
                    af.S0(c2, this.e[i], this.f[i]);
                }
                for (int i2 = 0; i2 < this.j; i2++) {
                    af.R0(c2, this.h[i2], this.i[i2]);
                }
                for (int i3 = 0; i3 < this.m; i3++) {
                    af.T0(c2, this.k[i3], this.l[i3]);
                }
                for (int i4 = 0; i4 < this.p; i4++) {
                    af.U0(c2, this.n[i4], this.o[i4]);
                }
            }

            @SuppressLint({"LogConditional"})
            public void f(String tag) {
                for (int i = 0; i < this.g; i++) {
                    int i2 = this.e[i];
                    int i3 = this.f[i];
                }
                for (int i4 = 0; i4 < this.j; i4++) {
                    int i5 = this.h[i4];
                    float f = this.i[i4];
                }
                for (int i6 = 0; i6 < this.m; i6++) {
                    int i7 = this.k[i6];
                    String str = this.l[i6];
                }
                for (int i8 = 0; i8 < this.p; i8++) {
                    int i9 = this.n[i8];
                    boolean z = this.o[i8];
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void k(int viewId, ConstraintLayout.b param) {
            this.a = viewId;
            b bVar = this.e;
            bVar.C0 = param.C;
            bVar.D0 = param.D;
            bVar.E0 = param.E;
            bVar.F0 = param.F;
            bVar.G0 = param.G;
            bVar.H0 = param.H;
            bVar.I0 = param.I;
            bVar.J0 = param.J;
            bVar.K0 = param.K;
            bVar.L0 = param.L;
            bVar.M0 = param.M;
            bVar.N0 = param.Q;
            bVar.O0 = param.R;
            bVar.P0 = param.S;
            bVar.Q0 = param.T;
            bVar.R0 = param.e0;
            bVar.S0 = param.f0;
            bVar.T0 = param.g0;
            bVar.U0 = param.N;
            bVar.V0 = param.O;
            bVar.W0 = param.P;
            bVar.X0 = param.v0;
            bVar.Y0 = param.w0;
            bVar.Z0 = param.x0;
            bVar.A0 = param.A;
            b bVar2 = this.e;
            bVar2.y0 = param.y;
            bVar2.z0 = param.z;
            bVar2.w0 = ((ViewGroup.MarginLayoutParams) param).width;
            bVar2.x0 = ((ViewGroup.MarginLayoutParams) param).height;
            bVar2.a1 = ((ViewGroup.MarginLayoutParams) param).leftMargin;
            bVar2.b1 = ((ViewGroup.MarginLayoutParams) param).rightMargin;
            bVar2.c1 = ((ViewGroup.MarginLayoutParams) param).topMargin;
            bVar2.d1 = ((ViewGroup.MarginLayoutParams) param).bottomMargin;
            bVar2.g1 = param.b0;
            bVar2.o1 = param.k0;
            bVar2.p1 = param.j0;
            bVar2.r1 = param.m0;
            bVar2.q1 = param.l0;
            bVar2.G1 = param.y0;
            bVar2.H1 = param.z0;
            bVar2.s1 = param.n0;
            bVar2.t1 = param.o0;
            bVar2.u1 = param.r0;
            bVar2.v1 = param.s0;
            bVar2.w1 = param.p0;
            bVar2.x1 = param.q0;
            bVar2.y1 = param.t0;
            bVar2.z1 = param.u0;
            bVar2.F1 = param.A0;
            bVar2.i1 = param.V;
            b bVar3 = this.e;
            bVar3.k1 = param.X;
            bVar3.h1 = param.U;
            bVar3.j1 = param.W;
            bVar3.m1 = param.Y;
            bVar3.l1 = param.Z;
            bVar3.n1 = param.a0;
            bVar3.J1 = param.B0;
            bVar3.e1 = param.getMarginEnd();
            this.e.f1 = param.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(int viewId, bf.a param) {
            k(viewId, param);
            this.c.d = param.V0;
            e eVar = this.f;
            eVar.o = param.Y0;
            eVar.p = param.Z0;
            eVar.q = param.a1;
            eVar.r = param.b1;
            eVar.s = param.c1;
            eVar.t = param.d1;
            eVar.u = param.e1;
            eVar.w = param.f1;
            eVar.x = param.g1;
            eVar.y = param.h1;
            eVar.A = param.X0;
            eVar.z = param.W0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void m(xe helper, int viewId, bf.a param) {
            l(viewId, param);
            if (helper instanceof Barrier) {
                b bVar = this.e;
                bVar.C1 = 1;
                Barrier barrier = (Barrier) helper;
                bVar.A1 = barrier.getType();
                this.e.D1 = barrier.getReferencedIds();
                this.e.B1 = barrier.getMargin();
            }
        }

        private we n(String attributeName, we.b attributeType) {
            if (this.g.containsKey(attributeName)) {
                we weVar = this.g.get(attributeName);
                if (weVar.j() == attributeType) {
                    return weVar;
                }
                StringBuilder G = wo1.G("ConstraintAttribute is already a ");
                G.append(weVar.j().name());
                throw new IllegalArgumentException(G.toString());
            }
            we weVar2 = new we(attributeName, attributeType);
            this.g.put(attributeName, weVar2);
            return weVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(String attributeName, int value) {
            n(attributeName, we.b.COLOR_TYPE).s(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void q(String attributeName, float value) {
            n(attributeName, we.b.FLOAT_TYPE).t(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void r(String attributeName, int value) {
            n(attributeName, we.b.INT_TYPE).u(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void s(String attributeName, String value) {
            n(attributeName, we.b.STRING_TYPE).v(value);
        }

        public void h(a c) {
            C0144a c0144a = this.h;
            if (c0144a != null) {
                c0144a.e(c);
            }
        }

        public void i(ConstraintLayout.b param) {
            b bVar = this.e;
            param.C = bVar.C0;
            param.D = bVar.D0;
            param.E = bVar.E0;
            param.F = bVar.F0;
            param.G = bVar.G0;
            param.H = bVar.H0;
            param.I = bVar.I0;
            param.J = bVar.J0;
            param.K = bVar.K0;
            param.L = bVar.L0;
            param.M = bVar.M0;
            param.Q = bVar.N0;
            param.R = bVar.O0;
            param.S = bVar.P0;
            param.T = bVar.Q0;
            ((ViewGroup.MarginLayoutParams) param).leftMargin = bVar.a1;
            ((ViewGroup.MarginLayoutParams) param).rightMargin = bVar.b1;
            ((ViewGroup.MarginLayoutParams) param).topMargin = bVar.c1;
            ((ViewGroup.MarginLayoutParams) param).bottomMargin = bVar.d1;
            param.Y = bVar.m1;
            param.Z = bVar.l1;
            param.V = bVar.i1;
            param.X = bVar.k1;
            param.e0 = bVar.R0;
            param.f0 = bVar.S0;
            b bVar2 = this.e;
            param.N = bVar2.U0;
            param.O = bVar2.V0;
            param.P = bVar2.W0;
            param.g0 = bVar2.T0;
            param.v0 = bVar2.X0;
            param.w0 = bVar2.Y0;
            param.k0 = bVar2.o1;
            param.j0 = bVar2.p1;
            param.m0 = bVar2.r1;
            param.l0 = bVar2.q1;
            param.y0 = bVar2.G1;
            param.z0 = bVar2.H1;
            param.n0 = bVar2.s1;
            param.o0 = bVar2.t1;
            param.r0 = bVar2.u1;
            param.s0 = bVar2.v1;
            param.p0 = bVar2.w1;
            param.q0 = bVar2.x1;
            param.t0 = bVar2.y1;
            param.u0 = bVar2.z1;
            param.x0 = bVar2.Z0;
            param.A = bVar2.A0;
            param.y = bVar2.y0;
            param.z = bVar2.z0;
            ((ViewGroup.MarginLayoutParams) param).width = bVar2.w0;
            b bVar3 = this.e;
            ((ViewGroup.MarginLayoutParams) param).height = bVar3.x0;
            String str = bVar3.F1;
            if (str != null) {
                param.A0 = str;
            }
            param.B0 = bVar3.J1;
            param.setMarginStart(bVar3.f1);
            param.setMarginEnd(this.e.e1);
            param.e();
        }

        /* renamed from: j */
        public a clone() {
            a aVar = new a();
            aVar.e.a(this.e);
            aVar.d.a(this.d);
            aVar.c.a(this.c);
            aVar.f.a(this.f);
            aVar.a = this.a;
            aVar.h = this.h;
            return aVar;
        }

        public void o(String tag) {
            C0144a c0144a = this.h;
            if (c0144a != null) {
                c0144a.f(tag);
            }
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class b {
        private static final int A = 24;
        private static final int B = 25;
        private static final int C = 26;
        private static final int D = 27;
        private static final int E = 28;
        private static final int F = 29;
        private static final int G = 30;
        private static final int H = 31;
        private static final int I = 32;
        private static final int J = 33;
        private static final int K = 34;
        private static final int L = 35;
        private static final int M = 36;
        private static final int N = 37;
        private static final int O = 38;
        private static final int P = 39;
        private static final int Q = 40;
        private static final int R = 41;
        private static final int S = 42;
        private static final int T = 61;
        private static final int U = 62;
        private static final int V = 63;
        private static final int W = 69;
        private static final int X = 70;
        private static final int Y = 71;
        private static final int Z = 72;
        public static final int a = -1;
        private static final int a0 = 73;
        public static final int b = Integer.MIN_VALUE;
        private static final int b0 = 74;
        private static SparseIntArray c = null;
        private static final int c0 = 75;
        private static final int d = 1;
        private static final int d0 = 76;
        private static final int e = 2;
        private static final int e0 = 77;
        private static final int f = 3;
        private static final int f0 = 78;
        private static final int g = 4;
        private static final int g0 = 79;
        private static final int h = 5;
        private static final int h0 = 80;
        private static final int i = 6;
        private static final int i0 = 81;
        private static final int j = 7;
        private static final int j0 = 82;
        private static final int k = 8;
        private static final int k0 = 83;
        private static final int l = 9;
        private static final int l0 = 84;
        private static final int m = 10;
        private static final int m0 = 85;
        private static final int n = 11;
        private static final int n0 = 86;
        private static final int o = 12;
        private static final int o0 = 87;
        private static final int p = 13;
        private static final int p0 = 88;
        private static final int q = 14;
        private static final int q0 = 89;
        private static final int r = 15;
        private static final int r0 = 90;
        private static final int s = 16;
        private static final int s0 = 91;
        private static final int t = 17;
        private static final int u = 18;
        private static final int v = 19;
        private static final int w = 20;
        private static final int x = 21;
        private static final int y = 22;
        private static final int z = 23;
        public int[] D1;
        public String E1;
        public String F1;
        public int w0;
        public int x0;
        public boolean t0 = false;
        public boolean u0 = false;
        public boolean v0 = false;
        public int y0 = -1;
        public int z0 = -1;
        public float A0 = -1.0f;
        public boolean B0 = true;
        public int C0 = -1;
        public int D0 = -1;
        public int E0 = -1;
        public int F0 = -1;
        public int G0 = -1;
        public int H0 = -1;
        public int I0 = -1;
        public int J0 = -1;
        public int K0 = -1;
        public int L0 = -1;
        public int M0 = -1;
        public int N0 = -1;
        public int O0 = -1;
        public int P0 = -1;
        public int Q0 = -1;
        public float R0 = 0.5f;
        public float S0 = 0.5f;
        public String T0 = null;
        public int U0 = -1;
        public int V0 = 0;
        public float W0 = 0.0f;
        public int X0 = -1;
        public int Y0 = -1;
        public int Z0 = -1;
        public int a1 = 0;
        public int b1 = 0;
        public int c1 = 0;
        public int d1 = 0;
        public int e1 = 0;
        public int f1 = 0;
        public int g1 = 0;
        public int h1 = Integer.MIN_VALUE;
        public int i1 = Integer.MIN_VALUE;
        public int j1 = Integer.MIN_VALUE;
        public int k1 = Integer.MIN_VALUE;
        public int l1 = Integer.MIN_VALUE;
        public int m1 = Integer.MIN_VALUE;
        public int n1 = Integer.MIN_VALUE;
        public float o1 = -1.0f;
        public float p1 = -1.0f;
        public int q1 = 0;
        public int r1 = 0;
        public int s1 = 0;
        public int t1 = 0;
        public int u1 = 0;
        public int v1 = 0;
        public int w1 = 0;
        public int x1 = 0;
        public float y1 = 1.0f;
        public float z1 = 1.0f;
        public int A1 = -1;
        public int B1 = 0;
        public int C1 = -1;
        public boolean G1 = false;
        public boolean H1 = false;
        public boolean I1 = true;
        public int J1 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            c = sparseIntArray;
            sparseIntArray.append(ff.m.qh, 24);
            c.append(ff.m.rh, 25);
            c.append(ff.m.th, 28);
            c.append(ff.m.uh, 29);
            c.append(ff.m.zh, 35);
            c.append(ff.m.yh, 34);
            c.append(ff.m.Xg, 4);
            c.append(ff.m.Wg, 3);
            c.append(ff.m.Sg, 1);
            c.append(ff.m.Ih, 6);
            c.append(ff.m.Jh, 7);
            c.append(ff.m.eh, 17);
            c.append(ff.m.fh, 18);
            c.append(ff.m.gh, 19);
            c.append(ff.m.Og, 90);
            c.append(ff.m.zg, 26);
            c.append(ff.m.vh, 31);
            c.append(ff.m.wh, 32);
            c.append(ff.m.dh, 10);
            c.append(ff.m.ch, 9);
            c.append(ff.m.Nh, 13);
            c.append(ff.m.Qh, 16);
            c.append(ff.m.Oh, 14);
            c.append(ff.m.Lh, 11);
            c.append(ff.m.Ph, 15);
            c.append(ff.m.Mh, 12);
            c.append(ff.m.Ch, 38);
            c.append(ff.m.oh, 37);
            c.append(ff.m.nh, 39);
            c.append(ff.m.Bh, 40);
            c.append(ff.m.mh, 20);
            c.append(ff.m.Ah, 36);
            c.append(ff.m.bh, 5);
            c.append(ff.m.ph, 91);
            c.append(ff.m.xh, 91);
            c.append(ff.m.sh, 91);
            c.append(ff.m.Vg, 91);
            c.append(ff.m.Rg, 91);
            c.append(ff.m.Cg, 23);
            c.append(ff.m.Eg, 27);
            c.append(ff.m.Gg, 30);
            c.append(ff.m.Hg, 8);
            c.append(ff.m.Dg, 33);
            c.append(ff.m.Fg, 2);
            c.append(ff.m.Ag, 22);
            c.append(ff.m.Bg, 21);
            c.append(ff.m.Dh, 41);
            c.append(ff.m.hh, 42);
            c.append(ff.m.Qg, 41);
            c.append(ff.m.Pg, 42);
            c.append(ff.m.Sh, 76);
            c.append(ff.m.Yg, 61);
            c.append(ff.m.ah, 62);
            c.append(ff.m.Zg, 63);
            c.append(ff.m.Hh, 69);
            c.append(ff.m.lh, 70);
            c.append(ff.m.Lg, 71);
            c.append(ff.m.Jg, 72);
            c.append(ff.m.Kg, 73);
            c.append(ff.m.Mg, 74);
            c.append(ff.m.Ig, 75);
        }

        public void a(b src) {
            this.t0 = src.t0;
            this.w0 = src.w0;
            this.u0 = src.u0;
            this.x0 = src.x0;
            this.y0 = src.y0;
            this.z0 = src.z0;
            this.A0 = src.A0;
            this.B0 = src.B0;
            this.C0 = src.C0;
            this.D0 = src.D0;
            this.E0 = src.E0;
            this.F0 = src.F0;
            this.G0 = src.G0;
            this.H0 = src.H0;
            this.I0 = src.I0;
            this.J0 = src.J0;
            this.K0 = src.K0;
            this.L0 = src.L0;
            this.M0 = src.M0;
            this.N0 = src.N0;
            this.O0 = src.O0;
            this.P0 = src.P0;
            this.Q0 = src.Q0;
            this.R0 = src.R0;
            this.S0 = src.S0;
            this.T0 = src.T0;
            this.U0 = src.U0;
            this.V0 = src.V0;
            this.W0 = src.W0;
            this.X0 = src.X0;
            this.Y0 = src.Y0;
            this.Z0 = src.Z0;
            this.a1 = src.a1;
            this.b1 = src.b1;
            this.c1 = src.c1;
            this.d1 = src.d1;
            this.e1 = src.e1;
            this.f1 = src.f1;
            this.g1 = src.g1;
            this.h1 = src.h1;
            this.i1 = src.i1;
            this.j1 = src.j1;
            this.k1 = src.k1;
            this.l1 = src.l1;
            this.m1 = src.m1;
            this.n1 = src.n1;
            this.o1 = src.o1;
            this.p1 = src.p1;
            this.q1 = src.q1;
            this.r1 = src.r1;
            this.s1 = src.s1;
            this.t1 = src.t1;
            this.u1 = src.u1;
            this.v1 = src.v1;
            this.w1 = src.w1;
            this.x1 = src.x1;
            this.y1 = src.y1;
            this.z1 = src.z1;
            this.A1 = src.A1;
            this.B1 = src.B1;
            this.C1 = src.C1;
            this.F1 = src.F1;
            int[] iArr = src.D1;
            if (iArr != null && src.E1 == null) {
                this.D1 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.D1 = null;
            }
            this.E1 = src.E1;
            this.G1 = src.G1;
            this.H1 = src.H1;
            this.I1 = src.I1;
            this.J1 = src.J1;
        }

        public void b(ie scene, StringBuilder stringBuilder) {
            Field[] declaredFields = getClass().getDeclaredFields();
            stringBuilder.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object X2 = scene.X(num.intValue());
                                stringBuilder.append("    ");
                                stringBuilder.append(name);
                                stringBuilder.append(" = \"");
                                stringBuilder.append(X2 == null ? num : X2);
                                stringBuilder.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f2 = (Float) obj;
                            if (f2.floatValue() != -1.0f) {
                                stringBuilder.append("    ");
                                stringBuilder.append(name);
                                stringBuilder.append(" = \"");
                                stringBuilder.append(f2);
                                stringBuilder.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }

        public void c(Context context, AttributeSet attrs) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, ff.m.yg);
            this.u0 = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                int i3 = c.get(index);
                switch (i3) {
                    case 1:
                        this.K0 = af.y0(obtainStyledAttributes, index, this.K0);
                        break;
                    case 2:
                        this.d1 = obtainStyledAttributes.getDimensionPixelSize(index, this.d1);
                        break;
                    case 3:
                        this.J0 = af.y0(obtainStyledAttributes, index, this.J0);
                        break;
                    case 4:
                        this.I0 = af.y0(obtainStyledAttributes, index, this.I0);
                        break;
                    case 5:
                        this.T0 = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.X0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.X0);
                        break;
                    case 7:
                        this.Y0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.Y0);
                        break;
                    case 8:
                        this.e1 = obtainStyledAttributes.getDimensionPixelSize(index, this.e1);
                        break;
                    case 9:
                        this.Q0 = af.y0(obtainStyledAttributes, index, this.Q0);
                        break;
                    case 10:
                        this.P0 = af.y0(obtainStyledAttributes, index, this.P0);
                        break;
                    case 11:
                        this.k1 = obtainStyledAttributes.getDimensionPixelSize(index, this.k1);
                        break;
                    case 12:
                        this.l1 = obtainStyledAttributes.getDimensionPixelSize(index, this.l1);
                        break;
                    case 13:
                        this.h1 = obtainStyledAttributes.getDimensionPixelSize(index, this.h1);
                        break;
                    case 14:
                        this.j1 = obtainStyledAttributes.getDimensionPixelSize(index, this.j1);
                        break;
                    case 15:
                        this.m1 = obtainStyledAttributes.getDimensionPixelSize(index, this.m1);
                        break;
                    case 16:
                        this.i1 = obtainStyledAttributes.getDimensionPixelSize(index, this.i1);
                        break;
                    case 17:
                        this.y0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.y0);
                        break;
                    case 18:
                        this.z0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.z0);
                        break;
                    case 19:
                        this.A0 = obtainStyledAttributes.getFloat(index, this.A0);
                        break;
                    case 20:
                        this.R0 = obtainStyledAttributes.getFloat(index, this.R0);
                        break;
                    case 21:
                        this.x0 = obtainStyledAttributes.getLayoutDimension(index, this.x0);
                        break;
                    case 22:
                        this.w0 = obtainStyledAttributes.getLayoutDimension(index, this.w0);
                        break;
                    case 23:
                        this.a1 = obtainStyledAttributes.getDimensionPixelSize(index, this.a1);
                        break;
                    case 24:
                        this.C0 = af.y0(obtainStyledAttributes, index, this.C0);
                        break;
                    case 25:
                        this.D0 = af.y0(obtainStyledAttributes, index, this.D0);
                        break;
                    case 26:
                        this.Z0 = obtainStyledAttributes.getInt(index, this.Z0);
                        break;
                    case 27:
                        this.b1 = obtainStyledAttributes.getDimensionPixelSize(index, this.b1);
                        break;
                    case 28:
                        this.E0 = af.y0(obtainStyledAttributes, index, this.E0);
                        break;
                    case 29:
                        this.F0 = af.y0(obtainStyledAttributes, index, this.F0);
                        break;
                    case 30:
                        this.f1 = obtainStyledAttributes.getDimensionPixelSize(index, this.f1);
                        break;
                    case 31:
                        this.N0 = af.y0(obtainStyledAttributes, index, this.N0);
                        break;
                    case 32:
                        this.O0 = af.y0(obtainStyledAttributes, index, this.O0);
                        break;
                    case 33:
                        this.c1 = obtainStyledAttributes.getDimensionPixelSize(index, this.c1);
                        break;
                    case 34:
                        this.H0 = af.y0(obtainStyledAttributes, index, this.H0);
                        break;
                    case 35:
                        this.G0 = af.y0(obtainStyledAttributes, index, this.G0);
                        break;
                    case 36:
                        this.S0 = obtainStyledAttributes.getFloat(index, this.S0);
                        break;
                    case 37:
                        this.p1 = obtainStyledAttributes.getFloat(index, this.p1);
                        break;
                    case 38:
                        this.o1 = obtainStyledAttributes.getFloat(index, this.o1);
                        break;
                    case 39:
                        this.q1 = obtainStyledAttributes.getInt(index, this.q1);
                        break;
                    case 40:
                        this.r1 = obtainStyledAttributes.getInt(index, this.r1);
                        break;
                    case 41:
                        af.A0(this, obtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        af.A0(this, obtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i3) {
                            case 61:
                                this.U0 = af.y0(obtainStyledAttributes, index, this.U0);
                                continue;
                            case 62:
                                this.V0 = obtainStyledAttributes.getDimensionPixelSize(index, this.V0);
                                continue;
                            case 63:
                                this.W0 = obtainStyledAttributes.getFloat(index, this.W0);
                                continue;
                            default:
                                switch (i3) {
                                    case 69:
                                        this.y1 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 70:
                                        this.z1 = obtainStyledAttributes.getFloat(index, 1.0f);
                                        continue;
                                    case 71:
                                        continue;
                                    case 72:
                                        this.A1 = obtainStyledAttributes.getInt(index, this.A1);
                                        continue;
                                    case 73:
                                        this.B1 = obtainStyledAttributes.getDimensionPixelSize(index, this.B1);
                                        continue;
                                    case 74:
                                        this.E1 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 75:
                                        this.I1 = obtainStyledAttributes.getBoolean(index, this.I1);
                                        continue;
                                    case 76:
                                        this.J1 = obtainStyledAttributes.getInt(index, this.J1);
                                        continue;
                                    case 77:
                                        this.L0 = af.y0(obtainStyledAttributes, index, this.L0);
                                        continue;
                                    case 78:
                                        this.M0 = af.y0(obtainStyledAttributes, index, this.M0);
                                        continue;
                                    case 79:
                                        this.n1 = obtainStyledAttributes.getDimensionPixelSize(index, this.n1);
                                        continue;
                                    case 80:
                                        this.g1 = obtainStyledAttributes.getDimensionPixelSize(index, this.g1);
                                        continue;
                                    case 81:
                                        this.s1 = obtainStyledAttributes.getInt(index, this.s1);
                                        continue;
                                    case 82:
                                        this.t1 = obtainStyledAttributes.getInt(index, this.t1);
                                        continue;
                                    case 83:
                                        this.v1 = obtainStyledAttributes.getDimensionPixelSize(index, this.v1);
                                        continue;
                                    case 84:
                                        this.u1 = obtainStyledAttributes.getDimensionPixelSize(index, this.u1);
                                        continue;
                                    case 85:
                                        this.x1 = obtainStyledAttributes.getDimensionPixelSize(index, this.x1);
                                        continue;
                                    case 86:
                                        this.w1 = obtainStyledAttributes.getDimensionPixelSize(index, this.w1);
                                        continue;
                                    case 87:
                                        this.G1 = obtainStyledAttributes.getBoolean(index, this.G1);
                                        continue;
                                    case 88:
                                        this.H1 = obtainStyledAttributes.getBoolean(index, this.H1);
                                        continue;
                                    case 89:
                                        this.F1 = obtainStyledAttributes.getString(index);
                                        continue;
                                    case 90:
                                        this.B0 = obtainStyledAttributes.getBoolean(index, this.B0);
                                        continue;
                                    case 91:
                                        Integer.toHexString(index);
                                        c.get(index);
                                        continue;
                                    default:
                                        Integer.toHexString(index);
                                        c.get(index);
                                        continue;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class c {
        private static final int a = -2;
        private static final int b = -1;
        private static final int c = -3;
        private static SparseIntArray d = null;
        private static final int e = 1;
        private static final int f = 2;
        private static final int g = 3;
        private static final int h = 4;
        private static final int i = 5;
        private static final int j = 6;
        private static final int k = 7;
        private static final int l = 8;
        private static final int m = 9;
        private static final int n = 10;
        public boolean o = false;
        public int p = -1;
        public int q = 0;
        public String r = null;
        public int s = -1;
        public int t = 0;
        public float u = Float.NaN;
        public int v = -1;
        public float w = Float.NaN;
        public float x = Float.NaN;
        public int y = -1;
        public String z = null;
        public int A = -3;
        public int B = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            d = sparseIntArray;
            sparseIntArray.append(ff.m.pj, 1);
            d.append(ff.m.rj, 2);
            d.append(ff.m.vj, 3);
            d.append(ff.m.oj, 4);
            d.append(ff.m.nj, 5);
            d.append(ff.m.mj, 6);
            d.append(ff.m.qj, 7);
            d.append(ff.m.uj, 8);
            d.append(ff.m.tj, 9);
            d.append(ff.m.sj, 10);
        }

        public void a(c src) {
            this.o = src.o;
            this.p = src.p;
            this.r = src.r;
            this.s = src.s;
            this.t = src.t;
            this.w = src.w;
            this.u = src.u;
            this.v = src.v;
        }

        public void b(Context context, AttributeSet attrs) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, ff.m.lj);
            this.o = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (d.get(index)) {
                    case 1:
                        this.w = obtainStyledAttributes.getFloat(index, this.w);
                        break;
                    case 2:
                        this.s = obtainStyledAttributes.getInt(index, this.s);
                        break;
                    case 3:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            this.r = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.r = h9.n[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.t = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.p = af.y0(obtainStyledAttributes, index, this.p);
                        break;
                    case 6:
                        this.q = obtainStyledAttributes.getInteger(index, this.q);
                        break;
                    case 7:
                        this.u = obtainStyledAttributes.getFloat(index, this.u);
                        break;
                    case 8:
                        this.y = obtainStyledAttributes.getInteger(index, this.y);
                        break;
                    case 9:
                        this.x = obtainStyledAttributes.getFloat(index, this.x);
                        break;
                    case 10:
                        int i3 = obtainStyledAttributes.peekValue(index).type;
                        if (i3 == 1) {
                            int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                            this.B = resourceId;
                            if (resourceId != -1) {
                                this.A = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (i3 == 3) {
                            String string = obtainStyledAttributes.getString(index);
                            this.z = string;
                            if (string.indexOf("/") > 0) {
                                this.B = obtainStyledAttributes.getResourceId(index, -1);
                                this.A = -2;
                                break;
                            } else {
                                this.A = -1;
                                break;
                            }
                        } else {
                            this.A = obtainStyledAttributes.getInteger(index, this.B);
                            break;
                        }
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class d {
        public boolean a = false;
        public int b = 0;
        public int c = 0;
        public float d = 1.0f;
        public float e = Float.NaN;

        public void a(d src) {
            this.a = src.a;
            this.b = src.b;
            this.d = src.d;
            this.e = src.e;
            this.c = src.c;
        }

        public void b(Context context, AttributeSet attrs) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, ff.m.Zk);
            this.a = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == ff.m.bl) {
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                } else if (index == ff.m.al) {
                    this.b = obtainStyledAttributes.getInt(index, this.b);
                    this.b = af.N[this.b];
                } else if (index == ff.m.el) {
                    this.c = obtainStyledAttributes.getInt(index, this.c);
                } else if (index == ff.m.dl) {
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public static class e {
        private static SparseIntArray a = null;
        private static final int b = 1;
        private static final int c = 2;
        private static final int d = 3;
        private static final int e = 4;
        private static final int f = 5;
        private static final int g = 6;
        private static final int h = 7;
        private static final int i = 8;
        private static final int j = 9;
        private static final int k = 10;
        private static final int l = 11;
        private static final int m = 12;
        public boolean n = false;
        public float o = 0.0f;
        public float p = 0.0f;
        public float q = 0.0f;
        public float r = 1.0f;
        public float s = 1.0f;
        public float t = Float.NaN;
        public float u = Float.NaN;
        public int v = -1;
        public float w = 0.0f;
        public float x = 0.0f;
        public float y = 0.0f;
        public boolean z = false;
        public float A = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(ff.m.Bn, 1);
            a.append(ff.m.Cn, 2);
            a.append(ff.m.Dn, 3);
            a.append(ff.m.zn, 4);
            a.append(ff.m.An, 5);
            a.append(ff.m.vn, 6);
            a.append(ff.m.wn, 7);
            a.append(ff.m.xn, 8);
            a.append(ff.m.yn, 9);
            a.append(ff.m.En, 10);
            a.append(ff.m.Fn, 11);
            a.append(ff.m.Gn, 12);
        }

        public void a(e src) {
            this.n = src.n;
            this.o = src.o;
            this.p = src.p;
            this.q = src.q;
            this.r = src.r;
            this.s = src.s;
            this.t = src.t;
            this.u = src.u;
            this.v = src.v;
            this.w = src.w;
            this.x = src.x;
            this.y = src.y;
            this.z = src.z;
            this.A = src.A;
        }

        public void b(Context context, AttributeSet attrs) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, ff.m.un);
            this.n = true;
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                switch (a.get(index)) {
                    case 1:
                        this.o = obtainStyledAttributes.getFloat(index, this.o);
                        break;
                    case 2:
                        this.p = obtainStyledAttributes.getFloat(index, this.p);
                        break;
                    case 3:
                        this.q = obtainStyledAttributes.getFloat(index, this.q);
                        break;
                    case 4:
                        this.r = obtainStyledAttributes.getFloat(index, this.r);
                        break;
                    case 5:
                        this.s = obtainStyledAttributes.getFloat(index, this.s);
                        break;
                    case 6:
                        this.t = obtainStyledAttributes.getDimension(index, this.t);
                        break;
                    case 7:
                        this.u = obtainStyledAttributes.getDimension(index, this.u);
                        break;
                    case 8:
                        this.w = obtainStyledAttributes.getDimension(index, this.w);
                        break;
                    case 9:
                        this.x = obtainStyledAttributes.getDimension(index, this.x);
                        break;
                    case 10:
                        this.y = obtainStyledAttributes.getDimension(index, this.y);
                        break;
                    case 11:
                        this.z = true;
                        this.A = obtainStyledAttributes.getDimension(index, this.A);
                        break;
                    case 12:
                        this.v = af.y0(obtainStyledAttributes, index, this.v);
                        break;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public class f {
        private static final String a = "       ";
        public Writer b;
        public ConstraintLayout c;
        public Context d;
        public int e;
        public int f = 0;
        public final String g = "'left'";
        public final String h = "'right'";
        public final String i = "'baseline'";
        public final String j = "'bottom'";
        public final String k = "'top'";
        public final String l = "'start'";
        public final String m = "'end'";
        public HashMap<Integer, String> n = new HashMap<>();

        public f(Writer writer, ConstraintLayout layout, int flags) throws IOException {
            this.b = writer;
            this.c = layout;
            this.d = layout.getContext();
            this.e = flags;
        }

        private void e(String dimString, int dim, int dimDefault, float dimPercent, int dimMin, int dimMax, boolean constrainedDim) throws IOException {
            if (dim != 0) {
                if (dim == -2) {
                    Writer writer = this.b;
                    writer.write(a + dimString + ": 'wrap'\n");
                } else if (dim == -1) {
                    Writer writer2 = this.b;
                    writer2.write(a + dimString + ": 'parent'\n");
                } else {
                    Writer writer3 = this.b;
                    writer3.write(a + dimString + ": " + dim + ",\n");
                }
            } else if (dimMax == -1 && dimMin == -1) {
                if (dimDefault == 1) {
                    Writer writer4 = this.b;
                    writer4.write(a + dimString + ": '???????????',\n");
                } else if (dimDefault != 2) {
                } else {
                    Writer writer5 = this.b;
                    writer5.write(a + dimString + ": '" + dimPercent + "%',\n");
                }
            } else if (dimDefault == 0) {
                Writer writer6 = this.b;
                writer6.write(a + dimString + ": {'spread' ," + dimMin + ", " + dimMax + "}\n");
            } else if (dimDefault == 1) {
                Writer writer7 = this.b;
                writer7.write(a + dimString + ": {'wrap' ," + dimMin + ", " + dimMax + "}\n");
            } else if (dimDefault != 2) {
            } else {
                Writer writer8 = this.b;
                writer8.write(a + dimString + ": {'" + dimPercent + "'% ," + dimMin + ", " + dimMax + "}\n");
            }
        }

        private void f(int orientation, int guideBegin, int guideEnd, float guidePercent) {
        }

        public String a(int id) {
            if (this.n.containsKey(Integer.valueOf(id))) {
                return wo1.C(wo1.G("'"), this.n.get(Integer.valueOf(id)), "'");
            }
            if (id == 0) {
                return "'parent'";
            }
            String b = b(id);
            this.n.put(Integer.valueOf(id), b);
            return "'" + b + "'";
        }

        public String b(int id) {
            try {
                if (id != -1) {
                    return this.d.getResources().getResourceEntryName(id);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unknown");
                int i = this.f + 1;
                this.f = i;
                sb.append(i);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder G = wo1.G("unknown");
                int i2 = this.f + 1;
                this.f = i2;
                G.append(i2);
                return G.toString();
            }
        }

        public void c(int circleConstraint, float circleAngle, int circleRadius) throws IOException {
            if (circleConstraint == -1) {
                return;
            }
            this.b.write("       circle");
            this.b.write(":[");
            this.b.write(a(circleConstraint));
            Writer writer = this.b;
            writer.write(", " + circleAngle);
            Writer writer2 = this.b;
            writer2.write(circleRadius + "]");
        }

        public void d(String my, int leftToLeft, String other, int margin, int goneMargin) throws IOException {
            if (leftToLeft == -1) {
                return;
            }
            Writer writer = this.b;
            writer.write(a + my);
            this.b.write(":[");
            this.b.write(a(leftToLeft));
            this.b.write(" , ");
            this.b.write(other);
            if (margin != 0) {
                Writer writer2 = this.b;
                writer2.write(" , " + margin);
            }
            this.b.write("],\n");
        }

        public void g() throws IOException {
            this.b.write("\n'ConstraintSet':{\n");
            for (Integer num : af.this.V1.keySet()) {
                String a2 = a(num.intValue());
                Writer writer = this.b;
                writer.write(a2 + ":{\n");
                b bVar = ((a) af.this.V1.get(num)).e;
                e("height", bVar.x0, bVar.t1, bVar.z1, bVar.x1, bVar.v1, bVar.H1);
                e("width", bVar.w0, bVar.s1, bVar.y1, bVar.w1, bVar.u1, bVar.G1);
                d("'left'", bVar.C0, "'left'", bVar.a1, bVar.h1);
                d("'left'", bVar.D0, "'right'", bVar.a1, bVar.h1);
                d("'right'", bVar.E0, "'left'", bVar.b1, bVar.j1);
                d("'right'", bVar.F0, "'right'", bVar.b1, bVar.j1);
                d("'baseline'", bVar.K0, "'baseline'", -1, bVar.n1);
                d("'baseline'", bVar.L0, "'top'", -1, bVar.n1);
                d("'baseline'", bVar.M0, "'bottom'", -1, bVar.n1);
                d("'top'", bVar.H0, "'bottom'", bVar.c1, bVar.i1);
                d("'top'", bVar.G0, "'top'", bVar.c1, bVar.i1);
                d("'bottom'", bVar.J0, "'bottom'", bVar.d1, bVar.k1);
                d("'bottom'", bVar.I0, "'top'", bVar.d1, bVar.k1);
                d("'start'", bVar.O0, "'start'", bVar.f1, bVar.m1);
                d("'start'", bVar.N0, "'end'", bVar.f1, bVar.m1);
                d("'end'", bVar.P0, "'start'", bVar.e1, bVar.l1);
                d("'end'", bVar.Q0, "'end'", bVar.e1, bVar.l1);
                i("'horizontalBias'", bVar.R0, 0.5f);
                i("'verticalBias'", bVar.S0, 0.5f);
                c(bVar.U0, bVar.W0, bVar.V0);
                f(bVar.Z0, bVar.y0, bVar.z0, bVar.A0);
                k("'dimensionRatio'", bVar.T0);
                j("'barrierMargin'", bVar.B1);
                j("'type'", bVar.C1);
                k("'ReferenceId'", bVar.E1);
                m("'mBarrierAllowsGoneWidgets'", bVar.I1, true);
                j("'WrapBehavior'", bVar.J1);
                h("'verticalWeight'", bVar.o1);
                h("'horizontalWeight'", bVar.p1);
                j("'horizontalChainStyle'", bVar.q1);
                j("'verticalChainStyle'", bVar.r1);
                j("'barrierDirection'", bVar.A1);
                int[] iArr = bVar.D1;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.b.write("}\n");
            }
            this.b.write("}\n");
        }

        public void h(String name, float value) throws IOException {
            if (value == -1.0f) {
                return;
            }
            Writer writer = this.b;
            writer.write(a + name);
            Writer writer2 = this.b;
            writer2.write(": " + value);
            this.b.write(",\n");
        }

        public void i(String name, float value, float def) throws IOException {
            if (value == def) {
                return;
            }
            Writer writer = this.b;
            writer.write(a + name);
            Writer writer2 = this.b;
            writer2.write(": " + value);
            this.b.write(",\n");
        }

        public void j(String name, int value) throws IOException {
            if (value == 0 || value == -1) {
                return;
            }
            Writer writer = this.b;
            writer.write(a + name);
            this.b.write(":");
            Writer writer2 = this.b;
            writer2.write(", " + value);
            this.b.write("\n");
        }

        public void k(String name, String value) throws IOException {
            if (value == null) {
                return;
            }
            Writer writer = this.b;
            writer.write(a + name);
            this.b.write(":");
            Writer writer2 = this.b;
            writer2.write(", " + value);
            this.b.write("\n");
        }

        public void l(String name, boolean value) throws IOException {
            if (value) {
                Writer writer = this.b;
                writer.write(a + name);
                Writer writer2 = this.b;
                writer2.write(": " + value);
                this.b.write(",\n");
            }
        }

        public void m(String name, boolean value, boolean def) throws IOException {
            if (value == def) {
                return;
            }
            Writer writer = this.b;
            writer.write(a + name);
            Writer writer2 = this.b;
            writer2.write(": " + value);
            this.b.write(",\n");
        }

        public void n(String name, int[] value) throws IOException {
            if (value == null) {
                return;
            }
            Writer writer = this.b;
            writer.write(a + name);
            this.b.write(": ");
            int i = 0;
            while (i < value.length) {
                Writer writer2 = this.b;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "[" : ", ");
                sb.append(a(value[i]));
                writer2.write(sb.toString());
                i++;
            }
            this.b.write("],\n");
        }
    }

    /* compiled from: ConstraintSet.java */
    /* loaded from: classes.dex */
    public class g {
        private static final String a = "\n       ";
        public Writer b;
        public ConstraintLayout c;
        public Context d;
        public int e;
        public int f = 0;
        public final String g = "'left'";
        public final String h = "'right'";
        public final String i = "'baseline'";
        public final String j = "'bottom'";
        public final String k = "'top'";
        public final String l = "'start'";
        public final String m = "'end'";
        public HashMap<Integer, String> n = new HashMap<>();

        public g(Writer writer, ConstraintLayout layout, int flags) throws IOException {
            this.b = writer;
            this.c = layout;
            this.d = layout.getContext();
            this.e = flags;
        }

        private void c(String dimString, int dim, int def) throws IOException {
            if (dim != def) {
                if (dim == -2) {
                    Writer writer = this.b;
                    writer.write(a + dimString + "=\"wrap_content\"");
                } else if (dim == -1) {
                    Writer writer2 = this.b;
                    writer2.write(a + dimString + "=\"match_parent\"");
                } else {
                    Writer writer3 = this.b;
                    writer3.write(a + dimString + "=\"" + dim + "dp\"");
                }
            }
        }

        private void d(String dimString, boolean val, boolean def) throws IOException {
            if (val != def) {
                Writer writer = this.b;
                writer.write(a + dimString + "=\"" + val + "dp\"");
            }
        }

        private void g(String dimString, int dim, int def) throws IOException {
            if (dim != def) {
                Writer writer = this.b;
                writer.write(a + dimString + "=\"" + dim + "dp\"");
            }
        }

        private void h(String dimString, int val, String[] types, int def) throws IOException {
            if (val != def) {
                Writer writer = this.b;
                StringBuilder M = wo1.M(a, dimString, "=\"");
                M.append(types[val]);
                M.append("\"");
                writer.write(M.toString());
            }
        }

        public String a(int id) {
            if (this.n.containsKey(Integer.valueOf(id))) {
                return wo1.C(wo1.G("@+id/"), this.n.get(Integer.valueOf(id)), "");
            }
            if (id == 0) {
                return af.O1;
            }
            String b = b(id);
            this.n.put(Integer.valueOf(id), b);
            return "@+id/" + b + "";
        }

        public String b(int id) {
            try {
                if (id != -1) {
                    return this.d.getResources().getResourceEntryName(id);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("unknown");
                int i = this.f + 1;
                this.f = i;
                sb.append(i);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder G = wo1.G("unknown");
                int i2 = this.f + 1;
                this.f = i2;
                G.append(i2);
                return G.toString();
            }
        }

        public void e(int circleConstraint, float circleAngle, int circleRadius) throws IOException {
            if (circleConstraint == -1) {
                return;
            }
            this.b.write("circle");
            this.b.write(":[");
            this.b.write(a(circleConstraint));
            Writer writer = this.b;
            writer.write(", " + circleAngle);
            Writer writer2 = this.b;
            writer2.write(circleRadius + "]");
        }

        public void f(String my, int leftToLeft, String other, int margin, int goneMargin) throws IOException {
            if (leftToLeft == -1) {
                return;
            }
            Writer writer = this.b;
            writer.write(a + my);
            this.b.write(":[");
            this.b.write(a(leftToLeft));
            this.b.write(" , ");
            this.b.write(other);
            if (margin != 0) {
                Writer writer2 = this.b;
                writer2.write(" , " + margin);
            }
            this.b.write("],\n");
        }

        public void i() throws IOException {
            this.b.write("\n<ConstraintSet>\n");
            for (Integer num : af.this.V1.keySet()) {
                String a2 = a(num.intValue());
                this.b.write("  <Constraint");
                Writer writer = this.b;
                writer.write("\n       android:id=\"" + a2 + "\"");
                b bVar = ((a) af.this.V1.get(num)).e;
                c("android:layout_width", bVar.w0, -5);
                c("android:layout_height", bVar.x0, -5);
                j("app:layout_constraintGuide_begin", (float) bVar.y0, -1.0f);
                j("app:layout_constraintGuide_end", bVar.z0, -1.0f);
                j("app:layout_constraintGuide_percent", bVar.A0, -1.0f);
                j("app:layout_constraintHorizontal_bias", bVar.R0, 0.5f);
                j("app:layout_constraintVertical_bias", bVar.S0, 0.5f);
                m("app:layout_constraintDimensionRatio", bVar.T0, null);
                o("app:layout_constraintCircle", bVar.U0);
                j("app:layout_constraintCircleRadius", bVar.V0, 0.0f);
                j("app:layout_constraintCircleAngle", bVar.W0, 0.0f);
                j("android:orientation", bVar.Z0, -1.0f);
                j("app:layout_constraintVertical_weight", bVar.o1, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.p1, -1.0f);
                j("app:layout_constraintHorizontal_chainStyle", bVar.q1, 0.0f);
                j("app:layout_constraintVertical_chainStyle", bVar.r1, 0.0f);
                j("app:barrierDirection", bVar.A1, -1.0f);
                j("app:barrierMargin", bVar.B1, 0.0f);
                g("app:layout_marginLeft", bVar.a1, 0);
                g("app:layout_goneMarginLeft", bVar.h1, Integer.MIN_VALUE);
                g("app:layout_marginRight", bVar.b1, 0);
                g("app:layout_goneMarginRight", bVar.j1, Integer.MIN_VALUE);
                g("app:layout_marginStart", bVar.f1, 0);
                g("app:layout_goneMarginStart", bVar.m1, Integer.MIN_VALUE);
                g("app:layout_marginEnd", bVar.e1, 0);
                g("app:layout_goneMarginEnd", bVar.l1, Integer.MIN_VALUE);
                g("app:layout_marginTop", bVar.c1, 0);
                g("app:layout_goneMarginTop", bVar.i1, Integer.MIN_VALUE);
                g("app:layout_marginBottom", bVar.d1, 0);
                g("app:layout_goneMarginBottom", bVar.k1, Integer.MIN_VALUE);
                g("app:goneBaselineMargin", bVar.n1, Integer.MIN_VALUE);
                g("app:baselineMargin", bVar.g1, 0);
                d("app:layout_constrainedWidth", bVar.G1, false);
                d("app:layout_constrainedHeight", bVar.H1, false);
                d("app:barrierAllowsGoneWidgets", bVar.I1, true);
                j("app:layout_wrapBehaviorInParent", bVar.J1, 0.0f);
                o("app:baselineToBaseline", bVar.K0);
                o("app:baselineToBottom", bVar.M0);
                o("app:baselineToTop", bVar.L0);
                o("app:layout_constraintBottom_toBottomOf", bVar.J0);
                o("app:layout_constraintBottom_toTopOf", bVar.I0);
                o("app:layout_constraintEnd_toEndOf", bVar.Q0);
                o("app:layout_constraintEnd_toStartOf", bVar.P0);
                o("app:layout_constraintLeft_toLeftOf", bVar.C0);
                o("app:layout_constraintLeft_toRightOf", bVar.D0);
                o("app:layout_constraintRight_toLeftOf", bVar.E0);
                o("app:layout_constraintRight_toRightOf", bVar.F0);
                o("app:layout_constraintStart_toEndOf", bVar.N0);
                o("app:layout_constraintStart_toStartOf", bVar.O0);
                o("app:layout_constraintTop_toBottomOf", bVar.H0);
                o("app:layout_constraintTop_toTopOf", bVar.G0);
                String[] strArr = {"spread", "wrap", "percent"};
                h("app:layout_constraintHeight_default", bVar.t1, strArr, 0);
                j("app:layout_constraintHeight_percent", bVar.z1, 1.0f);
                g("app:layout_constraintHeight_min", bVar.x1, 0);
                g("app:layout_constraintHeight_max", bVar.v1, 0);
                d("android:layout_constrainedHeight", bVar.H1, false);
                h("app:layout_constraintWidth_default", bVar.s1, strArr, 0);
                j("app:layout_constraintWidth_percent", bVar.y1, 1.0f);
                g("app:layout_constraintWidth_min", bVar.w1, 0);
                g("app:layout_constraintWidth_max", bVar.u1, 0);
                d("android:layout_constrainedWidth", bVar.G1, false);
                j("app:layout_constraintVertical_weight", bVar.o1, -1.0f);
                j("app:layout_constraintHorizontal_weight", bVar.p1, -1.0f);
                k("app:layout_constraintHorizontal_chainStyle", bVar.q1);
                k("app:layout_constraintVertical_chainStyle", bVar.r1);
                h("app:barrierDirection", bVar.A1, new String[]{"left", "right", "top", "bottom", com.anythink.expressad.foundation.d.c.bR, "end"}, -1);
                m("app:layout_constraintTag", bVar.F1, null);
                int[] iArr = bVar.D1;
                if (iArr != null) {
                    n("'ReferenceIds'", iArr);
                }
                this.b.write(" />\n");
            }
            this.b.write("</ConstraintSet>\n");
        }

        public void j(String name, float value, float def) throws IOException {
            if (value == def) {
                return;
            }
            Writer writer = this.b;
            writer.write(a + name);
            Writer writer2 = this.b;
            writer2.write("=\"" + value + "\"");
        }

        public void k(String name, int value) throws IOException {
            if (value == 0 || value == -1) {
                return;
            }
            Writer writer = this.b;
            writer.write(a + name + "=\"" + value + "\"\n");
        }

        public void l(String name, String value) throws IOException {
            if (value == null) {
                return;
            }
            this.b.write(name);
            this.b.write(":");
            Writer writer = this.b;
            writer.write(", " + value);
            this.b.write("\n");
        }

        public void m(String name, String value, String def) throws IOException {
            if (value == null || value.equals(def)) {
                return;
            }
            Writer writer = this.b;
            writer.write(a + name);
            Writer writer2 = this.b;
            writer2.write("=\"" + value + "\"");
        }

        public void n(String name, int[] value) throws IOException {
            if (value == null) {
                return;
            }
            Writer writer = this.b;
            writer.write(a + name);
            this.b.write(":");
            int i = 0;
            while (i < value.length) {
                Writer writer2 = this.b;
                StringBuilder sb = new StringBuilder();
                sb.append(i == 0 ? "[" : ", ");
                sb.append(a(value[i]));
                writer2.write(sb.toString());
                i++;
            }
            this.b.write("],\n");
        }

        public void o(String str, int leftToLeft) throws IOException {
            if (leftToLeft == -1) {
                return;
            }
            Writer writer = this.b;
            writer.write(a + str);
            Writer writer2 = this.b;
            StringBuilder G = wo1.G("=\"");
            G.append(a(leftToLeft));
            G.append("\"");
            writer2.write(G.toString());
        }
    }

    static {
        P.append(ff.m.H5, 25);
        P.append(ff.m.I5, 26);
        P.append(ff.m.K5, 29);
        P.append(ff.m.L5, 30);
        P.append(ff.m.R5, 36);
        P.append(ff.m.Q5, 35);
        P.append(ff.m.o5, 4);
        P.append(ff.m.n5, 3);
        P.append(ff.m.j5, 1);
        P.append(ff.m.l5, 91);
        P.append(ff.m.k5, 92);
        P.append(ff.m.a6, 6);
        P.append(ff.m.b6, 7);
        P.append(ff.m.v5, 17);
        P.append(ff.m.w5, 18);
        P.append(ff.m.x5, 19);
        P.append(ff.m.f5, 99);
        P.append(ff.m.d4, 27);
        P.append(ff.m.M5, 32);
        P.append(ff.m.N5, 33);
        P.append(ff.m.u5, 10);
        P.append(ff.m.t5, 9);
        P.append(ff.m.f6, 13);
        P.append(ff.m.i6, 16);
        P.append(ff.m.g6, 14);
        P.append(ff.m.d6, 11);
        P.append(ff.m.h6, 15);
        P.append(ff.m.e6, 12);
        P.append(ff.m.U5, 40);
        P.append(ff.m.F5, 39);
        P.append(ff.m.E5, 41);
        P.append(ff.m.T5, 42);
        P.append(ff.m.D5, 20);
        P.append(ff.m.S5, 37);
        P.append(ff.m.s5, 5);
        P.append(ff.m.G5, 87);
        P.append(ff.m.P5, 87);
        P.append(ff.m.J5, 87);
        P.append(ff.m.m5, 87);
        P.append(ff.m.i5, 87);
        P.append(ff.m.i4, 24);
        P.append(ff.m.k4, 28);
        P.append(ff.m.A4, 31);
        P.append(ff.m.B4, 8);
        P.append(ff.m.j4, 34);
        P.append(ff.m.l4, 2);
        P.append(ff.m.g4, 23);
        P.append(ff.m.h4, 21);
        P.append(ff.m.V5, 95);
        P.append(ff.m.y5, 96);
        P.append(ff.m.f4, 22);
        P.append(ff.m.q4, 43);
        P.append(ff.m.D4, 44);
        P.append(ff.m.y4, 45);
        P.append(ff.m.z4, 46);
        P.append(ff.m.x4, 60);
        P.append(ff.m.v4, 47);
        P.append(ff.m.w4, 48);
        P.append(ff.m.r4, 49);
        P.append(ff.m.s4, 50);
        P.append(ff.m.t4, 51);
        P.append(ff.m.u4, 52);
        P.append(ff.m.C4, 53);
        P.append(ff.m.W5, 54);
        P.append(ff.m.z5, 55);
        P.append(ff.m.X5, 56);
        P.append(ff.m.A5, 57);
        P.append(ff.m.Y5, 58);
        P.append(ff.m.B5, 59);
        P.append(ff.m.p5, 61);
        P.append(ff.m.r5, 62);
        P.append(ff.m.q5, 63);
        P.append(ff.m.F4, 64);
        P.append(ff.m.u6, 65);
        P.append(ff.m.M4, 66);
        P.append(ff.m.v6, 67);
        P.append(ff.m.m6, 79);
        P.append(ff.m.e4, 38);
        P.append(ff.m.l6, 68);
        P.append(ff.m.Z5, 69);
        P.append(ff.m.C5, 70);
        P.append(ff.m.k6, 97);
        P.append(ff.m.J4, 71);
        P.append(ff.m.H4, 72);
        P.append(ff.m.I4, 73);
        P.append(ff.m.K4, 74);
        P.append(ff.m.G4, 75);
        P.append(ff.m.n6, 76);
        P.append(ff.m.O5, 77);
        P.append(ff.m.w6, 78);
        P.append(ff.m.h5, 80);
        P.append(ff.m.g5, 81);
        P.append(ff.m.p6, 82);
        P.append(ff.m.t6, 83);
        P.append(ff.m.s6, 84);
        P.append(ff.m.r6, 85);
        P.append(ff.m.q6, 86);
        SparseIntArray sparseIntArray = Q;
        int i2 = ff.m.za;
        sparseIntArray.append(i2, 6);
        Q.append(i2, 7);
        Q.append(ff.m.S8, 27);
        Q.append(ff.m.Da, 13);
        Q.append(ff.m.Ga, 16);
        Q.append(ff.m.Ea, 14);
        Q.append(ff.m.Ba, 11);
        Q.append(ff.m.Fa, 15);
        Q.append(ff.m.Ca, 12);
        Q.append(ff.m.sa, 40);
        Q.append(ff.m.la, 39);
        Q.append(ff.m.ka, 41);
        Q.append(ff.m.ra, 42);
        Q.append(ff.m.ja, 20);
        Q.append(ff.m.qa, 37);
        Q.append(ff.m.aa, 5);
        Q.append(ff.m.ma, 87);
        Q.append(ff.m.pa, 87);
        Q.append(ff.m.na, 87);
        Q.append(ff.m.X9, 87);
        Q.append(ff.m.W9, 87);
        Q.append(ff.m.X8, 24);
        Q.append(ff.m.Z8, 28);
        Q.append(ff.m.p9, 31);
        Q.append(ff.m.q9, 8);
        Q.append(ff.m.Y8, 34);
        Q.append(ff.m.a9, 2);
        Q.append(ff.m.V8, 23);
        Q.append(ff.m.W8, 21);
        Q.append(ff.m.ta, 95);
        Q.append(ff.m.ea, 96);
        Q.append(ff.m.U8, 22);
        Q.append(ff.m.f9, 43);
        Q.append(ff.m.s9, 44);
        Q.append(ff.m.n9, 45);
        Q.append(ff.m.o9, 46);
        Q.append(ff.m.m9, 60);
        Q.append(ff.m.k9, 47);
        Q.append(ff.m.l9, 48);
        Q.append(ff.m.g9, 49);
        Q.append(ff.m.h9, 50);
        Q.append(ff.m.i9, 51);
        Q.append(ff.m.j9, 52);
        Q.append(ff.m.r9, 53);
        Q.append(ff.m.ua, 54);
        Q.append(ff.m.fa, 55);
        Q.append(ff.m.va, 56);
        Q.append(ff.m.ga, 57);
        Q.append(ff.m.wa, 58);
        Q.append(ff.m.ha, 59);
        Q.append(ff.m.Z9, 62);
        Q.append(ff.m.Y9, 63);
        Q.append(ff.m.u9, 64);
        Q.append(ff.m.Ta, 65);
        Q.append(ff.m.A9, 66);
        Q.append(ff.m.Ua, 67);
        Q.append(ff.m.Ka, 79);
        Q.append(ff.m.T8, 38);
        Q.append(ff.m.La, 98);
        Q.append(ff.m.Ja, 68);
        Q.append(ff.m.xa, 69);
        Q.append(ff.m.ia, 70);
        Q.append(ff.m.y9, 71);
        Q.append(ff.m.w9, 72);
        Q.append(ff.m.x9, 73);
        Q.append(ff.m.z9, 74);
        Q.append(ff.m.v9, 75);
        Q.append(ff.m.Ma, 76);
        Q.append(ff.m.oa, 77);
        Q.append(ff.m.Va, 78);
        Q.append(ff.m.V9, 80);
        Q.append(ff.m.U9, 81);
        Q.append(ff.m.Oa, 82);
        Q.append(ff.m.Sa, 83);
        Q.append(ff.m.Ra, 84);
        Q.append(ff.m.Qa, 85);
        Q.append(ff.m.Pa, 86);
        Q.append(ff.m.Ia, 97);
    }

    public static void A0(Object data, TypedArray a2, int attr, int orientation) {
        if (data == null) {
            return;
        }
        int i2 = a2.peekValue(attr).type;
        if (i2 != 3) {
            int i3 = -2;
            boolean z2 = false;
            if (i2 != 5) {
                int i4 = a2.getInt(attr, 0);
                if (i4 != -4) {
                    i3 = (i4 == -3 || !(i4 == -2 || i4 == -1)) ? 0 : i4;
                } else {
                    z2 = true;
                }
            } else {
                i3 = a2.getDimensionPixelSize(attr, 0);
            }
            if (data instanceof ConstraintLayout.b) {
                ConstraintLayout.b bVar = (ConstraintLayout.b) data;
                if (orientation == 0) {
                    ((ViewGroup.MarginLayoutParams) bVar).width = i3;
                    bVar.y0 = z2;
                    return;
                }
                ((ViewGroup.MarginLayoutParams) bVar).height = i3;
                bVar.z0 = z2;
                return;
            } else if (data instanceof b) {
                b bVar2 = (b) data;
                if (orientation == 0) {
                    bVar2.w0 = i3;
                    bVar2.G1 = z2;
                    return;
                }
                bVar2.x0 = i3;
                bVar2.H1 = z2;
                return;
            } else if (data instanceof a.C0144a) {
                a.C0144a c0144a = (a.C0144a) data;
                if (orientation == 0) {
                    c0144a.b(23, i3);
                    c0144a.d(80, z2);
                    return;
                }
                c0144a.b(21, i3);
                c0144a.d(81, z2);
                return;
            } else {
                return;
            }
        }
        B0(data, a2.getString(attr), orientation);
    }

    public static void B0(Object data, String value, int orientation) {
        if (value == null) {
            return;
        }
        int indexOf = value.indexOf(61);
        int length = value.length();
        if (indexOf <= 0 || indexOf >= length - 1) {
            return;
        }
        String substring = value.substring(0, indexOf);
        String substring2 = value.substring(indexOf + 1);
        if (substring2.length() > 0) {
            String trim = substring.trim();
            String trim2 = substring2.trim();
            if (N1.equalsIgnoreCase(trim)) {
                if (data instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) data;
                    if (orientation == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    C0(bVar, trim2);
                    return;
                } else if (data instanceof b) {
                    ((b) data).T0 = trim2;
                    return;
                } else if (data instanceof a.C0144a) {
                    ((a.C0144a) data).c(5, trim2);
                    return;
                } else {
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(trim)) {
                    float parseFloat = Float.parseFloat(trim2);
                    if (data instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) data;
                        if (orientation == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.j0 = parseFloat;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.k0 = parseFloat;
                        }
                    } else if (data instanceof b) {
                        b bVar3 = (b) data;
                        if (orientation == 0) {
                            bVar3.w0 = 0;
                            bVar3.p1 = parseFloat;
                        } else {
                            bVar3.x0 = 0;
                            bVar3.o1 = parseFloat;
                        }
                    } else if (data instanceof a.C0144a) {
                        a.C0144a c0144a = (a.C0144a) data;
                        if (orientation == 0) {
                            c0144a.b(23, 0);
                            c0144a.a(39, parseFloat);
                        } else {
                            c0144a.b(21, 0);
                            c0144a.a(40, parseFloat);
                        }
                    }
                } else if (!O1.equalsIgnoreCase(trim)) {
                } else {
                    float max = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(trim2)));
                    if (data instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) data;
                        if (orientation == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.t0 = max;
                            bVar4.n0 = 2;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.u0 = max;
                            bVar4.o0 = 2;
                        }
                    } else if (data instanceof b) {
                        b bVar5 = (b) data;
                        if (orientation == 0) {
                            bVar5.w0 = 0;
                            bVar5.y1 = max;
                            bVar5.s1 = 2;
                        } else {
                            bVar5.x0 = 0;
                            bVar5.z1 = max;
                            bVar5.t1 = 2;
                        }
                    } else if (data instanceof a.C0144a) {
                        a.C0144a c0144a2 = (a.C0144a) data;
                        if (orientation == 0) {
                            c0144a2.b(23, 0);
                            c0144a2.b(54, 2);
                        } else {
                            c0144a2.b(21, 0);
                            c0144a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void C0(ConstraintLayout.b params, String value) {
        float f2 = Float.NaN;
        int i2 = -1;
        if (value != null) {
            int length = value.length();
            int indexOf = value.indexOf(44);
            int i3 = 0;
            if (indexOf > 0 && indexOf < length - 1) {
                String substring = value.substring(0, indexOf);
                if (substring.equalsIgnoreCase(bx.y4)) {
                    i2 = 0;
                } else if (substring.equalsIgnoreCase("H")) {
                    i2 = 1;
                }
                i3 = indexOf + 1;
            }
            int indexOf2 = value.indexOf(58);
            try {
                if (indexOf2 >= 0 && indexOf2 < length - 1) {
                    String substring2 = value.substring(i3, indexOf2);
                    String substring3 = value.substring(indexOf2 + 1);
                    if (substring2.length() > 0 && substring3.length() > 0) {
                        float parseFloat = Float.parseFloat(substring2);
                        float parseFloat2 = Float.parseFloat(substring3);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i2 == 1) {
                                f2 = Math.abs(parseFloat2 / parseFloat);
                            } else {
                                f2 = Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                } else {
                    String substring4 = value.substring(i3);
                    if (substring4.length() > 0) {
                        f2 = Float.parseFloat(substring4);
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        params.g0 = value;
        params.h0 = f2;
        params.i0 = i2;
    }

    private String F1(int side) {
        switch (side) {
            case 1:
                return "left";
            case 2:
                return "right";
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return com.anythink.expressad.foundation.d.c.bR;
            case 7:
                return "end";
            default:
                return AdError.UNDEFINED_DOMAIN;
        }
    }

    private void G0(Context ctx, a c2, TypedArray a2, boolean override) {
        if (override) {
            H0(ctx, c2, a2);
            return;
        }
        int indexCount = a2.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = a2.getIndex(i2);
            if (index != ff.m.e4 && ff.m.A4 != index && ff.m.B4 != index) {
                c2.d.o = true;
                c2.e.u0 = true;
                c2.c.a = true;
                c2.f.n = true;
            }
            switch (P.get(index)) {
                case 1:
                    b bVar = c2.e;
                    bVar.K0 = y0(a2, index, bVar.K0);
                    break;
                case 2:
                    b bVar2 = c2.e;
                    bVar2.d1 = a2.getDimensionPixelSize(index, bVar2.d1);
                    break;
                case 3:
                    b bVar3 = c2.e;
                    bVar3.J0 = y0(a2, index, bVar3.J0);
                    break;
                case 4:
                    b bVar4 = c2.e;
                    bVar4.I0 = y0(a2, index, bVar4.I0);
                    break;
                case 5:
                    c2.e.T0 = a2.getString(index);
                    break;
                case 6:
                    b bVar5 = c2.e;
                    bVar5.X0 = a2.getDimensionPixelOffset(index, bVar5.X0);
                    break;
                case 7:
                    b bVar6 = c2.e;
                    bVar6.Y0 = a2.getDimensionPixelOffset(index, bVar6.Y0);
                    break;
                case 8:
                    b bVar7 = c2.e;
                    bVar7.e1 = a2.getDimensionPixelSize(index, bVar7.e1);
                    break;
                case 9:
                    b bVar8 = c2.e;
                    bVar8.Q0 = y0(a2, index, bVar8.Q0);
                    break;
                case 10:
                    b bVar9 = c2.e;
                    bVar9.P0 = y0(a2, index, bVar9.P0);
                    break;
                case 11:
                    b bVar10 = c2.e;
                    bVar10.k1 = a2.getDimensionPixelSize(index, bVar10.k1);
                    break;
                case 12:
                    b bVar11 = c2.e;
                    bVar11.l1 = a2.getDimensionPixelSize(index, bVar11.l1);
                    break;
                case 13:
                    b bVar12 = c2.e;
                    bVar12.h1 = a2.getDimensionPixelSize(index, bVar12.h1);
                    break;
                case 14:
                    b bVar13 = c2.e;
                    bVar13.j1 = a2.getDimensionPixelSize(index, bVar13.j1);
                    break;
                case 15:
                    b bVar14 = c2.e;
                    bVar14.m1 = a2.getDimensionPixelSize(index, bVar14.m1);
                    break;
                case 16:
                    b bVar15 = c2.e;
                    bVar15.i1 = a2.getDimensionPixelSize(index, bVar15.i1);
                    break;
                case 17:
                    b bVar16 = c2.e;
                    bVar16.y0 = a2.getDimensionPixelOffset(index, bVar16.y0);
                    break;
                case 18:
                    b bVar17 = c2.e;
                    bVar17.z0 = a2.getDimensionPixelOffset(index, bVar17.z0);
                    break;
                case 19:
                    b bVar18 = c2.e;
                    bVar18.A0 = a2.getFloat(index, bVar18.A0);
                    break;
                case 20:
                    b bVar19 = c2.e;
                    bVar19.R0 = a2.getFloat(index, bVar19.R0);
                    break;
                case 21:
                    b bVar20 = c2.e;
                    bVar20.x0 = a2.getLayoutDimension(index, bVar20.x0);
                    break;
                case 22:
                    d dVar = c2.c;
                    dVar.b = a2.getInt(index, dVar.b);
                    d dVar2 = c2.c;
                    dVar2.b = N[dVar2.b];
                    break;
                case 23:
                    b bVar21 = c2.e;
                    bVar21.w0 = a2.getLayoutDimension(index, bVar21.w0);
                    break;
                case 24:
                    b bVar22 = c2.e;
                    bVar22.a1 = a2.getDimensionPixelSize(index, bVar22.a1);
                    break;
                case 25:
                    b bVar23 = c2.e;
                    bVar23.C0 = y0(a2, index, bVar23.C0);
                    break;
                case 26:
                    b bVar24 = c2.e;
                    bVar24.D0 = y0(a2, index, bVar24.D0);
                    break;
                case 27:
                    b bVar25 = c2.e;
                    bVar25.Z0 = a2.getInt(index, bVar25.Z0);
                    break;
                case 28:
                    b bVar26 = c2.e;
                    bVar26.b1 = a2.getDimensionPixelSize(index, bVar26.b1);
                    break;
                case 29:
                    b bVar27 = c2.e;
                    bVar27.E0 = y0(a2, index, bVar27.E0);
                    break;
                case 30:
                    b bVar28 = c2.e;
                    bVar28.F0 = y0(a2, index, bVar28.F0);
                    break;
                case 31:
                    b bVar29 = c2.e;
                    bVar29.f1 = a2.getDimensionPixelSize(index, bVar29.f1);
                    break;
                case 32:
                    b bVar30 = c2.e;
                    bVar30.N0 = y0(a2, index, bVar30.N0);
                    break;
                case 33:
                    b bVar31 = c2.e;
                    bVar31.O0 = y0(a2, index, bVar31.O0);
                    break;
                case 34:
                    b bVar32 = c2.e;
                    bVar32.c1 = a2.getDimensionPixelSize(index, bVar32.c1);
                    break;
                case 35:
                    b bVar33 = c2.e;
                    bVar33.H0 = y0(a2, index, bVar33.H0);
                    break;
                case 36:
                    b bVar34 = c2.e;
                    bVar34.G0 = y0(a2, index, bVar34.G0);
                    break;
                case 37:
                    b bVar35 = c2.e;
                    bVar35.S0 = a2.getFloat(index, bVar35.S0);
                    break;
                case 38:
                    c2.a = a2.getResourceId(index, c2.a);
                    break;
                case 39:
                    b bVar36 = c2.e;
                    bVar36.p1 = a2.getFloat(index, bVar36.p1);
                    break;
                case 40:
                    b bVar37 = c2.e;
                    bVar37.o1 = a2.getFloat(index, bVar37.o1);
                    break;
                case 41:
                    b bVar38 = c2.e;
                    bVar38.q1 = a2.getInt(index, bVar38.q1);
                    break;
                case 42:
                    b bVar39 = c2.e;
                    bVar39.r1 = a2.getInt(index, bVar39.r1);
                    break;
                case 43:
                    d dVar3 = c2.c;
                    dVar3.d = a2.getFloat(index, dVar3.d);
                    break;
                case 44:
                    e eVar = c2.f;
                    eVar.z = true;
                    eVar.A = a2.getDimension(index, eVar.A);
                    break;
                case 45:
                    e eVar2 = c2.f;
                    eVar2.p = a2.getFloat(index, eVar2.p);
                    break;
                case 46:
                    e eVar3 = c2.f;
                    eVar3.q = a2.getFloat(index, eVar3.q);
                    break;
                case 47:
                    e eVar4 = c2.f;
                    eVar4.r = a2.getFloat(index, eVar4.r);
                    break;
                case 48:
                    e eVar5 = c2.f;
                    eVar5.s = a2.getFloat(index, eVar5.s);
                    break;
                case 49:
                    e eVar6 = c2.f;
                    eVar6.t = a2.getDimension(index, eVar6.t);
                    break;
                case 50:
                    e eVar7 = c2.f;
                    eVar7.u = a2.getDimension(index, eVar7.u);
                    break;
                case 51:
                    e eVar8 = c2.f;
                    eVar8.w = a2.getDimension(index, eVar8.w);
                    break;
                case 52:
                    e eVar9 = c2.f;
                    eVar9.x = a2.getDimension(index, eVar9.x);
                    break;
                case 53:
                    e eVar10 = c2.f;
                    eVar10.y = a2.getDimension(index, eVar10.y);
                    break;
                case 54:
                    b bVar40 = c2.e;
                    bVar40.s1 = a2.getInt(index, bVar40.s1);
                    break;
                case 55:
                    b bVar41 = c2.e;
                    bVar41.t1 = a2.getInt(index, bVar41.t1);
                    break;
                case 56:
                    b bVar42 = c2.e;
                    bVar42.u1 = a2.getDimensionPixelSize(index, bVar42.u1);
                    break;
                case 57:
                    b bVar43 = c2.e;
                    bVar43.v1 = a2.getDimensionPixelSize(index, bVar43.v1);
                    break;
                case 58:
                    b bVar44 = c2.e;
                    bVar44.w1 = a2.getDimensionPixelSize(index, bVar44.w1);
                    break;
                case 59:
                    b bVar45 = c2.e;
                    bVar45.x1 = a2.getDimensionPixelSize(index, bVar45.x1);
                    break;
                case 60:
                    e eVar11 = c2.f;
                    eVar11.o = a2.getFloat(index, eVar11.o);
                    break;
                case 61:
                    b bVar46 = c2.e;
                    bVar46.U0 = y0(a2, index, bVar46.U0);
                    break;
                case 62:
                    b bVar47 = c2.e;
                    bVar47.V0 = a2.getDimensionPixelSize(index, bVar47.V0);
                    break;
                case 63:
                    b bVar48 = c2.e;
                    bVar48.W0 = a2.getFloat(index, bVar48.W0);
                    break;
                case 64:
                    c cVar = c2.d;
                    cVar.p = y0(a2, index, cVar.p);
                    break;
                case 65:
                    if (a2.peekValue(index).type == 3) {
                        c2.d.r = a2.getString(index);
                        break;
                    } else {
                        c2.d.r = h9.n[a2.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    c2.d.t = a2.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = c2.d;
                    cVar2.w = a2.getFloat(index, cVar2.w);
                    break;
                case 68:
                    d dVar4 = c2.c;
                    dVar4.e = a2.getFloat(index, dVar4.e);
                    break;
                case 69:
                    c2.e.y1 = a2.getFloat(index, 1.0f);
                    break;
                case 70:
                    c2.e.z1 = a2.getFloat(index, 1.0f);
                    break;
                case 71:
                    break;
                case 72:
                    b bVar49 = c2.e;
                    bVar49.A1 = a2.getInt(index, bVar49.A1);
                    break;
                case 73:
                    b bVar50 = c2.e;
                    bVar50.B1 = a2.getDimensionPixelSize(index, bVar50.B1);
                    break;
                case 74:
                    c2.e.E1 = a2.getString(index);
                    break;
                case 75:
                    b bVar51 = c2.e;
                    bVar51.I1 = a2.getBoolean(index, bVar51.I1);
                    break;
                case 76:
                    c cVar3 = c2.d;
                    cVar3.s = a2.getInt(index, cVar3.s);
                    break;
                case 77:
                    c2.e.F1 = a2.getString(index);
                    break;
                case 78:
                    d dVar5 = c2.c;
                    dVar5.c = a2.getInt(index, dVar5.c);
                    break;
                case 79:
                    c cVar4 = c2.d;
                    cVar4.u = a2.getFloat(index, cVar4.u);
                    break;
                case 80:
                    b bVar52 = c2.e;
                    bVar52.G1 = a2.getBoolean(index, bVar52.G1);
                    break;
                case 81:
                    b bVar53 = c2.e;
                    bVar53.H1 = a2.getBoolean(index, bVar53.H1);
                    break;
                case 82:
                    c cVar5 = c2.d;
                    cVar5.q = a2.getInteger(index, cVar5.q);
                    break;
                case 83:
                    e eVar12 = c2.f;
                    eVar12.v = y0(a2, index, eVar12.v);
                    break;
                case 84:
                    c cVar6 = c2.d;
                    cVar6.y = a2.getInteger(index, cVar6.y);
                    break;
                case 85:
                    c cVar7 = c2.d;
                    cVar7.x = a2.getFloat(index, cVar7.x);
                    break;
                case 86:
                    int i3 = a2.peekValue(index).type;
                    if (i3 == 1) {
                        c2.d.B = a2.getResourceId(index, -1);
                        c cVar8 = c2.d;
                        if (cVar8.B != -1) {
                            cVar8.A = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (i3 == 3) {
                        c2.d.z = a2.getString(index);
                        if (c2.d.z.indexOf("/") > 0) {
                            c2.d.B = a2.getResourceId(index, -1);
                            c2.d.A = -2;
                            break;
                        } else {
                            c2.d.A = -1;
                            break;
                        }
                    } else {
                        c cVar9 = c2.d;
                        cVar9.A = a2.getInteger(index, cVar9.B);
                        break;
                    }
                case 87:
                    Integer.toHexString(index);
                    P.get(index);
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Integer.toHexString(index);
                    P.get(index);
                    break;
                case 91:
                    b bVar54 = c2.e;
                    bVar54.L0 = y0(a2, index, bVar54.L0);
                    break;
                case 92:
                    b bVar55 = c2.e;
                    bVar55.M0 = y0(a2, index, bVar55.M0);
                    break;
                case 93:
                    b bVar56 = c2.e;
                    bVar56.g1 = a2.getDimensionPixelSize(index, bVar56.g1);
                    break;
                case 94:
                    b bVar57 = c2.e;
                    bVar57.n1 = a2.getDimensionPixelSize(index, bVar57.n1);
                    break;
                case 95:
                    A0(c2.e, a2, index, 0);
                    break;
                case 96:
                    A0(c2.e, a2, index, 1);
                    break;
                case 97:
                    b bVar58 = c2.e;
                    bVar58.J1 = a2.getInt(index, bVar58.J1);
                    break;
            }
        }
        b bVar59 = c2.e;
        if (bVar59.E1 != null) {
            bVar59.D1 = null;
        }
    }

    private static String[] G1(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < charArray.length; i3++) {
            if (charArray[i3] == ',' && !z2) {
                arrayList.add(new String(charArray, i2, i3 - i2));
                i2 = i3 + 1;
            } else if (charArray[i3] == '\"') {
                z2 = !z2;
            }
        }
        arrayList.add(new String(charArray, i2, charArray.length - i2));
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static void H0(Context ctx, a c2, TypedArray a2) {
        int indexCount = a2.getIndexCount();
        a.C0144a c0144a = new a.C0144a();
        c2.h = c0144a;
        c2.d.o = false;
        c2.e.u0 = false;
        c2.c.a = false;
        c2.f.n = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = a2.getIndex(i2);
            switch (Q.get(index)) {
                case 2:
                    c0144a.b(2, a2.getDimensionPixelSize(index, c2.e.d1));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Integer.toHexString(index);
                    P.get(index);
                    break;
                case 5:
                    c0144a.c(5, a2.getString(index));
                    break;
                case 6:
                    c0144a.b(6, a2.getDimensionPixelOffset(index, c2.e.X0));
                    break;
                case 7:
                    c0144a.b(7, a2.getDimensionPixelOffset(index, c2.e.Y0));
                    break;
                case 8:
                    c0144a.b(8, a2.getDimensionPixelSize(index, c2.e.e1));
                    break;
                case 11:
                    c0144a.b(11, a2.getDimensionPixelSize(index, c2.e.k1));
                    break;
                case 12:
                    c0144a.b(12, a2.getDimensionPixelSize(index, c2.e.l1));
                    break;
                case 13:
                    c0144a.b(13, a2.getDimensionPixelSize(index, c2.e.h1));
                    break;
                case 14:
                    c0144a.b(14, a2.getDimensionPixelSize(index, c2.e.j1));
                    break;
                case 15:
                    c0144a.b(15, a2.getDimensionPixelSize(index, c2.e.m1));
                    break;
                case 16:
                    c0144a.b(16, a2.getDimensionPixelSize(index, c2.e.i1));
                    break;
                case 17:
                    c0144a.b(17, a2.getDimensionPixelOffset(index, c2.e.y0));
                    break;
                case 18:
                    c0144a.b(18, a2.getDimensionPixelOffset(index, c2.e.z0));
                    break;
                case 19:
                    c0144a.a(19, a2.getFloat(index, c2.e.A0));
                    break;
                case 20:
                    c0144a.a(20, a2.getFloat(index, c2.e.R0));
                    break;
                case 21:
                    c0144a.b(21, a2.getLayoutDimension(index, c2.e.x0));
                    break;
                case 22:
                    c0144a.b(22, N[a2.getInt(index, c2.c.b)]);
                    break;
                case 23:
                    c0144a.b(23, a2.getLayoutDimension(index, c2.e.w0));
                    break;
                case 24:
                    c0144a.b(24, a2.getDimensionPixelSize(index, c2.e.a1));
                    break;
                case 27:
                    c0144a.b(27, a2.getInt(index, c2.e.Z0));
                    break;
                case 28:
                    c0144a.b(28, a2.getDimensionPixelSize(index, c2.e.b1));
                    break;
                case 31:
                    c0144a.b(31, a2.getDimensionPixelSize(index, c2.e.f1));
                    break;
                case 34:
                    c0144a.b(34, a2.getDimensionPixelSize(index, c2.e.c1));
                    break;
                case 37:
                    c0144a.a(37, a2.getFloat(index, c2.e.S0));
                    break;
                case 38:
                    int resourceId = a2.getResourceId(index, c2.a);
                    c2.a = resourceId;
                    c0144a.b(38, resourceId);
                    break;
                case 39:
                    c0144a.a(39, a2.getFloat(index, c2.e.p1));
                    break;
                case 40:
                    c0144a.a(40, a2.getFloat(index, c2.e.o1));
                    break;
                case 41:
                    c0144a.b(41, a2.getInt(index, c2.e.q1));
                    break;
                case 42:
                    c0144a.b(42, a2.getInt(index, c2.e.r1));
                    break;
                case 43:
                    c0144a.a(43, a2.getFloat(index, c2.c.d));
                    break;
                case 44:
                    c0144a.d(44, true);
                    c0144a.a(44, a2.getDimension(index, c2.f.A));
                    break;
                case 45:
                    c0144a.a(45, a2.getFloat(index, c2.f.p));
                    break;
                case 46:
                    c0144a.a(46, a2.getFloat(index, c2.f.q));
                    break;
                case 47:
                    c0144a.a(47, a2.getFloat(index, c2.f.r));
                    break;
                case 48:
                    c0144a.a(48, a2.getFloat(index, c2.f.s));
                    break;
                case 49:
                    c0144a.a(49, a2.getDimension(index, c2.f.t));
                    break;
                case 50:
                    c0144a.a(50, a2.getDimension(index, c2.f.u));
                    break;
                case 51:
                    c0144a.a(51, a2.getDimension(index, c2.f.w));
                    break;
                case 52:
                    c0144a.a(52, a2.getDimension(index, c2.f.x));
                    break;
                case 53:
                    c0144a.a(53, a2.getDimension(index, c2.f.y));
                    break;
                case 54:
                    c0144a.b(54, a2.getInt(index, c2.e.s1));
                    break;
                case 55:
                    c0144a.b(55, a2.getInt(index, c2.e.t1));
                    break;
                case 56:
                    c0144a.b(56, a2.getDimensionPixelSize(index, c2.e.u1));
                    break;
                case 57:
                    c0144a.b(57, a2.getDimensionPixelSize(index, c2.e.v1));
                    break;
                case 58:
                    c0144a.b(58, a2.getDimensionPixelSize(index, c2.e.w1));
                    break;
                case 59:
                    c0144a.b(59, a2.getDimensionPixelSize(index, c2.e.x1));
                    break;
                case 60:
                    c0144a.a(60, a2.getFloat(index, c2.f.o));
                    break;
                case 62:
                    c0144a.b(62, a2.getDimensionPixelSize(index, c2.e.V0));
                    break;
                case 63:
                    c0144a.a(63, a2.getFloat(index, c2.e.W0));
                    break;
                case 64:
                    c0144a.b(64, y0(a2, index, c2.d.p));
                    break;
                case 65:
                    if (a2.peekValue(index).type == 3) {
                        c0144a.c(65, a2.getString(index));
                        break;
                    } else {
                        c0144a.c(65, h9.n[a2.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    c0144a.b(66, a2.getInt(index, 0));
                    break;
                case 67:
                    c0144a.a(67, a2.getFloat(index, c2.d.w));
                    break;
                case 68:
                    c0144a.a(68, a2.getFloat(index, c2.c.e));
                    break;
                case 69:
                    c0144a.a(69, a2.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0144a.a(70, a2.getFloat(index, 1.0f));
                    break;
                case 71:
                    break;
                case 72:
                    c0144a.b(72, a2.getInt(index, c2.e.A1));
                    break;
                case 73:
                    c0144a.b(73, a2.getDimensionPixelSize(index, c2.e.B1));
                    break;
                case 74:
                    c0144a.c(74, a2.getString(index));
                    break;
                case 75:
                    c0144a.d(75, a2.getBoolean(index, c2.e.I1));
                    break;
                case 76:
                    c0144a.b(76, a2.getInt(index, c2.d.s));
                    break;
                case 77:
                    c0144a.c(77, a2.getString(index));
                    break;
                case 78:
                    c0144a.b(78, a2.getInt(index, c2.c.c));
                    break;
                case 79:
                    c0144a.a(79, a2.getFloat(index, c2.d.u));
                    break;
                case 80:
                    c0144a.d(80, a2.getBoolean(index, c2.e.G1));
                    break;
                case 81:
                    c0144a.d(81, a2.getBoolean(index, c2.e.H1));
                    break;
                case 82:
                    c0144a.b(82, a2.getInteger(index, c2.d.q));
                    break;
                case 83:
                    c0144a.b(83, y0(a2, index, c2.f.v));
                    break;
                case 84:
                    c0144a.b(84, a2.getInteger(index, c2.d.y));
                    break;
                case 85:
                    c0144a.a(85, a2.getFloat(index, c2.d.x));
                    break;
                case 86:
                    int i3 = a2.peekValue(index).type;
                    if (i3 == 1) {
                        c2.d.B = a2.getResourceId(index, -1);
                        c0144a.b(89, c2.d.B);
                        c cVar = c2.d;
                        if (cVar.B != -1) {
                            cVar.A = -2;
                            c0144a.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (i3 == 3) {
                        c2.d.z = a2.getString(index);
                        c0144a.c(90, c2.d.z);
                        if (c2.d.z.indexOf("/") > 0) {
                            c2.d.B = a2.getResourceId(index, -1);
                            c0144a.b(89, c2.d.B);
                            c2.d.A = -2;
                            c0144a.b(88, -2);
                            break;
                        } else {
                            c2.d.A = -1;
                            c0144a.b(88, -1);
                            break;
                        }
                    } else {
                        c cVar2 = c2.d;
                        cVar2.A = a2.getInteger(index, cVar2.B);
                        c0144a.b(88, c2.d.A);
                        break;
                    }
                case 87:
                    Integer.toHexString(index);
                    P.get(index);
                    break;
                case 93:
                    c0144a.b(93, a2.getDimensionPixelSize(index, c2.e.g1));
                    break;
                case 94:
                    c0144a.b(94, a2.getDimensionPixelSize(index, c2.e.n1));
                    break;
                case 95:
                    A0(c0144a, a2, index, 0);
                    break;
                case 96:
                    A0(c0144a, a2, index, 1);
                    break;
                case 97:
                    c0144a.b(97, a2.getInt(index, c2.e.J1));
                    break;
                case 98:
                    if (ge.H0) {
                        int resourceId2 = a2.getResourceId(index, c2.a);
                        c2.a = resourceId2;
                        if (resourceId2 == -1) {
                            c2.b = a2.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (a2.peekValue(index).type == 3) {
                        c2.b = a2.getString(index);
                        break;
                    } else {
                        c2.a = a2.getResourceId(index, c2.a);
                        break;
                    }
                case 99:
                    c0144a.d(99, a2.getBoolean(index, c2.e.B0));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void R0(a c2, int type, float value) {
        if (type == 19) {
            c2.e.A0 = value;
        } else if (type == 20) {
            c2.e.R0 = value;
        } else if (type == 37) {
            c2.e.S0 = value;
        } else if (type == 60) {
            c2.f.o = value;
        } else if (type == 63) {
            c2.e.W0 = value;
        } else if (type == 79) {
            c2.d.u = value;
        } else if (type == 85) {
            c2.d.x = value;
        } else if (type == 39) {
            c2.e.p1 = value;
        } else if (type != 40) {
            switch (type) {
                case 43:
                    c2.c.d = value;
                    return;
                case 44:
                    e eVar = c2.f;
                    eVar.A = value;
                    eVar.z = true;
                    return;
                case 45:
                    c2.f.p = value;
                    return;
                case 46:
                    c2.f.q = value;
                    return;
                case 47:
                    c2.f.r = value;
                    return;
                case 48:
                    c2.f.s = value;
                    return;
                case 49:
                    c2.f.t = value;
                    return;
                case 50:
                    c2.f.u = value;
                    return;
                case 51:
                    c2.f.w = value;
                    return;
                case 52:
                    c2.f.x = value;
                    return;
                case 53:
                    c2.f.y = value;
                    return;
                default:
                    switch (type) {
                        case 67:
                            c2.d.w = value;
                            return;
                        case 68:
                            c2.c.e = value;
                            return;
                        case 69:
                            c2.e.y1 = value;
                            return;
                        case 70:
                            c2.e.z1 = value;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            c2.e.o1 = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void S0(a c2, int type, int value) {
        if (type == 6) {
            c2.e.X0 = value;
        } else if (type == 7) {
            c2.e.Y0 = value;
        } else if (type == 8) {
            c2.e.e1 = value;
        } else if (type == 27) {
            c2.e.Z0 = value;
        } else if (type == 28) {
            c2.e.b1 = value;
        } else if (type == 41) {
            c2.e.q1 = value;
        } else if (type == 42) {
            c2.e.r1 = value;
        } else if (type == 61) {
            c2.e.U0 = value;
        } else if (type == 62) {
            c2.e.V0 = value;
        } else if (type == 72) {
            c2.e.A1 = value;
        } else if (type == 73) {
            c2.e.B1 = value;
        } else if (type == 88) {
            c2.d.A = value;
        } else if (type != 89) {
            switch (type) {
                case 2:
                    c2.e.d1 = value;
                    return;
                case 11:
                    c2.e.k1 = value;
                    return;
                case 12:
                    c2.e.l1 = value;
                    return;
                case 13:
                    c2.e.h1 = value;
                    return;
                case 14:
                    c2.e.j1 = value;
                    return;
                case 15:
                    c2.e.m1 = value;
                    return;
                case 16:
                    c2.e.i1 = value;
                    return;
                case 17:
                    c2.e.y0 = value;
                    return;
                case 18:
                    c2.e.z0 = value;
                    return;
                case 31:
                    c2.e.f1 = value;
                    return;
                case 34:
                    c2.e.c1 = value;
                    return;
                case 38:
                    c2.a = value;
                    return;
                case 64:
                    c2.d.p = value;
                    return;
                case 66:
                    c2.d.t = value;
                    return;
                case 76:
                    c2.d.s = value;
                    return;
                case 78:
                    c2.c.c = value;
                    return;
                case 93:
                    c2.e.g1 = value;
                    return;
                case 94:
                    c2.e.n1 = value;
                    return;
                case 97:
                    c2.e.J1 = value;
                    return;
                default:
                    switch (type) {
                        case 21:
                            c2.e.x0 = value;
                            return;
                        case 22:
                            c2.c.b = value;
                            return;
                        case 23:
                            c2.e.w0 = value;
                            return;
                        case 24:
                            c2.e.a1 = value;
                            return;
                        default:
                            switch (type) {
                                case 54:
                                    c2.e.s1 = value;
                                    return;
                                case 55:
                                    c2.e.t1 = value;
                                    return;
                                case 56:
                                    c2.e.u1 = value;
                                    return;
                                case 57:
                                    c2.e.v1 = value;
                                    return;
                                case 58:
                                    c2.e.w1 = value;
                                    return;
                                case 59:
                                    c2.e.x1 = value;
                                    return;
                                default:
                                    switch (type) {
                                        case 82:
                                            c2.d.q = value;
                                            return;
                                        case 83:
                                            c2.f.v = value;
                                            return;
                                        case 84:
                                            c2.d.y = value;
                                            return;
                                        default:
                                            return;
                                    }
                            }
                    }
            }
        } else {
            c2.d.B = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void T0(a c2, int type, String value) {
        if (type == 5) {
            c2.e.T0 = value;
        } else if (type == 65) {
            c2.d.r = value;
        } else if (type == 74) {
            b bVar = c2.e;
            bVar.E1 = value;
            bVar.D1 = null;
        } else if (type == 77) {
            c2.e.F1 = value;
        } else if (type != 90) {
        } else {
            c2.d.z = value;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void U0(a c2, int type, boolean value) {
        if (type == 44) {
            c2.f.z = value;
        } else if (type == 75) {
            c2.e.I1 = value;
        } else if (type == 80) {
            c2.e.G1 = value;
        } else if (type != 81) {
        } else {
            c2.e.H1 = value;
        }
    }

    private int[] Z(View view, String referenceIdString) {
        int i2;
        Object l2;
        String[] split = referenceIdString.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = ff.g.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (l2 = ((ConstraintLayout) view.getParent()).l(0, trim)) != null && (l2 instanceof Integer)) {
                i2 = ((Integer) l2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }

    private void d0(int leftId, int leftSide, int rightId, int rightSide, int[] chainIds, float[] weights, int style, int left, int right) {
        if (chainIds.length >= 2) {
            if (weights != null && weights.length != chainIds.length) {
                throw new IllegalArgumentException("must have 2 or more widgets in a chain");
            }
            if (weights != null) {
                i0(chainIds[0]).e.p1 = weights[0];
            }
            i0(chainIds[0]).e.q1 = style;
            L(chainIds[0], left, leftId, leftSide, -1);
            for (int i2 = 1; i2 < chainIds.length; i2++) {
                int i3 = chainIds[i2];
                int i4 = i2 - 1;
                L(chainIds[i2], left, chainIds[i4], right, -1);
                L(chainIds[i4], right, chainIds[i2], left, -1);
                if (weights != null) {
                    i0(chainIds[i2]).e.p1 = weights[i2];
                }
            }
            L(chainIds[chainIds.length - 1], right, rightId, rightSide, -1);
            return;
        }
        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
    }

    private void h(we.b attributeType, String... attributeName) {
        for (int i2 = 0; i2 < attributeName.length; i2++) {
            if (this.T1.containsKey(attributeName[i2])) {
                we weVar = this.T1.get(attributeName[i2]);
                if (weVar != null && weVar.j() != attributeType) {
                    StringBuilder G2 = wo1.G("ConstraintAttribute is already a ");
                    G2.append(weVar.j().name());
                    throw new IllegalArgumentException(G2.toString());
                }
            } else {
                this.T1.put(attributeName[i2], new we(attributeName[i2], attributeType));
            }
        }
    }

    private a h0(Context context, AttributeSet attrs, boolean override) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, override ? ff.m.R8 : ff.m.c4);
        G0(context, aVar, obtainStyledAttributes, override);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    private a i0(int id) {
        if (!this.V1.containsKey(Integer.valueOf(id))) {
            this.V1.put(Integer.valueOf(id), new a());
        }
        return this.V1.get(Integer.valueOf(id));
    }

    public static String m0(int v2) {
        Field[] declaredFields;
        for (Field field : af.class.getDeclaredFields()) {
            if (field.getName().contains("_") && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == v2) {
                        return field.getName();
                    }
                    continue;
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return "UNKNOWN";
    }

    public static String p0(Context context, int resourceId, XmlPullParser pullParser) {
        StringBuilder G2 = wo1.G(".(");
        G2.append(qd.i(context, resourceId));
        G2.append(".xml:");
        G2.append(pullParser.getLineNumber());
        G2.append(") \"");
        G2.append(pullParser.getName());
        G2.append("\"");
        return G2.toString();
    }

    public static a w(Context context, XmlPullParser parser) {
        AttributeSet asAttributeSet = Xml.asAttributeSet(parser);
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(asAttributeSet, ff.m.R8);
        H0(context, aVar, obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int y0(TypedArray a2, int index, int def) {
        int resourceId = a2.getResourceId(index, def);
        return resourceId == -1 ? a2.getInt(index, -1) : resourceId;
    }

    public void A(int viewId, int toView) {
        if (toView == 0) {
            x(viewId, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            x(viewId, toView, 7, 0, toView, 6, 0, 0.5f);
        }
    }

    public void A1(int viewId, float bias) {
        i0(viewId).e.S0 = bias;
    }

    public void B(int centerID, int startId, int startSide, int startMargin, int endId, int endSide, int endMargin, float bias) {
        L(centerID, 6, startId, startSide, startMargin);
        L(centerID, 7, endId, endSide, endMargin);
        a aVar = this.V1.get(Integer.valueOf(centerID));
        if (aVar != null) {
            aVar.e.R0 = bias;
        }
    }

    public void B1(int viewId, int chainStyle) {
        i0(viewId).e.r1 = chainStyle;
    }

    public void C(int viewId, int toView) {
        if (toView == 0) {
            x(viewId, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            x(viewId, toView, 4, 0, toView, 3, 0, 0.5f);
        }
    }

    public void C1(int viewId, float weight) {
        i0(viewId).e.o1 = weight;
    }

    public void D(int centerID, int topId, int topSide, int topMargin, int bottomId, int bottomSide, int bottomMargin, float bias) {
        L(centerID, 3, topId, topSide, topMargin);
        L(centerID, 4, bottomId, bottomSide, bottomMargin);
        a aVar = this.V1.get(Integer.valueOf(centerID));
        if (aVar != null) {
            aVar.e.S0 = bias;
        }
    }

    public void D0(a set, String attributes) {
        String[] split = attributes.split(",");
        for (int i2 = 0; i2 < split.length; i2++) {
            String[] split2 = split[i2].split(AppCenter.KEY_VALUE_DELIMITER);
            if (split2.length == 2) {
                set.q(split2[0], Float.parseFloat(split2[1]));
            } else {
                String str = split[i2];
            }
        }
    }

    public void D1(int viewId, int visibility) {
        i0(viewId).c.b = visibility;
    }

    public void E(int viewId) {
        this.V1.remove(Integer.valueOf(viewId));
    }

    public void E0(a set, String attributes) {
        String[] split = attributes.split(",");
        for (int i2 = 0; i2 < split.length; i2++) {
            String[] split2 = split[i2].split(AppCenter.KEY_VALUE_DELIMITER);
            if (split2.length == 2) {
                set.q(split2[0], Integer.decode(split2[1]).intValue());
            } else {
                String str = split[i2];
            }
        }
    }

    public void E1(int viewId, int visibilityMode) {
        i0(viewId).c.c = visibilityMode;
    }

    public void F(int viewId, int anchor) {
        a aVar;
        if (!this.V1.containsKey(Integer.valueOf(viewId)) || (aVar = this.V1.get(Integer.valueOf(viewId))) == null) {
            return;
        }
        switch (anchor) {
            case 1:
                b bVar = aVar.e;
                bVar.D0 = -1;
                bVar.C0 = -1;
                bVar.a1 = -1;
                bVar.h1 = Integer.MIN_VALUE;
                return;
            case 2:
                b bVar2 = aVar.e;
                bVar2.F0 = -1;
                bVar2.E0 = -1;
                bVar2.b1 = -1;
                bVar2.j1 = Integer.MIN_VALUE;
                return;
            case 3:
                b bVar3 = aVar.e;
                bVar3.H0 = -1;
                bVar3.G0 = -1;
                bVar3.c1 = 0;
                bVar3.i1 = Integer.MIN_VALUE;
                return;
            case 4:
                b bVar4 = aVar.e;
                bVar4.I0 = -1;
                bVar4.J0 = -1;
                bVar4.d1 = 0;
                bVar4.k1 = Integer.MIN_VALUE;
                return;
            case 5:
                b bVar5 = aVar.e;
                bVar5.K0 = -1;
                bVar5.L0 = -1;
                bVar5.M0 = -1;
                bVar5.g1 = 0;
                bVar5.n1 = Integer.MIN_VALUE;
                return;
            case 6:
                b bVar6 = aVar.e;
                bVar6.N0 = -1;
                bVar6.O0 = -1;
                bVar6.f1 = 0;
                bVar6.m1 = Integer.MIN_VALUE;
                return;
            case 7:
                b bVar7 = aVar.e;
                bVar7.P0 = -1;
                bVar7.Q0 = -1;
                bVar7.e1 = 0;
                bVar7.l1 = Integer.MIN_VALUE;
                return;
            case 8:
                b bVar8 = aVar.e;
                bVar8.W0 = -1.0f;
                bVar8.V0 = -1;
                bVar8.U0 = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void F0(a set, String attributes) {
        String[] G12 = G1(attributes);
        for (int i2 = 0; i2 < G12.length; i2++) {
            String[] split = G12[i2].split(AppCenter.KEY_VALUE_DELIMITER);
            String str = G12[i2];
            set.s(split[0], split[1]);
        }
    }

    public void G(Context context, int constraintLayoutId) {
        H((ConstraintLayout) LayoutInflater.from(context).inflate(constraintLayoutId, (ViewGroup) null));
    }

    public void H(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.V1.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.U1 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.V1.containsKey(Integer.valueOf(id))) {
                this.V1.put(Integer.valueOf(id), new a());
            }
            a aVar = this.V1.get(Integer.valueOf(id));
            if (aVar != null) {
                aVar.g = we.d(this.T1, childAt);
                aVar.k(id, bVar);
                aVar.c.b = childAt.getVisibility();
                aVar.c.d = childAt.getAlpha();
                aVar.f.o = childAt.getRotation();
                aVar.f.p = childAt.getRotationX();
                aVar.f.q = childAt.getRotationY();
                aVar.f.r = childAt.getScaleX();
                aVar.f.s = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != zg2.s || pivotY != zg2.s) {
                    e eVar = aVar.f;
                    eVar.t = pivotX;
                    eVar.u = pivotY;
                }
                aVar.f.w = childAt.getTranslationX();
                aVar.f.x = childAt.getTranslationY();
                aVar.f.y = childAt.getTranslationZ();
                e eVar2 = aVar.f;
                if (eVar2.z) {
                    eVar2.A = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.e.I1 = barrier.getAllowsGoneWidget();
                    aVar.e.D1 = barrier.getReferencedIds();
                    aVar.e.A1 = barrier.getType();
                    aVar.e.B1 = barrier.getMargin();
                }
            }
        }
    }

    public void H1(Writer writer, ConstraintLayout layout, int flags) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((flags & 1) == 1) {
            new g(writer, layout, flags).i();
        } else {
            new f(writer, layout, flags).g();
        }
        writer.write("\n---------------------------------------------\n");
    }

    public void I(af set) {
        this.V1.clear();
        for (Integer num : set.V1.keySet()) {
            a aVar = set.V1.get(num);
            if (aVar != null) {
                this.V1.put(num, aVar.clone());
            }
        }
    }

    public void I0(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.U1 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.V1.containsKey(Integer.valueOf(id))) {
                this.V1.put(Integer.valueOf(id), new a());
            }
            a aVar = this.V1.get(Integer.valueOf(id));
            if (aVar != null) {
                if (!aVar.e.u0) {
                    aVar.k(id, bVar);
                    if (childAt instanceof xe) {
                        aVar.e.D1 = ((xe) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            aVar.e.I1 = barrier.getAllowsGoneWidget();
                            aVar.e.A1 = barrier.getType();
                            aVar.e.B1 = barrier.getMargin();
                        }
                    }
                    aVar.e.u0 = true;
                }
                d dVar = aVar.c;
                if (!dVar.a) {
                    dVar.b = childAt.getVisibility();
                    aVar.c.d = childAt.getAlpha();
                    aVar.c.a = true;
                }
                e eVar = aVar.f;
                if (!eVar.n) {
                    eVar.n = true;
                    eVar.o = childAt.getRotation();
                    aVar.f.p = childAt.getRotationX();
                    aVar.f.q = childAt.getRotationY();
                    aVar.f.r = childAt.getScaleX();
                    aVar.f.s = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != zg2.s || pivotY != zg2.s) {
                        e eVar2 = aVar.f;
                        eVar2.t = pivotX;
                        eVar2.u = pivotY;
                    }
                    aVar.f.w = childAt.getTranslationX();
                    aVar.f.x = childAt.getTranslationY();
                    aVar.f.y = childAt.getTranslationZ();
                    e eVar3 = aVar.f;
                    if (eVar3.z) {
                        eVar3.A = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void J(bf constraints) {
        int childCount = constraints.getChildCount();
        this.V1.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraints.getChildAt(i2);
            bf.a aVar = (bf.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.U1 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.V1.containsKey(Integer.valueOf(id))) {
                this.V1.put(Integer.valueOf(id), new a());
            }
            a aVar2 = this.V1.get(Integer.valueOf(id));
            if (aVar2 != null) {
                if (childAt instanceof xe) {
                    aVar2.m((xe) childAt, id, aVar);
                }
                aVar2.l(id, aVar);
            }
        }
    }

    public void J0(af set) {
        for (Integer num : set.V1.keySet()) {
            int intValue = num.intValue();
            a aVar = set.V1.get(num);
            if (!this.V1.containsKey(Integer.valueOf(intValue))) {
                this.V1.put(Integer.valueOf(intValue), new a());
            }
            a aVar2 = this.V1.get(Integer.valueOf(intValue));
            if (aVar2 != null) {
                b bVar = aVar2.e;
                if (!bVar.u0) {
                    bVar.a(aVar.e);
                }
                d dVar = aVar2.c;
                if (!dVar.a) {
                    dVar.a(aVar.c);
                }
                e eVar = aVar2.f;
                if (!eVar.n) {
                    eVar.a(aVar.f);
                }
                c cVar = aVar2.d;
                if (!cVar.o) {
                    cVar.a(aVar.d);
                }
                for (String str : aVar.g.keySet()) {
                    if (!aVar2.g.containsKey(str)) {
                        aVar2.g.put(str, aVar.g.get(str));
                    }
                }
            }
        }
    }

    public void K(int startID, int startSide, int endID, int endSide) {
        if (!this.V1.containsKey(Integer.valueOf(startID))) {
            this.V1.put(Integer.valueOf(startID), new a());
        }
        a aVar = this.V1.get(Integer.valueOf(startID));
        if (aVar == null) {
            return;
        }
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    b bVar = aVar.e;
                    bVar.C0 = endID;
                    bVar.D0 = -1;
                    return;
                } else if (endSide == 2) {
                    b bVar2 = aVar.e;
                    bVar2.D0 = endID;
                    bVar2.C0 = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("left to "), F1(endSide), " undefined"));
                }
            case 2:
                if (endSide == 1) {
                    b bVar3 = aVar.e;
                    bVar3.E0 = endID;
                    bVar3.F0 = -1;
                    return;
                } else if (endSide == 2) {
                    b bVar4 = aVar.e;
                    bVar4.F0 = endID;
                    bVar4.E0 = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), F1(endSide), " undefined"));
                }
            case 3:
                if (endSide == 3) {
                    b bVar5 = aVar.e;
                    bVar5.G0 = endID;
                    bVar5.H0 = -1;
                    bVar5.K0 = -1;
                    bVar5.L0 = -1;
                    bVar5.M0 = -1;
                    return;
                } else if (endSide == 4) {
                    b bVar6 = aVar.e;
                    bVar6.H0 = endID;
                    bVar6.G0 = -1;
                    bVar6.K0 = -1;
                    bVar6.L0 = -1;
                    bVar6.M0 = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), F1(endSide), " undefined"));
                }
            case 4:
                if (endSide == 4) {
                    b bVar7 = aVar.e;
                    bVar7.J0 = endID;
                    bVar7.I0 = -1;
                    bVar7.K0 = -1;
                    bVar7.L0 = -1;
                    bVar7.M0 = -1;
                    return;
                } else if (endSide == 3) {
                    b bVar8 = aVar.e;
                    bVar8.I0 = endID;
                    bVar8.J0 = -1;
                    bVar8.K0 = -1;
                    bVar8.L0 = -1;
                    bVar8.M0 = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), F1(endSide), " undefined"));
                }
            case 5:
                if (endSide == 5) {
                    b bVar9 = aVar.e;
                    bVar9.K0 = endID;
                    bVar9.J0 = -1;
                    bVar9.I0 = -1;
                    bVar9.G0 = -1;
                    bVar9.H0 = -1;
                    return;
                } else if (endSide == 3) {
                    b bVar10 = aVar.e;
                    bVar10.L0 = endID;
                    bVar10.J0 = -1;
                    bVar10.I0 = -1;
                    bVar10.G0 = -1;
                    bVar10.H0 = -1;
                    return;
                } else if (endSide == 4) {
                    b bVar11 = aVar.e;
                    bVar11.M0 = endID;
                    bVar11.J0 = -1;
                    bVar11.I0 = -1;
                    bVar11.G0 = -1;
                    bVar11.H0 = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), F1(endSide), " undefined"));
                }
            case 6:
                if (endSide == 6) {
                    b bVar12 = aVar.e;
                    bVar12.O0 = endID;
                    bVar12.N0 = -1;
                    return;
                } else if (endSide == 7) {
                    b bVar13 = aVar.e;
                    bVar13.N0 = endID;
                    bVar13.O0 = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), F1(endSide), " undefined"));
                }
            case 7:
                if (endSide == 7) {
                    b bVar14 = aVar.e;
                    bVar14.Q0 = endID;
                    bVar14.P0 = -1;
                    return;
                } else if (endSide == 6) {
                    b bVar15 = aVar.e;
                    bVar15.P0 = endID;
                    bVar15.Q0 = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), F1(endSide), " undefined"));
                }
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(F1(startSide));
                sb.append(" to ");
                throw new IllegalArgumentException(wo1.C(sb, F1(endSide), " unknown"));
        }
    }

    public void K0(String attributeName) {
        this.T1.remove(attributeName);
    }

    public void L(int startID, int startSide, int endID, int endSide, int margin) {
        if (!this.V1.containsKey(Integer.valueOf(startID))) {
            this.V1.put(Integer.valueOf(startID), new a());
        }
        a aVar = this.V1.get(Integer.valueOf(startID));
        if (aVar == null) {
            return;
        }
        switch (startSide) {
            case 1:
                if (endSide == 1) {
                    b bVar = aVar.e;
                    bVar.C0 = endID;
                    bVar.D0 = -1;
                } else if (endSide == 2) {
                    b bVar2 = aVar.e;
                    bVar2.D0 = endID;
                    bVar2.C0 = -1;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("Left to "), F1(endSide), " undefined"));
                }
                aVar.e.a1 = margin;
                return;
            case 2:
                if (endSide == 1) {
                    b bVar3 = aVar.e;
                    bVar3.E0 = endID;
                    bVar3.F0 = -1;
                } else if (endSide == 2) {
                    b bVar4 = aVar.e;
                    bVar4.F0 = endID;
                    bVar4.E0 = -1;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), F1(endSide), " undefined"));
                }
                aVar.e.b1 = margin;
                return;
            case 3:
                if (endSide == 3) {
                    b bVar5 = aVar.e;
                    bVar5.G0 = endID;
                    bVar5.H0 = -1;
                    bVar5.K0 = -1;
                    bVar5.L0 = -1;
                    bVar5.M0 = -1;
                } else if (endSide == 4) {
                    b bVar6 = aVar.e;
                    bVar6.H0 = endID;
                    bVar6.G0 = -1;
                    bVar6.K0 = -1;
                    bVar6.L0 = -1;
                    bVar6.M0 = -1;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), F1(endSide), " undefined"));
                }
                aVar.e.c1 = margin;
                return;
            case 4:
                if (endSide == 4) {
                    b bVar7 = aVar.e;
                    bVar7.J0 = endID;
                    bVar7.I0 = -1;
                    bVar7.K0 = -1;
                    bVar7.L0 = -1;
                    bVar7.M0 = -1;
                } else if (endSide == 3) {
                    b bVar8 = aVar.e;
                    bVar8.I0 = endID;
                    bVar8.J0 = -1;
                    bVar8.K0 = -1;
                    bVar8.L0 = -1;
                    bVar8.M0 = -1;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), F1(endSide), " undefined"));
                }
                aVar.e.d1 = margin;
                return;
            case 5:
                if (endSide == 5) {
                    b bVar9 = aVar.e;
                    bVar9.K0 = endID;
                    bVar9.J0 = -1;
                    bVar9.I0 = -1;
                    bVar9.G0 = -1;
                    bVar9.H0 = -1;
                    return;
                } else if (endSide == 3) {
                    b bVar10 = aVar.e;
                    bVar10.L0 = endID;
                    bVar10.J0 = -1;
                    bVar10.I0 = -1;
                    bVar10.G0 = -1;
                    bVar10.H0 = -1;
                    return;
                } else if (endSide == 4) {
                    b bVar11 = aVar.e;
                    bVar11.M0 = endID;
                    bVar11.J0 = -1;
                    bVar11.I0 = -1;
                    bVar11.G0 = -1;
                    bVar11.H0 = -1;
                    return;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), F1(endSide), " undefined"));
                }
            case 6:
                if (endSide == 6) {
                    b bVar12 = aVar.e;
                    bVar12.O0 = endID;
                    bVar12.N0 = -1;
                } else if (endSide == 7) {
                    b bVar13 = aVar.e;
                    bVar13.N0 = endID;
                    bVar13.O0 = -1;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), F1(endSide), " undefined"));
                }
                aVar.e.f1 = margin;
                return;
            case 7:
                if (endSide == 7) {
                    b bVar14 = aVar.e;
                    bVar14.Q0 = endID;
                    bVar14.P0 = -1;
                } else if (endSide == 6) {
                    b bVar15 = aVar.e;
                    bVar15.P0 = endID;
                    bVar15.Q0 = -1;
                } else {
                    throw new IllegalArgumentException(wo1.C(wo1.G("right to "), F1(endSide), " undefined"));
                }
                aVar.e.e1 = margin;
                return;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append(F1(startSide));
                sb.append(" to ");
                throw new IllegalArgumentException(wo1.C(sb, F1(endSide), " unknown"));
        }
    }

    public void L0(int viewId) {
        a aVar;
        if (!this.V1.containsKey(Integer.valueOf(viewId)) || (aVar = this.V1.get(Integer.valueOf(viewId))) == null) {
            return;
        }
        b bVar = aVar.e;
        int i2 = bVar.D0;
        int i3 = bVar.E0;
        if (i2 == -1 && i3 == -1) {
            int i4 = bVar.N0;
            int i5 = bVar.P0;
            if (i4 != -1 || i5 != -1) {
                if (i4 != -1 && i5 != -1) {
                    L(i4, 7, i5, 6, 0);
                    L(i5, 6, i2, 7, 0);
                } else if (i5 != -1) {
                    int i6 = bVar.F0;
                    if (i6 != -1) {
                        L(i2, 7, i6, 7, 0);
                    } else {
                        int i7 = bVar.C0;
                        if (i7 != -1) {
                            L(i5, 6, i7, 6, 0);
                        }
                    }
                }
            }
            F(viewId, 6);
            F(viewId, 7);
            return;
        }
        if (i2 != -1 && i3 != -1) {
            L(i2, 2, i3, 1, 0);
            L(i3, 1, i2, 2, 0);
        } else {
            int i8 = bVar.F0;
            if (i8 != -1) {
                L(i2, 2, i8, 2, 0);
            } else {
                int i9 = bVar.C0;
                if (i9 != -1) {
                    L(i3, 1, i9, 1, 0);
                }
            }
        }
        F(viewId, 1);
        F(viewId, 2);
    }

    public void M(int viewId, int id, int radius, float angle) {
        b bVar = i0(viewId).e;
        bVar.U0 = id;
        bVar.V0 = radius;
        bVar.W0 = angle;
    }

    public void M0(int viewId) {
        if (this.V1.containsKey(Integer.valueOf(viewId))) {
            a aVar = this.V1.get(Integer.valueOf(viewId));
            if (aVar == null) {
                return;
            }
            b bVar = aVar.e;
            int i2 = bVar.H0;
            int i3 = bVar.I0;
            if (i2 != -1 || i3 != -1) {
                if (i2 != -1 && i3 != -1) {
                    L(i2, 4, i3, 3, 0);
                    L(i3, 3, i2, 4, 0);
                } else {
                    int i4 = bVar.J0;
                    if (i4 != -1) {
                        L(i2, 4, i4, 4, 0);
                    } else {
                        int i5 = bVar.G0;
                        if (i5 != -1) {
                            L(i3, 3, i5, 3, 0);
                        }
                    }
                }
            }
        }
        F(viewId, 3);
        F(viewId, 4);
    }

    public void N(int viewId, int height) {
        i0(viewId).e.t1 = height;
    }

    public void N0(int viewId, float alpha) {
        i0(viewId).c.d = alpha;
    }

    public void O(int viewId, int width) {
        i0(viewId).e.s1 = width;
    }

    public void O0(int viewId, boolean apply) {
        i0(viewId).f.z = apply;
    }

    public void P(int viewId, int height) {
        i0(viewId).e.x0 = height;
    }

    public void P0(int id, int type) {
        i0(id).e.C1 = type;
    }

    public void Q(int viewId, int height) {
        i0(viewId).e.v1 = height;
    }

    public void Q0(int viewId, String attributeName, int value) {
        i0(viewId).p(attributeName, value);
    }

    public void R(int viewId, int width) {
        i0(viewId).e.u1 = width;
    }

    public void S(int viewId, int height) {
        i0(viewId).e.x1 = height;
    }

    public void T(int viewId, int width) {
        i0(viewId).e.w1 = width;
    }

    public void U(int viewId, float percent) {
        i0(viewId).e.z1 = percent;
    }

    public void V(int viewId, float percent) {
        i0(viewId).e.y1 = percent;
    }

    public void V0(int viewId, String ratio) {
        i0(viewId).e.T0 = ratio;
    }

    public void W(int viewId, int width) {
        i0(viewId).e.w0 = width;
    }

    public void W0(int viewId, int position) {
        i0(viewId).e.X0 = position;
    }

    public void X(int viewId, boolean constrained) {
        i0(viewId).e.H1 = constrained;
    }

    public void X0(int viewId, int position) {
        i0(viewId).e.Y0 = position;
    }

    public void Y(int viewId, boolean constrained) {
        i0(viewId).e.G1 = constrained;
    }

    public void Y0(int viewId, float elevation) {
        i0(viewId).f.A = elevation;
        i0(viewId).f.z = true;
    }

    public void Z0(int viewId, String attributeName, float value) {
        i0(viewId).q(attributeName, value);
    }

    public void a0(int guidelineID, int orientation) {
        b bVar = i0(guidelineID).e;
        bVar.t0 = true;
        bVar.Z0 = orientation;
    }

    public void a1(boolean forceId) {
        this.U1 = forceId;
    }

    public void b0(int id, int direction, int margin, int... referenced) {
        b bVar = i0(id).e;
        bVar.C1 = 1;
        bVar.A1 = direction;
        bVar.B1 = margin;
        bVar.t0 = false;
        bVar.D1 = referenced;
    }

    public void b1(int viewId, int anchor, int value) {
        a i02 = i0(viewId);
        switch (anchor) {
            case 1:
                i02.e.h1 = value;
                return;
            case 2:
                i02.e.j1 = value;
                return;
            case 3:
                i02.e.i1 = value;
                return;
            case 4:
                i02.e.k1 = value;
                return;
            case 5:
                i02.e.n1 = value;
                return;
            case 6:
                i02.e.m1 = value;
                return;
            case 7:
                i02.e.l1 = value;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void c0(int leftId, int leftSide, int rightId, int rightSide, int[] chainIds, float[] weights, int style) {
        d0(leftId, leftSide, rightId, rightSide, chainIds, weights, style, 1, 2);
    }

    public void c1(int guidelineID, int margin) {
        i0(guidelineID).e.y0 = margin;
        i0(guidelineID).e.z0 = -1;
        i0(guidelineID).e.A0 = -1.0f;
    }

    public void d1(int guidelineID, int margin) {
        i0(guidelineID).e.z0 = margin;
        i0(guidelineID).e.y0 = -1;
        i0(guidelineID).e.A0 = -1.0f;
    }

    public void e0(int startId, int startSide, int endId, int endSide, int[] chainIds, float[] weights, int style) {
        d0(startId, startSide, endId, endSide, chainIds, weights, style, 6, 7);
    }

    public void e1(int guidelineID, float ratio) {
        i0(guidelineID).e.A0 = ratio;
        i0(guidelineID).e.z0 = -1;
        i0(guidelineID).e.y0 = -1;
    }

    public void f0(int topId, int topSide, int bottomId, int bottomSide, int[] chainIds, float[] weights, int style) {
        if (chainIds.length >= 2) {
            if (weights != null && weights.length != chainIds.length) {
                throw new IllegalArgumentException("must have 2 or more widgets in a chain");
            }
            if (weights != null) {
                i0(chainIds[0]).e.o1 = weights[0];
            }
            i0(chainIds[0]).e.r1 = style;
            L(chainIds[0], 3, topId, topSide, 0);
            for (int i2 = 1; i2 < chainIds.length; i2++) {
                int i3 = chainIds[i2];
                int i4 = i2 - 1;
                L(chainIds[i2], 3, chainIds[i4], 4, 0);
                L(chainIds[i4], 4, chainIds[i2], 3, 0);
                if (weights != null) {
                    i0(chainIds[i2]).e.o1 = weights[i2];
                }
            }
            L(chainIds[chainIds.length - 1], 4, bottomId, bottomSide, 0);
            return;
        }
        throw new IllegalArgumentException("must have 2 or more widgets in a chain");
    }

    public void f1(int viewId, float bias) {
        i0(viewId).e.R0 = bias;
    }

    public void g0(ie scene, int... ids) {
        HashSet hashSet;
        Integer[] numArr;
        Set<Integer> keySet = this.V1.keySet();
        if (ids.length != 0) {
            hashSet = new HashSet();
            for (int i2 : ids) {
                hashSet.add(Integer.valueOf(i2));
            }
        } else {
            hashSet = new HashSet(keySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            a aVar = this.V1.get(num);
            if (aVar != null) {
                sb.append("<Constraint id=");
                sb.append(num);
                sb.append(" \n");
                aVar.e.b(scene, sb);
                sb.append("/>\n");
            }
        }
        System.out.println(sb.toString());
    }

    public void g1(int viewId, int chainStyle) {
        i0(viewId).e.q1 = chainStyle;
    }

    public void h1(int viewId, float weight) {
        i0(viewId).e.p1 = weight;
    }

    public void i(String... attributeName) {
        h(we.b.COLOR_TYPE, attributeName);
    }

    public void i1(int viewId, String attributeName, int value) {
        i0(viewId).r(attributeName, value);
    }

    public void j(String... attributeName) {
        h(we.b.FLOAT_TYPE, attributeName);
    }

    public boolean j0(int viewId) {
        return i0(viewId).f.z;
    }

    public void j1(int viewId, int behavior) {
        if (behavior < 0 || behavior > 3) {
            return;
        }
        i0(viewId).e.J1 = behavior;
    }

    public void k(String... attributeName) {
        h(we.b.INT_TYPE, attributeName);
    }

    public a k0(int id) {
        if (this.V1.containsKey(Integer.valueOf(id))) {
            return this.V1.get(Integer.valueOf(id));
        }
        return null;
    }

    public void k1(int viewId, int anchor, int value) {
        a i02 = i0(viewId);
        switch (anchor) {
            case 1:
                i02.e.a1 = value;
                return;
            case 2:
                i02.e.b1 = value;
                return;
            case 3:
                i02.e.c1 = value;
                return;
            case 4:
                i02.e.d1 = value;
                return;
            case 5:
                i02.e.g1 = value;
                return;
            case 6:
                i02.e.f1 = value;
                return;
            case 7:
                i02.e.e1 = value;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void l(String... attributeName) {
        h(we.b.STRING_TYPE, attributeName);
    }

    public HashMap<String, we> l0() {
        return this.T1;
    }

    public void l1(int id, int... referenced) {
        i0(id).e.D1 = referenced;
    }

    public void m(int viewId, int leftId, int rightId) {
        L(viewId, 1, leftId, leftId == 0 ? 1 : 2, 0);
        L(viewId, 2, rightId, rightId == 0 ? 2 : 1, 0);
        if (leftId != 0) {
            L(leftId, 2, viewId, 1, 0);
        }
        if (rightId != 0) {
            L(rightId, 1, viewId, 2, 0);
        }
    }

    public void m1(int viewId, float rotation) {
        i0(viewId).f.o = rotation;
    }

    public void n(int viewId, int leftId, int rightId) {
        L(viewId, 6, leftId, leftId == 0 ? 6 : 7, 0);
        L(viewId, 7, rightId, rightId == 0 ? 7 : 6, 0);
        if (leftId != 0) {
            L(leftId, 7, viewId, 6, 0);
        }
        if (rightId != 0) {
            L(rightId, 6, viewId, 7, 0);
        }
    }

    public int n0(int viewId) {
        return i0(viewId).e.x0;
    }

    public void n1(int viewId, float rotationX) {
        i0(viewId).f.p = rotationX;
    }

    public void o(int viewId, int topId, int bottomId) {
        L(viewId, 3, topId, topId == 0 ? 3 : 4, 0);
        L(viewId, 4, bottomId, bottomId == 0 ? 4 : 3, 0);
        if (topId != 0) {
            L(topId, 4, viewId, 3, 0);
        }
        if (bottomId != 0) {
            L(bottomId, 3, viewId, 4, 0);
        }
    }

    public int[] o0() {
        Integer[] numArr = (Integer[]) this.V1.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }

    public void o1(int viewId, float rotationY) {
        i0(viewId).f.q = rotationY;
    }

    public void p(ConstraintLayout constraintLayout) {
        a aVar;
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.V1.containsKey(Integer.valueOf(id))) {
                qd.k(childAt);
            } else if (this.U1 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (this.V1.containsKey(Integer.valueOf(id)) && (aVar = this.V1.get(Integer.valueOf(id))) != null) {
                    we.r(childAt, aVar.g);
                }
            }
        }
    }

    public void p1(int viewId, float scaleX) {
        i0(viewId).f.r = scaleX;
    }

    public void q(af cs) {
        for (a aVar : cs.V1.values()) {
            if (aVar.h != null) {
                if (aVar.b != null) {
                    for (Integer num : this.V1.keySet()) {
                        a k02 = k0(num.intValue());
                        String str = k02.e.F1;
                        if (str != null && aVar.b.matches(str)) {
                            aVar.h.e(k02);
                            k02.g.putAll((HashMap) aVar.g.clone());
                        }
                    }
                } else {
                    aVar.h.e(k0(aVar.a));
                }
            }
        }
    }

    public a q0(int mId) {
        return i0(mId);
    }

    public void q1(int viewId, float scaleY) {
        i0(viewId).f.s = scaleY;
    }

    public void r(ConstraintLayout constraintLayout) {
        t(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public int[] r0(int id) {
        int[] iArr = i0(id).e.D1;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public void r1(int viewId, String attributeName, String value) {
        i0(viewId).s(attributeName, value);
    }

    public void s(xe helper, zb child, ConstraintLayout.b layoutParams, SparseArray<zb> mapIdToWidget) {
        a aVar;
        int id = helper.getId();
        if (this.V1.containsKey(Integer.valueOf(id)) && (aVar = this.V1.get(Integer.valueOf(id))) != null && (child instanceof ec)) {
            helper.z(aVar, (ec) child, layoutParams, mapIdToWidget);
        }
    }

    public int s0(int viewId) {
        return i0(viewId).c.b;
    }

    public void s1(int viewId, float transformPivotX, float transformPivotY) {
        e eVar = i0(viewId).f;
        eVar.u = transformPivotY;
        eVar.t = transformPivotX;
    }

    public void t(ConstraintLayout constraintLayout, boolean applyPostLayout) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.V1.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            if (!this.V1.containsKey(Integer.valueOf(id))) {
                qd.k(childAt);
            } else if (this.U1 && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            } else {
                if (id != -1 && this.V1.containsKey(Integer.valueOf(id))) {
                    hashSet.remove(Integer.valueOf(id));
                    a aVar = this.V1.get(Integer.valueOf(id));
                    if (aVar != null) {
                        if (childAt instanceof Barrier) {
                            aVar.e.C1 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(aVar.e.A1);
                            barrier.setMargin(aVar.e.B1);
                            barrier.setAllowsGoneWidget(aVar.e.I1);
                            b bVar = aVar.e;
                            int[] iArr = bVar.D1;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = bVar.E1;
                                if (str != null) {
                                    bVar.D1 = Z(barrier, str);
                                    barrier.setReferencedIds(aVar.e.D1);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.e();
                        aVar.i(bVar2);
                        if (applyPostLayout) {
                            we.r(childAt, aVar.g);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.c;
                        if (dVar.c == 0) {
                            childAt.setVisibility(dVar.b);
                        }
                        childAt.setAlpha(aVar.c.d);
                        childAt.setRotation(aVar.f.o);
                        childAt.setRotationX(aVar.f.p);
                        childAt.setRotationY(aVar.f.q);
                        childAt.setScaleX(aVar.f.r);
                        childAt.setScaleY(aVar.f.s);
                        e eVar = aVar.f;
                        if (eVar.v != -1) {
                            View findViewById = ((View) childAt.getParent()).findViewById(aVar.f.v);
                            if (findViewById != null) {
                                float bottom = (findViewById.getBottom() + findViewById.getTop()) / 2.0f;
                                float right = (findViewById.getRight() + findViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    childAt.setPivotX(right - childAt.getLeft());
                                    childAt.setPivotY(bottom - childAt.getTop());
                                }
                            }
                        } else {
                            if (!Float.isNaN(eVar.t)) {
                                childAt.setPivotX(aVar.f.t);
                            }
                            if (!Float.isNaN(aVar.f.u)) {
                                childAt.setPivotY(aVar.f.u);
                            }
                        }
                        childAt.setTranslationX(aVar.f.w);
                        childAt.setTranslationY(aVar.f.x);
                        childAt.setTranslationZ(aVar.f.y);
                        e eVar2 = aVar.f;
                        if (eVar2.z) {
                            childAt.setElevation(eVar2.A);
                        }
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            a aVar2 = this.V1.get(num);
            if (aVar2 != null) {
                if (aVar2.e.C1 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.e;
                    int[] iArr2 = bVar3.D1;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.E1;
                        if (str2 != null) {
                            bVar3.D1 = Z(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.e.D1);
                        }
                    }
                    barrier2.setType(aVar2.e.A1);
                    barrier2.setMargin(aVar2.e.B1);
                    ConstraintLayout.b generateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.I();
                    aVar2.i(generateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, generateDefaultLayoutParams);
                }
                if (aVar2.e.t0) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b generateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.i(generateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, generateDefaultLayoutParams2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof xe) {
                ((xe) childAt2).r(constraintLayout);
            }
        }
    }

    public int t0(int viewId) {
        return i0(viewId).c.c;
    }

    public void t1(int viewId, float transformPivotX) {
        i0(viewId).f.t = transformPivotX;
    }

    public void u(int id, ConstraintLayout.b layoutParams) {
        a aVar;
        if (!this.V1.containsKey(Integer.valueOf(id)) || (aVar = this.V1.get(Integer.valueOf(id))) == null) {
            return;
        }
        aVar.i(layoutParams);
    }

    public int u0(int viewId) {
        return i0(viewId).e.w0;
    }

    public void u1(int viewId, float transformPivotY) {
        i0(viewId).f.u = transformPivotY;
    }

    public void v(ConstraintLayout constraintLayout) {
        t(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public boolean v0() {
        return this.U1;
    }

    public void v1(int viewId, float translationX, float translationY) {
        e eVar = i0(viewId).f;
        eVar.w = translationX;
        eVar.x = translationY;
    }

    public void w0(Context context, int resourceId) {
        XmlResourceParser xml = context.getResources().getXml(resourceId);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    a h02 = h0(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        h02.e.t0 = true;
                    }
                    this.V1.put(Integer.valueOf(h02.a), h02);
                    continue;
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public void w1(int viewId, float translationX) {
        i0(viewId).f.w = translationX;
    }

    public void x(int centerID, int firstID, int firstSide, int firstMargin, int secondId, int secondSide, int secondMargin, float bias) {
        if (firstMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (secondMargin < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (bias <= 0.0f || bias > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (firstSide == 1 || firstSide == 2) {
            L(centerID, 1, firstID, firstSide, firstMargin);
            L(centerID, 2, secondId, secondSide, secondMargin);
            a aVar = this.V1.get(Integer.valueOf(centerID));
            if (aVar != null) {
                aVar.e.R0 = bias;
            }
        } else if (firstSide != 6 && firstSide != 7) {
            L(centerID, 3, firstID, firstSide, firstMargin);
            L(centerID, 4, secondId, secondSide, secondMargin);
            a aVar2 = this.V1.get(Integer.valueOf(centerID));
            if (aVar2 != null) {
                aVar2.e.S0 = bias;
            }
        } else {
            L(centerID, 6, firstID, firstSide, firstMargin);
            L(centerID, 7, secondId, secondSide, secondMargin);
            a aVar3 = this.V1.get(Integer.valueOf(centerID));
            if (aVar3 != null) {
                aVar3.e.R0 = bias;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void x0(Context context, XmlPullParser parser) {
        a h02;
        try {
            int eventType = parser.getEventType();
            a aVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    char c2 = 65535;
                    if (eventType == 2) {
                        String name = parser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    c2 = 6;
                                    break;
                                }
                                break;
                            case -1984451626:
                                if (name.equals(aa.e.a)) {
                                    c2 = 7;
                                    break;
                                }
                                break;
                            case -1962203927:
                                if (name.equals(oe.d)) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 366511058:
                                if (name.equals(oe.f)) {
                                    c2 = '\t';
                                    break;
                                }
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case 1791837707:
                                if (name.equals(oe.e)) {
                                    c2 = '\b';
                                    break;
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                        }
                        switch (c2) {
                            case 0:
                                h02 = h0(context, Xml.asAttributeSet(parser), false);
                                aVar = h02;
                                break;
                            case 1:
                                h02 = h0(context, Xml.asAttributeSet(parser), true);
                                aVar = h02;
                                break;
                            case 2:
                                h02 = h0(context, Xml.asAttributeSet(parser), false);
                                b bVar = h02.e;
                                bVar.t0 = true;
                                bVar.u0 = true;
                                aVar = h02;
                                break;
                            case 3:
                                h02 = h0(context, Xml.asAttributeSet(parser), false);
                                h02.e.C1 = 1;
                                aVar = h02;
                                break;
                            case 4:
                                if (aVar != null) {
                                    aVar.c.b(context, Xml.asAttributeSet(parser));
                                    break;
                                } else {
                                    throw new RuntimeException(b + parser.getLineNumber());
                                }
                            case 5:
                                if (aVar != null) {
                                    aVar.f.b(context, Xml.asAttributeSet(parser));
                                    break;
                                } else {
                                    throw new RuntimeException(b + parser.getLineNumber());
                                }
                            case 6:
                                if (aVar != null) {
                                    aVar.e.c(context, Xml.asAttributeSet(parser));
                                    break;
                                } else {
                                    throw new RuntimeException(b + parser.getLineNumber());
                                }
                            case 7:
                                if (aVar != null) {
                                    aVar.d.b(context, Xml.asAttributeSet(parser));
                                    break;
                                } else {
                                    throw new RuntimeException(b + parser.getLineNumber());
                                }
                            case '\b':
                            case '\t':
                                if (aVar != null) {
                                    we.q(context, parser, aVar.g);
                                    break;
                                } else {
                                    throw new RuntimeException(b + parser.getLineNumber());
                                }
                        }
                    } else if (eventType == 3) {
                        String lowerCase = parser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            return;
                        }
                        if (c2 == 1 || c2 == 2 || c2 == 3) {
                            this.V1.put(Integer.valueOf(aVar.a), aVar);
                            aVar = null;
                        }
                    }
                } else {
                    parser.getName();
                }
                eventType = parser.next();
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }

    public void x1(int viewId, float translationY) {
        i0(viewId).f.x = translationY;
    }

    public void y(int viewId, int toView) {
        if (toView == 0) {
            x(viewId, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            x(viewId, toView, 2, 0, toView, 1, 0, 0.5f);
        }
    }

    public void y1(int viewId, float translationZ) {
        i0(viewId).f.y = translationZ;
    }

    public void z(int centerID, int leftId, int leftSide, int leftMargin, int rightId, int rightSide, int rightMargin, float bias) {
        L(centerID, 1, leftId, leftSide, leftMargin);
        L(centerID, 2, rightId, rightSide, rightMargin);
        a aVar = this.V1.get(Integer.valueOf(centerID));
        if (aVar != null) {
            aVar.e.R0 = bias;
        }
    }

    public void z0(a set, String attributes) {
        String[] split = attributes.split(",");
        for (int i2 = 0; i2 < split.length; i2++) {
            String[] split2 = split[i2].split(AppCenter.KEY_VALUE_DELIMITER);
            if (split2.length == 2) {
                set.p(split2[0], Color.parseColor(split2[1]));
            } else {
                String str = split[i2];
            }
        }
    }

    public void z1(boolean validate) {
        this.P1 = validate;
    }
}