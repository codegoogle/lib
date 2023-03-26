package com.anythink.core.common.e;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class q extends i<s> {
    public static final int a = 1;
    public static final int b = 2;
    public int L;
    public long M;
    private String N;
    private String O;
    private String P;
    private String Q;
    private String R;
    private String S;
    private String T;
    private String U;
    private String V;
    private String W;
    private long X;
    private int Y;
    private String Z;
    private String aa;
    private String ab;
    private String ac;
    private String ad;

    private String U() {
        return this.ad;
    }

    private int V() {
        return this.L;
    }

    private long W() {
        return this.M;
    }

    private long X() {
        return this.X;
    }

    private void f(int i) {
        this.L = i;
    }

    public final void A(String str) {
        this.ac = str;
    }

    public final void B(String str) {
        this.N = str;
    }

    public final void C(String str) {
        this.O = str;
    }

    public final void D(String str) {
        this.P = str;
    }

    public final void E(String str) {
        this.Q = str;
    }

    public final void F(String str) {
        this.R = str;
    }

    public final void G(String str) {
        this.S = str;
    }

    public final void H(String str) {
        this.T = str;
    }

    public final void I(String str) {
        this.U = str;
    }

    public final int J() {
        return this.Y;
    }

    public final String K() {
        return this.N;
    }

    public final String L() {
        return this.O;
    }

    public final String M() {
        return this.P;
    }

    public final String N() {
        return this.Q;
    }

    public final String O() {
        return this.R;
    }

    public final String P() {
        return this.S;
    }

    public final String Q() {
        return this.T;
    }

    public final String R() {
        return this.U;
    }

    public final String S() {
        return this.V;
    }

    public final String T() {
        return this.W;
    }

    public final void a(String str) {
        this.ad = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    @Override // com.anythink.core.common.e.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ List b(s sVar) {
        boolean z;
        boolean z2;
        s sVar2 = sVar;
        ArrayList arrayList = new ArrayList();
        TextUtils.equals(String.valueOf(sVar2.r()), "0");
        boolean z3 = false;
        if (TextUtils.equals(String.valueOf(sVar2.r()), "2")) {
            String p = sVar2.p();
            char c = 65535;
            switch (p.hashCode()) {
                case -559799608:
                    if (p.equals(k.c)) {
                        c = 1;
                        break;
                    }
                    break;
                case 1507809730:
                    if (p.equals(k.a)) {
                        c = 3;
                        break;
                    }
                    break;
                case 1507809854:
                    if (p.equals(k.b)) {
                        c = 0;
                        break;
                    }
                    break;
                case 1622564786:
                    if (p.equals(k.d)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                if (c == 1) {
                    if (!TextUtils.isEmpty(this.ab)) {
                        arrayList.add(this.ab);
                        z2 = true;
                        z = true;
                        if (!z2) {
                        }
                        if (!TextUtils.isEmpty(this.o)) {
                        }
                    } else {
                        if (!TextUtils.isEmpty(this.n)) {
                            arrayList.add(this.n);
                            z2 = false;
                            z = true;
                            if (!z2) {
                            }
                            if (!TextUtils.isEmpty(this.o)) {
                            }
                        }
                        z2 = false;
                        z = false;
                        if (!z2) {
                        }
                        if (!TextUtils.isEmpty(this.o)) {
                        }
                    }
                } else {
                    if (c != 2) {
                        if (!TextUtils.isEmpty(this.Z)) {
                            arrayList.add(this.Z);
                            z2 = true;
                        }
                        z2 = false;
                    } else if (!TextUtils.isEmpty(this.ac)) {
                        arrayList.add(this.ac);
                        z2 = true;
                    } else {
                        if (!TextUtils.isEmpty(this.n)) {
                            arrayList.add(this.n);
                            z2 = false;
                        }
                        z2 = false;
                        z = false;
                        if (!z2) {
                            if (TextUtils.isEmpty(this.l)) {
                                z = false;
                            } else {
                                arrayList.add(this.l);
                            }
                        }
                        if (!TextUtils.isEmpty(this.o)) {
                            arrayList.add(this.o);
                        }
                    }
                    z = true;
                    if (!z2) {
                    }
                    if (!TextUtils.isEmpty(this.o)) {
                    }
                }
            } else if (!TextUtils.isEmpty(this.aa)) {
                arrayList.add(this.aa);
                z2 = true;
                z = true;
                if (!z2) {
                }
                if (!TextUtils.isEmpty(this.o)) {
                }
            } else {
                if (!TextUtils.isEmpty(this.n)) {
                    arrayList.add(this.n);
                    z2 = false;
                    z = true;
                    if (!z2) {
                    }
                    if (!TextUtils.isEmpty(this.o)) {
                    }
                }
                z2 = false;
                z = false;
                if (!z2) {
                }
                if (!TextUtils.isEmpty(this.o)) {
                }
            }
        } else {
            z = true;
        }
        if (TextUtils.equals(String.valueOf(sVar2.r()), "1")) {
            if (TextUtils.isEmpty(this.l)) {
                z = false;
            } else {
                arrayList.add(this.l);
            }
            if (!TextUtils.isEmpty(this.o)) {
                arrayList.add(this.o);
            }
            if (TextUtils.isEmpty(this.n)) {
                z = false;
            } else {
                arrayList.add(this.n);
            }
            if (TextUtils.isEmpty(this.q)) {
                z = false;
            } else {
                arrayList.add(this.q);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sVar2.r());
        if (TextUtils.equals(sb.toString(), "3")) {
            if (TextUtils.isEmpty(this.l)) {
                z = false;
            } else {
                arrayList.add(this.l);
            }
            if (!TextUtils.isEmpty(this.o)) {
                arrayList.add(this.o);
            }
            if (TextUtils.isEmpty(this.n)) {
                z = false;
            } else {
                arrayList.add(this.n);
            }
            if (this.v == 1) {
                if (TextUtils.isEmpty(this.q)) {
                    z = false;
                } else {
                    arrayList.add(this.q);
                }
            }
        }
        if (TextUtils.equals(String.valueOf(sVar2.r()), "4")) {
            if (!TextUtils.isEmpty(this.o)) {
                arrayList.add(this.o);
            }
            if (!TextUtils.isEmpty(this.n)) {
                arrayList.add(this.n);
            }
            if (z3) {
                return null;
            }
            return arrayList;
        }
        z3 = z;
        if (z3) {
        }
    }

    public final String c() {
        return this.ab;
    }

    @Override // com.anythink.core.common.e.i
    public final int d() {
        return 1;
    }

    public final String e() {
        return this.ac;
    }

    public final void y(String str) {
        this.aa = str;
    }

    public final void z(String str) {
        this.ab = str;
    }

    public final void J(String str) {
        this.V = str;
    }

    public final void K(String str) {
        this.W = str;
    }

    public final String L(String str) {
        try {
            JSONObject jSONObject = new JSONObject(this.ad);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                str = str.replaceAll("\\{" + next + "\\}", jSONObject.optString(next));
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    public final String a() {
        return this.Z;
    }

    public final void a(int i) {
        this.Y = i;
    }

    public final void a(long j) {
        this.X = j;
    }

    public final boolean a(s sVar) {
        return sVar == null || System.currentTimeMillis() - this.X > sVar.x();
    }

    public final void b(String str) {
        this.Z = str;
    }

    public final String b() {
        return this.aa;
    }

    private void b(long j) {
        this.M = j;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00df  */
    /* renamed from: b  reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<String> b2(s sVar) {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        TextUtils.equals(String.valueOf(sVar.r()), "0");
        boolean z3 = false;
        if (TextUtils.equals(String.valueOf(sVar.r()), "2")) {
            String p = sVar.p();
            char c = 65535;
            switch (p.hashCode()) {
                case -559799608:
                    if (p.equals(k.c)) {
                        c = 1;
                        break;
                    }
                    break;
                case 1507809730:
                    if (p.equals(k.a)) {
                        c = 3;
                        break;
                    }
                    break;
                case 1507809854:
                    if (p.equals(k.b)) {
                        c = 0;
                        break;
                    }
                    break;
                case 1622564786:
                    if (p.equals(k.d)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            if (c != 0) {
                if (c == 1) {
                    if (!TextUtils.isEmpty(this.ab)) {
                        arrayList.add(this.ab);
                        z2 = true;
                        z = true;
                        if (!z2) {
                        }
                        if (!TextUtils.isEmpty(this.o)) {
                        }
                    } else {
                        if (!TextUtils.isEmpty(this.n)) {
                            arrayList.add(this.n);
                            z2 = false;
                            z = true;
                            if (!z2) {
                            }
                            if (!TextUtils.isEmpty(this.o)) {
                            }
                        }
                        z2 = false;
                        z = false;
                        if (!z2) {
                        }
                        if (!TextUtils.isEmpty(this.o)) {
                        }
                    }
                } else {
                    if (c != 2) {
                        if (!TextUtils.isEmpty(this.Z)) {
                            arrayList.add(this.Z);
                            z2 = true;
                        }
                        z2 = false;
                    } else if (!TextUtils.isEmpty(this.ac)) {
                        arrayList.add(this.ac);
                        z2 = true;
                    } else {
                        if (!TextUtils.isEmpty(this.n)) {
                            arrayList.add(this.n);
                            z2 = false;
                        }
                        z2 = false;
                        z = false;
                        if (!z2) {
                            if (TextUtils.isEmpty(this.l)) {
                                z = false;
                            } else {
                                arrayList.add(this.l);
                            }
                        }
                        if (!TextUtils.isEmpty(this.o)) {
                            arrayList.add(this.o);
                        }
                    }
                    z = true;
                    if (!z2) {
                    }
                    if (!TextUtils.isEmpty(this.o)) {
                    }
                }
            } else if (!TextUtils.isEmpty(this.aa)) {
                arrayList.add(this.aa);
                z2 = true;
                z = true;
                if (!z2) {
                }
                if (!TextUtils.isEmpty(this.o)) {
                }
            } else {
                if (!TextUtils.isEmpty(this.n)) {
                    arrayList.add(this.n);
                    z2 = false;
                    z = true;
                    if (!z2) {
                    }
                    if (!TextUtils.isEmpty(this.o)) {
                    }
                }
                z2 = false;
                z = false;
                if (!z2) {
                }
                if (!TextUtils.isEmpty(this.o)) {
                }
            }
        } else {
            z = true;
        }
        if (TextUtils.equals(String.valueOf(sVar.r()), "1")) {
            if (TextUtils.isEmpty(this.l)) {
                z = false;
            } else {
                arrayList.add(this.l);
            }
            if (!TextUtils.isEmpty(this.o)) {
                arrayList.add(this.o);
            }
            if (TextUtils.isEmpty(this.n)) {
                z = false;
            } else {
                arrayList.add(this.n);
            }
            if (TextUtils.isEmpty(this.q)) {
                z = false;
            } else {
                arrayList.add(this.q);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sVar.r());
        if (TextUtils.equals(sb.toString(), "3")) {
            if (TextUtils.isEmpty(this.l)) {
                z = false;
            } else {
                arrayList.add(this.l);
            }
            if (!TextUtils.isEmpty(this.o)) {
                arrayList.add(this.o);
            }
            if (TextUtils.isEmpty(this.n)) {
                z = false;
            } else {
                arrayList.add(this.n);
            }
            if (this.v == 1) {
                if (TextUtils.isEmpty(this.q)) {
                    z = false;
                } else {
                    arrayList.add(this.q);
                }
            }
        }
        if (TextUtils.equals(String.valueOf(sVar.r()), "4")) {
            if (!TextUtils.isEmpty(this.o)) {
                arrayList.add(this.o);
            }
            if (!TextUtils.isEmpty(this.n)) {
                arrayList.add(this.n);
            }
            if (z3) {
                return null;
            }
            return arrayList;
        }
        z3 = z;
        if (z3) {
        }
    }
}