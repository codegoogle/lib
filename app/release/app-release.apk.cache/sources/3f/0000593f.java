package com.p7700g.p99005;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.common.util.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class r22 extends AdListener implements AppEventListener, zza {
    @VisibleForTesting
    public final AbstractAdViewAdapter s;
    @VisibleForTesting
    public final MediationBannerListener t;

    public r22(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.s = abstractAdViewAdapter;
        this.t = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        this.t.onAdClicked(this.s);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.t.onAdClosed(this.s);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.t.onAdFailedToLoad(this.s, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.t.onAdLoaded(this.s);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.t.onAdOpened(this.s);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.t.zzd(this.s, str, str2);
    }
}