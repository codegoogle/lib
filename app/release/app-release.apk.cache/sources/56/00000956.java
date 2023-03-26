package com.anythink.expressad.splash.c;

import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.splash.js.SplashJSBridgeImpl;
import com.anythink.expressad.splash.js.SplashJsUtils;
import com.anythink.expressad.splash.view.ATSplashView;
import com.anythink.expressad.splash.view.ATSplashWebview;
import com.p7700g.p99005.wo1;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class e {
    private static final String a = "WebViewRenderManager";
    private boolean b;
    private boolean c;

    /* loaded from: classes2.dex */
    public static class a {
        private static final e a = new e((byte) 0);

        public static /* synthetic */ e a() {
            return a;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void a(int i);

        void a(String str);
    }

    /* loaded from: classes2.dex */
    public static class c {
        private String a;
        private String b;
        private com.anythink.expressad.foundation.d.c c;
        private String d;
        private boolean e;
        private int f;
        private boolean g;

        public final boolean a() {
            return this.g;
        }

        public final String b() {
            return this.d;
        }

        public final String c() {
            return this.a;
        }

        public final String d() {
            return this.b;
        }

        public final com.anythink.expressad.foundation.d.c e() {
            return this.c;
        }

        public final boolean f() {
            return this.e;
        }

        public final int g() {
            return this.f;
        }

        public final void a(boolean z) {
            this.g = z;
        }

        public final void b(String str) {
            this.a = str;
        }

        public final void c(String str) {
            this.b = str;
        }

        public final void a(String str) {
            this.d = str;
        }

        public final void b(boolean z) {
            this.e = z;
        }

        public final void a(com.anythink.expressad.foundation.d.c cVar) {
            this.c = cVar;
        }

        public final void a(int i) {
            this.f = i;
        }
    }

    public /* synthetic */ e(byte b2) {
        this();
    }

    private static e b() {
        return a.a;
    }

    private e() {
        this.b = false;
        this.c = false;
    }

    public final void a() {
        this.b = false;
        this.c = false;
    }

    public final void a(final ATSplashView aTSplashView, c cVar, final b bVar) {
        String t;
        String t2;
        String aa;
        if (aTSplashView != null) {
            String d = cVar.d();
            String c2 = cVar.c();
            final com.anythink.expressad.foundation.d.c e = cVar.e();
            String b2 = cVar.b();
            boolean f = cVar.f();
            int g = cVar.g();
            ATSplashWebview splashWebview = aTSplashView.getSplashWebview();
            if (splashWebview == null) {
                return;
            }
            if (b2.contains("hdinfo")) {
                t = b2.replace("hdinfo=1", "hdinfo=0");
            } else {
                t = wo1.t(b2, "&hdinfo=0");
            }
            if (cVar.a()) {
                if (t.contains(com.anythink.expressad.video.dynview.a.a.I)) {
                    t2 = t.replace("alecfc=0", "alecfc=1");
                } else {
                    t2 = wo1.t(t, "&alecfc=1");
                }
            } else if (t.contains(com.anythink.expressad.video.dynview.a.a.I)) {
                t2 = t.replace("alecfc=1", "alecfc=0");
            } else {
                t2 = wo1.t(t, "&alecfc=0");
            }
            SplashJSBridgeImpl splashJSBridgeImpl = new SplashJSBridgeImpl(aTSplashView.getContext(), c2, d);
            ArrayList arrayList = new ArrayList();
            arrayList.add(e);
            splashJSBridgeImpl.setCampaignList(arrayList);
            splashJSBridgeImpl.setAllowSkip(f ? 1 : 0);
            splashJSBridgeImpl.setCountdownS(g);
            aTSplashView.setSplashJSBridgeImpl(splashJSBridgeImpl);
            if (TextUtils.isEmpty(e.aa())) {
                aa = e.ab();
            } else {
                aa = e.aa();
            }
            String requestId = splashWebview.getRequestId();
            n.d(a, "CampaignEx RequestId = " + aa + " WebView RequestId = " + requestId);
            if (!TextUtils.isEmpty(requestId) && requestId.equals(aa) && (this.b || this.c)) {
                aTSplashView.setH5Ready(true);
                if (bVar != null) {
                    bVar.a(1);
                    return;
                }
                return;
            }
            a();
            splashWebview.setRequestId(aa);
            System.currentTimeMillis();
            splashWebview.setWebViewListener(new com.anythink.expressad.atsignalcommon.a.b() { // from class: com.anythink.expressad.splash.c.e.1
                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a();
                    }
                    e.this.c = true;
                    if (!e.r()) {
                        aTSplashView.setH5Ready(true);
                        n.a(com.anythink.expressad.atsignalcommon.a.b.d, "======渲染成功：finish");
                    }
                    SplashJsUtils.fireOnJSBridgeConnected(webView);
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(str);
                    }
                    e.this.a();
                    aTSplashView.setH5Ready(false);
                    n.a(com.anythink.expressad.atsignalcommon.a.b.d, "======渲染失败");
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(sslError.toString());
                    }
                    e.this.a();
                    aTSplashView.setH5Ready(false);
                    n.a(com.anythink.expressad.atsignalcommon.a.b.d, "======渲染失败");
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void readyState(WebView webView, int i) {
                    super.readyState(webView, i);
                    b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(i);
                    }
                    if (i == 1) {
                        e.this.b = true;
                        aTSplashView.setH5Ready(true);
                        n.a(com.anythink.expressad.atsignalcommon.a.b.d, "======渲染成功：ready");
                        return;
                    }
                    e.this.b = false;
                    aTSplashView.setH5Ready(false);
                    n.a(com.anythink.expressad.atsignalcommon.a.b.d, "======渲染失败");
                }
            });
            if (!splashWebview.isDestroyed()) {
                n.a(a, "======开始渲染：".concat(String.valueOf(t2)));
                splashWebview.loadUrl(t2);
                return;
            }
            aTSplashView.setH5Ready(false);
        }
    }
}