package com.ironsource.sdk.controller;

import android.content.Context;
import android.os.CountDownTimer;
import android.util.Log;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.controller.x;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.p7700g.p99005.xe3;
import com.p7700g.p99005.ze3;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class g implements xe3, com.ironsource.sdk.controller.m {
    public com.ironsource.sdk.controller.m a;
    private CountDownTimer u;
    private final com.ironsource.environment.e.a x;
    private final String s = g.class.getSimpleName();
    private d.b t = d.b.None;
    private final com.ironsource.sdk.controller.b v = new com.ironsource.sdk.controller.b("NativeCommandExecutor");
    private final com.ironsource.sdk.controller.b w = new com.ironsource.sdk.controller.b("ControllerCommandsExecutor");

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.a != null) {
                g.this.a.destroy();
                g.this.a = null;
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b extends CountDownTimer {
        public b(long j, long j2) {
            super(200000L, 1000L);
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            Logger.i(g.this.s, "Global Controller Timer Finish");
            g.this.g("controller html - download timeout");
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            String str = g.this.s;
            Logger.i(str, "Global Controller Timer Tick " + j);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            g.this.b();
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ String t;
        private /* synthetic */ Map u;
        private /* synthetic */ com.ironsource.sdk.j.e v;

        public d(String str, String str2, Map map, com.ironsource.sdk.j.e eVar) {
            this.s = str;
            this.t = str2;
            this.u = map;
            this.v = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.a != null) {
                g.this.a.a(this.s, this.t, this.u, this.v);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        private /* synthetic */ Map s;
        private /* synthetic */ com.ironsource.sdk.j.e t;

        public e(Map map, com.ironsource.sdk.j.e eVar) {
            this.s = map;
            this.t = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.a != null) {
                g.this.a.a(this.s, this.t);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ String t;
        private /* synthetic */ com.ironsource.sdk.j.e u;

        public f(String str, String str2, com.ironsource.sdk.j.e eVar) {
            this.s = str;
            this.t = str2;
            this.u = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.a != null) {
                g.this.a.a(this.s, this.t, this.u);
            }
        }
    }

    /* renamed from: com.ironsource.sdk.controller.g$g  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0124g implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ String t;
        private /* synthetic */ com.ironsource.sdk.g.c u;
        private /* synthetic */ com.ironsource.sdk.j.a.d v;

        public RunnableC0124g(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.d dVar) {
            this.s = str;
            this.t = str2;
            this.u = cVar;
            this.v = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.a != null) {
                g.this.a.a(this.s, this.t, this.u, this.v);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Runnable {
        private /* synthetic */ JSONObject s;
        private /* synthetic */ com.ironsource.sdk.j.a.d t;

        public h(JSONObject jSONObject, com.ironsource.sdk.j.a.d dVar) {
            this.s = jSONObject;
            this.t = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.a != null) {
                g.this.a.a(this.s, this.t);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class i implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ String t;
        private /* synthetic */ com.ironsource.sdk.g.c u;
        private /* synthetic */ com.ironsource.sdk.j.a.c v;

        public i(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
            this.s = str;
            this.t = str2;
            this.u = cVar;
            this.v = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.a != null) {
                g.this.a.a(this.s, this.t, this.u, this.v);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class j implements Runnable {
        private /* synthetic */ Context s;
        private /* synthetic */ com.ironsource.sdk.controller.c t;
        private /* synthetic */ com.ironsource.sdk.service.d u;
        private /* synthetic */ com.ironsource.sdk.controller.j v;

        public j(Context context, com.ironsource.sdk.controller.c cVar, com.ironsource.sdk.service.d dVar, com.ironsource.sdk.controller.j jVar) {
            this.s = context;
            this.t = cVar;
            this.u = dVar;
            this.v = jVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                g gVar = g.this;
                gVar.a = g.c(gVar, this.s, this.t, this.u, this.v);
                g.this.a.h();
            } catch (Exception e) {
                g.this.g(Log.getStackTraceString(e));
            }
        }
    }

    /* loaded from: classes3.dex */
    public class k implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ com.ironsource.sdk.j.a.c t;

        public k(String str, com.ironsource.sdk.j.a.c cVar) {
            this.s = str;
            this.t = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.a != null) {
                g.this.a.a(this.s, this.t);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class l implements Runnable {
        private /* synthetic */ com.ironsource.sdk.g.c s;
        private /* synthetic */ Map t;
        private /* synthetic */ com.ironsource.sdk.j.a.c u;

        public l(com.ironsource.sdk.g.c cVar, Map map, com.ironsource.sdk.j.a.c cVar2) {
            this.s = cVar;
            this.t = map;
            this.u = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.ironsource.sdk.a.a a = new com.ironsource.sdk.a.a().a("demandsourcename", this.s.a).a("producttype", com.ironsource.sdk.a.e.a(this.s, d.e.Interstitial)).a("isbiddinginstance", Boolean.valueOf(com.ironsource.sdk.a.e.a(this.s)));
            com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.a;
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.i, a.a("custom_c", Long.valueOf(com.ironsource.sdk.service.a.c(this.s.b))).a);
            if (g.this.a != null) {
                g.this.a.a(this.s, this.t, this.u);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class m implements Runnable {
        private /* synthetic */ JSONObject s;
        private /* synthetic */ com.ironsource.sdk.j.a.c t;

        public m(JSONObject jSONObject, com.ironsource.sdk.j.a.c cVar) {
            this.s = jSONObject;
            this.t = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.a != null) {
                g.this.a.a(this.s, this.t);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class n implements Runnable {
        private /* synthetic */ com.ironsource.sdk.g.c s;
        private /* synthetic */ Map t;
        private /* synthetic */ com.ironsource.sdk.j.a.c u;

        public n(com.ironsource.sdk.g.c cVar, Map map, com.ironsource.sdk.j.a.c cVar2) {
            this.s = cVar;
            this.t = map;
            this.u = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.a != null) {
                g.this.a.b(this.s, this.t, this.u);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ String t;
        private /* synthetic */ com.ironsource.sdk.g.c u;
        private /* synthetic */ com.ironsource.sdk.j.a.b v;

        public o(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
            this.s = str;
            this.t = str2;
            this.u = cVar;
            this.v = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.a != null) {
                g.this.a.a(this.s, this.t, this.u, this.v);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.a != null) {
                g.this.a.d();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class q implements Runnable {
        private /* synthetic */ com.ironsource.sdk.g.c s;
        private /* synthetic */ Map t;
        private /* synthetic */ com.ironsource.sdk.j.a.b u;

        public q(com.ironsource.sdk.g.c cVar, Map map, com.ironsource.sdk.j.a.b bVar) {
            this.s = cVar;
            this.t = map;
            this.u = bVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.a != null) {
                g.this.a.a(this.s, this.t, this.u);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class r implements Runnable {
        private /* synthetic */ JSONObject s;

        public r(JSONObject jSONObject) {
            this.s = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (g.this.a != null) {
                g.this.a.a(this.s);
            }
        }
    }

    public g(Context context, com.ironsource.sdk.controller.c cVar, com.ironsource.sdk.service.d dVar, com.ironsource.sdk.controller.j jVar, com.ironsource.environment.e.a aVar) {
        this.x = aVar;
        IronSourceStorageUtils.getNetworkStorageDir(context);
        f(new j(context, cVar, dVar, jVar));
        this.u = new b(200000L, 1000L).start();
    }

    public static /* synthetic */ x c(g gVar, Context context, com.ironsource.sdk.controller.c cVar, com.ironsource.sdk.service.d dVar, com.ironsource.sdk.controller.j jVar) {
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.b);
        x xVar = new x(context, jVar, cVar, gVar, gVar.x);
        com.ironsource.sdk.h.b bVar = new com.ironsource.sdk.h.b(context, xVar.r(), new com.ironsource.sdk.h.a(com.ironsource.environment.e.a.a()), new com.ironsource.sdk.h.d(xVar.r().b));
        xVar.C0 = new v(context, dVar);
        xVar.A0 = new com.ironsource.sdk.controller.q(context);
        xVar.B0 = new com.ironsource.sdk.controller.r(context);
        xVar.D0 = new com.ironsource.sdk.controller.k(context);
        com.ironsource.sdk.controller.a aVar = new com.ironsource.sdk.controller.a(cVar);
        xVar.E0 = aVar;
        if (xVar.G0 == null) {
            xVar.G0 = new x.b();
        }
        aVar.a = xVar.G0;
        xVar.F0 = new ze3(xVar.r().b, bVar);
        return xVar;
    }

    private void f(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.x;
        if (aVar != null) {
            aVar.a(runnable);
        } else {
            Logger.e(this.s, "mThreadManager = null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(String str) {
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.c, new com.ironsource.sdk.a.a().a("callfailreason", str).a);
        this.a = new com.ironsource.sdk.controller.p(str, this.x);
        this.v.a();
        this.v.b();
        com.ironsource.environment.e.a aVar = this.x;
        if (aVar != null) {
            aVar.c(new c());
        }
    }

    private boolean i() {
        return d.b.Ready.equals(this.t);
    }

    @Override // com.p7700g.p99005.xe3
    public final void a() {
        this.t = d.b.Loaded;
        this.v.a();
        this.v.b();
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Context context) {
        com.ironsource.sdk.controller.m mVar;
        if (!i() || (mVar = this.a) == null) {
            return;
        }
        mVar.a(context);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.b bVar) {
        this.w.a(new q(cVar, map, bVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        this.w.a(new l(cVar, map, cVar2));
    }

    public final void a(Runnable runnable) {
        this.v.a(runnable);
    }

    @Override // com.p7700g.p99005.xe3
    public final void a(String str) {
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.l, new com.ironsource.sdk.a.a().a("callfailreason", str).a);
        com.ironsource.sdk.j.d initListener = IronSourceNetwork.getInitListener();
        if (initListener != null) {
            initListener.onFail(new com.ironsource.sdk.g.e(1001, str));
            IronSourceNetwork.setInitListener(null);
        }
        CountDownTimer countDownTimer = this.u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        g(str);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, com.ironsource.sdk.j.a.c cVar) {
        this.w.a(new k(str, cVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
        this.w.a(new o(str, str2, cVar, bVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
        this.w.a(new i(str, str2, cVar, cVar2));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.d dVar) {
        this.w.a(new RunnableC0124g(str, str2, cVar, dVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        this.w.a(new f(str, str2, eVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.w.a(new d(str, str2, map, eVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.w.a(new e(map, eVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject) {
        this.w.a(new r(jSONObject));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.c cVar) {
        this.w.a(new m(jSONObject, cVar));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.d dVar) {
        this.w.a(new h(jSONObject, dVar));
    }

    @Override // com.p7700g.p99005.xe3
    public final void b() {
        if (d.c.Web.equals(c())) {
            com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.d);
            com.ironsource.sdk.j.d initListener = IronSourceNetwork.getInitListener();
            if (initListener != null) {
                initListener.onSuccess();
                IronSourceNetwork.setInitListener(null);
            }
        }
        this.t = d.b.Ready;
        CountDownTimer countDownTimer = this.u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.w.a();
        this.w.b();
        com.ironsource.sdk.controller.m mVar = this.a;
        if (mVar != null) {
            mVar.g();
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(Context context) {
        com.ironsource.sdk.controller.m mVar;
        if (!i() || (mVar = this.a) == null) {
            return;
        }
        mVar.b(context);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        this.w.a(new n(cVar, map, cVar2));
    }

    @Override // com.p7700g.p99005.xe3
    public final void b(String str) {
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.u, new com.ironsource.sdk.a.a().a("generalmessage", str).a);
        CountDownTimer countDownTimer = this.u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        g(str);
    }

    @Override // com.ironsource.sdk.controller.m
    public final d.c c() {
        com.ironsource.sdk.controller.m mVar = this.a;
        return mVar != null ? mVar.c() : d.c.None;
    }

    @Override // com.ironsource.sdk.controller.m
    public final boolean c(String str) {
        if (this.a == null || !i()) {
            return false;
        }
        return this.a.c(str);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void d() {
        this.w.a(new p());
    }

    @Override // com.ironsource.sdk.controller.m
    public void destroy() {
        CountDownTimer countDownTimer = this.u;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.u = null;
        f(new a());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void e() {
        com.ironsource.sdk.controller.m mVar;
        if (!i() || (mVar = this.a) == null) {
            return;
        }
        mVar.e();
    }

    @Override // com.ironsource.sdk.controller.m
    public final void f() {
        com.ironsource.sdk.controller.m mVar;
        if (!i() || (mVar = this.a) == null) {
            return;
        }
        mVar.f();
    }

    @Override // com.ironsource.sdk.controller.m
    @Deprecated
    public final void g() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void h() {
    }
}