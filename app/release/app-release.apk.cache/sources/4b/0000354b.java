package com.ironsource.mediationsdk.sdk;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.p7700g.p99005.wo1;
import java.util.Date;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i implements InterstitialListener, RewardedVideoListener, SegmentListener, com.ironsource.mediationsdk.sdk.f {
    public RewardedVideoListener a;
    public InterstitialListener b;
    public OfferwallListener c;
    public SegmentListener d;
    public InterstitialPlacement e = null;
    public String f = null;
    private v g;
    private long h;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ IronSourceError s;

        public a(IronSourceError ironSourceError) {
            this.s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.c.onOfferwallShowFailed(this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        private /* synthetic */ IronSourceError s;

        public b(IronSourceError ironSourceError) {
            this.s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.c.onGetOfferwallCreditsFailed(this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.a.onRewardedVideoAdOpened();
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.c.onOfferwallClosed();
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        private /* synthetic */ boolean s;

        public e(boolean z) {
            this.s = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.c.onOfferwallAvailable(this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.a.onRewardedVideoAdClosed();
        }
    }

    /* loaded from: classes3.dex */
    public class g implements Runnable {
        private /* synthetic */ boolean s;

        public g(boolean z) {
            this.s = z;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.a.onRewardedVideoAvailabilityChanged(this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.a.onRewardedVideoAdStarted();
        }
    }

    /* renamed from: com.ironsource.mediationsdk.sdk.i$i  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0121i implements Runnable {
        public RunnableC0121i() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.a.onRewardedVideoAdEnded();
        }
    }

    /* loaded from: classes3.dex */
    public class j implements Runnable {
        private /* synthetic */ Placement s;

        public j(Placement placement) {
            this.s = placement;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.a.onRewardedVideoAdRewarded(this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class k implements Runnable {
        private /* synthetic */ String s;

        public k(String str) {
            this.s = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (TextUtils.isEmpty(this.s)) {
                return;
            }
            i.this.d.onSegmentReceived(this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class l implements Runnable {
        private /* synthetic */ Placement s;

        public l(Placement placement) {
            this.s = placement;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.a.onRewardedVideoAdClicked(this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class m implements Runnable {
        private /* synthetic */ IronSourceError s;

        public m(IronSourceError ironSourceError) {
            this.s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.a.onRewardedVideoAdShowFailed(this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.b.onInterstitialAdReady();
        }
    }

    /* loaded from: classes3.dex */
    public class o implements Runnable {
        private /* synthetic */ IronSourceError s;

        public o(IronSourceError ironSourceError) {
            this.s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.b.onInterstitialAdLoadFailed(this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.b.onInterstitialAdOpened();
        }
    }

    /* loaded from: classes3.dex */
    public class q implements Runnable {
        public q() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.b.onInterstitialAdShowSucceeded();
        }
    }

    /* loaded from: classes3.dex */
    public class r implements Runnable {
        private /* synthetic */ IronSourceError s;

        public r(IronSourceError ironSourceError) {
            this.s = ironSourceError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.b.onInterstitialAdShowFailed(this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class s implements Runnable {
        public s() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.b.onInterstitialAdClicked();
        }
    }

    /* loaded from: classes3.dex */
    public class t implements Runnable {
        public t() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.b.onInterstitialAdClosed();
        }
    }

    /* loaded from: classes3.dex */
    public class u implements Runnable {
        public u() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.this.c.onOfferwallOpened();
        }
    }

    /* loaded from: classes3.dex */
    public class v extends Thread {
        public Handler s;

        private v() {
        }

        public /* synthetic */ v(i iVar, byte b) {
            this();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            Looper.prepare();
            this.s = new Handler();
            Looper.loop();
        }
    }

    public i() {
        v vVar = new v(this, (byte) 0);
        this.g = vVar;
        vVar.start();
        this.h = new Date().getTime();
    }

    private void b(Runnable runnable) {
        Handler handler;
        v vVar = this.g;
        if (vVar == null || (handler = vVar.s) == null) {
            return;
        }
        handler.post(runnable);
    }

    private boolean c(Object obj) {
        return (obj == null || this.g == null) ? false : true;
    }

    public final void a(IronSourceError ironSourceError, Map<String, Object> map) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        logger.log(ironSourceTag, "onRewardedVideoAdShowFailed(" + ironSourceError.toString() + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            mediationAdditionalData.put("reason", ironSourceError.getErrorMessage());
            if (!TextUtils.isEmpty(this.f)) {
                mediationAdditionalData.put("placement", this.f);
            }
            if (map != null) {
                for (String str : map.keySet()) {
                    mediationAdditionalData.put(str, map.get(str));
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.RV_CALLBACK_SHOW_FAILED, mediationAdditionalData));
        if (c(this.a)) {
            b(new m(ironSourceError));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.f
    public final void a(boolean z, IronSourceError ironSourceError) {
        String str = "onOfferwallAvailable(isAvailable: " + z + ")";
        if (ironSourceError != null) {
            StringBuilder L = wo1.L(str, ", error: ");
            L.append(ironSourceError.getErrorMessage());
            str = L.toString();
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, str, 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("status", String.valueOf(z));
            if (ironSourceError != null) {
                mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(302, mediationAdditionalData));
        if (c(this.c)) {
            b(new e(z));
        }
    }

    public final void a(boolean z, Map<String, Object> map) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAvailabilityChanged(available:" + z + ")", 1);
        long time = new Date().getTime() - this.h;
        this.h = wo1.T();
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put("duration", time);
            if (map != null) {
                for (String str : map.keySet()) {
                    mediationAdditionalData.put(str, map.get(str));
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(z ? IronSourceConstants.RV_CALLBACK_AVAILABILITY_TRUE : IronSourceConstants.RV_CALLBACK_AVAILABILITY_FALSE, mediationAdditionalData));
        if (c(this.a)) {
            b(new g(z));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        if (c(this.c)) {
            b(new b(ironSourceError));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdClicked() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClicked()", 1);
        if (c(this.b)) {
            b(new s());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdClosed()", 1);
        if (c(this.b)) {
            b(new t());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdLoadFailed(" + ironSourceError + ")", 1);
        if (c(this.b)) {
            b(new o(ironSourceError));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdOpened()", 1);
        if (c(this.b)) {
            b(new p());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdReady() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdReady()", 1);
        if (c(this.b)) {
            b(new n());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onInterstitialAdShowFailed(" + ironSourceError + ")", 1);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            mediationAdditionalData.put(IronSourceConstants.EVENTS_ERROR_CODE, ironSourceError.getErrorCode());
            InterstitialPlacement interstitialPlacement = this.e;
            if (interstitialPlacement != null && !TextUtils.isEmpty(interstitialPlacement.getPlacementName())) {
                mediationAdditionalData.put("placement", this.e.getPlacementName());
            }
            if (ironSourceError.getErrorMessage() != null) {
                mediationAdditionalData.put("reason", ironSourceError.getErrorMessage());
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(IronSourceConstants.IS_CALLBACK_AD_SHOW_ERROR, mediationAdditionalData));
        if (c(this.b)) {
            b(new r(ironSourceError));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialListener
    public final void onInterstitialAdShowSucceeded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onInterstitialAdShowSucceeded()", 1);
        if (c(this.b)) {
            b(new q());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        OfferwallListener offerwallListener = this.c;
        boolean onOfferwallAdCredited = offerwallListener != null ? offerwallListener.onOfferwallAdCredited(i, i2, z) : false;
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallAdCredited(credits:" + i + ", totalCredits:" + i2 + ", totalCreditsFlag:" + z + "):" + onOfferwallAdCredited, 1);
        return onOfferwallAdCredited;
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallAvailable(boolean z) {
        a(z, (IronSourceError) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallClosed()", 1);
        if (c(this.c)) {
            b(new d());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onOfferwallOpened()", 1);
        if (c(this.c)) {
            b(new u());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        if (c(this.c)) {
            b(new a(ironSourceError));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdClicked(Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdClicked(" + placement.getPlacementName() + ")", 1);
        if (c(this.a)) {
            b(new l(placement));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdClosed() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdClosed()", 1);
        if (c(this.a)) {
            b(new f());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdEnded() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdEnded()", 1);
        if (c(this.a)) {
            b(new RunnableC0121i());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdOpened() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdOpened()", 1);
        if (c(this.a)) {
            b(new c());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdRewarded(Placement placement) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onRewardedVideoAdRewarded(" + placement.toString() + ")", 1);
        if (c(this.a)) {
            b(new j(placement));
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a(ironSourceError, (Map<String, Object>) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAdStarted() {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.CALLBACK, "onRewardedVideoAdStarted()", 1);
        if (c(this.a)) {
            b(new h());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoListener
    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        a(z, (Map<String, Object>) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.SegmentListener
    public final void onSegmentReceived(String str) {
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.CALLBACK;
        logger.log(ironSourceTag, "onSegmentReceived(" + str + ")", 1);
        if (c(this.d)) {
            b(new k(str));
        }
    }
}