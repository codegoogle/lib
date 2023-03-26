package com.ironsource.sdk.service;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.a;
import com.ironsource.environment.h;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d {
    private static d a;
    private JSONObject b = new JSONObject();

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ Context s;

        public a(Context context) {
            this.s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                d.this.a(b.a(this.s));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private d() {
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (a == null) {
                a = new d();
            }
            dVar = a;
        }
        return dVar;
    }

    private void b(Activity activity) {
        if (activity == null) {
            return;
        }
        a(SDKUtils.encodeString("immersiveMode"), Boolean.valueOf(h.a(activity)));
        a("appOrientation", SDKUtils.translateRequestedOrientation(h.m(activity)));
    }

    private void c(Map<String, String> map) {
        if (map == null) {
            return;
        }
        for (String str : map.keySet()) {
            a(str, SDKUtils.encodeString(map.get(str)));
        }
    }

    private static void d() {
        HashMap hashMap = new HashMap();
        hashMap.put("omidVersion", com.ironsource.sdk.e.a.a.a);
        hashMap.put("omidPartnerVersion", "7");
        a.c(hashMap);
    }

    private void e(Context context) {
        if (context == null) {
            return;
        }
        try {
            new Thread(new a(context)).start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            a("chinaCDN", new JSONObject(str).opt("chinaCDN"));
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private static void g() {
        if (IronSourceQaProperties.isInitialized()) {
            a.c(IronSourceQaProperties.getInstance().getParameters());
        }
    }

    private void h(Context context) {
        if (context == null) {
            return;
        }
        a(b.c(context));
        a(b.b(context));
    }

    public final String a(Context context) {
        try {
            return a.AnonymousClass1.c(b(context).toString());
        } catch (Exception unused) {
            return a.AnonymousClass1.c(new JSONObject().toString());
        }
    }

    public final void a(Context context, String str, String str2) {
        e(context);
        if (context instanceof Activity) {
            b((Activity) context);
        }
        h(context);
        a(str2);
        b(str);
    }

    public final void a(String str) {
        if (str != null) {
            a("applicationUserId", SDKUtils.encodeString(str));
        }
    }

    public final synchronized void a(String str, Object obj) {
        try {
            this.b.put(str, obj);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            a(next, jSONObject.opt(next));
        }
    }

    public final JSONObject b(Context context) {
        b();
        h(context);
        try {
            return new JSONObject(this.b.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public final void b() {
        f(SDKUtils.getControllerConfig());
        c(SDKUtils.getInitSDKParams());
        g();
        d();
    }

    public final void b(String str) {
        if (str != null) {
            a("applicationKey", SDKUtils.encodeString(str));
        }
    }
}