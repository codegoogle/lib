package com.anythink.splashad.a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.anythink.core.api.ATBaseAdAdapter;
import com.anythink.core.api.ATCustomLoadListener;
import com.anythink.core.api.ATMediationRequestInfo;
import com.anythink.core.api.AdError;
import com.anythink.core.api.BaseAd;
import com.anythink.core.api.ErrorCode;
import com.anythink.core.common.b.g;
import com.anythink.core.common.b.m;
import com.anythink.core.common.j.h;
import com.anythink.core.common.j.i;
import com.anythink.core.common.l;
import com.anythink.core.common.t;
import com.anythink.splashad.unitgroup.api.CustomSplashAdapter;
import com.p7700g.p99005.yc0;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class d {
    public boolean a;
    public b b;
    public long c;
    public com.anythink.core.common.e.b d;
    public String e;
    public String f;
    public String g;
    public int h;
    public String i;
    public String j;
    public int k = -1;
    public Map<String, Object> l;
    private Context m;
    private boolean n;

    /* renamed from: com.anythink.splashad.a.d$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            b bVar = d.this.b;
            if (bVar != null) {
                bVar.onAdLoaded();
            }
            d.this.b = null;
        }
    }

    /* renamed from: com.anythink.splashad.a.d$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements Runnable {
        public final /* synthetic */ CustomSplashAdapter a;
        public final /* synthetic */ AdError b;

        public AnonymousClass2(CustomSplashAdapter customSplashAdapter, AdError adError) {
            this.a = customSplashAdapter;
            this.b = adError;
        }

        @Override // java.lang.Runnable
        public final void run() {
            CustomSplashAdapter customSplashAdapter = this.a;
            if (customSplashAdapter != null) {
                customSplashAdapter.destory();
            }
            b bVar = d.this.b;
            if (bVar != null) {
                bVar.onAdLoadFail(this.b);
            }
            d.this.b = null;
        }
    }

    /* loaded from: classes2.dex */
    public class a implements ATCustomLoadListener {
        public CustomSplashAdapter a;

        public a(CustomSplashAdapter customSplashAdapter) {
            this.a = customSplashAdapter;
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdCacheLoaded(BaseAd... baseAdArr) {
            d.this.a(this.a, baseAdArr);
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdDataLoaded() {
        }

        @Override // com.anythink.core.api.ATCustomLoadListener
        public final void onAdLoadError(String str, String str2) {
            d.this.a(this.a, ErrorCode.getErrorCode(ErrorCode.noADError, str, str2));
        }
    }

    public d(Context context) {
        this.m = context.getApplicationContext();
    }

    private void b() {
        m.a().a(new AnonymousClass1());
    }

    private void c() {
        this.b = null;
    }

    private void d() {
        this.d = null;
    }

    private void e() {
        com.anythink.core.common.e.e eVar = new com.anythink.core.common.e.e();
        eVar.v(this.f);
        eVar.w(this.e);
        eVar.x("4");
        eVar.u("0");
        eVar.a(true);
        com.anythink.core.common.i.c.a(eVar, ErrorCode.getErrorCode(ErrorCode.timeOutError, "", "Splash FetchAd Timeout."));
    }

    private com.anythink.core.common.e.b f() {
        com.anythink.core.common.e.b bVar = this.d;
        if (bVar == null || bVar.d() > 0) {
            return null;
        }
        return this.d;
    }

    private com.anythink.core.common.e.b g() {
        return this.d;
    }

    public final void a(CustomSplashAdapter customSplashAdapter, BaseAd... baseAdArr) {
        if (this.a) {
            return;
        }
        if (customSplashAdapter != null) {
            customSplashAdapter.getTrackingInfo().d(SystemClock.elapsedRealtime() - this.c);
            customSplashAdapter.getTrackingInfo().g(customSplashAdapter.getNetworkPlacementId());
            com.anythink.core.common.j.g.a(customSplashAdapter.getTrackingInfo(), g.i.b, g.i.f, "");
            com.anythink.core.common.i.a.a(this.m).a(12, customSplashAdapter.getTrackingInfo());
            com.anythink.core.common.i.a.a(this.m).a(2, customSplashAdapter.getTrackingInfo());
            com.anythink.core.common.e.b bVar = new com.anythink.core.common.e.b();
            bVar.b(0);
            bVar.a(customSplashAdapter);
            bVar.c(System.currentTimeMillis());
            bVar.b(yc0.B);
            bVar.a(customSplashAdapter.getTrackingInfo().T());
            bVar.a(yc0.B);
            if (baseAdArr != null && baseAdArr.length > 0) {
                baseAdArr[0].setTrackingInfo(customSplashAdapter.getTrackingInfo().M());
                bVar.a(baseAdArr[0]);
            }
            this.d = bVar;
        }
        this.a = true;
        this.n = false;
        m.a().a(new AnonymousClass1());
    }

    private void b(CustomSplashAdapter customSplashAdapter, AdError adError) {
        m.a().a(new AnonymousClass2(customSplashAdapter, adError));
    }

    public final void a(CustomSplashAdapter customSplashAdapter, AdError adError) {
        if (this.a) {
            return;
        }
        if (customSplashAdapter != null) {
            com.anythink.core.common.j.g.a(customSplashAdapter.getTrackingInfo(), g.i.b, g.i.g, adError.printStackTrace());
        }
        this.a = true;
        this.n = false;
        m.a().a(new AnonymousClass2(customSplashAdapter, adError));
    }

    public final boolean a() {
        return this.n;
    }

    public final void a(Context context, String str, String str2, ATMediationRequestInfo aTMediationRequestInfo, String str3, b bVar, int i) {
        this.b = bVar;
        this.e = str2;
        this.f = str;
        if (!TextUtils.isEmpty(str3)) {
            this.g = "0";
            this.l = new HashMap(1);
            try {
                JSONObject jSONObject = new JSONObject(str3);
                this.g = jSONObject.optString("unit_id");
                this.h = jSONObject.optInt("nw_firm_id");
                this.i = jSONObject.optString(l.z);
                this.j = jSONObject.optString("content");
                this.k = jSONObject.optInt("ad_type", -1);
                Map<String, Object> c = h.c(this.j);
                this.l = c;
                c.put("ad_type", Integer.valueOf(this.k));
            } catch (Throwable th) {
                th.printStackTrace();
            }
        } else if (aTMediationRequestInfo != null) {
            this.g = aTMediationRequestInfo.getAdSourceId();
            this.h = aTMediationRequestInfo.getNetworkFirmId();
            this.i = aTMediationRequestInfo.getClassName();
            Map<String, Object> requestParamMap = aTMediationRequestInfo.getRequestParamMap();
            this.l = requestParamMap;
            this.k = 4;
            requestParamMap.put("ad_type", 4);
        }
        m.a();
        m.l(this.g);
        com.anythink.core.common.e.e eVar = new com.anythink.core.common.e.e();
        eVar.v(str);
        eVar.w(str2);
        eVar.u(this.h);
        eVar.x("4");
        eVar.l(TextUtils.isEmpty(this.g) ? "0" : this.g);
        eVar.u("0");
        eVar.a(true);
        if (!TextUtils.isEmpty(this.j)) {
            eVar.n(this.j);
        }
        if (!TextUtils.isEmpty(str3)) {
            eVar.c(8);
        }
        eVar.w(this.k);
        try {
            ATBaseAdAdapter a2 = i.a(this.i);
            if (a2 instanceof CustomSplashAdapter) {
                ((CustomSplashAdapter) a2).setFetchAdTimeout(i);
                this.n = true;
                this.a = false;
                this.c = SystemClock.elapsedRealtime();
                try {
                    eVar.t(a2.getNetworkName());
                    eVar.u = a2.getNetworkSDKVersion();
                    eVar.q = 2;
                } catch (Throwable unused) {
                }
                a2.setTrackingInfo(eVar);
                com.anythink.core.common.j.g.a(eVar, g.i.a, g.i.h, "");
                com.anythink.core.common.i.a.a(this.m).a(10, eVar);
                com.anythink.core.common.i.a.a(this.m).a(1, eVar);
                a2.internalLoad(context, this.l, t.a().c(str), new a((CustomSplashAdapter) a2));
                return;
            }
            throw new Exception("The class isn't instanceof CustomSplashAdapter");
        } catch (Throwable th2) {
            if (this.b != null) {
                this.b.onAdLoadFail(ErrorCode.getErrorCode("2002", "", th2.getMessage()));
            }
            this.b = null;
        }
    }

    private void a(String str) {
        this.g = "0";
        this.l = new HashMap(1);
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.g = jSONObject.optString("unit_id");
            this.h = jSONObject.optInt("nw_firm_id");
            this.i = jSONObject.optString(l.z);
            this.j = jSONObject.optString("content");
            this.k = jSONObject.optInt("ad_type", -1);
            Map<String, Object> c = h.c(this.j);
            this.l = c;
            c.put("ad_type", Integer.valueOf(this.k));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void a(ATMediationRequestInfo aTMediationRequestInfo) {
        this.g = aTMediationRequestInfo.getAdSourceId();
        this.h = aTMediationRequestInfo.getNetworkFirmId();
        this.i = aTMediationRequestInfo.getClassName();
        Map<String, Object> requestParamMap = aTMediationRequestInfo.getRequestParamMap();
        this.l = requestParamMap;
        this.k = 4;
        requestParamMap.put("ad_type", 4);
    }
}