package com.p7700g.p99005;

import android.util.Pair;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.CnlConfigPatcher;
import com.anchorfree.sdk.exceptions.CnlBlockedException;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: CnlSwitchHandler.java */
/* loaded from: classes.dex */
public class o21 implements nc1 {
    @x1
    public static final String a = "cnl:transport:hydra";
    @x1
    private static final kj1 b = kj1.b("CNLSwitchHandler");
    @x1
    private final h31 c;
    @x1
    private final o51 d;
    @x1
    private final k21 e;
    @x1
    private final Executor f;

    public o21(@x1 k21 k21Var, @x1 me1 me1Var, @x1 h31 h31Var, @x1 final o51 o51Var, @x1 Executor executor) {
        this.f = executor;
        this.d = o51Var;
        this.c = h31Var;
        this.e = k21Var;
        me1Var.c("CNLSwitchHandler", this);
        o51Var.x0(a, k81.d(CnlConfigPatcher.class, new Object[0]));
        h31Var.f(new c21() { // from class: com.p7700g.p99005.kx0
            @Override // com.p7700g.p99005.c21
            public final void a(Object obj) {
                o21.this.f(o51Var, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Boolean d(dq0 dq0Var) throws Exception {
        List<ClientInfo> list = (List) dq0Var.F();
        if (list != null) {
            for (ClientInfo clientInfo : list) {
                if (this.e.e(clientInfo.getCarrierId())) {
                    return Boolean.TRUE;
                }
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void f(o51 o51Var, Object obj) {
        if ((obj instanceof u51) && (((u51) obj).c() instanceof CnlBlockedException)) {
            o51Var.I0(System.currentTimeMillis());
        }
        if (obj instanceof s71) {
            k();
        }
    }

    private /* synthetic */ Object g(dq0 dq0Var, dq0 dq0Var2) throws Exception {
        Long l = (Long) dq0Var.F();
        List<ClientInfo> list = (List) dq0Var2.F();
        if (list != null) {
            for (ClientInfo clientInfo : list) {
                en1 a2 = this.e.a(clientInfo.getCarrierId());
                if (a2 != null) {
                    b.c("Post StateSwitchEvent for state: %s info: %s", a2, clientInfo);
                    this.c.e(new f51(Pair.create(a2, clientInfo)));
                    return null;
                } else if (l != null && l.longValue() != 0) {
                    kj1 kj1Var = b;
                    en1 en1Var = en1.CONNECTED;
                    kj1Var.c("Post StateSwitchEvent for state: %s info: %s for manualConnect: %d", en1Var, clientInfo, l);
                    this.c.e(new f51(Pair.create(en1Var, clientInfo)));
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ dq0 j(final dq0 dq0Var) throws Exception {
        return this.d.q0().s(new aq0() { // from class: com.p7700g.p99005.jx0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var2) {
                o21.this.h(dq0Var, dq0Var2);
                return null;
            }
        }, this.f);
    }

    private void k() {
        this.d.b().u(new aq0() { // from class: com.p7700g.p99005.lx0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return o21.this.j(dq0Var);
            }
        });
    }

    @Override // com.p7700g.p99005.nc1
    public void a(@x1 qc1 qc1Var) {
        b.c("onNetworkChange network: %s", qc1Var);
        k();
    }

    @x1
    public dq0<Boolean> b() {
        return this.d.q0().s(new aq0() { // from class: com.p7700g.p99005.ix0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return o21.this.d(dq0Var);
            }
        }, this.f);
    }

    public /* synthetic */ Object h(dq0 dq0Var, dq0 dq0Var2) {
        g(dq0Var, dq0Var2);
        return null;
    }
}