package com.anythink.expressad.atsignalcommon.windvane;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.anythink.expressad.foundation.h.r;
import com.anythink.expressad.foundation.h.s;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes2.dex */
public final class p extends com.anythink.expressad.atsignalcommon.base.b {
    public static final String a = "WindVaneWebViewClient";
    public static final int c = 0;
    public static final int d = 1;
    public static final String e = "mmusdk_cache";
    public static final String f = "1";
    public static boolean g = true;
    public String b;
    private int h;
    private e i;

    public p() {
        this.b = null;
        this.h = 0;
    }

    private static String a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine + "\n");
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return sb.toString();
    }

    private void b(e eVar) {
        this.i = eVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.b = str;
        e eVar = this.i;
        if (eVar != null) {
            eVar.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(11)
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse a2 = a(str);
        return a2 != null ? a2 : super.shouldInterceptRequest(webView, str);
    }

    private p(int i) {
        this.b = null;
        this.h = 0;
        this.h = i;
    }

    private static WebResourceResponse a(String str) {
        Bitmap bitmap;
        Bitmap a2;
        try {
            if (!TextUtils.isEmpty(str) && n.d(str)) {
                com.anythink.expressad.foundation.g.d.b a3 = com.anythink.expressad.foundation.g.d.b.a(com.anythink.expressad.foundation.b.a.b().d());
                if (!s.a(str)) {
                    String a4 = r.a(str);
                    File file = new File(a4);
                    if (a3.a(str) != null) {
                        bitmap = a3.a(str);
                    } else if (file.exists() && (a2 = com.anythink.expressad.foundation.g.d.a.a(a4)) != null) {
                        a3.a(str, a2);
                        bitmap = a2;
                    }
                    if (bitmap != null && !bitmap.isRecycled()) {
                        return new WebResourceResponse(n.e(str), "utf-8", com.anythink.expressad.foundation.g.d.a.a(bitmap));
                    }
                }
                bitmap = null;
                if (bitmap != null) {
                    return new WebResourceResponse(n.e(str), "utf-8", com.anythink.expressad.foundation.g.d.a.a(bitmap));
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}