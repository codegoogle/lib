package com.p7700g.p99005;

import android.os.Bundle;
import android.text.TextUtils;
import com.p7700g.p99005.vg1;

/* compiled from: FireshieldStatus.java */
/* loaded from: classes.dex */
public class l31 {
    private static final kj1 a = kj1.b("FireshieldStatus");
    @x1
    private final r41 b = q51.g().j;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ Integer e(dq0 dq0Var) throws Exception {
        int F;
        en1 en1Var = (en1) dq0Var.F();
        if (en1Var != en1.CONNECTING_VPN && en1Var != en1.CONNECTED) {
            F = this.b.a.F(f61.a);
            if (F == -1) {
                F = this.b.a.F("");
            }
        } else {
            F = this.b.a.F("");
            if (F == -1) {
                F = this.b.a.F(f61.a);
            }
        }
        return Integer.valueOf(Math.max(F, 0));
    }

    private aq0<en1, Integer> f() {
        return new aq0() { // from class: com.p7700g.p99005.rx0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return l31.this.e(dq0Var);
            }
        };
    }

    public void a(@x1 String[] strArr, @x1 vg1.c cVar, @x1 vg1.d dVar, @x1 String str, @x1 va1 va1Var) {
        a.c("addFireshieldWhitelist resources: %s op: %s type: %s category: %s", TextUtils.join(",", strArr), cVar, dVar, str);
        Bundle bundle = new Bundle();
        bundle.putStringArray("extra:resources", strArr);
        bundle.putSerializable("extra:op", cVar);
        bundle.putSerializable("extra:type", dVar);
        bundle.putSerializable("extra:category", str);
        this.b.m(1, bundle).q(a21.b(va1Var));
    }

    public void b(@x1 ua1<Integer> ua1Var) {
        this.b.f().q(f()).q(a21.a(ua1Var));
    }

    public int c() {
        return this.b.a.G();
    }

    public void g() {
        this.b.a.h1();
    }
}