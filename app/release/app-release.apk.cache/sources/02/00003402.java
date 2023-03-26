package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.pg1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class A {
    public AbstractAdapter a;
    public com.ironsource.mediationsdk.model.a c;
    public JSONObject d;
    public long g;
    public String k;
    private final Object l = new Object();
    private final Object m = new Object();
    private a e = a.NOT_LOADED;
    private Timer f = null;
    public String h = "";
    public JSONObject i = null;
    public List<String> j = new ArrayList();

    /* loaded from: classes3.dex */
    public enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public A(com.ironsource.mediationsdk.model.a aVar, AbstractAdapter abstractAdapter) {
        this.c = aVar;
        this.a = abstractAdapter;
        this.d = aVar.b;
    }

    public static void c(List<String> list, String str, int i, String str2, String str3) {
        for (String str4 : (List) com.ironsource.mediationsdk.c.a.a((ArrayList) list, new ArrayList())) {
            C1274f.a();
            String a2 = C1274f.a(str4, str, i, str2, "", "", "", "");
            C1274f.a();
            C1274f.h(str3, str, a2);
        }
    }

    public final a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.l) {
            aVar2 = this.e;
            if (Arrays.asList(aVarArr).contains(this.e)) {
                b(aVar);
            }
        }
        return aVar2;
    }

    public final void a(String str) {
        C1274f.a();
        this.k = C1274f.d(str);
    }

    public final void a(JSONObject jSONObject) {
        this.i = jSONObject;
    }

    public final void a(boolean z) {
        try {
            this.d.put("isOneFlow", z);
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("Can't set isOneFlow = " + z + ". Error: " + e.getMessage());
        }
    }

    public final void b(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.c.a.getProviderName() + ": current state=" + this.e + ", new state=" + aVar);
        synchronized (this.l) {
            this.e = aVar;
        }
    }

    public final void b(String str) {
        this.h = str;
    }

    public Map<String, Object> d() {
        HashMap hashMap = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.a;
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.c.a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.c.a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (this.c.c) {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                hashMap.put("instanceType", 2);
                if (!TextUtils.isEmpty(this.h)) {
                    hashMap.put("auctionId", this.h);
                }
                JSONObject jSONObject = this.i;
                if (jSONObject != null && jSONObject.length() > 0) {
                    hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.i);
                }
            } else {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 0);
                hashMap.put("instanceType", 1);
            }
            if (!TextUtils.isEmpty(this.k)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.k);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + e() + ")", e);
        }
        return hashMap;
    }

    public final void d(TimerTask timerTask) {
        synchronized (this.m) {
            j();
            Timer timer = new Timer();
            this.f = timer;
            timer.schedule(timerTask, this.g);
        }
    }

    public final String e() {
        return this.c.a.getProviderName();
    }

    public final boolean e(a aVar, a aVar2) {
        synchronized (this.l) {
            if (this.e == aVar) {
                b(aVar2);
                return true;
            }
            return false;
        }
    }

    public final int f() {
        return this.c.d;
    }

    public final boolean f(a aVar) {
        boolean z;
        synchronized (this.l) {
            z = this.e == aVar;
        }
        return z;
    }

    public final String g() {
        return this.c.a.getSubProviderId();
    }

    public final boolean h() {
        return this.d.optBoolean("isOneFlow", false);
    }

    public final String i() {
        a aVar = this.e;
        return aVar == null ? pg1.d : aVar.toString();
    }

    public final void j() {
        synchronized (this.m) {
            Timer timer = this.f;
            if (timer != null) {
                timer.cancel();
                this.f = null;
            }
        }
    }

    public final boolean k() {
        return this.c.c;
    }
}