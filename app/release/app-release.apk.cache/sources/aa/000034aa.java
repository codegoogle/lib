package com.ironsource.mediationsdk.adunit.d;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdRewardListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.RewardedVideoAdListener;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* loaded from: classes3.dex */
public final class c extends com.ironsource.mediationsdk.adunit.d.a.b<com.ironsource.mediationsdk.adunit.c.a.c> implements RewardedVideoAdListener {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public c(a aVar, BaseAdInteractionAdapter<?, AdapterAdRewardListener> baseAdInteractionAdapter, com.ironsource.mediationsdk.adunit.c.a.c cVar) {
        super(aVar, baseAdInteractionAdapter, new com.ironsource.mediationsdk.model.a(r1, r1.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), cVar);
        NetworkSettings networkSettings = aVar.c;
    }
}