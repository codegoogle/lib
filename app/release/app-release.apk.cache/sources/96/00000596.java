package com.anythink.core.b;

import android.os.SystemClock;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.MediationBidManager;
import com.anythink.core.common.e.af;
import com.anythink.core.common.e.l;
import com.anythink.core.common.e.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h extends d {
    public boolean a;
    private String b;
    private long e;
    private com.anythink.core.b.b.a f;

    public h(com.anythink.core.common.e.a aVar) {
        super(aVar);
        this.b = "IH Bidding";
        this.a = false;
    }

    private static void b(af afVar, String str, long j, int i) {
        d.a(afVar, str, j, i);
    }

    @Override // com.anythink.core.b.d
    public final void a(af afVar, l lVar, long j) {
    }

    private void b(af afVar) {
        m mVar = new m(true, afVar.x(), afVar.y(), "", "", "", "");
        mVar.f = System.currentTimeMillis() + afVar.n();
        mVar.e = afVar.n();
        a(afVar, mVar);
    }

    @Override // com.anythink.core.b.d
    public final void a(final com.anythink.core.b.b.a aVar) {
        this.f = aVar;
        this.a = false;
        this.e = SystemClock.elapsedRealtime();
        List<af> list = this.c.i;
        if (this.d) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("Start IH Bidding List", d.a(list));
            } catch (Exception unused) {
            }
            com.anythink.core.common.j.m.a(com.anythink.core.common.j.m.a, jSONObject.toString(), false);
        }
        if (f.a().b() == null) {
            Iterator<af> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ATBaseAdAdapter a = com.anythink.core.common.j.i.a(it.next());
                if (a != null) {
                    MediationBidManager bidManager = a.getBidManager();
                    if (bidManager != null) {
                        f.a().a(bidManager);
                    }
                }
            }
        }
        MediationBidManager b = f.a().b();
        if (b == null) {
            a((List<af>) null, -9);
            return;
        }
        b.setBidRequestUrl(this.c.o);
        b.startBid(this.c, new MediationBidManager.BidListener() { // from class: com.anythink.core.b.h.1
            @Override // com.anythink.core.api.MediationBidManager.BidListener
            public final void onBidFail(String str) {
            }

            @Override // com.anythink.core.api.MediationBidManager.BidListener
            public final void onBidStart(af afVar, ATBaseAdAdapter aTBaseAdAdapter) {
                com.anythink.core.b.b.a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a(afVar, aTBaseAdAdapter);
                }
            }

            @Override // com.anythink.core.api.MediationBidManager.BidListener
            public final void onBidSuccess(List<af> list2) {
                h.this.a(list2, -1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(List<af> list, int i) {
        if (this.a) {
            return;
        }
        this.a = true;
        List<af> arrayList = list == null ? new ArrayList<>() : list;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.e;
        ArrayList arrayList2 = new ArrayList();
        Iterator<af> it = this.c.i.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            af next = it.next();
            Iterator<af> it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                af next2 = it2.next();
                if (next.t().equals(next2.t())) {
                    next2.a(elapsedRealtime);
                    next2.g(0);
                    m mVar = new m(true, next2.x(), next2.y(), "", "", "", "");
                    mVar.f = next2.n() + System.currentTimeMillis();
                    mVar.e = next2.n();
                    a(next2, mVar);
                    z = true;
                    break;
                }
            }
            if (!z) {
                if (MediationBidManager.NO_BID_TOKEN_ERROR.equals(next.z())) {
                    b(next, "No Bid Info.", 0L, -2);
                } else {
                    b(next, "No Bid Info.", elapsedRealtime, i);
                }
                if (a(next, "No Bid Info.", i)) {
                    arrayList.add(next);
                } else {
                    arrayList2.add(next);
                }
            }
        }
        if (this.d) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("IH Bidding Success List", d.a(arrayList));
                jSONObject.put("IH Bidding Fail List", d.a(arrayList2));
            } catch (Exception unused) {
            }
            com.anythink.core.common.j.m.a(this.b, jSONObject.toString(), false);
        }
        com.anythink.core.b.b.a aVar = this.f;
        if (aVar != null) {
            aVar.a(arrayList, arrayList2);
        }
        com.anythink.core.b.b.a aVar2 = this.f;
        if (aVar2 != null) {
            aVar2.a();
        }
    }

    @Override // com.anythink.core.b.d
    public final void a() {
        a((List<af>) null, -3);
    }
}