package com.p7700g.p99005;

import com.p7700g.p99005.x9;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: MotionKeyTimeCycle.java */
/* loaded from: classes.dex */
public class z8 extends v8 {
    public static final int A = 3;
    public static final String y = "KeyTimeCycle";
    private static final String z = "KeyTimeCycle";
    private String B;
    private int C = -1;
    private float D = Float.NaN;
    private float E = Float.NaN;
    private float F = Float.NaN;
    private float G = Float.NaN;
    private float H = Float.NaN;
    private float I = Float.NaN;
    private float J = Float.NaN;
    private float K = Float.NaN;
    private float L = Float.NaN;
    private float M = Float.NaN;
    private float N = Float.NaN;
    private float O = Float.NaN;
    private int P = 0;
    private String Q = null;
    private float R = Float.NaN;
    private float S = 0.0f;

    public z8() {
        this.w = 3;
        this.x = new HashMap<>();
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean a(int i, int i2) {
        if (i == 100) {
            this.t = i2;
            return true;
        } else if (i != 421) {
            return super.a(i, i2);
        } else {
            this.P = i2;
            return true;
        }
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean b(int i, float f) {
        if (i == 315) {
            this.O = t(Float.valueOf(f));
            return true;
        } else if (i == 401) {
            this.C = u(Float.valueOf(f));
            return true;
        } else if (i == 403) {
            this.D = f;
            return true;
        } else if (i == 416) {
            this.I = t(Float.valueOf(f));
            return true;
        } else if (i == 423) {
            this.R = t(Float.valueOf(f));
            return true;
        } else if (i != 424) {
            switch (i) {
                case 304:
                    this.L = t(Float.valueOf(f));
                    return true;
                case 305:
                    this.M = t(Float.valueOf(f));
                    return true;
                case 306:
                    this.N = t(Float.valueOf(f));
                    return true;
                case 307:
                    this.E = t(Float.valueOf(f));
                    return true;
                case 308:
                    this.G = t(Float.valueOf(f));
                    return true;
                case 309:
                    this.H = t(Float.valueOf(f));
                    return true;
                case 310:
                    this.F = t(Float.valueOf(f));
                    return true;
                case 311:
                    this.J = t(Float.valueOf(f));
                    return true;
                case 312:
                    this.K = t(Float.valueOf(f));
                    return true;
                default:
                    return super.b(i, f);
            }
        } else {
            this.S = t(Float.valueOf(f));
            return true;
        }
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean c(int i, String str) {
        if (i == 420) {
            this.B = str;
            return true;
        } else if (i != 421) {
            return super.c(i, str);
        } else {
            this.P = 7;
            this.Q = str;
            return true;
        }
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean d(int i, boolean z2) {
        return super.d(i, z2);
    }

    @Override // com.p7700g.p99005.aa
    public int e(String str) {
        return ca.a(str);
    }

    @Override // com.p7700g.p99005.v8
    public void f(HashMap<String, s9> hashMap) {
    }

    @Override // com.p7700g.p99005.v8
    /* renamed from: g */
    public v8 clone() {
        return new z8().h(this);
    }

    @Override // com.p7700g.p99005.v8
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.D)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.E)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.F)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("translationZ");
        }
        if (this.x.size() > 0) {
            Iterator<String> it = this.x.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
        if (r1.equals("scaleX") == false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void v(HashMap<String, x9> hashMap) {
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            x9 x9Var = hashMap.get(next);
            if (x9Var != null) {
                char c = 7;
                if (next.startsWith("CUSTOM")) {
                    p8 p8Var = this.x.get(next.substring(7));
                    if (p8Var != null) {
                        ((x9.b) x9Var).g(this.t, p8Var, this.R, this.P, this.S);
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
                        case -1249320804:
                            if (next.equals("rotationZ")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497657:
                            if (next.equals("translationX")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497656:
                            if (next.equals("translationY")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1225497655:
                            if (next.equals("translationZ")) {
                                c = 5;
                                break;
                            }
                            c = 65535;
                            break;
                        case -1001078227:
                            if (next.equals("progress")) {
                                c = 6;
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189618:
                            break;
                        case -908189617:
                            if (next.equals("scaleY")) {
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
                        case 92909918:
                            if (next.equals("alpha")) {
                                c = '\n';
                                break;
                            }
                            c = 65535;
                            break;
                        case 803192288:
                            if (next.equals("pathRotate")) {
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
                            if (!Float.isNaN(this.G)) {
                                x9Var.c(this.t, this.G, this.R, this.P, this.S);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.H)) {
                                x9Var.c(this.t, this.H, this.R, this.P, this.S);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.F)) {
                                x9Var.c(this.t, this.F, this.R, this.P, this.S);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.L)) {
                                x9Var.c(this.t, this.L, this.R, this.P, this.S);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.M)) {
                                x9Var.c(this.t, this.M, this.R, this.P, this.S);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.N)) {
                                x9Var.c(this.t, this.N, this.R, this.P, this.S);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.O)) {
                                x9Var.c(this.t, this.O, this.R, this.P, this.S);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.J)) {
                                x9Var.c(this.t, this.J, this.R, this.P, this.S);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.K)) {
                                x9Var.c(this.t, this.K, this.R, this.P, this.S);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.N)) {
                                x9Var.c(this.t, this.N, this.R, this.P, this.S);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.D)) {
                                x9Var.c(this.t, this.D, this.R, this.P, this.S);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.I)) {
                                x9Var.c(this.t, this.I, this.R, this.P, this.S);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            ia.f("KeyTimeCycles", "UNKNOWN addValues \"" + next + "\"");
                            continue;
                    }
                }
            }
        }
    }

    @Override // com.p7700g.p99005.v8
    /* renamed from: w */
    public z8 h(v8 v8Var) {
        super.h(v8Var);
        z8 z8Var = (z8) v8Var;
        this.B = z8Var.B;
        this.C = z8Var.C;
        this.P = z8Var.P;
        this.R = z8Var.R;
        this.S = z8Var.S;
        this.O = z8Var.O;
        this.D = z8Var.D;
        this.E = z8Var.E;
        this.F = z8Var.F;
        this.I = z8Var.I;
        this.G = z8Var.G;
        this.H = z8Var.H;
        this.J = z8Var.J;
        this.K = z8Var.K;
        this.L = z8Var.L;
        this.M = z8Var.M;
        this.N = z8Var.N;
        return this;
    }
}