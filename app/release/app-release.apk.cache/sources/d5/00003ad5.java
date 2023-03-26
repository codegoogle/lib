package com.p7700g.p99005;

import android.graphics.Rect;
import android.view.View;
import com.p7700g.p99005.af;
import com.p7700g.p99005.kd;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;

/* compiled from: MotionConstrainedPoint.java */
/* loaded from: classes.dex */
public class be implements Comparable<be> {
    public static final String s = "MotionPaths";
    public static final boolean t = false;
    public static final int u = 1;
    public static final int v = 2;
    public static String[] w = {"position", "x", "y", "width", "height", "pathRotate"};
    private h9 M;
    private float O;
    private float P;
    private float Q;
    private float R;
    private float S;
    public int z;
    private float x = 1.0f;
    public int y = 0;
    private boolean A = false;
    private float B = 0.0f;
    private float C = 0.0f;
    private float D = 0.0f;
    public float E = 0.0f;
    private float F = 1.0f;
    private float G = 1.0f;
    private float H = Float.NaN;
    private float I = Float.NaN;
    private float J = 0.0f;
    private float K = 0.0f;
    private float L = 0.0f;
    private int N = 0;
    private float T = Float.NaN;
    private float U = Float.NaN;
    private int V = -1;
    public LinkedHashMap<String, we> W = new LinkedHashMap<>();
    public int X = 0;
    public double[] Y = new double[18];
    public double[] Z = new double[18];

    private boolean e(float a, float b) {
        return (Float.isNaN(a) || Float.isNaN(b)) ? Float.isNaN(a) != Float.isNaN(b) : Math.abs(a - b) > 1.0E-6f;
    }

    public void a(HashMap<String, kd> splines, int mFramePosition) {
        for (String str : splines.keySet()) {
            kd kdVar = splines.get(str);
            str.hashCode();
            char c = 65535;
            switch (str.hashCode()) {
                case -1249320806:
                    if (str.equals("rotationX")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1249320805:
                    if (str.equals("rotationY")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1225497657:
                    if (str.equals("translationX")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1225497656:
                    if (str.equals("translationY")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1225497655:
                    if (str.equals("translationZ")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1001078227:
                    if (str.equals("progress")) {
                        c = 5;
                        break;
                    }
                    break;
                case -908189618:
                    if (str.equals("scaleX")) {
                        c = 6;
                        break;
                    }
                    break;
                case -908189617:
                    if (str.equals("scaleY")) {
                        c = 7;
                        break;
                    }
                    break;
                case -760884510:
                    if (str.equals(td.g)) {
                        c = '\b';
                        break;
                    }
                    break;
                case -760884509:
                    if (str.equals(td.h)) {
                        c = '\t';
                        break;
                    }
                    break;
                case -40300674:
                    if (str.equals(td.d)) {
                        c = '\n';
                        break;
                    }
                    break;
                case -4379043:
                    if (str.equals("elevation")) {
                        c = 11;
                        break;
                    }
                    break;
                case 37232917:
                    if (str.equals("transitionPathRotate")) {
                        c = '\f';
                        break;
                    }
                    break;
                case 92909918:
                    if (str.equals("alpha")) {
                        c = '\r';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    kdVar.g(mFramePosition, Float.isNaN(this.D) ? 0.0f : this.D);
                    break;
                case 1:
                    kdVar.g(mFramePosition, Float.isNaN(this.E) ? 0.0f : this.E);
                    break;
                case 2:
                    kdVar.g(mFramePosition, Float.isNaN(this.J) ? 0.0f : this.J);
                    break;
                case 3:
                    kdVar.g(mFramePosition, Float.isNaN(this.K) ? 0.0f : this.K);
                    break;
                case 4:
                    kdVar.g(mFramePosition, Float.isNaN(this.L) ? 0.0f : this.L);
                    break;
                case 5:
                    kdVar.g(mFramePosition, Float.isNaN(this.U) ? 0.0f : this.U);
                    break;
                case 6:
                    kdVar.g(mFramePosition, Float.isNaN(this.F) ? 1.0f : this.F);
                    break;
                case 7:
                    kdVar.g(mFramePosition, Float.isNaN(this.G) ? 1.0f : this.G);
                    break;
                case '\b':
                    kdVar.g(mFramePosition, Float.isNaN(this.H) ? 0.0f : this.H);
                    break;
                case '\t':
                    kdVar.g(mFramePosition, Float.isNaN(this.I) ? 0.0f : this.I);
                    break;
                case '\n':
                    kdVar.g(mFramePosition, Float.isNaN(this.C) ? 0.0f : this.C);
                    break;
                case 11:
                    kdVar.g(mFramePosition, Float.isNaN(this.B) ? 0.0f : this.B);
                    break;
                case '\f':
                    kdVar.g(mFramePosition, Float.isNaN(this.T) ? 0.0f : this.T);
                    break;
                case '\r':
                    kdVar.g(mFramePosition, Float.isNaN(this.x) ? 1.0f : this.x);
                    break;
                default:
                    if (str.startsWith("CUSTOM")) {
                        String str2 = str.split(",")[1];
                        if (this.W.containsKey(str2)) {
                            we weVar = this.W.get(str2);
                            if (!(kdVar instanceof kd.b)) {
                                String str3 = str + " ViewSpline not a CustomSet frame = " + mFramePosition + ", value" + weVar.k() + kdVar;
                                break;
                            } else {
                                ((kd.b) kdVar).n(mFramePosition, weVar);
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
            }
        }
    }

    public void b(View view) {
        this.z = view.getVisibility();
        this.x = view.getVisibility() != 0 ? 0.0f : view.getAlpha();
        this.A = false;
        this.B = view.getElevation();
        this.C = view.getRotation();
        this.D = view.getRotationX();
        this.E = view.getRotationY();
        this.F = view.getScaleX();
        this.G = view.getScaleY();
        this.H = view.getPivotX();
        this.I = view.getPivotY();
        this.J = view.getTranslationX();
        this.K = view.getTranslationY();
        this.L = view.getTranslationZ();
    }

    public void c(af.a c) {
        af.d dVar = c.c;
        int i = dVar.c;
        this.y = i;
        int i2 = dVar.b;
        this.z = i2;
        this.x = (i2 == 0 || i != 0) ? dVar.d : 0.0f;
        af.e eVar = c.f;
        this.A = eVar.z;
        this.B = eVar.A;
        this.C = eVar.o;
        this.D = eVar.p;
        this.E = eVar.q;
        this.F = eVar.r;
        this.G = eVar.s;
        this.H = eVar.t;
        this.I = eVar.u;
        this.J = eVar.w;
        this.K = eVar.x;
        this.L = eVar.y;
        this.M = h9.c(c.d.r);
        af.c cVar = c.d;
        this.T = cVar.w;
        this.N = cVar.t;
        this.V = cVar.p;
        this.U = c.c.e;
        for (String str : c.g.keySet()) {
            we weVar = c.g.get(str);
            if (weVar.n()) {
                this.W.put(str, weVar);
            }
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: d */
    public int compareTo(be o) {
        return Float.compare(this.O, o.O);
    }

    public void f(be points, HashSet<String> keySet) {
        if (e(this.x, points.x)) {
            keySet.add("alpha");
        }
        if (e(this.B, points.B)) {
            keySet.add("elevation");
        }
        int i = this.z;
        int i2 = points.z;
        if (i != i2 && this.y == 0 && (i == 0 || i2 == 0)) {
            keySet.add("alpha");
        }
        if (e(this.C, points.C)) {
            keySet.add(td.d);
        }
        if (!Float.isNaN(this.T) || !Float.isNaN(points.T)) {
            keySet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.U) || !Float.isNaN(points.U)) {
            keySet.add("progress");
        }
        if (e(this.D, points.D)) {
            keySet.add("rotationX");
        }
        if (e(this.E, points.E)) {
            keySet.add("rotationY");
        }
        if (e(this.H, points.H)) {
            keySet.add(td.g);
        }
        if (e(this.I, points.I)) {
            keySet.add(td.h);
        }
        if (e(this.F, points.F)) {
            keySet.add("scaleX");
        }
        if (e(this.G, points.G)) {
            keySet.add("scaleY");
        }
        if (e(this.J, points.J)) {
            keySet.add("translationX");
        }
        if (e(this.K, points.K)) {
            keySet.add("translationY");
        }
        if (e(this.L, points.L)) {
            keySet.add("translationZ");
        }
    }

    public void g(be points, boolean[] mask, String[] custom) {
        mask[0] = mask[0] | e(this.O, points.O);
        mask[1] = mask[1] | e(this.P, points.P);
        mask[2] = mask[2] | e(this.Q, points.Q);
        mask[3] = mask[3] | e(this.R, points.R);
        mask[4] = e(this.S, points.S) | mask[4];
    }

    public void h(double[] data, int[] toUse) {
        float[] fArr = {this.O, this.P, this.Q, this.R, this.S, this.x, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.T};
        int i = 0;
        for (int i2 = 0; i2 < toUse.length; i2++) {
            if (toUse[i2] < 18) {
                data[i] = fArr[toUse[i2]];
                i++;
            }
        }
    }

    public int i(String name, double[] value, int offset) {
        we weVar = this.W.get(name);
        if (weVar.p() == 1) {
            value[offset] = weVar.k();
            return 1;
        }
        int p = weVar.p();
        float[] fArr = new float[p];
        weVar.l(fArr);
        int i = 0;
        while (i < p) {
            value[offset] = fArr[i];
            i++;
            offset++;
        }
        return p;
    }

    public int j(String name) {
        return this.W.get(name).p();
    }

    public boolean k(String name) {
        return this.W.containsKey(name);
    }

    public void l(float x, float y, float w2, float h) {
        this.P = x;
        this.Q = y;
        this.R = w2;
        this.S = h;
    }

    public void m(Rect rect, View view, int rotation, float prevous) {
        l(rect.left, rect.top, rect.width(), rect.height());
        b(view);
        this.H = Float.NaN;
        this.I = Float.NaN;
        if (rotation == 1) {
            this.C = prevous - 90.0f;
        } else if (rotation != 2) {
        } else {
            this.C = prevous + 90.0f;
        }
    }

    public void n(Rect cw, af constraintSet, int rotation, int viewId) {
        l(cw.left, cw.top, cw.width(), cw.height());
        c(constraintSet.q0(viewId));
        if (rotation != 1) {
            if (rotation != 2) {
                if (rotation != 3) {
                    if (rotation != 4) {
                        return;
                    }
                }
            }
            float f = this.C + 90.0f;
            this.C = f;
            if (f > 180.0f) {
                this.C = f - 360.0f;
                return;
            }
            return;
        }
        this.C -= 90.0f;
    }

    public void o(View view) {
        l(view.getX(), view.getY(), view.getWidth(), view.getHeight());
        b(view);
    }
}