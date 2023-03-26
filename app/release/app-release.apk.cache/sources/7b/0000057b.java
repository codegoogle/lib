package com.anythink.core.b;

import android.content.Context;
import android.os.SystemClock;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATBiddingNotice;
import com.anythink.core.api.ATBiddingResult;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.g;
import com.anythink.core.common.e.af;
import com.anythink.core.common.e.l;
import com.anythink.core.common.j.m;
import com.anythink.core.common.j.p;
import com.p7700g.p99005.zg2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class a extends d {
    public static final String a = "a";
    private List<af> b;
    private com.anythink.core.b.b.a e;
    private long f;
    private AtomicBoolean g;

    public a(com.anythink.core.common.e.a aVar) {
        super(aVar);
        this.g = new AtomicBoolean(false);
        this.b = Collections.synchronizedList(new ArrayList(this.c.i));
    }

    @Override // com.anythink.core.b.d
    public final void a(com.anythink.core.b.b.a aVar) {
        this.e = aVar;
        List<af> list = this.c.i;
        int size = list.size();
        this.f = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            final af afVar = list.get(i);
            ATBaseAdAdapter a2 = com.anythink.core.common.j.i.a(afVar);
            if (a2 == null) {
                a(false, ATBiddingResult.fail(afVar.h() + "not exist!"), afVar, -9, (com.anythink.core.b.c.a) null);
            } else {
                try {
                    com.anythink.core.b.b.b bVar = new com.anythink.core.b.b.b(a2) { // from class: com.anythink.core.b.a.1
                        private void a(final ATBiddingResult aTBiddingResult, final com.anythink.core.b.c.a aVar2) {
                            com.anythink.core.common.j.b.a.a().a(new Runnable() { // from class: com.anythink.core.b.a.1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    a.this.a(aTBiddingResult.isSuccessWithUseType(), aTBiddingResult, afVar, aTBiddingResult.isSuccessWithUseType() ? 0 : -1, aVar2);
                                }
                            });
                        }

                        @Override // com.anythink.core.api.ATBiddingListener
                        public final void onC2SBidResult(ATBiddingResult aTBiddingResult) {
                            ATBaseAdAdapter aTBaseAdAdapter = this.c;
                            if (aTBaseAdAdapter != null) {
                                aTBaseAdAdapter.releaseLoadResource();
                            }
                            a(aTBiddingResult, null);
                        }

                        @Override // com.anythink.core.api.ATBiddingListener
                        public final void onC2SBiddingResultWithCache(ATBiddingResult aTBiddingResult, BaseAd baseAd) {
                            ATBaseAdAdapter aTBaseAdAdapter = this.c;
                            if (aTBaseAdAdapter != null) {
                                aTBaseAdAdapter.releaseLoadResource();
                            }
                            a(aTBiddingResult, new com.anythink.core.b.c.a(this.c, baseAd));
                        }
                    };
                    String str = a;
                    com.anythink.core.common.j.e.b(str, "start c2s bid request: " + a2.getNetworkName());
                    com.anythink.core.c.d a3 = com.anythink.core.c.e.a(this.c.a).a(this.c.d);
                    com.anythink.core.common.e.a aVar2 = this.c;
                    Map<String, Object> a4 = a3.a(aVar2.d, aVar2.c, afVar);
                    if (a3.an() > zg2.s) {
                        a4.put("bid_floor", Double.valueOf(a3.an() * a(afVar)));
                    }
                    com.anythink.core.common.e.e M = this.c.s.M();
                    p.a(M, afVar, 0, false);
                    com.anythink.core.common.j.g.a(a4, M);
                    com.anythink.core.common.e.a aVar3 = this.c;
                    if (aVar3.u == 8) {
                        double d = aVar3.v;
                        a4.put(g.k.j, d < zg2.s ? "0" : Double.valueOf(d));
                    }
                    com.anythink.core.common.j jVar = this.c.b;
                    Context a5 = jVar != null ? jVar.a() : null;
                    if (a5 == null) {
                        a5 = this.c.a;
                    }
                    boolean internalStartBiddingRequest = a2.internalStartBiddingRequest(a5, a4, this.c.q, bVar);
                    aVar.a(afVar, a2);
                    if (!internalStartBiddingRequest) {
                        a(ATBiddingResult.fail("This network don't support head bidding in current TopOn's version."), afVar);
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                    a(ATBiddingResult.fail(th.getMessage()), afVar);
                }
            }
        }
    }

    private void a(af afVar, l lVar, long j, int i, com.anythink.core.b.c.a aVar) {
        if (lVar.isSuccessWithUseType()) {
            afVar.a(j);
            afVar.a(lVar.currency);
            com.anythink.core.common.j.e.b(m.a, "C2S Bidding Success: , AdSoruceId:" + afVar.t() + ", NetworkFirmId:" + afVar.c() + " | price:" + lVar.price + " | currency:" + lVar.currency.toString());
            double a2 = a(lVar.price, afVar);
            if (a2 <= zg2.s) {
                afVar.d();
                afVar.t();
                a2 = afVar.x();
            }
            com.anythink.core.common.e.m mVar = new com.anythink.core.common.e.m(true, a2, lVar.token, lVar.winNoticeUrl, lVar.loseNoticeUrl, lVar.displayNoticeUrl, "");
            mVar.l = a(afVar);
            mVar.setBiddingNotice(lVar.biddingNotice);
            mVar.f = System.currentTimeMillis() + afVar.n();
            mVar.e = afVar.n();
            mVar.k = afVar.t();
            mVar.d = afVar.c();
            mVar.r = aVar;
            mVar.s = aVar != null;
            a(afVar.c(), mVar, zg2.s);
            a(afVar, mVar);
            String str = g.i.f;
            com.anythink.core.common.e.a aVar2 = this.c;
            m.a(str, aVar2.d, com.anythink.core.common.j.g.d(String.valueOf(aVar2.e)), afVar);
            return;
        }
        d.a(afVar, lVar.errorMsg, j, i);
        String str2 = g.i.g;
        com.anythink.core.common.e.a aVar3 = this.c;
        m.a(str2, aVar3.d, com.anythink.core.common.j.g.d(String.valueOf(aVar3.e)), afVar);
    }

    @Override // com.anythink.core.b.d
    public final void a(af afVar, l lVar, long j) {
        a(afVar, lVar, j, -1, (com.anythink.core.b.c.a) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(boolean z, ATBiddingResult aTBiddingResult, af afVar, int i, com.anythink.core.b.c.a aVar) {
        boolean z2;
        ATBiddingNotice aTBiddingNotice;
        if (z) {
            f a2 = f.a();
            String t = afVar.t();
            ConcurrentHashMap<String, Integer> concurrentHashMap = a2.e;
            if (concurrentHashMap != null) {
                if (concurrentHashMap.get(t + "_c2sfirstStatus") != null) {
                    z2 = false;
                    com.anythink.core.common.i.c.a(this.c.d, afVar, z2, SystemClock.elapsedRealtime() - this.f);
                }
            }
            z2 = true;
            com.anythink.core.common.i.c.a(this.c.d, afVar, z2, SystemClock.elapsedRealtime() - this.f);
        }
        f a3 = f.a();
        String t2 = afVar.t();
        if (a3.e == null) {
            a3.e = new ConcurrentHashMap<>();
        }
        ConcurrentHashMap<String, Integer> concurrentHashMap2 = a3.e;
        concurrentHashMap2.put(t2 + "_c2sfirstStatus", 1);
        if (this.g.get()) {
            if (aTBiddingResult != null && (aTBiddingNotice = aTBiddingResult.biddingNotice) != null) {
                aTBiddingNotice.notifyBidLoss("2", zg2.s);
            }
            return;
        }
        a(afVar, aTBiddingResult, SystemClock.elapsedRealtime() - this.f, i, aVar);
        List<af> synchronizedList = Collections.synchronizedList(new ArrayList(1));
        synchronizedList.add(afVar);
        this.b.remove(afVar);
        if (this.e != null) {
            if (!z ? a(afVar, aTBiddingResult.errorMsg, -1) : z) {
                this.e.a(synchronizedList, (List<af>) null);
            } else {
                this.e.a((List<af>) null, synchronizedList);
            }
        }
        if (this.b.size() == 0) {
            this.g.set(true);
            com.anythink.core.b.b.a aVar2 = this.e;
            if (aVar2 != null) {
                aVar2.a();
            }
        }
    }

    private synchronized void a(ATBiddingResult aTBiddingResult, af afVar) {
        a(false, aTBiddingResult, afVar, -1, (com.anythink.core.b.c.a) null);
    }

    private static ATBiddingResult a(String str) {
        return ATBiddingResult.fail(str);
    }

    @Override // com.anythink.core.b.d
    public final synchronized void a() {
        if (!this.g.get()) {
            this.g.set(true);
            com.anythink.core.common.j.e.b(m.a, "c2s bid request timeout");
            ArrayList arrayList = new ArrayList(3);
            ArrayList arrayList2 = new ArrayList(3);
            for (af afVar : this.b) {
                if (a(afVar, "bid timeout", -3)) {
                    arrayList.add(afVar);
                } else {
                    a(afVar, ATBiddingResult.fail("bid timeout!"), SystemClock.elapsedRealtime() - this.f, -3, (com.anythink.core.b.c.a) null);
                    arrayList2.add(afVar);
                }
            }
            this.b.clear();
            com.anythink.core.b.b.a aVar = this.e;
            if (aVar != null) {
                aVar.a(arrayList, arrayList2);
            }
            com.anythink.core.b.b.a aVar2 = this.e;
            if (aVar2 != null) {
                aVar2.a();
            }
            this.e = null;
        }
    }
}