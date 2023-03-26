package com.ironsource.mediationsdk;

import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C1283q;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.sdk.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.p  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1282p implements a {
    private C1283q a;
    private IronSourceBannerLayout b;
    private com.ironsource.mediationsdk.model.g c;
    private String f;
    private String g;
    private long i;
    private Timer j;
    private com.ironsource.mediationsdk.utils.f m;
    private com.ironsource.mediationsdk.utils.f n;
    private int o;
    private int p;
    private final CopyOnWriteArrayList<C1283q> h = new CopyOnWriteArrayList<>();
    private IronSourceLoggerManager e = IronSourceLoggerManager.getLogger();
    private c d = c.NOT_INITIATED;
    private AtomicBoolean l = new AtomicBoolean();
    private AtomicBoolean k = new AtomicBoolean();

    /* renamed from: com.ironsource.mediationsdk.p$b */
    /* loaded from: classes3.dex */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            C1282p.h(C1282p.this);
        }
    }

    /* renamed from: com.ironsource.mediationsdk.p$c */
    /* loaded from: classes3.dex */
    public enum c {
        NOT_INITIATED,
        READY_TO_LOAD,
        FIRST_LOAD_IN_PROGRESS,
        LOAD_IN_PROGRESS,
        RELOAD_IN_PROGRESS
    }

    public C1282p(List<NetworkSettings> list, String str, String str2, long j, int i, int i2) {
        this.f = str;
        this.g = str2;
        this.i = i;
        C1281o.a().d = i2;
        for (int i3 = 0; i3 < list.size(); i3++) {
            NetworkSettings networkSettings = list.get(i3);
            AbstractAdapter a = C1272d.a().a(networkSettings, networkSettings.getBannerSettings(), false, false);
            if (a == null || !C1273e.a().a(a)) {
                i(networkSettings.getProviderInstanceName() + " can't load adapter or wrong version");
            } else {
                this.h.add(new C1283q(this, networkSettings, a, j, i3 + 1));
            }
        }
        this.c = null;
        g(c.READY_TO_LOAD);
    }

    private void a(int i) {
        e(i, null);
    }

    private void b(int i, C1283q c1283q) {
        c(i, c1283q, null);
    }

    private void c(int i, C1283q c1283q, Object[][] objArr) {
        d(i, c1283q, objArr, this.p);
    }

    private void d(int i, C1283q c1283q, Object[][] objArr, int i2) {
        JSONObject providerAdditionalData = IronSourceUtils.getProviderAdditionalData(c1283q);
        try {
            IronSourceBannerLayout ironSourceBannerLayout = this.b;
            if (ironSourceBannerLayout != null) {
                j(providerAdditionalData, ironSourceBannerLayout.getSize());
            }
            com.ironsource.mediationsdk.model.g gVar = this.c;
            if (gVar != null) {
                providerAdditionalData.put("placement", gVar.getPlacementName());
            }
            providerAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    providerAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            this.e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendProviderEvent " + Log.getStackTraceString(e), 3);
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i, providerAdditionalData));
    }

    private void e(int i, Object[][] objArr) {
        f(i, objArr, this.p);
    }

    private void f(int i, Object[][] objArr, int i2) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(false);
        try {
            IronSourceBannerLayout ironSourceBannerLayout = this.b;
            if (ironSourceBannerLayout != null) {
                j(mediationAdditionalData, ironSourceBannerLayout.getSize());
            }
            com.ironsource.mediationsdk.model.g gVar = this.c;
            if (gVar != null) {
                mediationAdditionalData.put("placement", gVar.getPlacementName());
            }
            mediationAdditionalData.put(IronSourceConstants.KEY_SESSION_DEPTH, i2);
            if (objArr != null) {
                for (Object[] objArr2 : objArr) {
                    mediationAdditionalData.put(objArr2[0].toString(), objArr2[1]);
                }
            }
        } catch (Exception e) {
            this.e.log(IronSourceLogger.IronSourceTag.INTERNAL, "sendMediationEvent " + Log.getStackTraceString(e), 3);
        }
        com.ironsource.mediationsdk.a.d.d().b(new com.ironsource.mediationsdk.a.c(i, mediationAdditionalData));
    }

    private void g(c cVar) {
        this.d = cVar;
        i("state=" + cVar.name());
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void h(C1282p c1282p) {
        boolean z;
        boolean globalVisibleRect;
        String str;
        if (c1282p.d != c.RELOAD_IN_PROGRESS) {
            c1282p.i("onReloadTimer wrong state=" + c1282p.d.name());
            return;
        }
        String str2 = null;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("checking with IronsourceLifecycleManager if app in foreground");
        if (com.ironsource.lifecycle.d.a().b()) {
            str2 = "app in background - start reload timer";
        } else {
            IronSourceBannerLayout ironSourceBannerLayout = c1282p.b;
            if (ironSourceBannerLayout == null) {
                ironLog.verbose("banner is null");
            } else {
                if (!ironSourceBannerLayout.isShown()) {
                    str = "banner or one of its parents are INVISIBLE or GONE";
                } else if (c1282p.b.hasWindowFocus()) {
                    globalVisibleRect = c1282p.b.getGlobalVisibleRect(new Rect());
                    ironLog.verbose("visible = " + globalVisibleRect);
                    if (!globalVisibleRect) {
                        c1282p.p = com.ironsource.mediationsdk.utils.o.a().b(3);
                        c1282p.a(IronSourceConstants.BN_RELOAD);
                        c1282p.b(IronSourceConstants.BN_INSTANCE_RELOAD, c1282p.a);
                        c1282p.m = new com.ironsource.mediationsdk.utils.f();
                        c1282p.n = new com.ironsource.mediationsdk.utils.f();
                        C1283q c1283q = c1282p.a;
                        c1283q.e("reloadBanner()");
                        IronSourceBannerLayout ironSourceBannerLayout2 = c1283q.i;
                        if (ironSourceBannerLayout2 == null || ironSourceBannerLayout2.isDestroyed()) {
                            c1283q.g.a(new IronSourceError(610, c1283q.i != null ? "banner is destroyed" : "banner is null"), c1283q, false);
                        } else {
                            c1283q.h();
                            c1283q.b(C1283q.a.LOADED);
                            c1283q.a.reloadBanner(c1283q.i, c1283q.b.getBannerSettings(), c1283q);
                        }
                        z = false;
                        if (z) {
                            return;
                        }
                        ironLog.verbose(str2);
                        c1282p.e(IronSourceConstants.BN_SKIP_RELOAD, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf((int) IronSourceError.ERROR_BN_RELOAD_SKIP_BACKGROUND)}});
                        c1282p.p();
                        return;
                    }
                    str2 = "banner is not visible - start reload timer";
                } else {
                    str = "banner has no window focus";
                }
                ironLog.verbose(str);
            }
            globalVisibleRect = false;
            if (!globalVisibleRect) {
            }
        }
        z = true;
        if (z) {
        }
    }

    private void i(String str) {
        IronSourceLoggerManager ironSourceLoggerManager = this.e;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, "BannerManager " + str, 0);
    }

    private void j(JSONObject jSONObject, ISBannerSize iSBannerSize) {
        try {
            String description = iSBannerSize.getDescription();
            char c2 = 65535;
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals("RECTANGLE")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 72205083:
                    if (description.equals("LARGE")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 79011241:
                    if (description.equals("SMART")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            if (c2 == 0) {
                jSONObject.put("bannerAdSize", 1);
            } else if (c2 == 1) {
                jSONObject.put("bannerAdSize", 2);
            } else if (c2 == 2) {
                jSONObject.put("bannerAdSize", 3);
            } else if (c2 == 3) {
                jSONObject.put("bannerAdSize", 5);
            } else if (c2 != 4) {
            } else {
                jSONObject.put("bannerAdSize", 6);
                jSONObject.put("custom_banner_size", iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight());
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = this.e;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager.log(ironSourceTag, "sendProviderEvent " + Log.getStackTraceString(e), 3);
        }
    }

    private boolean k() {
        IronSourceBannerLayout ironSourceBannerLayout = this.b;
        return (ironSourceBannerLayout == null || ironSourceBannerLayout.isDestroyed()) ? false : true;
    }

    private void l() {
        Iterator<C1283q> it = this.h.iterator();
        while (it.hasNext()) {
            it.next().h = true;
        }
    }

    private void m(C1283q c1283q, View view, FrameLayout.LayoutParams layoutParams) {
        this.a = c1283q;
        this.b.c(view, layoutParams);
    }

    private void n(C1283q c1283q, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("bindView = " + z + " smash - " + c1283q.a());
        c(IronSourceConstants.BN_INSTANCE_RELOAD_SUCCESS, c1283q, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
        e(IronSourceConstants.BN_CALLBACK_RELOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.m))}});
        this.o = com.ironsource.mediationsdk.utils.o.a().b(3);
        com.ironsource.mediationsdk.utils.o.a().a(3);
        if (z) {
            m(c1283q, view, layoutParams);
        }
        p();
    }

    private boolean o() {
        Iterator<C1283q> it = this.h.iterator();
        while (it.hasNext()) {
            C1283q next = it.next();
            if (next.h && this.a != next) {
                c(this.d == c.FIRST_LOAD_IN_PROGRESS ? IronSourceConstants.BN_INSTANCE_LOAD : IronSourceConstants.BN_INSTANCE_RELOAD, next, null);
                this.n = new com.ironsource.mediationsdk.utils.f();
                next.a(this.b.b(), this.f, this.g);
                return true;
            }
        }
        return false;
    }

    private void p() {
        try {
            q();
            if (this.i > 0) {
                Timer timer = new Timer();
                this.j = timer;
                timer.schedule(new b(), this.i * 1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void q() {
        Timer timer = this.j;
        if (timer != null) {
            timer.cancel();
            this.j = null;
        }
    }

    public final synchronized void a(IronSourceBannerLayout ironSourceBannerLayout) {
        if (ironSourceBannerLayout == null) {
            this.e.log(IronSourceLogger.IronSourceTag.API, "destroyBanner banner cannot be null", 3);
        } else if (ironSourceBannerLayout.isDestroyed()) {
            this.e.log(IronSourceLogger.IronSourceTag.API, "Banner is already destroyed and can't be used anymore. Please create a new one using IronSource.createBanner API", 3);
        } else {
            f(IronSourceConstants.BN_DESTROY, null, this.o);
            q();
            C1283q c1283q = this.a;
            if (c1283q != null) {
                c(IronSourceConstants.BN_INSTANCE_DESTROY, c1283q, null);
                C1283q c1283q2 = this.a;
                c1283q2.e("destroyBanner()");
                AbstractAdapter abstractAdapter = c1283q2.a;
                if (abstractAdapter == null) {
                    c1283q2.e("destroyBanner() mAdapter == null");
                } else {
                    abstractAdapter.destroyBanner(c1283q2.b.getBannerSettings());
                    c1283q2.b(C1283q.a.DESTROYED);
                }
                this.a = null;
            }
            ironSourceBannerLayout.h();
            this.b = null;
            this.c = null;
            g(c.READY_TO_LOAD);
        }
    }

    public final synchronized void a(IronSourceBannerLayout ironSourceBannerLayout, com.ironsource.mediationsdk.model.g gVar) {
        if (ironSourceBannerLayout != null) {
            try {
                if (!ironSourceBannerLayout.isDestroyed()) {
                    if (gVar != null && !TextUtils.isEmpty(gVar.getPlacementName())) {
                        c cVar = this.d;
                        c cVar2 = c.READY_TO_LOAD;
                        if (cVar == cVar2 && !C1281o.a().b()) {
                            this.p = com.ironsource.mediationsdk.utils.o.a().b(3);
                            g(c.FIRST_LOAD_IN_PROGRESS);
                            this.b = ironSourceBannerLayout;
                            this.c = gVar;
                            e(3001, null);
                            if (com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getCurrentActiveActivity(), gVar.getPlacementName())) {
                                C1281o a = C1281o.a();
                                a.a(ironSourceBannerLayout, new IronSourceError(604, "placement " + gVar.getPlacementName() + " is capped"));
                                e(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 604}});
                                g(cVar2);
                                return;
                            }
                            this.m = new com.ironsource.mediationsdk.utils.f();
                            Iterator<C1283q> it = this.h.iterator();
                            while (it.hasNext()) {
                                it.next().h = true;
                            }
                            this.n = new com.ironsource.mediationsdk.utils.f();
                            C1283q c1283q = this.h.get(0);
                            c(IronSourceConstants.BN_INSTANCE_LOAD, c1283q, null);
                            c1283q.a(ironSourceBannerLayout.b(), this.f, this.g);
                            return;
                        }
                        this.e.log(IronSourceLogger.IronSourceTag.API, "A banner is already loaded", 3);
                        return;
                    }
                    Object[] objArr = new Object[1];
                    objArr[0] = gVar == null ? "placement is null" : "placement name is empty";
                    this.e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr), 3);
                    return;
                }
            } catch (Exception e) {
                C1281o a2 = C1281o.a();
                a2.a(ironSourceBannerLayout, new IronSourceError(605, "loadBanner() failed " + e.getMessage()), false);
                e(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 605}, new Object[]{"reason", e.getMessage()}});
                g(c.READY_TO_LOAD);
                return;
            }
        }
        Object[] objArr2 = new Object[1];
        objArr2[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
        this.e.log(IronSourceLogger.IronSourceTag.API, String.format("can't load banner - %s", objArr2), 3);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(IronSourceError ironSourceError, C1283q c1283q, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + c1283q.a());
        c cVar = this.d;
        c cVar2 = c.FIRST_LOAD_IN_PROGRESS;
        if (cVar != cVar2 && cVar != c.LOAD_IN_PROGRESS) {
            i("onBannerAdLoadFailed " + c1283q.a() + " wrong state=" + this.d.name());
            return;
        }
        if (z) {
            c(IronSourceConstants.BN_INSTANCE_LOAD_NO_FILL, c1283q, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
        } else {
            c(IronSourceConstants.BN_INSTANCE_LOAD_ERROR, c1283q, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
        }
        if (o()) {
            return;
        }
        if (this.d == cVar2) {
            C1281o.a().a(this.b, new IronSourceError(606, "No ads to show"), false);
            e(IronSourceConstants.BN_CALLBACK_LOAD_ERROR, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, 606}, new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.m))}});
            g(c.READY_TO_LOAD);
            return;
        }
        e(IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.m))}});
        g(c.RELOAD_IN_PROGRESS);
        p();
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(C1283q c1283q) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c1283q.a());
        Object[][] objArr = null;
        if (k()) {
            C1280n.a().d((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        f(IronSourceConstants.BN_CALLBACK_CLICK, objArr, this.o);
        d(IronSourceConstants.BN_INSTANCE_CLICK, c1283q, objArr, this.o);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(C1283q c1283q, View view, FrameLayout.LayoutParams layoutParams) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c1283q.a());
        c cVar = this.d;
        if (cVar != c.FIRST_LOAD_IN_PROGRESS) {
            if (cVar != c.LOAD_IN_PROGRESS) {
                c(IronSourceConstants.BN_INSTANCE_UNEXPECTED_LOAD_SUCCESS, c1283q, null);
                return;
            }
            g(c.RELOAD_IN_PROGRESS);
            n(c1283q, view, layoutParams, true);
            return;
        }
        c(IronSourceConstants.BN_INSTANCE_LOAD_SUCCESS, c1283q, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
        m(c1283q, view, layoutParams);
        com.ironsource.mediationsdk.model.g gVar = this.c;
        String placementName = gVar != null ? gVar.getPlacementName() : "";
        com.ironsource.mediationsdk.utils.k.f(ContextProvider.getInstance().getCurrentActiveActivity(), placementName);
        if (com.ironsource.mediationsdk.utils.k.b(ContextProvider.getInstance().getCurrentActiveActivity(), placementName)) {
            e(IronSourceConstants.BN_PLACEMENT_CAPPED, null);
        }
        e(IronSourceConstants.BN_CALLBACK_LOAD_SUCCESS, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.m))}});
        this.b.d(null, false);
        this.o = com.ironsource.mediationsdk.utils.o.a().b(3);
        com.ironsource.mediationsdk.utils.o.a().a(3);
        g(c.RELOAD_IN_PROGRESS);
        p();
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void a(C1283q c1283q, View view, FrameLayout.LayoutParams layoutParams, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c1283q.a());
        if (this.d == c.RELOAD_IN_PROGRESS) {
            IronSourceUtils.sendAutomationLog("bannerReloadSucceeded");
            n(c1283q, view, layoutParams, z);
            return;
        }
        i("onBannerAdReloaded " + c1283q.a() + " wrong state=" + this.d.name());
        c(IronSourceConstants.BN_INSTANCE_UNEXPECTED_RELOAD_SUCCESS, c1283q, null);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void b(IronSourceError ironSourceError, C1283q c1283q, boolean z) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("error = " + ironSourceError.getErrorMessage() + " smash - " + c1283q.a());
        if (this.d != c.RELOAD_IN_PROGRESS) {
            i("onBannerAdReloadFailed " + c1283q.a() + " wrong state=" + this.d.name());
            return;
        }
        if (z) {
            c(IronSourceConstants.BN_INSTANCE_RELOAD_NO_FILL, c1283q, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
        } else {
            c(IronSourceConstants.BN_INSTANCE_RELOAD_ERROR, c1283q, new Object[][]{new Object[]{IronSourceConstants.EVENTS_ERROR_CODE, Integer.valueOf(ironSourceError.getErrorCode())}, new Object[]{"reason", ironSourceError.getErrorMessage()}, new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.n))}});
        }
        if (this.h.size() == 1) {
            e(IronSourceConstants.BN_RELOAD_FAILED, new Object[][]{new Object[]{"duration", Long.valueOf(com.ironsource.mediationsdk.utils.f.a(this.m))}});
            p();
            return;
        }
        g(c.LOAD_IN_PROGRESS);
        l();
        o();
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void b(C1283q c1283q) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c1283q.a());
        Object[][] objArr = null;
        if (k()) {
            C1280n.a().b((AdInfo) null);
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        f(IronSourceConstants.BN_CALLBACK_DISMISS_SCREEN, objArr, this.o);
        d(IronSourceConstants.BN_INSTANCE_DISMISS_SCREEN, c1283q, objArr, this.o);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void c(C1283q c1283q) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c1283q.a());
        Object[][] objArr = null;
        if (k()) {
            C1280n.a().a(null);
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        f(IronSourceConstants.BN_CALLBACK_PRESENT_SCREEN, objArr, this.o);
        d(IronSourceConstants.BN_INSTANCE_PRESENT_SCREEN, c1283q, objArr, this.o);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void d(C1283q c1283q) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c1283q.a());
        Object[][] objArr = null;
        if (k()) {
            C1280n.a().c(null);
        } else {
            objArr = new Object[][]{new Object[]{"reason", "banner is destroyed"}};
        }
        f(IronSourceConstants.BN_CALLBACK_LEAVE_APP, objArr, this.o);
        d(IronSourceConstants.BN_INSTANCE_LEAVE_APP, c1283q, objArr, this.o);
    }

    @Override // com.ironsource.mediationsdk.sdk.a
    public final void e(C1283q c1283q) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("smash - " + c1283q.a());
        e(IronSourceConstants.BN_CALLBACK_SHOW, null);
        c(IronSourceConstants.BN_INSTANCE_SHOW, c1283q, null);
    }
}