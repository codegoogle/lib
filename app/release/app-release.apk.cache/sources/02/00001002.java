package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.facebook.ads.redexgen.X.Br  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0566Br {
    public final CopyOnWriteArrayList<C0565Bq> A00 = new CopyOnWriteArrayList<>();

    public final void A00() {
        Iterator<C0565Bq> it = this.A00.iterator();
        while (it.hasNext()) {
            C0565Bq handlerAndListener = it.next();
            handlerAndListener.A00.post(new RunnableC0561Bm(this, handlerAndListener.A01));
        }
    }

    public final void A01() {
        Iterator<C0565Bq> it = this.A00.iterator();
        while (it.hasNext()) {
            C0565Bq handlerAndListener = it.next();
            handlerAndListener.A00.post(new RunnableC0564Bp(this, handlerAndListener.A01));
        }
    }

    public final void A02() {
        Iterator<C0565Bq> it = this.A00.iterator();
        while (it.hasNext()) {
            C0565Bq handlerAndListener = it.next();
            handlerAndListener.A00.post(new RunnableC0563Bo(this, handlerAndListener.A01));
        }
    }

    public final void A03(Handler handler, Bs bs) {
        I1.A03((handler == null || bs == null) ? false : true);
        this.A00.add(new C0565Bq(handler, bs));
    }

    public final void A04(Exception exc) {
        Iterator<C0565Bq> it = this.A00.iterator();
        while (it.hasNext()) {
            C0565Bq next = it.next();
            next.A00.post(new RunnableC0562Bn(this, next.A01, exc));
        }
    }
}