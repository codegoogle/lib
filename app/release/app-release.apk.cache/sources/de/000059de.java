package com.p7700g.p99005;

import com.ironsource.mediationsdk.F;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* loaded from: classes3.dex */
public final class re3 {
    public IronSource.AD_UNIT a;

    public re3(IronSource.AD_UNIT ad_unit) {
        this.a = ad_unit;
    }

    public final void a(IronSourceError ironSourceError) {
        IronSource.AD_UNIT ad_unit = this.a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().a(ironSourceError);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            com.ironsource.mediationsdk.ae.a().a(ironSourceError);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + this.a);
        }
    }

    public final void b(IronSourceError ironSourceError, AdInfo adInfo) {
        IronSource.AD_UNIT ad_unit = this.a;
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            F.a().a(ironSourceError, adInfo);
        } else if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            com.ironsource.mediationsdk.ae.a().a(ironSourceError, adInfo);
        } else {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + this.a);
        }
    }

    public final void c(boolean z, AdInfo adInfo) {
        if (this.a == IronSource.AD_UNIT.REWARDED_VIDEO) {
            com.ironsource.mediationsdk.ae.a().a(z, adInfo);
            return;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + this.a);
    }
}