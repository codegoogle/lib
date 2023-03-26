package com.p7700g.p99005;

import com.p7700g.p99005.ar5;
import com.p7700g.p99005.fr5;
import com.p7700g.p99005.hr5;
import com.p7700g.p99005.jq5;
import com.p7700g.p99005.wq5;
import com.p7700g.p99005.zq5;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: OkHttpNetworkLayer.java */
/* loaded from: classes.dex */
public class bt0 implements at0 {
    @x1
    private static final kj1 b = kj1.b("OkHttpNetworkLayer");
    private static final int c = 10;
    private static final int d = 10;
    private static final int e = 20;
    @x1
    private final Map<String, Set<String>> f;
    private final boolean g;
    private final boolean h;
    @z1
    private final e i;
    @z1
    private nq5 l;
    private final boolean k = true;
    @x1
    private fr5 j = i();

    /* compiled from: OkHttpNetworkLayer.java */
    /* loaded from: classes.dex */
    public class a implements X509TrustManager {
        public a() {
            bt0.this = r1;
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    /* compiled from: OkHttpNetworkLayer.java */
    /* loaded from: classes.dex */
    public class b implements iq5 {
        public final /* synthetic */ eq0 a;
        public final /* synthetic */ hr5 b;

        public b(eq0 eq0Var, hr5 hr5Var) {
            bt0.this = r1;
            this.a = eq0Var;
            this.b = hr5Var;
        }

        @Override // com.p7700g.p99005.iq5
        public void a(@x1 hq5 hq5Var, @x1 jr5 jr5Var) throws IOException {
            kr5 v;
            if (jr5Var.s1()) {
                v = jr5Var.v();
                try {
                    String E = ((kr5) r81.f(v)).E();
                    this.a.g(new c(dr0.c(this.b, E), new mr0(E, jr5Var.E()), null));
                    if (v == null) {
                        return;
                    }
                } catch (Throwable th) {
                    try {
                        this.a.f(au0.e(th));
                        if (v == null) {
                            return;
                        }
                    } finally {
                        if (v != null) {
                            v.close();
                        }
                    }
                }
                v.close();
                return;
            }
            v = jr5Var.v();
            try {
                String E2 = ((kr5) r81.f(v)).E();
                this.a.g(new c(dr0.c(this.b, E2), new mr0(E2, jr5Var.E()), null));
                if (v == null) {
                }
            } catch (Throwable th2) {
                try {
                    this.a.f(au0.e(th2));
                } finally {
                    if (v != null) {
                        v.close();
                    }
                }
            }
        }

        @Override // com.p7700g.p99005.iq5
        public void b(@x1 hq5 hq5Var, @x1 IOException iOException) {
            this.a.f(au0.c(iOException));
        }
    }

    /* compiled from: OkHttpNetworkLayer.java */
    /* loaded from: classes.dex */
    public static class c {
        @x1
        public final dr0 a;
        @x1
        public final mr0 b;

        public /* synthetic */ c(dr0 dr0Var, mr0 mr0Var, a aVar) {
            this(dr0Var, mr0Var);
        }

        private c(@x1 dr0 dr0Var, @x1 mr0 mr0Var) {
            this.a = dr0Var;
            this.b = mr0Var;
        }
    }

    /* compiled from: OkHttpNetworkLayer.java */
    /* loaded from: classes.dex */
    public static final class d {
        @x1
        private Map<String, Set<String>> a = new HashMap();
        private boolean b;
        private boolean c;
        @z1
        private e d;
        @z1
        public nq5 e;

        @x1
        public d e(@x1 String str, @x1 Set<String> set) {
            this.a.put(str, set);
            return this;
        }

        @x1
        public d f(@x1 Map<String, Set<String>> map) {
            this.a.putAll(map);
            return this;
        }

        @x1
        public bt0 g() {
            return new bt0(this);
        }

        @x1
        public d h(@x1 e eVar) {
            this.d = eVar;
            return this;
        }

        @x1
        public d i() {
            this.c = true;
            return this;
        }

        @x1
        public d j() {
            this.b = true;
            return this;
        }

        @x1
        public d k(@x1 nq5 nq5Var) {
            this.e = nq5Var;
            return this;
        }
    }

    /* compiled from: OkHttpNetworkLayer.java */
    /* loaded from: classes.dex */
    public interface e {
        public static final e a = ws0.b;

        void b(@x1 fr5.a aVar);
    }

    /* compiled from: OkHttpNetworkLayer.java */
    /* loaded from: classes.dex */
    public static final class f implements ar5 {
        @Override // com.p7700g.p99005.ar5
        @x1
        public jr5 a(@x1 ar5.a aVar) throws IOException {
            try {
                hr5 x0 = aVar.x0();
                long nanoTime = System.nanoTime();
                bt0.b.l("Requesting %s", x0.q().Z());
                sv5 sv5Var = new sv5();
                ir5 f = x0.f();
                if (f != null) {
                    f.r(sv5Var);
                    bt0.b.l("Body %s", sv5Var.R0(Charset.defaultCharset()));
                }
                jr5 e = aVar.e(x0);
                try {
                    bt0.b.l("Response received for %s in %.1fms code: %s", e.T1().q(), Double.valueOf((System.nanoTime() - nanoTime) / 1000000.0d), Integer.valueOf(e.E()));
                } catch (Throwable th) {
                    bt0.b.f(th);
                }
                return e;
            } catch (IOException e2) {
                throw e2;
            } catch (Throwable th2) {
                throw new IOException(th2);
            }
        }
    }

    public bt0(@x1 d dVar) {
        this.i = dVar.d;
        this.f = dVar.a;
        this.g = dVar.b;
        this.l = dVar.e;
        this.h = dVar.c;
    }

    @x1
    private wq5 j(@x1 Map<String, String> map) {
        wq5.a aVar = new wq5.a();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                aVar.a(entry.getKey(), entry.getValue());
            }
        }
        return aVar.c();
    }

    @z1
    private zq5 l(@x1 zq5 zq5Var, @x1 String str, @x1 Map<String, String> map) {
        zq5.a I = zq5Var.I(str);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (I != null) {
                I.g(entry.getKey(), entry.getValue());
            }
        }
        if (I != null) {
            return I.h();
        }
        return null;
    }

    @x1
    private fr5.a m() {
        fr5.a aVar = new fr5.a();
        if (!this.f.isEmpty()) {
            jq5.a aVar2 = new jq5.a();
            for (String str : this.f.keySet()) {
                Set<String> set = this.f.get(str);
                if (set != null) {
                    Iterator<String> it = set.iterator();
                    while (it.hasNext()) {
                        aVar2.a(str, it.next());
                    }
                }
            }
            aVar.j(aVar2.b());
        }
        aVar.c(new f());
        aVar.l0(this.h);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        aVar.j0(10L, timeUnit);
        aVar.k(10L, timeUnit);
        aVar.h(20L, timeUnit);
        aVar.R0(10L, timeUnit);
        nq5 nq5Var = this.l;
        if (nq5Var != null) {
            aVar.m(nq5Var);
        }
        e eVar = this.i;
        if (eVar != null) {
            eVar.b(aVar);
        }
        return aVar;
    }

    private void o(@x1 hr5 hr5Var, @x1 final hr0<mr0> hr0Var) {
        final eq0 eq0Var = new eq0();
        yp0 yp0Var = new yp0();
        wp0 j = yp0Var.j();
        dq0 a2 = eq0Var.a();
        j.b(new Runnable() { // from class: com.p7700g.p99005.zs0
            @Override // java.lang.Runnable
            public final void run() {
                eq0.this.e();
            }
        });
        yp0Var.e(TimeUnit.SECONDS.toMillis(20L));
        this.j.a(hr5Var).D1(new b(eq0Var, hr5Var));
        a2.q(new aq0() { // from class: com.p7700g.p99005.ys0
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                bt0.p(hr0.this, dq0Var);
                return null;
            }
        });
    }

    public static /* synthetic */ Object p(hr0 hr0Var, dq0 dq0Var) throws Exception {
        if (dq0Var.H()) {
            hr0Var.a(au0.e(new CancellationException()));
            return null;
        } else if (dq0Var.E() != null) {
            Exception E = dq0Var.E();
            if (E instanceof au0) {
                hr0Var.a((au0) E);
                return null;
            }
            hr0Var.a(au0.e(E));
            return null;
        } else if (dq0Var.F() != null) {
            hr0Var.b(((c) dq0Var.F()).a, ((c) dq0Var.F()).b);
            return null;
        } else {
            return null;
        }
    }

    public static /* synthetic */ boolean q(String str, SSLSession sSLSession) {
        return true;
    }

    private void s(fr5.a aVar) throws NoSuchAlgorithmException, KeyManagementException {
        TrustManager[] trustManagerArr = {new a()};
        SSLContext sSLContext = SSLContext.getInstance("SSL");
        sSLContext.init(null, trustManagerArr, new SecureRandom());
        aVar.Q0(sSLContext.getSocketFactory(), (X509TrustManager) trustManagerArr[0]);
        aVar.Z(xs0.a);
    }

    @Override // com.p7700g.p99005.at0
    public void a(@x1 String str, @x1 String str2, @x1 Map<String, String> map, @x1 hr0<mr0> hr0Var) {
        try {
            zq5 k = k(str, str2, map);
            if (k != null) {
                o(new hr5.a().D(k).e(j(map)).b(), hr0Var);
            } else {
                hr0Var.a(new wt0());
            }
        } catch (Throwable unused) {
            hr0Var.a(new wt0());
        }
    }

    @Override // com.p7700g.p99005.at0
    public void c(@x1 String str, @x1 Map<String, String> map, @x1 hr0<mr0> hr0Var) {
        zq5 k = k(str, "", map);
        if (k != null) {
            o(new hr5.a().D(k).g().b(), hr0Var);
        } else {
            hr0Var.a(new wt0());
        }
    }

    @Override // com.p7700g.p99005.at0
    public void d() {
        n();
        if (this.k) {
            g();
        }
    }

    @Override // com.p7700g.p99005.at0
    public void e(@x1 String str, @x1 String str2, @x1 Map<String, String> map, @x1 hr0<mr0> hr0Var) {
        try {
            zq5 k = k(str, str2, new HashMap());
            if (k != null) {
                o(new hr5.a().D(k).s(j(map)).b(), hr0Var);
            } else {
                hr0Var.a(new wt0());
            }
        } catch (Throwable unused) {
            hr0Var.a(new wt0());
        }
    }

    @Override // com.p7700g.p99005.at0
    public void f(@x1 String str, @x1 String str2, @x1 Map<String, String> map, @x1 hr0<mr0> hr0Var) {
        try {
            zq5 k = k(str, str2, new HashMap());
            if (k != null) {
                o(new hr5.a().D(k).r(j(map)).b(), hr0Var);
            } else {
                hr0Var.a(new wt0());
            }
        } catch (Throwable unused) {
            hr0Var.a(new wt0());
        }
    }

    @Override // com.p7700g.p99005.at0
    public void g() {
        this.j = i();
    }

    @Override // com.p7700g.p99005.at0
    public void h(@x1 String str, @x1 String str2, @x1 Map<String, String> map, @x1 hr0<mr0> hr0Var) {
        try {
            zq5 k = k(str, str2, map);
            if (k != null) {
                o(new hr5.a().D(k).g().b(), hr0Var);
            } else {
                hr0Var.a(new wt0());
            }
        } catch (Throwable unused) {
            hr0Var.a(new wt0());
        }
    }

    @x1
    public fr5 i() {
        fr5.a m = m();
        if (this.g) {
            try {
                s(m);
            } catch (Throwable unused) {
            }
        }
        return m.f();
    }

    @z1
    public zq5 k(@x1 String str, @x1 String str2, @x1 Map<String, String> map) {
        zq5 J = zq5.J(str);
        if (J == null) {
            return null;
        }
        return l(J, str2, map);
    }

    public void n() {
        this.j.Z().b();
    }

    public void r(@x1 nq5 nq5Var) {
        this.l = nq5Var;
        g();
    }
}