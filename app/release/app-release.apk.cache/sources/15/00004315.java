package com.p7700g.p99005;

import android.annotation.SuppressLint;
import com.p7700g.p99005.gt1;

/* compiled from: LruResourceCache.java */
/* loaded from: classes2.dex */
public class ft1 extends u02<gq1, cs1<?>> implements gt1 {
    private gt1.a e;

    public ft1(long j) {
        super(j);
    }

    @Override // com.p7700g.p99005.gt1
    @z1
    public /* bridge */ /* synthetic */ cs1 b(@x1 gq1 gq1Var, @z1 cs1 cs1Var) {
        return (cs1) super.o(gq1Var, cs1Var);
    }

    @Override // com.p7700g.p99005.gt1
    @SuppressLint({"InlinedApi"})
    public void c(int i) {
        if (i >= 40) {
            d();
        } else if (i >= 20 || i == 15) {
            q(f() / 2);
        }
    }

    @Override // com.p7700g.p99005.gt1
    @z1
    public /* bridge */ /* synthetic */ cs1 g(@x1 gq1 gq1Var) {
        return (cs1) super.p(gq1Var);
    }

    @Override // com.p7700g.p99005.gt1
    public void h(@x1 gt1.a aVar) {
        this.e = aVar;
    }

    @Override // com.p7700g.p99005.u02
    /* renamed from: r */
    public int m(@z1 cs1<?> cs1Var) {
        if (cs1Var == null) {
            return super.m(null);
        }
        return cs1Var.c();
    }

    @Override // com.p7700g.p99005.u02
    /* renamed from: s */
    public void n(@x1 gq1 gq1Var, @z1 cs1<?> cs1Var) {
        gt1.a aVar = this.e;
        if (aVar == null || cs1Var == null) {
            return;
        }
        aVar.a(cs1Var);
    }
}