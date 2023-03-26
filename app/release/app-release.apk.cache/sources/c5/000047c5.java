package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.SessionConfig;
import com.p7700g.p99005.h31;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: CarrierVPN.java */
/* loaded from: classes.dex */
public class i21 implements t51 {
    @x1
    private static final kj1 a = kj1.b("CarrierVPN");
    @x1
    private ClientInfo b;
    @x1
    private final Context c;
    @x1
    private final r41 d;
    @x1
    private final y11 e;
    @x1
    private final h51 f;
    @x1
    private final Executor g;
    @x1
    private final o51 h;
    private final h31.b i;

    public i21(@x1 Context context, @x1 r41 r41Var, @x1 y11 y11Var, @x1 final ClientInfo clientInfo, @x1 final o51 o51Var, @x1 h31 h31Var, @x1 h51 h51Var, @x1 Executor executor) {
        this.c = context;
        this.d = r41Var;
        this.e = y11Var;
        this.b = clientInfo;
        this.h = o51Var;
        this.f = h51Var;
        this.g = executor;
        this.i = h31Var.f(new c21() { // from class: com.p7700g.p99005.dx0
            @Override // com.p7700g.p99005.c21
            public final void a(Object obj) {
                i21.this.q(clientInfo, o51Var, obj);
            }
        });
    }

    private /* synthetic */ Object B(va1 va1Var, dq0 dq0Var) throws Exception {
        k(dq0Var, va1Var);
        return null;
    }

    private /* synthetic */ dq0 D(String str, dq0 dq0Var) throws Exception {
        return this.d.l(str);
    }

    /* renamed from: F */
    public /* synthetic */ dq0 G(SessionConfig sessionConfig, dq0 dq0Var) throws Exception {
        Bundle o = this.f.o(sessionConfig, (ft0) dq0Var.F(), this.b, "3.5.0", false);
        o.putBoolean(h51.a, true);
        return this.d.n(sessionConfig.getCountry(), sessionConfig.getReason(), o);
    }

    @x1
    private dq0<SessionConfig> H(@x1 SessionConfig sessionConfig, @z1 List<k81<? extends s31>> list) {
        if (list != null) {
            for (k81<? extends s31> k81Var : list) {
                try {
                    sessionConfig = ((s31) j81.a().b(k81Var)).a(this.c, sessionConfig);
                } catch (i81 e) {
                    a.f(e);
                }
            }
        }
        return dq0.D(sessionConfig);
    }

    @x1
    private dq0<Void> I(@x1 final SessionConfig sessionConfig) {
        final Bundle o = this.f.o(sessionConfig, null, this.b, "3.5.0", false);
        return this.h.A0(sessionConfig, this.b).u(new aq0() { // from class: com.p7700g.p99005.xw0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return i21.this.s(sessionConfig, o, dq0Var);
            }
        });
    }

    private void h(@x1 final ClientInfo clientInfo, @x1 final o51 o51Var) {
        o51Var.n0().u(new aq0() { // from class: com.p7700g.p99005.ex0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return i21.l(ClientInfo.this, o51Var, dq0Var);
            }
        }).q(new aq0() { // from class: com.p7700g.p99005.yw0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                i21.this.n(dq0Var);
                return null;
            }
        });
    }

    @x1
    private dq0<Void> j(@x1 final en1... en1VarArr) {
        return this.d.f().u(new aq0() { // from class: com.p7700g.p99005.ww0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                i21.o(en1VarArr, dq0Var);
                return null;
            }
        });
    }

    private void k(@x1 dq0<Void> dq0Var, @x1 va1 va1Var) {
        dq0Var.s(a21.b(va1Var), this.g);
    }

    public static /* synthetic */ dq0 l(ClientInfo clientInfo, o51 o51Var, dq0 dq0Var) throws Exception {
        ClientInfo clientInfo2 = (ClientInfo) dq0Var.F();
        if (clientInfo2 != null && clientInfo.getCarrierId().equals(clientInfo2.getCarrierId())) {
            return o51Var.m0();
        }
        return dq0.D(null);
    }

    private /* synthetic */ Object m(dq0 dq0Var) throws Exception {
        SessionConfig sessionConfig = (SessionConfig) dq0Var.F();
        if (sessionConfig != null) {
            a(sessionConfig, va1.a);
            return null;
        }
        return null;
    }

    public static /* synthetic */ dq0 o(en1[] en1VarArr, dq0 dq0Var) throws Exception {
        en1 en1Var = (en1) dq0Var.F();
        a.c("Filter state got %s", en1Var);
        for (en1 en1Var2 : en1VarArr) {
            if (en1Var2 == en1Var) {
                return null;
            }
        }
        throw new lc1("Wrong state to call start");
    }

    /* renamed from: p */
    public /* synthetic */ void q(ClientInfo clientInfo, o51 o51Var, Object obj) {
        if (obj instanceof q41) {
            q41 q41Var = (q41) obj;
            if (q41Var.c().equals(clientInfo.getCarrierId()) && o41.b.equals(q41Var.d())) {
                h(clientInfo, o51Var);
            }
        }
    }

    private /* synthetic */ dq0 r(SessionConfig sessionConfig, Bundle bundle, dq0 dq0Var) throws Exception {
        return this.d.k(sessionConfig.getCountry(), sessionConfig.getReason(), sessionConfig.getAppPolicy(), bundle);
    }

    /* renamed from: t */
    public /* synthetic */ dq0 u(dq0 dq0Var) throws Exception {
        return j(en1.CONNECTED);
    }

    /* renamed from: v */
    public /* synthetic */ dq0 w(SessionConfig sessionConfig, dq0 dq0Var) throws Exception {
        if (!dq0Var.J()) {
            return this.d.i(sessionConfig.getCountry(), sessionConfig.getReason(), sessionConfig.getAppPolicy(), this.f.o(sessionConfig, null, this.b, "3.5.0", false));
        }
        return dq0.C(dq0Var.E());
    }

    /* renamed from: x */
    public /* synthetic */ dq0 y(dq0 dq0Var) throws Exception {
        return j(en1.IDLE, en1.ERROR);
    }

    private /* synthetic */ dq0 z(SessionConfig sessionConfig, dq0 dq0Var) throws Exception {
        return I(sessionConfig);
    }

    public /* synthetic */ dq0 A(SessionConfig sessionConfig, dq0 dq0Var) {
        return I(sessionConfig);
    }

    public /* synthetic */ Object C(va1 va1Var, dq0 dq0Var) {
        k(dq0Var, va1Var);
        return null;
    }

    public /* synthetic */ dq0 E(String str, dq0 dq0Var) {
        return this.d.l(str);
    }

    @Override // com.p7700g.p99005.t51
    public void a(@x1 final SessionConfig sessionConfig, @x1 va1 va1Var) {
        this.e.a().P(new aq0() { // from class: com.p7700g.p99005.ax0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return i21.this.G(sessionConfig, dq0Var);
            }
        }).s(a21.b(va1Var), this.g);
    }

    @Override // com.p7700g.p99005.t51
    public void b(@x1 final SessionConfig sessionConfig, @x1 final va1 va1Var) {
        a.c("StartVPN: session: %s", sessionConfig.toString());
        this.h.I0(0L).u(new aq0() { // from class: com.p7700g.p99005.bx0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return i21.this.y(dq0Var);
            }
        }).P(new aq0() { // from class: com.p7700g.p99005.zw0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return i21.this.A(sessionConfig, dq0Var);
            }
        }).q(new aq0() { // from class: com.p7700g.p99005.fx0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                i21.this.C(va1Var, dq0Var);
                return null;
            }
        });
    }

    @Override // com.p7700g.p99005.t51
    public void c(@x1 va1 va1Var) {
        this.d.a().s(a21.b(va1Var), this.g);
    }

    @Override // com.p7700g.p99005.t51
    public void d(@x1 ua1<Long> ua1Var) {
        this.d.e().s(a21.a(ua1Var), this.g);
    }

    @Override // com.p7700g.p99005.t51
    public void e(@x1 final SessionConfig sessionConfig, @x1 va1 va1Var) {
        this.h.I0(0L).u(new aq0() { // from class: com.p7700g.p99005.hx0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return i21.this.u(dq0Var);
            }
        }).P(new aq0() { // from class: com.p7700g.p99005.gx0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return i21.this.w(sessionConfig, dq0Var);
            }
        }).s(a21.b(va1Var), this.g);
    }

    @Override // com.p7700g.p99005.t51
    public void f(@x1 final String str, @x1 va1 va1Var) {
        this.h.I0(0L).u(new aq0() { // from class: com.p7700g.p99005.cx0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return i21.this.E(str, dq0Var);
            }
        }).s(a21.b(va1Var), this.g);
    }

    @Override // com.p7700g.p99005.t51
    public void g(@x1 String str, @x1 String str2, @x1 va1 va1Var) {
        this.d.j(str, str2).s(a21.b(va1Var), this.g);
    }

    public void i() {
        this.i.cancel();
    }

    public /* synthetic */ Object n(dq0 dq0Var) {
        m(dq0Var);
        return null;
    }

    public /* synthetic */ dq0 s(SessionConfig sessionConfig, Bundle bundle, dq0 dq0Var) {
        return this.d.k(sessionConfig.getCountry(), sessionConfig.getReason(), sessionConfig.getAppPolicy(), bundle);
    }
}