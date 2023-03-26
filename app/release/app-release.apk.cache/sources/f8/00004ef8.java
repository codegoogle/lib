package com.p7700g.p99005;

import com.p7700g.p99005.pp3;

/* compiled from: IndicatorManager.java */
/* loaded from: classes3.dex */
public class lp3 implements pp3.a {
    private lq3 a;
    private np3 b;
    private a c;

    /* compiled from: IndicatorManager.java */
    /* loaded from: classes3.dex */
    public interface a {
        void d();
    }

    public lp3(@z1 a aVar) {
        this.c = aVar;
        lq3 lq3Var = new lq3();
        this.a = lq3Var;
        this.b = new np3(lq3Var.b(), this);
    }

    @Override // com.p7700g.p99005.pp3.a
    public void a(@z1 rp3 rp3Var) {
        this.a.g(rp3Var);
        a aVar = this.c;
        if (aVar != null) {
            aVar.d();
        }
    }

    public np3 b() {
        return this.b;
    }

    public lq3 c() {
        return this.a;
    }

    public pq3 d() {
        return this.a.b();
    }
}