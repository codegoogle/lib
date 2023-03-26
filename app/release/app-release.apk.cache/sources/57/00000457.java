package com.anythink.basead.d.a;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.anythink.basead.c.e;
import com.anythink.basead.c.f;
import com.anythink.core.common.a.g;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.j;
import com.anythink.core.common.e.k;
import com.anythink.core.common.e.z;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.d.n;
import com.anythink.expressad.out.TemplateBannerView;
import com.anythink.expressad.out.h;
import com.anythink.expressad.out.i;
import com.anythink.expressad.out.o;
import com.anythink.expressad.splash.d.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public final class b {
    private static b b = null;
    private static final String c = "https://img.toponad.com/sdk/app-permissions.html?key=";
    public ConcurrentHashMap<String, g> a = new ConcurrentHashMap<>(2);

    /* renamed from: com.anythink.basead.d.a.b$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ com.anythink.core.common.e.g a;
        public final /* synthetic */ j b;
        public final /* synthetic */ a c;
        public final /* synthetic */ d d;

        public AnonymousClass1(com.anythink.core.common.e.g gVar, j jVar, a aVar, d dVar) {
            this.a = gVar;
            this.b = jVar;
            this.c = aVar;
            this.d = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            c cVar = new c(m.a().e(), "", TextUtils.isEmpty(this.a.L()) ? this.b.c : this.a.L());
            cVar.b(this.b.m.n() == 0);
            int l = ((int) this.b.m.l()) / 1000;
            if (l <= 2) {
                cVar.a(2);
            } else if (l >= 10) {
                cVar.a(10);
            } else {
                cVar.a(l);
            }
            cVar.a(this.b.m.u() == 0);
            cVar.f();
            cVar.a(new com.anythink.expressad.out.d() { // from class: com.anythink.basead.d.a.b.1.1
                @Override // com.anythink.expressad.out.d
                public final void a() {
                    ConcurrentHashMap<String, g> concurrentHashMap = b.this.a;
                    c cVar2 = (c) concurrentHashMap.remove(AnonymousClass1.this.b.b + AnonymousClass1.this.b.a);
                    if (cVar2 != null) {
                        a aVar = AnonymousClass1.this.c;
                        if (aVar != null) {
                            aVar.a(cVar2);
                        }
                    } else if (AnonymousClass1.this.c != null) {
                        AnonymousClass1.this.c.a(f.a(f.l, "Resource download fail."));
                    }
                }

                @Override // com.anythink.expressad.out.d
                public final void b() {
                }

                @Override // com.anythink.expressad.out.d
                public final void a(String str) {
                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                    b.a(b.this, str, anonymousClass1.b, anonymousClass1.c);
                }
            });
            ConcurrentHashMap<String, g> concurrentHashMap = b.this.a;
            concurrentHashMap.put(this.b.b + this.b.a, cVar);
            cVar.a(this.d);
        }
    }

    /* renamed from: com.anythink.basead.d.a.b$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements h {
        public final /* synthetic */ j a;
        public final /* synthetic */ a b;

        public AnonymousClass2(j jVar, a aVar) {
            this.a = jVar;
            this.b = aVar;
        }

        @Override // com.anythink.expressad.out.h
        public final void a(com.anythink.expressad.foundation.d.c cVar) {
        }

        @Override // com.anythink.expressad.out.h
        public final void a(String str) {
            b.a(b.this, str, this.a, this.b);
        }

        @Override // com.anythink.expressad.out.h
        public final void b() {
        }

        @Override // com.anythink.expressad.out.h
        public final void c() {
        }

        @Override // com.anythink.expressad.out.h
        public final void d() {
        }

        @Override // com.anythink.expressad.out.h
        public final void e() {
        }

        @Override // com.anythink.expressad.out.h
        public final void f() {
        }

        @Override // com.anythink.expressad.out.h
        public final void a() {
            ConcurrentHashMap<String, g> concurrentHashMap = b.this.a;
            TemplateBannerView templateBannerView = (TemplateBannerView) concurrentHashMap.remove(this.a.b + this.a.a);
            if (templateBannerView != null) {
                a aVar = this.b;
                if (aVar != null) {
                    aVar.a(templateBannerView);
                }
            } else if (this.b != null) {
                this.b.a(f.a(f.l, "Resource download fail."));
            }
        }
    }

    /* renamed from: com.anythink.basead.d.a.b$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements com.anythink.expressad.videocommon.d.a {
        public final /* synthetic */ j a;
        public final /* synthetic */ a b;

        public AnonymousClass3(j jVar, a aVar) {
            this.a = jVar;
            this.b = aVar;
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void a() {
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void a(com.anythink.expressad.foundation.d.c cVar) {
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void a(String str) {
            b.a(b.this, str, this.a, this.b);
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void a(boolean z, String str, float f) {
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void b() {
            ConcurrentHashMap<String, g> concurrentHashMap = b.this.a;
            com.anythink.expressad.reward.b.a aVar = (com.anythink.expressad.reward.b.a) concurrentHashMap.remove(this.a.b + this.a.a);
            if (aVar != null && aVar.isReady()) {
                a aVar2 = this.b;
                if (aVar2 != null) {
                    aVar2.a(aVar);
                }
            } else if (this.b != null) {
                this.b.a(f.a(f.l, "Resource download fail."));
            }
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void b(String str) {
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void c() {
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void d() {
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void e() {
        }

        @Override // com.anythink.expressad.videocommon.d.a
        public final void f() {
        }
    }

    /* renamed from: com.anythink.basead.d.a.b$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements Runnable {
        public final /* synthetic */ com.anythink.core.common.e.g a;
        public final /* synthetic */ j b;
        public final /* synthetic */ a c;
        public final /* synthetic */ d d;

        public AnonymousClass4(com.anythink.core.common.e.g gVar, j jVar, a aVar, d dVar) {
            this.a = gVar;
            this.b = jVar;
            this.c = aVar;
            this.d = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.expressad.advanced.d.c cVar = new com.anythink.expressad.advanced.d.c("", TextUtils.isEmpty(this.a.L()) ? this.b.c : this.a.L(), m.a().e());
            cVar.a(new o() { // from class: com.anythink.basead.d.a.b.4.1
                @Override // com.anythink.expressad.out.o
                public final void a(com.anythink.expressad.foundation.d.c cVar2) {
                }

                @Override // com.anythink.expressad.out.o
                public final void a(String str) {
                    AnonymousClass4 anonymousClass4 = AnonymousClass4.this;
                    b.a(b.this, str, anonymousClass4.b, anonymousClass4.c);
                }

                @Override // com.anythink.expressad.out.o
                public final void b() {
                }

                @Override // com.anythink.expressad.out.o
                public final void c() {
                }

                @Override // com.anythink.expressad.out.o
                public final void d() {
                }

                @Override // com.anythink.expressad.out.o
                public final void e() {
                }

                @Override // com.anythink.expressad.out.o
                public final void f() {
                }

                @Override // com.anythink.expressad.out.o
                public final void a() {
                    ConcurrentHashMap<String, g> concurrentHashMap = b.this.a;
                    com.anythink.expressad.advanced.d.c cVar2 = (com.anythink.expressad.advanced.d.c) concurrentHashMap.remove(AnonymousClass4.this.b.b + AnonymousClass4.this.b.a);
                    if (cVar2 != null) {
                        a aVar = AnonymousClass4.this.c;
                        if (aVar != null) {
                            aVar.a(cVar2);
                        }
                    } else if (AnonymousClass4.this.c != null) {
                        AnonymousClass4.this.c.a(f.a(f.m, f.E));
                    }
                }
            });
            ConcurrentHashMap<String, g> concurrentHashMap = b.this.a;
            concurrentHashMap.put(this.b.b + this.b.a, cVar);
            cVar.a(this.d);
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a(e eVar);

        void a(g gVar);
    }

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (b == null) {
                b = new b();
            }
            bVar = b;
        }
        return bVar;
    }

    private void b(com.anythink.core.common.e.g gVar, j jVar, d dVar, a aVar) {
        m.a().a(new AnonymousClass1(gVar, jVar, aVar, dVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void c(com.anythink.core.common.e.g gVar, j jVar, d dVar, a aVar) {
        char c2;
        k kVar = jVar.m;
        int a2 = com.anythink.core.common.j.h.a(m.a().e(), 50.0f);
        int i = 2;
        if (kVar.b() > 0) {
            i = 5;
            a2 = kVar.b();
        } else {
            String p = kVar.p();
            p.hashCode();
            switch (p.hashCode()) {
                case -559799608:
                    if (p.equals(k.c)) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1507809854:
                    if (p.equals(k.b)) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1622564786:
                    if (p.equals(k.d)) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    a2 = com.anythink.core.common.j.h.a(m.a().e(), 250.0f);
                    break;
                case 1:
                case 2:
                    a2 = com.anythink.core.common.j.h.a(m.a().e(), 90.0f);
                    i = 1;
                    break;
                default:
                    i = 4;
                    break;
            }
        }
        TemplateBannerView templateBannerView = new TemplateBannerView(m.a().e());
        templateBannerView.init(new i(i, kVar.b()), "", TextUtils.isEmpty(gVar.L()) ? jVar.c : gVar.L());
        templateBannerView.setAllowShowCloseBtn(kVar.q() == 0);
        if (a2 > 0) {
            templateBannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, a2));
        }
        templateBannerView.setBannerAdListener(new AnonymousClass2(jVar, aVar));
        ConcurrentHashMap<String, g> concurrentHashMap = this.a;
        concurrentHashMap.put(jVar.b + jVar.a, templateBannerView);
        templateBannerView.load(dVar);
    }

    private void d(com.anythink.core.common.e.g gVar, j jVar, d dVar, a aVar) {
        com.anythink.expressad.reward.b.a aVar2 = new com.anythink.expressad.reward.b.a();
        String L = TextUtils.isEmpty(gVar.L()) ? jVar.c : gVar.L();
        int i = jVar.j;
        if (i == 1) {
            com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), L, false);
            aVar2.a(false);
        } else if (i == 3) {
            com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), L, true);
            aVar2.a(true);
        }
        aVar2.a(jVar.m.v() == 0 ? 1 : 2);
        aVar2.a("", L);
        if (jVar.j == 1) {
            com.anythink.expressad.videocommon.e.d a2 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), L, false);
            if (jVar.m.w() > 0) {
                a2.a(jVar.m.w());
                a2.l();
            }
        }
        aVar2.a(new AnonymousClass3(jVar, aVar));
        ConcurrentHashMap<String, g> concurrentHashMap = this.a;
        concurrentHashMap.put(jVar.b + jVar.a, aVar2);
        aVar2.a(dVar);
    }

    private void e(com.anythink.core.common.e.g gVar, j jVar, d dVar, a aVar) {
        m.a().a(new AnonymousClass4(gVar, jVar, aVar, dVar));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a(com.anythink.core.common.e.g gVar, j jVar, d dVar, a aVar) {
        char c2;
        if (!TextUtils.isEmpty(gVar.h())) {
            com.anythink.expressad.out.b.a = gVar.h();
        }
        if (com.anythink.expressad.foundation.b.a.b().d() == null) {
            com.anythink.expressad.foundation.b.a.b().a(m.a().e());
            com.anythink.expressad.e.a a2 = com.anythink.expressad.out.g.a();
            HashMap hashMap = new HashMap(3);
            hashMap.put(com.anythink.expressad.a.d, gVar.J());
            hashMap.put(com.anythink.expressad.a.e, gVar.K());
            a2.a(hashMap, m.a().e());
        }
        if (String.valueOf(jVar.j).equals("0")) {
            m.a().a(new AnonymousClass4(gVar, jVar, aVar, dVar));
            return;
        }
        if (String.valueOf(jVar.j).equals("2")) {
            k kVar = jVar.m;
            int a3 = com.anythink.core.common.j.h.a(m.a().e(), 50.0f);
            if (kVar.b() > 0) {
                r3 = 5;
                a3 = kVar.b();
            } else {
                String p = kVar.p();
                p.hashCode();
                switch (p.hashCode()) {
                    case -559799608:
                        if (p.equals(k.c)) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1507809854:
                        if (p.equals(k.b)) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1622564786:
                        if (p.equals(k.d)) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        a3 = com.anythink.core.common.j.h.a(m.a().e(), 250.0f);
                        break;
                    case 1:
                    case 2:
                        a3 = com.anythink.core.common.j.h.a(m.a().e(), 90.0f);
                        r3 = 1;
                        break;
                    default:
                        r3 = 4;
                        break;
                }
            }
            TemplateBannerView templateBannerView = new TemplateBannerView(m.a().e());
            templateBannerView.init(new i(r3, kVar.b()), "", TextUtils.isEmpty(gVar.L()) ? jVar.c : gVar.L());
            templateBannerView.setAllowShowCloseBtn(kVar.q() == 0);
            if (a3 > 0) {
                templateBannerView.setLayoutParams(new ViewGroup.LayoutParams(-1, a3));
            }
            templateBannerView.setBannerAdListener(new AnonymousClass2(jVar, aVar));
            ConcurrentHashMap<String, g> concurrentHashMap = this.a;
            concurrentHashMap.put(jVar.b + jVar.a, templateBannerView);
            templateBannerView.load(dVar);
        } else if (String.valueOf(jVar.j).equals("4")) {
            m.a().a(new AnonymousClass1(gVar, jVar, aVar, dVar));
        } else {
            com.anythink.expressad.reward.b.a aVar2 = new com.anythink.expressad.reward.b.a();
            String L = TextUtils.isEmpty(gVar.L()) ? jVar.c : gVar.L();
            int i = jVar.j;
            if (i == 1) {
                com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), L, false);
                aVar2.a(false);
            } else if (i == 3) {
                com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), L, true);
                aVar2.a(true);
            }
            aVar2.a(jVar.m.v() == 0 ? 1 : 2);
            aVar2.a("", L);
            if (jVar.j == 1) {
                com.anythink.expressad.videocommon.e.d a4 = com.anythink.expressad.videocommon.e.c.a().a(com.anythink.expressad.foundation.b.a.b().e(), L, false);
                if (jVar.m.w() > 0) {
                    a4.a(jVar.m.w());
                    a4.l();
                }
            }
            aVar2.a(new AnonymousClass3(jVar, aVar));
            ConcurrentHashMap<String, g> concurrentHashMap2 = this.a;
            concurrentHashMap2.put(jVar.b + jVar.a, aVar2);
            aVar2.a(dVar);
        }
    }

    private void a(String str, j jVar, a aVar) {
        ConcurrentHashMap<String, g> concurrentHashMap = this.a;
        concurrentHashMap.remove(jVar.b + jVar.a);
        if (aVar != null) {
            aVar.a(f.a(f.l, str));
        }
    }

    public static void a(com.anythink.core.common.e.g gVar, com.anythink.expressad.foundation.d.c cVar) {
        gVar.s(cVar.ba());
        gVar.j(cVar.bd());
        gVar.h(cVar.bb());
        gVar.i(cVar.bc());
        gVar.r(cVar.af());
        gVar.q(cVar.ah());
        z Q = gVar.Q();
        if (Q == null) {
            Q = new z();
            gVar.a(Q);
        }
        n J = cVar.J();
        if (J != null) {
            Q.b(J.a());
            Q.c(J.b());
            Q.d(J.c());
        }
        a((com.anythink.core.common.e.i) gVar, cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        if (r2 != 9) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static com.anythink.basead.a.c a(com.anythink.basead.a.c cVar, com.anythink.expressad.foundation.d.c cVar2) {
        com.anythink.expressad.foundation.d.a aG;
        k g = cVar.a().g();
        if (cVar.a().k().equals(cVar2.aZ())) {
            a(cVar.a(), cVar2);
            return cVar;
        }
        com.anythink.core.common.e.g gVar = new com.anythink.core.common.e.g();
        a(gVar, cVar2);
        gVar.f(cVar2.aZ());
        int P = cVar2.P();
        if (P != 0) {
            if (P == 1 || P == 2) {
                gVar.d(1);
            } else if (P != 3) {
                if (P != 4) {
                    if (P != 5) {
                        if (P != 8) {
                        }
                    }
                }
                gVar.d(3);
                aG = cVar2.aG();
                if (aG != null) {
                    gVar.H(aG.b());
                    gVar.u(aG.f());
                    gVar.v(aG.e());
                    gVar.w(aG.c());
                    gVar.x(aG.a());
                }
                com.anythink.basead.a.c cVar3 = new com.anythink.basead.a.c(m.a().e(), cVar.b(), gVar);
                gVar.a(g);
                return cVar3;
            }
            gVar.d(4);
            aG = cVar2.aG();
            if (aG != null) {
            }
            com.anythink.basead.a.c cVar32 = new com.anythink.basead.a.c(m.a().e(), cVar.b(), gVar);
            gVar.a(g);
            return cVar32;
        }
        gVar.d(2);
        aG = cVar2.aG();
        if (aG != null) {
        }
        com.anythink.basead.a.c cVar322 = new com.anythink.basead.a.c(m.a().e(), cVar.b(), gVar);
        gVar.a(g);
        return cVar322;
    }

    public static void a(com.anythink.core.common.e.i iVar, com.anythink.expressad.foundation.d.c cVar) {
        String[] l;
        com.anythink.core.common.e.g gVar = iVar instanceof com.anythink.core.common.e.g ? (com.anythink.core.common.e.g) iVar : null;
        if (iVar == null || cVar == null) {
            return;
        }
        iVar.r(cVar.af());
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.aj() + "&opdptype={opdptype}&apk_ptype={apk_ptype}");
        n J = cVar.J();
        if (J != null && (l = J.l()) != null) {
            for (String str : l) {
                arrayList.add(str);
            }
        }
        z Q = gVar.Q();
        if (Q == null) {
            Q = new z();
            gVar.a(Q);
        }
        Q.a((String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    public static /* synthetic */ void a(b bVar, String str, j jVar, a aVar) {
        ConcurrentHashMap<String, g> concurrentHashMap = bVar.a;
        concurrentHashMap.remove(jVar.b + jVar.a);
        if (aVar != null) {
            aVar.a(f.a(f.l, str));
        }
    }
}