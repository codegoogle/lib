package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.p7700g.p99005.ff;
import com.p7700g.p99005.we;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: KeyCycle.java */
/* loaded from: classes.dex */
public class vd extends td {
    private static final String D = "KeyCycle";
    public static final String E = "KeyCycle";
    public static final String F = "wavePeriod";
    public static final String G = "waveOffset";
    public static final String H = "wavePhase";
    public static final String I = "waveShape";
    public static final int J = 0;
    public static final int K = 1;
    public static final int L = 2;
    public static final int M = 3;
    public static final int N = 4;
    public static final int O = 5;
    public static final int P = 6;
    public static final int Q = 4;
    private String R = null;
    private int S = 0;
    private int T = -1;
    private String U = null;
    private float V = Float.NaN;
    private float W = 0.0f;
    private float X = 0.0f;
    private float Y = Float.NaN;
    private int Z = -1;
    private float a0 = Float.NaN;
    private float b0 = Float.NaN;
    private float c0 = Float.NaN;
    private float d0 = Float.NaN;
    private float e0 = Float.NaN;
    private float f0 = Float.NaN;
    private float g0 = Float.NaN;
    private float h0 = Float.NaN;
    private float i0 = Float.NaN;
    private float j0 = Float.NaN;
    private float k0 = Float.NaN;

    /* compiled from: KeyCycle.java */
    /* loaded from: classes.dex */
    public static class a {
        private static final int a = 1;
        private static final int b = 2;
        private static final int c = 3;
        private static final int d = 4;
        private static final int e = 5;
        private static final int f = 6;
        private static final int g = 7;
        private static final int h = 8;
        private static final int i = 9;
        private static final int j = 10;
        private static final int k = 11;
        private static final int l = 12;
        private static final int m = 13;
        private static final int n = 14;
        private static final int o = 15;
        private static final int p = 16;
        private static final int q = 17;
        private static final int r = 18;
        private static final int s = 19;
        private static final int t = 20;
        private static final int u = 21;
        private static SparseIntArray v;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            v = sparseIntArray;
            sparseIntArray.append(ff.m.qf, 1);
            v.append(ff.m.of, 2);
            v.append(ff.m.rf, 3);
            v.append(ff.m.nf, 4);
            v.append(ff.m.wf, 5);
            v.append(ff.m.uf, 6);
            v.append(ff.m.tf, 7);
            v.append(ff.m.xf, 8);
            v.append(ff.m.df, 9);
            v.append(ff.m.mf, 10);
            v.append(ff.m.f4if, 11);
            v.append(ff.m.jf, 12);
            v.append(ff.m.kf, 13);
            v.append(ff.m.sf, 14);
            v.append(ff.m.gf, 15);
            v.append(ff.m.hf, 16);
            v.append(ff.m.ef, 17);
            v.append(ff.m.ff, 18);
            v.append(ff.m.lf, 19);
            v.append(ff.m.pf, 20);
            v.append(ff.m.vf, 21);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(vd c2, TypedArray a2) {
            int indexCount = a2.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = a2.getIndex(i2);
                switch (v.get(index)) {
                    case 1:
                        if (ge.H0) {
                            int resourceId = a2.getResourceId(index, c2.z);
                            c2.z = resourceId;
                            if (resourceId == -1) {
                                c2.A = a2.getString(index);
                                break;
                            } else {
                                break;
                            }
                        } else if (a2.peekValue(index).type == 3) {
                            c2.A = a2.getString(index);
                            break;
                        } else {
                            c2.z = a2.getResourceId(index, c2.z);
                            break;
                        }
                    case 2:
                        c2.y = a2.getInt(index, c2.y);
                        break;
                    case 3:
                        c2.R = a2.getString(index);
                        break;
                    case 4:
                        c2.S = a2.getInteger(index, c2.S);
                        break;
                    case 5:
                        if (a2.peekValue(index).type == 3) {
                            c2.U = a2.getString(index);
                            c2.T = 7;
                            break;
                        } else {
                            c2.T = a2.getInt(index, c2.T);
                            break;
                        }
                    case 6:
                        c2.V = a2.getFloat(index, c2.V);
                        break;
                    case 7:
                        if (a2.peekValue(index).type == 5) {
                            c2.W = a2.getDimension(index, c2.W);
                            break;
                        } else {
                            c2.W = a2.getFloat(index, c2.W);
                            break;
                        }
                    case 8:
                        c2.Z = a2.getInt(index, c2.Z);
                        break;
                    case 9:
                        c2.a0 = a2.getFloat(index, c2.a0);
                        break;
                    case 10:
                        c2.b0 = a2.getDimension(index, c2.b0);
                        break;
                    case 11:
                        c2.c0 = a2.getFloat(index, c2.c0);
                        break;
                    case 12:
                        c2.e0 = a2.getFloat(index, c2.e0);
                        break;
                    case 13:
                        c2.f0 = a2.getFloat(index, c2.f0);
                        break;
                    case 14:
                        c2.d0 = a2.getFloat(index, c2.d0);
                        break;
                    case 15:
                        c2.g0 = a2.getFloat(index, c2.g0);
                        break;
                    case 16:
                        c2.h0 = a2.getFloat(index, c2.h0);
                        break;
                    case 17:
                        c2.i0 = a2.getDimension(index, c2.i0);
                        break;
                    case 18:
                        c2.j0 = a2.getDimension(index, c2.j0);
                        break;
                    case 19:
                        c2.k0 = a2.getDimension(index, c2.k0);
                        break;
                    case 20:
                        c2.Y = a2.getFloat(index, c2.Y);
                        break;
                    case 21:
                        c2.X = a2.getFloat(index, c2.X) / 360.0f;
                        break;
                    default:
                        Integer.toHexString(index);
                        v.get(index);
                        break;
                }
            }
        }
    }

    public vd() {
        this.B = 4;
        this.C = new HashMap<>();
    }

    @Override // com.p7700g.p99005.td
    public void a(HashMap<String, kd> splines) {
        StringBuilder G2 = wo1.G("add ");
        G2.append(splines.size());
        G2.append(" values");
        qd.n("KeyCycle", G2.toString(), 2);
        for (String str : splines.keySet()) {
            kd kdVar = splines.get(str);
            if (kdVar != null) {
                str.hashCode();
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
                    case -40300674:
                        if (str.equals(td.d)) {
                            c = '\b';
                            break;
                        }
                        break;
                    case -4379043:
                        if (str.equals("elevation")) {
                            c = '\t';
                            break;
                        }
                        break;
                    case 37232917:
                        if (str.equals("transitionPathRotate")) {
                            c = '\n';
                            break;
                        }
                        break;
                    case 92909918:
                        if (str.equals("alpha")) {
                            c = 11;
                            break;
                        }
                        break;
                    case 156108012:
                        if (str.equals("waveOffset")) {
                            c = '\f';
                            break;
                        }
                        break;
                    case 1530034690:
                        if (str.equals("wavePhase")) {
                            c = '\r';
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        kdVar.g(this.y, this.e0);
                        continue;
                    case 1:
                        kdVar.g(this.y, this.f0);
                        continue;
                    case 2:
                        kdVar.g(this.y, this.i0);
                        continue;
                    case 3:
                        kdVar.g(this.y, this.j0);
                        continue;
                    case 4:
                        kdVar.g(this.y, this.k0);
                        continue;
                    case 5:
                        kdVar.g(this.y, this.Y);
                        continue;
                    case 6:
                        kdVar.g(this.y, this.g0);
                        continue;
                    case 7:
                        kdVar.g(this.y, this.h0);
                        continue;
                    case '\b':
                        kdVar.g(this.y, this.c0);
                        continue;
                    case '\t':
                        kdVar.g(this.y, this.b0);
                        continue;
                    case '\n':
                        kdVar.g(this.y, this.d0);
                        continue;
                    case 11:
                        kdVar.g(this.y, this.a0);
                        continue;
                    case '\f':
                        kdVar.g(this.y, this.W);
                        continue;
                    case '\r':
                        kdVar.g(this.y, this.X);
                        continue;
                    default:
                        str.startsWith("CUSTOM");
                        continue;
                }
            }
        }
    }

    public void a0(HashMap<String, jd> oscSet) {
        jd jdVar;
        jd jdVar2;
        for (String str : oscSet.keySet()) {
            if (str.startsWith("CUSTOM")) {
                we weVar = this.C.get(str.substring(7));
                if (weVar != null && weVar.j() == we.b.FLOAT_TYPE && (jdVar = oscSet.get(str)) != null) {
                    jdVar.g(this.y, this.T, this.U, this.Z, this.V, this.W, this.X, weVar.k(), weVar);
                }
            } else {
                float b0 = b0(str);
                if (!Float.isNaN(b0) && (jdVar2 = oscSet.get(str)) != null) {
                    jdVar2.f(this.y, this.T, this.U, this.Z, this.V, this.W, this.X, b0);
                }
            }
        }
    }

    @Override // com.p7700g.p99005.td
    /* renamed from: b */
    public td clone() {
        return new vd().c(this);
    }

    public float b0(String key) {
        key.hashCode();
        char c = 65535;
        switch (key.hashCode()) {
            case -1249320806:
                if (key.equals("rotationX")) {
                    c = 0;
                    break;
                }
                break;
            case -1249320805:
                if (key.equals("rotationY")) {
                    c = 1;
                    break;
                }
                break;
            case -1225497657:
                if (key.equals("translationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497656:
                if (key.equals("translationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497655:
                if (key.equals("translationZ")) {
                    c = 4;
                    break;
                }
                break;
            case -1001078227:
                if (key.equals("progress")) {
                    c = 5;
                    break;
                }
                break;
            case -908189618:
                if (key.equals("scaleX")) {
                    c = 6;
                    break;
                }
                break;
            case -908189617:
                if (key.equals("scaleY")) {
                    c = 7;
                    break;
                }
                break;
            case -40300674:
                if (key.equals(td.d)) {
                    c = '\b';
                    break;
                }
                break;
            case -4379043:
                if (key.equals("elevation")) {
                    c = '\t';
                    break;
                }
                break;
            case 37232917:
                if (key.equals("transitionPathRotate")) {
                    c = '\n';
                    break;
                }
                break;
            case 92909918:
                if (key.equals("alpha")) {
                    c = 11;
                    break;
                }
                break;
            case 156108012:
                if (key.equals("waveOffset")) {
                    c = '\f';
                    break;
                }
                break;
            case 1530034690:
                if (key.equals("wavePhase")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.e0;
            case 1:
                return this.f0;
            case 2:
                return this.i0;
            case 3:
                return this.j0;
            case 4:
                return this.k0;
            case 5:
                return this.Y;
            case 6:
                return this.g0;
            case 7:
                return this.h0;
            case '\b':
                return this.c0;
            case '\t':
                return this.b0;
            case '\n':
                return this.d0;
            case 11:
                return this.a0;
            case '\f':
                return this.W;
            case '\r':
                return this.X;
            default:
                key.startsWith("CUSTOM");
                return Float.NaN;
        }
    }

    @Override // com.p7700g.p99005.td
    public td c(td src) {
        super.c(src);
        vd vdVar = (vd) src;
        this.R = vdVar.R;
        this.S = vdVar.S;
        this.T = vdVar.T;
        this.U = vdVar.U;
        this.V = vdVar.V;
        this.W = vdVar.W;
        this.X = vdVar.X;
        this.Y = vdVar.Y;
        this.Z = vdVar.Z;
        this.a0 = vdVar.a0;
        this.b0 = vdVar.b0;
        this.c0 = vdVar.c0;
        this.d0 = vdVar.d0;
        this.e0 = vdVar.e0;
        this.f0 = vdVar.f0;
        this.g0 = vdVar.g0;
        this.h0 = vdVar.h0;
        this.i0 = vdVar.i0;
        this.j0 = vdVar.j0;
        this.k0 = vdVar.k0;
        return this;
    }

    @Override // com.p7700g.p99005.td
    public void d(HashSet<String> attributes) {
        if (!Float.isNaN(this.a0)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.b0)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.c0)) {
            attributes.add(td.d);
        }
        if (!Float.isNaN(this.e0)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.f0)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.g0)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.h0)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.d0)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.i0)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.j0)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.k0)) {
            attributes.add("translationZ");
        }
        if (this.C.size() > 0) {
            Iterator<String> it = this.C.keySet().iterator();
            while (it.hasNext()) {
                attributes.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // com.p7700g.p99005.td
    public void f(Context context, AttributeSet attrs) {
        a.b(this, context.obtainStyledAttributes(attrs, ff.m.cf));
    }

    @Override // com.p7700g.p99005.td
    public void j(String tag, Object value) {
        tag.hashCode();
        char c = 65535;
        switch (tag.hashCode()) {
            case -1913008125:
                if (tag.equals(td.v)) {
                    c = 0;
                    break;
                }
                break;
            case -1812823328:
                if (tag.equals("transitionEasing")) {
                    c = 1;
                    break;
                }
                break;
            case -1249320806:
                if (tag.equals("rotationX")) {
                    c = 2;
                    break;
                }
                break;
            case -1249320805:
                if (tag.equals("rotationY")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497657:
                if (tag.equals("translationX")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497656:
                if (tag.equals("translationY")) {
                    c = 5;
                    break;
                }
                break;
            case -1225497655:
                if (tag.equals("translationZ")) {
                    c = 6;
                    break;
                }
                break;
            case -908189618:
                if (tag.equals("scaleX")) {
                    c = 7;
                    break;
                }
                break;
            case -908189617:
                if (tag.equals("scaleY")) {
                    c = '\b';
                    break;
                }
                break;
            case -40300674:
                if (tag.equals(td.d)) {
                    c = '\t';
                    break;
                }
                break;
            case -4379043:
                if (tag.equals("elevation")) {
                    c = '\n';
                    break;
                }
                break;
            case 37232917:
                if (tag.equals("transitionPathRotate")) {
                    c = 11;
                    break;
                }
                break;
            case 92909918:
                if (tag.equals("alpha")) {
                    c = '\f';
                    break;
                }
                break;
            case 156108012:
                if (tag.equals("waveOffset")) {
                    c = '\r';
                    break;
                }
                break;
            case 184161818:
                if (tag.equals("wavePeriod")) {
                    c = 14;
                    break;
                }
                break;
            case 579057826:
                if (tag.equals("curveFit")) {
                    c = 15;
                    break;
                }
                break;
            case 1530034690:
                if (tag.equals("wavePhase")) {
                    c = 16;
                    break;
                }
                break;
            case 1532805160:
                if (tag.equals("waveShape")) {
                    c = 17;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.Y = m(value);
                return;
            case 1:
                this.R = value.toString();
                return;
            case 2:
                this.e0 = m(value);
                return;
            case 3:
                this.f0 = m(value);
                return;
            case 4:
                this.i0 = m(value);
                return;
            case 5:
                this.j0 = m(value);
                return;
            case 6:
                this.k0 = m(value);
                return;
            case 7:
                this.g0 = m(value);
                return;
            case '\b':
                this.h0 = m(value);
                return;
            case '\t':
                this.c0 = m(value);
                return;
            case '\n':
                this.b0 = m(value);
                return;
            case 11:
                this.d0 = m(value);
                return;
            case '\f':
                this.a0 = m(value);
                return;
            case '\r':
                this.W = m(value);
                return;
            case 14:
                this.V = m(value);
                return;
            case 15:
                this.S = n(value);
                return;
            case 16:
                this.X = m(value);
                return;
            case 17:
                if (value instanceof Integer) {
                    this.T = n(value);
                    return;
                }
                this.T = 7;
                this.U = value.toString();
                return;
            default:
                return;
        }
    }
}