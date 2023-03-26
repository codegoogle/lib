package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.sdk.g.d;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class p implements m {
    private final com.ironsource.environment.e.a s;
    public String t;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ com.ironsource.sdk.j.a.c s;
        private /* synthetic */ com.ironsource.sdk.g.c t;

        public a(com.ironsource.sdk.j.a.c cVar, com.ironsource.sdk.g.c cVar2) {
            this.s = cVar;
            this.t = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.b(this.t.b, p.this.t);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        private /* synthetic */ com.ironsource.sdk.j.a.c s;
        private /* synthetic */ JSONObject t;

        public b(com.ironsource.sdk.j.a.c cVar, JSONObject jSONObject) {
            this.s = cVar;
            this.t = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.c(this.t.optString("demandSourceName"), p.this.t);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        private /* synthetic */ com.ironsource.sdk.j.e s;

        public c(com.ironsource.sdk.j.e eVar) {
            this.s = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.onOfferwallInitFail(p.this.t);
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        private /* synthetic */ com.ironsource.sdk.j.a.c s;
        private /* synthetic */ com.ironsource.sdk.g.c t;

        public d(com.ironsource.sdk.j.a.c cVar, com.ironsource.sdk.g.c cVar2) {
            this.s = cVar;
            this.t = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.c(this.t.b, p.this.t);
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        private /* synthetic */ com.ironsource.sdk.j.a.b s;
        private /* synthetic */ Map t;

        public e(com.ironsource.sdk.j.a.b bVar, Map map) {
            this.s = bVar;
            this.t = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.d((String) this.t.get("demandSourceName"), p.this.t);
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        private /* synthetic */ com.ironsource.sdk.j.e s;

        public f(com.ironsource.sdk.j.e eVar) {
            this.s = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.onOWShowFail(p.this.t);
            this.s.onOfferwallInitFail(p.this.t);
        }
    }

    /* loaded from: classes3.dex */
    public class g implements Runnable {
        private /* synthetic */ com.ironsource.sdk.j.e s;

        public g(com.ironsource.sdk.j.e eVar) {
            this.s = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.onGetOWCreditsFailed(p.this.t);
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Runnable {
        private /* synthetic */ com.ironsource.sdk.j.a.d s;
        private /* synthetic */ com.ironsource.sdk.g.c t;

        public h(com.ironsource.sdk.j.a.d dVar, com.ironsource.sdk.g.c cVar) {
            this.s = dVar;
            this.t = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.a(d.e.RewardedVideo, this.t.b, p.this.t);
        }
    }

    /* loaded from: classes3.dex */
    public class i implements Runnable {
        private /* synthetic */ com.ironsource.sdk.j.a.d s;
        private /* synthetic */ JSONObject t;

        public i(com.ironsource.sdk.j.a.d dVar, JSONObject jSONObject) {
            this.s = dVar;
            this.t = jSONObject;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.a(this.t.optString("demandSourceName"), p.this.t);
        }
    }

    /* loaded from: classes3.dex */
    public class j implements Runnable {
        private /* synthetic */ com.ironsource.sdk.j.a.c s;
        private /* synthetic */ com.ironsource.sdk.g.c t;

        public j(com.ironsource.sdk.j.a.c cVar, com.ironsource.sdk.g.c cVar2) {
            this.s = cVar;
            this.t = cVar2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.a(d.e.Interstitial, this.t.b, p.this.t);
        }
    }

    /* loaded from: classes3.dex */
    public class k implements Runnable {
        private /* synthetic */ com.ironsource.sdk.j.a.c s;
        private /* synthetic */ String t;

        public k(com.ironsource.sdk.j.a.c cVar, String str) {
            this.s = cVar;
            this.t = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.s.b(this.t, p.this.t);
        }
    }

    public p(String str, com.ironsource.environment.e.a aVar) {
        this.t = "";
        this.s = aVar;
        this.t = str;
    }

    private void b(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.s;
        if (aVar != null) {
            aVar.c(runnable);
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Context context) {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.b bVar) {
        if (bVar != null) {
            b(new e(bVar, map));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        if (cVar2 != null) {
            b(new a(cVar2, cVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, com.ironsource.sdk.j.a.c cVar) {
        if (cVar != null) {
            b(new k(cVar, str));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
        if (bVar != null) {
            bVar.a(d.e.Banner, cVar.b, this.t);
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
        if (cVar2 != null) {
            b(new j(cVar2, cVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.d dVar) {
        if (dVar != null) {
            b(new h(dVar, cVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        if (eVar != null) {
            b(new g(eVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        if (eVar != null) {
            b(new c(eVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        if (eVar != null) {
            b(new f(eVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject) {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.c cVar) {
        if (cVar != null) {
            b(new b(cVar, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.d dVar) {
        if (dVar != null) {
            b(new i(dVar, jSONObject));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(Context context) {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        if (cVar2 != null) {
            b(new d(cVar2, cVar));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final d.c c() {
        return d.c.Native;
    }

    @Override // com.ironsource.sdk.controller.m
    public final boolean c(String str) {
        return false;
    }

    @Override // com.ironsource.sdk.controller.m
    public final void d() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void destroy() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void e() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void f() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void g() {
    }

    @Override // com.ironsource.sdk.controller.m
    public final void h() {
    }
}