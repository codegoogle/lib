package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import com.p7700g.p99005.lb;
import com.p7700g.p99005.yb;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Set;

/* compiled from: WidgetFrame.java */
/* loaded from: classes.dex */
public class mb {
    private static final boolean a = true;
    public static float b = Float.NaN;
    public zb c;
    public int d;
    public int e;
    public int f;
    public int g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public int t;
    public final HashMap<String, p8> u;
    public String v;

    public mb() {
        this.c = null;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = Float.NaN;
        this.s = Float.NaN;
        this.t = 0;
        this.u = new HashMap<>();
        this.v = null;
    }

    private static void a(StringBuilder sb, String str, float f) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f);
        sb.append(",\n");
    }

    private static void b(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(": ");
        sb.append(i);
        sb.append(",\n");
    }

    private static float m(float f, float f2, float f3, float f4) {
        boolean isNaN = Float.isNaN(f);
        boolean isNaN2 = Float.isNaN(f2);
        if (isNaN && isNaN2) {
            return Float.NaN;
        }
        if (isNaN) {
            f = f3;
        }
        if (isNaN2) {
            f2 = f3;
        }
        return wo1.a(f2, f, f4, f);
    }

    public static void n(int i, int i2, mb mbVar, mb mbVar2, mb mbVar3, lb lbVar, float f) {
        int i3;
        float f2;
        int i4;
        float f3;
        float f4;
        int i5;
        float f5;
        int i6;
        int i7;
        int i8;
        int i9;
        float f6 = 100.0f * f;
        int i10 = (int) f6;
        int i11 = mbVar2.d;
        int i12 = mbVar2.e;
        int i13 = mbVar3.d;
        int i14 = mbVar3.e;
        int i15 = mbVar2.f - i11;
        int i16 = mbVar2.g - i12;
        int i17 = mbVar3.f - i13;
        int i18 = mbVar3.g - i14;
        float f7 = mbVar2.r;
        float f8 = mbVar3.r;
        if (mbVar2.t == 8) {
            i11 = (int) (i11 - (i17 / 2.0f));
            i12 = (int) (i12 - (i18 / 2.0f));
            if (Float.isNaN(f7)) {
                i4 = i18;
                i3 = i17;
                f2 = 0.0f;
            } else {
                f2 = f7;
                i3 = i17;
                i4 = i18;
            }
        } else {
            i3 = i15;
            f2 = f7;
            i4 = i16;
        }
        if (mbVar3.t == 8) {
            i13 = (int) (i13 - (i3 / 2.0f));
            i14 = (int) (i14 - (i4 / 2.0f));
            i17 = i3;
            i18 = i4;
            if (Float.isNaN(f8)) {
                f8 = 0.0f;
            }
        }
        if (Float.isNaN(f2) && !Float.isNaN(f8)) {
            f2 = 1.0f;
        }
        if (!Float.isNaN(f2) && Float.isNaN(f8)) {
            f8 = 1.0f;
        }
        if (mbVar2.t == 4) {
            f4 = f8;
            f3 = 0.0f;
        } else {
            f3 = f2;
            f4 = f8;
        }
        float f9 = mbVar3.t == 4 ? 0.0f : f4;
        if (mbVar.c == null || !lbVar.F()) {
            i5 = i11;
            f5 = f;
        } else {
            lb.a p = lbVar.p(mbVar.c.U, i10);
            i5 = i11;
            lb.a o = lbVar.o(mbVar.c.U, i10);
            if (p == o) {
                o = null;
            }
            if (p != null) {
                i5 = (int) (p.d * i);
                i7 = i2;
                i12 = (int) (p.e * i7);
                i8 = p.a;
                i6 = i;
            } else {
                i6 = i;
                i7 = i2;
                i8 = 0;
            }
            if (o != null) {
                i13 = (int) (o.d * i6);
                i14 = (int) (o.e * i7);
                i9 = o.a;
            } else {
                i9 = 100;
            }
            f5 = (f6 - i8) / (i9 - i8);
        }
        int i19 = i5;
        mbVar.c = mbVar2.c;
        int i20 = (int) (((i13 - i19) * f5) + i19);
        mbVar.d = i20;
        int i21 = (int) ((f5 * (i14 - i12)) + i12);
        mbVar.e = i21;
        float f10 = 1.0f - f;
        mbVar.f = i20 + ((int) ((i17 * f) + (i3 * f10)));
        mbVar.g = i21 + ((int) ((i18 * f) + (f10 * i4)));
        mbVar.h = m(mbVar2.h, mbVar3.h, 0.5f, f);
        mbVar.i = m(mbVar2.i, mbVar3.i, 0.5f, f);
        mbVar.j = m(mbVar2.j, mbVar3.j, 0.0f, f);
        mbVar.k = m(mbVar2.k, mbVar3.k, 0.0f, f);
        mbVar.l = m(mbVar2.l, mbVar3.l, 0.0f, f);
        mbVar.p = m(mbVar2.p, mbVar3.p, 1.0f, f);
        mbVar.q = m(mbVar2.q, mbVar3.q, 1.0f, f);
        mbVar.m = m(mbVar2.m, mbVar3.m, 0.0f, f);
        mbVar.n = m(mbVar2.n, mbVar3.n, 0.0f, f);
        mbVar.o = m(mbVar2.o, mbVar3.o, 0.0f, f);
        mbVar.r = m(f3, f9, 1.0f, f);
        Set<String> keySet = mbVar3.u.keySet();
        mbVar.u.clear();
        for (String str : keySet) {
            if (mbVar2.u.containsKey(str)) {
                p8 p8Var = mbVar2.u.get(str);
                p8 p8Var2 = mbVar3.u.get(str);
                p8 p8Var3 = new p8(p8Var);
                mbVar.u.put(str, p8Var3);
                if (p8Var.r() == 1) {
                    p8Var3.y(Float.valueOf(m(p8Var.n(), p8Var2.n(), 0.0f, f)));
                } else {
                    int r = p8Var.r();
                    float[] fArr = new float[r];
                    float[] fArr2 = new float[r];
                    p8Var.o(fArr);
                    p8Var2.o(fArr2);
                    for (int i22 = 0; i22 < r; i22++) {
                        fArr[i22] = m(fArr[i22], fArr2[i22], 0.0f, f);
                        p8Var3.z(fArr);
                    }
                }
            }
        }
    }

    private void u(StringBuilder sb, yb.b bVar) {
        yb r = this.c.r(bVar);
        if (r == null || r.h == null) {
            return;
        }
        sb.append("Anchor");
        sb.append(bVar.name());
        sb.append(": ['");
        String str = r.h.i().U;
        if (str == null) {
            str = "#PARENT";
        }
        sb.append(str);
        sb.append("', '");
        sb.append(r.h.l().name());
        sb.append("', '");
        sb.append(r.i);
        sb.append("'],\n");
    }

    public boolean A(String str, na naVar) throws sa {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1881940865:
                if (str.equals("phone_orientation")) {
                    c = 0;
                    break;
                }
                break;
            case -1383228885:
                if (str.equals("bottom")) {
                    c = 1;
                    break;
                }
                break;
            case -1349088399:
                if (str.equals("custom")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 3;
                    break;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 4;
                    break;
                }
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 6;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 7;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = '\b';
                    break;
                }
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = '\t';
                    break;
                }
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = '\n';
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = 11;
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = '\f';
                    break;
                }
                break;
            case 115029:
                if (str.equals("top")) {
                    c = '\r';
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 14;
                    break;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 15;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 16;
                    break;
                }
                break;
            case 642850769:
                if (str.equals("interpolatedPos")) {
                    c = 17;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                b = naVar.f();
                break;
            case 1:
                this.g = naVar.g();
                break;
            case 2:
                q(naVar);
                break;
            case 3:
                this.j = naVar.f();
                break;
            case 4:
                this.k = naVar.f();
                break;
            case 5:
                this.l = naVar.f();
                break;
            case 6:
                this.m = naVar.f();
                break;
            case 7:
                this.n = naVar.f();
                break;
            case '\b':
                this.o = naVar.f();
                break;
            case '\t':
                this.h = naVar.f();
                break;
            case '\n':
                this.i = naVar.f();
                break;
            case 11:
                this.p = naVar.f();
                break;
            case '\f':
                this.q = naVar.f();
                break;
            case '\r':
                this.e = naVar.g();
                break;
            case 14:
                this.d = naVar.g();
                break;
            case 15:
                this.r = naVar.f();
                break;
            case 16:
                this.f = naVar.g();
                break;
            case 17:
                this.s = naVar.f();
                break;
            default:
                return false;
        }
        return true;
    }

    public mb B() {
        zb zbVar = this.c;
        if (zbVar != null) {
            this.d = zbVar.L();
            this.e = this.c.e0();
            this.f = this.c.X();
            this.g = this.c.v();
            D(this.c.T);
        }
        return this;
    }

    public mb C(zb zbVar) {
        if (zbVar == null) {
            return this;
        }
        this.c = zbVar;
        B();
        return this;
    }

    public void D(mb mbVar) {
        this.h = mbVar.h;
        this.i = mbVar.i;
        this.j = mbVar.j;
        this.k = mbVar.k;
        this.l = mbVar.l;
        this.m = mbVar.m;
        this.n = mbVar.n;
        this.o = mbVar.o;
        this.p = mbVar.p;
        this.q = mbVar.q;
        this.r = mbVar.r;
        this.t = mbVar.t;
        this.u.clear();
        for (p8 p8Var : mbVar.u.values()) {
            this.u.put(p8Var.k(), p8Var.d());
        }
    }

    public int E() {
        return Math.max(0, this.f - this.d);
    }

    public void c(String str, int i) {
        w(str, aa.b.l, i);
    }

    public void d(String str, float f) {
        v(str, aa.b.k, f);
    }

    public float e() {
        int i = this.d;
        return ((this.f - i) / 2.0f) + i;
    }

    public float f() {
        int i = this.e;
        return ((this.g - i) / 2.0f) + i;
    }

    public p8 g(String str) {
        return this.u.get(str);
    }

    public Set<String> h() {
        return this.u.keySet();
    }

    public int i(String str) {
        if (this.u.containsKey(str)) {
            return this.u.get(str).g();
        }
        return -21880;
    }

    public float j(String str) {
        if (this.u.containsKey(str)) {
            return this.u.get(str).h();
        }
        return Float.NaN;
    }

    public String k() {
        zb zbVar = this.c;
        return zbVar == null ? "unknown" : zbVar.U;
    }

    public int l() {
        return Math.max(0, this.g - this.e);
    }

    public boolean o() {
        return Float.isNaN(this.j) && Float.isNaN(this.k) && Float.isNaN(this.l) && Float.isNaN(this.m) && Float.isNaN(this.n) && Float.isNaN(this.o) && Float.isNaN(this.p) && Float.isNaN(this.q) && Float.isNaN(this.r);
    }

    public void p(String str) {
        String t;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder G = wo1.G(".(");
        G.append(stackTraceElement.getFileName());
        G.append(":");
        G.append(stackTraceElement.getLineNumber());
        G.append(") ");
        G.append(stackTraceElement.getMethodName());
        StringBuilder L = wo1.L(G.toString(), " ");
        L.append(hashCode() % 1000);
        String sb = L.toString();
        if (this.c != null) {
            StringBuilder L2 = wo1.L(sb, "/");
            L2.append(this.c.hashCode() % 1000);
            t = L2.toString();
        } else {
            t = wo1.t(sb, "/NULL");
        }
        PrintStream printStream = System.out;
        printStream.println(t + " " + str);
    }

    public void q(na naVar) throws sa {
        qa qaVar = (qa) naVar;
        int size = qaVar.size();
        for (int i = 0; i < size; i++) {
            oa oaVar = (oa) qaVar.E(i);
            oaVar.b();
            na k0 = oaVar.k0();
            String b2 = k0.b();
            if (b2.matches("#[0-9a-fA-F]+")) {
                w(oaVar.b(), aa.b.l, Integer.parseInt(b2.substring(1), 16));
            } else if (k0 instanceof pa) {
                v(oaVar.b(), aa.b.k, k0.f());
            } else {
                x(oaVar.b(), aa.b.m, b2);
            }
        }
    }

    public void r() {
        String t;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        StringBuilder G = wo1.G(".(");
        G.append(stackTraceElement.getFileName());
        G.append(":");
        G.append(stackTraceElement.getLineNumber());
        G.append(") ");
        G.append(stackTraceElement.getMethodName());
        StringBuilder L = wo1.L(G.toString(), " ");
        L.append(hashCode() % 1000);
        String sb = L.toString();
        if (this.c != null) {
            StringBuilder L2 = wo1.L(sb, "/");
            L2.append(this.c.hashCode() % 1000);
            L2.append(" ");
            t = L2.toString();
        } else {
            t = wo1.t(sb, "/NULL ");
        }
        HashMap<String, p8> hashMap = this.u;
        if (hashMap != null) {
            for (String str : hashMap.keySet()) {
                PrintStream printStream = System.out;
                StringBuilder G2 = wo1.G(t);
                G2.append(this.u.get(str).toString());
                printStream.println(G2.toString());
            }
        }
    }

    public StringBuilder s(StringBuilder sb) {
        return t(sb, false);
    }

    public StringBuilder t(StringBuilder sb, boolean z) {
        sb.append("{\n");
        b(sb, "left", this.d);
        b(sb, "top", this.e);
        b(sb, "right", this.f);
        b(sb, "bottom", this.g);
        a(sb, "pivotX", this.h);
        a(sb, "pivotY", this.i);
        a(sb, "rotationX", this.j);
        a(sb, "rotationY", this.k);
        a(sb, "rotationZ", this.l);
        a(sb, "translationX", this.m);
        a(sb, "translationY", this.n);
        a(sb, "translationZ", this.o);
        a(sb, "scaleX", this.p);
        a(sb, "scaleY", this.q);
        a(sb, "alpha", this.r);
        b(sb, "visibility", this.t);
        a(sb, "interpolatedPos", this.s);
        if (this.c != null) {
            yb.b[] values = yb.b.values();
            for (int i = 0; i < 9; i++) {
                u(sb, values[i]);
            }
        }
        if (z) {
            a(sb, "phone_orientation", b);
        }
        if (z) {
            a(sb, "phone_orientation", b);
        }
        if (this.u.size() != 0) {
            sb.append("custom : {\n");
            for (String str : this.u.keySet()) {
                p8 p8Var = this.u.get(str);
                sb.append(str);
                sb.append(": ");
                switch (p8Var.m()) {
                    case 900:
                        sb.append(p8Var.i());
                        sb.append(",\n");
                        break;
                    case aa.b.k /* 901 */:
                    case aa.b.o /* 905 */:
                        sb.append(p8Var.h());
                        sb.append(",\n");
                        break;
                    case aa.b.l /* 902 */:
                        sb.append("'");
                        sb.append(p8.c(p8Var.i()));
                        sb.append("',\n");
                        break;
                    case aa.b.m /* 903 */:
                        sb.append("'");
                        sb.append(p8Var.l());
                        sb.append("',\n");
                        break;
                    case 904:
                        sb.append("'");
                        sb.append(p8Var.f());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    public void v(String str, int i, float f) {
        if (this.u.containsKey(str)) {
            this.u.get(str).u(f);
        } else {
            this.u.put(str, new p8(str, i, f));
        }
    }

    public void w(String str, int i, int i2) {
        if (this.u.containsKey(str)) {
            this.u.get(str).v(i2);
        } else {
            this.u.put(str, new p8(str, i, i2));
        }
    }

    public void x(String str, int i, String str2) {
        if (this.u.containsKey(str)) {
            this.u.get(str).x(str2);
        } else {
            this.u.put(str, new p8(str, i, str2));
        }
    }

    public void y(String str, int i, boolean z) {
        if (this.u.containsKey(str)) {
            this.u.get(str).t(z);
        } else {
            this.u.put(str, new p8(str, i, z));
        }
    }

    public void z(o8 o8Var, float[] fArr) {
    }

    public mb(zb zbVar) {
        this.c = null;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = Float.NaN;
        this.s = Float.NaN;
        this.t = 0;
        this.u = new HashMap<>();
        this.v = null;
        this.c = zbVar;
    }

    public mb(mb mbVar) {
        this.c = null;
        this.d = 0;
        this.e = 0;
        this.f = 0;
        this.g = 0;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = Float.NaN;
        this.s = Float.NaN;
        this.t = 0;
        this.u = new HashMap<>();
        this.v = null;
        this.c = mbVar.c;
        this.d = mbVar.d;
        this.e = mbVar.e;
        this.f = mbVar.f;
        this.g = mbVar.g;
        D(mbVar);
    }
}