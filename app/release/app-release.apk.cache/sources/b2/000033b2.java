package com.ironsource.adapters.ironsource;

import android.widget.FrameLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.sdk.c.a;
import com.ironsource.sdk.c.c;
import com.ironsource.sdk.j.b;
import com.p7700g.p99005.wo1;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class IronSourceBannerListener implements b {
    private WeakReference<IronSourceAdapter> mAdapter;
    private final String mDemandSourceName;
    private final BannerSmashListener mListener;

    public IronSourceBannerListener(IronSourceAdapter ironSourceAdapter, BannerSmashListener bannerSmashListener, String str) {
        this.mDemandSourceName = str;
        this.mListener = bannerSmashListener;
        this.mAdapter = new WeakReference<>(ironSourceAdapter);
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerClick() {
        wo1.f0(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerAdClicked();
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerInitFailed(String str) {
        wo1.f0(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerInitFailed(new IronSourceError(612, str));
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerInitSuccess() {
        wo1.f0(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        this.mListener.onBannerInitSuccess();
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerLoadFail(String str) {
        wo1.f0(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("load failed - error = " + str));
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerLoadSuccess(a aVar) {
        wo1.f0(new StringBuilder(), this.mDemandSourceName, " bannerListener", IronLog.ADAPTER_CALLBACK);
        if (this.mAdapter.get() != null) {
            if (aVar == null) {
                this.mListener.onBannerAdLoadFailed(ErrorBuilder.adContainerIsNull(this.mAdapter.get().getProviderName()));
                return;
            }
            this.mAdapter.get().mBannerAdContainer = aVar;
            c cVar = aVar.a;
            com.ironsource.sdk.a aVar2 = cVar != null ? cVar.e : new com.ironsource.sdk.a();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(aVar2.a, aVar2.b);
            layoutParams.gravity = 17;
            this.mListener.onBannerAdLoaded(aVar, layoutParams);
        }
    }

    @Override // com.ironsource.sdk.j.b
    public void onBannerShowSuccess() {
        wo1.f0(new StringBuilder(), this.mDemandSourceName, " onBannerShowSuccess", IronLog.ADAPTER_CALLBACK);
        BannerSmashListener bannerSmashListener = this.mListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerAdShown();
        }
    }
}