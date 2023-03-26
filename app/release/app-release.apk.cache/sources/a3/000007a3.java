package com.anythink.expressad.atsignalcommon.windvane;

import android.text.TextUtils;
import android.util.Base64;
import android.webkit.WebView;
import com.p7700g.p99005.hq0;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class j implements b {
    private static j a = new j();

    private j() {
    }

    public static j a() {
        return a;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.b
    public final void b(Object obj, String str) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str)) {
                String.format("javascript:window.WindVane.onFailure(%s,'');", aVar.g);
            } else {
                str = n.c(str);
            }
            String format = String.format("javascript:window.WindVane.onFailure(%s,'%s');", aVar.g, str);
            WindVaneWebView windVaneWebView = aVar.a;
            if (windVaneWebView == null || windVaneWebView.isDestroyed()) {
                return;
            }
            try {
                aVar.a.loadUrl(format);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.b
    public final void a(Object obj, String str, String str2) {
        String format;
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str2)) {
                format = String.format("javascript:window.WindVane.fireEvent('%s', '');", str);
            } else {
                format = String.format("javascript:window.WindVane.fireEvent('%s','%s');", str, n.c(str2));
            }
            WindVaneWebView windVaneWebView = aVar.a;
            if (windVaneWebView == null || windVaneWebView.isDestroyed()) {
                return;
            }
            try {
                aVar.a.loadUrl(format);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void b(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", hq0.f);
            a(webView, "onJSBridgeConnected", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            a(webView, "onJSBridgeConnected", "");
        } catch (Throwable unused2) {
            a(webView, "onJSBridgeConnected", "");
        }
    }

    public static void a(WebView webView, String str, String str2) {
        String format;
        if (TextUtils.isEmpty(str2)) {
            format = String.format("javascript:window.WindVane.fireEvent('%s', '');", str);
        } else {
            format = String.format("javascript:window.WindVane.fireEvent('%s','%s');", str, n.c(str2));
        }
        if (webView != null) {
            if ((webView instanceof WindVaneWebView) && ((WindVaneWebView) webView).isDestroyed()) {
                return;
            }
            try {
                webView.loadUrl(format);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.b
    public final void a(Object obj, String str) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            String format = TextUtils.isEmpty(str) ? String.format("javascript:window.WindVane.onSuccess(%s,'');", aVar.g) : String.format("javascript:window.WindVane.onSuccess(%s,'%s');", aVar.g, n.c(str));
            WindVaneWebView windVaneWebView = aVar.a;
            if (windVaneWebView == null || windVaneWebView.isDestroyed()) {
                return;
            }
            try {
                aVar.a.loadUrl(format);
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void a(WebView webView) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("api_version", hq0.f);
            a(webView, com.anythink.expressad.atsignalcommon.base.e.j, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Exception unused) {
            a(webView, com.anythink.expressad.atsignalcommon.base.e.j, "");
        } catch (Throwable unused2) {
            a(webView, com.anythink.expressad.atsignalcommon.base.e.j, "");
        }
    }
}