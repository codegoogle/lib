package com.p7700g.p99005;

import android.os.Bundle;
import android.text.TextUtils;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.exceptions.PartnerApiException;
import com.p7700g.p99005.a21;
import com.p7700g.p99005.qr0;
import com.p7700g.p99005.u41;
import java.net.UnknownHostException;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: CarrierBackend.java */
/* loaded from: classes.dex */
public class e21 implements x11 {
    public static final int a = 401;
    @x1
    public static final String b = "hydra_login_token";
    @x1
    public static final String c = "hydra_login_type";
    public static final String e = "%s:%s";
    @x1
    private final ClientInfo g;
    @x1
    private final Executor h;
    @x1
    private final x31 i;
    @x1
    private final u41 j;
    @x1
    private final h31 k;
    @x1
    private final er0 l;
    @x1
    private final br0 m;
    @x1
    private final Executor n;
    @x1
    public final u41.b o = rv0.a;
    @x1
    public final u41.b p = new u41.b() { // from class: com.p7700g.p99005.gw0
        @Override // com.p7700g.p99005.u41.b
        public final dq0 a(int i, Throwable th) {
            return e21.this.y0(i, th);
        }
    };
    @x1
    public final u41.b q = xv0.a;
    @x1
    private static final kj1 d = kj1.b("CarrierBackend");
    @x1
    public static final u41.b f = tv0.a;

    public e21(@x1 er0 er0Var, @x1 x31 x31Var, @x1 ClientInfo clientInfo, @x1 u41 u41Var, @x1 h31 h31Var, @x1 br0 br0Var, @x1 Executor executor, @x1 Executor executor2) {
        this.i = x31Var;
        this.l = er0Var;
        this.j = u41Var;
        this.k = h31Var;
        this.m = br0Var;
        this.n = executor;
        this.g = clientInfo;
        this.h = executor2;
    }

    @x1
    private dq0<Boolean> A(@x1 PartnerApiException partnerApiException) {
        if ("SERVER_UNAVAILABLE".equals(partnerApiException.getContent())) {
            return dq0.D(Boolean.TRUE);
        }
        if (!"USER_SUSPENDED".equals(partnerApiException.getContent()) && !"SESSIONS_EXCEED".equals(partnerApiException.getContent()) && !"TRAFFIC_EXCEED".equals(partnerApiException.getContent()) && !"DEVICES_EXCEED".equals(partnerApiException.getContent())) {
            if (partnerApiException.getCode() == 401) {
                String e2 = this.i.e(String.format(e, b, this.g.getCarrierId()), "");
                String e3 = this.i.e(String.format(e, c, this.g.getCarrierId()), "");
                if (!TextUtils.isEmpty(e3)) {
                    a21.a aVar = new a21.a();
                    l(gr0.b(e2, e3), aVar);
                    return aVar.c().q(iv0.a);
                }
            }
            return dq0.D(Boolean.FALSE);
        }
        return dq0.D(Boolean.FALSE);
    }

    private /* synthetic */ dq0 A0(String str, Map map, Class cls, int i) {
        return this.l.s(str, map, cls);
    }

    private /* synthetic */ dq0 B(nr0 nr0Var, int i) {
        return this.l.k(nr0Var);
    }

    private /* synthetic */ Object C0(final String str, final Map map, final Class cls, ua1 ua1Var, dq0 dq0Var) throws Exception {
        this.j.n(wo1.t("postRequest:", str), new u41.c() { // from class: com.p7700g.p99005.gv0
            @Override // com.p7700g.p99005.u41.c
            public final dq0 a(int i) {
                return e21.this.B0(str, map, cls, i);
            }
        }, this.m.size(), e1()).s(a21.a(ua1Var), this.n);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ dq0 E(final nr0 nr0Var, ua1 ua1Var, dq0 dq0Var) throws Exception {
        return this.j.n("countries", new u41.c() { // from class: com.p7700g.p99005.lw0
            @Override // com.p7700g.p99005.u41.c
            public final dq0 a(int i) {
                return e21.this.C(nr0Var, i);
            }
        }, this.m.size(), e1()).s(a21.a(ua1Var), this.n);
    }

    private /* synthetic */ dq0 E0(String str, Map map, int i) {
        return this.l.p(str, map);
    }

    private /* synthetic */ dq0 F(qr0 qr0Var, int i) {
        return this.l.o(qr0Var);
    }

    private /* synthetic */ Object G0(final String str, final Map map, va1 va1Var, dq0 dq0Var) throws Exception {
        this.j.n(wo1.t("postRequest:", str), new u41.c() { // from class: com.p7700g.p99005.yv0
            @Override // com.p7700g.p99005.u41.c
            public final dq0 a(int i) {
                return e21.this.F0(str, map, i);
            }
        }, this.m.size(), e1()).s(a21.b(va1Var), this.n);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public /* synthetic */ dq0 I(final qr0 qr0Var, dq0 dq0Var) throws Exception {
        return this.j.n("credentials", new u41.c() { // from class: com.p7700g.p99005.uv0
            @Override // com.p7700g.p99005.u41.c
            public final dq0 a(int i) {
                return e21.this.G(qr0Var, i);
            }
        }, this.m.size(), f1());
    }

    private /* synthetic */ dq0 I0(String str, int i) {
        return this.l.n(str);
    }

    private /* synthetic */ Object J(qr0 qr0Var, dq0 dq0Var) throws Exception {
        kj1 kj1Var = d;
        kj1Var.c("Got credentials for carrier: %s request: %s", this.g.getCarrierId(), qr0Var.toString());
        ft0 ft0Var = (ft0) dq0Var.F();
        if (ft0Var != null) {
            kj1Var.c(ft0Var.toString(), new Object[0]);
        }
        if (dq0Var.E() != null) {
            kj1Var.f(dq0Var.E());
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K0 */
    public /* synthetic */ dq0 L0(final String str, va1 va1Var, dq0 dq0Var) throws Exception {
        return this.j.n("purchase", new u41.c() { // from class: com.p7700g.p99005.nv0
            @Override // com.p7700g.p99005.u41.c
            public final dq0 a(int i) {
                return e21.this.J0(str, i);
            }
        }, this.m.size(), e1()).s(a21.b(va1Var), this.n);
    }

    private /* synthetic */ Object L(dq0 dq0Var) throws Exception {
        d.c("Got currentUser for carrier: %s user: %s", this.g.getCarrierId(), dq0Var.F());
        return null;
    }

    private /* synthetic */ dq0 M0(String str, String str2, int i) {
        return this.l.m(str, str2);
    }

    private /* synthetic */ dq0 N(int i) {
        return this.l.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O0 */
    public /* synthetic */ dq0 P0(final String str, final String str2, va1 va1Var, dq0 dq0Var) throws Exception {
        return this.j.n("purchase", new u41.c() { // from class: com.p7700g.p99005.wv0
            @Override // com.p7700g.p99005.u41.c
            public final dq0 a(int i) {
                return e21.this.N0(str, str2, i);
            }
        }, this.m.size(), e1()).s(a21.b(va1Var), this.n);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public /* synthetic */ dq0 Q(dq0 dq0Var) throws Exception {
        return this.j.n("currentUser", new u41.c() { // from class: com.p7700g.p99005.sv0
            @Override // com.p7700g.p99005.u41.c
            public final dq0 a(int i) {
                return e21.this.O(i);
            }
        }, this.m.size(), e1());
    }

    private /* synthetic */ dq0 Q0(String str, Map map, int i) {
        return this.l.w(str, map);
    }

    private /* synthetic */ dq0 R(int i, int i2) {
        return this.l.i(String.valueOf(i));
    }

    private /* synthetic */ Object S0(final String str, final Map map, va1 va1Var, dq0 dq0Var) throws Exception {
        this.j.n(wo1.t("putRequest:", str), new u41.c() { // from class: com.p7700g.p99005.jw0
            @Override // com.p7700g.p99005.u41.c
            public final dq0 a(int i) {
                return e21.this.R0(str, map, i);
            }
        }, this.m.size(), e1()).s(a21.b(va1Var), this.n);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public /* synthetic */ dq0 U(final int i, va1 va1Var, dq0 dq0Var) throws Exception {
        return this.j.n("deletePurchase", new u41.c() { // from class: com.p7700g.p99005.vv0
            @Override // com.p7700g.p99005.u41.c
            public final dq0 a(int i2) {
                return e21.this.S(i, i2);
            }
        }, this.m.size(), e1()).s(a21.b(va1Var), this.n);
    }

    private /* synthetic */ dq0 U0(int i) {
        return this.l.u();
    }

    private /* synthetic */ dq0 V(String str, Map map, int i) {
        return this.l.h(str, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public /* synthetic */ dq0 X0(ua1 ua1Var, dq0 dq0Var) throws Exception {
        return this.j.n("remainingTraffic", new u41.c() { // from class: com.p7700g.p99005.hw0
            @Override // com.p7700g.p99005.u41.c
            public final dq0 a(int i) {
                return e21.this.V0(i);
            }
        }, this.m.size(), e1()).s(a21.a(ua1Var), this.n);
    }

    private /* synthetic */ Object X(final String str, final Map map, va1 va1Var, dq0 dq0Var) throws Exception {
        this.j.n(wo1.t("deleteRequest :", str), new u41.c() { // from class: com.p7700g.p99005.pw0
            @Override // com.p7700g.p99005.u41.c
            public final dq0 a(int i) {
                return e21.this.W(str, map, i);
            }
        }, this.m.size(), e1()).s(a21.b(va1Var), this.n);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public /* synthetic */ dq0 Z0(ua1 ua1Var, dq0 dq0Var) throws Exception {
        return this.l.l().s(a21.a(ua1Var), this.n);
    }

    private /* synthetic */ dq0 Z(String str, Map map, Class cls, int i) {
        return this.l.t(str, map, cls);
    }

    private /* synthetic */ Void a1() throws Exception {
        synchronized (this.l) {
            this.l.d();
        }
        return null;
    }

    private /* synthetic */ Object b0(final String str, final Map map, final Class cls, ua1 ua1Var, dq0 dq0Var) throws Exception {
        this.j.n(wo1.t("getRequest:", str), new u41.c() { // from class: com.p7700g.p99005.ow0
            @Override // com.p7700g.p99005.u41.c
            public final dq0 a(int i) {
                return e21.this.a0(str, map, cls, i);
            }
        }, this.m.size(), e1()).s(a21.a(ua1Var), this.n);
        return null;
    }

    public static /* synthetic */ dq0 c1(int i, Throwable th) {
        gc1 unWrap = gc1.unWrap(d81.b(th));
        if (unWrap instanceof PartnerApiException) {
            return dq0.D(Boolean.valueOf(y((PartnerApiException) unWrap, "PARSE_EXCEPTION")));
        }
        return dq0.D(Boolean.TRUE);
    }

    public static /* synthetic */ Boolean d0(dq0 dq0Var) throws Exception {
        if (!dq0Var.J()) {
            return Boolean.TRUE;
        }
        throw dq0Var.E();
    }

    @x1
    private dq0<Void> d1() {
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.lv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                e21.this.b1();
                return null;
            }
        }, this.h);
    }

    private /* synthetic */ dq0 e0(nr0 nr0Var, int i) {
        return this.l.v(nr0Var);
    }

    @x1
    private u41.b e1() {
        return new u41.a(this.q, f);
    }

    @x1
    private u41.b f1() {
        return new u41.a(this.q, this.p);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ dq0 h0(final nr0 nr0Var, ua1 ua1Var, dq0 dq0Var) throws Exception {
        return this.j.n("locations", new u41.c() { // from class: com.p7700g.p99005.nw0
            @Override // com.p7700g.p99005.u41.c
            public final dq0 a(int i) {
                return e21.this.f0(nr0Var, i);
            }
        }, this.m.size(), e1()).s(a21.a(ua1Var), this.n);
    }

    private /* synthetic */ Object i0(gr0 gr0Var, dq0 dq0Var) throws Exception {
        this.i.c().b(String.format(e, b, this.g.getCarrierId()), gr0Var.f()).b(String.format(e, c, this.g.getCarrierId()), gr0Var.g()).d();
        return null;
    }

    private /* synthetic */ dq0 k0(gr0 gr0Var, Bundle bundle, int i) {
        return this.l.q(gr0Var, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m0 */
    public /* synthetic */ dq0 n0(final gr0 gr0Var, final Bundle bundle, ua1 ua1Var, dq0 dq0Var) throws Exception {
        return this.j.n("login", new u41.c() { // from class: com.p7700g.p99005.ev0
            @Override // com.p7700g.p99005.u41.c
            public final dq0 a(int i) {
                return e21.this.l0(gr0Var, bundle, i);
            }
        }, this.m.size(), this.o).s(a21.a(ua1Var), this.n);
    }

    private /* synthetic */ Object o0(dq0 dq0Var) throws Exception {
        this.k.e(new h21(this.g.getCarrierId()));
        return null;
    }

    private /* synthetic */ dq0 q0(dq0 dq0Var) throws Exception {
        return z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s0 */
    public /* synthetic */ dq0 t0(dq0 dq0Var) throws Exception {
        if (!TextUtils.isEmpty((CharSequence) dq0Var.F())) {
            return this.l.g();
        }
        return dq0.D(null);
    }

    private /* synthetic */ Object u0(dq0 dq0Var) throws Exception {
        this.i.c().remove(String.format(e, b, this.g.getCarrierId())).remove(String.format(e, c, this.g.getCarrierId())).a();
        return null;
    }

    public static /* synthetic */ dq0 w0(int i, Throwable th) {
        gc1 unWrap = gc1.unWrap(d81.b(th));
        if (unWrap instanceof PartnerApiException) {
            return dq0.D(Boolean.valueOf(y((PartnerApiException) unWrap, "PARSE_EXCEPTION")));
        }
        return dq0.D(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x0 */
    public /* synthetic */ dq0 y0(int i, Throwable th) {
        gc1 unWrap = gc1.unWrap(d81.b(th));
        d.d(th, "Will handleUnauthorized with", new Object[0]);
        if (unWrap instanceof PartnerApiException) {
            PartnerApiException partnerApiException = (PartnerApiException) unWrap;
            if (partnerApiException.getCode() == 200 && (y(partnerApiException, "SERVER_UNAVAILABLE") || y(partnerApiException, "PARSE_EXCEPTION"))) {
                return dq0.D(Boolean.TRUE);
            }
            return A(partnerApiException);
        }
        return dq0.D(Boolean.TRUE);
    }

    private static boolean y(@x1 PartnerApiException partnerApiException, @x1 String str) {
        return partnerApiException.getContent().equals(str);
    }

    @x1
    private dq0<String> z() {
        return this.l.a();
    }

    public static /* synthetic */ dq0 z0(int i, Throwable th) {
        gc1 unWrap = gc1.unWrap(d81.b(th));
        d.d(th, "Will handleNetwork with", new Object[0]);
        if (unWrap instanceof yb1) {
            Throwable cause = ((yb1) unWrap).getCause();
            if (cause instanceof yt0) {
                return dq0.D(Boolean.valueOf(!(((yt0) cause).getCause() instanceof UnknownHostException)));
            }
        }
        return dq0.D(Boolean.TRUE);
    }

    public /* synthetic */ dq0 B0(String str, Map map, Class cls, int i) {
        return this.l.s(str, map, cls);
    }

    public /* synthetic */ dq0 C(nr0 nr0Var, int i) {
        return this.l.k(nr0Var);
    }

    public /* synthetic */ Object D0(String str, Map map, Class cls, ua1 ua1Var, dq0 dq0Var) {
        C0(str, map, cls, ua1Var, dq0Var);
        return null;
    }

    public /* synthetic */ dq0 F0(String str, Map map, int i) {
        return this.l.p(str, map);
    }

    public /* synthetic */ dq0 G(qr0 qr0Var, int i) {
        return this.l.o(qr0Var);
    }

    public /* synthetic */ Object H0(String str, Map map, va1 va1Var, dq0 dq0Var) {
        G0(str, map, va1Var, dq0Var);
        return null;
    }

    public /* synthetic */ dq0 J0(String str, int i) {
        return this.l.n(str);
    }

    public /* synthetic */ Object K(qr0 qr0Var, dq0 dq0Var) {
        J(qr0Var, dq0Var);
        return null;
    }

    public /* synthetic */ Object M(dq0 dq0Var) {
        L(dq0Var);
        return null;
    }

    public /* synthetic */ dq0 N0(String str, String str2, int i) {
        return this.l.m(str, str2);
    }

    public /* synthetic */ dq0 O(int i) {
        return this.l.f();
    }

    public /* synthetic */ dq0 R0(String str, Map map, int i) {
        return this.l.w(str, map);
    }

    public /* synthetic */ dq0 S(int i, int i2) {
        return this.l.i(String.valueOf(i));
    }

    public /* synthetic */ Object T0(String str, Map map, va1 va1Var, dq0 dq0Var) {
        S0(str, map, va1Var, dq0Var);
        return null;
    }

    public /* synthetic */ dq0 V0(int i) {
        return this.l.u();
    }

    public /* synthetic */ dq0 W(String str, Map map, int i) {
        return this.l.h(str, map);
    }

    public /* synthetic */ Object Y(String str, Map map, va1 va1Var, dq0 dq0Var) {
        X(str, map, va1Var, dq0Var);
        return null;
    }

    @Override // com.p7700g.p99005.x11
    @x1
    public String a() {
        try {
            dq0<String> z = z();
            z.Y();
            return (String) r81.f(z.F());
        } catch (InterruptedException unused) {
            return "";
        }
    }

    public /* synthetic */ dq0 a0(String str, Map map, Class cls, int i) {
        return this.l.t(str, map, cls);
    }

    @Override // com.p7700g.p99005.x11
    public <T> void b(@x1 final String str, @x1 final Map<String, String> map, @x1 final Class<T> cls, @x1 final ua1<T> ua1Var) {
        d1().q(new aq0() { // from class: com.p7700g.p99005.fv0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                e21.this.D0(str, map, cls, ua1Var, dq0Var);
                return null;
            }
        });
    }

    public /* synthetic */ Void b1() {
        a1();
        return null;
    }

    @Override // com.p7700g.p99005.x11
    public boolean c() {
        try {
            dq0<Boolean> c2 = this.l.c();
            c2.Y();
            return ((Boolean) r81.f(c2.F())).booleanValue();
        } catch (InterruptedException unused) {
            return false;
        }
    }

    public /* synthetic */ Object c0(String str, Map map, Class cls, ua1 ua1Var, dq0 dq0Var) {
        b0(str, map, cls, ua1Var, dq0Var);
        return null;
    }

    @Override // com.p7700g.p99005.x11
    public void d(@x1 final nr0 nr0Var, @x1 final ua1<kr0> ua1Var) {
        d.c("Called locations for carrier: %s connection: %s", this.g.getCarrierId(), nr0Var);
        d1().u(new aq0() { // from class: com.p7700g.p99005.mw0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return e21.this.h0(nr0Var, ua1Var, dq0Var);
            }
        });
    }

    @Override // com.p7700g.p99005.x11
    public void e(final int i, @x1 final va1 va1Var) {
        d1().u(new aq0() { // from class: com.p7700g.p99005.qv0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return e21.this.U(i, va1Var, dq0Var);
            }
        });
    }

    @Override // com.p7700g.p99005.x11
    public void f(@x1 final nr0 nr0Var, @x1 final ua1<dt0> ua1Var) {
        d.c("Called countries for carrier: %s connection: %s", this.g.getCarrierId(), nr0Var);
        d1().u(new aq0() { // from class: com.p7700g.p99005.hv0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return e21.this.E(nr0Var, ua1Var, dq0Var);
            }
        });
    }

    public /* synthetic */ dq0 f0(nr0 nr0Var, int i) {
        return this.l.v(nr0Var);
    }

    @Override // com.p7700g.p99005.x11
    public <T> void g(@x1 final String str, @x1 final Map<String, String> map, @x1 final Class<T> cls, @x1 final ua1<T> ua1Var) {
        d1().q(new aq0() { // from class: com.p7700g.p99005.ew0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                e21.this.c0(str, map, cls, ua1Var, dq0Var);
                return null;
            }
        });
    }

    @Override // com.p7700g.p99005.x11
    public void h(@x1 final ua1<mr0> ua1Var) {
        d.c("Called remoteConfig for carrier: %s", this.g.getCarrierId());
        d1().u(new aq0() { // from class: com.p7700g.p99005.ov0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return e21.this.Z0(ua1Var, dq0Var);
            }
        });
    }

    @Override // com.p7700g.p99005.x11
    public void i(@x1 ua1<jt0> ua1Var) {
        d.c("Called currentUser for carrier: %s", this.g.getCarrierId());
        d1().u(new aq0() { // from class: com.p7700g.p99005.qw0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return e21.this.Q(dq0Var);
            }
        }).s(a21.a(ua1Var), this.n).q(new aq0() { // from class: com.p7700g.p99005.iw0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                e21.this.M(dq0Var);
                return null;
            }
        });
    }

    @Override // com.p7700g.p99005.x11
    public void j(@x1 ua1<dt0> ua1Var) {
        f(nr0.HYDRA_TCP, ua1Var);
    }

    public /* synthetic */ Object j0(gr0 gr0Var, dq0 dq0Var) {
        i0(gr0Var, dq0Var);
        return null;
    }

    @Override // com.p7700g.p99005.x11
    public void k(@x1 final String str, @x1 final Map<String, String> map, @x1 final va1 va1Var) {
        d1().q(new aq0() { // from class: com.p7700g.p99005.cv0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                e21.this.T0(str, map, va1Var, dq0Var);
                return null;
            }
        });
    }

    @Override // com.p7700g.p99005.x11
    public void l(@x1 gr0 gr0Var, @x1 ua1<jt0> ua1Var) {
        o(gr0Var, Bundle.EMPTY, ua1Var);
    }

    public /* synthetic */ dq0 l0(gr0 gr0Var, Bundle bundle, int i) {
        return this.l.q(gr0Var, bundle);
    }

    @Override // com.p7700g.p99005.x11
    public void m(@x1 ua1<String> ua1Var) {
        this.l.a().s(a21.a(ua1Var), this.n);
    }

    @Override // com.p7700g.p99005.x11
    public void n(@x1 ua1<ft0> ua1Var) {
        this.l.b().s(a21.a(ua1Var), this.n);
    }

    @Override // com.p7700g.p99005.x11
    public void o(@x1 final gr0 gr0Var, @x1 final Bundle bundle, @x1 final ua1<jt0> ua1Var) {
        d.c("Called login for carrier: %s", this.g.getCarrierId());
        d1().s(new aq0() { // from class: com.p7700g.p99005.dv0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                e21.this.j0(gr0Var, dq0Var);
                return null;
            }
        }, this.h).u(new aq0() { // from class: com.p7700g.p99005.zv0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return e21.this.n0(gr0Var, bundle, ua1Var, dq0Var);
            }
        }).s(new aq0() { // from class: com.p7700g.p99005.mv0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                e21.this.p0(dq0Var);
                return null;
            }
        }, this.h);
    }

    @Override // com.p7700g.p99005.x11
    public void p(@x1 String str, @x1 nr0 nr0Var, @x1 String str2, @x1 ua1<ft0> ua1Var) {
        s(new qr0.a().h(str).k(str2).g(nr0Var).f(), ua1Var);
    }

    public /* synthetic */ Object p0(dq0 dq0Var) {
        o0(dq0Var);
        return null;
    }

    @Override // com.p7700g.p99005.x11
    public void q(@x1 final String str, @x1 final String str2, @x1 final va1 va1Var) {
        d.c("Purchase: %s type: %s", str, str2);
        d1().u(new aq0() { // from class: com.p7700g.p99005.dw0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return e21.this.P0(str, str2, va1Var, dq0Var);
            }
        });
    }

    @Override // com.p7700g.p99005.x11
    public void r(@x1 ua1<Boolean> ua1Var) {
        this.l.c().s(a21.a(ua1Var), this.n);
    }

    public /* synthetic */ dq0 r0(dq0 dq0Var) {
        return z();
    }

    @Override // com.p7700g.p99005.x11
    public void s(@x1 final qr0 qr0Var, @x1 ua1<ft0> ua1Var) {
        d.c("Called credentials for carrier: %s request: %s", this.g.getCarrierId(), qr0Var.toString());
        d1().u(new aq0() { // from class: com.p7700g.p99005.fw0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return e21.this.I(qr0Var, dq0Var);
            }
        }).s(a21.a(ua1Var), this.n).q(new aq0() { // from class: com.p7700g.p99005.kv0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                e21.this.K(qr0Var, dq0Var);
                return null;
            }
        });
    }

    @Override // com.p7700g.p99005.x11
    public void t(@x1 final String str, @x1 final Map<String, String> map, @x1 final va1 va1Var) {
        d1().q(new aq0() { // from class: com.p7700g.p99005.cw0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                e21.this.H0(str, map, va1Var, dq0Var);
                return null;
            }
        });
    }

    @Override // com.p7700g.p99005.x11
    public void u(@x1 final String str, @x1 final va1 va1Var) {
        d.c(wo1.t("Purchase: ", str), new Object[0]);
        d1().u(new aq0() { // from class: com.p7700g.p99005.bw0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return e21.this.L0(str, va1Var, dq0Var);
            }
        });
    }

    @Override // com.p7700g.p99005.x11
    public void v(@x1 va1 va1Var) {
        d.c("Called logout for carrier: %s", this.g.getCarrierId());
        d1().u(new aq0() { // from class: com.p7700g.p99005.kw0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return e21.this.r0(dq0Var);
            }
        }).u(new aq0() { // from class: com.p7700g.p99005.jv0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return e21.this.t0(dq0Var);
            }
        }).s(new aq0() { // from class: com.p7700g.p99005.aw0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                e21.this.v0(dq0Var);
                return null;
            }
        }, this.h).s(a21.b(va1Var), this.n);
    }

    public /* synthetic */ Object v0(dq0 dq0Var) {
        u0(dq0Var);
        return null;
    }

    @Override // com.p7700g.p99005.x11
    public void w(@x1 final String str, @x1 final Map<String, String> map, @x1 final va1 va1Var) {
        d1().q(new aq0() { // from class: com.p7700g.p99005.pv0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                e21.this.Y(str, map, va1Var, dq0Var);
                return null;
            }
        });
    }

    @Override // com.p7700g.p99005.x11
    public void x(@x1 final ua1<ht0> ua1Var) {
        d.c("Called remainingTraffic for carrier: %s", this.g.getCarrierId());
        d1().u(new aq0() { // from class: com.p7700g.p99005.bv0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return e21.this.X0(ua1Var, dq0Var);
            }
        });
    }
}