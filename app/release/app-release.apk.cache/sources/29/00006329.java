package com.p7700g.p99005;

import com.p7700g.p99005.aa;
import com.p7700g.p99005.s9;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: MotionKeyAttributes.java */
/* loaded from: classes.dex */
public class w8 extends v8 {
    private static final boolean A = false;
    public static final int B = 1;
    public static final String y = "KeyAttribute";
    private static final String z = "KeyAttributes";
    private String C;
    private int D = -1;
    private int E = 0;
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
    private float P = Float.NaN;
    private float Q = Float.NaN;
    private float R = Float.NaN;
    private float S = Float.NaN;

    public w8() {
        this.w = 1;
        this.x = new HashMap<>();
    }

    private float w(int i) {
        if (i != 100) {
            switch (i) {
                case 303:
                    return this.F;
                case 304:
                    return this.P;
                case 305:
                    return this.Q;
                case 306:
                    return this.R;
                case 307:
                    return this.G;
                case 308:
                    return this.I;
                case 309:
                    return this.J;
                case 310:
                    return this.H;
                case 311:
                    return this.N;
                case 312:
                    return this.O;
                case 313:
                    return this.K;
                case 314:
                    return this.L;
                case 315:
                    return this.S;
                case aa.a.q /* 316 */:
                    return this.M;
                default:
                    return Float.NaN;
            }
        }
        return this.t;
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean a(int i, int i2) {
        if (i == 100) {
            this.t = i2;
            return true;
        } else if (i == 301) {
            this.D = i2;
            return true;
        } else if (i != 302) {
            if (a(i, i2)) {
                return true;
            }
            return super.a(i, i2);
        } else {
            this.E = i2;
            return true;
        }
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean b(int i, float f) {
        if (i != 100) {
            switch (i) {
                case 303:
                    this.F = f;
                    return true;
                case 304:
                    this.P = f;
                    return true;
                case 305:
                    this.Q = f;
                    return true;
                case 306:
                    this.R = f;
                    return true;
                case 307:
                    this.G = f;
                    return true;
                case 308:
                    this.I = f;
                    return true;
                case 309:
                    this.J = f;
                    return true;
                case 310:
                    this.H = f;
                    return true;
                case 311:
                    this.N = f;
                    return true;
                case 312:
                    this.O = f;
                    return true;
                case 313:
                    this.K = f;
                    return true;
                case 314:
                    this.L = f;
                    return true;
                case 315:
                    this.S = f;
                    return true;
                case aa.a.q /* 316 */:
                    this.M = f;
                    return true;
                default:
                    return super.b(i, f);
            }
        }
        this.M = f;
        return true;
    }

    @Override // com.p7700g.p99005.v8, com.p7700g.p99005.aa
    public boolean c(int i, String str) {
        if (i == 101) {
            this.v = str;
            return true;
        } else if (i != 317) {
            return super.c(i, str);
        } else {
            this.C = str;
            return true;
        }
    }

    @Override // com.p7700g.p99005.aa
    public int e(String str) {
        return z9.a(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
        if (r1.equals("pivotX") == false) goto L12;
     */
    @Override // com.p7700g.p99005.v8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f(HashMap<String, s9> hashMap) {
        Iterator<String> it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            s9 s9Var = hashMap.get(next);
            if (s9Var != null) {
                char c = 7;
                if (next.startsWith("CUSTOM")) {
                    p8 p8Var = this.x.get(next.substring(7));
                    if (p8Var != null) {
                        ((s9.c) s9Var).k(this.t, p8Var);
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
                        case -987906986:
                            break;
                        case -987906985:
                            if (next.equals("pivotY")) {
                                c = '\b';
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189618:
                            if (next.equals("scaleX")) {
                                c = '\t';
                                break;
                            }
                            c = 65535;
                            break;
                        case -908189617:
                            if (next.equals("scaleY")) {
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
                        case 92909918:
                            if (next.equals("alpha")) {
                                c = '\f';
                                break;
                            }
                            c = 65535;
                            break;
                        case 803192288:
                            if (next.equals("pathRotate")) {
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
                            if (!Float.isNaN(this.I)) {
                                s9Var.g(this.t, this.I);
                                break;
                            } else {
                                continue;
                            }
                        case 1:
                            if (!Float.isNaN(this.J)) {
                                s9Var.g(this.t, this.J);
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if (!Float.isNaN(this.H)) {
                                s9Var.g(this.t, this.H);
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if (!Float.isNaN(this.P)) {
                                s9Var.g(this.t, this.P);
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if (!Float.isNaN(this.Q)) {
                                s9Var.g(this.t, this.Q);
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if (!Float.isNaN(this.R)) {
                                s9Var.g(this.t, this.R);
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if (!Float.isNaN(this.S)) {
                                s9Var.g(this.t, this.S);
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if (!Float.isNaN(this.I)) {
                                s9Var.g(this.t, this.K);
                                break;
                            } else {
                                continue;
                            }
                        case '\b':
                            if (!Float.isNaN(this.J)) {
                                s9Var.g(this.t, this.L);
                                break;
                            } else {
                                continue;
                            }
                        case '\t':
                            if (!Float.isNaN(this.N)) {
                                s9Var.g(this.t, this.N);
                                break;
                            } else {
                                continue;
                            }
                        case '\n':
                            if (!Float.isNaN(this.O)) {
                                s9Var.g(this.t, this.O);
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if (!Float.isNaN(this.G)) {
                                s9Var.g(this.t, this.G);
                                break;
                            } else {
                                continue;
                            }
                        case '\f':
                            if (!Float.isNaN(this.F)) {
                                s9Var.g(this.t, this.F);
                                break;
                            } else {
                                continue;
                            }
                        case '\r':
                            if (!Float.isNaN(this.M)) {
                                s9Var.g(this.t, this.M);
                                break;
                            } else {
                                continue;
                            }
                        default:
                            PrintStream printStream = System.err;
                            printStream.println("not supported by KeyAttributes " + next);
                            continue;
                    }
                }
            }
        }
    }

    @Override // com.p7700g.p99005.v8
    /* renamed from: g */
    public v8 clone() {
        return null;
    }

    @Override // com.p7700g.p99005.v8
    public void i(HashSet<String> hashSet) {
        if (!Float.isNaN(this.F)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.G)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.H)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.I)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.J)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.K)) {
            hashSet.add("pivotX");
        }
        if (!Float.isNaN(this.L)) {
            hashSet.add("pivotY");
        }
        if (!Float.isNaN(this.P)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.Q)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.R)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.M)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.N)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.O)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.S)) {
            hashSet.add("progress");
        }
        if (this.x.size() > 0) {
            Iterator<String> it = this.x.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // com.p7700g.p99005.v8
    public void q(HashMap<String, Integer> hashMap) {
        if (!Float.isNaN(this.F)) {
            hashMap.put("alpha", Integer.valueOf(this.D));
        }
        if (!Float.isNaN(this.G)) {
            hashMap.put("elevation", Integer.valueOf(this.D));
        }
        if (!Float.isNaN(this.H)) {
            hashMap.put("rotationZ", Integer.valueOf(this.D));
        }
        if (!Float.isNaN(this.I)) {
            hashMap.put("rotationX", Integer.valueOf(this.D));
        }
        if (!Float.isNaN(this.J)) {
            hashMap.put("rotationY", Integer.valueOf(this.D));
        }
        if (!Float.isNaN(this.K)) {
            hashMap.put("pivotX", Integer.valueOf(this.D));
        }
        if (!Float.isNaN(this.L)) {
            hashMap.put("pivotY", Integer.valueOf(this.D));
        }
        if (!Float.isNaN(this.P)) {
            hashMap.put("translationX", Integer.valueOf(this.D));
        }
        if (!Float.isNaN(this.Q)) {
            hashMap.put("translationY", Integer.valueOf(this.D));
        }
        if (!Float.isNaN(this.R)) {
            hashMap.put("translationZ", Integer.valueOf(this.D));
        }
        if (!Float.isNaN(this.M)) {
            hashMap.put("pathRotate", Integer.valueOf(this.D));
        }
        if (!Float.isNaN(this.N)) {
            hashMap.put("scaleX", Integer.valueOf(this.D));
        }
        if (!Float.isNaN(this.O)) {
            hashMap.put("scaleY", Integer.valueOf(this.D));
        }
        if (!Float.isNaN(this.S)) {
            hashMap.put("progress", Integer.valueOf(this.D));
        }
        if (this.x.size() > 0) {
            for (String str : this.x.keySet()) {
                hashMap.put(wo1.t("CUSTOM,", str), Integer.valueOf(this.D));
            }
        }
    }

    public int v() {
        return this.D;
    }

    public void x() {
        HashSet<String> hashSet = new HashSet<>();
        i(hashSet);
        PrintStream printStream = System.out;
        StringBuilder G = wo1.G(" ------------- ");
        G.append(this.t);
        G.append(" -------------");
        printStream.println(G.toString());
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i = 0; i < strArr.length; i++) {
            int a = z9.a(strArr[i]);
            PrintStream printStream2 = System.out;
            printStream2.println(strArr[i] + ":" + w(a));
        }
    }
}