package com.anythink.expressad.advanced.c;

import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import com.anythink.core.common.b.m;
import com.anythink.expressad.advanced.js.NativeAdvancedJSBridgeImpl;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import com.anythink.expressad.advanced.view.ATNativeAdvancedView;
import com.anythink.expressad.advanced.view.ATNativeAdvancedWebview;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.videocommon.b.g;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class c {
    private static String a = "ResManager";
    private static int b = 1;

    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();
    }

    private static com.anythink.expressad.foundation.d.c a(com.anythink.expressad.foundation.d.c cVar) {
        if (TextUtils.isEmpty(cVar.c()) && (TextUtils.isEmpty(cVar.d()) || !cVar.d().contains("<MBTPLMARK>"))) {
            cVar.a(false);
            cVar.b(true);
        } else {
            cVar.a(true);
            cVar.b(false);
        }
        return cVar;
    }

    private static boolean a(com.anythink.expressad.foundation.d.c cVar, String str) {
        if (cVar != null) {
            boolean a2 = !TextUtils.isEmpty(cVar.R()) ? com.anythink.expressad.videocommon.b.c.a().a(com.anythink.expressad.foundation.g.a.aX, str, cVar.y()) : true;
            if (!TextUtils.isEmpty(cVar.c()) && TextUtils.isEmpty(g.a().c(cVar.c()))) {
                a2 = false;
            }
            if (TextUtils.isEmpty(cVar.c()) && !TextUtils.isEmpty(cVar.d()) && TextUtils.isEmpty(a(cVar.d()))) {
                return false;
            }
            return a2;
        }
        return false;
    }

    private static boolean a(ATNativeAdvancedView aTNativeAdvancedView, com.anythink.expressad.foundation.d.c cVar, String str, String str2, int i, boolean z) {
        return a(aTNativeAdvancedView, cVar, str, str2, i, z, (a) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
        if (r17 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
        if (r0 != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(ATNativeAdvancedView aTNativeAdvancedView, com.anythink.expressad.foundation.d.c cVar, String str, String str2, int i, boolean z, a aVar) {
        boolean z2;
        boolean z3;
        boolean z4 = false;
        boolean z5 = true;
        if (cVar != null) {
            aTNativeAdvancedView.clearResState();
            if (TextUtils.isEmpty(cVar.R())) {
                z3 = true;
            } else {
                z3 = com.anythink.expressad.videocommon.b.c.a().a(com.anythink.expressad.foundation.g.a.aX, str2, cVar.y());
            }
            aTNativeAdvancedView.setVideoReady(true);
            boolean z6 = z3;
            if (!TextUtils.isEmpty(cVar.G()) && !aTNativeAdvancedView.isEndCardReady() && !TextUtils.isEmpty(g.a().c(cVar.G()))) {
                aTNativeAdvancedView.setEndCardReady(true);
            }
            if (TextUtils.isEmpty(cVar.c()) || aTNativeAdvancedView.isH5Ready()) {
                z2 = false;
            } else {
                String c = g.a().c(cVar.c());
                if (TextUtils.isEmpty(c)) {
                    z2 = false;
                } else if (com.anythink.expressad.advanced.a.a.b(cVar.aa())) {
                    aTNativeAdvancedView.setH5Ready(true);
                    z2 = false;
                    z6 = true;
                } else {
                    a(aTNativeAdvancedView, c, cVar, str, str2, i, aVar);
                    z2 = true;
                }
                z6 = false;
            }
            if (!TextUtils.isEmpty(cVar.c()) || TextUtils.isEmpty(cVar.d()) || aTNativeAdvancedView.isH5Ready()) {
                z4 = z6;
            } else {
                String a2 = a(cVar.d());
                if (TextUtils.isEmpty(a2)) {
                    z5 = z2;
                } else if (com.anythink.expressad.advanced.a.a.b(cVar.aa())) {
                    aTNativeAdvancedView.setH5Ready(true);
                    if (cVar.F()) {
                        aTNativeAdvancedView.setVideoReady(true);
                    }
                    z4 = true;
                } else {
                    a(aTNativeAdvancedView, a2, cVar, str, str2, i, aVar);
                    if (z) {
                        z4 = z6;
                    }
                }
                z2 = z5;
            }
        } else {
            z2 = false;
        }
        if (z4 && !z2 && aVar != null) {
            aVar.a();
        }
        return z4;
    }

    private static void a(final ATNativeAdvancedView aTNativeAdvancedView, com.anythink.expressad.foundation.d.c cVar, String str) {
        com.anythink.expressad.videocommon.d.b bVar = new com.anythink.expressad.videocommon.d.b() { // from class: com.anythink.expressad.advanced.c.c.1
            @Override // com.anythink.expressad.videocommon.d.b
            public final void a(String str2) {
                ATNativeAdvancedView.this.setVideoReady(true);
                n.a(c.a, "========VIDEO SUC");
            }

            @Override // com.anythink.expressad.videocommon.d.b
            public final void a(String str2, String str3) {
                ATNativeAdvancedView.this.setVideoReady(false);
                n.a(c.a, "========VIDEO FAILED");
            }
        };
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        com.anythink.expressad.videocommon.b.c a2 = com.anythink.expressad.videocommon.b.c.a();
        m.a();
        a2.a(str, arrayList, com.anythink.expressad.foundation.g.a.aX, bVar);
        if (!com.anythink.expressad.videocommon.b.c.a().a(com.anythink.expressad.foundation.g.a.aX, str, cVar.y())) {
            com.anythink.expressad.videocommon.b.c.a().d(str);
        } else {
            aTNativeAdvancedView.setVideoReady(true);
        }
    }

    private static void a(ATNativeAdvancedView aTNativeAdvancedView, String str, com.anythink.expressad.foundation.d.c cVar, String str2, String str3, int i) {
        a(aTNativeAdvancedView, str, cVar, str2, str3, i, (a) null);
    }

    private static void a(final ATNativeAdvancedView aTNativeAdvancedView, final String str, final com.anythink.expressad.foundation.d.c cVar, String str2, String str3, int i, final a aVar) {
        if (aTNativeAdvancedView == null || aTNativeAdvancedView.getAdvancedNativeWebview() == null) {
            return;
        }
        NativeAdvancedJSBridgeImpl nativeAdvancedJSBridgeImpl = new NativeAdvancedJSBridgeImpl(aTNativeAdvancedView.getContext(), str2, str3);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        nativeAdvancedJSBridgeImpl.setCampaignList(arrayList);
        nativeAdvancedJSBridgeImpl.setAllowSkip(i);
        aTNativeAdvancedView.setAdvancedNativeJSBridgeImpl(nativeAdvancedJSBridgeImpl);
        final ATNativeAdvancedWebview advancedNativeWebview = aTNativeAdvancedView.getAdvancedNativeWebview();
        System.currentTimeMillis();
        advancedNativeWebview.setWebViewListener(new com.anythink.expressad.atsignalcommon.a.b() { // from class: com.anythink.expressad.advanced.c.c.2
            @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
            public final void onPageFinished(WebView webView, String str4) {
                super.onPageFinished(webView, str4);
                if (!com.anythink.expressad.foundation.d.c.this.r()) {
                    com.anythink.expressad.advanced.a.a.a(com.anythink.expressad.foundation.d.c.this.aa());
                    aTNativeAdvancedView.setH5Ready(true);
                    n.a(com.anythink.expressad.atsignalcommon.a.b.d, "======渲染成功：finish");
                }
                NativeAdvancedJsUtils.fireOnJSBridgeConnected(webView);
            }

            @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
            public final void onReceivedError(WebView webView, int i2, String str4, String str5) {
                super.onReceivedError(webView, i2, str4, str5);
                aTNativeAdvancedView.setH5Ready(false);
                n.a(com.anythink.expressad.atsignalcommon.a.b.d, "======渲染失败");
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b();
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
            public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
                aTNativeAdvancedView.setH5Ready(false);
                n.a(com.anythink.expressad.atsignalcommon.a.b.d, "======渲染失败");
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.b();
                }
            }

            @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
            public final void readyState(WebView webView, int i2) {
                super.readyState(webView, i2);
                if (i2 == 1) {
                    com.anythink.expressad.advanced.a.a.a(com.anythink.expressad.foundation.d.c.this.aa());
                    aTNativeAdvancedView.setH5Ready(true);
                    n.a(com.anythink.expressad.atsignalcommon.a.b.d, "======渲染成功：ready");
                } else {
                    aTNativeAdvancedView.setH5Ready(false);
                    n.a(com.anythink.expressad.atsignalcommon.a.b.d, "======渲染失败");
                }
                a aVar2 = aVar;
                if (aVar2 != null) {
                    aVar2.a();
                }
            }
        });
        if (!advancedNativeWebview.isDestroyed()) {
            n.a(a, "======开始渲染：".concat(String.valueOf(str)));
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.anythink.expressad.advanced.c.c.3
                @Override // java.lang.Runnable
                public final void run() {
                    ATNativeAdvancedWebview.this.loadUrl(str);
                }
            });
            return;
        }
        aTNativeAdvancedView.setH5Ready(false);
    }

    private static String a(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return "file:///" + file.getAbsolutePath();
            }
            return "";
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Exception e) {
                e.getMessage();
                return "";
            }
        }
    }

    public static boolean a(ATNativeAdvancedView aTNativeAdvancedView, com.anythink.expressad.foundation.d.c cVar) {
        boolean z = false;
        if (aTNativeAdvancedView == null) {
            n.d(a, "mbAdvancedNativeView  is null");
            return false;
        }
        boolean z2 = true;
        if (!TextUtils.isEmpty(cVar.R())) {
            z2 = aTNativeAdvancedView.isVideoReady();
            n.d(a, "======isReady isVideoReady:".concat(String.valueOf(z2)));
        }
        if (z2 && !TextUtils.isEmpty(cVar.c())) {
            z2 = com.anythink.expressad.advanced.a.a.b(cVar.aa());
            String str = a;
            n.d(str, "======isReady getAdZip:" + z2 + "---requestId:" + cVar.aa());
        }
        if (z2 && TextUtils.isEmpty(cVar.c()) && !TextUtils.isEmpty(cVar.d())) {
            z2 = com.anythink.expressad.advanced.a.a.b(cVar.aa());
            n.d(a, "======isReady getAdHtml:".concat(String.valueOf(z2)));
        }
        if (TextUtils.isEmpty(cVar.c()) && TextUtils.isEmpty(cVar.d())) {
            n.d(a, "======isReady getAdHtml  getAdZip all are empty");
        } else {
            z = z2;
        }
        if (!z || TextUtils.isEmpty(cVar.G())) {
            return z;
        }
        boolean isEndCardReady = aTNativeAdvancedView.isEndCardReady();
        n.d(a, "======isReady isEndCardReady:".concat(String.valueOf(isEndCardReady)));
        return isEndCardReady;
    }
}