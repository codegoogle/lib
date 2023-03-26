package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: MotionKeyCycle.java */
/* loaded from: classes.dex */
public class x8 extends v8 {
    public static final String A = "wavePeriod";
    public static final String B = "waveOffset";
    public static final String C = "wavePhase";
    public static final String D = "waveShape";
    public static final int E = 0;
    public static final int F = 1;
    public static final int G = 2;
    public static final int H = 3;
    public static final int I = 4;
    public static final int J = 5;
    public static final int K = 6;
    public static final int L = 4;
    private static final String y = "KeyCycle";
    public static final String z = "KeyCycle";
    private String M = null;
    private int N = 0;
    private int O = -1;
    private String P = null;
    private float Q = Float.NaN;
    private float R = 0.0f;
    private float S = 0.0f;
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
    private float e0 = Float.NaN;

    public x8() {
        this.w = 4;
        this.x = new HashMap<>();
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean a(int i, int i2) {
        if (i == 401) {
            this.N = i2;
            return true;
        } else if (i != 421) {
            if (b(i, i2)) {
                return true;
            }
            return super.a(i, i2);
        } else {
            this.O = i2;
            return true;
        }
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean b(int i, float f) {
        if (i == 315) {
            this.T = f;
            return true;
        } else if (i == 403) {
            this.U = f;
            return true;
        } else if (i != 416) {
            switch (i) {
                case 304:
                    this.c0 = f;
                    return true;
                case 305:
                    this.d0 = f;
                    return true;
                case 306:
                    this.e0 = f;
                    return true;
                case 307:
                    this.V = f;
                    return true;
                case 308:
                    this.Y = f;
                    return true;
                case 309:
                    this.Z = f;
                    return true;
                case 310:
                    this.W = f;
                    return true;
                case 311:
                    this.a0 = f;
                    return true;
                case 312:
                    this.b0 = f;
                    return true;
                default:
                    switch (i) {
                        case aa.c.u /* 423 */:
                            this.Q = f;
                            return true;
                        case aa.c.v /* 424 */:
                            this.R = f;
                            return true;
                        case aa.c.w /* 425 */:
                            this.S = f;
                            return true;
                        default:
                            return super.b(i, f);
                    }
            }
        } else {
            this.X = f;
            return true;
        }
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean c(int i, String str) {
        if (i == 420) {
            this.M = str;
            return true;
        } else if (i != 422) {
            return super.c(i, str);
        } else {
            this.P = str;
            return true;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p7700g.p99005.aa
    public int e(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1581616630:
                if (str.equals(aa.c.P)) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1310311125:
                if (str.equals("easing")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1249320806:
                if (str.equals("rotationX")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1019779949:
                if (str.equals("offset")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -991726143:
                if (str.equals(aa.c.Q)) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case -987906986:
                if (str.equals("pivotX")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -987906985:
                if (str.equals("pivotY")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 106629499:
                if (str.equals(aa.c.S)) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 579057826:
                if (str.equals("curveFit")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 1532805160:
                if (str.equals("waveShape")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 1941332754:
                if (str.equals("visibility")) {
                    c = 20;
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
                return aa.c.t;
            case 1:
                return aa.c.r;
            case 2:
                return 308;
            case 3:
                return 309;
            case 4:
                return 310;
            case 5:
                return 304;
            case 6:
                return 305;
            case 7:
                return 306;
            case '\b':
                return aa.c.v;
            case '\t':
                return 315;
            case '\n':
                return aa.c.u;
            case 11:
                return 313;
            case '\f':
                return 314;
            case '\r':
                return 311;
            case 14:
                return 312;
            case 15:
                return aa.c.d;
            case 16:
                return aa.c.w;
            case 17:
                return 401;
            case 18:
                return aa.c.q;
            case 19:
                return 421;
            case 20:
                return aa.c.c;
            default:
                return -1;
        }
    }

    @Override // com.p7700g.p99005.v8
    public void f(HashMap<String, s9> hashMap) {
    }

    @Override // com.p7700g.p99005.v8
    /* renamed from: g */
    public v8 clone() {
        return null;
    }

    @Override // com.p7700g.p99005.v8
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.U)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.V)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.W)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.Y)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.Z)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.a0)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.b0)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.X)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.c0)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.d0)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.e0)) {
            hashSet.add("translationZ");
        }
        if (this.x.size() > 0) {
            Iterator<String> it = this.x.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    public void v(HashMap<String, l9> hashMap) {
        l9 l9Var;
        l9 l9Var2;
        for (String str : hashMap.keySet()) {
            if (str.startsWith("CUSTOM")) {
                p8 p8Var = this.x.get(str.substring(7));
                if (p8Var != null && p8Var.m() == 901 && (l9Var = hashMap.get(str)) != null) {
                    l9Var.g(this.t, this.O, this.P, -1, this.Q, this.R, this.S, p8Var.n(), p8Var);
                }
            } else {
                float x = x(str);
                if (!Float.isNaN(x) && (l9Var2 = hashMap.get(str)) != null) {
                    l9Var2.f(this.t, this.O, this.P, -1, this.Q, this.R, this.S, x);
                }
            }
        }
    }

    public void w() {
        PrintStream printStream = System.out;
        StringBuilder G2 = wo1.G("MotionKeyCycle{mWaveShape=");
        G2.append(this.O);
        G2.append(", mWavePeriod=");
        G2.append(this.Q);
        G2.append(", mWaveOffset=");
        G2.append(this.R);
        G2.append(", mWavePhase=");
        G2.append(this.S);
        G2.append(", mRotation=");
        G2.append(this.W);
        G2.append('}');
        printStream.println(G2.toString());
    }

    public float x(String str) {
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
            case -1249320804:
                if (str.equals("rotationZ")) {
                    c = 2;
                    break;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    c = 3;
                    break;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    c = 4;
                    break;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    c = 5;
                    break;
                }
                break;
            case -1019779949:
                if (str.equals("offset")) {
                    c = 6;
                    break;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    c = 7;
                    break;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    c = '\b';
                    break;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    c = '\t';
                    break;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
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
            case 106629499:
                if (str.equals(aa.c.S)) {
                    c = '\f';
                    break;
                }
                break;
            case 803192288:
                if (str.equals("pathRotate")) {
                    c = '\r';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return this.Y;
            case 1:
                return this.Z;
            case 2:
                return this.W;
            case 3:
                return this.c0;
            case 4:
                return this.d0;
            case 5:
                return this.e0;
            case 6:
                return this.R;
            case 7:
                return this.T;
            case '\b':
                return this.a0;
            case '\t':
                return this.b0;
            case '\n':
                return this.V;
            case 11:
                return this.U;
            case '\f':
                return this.S;
            case '\r':
                return this.X;
            default:
                return Float.NaN;
        }
    }

    public void y() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        StringBuilder G2 = wo1.G(" ------------- ");
        G2.append(this.t);
        G2.append(" -------------");
        ia.c(G2.toString());
        ia.c("MotionKeyCycle{Shape=" + this.O + ", Period=" + this.Q + ", Offset=" + this.R + ", Phase=" + this.S + '}');
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i = 0; i < strArr.length; i++) {
            z9.a(strArr[i]);
            ia.c(strArr[i] + ":" + x(strArr[i]));
        }
    }
}