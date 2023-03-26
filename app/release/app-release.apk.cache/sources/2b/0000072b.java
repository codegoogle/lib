package com.anythink.expressad.activity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.WebView;
import android.widget.Toast;
import com.anythink.expressad.foundation.b.a;
import com.anythink.expressad.foundation.d.c;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.h.r;
import com.anythink.expressad.foundation.webview.BrowserView;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class DomainATCommonActivity extends Activity {
    private static final String b = "ATCommonActivity";
    private c c;
    private BrowserView d;
    public String a = "";
    private BrowserView.a e = new BrowserView.a() { // from class: com.anythink.expressad.activity.DomainATCommonActivity.1
        @Override // com.anythink.expressad.foundation.webview.BrowserView.a
        public final void a() {
            DomainATCommonActivity.this.finish();
        }

        @Override // com.anythink.expressad.foundation.webview.BrowserView.a
        public final void b() {
        }

        @Override // com.anythink.expressad.foundation.webview.BrowserView.a
        public final boolean a(WebView webView, String str) {
            n.d(DomainATCommonActivity.b, "shouldOverrideUrlLoading  ".concat(String.valueOf(str)));
            if (r.a.a(str) && r.a.a(DomainATCommonActivity.this, str, null)) {
                DomainATCommonActivity.this.finish();
            }
            return DomainATCommonActivity.this.a(webView, str);
        }
    };

    @Override // android.app.Activity
    public void onCreate(@z1 Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        if (a.b().d() == null) {
            a.b().a(getApplicationContext());
        }
        String stringExtra = getIntent().getStringExtra("url");
        this.a = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.c = (c) getIntent().getSerializableExtra("mvcommon");
            BrowserView browserView = new BrowserView(this, this.c);
            this.d = browserView;
            browserView.setListener(this.e);
            this.d.loadUrl(this.a);
            BrowserView browserView2 = this.d;
            if (browserView2 != null) {
                setContentView(browserView2);
                return;
            }
            return;
        }
        Toast.makeText(this, "Error: no data", 0).show();
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        BrowserView browserView = this.d;
        if (browserView != null) {
            browserView.destroy();
        }
    }

    private void a() {
        String stringExtra = getIntent().getStringExtra("url");
        this.a = stringExtra;
        if (!TextUtils.isEmpty(stringExtra)) {
            this.c = (c) getIntent().getSerializableExtra("mvcommon");
            BrowserView browserView = new BrowserView(this, this.c);
            this.d = browserView;
            browserView.setListener(this.e);
            this.d.loadUrl(this.a);
            BrowserView browserView2 = this.d;
            if (browserView2 != null) {
                setContentView(browserView2);
                return;
            }
            return;
        }
        Toast.makeText(this, "Error: no data", 0).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009a, code lost:
        r9.loadUrl(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
        return false;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e A[Catch: all -> 0x009e, TryCatch #2 {all -> 0x00a7, blocks: (B:3:0x0005, B:6:0x000c, B:9:0x001d, B:16:0x002e, B:18:0x003a, B:19:0x003e, B:21:0x0048, B:23:0x0052, B:27:0x0072, B:29:0x007e, B:31:0x008c, B:36:0x009a), top: B:44:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(WebView webView, String str) {
        boolean z;
        Intent parseUri;
        String str2;
        String stringExtra;
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            Uri parse = Uri.parse(str);
            boolean z2 = true;
            if (!parse.getScheme().equals("http") && !parse.getScheme().equals("https")) {
                z = false;
                if (z && parse.getScheme().equals("intent")) {
                    parseUri = Intent.parseUri(str, 1);
                    str2 = parseUri.getPackage();
                    if (TextUtils.isEmpty(str2) && getPackageManager().getLaunchIntentForPackage(str2) != null) {
                        parseUri.addCategory("android.intent.category.BROWSABLE");
                        parseUri.setComponent(null);
                        parseUri.setSelector(null);
                        parseUri.setFlags(268435456);
                        startActivityForResult(parseUri, 0);
                        finish();
                        return true;
                    }
                    stringExtra = parseUri.getStringExtra("browser_fallback_url");
                    if (!TextUtils.isEmpty(stringExtra)) {
                        Uri parse2 = Uri.parse(str);
                        if (!parse2.getScheme().equals("http") && !parse2.getScheme().equals("https")) {
                            z2 = false;
                        }
                    }
                }
                return false;
            }
            z = true;
            if (z) {
                return false;
            }
            parseUri = Intent.parseUri(str, 1);
            str2 = parseUri.getPackage();
            if (TextUtils.isEmpty(str2)) {
            }
            stringExtra = parseUri.getStringExtra("browser_fallback_url");
            if (!TextUtils.isEmpty(stringExtra)) {
            }
            return false;
        } catch (Throwable th) {
            n.d(b, th.getMessage());
            return false;
        }
    }
}