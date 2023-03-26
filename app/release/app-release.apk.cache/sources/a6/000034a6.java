package com.ironsource.mediationsdk.adunit.d.a;

import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.b.d;
import com.ironsource.mediationsdk.adunit.c.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.mediationsdk.utils.f;
import com.p7700g.p99005.wo1;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class b<Listener extends com.ironsource.mediationsdk.adunit.c.a.c> extends a<Listener> implements AdapterAdRewardListener {
    private f p;

    public b(com.ironsource.mediationsdk.adunit.d.a aVar, BaseAdInteractionAdapter<?, AdapterAdRewardListener> baseAdInteractionAdapter, com.ironsource.mediationsdk.model.a aVar2, Listener listener) {
        super(aVar, baseAdInteractionAdapter, aVar2, listener);
    }

    @Override // com.ironsource.mediationsdk.adunit.d.a.a, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdClosed() {
        this.p = new f();
        super.onAdClosed();
    }

    @Override // com.ironsource.mediationsdk.adunit.d.a.a, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener
    public void onAdOpened() {
        this.p = null;
        super.onAdOpened();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener
    public void onAdRewarded() {
        if (this.f == null) {
            IronLog.INTERNAL.verbose(d("placement is null "));
            d dVar = this.d;
            if (dVar != null) {
                dVar.e.m("mCurrentPlacement is null");
                return;
            }
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(d("placement name = " + q()));
        if (this.d != null) {
            HashMap hashMap = new HashMap();
            if (L.a().n != null) {
                for (String str : L.a().n.keySet()) {
                    hashMap.put(wo1.s("custom_", str), L.a().n.get(str));
                }
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.d.d.a(q(), this.f.getRewardName(), this.f.getRewardAmount(), currentTimeMillis, IronSourceUtils.getTransId(currentTimeMillis, k()), f.a(this.p), hashMap, L.a().m);
        }
        ((com.ironsource.mediationsdk.adunit.c.a.c) this.b).a((b<?>) this, this.f);
    }
}