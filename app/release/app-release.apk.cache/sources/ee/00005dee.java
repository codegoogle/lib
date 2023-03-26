package com.p7700g.p99005;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C1272d;
import com.ironsource.mediationsdk.L;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class te3 {
    private static te3 a;
    private JSONObject b = new JSONObject();

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                te3.this.e(te3.h());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private te3() {
    }

    public static synchronized te3 a() {
        te3 te3Var;
        synchronized (te3.class) {
            if (a == null) {
                a = new te3();
            }
            te3Var = a;
        }
        return te3Var;
    }

    private synchronized void d(String str, Object obj) {
        try {
            this.b.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            d(next, jSONObject.opt(next));
        }
    }

    private void g() {
        e(j());
        e(i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static JSONObject h() {
        String str;
        boolean z;
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            String[] C = com.ironsource.environment.h.C(applicationContext);
            String str2 = "";
            if (C == null || C.length != 2) {
                str = "";
                z = false;
            } else {
                str = !TextUtils.isEmpty(C[0]) ? C[0] : "";
                z = Boolean.valueOf(C[1]).booleanValue();
            }
            if (TextUtils.isEmpty(str)) {
                str = com.ironsource.environment.h.x(applicationContext);
                if (!TextUtils.isEmpty(str)) {
                    str2 = IronSourceConstants.TYPE_UUID;
                }
            } else {
                str2 = IronSourceConstants.TYPE_GAID;
            }
            try {
                jSONObject.put("advId", str);
                jSONObject.put("advType", str2);
                jSONObject.put("isLAT", z);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    private static JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        int k = com.ironsource.environment.h.k();
        int l = com.ironsource.environment.h.l();
        float o = com.ironsource.environment.h.o();
        if (applicationContext != null) {
            try {
                ConcurrentHashMap<String, List<String>> concurrentHashMap = C1272d.a().i;
                concurrentHashMap.putAll(com.ironsource.d.a.a().d());
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, List<String>> entry : concurrentHashMap.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                Boolean bool = L.a().R;
                if (bool != null) {
                    jSONObject.put("consent", bool.booleanValue());
                }
                String B = com.ironsource.environment.h.B(applicationContext);
                if (!TextUtils.isEmpty(B)) {
                    jSONObject.put("asid", B);
                }
                jSONObject.put("connT", IronSourceUtils.getConnectionType(applicationContext));
                jSONObject.put("dVol", com.ironsource.environment.h.l(applicationContext));
                jSONObject.put("root", com.ironsource.environment.h.j());
                jSONObject.put("bat", com.ironsource.environment.h.v(applicationContext));
                jSONObject.put("diskFS", com.ironsource.environment.h.p());
                jSONObject.put("MD", jSONObject2);
                jSONObject.put("cTime", new Date().getTime());
                jSONObject.put("dWidth", k);
                jSONObject.put("dHeight", l);
                jSONObject.put("dScrenScle", String.valueOf(o));
                jSONObject.put("sDepIS", com.ironsource.mediationsdk.utils.o.a().b(2));
                jSONObject.put("sDepRV", com.ironsource.mediationsdk.utils.o.a().b(1));
                jSONObject.put("UA", com.ironsource.environment.h.r());
            } catch (JSONException e) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e.getMessage());
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    private static JSONObject j() {
        JSONObject jSONObject = new JSONObject();
        Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        if (applicationContext != null) {
            try {
                String language = applicationContext.getResources().getConfiguration().locale.getLanguage();
                if (!TextUtils.isEmpty(language)) {
                    jSONObject.put("dLang", language.toUpperCase(Locale.ENGLISH));
                }
                String pluginType = ConfigFile.getConfigFile().getPluginType();
                if (!TextUtils.isEmpty(pluginType)) {
                    jSONObject.put("plType", pluginType);
                }
                String e = com.ironsource.environment.h.e();
                if (e != null) {
                    jSONObject.put("dOSVF", e);
                    jSONObject.put("dOSV", e.replaceAll("[^0-9/.]", ""));
                }
                String y = com.ironsource.environment.h.y(applicationContext);
                if (y != null) {
                    jSONObject.put("auid", y);
                }
                jSONObject.put("sId", IronSourceUtils.getSessionId());
                jSONObject.put("appKey", L.a().j);
                jSONObject.put("mCar", com.ironsource.environment.h.i(applicationContext));
                jSONObject.put("medV", IronSourceUtils.getSDKVersion());
                jSONObject.put("dModel", Build.MODEL);
                jSONObject.put("dOS", pt0.a);
                jSONObject.put("dMake", Build.MANUFACTURER);
                jSONObject.put("dAPI", String.valueOf(Build.VERSION.SDK_INT));
                jSONObject.put("bId", applicationContext.getPackageName());
                jSONObject.put("appV", com.ironsource.environment.c.c(applicationContext, applicationContext.getPackageName()));
                jSONObject.put("usId", L.a().k);
            } catch (JSONException e2) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("got the following error " + e2.getMessage());
                e2.printStackTrace();
            }
        }
        return jSONObject;
    }

    public final JSONObject f() {
        g();
        return this.b;
    }
}