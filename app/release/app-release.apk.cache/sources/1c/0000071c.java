package com.anythink.expressad.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.anythink.expressad.foundation.h.n;
import com.p7700g.p99005.tm4;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public class g {
    public static long a = 0;
    private static final String d = "g";
    private static final int p = 1;
    private static final int q = 2;
    private static final int r = 0;
    public boolean b;
    public boolean c;
    private int e;
    private int f;
    private com.anythink.expressad.d.a h;
    private a i;
    private String j;
    private String k;
    private WebView l;
    private boolean m;
    private String n;
    private int o;
    private boolean t;
    private boolean s = false;
    private final Runnable u = new Runnable() { // from class: com.anythink.expressad.a.g.4
        @Override // java.lang.Runnable
        public final void run() {
            g.this.s = true;
            g.this.o = 1;
            String str = g.d;
            n.d(str, "js超时！超时上限：" + g.this.f + "ms");
            g.p(g.this);
        }
    };
    private final Runnable v = new Runnable() { // from class: com.anythink.expressad.a.g.5
        @Override // java.lang.Runnable
        public final void run() {
            g.this.s = true;
            g.this.o = 2;
            String str = g.d;
            n.d(str, "http超时！超时上限：" + g.this.e + "ms");
            g.p(g.this);
        }
    };
    private Handler g = new Handler(Looper.getMainLooper());

    /* loaded from: classes2.dex */
    public interface a {
        void a(String str, String str2);

        void a(String str, String str2, String str3);

        boolean a();

        boolean a(String str);

        boolean b(String str);
    }

    public g(boolean z) {
        this.e = 15000;
        this.f = 3000;
        com.anythink.expressad.d.b.a();
        com.anythink.expressad.foundation.b.a.b().e();
        com.anythink.expressad.d.a b = com.anythink.expressad.d.b.b();
        this.h = b;
        if (b == null) {
            com.anythink.expressad.d.b.a();
            this.h = com.anythink.expressad.d.b.c();
        }
        this.m = this.h.w();
        if (z) {
            this.e = (int) this.h.r();
            this.f = (int) this.h.r();
            return;
        }
        this.e = (int) this.h.s();
        this.f = (int) this.h.s();
    }

    private void c() {
        synchronized (d) {
            try {
                f();
                this.l.destroy();
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a(this.j, this.n);
                }
            } catch (Exception unused) {
                n.d(d, "webview colse to failed");
            } catch (Throwable unused2) {
                n.d(d, "webview colse to failed");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        j();
        h();
    }

    public static /* synthetic */ void m(g gVar) {
        gVar.j();
        gVar.g.postDelayed(gVar.u, gVar.f);
    }

    public static /* synthetic */ void p(g gVar) {
        synchronized (d) {
            try {
                gVar.f();
                gVar.l.destroy();
                a aVar = gVar.i;
                if (aVar != null) {
                    aVar.a(gVar.j, gVar.n);
                }
            } catch (Exception unused) {
                n.d(d, "webview colse to failed");
            } catch (Throwable unused2) {
                n.d(d, "webview colse to failed");
            }
        }
    }

    private void b() {
        synchronized (d) {
            try {
                f();
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a(this.j, this.n);
                }
            } catch (Exception unused) {
                n.d(d, "webview colse to failed");
            } catch (Throwable unused2) {
                n.d(d, "webview colse to failed");
            }
        }
    }

    private void d() {
        h();
        this.g.postDelayed(this.v, this.e);
    }

    private void e() {
        j();
        this.g.postDelayed(this.u, this.f);
    }

    private void g() {
        this.g.postDelayed(this.v, this.e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.g.removeCallbacks(this.v);
    }

    private void i() {
        this.g.postDelayed(this.u, this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.g.removeCallbacks(this.u);
    }

    public static /* synthetic */ void f(g gVar) {
        gVar.h();
        gVar.g.postDelayed(gVar.v, gVar.e);
    }

    public final void a(String str, String str2, String str3, Context context, String str4, String str5, a aVar) {
        Objects.requireNonNull(aVar, "OverrideUrlLoadingListener can not be null");
        this.k = str5;
        this.j = str4;
        this.i = aVar;
        a(str, str2, str3, context);
    }

    public static /* synthetic */ void c(g gVar) {
        synchronized (d) {
            try {
                gVar.f();
                a aVar = gVar.i;
                if (aVar != null) {
                    aVar.a(gVar.j, gVar.n);
                }
            } catch (Exception unused) {
                n.d(d, "webview colse to failed");
            } catch (Throwable unused2) {
                n.d(d, "webview colse to failed");
            }
        }
    }

    public final void a(String str, String str2, String str3, Context context, String str4, a aVar) {
        Objects.requireNonNull(aVar, "OverrideUrlLoadingListener can not be null");
        this.j = str4;
        this.i = aVar;
        a(str, str2, str3, context);
    }

    private void a(final String str, final String str2, final String str3, final Context context) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(str2, str3, context, this.j);
        } else {
            this.g.post(new Runnable() { // from class: com.anythink.expressad.a.g.1
                @Override // java.lang.Runnable
                public final void run() {
                    g gVar = g.this;
                    gVar.a(str2, str3, context, gVar.j);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2, Context context, String str3) {
        try {
            a(context, str, str2);
            if (!TextUtils.isEmpty(this.k)) {
                this.l.getSettings().setDefaultTextEncodingName("utf-8");
                this.f = 2000;
                this.e = 2000;
                n.b(d, this.k);
                this.l.loadDataWithBaseURL(str3, this.k, tm4.h, "utf-8", str3);
            } else if (this.m) {
                HashMap hashMap = new HashMap();
                if (this.l.getUrl() != null) {
                    hashMap.put("Referer", this.l.getUrl());
                }
                this.l.loadUrl(str3, hashMap);
            } else {
                this.l.loadUrl(str3);
            }
        } catch (Throwable th) {
            try {
                a aVar = this.i;
                if (aVar != null) {
                    aVar.a(this.j, th.getMessage(), this.n);
                }
            } catch (Exception unused) {
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a(Context context, final String str, final String str2) {
        WebView webView = new WebView(context);
        this.l = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.l.getSettings().setCacheMode(2);
        this.l.getSettings().setLoadsImagesAutomatically(false);
        this.l.setWebViewClient(new WebViewClient() { // from class: com.anythink.expressad.a.g.2
            private boolean a() {
                g gVar = g.this;
                return gVar.b || gVar.c;
            }

            @Override // android.webkit.WebViewClient
            public final void onPageFinished(WebView webView2, String str3) {
                super.onPageFinished(webView2, str3);
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onPageStarted(WebView webView2, String str3, Bitmap bitmap) {
                try {
                    webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                    boolean z = false;
                    if (g.this.t) {
                        g.this.o = 0;
                        g.c(g.this);
                        return;
                    }
                    g.this.c = false;
                    if (webView2.getTag() == null) {
                        webView2.setTag("has_first_started");
                    } else {
                        g.this.b = true;
                    }
                    synchronized (g.d) {
                        g gVar = g.this;
                        String str4 = (gVar.b || gVar.c) ? true : true ? "加载页面-开始：（重定向）" : "加载页面-开始：";
                        if (URLUtil.isHttpsUrl(str3)) {
                            String str5 = g.d;
                            n.d(str5, str4 + str3);
                        } else {
                            String str6 = g.d;
                            n.b(str6, str4 + str3);
                        }
                        g.this.j = str3;
                        if (g.this.i != null && g.this.i.a(str3)) {
                            g.this.t = true;
                            g.c(g.this);
                        } else {
                            g.f(g.this);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedError(WebView webView2, int i, String str3, String str4) {
                String str5 = g.d;
                n.b(str5, "onReceivedError: errno = " + i + ", url: " + webView2.getUrl() + ",\n onReceivedError：, description: " + str3 + ", failingUrl: " + str4);
                synchronized (g.d) {
                    g.this.t = true;
                    g.this.f();
                    g.c(g.this);
                }
                if (g.this.i != null) {
                    g.this.i.a(webView2.getUrl(), str3, g.this.n);
                }
            }

            @Override // android.webkit.WebViewClient
            public final void onReceivedSslError(WebView webView2, SslErrorHandler sslErrorHandler, SslError sslError) {
                try {
                    String str3 = g.d;
                    n.a(str3, "onReceivedSslError IS_SP_CBT_CF:" + com.anythink.expressad.a.q);
                    if (com.anythink.expressad.a.q && sslErrorHandler != null) {
                        sslErrorHandler.cancel();
                    }
                    if (TextUtils.isEmpty(str2)) {
                        return;
                    }
                    TextUtils.isEmpty(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override // android.webkit.WebViewClient
            public final boolean shouldOverrideUrlLoading(WebView webView2, String str3) {
                synchronized (g.d) {
                    n.a(g.d, "override js跳转：".concat(String.valueOf(str3)));
                    g gVar = g.this;
                    gVar.c = true;
                    gVar.j();
                    if (g.this.t) {
                        g.this.h();
                        g.c(g.this);
                        return true;
                    }
                    g.this.j = str3;
                    if (g.this.i == null || !g.this.i.b(str3)) {
                        if (!g.this.m) {
                            g.this.l.loadUrl(str3);
                        } else {
                            HashMap hashMap = new HashMap();
                            if (g.this.l.getUrl() != null) {
                                hashMap.put("Referer", g.this.l.getUrl());
                            }
                            g.this.l.loadUrl(str3, hashMap);
                        }
                        return true;
                    }
                    g.this.t = true;
                    g.this.h();
                    g.c(g.this);
                    return true;
                }
            }
        });
        this.l.setWebChromeClient(new WebChromeClient() { // from class: com.anythink.expressad.a.g.3
            @Override // android.webkit.WebChromeClient
            public final boolean onJsAlert(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsConfirm(WebView webView2, String str3, String str4, JsResult jsResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final boolean onJsPrompt(WebView webView2, String str3, String str4, String str5, JsPromptResult jsPromptResult) {
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView2, int i) {
                if (i == 100) {
                    try {
                        String str3 = g.d;
                        n.b(str3, "加载页面-进度完成：" + webView2.getUrl());
                        webView2.loadUrl("javascript:window.navigator.vibrate([]);");
                        if (!g.this.t) {
                            g gVar = g.this;
                            if (!gVar.c) {
                                g.m(gVar);
                            }
                        }
                        if (g.this.i != null) {
                            a aVar = g.this.i;
                            webView2.getUrl();
                            aVar.a();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
}