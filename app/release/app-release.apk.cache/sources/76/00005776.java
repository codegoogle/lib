package com.p7700g.p99005;

import android.content.Context;
import android.os.Bundle;
import com.anchorfree.partner.api.ClientInfo;
import com.anchorfree.sdk.NotificationConfig;
import com.anchorfree.sdk.SessionConfig;
import com.anchorfree.sdk.UnifiedSDKConfig;
import com.anchorfree.vpnsdk.vpnservice.credentials.CredentialsContentProvider;
import com.google.gson.Gson;
import com.p7700g.p99005.d51;
import com.p7700g.p99005.i51;
import com.p7700g.p99005.ka1;
import com.p7700g.p99005.mg1;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: UnifiedSDKGlobal.java */
/* loaded from: classes.dex */
public class q51 {
    @x1
    private static final kj1 a = kj1.b("UnifiedSDK");
    @x1
    private static final Executor b = Executors.newSingleThreadExecutor();
    @x1
    public static final h41 c = new h41(dq0.c);
    @x1
    private final ra1 d;
    @x1
    public final List<db1> e;
    @x1
    public final List<cb1> f;
    @x1
    public final List<ab1> g;
    @x1
    public final h31 h;
    @x1
    public final kf1 i;
    @x1
    public final r41 j;
    @x1
    private final Context k;
    @x1
    public final o51 l;

    public q51(@x1 Context context) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.e = copyOnWriteArrayList;
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.f = copyOnWriteArrayList2;
        CopyOnWriteArrayList copyOnWriteArrayList3 = new CopyOnWriteArrayList();
        this.g = copyOnWriteArrayList3;
        this.k = context;
        x31 x31Var = (x31) i61.a().d(x31.class);
        o51 o51Var = (o51) i61.a().d(o51.class);
        this.l = o51Var;
        r41 r41Var = (r41) i61.a().d(r41.class);
        this.j = r41Var;
        h31 h31Var = (h31) i61.a().d(h31.class);
        this.h = h31Var;
        Gson gson = (Gson) i61.a().d(Gson.class);
        kf1 kf1Var = new kf1(gson, x31Var, o51Var, (h51) i61.a().d(h51.class), (pa1) i61.a().d(pa1.class), (hf1) i61.a().d(hf1.class), e(context, x31Var, gson));
        this.i = kf1Var;
        CredentialsContentProvider.l(kf1Var);
        ui1 ui1Var = r41Var.a;
        kj1 kj1Var = a;
        h41 h41Var = c;
        ui1Var.q(new m71(copyOnWriteArrayList, h31Var, kj1Var, h41Var));
        r41Var.a.p(new l71(copyOnWriteArrayList2, kj1Var, h41Var));
        r41Var.a.o(new k71(copyOnWriteArrayList3, kj1Var, h41Var));
        mg1.a.b(new i51(context, o51Var, h31Var, new i51.a() { // from class: com.p7700g.p99005.yu0
            @Override // com.p7700g.p99005.i51.a
            public final dq0 provide() {
                return q51.this.h();
            }
        }));
        if (wm1.d(context)) {
            e(context, x31Var, gson);
        }
        ra1 d = d((h61) i61.a().d(h61.class), gson, x31Var);
        this.d = d;
        kj1.k(d);
    }

    public static void A(boolean z) {
        g().l.E0(z);
    }

    public static void C(@x1 NotificationConfig notificationConfig) {
        g().l.G0(notificationConfig).q(g11.a);
    }

    public static void D(@x1 UnifiedSDKConfig.CallbackMode callbackMode) {
        c.a(p51.b(callbackMode));
    }

    public static void E(@x1 k81<? extends mg1.a> k81Var) {
        g().l.c(k81Var).q(l11.a);
    }

    public static void F(@x1 List<j51> list, final va1 va1Var) {
        g().l.H0(list).s(new aq0() { // from class: com.p7700g.p99005.o11
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                va1.this.complete();
                return null;
            }
        }, c);
    }

    private dq0<d51.a> a(@x1 final d51.a aVar) {
        return this.j.b().s(new aq0() { // from class: com.p7700g.p99005.p11
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                d51.a aVar2 = d51.a.this;
                q51.j(aVar2, dq0Var);
                return aVar2;
            }
        }, b);
    }

    private dq0<d51.a> b(@x1 final d51.a aVar) {
        return this.j.c().s(new aq0() { // from class: com.p7700g.p99005.n11
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                d51.a aVar2 = d51.a.this;
                q51.k(aVar2, dq0Var);
                return aVar2;
            }
        }, b);
    }

    private dq0<d51.a> c(@x1 final d51.a aVar) {
        return this.j.f().s(new aq0() { // from class: com.p7700g.p99005.k11
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                d51.a aVar2 = d51.a.this;
                q51.l(aVar2, dq0Var);
                return aVar2;
            }
        }, b);
    }

    @x1
    private ra1 d(@x1 h61 h61Var, @x1 Gson gson, @x1 x31 x31Var) {
        ra1 ra1Var = (ra1) p51.d(h61Var.b());
        return ra1Var != null ? ra1Var : new ka1(gson, x31Var);
    }

    @x1
    private o41 e(@x1 Context context, @x1 x31 x31Var, @x1 Gson gson) {
        new r51(context, new o21((k21) i61.a().d(k21.class), (me1) i61.a().d(me1.class), this.h, this.l, Executors.newSingleThreadExecutor()), this.h, this.l, new a41(context), Executors.newSingleThreadExecutor());
        return new o41(gson, (i41) i61.a().d(i41.class), x31Var, this.l, new d31(x31Var, new j31(), (u41) i61.a().d(u41.class), this.h, Executors.newSingleThreadExecutor()), Executors.newSingleThreadExecutor());
    }

    @x1
    public static Context f() {
        return (Context) r81.f(g().k);
    }

    @x1
    public static synchronized q51 g() {
        q51 q51Var;
        synchronized (q51.class) {
            q51Var = (q51) r81.f(x41.t);
        }
        return q51Var;
    }

    public static /* synthetic */ d51.a j(d51.a aVar, dq0 dq0Var) throws Exception {
        lm1 lm1Var = (lm1) dq0Var.F();
        if (lm1Var != null) {
            aVar.n(lm1Var);
        }
        return aVar;
    }

    public static /* synthetic */ d51.a k(d51.a aVar, dq0 dq0Var) throws Exception {
        h51 h51Var = new h51(kf1.e());
        fo1 fo1Var = (fo1) dq0Var.F();
        if (fo1Var != null) {
            Bundle bundle = fo1Var.w;
            g51 n = h51Var.n(bundle);
            ft0 b2 = h51Var.b(bundle);
            ClientInfo a2 = h51Var.a(bundle);
            aVar.l(n.e()).j(fo1Var.v).i(a2).h(a2.getCarrierId()).o(n.e().getTransport()).k(b2);
        } else {
            aVar.l(SessionConfig.empty()).j("").o("").k(null);
        }
        return aVar;
    }

    public static /* synthetic */ d51.a l(d51.a aVar, dq0 dq0Var) throws Exception {
        en1 en1Var = (en1) dq0Var.F();
        if (en1Var != null) {
            aVar.m(en1Var);
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ dq0 n(dq0 dq0Var) throws Exception {
        return c((d51.a) r81.f((d51.a) dq0Var.F()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ dq0 p(dq0 dq0Var) throws Exception {
        return b((d51.a) r81.f((d51.a) dq0Var.F()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ dq0 r(dq0 dq0Var) throws Exception {
        return a((d51.a) r81.f((d51.a) dq0Var.F()));
    }

    public static void x(boolean z) {
        g().l.B0(z);
    }

    public static void y(@x1 k81<? extends ka1.a> k81Var) {
        ra1 ra1Var = g().d;
        if (ra1Var instanceof ka1) {
            ((ka1) ra1Var).u(k81Var);
        }
    }

    public static void z(int i) {
        g().d.c(i);
    }

    public void B(@x1 String str) {
        g().l.z0(str);
    }

    @x1
    public dq0<d51> h() {
        return dq0.D(new d51.a()).u(new aq0() { // from class: com.p7700g.p99005.h11
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return q51.this.n(dq0Var);
            }
        }).u(new aq0() { // from class: com.p7700g.p99005.i11
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return q51.this.p(dq0Var);
            }
        }).u(new aq0() { // from class: com.p7700g.p99005.j11
            @Override // com.p7700g.p99005.aq0
            public final Object a(dq0 dq0Var) {
                return q51.this.r(dq0Var);
            }
        }).q(m11.a);
    }

    public void i(@x1 ua1<d51> ua1Var) {
        h().s(a21.a(ua1Var), c);
    }

    public void w(@x1 String str, @x1 ClientInfo clientInfo, @x1 UnifiedSDKConfig unifiedSDKConfig) {
        g().l.w0(str, clientInfo, unifiedSDKConfig);
    }
}