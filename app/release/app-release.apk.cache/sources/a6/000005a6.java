package com.anythink.core.basead.ui.web;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebView;
import com.anythink.core.common.b.o;
import com.anythink.core.common.j.g;
import com.anythink.core.common.j.r;

/* loaded from: classes2.dex */
public class BaseWebView extends WebView {
    private static boolean b = false;
    public boolean a;

    public BaseWebView(Context context) {
        super(context.getApplicationContext());
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
        com.anythink.core.basead.ui.a.a.a(this);
        g.a(this);
        if (b) {
            return;
        }
        getContext();
        b = true;
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private void a() {
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setAppCacheEnabled(true);
        getSettings().setAppCachePath(getContext().getCacheDir().getAbsolutePath());
    }

    private static void a(Context context) {
    }

    private void b() {
        getSettings().setAllowFileAccess(false);
        getSettings().setAllowContentAccess(false);
        getSettings().setAllowFileAccessFromFileURLs(false);
        getSettings().setAllowUniversalAccessFromFileURLs(false);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.a) {
            return;
        }
        this.a = true;
        r.a(this);
        removeAllViews();
        super.destroy();
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        CookieManager.getInstance().setAcceptThirdPartyCookies(this, o.a(getContext()).b());
    }
}