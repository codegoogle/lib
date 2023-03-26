package com.p7700g.p99005;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TransportSet.java */
/* loaded from: classes2.dex */
public class dn1 extends hn1 implements jn1 {
    public static final String t = "transport_id";
    private final kj1 u = kj1.b("TransportSet");
    @x1
    private final Map<String, hn1> v;
    @z1
    private hn1 w;

    public dn1(@x1 List<hn1> list) {
        HashMap hashMap = new HashMap();
        for (hn1 hn1Var : list) {
            hashMap.put(hn1Var.o(), hn1Var);
        }
        this.v = hashMap;
    }

    private void E(@z1 String str) {
        hn1 hn1Var = this.w;
        if (hn1Var != null) {
            hn1Var.x(this);
        }
        this.w = this.v.get(str);
        this.u.c(wo1.t("Switched to transport ", str), new Object[0]);
        hn1 hn1Var2 = this.w;
        if (hn1Var2 != null) {
            hn1Var2.k(this);
        }
    }

    @Override // com.p7700g.p99005.hn1
    public void A(@x1 fo1 fo1Var, @x1 ln1 ln1Var) throws gc1 {
        String string = fo1Var.w.getString(t);
        if (fo1Var.w.containsKey(t)) {
            E(string);
        }
        ((hn1) r81.f(this.w)).A(fo1Var, ln1Var);
    }

    @Override // com.p7700g.p99005.hn1
    public void B() {
        hn1 hn1Var = this.w;
        if (hn1Var != null) {
            hn1Var.B();
        }
    }

    @Override // com.p7700g.p99005.hn1
    public void C(@x1 fo1 fo1Var) {
        hn1 hn1Var = this.w;
        if (hn1Var != null) {
            hn1Var.C(fo1Var);
        }
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public String D() {
        hn1 hn1Var = this.w;
        return hn1Var != null ? hn1Var.D() : "";
    }

    @Override // com.p7700g.p99005.jn1
    public void a(long j, long j2) {
        t(j, j2);
    }

    @Override // com.p7700g.p99005.jn1
    public void b(@x1 Parcelable parcelable) {
        u(parcelable);
    }

    @Override // com.p7700g.p99005.jn1
    public void h() {
        r();
    }

    @Override // com.p7700g.p99005.jn1
    public void i(@x1 kc1 kc1Var) {
        s(kc1Var);
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public lm1 l() {
        hn1 hn1Var = this.w;
        if (hn1Var != null) {
            return hn1Var.l();
        }
        return lm1.g();
    }

    @Override // com.p7700g.p99005.hn1
    public int m(@x1 String str) {
        hn1 hn1Var = this.w;
        if (hn1Var != null) {
            return hn1Var.m(str);
        }
        return 0;
    }

    @Override // com.p7700g.p99005.hn1
    public int n() {
        hn1 hn1Var = this.w;
        if (hn1Var != null) {
            return hn1Var.n();
        }
        return 0;
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public String o() {
        hn1 hn1Var = this.w;
        return hn1Var != null ? hn1Var.o() : "";
    }

    @Override // com.p7700g.p99005.hn1
    @x1
    public List<ld1> p() {
        ArrayList arrayList = null;
        for (hn1 hn1Var : this.v.values()) {
            List<ld1> p = hn1Var.p();
            if (!p.isEmpty()) {
                if (arrayList == null) {
                    arrayList = new ArrayList(p);
                } else {
                    arrayList.addAll(p);
                }
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    @Override // com.p7700g.p99005.hn1
    public void v(int i, @x1 Bundle bundle) {
        hn1 hn1Var = this.w;
        if (hn1Var != null) {
            hn1Var.v(i, bundle);
        }
    }

    @Override // com.p7700g.p99005.hn1
    public void w(@x1 Bundle bundle) {
        String string = bundle.getString(t);
        if (bundle.containsKey(t)) {
            E(string);
        }
        hn1 hn1Var = this.w;
        if (hn1Var != null) {
            hn1Var.w(bundle);
        }
    }

    @Override // com.p7700g.p99005.hn1
    public void y() {
        hn1 hn1Var = this.w;
        if (hn1Var != null) {
            hn1Var.y();
        }
    }
}