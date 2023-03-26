package com.anythink.core.common.k;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.m;
import com.anythink.core.common.b.o;
import com.anythink.core.common.e.ab;
import com.anythink.core.common.e.af;
import com.anythink.core.common.j.i;
import com.anythink.core.common.j.p;
import com.anythink.core.common.j.q;
import com.anythink.core.common.t;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class d {
    public static final String a = "d";
    public String b;
    public af c;
    public com.anythink.core.common.e.e d;
    public String e;
    public int f;
    public ATBaseAdAdapter g;
    public b h;
    public boolean i;
    public boolean j;
    public long k;
    public long l;
    public Runnable m;
    public Runnable n;
    public c o;
    public Boolean p;
    public int q;
    public String r;
    public boolean s;

    /* renamed from: com.anythink.core.common.k.d$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {
        public final /* synthetic */ ATBaseAdAdapter a;
        public final /* synthetic */ af b;
        public final /* synthetic */ Map c;

        public AnonymousClass1(ATBaseAdAdapter aTBaseAdAdapter, af afVar, Map map) {
            this.a = aTBaseAdAdapter;
            this.b = afVar;
            this.c = map;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = d.this.h;
            if (bVar != null) {
                bVar.a(this.a);
            }
            Context a = d.a(d.this);
            if (a == null) {
                if (d.this.h != null) {
                    com.anythink.core.common.k.a aVar = new com.anythink.core.common.k.a();
                    aVar.a = 0;
                    aVar.c = SystemClock.elapsedRealtime() - d.this.k;
                    aVar.b = ErrorCode.getErrorCode(ErrorCode.adapterInnerError, "", "Request Context is null! Please check the Ad init Context.");
                    d.this.a(this.a, aVar);
                    return;
                }
                return;
            }
            d.a(d.this, a, this.b, this.a);
            try {
                Map<String, Object> b = d.b(d.this);
                d.this.g = this.a;
                ATBaseAdAdapter aTBaseAdAdapter = this.a;
                Map<String, Object> map = this.c;
                d dVar = d.this;
                aTBaseAdAdapter.internalLoad(a, map, b, new a(dVar, dVar, aTBaseAdAdapter, (byte) 0));
                com.anythink.core.common.e.e trackingInfo = this.a.getTrackingInfo();
                trackingInfo.g(this.a.getNetworkPlacementId());
                b bVar2 = d.this.h;
                if (bVar2 != null) {
                    bVar2.b(trackingInfo);
                }
            } catch (Throwable th) {
                com.anythink.core.common.k.a aVar2 = new com.anythink.core.common.k.a();
                aVar2.a = 0;
                aVar2.c = SystemClock.elapsedRealtime() - d.this.k;
                aVar2.b = ErrorCode.getErrorCode(ErrorCode.adapterInnerError, "", th.getMessage());
                d.this.a(this.a, aVar2);
            }
        }
    }

    /* loaded from: classes2.dex */
    public class a implements ATCustomLoadListener {
        public ATBaseAdAdapter a;
        public d b;

        public /* synthetic */ a(d dVar, d dVar2, ATBaseAdAdapter aTBaseAdAdapter, byte b) {
            this(dVar2, aTBaseAdAdapter);
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdCacheLoaded(final BaseAd... baseAdArr) {
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.k.d.a.2
                @Override // java.lang.Runnable
                public final void run() {
                    ATBaseAdAdapter aTBaseAdAdapter;
                    synchronized (a.this) {
                        a aVar = a.this;
                        d dVar = aVar.b;
                        if (dVar != null && (aTBaseAdAdapter = aVar.a) != null) {
                            dVar.a(aTBaseAdAdapter, baseAdArr);
                            a aVar2 = a.this;
                            aVar2.b = null;
                            aVar2.a = null;
                        }
                    }
                }
            });
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdDataLoaded() {
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.k.d.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (a.this) {
                        a aVar = a.this;
                        d dVar = aVar.b;
                        if (dVar != null && aVar.a != null) {
                            dVar.q();
                        }
                    }
                }
            });
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdLoadError(final String str, final String str2) {
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.k.d.a.3
                @Override // java.lang.Runnable
                public final void run() {
                    synchronized (a.this) {
                        a aVar = a.this;
                        if (aVar.b != null && aVar.a != null) {
                            com.anythink.core.common.k.a aVar2 = new com.anythink.core.common.k.a();
                            aVar2.a = 0;
                            aVar2.b = ErrorCode.getErrorCode(ErrorCode.noADError, str, str2);
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            a aVar3 = a.this;
                            aVar2.c = elapsedRealtime - d.this.k;
                            aVar3.b.a(aVar3.a, aVar2);
                            a aVar4 = a.this;
                            aVar4.b = null;
                            aVar4.a = null;
                        }
                    }
                }
            });
        }

        private a(d dVar, ATBaseAdAdapter aTBaseAdAdapter) {
            this.b = dVar;
            this.a = aTBaseAdAdapter;
        }
    }

    public d(af afVar, int i) {
        this.c = afVar;
        this.q = i;
        this.e = afVar.t();
        this.r = this.e + "_" + hashCode();
    }

    private void i() {
        if (this.m != null) {
            m.a().b(this.m);
            this.m = null;
        }
    }

    private void j() {
        if (this.n != null) {
            m.a().b(this.n);
            this.n = null;
        }
    }

    private Map<String, Object> k() {
        c cVar = this.o;
        com.anythink.core.c.d dVar = cVar.e;
        String str = cVar.c;
        Map<String, Object> a2 = dVar.a(this.b, str, this.c);
        if (this.c.c() == 6) {
            a2.put("tp_info", com.anythink.core.common.j.g.a(this.o.a, str, this.b, dVar.S(), this.f).toString());
        }
        if (q.a(this.c) && this.o.e.al() == 1) {
            ab a3 = com.anythink.core.a.a.a(this.o.a).a(this.b);
            a2.put(g.k.k, Integer.valueOf(a3 != null ? a3.c : 0));
            synchronized (t.a().a(this.b)) {
                String a4 = t.a().a(this.b, this.c.c());
                if (!TextUtils.isEmpty(a4)) {
                    a2.put(g.k.l, a4);
                }
            }
        }
        return a2;
    }

    private Map<String, Object> l() {
        Map<String, Object> map = this.o.f;
        return map == null ? new HashMap(2) : map;
    }

    private Context m() {
        Context context = this.o.b.get();
        return context == null ? m.a().E() : context;
    }

    private boolean n() {
        return !this.s || this.j || s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o() {
        if (n()) {
            return;
        }
        this.i = true;
        String str = a;
        com.anythink.core.common.j.e.d(str, "network short timeout: " + this.e);
        b bVar = this.h;
        if (bVar != null) {
            bVar.a(this.r, this.e);
        }
    }

    private Runnable p() {
        return new Runnable() { // from class: com.anythink.core.common.k.d.2
            @Override // java.lang.Runnable
            public final void run() {
                com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.k.d.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.this.o();
                    }
                });
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q() {
        i();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.k;
        this.l = elapsedRealtime;
        com.anythink.core.common.e.e eVar = this.d;
        if (eVar != null) {
            eVar.c(elapsedRealtime);
        }
    }

    private void r() {
        this.g = null;
    }

    private boolean s() {
        return this.p != null;
    }

    private long t() {
        return this.k;
    }

    public final void b() {
        BaseAd baseAd;
        ATBaseAdAdapter aTBaseAdAdapter;
        boolean z;
        String str;
        this.s = true;
        com.anythink.core.common.e.b a2 = com.anythink.core.common.a.a().a(this.b, this.c);
        if (a2 != null && a2.a()) {
            b bVar = this.h;
            if (bVar != null) {
                bVar.b(a2.e().getTrackingInfo());
            }
            b(a2.e(), this.c);
            return;
        }
        com.anythink.core.common.e.m N = this.c.N();
        if (N == null || !N.s) {
            baseAd = null;
            aTBaseAdAdapter = null;
            z = false;
        } else {
            com.anythink.core.b.c.a aVar = N.r;
            if (aVar != null) {
                aTBaseAdAdapter = aVar.a();
                baseAd = aVar.b();
            } else {
                baseAd = null;
                aTBaseAdAdapter = null;
            }
            N.r = null;
            z = true;
        }
        if (aTBaseAdAdapter == null && !z) {
            aTBaseAdAdapter = i.a(this.c);
        }
        if (aTBaseAdAdapter == null) {
            if (this.h != null) {
                com.anythink.core.common.k.a aVar2 = new com.anythink.core.common.k.a();
                aVar2.a = 0;
                aVar2.c = z ? this.c.k() : 0L;
                String str2 = z ? ErrorCode.c2sBiddingCacheError : "2002";
                if (z) {
                    str = "";
                } else {
                    str = this.c.h() + " does not exist!";
                }
                aVar2.b = ErrorCode.getErrorCode(str2, "", str);
                a((ATBaseAdAdapter) null, aVar2);
                return;
            }
            return;
        }
        try {
            com.anythink.core.common.j.d.a(this.c.c(), aTBaseAdAdapter.getNetworkSDKVersion());
        } catch (Throwable unused) {
        }
        com.anythink.core.common.e.e a3 = p.a(aTBaseAdAdapter, this.d, this.c);
        this.d = a3;
        b bVar2 = this.h;
        if (bVar2 != null) {
            bVar2.a(a3);
        }
        long B = this.c.B();
        if (B != -1) {
            this.m = p();
            m.a().a(this.m, B);
        }
        long q = this.c.q();
        if (q != -1) {
            this.n = p();
            m.a().a(this.n, q);
        }
        this.k = SystemClock.elapsedRealtime();
        Context context = this.o.b.get();
        if (context != null && (context instanceof Activity)) {
            aTBaseAdAdapter.refreshActivityContext((Activity) context);
        }
        if (z) {
            if (baseAd != null) {
                a(aTBaseAdAdapter, baseAd);
                return;
            } else {
                a(aTBaseAdAdapter, new BaseAd[0]);
                return;
            }
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(aTBaseAdAdapter, this.c, k());
        if (TextUtils.equals(String.valueOf(this.o.e.S()), "2")) {
            m.a().a(anonymousClass1);
        } else {
            com.anythink.core.common.j.b.a.a().b(anonymousClass1);
        }
    }

    public final boolean e() {
        return (s() && this.i) ? false : true;
    }

    public final int f() {
        return this.q;
    }

    public final boolean g() {
        return this.i;
    }

    public final af h() {
        return this.c;
    }

    public final String a() {
        return this.r;
    }

    public final synchronized void c() {
        if (n()) {
            return;
        }
        this.p = Boolean.FALSE;
        this.j = true;
        com.anythink.core.common.k.a aVar = new com.anythink.core.common.k.a();
        aVar.a = 0;
        aVar.c = SystemClock.elapsedRealtime() - this.k;
        aVar.b = ErrorCode.getErrorCode(ErrorCode.timeOutError, "", "");
        a(this.g, aVar);
    }

    public final Boolean d() {
        return this.p;
    }

    public final void a(c cVar) {
        this.o = cVar;
        this.b = cVar.d;
        this.d = cVar.h;
        this.f = cVar.g;
    }

    public final void a(b bVar) {
        this.h = bVar;
    }

    private void a(long j) {
        if (j == -1) {
            return;
        }
        this.n = p();
        m.a().a(this.n, j);
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter, af afVar) {
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(aTBaseAdAdapter, afVar, k());
        if (TextUtils.equals(String.valueOf(this.o.e.S()), "2")) {
            m.a().a(anonymousClass1);
        } else {
            com.anythink.core.common.j.b.a.a().b(anonymousClass1);
        }
    }

    private void a(Context context, af afVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (com.anythink.core.c.a.ag()) {
            o a2 = o.a(m.a().e());
            try {
                if (a2.c(afVar.c()) || !aTBaseAdAdapter.setUserDataConsent(context, a2.c(), ATSDK.isEUTraffic(this.o.a))) {
                    return;
                }
                a2.b(afVar.c());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    private void a(ATBaseAdAdapter aTBaseAdAdapter) {
        this.g = aTBaseAdAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(ATBaseAdAdapter aTBaseAdAdapter, BaseAd... baseAdArr) {
        if (n()) {
            return;
        }
        af unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
        this.d.d((SystemClock.elapsedRealtime() - this.k) + (unitGroupInfo.l() == 2 ? unitGroupInfo.k() : 0L));
        i();
        j();
        this.g = null;
        this.p = Boolean.TRUE;
        if (this.i) {
            this.d.r = 1;
        }
        b bVar = this.h;
        if (bVar != null) {
            bVar.a(this.r, aTBaseAdAdapter, baseAdArr);
        }
    }

    public final synchronized void a(final ATBaseAdAdapter aTBaseAdAdapter, com.anythink.core.common.k.a aVar) {
        if (n()) {
            return;
        }
        i();
        j();
        if (aTBaseAdAdapter != null) {
            m.a().a(new Runnable() { // from class: com.anythink.core.common.k.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ATBaseAdAdapter aTBaseAdAdapter2 = aTBaseAdAdapter;
                        if (aTBaseAdAdapter2 != null) {
                            aTBaseAdAdapter2.destory();
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            });
        }
        this.g = null;
        this.p = Boolean.FALSE;
        boolean z = this.j;
        if (z) {
            this.d.r = 2;
        } else if (this.i) {
            this.d.r = 1;
        }
        if (!z) {
            com.anythink.core.common.c.a().a(this.e, System.currentTimeMillis());
        }
        aVar.d = this.d;
        aVar.e = this.c;
        b bVar = this.h;
        if (bVar != null) {
            bVar.a(this.r, aVar);
        }
    }

    private void b(long j) {
        if (j == -1) {
            return;
        }
        this.m = p();
        m.a().a(this.m, j);
    }

    private synchronized void b(ATBaseAdAdapter aTBaseAdAdapter, af afVar) {
        if (n()) {
            return;
        }
        i();
        j();
        this.g = null;
        this.p = Boolean.TRUE;
        if (this.i) {
            this.d.r = 1;
        }
        b bVar = this.h;
        if (bVar != null) {
            bVar.a(this.r, aTBaseAdAdapter, afVar);
        }
    }

    public static /* synthetic */ Context a(d dVar) {
        Context context = dVar.o.b.get();
        return context == null ? m.a().E() : context;
    }

    public static /* synthetic */ Map b(d dVar) {
        Map<String, Object> map = dVar.o.f;
        return map == null ? new HashMap(2) : map;
    }

    public static /* synthetic */ void a(d dVar, Context context, af afVar, ATBaseAdAdapter aTBaseAdAdapter) {
        if (com.anythink.core.c.a.ag()) {
            o a2 = o.a(m.a().e());
            try {
                if (a2.c(afVar.c()) || !aTBaseAdAdapter.setUserDataConsent(context, a2.c(), ATSDK.isEUTraffic(dVar.o.a))) {
                    return;
                }
                a2.b(afVar.c());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}