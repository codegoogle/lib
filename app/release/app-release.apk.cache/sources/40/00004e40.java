package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: Transition.java */
/* loaded from: classes.dex */
public class lb implements aa {
    public static final int h = 0;
    public static final int i = 1;
    public static final int j = 2;
    public static final int k = 0;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 3;
    public static final int o = 4;
    public static final int p = 5;
    public static final int q = 6;
    private static final int r = -1;
    private static final int s = -2;
    public HashMap<Integer, HashMap<String, a>> t = new HashMap<>();
    private HashMap<String, b> u = new HashMap<>();
    public y9 v = new y9();
    private int w = 0;
    private String x = null;
    private h9 y = null;
    private int z = 0;
    private int A = 400;
    private float B = 0.0f;

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class a {
        public int a;
        public String b;
        public int c;
        public float d;
        public float e;

        public a(String str, int i, int i2, float f, float f2) {
            this.b = str;
            this.a = i;
            this.c = i2;
            this.d = f;
            this.e = f2;
        }
    }

    /* compiled from: Transition.java */
    /* loaded from: classes.dex */
    public static class b {
        public q8 d;
        public k9 h = new k9();
        public int i = -1;
        public int j = -1;
        public mb a = new mb();
        public mb b = new mb();
        public mb c = new mb();
        public t8 e = new t8(this.a);
        public t8 f = new t8(this.b);
        public t8 g = new t8(this.c);

        public b() {
            q8 q8Var = new q8(this.e);
            this.d = q8Var;
            q8Var.Z(this.e);
            this.d.X(this.f);
        }

        public mb a(int i) {
            if (i == 0) {
                return this.a;
            }
            if (i == 1) {
                return this.b;
            }
            return this.c;
        }

        public void b(int i, int i2, float f, lb lbVar) {
            this.i = i2;
            this.j = i;
            this.d.d0(i, i2, 1.0f, System.nanoTime());
            mb.n(i, i2, this.c, this.a, this.b, lbVar, f);
            this.c.s = f;
            this.d.Q(this.g, f, System.nanoTime(), this.h);
        }

        public void c(y9 y9Var) {
            w8 w8Var = new w8();
            y9Var.g(w8Var);
            this.d.f(w8Var);
        }

        public void d(y9 y9Var) {
            x8 x8Var = new x8();
            y9Var.g(x8Var);
            this.d.f(x8Var);
        }

        public void e(y9 y9Var) {
            y8 y8Var = new y8();
            y9Var.g(y8Var);
            this.d.f(y8Var);
        }

        public void f(zb zbVar, int i) {
            if (i == 0) {
                this.a.C(zbVar);
                this.d.Z(this.e);
            } else if (i == 1) {
                this.b.C(zbVar);
                this.d.X(this.f);
            }
            this.j = -1;
        }
    }

    private b D(String str) {
        return this.u.get(str);
    }

    private b E(String str, zb zbVar, int i2) {
        b bVar = this.u.get(str);
        if (bVar == null) {
            bVar = new b();
            this.v.g(bVar.d);
            this.u.put(str, bVar);
            if (zbVar != null) {
                bVar.f(zbVar, i2);
            }
        }
        return bVar;
    }

    public static /* synthetic */ float I(String str, float f) {
        return (float) h9.c(str).a(f);
    }

    public static /* synthetic */ float J(float f) {
        return (float) h9.c("standard").a(f);
    }

    public static /* synthetic */ float K(float f) {
        return (float) h9.c("accelerate").a(f);
    }

    public static /* synthetic */ float L(float f) {
        return (float) h9.c("decelerate").a(f);
    }

    public static /* synthetic */ float M(float f) {
        return (float) h9.c("linear").a(f);
    }

    public static /* synthetic */ float N(float f) {
        return (float) h9.c("anticipate").a(f);
    }

    public static /* synthetic */ float O(float f) {
        return (float) h9.c("overshoot").a(f);
    }

    public static /* synthetic */ float P(float f) {
        return (float) h9.c("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").a(f);
    }

    public static gb w(int i2, final String str) {
        switch (i2) {
            case -1:
                return new gb() { // from class: com.p7700g.p99005.ab
                    @Override // com.p7700g.p99005.gb
                    public final float getInterpolation(float f) {
                        return lb.I(str, f);
                    }
                };
            case 0:
                return xa.a;
            case 1:
                return ya.a;
            case 2:
                return va.a;
            case 3:
                return wa.a;
            case 4:
                return za.a;
            case 5:
                return cb.a;
            case 6:
                return bb.a;
            default:
                return null;
        }
    }

    public float[] A(String str) {
        float[] fArr = new float[124];
        this.u.get(str).d.k(fArr, 62);
        return fArr;
    }

    public mb B(zb zbVar) {
        return E(zbVar.U, null, 0).a;
    }

    public mb C(String str) {
        b bVar = this.u.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.a;
    }

    public boolean F() {
        return this.t.size() > 0;
    }

    public void G(int i2, int i3, float f) {
        h9 h9Var = this.y;
        if (h9Var != null) {
            f = (float) h9Var.a(f);
        }
        for (String str : this.u.keySet()) {
            this.u.get(str).b(i2, i3, f, this);
        }
    }

    public boolean H() {
        return this.u.isEmpty();
    }

    public void Q(y9 y9Var) {
        y9Var.f(this.v);
        y9Var.g(this);
    }

    public void R(ac acVar, int i2) {
        ArrayList<zb> l2 = acVar.l2();
        int size = l2.size();
        for (int i3 = 0; i3 < size; i3++) {
            zb zbVar = l2.get(i3);
            E(zbVar.U, null, i2).f(zbVar, i2);
        }
    }

    @Override // com.p7700g.p99005.aa
    public boolean a(int i2, int i3) {
        return false;
    }

    @Override // com.p7700g.p99005.aa
    public boolean b(int i2, float f) {
        if (i2 == 706) {
            this.B = f;
            return false;
        }
        return false;
    }

    @Override // com.p7700g.p99005.aa
    public boolean c(int i2, String str) {
        if (i2 == 705) {
            this.x = str;
            this.y = h9.c(str);
            return false;
        }
        return false;
    }

    @Override // com.p7700g.p99005.aa
    public boolean d(int i2, boolean z) {
        return false;
    }

    @Override // com.p7700g.p99005.aa
    public int e(String str) {
        return 0;
    }

    public void f(int i2, String str, String str2, int i3) {
        E(str, null, i2).a(i2).c(str2, i3);
    }

    public void g(int i2, String str, String str2, float f) {
        E(str, null, i2).a(i2).d(str2, f);
    }

    public void h(String str, y9 y9Var) {
        E(str, null, 0).c(y9Var);
    }

    public void i(String str, y9 y9Var) {
        E(str, null, 0).d(y9Var);
    }

    public void j(String str, int i2, int i3, float f, float f2) {
        y9 y9Var = new y9();
        y9Var.b(510, 2);
        y9Var.b(100, i2);
        y9Var.a(506, f);
        y9Var.a(aa.g.o, f2);
        E(str, null, 0).e(y9Var);
        a aVar = new a(str, i2, i3, f, f2);
        HashMap<String, a> hashMap = this.t.get(Integer.valueOf(i2));
        if (hashMap == null) {
            hashMap = new HashMap<>();
            this.t.put(Integer.valueOf(i2), hashMap);
        }
        hashMap.put(str, aVar);
    }

    public void k(String str, y9 y9Var) {
        E(str, null, 0).e(y9Var);
    }

    public void l() {
        this.u.clear();
    }

    public boolean m(String str) {
        return this.u.containsKey(str);
    }

    public void n(mb mbVar, float[] fArr, float[] fArr2, float[] fArr3) {
        a aVar;
        int i2 = 0;
        for (int i3 = 0; i3 <= 100; i3++) {
            HashMap<String, a> hashMap = this.t.get(Integer.valueOf(i3));
            if (hashMap != null && (aVar = hashMap.get(mbVar.c.U)) != null) {
                fArr[i2] = aVar.d;
                fArr2[i2] = aVar.e;
                fArr3[i2] = aVar.a;
                i2++;
            }
        }
    }

    public a o(String str, int i2) {
        a aVar;
        while (i2 <= 100) {
            HashMap<String, a> hashMap = this.t.get(Integer.valueOf(i2));
            if (hashMap != null && (aVar = hashMap.get(str)) != null) {
                return aVar;
            }
            i2++;
        }
        return null;
    }

    public a p(String str, int i2) {
        a aVar;
        while (i2 >= 0) {
            HashMap<String, a> hashMap = this.t.get(Integer.valueOf(i2));
            if (hashMap != null && (aVar = hashMap.get(str)) != null) {
                return aVar;
            }
            i2--;
        }
        return null;
    }

    public int q() {
        return this.z;
    }

    public mb r(zb zbVar) {
        return E(zbVar.U, null, 1).b;
    }

    public mb s(String str) {
        b bVar = this.u.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.b;
    }

    public mb t(zb zbVar) {
        return E(zbVar.U, null, 2).c;
    }

    public mb u(String str) {
        b bVar = this.u.get(str);
        if (bVar == null) {
            return null;
        }
        return bVar.c;
    }

    public gb v() {
        return w(this.w, this.x);
    }

    public int x(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.u.get(str).d.j(fArr, iArr, iArr2);
    }

    public q8 y(String str) {
        return E(str, null, 0).d;
    }

    public int z(mb mbVar) {
        int i2 = 0;
        for (int i3 = 0; i3 <= 100; i3++) {
            HashMap<String, a> hashMap = this.t.get(Integer.valueOf(i3));
            if (hashMap != null && hashMap.get(mbVar.c.U) != null) {
                i2++;
            }
        }
        return i2;
    }
}