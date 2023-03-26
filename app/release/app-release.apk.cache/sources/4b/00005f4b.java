package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.partner.celpher.PartnerCelpher;
import com.anythink.expressad.foundation.c.d;
import com.google.gson.Gson;
import com.p7700g.p99005.xu0;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: InternalReporting.java */
/* loaded from: classes.dex */
public class u31 {
    @x1
    private static final kj1 a = kj1.b("InternalReporting");
    @x1
    private static final String b = "VPN node ping";
    private static final long c = 100;
    @x1
    private static final String d = "start_vpn";
    @x1
    public final Context e;
    @x1
    private final x31 f;
    @x1
    private final e91 g;

    /* compiled from: InternalReporting.java */
    /* loaded from: classes.dex */
    public static class a {
        @z1
        public final String a;
        @z1
        public final ClientInfo b;
        @z1
        public final String c;
        @z1
        public final String d;
        @z1
        public final String e;
        @z1
        public final String f;
        @z1
        public final String g;
        @z1
        public final String h;
        @z1
        public final String i;

        /* compiled from: InternalReporting.java */
        /* renamed from: com.p7700g.p99005.u31$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0253a {
            @z1
            private String a;
            @z1
            private String b;
            @z1
            private String c;
            @z1
            private String d;
            @z1
            private String e;
            @z1
            private String f;
            @z1
            private String g;
            @z1
            private String h;
            @z1
            private ClientInfo i;

            @x1
            public a a() {
                return new a(this.a, this.i, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
            }

            @x1
            public C0253a b(@z1 String str) {
                this.b = str;
                return this;
            }

            @x1
            public C0253a c(@z1 ClientInfo clientInfo) {
                this.i = clientInfo;
                return this;
            }

            @x1
            public C0253a d(@z1 String str) {
                this.d = str;
                return this;
            }

            @x1
            public C0253a e(@z1 String str) {
                this.a = str;
                return this;
            }

            @x1
            public C0253a f(@z1 String str) {
                this.h = str;
                return this;
            }

            @x1
            public C0253a g(@z1 String str) {
                this.g = str;
                return this;
            }

            @x1
            public C0253a h(@z1 String str) {
                this.e = str;
                return this;
            }

            @x1
            public C0253a i(@z1 String str) {
                this.f = str;
                return this;
            }

            @x1
            public C0253a j(@z1 String str) {
                this.c = str;
                return this;
            }
        }

        public a(@z1 String str, @z1 ClientInfo clientInfo, @z1 String str2, @z1 String str3, @z1 String str4, @z1 String str5, @z1 String str6, @z1 String str7, @z1 String str8) {
            this.a = str;
            this.b = clientInfo;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
        }
    }

    /* compiled from: InternalReporting.java */
    /* loaded from: classes.dex */
    public static class b {
        @z1
        public final String a;
        public final double b;
        @z1
        public final String c;
        @z1
        public final String d;
        @z1
        private final ClientInfo e;
        @z1
        public final String f;

        /* compiled from: InternalReporting.java */
        /* loaded from: classes.dex */
        public static class a {
            @z1
            private String a;
            @z1
            private String b;
            private double c;
            @z1
            private String d;
            @z1
            private String e;
            @z1
            private ClientInfo f;

            @x1
            public b a() {
                return new b(this.a, this.b, this.c, this.d, this.e, this.f);
            }

            @x1
            public a b(@z1 ClientInfo clientInfo) {
                this.f = clientInfo;
                return this;
            }

            @x1
            public a c(@z1 String str) {
                this.a = str;
                return this;
            }

            @x1
            public a d(@z1 String str) {
                this.d = str;
                return this;
            }

            @x1
            public a e(@z1 String str) {
                this.e = str;
                return this;
            }

            @x1
            public a f(double d) {
                this.c = d;
                return this;
            }

            @x1
            public a g(@z1 String str) {
                this.b = str;
                return this;
            }
        }

        public b(@z1 String str, @z1 String str2, double d, @z1 String str3, @z1 String str4, @z1 ClientInfo clientInfo) {
            this.f = str;
            this.a = str2;
            this.b = d;
            this.c = str3;
            this.d = str4;
            this.e = clientInfo;
        }
    }

    /* compiled from: InternalReporting.java */
    /* loaded from: classes.dex */
    public static class c extends w91 {
        @x1
        public static final String a = "internal";
        @x1
        public static final String b = "internal_extra_action";
        @x1
        public static final String c = "internal_extra_error_code";
        @x1
        public static final String d = "internal_extra_data";
        @z1
        private Context e;
        @z1
        private x31 f;
        @z1
        public cr0 g;

        @x1
        private er0 f(@x1 ClientInfo clientInfo) {
            Context context = (Context) r81.f(this.e);
            x31 x31Var = (x31) r81.f(this.f);
            return new fr0().d(clientInfo).e(new a31(x31Var, clientInfo.getCarrierId())).m(new w11(x31Var, clientInfo.getCarrierId())).b("").h("").n(((cr0) r81.f(this.g)).a(context, clientInfo)).j(new ot0(context, new f31(x31Var))).i(context).l(new PartnerCelpher(context)).c();
        }

        private dq0<Boolean> g(v91 v91Var) {
            b bVar = (b) new Gson().n(String.valueOf(v91Var.c().get(d)), b.class);
            if (bVar != null && bVar.e != null) {
                er0 f = f(bVar.e);
                boolean isEmpty = TextUtils.isEmpty(bVar.c);
                String valueOf = String.valueOf(v91Var.c().get(d.a.f));
                String valueOf2 = String.valueOf(v91Var.c().get("app_version"));
                String str = bVar.f;
                String str2 = str == null ? "" : str;
                String str3 = bVar.a;
                return f.e(valueOf, valueOf2, u31.b, str2, str3 == null ? "" : str3, str3 == null ? "" : str3, isEmpty, String.valueOf(Math.round(bVar.b))).q(dy0.a);
            }
            return dq0.D(Boolean.TRUE);
        }

        private dq0<Boolean> h(@x1 v91 v91Var) {
            a aVar = (a) new Gson().n(String.valueOf(v91Var.c().get(d)), a.class);
            if (aVar.b != null) {
                String str = aVar.a;
                String simpleName = str == null ? "" : str.getClass().getSimpleName();
                Long l = (Long) v91Var.c().get(c);
                er0 f = f(aVar.b);
                String valueOf = String.valueOf(v91Var.c().get(d.a.f));
                String valueOf2 = String.valueOf(v91Var.c().get("app_version"));
                String a2 = v91Var.a();
                long longValue = l == null ? 0L : l.longValue();
                long longValue2 = l != null ? l.longValue() : 0L;
                String str2 = aVar.c;
                if (str2 == null) {
                    str2 = "";
                }
                String str3 = aVar.d;
                String str4 = str3 == null ? "" : str3;
                String str5 = aVar.e;
                String str6 = str5 == null ? "" : str5;
                String valueOf3 = String.valueOf(v91Var.c().get(xu0.f.E));
                String str7 = aVar.i;
                if (str7 == null) {
                    str7 = "";
                }
                return f.r(valueOf, valueOf2, "3.5.0", "", a2, simpleName, longValue, longValue2, 100L, simpleName, str2, str4, str6, "", valueOf3, "", str7).q(ey0.a);
            }
            return dq0.D(Boolean.TRUE);
        }

        @Override // com.p7700g.p99005.z91
        public void a(@x1 Context context, @x1 String str, @x1 a91 a91Var, @z1 String str2, @x1 fr5 fr5Var) {
            this.e = context;
            this.f = (x31) i61.a().d(x31.class);
            this.g = (cr0) i61.a().d(cr0.class);
        }

        @Override // com.p7700g.p99005.z91
        public boolean b(@x1 t91 t91Var, @x1 List<String> list, @x1 List<v91> list2) {
            for (v91 v91Var : list2) {
                try {
                    dq0<Boolean> D = dq0.D(Boolean.FALSE);
                    if ("perf".equals(v91Var.a())) {
                        D = g(v91Var);
                    } else if (u31.d.equals(v91Var.a())) {
                        D = h(v91Var);
                    }
                    D.Y();
                    if (D.F() == Boolean.TRUE) {
                        list.add(v91Var.b());
                    }
                } catch (Throwable th) {
                    u31.a.f(th);
                }
            }
            return true;
        }

        @Override // com.p7700g.p99005.z91
        public void c(@x1 Context context) {
        }

        @Override // com.p7700g.p99005.z91
        @x1
        public String getKey() {
            return a;
        }
    }

    public u31(@x1 Context context, @x1 e91 e91Var, @x1 x31 x31Var) {
        this.e = context.getApplicationContext();
        this.f = x31Var;
        this.g = e91Var;
    }

    private static double b(@x1 String str) {
        try {
            return Inet4Address.getByName(str).isReachable(1000) ? ((float) (System.currentTimeMillis() - System.currentTimeMillis())) / 1000.0f : zg2.s;
        } catch (Throwable th) {
            a.f(th);
            return zg2.s;
        }
    }

    private /* synthetic */ Object c(d51 d51Var, gc1 gc1Var) throws Exception {
        List<km1> p = d51Var.e().p();
        ArrayList arrayList = new ArrayList();
        for (km1 km1Var : p) {
            arrayList.add(km1Var.d());
        }
        String join = TextUtils.join(",", arrayList);
        ft0 f = d51Var.f();
        k(d, new a.C0253a().c(d51Var.c()).b(f == null ? "" : f.d()).d(d51Var.g().getCountry()).j(join).e(gc1Var.toTrackerName()).a());
        return null;
    }

    public static /* synthetic */ void e(Bundle bundle) {
    }

    public static /* synthetic */ void f(Bundle bundle) {
    }

    private /* synthetic */ Object g(lm1 lm1Var, String str, ft0 ft0Var, ClientInfo clientInfo) throws Exception {
        List<km1> p = lm1Var.p();
        ArrayList arrayList = new ArrayList();
        for (km1 km1Var : p) {
            arrayList.add(km1Var.d());
        }
        String join = TextUtils.join(",", arrayList);
        Gson gson = new Gson();
        if (i(str, join)) {
            String d2 = ft0Var == null ? "" : ft0Var.d();
            if (TextUtils.isEmpty(d2)) {
                d2 = b81.f();
            }
            Bundle bundle = new Bundle();
            b a2 = new b.a().c(d2).g(join).f(Math.round(b(join))).b(clientInfo).d(str).e(new Gson().z(ft0Var)).a();
            bundle.putString(c.b, b);
            bundle.putString(c.d, gson.z(a2));
            this.g.i("perf", bundle, c.a, fy0.a);
            m(str, d2);
            return null;
        }
        return null;
    }

    private boolean i(@x1 String str, @x1 String str2) {
        return Math.abs(System.currentTimeMillis() - this.f.a(n(str, str2), 0L)) > o();
    }

    private void k(@x1 String str, @x1 a aVar) {
        Gson gson = new Gson();
        Bundle bundle = new Bundle();
        bundle.putString(c.b, str);
        bundle.putString(c.d, gson.z(aVar));
        bundle.putLong(c.c, 0);
        this.g.i(str, bundle, c.a, cy0.a);
    }

    private void m(@x1 String str, @x1 String str2) {
        this.f.c().c(n(str, str2), System.currentTimeMillis()).a();
    }

    @x1
    private String n(@x1 String str, @x1 String str2) {
        return wo1.v("internal_test_", str, "_", str2);
    }

    private long o() {
        return TimeUnit.HOURS.toMillis(24L);
    }

    public /* synthetic */ Object d(d51 d51Var, gc1 gc1Var) {
        c(d51Var, gc1Var);
        return null;
    }

    public /* synthetic */ Object h(lm1 lm1Var, String str, ft0 ft0Var, ClientInfo clientInfo) {
        g(lm1Var, str, ft0Var, clientInfo);
        return null;
    }

    public void j(@x1 final d51 d51Var, @x1 final gc1 gc1Var, @x1 Executor executor) {
        dq0.e(new Callable() { // from class: com.p7700g.p99005.gy0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                u31.this.d(d51Var, gc1Var);
                return null;
            }
        }, executor);
    }

    public void l(@x1 final String str, @z1 final ft0 ft0Var, @x1 final lm1 lm1Var, @x1 final ClientInfo clientInfo, @x1 Executor executor) {
        dq0.e(new Callable() { // from class: com.p7700g.p99005.hy0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                u31.this.h(lm1Var, str, ft0Var, clientInfo);
                return null;
            }
        }, executor);
    }
}