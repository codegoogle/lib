package com.anythink.core.common.e;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class x extends i<y> {
    public static final int T = 1;
    public static final int U = 2;
    public static final int V = 3;
    public static final int W = 4;
    public static final int X = 5;
    public static final int Y = 6;
    private int L;
    private int M;
    private String N;
    private String O;
    public long P;
    public String Q;
    public String R;
    public int S;
    public String Z;
    private int a;
    public String aa;
    public z ab;
    public int ac;
    public String ad;
    private String ae;
    private String af;
    private String ag;
    private int ah;
    private int ai;
    private int b;

    private String U() {
        return this.aa;
    }

    private int V() {
        return this.a;
    }

    private int W() {
        return this.b;
    }

    private int X() {
        return this.L;
    }

    private int Y() {
        return this.M;
    }

    private int a() {
        return this.ac;
    }

    private String e() {
        return this.R;
    }

    public final void A(String str) {
        this.ae = str;
    }

    public final void B(String str) {
        this.af = str;
    }

    public final void C(String str) {
        this.ag = str;
    }

    public final void D(String str) {
        this.Q = str;
    }

    public final void E(String str) {
        this.R = str;
    }

    public final void F(String str) {
        this.Z = str;
    }

    public final void G(String str) {
        this.aa = str;
    }

    public final void H(String str) {
        this.ad = str;
    }

    public final String J() {
        return this.N;
    }

    public final String K() {
        return this.O;
    }

    public final String L() {
        return this.ae;
    }

    public final String M() {
        return this.af;
    }

    public final String N() {
        return this.ag;
    }

    public final int O() {
        return this.ah;
    }

    public final int P() {
        return this.ai;
    }

    public final z Q() {
        return this.ab;
    }

    public final int R() {
        return this.S;
    }

    public final String S() {
        return this.Z;
    }

    public final String T() {
        return this.ad;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
        if (r4 != 4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f4, code lost:
        if (android.text.TextUtils.isEmpty(r6.Z) != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0151 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0152 A[RETURN] */
    @Override // com.anythink.core.common.e.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ List b(y yVar) {
        boolean z;
        y yVar2 = yVar;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        if (TextUtils.equals(String.valueOf(yVar2.r()), "1")) {
            if (!TextUtils.isEmpty(this.l)) {
                arrayList.add(this.l);
            }
            if (!TextUtils.isEmpty(this.o)) {
                arrayList.add(this.o);
            }
            if (TextUtils.isEmpty(this.n)) {
                z = false;
            } else {
                arrayList.add(this.n);
                z = true;
            }
            if (TextUtils.isEmpty(this.q)) {
                z = false;
            } else {
                arrayList.add(this.q);
            }
        } else {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(yVar2.r());
        if (TextUtils.equals(sb.toString(), "3")) {
            if (!TextUtils.isEmpty(this.l)) {
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
            if (z()) {
                arrayList.add(this.q);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(yVar2.r());
        if (TextUtils.equals(sb2.toString(), "2")) {
            int i = this.S;
            if (i == 1) {
                if (!TextUtils.isEmpty(this.n)) {
                    arrayList.add(this.n);
                    if (!TextUtils.isEmpty(this.o)) {
                    }
                }
                z = false;
                if (!TextUtils.isEmpty(this.o)) {
                }
            } else if (i != 2) {
                if (i == 3) {
                    if (TextUtils.equals(k.a, yVar2.p())) {
                        if (!TextUtils.isEmpty(this.l)) {
                            arrayList.add(this.l);
                        }
                        z = false;
                    } else {
                        if (!TextUtils.isEmpty(this.n)) {
                            arrayList.add(this.n);
                        }
                        z = false;
                    }
                }
                if (!TextUtils.isEmpty(this.o)) {
                    arrayList.add(this.o);
                }
            }
        }
        if (TextUtils.equals(String.valueOf(yVar2.r()), "4")) {
            if (1 != this.S && !TextUtils.isEmpty(this.l)) {
                arrayList.add(this.l);
            }
            if (!TextUtils.isEmpty(this.o)) {
                arrayList.add(this.o);
            }
            if (!TextUtils.isEmpty(this.n)) {
                arrayList.add(this.n);
            }
            if (z2) {
                return null;
            }
            return arrayList;
        }
        z2 = z;
        if (z2) {
        }
    }

    public final void c(long j) {
        this.P = j;
    }

    public final void g(int i) {
        this.ah = i;
    }

    public final void h(int i) {
        this.ai = i;
    }

    public final void i(int i) {
        this.S = i;
    }

    public final void j(int i) {
        this.a = i;
    }

    public final void k(int i) {
        this.b = i;
    }

    public final void l(int i) {
        this.L = i;
    }

    public final void m(int i) {
        this.M = i;
    }

    public final void y(String str) {
        this.N = str;
    }

    public final void z(String str) {
        this.O = str;
    }

    private void a(int i) {
        this.ac = i;
    }

    private String c() {
        return this.Q;
    }

    public final void a(z zVar) {
        this.ab = zVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c1, code lost:
        if (r4 != 4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f2, code lost:
        if (android.text.TextUtils.isEmpty(r6.Z) != false) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0150 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List<String> a(y yVar) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        if (TextUtils.equals(String.valueOf(yVar.r()), "1")) {
            if (!TextUtils.isEmpty(this.l)) {
                arrayList.add(this.l);
            }
            if (!TextUtils.isEmpty(this.o)) {
                arrayList.add(this.o);
            }
            if (TextUtils.isEmpty(this.n)) {
                z = false;
            } else {
                arrayList.add(this.n);
                z = true;
            }
            if (TextUtils.isEmpty(this.q)) {
                z = false;
            } else {
                arrayList.add(this.q);
            }
        } else {
            z = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(yVar.r());
        if (TextUtils.equals(sb.toString(), "3")) {
            if (!TextUtils.isEmpty(this.l)) {
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
            if (z()) {
                arrayList.add(this.q);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(yVar.r());
        if (TextUtils.equals(sb2.toString(), "2")) {
            int i = this.S;
            if (i == 1) {
                if (!TextUtils.isEmpty(this.n)) {
                    arrayList.add(this.n);
                    if (!TextUtils.isEmpty(this.o)) {
                    }
                }
                z = false;
                if (!TextUtils.isEmpty(this.o)) {
                }
            } else if (i != 2) {
                if (i == 3) {
                    if (TextUtils.equals(k.a, yVar.p())) {
                        if (!TextUtils.isEmpty(this.l)) {
                            arrayList.add(this.l);
                        }
                        z = false;
                    } else {
                        if (!TextUtils.isEmpty(this.n)) {
                            arrayList.add(this.n);
                        }
                        z = false;
                    }
                }
                if (!TextUtils.isEmpty(this.o)) {
                    arrayList.add(this.o);
                }
            }
        }
        if (TextUtils.equals(String.valueOf(yVar.r()), "4")) {
            if (1 != this.S && !TextUtils.isEmpty(this.l)) {
                arrayList.add(this.l);
            }
            if (!TextUtils.isEmpty(this.o)) {
                arrayList.add(this.o);
            }
            if (!TextUtils.isEmpty(this.n)) {
                arrayList.add(this.n);
            }
            if (z2) {
                return null;
            }
            return arrayList;
        }
        z2 = z;
        if (z2) {
        }
    }

    private long b() {
        return this.P;
    }

    public final boolean a(boolean z, boolean z2) {
        return z ? z2 ? this.a == 1 : this.b == 1 : z2 ? this.L == 1 : this.M == 1;
    }
}