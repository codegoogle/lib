package com.anythink.splashad.a;

import android.content.Context;
import android.os.CountDownTimer;
import android.text.TextUtils;
import com.anythink.core.api.ATNetworkConfirmInfo;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.j;
import com.anythink.core.common.b.m;
import com.anythink.core.common.t;
import com.anythink.splashad.api.ATSplashAdExtraInfo;
import com.anythink.splashad.api.ATSplashSkipAdListener;
import com.anythink.splashad.api.ATSplashSkipInfo;
import com.anythink.splashad.api.IATSplashEyeAd;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import com.anythink.splashad.unitgroup.api.CustomSplashEventListener;

/* loaded from: classes2.dex */
public final class f implements CustomSplashEventListener {
    public CustomSplashAdapter a;
    public a b;
    private CountDownTimer c;
    private boolean d = false;
    private int e = 0;

    /* renamed from: com.anythink.splashad.a.f$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends CountDownTimer {
        public final /* synthetic */ ATSplashSkipAdListener a;
        public final /* synthetic */ long b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, long j2, ATSplashSkipAdListener aTSplashSkipAdListener, long j3) {
            super(j, j2);
            this.a = aTSplashSkipAdListener;
            this.b = j3;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            f.this.a(3);
            f.this.onSplashAdDismiss();
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            ATSplashSkipAdListener aTSplashSkipAdListener = this.a;
            if (aTSplashSkipAdListener != null) {
                aTSplashSkipAdListener.onAdTick(this.b, j);
            }
        }
    }

    public f(CustomSplashAdapter customSplashAdapter, a aVar) {
        this.a = customSplashAdapter;
        this.b = aVar;
    }

    private void a(ATSplashSkipInfo aTSplashSkipInfo) {
        long callbackInterval = aTSplashSkipInfo.getCallbackInterval();
        long countDownDuration = aTSplashSkipInfo.getCountDownDuration();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(countDownDuration, callbackInterval, aTSplashSkipInfo.getATSplashSkipAdListener(), countDownDuration);
        this.c = anonymousClass1;
        anonymousClass1.start();
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onDeeplinkCallback(boolean z) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.onDeeplinkCallback(j.a(this.a), z);
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.onDownloadConfirm(context, j.a(this.a), aTNetworkConfirmInfo);
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdClicked() {
        CustomSplashAdapter customSplashAdapter = this.a;
        if (customSplashAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customSplashAdapter.getTrackingInfo();
            com.anythink.core.common.i.a.a(m.a().e()).a(6, trackingInfo);
            com.anythink.core.common.j.g.a(trackingInfo, g.i.d, g.i.f, "");
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.onAdClick(j.a(this.a));
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdDismiss() {
        com.anythink.core.common.e.d d;
        CustomSplashAdapter customSplashAdapter = this.a;
        if (customSplashAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customSplashAdapter.getTrackingInfo();
            int i = this.e;
            if (i != 0) {
                trackingInfo.y(i);
            } else {
                i = this.a.getDismissType();
                if (i == 0) {
                    i = 1;
                }
                trackingInfo.y(i);
            }
            com.anythink.core.common.i.c.a(trackingInfo, false);
            ATSplashSkipInfo splashSkipInfo = this.a.getSplashSkipInfo();
            if (splashSkipInfo != null && splashSkipInfo.canUseCustomSkipView()) {
                this.a.startSplashCustomSkipViewClickEye();
                CountDownTimer countDownTimer = this.c;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                    this.c = null;
                }
                splashSkipInfo.destroy();
                this.a.setSplashSkipInfo(null);
            }
            com.anythink.core.common.j.g.a(trackingInfo, g.i.e, g.i.f, "");
            String S = trackingInfo.S();
            if (!TextUtils.isEmpty(S) && (d = t.a().d(S)) != null) {
                t.a().e(S);
                c.a(m.a().e(), S).d(t.a().a(S, d.a()));
            }
            CustomSplashAdapter customSplashAdapter2 = this.a;
            IATSplashEyeAd splashEyeAd = customSplashAdapter2 instanceof CustomSplashAdapter ? customSplashAdapter2.getSplashEyeAd() : null;
            a aVar = this.b;
            if (aVar != null && !this.d) {
                this.d = true;
                aVar.onCallbackAdDismiss(j.a(trackingInfo, this.a), new ATSplashAdExtraInfo(i, splashEyeAd));
            }
            if (splashEyeAd == null) {
                CustomSplashAdapter customSplashAdapter3 = this.a;
                if (customSplashAdapter3 != null) {
                    customSplashAdapter3.cleanImpressionListener();
                }
                CustomSplashAdapter customSplashAdapter4 = this.a;
                if (customSplashAdapter4 != null) {
                    customSplashAdapter4.destory();
                }
            }
        }
    }

    @Override // com.anythink.splashad.unitgroup.api.CustomSplashEventListener
    public final void onSplashAdShow() {
        j a = j.a(this.a);
        CustomSplashAdapter customSplashAdapter = this.a;
        if (customSplashAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customSplashAdapter.getTrackingInfo();
            com.anythink.core.common.i.a.a(m.a().e()).a(4, trackingInfo, this.a.getUnitGroupInfo());
            com.anythink.core.common.j.g.a(trackingInfo, g.i.c, g.i.f, "");
            ATSplashSkipInfo splashSkipInfo = this.a.getSplashSkipInfo();
            if (splashSkipInfo != null && splashSkipInfo.canUseCustomSkipView() && this.a.isSupportCustomSkipView()) {
                long callbackInterval = splashSkipInfo.getCallbackInterval();
                long countDownDuration = splashSkipInfo.getCountDownDuration();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(countDownDuration, callbackInterval, splashSkipInfo.getATSplashSkipAdListener(), countDownDuration);
                this.c = anonymousClass1;
                anonymousClass1.start();
            }
            if (trackingInfo != null) {
                t.a().a(trackingInfo.S(), a);
            }
        }
        a aVar = this.b;
        if (aVar != null) {
            aVar.onAdShow(a);
        }
    }

    private void a() {
        CountDownTimer countDownTimer = this.c;
        if (countDownTimer != null) {
            countDownTimer.cancel();
            this.c = null;
        }
    }

    public final void a(int i) {
        this.e = i;
    }

    private static void a(String str) {
        com.anythink.core.common.e.d d;
        if (TextUtils.isEmpty(str) || (d = t.a().d(str)) == null) {
            return;
        }
        t.a().e(str);
        c.a(m.a().e(), str).d(t.a().a(str, d.a()));
    }
}