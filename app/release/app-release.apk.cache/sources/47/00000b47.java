package com.anythink.interstitial.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATAdStatusInfo;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.j;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.g;
import com.anythink.core.common.t;
import com.anythink.interstitial.api.ATInterstitialExListener;
import com.anythink.interstitial.api.ATInterstitialListener;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialAdapter;
import com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener;

/* loaded from: classes2.dex */
public final class d implements CustomInterstitialEventListener {
    public ATInterstitialListener a;
    public CustomInterstitialAdapter b;
    public long c;
    public long d;
    public int e = 0;

    public d(CustomInterstitialAdapter customInterstitialAdapter, ATInterstitialListener aTInterstitialListener) {
        this.a = aTInterstitialListener;
        this.b = customInterstitialAdapter;
    }

    private static void a(String str) {
        com.anythink.core.common.e.d d;
        if (TextUtils.isEmpty(str) || (d = t.a().d(str)) == null) {
            return;
        }
        t.a().e(str);
        a.a(m.a().e(), str).d(t.a().a(str, d.a()));
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onDeeplinkCallback(boolean z) {
        ATInterstitialListener aTInterstitialListener = this.a;
        if (aTInterstitialListener == null || !(aTInterstitialListener instanceof ATInterstitialExListener)) {
            return;
        }
        ((ATInterstitialExListener) aTInterstitialListener).onDeeplinkCallback(j.a(this.b), z);
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        ATInterstitialListener aTInterstitialListener = this.a;
        if (aTInterstitialListener == null || !(aTInterstitialListener instanceof ATInterstitialExListener)) {
            return;
        }
        ((ATInterstitialExListener) aTInterstitialListener).onDownloadConfirm(context, j.a(this.b), aTNetworkConfirmInfo);
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdClicked() {
        CustomInterstitialAdapter customInterstitialAdapter = this.b;
        if (customInterstitialAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customInterstitialAdapter.getTrackingInfo();
            g.a(trackingInfo, g.i.d, g.i.f, "");
            com.anythink.core.common.i.a.a(m.a().e()).a(6, trackingInfo);
        }
        ATInterstitialListener aTInterstitialListener = this.a;
        if (aTInterstitialListener != null) {
            aTInterstitialListener.onInterstitialAdClicked(j.a(this.b));
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdClose() {
        CustomInterstitialAdapter customInterstitialAdapter = this.b;
        if (customInterstitialAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customInterstitialAdapter.getTrackingInfo();
            int i = this.e;
            if (i == 0) {
                i = this.b.getDismissType();
            }
            if (i == 0) {
                i = 1;
            }
            trackingInfo.y(i);
            com.anythink.core.common.j.g.a(trackingInfo, g.i.e, g.i.f, "");
            long j = this.c;
            if (j != 0) {
                com.anythink.core.common.i.c.a(trackingInfo, false, j, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.d);
            }
            com.anythink.core.common.i.c.a(trackingInfo, false);
            try {
                this.b.clearImpressionListener();
                this.b.destory();
            } catch (Throwable unused) {
            }
            ATInterstitialListener aTInterstitialListener = this.a;
            if (aTInterstitialListener != null) {
                aTInterstitialListener.onInterstitialAdClose(j.a(trackingInfo, this.b));
            }
            a(trackingInfo.S());
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdShow() {
        this.c = System.currentTimeMillis();
        this.d = SystemClock.elapsedRealtime();
        j a = j.a(this.b);
        CustomInterstitialAdapter customInterstitialAdapter = this.b;
        if (customInterstitialAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customInterstitialAdapter.getTrackingInfo();
            String ilrd = this.b.getILRD();
            if (!TextUtils.isEmpty(ilrd)) {
                trackingInfo.a(ilrd);
            }
            String str = "";
            com.anythink.core.common.j.g.a(trackingInfo, g.i.c, g.i.f, "");
            com.anythink.core.common.i.a.a(m.a().e()).a(4, trackingInfo, this.b.getUnitGroupInfo());
            if (trackingInfo != null) {
                str = trackingInfo.S();
                t.a().a(str, a);
            }
            if (!TextUtils.isEmpty(str)) {
                a a2 = a.a(m.a().E(), str);
                if (a2.a((ATAdStatusInfo) null)) {
                    a2.a(m.a().E(), 6, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null);
                }
            }
        }
        ATInterstitialListener aTInterstitialListener = this.a;
        if (aTInterstitialListener != null) {
            aTInterstitialListener.onInterstitialAdShow(a);
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoEnd() {
        CustomInterstitialAdapter customInterstitialAdapter = this.b;
        if (customInterstitialAdapter != null) {
            if (customInterstitialAdapter.getDismissType() == 0) {
                this.e = 3;
            }
            com.anythink.core.common.i.a.a(m.a().e()).a(9, this.b.getTrackingInfo());
            ATInterstitialListener aTInterstitialListener = this.a;
            if (aTInterstitialListener != null) {
                aTInterstitialListener.onInterstitialAdVideoEnd(j.a(this.b));
            }
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoError(String str, String str2) {
        String str3;
        this.e = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.rewardedVideoPlayError, str, str2);
        CustomInterstitialAdapter customInterstitialAdapter = this.b;
        if (customInterstitialAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customInterstitialAdapter.getTrackingInfo();
            com.anythink.core.common.i.c.b(trackingInfo, errorCode);
            if (trackingInfo != null) {
                str3 = trackingInfo.S();
                a(trackingInfo.S());
            } else {
                str3 = "";
            }
            if (!TextUtils.isEmpty(str3)) {
                a a = a.a(m.a().E(), str3);
                if (a.i()) {
                    a.a(m.a().E(), 7, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null);
                }
            }
        }
        ATInterstitialListener aTInterstitialListener = this.a;
        if (aTInterstitialListener != null) {
            aTInterstitialListener.onInterstitialAdVideoError(errorCode);
        }
    }

    @Override // com.anythink.interstitial.unitgroup.api.CustomInterstitialEventListener
    public final void onInterstitialAdVideoStart() {
        CustomInterstitialAdapter customInterstitialAdapter = this.b;
        if (customInterstitialAdapter != null) {
            com.anythink.core.common.i.a.a(m.a().e()).a(8, customInterstitialAdapter.getTrackingInfo());
            ATInterstitialListener aTInterstitialListener = this.a;
            if (aTInterstitialListener != null) {
                aTInterstitialListener.onInterstitialAdVideoStart(j.a(this.b));
            }
        }
    }
}