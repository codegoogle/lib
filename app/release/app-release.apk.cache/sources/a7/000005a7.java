package com.anythink.core.basead.ui.web;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieSyncManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.anythink.core.api.IOfferClickHandler;
import com.anythink.core.basead.a;
import com.anythink.core.common.b.m;
import com.anythink.core.common.e.i;
import com.anythink.core.common.e.j;
import com.anythink.core.common.j.h;
import com.anythink.core.common.j.k;
import com.p7700g.p99005.sr;
import java.io.Serializable;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class WebLandPageActivity extends Activity {
    private static final int a = 343452;
    private WebProgressBarView b;
    private WebView c;
    private ImageButton d;
    private ImageButton e;
    private ImageButton f;
    private ImageButton g;
    private boolean h;
    private i i;
    private j j;
    private String k;
    private IOfferClickHandler l;

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements DownloadListener {
        public AnonymousClass1() {
        }

        @Override // android.webkit.DownloadListener
        public final void onDownloadStart(String str, String str2, String str3, String str4, long j) {
            if (WebLandPageActivity.this.i != null && WebLandPageActivity.this.j != null && !TextUtils.isEmpty(WebLandPageActivity.this.i.w())) {
                if (WebLandPageActivity.this.l != null && (WebLandPageActivity.this.l instanceof IOfferClickHandler) && WebLandPageActivity.this.l.startDownloadApp(WebLandPageActivity.this.getApplicationContext(), WebLandPageActivity.this.i, WebLandPageActivity.this.j, str)) {
                    return;
                }
                k.a(WebLandPageActivity.this, str);
                return;
            }
            k.a(WebLandPageActivity.this, str);
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements View.OnClickListener {
        public AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (WebLandPageActivity.this.c.canGoBack()) {
                WebLandPageActivity.this.c.goBack();
            }
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$3  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements View.OnClickListener {
        public AnonymousClass3() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (WebLandPageActivity.this.c.canGoForward()) {
                WebLandPageActivity.this.c.goForward();
            }
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 implements View.OnClickListener {
        public AnonymousClass4() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WebLandPageActivity.this.c.reload();
        }
    }

    /* renamed from: com.anythink.core.basead.ui.web.WebLandPageActivity$5  reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass5 implements View.OnClickListener {
        public AnonymousClass5() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            WebLandPageActivity.this.finish();
        }
    }

    private View f() {
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(sr.t);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, h.a(this, 55.0f));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackgroundDrawable(new ColorDrawable(-592138));
        int a2 = h.a(this, 20.0f);
        linearLayout.setPadding(a2, 0, a2, 0);
        relativeLayout.addView(linearLayout);
        this.d = a(getResources().getDrawable(h.a(this, "browser_unleft_icon", com.anythink.expressad.foundation.h.h.c)));
        this.e = a(getResources().getDrawable(h.a(this, "browser_unright_icon", com.anythink.expressad.foundation.h.h.c)));
        this.f = a(getResources().getDrawable(h.a(this, "browser_refresh_icon", com.anythink.expressad.foundation.h.h.c)));
        this.g = a(getResources().getDrawable(h.a(this, "browser_close_icon", com.anythink.expressad.foundation.h.h.c)));
        linearLayout.addView(this.d);
        linearLayout.addView(this.e);
        linearLayout.addView(this.f);
        linearLayout.addView(this.g);
        this.c = new BaseWebView(this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, a);
        this.c.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.c);
        View view = new View(this);
        view.setBackgroundColor(-2434342);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, h.a(this, 1.0f));
        layoutParams3.addRule(2, a);
        view.setLayoutParams(layoutParams3);
        relativeLayout.addView(view);
        WebProgressBarView webProgressBarView = new WebProgressBarView(this);
        this.b = webProgressBarView;
        webProgressBarView.setProgress(0);
        relativeLayout.addView(this.b, new RelativeLayout.LayoutParams(-1, h.a(this, 2.0f)));
        return relativeLayout;
    }

    @Override // android.app.Activity
    public void finish() {
        ((ViewGroup) getWindow().getDecorView()).removeAllViews();
        super.finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(-1);
        boolean requestFeature = getWindow().requestFeature(2);
        this.h = requestFeature;
        if (requestFeature) {
            getWindow().setFeatureInt(2, -1);
        }
        Intent intent = getIntent();
        if (intent != null) {
            try {
                Serializable serializableExtra = intent.getSerializableExtra(a.C0037a.c);
                if (serializableExtra != null && (serializableExtra instanceof i)) {
                    this.i = (i) serializableExtra;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                Serializable serializableExtra2 = intent.getSerializableExtra(a.C0037a.e);
                if (serializableExtra2 != null && (serializableExtra2 instanceof j)) {
                    this.j = (j) serializableExtra2;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                Serializable serializableExtra3 = intent.getSerializableExtra(a.C0037a.k);
                if (serializableExtra3 != null && (serializableExtra3 instanceof IOfferClickHandler)) {
                    this.l = (IOfferClickHandler) serializableExtra3;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            try {
                this.k = intent.getStringExtra(a.C0037a.i);
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
        }
        RelativeLayout relativeLayout = new RelativeLayout(this);
        relativeLayout.setBackgroundColor(sr.t);
        relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setId(a);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, h.a(this, 55.0f));
        layoutParams.addRule(12);
        linearLayout.setLayoutParams(layoutParams);
        linearLayout.setBackgroundDrawable(new ColorDrawable(-592138));
        int a2 = h.a(this, 20.0f);
        linearLayout.setPadding(a2, 0, a2, 0);
        relativeLayout.addView(linearLayout);
        this.d = a(getResources().getDrawable(h.a(this, "browser_unleft_icon", com.anythink.expressad.foundation.h.h.c)));
        this.e = a(getResources().getDrawable(h.a(this, "browser_unright_icon", com.anythink.expressad.foundation.h.h.c)));
        this.f = a(getResources().getDrawable(h.a(this, "browser_refresh_icon", com.anythink.expressad.foundation.h.h.c)));
        this.g = a(getResources().getDrawable(h.a(this, "browser_close_icon", com.anythink.expressad.foundation.h.h.c)));
        linearLayout.addView(this.d);
        linearLayout.addView(this.e);
        linearLayout.addView(this.f);
        linearLayout.addView(this.g);
        this.c = new BaseWebView(this);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, a);
        this.c.setLayoutParams(layoutParams2);
        relativeLayout.addView(this.c);
        View view = new View(this);
        view.setBackgroundColor(-2434342);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, h.a(this, 1.0f));
        layoutParams3.addRule(2, a);
        view.setLayoutParams(layoutParams3);
        relativeLayout.addView(view);
        WebProgressBarView webProgressBarView = new WebProgressBarView(this);
        this.b = webProgressBarView;
        webProgressBarView.setProgress(0);
        relativeLayout.addView(this.b, new RelativeLayout.LayoutParams(-1, h.a(this, 2.0f)));
        setContentView(relativeLayout);
        WebSettings settings = this.c.getSettings();
        this.c.setHorizontalScrollBarEnabled(false);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.requestFocus();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setAppCacheMaxSize(5242880L);
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setMixedContentMode(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, Boolean.FALSE);
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(this.k)) {
            WebView webView = this.c;
            i iVar = this.i;
            webView.loadUrl(iVar != null ? iVar.v() : "");
        } else {
            this.c.loadUrl(this.k);
        }
        this.c.setWebViewClient(new a(this));
        this.c.setDownloadListener(new AnonymousClass1());
        this.d.setBackgroundColor(0);
        this.d.setOnClickListener(new AnonymousClass2());
        this.e.setBackgroundColor(0);
        this.e.setOnClickListener(new AnonymousClass3());
        this.f.setBackgroundColor(0);
        this.f.setOnClickListener(new AnonymousClass4());
        this.g.setBackgroundColor(0);
        this.g.setOnClickListener(new AnonymousClass5());
        CookieSyncManager.createInstance(this);
        CookieSyncManager.getInstance().startSync();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.c;
        if (webView != null) {
            webView.destroy();
        }
        this.c = null;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        CookieSyncManager.getInstance().stopSync();
        this.c.setWebChromeClient(null);
        WebView webView = this.c;
        if (isFinishing()) {
            webView.stopLoading();
            webView.loadUrl("");
        }
        webView.onPause();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        CookieSyncManager.getInstance().startSync();
        this.c.setWebChromeClient(new WebChromeClient() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.6
            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i) {
                if (WebLandPageActivity.this.b != null) {
                    WebLandPageActivity.this.b.setProgress(i);
                    if (i == 100) {
                        m.a().a(new Runnable() { // from class: com.anythink.core.basead.ui.web.WebLandPageActivity.6.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                WebLandPageActivity.this.b.setVisibility(8);
                            }
                        }, 200L);
                    }
                }
            }
        });
        this.c.onResume();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        h.a((Activity) this);
    }

    public static void a(Context context, com.anythink.core.basead.b.a aVar) {
        Intent intent = new Intent();
        intent.setClass(context, WebLandPageActivity.class);
        intent.putExtra(a.C0037a.c, aVar.c);
        intent.putExtra(a.C0037a.e, aVar.h);
        intent.putExtra(a.C0037a.i, aVar.f);
        IOfferClickHandler iOfferClickHandler = aVar.g;
        if (iOfferClickHandler != null) {
            intent.putExtra(a.C0037a.k, iOfferClickHandler);
        }
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    private void b() {
        Intent intent = getIntent();
        if (intent != null) {
            try {
                Serializable serializableExtra = intent.getSerializableExtra(a.C0037a.c);
                if (serializableExtra != null && (serializableExtra instanceof i)) {
                    this.i = (i) serializableExtra;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
            try {
                Serializable serializableExtra2 = intent.getSerializableExtra(a.C0037a.e);
                if (serializableExtra2 != null && (serializableExtra2 instanceof j)) {
                    this.j = (j) serializableExtra2;
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            try {
                Serializable serializableExtra3 = intent.getSerializableExtra(a.C0037a.k);
                if (serializableExtra3 != null && (serializableExtra3 instanceof IOfferClickHandler)) {
                    this.l = (IOfferClickHandler) serializableExtra3;
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
            try {
                this.k = intent.getStringExtra(a.C0037a.i);
            } catch (Throwable th4) {
                th4.printStackTrace();
            }
        }
    }

    private void c() {
        WebSettings settings = this.c.getSettings();
        this.c.setHorizontalScrollBarEnabled(false);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.setVerticalScrollBarEnabled(false);
        this.c.requestFocus();
        settings.setJavaScriptEnabled(true);
        settings.setAppCacheEnabled(true);
        settings.setAppCacheMaxSize(5242880L);
        settings.setAllowFileAccess(false);
        settings.setBuiltInZoomControls(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setMediaPlaybackRequiresUserGesture(false);
        try {
            settings.setMixedContentMode(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Method declaredMethod = WebSettings.class.getDeclaredMethod("setDisplayZoomControls", Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(settings, Boolean.FALSE);
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(this.k)) {
            WebView webView = this.c;
            i iVar = this.i;
            webView.loadUrl(iVar != null ? iVar.v() : "");
        } else {
            this.c.loadUrl(this.k);
        }
        this.c.setWebViewClient(new a(this));
        this.c.setDownloadListener(new AnonymousClass1());
    }

    private void d() {
        this.d.setBackgroundColor(0);
        this.d.setOnClickListener(new AnonymousClass2());
        this.e.setBackgroundColor(0);
        this.e.setOnClickListener(new AnonymousClass3());
        this.f.setBackgroundColor(0);
        this.f.setOnClickListener(new AnonymousClass4());
        this.g.setBackgroundColor(0);
        this.g.setOnClickListener(new AnonymousClass5());
    }

    private void e() {
        CookieSyncManager.createInstance(this);
        CookieSyncManager.getInstance().startSync();
    }

    public static void a(Context context, String str) {
        com.anythink.core.basead.b.a aVar = new com.anythink.core.basead.b.a();
        aVar.f = str;
        a(context, aVar);
    }

    public final void a(boolean z) {
        this.e.setImageResource(z ? h.a(this, "browser_right_icon", com.anythink.expressad.foundation.h.h.c) : h.a(this, "browser_unright_icon", com.anythink.expressad.foundation.h.h.c));
    }

    public final WebProgressBarView a() {
        return this.b;
    }

    public final void b(boolean z) {
        this.d.setImageResource(z ? h.a(this, "browser_left_icon", com.anythink.expressad.foundation.h.h.c) : h.a(this, "browser_unleft_icon", com.anythink.expressad.foundation.h.h.c));
    }

    private ImageButton a(Drawable drawable) {
        ImageButton imageButton = new ImageButton(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, h.a(this, 35.0f), 1.0f);
        layoutParams.gravity = 16;
        imageButton.setLayoutParams(layoutParams);
        imageButton.setBackgroundColor(0);
        imageButton.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageButton.setImageDrawable(drawable);
        return imageButton;
    }
}