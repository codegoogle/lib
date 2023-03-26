package com.ironsource.mediationsdk.adunit.c;

import com.ironsource.mediationsdk.C1272d;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceSegment;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdInteractionAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdInteractionListener;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.d.b;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.i;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class g extends d<b, BaseAdInteractionAdapter<?, AdapterAdInteractionListener>> {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g(List<NetworkSettings> list, i iVar, String str, Set<ImpressionDataListener> set, IronSourceSegment ironSourceSegment) {
        super(new a(r1, str, list, r4, iVar.c, iVar.e, iVar.f, -1, new com.ironsource.mediationsdk.adunit.c.b.a(a.EnumC0116a.MANUAL, r4.l, r4.k)), set, ironSourceSegment);
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        com.ironsource.mediationsdk.utils.c cVar = iVar.i;
    }

    private static BaseAdInteractionAdapter<?, AdapterAdInteractionListener> G(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        BaseAdAdapter<?, ?> b = C1272d.a().b(networkSettings, ad_unit);
        if (b == null || !(b instanceof BaseAdInteractionAdapter)) {
            return null;
        }
        try {
            return (BaseAdInteractionAdapter) b;
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception creating adapter - " + e.getMessage());
            return null;
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.c.e
    public final /* synthetic */ BaseAdAdapter a(NetworkSettings networkSettings, IronSource.AD_UNIT ad_unit) {
        return G(networkSettings, ad_unit);
    }

    @Override // com.ironsource.mediationsdk.adunit.c.e
    public final /* synthetic */ com.ironsource.mediationsdk.adunit.d.a.c b(NetworkSettings networkSettings, BaseAdAdapter baseAdAdapter, int i, String str) {
        IronSource.AD_UNIT ad_unit = IronSource.AD_UNIT.INTERSTITIAL;
        a aVar = this.o;
        return new b(new com.ironsource.mediationsdk.adunit.d.a(ad_unit, aVar.b, i, this.h, str, this.f, this.g, networkSettings, aVar.g), (BaseAdInteractionAdapter) baseAdAdapter, this);
    }
}