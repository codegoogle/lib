package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p7700g.p99005.af;
import com.p7700g.p99005.jd;
import com.p7700g.p99005.kd;
import com.p7700g.p99005.md;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: MotionController.java */
/* loaded from: classes.dex */
public class ce {
    private static final int A = -3;
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;
    public static final int j = 3;
    public static final int k = 4;
    public static final int l = 5;
    public static final int m = 6;
    public static final int n = 1;
    public static final int o = 2;
    private static final String p = "MotionController";
    private static final boolean q = false;
    private static final boolean r = false;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 3;
    public static final int w = 4;
    public static final int x = 5;
    private static final int y = -1;
    private static final int z = -2;
    public View C;
    public int D;
    public String F;
    private f9[] L;
    private f9 M;
    public float Q;
    public float R;
    private int[] S;
    private double[] T;
    private double[] U;
    private String[] V;
    private int[] W;
    private HashMap<String, md> c0;
    private HashMap<String, kd> d0;
    private HashMap<String, jd> e0;
    private ae[] f0;
    private int g0;
    private int h0;
    private View i0;
    private int j0;
    private float k0;
    private Interpolator l0;
    private boolean m0;
    public String[] n0;
    public Rect B = new Rect();
    public boolean E = false;
    private int G = -1;
    private he H = new he();
    private he I = new he();
    private be J = new be();
    private be K = new be();
    public float N = Float.NaN;
    public float O = 0.0f;
    public float P = 1.0f;
    private int X = 4;
    private float[] Y = new float[4];
    private ArrayList<he> Z = new ArrayList<>();
    private float[] a0 = new float[1];
    private ArrayList<td> b0 = new ArrayList<>();

    /* compiled from: MotionController.java */
    /* loaded from: classes.dex */
    public class a implements Interpolator {
        public final /* synthetic */ h9 a;

        public a(final h9 val$easing) {
            this.a = val$easing;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float v) {
            return (float) this.a.a(v);
        }
    }

    public ce(View view) {
        int i2 = td.a;
        this.g0 = i2;
        this.h0 = i2;
        this.i0 = null;
        this.j0 = i2;
        this.k0 = Float.NaN;
        this.l0 = null;
        this.m0 = false;
        Z(view);
    }

    private float D() {
        char c2;
        float f2;
        float f3;
        float[] fArr = new float[2];
        float f4 = 1.0f / 99;
        double d2 = 0.0d;
        double d3 = 0.0d;
        float f5 = 0.0f;
        int i2 = 0;
        while (i2 < 100) {
            float f6 = i2 * f4;
            double d4 = f6;
            h9 h9Var = this.H.F;
            Iterator<he> it = this.Z.iterator();
            float f7 = Float.NaN;
            float f8 = 0.0f;
            while (it.hasNext()) {
                he next = it.next();
                h9 h9Var2 = next.F;
                if (h9Var2 != null) {
                    float f9 = next.H;
                    if (f9 < f6) {
                        h9Var = h9Var2;
                        f8 = f9;
                    } else if (Float.isNaN(f7)) {
                        f7 = next.H;
                    }
                }
            }
            if (h9Var != null) {
                if (Float.isNaN(f7)) {
                    f7 = 1.0f;
                }
                d4 = (((float) h9Var.a((f6 - f8) / f3)) * (f7 - f8)) + f8;
            }
            this.L[0].d(d4, this.T);
            float f10 = f5;
            int i3 = i2;
            this.H.h(d4, this.S, this.T, fArr, 0);
            if (i3 > 0) {
                c2 = 0;
                f2 = (float) (Math.hypot(d3 - fArr[1], d2 - fArr[0]) + f10);
            } else {
                c2 = 0;
                f2 = f10;
            }
            d2 = fArr[c2];
            i2 = i3 + 1;
            f5 = f2;
            d3 = fArr[1];
        }
        return f5;
    }

    private void K(he point) {
        int binarySearch = Collections.binarySearch(this.Z, point);
        if (binarySearch == 0) {
            float f2 = point.I;
        }
        this.Z.add((-binarySearch) - 1, point);
    }

    private void O(he motionPaths) {
        motionPaths.s((int) this.C.getX(), (int) this.C.getY(), this.C.getWidth(), this.C.getHeight());
    }

    private float j(float position, float[] velocity) {
        float f2 = 0.0f;
        if (velocity != null) {
            velocity[0] = 1.0f;
        } else {
            float f3 = this.P;
            if (f3 != 1.0d) {
                float f4 = this.O;
                if (position < f4) {
                    position = 0.0f;
                }
                if (position > f4 && position < 1.0d) {
                    position = Math.min((position - f4) * f3, 1.0f);
                }
            }
        }
        h9 h9Var = this.H.F;
        float f5 = Float.NaN;
        Iterator<he> it = this.Z.iterator();
        while (it.hasNext()) {
            he next = it.next();
            h9 h9Var2 = next.F;
            if (h9Var2 != null) {
                float f6 = next.H;
                if (f6 < position) {
                    h9Var = h9Var2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = next.H;
                }
            }
        }
        if (h9Var != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d2 = (position - f2) / f7;
            position = (((float) h9Var.a(d2)) * f7) + f2;
            if (velocity != null) {
                velocity[0] = (float) h9Var.b(d2);
            }
        }
        return position;
    }

    private static Interpolator v(Context context, int type, String interpolatorString, int id) {
        if (type != -2) {
            if (type != -1) {
                if (type != 0) {
                    if (type != 1) {
                        if (type != 2) {
                            if (type != 4) {
                                if (type != 5) {
                                    return null;
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new a(h9.c(interpolatorString));
        }
        return AnimationUtils.loadInterpolator(context, id);
    }

    public double[] A(double position) {
        this.L[0].d(position, this.T);
        f9 f9Var = this.M;
        if (f9Var != null) {
            double[] dArr = this.T;
            if (dArr.length > 0) {
                f9Var.d(position, dArr);
            }
        }
        return this.T;
    }

    public yd B(int layoutWidth, int layoutHeight, float x2, float y2) {
        RectF rectF = new RectF();
        he heVar = this.H;
        float f2 = heVar.J;
        rectF.left = f2;
        float f3 = heVar.K;
        rectF.top = f3;
        rectF.right = f2 + heVar.L;
        rectF.bottom = f3 + heVar.M;
        RectF rectF2 = new RectF();
        he heVar2 = this.I;
        float f4 = heVar2.J;
        rectF2.left = f4;
        float f5 = heVar2.K;
        rectF2.top = f5;
        rectF2.right = f4 + heVar2.L;
        rectF2.bottom = f5 + heVar2.M;
        Iterator<td> it = this.b0.iterator();
        while (it.hasNext()) {
            td next = it.next();
            if (next instanceof yd) {
                yd ydVar = (yd) next;
                if (ydVar.r(layoutWidth, layoutHeight, rectF, rectF2, x2, y2)) {
                    return ydVar;
                }
            }
        }
        return null;
    }

    public void C(float position, int width, int height, float locationX, float locationY, float[] mAnchorDpDt) {
        float j2 = j(position, this.a0);
        HashMap<String, kd> hashMap = this.d0;
        kd kdVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, kd> hashMap2 = this.d0;
        kd kdVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, kd> hashMap3 = this.d0;
        kd kdVar3 = hashMap3 == null ? null : hashMap3.get(td.d);
        HashMap<String, kd> hashMap4 = this.d0;
        kd kdVar4 = hashMap4 == null ? null : hashMap4.get("scaleX");
        HashMap<String, kd> hashMap5 = this.d0;
        kd kdVar5 = hashMap5 == null ? null : hashMap5.get("scaleY");
        HashMap<String, jd> hashMap6 = this.e0;
        jd jdVar = hashMap6 == null ? null : hashMap6.get("translationX");
        HashMap<String, jd> hashMap7 = this.e0;
        jd jdVar2 = hashMap7 == null ? null : hashMap7.get("translationY");
        HashMap<String, jd> hashMap8 = this.e0;
        jd jdVar3 = hashMap8 == null ? null : hashMap8.get(td.d);
        HashMap<String, jd> hashMap9 = this.e0;
        jd jdVar4 = hashMap9 == null ? null : hashMap9.get("scaleX");
        HashMap<String, jd> hashMap10 = this.e0;
        jd jdVar5 = hashMap10 != null ? hashMap10.get("scaleY") : null;
        ja jaVar = new ja();
        jaVar.b();
        jaVar.d(kdVar3, j2);
        jaVar.h(kdVar, kdVar2, j2);
        jaVar.f(kdVar4, kdVar5, j2);
        jaVar.c(jdVar3, j2);
        jaVar.g(jdVar, jdVar2, j2);
        jaVar.e(jdVar4, jdVar5, j2);
        f9 f9Var = this.M;
        if (f9Var != null) {
            double[] dArr = this.T;
            if (dArr.length > 0) {
                double d2 = j2;
                f9Var.d(d2, dArr);
                this.M.g(d2, this.U);
                this.H.t(locationX, locationY, mAnchorDpDt, this.S, this.U, this.T);
            }
            jaVar.a(locationX, locationY, width, height, mAnchorDpDt);
            return;
        }
        int i2 = 0;
        if (this.L != null) {
            double j3 = j(j2, this.a0);
            this.L[0].g(j3, this.U);
            this.L[0].d(j3, this.T);
            float f2 = this.a0[0];
            while (true) {
                double[] dArr2 = this.U;
                if (i2 < dArr2.length) {
                    dArr2[i2] = dArr2[i2] * f2;
                    i2++;
                } else {
                    this.H.t(locationX, locationY, mAnchorDpDt, this.S, dArr2, this.T);
                    jaVar.a(locationX, locationY, width, height, mAnchorDpDt);
                    return;
                }
            }
        } else {
            he heVar = this.I;
            float f3 = heVar.J;
            he heVar2 = this.H;
            float f4 = f3 - heVar2.J;
            float f5 = heVar.K - heVar2.K;
            mAnchorDpDt[0] = (((heVar.L - heVar2.L) + f4) * locationX) + ((1.0f - locationX) * f4);
            mAnchorDpDt[1] = (((heVar.M - heVar2.M) + f5) * locationY) + ((1.0f - locationY) * f5);
            jaVar.b();
            jaVar.d(kdVar3, j2);
            jaVar.h(kdVar, kdVar2, j2);
            jaVar.f(kdVar4, kdVar5, j2);
            jaVar.c(jdVar3, j2);
            jaVar.g(jdVar, jdVar2, j2);
            jaVar.e(jdVar4, jdVar5, j2);
            jaVar.a(locationX, locationY, width, height, mAnchorDpDt);
        }
    }

    public float E() {
        return this.H.M;
    }

    public float F() {
        return this.H.L;
    }

    public float G() {
        return this.H.J;
    }

    public float H() {
        return this.H.K;
    }

    public int I() {
        return this.h0;
    }

    public View J() {
        return this.C;
    }

    public boolean L(View child, float global_position, long time, k9 keyCache) {
        md.d dVar;
        boolean z2;
        char c2;
        double d2;
        View view;
        float f2;
        float j2 = j(global_position, null);
        int i2 = this.j0;
        if (i2 != td.a) {
            float f3 = 1.0f / i2;
            float floor = ((float) Math.floor(j2 / f3)) * f3;
            float f4 = (j2 % f3) / f3;
            if (!Float.isNaN(this.k0)) {
                f4 = (f4 + this.k0) % 1.0f;
            }
            Interpolator interpolator = this.l0;
            if (interpolator != null) {
                f2 = interpolator.getInterpolation(f4);
            } else {
                f2 = ((double) f4) > 0.5d ? 1.0f : 0.0f;
            }
            j2 = (f2 * f3) + floor;
        }
        float f5 = j2;
        HashMap<String, kd> hashMap = this.d0;
        if (hashMap != null) {
            for (kd kdVar : hashMap.values()) {
                kdVar.m(child, f5);
            }
        }
        HashMap<String, md> hashMap2 = this.c0;
        if (hashMap2 != null) {
            md.d dVar2 = null;
            boolean z3 = false;
            for (md mdVar : hashMap2.values()) {
                if (mdVar instanceof md.d) {
                    dVar2 = (md.d) mdVar;
                } else {
                    z3 |= mdVar.j(child, f5, time, keyCache);
                }
            }
            z2 = z3;
            dVar = dVar2;
        } else {
            dVar = null;
            z2 = false;
        }
        f9[] f9VarArr = this.L;
        if (f9VarArr != null) {
            double d3 = f5;
            f9VarArr[0].d(d3, this.T);
            this.L[0].g(d3, this.U);
            f9 f9Var = this.M;
            if (f9Var != null) {
                double[] dArr = this.T;
                if (dArr.length > 0) {
                    f9Var.d(d3, dArr);
                    this.M.g(d3, this.U);
                }
            }
            if (this.m0) {
                d2 = d3;
            } else {
                d2 = d3;
                this.H.u(f5, child, this.S, this.T, this.U, null, this.E);
                this.E = false;
            }
            if (this.h0 != td.a) {
                if (this.i0 == null) {
                    this.i0 = ((View) child.getParent()).findViewById(this.h0);
                }
                if (this.i0 != null) {
                    float bottom = (this.i0.getBottom() + view.getTop()) / 2.0f;
                    float right = (this.i0.getRight() + this.i0.getLeft()) / 2.0f;
                    if (child.getRight() - child.getLeft() > 0 && child.getBottom() - child.getTop() > 0) {
                        child.setPivotX(right - child.getLeft());
                        child.setPivotY(bottom - child.getTop());
                    }
                }
            }
            HashMap<String, kd> hashMap3 = this.d0;
            if (hashMap3 != null) {
                for (kd kdVar2 : hashMap3.values()) {
                    if (kdVar2 instanceof kd.d) {
                        double[] dArr2 = this.U;
                        if (dArr2.length > 1) {
                            ((kd.d) kdVar2).n(child, f5, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (dVar != null) {
                double[] dArr3 = this.U;
                c2 = 1;
                z2 = dVar.k(child, keyCache, f5, time, dArr3[0], dArr3[1]) | z2;
            } else {
                c2 = 1;
            }
            int i3 = 1;
            while (true) {
                f9[] f9VarArr2 = this.L;
                if (i3 >= f9VarArr2.length) {
                    break;
                }
                f9VarArr2[i3].e(d2, this.Y);
                hd.b(this.H.T.get(this.V[i3 - 1]), child, this.Y);
                i3++;
            }
            be beVar = this.J;
            if (beVar.y == 0) {
                if (f5 <= 0.0f) {
                    child.setVisibility(beVar.z);
                } else if (f5 >= 1.0f) {
                    child.setVisibility(this.K.z);
                } else if (this.K.z != beVar.z) {
                    child.setVisibility(0);
                }
            }
            if (this.f0 != null) {
                int i4 = 0;
                while (true) {
                    ae[] aeVarArr = this.f0;
                    if (i4 >= aeVarArr.length) {
                        break;
                    }
                    aeVarArr[i4].A(f5, child);
                    i4++;
                }
            }
        } else {
            c2 = 1;
            he heVar = this.H;
            float f6 = heVar.J;
            he heVar2 = this.I;
            float a2 = wo1.a(heVar2.J, f6, f5, f6);
            float f7 = heVar.K;
            float a3 = wo1.a(heVar2.K, f7, f5, f7);
            float f8 = heVar.L;
            float f9 = heVar2.L;
            float a4 = wo1.a(f9, f8, f5, f8);
            float f10 = heVar.M;
            float f11 = heVar2.M;
            float f12 = a2 + 0.5f;
            int i5 = (int) f12;
            float f13 = a3 + 0.5f;
            int i6 = (int) f13;
            int i7 = (int) (f12 + a4);
            int a5 = (int) (f13 + wo1.a(f11, f10, f5, f10));
            int i8 = i7 - i5;
            int i9 = a5 - i6;
            if (f9 != f8 || f11 != f10 || this.E) {
                child.measure(View.MeasureSpec.makeMeasureSpec(i8, 1073741824), View.MeasureSpec.makeMeasureSpec(i9, 1073741824));
                this.E = false;
            }
            child.layout(i5, i6, i7, a5);
        }
        HashMap<String, jd> hashMap4 = this.e0;
        if (hashMap4 != null) {
            for (jd jdVar : hashMap4.values()) {
                if (jdVar instanceof jd.d) {
                    double[] dArr4 = this.U;
                    ((jd.d) jdVar).n(child, f5, dArr4[0], dArr4[c2]);
                } else {
                    jdVar.m(child, f5);
                }
            }
        }
        return z2;
    }

    public String M() {
        return this.C.getContext().getResources().getResourceEntryName(this.C.getId());
    }

    public void N(View view, yd key, float x2, float y2, String[] attribute, float[] value) {
        RectF rectF = new RectF();
        he heVar = this.H;
        float f2 = heVar.J;
        rectF.left = f2;
        float f3 = heVar.K;
        rectF.top = f3;
        rectF.right = f2 + heVar.L;
        rectF.bottom = f3 + heVar.M;
        RectF rectF2 = new RectF();
        he heVar2 = this.I;
        float f4 = heVar2.J;
        rectF2.left = f4;
        float f5 = heVar2.K;
        rectF2.top = f5;
        rectF2.right = f4 + heVar2.L;
        rectF2.bottom = f5 + heVar2.M;
        key.s(view, rectF, rectF2, x2, y2, attribute, value);
    }

    public void P() {
        this.E = true;
    }

    public void Q(Rect rect, Rect out, int rotation, int preHeight, int preWidth) {
        if (rotation == 1) {
            int i2 = rect.left + rect.right;
            out.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            out.top = preWidth - ((rect.height() + i2) / 2);
            out.right = rect.width() + out.left;
            out.bottom = rect.height() + out.top;
        } else if (rotation == 2) {
            int i3 = rect.left + rect.right;
            out.left = preHeight - ((rect.width() + (rect.top + rect.bottom)) / 2);
            out.top = (i3 - rect.height()) / 2;
            out.right = rect.width() + out.left;
            out.bottom = rect.height() + out.top;
        } else if (rotation == 3) {
            int i4 = rect.left + rect.right;
            out.left = ((rect.height() / 2) + rect.top) - (i4 / 2);
            out.top = preWidth - ((rect.height() + i4) / 2);
            out.right = rect.width() + out.left;
            out.bottom = rect.height() + out.top;
        } else if (rotation != 4) {
        } else {
            int i5 = rect.left + rect.right;
            out.left = preHeight - ((rect.width() + (rect.bottom + rect.top)) / 2);
            out.top = (i5 - rect.height()) / 2;
            out.right = rect.width() + out.left;
            out.bottom = rect.height() + out.top;
        }
    }

    public void R(View v2) {
        he heVar = this.H;
        heVar.H = 0.0f;
        heVar.I = 0.0f;
        this.m0 = true;
        heVar.s(v2.getX(), v2.getY(), v2.getWidth(), v2.getHeight());
        this.I.s(v2.getX(), v2.getY(), v2.getWidth(), v2.getHeight());
        this.J.o(v2);
        this.K.o(v2);
    }

    public void S(int debugMode) {
        this.H.G = debugMode;
    }

    public void T(Rect cw, af constraintSet, int parentWidth, int parentHeight) {
        int i2 = constraintSet.S1;
        if (i2 != 0) {
            Q(cw, this.B, i2, parentWidth, parentHeight);
            cw = this.B;
        }
        he heVar = this.I;
        heVar.H = 1.0f;
        heVar.I = 1.0f;
        O(heVar);
        this.I.s(cw.left, cw.top, cw.width(), cw.height());
        this.I.a(constraintSet.q0(this.D));
        this.K.n(cw, constraintSet, i2, this.D);
    }

    public void U(int arc) {
        this.g0 = arc;
    }

    public void V(View v2) {
        he heVar = this.H;
        heVar.H = 0.0f;
        heVar.I = 0.0f;
        heVar.s(v2.getX(), v2.getY(), v2.getWidth(), v2.getHeight());
        this.J.o(v2);
    }

    public void W(Rect cw, af constraintSet, int parentWidth, int parentHeight) {
        int i2 = constraintSet.S1;
        if (i2 != 0) {
            Q(cw, this.B, i2, parentWidth, parentHeight);
        }
        he heVar = this.H;
        heVar.H = 0.0f;
        heVar.I = 0.0f;
        O(heVar);
        this.H.s(cw.left, cw.top, cw.width(), cw.height());
        af.a q0 = constraintSet.q0(this.D);
        this.H.a(q0);
        this.N = q0.d.u;
        this.J.n(cw, constraintSet, i2, this.D);
        this.h0 = q0.f.v;
        af.c cVar = q0.d;
        this.j0 = cVar.y;
        this.k0 = cVar.x;
        Context context = this.C.getContext();
        af.c cVar2 = q0.d;
        this.l0 = v(context, cVar2.A, cVar2.z, cVar2.B);
    }

    public void X(ld rect, View v2, int rotation, int preWidth, int preHeight) {
        he heVar = this.H;
        heVar.H = 0.0f;
        heVar.I = 0.0f;
        Rect rect2 = new Rect();
        if (rotation == 1) {
            int i2 = rect.b + rect.d;
            rect2.left = ((rect.c + rect.e) - rect.c()) / 2;
            rect2.top = preWidth - ((rect.b() + i2) / 2);
            rect2.right = rect.c() + rect2.left;
            rect2.bottom = rect.b() + rect2.top;
        } else if (rotation == 2) {
            int i3 = rect.b + rect.d;
            rect2.left = preHeight - ((rect.c() + (rect.c + rect.e)) / 2);
            rect2.top = (i3 - rect.b()) / 2;
            rect2.right = rect.c() + rect2.left;
            rect2.bottom = rect.b() + rect2.top;
        }
        this.H.s(rect2.left, rect2.top, rect2.width(), rect2.height());
        this.J.m(rect2, v2, rotation, rect.a);
    }

    public void Y(int transformPivotTarget) {
        this.h0 = transformPivotTarget;
        this.i0 = null;
    }

    public void Z(View view) {
        this.C = view;
        this.D = view.getId();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            this.F = ((ConstraintLayout.b) layoutParams).a();
        }
    }

    public void a(td key) {
        this.b0.add(key);
    }

    public void a0(int parentWidth, int parentHeight, float transitionDuration, long currentTime) {
        ArrayList arrayList;
        String[] strArr;
        we weVar;
        md i2;
        we weVar2;
        Integer num;
        kd l2;
        we weVar3;
        new HashSet();
        HashSet<String> hashSet = new HashSet<>();
        HashSet<String> hashSet2 = new HashSet<>();
        HashSet<String> hashSet3 = new HashSet<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        int i3 = this.g0;
        if (i3 != td.a) {
            this.H.P = i3;
        }
        this.J.f(this.K, hashSet2);
        ArrayList<td> arrayList2 = this.b0;
        if (arrayList2 != null) {
            Iterator<td> it = arrayList2.iterator();
            arrayList = null;
            while (it.hasNext()) {
                td next = it.next();
                if (next instanceof xd) {
                    xd xdVar = (xd) next;
                    K(new he(parentWidth, parentHeight, xdVar, this.H, this.I));
                    int i4 = xdVar.E;
                    if (i4 != td.a) {
                        this.G = i4;
                    }
                } else if (next instanceof vd) {
                    next.d(hashSet3);
                } else if (next instanceof zd) {
                    next.d(hashSet);
                } else if (next instanceof ae) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((ae) next);
                } else {
                    next.i(hashMap);
                    next.d(hashSet2);
                }
            }
        } else {
            arrayList = null;
        }
        char c2 = 0;
        if (arrayList != null) {
            this.f0 = (ae[]) arrayList.toArray(new ae[0]);
        }
        char c3 = 1;
        if (!hashSet2.isEmpty()) {
            this.d0 = new HashMap<>();
            Iterator<String> it2 = hashSet2.iterator();
            while (it2.hasNext()) {
                String next2 = it2.next();
                if (next2.startsWith("CUSTOM,")) {
                    SparseArray sparseArray = new SparseArray();
                    String str = next2.split(",")[c3];
                    Iterator<td> it3 = this.b0.iterator();
                    while (it3.hasNext()) {
                        td next3 = it3.next();
                        HashMap<String, we> hashMap2 = next3.C;
                        if (hashMap2 != null && (weVar3 = hashMap2.get(str)) != null) {
                            sparseArray.append(next3.y, weVar3);
                        }
                    }
                    l2 = kd.k(next2, sparseArray);
                } else {
                    l2 = kd.l(next2);
                }
                if (l2 != null) {
                    l2.i(next2);
                    this.d0.put(next2, l2);
                }
                c3 = 1;
            }
            ArrayList<td> arrayList3 = this.b0;
            if (arrayList3 != null) {
                Iterator<td> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    td next4 = it4.next();
                    if (next4 instanceof ud) {
                        next4.a(this.d0);
                    }
                }
            }
            this.J.a(this.d0, 0);
            this.K.a(this.d0, 100);
            for (String str2 : this.d0.keySet()) {
                int intValue = (!hashMap.containsKey(str2) || (num = hashMap.get(str2)) == null) ? 0 : num.intValue();
                kd kdVar = this.d0.get(str2);
                if (kdVar != null) {
                    kdVar.j(intValue);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            if (this.c0 == null) {
                this.c0 = new HashMap<>();
            }
            Iterator<String> it5 = hashSet.iterator();
            while (it5.hasNext()) {
                String next5 = it5.next();
                if (!this.c0.containsKey(next5)) {
                    if (next5.startsWith("CUSTOM,")) {
                        SparseArray sparseArray2 = new SparseArray();
                        String str3 = next5.split(",")[1];
                        Iterator<td> it6 = this.b0.iterator();
                        while (it6.hasNext()) {
                            td next6 = it6.next();
                            HashMap<String, we> hashMap3 = next6.C;
                            if (hashMap3 != null && (weVar2 = hashMap3.get(str3)) != null) {
                                sparseArray2.append(next6.y, weVar2);
                            }
                        }
                        i2 = md.h(next5, sparseArray2);
                    } else {
                        i2 = md.i(next5, currentTime);
                    }
                    if (i2 != null) {
                        i2.e(next5);
                        this.c0.put(next5, i2);
                    }
                }
            }
            ArrayList<td> arrayList4 = this.b0;
            if (arrayList4 != null) {
                Iterator<td> it7 = arrayList4.iterator();
                while (it7.hasNext()) {
                    td next7 = it7.next();
                    if (next7 instanceof zd) {
                        ((zd) next7).W(this.c0);
                    }
                }
            }
            for (String str4 : this.c0.keySet()) {
                this.c0.get(str4).f(hashMap.containsKey(str4) ? hashMap.get(str4).intValue() : 0);
            }
        }
        int i5 = 2;
        int size = this.Z.size() + 2;
        he[] heVarArr = new he[size];
        heVarArr[0] = this.H;
        heVarArr[size - 1] = this.I;
        if (this.Z.size() > 0 && this.G == -1) {
            this.G = 0;
        }
        Iterator<he> it8 = this.Z.iterator();
        int i6 = 1;
        while (it8.hasNext()) {
            heVarArr[i6] = it8.next();
            i6++;
        }
        HashSet hashSet4 = new HashSet();
        for (String str5 : this.I.T.keySet()) {
            if (this.H.T.containsKey(str5)) {
                if (!hashSet2.contains("CUSTOM," + str5)) {
                    hashSet4.add(str5);
                }
            }
        }
        String[] strArr2 = (String[]) hashSet4.toArray(new String[0]);
        this.V = strArr2;
        this.W = new int[strArr2.length];
        int i7 = 0;
        while (true) {
            strArr = this.V;
            if (i7 >= strArr.length) {
                break;
            }
            String str6 = strArr[i7];
            this.W[i7] = 0;
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    break;
                }
                if (heVarArr[i8].T.containsKey(str6) && (weVar = heVarArr[i8].T.get(str6)) != null) {
                    int[] iArr = this.W;
                    iArr[i7] = weVar.p() + iArr[i7];
                    break;
                }
                i8++;
            }
            i7++;
        }
        boolean z2 = heVarArr[0].P != td.a;
        int length = 18 + strArr.length;
        boolean[] zArr = new boolean[length];
        for (int i9 = 1; i9 < size; i9++) {
            heVarArr[i9].e(heVarArr[i9 - 1], zArr, this.V, z2);
        }
        int i10 = 0;
        for (int i11 = 1; i11 < length; i11++) {
            if (zArr[i11]) {
                i10++;
            }
        }
        this.S = new int[i10];
        int max = Math.max(2, i10);
        this.T = new double[max];
        this.U = new double[max];
        int i12 = 0;
        for (int i13 = 1; i13 < length; i13++) {
            if (zArr[i13]) {
                this.S[i12] = i13;
                i12++;
            }
        }
        double[][] dArr = (double[][]) Array.newInstance(double.class, size, this.S.length);
        double[] dArr2 = new double[size];
        for (int i14 = 0; i14 < size; i14++) {
            heVarArr[i14].f(dArr[i14], this.S);
            dArr2[i14] = heVarArr[i14].H;
        }
        int i15 = 0;
        while (true) {
            int[] iArr2 = this.S;
            if (i15 >= iArr2.length) {
                break;
            }
            if (iArr2[i15] < he.E.length) {
                String C = wo1.C(new StringBuilder(), he.E[this.S[i15]], " [");
                for (int i16 = 0; i16 < size; i16++) {
                    StringBuilder G = wo1.G(C);
                    G.append(dArr[i16][i15]);
                    C = G.toString();
                }
            }
            i15++;
        }
        this.L = new f9[this.V.length + 1];
        int i17 = 0;
        while (true) {
            String[] strArr3 = this.V;
            if (i17 >= strArr3.length) {
                break;
            }
            String str7 = strArr3[i17];
            int i18 = 0;
            double[] dArr3 = null;
            int i19 = 0;
            double[][] dArr4 = null;
            while (i18 < size) {
                if (heVarArr[i18].n(str7)) {
                    if (dArr4 == null) {
                        dArr3 = new double[size];
                        int[] iArr3 = new int[i5];
                        iArr3[1] = heVarArr[i18].l(str7);
                        iArr3[c2] = size;
                        dArr4 = (double[][]) Array.newInstance(double.class, iArr3);
                    }
                    dArr3[i19] = heVarArr[i18].H;
                    heVarArr[i18].k(str7, dArr4[i19], 0);
                    i19++;
                }
                i18++;
                i5 = 2;
                c2 = 0;
            }
            i17++;
            this.L[i17] = f9.a(this.G, Arrays.copyOf(dArr3, i19), (double[][]) Arrays.copyOf(dArr4, i19));
            i5 = 2;
            c2 = 0;
        }
        this.L[0] = f9.a(this.G, dArr2, dArr);
        if (heVarArr[0].P != td.a) {
            int[] iArr4 = new int[size];
            double[] dArr5 = new double[size];
            double[][] dArr6 = (double[][]) Array.newInstance(double.class, size, 2);
            for (int i20 = 0; i20 < size; i20++) {
                iArr4[i20] = heVarArr[i20].P;
                dArr5[i20] = heVarArr[i20].H;
                dArr6[i20][0] = heVarArr[i20].J;
                dArr6[i20][1] = heVarArr[i20].K;
            }
            this.M = f9.b(iArr4, dArr5, dArr6);
        }
        float f2 = Float.NaN;
        this.e0 = new HashMap<>();
        if (this.b0 != null) {
            Iterator<String> it9 = hashSet3.iterator();
            while (it9.hasNext()) {
                String next8 = it9.next();
                jd l3 = jd.l(next8);
                if (l3 != null) {
                    if (l3.k() && Float.isNaN(f2)) {
                        f2 = D();
                    }
                    l3.i(next8);
                    this.e0.put(next8, l3);
                }
            }
            Iterator<td> it10 = this.b0.iterator();
            while (it10.hasNext()) {
                td next9 = it10.next();
                if (next9 instanceof vd) {
                    ((vd) next9).a0(this.e0);
                }
            }
            for (jd jdVar : this.e0.values()) {
                jdVar.j(f2);
            }
        }
    }

    public void b(ArrayList<td> list) {
        this.b0.addAll(list);
    }

    public void b0(ce motionController) {
        this.H.v(motionController, motionController.H);
        this.I.v(motionController, motionController.I);
    }

    public void c(float[] bounds, int pointCount) {
        float f2;
        float f3 = 1.0f / (pointCount - 1);
        HashMap<String, kd> hashMap = this.d0;
        if (hashMap != null) {
            hashMap.get("translationX");
        }
        HashMap<String, kd> hashMap2 = this.d0;
        if (hashMap2 != null) {
            hashMap2.get("translationY");
        }
        HashMap<String, jd> hashMap3 = this.e0;
        if (hashMap3 != null) {
            hashMap3.get("translationX");
        }
        HashMap<String, jd> hashMap4 = this.e0;
        if (hashMap4 != null) {
            hashMap4.get("translationY");
        }
        for (int i2 = 0; i2 < pointCount; i2++) {
            float f4 = i2 * f3;
            float f5 = this.P;
            float f6 = 0.0f;
            if (f5 != 1.0f) {
                float f7 = this.O;
                if (f4 < f7) {
                    f4 = 0.0f;
                }
                if (f4 > f7 && f4 < 1.0d) {
                    f4 = Math.min((f4 - f7) * f5, 1.0f);
                }
            }
            double d2 = f4;
            h9 h9Var = this.H.F;
            float f8 = Float.NaN;
            Iterator<he> it = this.Z.iterator();
            while (it.hasNext()) {
                he next = it.next();
                h9 h9Var2 = next.F;
                if (h9Var2 != null) {
                    float f9 = next.H;
                    if (f9 < f4) {
                        h9Var = h9Var2;
                        f6 = f9;
                    } else if (Float.isNaN(f8)) {
                        f8 = next.H;
                    }
                }
            }
            if (h9Var != null) {
                if (Float.isNaN(f8)) {
                    f8 = 1.0f;
                }
                d2 = (((float) h9Var.a((f4 - f6) / f2)) * (f8 - f6)) + f6;
            }
            this.L[0].d(d2, this.T);
            f9 f9Var = this.M;
            if (f9Var != null) {
                double[] dArr = this.T;
                if (dArr.length > 0) {
                    f9Var.d(d2, dArr);
                }
            }
            this.H.g(this.S, this.T, bounds, i2 * 2);
        }
    }

    public int d(float[] keyBounds, int[] mode) {
        if (keyBounds != null) {
            double[] h2 = this.L[0].h();
            if (mode != null) {
                Iterator<he> it = this.Z.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    mode[i2] = it.next().U;
                    i2++;
                }
            }
            int i3 = 0;
            for (double d2 : h2) {
                this.L[0].d(d2, this.T);
                this.H.g(this.S, this.T, keyBounds, i3);
                i3 += 2;
            }
            return i3 / 2;
        }
        return 0;
    }

    public int e(float[] keyFrames, int[] mode) {
        if (keyFrames != null) {
            double[] h2 = this.L[0].h();
            if (mode != null) {
                Iterator<he> it = this.Z.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    mode[i2] = it.next().U;
                    i2++;
                }
            }
            int i3 = 0;
            for (int i4 = 0; i4 < h2.length; i4++) {
                this.L[0].d(h2[i4], this.T);
                this.H.h(h2[i4], this.S, this.T, keyFrames, i3);
                i3 += 2;
            }
            return i3 / 2;
        }
        return 0;
    }

    public void f(float[] points, int pointCount) {
        double d2;
        float f2;
        float f3 = 1.0f;
        float f4 = 1.0f / (pointCount - 1);
        HashMap<String, kd> hashMap = this.d0;
        kd kdVar = hashMap == null ? null : hashMap.get("translationX");
        HashMap<String, kd> hashMap2 = this.d0;
        kd kdVar2 = hashMap2 == null ? null : hashMap2.get("translationY");
        HashMap<String, jd> hashMap3 = this.e0;
        jd jdVar = hashMap3 == null ? null : hashMap3.get("translationX");
        HashMap<String, jd> hashMap4 = this.e0;
        jd jdVar2 = hashMap4 != null ? hashMap4.get("translationY") : null;
        int i2 = 0;
        while (i2 < pointCount) {
            float f5 = i2 * f4;
            float f6 = this.P;
            if (f6 != f3) {
                float f7 = this.O;
                if (f5 < f7) {
                    f5 = 0.0f;
                }
                if (f5 > f7 && f5 < 1.0d) {
                    f5 = Math.min((f5 - f7) * f6, f3);
                }
            }
            float f8 = f5;
            double d3 = f8;
            h9 h9Var = this.H.F;
            float f9 = Float.NaN;
            Iterator<he> it = this.Z.iterator();
            float f10 = 0.0f;
            while (it.hasNext()) {
                he next = it.next();
                h9 h9Var2 = next.F;
                double d4 = d3;
                if (h9Var2 != null) {
                    float f11 = next.H;
                    if (f11 < f8) {
                        f10 = f11;
                        h9Var = h9Var2;
                    } else if (Float.isNaN(f9)) {
                        f9 = next.H;
                    }
                }
                d3 = d4;
            }
            double d5 = d3;
            if (h9Var != null) {
                if (Float.isNaN(f9)) {
                    f9 = 1.0f;
                }
                d2 = (((float) h9Var.a((f8 - f10) / f2)) * (f9 - f10)) + f10;
            } else {
                d2 = d5;
            }
            this.L[0].d(d2, this.T);
            f9 f9Var = this.M;
            if (f9Var != null) {
                double[] dArr = this.T;
                if (dArr.length > 0) {
                    f9Var.d(d2, dArr);
                }
            }
            int i3 = i2 * 2;
            int i4 = i2;
            this.H.h(d2, this.S, this.T, points, i3);
            if (jdVar != null) {
                points[i3] = jdVar.a(f8) + points[i3];
            } else if (kdVar != null) {
                points[i3] = kdVar.a(f8) + points[i3];
            }
            if (jdVar2 != null) {
                int i5 = i3 + 1;
                points[i5] = jdVar2.a(f8) + points[i5];
            } else if (kdVar2 != null) {
                int i6 = i3 + 1;
                points[i6] = kdVar2.a(f8) + points[i6];
            }
            i2 = i4 + 1;
            f3 = 1.0f;
        }
    }

    public void g(float p2, float[] path, int offset) {
        this.L[0].d(j(p2, null), this.T);
        this.H.m(this.S, this.T, path, offset);
    }

    public void h(float[] path, int pointCount) {
        float f2 = 1.0f / (pointCount - 1);
        for (int i2 = 0; i2 < pointCount; i2++) {
            this.L[0].d(j(i2 * f2, null), this.T);
            this.H.m(this.S, this.T, path, i2 * 8);
        }
    }

    public void i(boolean start) {
        if (!"button".equals(qd.k(this.C)) || this.f0 == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            ae[] aeVarArr = this.f0;
            if (i2 >= aeVarArr.length) {
                return;
            }
            aeVarArr[i2].A(start ? -100.0f : 100.0f, this.C);
            i2++;
        }
    }

    public int k() {
        return this.H.Q;
    }

    public int l(String attributeType, float[] points, int pointCount) {
        kd kdVar = this.d0.get(attributeType);
        if (kdVar == null) {
            return -1;
        }
        for (int i2 = 0; i2 < points.length; i2++) {
            points[i2] = kdVar.a(i2 / (points.length - 1));
        }
        return points.length;
    }

    public void m(double p2, float[] pos, float[] vel) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.L[0].d(p2, dArr);
        this.L[0].g(p2, dArr2);
        Arrays.fill(vel, 0.0f);
        this.H.i(p2, this.S, dArr, pos, dArr2, vel);
    }

    public float n() {
        return this.Q;
    }

    public float o() {
        return this.R;
    }

    public void p(float position, float locationX, float locationY, float[] mAnchorDpDt) {
        double[] dArr;
        float j2 = j(position, this.a0);
        f9[] f9VarArr = this.L;
        int i2 = 0;
        if (f9VarArr != null) {
            double d2 = j2;
            f9VarArr[0].g(d2, this.U);
            this.L[0].d(d2, this.T);
            float f2 = this.a0[0];
            while (true) {
                dArr = this.U;
                if (i2 >= dArr.length) {
                    break;
                }
                dArr[i2] = dArr[i2] * f2;
                i2++;
            }
            f9 f9Var = this.M;
            if (f9Var != null) {
                double[] dArr2 = this.T;
                if (dArr2.length > 0) {
                    f9Var.d(d2, dArr2);
                    this.M.g(d2, this.U);
                    this.H.t(locationX, locationY, mAnchorDpDt, this.S, this.U, this.T);
                    return;
                }
                return;
            }
            this.H.t(locationX, locationY, mAnchorDpDt, this.S, dArr, this.T);
            return;
        }
        he heVar = this.I;
        float f3 = heVar.J;
        he heVar2 = this.H;
        float f4 = f3 - heVar2.J;
        float f5 = heVar.K - heVar2.K;
        mAnchorDpDt[0] = (((heVar.L - heVar2.L) + f4) * locationX) + ((1.0f - locationX) * f4);
        mAnchorDpDt[1] = (((heVar.M - heVar2.M) + f5) * locationY) + ((1.0f - locationY) * f5);
    }

    public int q() {
        int i2 = this.H.G;
        Iterator<he> it = this.Z.iterator();
        while (it.hasNext()) {
            i2 = Math.max(i2, it.next().G);
        }
        return Math.max(i2, this.I.G);
    }

    public float r() {
        return this.I.M;
    }

    public float s() {
        return this.I.L;
    }

    public float t() {
        return this.I.J;
    }

    public String toString() {
        StringBuilder G = wo1.G(" start: x: ");
        G.append(this.H.J);
        G.append(" y: ");
        G.append(this.H.K);
        G.append(" end: x: ");
        G.append(this.I.J);
        G.append(" y: ");
        G.append(this.I.K);
        return G.toString();
    }

    public float u() {
        return this.I.K;
    }

    public he w(int i2) {
        return this.Z.get(i2);
    }

    public int x(int type, int[] info) {
        float[] fArr = new float[2];
        Iterator<td> it = this.b0.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            td next = it.next();
            int i4 = next.B;
            if (i4 == type || type != -1) {
                info[i3] = 0;
                int i5 = i3 + 1;
                info[i5] = i4;
                int i6 = i5 + 1;
                int i7 = next.y;
                info[i6] = i7;
                double d2 = i7 / 100.0f;
                this.L[0].d(d2, this.T);
                this.H.h(d2, this.S, this.T, fArr, 0);
                int i8 = i6 + 1;
                info[i8] = Float.floatToIntBits(fArr[0]);
                int i9 = i8 + 1;
                info[i9] = Float.floatToIntBits(fArr[1]);
                if (next instanceof xd) {
                    xd xdVar = (xd) next;
                    int i10 = i9 + 1;
                    info[i10] = xdVar.b0;
                    int i11 = i10 + 1;
                    info[i11] = Float.floatToIntBits(xdVar.X);
                    i9 = i11 + 1;
                    info[i9] = Float.floatToIntBits(xdVar.Y);
                }
                int i12 = i9 + 1;
                info[i3] = i12 - i3;
                i2++;
                i3 = i12;
            }
        }
        return i2;
    }

    public float y(int type, float x2, float y2) {
        he heVar = this.I;
        float f2 = heVar.J;
        he heVar2 = this.H;
        float f3 = heVar2.J;
        float f4 = f2 - f3;
        float f5 = heVar.K;
        float f6 = heVar2.K;
        float f7 = f5 - f6;
        float f8 = (heVar2.L / 2.0f) + f3;
        float f9 = (heVar2.M / 2.0f) + f6;
        float hypot = (float) Math.hypot(f4, f7);
        if (hypot < 1.0E-7d) {
            return Float.NaN;
        }
        float f10 = x2 - f8;
        float f11 = y2 - f9;
        if (((float) Math.hypot(f10, f11)) == 0.0f) {
            return 0.0f;
        }
        float f12 = (f11 * f7) + (f10 * f4);
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            if (type != 5) {
                                return 0.0f;
                            }
                            return f11 / f7;
                        }
                        return f10 / f7;
                    }
                    return f11 / f4;
                }
                return f10 / f4;
            }
            return (float) Math.sqrt((hypot * hypot) - (f12 * f12));
        }
        return f12 / hypot;
    }

    public int z(int[] type, float[] pos) {
        Iterator<td> it = this.b0.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            td next = it.next();
            int i4 = next.y;
            type[i2] = (next.B * 1000) + i4;
            double d2 = i4 / 100.0f;
            this.L[0].d(d2, this.T);
            this.H.h(d2, this.S, this.T, pos, i3);
            i3 += 2;
            i2++;
        }
        return i2;
    }
}