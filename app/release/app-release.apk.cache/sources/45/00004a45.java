package com.p7700g.p99005;

import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class je3 implements com.ironsource.mediationsdk.sdk.f {
    public com.ironsource.mediationsdk.sdk.j b;
    public com.ironsource.mediationsdk.sdk.f c;
    private com.ironsource.mediationsdk.utils.l g;
    private NetworkSettings h;
    private String i;
    private final String a = je3.class.getName();
    private AtomicBoolean e = new AtomicBoolean(true);
    private AtomicBoolean f = new AtomicBoolean(false);
    private IronSourceLoggerManager d = IronSourceLoggerManager.getLogger();

    private synchronized void a(IronSourceError ironSourceError) {
        AtomicBoolean atomicBoolean = this.f;
        if (atomicBoolean != null) {
            atomicBoolean.set(false);
        }
        AtomicBoolean atomicBoolean2 = this.e;
        if (atomicBoolean2 != null) {
            atomicBoolean2.set(true);
        }
        com.ironsource.mediationsdk.sdk.f fVar = this.c;
        if (fVar != null) {
            fVar.a(false, ironSourceError);
        }
    }

    private AbstractAdapter b(String str) {
        try {
            L a = L.a();
            AbstractAdapter H = a.H(str);
            if (H == null) {
                Class<?> cls = Class.forName("com.ironsource.adapters." + str.toLowerCase(Locale.ENGLISH) + CryptoConstants.ALIAS_SEPARATOR + str + "Adapter");
                H = (AbstractAdapter) cls.getMethod(IronSourceConstants.START_ADAPTER, String.class).invoke(cls, str);
                if (H == null) {
                    return null;
                }
            }
            a.v(H);
            return H;
        } catch (Throwable th) {
            IronSourceLoggerManager ironSourceLoggerManager = this.d;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.log(ironSourceTag, str + " initialization failed - please verify that required dependencies are in you build path.", 2);
            this.d.logException(ironSourceTag, wo1.C(new StringBuilder(), this.a, ":startOfferwallAdapter"), th);
            return null;
        }
    }

    public final void a(String str) {
        com.ironsource.mediationsdk.sdk.j jVar;
        String str2 = "OWManager:showOfferwall(" + str + ")";
        try {
            if (!IronSourceUtils.isNetworkConnected(ContextProvider.getInstance().getCurrentActiveActivity())) {
                this.c.onOfferwallShowFailed(ErrorBuilder.buildNoInternetConnectionShowFailError(IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            this.i = str;
            com.ironsource.mediationsdk.model.k a = this.g.c.c.a(str);
            if (a == null) {
                IronSourceLoggerManager ironSourceLoggerManager = this.d;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
                ironSourceLoggerManager.log(ironSourceTag, "Placement is not valid, please make sure you are using the right placements, using the default placement.", 3);
                a = this.g.c.c.a();
                if (a == null) {
                    this.d.log(ironSourceTag, "Default placement was not found, please make sure you are using the right placements.", 3);
                    return;
                }
            }
            this.d.log(IronSourceLogger.IronSourceTag.INTERNAL, str2, 1);
            AtomicBoolean atomicBoolean = this.f;
            if (atomicBoolean == null || !atomicBoolean.get() || (jVar = this.b) == null) {
                return;
            }
            jVar.showOfferwall(String.valueOf(a.a), this.h.getRewardedVideoSettings());
        } catch (Exception e) {
            this.d.logException(IronSourceLogger.IronSourceTag.INTERNAL, str2, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0036, B:7:0x003a, B:9:0x003e, B:12:0x0045, B:14:0x0050, B:16:0x0054, B:19:0x0061, B:21:0x006b, B:24:0x0078, B:26:0x007e, B:29:0x008b, B:31:0x0093, B:32:0x0096, B:34:0x009e, B:38:0x00db, B:37:0x00c1), top: B:46:0x0001, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[Catch: all -> 0x00f4, TRY_ENTER, TryCatch #1 {, blocks: (B:3:0x0001, B:5:0x0036, B:7:0x003a, B:9:0x003e, B:12:0x0045, B:14:0x0050, B:16:0x0054, B:19:0x0061, B:21:0x006b, B:24:0x0078, B:26:0x007e, B:29:0x008b, B:31:0x0093, B:32:0x0096, B:34:0x009e, B:38:0x00db, B:37:0x00c1), top: B:46:0x0001, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(String str, String str2) {
        String str3;
        com.ironsource.mediationsdk.utils.l lVar;
        com.ironsource.mediationsdk.model.h hVar;
        com.ironsource.mediationsdk.model.j jVar;
        IronSourceLoggerManager ironSourceLoggerManager = this.d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
        ironSourceLoggerManager.log(ironSourceTag, this.a + ":initOfferwall(appKey: " + str + ", userId: " + str2 + ")", 1);
        com.ironsource.mediationsdk.utils.l lVar2 = L.a().u;
        this.g = lVar2;
        if (lVar2 != null && (hVar = lVar2.c) != null && (jVar = hVar.c) != null && jVar.b() != null) {
            str3 = lVar2.c.c.b();
            lVar = this.g;
            if (lVar != null) {
                a(ErrorBuilder.buildInitFailedError("Please check configurations for Offerwall adapters", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            NetworkSettings a = lVar.b.a(str3);
            this.h = a;
            if (a == null) {
                a(ErrorBuilder.buildInitFailedError("Please check configurations for Offerwall adapters", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            AbstractAdapter b = b(str3);
            if (b == null) {
                a(ErrorBuilder.buildInitFailedError("Please check configurations for Offerwall adapters", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            try {
                String str4 = L.a().v;
                if (str4 != null) {
                    b.setMediationSegment(str4);
                }
                Boolean bool = L.a().R;
                if (bool != null) {
                    IronSourceLoggerManager ironSourceLoggerManager2 = this.d;
                    IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.ADAPTER_API;
                    ironSourceLoggerManager2.log(ironSourceTag2, "Offerwall | setConsent(consent:" + bool + ")", 1);
                    b.setConsent(bool.booleanValue());
                }
            } catch (Exception e) {
                IronSourceLoggerManager ironSourceLoggerManager3 = this.d;
                IronSourceLogger.IronSourceTag ironSourceTag3 = IronSourceLogger.IronSourceTag.INTERNAL;
                ironSourceLoggerManager3.log(ironSourceTag3, ":setCustomParams():" + e.toString(), 3);
            }
            b.setLogListener(this.d);
            com.ironsource.mediationsdk.sdk.j jVar2 = (com.ironsource.mediationsdk.sdk.j) b;
            this.b = jVar2;
            jVar2.setInternalOfferwallListener(this);
            this.b.initOfferwall(str, str2, this.h.getRewardedVideoSettings());
            return;
        }
        str3 = IronSourceConstants.SUPERSONIC_CONFIG_NAME;
        lVar = this.g;
        if (lVar != null) {
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.f
    public final void a(boolean z, IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallAvailable(isAvailable: " + z + ")", 1);
        if (!z) {
            a(ironSourceError);
            return;
        }
        this.f.set(true);
        com.ironsource.mediationsdk.sdk.f fVar = this.c;
        if (fVar != null) {
            fVar.onOfferwallAvailable(true);
        }
    }

    public final synchronized boolean a() {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.f;
        return atomicBoolean != null ? atomicBoolean.get() : false;
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onGetOfferwallCreditsFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onGetOfferwallCreditsFailed(" + ironSourceError + ")", 1);
        com.ironsource.mediationsdk.sdk.f fVar = this.c;
        if (fVar != null) {
            fVar.onGetOfferwallCreditsFailed(ironSourceError);
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final boolean onOfferwallAdCredited(int i, int i2, boolean z) {
        this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallAdCredited()", 1);
        com.ironsource.mediationsdk.sdk.f fVar = this.c;
        if (fVar != null) {
            return fVar.onOfferwallAdCredited(i, i2, z);
        }
        return false;
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallAvailable(boolean z) {
        a(z, (IronSourceError) null);
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallClosed() {
        this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallClosed()", 1);
        com.ironsource.mediationsdk.sdk.f fVar = this.c;
        if (fVar != null) {
            fVar.onOfferwallClosed();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallOpened() {
        this.d.log(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK, "onOfferwallOpened()", 1);
        int b = com.ironsource.mediationsdk.utils.o.a().b(0);
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            if (!TextUtils.isEmpty(this.i)) {
                mediationAdditionalData.put("placement", this.i);
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, b);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        com.ironsource.mediationsdk.a.h.d().b(new com.ironsource.mediationsdk.a.c(305, mediationAdditionalData));
        com.ironsource.mediationsdk.utils.o.a().a(0);
        com.ironsource.mediationsdk.sdk.f fVar = this.c;
        if (fVar != null) {
            fVar.onOfferwallOpened();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.OfferwallListener
    public final void onOfferwallShowFailed(IronSourceError ironSourceError) {
        IronSourceLoggerManager ironSourceLoggerManager = this.d;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK;
        ironSourceLoggerManager.log(ironSourceTag, "onOfferwallShowFailed(" + ironSourceError + ")", 1);
        com.ironsource.mediationsdk.sdk.f fVar = this.c;
        if (fVar != null) {
            fVar.onOfferwallShowFailed(ironSourceError);
        }
    }
}