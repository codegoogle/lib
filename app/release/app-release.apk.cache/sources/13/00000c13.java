package com.anythink.rewardvideo.a;

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
import com.anythink.rewardvideo.api.ATRewardVideoExListener;
import com.anythink.rewardvideo.api.ATRewardVideoListener;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener;

/* loaded from: classes2.dex */
public final class e implements CustomRewardedVideoEventListener {
    public long b;
    public boolean c;
    public com.anythink.core.common.e.e d;
    public boolean e;
    public long f;
    public long g;
    private ATRewardVideoListener i;
    private CustomRewardVideoAdapter j;
    private com.anythink.core.common.f.c k;
    private long l;
    private long m;
    public int h = 0;
    public long a = 0;

    public e(CustomRewardVideoAdapter customRewardVideoAdapter, com.anythink.core.common.f.c cVar, ATRewardVideoListener aTRewardVideoListener) {
        this.i = aTRewardVideoListener;
        this.j = customRewardVideoAdapter;
        this.k = cVar;
    }

    private static void b(com.anythink.core.common.e.e eVar) {
        com.anythink.core.common.i.a.a(m.a().e()).a(9, eVar);
    }

    private static void c(com.anythink.core.common.e.e eVar) {
        com.anythink.core.common.i.a.a(m.a().e()).a(6, eVar);
        g.a(eVar, g.i.d, g.i.f, "");
    }

    private void d(com.anythink.core.common.e.e eVar) {
        com.anythink.core.common.i.a.a(m.a().e()).a(13, eVar, this.j.getUnitGroupInfo());
        a(eVar);
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onAgainReward() {
        com.anythink.core.common.f.c cVar;
        com.anythink.core.common.e.e a = a();
        if (!this.e && (cVar = this.k) != null) {
            cVar.a(this.f, this.g, this.j, a);
        }
        this.e = true;
        ATRewardVideoListener aTRewardVideoListener = this.i;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onAgainReward(j.a(a, this.j));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onDeeplinkCallback(boolean z) {
        ATRewardVideoListener aTRewardVideoListener = this.i;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onDeeplinkCallback(j.a(this.j), z);
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onDownloadConfirm(Context context, ATNetworkConfirmInfo aTNetworkConfirmInfo) {
        ATRewardVideoListener aTRewardVideoListener = this.i;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onDownloadConfirm(context, j.a(this.j), aTNetworkConfirmInfo);
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onReward() {
        com.anythink.core.common.f.c cVar;
        if (!this.c && (cVar = this.k) != null) {
            long j = this.l;
            long j2 = this.m;
            CustomRewardVideoAdapter customRewardVideoAdapter = this.j;
            cVar.a(j, j2, customRewardVideoAdapter, customRewardVideoAdapter.getTrackingInfo());
        }
        this.c = true;
        ATRewardVideoListener aTRewardVideoListener = this.i;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onReward(j.a(this.j));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayClicked() {
        com.anythink.core.common.e.e a = a();
        if (this.j != null && a != null) {
            c(a);
        }
        ATRewardVideoListener aTRewardVideoListener = this.i;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayClicked(j.a(a, this.j));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayEnd() {
        if (this.g == 0) {
            this.g = SystemClock.elapsedRealtime();
        }
        com.anythink.core.common.e.e a = a();
        if (this.j != null && a != null) {
            b(a);
        }
        ATRewardVideoListener aTRewardVideoListener = this.i;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayEnd(j.a(a, this.j));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayFailed(String str, String str2) {
        this.h = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.rewardedVideoPlayError, str, str2);
        com.anythink.core.common.e.e a = a();
        if (this.j != null && a != null) {
            a(errorCode, a);
        }
        ATRewardVideoListener aTRewardVideoListener = this.i;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayFailed(errorCode, j.a(a, this.j));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdAgainPlayStart() {
        this.h = 0;
        if (this.f == 0) {
            this.f = SystemClock.elapsedRealtime();
        }
        this.g = 0L;
        com.anythink.core.common.e.e a = a();
        if (this.j != null && a != null) {
            com.anythink.core.common.i.a.a(m.a().e()).a(13, a, this.j.getUnitGroupInfo());
            a(a);
        }
        ATRewardVideoListener aTRewardVideoListener = this.i;
        if (aTRewardVideoListener == null || !(aTRewardVideoListener instanceof ATRewardVideoExListener)) {
            return;
        }
        ((ATRewardVideoExListener) aTRewardVideoListener).onRewardedVideoAdAgainPlayStart(j.a(a, this.j));
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdClosed() {
        CustomRewardVideoAdapter customRewardVideoAdapter = this.j;
        if (customRewardVideoAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customRewardVideoAdapter.getTrackingInfo();
            int i = this.h;
            if (i == 0) {
                i = this.j.getDismissType();
            }
            if (i == 0) {
                i = 1;
            }
            trackingInfo.y(i);
            com.anythink.core.common.j.g.a(trackingInfo, g.i.e, g.i.f, "");
            long j = this.a;
            if (j != 0) {
                com.anythink.core.common.i.c.a(trackingInfo, this.c, j, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.b);
            }
            com.anythink.core.common.i.c.a(trackingInfo, this.c);
            if (this.c) {
                try {
                    this.j.clearImpressionListener();
                    this.j.destory();
                } catch (Throwable unused) {
                }
            } else {
                m.a().a(new Runnable() { // from class: com.anythink.rewardvideo.a.e.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            e.this.j.clearImpressionListener();
                            e.this.j.destory();
                        } catch (Throwable unused2) {
                        }
                    }
                }, 5000L);
            }
            a(trackingInfo.S());
            ATRewardVideoListener aTRewardVideoListener = this.i;
            if (aTRewardVideoListener != null) {
                aTRewardVideoListener.onRewardedVideoAdClosed(j.a(trackingInfo, this.j));
            }
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayClicked() {
        CustomRewardVideoAdapter customRewardVideoAdapter = this.j;
        if (customRewardVideoAdapter != null) {
            c(customRewardVideoAdapter.getTrackingInfo());
        }
        ATRewardVideoListener aTRewardVideoListener = this.i;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onRewardedVideoAdPlayClicked(j.a(this.j));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayEnd() {
        if (this.m == 0) {
            this.m = SystemClock.elapsedRealtime();
        }
        CustomRewardVideoAdapter customRewardVideoAdapter = this.j;
        if (customRewardVideoAdapter != null) {
            if (customRewardVideoAdapter.getDismissType() == 0) {
                this.h = 3;
            }
            b(this.j.getTrackingInfo());
        }
        ATRewardVideoListener aTRewardVideoListener = this.i;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onRewardedVideoAdPlayEnd(j.a(this.j));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayFailed(String str, String str2) {
        this.h = 99;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.rewardedVideoPlayError, str, str2);
        CustomRewardVideoAdapter customRewardVideoAdapter = this.j;
        if (customRewardVideoAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customRewardVideoAdapter.getTrackingInfo();
            String S = trackingInfo.S();
            a(errorCode, trackingInfo);
            a(trackingInfo.S());
            if (!TextUtils.isEmpty(S)) {
                a a = a.a(m.a().E(), S);
                if (a.i()) {
                    a.a(m.a().E(), 7, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null);
                }
            }
        }
        ATRewardVideoListener aTRewardVideoListener = this.i;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onRewardedVideoAdPlayFailed(errorCode, j.a(this.j));
        }
    }

    @Override // com.anythink.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener
    public final void onRewardedVideoAdPlayStart() {
        String str;
        this.a = System.currentTimeMillis();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.b = elapsedRealtime;
        if (this.l == 0) {
            this.l = elapsedRealtime;
        }
        j a = j.a(this.j);
        CustomRewardVideoAdapter customRewardVideoAdapter = this.j;
        if (customRewardVideoAdapter != null) {
            com.anythink.core.common.e.e trackingInfo = customRewardVideoAdapter.getTrackingInfo();
            a(trackingInfo);
            if (trackingInfo != null) {
                str = trackingInfo.S();
                t.a().a(str, a);
            } else {
                str = "";
            }
            if (!TextUtils.isEmpty(str)) {
                a a2 = a.a(m.a().E(), str);
                if (a2.a((ATAdStatusInfo) null)) {
                    a2.a(m.a().E(), 6, (com.anythink.core.common.b.a) null, (com.anythink.core.common.b.b) null);
                }
            }
        }
        ATRewardVideoListener aTRewardVideoListener = this.i;
        if (aTRewardVideoListener != null) {
            aTRewardVideoListener.onRewardedVideoAdPlayStart(a);
        }
    }

    private com.anythink.core.common.e.e a() {
        CustomRewardVideoAdapter customRewardVideoAdapter;
        if (this.d == null && (customRewardVideoAdapter = this.j) != null) {
            com.anythink.core.common.e.e M = customRewardVideoAdapter.getTrackingInfo().M();
            this.d = M;
            M.q = 6;
            this.d.h(com.anythink.core.common.j.g.b(M.T(), this.d.w(), System.currentTimeMillis()));
        }
        return this.d;
    }

    private void a(com.anythink.core.common.e.e eVar) {
        String ilrd = this.j.getILRD();
        if (!TextUtils.isEmpty(ilrd)) {
            eVar.a(ilrd);
        }
        com.anythink.core.common.i.a.a(m.a().e()).a(8, eVar);
        com.anythink.core.common.i.a.a(m.a().e()).a(4, eVar, this.j.getUnitGroupInfo());
        com.anythink.core.common.j.g.a(eVar, g.i.c, g.i.f, "");
    }

    private static void a(AdError adError, com.anythink.core.common.e.e eVar) {
        com.anythink.core.common.j.g.a(eVar, g.i.c, g.i.g, adError.printStackTrace());
        com.anythink.core.common.i.c.b(eVar, adError);
    }

    private static void a(String str) {
        com.anythink.core.common.e.d d;
        if (TextUtils.isEmpty(str) || (d = t.a().d(str)) == null) {
            return;
        }
        t.a().e(str);
        a.a(m.a().e(), str).d(t.a().a(str, d.a()));
    }
}