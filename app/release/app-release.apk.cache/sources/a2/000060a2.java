package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.partner.celpher.PartnerCelpher;
import com.anythink.core.api.ATAdConst;
import com.ironsource.adapters.ironsource.IronSourceAdapter;
import com.p7700g.p99005.xu0;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: PartnerApiImpl.java */
/* loaded from: classes.dex */
public class us0 implements er0 {
    private static final String a = "/user/verify";
    private static final String b = "/user/current";
    private static final String c = "/user/login";
    private static final String d = "/user/logout";
    private static final String e = "/user/provide";
    private static final String f = "/user/countries";
    private static final String g = "/user/locations";
    private static final String h = "/user/remainingTraffic";
    private static final String i = "/user/remoteConfig";
    private static final String j = "/user/purchase";
    private static final String k = "access_token";
    private static final String l = "auth_method";
    private static final String m = "country";
    private static final String n = "location";
    private static final String o = "password";
    private static final String p = "username";
    private static final String q = "type";
    private static final String r = "app_version";
    private static final String s = "sdk_version";
    private static final String t = "private_group";
    private static final String u = "ipaddr";
    private static final String v = "app_signatures";
    private static final String w = "signatures";
    private static final String x = "app";
    @x1
    private final ClientInfo A;
    @x1
    private final vs0 B;
    @x1
    private final ss0 C;
    private final String D;
    private final String E;
    @x1
    private final br0 F;
    @x1
    private final PartnerCelpher G;
    @x1
    private final Executor H;
    @x1
    private final pt0 I;
    @x1
    private final String J;
    private final at0 y;
    private final st0 z;

    /* compiled from: PartnerApiImpl.java */
    /* loaded from: classes.dex */
    public class a implements hr0<mr0> {
        public final /* synthetic */ String b;
        public final /* synthetic */ eq0 c;

        public a(String str, eq0 eq0Var) {
            this.b = str;
            this.c = eq0Var;
        }

        @Override // com.p7700g.p99005.hr0
        public void a(au0 au0Var) {
            us0.this.F.a(this.b, au0Var);
            this.c.c(au0Var);
        }

        @Override // com.p7700g.p99005.hr0
        /* renamed from: c */
        public void b(dr0 dr0Var, mr0 mr0Var) {
            us0.this.F.b(this.b);
            this.c.d(mr0Var.f());
        }
    }

    /* compiled from: PartnerApiImpl.java */
    /* loaded from: classes.dex */
    public class b implements hr0<mr0> {
        public final /* synthetic */ String b;
        public final /* synthetic */ eq0 c;

        public b(String str, eq0 eq0Var) {
            this.b = str;
            this.c = eq0Var;
        }

        @Override // com.p7700g.p99005.hr0
        public void a(au0 au0Var) {
            us0.this.F.a(this.b, au0Var);
            this.c.c(au0Var);
        }

        @Override // com.p7700g.p99005.hr0
        /* renamed from: c */
        public void b(dr0 dr0Var, mr0 mr0Var) {
            us0.this.F.b(this.b);
            this.c.d(mr0Var.f());
        }
    }

    /* compiled from: PartnerApiImpl.java */
    /* loaded from: classes.dex */
    public class c implements hr0<et0> {
        public final /* synthetic */ String b;
        public final /* synthetic */ eq0 c;

        public c(String str, eq0 eq0Var) {
            this.b = str;
            this.c = eq0Var;
        }

        @Override // com.p7700g.p99005.hr0
        public void a(@x1 au0 au0Var) {
            us0.this.F.a(this.b, au0Var);
            this.c.c(au0Var);
        }

        @Override // com.p7700g.p99005.hr0
        /* renamed from: c */
        public void b(@x1 dr0 dr0Var, @x1 et0 et0Var) {
            us0.this.F.b(this.b);
            this.c.d(null);
        }
    }

    /* compiled from: PartnerApiImpl.java */
    /* loaded from: classes.dex */
    public static class d<T> implements hr0<T> {
        @x1
        private final br0 b;
        @x1
        private final String c;
        @x1
        private final eq0<T> d;

        public /* synthetic */ d(br0 br0Var, String str, eq0 eq0Var, a aVar) {
            this(br0Var, str, eq0Var);
        }

        @Override // com.p7700g.p99005.hr0
        public void a(@x1 au0 au0Var) {
            this.b.a(this.c, au0Var);
            this.d.c(au0Var);
        }

        @Override // com.p7700g.p99005.hr0
        public void b(@x1 dr0 dr0Var, @x1 T t) {
            this.b.b(this.c);
            this.d.d(t);
        }

        private d(@x1 br0 br0Var, @x1 String str, @x1 eq0<T> eq0Var) {
            this.b = br0Var;
            this.c = str;
            this.d = eq0Var;
        }
    }

    /* compiled from: PartnerApiImpl.java */
    /* loaded from: classes.dex */
    public static class e<T> implements hr0<T> {
        @x1
        private final br0 b;
        @x1
        private final String c;
        @x1
        private final eq0<Void> d;

        public /* synthetic */ e(br0 br0Var, String str, eq0 eq0Var, a aVar) {
            this(br0Var, str, eq0Var);
        }

        @Override // com.p7700g.p99005.hr0
        public void a(@x1 au0 au0Var) {
            this.b.a(this.c, au0Var);
            this.d.c(au0Var);
        }

        @Override // com.p7700g.p99005.hr0
        public void b(@x1 dr0 dr0Var, @x1 T t) {
            this.b.b(this.c);
            this.d.d(null);
        }

        private e(@x1 br0 br0Var, @x1 String str, @x1 eq0<Void> eq0Var) {
            this.b = br0Var;
            this.c = str;
            this.d = eq0Var;
        }
    }

    public us0(@x1 Context context, @x1 at0 at0Var, @x1 st0 st0Var, @x1 ClientInfo clientInfo, @x1 vs0 vs0Var, @x1 ss0 ss0Var, @x1 String str, @x1 String str2, @x1 ot0 ot0Var, @x1 br0 br0Var, @x1 PartnerCelpher partnerCelpher, @x1 Executor executor) {
        this.y = at0Var;
        this.z = st0Var;
        this.A = clientInfo;
        this.B = vs0Var;
        this.C = ss0Var;
        this.D = str;
        this.E = str2;
        this.F = br0Var;
        this.G = partnerCelpher;
        this.H = executor;
        this.I = pt0.b(context, ot0Var);
        this.J = context.getPackageName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A */
    public /* synthetic */ dq0 B(nr0 nr0Var, dq0 dq0Var) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put(k, (String) r81.f((String) dq0Var.F()));
        hashMap.put("type", nr0Var.f());
        return t(f, hashMap, dt0.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public /* synthetic */ dq0 D(dq0 dq0Var) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put(k, (String) r81.f((String) dq0Var.F()));
        return t(b, hashMap, jt0.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public /* synthetic */ dq0 F(String str, dq0 dq0Var) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put(k, (String) r81.f((String) dq0Var.F()));
        hashMap.put("purchase_id", str);
        return h(j, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: G */
    public /* synthetic */ Map H() throws Exception {
        return this.I.a(this.A.getCarrierId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public /* synthetic */ dq0 J(qr0 qr0Var, dq0 dq0Var) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put(k, (String) r81.f((String) dq0Var.F()));
        hashMap.put(u, Boolean.toString(true));
        if (!TextUtils.isEmpty(qr0Var.b())) {
            hashMap.put("country", qr0Var.b());
        }
        if (!TextUtils.isEmpty(qr0Var.d())) {
            hashMap.put("location", qr0Var.d());
        }
        hashMap.put("type", qr0Var.a().f());
        hashMap.put(r, this.D);
        hashMap.put("sdk_version", this.E);
        Map<String, String> c2 = qr0Var.c();
        for (String str : c2.keySet()) {
            String str2 = c2.get(str);
            if (!TextUtils.isEmpty(str2)) {
                hashMap.put(str, str2);
            }
        }
        if (!TextUtils.isEmpty(qr0Var.e())) {
            hashMap.put(t, qr0Var.e());
        }
        this.C.reset();
        return t(e, hashMap, ft0.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public /* synthetic */ ft0 L(qr0 qr0Var, dq0 dq0Var) throws Exception {
        if (!dq0Var.J()) {
            this.C.c((ft0) r81.f((ft0) dq0Var.F()), qr0Var.a(), qr0Var.e());
            return (ft0) dq0Var.F();
        }
        throw dq0Var.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public /* synthetic */ dq0 N(nr0 nr0Var, dq0 dq0Var) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put(k, (String) r81.f((String) dq0Var.F()));
        hashMap.put("type", nr0Var.f());
        return t(g, hashMap, kr0.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: O */
    public /* synthetic */ dq0 P(gr0 gr0Var, Bundle bundle, dq0 dq0Var) throws Exception {
        HashMap hashMap = new HashMap();
        if (gr0Var.f() != null) {
            hashMap.put(k, gr0Var.f());
        }
        hashMap.put(l, gr0Var.g());
        Map map = (Map) dq0Var.F();
        Objects.requireNonNull(map);
        Map map2 = map;
        hashMap.putAll(this.A.asMap());
        hashMap.putAll(map2);
        hashMap.putAll(y((String) r81.f((String) map2.get(pt0.f))));
        for (String str : bundle.keySet()) {
            hashMap.put(str, bundle.getString(str));
        }
        return s(c, hashMap, jt0.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q */
    public /* synthetic */ jt0 R(dq0 dq0Var) throws Exception {
        this.B.c(((jt0) r81.f((jt0) dq0Var.F())).a());
        this.C.reset();
        return (jt0) dq0Var.F();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: S */
    public /* synthetic */ dq0 T(dq0 dq0Var) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put(k, (String) r81.f((String) dq0Var.F()));
        return t(d, hashMap, et0.class);
    }

    private /* synthetic */ Void U(dq0 dq0Var) throws Exception {
        this.B.reset();
        this.C.reset();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W */
    public /* synthetic */ ft0 X(qr0 qr0Var) throws Exception {
        return this.C.a(qr0Var.d(), qr0Var.b(), qr0Var.a(), qr0Var.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y */
    public /* synthetic */ dq0 Z(qr0 qr0Var, dq0 dq0Var) throws Exception {
        if (dq0Var.J()) {
            if (k0(dq0Var.E())) {
                return j0(qr0Var);
            }
            return dq0.C(dq0Var.E());
        }
        return dq0.D((ft0) dq0Var.F());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a0 */
    public /* synthetic */ dq0 b0(final qr0 qr0Var, dq0 dq0Var) throws Exception {
        if (dq0Var.F() != null) {
            return l0((ft0) dq0Var.F()).u(new aq0() { // from class: com.p7700g.p99005.ks0
                @Override // com.p7700g.p99005.aq0
                public final Object a(dq0 dq0Var2) {
                    return us0.this.Z(qr0Var, dq0Var2);
                }
            });
        }
        return j0(qr0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c0 */
    public /* synthetic */ dq0 d0(String str, String str2, dq0 dq0Var) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put(k, (String) r81.f((String) dq0Var.F()));
        hashMap.put("type", str);
        hashMap.put(IronSourceAdapter.IRONSOURCE_BIDDING_TOKEN_KEY, str2);
        return p(j, hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e0 */
    public /* synthetic */ dq0 f0(dq0 dq0Var) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put(k, (String) r81.f((String) dq0Var.F()));
        return t(h, hashMap, ht0.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g0 */
    public /* synthetic */ dq0 h0(dq0 dq0Var) throws Exception {
        HashMap hashMap = new HashMap();
        hashMap.put(k, (String) r81.f((String) dq0Var.F()));
        hashMap.put("carrier_id", this.A.getCarrierId());
        hashMap.put("device_type", pt0.a);
        eq0 eq0Var = new eq0();
        String provide = this.F.provide();
        this.y.h(provide, i, hashMap, new d(this.F, provide, eq0Var, null));
        return eq0Var.a();
    }

    public static /* synthetic */ ft0 i0(ft0 ft0Var, dq0 dq0Var) throws Exception {
        if (dq0Var.J()) {
            throw dq0Var.E();
        }
        return ft0Var;
    }

    @x1
    private dq0<ft0> j0(@x1 final qr0 qr0Var) {
        return a().R(new aq0() { // from class: com.p7700g.p99005.is0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return us0.this.J(qr0Var, dq0Var);
            }
        }, this.H).s(new aq0() { // from class: com.p7700g.p99005.ns0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return us0.this.L(qr0Var, dq0Var);
            }
        }, this.H);
    }

    private boolean k0(@x1 Exception exc) {
        if (exc instanceof bu0) {
            String i2 = ((bu0) exc).i();
            return "INVALID".equals(i2) || "SERVER_UNAVAILABLE".equals(i2);
        }
        return false;
    }

    @x1
    private dq0<ft0> l0(@x1 final ft0 ft0Var) {
        HashMap hashMap = new HashMap();
        String u2 = ft0Var.u();
        Objects.requireNonNull(u2);
        hashMap.put(p, u2);
        String o2 = ft0Var.o();
        Objects.requireNonNull(o2);
        hashMap.put(o, o2);
        return t(a, hashMap, mr0.class).s(new aq0() { // from class: com.p7700g.p99005.ms0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                ft0 ft0Var2 = ft0.this;
                if (dq0Var.J()) {
                    throw dq0Var.E();
                }
                return ft0Var2;
            }
        }, this.H);
    }

    @x1
    private dq0<Map<String, String>> z() {
        return dq0.g(new Callable() { // from class: com.p7700g.p99005.cs0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return us0.this.H();
            }
        });
    }

    public /* synthetic */ Void V(dq0 dq0Var) {
        this.B.reset();
        this.C.reset();
        return null;
    }

    @Override // com.p7700g.p99005.er0
    public dq0<String> a() {
        final vs0 vs0Var = this.B;
        Objects.requireNonNull(vs0Var);
        return dq0.g(new Callable() { // from class: com.p7700g.p99005.xr0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return vs0.this.a();
            }
        });
    }

    @Override // com.p7700g.p99005.er0
    public dq0<ft0> b() {
        final ss0 ss0Var = this.C;
        Objects.requireNonNull(ss0Var);
        return dq0.g(new Callable() { // from class: com.p7700g.p99005.rs0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ss0.this.b();
            }
        });
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<Boolean> c() {
        final vs0 vs0Var = this.B;
        Objects.requireNonNull(vs0Var);
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.qs0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(vs0.this.b());
            }
        }, this.H);
    }

    @Override // com.p7700g.p99005.er0
    public void d() {
        at0 at0Var = this.y;
        if (at0Var != null) {
            at0Var.d();
        }
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<String> e(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        HashMap hashMap = new HashMap();
        hashMap.put(k, this.B.a());
        hashMap.put(x, str);
        hashMap.put(r, str2);
        hashMap.put("test_name", str3);
        hashMap.put("user_ip", str4);
        hashMap.put("vpn_ip", str5);
        hashMap.put("test_ip", str6);
        hashMap.put("optimal", String.valueOf(z));
        hashMap.put("time", str7);
        String provide = this.F.provide();
        eq0 eq0Var = new eq0();
        this.y.f(provide, "/user/perf", hashMap, new a(provide, eq0Var));
        return eq0Var.a();
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<jt0> f() {
        return a().P(new aq0() { // from class: com.p7700g.p99005.yr0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return us0.this.D(dq0Var);
            }
        });
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<Void> g() {
        return a().P(new aq0() { // from class: com.p7700g.p99005.ls0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return us0.this.T(dq0Var);
            }
        }).s(new aq0() { // from class: com.p7700g.p99005.hs0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                us0.this.V(dq0Var);
                return null;
            }
        }, this.H);
    }

    @Override // com.p7700g.p99005.er0
    public <T> dq0<Void> h(@x1 String str, @x1 Map<String, String> map) {
        eq0 eq0Var = new eq0();
        String provide = this.F.provide();
        this.y.a(provide, str, map, new ts0(this.z, et0.class, new c(provide, eq0Var)));
        return eq0Var.a();
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<Void> i(@x1 final String str) {
        return a().P(new aq0() { // from class: com.p7700g.p99005.as0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return us0.this.F(str, dq0Var);
            }
        });
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<jt0> j(@x1 gr0 gr0Var) {
        return q(gr0Var, Bundle.EMPTY);
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<dt0> k(@x1 final nr0 nr0Var) {
        return a().P(new aq0() { // from class: com.p7700g.p99005.ps0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return us0.this.B(nr0Var, dq0Var);
            }
        });
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<mr0> l() {
        return a().P(new aq0() { // from class: com.p7700g.p99005.js0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return us0.this.h0(dq0Var);
            }
        });
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<Void> m(@x1 final String str, @x1 final String str2) {
        return a().P(new aq0() { // from class: com.p7700g.p99005.fs0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return us0.this.d0(str2, str, dq0Var);
            }
        });
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<Void> n(@x1 String str) {
        return m(str, "google");
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<ft0> o(@x1 final qr0 qr0Var) {
        this.C.d(qr0Var.d(), qr0Var.b(), qr0Var.e());
        return dq0.e(new Callable() { // from class: com.p7700g.p99005.os0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return us0.this.X(qr0Var);
            }
        }, this.H).u(new aq0() { // from class: com.p7700g.p99005.es0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return us0.this.b0(qr0Var, dq0Var);
            }
        });
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<Void> p(@x1 String str, @x1 Map<String, String> map) {
        eq0 eq0Var = new eq0();
        String provide = this.F.provide();
        this.y.f(provide, str, map, new ts0(this.z, et0.class, new e(this.F, provide, eq0Var, null)));
        return eq0Var.a();
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<jt0> q(@x1 final gr0 gr0Var, @x1 final Bundle bundle) {
        return z().R(new aq0() { // from class: com.p7700g.p99005.ds0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return us0.this.P(gr0Var, bundle, dq0Var);
            }
        }, this.H).N(new aq0() { // from class: com.p7700g.p99005.bs0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return us0.this.R(dq0Var);
            }
        }, this.H);
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<String> r(String str, String str2, String str3, String str4, String str5, String str6, long j2, long j3, long j4, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        HashMap hashMap = new HashMap();
        hashMap.put(k, this.B.a());
        hashMap.put(x, str);
        hashMap.put(r, str2);
        hashMap.put("sdk_version", str3);
        hashMap.put(xu0.f.j, str4);
        hashMap.put("error_string", str5);
        hashMap.put("exception_name", str6);
        hashMap.put(xu0.f.h, String.valueOf(j2));
        hashMap.put("hydra_code", String.valueOf(j3));
        hashMap.put("error_version", String.valueOf(j4));
        hashMap.put("error_data", str7);
        hashMap.put("client_ip", str8);
        hashMap.put(xu0.f.v, str9);
        hashMap.put(com.anythink.expressad.foundation.g.a.bD, str10);
        hashMap.put("network_status", str11);
        hashMap.put("network_type", str12);
        hashMap.put(ATAdConst.NETWORK_CUSTOM_KEY.NETWORK_NAME, str13);
        hashMap.put("network_ip_type", str14);
        String provide = this.F.provide();
        eq0 eq0Var = new eq0();
        this.y.f(provide, "/user/hydraerror", hashMap, new b(provide, eq0Var));
        return eq0Var.a();
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public <T> dq0<T> s(@x1 String str, @x1 Map<String, String> map, @x1 Class<T> cls) {
        eq0 eq0Var = new eq0();
        String provide = this.F.provide();
        this.y.f(provide, str, map, new ts0(this.z, cls, new d(this.F, provide, eq0Var, null)));
        return eq0Var.a();
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public <T> dq0<T> t(@x1 String str, @x1 Map<String, String> map, @x1 Class<T> cls) {
        eq0 eq0Var = new eq0();
        String provide = this.F.provide();
        this.y.h(provide, str, map, new ts0(this.z, cls, new d(this.F, provide, eq0Var, null)));
        return eq0Var.a();
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<ht0> u() {
        return a().P(new aq0() { // from class: com.p7700g.p99005.gs0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return us0.this.f0(dq0Var);
            }
        });
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<kr0> v(@x1 final nr0 nr0Var) {
        return a().P(new aq0() { // from class: com.p7700g.p99005.zr0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return us0.this.N(nr0Var, dq0Var);
            }
        });
    }

    @Override // com.p7700g.p99005.er0
    @x1
    public dq0<Void> w(@x1 String str, @x1 Map<String, String> map) {
        eq0 eq0Var = new eq0();
        String provide = this.F.provide();
        this.y.e(provide, str, map, new ts0(this.z, et0.class, new e(this.F, provide, eq0Var, null)));
        return eq0Var.a();
    }

    @x1
    public Map<String, String> y(@x1 String str) {
        HashMap hashMap = new HashMap();
        hashMap.put(v, TextUtils.join(",", this.G.b((String) r81.f(str))));
        hashMap.put(w, TextUtils.join(",", this.G.a()));
        hashMap.put(x, this.J);
        hashMap.put(r, this.D);
        hashMap.put("sdk_version", this.E);
        return hashMap;
    }
}