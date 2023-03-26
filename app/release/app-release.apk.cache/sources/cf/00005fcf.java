package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.p7700g.p99005.ff;
import com.p7700g.p99005.kd;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: KeyAttributes.java */
/* loaded from: classes.dex */
public class ud extends td {
    public static final String D = "KeyAttribute";
    private static final String E = "KeyAttributes";
    private static final boolean F = false;
    public static final int G = 1;
    private String H;
    private int I = -1;
    private boolean J = false;
    private float K = Float.NaN;
    private float L = Float.NaN;
    private float M = Float.NaN;
    private float N = Float.NaN;
    private float O = Float.NaN;
    private float P = Float.NaN;
    private float Q = Float.NaN;
    private float R = Float.NaN;
    private float S = Float.NaN;
    private float T = Float.NaN;
    private float U = Float.NaN;
    private float V = Float.NaN;
    private float W = Float.NaN;
    private float X = Float.NaN;

    /* compiled from: KeyAttributes.java */
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
        private static SparseIntArray s;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            s = sparseIntArray;
            sparseIntArray.append(ff.m.Je, 1);
            s.append(ff.m.Ue, 2);
            s.append(ff.m.Qe, 4);
            s.append(ff.m.Re, 5);
            s.append(ff.m.Se, 6);
            s.append(ff.m.Ke, 19);
            s.append(ff.m.Le, 20);
            s.append(ff.m.Oe, 7);
            s.append(ff.m.bf, 8);
            s.append(ff.m.af, 9);
            s.append(ff.m.Ye, 10);
            s.append(ff.m.We, 12);
            s.append(ff.m.Ve, 13);
            s.append(ff.m.Pe, 14);
            s.append(ff.m.Me, 15);
            s.append(ff.m.Ne, 16);
            s.append(ff.m.Te, 17);
            s.append(ff.m.Xe, 18);
        }

        private a() {
        }

        public static void a(ud c2, TypedArray a2) {
            int indexCount = a2.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = a2.getIndex(i2);
                switch (s.get(index)) {
                    case 1:
                        c2.K = a2.getFloat(index, c2.K);
                        break;
                    case 2:
                        c2.L = a2.getDimension(index, c2.L);
                        break;
                    case 3:
                    case 11:
                    default:
                        Integer.toHexString(index);
                        s.get(index);
                        break;
                    case 4:
                        c2.M = a2.getFloat(index, c2.M);
                        break;
                    case 5:
                        c2.N = a2.getFloat(index, c2.N);
                        break;
                    case 6:
                        c2.O = a2.getFloat(index, c2.O);
                        break;
                    case 7:
                        c2.S = a2.getFloat(index, c2.S);
                        break;
                    case 8:
                        c2.R = a2.getFloat(index, c2.R);
                        break;
                    case 9:
                        c2.H = a2.getString(index);
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
                        c2.I = a2.getInteger(index, c2.I);
                        break;
                    case 14:
                        c2.T = a2.getFloat(index, c2.T);
                        break;
                    case 15:
                        c2.U = a2.getDimension(index, c2.U);
                        break;
                    case 16:
                        c2.V = a2.getDimension(index, c2.V);
                        break;
                    case 17:
                        c2.W = a2.getDimension(index, c2.W);
                        break;
                    case 18:
                        c2.X = a2.getFloat(index, c2.X);
                        break;
                    case 19:
                        c2.P = a2.getDimension(index, c2.P);
                        break;
                    case 20:
                        c2.Q = a2.getDimension(index, c2.Q);
                        break;
                }
            }
        }
    }

    public ud() {
        this.B = 1;
        this.C = new HashMap<>();
    }

    public int T() {
        return this.I;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
        if (r1.equals("scaleY") == false) goto L12;
     */
    @Override // com.p7700g.p99005.td
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(HashMap<String, kd> splines) {
        Iterator<String> it = splines.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            kd kdVar = splines.get(next);
            if (kdVar != null) {
                char c = 7;
                if (next.startsWith("CUSTOM")) {
                    we weVar = this.C.get(next.substring(7));
                    if (weVar != null) {
                        ((kd.b) kdVar).n(this.y, weVar);
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
                        case -760884510:
                            if (next.equals(td.g)) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -760884509:
                            if (next.equals(td.h)) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -40300674:
                            if (next.equals(td.d)) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case -4379043:
                            if (next.equals("elevation")) {
                                c = 11;
                                break;
                            }
                            c = 65535;
                            break;
                        case 37232917:
                            if (next.equals("transitionPathRotate")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 92909918:
                            if (next.equals("alpha")) {
                                c = '\r';
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
                            if (!Float.isNaN(this.N)) {
                                kdVar.g(this.y, this.N);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.O)) {
                                kdVar.g(this.y, this.O);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.U)) {
                                kdVar.g(this.y, this.U);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.V)) {
                                kdVar.g(this.y, this.V);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.W)) {
                                kdVar.g(this.y, this.W);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.X)) {
                                kdVar.g(this.y, this.X);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.S)) {
                                kdVar.g(this.y, this.S);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.T)) {
                                kdVar.g(this.y, this.T);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.N)) {
                                kdVar.g(this.y, this.P);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.O)) {
                                kdVar.g(this.y, this.Q);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.M)) {
                                kdVar.g(this.y, this.M);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.L)) {
                                kdVar.g(this.y, this.L);
                                break;
                            } else {
                                continue;
                            }
                        case '\f':
                            if (!Float.isNaN(this.R)) {
                                kdVar.g(this.y, this.R);
                                break;
                            } else {
                                continue;
                            }
                        case '\r':
                            if (!Float.isNaN(this.K)) {
                                kdVar.g(this.y, this.K);
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
    /* renamed from: b */
    public td clone() {
        return new ud().c(this);
    }

    @Override // com.p7700g.p99005.td
    public td c(td src) {
        super.c(src);
        ud udVar = (ud) src;
        this.I = udVar.I;
        this.J = udVar.J;
        this.K = udVar.K;
        this.L = udVar.L;
        this.M = udVar.M;
        this.N = udVar.N;
        this.O = udVar.O;
        this.P = udVar.P;
        this.Q = udVar.Q;
        this.R = udVar.R;
        this.S = udVar.S;
        this.T = udVar.T;
        this.U = udVar.U;
        this.V = udVar.V;
        this.W = udVar.W;
        this.X = udVar.X;
        return this;
    }

    @Override // com.p7700g.p99005.td
    public void d(HashSet<String> attributes) {
        if (!Float.isNaN(this.K)) {
            attributes.add("alpha");
        }
        if (!Float.isNaN(this.L)) {
            attributes.add("elevation");
        }
        if (!Float.isNaN(this.M)) {
            attributes.add(td.d);
        }
        if (!Float.isNaN(this.N)) {
            attributes.add("rotationX");
        }
        if (!Float.isNaN(this.O)) {
            attributes.add("rotationY");
        }
        if (!Float.isNaN(this.P)) {
            attributes.add(td.g);
        }
        if (!Float.isNaN(this.Q)) {
            attributes.add(td.h);
        }
        if (!Float.isNaN(this.U)) {
            attributes.add("translationX");
        }
        if (!Float.isNaN(this.V)) {
            attributes.add("translationY");
        }
        if (!Float.isNaN(this.W)) {
            attributes.add("translationZ");
        }
        if (!Float.isNaN(this.R)) {
            attributes.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.S)) {
            attributes.add("scaleX");
        }
        if (!Float.isNaN(this.T)) {
            attributes.add("scaleY");
        }
        if (!Float.isNaN(this.X)) {
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
        a.a(this, context.obtainStyledAttributes(attrs, ff.m.Ie));
    }

    @Override // com.p7700g.p99005.td
    public void i(HashMap<String, Integer> interpolation) {
        if (this.I == -1) {
            return;
        }
        if (!Float.isNaN(this.K)) {
            interpolation.put("alpha", Integer.valueOf(this.I));
        }
        if (!Float.isNaN(this.L)) {
            interpolation.put("elevation", Integer.valueOf(this.I));
        }
        if (!Float.isNaN(this.M)) {
            interpolation.put(td.d, Integer.valueOf(this.I));
        }
        if (!Float.isNaN(this.N)) {
            interpolation.put("rotationX", Integer.valueOf(this.I));
        }
        if (!Float.isNaN(this.O)) {
            interpolation.put("rotationY", Integer.valueOf(this.I));
        }
        if (!Float.isNaN(this.P)) {
            interpolation.put(td.g, Integer.valueOf(this.I));
        }
        if (!Float.isNaN(this.Q)) {
            interpolation.put(td.h, Integer.valueOf(this.I));
        }
        if (!Float.isNaN(this.U)) {
            interpolation.put("translationX", Integer.valueOf(this.I));
        }
        if (!Float.isNaN(this.V)) {
            interpolation.put("translationY", Integer.valueOf(this.I));
        }
        if (!Float.isNaN(this.W)) {
            interpolation.put("translationZ", Integer.valueOf(this.I));
        }
        if (!Float.isNaN(this.R)) {
            interpolation.put("transitionPathRotate", Integer.valueOf(this.I));
        }
        if (!Float.isNaN(this.S)) {
            interpolation.put("scaleX", Integer.valueOf(this.I));
        }
        if (!Float.isNaN(this.T)) {
            interpolation.put("scaleY", Integer.valueOf(this.I));
        }
        if (!Float.isNaN(this.X)) {
            interpolation.put("progress", Integer.valueOf(this.I));
        }
        if (this.C.size() > 0) {
            for (String str : this.C.keySet()) {
                interpolation.put(wo1.t("CUSTOM,", str), Integer.valueOf(this.I));
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
            case -760884510:
                if (tag.equals(td.g)) {
                    c = '\t';
                    break;
                }
                break;
            case -760884509:
                if (tag.equals(td.h)) {
                    c = '\n';
                    break;
                }
                break;
            case -40300674:
                if (tag.equals(td.d)) {
                    c = 11;
                    break;
                }
                break;
            case -4379043:
                if (tag.equals("elevation")) {
                    c = '\f';
                    break;
                }
                break;
            case 37232917:
                if (tag.equals("transitionPathRotate")) {
                    c = '\r';
                    break;
                }
                break;
            case 92909918:
                if (tag.equals("alpha")) {
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
            case 1941332754:
                if (tag.equals("visibility")) {
                    c = 16;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                this.X = m(value);
                return;
            case 1:
                this.H = value.toString();
                return;
            case 2:
                this.N = m(value);
                return;
            case 3:
                this.O = m(value);
                return;
            case 4:
                this.U = m(value);
                return;
            case 5:
                this.V = m(value);
                return;
            case 6:
                this.W = m(value);
                return;
            case 7:
                this.S = m(value);
                return;
            case '\b':
                this.T = m(value);
                return;
            case '\t':
                this.P = m(value);
                return;
            case '\n':
                this.Q = m(value);
                return;
            case 11:
                this.M = m(value);
                return;
            case '\f':
                this.L = m(value);
                return;
            case '\r':
                this.R = m(value);
                return;
            case 14:
                this.K = m(value);
                return;
            case 15:
                this.I = n(value);
                return;
            case 16:
                this.J = l(value);
                return;
            default:
                return;
        }
    }
}