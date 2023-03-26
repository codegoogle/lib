package com.anythink.expressad.foundation.webview;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.j;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.s;

/* loaded from: classes2.dex */
public class BrowserView extends LinearLayout {
    private static final String a = "BrowserView";
    private String b;
    private ProgressBar c;
    private WebView d;
    private ToolBar e;
    private a f;
    private c g;

    /* renamed from: com.anythink.expressad.foundation.webview.BrowserView$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends WebViewClient {
        public AnonymousClass2() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            n.b(BrowserView.a, "开始! = ".concat(String.valueOf(str)));
            BrowserView.this.b = str;
            if (BrowserView.this.f != null) {
                a unused = BrowserView.this.f;
            }
            BrowserView.this.c.setVisible(true);
            BrowserView.this.c.setProgressState(5);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            n.b(BrowserView.a, "js大跳! = ".concat(String.valueOf(str)));
            BrowserView.this.e.getItem("backward").setEnabled(true);
            BrowserView.this.e.getItem("forward").setEnabled(false);
            if (BrowserView.this.f != null) {
                BrowserView.this.f.a(webView, str);
            }
            return false;
        }
    }

    /* renamed from: com.anythink.expressad.foundation.webview.BrowserView$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 extends WebChromeClient {
        public AnonymousClass3() {
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                BrowserView.this.c.setProgressState(7);
                new Handler().postDelayed(new Runnable() { // from class: com.anythink.expressad.foundation.webview.BrowserView.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BrowserView.this.c.setVisible(false);
                    }
                }, 200L);
            }
        }
    }

    /* renamed from: com.anythink.expressad.foundation.webview.BrowserView$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 extends WebChromeClient {
        public AnonymousClass4() {
        }

        @Override // android.webkit.WebChromeClient
        public final void onProgressChanged(WebView webView, int i) {
            if (i == 100) {
                BrowserView.this.c.setProgressState(7);
                new Handler().postDelayed(new Runnable() { // from class: com.anythink.expressad.foundation.webview.BrowserView.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BrowserView.this.c.setVisible(false);
                    }
                }, 200L);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        boolean a(WebView webView, String str);

        void b();
    }

    public BrowserView(Context context, c cVar) {
        super(context);
        this.g = cVar;
        init();
    }

    public void destroy() {
        WebView webView = this.d;
        if (webView != null) {
            webView.stopLoading();
            this.d.setWebViewClient(null);
            this.d.destroy();
            removeAllViews();
        }
    }

    public void init() {
        WebChromeClient anonymousClass4;
        setOrientation(1);
        setGravity(17);
        ProgressBar progressBar = new ProgressBar(getContext());
        this.c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.d == null) {
                WebView webView = new WebView(getContext());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setCacheMode(-1);
                webView.setDownloadListener(new DownloadListener(this.g));
                webView.setWebViewClient(new AnonymousClass2());
                if (j.d() <= 10) {
                    anonymousClass4 = new AnonymousClass3();
                } else {
                    anonymousClass4 = new AnonymousClass4();
                }
                webView.setWebChromeClient(anonymousClass4);
                this.d = webView;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.d.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            n.b(a, "webview is error", th);
        }
        this.e = new ToolBar(getContext());
        this.e.setLayoutParams(new LinearLayout.LayoutParams(-1, s.b(getContext(), 40.0f)));
        this.e.setBackgroundColor(-1);
        addView(this.c);
        WebView webView2 = this.d;
        if (webView2 != null) {
            addView(webView2);
        }
        addView(this.e);
        this.c.initResource(true);
        this.e.getItem("backward").setEnabled(false);
        this.e.getItem("forward").setEnabled(false);
        this.e.setOnItemClickListener(new View.OnClickListener() { // from class: com.anythink.expressad.foundation.webview.BrowserView.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (BrowserView.this.d != null) {
                    BrowserView.this.d.stopLoading();
                }
                String str = (String) view.getTag();
                boolean z = false;
                if (TextUtils.equals(str, "backward")) {
                    BrowserView.this.e.getItem("forward").setEnabled(true);
                    if (BrowserView.this.d != null && BrowserView.this.d.canGoBack()) {
                        BrowserView.this.d.goBack();
                    }
                    View item = BrowserView.this.e.getItem("backward");
                    if (BrowserView.this.d != null && BrowserView.this.d.canGoBack()) {
                        z = true;
                    }
                    item.setEnabled(z);
                } else if (TextUtils.equals(str, "forward")) {
                    BrowserView.this.e.getItem("backward").setEnabled(true);
                    if (BrowserView.this.d != null && BrowserView.this.d.canGoForward()) {
                        BrowserView.this.d.goForward();
                    }
                    View item2 = BrowserView.this.e.getItem("forward");
                    if (BrowserView.this.d != null && BrowserView.this.d.canGoForward()) {
                        z = true;
                    }
                    item2.setEnabled(z);
                } else if (TextUtils.equals(str, "refresh")) {
                    BrowserView.this.e.getItem("backward").setEnabled(BrowserView.this.d != null && BrowserView.this.d.canGoBack());
                    View item3 = BrowserView.this.e.getItem("forward");
                    if (BrowserView.this.d != null && BrowserView.this.d.canGoForward()) {
                        z = true;
                    }
                    item3.setEnabled(z);
                    if (BrowserView.this.d != null) {
                        BrowserView.this.d.loadUrl(BrowserView.this.b);
                    }
                } else if (!TextUtils.equals(str, "exits") || BrowserView.this.f == null) {
                } else {
                    BrowserView.this.f.a();
                }
            }
        });
    }

    public void loadUrl(String str) {
        WebView webView = this.d;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    public void setListener(a aVar) {
        this.f = aVar;
    }

    public void setWebView(WebView webView) {
        this.d = webView;
    }

    /* loaded from: classes2.dex */
    public static final class DownloadListener implements android.webkit.DownloadListener {
        private c campaignEx;
        private String title;

        public DownloadListener(c cVar) {
            this.campaignEx = cVar;
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public DownloadListener() {
        }
    }

    private WebView b() {
        WebChromeClient anonymousClass4;
        WebView webView = new WebView(getContext());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setCacheMode(-1);
        webView.setDownloadListener(new DownloadListener(this.g));
        webView.setWebViewClient(new AnonymousClass2());
        if (j.d() <= 10) {
            anonymousClass4 = new AnonymousClass3();
        } else {
            anonymousClass4 = new AnonymousClass4();
        }
        webView.setWebChromeClient(anonymousClass4);
        return webView;
    }

    private void a() {
        WebChromeClient anonymousClass4;
        ProgressBar progressBar = new ProgressBar(getContext());
        this.c = progressBar;
        progressBar.setLayoutParams(new LinearLayout.LayoutParams(-1, 4));
        try {
            if (this.d == null) {
                WebView webView = new WebView(getContext());
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setCacheMode(-1);
                webView.setDownloadListener(new DownloadListener(this.g));
                webView.setWebViewClient(new AnonymousClass2());
                if (j.d() <= 10) {
                    anonymousClass4 = new AnonymousClass3();
                } else {
                    anonymousClass4 = new AnonymousClass4();
                }
                webView.setWebChromeClient(anonymousClass4);
                this.d = webView;
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            this.d.setLayoutParams(layoutParams);
        } catch (Throwable th) {
            n.b(a, "webview is error", th);
        }
        this.e = new ToolBar(getContext());
        this.e.setLayoutParams(new LinearLayout.LayoutParams(-1, s.b(getContext(), 40.0f)));
        this.e.setBackgroundColor(-1);
        addView(this.c);
        WebView webView2 = this.d;
        if (webView2 != null) {
            addView(webView2);
        }
        addView(this.e);
    }

    public BrowserView(Context context) {
        super(context);
        init();
    }

    public BrowserView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }
}