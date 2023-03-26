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
public final class ab extends ac implements RewardedVideoSmashListener {
    private String A;
    private String B;
    private final Object C;
    private final Object D;
    public a h;
    private aa i;
    private Timer j;
    private int k;
    private String l;
    private String m;
    private String n;
    private boolean o;
    private boolean p;
    public boolean q;
    private Placement r;
    private long s;
    private String t;
    private JSONObject u;
    private String v;
    private int w;
    private String x;
    private int y;
    private int z;

    /* loaded from: classes3.dex */
    public enum a {
        NO_INIT,
        INIT_IN_PROGRESS,
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    /* loaded from: classes3.dex */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            int i;
            String str;
            boolean z;
            int i2;
            String str2 = "Rewarded Video - load instance time out";
            synchronized (ab.this.D) {
                a aVar = ab.this.h;
                a aVar2 = a.LOAD_IN_PROGRESS;
                if (aVar != aVar2 && ab.this.h != a.INIT_IN_PROGRESS) {
                    i2 = 0;
                    z = false;
                }
                if (ab.this.h == aVar2) {
                    str = "Rewarded Video - load instance time out";
                    i = 1025;
                } else {
                    i = IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT;
                    str = "Rewarded Video - init instance time out";
                }
                ab.this.u(a.NOT_LOADED);
                z = true;
                String str3 = str;
                i2 = i;
                str2 = str3;
            }
            ab.this.a(str2);
            if (!z) {
                ab.this.b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 1025}, new Object[]{"duration", Long.valueOf(ab.this.I())}, new Object[]{IronSourceConstants.EVENTS_EXT1, ab.this.h.name()}});
                return;
            }
            ab.this.b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"duration", Long.valueOf(ab.this.I())}});
            ab.this.b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(i2)}, new Object[]{"reason", str2}, new Object[]{"duration", Long.valueOf(ab.this.I())}});
            aa aaVar = ab.this.i;
            ab abVar = ab.this;
            aaVar.b(abVar, abVar.t);
        }
    }

    public ab(String str, String str2, NetworkSettings networkSettings, aa aaVar, int i, AbstractAdapter abstractAdapter) {
        super(new com.ironsource.mediationsdk.model.a(networkSettings, networkSettings.getRewardedVideoSettings(), IronSource.AD_UNIT.REWARDED_VIDEO), abstractAdapter);
        this.C = new Object();
        this.D = new Object();
        this.h = a.NO_INIT;
        this.l = str;
        this.m = str2;
        this.i = aaVar;
        this.j = null;
        this.k = i;
        this.a.addRewardedVideoListener(this);
        this.o = false;
        this.p = false;
        this.q = false;
        this.r = null;
        this.t = "";
        this.u = null;
        this.f = 1;
        E();
    }

    private void B(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + k() + " : " + str, 3);
    }

    private void E() {
        this.v = "";
        this.y = -1;
        this.B = "";
        this.n = "";
        this.z = this.f;
        this.A = "";
    }

    private boolean F() {
        try {
            return this.a.isRewardedVideoAvailable(this.d);
        } catch (Exception e) {
            B("isRewardedVideoAvailable exception: " + e.getLocalizedMessage());
            e.printStackTrace();
            b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_isReadyException)}, new Object[]{"reason", e.getLocalizedMessage()}});
            return false;
        }
    }

    private void G() {
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
            a("setCustomParams() " + e.getMessage());
        }
    }

    private void H() {
        synchronized (this.C) {
            Timer timer = this.j;
            if (timer != null) {
                timer.cancel();
                this.j = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long I() {
        return wo1.T() - this.s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "ProgRvSmash " + k() + " : " + str, 0);
    }

    private void s(int i) {
        t(i, null, false);
    }

    private void t(int i, Object[][] objArr, boolean z) {
        Placement placement;
        Map<String, Object> n = n();
        if (!TextUtils.isEmpty(this.t)) {
            n.put("auctionId", this.t);
        }
        JSONObject jSONObject = this.u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.u);
        }
        if (z && (placement = this.r) != null && !TextUtils.isEmpty(placement.getPlacementName())) {
            n.put("placement", this.r.getPlacementName());
        }
        if (z(i)) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(n, this.w, this.x);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f));
        if (objArr != null) {
            try {
                for (Object[] objArr2 : objArr) {
                    n.put(objArr2[0].toString(), objArr2[1]);
                }
            } catch (Exception e) {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + " smash: RV sendMediationEvent " + Log.getStackTraceString(e), 3);
            }
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(i, new JSONObject(n)));
        if (i == 1203) {
            com.ironsource.mediationsdk.utils.o.a().a(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(a aVar) {
        a("current state=" + this.h + ", new state=" + aVar);
        synchronized (this.D) {
            this.h = aVar;
        }
    }

    private void x(String str, String str2, int i, String str3, int i2, String str4) {
        this.v = str2;
        this.n = str;
        this.y = i;
        this.B = str3;
        this.z = i2;
        this.A = str4;
    }

    private static boolean z(int i) {
        return i == 1001 || i == 1002 || i == 1200 || i == 1213 || i == 1212 || i == 1005 || i == 1203 || i == 1201 || i == 1202 || i == 1006 || i == 1010;
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

    public final void a(Placement placement, int i) {
        H();
        a("showVideo()");
        this.r = placement;
        this.f = i;
        u(a.SHOW_IN_PROGRESS);
        a(IronSourceConstants.RV_INSTANCE_SHOW, (Object[][]) null);
        try {
            this.a.showRewardedVideo(this.d, this);
        } catch (Throwable th) {
            B(wo1.E(th, new StringBuilder("showVideo exception: ")));
            th.printStackTrace();
            onRewardedVideoAdShowFailed(new IronSourceError(IronSourceError.ERROR_RV_SHOW_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void a(String str, String str2, JSONObject jSONObject, int i, String str3, int i2, String str4) {
        a aVar;
        a aVar2;
        a("loadVideo() auctionId: " + str2 + " state: " + this.h);
        this.g = null;
        this.c = false;
        this.q = true;
        synchronized (this.D) {
            aVar = this.h;
            aVar2 = a.LOAD_IN_PROGRESS;
            if (aVar != aVar2 && aVar != a.SHOW_IN_PROGRESS) {
                u(aVar2);
            }
        }
        if (aVar == aVar2) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_loadInProgress)}, new Object[]{"reason", "load during load"}});
            this.p = true;
            x(str, str2, i, str3, i2, str4);
            this.i.b(this, str2);
        } else if (aVar == a.SHOW_IN_PROGRESS) {
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_showInProgress)}, new Object[]{"reason", "load during show"}});
            this.o = true;
            x(str, str2, i, str3, i2, str4);
        } else {
            this.e = str4;
            this.t = str2;
            this.u = jSONObject;
            this.w = i;
            this.x = str3;
            this.f = i2;
            synchronized (this.C) {
                H();
                Timer timer = new Timer();
                this.j = timer;
                timer.schedule(new b(), this.k * 1000);
            }
            this.s = wo1.T();
            s(1001);
            try {
                if (h()) {
                    this.a.loadRewardedVideoForBidding(this.d, this, str);
                } else if (aVar != a.NO_INIT) {
                    this.a.fetchRewardedVideoForAutomaticLoad(this.d, this);
                } else {
                    G();
                    this.a.initRewardedVideo(this.l, this.m, this.d, this);
                }
            } catch (Throwable th) {
                B(wo1.E(th, new StringBuilder("loadRewardedVideoForBidding exception: ")));
                th.printStackTrace();
                onRewardedVideoLoadFailed(new IronSourceError(IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, th.getLocalizedMessage()));
                b(IronSourceConstants.TROUBLESHOOTING_RV_SMASH_UNEXPECTED_EXCEPTION, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_loadException)}, new Object[]{"reason", th.getLocalizedMessage()}});
            }
        }
    }

    public final void a(boolean z, int i) {
        this.f = i;
        Object[][] objArr = new Object[1];
        Object[] objArr2 = new Object[2];
        objArr2[0] = "status";
        objArr2[1] = z ? "true" : "false";
        objArr[0] = objArr2;
        t(IronSourceConstants.RV_INSTANCE_SHOW_CHANCE, objArr, true);
    }

    public final void b() {
        a("initForBidding()");
        u(a.INIT_IN_PROGRESS);
        G();
        try {
            this.a.initRewardedVideoForBidding(this.l, this.m, this.d, this);
        } catch (Throwable th) {
            B(wo1.E(th, new StringBuilder("initForBidding exception: ")));
            th.printStackTrace();
            onRewardedVideoInitFailed(new IronSourceError(IronSourceError.ERROR_RV_INIT_EXCEPTION, th.getLocalizedMessage()));
        }
    }

    public final void b(int i, Object[][] objArr) {
        t(i, objArr, false);
    }

    public final boolean c() {
        return h() ? this.q && this.h == a.LOADED && F() : F();
    }

    public final void f() {
        this.a.setMediationState(AbstractC1270b.a.CAPPED_PER_SESSION, IronSourceConstants.AD_UNIT_RV_MEDIATION_STATE);
        t(IronSourceConstants.RV_CAP_SESSION, null, false);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClicked() {
        a("onRewardedVideoAdClicked");
        this.i.b(this, this.r);
        a(1006, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdClosed() {
        a("onRewardedVideoAdClosed");
        synchronized (this.D) {
            if (this.h != a.SHOW_IN_PROGRESS) {
                a(IronSourceConstants.RV_INSTANCE_CLOSED, (Object[][]) null);
                Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_adClosed)};
                b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "adClosed: " + this.h}});
                return;
            }
            u(a.NOT_LOADED);
            this.i.b(this);
            if (this.o) {
                a("onRewardedVideoAdClosed and mShouldLoadAfterClose is true - calling loadRewardedVideoForBidding");
                this.o = false;
                a(this.n, this.v, this.u, this.y, this.B, this.z, this.A);
                E();
            }
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdEnded() {
        a("onRewardedVideoAdEnded");
        this.i.d(this);
        a(IronSourceConstants.RV_INSTANCE_ENDED, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdOpened() {
        a("onRewardedVideoAdOpened");
        this.i.a(this);
        a(1005, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdRewarded() {
        a("onRewardedVideoAdRewarded");
        this.i.a(this, this.r);
        Map<String, Object> n = n();
        Placement placement = this.r;
        if (placement != null) {
            n.put("placement", placement.getPlacementName());
            n.put(IronSourceConstants.EVENTS_REWARD_NAME, this.r.getRewardName());
            n.put(IronSourceConstants.EVENTS_REWARD_AMOUNT, Integer.valueOf(this.r.getRewardAmount()));
        }
        if (!TextUtils.isEmpty(L.a().m)) {
            n.put(IronSourceConstants.EVENTS_DYNAMIC_USER_ID, L.a().m);
        }
        if (L.a().n != null) {
            for (String str : L.a().n.keySet()) {
                n.put(wo1.s("custom_", str), L.a().n.get(str));
            }
        }
        if (!TextUtils.isEmpty(this.t)) {
            n.put("auctionId", this.t);
        }
        JSONObject jSONObject = this.u;
        if (jSONObject != null && jSONObject.length() > 0) {
            n.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.u);
        }
        if (z(1010)) {
            com.ironsource.mediationsdk.a.h.d();
            com.ironsource.mediationsdk.a.b.a(n, this.w, this.x);
        }
        n.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.valueOf(this.f));
        com.ironsource.mediationsdk.a.c cVar = new com.ironsource.mediationsdk.a.c(1010, new JSONObject(n));
        cVar.a(IronSourceConstants.EVENTS_TRANS_ID, IronSourceUtils.getTransId(cVar.b(), k()));
        com.ironsource.mediationsdk.a.h.d().b(cVar);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoAdShowFailed error=" + ironSourceError.getErrorMessage());
        a(IronSourceConstants.RV_INSTANCE_SHOW_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}});
        synchronized (this.D) {
            if (this.h == a.SHOW_IN_PROGRESS) {
                u(a.NOT_LOADED);
                this.i.a(ironSourceError, this);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_showFailed)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "showFailed: " + this.h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdStarted() {
        a("onRewardedVideoAdStarted");
        this.i.c(this);
        a(IronSourceConstants.RV_INSTANCE_STARTED, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAdVisible() {
        a("onRewardedVideoAdVisible");
        a(IronSourceConstants.RV_INSTANCE_VISIBLE, (Object[][]) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoAvailabilityChanged(boolean z) {
        boolean z2;
        a("onRewardedVideoAvailabilityChanged available=" + z + " state=" + this.h.name());
        synchronized (this.D) {
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
                b(IronSourceConstants.RV_INSTANCE_AVAILABILITY_FALSE, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_UNEXPECTED_CALLBACK)}, new Object[]{"duration", Long.valueOf(I())}, new Object[]{IronSourceConstants.EVENTS_EXT1, this.h.name()}});
                return;
            }
        }
        H();
        b(z ? 1002 : IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(I())}});
        if (!this.p) {
            if (z) {
                this.i.a(this, this.t);
                return;
            } else {
                this.i.b(this, this.t);
                return;
            }
        }
        this.p = false;
        a("onRewardedVideoAvailabilityChanged to " + z + "and mShouldLoadAfterLoad is true - calling loadVideo");
        a(this.n, this.v, this.u, this.y, this.B, this.z, this.A);
        E();
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        a("onRewardedVideoInitFailed error=" + ironSourceError.getErrorMessage());
        H();
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_RV_LOAD_FAIL_DUE_TO_INIT)}, new Object[]{"duration", Long.valueOf(I())}});
        b(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(I())}});
        synchronized (this.D) {
            if (this.h == a.INIT_IN_PROGRESS) {
                u(a.NO_INIT);
                this.i.b(this, this.t);
                return;
            }
            Object[] objArr = {IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceConstants.errorCode_initFailed)};
            b(IronSourceConstants.RV_SMASH_UNEXPECTED_STATE, new Object[][]{objArr, new Object[]{"reason", "initFailed: " + this.h}});
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoInitSuccess() {
        a("onRewardedVideoInitSuccess");
        synchronized (this.D) {
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
            t(IronSourceConstants.RV_INSTANCE_LOAD_NO_FILL, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"duration", Long.valueOf(I())}}, false);
            return;
        }
        if (ironSourceError.getErrorCode() == 1057) {
            this.g = Long.valueOf(System.currentTimeMillis());
        }
        t(IronSourceConstants.RV_INSTANCE_LOAD_FAILED_REASON, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(I())}}, false);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public final void onRewardedVideoLoadSuccess() {
    }
}