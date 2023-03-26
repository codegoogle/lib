package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.n;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class ac implements n.a {
    public AbstractAdapter a;
    public a b;
    public boolean c;
    public JSONObject d;
    public String e;
    public int f;
    public Long g = null;

    public ac(a aVar, AbstractAdapter abstractAdapter) {
        this.b = aVar;
        this.a = abstractAdapter;
        this.d = aVar.b;
    }

    private String q() {
        return this.b.a.isMultipleInstances() ? this.b.a.getProviderTypeForReflection() : this.b.a.getProviderName();
    }

    public final void b(String str) {
        C1274f.a();
        this.e = C1274f.d(str);
    }

    public void d() {
        try {
            AbstractAdapter abstractAdapter = this.a;
            if (abstractAdapter != null) {
                abstractAdapter.releaseMemory(this.b.f, this.d);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception - " + e.getMessage());
        }
        this.a = null;
    }

    public int e() {
        return 1;
    }

    public final boolean h() {
        return this.b.c;
    }

    public final int i() {
        return this.b.d;
    }

    @Override // com.ironsource.mediationsdk.utils.n.a
    public final int j() {
        return this.b.e;
    }

    @Override // com.ironsource.mediationsdk.utils.n.a
    public final String k() {
        return this.b.a.getProviderName();
    }

    public final String l() {
        return this.b.a.getProviderTypeForReflection();
    }

    public final int m() {
        return this.f;
    }

    public final Map<String, Object> n() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.b.a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.b.a.getAdSourceNameForEvents());
            hashMap.put("instanceType", Integer.valueOf(h() ? 2 : 1));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(e()));
            if (!TextUtils.isEmpty(this.e)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.e);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + k() + ")", e);
        }
        return hashMap;
    }

    public final Long o() {
        return this.g;
    }

    public final String p() {
        return String.format("%s %s", q(), Integer.valueOf(hashCode()));
    }
}