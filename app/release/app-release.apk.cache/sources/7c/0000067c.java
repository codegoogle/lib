package com.anythink.core.common;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATSDK;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.api.IATAdFilter;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.af;
import com.anythink.core.common.f;
import com.anythink.core.common.k;
import com.p7700g.p99005.zg2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class h {
    public int A;
    public int B;
    public ConcurrentHashMap<String, af> D;
    public af F;
    public Runnable J;
    public com.anythink.core.common.k.f L;
    public af N;
    public double O;
    public af Q;
    public List<af> R;
    public WeakReference<Context> b;
    public int c;
    public com.anythink.core.c.d e;
    public String f;
    public String g;
    public Map<String, Object> h;
    public com.anythink.core.common.e.e i;
    public j j;
    public com.anythink.core.common.b.b l;
    public boolean p;
    public boolean q;
    public List<af> t;
    public List<af> u;
    public List<af> v;
    public String x;
    public long z;
    private final String T = getClass().getSimpleName();
    public String d = "";
    public int k = 0;
    public boolean m = false;
    public boolean n = false;
    public boolean o = false;
    public boolean r = false;
    public boolean s = false;
    public Object C = new Object();
    public double E = -1.0d;
    public Runnable I = null;
    public Runnable M = new Runnable() { // from class: com.anythink.core.common.h.1
        @Override // java.lang.Runnable
        public final void run() {
            com.anythink.core.common.j.b.a.a().b(new Runnable() { // from class: com.anythink.core.common.h.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    h.this.b();
                }
            });
        }
    };
    public boolean P = false;
    public boolean S = false;
    public Context a = com.anythink.core.common.b.m.a().e();
    public List<com.anythink.core.common.k.e> w = Collections.synchronizedList(new ArrayList(2));
    public AdError y = ErrorCode.getErrorCode(ErrorCode.noADError, "", "");
    public Map<String, com.anythink.core.common.k.d> G = new ConcurrentHashMap();
    public List<af> H = Collections.synchronizedList(new ArrayList(3));
    public com.anythink.core.common.k.h K = new com.anythink.core.common.k.h();

    /* renamed from: com.anythink.core.common.h$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements Runnable {
        public AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h.this.I = null;
            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.common.h.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    h.this.j();
                }
            });
        }
    }

    /* renamed from: com.anythink.core.common.h$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements Runnable {
        public AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            h.this.o();
        }
    }

    /* loaded from: classes2.dex */
    public static class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
    }

    public h(Context context) {
        this.b = new WeakReference<>(context);
    }

    private synchronized boolean A() {
        boolean z;
        if (this.t.size() == 0) {
            z = this.u.size() == 0;
        }
        return z;
    }

    private boolean B() {
        return (this.e.e() != 1 || this.k == 8 || t.a().f(this.g)) ? false : true;
    }

    public static /* synthetic */ boolean c(int i) {
        return i == 3 || i == 5;
    }

    private static boolean d(int i) {
        return i == 3 || i == 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void j() {
        String str = this.T;
        com.anythink.core.common.j.e.b(str, this.g + ":filled timeup to check cache.");
        com.anythink.core.common.e.b a2 = com.anythink.core.common.a.a().a(this.a, this.g);
        this.s = true;
        if (!this.o && a2 != null) {
            String str2 = this.T;
            com.anythink.core.common.j.e.b(str2, this.g + ":filled timeup to check cache exist.");
            d(a2.e() != null ? a2.e().getUnitGroupInfo() : null);
            b(9);
            return;
        }
        String str3 = this.T;
        com.anythink.core.common.j.e.b(str3, this.g + ":filled timeup to check no cache, do nothing.");
    }

    private synchronized void k() {
        if (this.p) {
            com.anythink.core.common.j.e.d(this.T, "sendWaitingListHbLoss");
            synchronized (this.t) {
                for (af afVar : this.t) {
                    if (afVar != null && afVar.j()) {
                        a(afVar);
                    }
                }
                this.t.clear();
            }
            synchronized (this.w) {
                for (com.anythink.core.common.k.e eVar : this.w) {
                    if (eVar != null && eVar.a() != null && eVar.a().j()) {
                        a(eVar.a());
                    }
                }
                this.w.clear();
            }
            synchronized (this.v) {
                this.v.clear();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void l() {
        double a2 = this.L.a(false);
        double r = r();
        String str = this.T;
        com.anythink.core.common.j.e.d(str, "checkWaterfallStatus: vail requesting num: " + this.L.d());
        String str2 = this.T;
        com.anythink.core.common.j.e.b(str2, "checkWaterfallStatus:isFinishBidding:" + this.m);
        String str3 = this.T;
        StringBuilder sb = new StringBuilder("checkWaterfallStatus:currentCacheNum >= mStrategy.getCachedOffersNum():");
        sb.append(this.B >= this.e.ah());
        com.anythink.core.common.j.e.b(str3, sb.toString());
        String str4 = this.T;
        StringBuilder sb2 = new StringBuilder("checkWaterfallStatus:getCacheLowestPrice() > getWaitingResponseMaxPrice():");
        int i = (a2 > r ? 1 : (a2 == r ? 0 : -1));
        sb2.append(i > 0);
        com.anythink.core.common.j.e.b(str4, sb2.toString());
        String str5 = this.T;
        com.anythink.core.common.j.e.b(str5, "checkWaterfallStatus:requestHasShow:" + this.K.c());
        String str6 = this.T;
        com.anythink.core.common.j.e.b(str6, "checkWaterfallStatus:hasLongTimeout:" + this.K.b());
        if ((this.m && this.B >= this.e.ah() && i > 0) || this.K.c() || this.K.b()) {
            this.p = true;
            k();
        }
        p();
    }

    private void m() {
        if (this.e.h() > 0) {
            this.I = new AnonymousClass2();
            String str = this.T;
            com.anythink.core.common.j.e.b(str, this.g + ": start filled count down.");
            com.anythink.core.common.b.m.a().a(this.I, this.e.h());
            return;
        }
        String str2 = this.T;
        com.anythink.core.common.j.e.b(str2, this.g + ": no filled count down.");
    }

    private Runnable n() {
        return new AnonymousClass3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void o() {
        if (!this.o && this.v.size() > 0) {
            this.J = null;
            af remove = this.v.remove(0);
            String str = this.T;
            com.anythink.core.common.j.e.b(str, "handleDefaultAdSourceRequest: startLoadDefaultAdSource:" + remove.ab());
            this.u.add(remove);
            String str2 = this.T;
            com.anythink.core.common.j.e.b(str2, "handleDefaultAdSourceRequest:start to request: waiting size:" + this.v.size() + "; requesting size:" + this.L.f());
            b(remove, 2);
        }
    }

    private synchronized void p() {
        com.anythink.core.common.e.m N;
        af afVar;
        com.anythink.core.common.j.e.d(this.T, "[Enter] tryToSendWinNotice()");
        if (!this.K.g() && this.K.e()) {
            if (this.K.b()) {
                com.anythink.core.common.j.e.d(this.T, "tryToSendWinNotice(), hasLongTimeout: true");
                return;
            }
            boolean z = false;
            if (this.m && (afVar = this.F) != null && afVar.j()) {
                double a2 = com.anythink.core.common.j.g.a(this.F);
                synchronized (this.u) {
                    for (af afVar2 : this.u) {
                        if (com.anythink.core.common.j.g.a(afVar2) > a2) {
                            String str = this.T;
                            com.anythink.core.common.j.e.d(str, "tryToSendWinNotice(), do not send win: " + afVar2.ab());
                            return;
                        }
                    }
                    synchronized (this.w) {
                        for (com.anythink.core.common.k.e eVar : this.w) {
                            af a3 = eVar.a();
                            if (com.anythink.core.common.j.g.a(a3) > a2) {
                                String str2 = this.T;
                                com.anythink.core.common.j.e.d(str2, "tryToSendWinNotice(), do not send win: " + a3.ab());
                                return;
                            }
                        }
                        com.anythink.core.common.j.e.d(this.T, "tryToSendWinNotice(), need to send win notice");
                        z = true;
                    }
                }
            }
            if (z && (N = this.F.N()) != null) {
                this.K.h();
                String str3 = this.T;
                com.anythink.core.common.j.e.d(str3, "tryToSendWinNotice(), send win notice: " + this.F.ab());
                N.a(this.F);
            }
            return;
        }
        String str4 = this.T;
        com.anythink.core.common.j.e.d(str4, "tryToSendWinNotice(), mHasSendWinNotice: " + this.K.g() + ", mHasHBAdSource: " + this.K.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void q() {
        boolean z;
        double r = r();
        double d = this.E;
        if (d >= zg2.s) {
            if (((this.m || this.r) && d >= r) || this.s) {
                if (!this.o) {
                    b(-1);
                }
                v();
            }
        } else if (this.m) {
            if (this.J == null || !A()) {
                z = false;
            } else {
                com.anythink.core.common.b.m.a().b(this.J);
                this.J.run();
                this.J = null;
                z = true;
            }
            if (z) {
                return;
            }
            if (z() && !this.o) {
                y();
            }
        }
    }

    private double r() {
        af afVar;
        af afVar2;
        com.anythink.core.common.k.e eVar;
        synchronized (this.G) {
            Iterator<Map.Entry<String, com.anythink.core.common.k.d>> it = this.G.entrySet().iterator();
            afVar = null;
            afVar2 = null;
            if (it != null) {
                while (it.hasNext()) {
                    com.anythink.core.common.k.d value = it.next().getValue();
                    if (value != null) {
                        if (!value.g()) {
                            af h = value.h();
                            if (h != null) {
                                if (afVar2 != null && com.anythink.core.common.j.g.a(h) <= com.anythink.core.common.j.g.a(afVar2)) {
                                }
                                afVar2 = h;
                            }
                        }
                    }
                }
            }
        }
        af afVar3 = this.t.size() > 0 ? this.t.get(0) : null;
        synchronized (this.w) {
            if (this.w.size() > 0 && (eVar = this.w.get(0)) != null) {
                afVar = eVar.a();
            }
        }
        return Math.max(Math.max(com.anythink.core.common.j.g.a(afVar3), com.anythink.core.common.j.g.a(afVar)), com.anythink.core.common.j.g.a(afVar2));
    }

    private synchronized void s() {
        this.v.clear();
        if (this.J != null) {
            com.anythink.core.common.b.m.a().b(this.J);
            this.J = null;
        }
    }

    private void t() {
        com.anythink.core.common.j.e.d(this.T, "onDevelopLoadedCall()");
        u();
        if (this.P) {
            return;
        }
        h();
    }

    private synchronized boolean u() {
        com.anythink.core.common.j.e.b(this.T, "[Enter] handleDynamicAdSourceRequest()");
        List<af> list = this.R;
        if (list != null && list.size() != 0) {
            if (this.K.c()) {
                return false;
            }
            this.S = true;
            ArrayList arrayList = new ArrayList(3);
            arrayList.addAll(this.R);
            this.R.clear();
            com.anythink.core.common.j.e.b(this.T, "[Enter] startDynamicAdSourceBidding");
            a(8, arrayList, new k.a() { // from class: com.anythink.core.common.h.6
                @Override // com.anythink.core.common.k.a
                public final void a(String str) {
                }

                @Override // com.anythink.core.common.k.a
                public final void a(String str, List<af> list2, List<af> list3) {
                    u a2 = u.a();
                    h hVar = h.this;
                    a2.b(hVar.g, hVar.f, list2);
                    for (af afVar : list2) {
                        afVar.y(8);
                        h.this.u.add(afVar);
                        h.this.b(afVar, 3);
                    }
                }

                @Override // com.anythink.core.common.k.a
                public final void b(String str) {
                    h hVar = h.this;
                    hVar.S = false;
                    hVar.q();
                }
            });
            return true;
        }
        com.anythink.core.common.j.e.b(this.T, "[Enter] No Dynamic AdSource");
        return false;
    }

    private synchronized void v() {
        com.anythink.core.common.j.e.b(this.T, "[Enter] handleBiddingFailedRetry()");
        if (!this.m) {
            com.anythink.core.common.j.e.b(this.T, "[return] handleBiddingFailedRetry, biddingFinish = false");
        } else if (this.K.c()) {
            com.anythink.core.common.j.e.b(this.T, "[return] handleBiddingFailedRetry, mAdSourceCacheHasBeenShowInWaterfall = true");
        } else {
            List<af> list = this.H;
            if (list != null && list.size() != 0) {
                if (this.q) {
                    com.anythink.core.common.j.e.b(this.T, "[return] handleBiddingFailedRetry, hasStartRetryBidding = true");
                    return;
                }
                this.q = true;
                com.anythink.core.common.j.e.b(this.T, "start to retry for failed bidding ad source");
                a(7, this.H, new k.a() { // from class: com.anythink.core.common.h.7
                    @Override // com.anythink.core.common.k.a
                    public final void a(String str) {
                    }

                    @Override // com.anythink.core.common.k.a
                    public final void a(String str, List<af> list2, List<af> list3) {
                        if (h.this.K.c()) {
                            com.anythink.core.common.j.e.d(h.this.T, "handleBiddingFailedRetry, onResult: mAdSourceCacheHasBeenShowInWaterfall = true, send loss");
                            for (af afVar : list2) {
                                h.this.a(afVar);
                            }
                            return;
                        }
                        u a2 = u.a();
                        h hVar = h.this;
                        a2.b(hVar.g, hVar.f, list2);
                        h hVar2 = h.this;
                        if (hVar2.B < hVar2.e.ah()) {
                            com.anythink.core.common.j.e.d(h.this.T, "handleBiddingFailedRetry, onResult: currentCacheNum < mStrategy.getCachedOffersNum()");
                            h.this.a(list2, (List<af>) null, (List<af>) null);
                            h.this.l();
                            return;
                        }
                        com.anythink.core.common.j.e.d(h.this.T, "handleBiddingFailedRetry, onResult: currentCacheNum >= mStrategy.getCachedOffersNum()");
                        double a3 = h.this.L.a(false);
                        int size = list2.size();
                        ArrayList arrayList = new ArrayList(size);
                        ArrayList arrayList2 = new ArrayList(size);
                        for (int i = 0; i < size; i++) {
                            af afVar2 = list2.get(i);
                            if (com.anythink.core.common.j.g.a(afVar2) > a3) {
                                arrayList.add(afVar2);
                            } else {
                                arrayList2.add(afVar2);
                            }
                        }
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            af afVar3 = (af) it.next();
                            afVar3.y(7);
                            h.this.u.add(afVar3);
                            h.this.b(afVar3, 5);
                        }
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            h.this.a((af) it2.next());
                        }
                    }

                    @Override // com.anythink.core.common.k.a
                    public final void b(String str) {
                    }
                });
                return;
            }
            com.anythink.core.common.j.e.b(this.T, "[return] handleBiddingFailedRetry, no need to retry");
        }
    }

    private boolean w() {
        if (this.J == null || !A()) {
            return false;
        }
        com.anythink.core.common.b.m.a().b(this.J);
        this.J.run();
        this.J = null;
        return true;
    }

    private void x() {
        j jVar;
        boolean z = true;
        this.o = true;
        this.n = false;
        if (this.M != null) {
            com.anythink.core.common.b.m.a().b(this.M);
        }
        String str = this.f;
        String str2 = this.g;
        String str3 = this.d;
        com.anythink.core.c.d dVar = this.e;
        com.anythink.core.common.i.c.a(com.anythink.core.common.j.p.a(str, str2, str3, dVar, this.x, dVar.g(), this.k, this.c), this.y);
        if (!this.P) {
            if ((this.e.e() != 1 || this.k == 8 || t.a().f(this.g)) ? false : false) {
                f b = t.a().b(this.g);
                if (b != null && (jVar = this.j) != null) {
                    jVar.d = 8;
                    Context context = this.a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.e.S());
                    b.a(context, sb.toString(), this.g, (String) this.j, (com.anythink.core.common.b.a) null);
                }
            } else {
                a(this.y);
            }
        }
        f();
    }

    private void y() {
        if (com.anythink.core.common.a.a().a(this.a, this.g) != null) {
            b(9);
        } else if (u()) {
        } else {
            x();
        }
    }

    private synchronized boolean z() {
        String str = this.T;
        com.anythink.core.common.j.e.b(str, "hasFinishAllRequest:isFinishBidding: " + this.m);
        String str2 = this.T;
        com.anythink.core.common.j.e.b(str2, "hasFinishAllRequest:requestWaitingPool: " + this.t.size());
        String str3 = this.T;
        com.anythink.core.common.j.e.b(str3, "hasFinishAllRequest:requestingPool: " + this.u.size());
        String str4 = this.T;
        com.anythink.core.common.j.e.b(str4, "hasFinishAllRequest:defaultRequestWaitingPool: " + this.v.size());
        String str5 = this.T;
        com.anythink.core.common.j.e.b(str5, "hasFinishAllRequest:showCapWaitingPool: " + this.w.size());
        if (this.t.size() == 0 && this.v.size() == 0 && this.w.size() == 0) {
            if (this.u.size() == 0) {
                return true;
            }
        }
        return false;
    }

    @Deprecated
    public abstract void a();

    public abstract void a(ATBaseAdAdapter aTBaseAdAdapter);

    public final void f() {
        this.P = true;
        t.a().b(this.g).b(this.f);
    }

    public void g() {
        if (this.M != null) {
            com.anythink.core.common.b.m.a().b(this.M);
        }
    }

    public void h() {
        com.anythink.core.common.b.a aVar;
        j jVar = this.j;
        if (jVar == null || (aVar = jVar.f) == null) {
            return;
        }
        aVar.onAdLoaded();
        this.j.f = null;
    }

    public final void i() {
        synchronized (this.w) {
            if (this.w.size() > 0) {
                af a2 = this.w.remove(0).a();
                if (!this.o || this.B < this.e.ah() || com.anythink.core.common.j.g.a(a2) > this.E) {
                    this.u.add(a2);
                    b(a2, 4);
                }
            }
            if (this.w.size() > 0) {
                for (com.anythink.core.common.k.e eVar : this.w) {
                    af a3 = eVar.a();
                    if (!this.o || this.B < this.e.ah() || com.anythink.core.common.j.g.a(a3) > this.E) {
                        int b = eVar.b();
                        if (b == 1) {
                            a(a3, 1);
                            e(b);
                        } else if (b == 2) {
                            a(a3, 2);
                            e(b);
                        } else if (b == 3) {
                            this.u.add(a3);
                            b(a3, 3);
                        }
                    }
                }
            }
            this.w.clear();
        }
        l();
    }

    /* renamed from: com.anythink.core.common.h$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 implements com.anythink.core.common.k.b {
        public AnonymousClass5() {
        }

        @Override // com.anythink.core.common.k.b
        public final void a(com.anythink.core.common.e.e eVar) {
            com.anythink.core.common.i.a.a(h.this.a).a(1, eVar);
            com.anythink.core.common.j.g.a(eVar, g.i.a, g.i.h, "");
        }

        @Override // com.anythink.core.common.k.b
        public final void b(com.anythink.core.common.e.e eVar) {
            h.a(h.this, eVar);
        }

        @Override // com.anythink.core.common.k.b
        public final void a(ATBaseAdAdapter aTBaseAdAdapter) {
            h.this.a(aTBaseAdAdapter);
        }

        @Override // com.anythink.core.common.k.b
        public final void a(String str, String str2) {
            h.this.a(str, str2);
        }

        @Override // com.anythink.core.common.k.b
        public final void a(String str, ATBaseAdAdapter aTBaseAdAdapter, af afVar) {
            h.this.a(str, aTBaseAdAdapter, afVar);
        }

        @Override // com.anythink.core.common.k.b
        public final void a(String str, ATBaseAdAdapter aTBaseAdAdapter, BaseAd... baseAdArr) {
            IATAdFilter m = com.anythink.core.common.b.m.a().m(h.this.g);
            BaseAd baseAd = (baseAdArr == null || baseAdArr.length <= 0) ? null : baseAdArr[0];
            if (m != null && m.isAdFilter(com.anythink.core.common.b.j.a(aTBaseAdAdapter), baseAd)) {
                com.anythink.core.common.k.a aVar = new com.anythink.core.common.k.a();
                aVar.a = 8;
                aVar.c = aTBaseAdAdapter.getTrackingInfo().J();
                aVar.b = ErrorCode.getErrorCode(ErrorCode.adSourceNotFilledError, "", "");
                aVar.d = aTBaseAdAdapter.getTrackingInfo();
                aVar.e = aTBaseAdAdapter.getUnitGroupInfo();
                h.this.a(str, aVar);
                return;
            }
            h.this.a(str, aTBaseAdAdapter, baseAdArr != null ? Arrays.asList(baseAdArr) : null);
        }

        @Override // com.anythink.core.common.k.b
        public final void a(String str, com.anythink.core.common.k.a aVar) {
            h.this.a(str, aVar);
        }
    }

    private synchronized void e(int i) {
        int f;
        if (i != 2) {
            f = this.L.e();
        } else {
            f = this.L.f();
        }
        if (f == 0) {
            String str = this.T;
            com.anythink.core.common.j.e.d(str, "checkToAddAdSourceToRequestingPool: vail requesting num: " + f + " | requestFrom: " + i);
            a(this.L.b(i), i);
        }
    }

    public final void d() {
        com.anythink.core.common.j.e.d(this.T, "notifyBiddingWaitingCallbackTimeOut()");
        this.r = true;
        q();
    }

    private void c(af afVar) {
        if (this.D == null) {
            this.D = new ConcurrentHashMap<>();
        }
        this.D.put(afVar.t(), afVar);
    }

    private int f(int i) {
        return i > 0 ? i : this.B < this.e.ah() ? 5 : 2;
    }

    public final synchronized void b() {
        ConcurrentHashMap concurrentHashMap;
        this.K.a();
        synchronized (this.G) {
            concurrentHashMap = new ConcurrentHashMap(this.G);
        }
        for (Map.Entry entry : concurrentHashMap.entrySet()) {
            com.anythink.core.common.k.d dVar = (com.anythink.core.common.k.d) entry.getValue();
            if (dVar != null) {
                dVar.c();
            }
        }
        if (!this.o) {
            this.o = true;
            y();
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(af afVar) {
        com.anythink.core.common.e.m N;
        if (afVar == null) {
            return;
        }
        double a2 = com.anythink.core.common.j.g.a(afVar);
        if (afVar.j() && afVar.c() == 1 && a2 == 10000.0d && (N = afVar.N()) != null) {
            a2 = N.o;
        }
        if (a2 > com.anythink.core.common.j.g.a(this.Q)) {
            this.Q = afVar;
        }
    }

    private void c(com.anythink.core.common.e.e eVar) {
        com.anythink.core.common.b.b bVar = this.l;
        if (bVar != null) {
            bVar.d(eVar);
        }
    }

    private void a(Map<String, Object> map) {
        this.h = map;
    }

    public final void e() {
        synchronized (this.C) {
            com.anythink.core.common.j.e.d(this.T, "notifyBiddingFinish()");
            this.m = true;
            this.r = true;
            q();
            l();
        }
    }

    private void a(com.anythink.core.common.e.e eVar) {
        this.i = eVar;
    }

    public final boolean c() {
        if (this.o) {
            return true;
        }
        return this.m && this.t.size() == 0 && this.L.d() == 0;
    }

    public final void a(com.anythink.core.common.b.b bVar) {
        this.l = bVar;
    }

    public final void a(j jVar) {
        this.j = jVar;
    }

    public final void a(int i) {
        this.k = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(af afVar) {
        com.anythink.core.common.e.m N;
        int i;
        double d;
        boolean z;
        if (afVar == null || !afVar.j() || afVar.L() != 2 || (N = afVar.N()) == null) {
            return;
        }
        int c = afVar.c();
        af afVar2 = this.F;
        if (afVar2 != null) {
            d = com.anythink.core.common.j.g.a(afVar2, this.E);
            z = this.F.j();
            i = this.F.c();
        } else {
            double d2 = this.E;
            if (d2 <= zg2.s) {
                d2 = N.price;
            }
            i = c;
            d = d2;
            z = false;
        }
        N.a(d, z, 2, com.anythink.core.common.j.p.a(this.f, this.g, this.d, this.e, "", 1, this.k, this.c), afVar, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(af afVar) {
        this.u.remove(afVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final af afVar, final int i) {
        this.L.a(1, i);
        com.anythink.core.common.j.b.a.a().b(new Runnable() { // from class: com.anythink.core.common.h.4
            @Override // java.lang.Runnable
            public final void run() {
                String str;
                synchronized (h.this) {
                    if (h.this.K.b()) {
                        return;
                    }
                    if (com.anythink.core.common.j.q.a(afVar) && TextUtils.isEmpty(t.a().a(h.this.g, afVar.c()))) {
                        t.a().a(h.this.g, afVar.c(), afVar.g());
                    }
                    boolean c = h.c(i);
                    h hVar = h.this;
                    String str2 = hVar.f;
                    String str3 = hVar.g;
                    String str4 = hVar.d;
                    com.anythink.core.c.d dVar = hVar.e;
                    if (c) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(afVar.c());
                        str = sb.toString();
                    } else {
                        str = hVar.x;
                    }
                    String str5 = str;
                    int g = h.this.e.g();
                    h hVar2 = h.this;
                    com.anythink.core.common.e.e a2 = com.anythink.core.common.j.p.a(str2, str3, str4, dVar, str5, g, hVar2.k, hVar2.c);
                    com.anythink.core.common.j.p.a(a2, afVar, h.this.A, true);
                    a2.a(SystemClock.elapsedRealtime() - h.this.z);
                    com.anythink.core.common.e.d d = t.a().d(h.this.g);
                    int i2 = 0;
                    if (d == null || !d.a(afVar)) {
                        com.anythink.core.common.j.e.b(h.this.T, "startAdSourceRequest: " + afVar.ab());
                        try {
                            if (afVar.j()) {
                                com.anythink.core.common.j.e.b(h.this.T, "hb request send win notice url, remove cache");
                                com.anythink.core.common.e.m N = afVar.N();
                                com.anythink.core.b.f.a().a(afVar.t());
                                if (N != null && N.a()) {
                                    i2 = 1;
                                }
                                if (i2 != 0 && N != null) {
                                    N.a(N.price, 1, a2, afVar);
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        com.anythink.core.common.k.d dVar2 = new com.anythink.core.common.k.d(afVar, i);
                        String a3 = dVar2.a();
                        h.this.G.put(a3, dVar2);
                        h.this.A++;
                        if (i2 != 0) {
                            com.anythink.core.common.k.a aVar = new com.anythink.core.common.k.a();
                            aVar.a = 6;
                            aVar.b = ErrorCode.getErrorCode(ErrorCode.noADError, "", "Bid result has expired.");
                            aVar.c = 0L;
                            aVar.d = a2;
                            aVar.e = afVar;
                            h.this.a(a3, aVar);
                            return;
                        }
                        if (afVar.j()) {
                            h.this.d(afVar);
                        }
                        int ac = afVar.ac();
                        if (ac > 0) {
                            a2.q = ac;
                        } else {
                            h hVar3 = h.this;
                            if (hVar3.n && hVar3.B < hVar3.e.ah()) {
                                a2.q = 5;
                            }
                        }
                        h.a(h.this, dVar2, a2);
                        return;
                    }
                    com.anythink.core.common.j.m.a(h.this.g, a2, "Can't Load On Showing", afVar, -1, -1);
                    com.anythink.core.common.i.c.a(a2, 7, ErrorCode.getErrorCode(ErrorCode.loadInShowingFilter, "", "Can't Load On Showing"));
                    t.a().a(h.this.g, d.a(), h.this.f);
                    synchronized (h.this.w) {
                        Iterator<com.anythink.core.common.k.e> it = h.this.w.iterator();
                        while (it.hasNext() && com.anythink.core.common.j.g.a(it.next().a()) > com.anythink.core.common.j.g.a(afVar)) {
                            i2++;
                        }
                        h.this.w.add(i2, new com.anythink.core.common.k.e(afVar, i));
                    }
                    h.this.b(afVar);
                    h.this.L.a(i);
                    h.this.L.a(-1, i);
                    h hVar4 = h.this;
                    hVar4.a(hVar4.L.b(i), i);
                }
            }
        });
    }

    private void b(com.anythink.core.common.e.e eVar) {
        com.anythink.core.common.b.b bVar = this.l;
        if (bVar != null) {
            bVar.c(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(List<af> list, int i) {
        if (!this.K.b() && !this.K.c() && list != null && list.size() != 0) {
            this.u.addAll(list);
            String str = this.T;
            com.anythink.core.common.j.e.b(str, "addAdSourceToRequestingPool:start to request:  requesting size:" + this.u.size());
            for (af afVar : list) {
                b(afVar, i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i) {
        boolean z;
        f b;
        if (this.I != null) {
            String str = this.T;
            com.anythink.core.common.j.e.b(str, this.g + ":remove filled countdown.");
            com.anythink.core.common.b.m.a().b(this.I);
            this.I = null;
        }
        if (i == 5) {
            com.anythink.core.common.j.e.b(this.T, "onLoadedCallbackToDeveloper: loadedReason: AVAIlABLE_UPSTATUS");
        } else if (i == 9) {
            com.anythink.core.common.j.e.b(this.T, "onLoadedCallbackToDeveloper: loadedReason: HAS_CACHE");
        } else if (i != 10) {
            z = false;
            com.anythink.core.common.j.e.b(this.T, "onLoadedCallbackToDeveloper: loadedReason: REAL_LOAD");
            this.o = true;
            this.n = true;
            if (this.M != null) {
                com.anythink.core.common.b.m.a().b(this.M);
            }
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.z;
            String str2 = this.f;
            String str3 = this.g;
            String str4 = this.d;
            com.anythink.core.c.d dVar = this.e;
            com.anythink.core.common.e.e a2 = com.anythink.core.common.j.p.a(str2, str3, str4, dVar, this.x, dVar.g(), this.k, this.c);
            a2.a(true);
            a2.d(elapsedRealtime);
            if (z) {
                a2.z(i);
            }
            com.anythink.core.common.i.a.a(this.a).a(12, a2);
            b = t.a().b(this.g);
            if (b != null && i != 10) {
                b.a(this.e.P());
            }
            t();
        } else {
            com.anythink.core.common.j.e.b(this.T, "onLoadedCallbackToDeveloper: loadedReason: SHOW_INTERRUPT");
        }
        z = true;
        this.o = true;
        this.n = true;
        if (this.M != null) {
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.z;
        String str22 = this.f;
        String str32 = this.g;
        String str42 = this.d;
        com.anythink.core.c.d dVar2 = this.e;
        com.anythink.core.common.e.e a22 = com.anythink.core.common.j.p.a(str22, str32, str42, dVar2, this.x, dVar2.g(), this.k, this.c);
        a22.a(true);
        a22.d(elapsedRealtime2);
        if (z) {
        }
        com.anythink.core.common.i.a.a(this.a).a(12, a22);
        b = t.a().b(this.g);
        if (b != null) {
            b.a(this.e.P());
        }
        t();
    }

    private synchronized void a(af afVar, int i) {
        List<af> list;
        if (i != 2) {
            list = this.t;
        } else {
            list = this.v;
        }
        synchronized (list) {
            com.anythink.core.common.j.g.a(list, afVar, false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:5:0x0005, B:6:0x0009, B:8:0x000f, B:12:0x0038, B:14:0x003f, B:17:0x0047, B:39:0x00c8, B:40:0x00cc, B:42:0x00d2, B:44:0x00e1, B:45:0x00e8, B:46:0x00f6, B:20:0x0063, B:35:0x009e, B:37:0x00b5, B:38:0x00b7, B:24:0x0086, B:48:0x00f8), top: B:52:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(List<af> list, List<af> list2, List<af> list3) {
        String str;
        String str2;
        String str3;
        synchronized (this.C) {
            if (list2 != null) {
                try {
                    for (af afVar : list2) {
                        this.y.putNetworkErrorMsg(afVar.t(), afVar.c(), afVar.d(), ErrorCode.getErrorCode(ErrorCode.noADError, "", afVar.z()));
                    }
                } finally {
                }
            }
            if (list3 != null) {
                this.H.addAll(list3);
            }
            if (list != null && list.size() != 0) {
                this.K.f();
                af afVar2 = list.get(0);
                boolean a2 = com.anythink.core.common.k.f.a(afVar2, this.K);
                boolean b = this.L.b(afVar2);
                if (a2 || b) {
                    String str4 = this.T;
                    com.anythink.core.common.j.e.b(str4, "isAdvanceRequest: " + a2 + ", cutInLine: " + b);
                    if (this.o) {
                        str = this.n ? "2" : "3";
                    } else {
                        str = "1";
                    }
                    String str5 = str;
                    if (a2) {
                        str3 = "1";
                    } else if (b) {
                        str3 = "2";
                    } else {
                        str2 = "1";
                        com.anythink.core.common.i.c.a(this.i, afVar2.c(), afVar2.t(), com.anythink.core.common.j.g.a(afVar2), str5, str2);
                        if (afVar2.aa()) {
                            this.N = afVar2;
                        }
                        this.L.a(afVar2);
                        list.remove(0);
                        this.u.add(afVar2);
                        b(afVar2, 3);
                    }
                    str2 = str3;
                    com.anythink.core.common.i.c.a(this.i, afVar2.c(), afVar2.t(), com.anythink.core.common.j.g.a(afVar2), str5, str2);
                    if (afVar2.aa()) {
                    }
                    this.L.a(afVar2);
                    list.remove(0);
                    this.u.add(afVar2);
                    b(afVar2, 3);
                }
                for (af afVar3 : list) {
                    this.L.a(afVar3);
                    if (this.D == null) {
                        this.D = new ConcurrentHashMap<>();
                    }
                    this.D.put(afVar3.t(), afVar3);
                    a(afVar3, 1);
                }
            }
        }
    }

    private void b(long j) {
        com.anythink.core.common.b.m.a().a(this.M, j);
    }

    public final void a(com.anythink.core.common.k.g gVar) {
        long j;
        com.anythink.core.common.k.f fVar = new com.anythink.core.common.k.f(gVar);
        this.L = fVar;
        this.t = fVar.a();
        this.u = this.L.b();
        this.m = gVar.e;
        this.f = gVar.b;
        this.g = gVar.a;
        this.e = gVar.c;
        this.c = gVar.f;
        this.x = com.anythink.core.common.k.f.a(gVar.d);
        List<af> c = this.L.c();
        this.v = c;
        if (c == null || c.size() <= 0) {
            j = 1000;
        } else {
            j = this.e.j();
            if (this.t.size() == 0 && this.m) {
                j = 0;
            }
            this.J = new AnonymousClass3();
        }
        this.z = SystemClock.elapsedRealtime();
        com.anythink.core.common.j.e.b(this.T, this.g + ": start waterfall.");
        if (this.e.h() > 0) {
            this.I = new AnonymousClass2();
            com.anythink.core.common.j.e.b(this.T, this.g + ": start filled count down.");
            com.anythink.core.common.b.m.a().a(this.I, this.e.h());
        } else {
            com.anythink.core.common.j.e.b(this.T, this.g + ": no filled count down.");
        }
        com.anythink.core.common.b.m.a().a(this.M, this.e.M());
        if (this.v.size() == 0 && this.t.size() == 0 && this.m) {
            u();
        }
        a(this.L.g(), 1);
        if (this.J != null) {
            com.anythink.core.common.j.e.b(this.T, "scheduleForDefaultAdSource: mDefaultAdSourceRequestDelay:".concat(String.valueOf(j)));
            com.anythink.core.common.b.m.a().a(this.J, j);
        }
    }

    private void a(long j) {
        if (this.J != null) {
            com.anythink.core.common.j.e.b(this.T, "scheduleForDefaultAdSource: mDefaultAdSourceRequestDelay:".concat(String.valueOf(j)));
            com.anythink.core.common.b.m.a().a(this.J, j);
        }
    }

    private void a(com.anythink.core.common.k.d dVar, com.anythink.core.common.e.e eVar) {
        com.anythink.core.common.k.c cVar = new com.anythink.core.common.k.c();
        cVar.a = this.a;
        cVar.b = this.b;
        cVar.c = this.f;
        cVar.d = this.g;
        cVar.e = this.e;
        cVar.f = this.h;
        cVar.g = this.A;
        cVar.h = eVar;
        dVar.a(cVar);
        dVar.a(new AnonymousClass5());
        dVar.b();
    }

    private void a(com.anythink.core.common.e.e eVar, AdError adError) {
        com.anythink.core.common.b.b bVar = this.l;
        if (bVar != null) {
            bVar.b(eVar, adError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, ATBaseAdAdapter aTBaseAdAdapter, af afVar) {
        com.anythink.core.common.k.d remove = this.G.remove(str);
        if (remove == null) {
            return;
        }
        a(remove, aTBaseAdAdapter, afVar, aTBaseAdAdapter.getTrackingInfo());
        String str2 = this.T;
        com.anythink.core.common.j.e.b(str2, "[Enter] onCacheAdLoaded: " + afVar.ab());
        b(afVar);
        s();
        c(aTBaseAdAdapter.getTrackingInfo());
        a(afVar.t(), remove);
    }

    public final synchronized void a(String str, ATBaseAdAdapter aTBaseAdAdapter, List<? extends BaseAd> list) {
        f b;
        String w = aTBaseAdAdapter != null ? aTBaseAdAdapter.getTrackingInfo().w() : "";
        com.anythink.core.common.k.d remove = this.G.remove(str);
        if (remove == null) {
            return;
        }
        com.anythink.core.common.e.e trackingInfo = aTBaseAdAdapter.getTrackingInfo();
        af unitGroupInfo = aTBaseAdAdapter.getUnitGroupInfo();
        String str2 = this.T;
        com.anythink.core.common.j.e.d(str2, "[Enter] onAdLoaded(): " + unitGroupInfo.ab());
        b(unitGroupInfo);
        s();
        a(remove, aTBaseAdAdapter, unitGroupInfo, trackingInfo);
        if (unitGroupInfo.B() != -1 && trackingInfo.I() > 0) {
            com.anythink.core.common.i.c.a(trackingInfo);
        }
        c(aTBaseAdAdapter.getTrackingInfo());
        com.anythink.core.common.i.a.a(this.a).a(2, trackingInfo);
        com.anythink.core.common.a.a().a(this.g, trackingInfo.y(), aTBaseAdAdapter, list, unitGroupInfo.p());
        com.anythink.core.common.j.g.a(trackingInfo, g.i.b, g.i.f, "");
        if (!this.P && !this.K.c() && (b = t.a().b(this.g)) != null && this.e.O() > 0) {
            com.anythink.core.common.b.m.a().a(new f.AnonymousClass4(aTBaseAdAdapter, com.anythink.core.common.j.g.a(unitGroupInfo), this.f));
        }
        a(w, remove);
    }

    private void a(com.anythink.core.common.k.d dVar, ATBaseAdAdapter aTBaseAdAdapter, af afVar, com.anythink.core.common.e.e eVar) {
        eVar.g(aTBaseAdAdapter.getNetworkPlacementId());
        double a2 = dVar.f() != 2 ? com.anythink.core.common.j.g.a(afVar) : 0.0d;
        if (a2 > this.E) {
            this.E = a2;
        }
        d(afVar);
        if (this.F == null) {
            this.F = afVar;
            com.anythink.core.b.f.a().a(this.g, this.F);
        } else if (com.anythink.core.common.j.g.a(afVar) > com.anythink.core.common.j.g.a(this.F)) {
            this.F = afVar;
            com.anythink.core.b.f.a().a(this.g, this.F);
        }
        this.L.a(a2);
        double d = this.O;
        if (d <= zg2.s) {
            eVar.s = 0;
        } else if (d < a2) {
            eVar.s = 2;
        } else {
            eVar.s = 1;
        }
    }

    private void a(String str, com.anythink.core.common.k.d dVar) {
        boolean e = dVar.e();
        if (e) {
            this.L.a(-1, dVar.f());
        }
        a(dVar);
        q();
        if (!e) {
            com.anythink.core.common.j.e.d(this.T, "checkToRequestNextAdSource: Could not request next AdSource because had called before.AdsourceId:".concat(String.valueOf(str)));
            return;
        }
        if (this.L.d() == 0 && this.t.size() == 0 && (this.r || this.m)) {
            u();
        }
        String str2 = this.T;
        com.anythink.core.common.j.e.d(str2, "checkToRequestNextAdSource: try to call next AdSource.||" + dVar.f());
        this.L.a(dVar.f());
        a(this.L.b(dVar.f()), dVar.f());
        l();
    }

    private void a(com.anythink.core.common.k.d dVar) {
        if (dVar.d() == null || !dVar.d().booleanValue() || dVar.f() == 2 || !dVar.d().booleanValue()) {
            return;
        }
        this.B++;
    }

    private void a(int i, List<af> list, final k.a aVar) {
        boolean z = this.N != null || com.anythink.core.common.j.q.a(this.H);
        com.anythink.core.common.e.a aVar2 = new com.anythink.core.common.e.a();
        aVar2.a = this.a;
        aVar2.b = this.j;
        aVar2.c = this.f;
        aVar2.d = this.g;
        aVar2.e = this.e.S();
        aVar2.f = this.e.C();
        aVar2.g = this.e.u();
        i.a();
        aVar2.l = i.a(this.e, z);
        i.a();
        aVar2.o = i.a(this.e);
        i.a();
        aVar2.p = this.e.l();
        aVar2.i = list;
        aVar2.n = this.e;
        aVar2.s = this.i;
        aVar2.q = this.h;
        List<af> b = u.a().b(this.g, this.f);
        if (b == null) {
            aVar2.j = new ArrayList(4);
        } else {
            aVar2.j = b;
        }
        aVar2.m = z;
        aVar2.u = i;
        aVar2.t = this.N;
        aVar2.v = com.anythink.core.common.j.g.a(this.Q);
        com.anythink.core.b.b bVar = new com.anythink.core.b.b(aVar2);
        bVar.a(ATSDK.isNetworkLogDebug());
        bVar.a(new k.a() { // from class: com.anythink.core.common.h.8
            @Override // com.anythink.core.common.k.a
            public final void a(String str, List<af> list2, List<af> list3) {
                k.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.a(str, list2, list3);
                }
            }

            @Override // com.anythink.core.common.k.a
            public final void b(String str) {
                k.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.b(str);
                }
            }

            @Override // com.anythink.core.common.k.a
            public final void a(String str) {
                k.a aVar3 = aVar;
                if (aVar3 != null) {
                    aVar3.a(str);
                }
            }
        });
    }

    public synchronized void a(String str, com.anythink.core.common.k.a aVar) {
        com.anythink.core.common.e.e eVar = aVar.d;
        af afVar = aVar.e;
        AdError adError = aVar.b;
        long j = aVar.c;
        String w = eVar.w();
        com.anythink.core.common.k.d remove = this.G.remove(str);
        if (remove == null) {
            return;
        }
        String str2 = this.T;
        com.anythink.core.common.j.e.d(str2, "[Enter] onAdError(): " + afVar.ab());
        b(afVar);
        this.y.putNetworkErrorMsg(w, eVar.G(), eVar.P(), adError);
        com.anythink.core.common.i.c.a(eVar, aVar.a, adError, j);
        if (j > 0) {
            com.anythink.core.common.b.b bVar = this.l;
            if (bVar != null) {
                bVar.b(eVar, adError);
            }
            com.anythink.core.common.j.g.a(eVar, g.i.b, g.i.g, adError.printStackTrace());
        }
        a(w, remove);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(String str, String str2) {
        if (this.K.b()) {
            return;
        }
        com.anythink.core.common.j.e.d(this.T, "network short timeout: ".concat(String.valueOf(str2)));
        a(str2, this.G.get(str));
    }

    public final synchronized void a(double d, af afVar) {
        if (!this.K.g() && afVar != null && afVar.j()) {
            this.K.h();
        }
        if (d > this.O) {
            this.O = d;
        }
        int S = this.e.S();
        if (S == 0 || S == 2) {
            return;
        }
        this.K.d();
        t.a().b(this.g).b(this.f);
        if (!this.o) {
            b(10);
        }
        l();
    }

    public void a(AdError adError) {
        com.anythink.core.common.b.a aVar;
        j jVar = this.j;
        if (jVar == null || (aVar = jVar.f) == null) {
            return;
        }
        aVar.onAdLoadFail(adError);
        this.j.f = null;
    }

    private af a(String str) {
        ConcurrentHashMap<String, af> concurrentHashMap = this.D;
        if (concurrentHashMap != null) {
            return concurrentHashMap.get(str);
        }
        return null;
    }

    private void a(List<af> list) {
        this.R = list;
    }

    public static /* synthetic */ void a(h hVar, com.anythink.core.common.k.d dVar, com.anythink.core.common.e.e eVar) {
        com.anythink.core.common.k.c cVar = new com.anythink.core.common.k.c();
        cVar.a = hVar.a;
        cVar.b = hVar.b;
        cVar.c = hVar.f;
        cVar.d = hVar.g;
        cVar.e = hVar.e;
        cVar.f = hVar.h;
        cVar.g = hVar.A;
        cVar.h = eVar;
        dVar.a(cVar);
        dVar.a(new AnonymousClass5());
        dVar.b();
    }

    public static /* synthetic */ void a(h hVar, com.anythink.core.common.e.e eVar) {
        com.anythink.core.common.b.b bVar = hVar.l;
        if (bVar != null) {
            bVar.c(eVar);
        }
    }
}