package com.ironsource.mediationsdk.adunit.d;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.InterstitialAdListener;
import com.ironsource.mediationsdk.model.NetworkSettings;

/* loaded from: classes3.dex */
public final class b extends com.ironsource.mediationsdk.adunit.d.a.a<com.ironsource.mediationsdk.adunit.c.a.a> implements InterstitialAdListener {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(a aVar, BaseAdInteractionAdapter<?, AdapterAdInteractionListener> baseAdInteractionAdapter, com.ironsource.mediationsdk.adunit.c.a.a aVar2) {
        super(aVar, baseAdInteractionAdapter, new com.ironsource.mediationsdk.model.a(r1, r1.getInterstitialSettings(), IronSource.AD_UNIT.INTERSTITIAL), aVar2);
        NetworkSettings networkSettings = aVar.c;
    }
}