package com.p7700g.p99005;

/* compiled from: OsNetworkProbe.java */
/* loaded from: classes2.dex */
public class pd1 implements ld1 {
    @x1
    private final uc1 a;

    public pd1(@x1 uc1 uc1Var) {
        this.a = uc1Var;
    }

    @x1
    private String b(int i) {
        return i != 0 ? i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? "mobile" : i != 9 ? "other" : "ethernet" : k21.b : "mobile";
    }

    @Override // com.p7700g.p99005.ld1
    @x1
    public dq0<nd1> a() {
        nd1 nd1Var;
        if (!this.a.i()) {
            nd1Var = new nd1(nd1.a, k21.h, "", false);
        } else {
            nd1Var = new nd1(nd1.a, b(this.a.c(null)), "", true);
        }
        return dq0.D(nd1Var);
    }
}