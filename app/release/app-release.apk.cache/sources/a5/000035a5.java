package com.ironsource.sdk.c;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.ironsource.sdk.a.f;
import com.ironsource.sdk.c.e;
import com.ironsource.sdk.utils.Logger;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class c implements e {
    private static final String s = "c";
    public String b;
    public com.ironsource.sdk.b.b d;
    public com.ironsource.sdk.a e;
    public final String t;
    public WebView u;
    private Activity v;

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
                if (c.this.u != null) {
                    c.this.u.destroy();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adViewId", c.this.t);
                if (c.this.d != null) {
                    c.this.d.a(this.s, jSONObject);
                    com.ironsource.sdk.b.b bVar = c.this.d;
                    bVar.a = null;
                    bVar.b = null;
                }
                c.this.d = null;
                c.this.v = null;
            } catch (Exception e) {
                String unused = c.s;
                String unused2 = c.this.t;
                com.ironsource.sdk.a.d.a(f.o, new com.ironsource.sdk.a.a().a("callfailreason", e.getMessage()).a);
                c.this.b(this.t, e.getMessage());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements e.a {
        private /* synthetic */ String a;

        public b(String str) {
            this.a = str;
        }

        @Override // com.ironsource.sdk.c.e.a
        public final void a(String str) {
            String str2 = c.s;
            Logger.i(str2, "ISNAdViewWebPresenter | WebViewClient | reportOnError: " + str);
            c.this.b(this.a, str);
        }

        @Override // com.ironsource.sdk.c.e.a
        public final void b(String str) {
            String str2 = c.s;
            Logger.i(str2, "ISNAdViewWebPresenter | WebViewClient | onRenderProcessGone: " + str);
            try {
                ((ViewGroup) c.this.u.getParent()).removeView(c.this.u);
            } catch (Exception e) {
                e.printStackTrace();
            }
            c.this.i();
        }
    }

    public c(com.ironsource.sdk.b.a aVar, Activity activity, String str, com.ironsource.sdk.a aVar2) {
        this.v = activity;
        com.ironsource.sdk.b.b bVar = new com.ironsource.sdk.b.b();
        this.d = bVar;
        bVar.d = str;
        this.t = str;
        bVar.a = aVar;
        this.e = aVar2;
    }

    public static /* synthetic */ void e(c cVar, String str) {
        Logger.i(s, "ISNAdViewWebPresenter | createWebView");
        WebView webView = new WebView(cVar.v);
        cVar.u = webView;
        webView.addJavascriptInterface(new com.ironsource.sdk.c.b(cVar), "containerMsgHandler");
        cVar.u.setWebViewClient(new com.ironsource.sdk.b.c(new b(str)));
        com.ironsource.sdk.utils.d.a(cVar.u);
        cVar.d.c = cVar.u;
    }

    public static /* synthetic */ String g(c cVar, String str) {
        if (str.startsWith(CryptoConstants.ALIAS_SEPARATOR)) {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(cVar.b);
            String substring = str.substring(str.indexOf("/") + 1);
            sb.append(substring.substring(substring.indexOf("/")));
            return sb.toString();
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void i() {
        a("", "");
    }

    @Override // com.ironsource.sdk.c.e
    public final synchronized void a(String str, String str2) {
        if (this.v == null) {
            return;
        }
        Logger.i(s, "performCleanup");
        com.ironsource.environment.e.a.a.a(new a(str, str2));
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            b(str3, "action parameter empty");
            return;
        }
        String str4 = s;
        Logger.i(str4, "trying to perform WebView Action: " + str);
        try {
            if (str.equals("onPause")) {
                this.u.onPause();
            } else if (!str.equals("onResume")) {
                b(str3, "action not supported");
                return;
            } else {
                this.u.onResume();
            }
            this.d.a(str2);
        } catch (Exception unused) {
            b(str3, "failed to perform action");
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final void a(JSONObject jSONObject, String str, String str2) {
        try {
            this.d.b(str);
        } catch (Exception e) {
            String str3 = s;
            Logger.i(str3, "sendHandleGetViewVisibility fail with reason: " + e.getMessage());
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final WebView b() {
        return this.u;
    }

    public final void b(String str, String str2) {
        com.ironsource.sdk.b.b bVar = this.d;
        if (bVar != null) {
            bVar.a(str, str2);
        }
    }

    @Override // com.ironsource.sdk.c.e
    public final void b(JSONObject jSONObject, String str, String str2) {
        try {
            this.d.a(jSONObject.getString("params"), str, str2);
        } catch (Exception e) {
            String str3 = s;
            Logger.i(str3, "sendMessageToAd fail message: " + e.getMessage());
            throw e;
        }
    }

    @JavascriptInterface
    public void handleMessageFromAd(String str) {
        com.ironsource.sdk.b.b bVar = this.d;
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("method");
            if (TextUtils.isEmpty(optString) || !bVar.c(optString)) {
                bVar.a("containerSendMessage", jSONObject);
            } else if (optString.equalsIgnoreCase("handleGetViewVisibility")) {
                bVar.a(bVar.a(jSONObject).toString(), (String) null, (String) null);
            }
        } catch (JSONException e) {
            String str2 = bVar.e;
            e.printStackTrace();
        }
    }
}