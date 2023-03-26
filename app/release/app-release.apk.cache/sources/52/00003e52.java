package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import com.p7700g.p99005.kb;
import com.p7700g.p99005.yb;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: ConstraintReference.java */
/* loaded from: classes.dex */
public class db implements hb {
    private Object a;
    private float a0;
    public final kb b;
    private float b0;
    public eb d0;
    public eb e0;
    private Object f0;
    private zb g0;
    private HashMap<String, Integer> h0;
    private HashMap<String, Float> i0;
    public String c = null;
    public rb d = null;
    public int e = 0;
    public int f = 0;
    public float g = -1.0f;
    public float h = -1.0f;
    public float i = 0.5f;
    public float j = 0.5f;
    public int k = 0;
    public int l = 0;
    public int m = 0;
    public int n = 0;
    public int o = 0;
    public int p = 0;
    public int q = 0;
    public int r = 0;
    public int s = 0;
    public int t = 0;
    public int u = 0;
    public int v = 0;
    public int w = 0;
    public int x = 0;
    public float y = Float.NaN;
    public float z = Float.NaN;
    public float A = Float.NaN;
    public float B = Float.NaN;
    public float C = Float.NaN;
    public float D = Float.NaN;
    public float E = Float.NaN;
    public float F = Float.NaN;
    public float G = Float.NaN;
    public float H = Float.NaN;
    public float I = Float.NaN;
    public int J = 0;
    public Object K = null;
    public Object L = null;
    public Object M = null;
    public Object N = null;
    public Object O = null;
    public Object P = null;
    public Object Q = null;
    public Object R = null;
    public Object S = null;
    public Object T = null;
    public Object U = null;
    public Object V = null;
    public Object W = null;
    public Object X = null;
    public Object Y = null;
    public Object Z = null;
    public kb.c c0 = null;

    /* compiled from: ConstraintReference.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            kb.c.values();
            int[] iArr = new int[18];
            a = iArr;
            try {
                iArr[kb.c.LEFT_TO_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[kb.c.LEFT_TO_RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[kb.c.RIGHT_TO_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[kb.c.RIGHT_TO_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[kb.c.START_TO_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[kb.c.START_TO_END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[kb.c.END_TO_START.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[kb.c.END_TO_END.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[kb.c.TOP_TO_TOP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[kb.c.TOP_TO_BOTTOM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[kb.c.BOTTOM_TO_TOP.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[kb.c.BOTTOM_TO_BOTTOM.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[kb.c.BASELINE_TO_BOTTOM.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[kb.c.BASELINE_TO_TOP.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[kb.c.BASELINE_TO_BASELINE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[kb.c.CIRCULAR_CONSTRAINT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[kb.c.CENTER_HORIZONTALLY.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[kb.c.CENTER_VERTICALLY.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* compiled from: ConstraintReference.java */
    /* loaded from: classes.dex */
    public interface b {
        db a(kb kbVar);
    }

    /* compiled from: ConstraintReference.java */
    /* loaded from: classes.dex */
    public static class c extends Exception {
        private final ArrayList<String> s;

        public c(ArrayList<String> arrayList) {
            this.s = arrayList;
        }

        public ArrayList<String> f() {
            return this.s;
        }

        @Override // java.lang.Throwable
        public String toString() {
            StringBuilder G = wo1.G("IncorrectConstraintException: ");
            G.append(this.s.toString());
            return G.toString();
        }
    }

    public db(kb kbVar) {
        Object obj = eb.b;
        this.d0 = eb.b(obj);
        this.e0 = eb.b(obj);
        this.h0 = new HashMap<>();
        this.i0 = new HashMap<>();
        this.b = kbVar;
    }

    private Object C(Object obj) {
        if (obj == null) {
            return null;
        }
        return !(obj instanceof db) ? this.b.r(obj) : obj;
    }

    private zb P(Object obj) {
        if (obj instanceof hb) {
            return ((hb) obj).b();
        }
        return null;
    }

    private void i(zb zbVar, Object obj, kb.c cVar) {
        zb P = P(obj);
        if (P == null) {
            return;
        }
        int i = a.a[cVar.ordinal()];
        int ordinal = cVar.ordinal();
        if (ordinal != 17) {
            switch (ordinal) {
                case 0:
                    yb.b bVar = yb.b.LEFT;
                    zbVar.r(bVar).b(P.r(bVar), this.k, this.q, false);
                    return;
                case 1:
                    zbVar.r(yb.b.LEFT).b(P.r(yb.b.RIGHT), this.k, this.q, false);
                    return;
                case 2:
                    zbVar.r(yb.b.RIGHT).b(P.r(yb.b.LEFT), this.l, this.r, false);
                    return;
                case 3:
                    yb.b bVar2 = yb.b.RIGHT;
                    zbVar.r(bVar2).b(P.r(bVar2), this.l, this.r, false);
                    return;
                case 4:
                    yb.b bVar3 = yb.b.LEFT;
                    zbVar.r(bVar3).b(P.r(bVar3), this.m, this.s, false);
                    return;
                case 5:
                    zbVar.r(yb.b.LEFT).b(P.r(yb.b.RIGHT), this.m, this.s, false);
                    return;
                case 6:
                    zbVar.r(yb.b.RIGHT).b(P.r(yb.b.LEFT), this.n, this.t, false);
                    return;
                case 7:
                    yb.b bVar4 = yb.b.RIGHT;
                    zbVar.r(bVar4).b(P.r(bVar4), this.n, this.t, false);
                    return;
                case 8:
                    yb.b bVar5 = yb.b.TOP;
                    zbVar.r(bVar5).b(P.r(bVar5), this.o, this.u, false);
                    return;
                case 9:
                    zbVar.r(yb.b.TOP).b(P.r(yb.b.BOTTOM), this.o, this.u, false);
                    return;
                case 10:
                    zbVar.r(yb.b.BOTTOM).b(P.r(yb.b.TOP), this.p, this.v, false);
                    return;
                case 11:
                    yb.b bVar6 = yb.b.BOTTOM;
                    zbVar.r(bVar6).b(P.r(bVar6), this.p, this.v, false);
                    return;
                case 12:
                    yb.b bVar7 = yb.b.BASELINE;
                    zbVar.v0(bVar7, P, bVar7, this.w, this.x);
                    return;
                case 13:
                    zbVar.v0(yb.b.BASELINE, P, yb.b.TOP, this.w, this.x);
                    return;
                case 14:
                    zbVar.v0(yb.b.BASELINE, P, yb.b.BOTTOM, this.w, this.x);
                    return;
                default:
                    return;
            }
        }
        zbVar.m(P, this.a0, (int) this.b0);
    }

    private void y() {
        this.K = C(this.K);
        this.L = C(this.L);
        this.M = C(this.M);
        this.N = C(this.N);
        this.O = C(this.O);
        this.P = C(this.P);
        this.Q = C(this.Q);
        this.R = C(this.R);
        this.S = C(this.S);
        this.T = C(this.T);
        this.U = C(this.U);
        this.V = C(this.V);
        this.W = C(this.W);
        this.X = C(this.X);
        this.Y = C(this.Y);
    }

    public db A(Object obj) {
        this.c0 = kb.c.END_TO_END;
        this.R = obj;
        return this;
    }

    public db A0(Object obj) {
        this.c0 = kb.c.START_TO_END;
        this.P = obj;
        return this;
    }

    public db B(Object obj) {
        this.c0 = kb.c.END_TO_START;
        this.Q = obj;
        return this;
    }

    public db B0(Object obj) {
        this.c0 = kb.c.START_TO_START;
        this.O = obj;
        return this;
    }

    public db C0() {
        if (this.S != null) {
            this.c0 = kb.c.TOP_TO_TOP;
        } else {
            this.c0 = kb.c.TOP_TO_BOTTOM;
        }
        return this;
    }

    public float D() {
        return this.G;
    }

    public db D0(Object obj) {
        this.c0 = kb.c.TOP_TO_BOTTOM;
        this.T = obj;
        return this;
    }

    public eb E() {
        return this.e0;
    }

    public db E0(Object obj) {
        this.c0 = kb.c.TOP_TO_TOP;
        this.S = obj;
        return this;
    }

    public int F() {
        return this.e;
    }

    public db F0(float f) {
        this.D = f;
        return this;
    }

    public float G() {
        return this.g;
    }

    public db G0(float f) {
        this.E = f;
        return this;
    }

    public float H() {
        return this.y;
    }

    public db H0(float f) {
        this.F = f;
        return this;
    }

    public float I() {
        return this.z;
    }

    public void I0() throws c {
        ArrayList arrayList = new ArrayList();
        if (this.K != null && this.L != null) {
            arrayList.add("LeftToLeft and LeftToRight both defined");
        }
        if (this.M != null && this.N != null) {
            arrayList.add("RightToLeft and RightToRight both defined");
        }
        if (this.O != null && this.P != null) {
            arrayList.add("StartToStart and StartToEnd both defined");
        }
        if (this.Q != null && this.R != null) {
            arrayList.add("EndToStart and EndToEnd both defined");
        }
        if ((this.K != null || this.L != null || this.M != null || this.N != null) && (this.O != null || this.P != null || this.Q != null || this.R != null)) {
            arrayList.add("Both left/right and start/end constraints defined");
        }
        if (arrayList.size() > 0) {
            throw new c(arrayList);
        }
    }

    public float J() {
        return this.A;
    }

    public db J0(float f) {
        this.j = f;
        return this;
    }

    public float K() {
        return this.B;
    }

    public db K0(int i) {
        this.J = i;
        return this;
    }

    public float L() {
        return this.C;
    }

    public db L0(eb ebVar) {
        return y0(ebVar);
    }

    public float M() {
        return this.H;
    }

    public float N() {
        return this.I;
    }

    public String O() {
        return this.c;
    }

    public float Q() {
        return this.D;
    }

    public float R() {
        return this.E;
    }

    public float S() {
        return this.F;
    }

    public int T(int i) {
        return this.f;
    }

    public float U() {
        return this.h;
    }

    public Object V() {
        return this.f0;
    }

    public eb W() {
        return this.d0;
    }

    public db X(eb ebVar) {
        return r0(ebVar);
    }

    public db Y(float f) {
        this.i = f;
        return this;
    }

    public db Z() {
        if (this.K != null) {
            this.c0 = kb.c.LEFT_TO_LEFT;
        } else {
            this.c0 = kb.c.LEFT_TO_RIGHT;
        }
        return this;
    }

    @Override // com.p7700g.p99005.hb
    public void a() {
        if (this.g0 == null) {
            return;
        }
        rb rbVar = this.d;
        if (rbVar != null) {
            rbVar.a();
        }
        this.d0.j(this.b, this.g0, 0);
        this.e0.j(this.b, this.g0, 1);
        y();
        i(this.g0, this.K, kb.c.LEFT_TO_LEFT);
        i(this.g0, this.L, kb.c.LEFT_TO_RIGHT);
        i(this.g0, this.M, kb.c.RIGHT_TO_LEFT);
        i(this.g0, this.N, kb.c.RIGHT_TO_RIGHT);
        i(this.g0, this.O, kb.c.START_TO_START);
        i(this.g0, this.P, kb.c.START_TO_END);
        i(this.g0, this.Q, kb.c.END_TO_START);
        i(this.g0, this.R, kb.c.END_TO_END);
        i(this.g0, this.S, kb.c.TOP_TO_TOP);
        i(this.g0, this.T, kb.c.TOP_TO_BOTTOM);
        i(this.g0, this.U, kb.c.BOTTOM_TO_TOP);
        i(this.g0, this.V, kb.c.BOTTOM_TO_BOTTOM);
        i(this.g0, this.W, kb.c.BASELINE_TO_BASELINE);
        i(this.g0, this.X, kb.c.BASELINE_TO_TOP);
        i(this.g0, this.Y, kb.c.BASELINE_TO_BOTTOM);
        i(this.g0, this.Z, kb.c.CIRCULAR_CONSTRAINT);
        int i = this.e;
        if (i != 0) {
            this.g0.B1(i);
        }
        int i2 = this.f;
        if (i2 != 0) {
            this.g0.W1(i2);
        }
        float f = this.g;
        if (f != -1.0f) {
            this.g0.F1(f);
        }
        float f2 = this.h;
        if (f2 != -1.0f) {
            this.g0.a2(f2);
        }
        this.g0.A1(this.i);
        this.g0.V1(this.j);
        zb zbVar = this.g0;
        mb mbVar = zbVar.T;
        mbVar.h = this.y;
        mbVar.i = this.z;
        mbVar.j = this.A;
        mbVar.k = this.B;
        mbVar.l = this.C;
        mbVar.m = this.D;
        mbVar.n = this.E;
        mbVar.o = this.F;
        mbVar.p = this.H;
        mbVar.q = this.I;
        mbVar.r = this.G;
        int i3 = this.J;
        mbVar.t = i3;
        zbVar.b2(i3);
        HashMap<String, Integer> hashMap = this.h0;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                this.g0.T.w(str, aa.b.l, this.h0.get(str).intValue());
            }
        }
        HashMap<String, Float> hashMap2 = this.i0;
        if (hashMap2 != null) {
            for (String str2 : hashMap2.keySet()) {
                this.g0.T.v(str2, aa.b.k, this.i0.get(str2).floatValue());
            }
        }
    }

    public db a0(Object obj) {
        this.c0 = kb.c.LEFT_TO_LEFT;
        this.K = obj;
        return this;
    }

    @Override // com.p7700g.p99005.hb
    public zb b() {
        if (this.g0 == null) {
            zb x = x();
            this.g0 = x;
            x.h1(this.f0);
        }
        return this.g0;
    }

    public db b0(Object obj) {
        this.c0 = kb.c.LEFT_TO_RIGHT;
        this.L = obj;
        return this;
    }

    @Override // com.p7700g.p99005.hb
    public void c(zb zbVar) {
        if (zbVar == null) {
            return;
        }
        this.g0 = zbVar;
        zbVar.h1(this.f0);
    }

    public db c0(int i) {
        kb.c cVar = this.c0;
        if (cVar != null) {
            int ordinal = cVar.ordinal();
            if (ordinal != 17) {
                switch (ordinal) {
                    case 0:
                    case 1:
                        this.k = i;
                        break;
                    case 2:
                    case 3:
                        this.l = i;
                        break;
                    case 4:
                    case 5:
                        this.m = i;
                        break;
                    case 6:
                    case 7:
                        this.n = i;
                        break;
                    case 8:
                    case 9:
                        this.o = i;
                        break;
                    case 10:
                    case 11:
                        this.p = i;
                        break;
                    case 12:
                    case 13:
                    case 14:
                        this.w = i;
                        break;
                }
            } else {
                this.b0 = i;
            }
        } else {
            this.k = i;
            this.l = i;
            this.m = i;
            this.n = i;
            this.o = i;
            this.p = i;
        }
        return this;
    }

    @Override // com.p7700g.p99005.hb
    public void d(Object obj) {
        this.a = obj;
    }

    public db d0(Object obj) {
        return c0(this.b.f(obj));
    }

    @Override // com.p7700g.p99005.hb
    public rb e() {
        return this.d;
    }

    public db e0(int i) {
        kb.c cVar = this.c0;
        if (cVar != null) {
            switch (cVar.ordinal()) {
                case 0:
                case 1:
                    this.q = i;
                    break;
                case 2:
                case 3:
                    this.r = i;
                    break;
                case 4:
                case 5:
                    this.s = i;
                    break;
                case 6:
                case 7:
                    this.t = i;
                    break;
                case 8:
                case 9:
                    this.u = i;
                    break;
                case 10:
                case 11:
                    this.v = i;
                    break;
                case 12:
                case 13:
                case 14:
                    this.x = i;
                    break;
            }
        } else {
            this.q = i;
            this.r = i;
            this.s = i;
            this.t = i;
            this.u = i;
            this.v = i;
        }
        return this;
    }

    public void f(String str, int i) {
        this.h0.put(str, Integer.valueOf(i));
    }

    public db f0(Object obj) {
        return e0(this.b.f(obj));
    }

    public void g(String str, float f) {
        if (this.i0 == null) {
            this.i0 = new HashMap<>();
        }
        this.i0.put(str, Float.valueOf(f));
    }

    public db g0(float f) {
        this.y = f;
        return this;
    }

    @Override // com.p7700g.p99005.hb
    public Object getKey() {
        return this.a;
    }

    public db h(float f) {
        this.G = f;
        return this;
    }

    public db h0(float f) {
        this.z = f;
        return this;
    }

    public db i0() {
        if (this.M != null) {
            this.c0 = kb.c.RIGHT_TO_LEFT;
        } else {
            this.c0 = kb.c.RIGHT_TO_RIGHT;
        }
        return this;
    }

    public db j() {
        this.c0 = kb.c.BASELINE_TO_BASELINE;
        return this;
    }

    public db j0(Object obj) {
        this.c0 = kb.c.RIGHT_TO_LEFT;
        this.M = obj;
        return this;
    }

    public db k(Object obj) {
        this.c0 = kb.c.BASELINE_TO_BASELINE;
        this.W = obj;
        return this;
    }

    public db k0(Object obj) {
        this.c0 = kb.c.RIGHT_TO_RIGHT;
        this.N = obj;
        return this;
    }

    public db l(Object obj) {
        this.c0 = kb.c.BASELINE_TO_BOTTOM;
        this.Y = obj;
        return this;
    }

    public db l0(float f) {
        this.A = f;
        return this;
    }

    public db m(Object obj) {
        this.c0 = kb.c.BASELINE_TO_TOP;
        this.X = obj;
        return this;
    }

    public db m0(float f) {
        this.B = f;
        return this;
    }

    public db n(float f) {
        kb.c cVar = this.c0;
        if (cVar == null) {
            return this;
        }
        int ordinal = cVar.ordinal();
        if (ordinal != 15) {
            if (ordinal != 16) {
                switch (ordinal) {
                }
                return this;
            }
            this.j = f;
            return this;
        }
        this.i = f;
        return this;
    }

    public db n0(float f) {
        this.C = f;
        return this;
    }

    public db o() {
        if (this.U != null) {
            this.c0 = kb.c.BOTTOM_TO_TOP;
        } else {
            this.c0 = kb.c.BOTTOM_TO_BOTTOM;
        }
        return this;
    }

    public db o0(float f) {
        this.H = f;
        return this;
    }

    public db p(Object obj) {
        this.c0 = kb.c.BOTTOM_TO_BOTTOM;
        this.V = obj;
        return this;
    }

    public db p0(float f) {
        this.I = f;
        return this;
    }

    public db q(Object obj) {
        this.c0 = kb.c.BOTTOM_TO_TOP;
        this.U = obj;
        return this;
    }

    public void q0(rb rbVar) {
        this.d = rbVar;
        if (rbVar != null) {
            c(rbVar.b());
        }
    }

    public db r(Object obj) {
        Object C = C(obj);
        this.O = C;
        this.R = C;
        this.c0 = kb.c.CENTER_HORIZONTALLY;
        this.i = 0.5f;
        return this;
    }

    public db r0(eb ebVar) {
        this.e0 = ebVar;
        return this;
    }

    public db s(Object obj) {
        Object C = C(obj);
        this.S = C;
        this.V = C;
        this.c0 = kb.c.CENTER_VERTICALLY;
        this.j = 0.5f;
        return this;
    }

    public void s0(int i) {
        this.e = i;
    }

    public db t(Object obj, float f, float f2) {
        this.Z = C(obj);
        this.a0 = f;
        this.b0 = f2;
        this.c0 = kb.c.CIRCULAR_CONSTRAINT;
        return this;
    }

    public void t0(float f) {
        this.g = f;
    }

    public db u() {
        kb.c cVar = this.c0;
        if (cVar != null) {
            int ordinal = cVar.ordinal();
            if (ordinal != 17) {
                switch (ordinal) {
                    case 0:
                    case 1:
                        this.K = null;
                        this.L = null;
                        this.k = 0;
                        this.q = 0;
                        break;
                    case 2:
                    case 3:
                        this.M = null;
                        this.N = null;
                        this.l = 0;
                        this.r = 0;
                        break;
                    case 4:
                    case 5:
                        this.O = null;
                        this.P = null;
                        this.m = 0;
                        this.s = 0;
                        break;
                    case 6:
                    case 7:
                        this.Q = null;
                        this.R = null;
                        this.n = 0;
                        this.t = 0;
                        break;
                    case 8:
                    case 9:
                        this.S = null;
                        this.T = null;
                        this.o = 0;
                        this.u = 0;
                        break;
                    case 10:
                    case 11:
                        this.U = null;
                        this.V = null;
                        this.p = 0;
                        this.v = 0;
                        break;
                    case 12:
                        this.W = null;
                        break;
                }
            } else {
                this.Z = null;
            }
        } else {
            this.K = null;
            this.L = null;
            this.k = 0;
            this.M = null;
            this.N = null;
            this.l = 0;
            this.O = null;
            this.P = null;
            this.m = 0;
            this.Q = null;
            this.R = null;
            this.n = 0;
            this.S = null;
            this.T = null;
            this.o = 0;
            this.U = null;
            this.V = null;
            this.p = 0;
            this.W = null;
            this.Z = null;
            this.i = 0.5f;
            this.j = 0.5f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 0;
            this.v = 0;
        }
        return this;
    }

    public void u0(String str) {
        this.c = str;
    }

    public db v() {
        z0().u();
        z().u();
        Z().u();
        i0().u();
        return this;
    }

    public void v0(int i) {
        this.f = i;
    }

    public db w() {
        C0().u();
        j().u();
        o().u();
        return this;
    }

    public void w0(float f) {
        this.h = f;
    }

    public zb x() {
        return new zb(W().n(), E().n());
    }

    public void x0(Object obj) {
        this.f0 = obj;
        zb zbVar = this.g0;
        if (zbVar != null) {
            zbVar.h1(obj);
        }
    }

    public db y0(eb ebVar) {
        this.d0 = ebVar;
        return this;
    }

    public db z() {
        if (this.Q != null) {
            this.c0 = kb.c.END_TO_START;
        } else {
            this.c0 = kb.c.END_TO_END;
        }
        return this;
    }

    public db z0() {
        if (this.O != null) {
            this.c0 = kb.c.START_TO_START;
        } else {
            this.c0 = kb.c.START_TO_END;
        }
        return this;
    }
}