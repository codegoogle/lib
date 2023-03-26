package com.ironsource.sdk.controller;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.p7700g.p99005.oq;
import java.util.List;

/* loaded from: classes3.dex */
public class OpenUrlActivity extends Activity {
    private static final int s = SDKUtils.generateViewId();
    private static final int t = SDKUtils.generateViewId();
    private x v;
    private ProgressBar w;
    private boolean x;
    private RelativeLayout y;
    private String z;
    private WebView u = null;
    private Handler A = new Handler();
    private boolean B = false;
    private final Runnable C = new b();

    /* loaded from: classes3.dex */
    public class a implements View.OnSystemUiVisibilityChangeListener {
        public a() {
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public final void onSystemUiVisibilityChange(int i) {
            if ((i & oq.l) == 0) {
                OpenUrlActivity.this.A.removeCallbacks(OpenUrlActivity.this.C);
                OpenUrlActivity.this.A.postDelayed(OpenUrlActivity.this.C, 500L);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            OpenUrlActivity.this.getWindow().getDecorView().setSystemUiVisibility(SDKUtils.getActivityUIFlags(OpenUrlActivity.this.B));
        }
    }

    /* loaded from: classes3.dex */
    public class c extends WebViewClient {
        private c() {
        }

        public /* synthetic */ c(OpenUrlActivity openUrlActivity, byte b) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            OpenUrlActivity.this.w.setVisibility(4);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            OpenUrlActivity.this.w.setVisibility(0);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            Logger.e("OpenUrlActivity", "Chromium process crashed - detail.didCrash():" + renderProcessGoneDetail.didCrash());
            OpenUrlActivity.this.finish();
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            List<String> b = com.ironsource.sdk.utils.b.a().b();
            if (!b.isEmpty()) {
                for (String str2 : b) {
                    if (str.contains(str2)) {
                        try {
                            OpenUrlActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            OpenUrlActivity.this.v.i();
                        } catch (Exception e) {
                            StringBuilder sb = new StringBuilder();
                            if (e instanceof ActivityNotFoundException) {
                                sb.append("no activity to handle url");
                            } else {
                                sb.append("activity failed to open with unspecified reason");
                            }
                            if (OpenUrlActivity.this.v != null) {
                                x xVar = OpenUrlActivity.this.v;
                                String sb2 = sb.toString();
                                if (TextUtils.isEmpty(str)) {
                                    str = "unknown url";
                                }
                                xVar.b(x.b("failedToStartStoreActivity", x.a("errMsg", TextUtils.isEmpty(sb2) ? "activity failed to open with unspecified reason" : sb2, "url", str, null, null, null, null, null, false)));
                            }
                        }
                        OpenUrlActivity.this.finish();
                        return true;
                    }
                }
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    @Override // android.app.Activity
    public void finish() {
        x xVar;
        if (this.x && (xVar = this.v) != null) {
            xVar.e("secondaryClose");
        }
        super.finish();
    }

    public void loadUrl(String str) {
        this.u.stopLoading();
        this.u.clearHistory();
        try {
            this.u.loadUrl(str);
        } catch (Throwable th) {
            Logger.e("OpenUrlActivity", "OpenUrlActivity:: loadUrl: " + th.toString());
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (this.u.canGoBack()) {
            this.u.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.i("OpenUrlActivity", "onCreate()");
        try {
            this.v = (x) com.ironsource.sdk.d.b.a((Context) this).a.a;
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            Bundle extras = getIntent().getExtras();
            this.z = extras.getString(x.c);
            this.x = extras.getBoolean(x.d);
            boolean booleanExtra = getIntent().getBooleanExtra("immersive", false);
            this.B = booleanExtra;
            if (booleanExtra) {
                getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new a());
                runOnUiThread(this.C);
            }
            RelativeLayout relativeLayout = new RelativeLayout(this);
            this.y = relativeLayout;
            setContentView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        } catch (Exception e) {
            e.printStackTrace();
            finish();
        }
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebView webView = this.u;
        if (webView != null) {
            webView.destroy();
        }
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.B && (i == 25 || i == 24)) {
            this.A.postDelayed(this.C, 500L);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onPause() {
        ViewGroup viewGroup;
        super.onPause();
        x xVar = this.v;
        if (xVar != null) {
            xVar.a(false, "secondary");
            if (this.y == null || (viewGroup = (ViewGroup) this.u.getParent()) == null) {
                return;
            }
            if (viewGroup.findViewById(s) != null) {
                viewGroup.removeView(this.u);
            }
            if (viewGroup.findViewById(t) != null) {
                viewGroup.removeView(this.w);
            }
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.u == null) {
            WebView webView = new WebView(getApplicationContext());
            this.u = webView;
            webView.setId(s);
            this.u.getSettings().setJavaScriptEnabled(true);
            this.u.setWebViewClient(new c(this, (byte) 0));
            loadUrl(this.z);
        }
        if (findViewById(s) == null) {
            this.y.addView(this.u, new RelativeLayout.LayoutParams(-1, -1));
        }
        if (this.w == null) {
            ProgressBar progressBar = new ProgressBar(new ContextThemeWrapper(this, 16973939));
            this.w = progressBar;
            progressBar.setId(t);
        }
        if (findViewById(t) == null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            this.w.setLayoutParams(layoutParams);
            this.w.setVisibility(4);
            this.y.addView(this.w);
        }
        x xVar = this.v;
        if (xVar != null) {
            xVar.a(true, "secondary");
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.B && z) {
            runOnUiThread(this.C);
        }
    }
}