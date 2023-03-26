package com.anythink.expressad.atsignalcommon.base;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.p7700g.p99005.o31;
import com.p7700g.p99005.z1;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes2.dex */
public class BaseWebView extends WebView {
    public Context a;
    private View.OnTouchListener b;
    private View.OnTouchListener c;
    public long lastTouchTime;
    public b mWebViewClient;

    public BaseWebView(Context context) {
        super(context);
        this.lastTouchTime = 0L;
        this.b = new View.OnTouchListener() { // from class: com.anythink.expressad.atsignalcommon.base.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.c != null) {
                    return BaseWebView.this.c.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.a = context;
        a();
    }

    @Override // android.webkit.WebView
    public void loadDataWithBaseURL(@z1 String str, String str2, @z1 String str3, @z1 String str4, @z1 String str5) {
        super.loadDataWithBaseURL(a(str), str2, str3, str4, str5);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        super.loadUrl(a(str));
    }

    @Override // android.webkit.WebView
    public void reload() {
        super.reload();
    }

    public void setFilter(a aVar) {
        b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(aVar);
        }
    }

    @Override // android.view.View
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.c = onTouchListener;
    }

    public void setTransparent() {
        setLayerType(1, null);
        setBackgroundColor(0);
    }

    @Override // android.webkit.WebView
    public void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof b) {
            this.mWebViewClient = (b) webViewClient;
        }
    }

    public void a() {
        if (this.mWebViewClient == null) {
            b bVar = new b();
            this.mWebViewClient = bVar;
            setWebViewClient(bVar);
        }
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        requestFocus();
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setAppCacheMaxSize(5242880L);
        settings.setAllowFileAccess(true);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                settings.setSafeBrowsingEnabled(false);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setAllowUniversalAccessFromFileURLs(true);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        try {
            settings.setMixedContentMode(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        settings.setDatabaseEnabled(true);
        String path = this.a.getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, Boolean.FALSE);
        } catch (Exception unused) {
        }
        super.setOnTouchListener(this.b);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        super.loadUrl(a(str), map);
    }

    public BaseWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.lastTouchTime = 0L;
        this.b = new View.OnTouchListener() { // from class: com.anythink.expressad.atsignalcommon.base.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.c != null) {
                    return BaseWebView.this.c.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.a = context;
        a();
    }

    public BaseWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.lastTouchTime = 0L;
        this.b = new View.OnTouchListener() { // from class: com.anythink.expressad.atsignalcommon.base.BaseWebView.1
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BaseWebView.this.lastTouchTime = System.currentTimeMillis();
                }
                if (BaseWebView.this.c != null) {
                    return BaseWebView.this.c.onTouch(view, motionEvent);
                }
                return false;
            }
        };
        this.a = context;
        a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r0.contains(com.anythink.expressad.foundation.h.q.a()) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String a(String str) {
        boolean z = false;
        if (!TextUtils.isEmpty(str)) {
            if (!str.contains("../")) {
                if (str.startsWith(o31.b)) {
                    String path = Uri.parse(str).getPath();
                    if (!TextUtils.isEmpty(path)) {
                    }
                }
            }
            z = true;
        }
        if (z) {
            "illegal URL: ".concat(String.valueOf(str));
            return "about:blank";
        }
        return str;
    }
}