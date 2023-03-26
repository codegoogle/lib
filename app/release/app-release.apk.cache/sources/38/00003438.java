package com.ironsource.mediationsdk;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.mediationsdk.AbstractC1270b;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.p7700g.p99005.wo1;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class N extends ac implements RewardedVideoSmashListener {
    public a h;
    private O i;
    private Timer j;
    private int k;
    private String l;
    private String m;
    private Placement n;
    private long o;
    public String p;
    private JSONObject q;
    private int r;
    private String s;
    private final Object t;
    private final Object u;
    private long v;

    /* loaded from: classes3.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS,
        ENDED
    }

    /* loaded from: classes3.dex */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            int i;
            boolean z;
            a aVar = N.this.h;
            a aVar2 = a.LOAD_IN_PROGRESS;
            String str = "Rewarded Video - load instance time out";
            if (aVar == aVar2 || N.this.h == a.INIT_IN_PROGRESS) {
                if (N.this.h == aVar2) {
                    i = 1025;
                } else {
                    i = IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT;
                    str = "Rewarded Video - init instance time out";
                }
                N.this.u(a.NOT_LOADED);
                z = true;
            } else {
                i = 0;
                z = false;
            }
            N.this.A(str);
            if (!z) {
                N.this.b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(N.this.F())}, new Object[]{IronSourceConstants.EVENTS_EXT1, N.this.h.name()}});
                return;
            }
            N.this.b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"duration", Long.valueOf(N.this.F())}});
            N.this.b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i)}, new Object[]{"reason", str}, new Object[]{"duration", Long.valueOf(N.this.F())}});
            N.this.i.b(N.this);
        }
    }

    public N(N n, O o, AbstractAdapter abstractAdapter, int i, String str, JSONObject jSONObject, int i2, String str2) {
        this(n.l, n.m, n.b.a, o, n.k, abstractAdapter, i);
        this.p = str;
        this.q = jSONObject;
        this.r = i2;
        this.s = str2;
    }

    public N(String str, String str2, NetworkSettings networkSettings, O o, int i, AbstractAdapter abstractAdapter, int i2) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.t = new Object();
        this.u = new Object();
        this.l = str;
        this.m = str2;
        this.i = o;
        this.j = null;
        this.k = i;
        this.a.updateRewardedVideoListener(this);
        this.f = i2;
        this.h = a.NO_INIT;
        this.v = 0L;
        if (this.b.c) {
            A("initForBidding()");
            u(a.INIT_IN_PROGRESS);
            D();
            try {
                this.a.initRewardedVideoForBidding(this.l, this.m, this.d, this);
            } catch (Throwable th) {
                B(wo1.E(th, new StringBuilder("initForBidding exception: ")));
                th.printStackTrace();
                onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + k() + " " + hashCode() + "  : " + str, 0);
    }

    private void B(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "LWSProgRvSmash " + k() + " " + hashCode() + " : " + str, 3);
    }

    private boolean C() {
        try {
            return this.a.isRewardedVideoAvailable(this.d);
        } catch (Exception e) {
            B("isRewardedVideoAvailable exception: " + e.getLocalizedMessage());
            e.printStackTrace();
            b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_isReadyException)}, new Object[]{"reason", e.getLocalizedMessage()}});
            return false;
        }
    }

    private void D() {
        try {
            String str = L.a().v;
            if (!TextUtils.isEmpty(str)) {
                this.a.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (TextUtils.isEmpty(pluginType)) {
                return;
            }
            this.a.setPluginData(pluginType, ConfigFile.getConfigFile().getPluginFrameworkVersion());
        } catch (Exception e) {
            A("setCustomParams() " + e.getMessage());
        }
    }

    private void E() {
        synchronized (this.u) {
            Timer timer = this.j;
            if (timer != null) {
                timer.cancel();
                this.j = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long F() {
        return wo1.T() - this.o;
    }

    private void s(int i) {
        t(i, null, false);
    }

    private void t(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> n = n();
        if (!TextUtils.isEmpty(this.p)) {
            n.put("auctionId", this.p);
        }
        JSONObject jSONObject = this.q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.q);
        }
        if (z && (placement = this.n) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n.put("placement", this.n.getPlacementName());
        }
        if (y(i)) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(n, this.r, this.s);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + " smash: RV sendProviderEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i, new JSONObject(n)));
        if (i == 1203) {
            com.ironsource.mediationsdk.utils.o.a().a(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(a aVar) {
        A("current state=" + this.h + ", new state=" + aVar);
        synchronized (this.t) {
            this.h = aVar;
        }
    }

    private static boolean y(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1212 || i == 1213 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
    }

    public final Map<String, Object> a() {
        try {
            if (h()) {
                return this.a.getRewardedVideoBiddingData(this.d);
            }
            return null;
        } catch (Throwable th) {
            B(wo1.E(th, new StringBuilder("getBiddingData exception: ")));
            th.printStackTrace();
            b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_biddingDataException)}, new Object[]{"reason", th.getLocalizedMessage()}});
            return null;
        }
    }

    public final void a(int i, Object[][] objArr) {
        t(i, objArr, true);
    }

    public final void a(Placement placement) {
        E();
        A("showVideo()");
        this.n = placement;
        u(a.SHOW_IN_PROGRESS);
        a(IronSourceConstants.RV_INSTANCE_SHOW, null);
        try {
            this.a.showRewardedVideo(this.d, this);
        } catch (Throwable th) {
            B(wo1.E(th, new StringBuilder("showVideo exception: ")));
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void a(String str) {
        a aVar;
        a aVar2;
        A("loadVideo() auctionId: " + this.p + " state: " + this.h);
        this.g = null;
        this.c = false;
        synchronized (this.t) {
            aVar = this.h;
            aVar2 = a.LOAD_IN_PROGRESS;
            if (aVar != aVar2 && aVar != a.SHOW_IN_PROGRESS) {
                u(aVar2);
            }
        }
        if (aVar == aVar2) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_loadInProgress)}, new Object[]{"reason", "load during load"}});
        } else if (aVar == a.SHOW_IN_PROGRESS) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_showInProgress)}, new Object[]{"reason", "load during show"}});
        } else {
            synchronized (this.u) {
                Timer timer = new Timer();
                this.j = timer;
                timer.schedule(new b(), this.k * 1000);
            }
            this.o = wo1.T();
            s(1001);
            try {
                if (h()) {
                    this.a.loadRewardedVideoForBidding(this.d, this, str);
                    return;
                }
                D();
                this.a.initRewardedVideo(this.l, this.m, this.d, this);
            } catch (Throwable th) {
                B(wo1.E(th, new StringBuilder("loadVideo exception: ")));
                th.printStackTrace();
                b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(h() ? IronSourceConstants.errorCode_loadException : IronSourceConstants.errorCode_initFailed)}, new Object[]{"reason", th.getLocalizedMessage()}});
            }
        }
    }

    public final void a(boolean z) {
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[0] = objArr2;
        t(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    public final void b(int i, Object[][] objArr) {
        t(i, objArr, false);
    }

    public final boolean b() {
        return h() ? this.h == a.LOADED && C() : C();
    }

    public final void b_() {
        this.a.setMediationState(AbstractC1270b.a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        t(IronSourceConstants.RV_CAP_SESSION, null, false);
    }

    public final LoadWhileShowSupportState c() {
        try {
            return this.a.getLoadWhileShowSupportState(this.d);
        } catch (Exception e) {
            B("Exception while calling adapter.getLoadWhileShowSupportState() - " + e.getLocalizedMessage());
            return LoadWhileShowSupportState.NONE;
        }
    }

    @Override // com.ironsource.mediationsdk.ac
    public final int e() {
        return 2;
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        A("onRewardedVideoAdClicked");
        this.i.b(this, this.n);
        a(1006, null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        A("onRewardedVideoAdClosed");
        synchronized (this.t) {
            if (this.h == a.SHOW_IN_PROGRESS) {
                u(a.ENDED);
                this.v = wo1.T();
                this.i.d(this);
                return;
            }
            a(IronSourceConstants.RV_INSTANCE_CLOSED, null);
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_adClosed)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "adClosed: " + this.h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
        A("onRewardedVideoAdEnded");
        this.i.f(this);
        a(IronSourceConstants.RV_INSTANCE_ENDED, null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        A("onRewardedVideoAdOpened");
        this.i.c(this);
        a(1005, null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        A("onRewardedVideoAdRewarded");
        long T = wo1.T();
        this.i.a(this, this.n);
        Map<String, Object> n = n();
        Placement placement = this.n;
        if (placement != null) {
            n.put("placement", placement.getPlacementName());
            n.put(IronSourceConstants.EVENTS_REWARD_NAME, this.n.getRewardName());
            n.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.n.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(L.a().m)) {
            n.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, L.a().m);
        }
        if (L.a().n != null) {
            for (String str : L.a().n.keySet()) {
                n.put(wo1.s("custom_", str), L.a().n.get(str));
            }
        }
        if (!TextUtils.isEmpty(this.p)) {
            n.put("auctionId", this.p);
        }
        JSONObject jSONObject = this.q;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.q);
        }
        if (y(1010)) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(n, this.r, this.s);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f));
        com.ironsource.mediationsdk.a.c cVar = new com.ironsource.mediationsdk.a.c(1010, new JSONObject(n));
        cVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(cVar.b(), k()));
        long j = this.v;
        if (j != 0) {
            long j2 = T - j;
            A("onRewardedVideoAdRewarded timeAfterClosed=" + j2);
            cVar.a("duration", Long.valueOf(j2));
        }
        com.ironsource.mediationsdk.a.h.d().b(cVar);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        A("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        a(IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        synchronized (this.t) {
            if (this.h == a.SHOW_IN_PROGRESS) {
                u(a.ENDED);
                this.i.a(ironSourceError, this);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_showFailed)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "showFailed: " + this.h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
        A("onRewardedVideoAdStarted");
        this.i.e(this);
        a(IronSourceConstants.RV_INSTANCE_STARTED, null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        A("onRewardedVideoAdVisible");
        a(IronSourceConstants.RV_INSTANCE_VISIBLE, null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        A("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.h.name());
        synchronized (this.t) {
            if (this.h == a.LOAD_IN_PROGRESS) {
                u(z ? a.LOADED : a.NOT_LOADED);
                z2 = false;
            } else {
                z2 = true;
            }
        }
        if (z2) {
            if (z) {
                b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_TRUE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_EXT1, this.h.name()}});
                return;
            } else {
                b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{"duration", Long.valueOf(F())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.h.name()}});
                return;
            }
        }
        E();
        b(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(F())}});
        if (z) {
            this.i.a(this);
        } else {
            this.i.b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        A("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        E();
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{"duration", Long.valueOf(F())}});
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(F())}});
        synchronized (this.t) {
            if (this.h == a.INIT_IN_PROGRESS) {
                u(a.NO_INIT);
                this.i.b(this);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_initFailed)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "initFailed: " + this.h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
        A("onRewardedVideoInitSuccess");
        synchronized (this.t) {
            if (this.h == a.INIT_IN_PROGRESS) {
                u(a.NOT_LOADED);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_initSuccess)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "initSuccess: " + this.h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
        if (ironSourceError.getErrorCode() == 1058) {
            t(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(F())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.g = Long.valueOf(System.currentTimeMillis());
        }
        t(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(F())}}, false);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
    }
}