package com.anythink.expressad.atsignalcommon.windvane;

import android.text.TextUtils;
import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class g implements b {
    private static g a = new g();

    private g() {
    }

    private static g a() {
        return a;
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.b
    public final void b(Object obj, String str) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str)) {
                String.format("javascript:window.MvBridge.onFailure(%s,'');", aVar.g);
            } else {
                str = n.c(str);
            }
            String format = String.format("javascript:window.MvBridge.onFailure(%s,'%s');", aVar.g, str);
            WindVaneWebView windVaneWebView = aVar.a;
            if (windVaneWebView != null) {
                try {
                    windVaneWebView.loadUrl(format);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    @Override // com.anythink.expressad.atsignalcommon.windvane.b
    public final void a(Object obj, String str, String str2) {
        String format;
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (TextUtils.isEmpty(str2)) {
                format = String.format("javascript:window.MvBridge.fireEvent('%s', '');", str);
            } else {
                format = String.format("javascript:window.MvBridge.fireEvent('%s','%s');", str, n.c(str2));
            }
            WindVaneWebView windVaneWebView = aVar.a;
            if (windVaneWebView != null) {
                try {
                    windVaneWebView.loadUrl(format);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }

    private static void a(WebView webView, String str, String str2) {
        String format;
        if (TextUtils.isEmpty(str2)) {
            format = String.format("javascript:window.MvBridge.fireEvent('%s', '');", str);
        } else {
            format = String.format("javascript:window.MvBridge.fireEvent('%s','%s');", str, n.c(str2));
        }
        if (webView != null) {
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
            String format = TextUtils.isEmpty(str) ? String.format("javascript:window.OW.onSuccess(%s,'');", aVar.g) : String.format("javascript:window.OW.onSuccess(%s,'%s');", aVar.g, n.c(str));
            WindVaneWebView windVaneWebView = aVar.a;
            if (windVaneWebView != null) {
                try {
                    windVaneWebView.loadUrl(format);
                } catch (Exception e) {
                    e.printStackTrace();
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
    }
}