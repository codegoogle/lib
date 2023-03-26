package com.lib.adssdk.Activity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.p7700g.p99005.d3;
import com.p7700g.p99005.ih3;
import com.p7700g.p99005.ug3;
import com.p7700g.p99005.zg3;

/* loaded from: classes3.dex */
public class PrivacyPolicyActivity extends d3 {
    public final int T = 5894;
    public WebView U;

    /* loaded from: classes3.dex */
    public class a extends WebChromeClient {
        public a() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView view, int progress) {
            PrivacyPolicyActivity.this.setProgress(progress * 100);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v) {
            PrivacyPolicyActivity.this.onBackPressed();
        }
    }

    @Override // com.p7700g.p99005.hx, androidx.activity.ComponentActivity, com.p7700g.p99005.bg, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(1);
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(5894);
        if (d0() != null) {
            d0().w();
        }
        setContentView(zg3.g.b);
        WebView webView = (WebView) findViewById(zg3.e.F0);
        this.U = webView;
        ih3.i(webView);
        this.U.getSettings().setJavaScriptEnabled(true);
        this.U.getSettings().setBuiltInZoomControls(true);
        this.U.getSettings().setLoadWithOverviewMode(true);
        this.U.getSettings().setUseWideViewPort(true);
        this.U.loadUrl(ug3.c());
        this.U.setWebChromeClient(new a());
        findViewById(zg3.e.n).setOnClickListener(new b());
    }
}