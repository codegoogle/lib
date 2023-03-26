package com.p7700g.p99005;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

/* compiled from: MotionKeyTrigger.java */
/* loaded from: classes.dex */
public class a9 extends v8 {
    public static final String A = "viewTransitionOnPositiveCross";
    public static final String B = "viewTransitionOnNegativeCross";
    public static final String C = "postLayout";
    public static final String D = "triggerSlack";
    public static final String E = "triggerCollisionView";
    public static final String F = "triggerCollisionId";
    public static final String G = "triggerID";
    public static final String H = "positiveCross";
    public static final String I = "negativeCross";
    public static final String J = "triggerReceiver";
    public static final String K = "CROSS";
    public static final int L = 301;
    public static final int M = 302;
    public static final int N = 303;
    public static final int O = 304;
    public static final int P = 305;
    public static final int Q = 306;
    public static final int R = 307;
    public static final int S = 308;
    public static final int T = 309;
    public static final int U = 310;
    public static final int V = 311;
    public static final int W = 312;
    public static final int X = 5;
    private static final String y = "KeyTrigger";
    public static final String z = "viewTransitionOnCross";
    private int Y = -1;
    private String Z = null;
    private int a0;
    private String b0;
    private String c0;
    private int d0;
    private int e0;
    public float f0;
    private boolean g0;
    private boolean h0;
    private boolean i0;
    private float j0;
    private float k0;
    private boolean l0;
    public int m0;
    public int n0;
    public int o0;
    public i9 p0;
    public i9 q0;

    public a9() {
        int i = v8.h;
        this.a0 = i;
        this.b0 = null;
        this.c0 = null;
        this.d0 = i;
        this.e0 = i;
        this.f0 = 0.1f;
        this.g0 = true;
        this.h0 = true;
        this.i0 = true;
        this.j0 = Float.NaN;
        this.l0 = false;
        this.m0 = i;
        this.n0 = i;
        this.o0 = i;
        this.p0 = new i9();
        this.q0 = new i9();
        this.w = 5;
        this.x = new HashMap<>();
    }

    private void x(String str, t8 t8Var) {
        boolean z2 = str.length() == 1;
        if (!z2) {
            str = str.substring(1).toLowerCase(Locale.ROOT);
        }
        for (String str2 : this.x.keySet()) {
            String lowerCase = str2.toLowerCase(Locale.ROOT);
            if (z2 || lowerCase.matches(str)) {
                p8 p8Var = this.x.get(str2);
                if (p8Var != null) {
                    p8Var.a(t8Var);
                }
            }
        }
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean a(int i, int i2) {
        if (i == 307) {
            this.e0 = i2;
            return true;
        } else if (i == 308) {
            this.d0 = u(Integer.valueOf(i2));
            return true;
        } else if (i != 311) {
            switch (i) {
                case 301:
                    this.o0 = i2;
                    return true;
                case 302:
                    this.n0 = i2;
                    return true;
                case 303:
                    this.m0 = i2;
                    return true;
                default:
                    return super.a(i, i2);
            }
        } else {
            this.a0 = i2;
            return true;
        }
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean b(int i, float f) {
        if (i != 305) {
            return super.b(i, f);
        }
        this.f0 = f;
        return true;
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean c(int i, String str) {
        if (i == 309) {
            this.c0 = str;
            return true;
        } else if (i == 310) {
            this.b0 = str;
            return true;
        } else if (i != 312) {
            return super.c(i, str);
        } else {
            this.Z = str;
            return true;
        }
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean d(int i, boolean z2) {
        if (i != 304) {
            return super.d(i, z2);
        }
        this.l0 = z2;
        return true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.p7700g.p99005.aa
    public int e(String str) {
        char c;
        str.hashCode();
        switch (str.hashCode()) {
            case -1594793529:
                if (str.equals("positiveCross")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -966421266:
                if (str.equals("viewTransitionOnPositiveCross")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -786670827:
                if (str.equals("triggerCollisionId")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -648752941:
                if (str.equals("triggerID")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -638126837:
                if (str.equals("negativeCross")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -76025313:
                if (str.equals("triggerCollisionView")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -9754574:
                if (str.equals("viewTransitionOnNegativeCross")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 364489912:
                if (str.equals("triggerSlack")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1301930599:
                if (str.equals("viewTransitionOnCross")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1401391082:
                if (str.equals("postLayout")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1535404999:
                if (str.equals("triggerReceiver")) {
                    c = '\n';
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
                return 309;
            case 1:
                return 302;
            case 2:
                return 307;
            case 3:
                return 308;
            case 4:
                return 310;
            case 5:
                return 306;
            case 6:
                return 303;
            case 7:
                return 305;
            case '\b':
                return 301;
            case '\t':
                return 304;
            case '\n':
                return 311;
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
        return new a9().h(this);
    }

    @Override // com.p7700g.p99005.v8
    public void i(HashSet<String> hashSet) {
    }

    public void v(float f, t8 t8Var) {
    }

    @Override // com.p7700g.p99005.v8
    /* renamed from: w */
    public a9 h(v8 v8Var) {
        super.h(v8Var);
        a9 a9Var = (a9) v8Var;
        this.Y = a9Var.Y;
        this.Z = a9Var.Z;
        this.a0 = a9Var.a0;
        this.b0 = a9Var.b0;
        this.c0 = a9Var.c0;
        this.d0 = a9Var.d0;
        this.e0 = a9Var.e0;
        this.f0 = a9Var.f0;
        this.g0 = a9Var.g0;
        this.h0 = a9Var.h0;
        this.i0 = a9Var.i0;
        this.j0 = a9Var.j0;
        this.k0 = a9Var.k0;
        this.l0 = a9Var.l0;
        this.p0 = a9Var.p0;
        this.q0 = a9Var.q0;
        return this;
    }
}