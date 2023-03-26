package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.p7700g.p99005.ff;
import com.p7700g.p99005.md;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: KeyTimeCycle.java */
/* loaded from: classes.dex */
public class zd extends td {
    public static final String D = "KeyTimeCycle";
    private static final String E = "KeyTimeCycle";
    public static final String F = "wavePeriod";
    public static final String G = "waveOffset";
    public static final String H = "waveShape";
    public static final int I = 0;
    public static final int J = 1;
    public static final int K = 2;
    public static final int L = 3;
    public static final int M = 4;
    public static final int N = 5;
    public static final int O = 6;
    public static final int P = 3;
    private String Q;
    private int R = -1;
    private float S = Float.NaN;
    private float T = Float.NaN;
    private float U = Float.NaN;
    private float V = Float.NaN;
    private float W = Float.NaN;
    private float X = Float.NaN;
    private float Y = Float.NaN;
    private float Z = Float.NaN;
    private float a0 = Float.NaN;
    private float b0 = Float.NaN;
    private float c0 = Float.NaN;
    private float d0 = Float.NaN;
    private int e0 = 0;
    private String f0 = null;
    private float g0 = Float.NaN;
    private float h0 = 0.0f;

    /* compiled from: KeyTimeCycle.java */
    /* loaded from: classes.dex */
    public static class a {
        private static final int a = 1;
        private static final int b = 2;
        private static final int c = 4;
        private static final int d = 5;
        private static final int e = 6;
        private static final int f = 8;
        private static final int g = 7;
        private static final int h = 9;
        private static final int i = 10;
        private static final int j = 12;
        private static final int k = 13;
        private static final int l = 14;
        private static final int m = 15;
        private static final int n = 16;
        private static final int o = 17;
        private static final int p = 18;
        private static final int q = 19;
        private static final int r = 20;
        private static final int s = 21;
        private static SparseIntArray t;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            t = sparseIntArray;
            sparseIntArray.append(ff.m.Pf, 1);
            t.append(ff.m.Yf, 2);
            t.append(ff.m.Uf, 4);
            t.append(ff.m.Vf, 5);
            t.append(ff.m.Wf, 6);
            t.append(ff.m.Sf, 7);
            t.append(ff.m.eg, 8);
            t.append(ff.m.dg, 9);
            t.append(ff.m.cg, 10);
            t.append(ff.m.ag, 12);
            t.append(ff.m.Zf, 13);
            t.append(ff.m.Tf, 14);
            t.append(ff.m.Qf, 15);
            t.append(ff.m.Rf, 16);
            t.append(ff.m.Xf, 17);
            t.append(ff.m.bg, 18);
            t.append(ff.m.hg, 20);
            t.append(ff.m.gg, 21);
            t.append(ff.m.jg, 19);
        }

        private a() {
        }

        public static void a(zd c2, TypedArray a2) {
            int indexCount = a2.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = a2.getIndex(i2);
                switch (t.get(index)) {
                    case 1:
                        c2.S = a2.getFloat(index, c2.S);
                        break;
                    case 2:
                        c2.T = a2.getDimension(index, c2.T);
                        break;
                    case 3:
                    case 11:
                    default:
                        Integer.toHexString(index);
                        t.get(index);
                        break;
                    case 4:
                        c2.U = a2.getFloat(index, c2.U);
                        break;
                    case 5:
                        c2.V = a2.getFloat(index, c2.V);
                        break;
                    case 6:
                        c2.W = a2.getFloat(index, c2.W);
                        break;
                    case 7:
                        c2.Y = a2.getFloat(index, c2.Y);
                        break;
                    case 8:
                        c2.X = a2.getFloat(index, c2.X);
                        break;
                    case 9:
                        c2.Q = a2.getString(index);
                        break;
                    case 10:
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
                    case 12:
                        c2.y = a2.getInt(index, c2.y);
                        break;
                    case 13:
                        c2.R = a2.getInteger(index, c2.R);
                        break;
                    case 14:
                        c2.Z = a2.getFloat(index, c2.Z);
                        break;
                    case 15:
                        c2.a0 = a2.getDimension(index, c2.a0);
                        break;
                    case 16:
                        c2.b0 = a2.getDimension(index, c2.b0);
                        break;
                    case 17:
                        c2.c0 = a2.getDimension(index, c2.c0);
                        break;
                    case 18:
                        c2.d0 = a2.getFloat(index, c2.d0);
                        break;
                    case 19:
                        if (a2.peekValue(index).type == 3) {
                            c2.f0 = a2.getString(index);
                            c2.e0 = 7;
                            break;
                        } else {
                            c2.e0 = a2.getInt(index, c2.e0);
                            break;
                        }
                    case 20:
                        c2.g0 = a2.getFloat(index, c2.g0);
                        break;
                    case 21:
                        if (a2.peekValue(index).type == 5) {
                            c2.h0 = a2.getDimension(index, c2.h0);
                            break;
                        } else {
                            c2.h0 = a2.getFloat(index, c2.h0);
                            break;
                        }
                }
            }
        }
    }

    public zd() {
        this.B = 3;
        this.C = new HashMap<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r1.equals("scaleY") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void W(HashMap<String, md> splines) {
        Iterator<String> it = splines.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            md mdVar = splines.get(next);
            if (mdVar != null) {
                char c = 7;
                if (next.startsWith("CUSTOM")) {
                    we weVar = this.C.get(next.substring(7));
                    if (weVar != null) {
                        ((md.b) mdVar).k(this.y, weVar, this.g0, this.e0, this.h0);
                    }
                } else {
                    switch (next.hashCode()) {
                        case -1249320806:
                            if (next.equals("rotationX")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1249320805:
                            if (next.equals("rotationY")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497657:
                            if (next.equals("translationX")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497656:
                            if (next.equals("translationY")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497655:
                            if (next.equals("translationZ")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1001078227:
                            if (next.equals("progress")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189618:
                            if (next.equals("scaleX")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189617:
                            break;
                        case -40300674:
                            if (next.equals(td.d)) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    switch (c) {
                        case 0:
                            if (!Float.isNaN(this.V)) {
                                mdVar.c(this.y, this.V, this.g0, this.e0, this.h0);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.W)) {
                                mdVar.c(this.y, this.W, this.g0, this.e0, this.h0);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.a0)) {
                                mdVar.c(this.y, this.a0, this.g0, this.e0, this.h0);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.b0)) {
                                mdVar.c(this.y, this.b0, this.g0, this.e0, this.h0);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.c0)) {
                                mdVar.c(this.y, this.c0, this.g0, this.e0, this.h0);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.d0)) {
                                mdVar.c(this.y, this.d0, this.g0, this.e0, this.h0);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.Y)) {
                                mdVar.c(this.y, this.Y, this.g0, this.e0, this.h0);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.Z)) {
                                mdVar.c(this.y, this.Z, this.g0, this.e0, this.h0);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.U)) {
                                mdVar.c(this.y, this.U, this.g0, this.e0, this.h0);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.T)) {
                                mdVar.c(this.y, this.T, this.g0, this.e0, this.h0);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.X)) {
                                mdVar.c(this.y, this.X, this.g0, this.e0, this.h0);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.S)) {
                                mdVar.c(this.y, this.S, this.g0, this.e0, this.h0);
                                break;
                            } else {
                                continue;
                            }
                    }
                }
            }
        }
    }

    @Override // com.p7700g.p99005.td
    public void a(HashMap<String, kd> splines) {
        throw new IllegalArgumentException(" KeyTimeCycles do not support SplineSet");
    }

    @Override // com.p7700g.p99005.td
    /* renamed from: b */
    public td clone() {
        return new zd().c(this);
    }

    @Override // com.p7700g.p99005.td
    public td c(td src) {
        super.c(src);
        zd zdVar = (zd) src;
        this.Q = zdVar.Q;
        this.R = zdVar.R;
        this.e0 = zdVar.e0;
        this.g0 = zdVar.g0;
        this.h0 = zdVar.h0;
        this.d0 = zdVar.d0;
        this.S = zdVar.S;
        this.T = zdVar.T;
        this.U = zdVar.U;
        this.X = zdVar.X;
        this.V = zdVar.V;
        this.W = zdVar.W;
        this.Y = zdVar.Y;
        this.Z = zdVar.Z;
        this.a0 = zdVar.a0;
        this.b0 = zdVar.b0;
        this.c0 = zdVar.c0;
        return this;
    }

    @Override // com.p7700g.p99005.td
    public void d(HashSet<String> attributes) {
        if (!Float.isNaN(this.S)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.T)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.U)) {
            attributes.add(td.d);
        }
        if (!Float.isNaN(this.V)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.W)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.a0)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.b0)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.c0)) {
            attributes.add("translationZ");
        }
        if (!Float.isNaN(this.X)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.Y)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.Z)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.d0)) {
            attributes.add("progress");
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
        a.a(this, context.obtainStyledAttributes(attrs, ff.m.Of));
    }

    @Override // com.p7700g.p99005.td
    public void i(HashMap<String, Integer> interpolation) {
        if (this.R == -1) {
            return;
        }
        if (!Float.isNaN(this.S)) {
            interpolation.put("alpha", Integer.valueOf(this.R));
        }
        if (!Float.isNaN(this.T)) {
            interpolation.put("elevation", Integer.valueOf(this.R));
        }
        if (!Float.isNaN(this.U)) {
            interpolation.put(td.d, Integer.valueOf(this.R));
        }
        if (!Float.isNaN(this.V)) {
            interpolation.put("rotationX", Integer.valueOf(this.R));
        }
        if (!Float.isNaN(this.W)) {
            interpolation.put("rotationY", Integer.valueOf(this.R));
        }
        if (!Float.isNaN(this.a0)) {
            interpolation.put("translationX", Integer.valueOf(this.R));
        }
        if (!Float.isNaN(this.b0)) {
            interpolation.put("translationY", Integer.valueOf(this.R));
        }
        if (!Float.isNaN(this.c0)) {
            interpolation.put("translationZ", Integer.valueOf(this.R));
        }
        if (!Float.isNaN(this.X)) {
            interpolation.put("transitionPathRotate", Integer.valueOf(this.R));
        }
        if (!Float.isNaN(this.Y)) {
            interpolation.put("scaleX", Integer.valueOf(this.R));
        }
        if (!Float.isNaN(this.Y)) {
            interpolation.put("scaleY", Integer.valueOf(this.R));
        }
        if (!Float.isNaN(this.d0)) {
            interpolation.put("progress", Integer.valueOf(this.R));
        }
        if (this.C.size() > 0) {
            for (String str : this.C.keySet()) {
                interpolation.put(wo1.t("CUSTOM,", str), Integer.valueOf(this.R));
            }
        }
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
            case 1532805160:
                if (tag.equals("waveShape")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.d0 = m(value);
                return;
            case 1:
                this.Q = value.toString();
                return;
            case 2:
                this.V = m(value);
                return;
            case 3:
                this.W = m(value);
                return;
            case 4:
                this.a0 = m(value);
                return;
            case 5:
                this.b0 = m(value);
                return;
            case 6:
                this.c0 = m(value);
                return;
            case 7:
                this.Y = m(value);
                return;
            case '\b':
                this.Z = m(value);
                return;
            case '\t':
                this.U = m(value);
                return;
            case '\n':
                this.T = m(value);
                return;
            case 11:
                this.X = m(value);
                return;
            case '\f':
                this.S = m(value);
                return;
            case '\r':
                this.h0 = m(value);
                return;
            case 14:
                this.g0 = m(value);
                return;
            case 15:
                this.R = n(value);
                return;
            case 16:
                if (value instanceof Integer) {
                    this.e0 = n(value);
                    return;
                }
                this.e0 = 7;
                this.f0 = value.toString();
                return;
            default:
                return;
        }
    }
}