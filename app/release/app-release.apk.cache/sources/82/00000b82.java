package com.anythink.nativead.unitgroup;

import android.content.Context;
import android.view.View;
import com.anythink.core.api.ATEventInterface;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.BaseAd;
import com.anythink.core.common.b.l;
import com.anythink.core.common.e.e;
import com.anythink.nativead.api.ATNativePrepareInfo;

/* loaded from: classes2.dex */
public abstract class a extends BaseAd {
    private static final String TAG = "a";
    public e mAdTrackingInfo;
    public ATEventInterface mDownloadListener;
    private l mNativeEventListener;
    private ATNativePrepareInfo nativePrepareInfo;
    public final int NETWORK_UNKNOW = -1;
    public String mAdSourceType = "0";
    public int mNetworkType = -1;

    public abstract void bindDislikeListener(View.OnClickListener onClickListener);

    public abstract void clear(View view);

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public abstract View getAdIconView();

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public abstract View getAdMediaView(Object... objArr);

    @Override // com.anythink.core.api.IATThirdPartyMaterial
    public final String getAdType() {
        return this.mAdSourceType;
    }

    @Override // com.anythink.core.api.BaseAd
    public final e getDetail() {
        return this.mAdTrackingInfo;
    }

    public final ATNativePrepareInfo getNativePrepareInfo() {
        return this.nativePrepareInfo;
    }

    @Deprecated
    public abstract boolean isNativeExpress();

    public final void notifyAdClicked() {
        com.anythink.core.common.j.e.a(TAG, "notifyAdClicked...");
        l lVar = this.mNativeEventListener;
        if (lVar != null) {
            lVar.onAdClicked(null);
        }
    }

    public final void notifyAdDislikeClick() {
        com.anythink.core.common.j.e.a(TAG, "notifyAdDislikeClick...");
        l lVar = this.mNativeEventListener;
        if (lVar != null) {
            lVar.onAdDislikeButtonClick();
        }
    }

    public final void notifyAdImpression() {
        com.anythink.core.common.j.e.a(TAG, "notifyAdImpression...");
        l lVar = this.mNativeEventListener;
        if (lVar != null) {
            lVar.onAdImpressed();
        }
    }

    public final void notifyAdVideoEnd() {
        com.anythink.core.common.j.e.a(TAG, "notifyAdVideoEnd...");
        l lVar = this.mNativeEventListener;
        if (lVar != null) {
            lVar.onAdVideoEnd();
        }
    }

    public final void notifyAdVideoPlayProgress(int i) {
        com.anythink.core.common.j.e.a(TAG, "notifyAdVideoPlayProgress...");
        l lVar = this.mNativeEventListener;
        if (lVar != null) {
            lVar.onAdVideoProgress(i);
        }
    }

    public final void notifyAdVideoStart() {
        com.anythink.core.common.j.e.a(TAG, "notifyAdVideoStart...");
        l lVar = this.mNativeEventListener;
        if (lVar != null) {
            lVar.onAdVideoStart();
        }
    }

    public final void notifyDeeplinkCallback(boolean z) {
        com.anythink.core.common.j.e.a(TAG, "notifyDeeplinkCallback...");
        l lVar = this.mNativeEventListener;
        if (lVar != null) {
            lVar.onDeeplinkCallback(z);
        }
    }

    public final void notifyDownloadConfirm(Context context, View view, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        com.anythink.core.common.j.e.a(TAG, "notifyDownloadConfirm...");
        l lVar = this.mNativeEventListener;
        if (lVar != null) {
            lVar.onDownloadConfirmCallback(context, view, aTNetworkConfirmInfo);
        }
    }

    public abstract void onPause();

    public abstract void onResume();

    public abstract void pauseVideo();

    public abstract void prepare(View view, ATNativePrepareInfo aTNativePrepareInfo);

    public abstract void resumeVideo();

    public final void setDownloadListener(ATEventInterface aTEventInterface) {
        this.mDownloadListener = aTEventInterface;
    }

    @Override // com.anythink.core.api.BaseAd
    public void setNativeEventListener(l lVar) {
        this.mNativeEventListener = lVar;
    }

    public final void setNativePrepareInfo(ATNativePrepareInfo aTNativePrepareInfo) {
        this.nativePrepareInfo = aTNativePrepareInfo;
    }

    @Override // com.anythink.core.api.BaseAd
    public final void setTrackingInfo(e eVar) {
        this.mAdTrackingInfo = eVar;
    }

    public abstract void setVideoMute(boolean z);
}