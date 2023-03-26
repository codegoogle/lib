package com.ironsource.sdk.b;

import android.os.Build;
import android.webkit.WebView;
import com.p7700g.p99005.wo1;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class b {
    public com.ironsource.sdk.b.a a;
    public WebView c;
    public String d;
    public String e = b.class.getSimpleName();
    private String[] f = {"handleGetViewVisibility"};
    private final String[] g = {"loadWithUrl", "updateAd", "isExternalAdViewInitiated", "handleGetViewVisibility", "sendMessage"};
    public d b = new d();

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ String t;

        public a(String str, String str2) {
            this.s = str;
            this.t = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                b.this.c.evaluateJavascript(this.s, null);
            } catch (Throwable unused) {
                String unused2 = b.this.e;
            }
        }
    }

    private static String d(String str) {
        return String.format("window.ssa.onMessageReceived(%1$s)", str);
    }

    private void e(String str) {
        com.ironsource.environment.e.a.a.a(new a("javascript:try{" + str + "}catch(e){console.log(\"JS exception: \" + JSON.stringify(e));}", str));
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("visibilityParams", this.b.a());
            jSONObject.put("configs", jSONObject2);
            jSONObject.put("adViewId", this.d);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return new JSONObject();
        }
    }

    public JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("id", jSONObject.getString("id"));
            jSONObject2.put("data", this.b.a());
        } catch (Exception e) {
            String str = "Error while trying execute method buildVisibilityMessageForAdUnit | params: " + jSONObject;
            e.printStackTrace();
        }
        return jSONObject2;
    }

    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adViewId", this.d);
            a(str, jSONObject);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a(String str, int i, boolean z) {
        d dVar = this.b;
        if (dVar.a.containsKey(str)) {
            dVar.a.put(str, Boolean.valueOf(i == 0));
        }
        dVar.a.put("isShown", Boolean.valueOf(z));
        dVar.a.put("isViewVisible", Boolean.valueOf((dVar.a.get("isWindowVisible").booleanValue() || dVar.a.get("isVisible").booleanValue()) && dVar.a.get("isShown").booleanValue()));
        if (!(Build.VERSION.SDK_INT <= 22 ? str.equalsIgnoreCase("isWindowVisible") : str.equalsIgnoreCase("isVisible")) || this.a == null || this.b == null) {
            return;
        }
        a("containerIsVisible", a());
    }

    public final void a(String str, String str2) {
        com.ironsource.sdk.b.a aVar = this.a;
        if (aVar != null) {
            aVar.a(str, str2, this.d);
        }
    }

    public final void a(String str, String str2, String str3) {
        if (this.c == null) {
            this.a.a(str3, wo1.s("No external adUnit attached to ISNAdView while trying to send message: ", str), this.d);
            return;
        }
        try {
            new JSONObject(str);
        } catch (JSONException unused) {
            str = "\"" + str + "\"";
        }
        e(d(str));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("adViewId", this.d);
        a(str2, jSONObject);
    }

    public final void a(String str, JSONObject jSONObject) {
        com.ironsource.sdk.b.a aVar = this.a;
        if (aVar != null) {
            aVar.a(str, jSONObject);
        }
    }

    public final void b(String str) {
        JSONObject a2 = this.b.a();
        a2.put("adViewId", this.d);
        a(str, a2);
    }

    public boolean c(String str) {
        for (String str2 : this.f) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}