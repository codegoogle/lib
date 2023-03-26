package com.ironsource.sdk.controller;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Message;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebBackForwardList;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.anythink.expressad.atsignalcommon.mraid.CallMraidJS;
import com.ironsource.environment.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.sdk.controller.f;
import com.ironsource.sdk.controller.i;
import com.ironsource.sdk.controller.k;
import com.ironsource.sdk.controller.r;
import com.ironsource.sdk.controller.v;
import com.ironsource.sdk.f.a;
import com.ironsource.sdk.g.d;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.af3;
import com.p7700g.p99005.bf3;
import com.p7700g.p99005.la1;
import com.p7700g.p99005.o31;
import com.p7700g.p99005.pg1;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.we3;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.xe3;
import com.p7700g.p99005.ye3;
import com.p7700g.p99005.ze3;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class x extends WebView implements DownloadListener, com.ironsource.sdk.controller.m, com.ironsource.sdk.k.c {
    public static String b = "is_store";
    public static String c = "external_url";
    public static String d = "secondary_web_view";
    private static int s = 0;
    private static String t = "success";
    private static String u = "fail";
    private String A;
    public com.ironsource.sdk.controller.q A0;
    private Map<String, String> B;
    public com.ironsource.sdk.controller.r B0;
    private com.ironsource.sdk.k.b C;
    public com.ironsource.sdk.controller.v C0;
    private boolean D;
    public com.ironsource.sdk.controller.k D0;
    public v E;
    public com.ironsource.sdk.controller.a E0;
    private boolean F;
    public ze3 F0;
    private CountDownTimer G;
    public com.ironsource.sdk.controller.y G0;
    private int H;
    private xe3 H0;
    private int I;
    private com.ironsource.sdk.service.Connectivity.b I0;
    private String J;
    public com.ironsource.sdk.controller.c J0;
    public u K;
    public com.ironsource.sdk.j.g K0;
    public View L;
    private FrameLayout M;
    private WebChromeClient.CustomViewCallback N;
    public FrameLayout O;
    public g P;
    public String Q;
    private com.ironsource.sdk.j.a.d R;
    private com.ironsource.sdk.j.a.c S;
    private com.ironsource.sdk.j.e T;
    private com.ironsource.sdk.j.a.b U;
    private Boolean V;
    private String W;
    public CountDownTimer f;
    private com.ironsource.sdk.controller.f u0;
    private final com.ironsource.environment.e.a v;
    public com.ironsource.sdk.controller.w v0;
    public String w;
    public com.ironsource.sdk.g.b w0;
    private String x;
    private Object x0;
    private final String y;
    private boolean y0;
    private String z;
    private com.ironsource.sdk.controller.j z0;

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        private /* synthetic */ d.e s;
        private /* synthetic */ String t;

        public a(d.e eVar, String str) {
            this.s = eVar;
            this.t = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.e eVar = this.s;
            if (eVar != d.e.RewardedVideo && eVar != d.e.Interstitial) {
                if (eVar == d.e.OfferWall) {
                    x.this.T.onOWAdClosed();
                    return;
                }
                return;
            }
            com.ironsource.sdk.j.a.a M = x.this.M(eVar);
            if (M != null) {
                M.a(this.s, this.t);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class a0 extends WebViewClient {
        private a0() {
        }

        public /* synthetic */ a0(x xVar, byte b) {
            this();
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            Logger.i("onPageFinished", str);
            if (str.contains("adUnit") || str.contains("index.html")) {
                x.this.b(x.i0("pageFinished"));
            }
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            Logger.i("onPageStarted", str);
            super.onPageStarted(webView, str, bitmap);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            Logger.i("onReceivedError", str2 + " " + str);
            if (str2.contains("mobileController.html") && x.this.H0 != null) {
                xe3 xe3Var = x.this.H0;
                xe3Var.a("controller html - web-view receivedError on loading - " + str + " (errorCode: " + i + ")");
            }
            super.onReceivedError(webView, i, str, str2);
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String unused = x.this.w;
            renderProcessGoneDetail.didCrash();
            String str = renderProcessGoneDetail.didCrash() ? "Render process was observed to crash" : "Render process was killed by the system";
            if (x.this.H0 != null) {
                x.this.H0.b(str);
            }
            x xVar = x.this;
            if (xVar.E != null) {
                xVar.s0();
                v vVar = xVar.E;
                d.e eVar = vVar.a;
                String str2 = vVar.b;
                if (xVar.J(eVar.toString())) {
                    xVar.D(eVar, str2);
                    return true;
                }
                return true;
            }
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            boolean z;
            Logger.i("shouldInterceptRequest", str);
            try {
                z = new URL(str).getFile().contains("mraid.js");
            } catch (MalformedURLException unused) {
                z = false;
            }
            if (z) {
                StringBuilder sb = new StringBuilder("file://");
                sb.append(x.this.W);
                String C = wo1.C(sb, File.separator, "mraid.js");
                try {
                    new FileInputStream(new File(C));
                    return new WebResourceResponse("text/javascript", "UTF-8", getClass().getResourceAsStream(C));
                } catch (FileNotFoundException unused2) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Logger.i("shouldOverrideUrlLoading", str);
            try {
                if (x.this.f(str)) {
                    x.this.i();
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* loaded from: classes3.dex */
    public class b implements com.ironsource.sdk.controller.y {
        public b() {
        }

        @Override // com.ironsource.sdk.controller.y
        public final void a(String str, JSONObject jSONObject) {
            x xVar = x.this;
            x.this.b(x.b(str, jSONObject.toString()));
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        private /* synthetic */ JSONObject s;
        private /* synthetic */ String t;

        public c(JSONObject jSONObject, String str) {
            this.s = jSONObject;
            this.t = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            x.C(x.this, this.s);
            x.n0(x.this, "about:blank");
            x.n0(x.this, this.t);
        }
    }

    /* loaded from: classes3.dex */
    public class d {

        /* loaded from: classes3.dex */
        public class a {
            public a() {
            }

            public final void a(boolean z, String str, com.ironsource.sdk.g.f fVar) {
                fVar.a(z ? x.t : x.u, str);
                x.B(x.this, fVar.toString(), z, null, null);
            }

            public final void a(boolean z, String str, JSONObject jSONObject) {
                try {
                    jSONObject.put(z ? x.t : x.u, str);
                    x.B(x.this, jSONObject.toString(), z, null, null);
                } catch (JSONException e) {
                    e.printStackTrace();
                    e.getMessage();
                }
            }
        }

        /* loaded from: classes3.dex */
        public class a0 implements Runnable {
            private /* synthetic */ String s;

            public a0(String str) {
                this.s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String unused = x.this.w;
                x.this.S.a(d.e.Interstitial, this.s, (com.ironsource.sdk.g.a) null);
            }
        }

        /* loaded from: classes3.dex */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                String unused = x.this.w;
                x.this.T.onOfferwallInitSuccess();
            }
        }

        /* loaded from: classes3.dex */
        public class b0 implements Runnable {
            private /* synthetic */ String s;
            private /* synthetic */ String t;

            public b0(String str, String str2) {
                this.s = str;
                this.t = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String unused = x.this.w;
                x.this.S.a(d.e.Interstitial, this.t, str);
            }
        }

        /* loaded from: classes3.dex */
        public class c implements Runnable {
            private /* synthetic */ String s;

            public c(String str) {
                this.s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String unused = x.this.w;
                x.this.T.onOfferwallInitFail(str);
            }
        }

        /* loaded from: classes3.dex */
        public class c0 implements Runnable {
            private /* synthetic */ com.ironsource.sdk.j.a.a s;
            private /* synthetic */ d.e t;
            private /* synthetic */ String u;

            public c0(com.ironsource.sdk.j.a.a aVar, d.e eVar, String str) {
                this.s = aVar;
                this.t = eVar;
                this.u = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.s.b(this.t, this.u);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.x$d$d  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0125d implements Runnable {
            public RunnableC0125d() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.k();
            }
        }

        /* loaded from: classes3.dex */
        public class d0 implements Runnable {
            private /* synthetic */ String s;

            public d0(String str) {
                this.s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.S.c(d.e.Interstitial, this.s);
                x.this.S.d(this.s);
            }
        }

        /* loaded from: classes3.dex */
        public class e implements Runnable {
            private /* synthetic */ String s;

            public e(String str) {
                this.s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.S.c(this.s);
            }
        }

        /* loaded from: classes3.dex */
        public class f implements Runnable {
            private /* synthetic */ String s;
            private /* synthetic */ String t;

            public f(String str, String str2) {
                this.s = str;
                this.t = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                x.this.S.b(this.t, str);
            }
        }

        /* loaded from: classes3.dex */
        public class g implements Runnable {
            private /* synthetic */ String s;
            private /* synthetic */ String t;

            public g(String str, String str2) {
                this.s = str;
                this.t = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                x.this.S.c(this.t, str);
            }
        }

        /* loaded from: classes3.dex */
        public class h implements Runnable {
            private /* synthetic */ String s;

            public h(String str) {
                this.s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String unused = x.this.w;
                x.this.U.a(d.e.Banner, this.s, (com.ironsource.sdk.g.a) null);
            }
        }

        /* loaded from: classes3.dex */
        public class i implements Runnable {
            private /* synthetic */ String s;
            private /* synthetic */ String t;

            public i(String str, String str2) {
                this.s = str;
                this.t = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String unused = x.this.w;
                x.this.U.a(d.e.Banner, this.t, str);
            }
        }

        /* loaded from: classes3.dex */
        public class j implements Runnable {
            private /* synthetic */ String s;
            private /* synthetic */ com.ironsource.sdk.c.a t;

            public j(String str, com.ironsource.sdk.c.a aVar) {
                this.s = str;
                this.t = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String unused = x.this.w;
                x.this.U.a(this.s, this.t);
            }
        }

        /* loaded from: classes3.dex */
        public class k implements Runnable {
            private /* synthetic */ String s;
            private /* synthetic */ String t;

            public k(String str, String str2) {
                this.s = str;
                this.t = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String unused = x.this.w;
                String str = this.s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                x.this.U.d(this.t, str);
            }
        }

        /* loaded from: classes3.dex */
        public class l implements Runnable {
            public l() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.l();
            }
        }

        /* loaded from: classes3.dex */
        public class m implements Runnable {
            private /* synthetic */ String s;

            public m(String str) {
                this.s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                x.this.T.onGetOWCreditsFailed(str);
            }
        }

        /* loaded from: classes3.dex */
        public class n implements Runnable {
            private /* synthetic */ d.e s;
            private /* synthetic */ String t;
            private /* synthetic */ String u;
            private /* synthetic */ JSONObject v;

            public n(d.e eVar, String str, String str2, JSONObject jSONObject) {
                this.s = eVar;
                this.t = str;
                this.u = str2;
                this.v = jSONObject;
            }

            @Override // java.lang.Runnable
            public final void run() {
                d.e eVar = this.s;
                if (eVar != d.e.Interstitial && eVar != d.e.RewardedVideo && eVar != d.e.Banner) {
                    if (eVar == d.e.OfferWall) {
                        x.this.T.onOfferwallEventNotificationReceived(this.u, this.v);
                        return;
                    }
                    return;
                }
                com.ironsource.sdk.j.a.a M = x.this.M(eVar);
                if (M != null) {
                    M.a(this.s, this.t, this.u, this.v);
                }
            }
        }

        /* loaded from: classes3.dex */
        public class o implements Runnable {
            private /* synthetic */ String s;

            public o(String str) {
                this.s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    String str = x.this.w;
                    Logger.i(str, "omidAPI(" + this.s + ")");
                    x.this.A0.a(new com.ironsource.sdk.g.f(this.s).toString(), new a());
                } catch (Exception e) {
                    e.printStackTrace();
                    String str2 = x.this.w;
                    Logger.i(str2, "omidAPI failed with exception " + e.getMessage());
                }
            }
        }

        /* loaded from: classes3.dex */
        public class p implements Runnable {
            public p() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.removeJavascriptInterface("GenerateTokenForMessaging");
            }
        }

        /* loaded from: classes3.dex */
        public class q implements Runnable {
            public q() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.getSettings().setMixedContentMode(0);
            }
        }

        /* loaded from: classes3.dex */
        public class r implements Runnable {
            private /* synthetic */ int s;
            private /* synthetic */ String t;
            private /* synthetic */ com.ironsource.sdk.g.a u;

            public r(int i, String str, com.ironsource.sdk.g.a aVar) {
                this.s = i;
                this.t = str;
                this.u = aVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (this.s <= 0) {
                    x.this.R.b(this.t);
                    return;
                }
                String unused = x.this.w;
                x.this.R.a(d.e.RewardedVideo, this.t, this.u);
            }
        }

        /* loaded from: classes3.dex */
        public class s implements Runnable {
            private /* synthetic */ String s;

            public s(String str) {
                this.s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                JSONObject c;
                try {
                    ze3 ze3Var = x.this.F0;
                    JSONObject jSONObject = new JSONObject(this.s);
                    a aVar = new a();
                    com.ironsource.sdk.controller.n nVar = new com.ironsource.sdk.controller.n(jSONObject);
                    com.ironsource.sdk.controller.o oVar = new com.ironsource.sdk.controller.o(aVar);
                    try {
                        String str = nVar.a;
                        JSONObject jSONObject2 = nVar.b;
                        String str2 = ze3Var.a;
                        if (!jSONObject2.has("filePath") || !jSONObject2.has("fileName")) {
                            throw new Exception("Missing params for file");
                        }
                        String string = jSONObject2.getString("filePath");
                        com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(str2, string), jSONObject2.getString("fileName"));
                        IronSourceStorageUtils.ensurePathSafety(cVar, ze3Var.a);
                        char c2 = 65535;
                        boolean z = false;
                        switch (str.hashCode()) {
                            case -2073025383:
                                if (str.equals("saveFile")) {
                                    c2 = 0;
                                    break;
                                }
                                break;
                            case -1137024519:
                                if (str.equals("deleteFolder")) {
                                    c2 = 2;
                                    break;
                                }
                                break;
                            case -318115535:
                                if (str.equals("getTotalSizeOfFiles")) {
                                    c2 = 4;
                                    break;
                                }
                                break;
                            case 537556755:
                                if (str.equals("updateAttributesOfFile")) {
                                    c2 = 5;
                                    break;
                                }
                                break;
                            case 1764172231:
                                if (str.equals("deleteFile")) {
                                    c2 = 1;
                                    break;
                                }
                                break;
                            case 1953259713:
                                if (str.equals("getFiles")) {
                                    c2 = 3;
                                    break;
                                }
                                break;
                        }
                        if (c2 == 0) {
                            String optString = jSONObject2.optString("fileUrl");
                            final ze3.a aVar2 = new ze3.a(oVar, nVar);
                            final com.ironsource.sdk.h.b bVar = ze3Var.b;
                            if (TextUtils.isEmpty(optString)) {
                                throw new Exception("Missing params for file");
                            }
                            if (com.ironsource.environment.h.a(bVar.b.b) <= 0) {
                                throw new Exception("no_disk_space");
                            }
                            if (!SDKUtils.isExternalStorageAvailable()) {
                                throw new Exception("sotrage_unavailable");
                            }
                            if (!a.AnonymousClass1.b(bVar.a)) {
                                throw new Exception("no_network_connection");
                            }
                            com.ironsource.sdk.h.a aVar3 = bVar.c;
                            String path = cVar.getPath();
                            com.ironsource.sdk.k.c cVar2 = new com.ironsource.sdk.k.c() { // from class: com.ironsource.sdk.h.b.1

                                /* renamed from: com.ironsource.sdk.h.b$1$a */
                                /* loaded from: classes3.dex */
                                public class a extends JSONObject {
                                    public a() {
                                        AnonymousClass1.this = r3;
                                        put("lastReferencedTime", System.currentTimeMillis());
                                    }
                                }

                                @Override // com.ironsource.sdk.k.c
                                public final void a(c cVar3) {
                                    aVar2.a(cVar3);
                                    try {
                                        bVar.d.c(cVar3.getName(), new a());
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }

                                @Override // com.ironsource.sdk.k.c
                                public final void a(c cVar3, com.ironsource.sdk.g.e eVar) {
                                    aVar2.a(cVar3, eVar);
                                }
                            };
                            if (path != null) {
                                aVar3.a.put(path, cVar2);
                            }
                            if (!cVar.exists()) {
                                bVar.b.a(cVar, optString, bVar.c);
                                return;
                            }
                            Message message = new Message();
                            message.obj = cVar;
                            message.what = 1015;
                            bVar.c.sendMessage(message);
                            return;
                        }
                        if (c2 == 1) {
                            com.ironsource.sdk.h.b bVar2 = ze3Var.b;
                            if (cVar.exists()) {
                                if (!cVar.delete()) {
                                    throw new Exception("Failed to delete file");
                                }
                                bVar2.d.a(cVar.getName());
                            }
                            c = ze3.c(nVar, cVar.a());
                        } else if (c2 == 2) {
                            com.ironsource.sdk.h.b bVar3 = ze3Var.b;
                            if (cVar.exists()) {
                                ArrayList<com.ironsource.sdk.h.c> filesInFolderRecursive = IronSourceStorageUtils.getFilesInFolderRecursive(cVar);
                                if (IronSourceStorageUtils.deleteFolderContentRecursive(cVar) && cVar.delete()) {
                                    z = true;
                                }
                                if (!z) {
                                    throw new Exception("Failed to delete folder");
                                }
                                bVar3.d.a(filesInFolderRecursive);
                            }
                            c = ze3.c(nVar, cVar.a());
                        } else if (c2 == 3) {
                            com.ironsource.sdk.h.b bVar4 = ze3Var.b;
                            if (!cVar.exists()) {
                                throw new Exception("Folder does not exist");
                            }
                            c = ze3.c(nVar, IronSourceStorageUtils.buildFilesMapOfDirectory(cVar, bVar4.d.a()));
                        } else if (c2 != 4) {
                            if (c2 != 5) {
                                return;
                            }
                            JSONObject optJSONObject = jSONObject2.optJSONObject("attributesToUpdate");
                            com.ironsource.sdk.h.b bVar5 = ze3Var.b;
                            if (optJSONObject == null) {
                                throw new Exception("Missing attributes to update");
                            }
                            if (!cVar.exists()) {
                                throw new Exception("File does not exist");
                            }
                            if (!bVar5.d.b(cVar.getName(), optJSONObject)) {
                                throw new Exception("Failed to update attribute");
                            }
                            oVar.a(nVar, ze3.c(nVar, cVar.a()));
                            return;
                        } else if (!cVar.exists()) {
                            throw new Exception("Folder does not exist");
                        } else {
                            c = ze3.a(nVar, IronSourceStorageUtils.getTotalSizeOfDir(cVar));
                        }
                        oVar.a(nVar, c);
                    } catch (Exception e) {
                        oVar.b(nVar, ze3.b(nVar, e.getMessage()));
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                    String str3 = x.this.w;
                    Logger.i(str3, "fileSystemAPI failed with exception " + e2.getMessage());
                }
            }
        }

        /* loaded from: classes3.dex */
        public class t implements Runnable {
            private /* synthetic */ String s;
            private /* synthetic */ String t;
            private /* synthetic */ int u;
            private /* synthetic */ boolean v;
            private /* synthetic */ int w;
            private /* synthetic */ boolean x;
            private /* synthetic */ String y;
            private /* synthetic */ String z;

            public t(String str, String str2, int i, boolean z, int i2, boolean z2, String str3, String str4) {
                this.s = str;
                this.t = str2;
                this.u = i;
                this.v = z;
                this.w = i2;
                this.x = z2;
                this.y = str3;
                this.z = str4;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (this.s.equalsIgnoreCase(d.e.RewardedVideo.toString())) {
                    x.this.R.a(this.t, this.u);
                } else if (this.s.equalsIgnoreCase(d.e.OfferWall.toString()) && this.v && x.this.T.onOWAdCredited(this.u, this.w, this.x) && !TextUtils.isEmpty(this.y)) {
                    if (com.ironsource.sdk.utils.b.a().a(this.y, x.this.z, x.this.A)) {
                        x.B(x.this, this.z, true, null, null);
                    } else {
                        x.B(x.this, this.z, false, "Time Stamp could not be stored", null);
                    }
                }
            }
        }

        /* loaded from: classes3.dex */
        public class u implements Runnable {
            private /* synthetic */ String s;
            private /* synthetic */ int t;

            public u(String str, int i) {
                this.s = str;
                this.t = i;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.S.b(this.s, this.t);
            }
        }

        /* loaded from: classes3.dex */
        public class v implements Runnable {
            public v() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x xVar = x.this;
                xVar.setOnTouchListener(new z(xVar, (byte) 0));
            }
        }

        /* loaded from: classes3.dex */
        public class w implements Runnable {
            private /* synthetic */ String s;
            private /* synthetic */ String t;

            public w(String str, String str2) {
                this.s = str;
                this.t = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String unused = x.this.w;
                x.this.R.a(d.e.RewardedVideo, this.t, str);
            }
        }

        /* renamed from: com.ironsource.sdk.controller.x$d$x  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class RunnableC0126x implements Runnable {
            private /* synthetic */ String s;
            private /* synthetic */ String t;

            public RunnableC0126x(String str, String str2) {
                this.s = str;
                this.t = str2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                String unused = x.this.w;
                x.this.R.a(this.t, str);
            }
        }

        /* loaded from: classes3.dex */
        public class y implements Runnable {
            private /* synthetic */ String s;

            public y(String str) {
                this.s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.T.onOWShowSuccess(this.s);
            }
        }

        /* loaded from: classes3.dex */
        public class z implements Runnable {
            private /* synthetic */ String s;

            public z(String str) {
                this.s = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                String str = this.s;
                if (str == null) {
                    str = "We're sorry, some error occurred. we will investigate it";
                }
                x.this.T.onOWShowFail(str);
            }
        }

        public d() {
        }

        private void a(String str, boolean z2) {
            com.ironsource.sdk.g.c a2 = x.this.z0.a(d.e.Interstitial, str);
            if (a2 != null) {
                a2.f = z2;
            }
        }

        private void b(JSONObject jSONObject) {
            try {
                FeaturesManager featuresManager = FeaturesManager.getInstance();
                if (featuresManager.a().isEmpty()) {
                    return;
                }
                jSONObject.put("nativeFeatures", new JSONArray((Collection) featuresManager.a()));
            } catch (Exception e2) {
                com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.m, new com.ironsource.sdk.a.a().a("callfailreason", e2.getMessage()).a);
                Logger.d(x.this.w, "getControllerConfig Error while adding supported features data from FeaturesManager");
            }
        }

        private void c(JSONObject jSONObject, String str) {
            if (d(str)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(str);
                    jSONObject.putOpt("testerABGroup", jSONObject2.get("testerABGroup"));
                    jSONObject.putOpt("testFriendlyName", jSONObject2.get("testFriendlyName"));
                } catch (JSONException unused) {
                    Logger.d(x.this.w, "getControllerConfig Error while parsing Tester AB Group parameters");
                }
            }
        }

        private static boolean d(String str) {
            if (TextUtils.isEmpty(str) || str.contains("-1")) {
                return false;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.getString("testerABGroup").isEmpty()) {
                    return false;
                }
                return !jSONObject.getString("testFriendlyName").isEmpty();
            } catch (JSONException e2) {
                e2.printStackTrace();
                return false;
            }
        }

        private void e(JSONObject jSONObject) {
            try {
                jSONObject.put("controllerSourceData", x.this.u0.h());
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public void adClicked(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "adClicked(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            x xVar = x.this;
            d.e m0 = x.m0(d);
            com.ironsource.sdk.j.a.a M = x.this.M(m0);
            if (m0 == null || M == null) {
                return;
            }
            x.this.Y(new c0(M, m0, fetchDemandSourceId));
        }

        @JavascriptInterface
        public void adCredited(String str) {
            String str2;
            boolean z2;
            boolean z3;
            com.ironsource.sdk.g.c a2;
            String unused = x.this.x;
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("credits");
            boolean z4 = false;
            int parseInt = d != null ? Integer.parseInt(d) : 0;
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d2 = fVar.d("productType");
            if (TextUtils.isEmpty(d2)) {
                String unused2 = x.this.x;
            }
            d.e eVar = d.e.Interstitial;
            if (eVar.toString().equalsIgnoreCase(d2)) {
                if (!x.this.J(eVar.toString()) || (a2 = x.this.z0.a(eVar, fetchDemandSourceId)) == null) {
                    return;
                }
                Map<String, String> map = a2.d;
                if (map != null && map.containsKey("rewarded")) {
                    z4 = Boolean.parseBoolean(a2.d.get("rewarded"));
                }
                if (z4) {
                    x.this.Y(new u(fetchDemandSourceId, parseInt));
                    return;
                }
                return;
            }
            String d3 = fVar.d("total");
            int parseInt2 = d3 != null ? Integer.parseInt(d3) : 0;
            if (!d.e.OfferWall.toString().equalsIgnoreCase(d2)) {
                str2 = null;
                z2 = false;
                z3 = false;
            } else if (fVar.b("signature") || fVar.b("timestamp") || fVar.b("totalCreditsFlag")) {
                x.B(x.this, str, false, "One of the keys are missing: signature/timestamp/totalCreditsFlag", null);
                return;
            } else {
                String d4 = fVar.d("signature");
                StringBuilder G = wo1.G(d3);
                G.append(x.this.z);
                G.append(x.this.A);
                if (d4.equalsIgnoreCase(SDKUtils.getMD5(G.toString()))) {
                    z4 = true;
                } else {
                    x.B(x.this, str, false, "Controller signature is not equal to SDK signature", null);
                }
                boolean e2 = fVar.e("totalCreditsFlag");
                str2 = fVar.d("timestamp");
                z3 = e2;
                z2 = z4;
            }
            if (x.this.J(d2)) {
                x.this.Y(new t(d2, fetchDemandSourceId, parseInt, z2, parseInt2, z3, str2, str));
            }
        }

        @JavascriptInterface
        public void adUnitsReady(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "adUnitsReady(" + str + ")");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            com.ironsource.sdk.g.a aVar = new com.ironsource.sdk.g.a(str);
            if (!aVar.c) {
                x.B(x.this, str, false, "Num Of Ad Units Do Not Exist", null);
                return;
            }
            x.B(x.this, str, true, null, null);
            String str3 = aVar.a;
            if (d.e.RewardedVideo.toString().equalsIgnoreCase(str3) && x.this.J(str3)) {
                x.this.Y(new r(Integer.parseInt(aVar.b), fetchDemandSourceId, aVar));
            }
        }

        @JavascriptInterface
        public void adViewAPI(String str) {
            try {
                String str2 = x.this.w;
                Logger.i(str2, "adViewAPI(" + str + ")");
                x.this.E0.a(new com.ironsource.sdk.g.f(str).toString(), new a());
            } catch (Exception e2) {
                e2.printStackTrace();
                String str3 = x.this.w;
                Logger.i(str3, "adViewAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void bannerViewAPI(String str) {
            Logger.e(x.this.w, "bannerViewAPI is not supported in this native version, only adview API");
        }

        @JavascriptInterface
        public void cleanAdInstance(String str) {
            Map<String, com.ironsource.sdk.g.c> c2;
            com.ironsource.sdk.g.c remove;
            try {
                String str2 = x.this.w;
                Logger.i(str2, "cleanAdInstance(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d = fVar.d("productType");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                if (TextUtils.isEmpty(fetchDemandSourceId)) {
                    return;
                }
                x xVar = x.this;
                d.e m0 = x.m0(d);
                if (m0 != null) {
                    com.ironsource.sdk.controller.j jVar = x.this.z0;
                    if (TextUtils.isEmpty(fetchDemandSourceId) || (c2 = jVar.c(m0)) == null || (remove = c2.remove(fetchDemandSourceId)) == null) {
                        return;
                    }
                    remove.g = null;
                    Map<String, String> map = remove.d;
                    if (map != null) {
                        map.clear();
                    }
                    remove.d = null;
                }
            } catch (Exception e2) {
                x.B(x.this, str, false, e2.getMessage(), null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void clearLastUpdateTimeData(String str) {
            try {
                com.ironsource.sdk.utils.b a2 = com.ironsource.sdk.utils.b.a();
                ArrayList arrayList = new ArrayList();
                String[] strArr = (String[]) a2.a.getAll().keySet().toArray(new String[0]);
                SharedPreferences.Editor edit = a2.a.edit();
                for (String str2 : strArr) {
                    if (com.ironsource.sdk.utils.b.b(str2)) {
                        arrayList.add(str2);
                        edit.remove(str2);
                    }
                }
                edit.apply();
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                if (!arrayList.isEmpty()) {
                    fVar.a("removedAdsLastUpdateTime", arrayList.toString());
                }
                x.B(x.this, fVar.toString(), true, null, null);
            } catch (Exception e2) {
                x.B(x.this, str, false, e2.getMessage(), null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFile(String str) {
            try {
                String str2 = x.this.w;
                Logger.i(str2, "deleteFile(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d = fVar.d(o31.b);
                String d2 = fVar.d(la1.k);
                if (d2 != null && !TextUtils.isEmpty(d)) {
                    com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(x.this.W, d2), d);
                    IronSourceStorageUtils.ensurePathSafety(cVar, x.this.W);
                    if (!cVar.exists()) {
                        x.B(x.this, str, false, "File not exist", "1");
                        return;
                    }
                    x.B(x.this, str, IronSourceStorageUtils.deleteFile(cVar), null, null);
                    return;
                }
                x.B(x.this, str, false, "Missing parameters for file", "1");
            } catch (Exception e2) {
                x.B(x.this, str, false, e2.getMessage(), null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deleteFolder(String str) {
            try {
                String str2 = x.this.w;
                Logger.i(str2, "deleteFolder(" + str + ")");
                String d = new com.ironsource.sdk.g.f(str).d(la1.k);
                if (d == null) {
                    x.B(x.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(x.this.W, d));
                IronSourceStorageUtils.ensurePathSafety(cVar, x.this.W);
                if (!cVar.exists()) {
                    x.B(x.this, str, false, "Folder not exist", "1");
                    return;
                }
                x.B(x.this, str, IronSourceStorageUtils.deleteFolder(cVar.getPath()), null, null);
            } catch (Exception e2) {
                x.B(x.this, str, false, e2.getMessage(), null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void deviceDataAPI(String str) {
            try {
                String str2 = x.this.w;
                Logger.i(str2, "deviceDataAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                com.ironsource.sdk.controller.k kVar = x.this.D0;
                String fVar2 = fVar.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar2);
                k.a aVar2 = new k.a((byte) 0);
                aVar2.a = jSONObject.optString("deviceDataFunction");
                aVar2.b = jSONObject.optJSONObject("deviceDataParams");
                aVar2.c = jSONObject.optString("success");
                aVar2.d = jSONObject.optString("fail");
                if (!"getDeviceData".equals(aVar2.a)) {
                    String str3 = com.ironsource.sdk.controller.k.a;
                    Logger.i(str3, "unhandled API request " + fVar2);
                    return;
                }
                String str4 = aVar2.c;
                com.ironsource.sdk.g.f fVar3 = new com.ironsource.sdk.g.f();
                fVar3.a(SDKUtils.encodeString("sdCardAvailable"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.d())));
                fVar3.a(SDKUtils.encodeString("totalDeviceRAM"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.d(kVar.b))));
                fVar3.a(SDKUtils.encodeString("isCharging"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.e(kVar.b))));
                fVar3.a(SDKUtils.encodeString("chargingType"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.f(kVar.b))));
                fVar3.a(SDKUtils.encodeString("airplaneMode"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.g(kVar.b))));
                fVar3.a(SDKUtils.encodeString("stayOnWhenPluggedIn"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.h(kVar.b))));
                aVar.a(true, str4, fVar3);
            } catch (Exception e2) {
                e2.printStackTrace();
                String str5 = x.this.w;
                Logger.i(str5, "deviceDataAPI failed with exception " + e2.getMessage());
            }
        }

        @JavascriptInterface
        public void displayWebView(String str) {
            wo1.c0("displayWebView(", str, ")", x.this.w);
            x.B(x.this, str, true, null, null);
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            boolean booleanValue = ((Boolean) fVar.c(rs2.f.a.v0)).booleanValue();
            String d = fVar.d("productType");
            boolean e2 = fVar.e("standaloneView");
            String d2 = fVar.d("adViewId");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            boolean e3 = fVar.e("ctrWVPauseResume");
            if (!booleanValue) {
                x xVar = x.this;
                xVar.P = g.Gone;
                xVar.s0();
                return;
            }
            x.this.y0 = fVar.e("immersive");
            boolean e4 = fVar.e("activityThemeTranslucent");
            x xVar2 = x.this;
            g gVar = xVar2.P;
            g gVar2 = g.Display;
            if (gVar == gVar2) {
                String str2 = xVar2.w;
                Logger.i(str2, "State: " + x.this.P);
                return;
            }
            xVar2.P = gVar2;
            String str3 = xVar2.w;
            Logger.i(str3, "State: " + x.this.P);
            Activity a2 = x.this.J0.a();
            String str4 = x.this.Q;
            int k2 = com.ironsource.environment.h.k(a2);
            if (e2) {
                com.ironsource.sdk.controller.i iVar = new com.ironsource.sdk.controller.i(a2);
                iVar.addView(x.this.O);
                x xVar3 = x.this;
                iVar.t = xVar3;
                xVar3.K0 = iVar;
                xVar3.requestFocus();
                Activity a3 = iVar.t.J0.a();
                iVar.s = a3;
                int i2 = (((a3.getWindow().getAttributes().flags & 1024) != 0) || (i2 = iVar.a()) <= 0) ? 0 : 0;
                int c2 = iVar.c();
                try {
                    Context context = iVar.s;
                    if (context != null) {
                        int o2 = com.ironsource.environment.h.o(context);
                        if (o2 == 1) {
                            iVar.setPadding(0, i2, 0, c2);
                        } else if (o2 == 2) {
                            iVar.setPadding(0, i2, c2, 0);
                        }
                    }
                } catch (Exception unused) {
                }
                ((Activity) iVar.s).runOnUiThread(new i.a());
                return;
            }
            Intent intent = e4 ? new Intent(a2, InterstitialActivity.class) : new Intent(a2, ControllerActivity.class);
            d.e eVar = d.e.RewardedVideo;
            if (eVar.toString().equalsIgnoreCase(d)) {
                if ("application".equals(str4)) {
                    str4 = SDKUtils.translateRequestedOrientation(com.ironsource.environment.h.m(a2));
                }
                intent.putExtra("productType", eVar.toString());
                x.this.w0.e = eVar.ordinal();
                x.this.w0.c = fetchDemandSourceId;
                if (x.this.J(eVar.toString())) {
                    x.this.R.c(eVar, fetchDemandSourceId);
                }
            } else {
                d.e eVar2 = d.e.OfferWall;
                if (eVar2.toString().equalsIgnoreCase(d)) {
                    intent.putExtra("productType", eVar2.toString());
                    x.this.w0.e = eVar2.ordinal();
                } else {
                    d.e eVar3 = d.e.Interstitial;
                    if (eVar3.toString().equalsIgnoreCase(d)) {
                        if ("application".equals(str4)) {
                            str4 = SDKUtils.translateRequestedOrientation(com.ironsource.environment.h.m(a2));
                        }
                        intent.putExtra("productType", eVar3.toString());
                    }
                }
            }
            if (d2 != null) {
                intent.putExtra("adViewId", d2);
            }
            intent.putExtra("ctrWVPauseResume", e3);
            intent.setFlags(536870912);
            intent.putExtra("immersive", x.this.y0);
            intent.putExtra("orientation_set_flag", str4);
            intent.putExtra("rotation_set_flag", k2);
            x.this.E = new v(x.m0(d), fetchDemandSourceId);
            a2.startActivity(intent);
        }

        @JavascriptInterface
        public void fileSystemAPI(String str) {
            wo1.c0("fileSystemAPI(", str, ")", x.this.w);
            x.this.R(new s(str));
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x004a, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L6;
         */
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void getApplicationInfo(String str) {
            wo1.c0("getApplicationInfo(", str, ")", x.this.w);
            String O = x.O(x.this, str);
            String V = x.V(x.this, str);
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            Object[] b02 = x.this.b0(fVar.d("productType"), SDKUtils.fetchDemandSourceId(fVar));
            String str2 = (String) b02[0];
            if (((Boolean) b02[1]).booleanValue()) {
                if (!TextUtils.isEmpty(V)) {
                    O = V;
                }
                O = null;
            }
            if (TextUtils.isEmpty(O)) {
                return;
            }
            x xVar = x.this;
            x.this.b(x.x(O, str2, "onGetApplicationInfoSuccess", "onGetApplicationInfoFail"));
        }

        @JavascriptInterface
        public void getCachedFilesMap(String str) {
            x xVar;
            String str2;
            wo1.c0("getCachedFilesMap(", str, ")", x.this.w);
            String O = x.O(x.this, str);
            if (TextUtils.isEmpty(O)) {
                return;
            }
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            if (fVar.a(la1.k)) {
                String str3 = (String) fVar.c(la1.k);
                if (IronSourceStorageUtils.isPathExist(x.this.W, str3)) {
                    String cachedFilesMap = IronSourceStorageUtils.getCachedFilesMap(x.this.W, str3);
                    x xVar2 = x.this;
                    x.this.b(x.x(O, cachedFilesMap, "onGetCachedFilesMapSuccess", "onGetCachedFilesMapFail"));
                    return;
                }
                xVar = x.this;
                str2 = "path file does not exist on disk";
            } else {
                xVar = x.this;
                str2 = "path key does not exist";
            }
            x.B(xVar, str, false, str2, null);
        }

        @JavascriptInterface
        public void getConnectivityInfo(String str) {
            String b2;
            String str2 = x.this.w;
            Logger.i(str2, "getConnectivityInfo(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d(x.t);
            String d2 = fVar.d(x.u);
            JSONObject jSONObject = new JSONObject();
            if (x.this.I0 != null) {
                com.ironsource.sdk.service.Connectivity.b bVar = x.this.I0;
                jSONObject = bVar.a.c(x.this.getContext());
            }
            if (jSONObject.length() > 0) {
                x xVar = x.this;
                b2 = x.b(d, jSONObject.toString());
            } else {
                x xVar2 = x.this;
                String a2 = x.a("errMsg", "failed to retrieve connection info", null, null, null, null, null, null, null, false);
                x xVar3 = x.this;
                b2 = x.b(d2, a2);
            }
            x.this.b(b2);
        }

        @JavascriptInterface
        public void getControllerConfig(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "getControllerConfig(" + str + ")");
            String d = new com.ironsource.sdk.g.f(str).d(x.t);
            if (TextUtils.isEmpty(d)) {
                return;
            }
            JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
            b(controllerConfigAsJSONObject);
            c(controllerConfigAsJSONObject, SDKUtils.getTesterParameters());
            e(controllerConfigAsJSONObject);
            x xVar = x.this;
            x.this.b(x.b(d, controllerConfigAsJSONObject.toString()));
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[Catch: Exception -> 0x008c, TRY_LEAVE, TryCatch #0 {Exception -> 0x008c, blocks: (B:6:0x0036, B:8:0x003c, B:10:0x0058, B:15:0x0062, B:17:0x0076, B:19:0x0080, B:16:0x0070), top: B:24:0x0036 }] */
        /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void getDemandSourceState(String str) {
            String V;
            String str2 = x.this.w;
            Logger.i(str2, "getMediationState(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("demandSourceName");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d2 = fVar.d("productType");
            if (d2 == null || d == null) {
                return;
            }
            try {
                d.e productType = SDKUtils.getProductType(d2);
                if (productType == null) {
                    return;
                }
                com.ironsource.sdk.g.c a2 = x.this.z0.a(productType, fetchDemandSourceId);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("productType", d2);
                jSONObject.put("demandSourceName", d);
                jSONObject.put("demandSourceId", fetchDemandSourceId);
                if (a2 != null) {
                    if (!(a2.c == -1)) {
                        V = x.O(x.this, str);
                        jSONObject.put(CallMraidJS.b, a2.c);
                        String jSONObject2 = jSONObject.toString();
                        if (TextUtils.isEmpty(V)) {
                            x xVar = x.this;
                            x.this.b(x.b(V, jSONObject2));
                            return;
                        }
                        return;
                    }
                }
                V = x.V(x.this, str);
                String jSONObject22 = jSONObject.toString();
                if (TextUtils.isEmpty(V)) {
                }
            } catch (Exception e2) {
                x.B(x.this, str, false, e2.getMessage(), null);
                e2.printStackTrace();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:8:0x003f, code lost:
            if (android.text.TextUtils.isEmpty(r0) == false) goto L6;
         */
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void getDeviceStatus(String str) {
            wo1.c0("getDeviceStatus(", str, ")", x.this.w);
            String O = x.O(x.this, str);
            String V = x.V(x.this, str);
            x xVar = x.this;
            Object[] a02 = xVar.a0(xVar.getContext());
            String str2 = (String) a02[0];
            if (((Boolean) a02[1]).booleanValue()) {
                if (!TextUtils.isEmpty(V)) {
                    O = V;
                }
                O = null;
            }
            if (TextUtils.isEmpty(O)) {
                return;
            }
            x xVar2 = x.this;
            x.this.b(x.x(O, str2, "onGetDeviceStatusSuccess", "onGetDeviceStatusFail"));
        }

        @JavascriptInterface
        public void getDeviceVolume(String str) {
            wo1.c0("getDeviceVolume(", str, ")", x.this.w);
            try {
                com.ironsource.sdk.utils.a.a(x.this.J0.a());
                float b2 = com.ironsource.sdk.utils.a.b(x.this.J0.a());
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                fVar.a("deviceVolume", String.valueOf(b2));
                x.B(x.this, fVar.toString(), true, null, null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void getOrientation(String str) {
            Activity a2 = x.this.J0.a();
            if (a2 != null) {
                String O = x.O(x.this, str);
                String jSONObject = SDKUtils.getOrientation(a2).toString();
                if (TextUtils.isEmpty(O)) {
                    return;
                }
                x xVar = x.this;
                x.this.b(x.x(O, jSONObject, "onGetOrientationSuccess", "onGetOrientationFail"));
            }
        }

        @JavascriptInterface
        public void getUserData(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "getUserData(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            if (!fVar.a("key")) {
                x.B(x.this, str, false, "key does not exist", null);
                return;
            }
            String O = x.O(x.this, str);
            String d = fVar.d("key");
            String string = com.ironsource.sdk.utils.b.a().a.getString(d, null);
            if (string == null) {
                string = "{}";
            }
            x xVar = x.this;
            String a2 = x.a(d, string, null, null, null, null, null, null, null, false);
            x xVar2 = x.this;
            x.this.b(x.b(O, a2));
        }

        @JavascriptInterface
        public void iabTokenAPI(String str) {
            try {
                String str2 = x.this.w;
                Logger.i(str2, "iabTokenAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                com.ironsource.sdk.controller.v vVar = x.this.C0;
                String fVar2 = fVar.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar2);
                v.a aVar2 = new v.a((byte) 0);
                aVar2.a = jSONObject.optString("functionName");
                aVar2.b = jSONObject.optJSONObject("functionParams");
                aVar2.c = jSONObject.optString("success");
                aVar2.d = jSONObject.optString("fail");
                if ("updateToken".equals(aVar2.a)) {
                    JSONObject jSONObject2 = aVar2.b;
                    com.ironsource.sdk.g.f fVar3 = new com.ironsource.sdk.g.f();
                    try {
                        com.ironsource.sdk.service.c cVar = vVar.d;
                        com.ironsource.mediationsdk.adunit.a.a.a("ctgp", jSONObject2);
                        vVar.c.a(jSONObject2);
                        aVar.a(true, aVar2.c, fVar3);
                        return;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        String str3 = com.ironsource.sdk.controller.v.a;
                        Logger.i(str3, "updateToken exception " + e2.getMessage());
                        aVar.a(false, aVar2.d, fVar3);
                        return;
                    }
                } else if (!"getToken".equals(aVar2.a)) {
                    String str4 = com.ironsource.sdk.controller.v.a;
                    Logger.i(str4, "unhandled API request " + fVar2);
                    return;
                } else {
                    try {
                        aVar.a(true, aVar2.c, SDKUtils.getControllerConfigAsJSONObject().optBoolean("oneToken") ? vVar.a() : vVar.c.b(vVar.e));
                        return;
                    } catch (Exception e3) {
                        String str5 = aVar2.d;
                        String message = e3.getMessage();
                        com.ironsource.sdk.g.f fVar4 = new com.ironsource.sdk.g.f();
                        fVar4.a(x.u, str5);
                        fVar4.a("data", message);
                        x.B(x.this, fVar4.toString(), false, null, null);
                        return;
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
                String str6 = x.this.w;
                Logger.i(str6, "iabTokenAPI failed with exception " + e4.getMessage());
            }
            e4.printStackTrace();
            String str62 = x.this.w;
            Logger.i(str62, "iabTokenAPI failed with exception " + e4.getMessage());
        }

        @JavascriptInterface
        public void initController(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "initController(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            CountDownTimer countDownTimer = x.this.f;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                x.this.f = null;
            }
            if (fVar.a("stage")) {
                String d = fVar.d("stage");
                if ("ready".equalsIgnoreCase(d)) {
                    x.this.D = true;
                    x.this.H0.b();
                } else if ("loaded".equalsIgnoreCase(d)) {
                    x.this.H0.a();
                } else if (!"failed".equalsIgnoreCase(d)) {
                    Logger.i(x.this.w, "No STAGE mentioned! should not get here!");
                } else {
                    String d2 = fVar.d("errMsg");
                    xe3 xe3Var = x.this.H0;
                    xe3Var.a("controller js failed to initialize : " + d2);
                }
            }
        }

        @JavascriptInterface
        public void omidAPI(String str) {
            x.this.E(new o(str));
        }

        @JavascriptInterface
        public void onAdWindowsClosed(String str) {
            wo1.c0("onAdWindowsClosed(", str, ")", x.this.w);
            x.this.w0.e = -1;
            x.this.w0.c = null;
            x.this.E = null;
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("productType");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            x xVar = x.this;
            d.e m0 = x.m0(d);
            String unused = x.this.x;
            String str2 = "onAdClosed() with type " + m0;
            if (x.this.J(d)) {
                x.this.D(m0, fetchDemandSourceId);
            }
        }

        @JavascriptInterface
        public void onCleanUpNonDisplayBannersSuccess(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "onCleanUpNonDisplayBannersSuccess() value=" + str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoFail(String str) {
            wo1.c0("onGetApplicationInfoFail(", str, ")", x.this.w);
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onGetApplicationInfoFail", str);
        }

        @JavascriptInterface
        public void onGetApplicationInfoSuccess(String str) {
            wo1.c0("onGetApplicationInfoSuccess(", str, ")", x.this.w);
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onGetApplicationInfoSuccess", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapFail(String str) {
            wo1.c0("onGetCachedFilesMapFail(", str, ")", x.this.w);
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onGetCachedFilesMapFail", str);
        }

        @JavascriptInterface
        public void onGetCachedFilesMapSuccess(String str) {
            wo1.c0("onGetCachedFilesMapSuccess(", str, ")", x.this.w);
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onGetCachedFilesMapSuccess", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusFail(String str) {
            wo1.c0("onGetDeviceStatusFail(", str, ")", x.this.w);
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onGetDeviceStatusFail", str);
        }

        @JavascriptInterface
        public void onGetDeviceStatusSuccess(String str) {
            wo1.c0("onGetDeviceStatusSuccess(", str, ")", x.this.w);
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onGetDeviceStatusSuccess", str);
        }

        @JavascriptInterface
        public void onGetUserCreditsFail(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "onGetUserCreditsFail(" + str + ")");
            String d = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (x.this.J(d.e.OfferWall.toString())) {
                x.this.Y(new m(d));
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onGetUserCreditsFail", str);
        }

        @JavascriptInterface
        public void onInitBannerFail(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "onInitBannerFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(x.this.w, "onInitBannerFail failed with no demand source");
                return;
            }
            com.ironsource.sdk.controller.j jVar = x.this.z0;
            d.e eVar = d.e.Banner;
            com.ironsource.sdk.g.c a2 = jVar.a(eVar, fetchDemandSourceId);
            if (a2 != null) {
                a2.a(3);
            }
            if (x.this.J(eVar.toString())) {
                x.this.Y(new i(d, fetchDemandSourceId));
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onInitBannerFail", str);
        }

        @JavascriptInterface
        public void onInitBannerSuccess(String str) {
            Logger.i(x.this.w, "onInitBannerSuccess()");
            x.X(x.this, "onInitBannerSuccess", "true");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(x.this.w, "onInitBannerSuccess failed with no demand source");
            } else if (x.this.J(d.e.Banner.toString())) {
                x.this.Y(new h(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitInterstitialFail(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "onInitInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(x.this.w, "onInitInterstitialSuccess failed with no demand source");
                return;
            }
            com.ironsource.sdk.controller.j jVar = x.this.z0;
            d.e eVar = d.e.Interstitial;
            com.ironsource.sdk.g.c a2 = jVar.a(eVar, fetchDemandSourceId);
            if (a2 != null) {
                a2.a(3);
            }
            if (x.this.J(eVar.toString())) {
                x.this.Y(new b0(d, fetchDemandSourceId));
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onInitInterstitialFail", str);
        }

        @JavascriptInterface
        public void onInitInterstitialSuccess(String str) {
            Logger.i(x.this.w, "onInitInterstitialSuccess()");
            x.X(x.this, "onInitInterstitialSuccess", "true");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(x.this.w, "onInitInterstitialSuccess failed with no demand source");
            } else if (x.this.J(d.e.Interstitial.toString())) {
                x.this.Y(new a0(fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onInitOfferWallFail(String str) {
            wo1.c0("onInitOfferWallFail(", str, ")", x.this.w);
            x.this.w0.i = false;
            String d = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (x.this.w0.h) {
                x.this.w0.h = false;
                if (x.this.J(d.e.OfferWall.toString())) {
                    x.this.Y(new c(d));
                }
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onInitOfferWallFail", str);
        }

        @JavascriptInterface
        public void onInitOfferWallSuccess(String str) {
            x.X(x.this, "onInitOfferWallSuccess", "true");
            x.this.w0.i = true;
            if (x.this.w0.h) {
                x.this.w0.h = false;
                if (x.this.J(d.e.OfferWall.toString())) {
                    x.this.Y(new b());
                }
            }
        }

        @JavascriptInterface
        public void onInitRewardedVideoFail(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "onInitRewardedVideoFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            com.ironsource.sdk.controller.j jVar = x.this.z0;
            d.e eVar = d.e.RewardedVideo;
            com.ironsource.sdk.g.c a2 = jVar.a(eVar, fetchDemandSourceId);
            if (a2 != null) {
                a2.a(3);
            }
            if (x.this.J(eVar.toString())) {
                x.this.Y(new w(d, fetchDemandSourceId));
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onInitRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onLoadBannerFail(String str) {
            Logger.i(x.this.w, "onLoadBannerFail()");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            x.B(x.this, str, true, null, null);
            if (!TextUtils.isEmpty(fetchDemandSourceId) && x.this.J(d.e.Banner.toString())) {
                x.this.Y(new k(d, fetchDemandSourceId));
            }
        }

        @JavascriptInterface
        public void onLoadBannerSuccess(String str) {
            Logger.i(x.this.w, "onLoadBannerSuccess()");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            String d = fVar.d("adViewId");
            x.B(x.this, str, true, null, null);
            com.ironsource.sdk.c.e a2 = com.ironsource.sdk.c.d.a().a(d);
            if (a2 == null) {
                com.ironsource.sdk.j.a.b bVar = x.this.U;
                bVar.d(fetchDemandSourceId, "not found view for the current adViewId= " + d);
            } else if (a2 instanceof com.ironsource.sdk.c.a) {
                com.ironsource.sdk.c.a aVar = (com.ironsource.sdk.c.a) a2;
                if (x.this.J(d.e.Banner.toString())) {
                    x.this.Y(new j(fetchDemandSourceId, aVar));
                }
            }
        }

        @JavascriptInterface
        public void onLoadInterstitialFail(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "onLoadInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            x.B(x.this, str, true, null, null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            a(fetchDemandSourceId, false);
            if (x.this.J(d.e.Interstitial.toString())) {
                x.this.Y(new f(d, fetchDemandSourceId));
            }
            x.X(x.this, "onLoadInterstitialFail", "true");
        }

        @JavascriptInterface
        public void onLoadInterstitialSuccess(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "onLoadInterstitialSuccess(" + str + ")");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            a(fetchDemandSourceId, true);
            x.B(x.this, str, true, null, null);
            if (x.this.J(d.e.Interstitial.toString())) {
                x.this.Y(new e(fetchDemandSourceId));
            }
            x.X(x.this, "onLoadInterstitialSuccess", "true");
        }

        @JavascriptInterface
        public void onOfferWallGeneric(String str) {
            wo1.c0("onOfferWallGeneric(", str, ")", x.this.w);
        }

        @JavascriptInterface
        public void onShowInterstitialFail(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "onShowInterstitialFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            x.B(x.this, str, true, null, null);
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                return;
            }
            a(fetchDemandSourceId, false);
            if (x.this.J(d.e.Interstitial.toString())) {
                x.this.Y(new g(d, fetchDemandSourceId));
            }
            x.X(x.this, "onShowInterstitialFail", str);
        }

        @JavascriptInterface
        public void onShowInterstitialSuccess(String str) {
            wo1.c0("onShowInterstitialSuccess(", str, ")", x.this.w);
            x.B(x.this, str, true, null, null);
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(new com.ironsource.sdk.g.f(str));
            if (TextUtils.isEmpty(fetchDemandSourceId)) {
                Logger.i(x.this.w, "onShowInterstitialSuccess called with no demand");
                return;
            }
            com.ironsource.sdk.g.b bVar = x.this.w0;
            d.e eVar = d.e.Interstitial;
            bVar.e = eVar.ordinal();
            x.this.w0.c = fetchDemandSourceId;
            if (x.this.J(eVar.toString())) {
                x.this.Y(new d0(fetchDemandSourceId));
                x.X(x.this, "onShowInterstitialSuccess", str);
            }
            a(fetchDemandSourceId, false);
        }

        @JavascriptInterface
        public void onShowOfferWallFail(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "onShowOfferWallFail(" + str + ")");
            String d = new com.ironsource.sdk.g.f(str).d("errMsg");
            if (x.this.J(d.e.OfferWall.toString())) {
                x.this.Y(new z(d));
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onShowOfferWallFail", str);
        }

        @JavascriptInterface
        public void onShowOfferWallSuccess(String str) {
            wo1.c0("onShowOfferWallSuccess(", str, ")", x.this.w);
            com.ironsource.sdk.g.b bVar = x.this.w0;
            d.e eVar = d.e.OfferWall;
            bVar.e = eVar.ordinal();
            String valueFromJsonObject = SDKUtils.getValueFromJsonObject(str, com.anythink.expressad.videocommon.e.b.v);
            if (x.this.J(eVar.toString())) {
                x.this.Y(new y(valueFromJsonObject));
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onShowOfferWallSuccess", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoFail(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "onShowRewardedVideoFail(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("errMsg");
            String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
            if (x.this.J(d.e.RewardedVideo.toString())) {
                x.this.Y(new RunnableC0126x(d, fetchDemandSourceId));
            }
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onShowRewardedVideoFail", str);
        }

        @JavascriptInterface
        public void onShowRewardedVideoSuccess(String str) {
            wo1.c0("onShowRewardedVideoSuccess(", str, ")", x.this.w);
            x.B(x.this, str, true, null, null);
            x.X(x.this, "onShowRewardedVideoSuccess", str);
        }

        @JavascriptInterface
        public void onVideoStatusChanged(String str) {
            String unused = x.this.w;
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("productType");
            if (x.this.v0 == null || TextUtils.isEmpty(d)) {
                return;
            }
            String d2 = fVar.d("status");
            if ("started".equalsIgnoreCase(d2)) {
                x.this.v0.onVideoStarted();
            } else if ("paused".equalsIgnoreCase(d2)) {
                x.this.v0.onVideoPaused();
            } else if ("playing".equalsIgnoreCase(d2)) {
                x.this.v0.onVideoResumed();
            } else if ("ended".equalsIgnoreCase(d2)) {
                x.this.v0.onVideoEnded();
            } else if ("stopped".equalsIgnoreCase(d2)) {
                x.this.v0.onVideoStopped();
            } else {
                String str2 = x.this.w;
                Logger.i(str2, "onVideoStatusChanged: unknown status: " + d2);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0076, code lost:
            if (r5 == 1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
            if (r5 == 2) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007b, code lost:
            r0 = new android.content.Intent(r3, com.ironsource.sdk.controller.OpenUrlActivity.class);
            r0.putExtra(com.ironsource.sdk.controller.x.c, r1);
            r0.putExtra(com.ironsource.sdk.controller.x.b, true);
            r0.putExtra(com.ironsource.sdk.controller.x.d, true);
            r3.startActivity(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0094, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0095, code lost:
            r0 = new android.content.Intent(r3, com.ironsource.sdk.controller.OpenUrlActivity.class);
            r0.putExtra(com.ironsource.sdk.controller.x.c, r1);
            r0.putExtra(com.ironsource.sdk.controller.x.d, true);
            r0.putExtra("immersive", r10.a.y0);
            r3.startActivity(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
            return;
         */
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void openUrl(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "openUrl(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("url");
            String d2 = fVar.d("method");
            String d3 = fVar.d("package_name");
            Activity a2 = x.this.J0.a();
            try {
                String lowerCase = d2.toLowerCase();
                char c2 = 65535;
                int hashCode = lowerCase.hashCode();
                if (hashCode != -1455867212) {
                    if (hashCode != 109770977) {
                        if (hashCode == 1224424441 && lowerCase.equals("webview")) {
                            c2 = 1;
                        }
                    } else if (lowerCase.equals("store")) {
                        c2 = 2;
                    }
                } else if (lowerCase.equals("external_browser")) {
                    c2 = 0;
                }
                a.AnonymousClass1.a(a2, d, d3);
            } catch (Exception e2) {
                x.B(x.this, str, false, e2.getMessage(), null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void pauseControllerWebview() {
            x.this.E(new RunnableC0125d());
        }

        @JavascriptInterface
        public void permissionsAPI(String str) {
            com.ironsource.sdk.g.f fVar;
            String str2;
            try {
                String str3 = x.this.w;
                Logger.i(str3, "permissionsAPI(" + str + ")");
                com.ironsource.sdk.g.f fVar2 = new com.ironsource.sdk.g.f(str);
                com.ironsource.sdk.controller.r rVar = x.this.B0;
                String fVar3 = fVar2.toString();
                a aVar = new a();
                JSONObject jSONObject = new JSONObject(fVar3);
                r.a aVar2 = new r.a((byte) 0);
                aVar2.a = jSONObject.optString("functionName");
                aVar2.b = jSONObject.optJSONObject("functionParams");
                aVar2.c = jSONObject.optString("success");
                aVar2.d = jSONObject.optString("fail");
                if ("getPermissions".equals(aVar2.a)) {
                    JSONObject jSONObject2 = aVar2.b;
                    fVar = new com.ironsource.sdk.g.f();
                    try {
                        fVar.a("permissions", com.ironsource.environment.c.a(rVar.b, jSONObject2.getJSONArray("permissions")));
                        aVar.a(true, aVar2.c, fVar);
                        return;
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        String str4 = com.ironsource.sdk.controller.r.a;
                        Logger.i(str4, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e2.getMessage());
                        fVar.a("errMsg", e2.getMessage());
                        str2 = aVar2.d;
                        aVar.a(false, str2, fVar);
                        return;
                    }
                } else if (!"isPermissionGranted".equals(aVar2.a)) {
                    String str5 = com.ironsource.sdk.controller.r.a;
                    Logger.i(str5, "PermissionsJSAdapter unhandled API request " + fVar3);
                    return;
                } else {
                    JSONObject jSONObject3 = aVar2.b;
                    fVar = new com.ironsource.sdk.g.f();
                    try {
                        String string = jSONObject3.getString("permission");
                        fVar.a("permission", string);
                        if (com.ironsource.environment.c.a(rVar.b, string)) {
                            fVar.a("status", String.valueOf(com.ironsource.environment.c.b(rVar.b, string)));
                            aVar.a(true, aVar2.c, fVar);
                            return;
                        }
                        fVar.a("status", "unhandledPermission");
                        aVar.a(false, aVar2.d, fVar);
                        return;
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        fVar.a("errMsg", e3.getMessage());
                        str2 = aVar2.d;
                        aVar.a(false, str2, fVar);
                        return;
                    }
                }
            } catch (Exception e4) {
                e4.printStackTrace();
                String str6 = x.this.w;
                Logger.i(str6, "permissionsAPI failed with exception " + e4.getMessage());
            }
            e4.printStackTrace();
            String str62 = x.this.w;
            Logger.i(str62, "permissionsAPI failed with exception " + e4.getMessage());
        }

        @JavascriptInterface
        public void postAdEventNotification(String str) {
            try {
                String str2 = x.this.w;
                Logger.i(str2, "postAdEventNotification(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d = fVar.d("eventName");
                if (TextUtils.isEmpty(d)) {
                    x.B(x.this, str, false, "eventName does not exist", null);
                    return;
                }
                String d2 = fVar.d("dsName");
                String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(fVar);
                String str3 = !TextUtils.isEmpty(fetchDemandSourceId) ? fetchDemandSourceId : d2;
                JSONObject jSONObject = (JSONObject) fVar.c("extData");
                String d3 = fVar.d("productType");
                x xVar = x.this;
                d.e m0 = x.m0(d3);
                if (!x.this.J(d3)) {
                    x.B(x.this, str, false, "productType does not exist", null);
                    return;
                }
                String O = x.O(x.this, str);
                if (!TextUtils.isEmpty(O)) {
                    x xVar2 = x.this;
                    String a2 = x.a("productType", d3, "eventName", d, "demandSourceName", d2, "demandSourceId", str3, null, false);
                    x xVar3 = x.this;
                    x.this.b(x.x(O, a2, "postAdEventNotificationSuccess", "postAdEventNotificationFail"));
                }
                x.this.Y(new n(m0, str3, d, jSONObject));
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void removeCloseEventHandler(String str) {
            wo1.c0("removeCloseEventHandler(", str, ")", x.this.w);
            if (x.this.G != null) {
                x.this.G.cancel();
            }
            x.this.F = true;
        }

        @JavascriptInterface
        public void removeMessagingInterface(String str) {
            x.this.E(new p());
        }

        @JavascriptInterface
        public void requestToDestroyBanner(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "onCleanUpNonDisplayBannersFail() value=" + str);
        }

        @JavascriptInterface
        public void resumeControllerWebview() {
            x.this.E(new l());
        }

        @JavascriptInterface
        public void saveFile(String str) {
            try {
                String str2 = x.this.w;
                Logger.i(str2, "saveFile(" + str + ")");
                com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
                String d = fVar.d(la1.k);
                String d2 = fVar.d(o31.b);
                if (TextUtils.isEmpty(d2)) {
                    x.B(x.this, str, false, "Missing parameters for file", "1");
                    return;
                }
                com.ironsource.sdk.h.c cVar = new com.ironsource.sdk.h.c(IronSourceStorageUtils.buildAbsolutePathToDirInCache(x.this.W, d), SDKUtils.getFileName(d2));
                IronSourceStorageUtils.ensurePathSafety(cVar, x.this.W);
                if (com.ironsource.environment.h.a(x.this.W) <= 0) {
                    x.B(x.this, str, false, "no_disk_space", null);
                } else if (!SDKUtils.isExternalStorageAvailable()) {
                    x.B(x.this, str, false, "sotrage_unavailable", null);
                } else if (cVar.exists()) {
                    x.B(x.this, str, false, "file_already_exist", null);
                } else if (!a.AnonymousClass1.b(x.this.getContext())) {
                    x.B(x.this, str, false, "no_network_connection", null);
                } else {
                    x.B(x.this, str, true, null, null);
                    com.ironsource.sdk.k.b bVar = x.this.C;
                    bVar.a(cVar, d2, bVar.a);
                }
            } catch (Exception e2) {
                x.B(x.this, str, false, e2.getMessage(), null);
                e2.printStackTrace();
            }
        }

        @JavascriptInterface
        public void setBackButtonState(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "setBackButtonState(" + str + ")");
            String d = new com.ironsource.sdk.g.f(str).d(CallMraidJS.b);
            SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().a.edit();
            edit.putString("back_button_state", d);
            edit.apply();
        }

        @JavascriptInterface
        public void setForceClose(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "setForceClose(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            String d = fVar.d("width");
            String d2 = fVar.d("height");
            x.this.H = Integer.parseInt(d);
            x.this.I = Integer.parseInt(d2);
            x.this.J = fVar.d("position");
        }

        @JavascriptInterface
        public void setMixedContentAlwaysAllow(String str) {
            wo1.c0("setMixedContentAlwaysAllow(", str, ")", x.this.w);
            x.this.E(new q());
        }

        @JavascriptInterface
        public void setOrientation(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "setOrientation(" + str + ")");
            String d = new com.ironsource.sdk.g.f(str).d("orientation");
            x xVar = x.this;
            xVar.Q = d;
            if (xVar.K0 != null) {
                x.this.K0.onOrientationChanged(d, com.ironsource.environment.h.k(x.this.getContext()));
            }
        }

        @JavascriptInterface
        public void setStoreSearchKeys(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "setStoreSearchKeys(" + str + ")");
            SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().a.edit();
            edit.putString("search_keys", str);
            edit.apply();
        }

        @JavascriptInterface
        public void setTouchListener(String str) {
            wo1.c0("removeCloseEventHandler(", str, ")", x.this.w);
            x.this.E(new v());
        }

        @JavascriptInterface
        public void setUserData(String str) {
            String str2 = x.this.w;
            Logger.i(str2, "setUserData(" + str + ")");
            com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
            if (!fVar.a("key")) {
                x.B(x.this, str, false, "key does not exist", null);
            } else if (!fVar.a("value")) {
                x.B(x.this, str, false, "value does not exist", null);
            } else {
                String d = fVar.d("key");
                String d2 = fVar.d("value");
                SharedPreferences.Editor edit = com.ironsource.sdk.utils.b.a().a.edit();
                edit.putString(d, d2);
                edit.apply();
                String O = x.O(x.this, str);
                x xVar = x.this;
                String a2 = x.a(d, d2, null, null, null, null, null, null, null, false);
                x xVar2 = x.this;
                x.this.b(x.b(O, a2));
            }
        }

        @JavascriptInterface
        public void setWebviewBackgroundColor(String str) {
            wo1.c0("setWebviewBackgroundColor(", str, ")", x.this.w);
            x.j0(x.this, str);
        }
    }

    /* loaded from: classes3.dex */
    public class e extends CountDownTimer {
        private /* synthetic */ int a;

        /* loaded from: classes3.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                x.this.H0.a("controller html - failed to load into web-view");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j, long j2, int i) {
            super(50000L, 1000L);
            this.a = i;
        }

        @Override // android.os.CountDownTimer
        public final void onFinish() {
            Logger.i(x.this.w, "Loading Controller Timer Finish");
            int i = this.a;
            if (i == 3) {
                x.this.Y(new a());
            } else {
                x.this.a(i + 1);
            }
        }

        @Override // android.os.CountDownTimer
        public final void onTick(long j) {
            String str = x.this.w;
            Logger.i(str, "Loading Controller Timer Tick " + j);
        }
    }

    /* loaded from: classes3.dex */
    public class f implements InterfaceC0127x {
        public f() {
        }

        @Override // com.ironsource.sdk.controller.x.InterfaceC0127x
        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            x.A(x.this, str, eVar, cVar);
        }
    }

    /* loaded from: classes3.dex */
    public enum g {
        Display,
        Gone
    }

    /* loaded from: classes3.dex */
    public class h implements InterfaceC0127x {
        public h() {
        }

        @Override // com.ironsource.sdk.controller.x.InterfaceC0127x
        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            x.A(x.this, str, eVar, cVar);
        }
    }

    /* loaded from: classes3.dex */
    public class i implements InterfaceC0127x {
        public i() {
        }

        @Override // com.ironsource.sdk.controller.x.InterfaceC0127x
        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            x.A(x.this, str, eVar, cVar);
        }
    }

    /* loaded from: classes3.dex */
    public class j implements InterfaceC0127x {
        public j() {
        }

        @Override // com.ironsource.sdk.controller.x.InterfaceC0127x
        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            x.A(x.this, str, eVar, cVar);
        }
    }

    /* loaded from: classes3.dex */
    public class k implements InterfaceC0127x {
        public k() {
        }

        @Override // com.ironsource.sdk.controller.x.InterfaceC0127x
        public final void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
            x.A(x.this, str, eVar, cVar);
        }
    }

    /* loaded from: classes3.dex */
    public class l extends com.ironsource.sdk.service.Connectivity.b {
        public l(JSONObject jSONObject, Context context) {
            super(jSONObject, context);
        }

        @Override // com.ironsource.sdk.service.Connectivity.b, com.ironsource.sdk.service.Connectivity.d
        public final void a() {
            if (x.this.D) {
                x.this.d("none");
            }
        }

        @Override // com.ironsource.sdk.service.Connectivity.b, com.ironsource.sdk.service.Connectivity.d
        public final void a(String str) {
            if (x.this.D) {
                x.this.d(str);
            }
        }

        @Override // com.ironsource.sdk.service.Connectivity.b, com.ironsource.sdk.service.Connectivity.d
        public final void a(String str, JSONObject jSONObject) {
            if (jSONObject == null || !x.this.D) {
                return;
            }
            try {
                jSONObject.put("connectionType", str);
                x xVar = x.this;
                String str2 = xVar.w;
                Logger.i(str2, "device connection info changed: " + jSONObject.toString());
                xVar.b(x.b("connectionInfoChanged", x.a("connectionInfo", jSONObject.toString(), null, null, null, null, null, null, null, false)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class m implements Runnable {
        private /* synthetic */ d.e s;
        private /* synthetic */ com.ironsource.sdk.g.c t;
        private /* synthetic */ String u;

        public m(d.e eVar, com.ironsource.sdk.g.c cVar, String str) {
            this.s = eVar;
            this.t = cVar;
            this.u = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.e eVar = d.e.RewardedVideo;
            d.e eVar2 = this.s;
            if (eVar != eVar2 && d.e.Interstitial != eVar2 && d.e.Banner != eVar2) {
                if (d.e.OfferWall == eVar2) {
                    x.this.T.onOfferwallInitFail(this.u);
                    return;
                } else if (d.e.OfferWallCredits == eVar2) {
                    x.this.T.onGetOWCreditsFailed(this.u);
                    return;
                } else {
                    return;
                }
            }
            com.ironsource.sdk.g.c cVar = this.t;
            if (cVar == null || TextUtils.isEmpty(cVar.b)) {
                return;
            }
            com.ironsource.sdk.j.a.a M = x.this.M(this.s);
            String unused = x.this.w;
            String str = "onAdProductInitFailed (message:" + this.u + ")(" + this.s + ")";
            if (M != null) {
                M.a(this.s, this.t.b, this.u);
            }
        }
    }

    /* loaded from: classes3.dex */
    public class n implements Runnable {
        private /* synthetic */ StringBuilder s;
        private /* synthetic */ String t;

        public n(StringBuilder sb, String str) {
            this.s = sb;
            this.t = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (x.this.V == null) {
                    x.this.evaluateJavascript(this.s.toString(), null);
                    x.this.V = Boolean.TRUE;
                } else if (x.this.V.booleanValue()) {
                    x.this.evaluateJavascript(this.s.toString(), null);
                } else {
                    x.this.loadUrl(this.t);
                }
            } catch (Throwable th) {
                String str = x.this.w;
                Logger.e(str, "injectJavascript: " + th.toString());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o implements Runnable {
        public o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            x.this.a(1);
        }
    }

    /* loaded from: classes3.dex */
    public class p implements Runnable {
        public p() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            x.this.a(1);
        }
    }

    /* loaded from: classes3.dex */
    public class q implements Runnable {
        private /* synthetic */ com.ironsource.sdk.g.e s;

        public q(com.ironsource.sdk.g.e eVar) {
            this.s = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            xe3 xe3Var = x.this.H0;
            xe3Var.a("controller html - failed to download - " + this.s.a);
        }
    }

    /* loaded from: classes3.dex */
    public class r implements Runnable {
        private /* synthetic */ String s;
        private /* synthetic */ String t;

        public r(String str, String str2) {
            this.s = str;
            this.t = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (x.b() == d.EnumC0131d.MODE_3.d) {
                Activity a = x.this.J0.a();
                Toast.makeText(a, this.s + " : " + this.t, 1).show();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class s implements Runnable {
        private /* synthetic */ Context s;

        public s(Context context) {
            this.s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            x.Q(x.this, this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class t implements Runnable {
        private /* synthetic */ Context s;

        public t(Context context) {
            this.s = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            x.W(x.this, this.s);
        }
    }

    /* loaded from: classes3.dex */
    public class u extends WebChromeClient {
        private u() {
        }

        public /* synthetic */ u(x xVar, byte b) {
            this();
        }

        @Override // android.webkit.WebChromeClient
        public final View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(x.this.J0.a());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            Logger.i("MyApplication", consoleMessage.message() + " -- From line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
            WebView webView2 = new WebView(webView.getContext());
            webView2.setWebChromeClient(this);
            webView2.setWebViewClient(new w(x.this, (byte) 0));
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            Logger.i("onCreateWindow", "onCreateWindow");
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public final void onHideCustomView() {
            Logger.i("Test", "onHideCustomView");
            if (x.this.L == null) {
                return;
            }
            x.this.L.setVisibility(8);
            x.this.M.removeView(x.this.L);
            x.this.L = null;
            x.this.M.setVisibility(8);
            x.this.N.onCustomViewHidden();
            x.this.setVisibility(0);
        }

        @Override // android.webkit.WebChromeClient
        public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            Logger.i("Test", "onShowCustomView");
            x.this.setVisibility(8);
            if (x.this.L != null) {
                Logger.i("Test", "mCustomView != null");
                customViewCallback.onCustomViewHidden();
                return;
            }
            Logger.i("Test", "mCustomView == null");
            x.this.M.addView(view);
            x.this.L = view;
            x.this.N = customViewCallback;
            x.this.M.setVisibility(0);
        }
    }

    /* loaded from: classes3.dex */
    public static class v {
        public d.e a;
        public String b;

        public v(d.e eVar, String str) {
            this.a = eVar;
            this.b = str;
        }
    }

    /* loaded from: classes3.dex */
    public class w extends WebViewClient {
        private w() {
        }

        public /* synthetic */ w(x xVar, byte b) {
            this();
        }

        @Override // android.webkit.WebViewClient
        @TargetApi(26)
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            String str = x.this.w;
            Logger.e(str, "Chromium process crashed - detail.didCrash(): " + renderProcessGoneDetail.didCrash());
            return true;
        }

        @Override // android.webkit.WebViewClient
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            Activity a = x.this.J0.a();
            Intent intent = new Intent(a, OpenUrlActivity.class);
            intent.putExtra(x.c, str);
            intent.putExtra(x.d, false);
            a.startActivity(intent);
            return true;
        }
    }

    /* renamed from: com.ironsource.sdk.controller.x$x  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0127x {
        void a(String str, d.e eVar, com.ironsource.sdk.g.c cVar);
    }

    /* loaded from: classes3.dex */
    public static class y {
        public String a;
        public String b;
    }

    /* loaded from: classes3.dex */
    public class z implements View.OnTouchListener {

        /* loaded from: classes3.dex */
        public class a extends CountDownTimer {
            public a(long j, long j2) {
                super(2000L, 500L);
            }

            @Override // android.os.CountDownTimer
            public final void onFinish() {
                Logger.i(x.this.w, "Close Event Timer Finish");
                if (x.this.F) {
                    x.this.F = false;
                } else {
                    x.this.e("forceClose");
                }
            }

            @Override // android.os.CountDownTimer
            public final void onTick(long j) {
                String str = x.this.w;
                Logger.i(str, "Close Event Timer Tick " + j);
            }
        }

        private z() {
        }

        public /* synthetic */ z(x xVar, byte b) {
            this();
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                String str = x.this.w;
                StringBuilder sb = new StringBuilder("X:");
                int i = (int) x;
                sb.append(i);
                sb.append(" Y:");
                int i2 = (int) y;
                sb.append(i2);
                Logger.i(str, sb.toString());
                int m = com.ironsource.environment.h.m();
                int n = com.ironsource.environment.h.n();
                String str2 = x.this.w;
                Logger.i(str2, "Width:" + m + " Height:" + n);
                int dpToPx = SDKUtils.dpToPx((long) x.this.H);
                int dpToPx2 = SDKUtils.dpToPx((long) x.this.I);
                if ("top-right".equalsIgnoreCase(x.this.J)) {
                    i = m - i;
                } else if (!"top-left".equalsIgnoreCase(x.this.J)) {
                    if ("bottom-right".equalsIgnoreCase(x.this.J)) {
                        i = m - i;
                    } else if (!"bottom-left".equalsIgnoreCase(x.this.J)) {
                        i = 0;
                        i2 = 0;
                    }
                    i2 = n - i2;
                }
                if (i <= dpToPx && i2 <= dpToPx2) {
                    x.this.F = false;
                    if (x.this.G != null) {
                        x.this.G.cancel();
                    }
                    x.this.G = new a(2000L, 500L).start();
                }
            }
            return false;
        }
    }

    public x(Context context, com.ironsource.sdk.controller.j jVar, com.ironsource.sdk.controller.c cVar, xe3 xe3Var, com.ironsource.environment.e.a aVar) {
        super(context);
        this.w = x.class.getSimpleName();
        this.x = IronSourceConstants.IRONSOURCE_CONFIG_NAME;
        this.y = "We're sorry, some error occurred. we will investigate it";
        this.H = 50;
        this.I = 50;
        this.J = "top-right";
        this.V = null;
        this.x0 = new Object();
        this.y0 = false;
        Logger.i(this.w, "C'tor");
        this.J0 = cVar;
        this.H0 = xe3Var;
        this.v = aVar;
        this.W = IronSourceStorageUtils.getNetworkStorageDir(context);
        this.z0 = jVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.O = new FrameLayout(context);
        this.M = new FrameLayout(context);
        this.M.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.M.setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(this);
        this.O.addView(this.M, layoutParams);
        this.O.addView(frameLayout);
        this.w0 = new com.ironsource.sdk.g.b();
        com.ironsource.sdk.k.b r2 = r();
        this.C = r2;
        r2.a.a = this;
        this.u0 = new com.ironsource.sdk.controller.f(SDKUtils.getNetworkConfiguration(), this.W, SDKUtils.getControllerUrl(), this.C);
        this.K = new u(this, (byte) 0);
        setWebViewClient(new a0(this, (byte) 0));
        setWebChromeClient(this.K);
        com.ironsource.sdk.utils.d.a(this);
        bf3 bf3Var = new bf3(UUID.randomUUID().toString());
        addJavascriptInterface(new ye3(new we3(new d()), bf3Var), "Android");
        addJavascriptInterface(new af3(bf3Var), "GenerateTokenForMessaging");
        setDownloadListener(this);
        this.I0 = new l(SDKUtils.getControllerConfigAsJSONObject(), context);
        a(context);
        s = FeaturesManager.getInstance().getDebugMode();
    }

    public static /* synthetic */ void A(x xVar, String str, d.e eVar, com.ironsource.sdk.g.c cVar) {
        if (xVar.J(eVar.toString())) {
            xVar.Y(new m(eVar, cVar, str));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ void B(x xVar, String str, boolean z2, String str2, String str3) {
        com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
        String d2 = fVar.d(t);
        String d3 = fVar.d(u);
        if (!z2) {
            if (!TextUtils.isEmpty(d3)) {
                d2 = d3;
            }
            d2 = null;
        }
        if (TextUtils.isEmpty(d2)) {
            return;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                str = new JSONObject(str).put("errMsg", str2).toString();
            } catch (JSONException unused) {
            }
        }
        if (!TextUtils.isEmpty(str3)) {
            try {
                str = new JSONObject(str).put("errCode", str3).toString();
            } catch (JSONException unused2) {
            }
        }
        xVar.b(b(d2, str));
    }

    public static /* synthetic */ void C(x xVar, JSONObject jSONObject) {
        if (jSONObject.optBoolean("inspectWebview")) {
            WebView.setWebContentsDebuggingEnabled(true);
        }
    }

    private void F(String str, String str2, d.e eVar, com.ironsource.sdk.g.c cVar, InterfaceC0127x interfaceC0127x) {
        String str3;
        String x;
        String str4;
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            interfaceC0127x.a("User id or Application key are missing", eVar, cVar);
            return;
        }
        y yVar = new y();
        d.e eVar2 = d.e.RewardedVideo;
        if (eVar != eVar2 && eVar != d.e.Interstitial && eVar != d.e.OfferWall && eVar != d.e.Banner) {
            if (eVar == d.e.OfferWallCredits) {
                str4 = "getUserCredits";
                x = x("getUserCredits", a("productType", "OfferWall", "applicationKey", this.z, "applicationUserId", this.A, null, null, null, false), pg1.d, "onGetUserCreditsFail");
            }
            b(yVar.b);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("applicationKey", this.z);
        hashMap.put("applicationUserId", this.A);
        if (cVar != null) {
            Map<String, String> map = cVar.d;
            if (map != null) {
                hashMap.putAll(map);
                com.ironsource.sdk.service.a aVar = com.ironsource.sdk.service.a.a;
                hashMap.put("loadStartTime", String.valueOf(com.ironsource.sdk.service.a.a(cVar.b)));
            }
            hashMap.put("demandSourceName", cVar.a);
            hashMap.put("demandSourceId", cVar.b);
        }
        Map<String, String> y2 = y(eVar);
        if (y2 != null) {
            hashMap.putAll(y2);
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        a.C0130a c0130a = new a.C0130a();
        if (eVar == eVar2) {
            c0130a.a = "initRewardedVideo";
            c0130a.b = "onInitRewardedVideoSuccess";
            str3 = "onInitRewardedVideoFail";
        } else if (eVar == d.e.Interstitial) {
            c0130a.a = "initInterstitial";
            c0130a.b = "onInitInterstitialSuccess";
            str3 = "onInitInterstitialFail";
        } else if (eVar == d.e.OfferWall) {
            c0130a.a = "initOfferWall";
            c0130a.b = "onInitOfferWallSuccess";
            str3 = "onInitOfferWallFail";
        } else {
            if (eVar == d.e.Banner) {
                c0130a.a = "initBanner";
                c0130a.b = "onInitBannerSuccess";
                str3 = "onInitBannerFail";
            }
            x = x(c0130a.a, flatMapToJsonAsString, c0130a.b, c0130a.c);
            str4 = c0130a.a;
        }
        c0130a.c = str3;
        x = x(c0130a.a, flatMapToJsonAsString, c0130a.b, c0130a.c);
        str4 = c0130a.a;
        yVar.a = str4;
        yVar.b = x;
        b(yVar.b);
    }

    private void G(String str, String str2, String str3) {
        try {
            b(b("assetCachedFailed", a(o31.b, str, la1.k, p0(str2), "errMsg", str3, null, null, null, false)));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.ironsource.sdk.j.a.a M(d.e eVar) {
        if (eVar == d.e.Interstitial) {
            return this.S;
        }
        if (eVar == d.e.RewardedVideo) {
            return this.R;
        }
        if (eVar == d.e.Banner) {
            return this.U;
        }
        return null;
    }

    public static /* synthetic */ String O(x xVar, String str) {
        return new com.ironsource.sdk.g.f(str).d(t);
    }

    private String P(JSONObject jSONObject) {
        com.ironsource.sdk.utils.a a2 = com.ironsource.sdk.utils.a.a(getContext());
        StringBuilder sb = new StringBuilder();
        String sDKVersion = SDKUtils.getSDKVersion();
        if (!TextUtils.isEmpty(sDKVersion)) {
            wo1.g0(sb, "SDKVersion=", sDKVersion, "&");
        }
        String str = a2.c;
        if (!TextUtils.isEmpty(str)) {
            sb.append("deviceOs=");
            sb.append(str);
        }
        Uri parse = Uri.parse(SDKUtils.getControllerUrl());
        if (parse != null) {
            String str2 = parse.getScheme() + ":";
            String host = parse.getHost();
            int port = parse.getPort();
            if (port != -1) {
                host = host + ":" + port;
            }
            wo1.h0(sb, "&protocol", AppCenter.KEY_VALUE_DELIMITER, str2, "&domain");
            sb.append(AppCenter.KEY_VALUE_DELIMITER);
            sb.append(host);
            if (jSONObject.keys().hasNext()) {
                try {
                    String jSONObject2 = new JSONObject(jSONObject, new String[]{"isSecured", "applicationKey"}).toString();
                    if (!TextUtils.isEmpty(jSONObject2)) {
                        sb.append("&controllerConfig");
                        sb.append(AppCenter.KEY_VALUE_DELIMITER);
                        sb.append(jSONObject2);
                    }
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
            sb.append("&debug");
            sb.append(AppCenter.KEY_VALUE_DELIMITER);
            sb.append(s);
        }
        return sb.toString();
    }

    public static /* synthetic */ void Q(x xVar, Context context) {
        try {
            com.ironsource.sdk.service.Connectivity.b bVar = xVar.I0;
            if (bVar == null) {
                return;
            }
            bVar.a.a(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ String V(x xVar, String str) {
        return new com.ironsource.sdk.g.f(str).d(u);
    }

    public static /* synthetic */ void W(x xVar, Context context) {
        try {
            com.ironsource.sdk.service.Connectivity.b bVar = xVar.I0;
            if (bVar == null) {
                return;
            }
            bVar.a.b(context);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ void X(x xVar, String str, String str2) {
        String d2 = new com.ironsource.sdk.g.f(str2).d("errMsg");
        if (TextUtils.isEmpty(d2)) {
            return;
        }
        xVar.E(new r(str, d2));
    }

    public static String a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                jSONObject.put(str, SDKUtils.encodeString(str2));
            }
            if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
                jSONObject.put(str3, SDKUtils.encodeString(str4));
            }
            if (!TextUtils.isEmpty(str5) && !TextUtils.isEmpty(str6)) {
                jSONObject.put(str5, SDKUtils.encodeString(str6));
            }
            if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str8)) {
                jSONObject.put(str7, SDKUtils.encodeString(str8));
            }
            if (!TextUtils.isEmpty(str9)) {
                jSONObject.put(str9, z2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] a0(Context context) {
        boolean z2;
        com.ironsource.sdk.utils.a a2 = com.ironsource.sdk.utils.a.a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appOrientation", "none");
            jSONObject.put("deviceOrientation", SDKUtils.translateDeviceOrientation(com.ironsource.environment.h.o(context)));
            String str = a2.a;
            if (str != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOEM"), SDKUtils.encodeString(str));
            }
            String str2 = a2.b;
            if (str2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceModel"), SDKUtils.encodeString(str2));
                z2 = false;
            } else {
                z2 = true;
            }
        } catch (JSONException e2) {
            e = e2;
            z2 = false;
        }
        try {
            SDKUtils.loadGoogleAdvertiserInfo(context);
            String advertiserId = SDKUtils.getAdvertiserId();
            Boolean valueOf = Boolean.valueOf(SDKUtils.isLimitAdTrackingEnabled());
            if (!TextUtils.isEmpty(advertiserId)) {
                Logger.i(this.w, "add AID and LAT");
                jSONObject.put("isLimitAdTrackingEnabled", valueOf);
                jSONObject.put("deviceIds[AID]", SDKUtils.encodeString(advertiserId));
            }
            String str3 = a2.c;
            if (str3 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOs"), SDKUtils.encodeString(str3));
            } else {
                z2 = true;
            }
            String str4 = a2.d;
            if (str4 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersion"), str4.replaceAll("[^0-9/.]", ""));
            } else {
                z2 = true;
            }
            String str5 = a2.d;
            if (str5 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceOSVersionFull"), SDKUtils.encodeString(str5));
            }
            String valueOf2 = String.valueOf(a2.e);
            if (valueOf2 != null) {
                jSONObject.put(SDKUtils.encodeString("deviceApiLevel"), valueOf2);
            } else {
                z2 = true;
            }
            String sDKVersion = SDKUtils.getSDKVersion();
            if (sDKVersion != null) {
                jSONObject.put(SDKUtils.encodeString("SDKVersion"), SDKUtils.encodeString(sDKVersion));
            }
            String str6 = a2.f;
            if (str6 != null && str6.length() > 0) {
                jSONObject.put(SDKUtils.encodeString("mobileCarrier"), SDKUtils.encodeString(a2.f));
            }
            String a3 = com.ironsource.d.a.a(context);
            if (a3.equals("none")) {
                z2 = true;
            } else {
                jSONObject.put(SDKUtils.encodeString("connectionType"), SDKUtils.encodeString(a3));
            }
            if (Build.VERSION.SDK_INT >= 23) {
                jSONObject.put(SDKUtils.encodeString("hasVPN"), com.ironsource.d.a.c(context));
            }
            jSONObject.put("uxt", IronSourceStorageUtils.isUxt());
            String language = context.getResources().getConfiguration().locale.getLanguage();
            if (!TextUtils.isEmpty(language)) {
                jSONObject.put(SDKUtils.encodeString("deviceLanguage"), SDKUtils.encodeString(language.toUpperCase()));
            }
            if (SDKUtils.isExternalStorageAvailable()) {
                jSONObject.put(SDKUtils.encodeString("diskFreeSize"), SDKUtils.encodeString(String.valueOf(com.ironsource.environment.h.a(this.W))));
            } else {
                z2 = true;
            }
            String valueOf3 = String.valueOf(com.ironsource.environment.h.m());
            if (TextUtils.isEmpty(valueOf3)) {
                z2 = true;
            } else {
                jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString("width") + "]", SDKUtils.encodeString(valueOf3));
            }
            String valueOf4 = String.valueOf(com.ironsource.environment.h.n());
            jSONObject.put(SDKUtils.encodeString("deviceScreenSize") + "[" + SDKUtils.encodeString("height") + "]", SDKUtils.encodeString(valueOf4));
            String packageName = getContext().getPackageName();
            if (!TextUtils.isEmpty(packageName)) {
                jSONObject.put(SDKUtils.encodeString("bundleId"), SDKUtils.encodeString(packageName));
            }
            String valueOf5 = String.valueOf(com.ironsource.environment.h.o());
            if (!TextUtils.isEmpty(valueOf5)) {
                jSONObject.put(SDKUtils.encodeString("deviceScreenScale"), SDKUtils.encodeString(valueOf5));
            }
            String valueOf6 = String.valueOf(com.ironsource.environment.h.j());
            if (!TextUtils.isEmpty(valueOf6)) {
                jSONObject.put(SDKUtils.encodeString("unLocked"), SDKUtils.encodeString(valueOf6));
            }
            com.ironsource.sdk.utils.a.a(context);
            jSONObject.put(SDKUtils.encodeString("deviceVolume"), com.ironsource.sdk.utils.a.b(context));
            jSONObject.put(SDKUtils.encodeString("batteryLevel"), com.ironsource.environment.h.v(context));
            jSONObject.put(SDKUtils.encodeString("mcc"), a.AnonymousClass1.c(context));
            jSONObject.put(SDKUtils.encodeString("mnc"), a.AnonymousClass1.d(context));
            jSONObject.put(SDKUtils.encodeString("phoneType"), a.AnonymousClass1.f(context));
            jSONObject.put(SDKUtils.encodeString("simOperator"), SDKUtils.encodeString(a.AnonymousClass1.e(context)));
            jSONObject.put(SDKUtils.encodeString("lastUpdateTime"), com.ironsource.environment.c.b(context));
            jSONObject.put(SDKUtils.encodeString("firstInstallTime"), com.ironsource.environment.c.a(context));
            jSONObject.put(SDKUtils.encodeString("appVersion"), SDKUtils.encodeString(com.ironsource.environment.c.c(context)));
            String d2 = com.ironsource.environment.c.d(context);
            if (!TextUtils.isEmpty(d2)) {
                jSONObject.put(SDKUtils.encodeString("installerPackageName"), SDKUtils.encodeString(d2));
            }
            jSONObject.put(SDKUtils.encodeString("gpi"), com.ironsource.environment.k.a(getContext()));
            jSONObject.put(SDKUtils.encodeString("screenBrightness"), com.ironsource.environment.h.z(context));
        } catch (JSONException e3) {
            e = e3;
            e.printStackTrace();
            return new Object[]{jSONObject.toString(), Boolean.valueOf(z2)};
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z2)};
    }

    public static int b() {
        return s;
    }

    public static String b(String str, String str2) {
        return wo1.w("SSA_CORE.SDKController.runFunction('", str, "?parameters=", str2, "');");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] b0(String str, String str2) {
        boolean z2;
        JSONObject jSONObject = new JSONObject();
        Map<String, String> map = null;
        if (TextUtils.isEmpty(str)) {
            z2 = true;
        } else {
            d.e m0 = m0(str);
            if (m0 == d.e.OfferWall) {
                map = this.B;
            } else {
                com.ironsource.sdk.g.c a2 = this.z0.a(m0, str2);
                if (a2 != null) {
                    Map<String, String> map2 = a2.d;
                    map2.put("demandSourceName", a2.a);
                    map2.put("demandSourceId", a2.b);
                    map = map2;
                }
            }
            try {
                jSONObject.put("productType", str);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            try {
                Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
                if (initSDKParams != null) {
                    jSONObject = SDKUtils.mergeJSONObjects(jSONObject, new JSONObject(initSDKParams));
                }
            } catch (Exception e3) {
                e3.printStackTrace();
            }
            z2 = false;
        }
        if (TextUtils.isEmpty(this.A)) {
            z2 = true;
        } else {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationUserId"), SDKUtils.encodeString(this.A));
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        if (TextUtils.isEmpty(this.z)) {
            z2 = true;
        } else {
            try {
                jSONObject.put(SDKUtils.encodeString("applicationKey"), SDKUtils.encodeString(this.z));
            } catch (JSONException e5) {
                e5.printStackTrace();
            }
        }
        if (map != null && !map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getKey().equalsIgnoreCase("sdkWebViewCache")) {
                    if (entry.getValue().equalsIgnoreCase("0")) {
                        getSettings().setCacheMode(2);
                    } else {
                        getSettings().setCacheMode(-1);
                    }
                }
                try {
                    jSONObject.put(SDKUtils.encodeString(entry.getKey()), SDKUtils.encodeString(entry.getValue()));
                } catch (JSONException e6) {
                    e6.printStackTrace();
                }
            }
        }
        return new Object[]{jSONObject.toString(), Boolean.valueOf(z2)};
    }

    public static String i0(String str) {
        return wo1.u("SSA_CORE.SDKController.runFunction('", str, "');");
    }

    public static /* synthetic */ void j0(x xVar, String str) {
        com.ironsource.sdk.g.f fVar = new com.ironsource.sdk.g.f(str);
        String d2 = fVar.d("color");
        String d3 = fVar.d("adViewId");
        int parseColor = !"transparent".equalsIgnoreCase(d2) ? Color.parseColor(d2) : 0;
        if (d3 == null) {
            xVar.setBackgroundColor(parseColor);
            return;
        }
        WebView b2 = com.ironsource.sdk.c.d.a().a(d3).b();
        if (b2 != null) {
            b2.setBackgroundColor(parseColor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d.e m0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        d.e eVar = d.e.Interstitial;
        if (str.equalsIgnoreCase(eVar.toString())) {
            return eVar;
        }
        d.e eVar2 = d.e.RewardedVideo;
        if (str.equalsIgnoreCase(eVar2.toString())) {
            return eVar2;
        }
        d.e eVar3 = d.e.OfferWall;
        if (str.equalsIgnoreCase(eVar3.toString())) {
            return eVar3;
        }
        d.e eVar4 = d.e.Banner;
        if (str.equalsIgnoreCase(eVar4.toString())) {
            return eVar4;
        }
        return null;
    }

    public static /* synthetic */ void n0(x xVar, String str) {
        try {
            String str2 = xVar.w;
            Logger.i(str2, "load(): " + str);
            xVar.loadUrl(str);
        } catch (Throwable th) {
            String str3 = xVar.w;
            Logger.e(str3, "WebViewController::load: " + th);
        }
    }

    private String p0(String str) {
        String str2 = this.W + File.separator;
        return str.contains(str2) ? str.substring(str2.length()) : str;
    }

    private String w(d.e eVar, JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.KEY_SESSION_DEPTH, Integer.toString(jSONObject.optInt(IronSourceConstants.KEY_SESSION_DEPTH)));
        String optString = jSONObject.optString("demandSourceName");
        String fetchDemandSourceId = SDKUtils.fetchDemandSourceId(jSONObject);
        com.ironsource.sdk.g.c a2 = this.z0.a(eVar, fetchDemandSourceId);
        if (a2 != null) {
            Map<String, String> map = a2.d;
            if (map != null) {
                hashMap.putAll(map);
            }
            if (!TextUtils.isEmpty(optString)) {
                hashMap.put("demandSourceName", optString);
            }
            if (!TextUtils.isEmpty(fetchDemandSourceId)) {
                hashMap.put("demandSourceId", fetchDemandSourceId);
            }
        }
        Map<String, String> y2 = y(eVar);
        if (y2 != null) {
            hashMap.putAll(y2);
        }
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        a.C0130a a3 = a.C0130a.a(eVar);
        return x(a3.a, flatMapToJsonAsString, a3.b, a3.c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String x(String str, String str2, String str3, String str4) {
        StringBuilder N = wo1.N("SSA_CORE.SDKController.runFunction('", str, "?parameters=", str2, "','");
        N.append(str3);
        N.append("','");
        N.append(str4);
        N.append("');");
        return N.toString();
    }

    private Map<String, String> y(d.e eVar) {
        if (eVar == d.e.OfferWall) {
            return this.B;
        }
        return null;
    }

    public final void D(d.e eVar, String str) {
        Y(new a(eVar, str));
    }

    public final void E(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.v;
        if (aVar != null) {
            aVar.a(runnable);
        }
    }

    public boolean J(String str) {
        boolean z2 = false;
        if (TextUtils.isEmpty(str)) {
            Logger.d(this.w, "Trying to trigger a listener - no product was found");
            return false;
        }
        if (!str.equalsIgnoreCase(d.e.Interstitial.toString()) ? !str.equalsIgnoreCase(d.e.RewardedVideo.toString()) ? !str.equalsIgnoreCase(d.e.Banner.toString()) ? (str.equalsIgnoreCase(d.e.OfferWall.toString()) || str.equalsIgnoreCase(d.e.OfferWallCredits.toString())) && this.T != null : this.U != null : this.R != null : this.S != null) {
            z2 = true;
        }
        if (!z2) {
            String str2 = this.w;
            Logger.d(str2, "Trying to trigger a listener - no listener was found for product " + str);
        }
        return z2;
    }

    public final void R(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.v;
        if (aVar != null) {
            aVar.b(runnable);
        }
    }

    public final void Y(Runnable runnable) {
        com.ironsource.environment.e.a aVar = this.v;
        if (aVar != null) {
            aVar.c(runnable);
        }
    }

    public final void a(int i2) {
        if (!this.u0.c()) {
            Logger.i(this.w, "load(): Mobile Controller HTML Does not exist");
            return;
        }
        JSONObject controllerConfigAsJSONObject = SDKUtils.getControllerConfigAsJSONObject();
        String P = P(controllerConfigAsJSONObject);
        Map<String, String> initSDKParams = SDKUtils.getInitSDKParams();
        if (initSDKParams != null && initSDKParams.containsKey("sessionid")) {
            P = String.format("%s&sessionid=%s", P, initSDKParams.get("sessionid"));
        }
        this.v.a(new c(controllerConfigAsJSONObject, wo1.u(this.u0.f().toURI().toString(), "?", P)));
        this.f = new e(50000L, 1000L, i2).start();
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Context context) {
        R(new s(context));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.ironsource.sdk.g.b bVar) {
        com.ironsource.sdk.j.e eVar;
        String str;
        com.ironsource.sdk.j.a.a M;
        synchronized (this.x0) {
            if (bVar.d && this.D) {
                String str2 = "restoreState(state:" + bVar + ")";
                int i2 = bVar.e;
                if (i2 != -1) {
                    d.e eVar2 = d.e.RewardedVideo;
                    if (i2 == eVar2.ordinal()) {
                        str = bVar.c;
                        M = M(eVar2);
                        if (M != null) {
                        }
                        bVar.e = -1;
                        bVar.c = null;
                    } else {
                        eVar2 = d.e.Interstitial;
                        if (i2 == eVar2.ordinal()) {
                            str = bVar.c;
                            M = M(eVar2);
                            if (M != null && !TextUtils.isEmpty(str)) {
                                M.a(eVar2, str);
                            }
                        } else if (i2 == d.e.OfferWall.ordinal() && (eVar = this.T) != null) {
                            eVar.onOWAdClosed();
                        }
                        bVar.e = -1;
                        bVar.c = null;
                    }
                }
                String str3 = bVar.f;
                String str4 = bVar.g;
                for (com.ironsource.sdk.g.c cVar : this.z0.b(d.e.Interstitial)) {
                    if (cVar.e == 2) {
                        a(str3, str4, cVar, this.S);
                    }
                }
                String str5 = bVar.a;
                String str6 = bVar.b;
                for (com.ironsource.sdk.g.c cVar2 : this.z0.b(d.e.RewardedVideo)) {
                    if (cVar2.e == 2) {
                        this.R.b(cVar2.a);
                        a(str5, str6, cVar2, this.R);
                    }
                }
                bVar.d = false;
            }
            this.w0 = bVar;
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.b bVar) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()});
        if (map != null) {
            b(x("loadBanner", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadBannerSuccess", "onLoadBannerFail"));
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        Map<String, String> mergeHashMaps = SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()});
        this.w0.a(cVar.b, true);
        b(x("loadInterstitial", SDKUtils.flatMapToJsonAsString(mergeHashMaps), "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    @Override // com.ironsource.sdk.k.c
    public final void a(com.ironsource.sdk.h.c cVar) {
        if (!cVar.getName().contains("mobileController.html")) {
            String name = cVar.getName();
            String parent = cVar.getParent();
            try {
                b(b("assetCached", a(o31.b, name, la1.k, p0(parent), null, null, null, null, null, false)));
                return;
            } catch (Exception e2) {
                G(name, parent, e2.getMessage());
                return;
            }
        }
        com.ironsource.sdk.controller.f fVar = this.u0;
        o oVar = new o();
        if (fVar.c()) {
            return;
        }
        if (fVar.c == f.a.b) {
            fVar.e();
        }
        f.b bVar = f.b.CONTROLLER_FROM_SERVER;
        fVar.d = bVar;
        fVar.a(bVar);
        oVar.run();
    }

    @Override // com.ironsource.sdk.k.c
    public final void a(com.ironsource.sdk.h.c cVar, com.ironsource.sdk.g.e eVar) {
        if (!cVar.getName().contains("mobileController.html")) {
            G(cVar.getName(), cVar.getParent(), eVar.a);
            return;
        }
        com.ironsource.sdk.controller.f fVar = this.u0;
        p pVar = new p();
        q qVar = new q(eVar);
        if (fVar.c()) {
            return;
        }
        if (fVar.c == f.a.b && fVar.g()) {
            f.b bVar = f.b.FALLBACK_CONTROLLER_RECOVERY;
            fVar.d = bVar;
            fVar.a(bVar);
            pVar.run();
            return;
        }
        com.ironsource.sdk.a.a a2 = new com.ironsource.sdk.a.a().a("generalmessage", Integer.valueOf(fVar.b));
        if (fVar.a > 0) {
            a2.a("timingvalue", Long.valueOf(System.currentTimeMillis() - fVar.a));
        }
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.t, a2.a);
        qVar.run();
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, com.ironsource.sdk.j.a.c cVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("demandSourceName", str);
        String flatMapToJsonAsString = SDKUtils.flatMapToJsonAsString(hashMap);
        this.w0.a(str, true);
        b(x("loadInterstitial", flatMapToJsonAsString, "onLoadInterstitialSuccess", "onLoadInterstitialFail"));
    }

    public final void a(String str, String str2) {
        b(b("onNativeLifeCycleEvent", a("lifeCycleEvent", str2, "productType", str, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.b bVar) {
        this.z = str;
        this.A = str2;
        this.U = bVar;
        F(str, str2, d.e.Banner, cVar, new k());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.c cVar2) {
        this.z = str;
        this.A = str2;
        this.S = cVar2;
        com.ironsource.sdk.g.b bVar = this.w0;
        bVar.f = str;
        bVar.g = str2;
        F(str, str2, d.e.Interstitial, cVar, new h());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.g.c cVar, com.ironsource.sdk.j.a.d dVar) {
        this.z = str;
        this.A = str2;
        this.R = dVar;
        com.ironsource.sdk.g.b bVar = this.w0;
        bVar.a = str;
        bVar.b = str2;
        F(str, str2, d.e.RewardedVideo, cVar, new f());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, com.ironsource.sdk.j.e eVar) {
        this.z = str;
        this.A = str2;
        this.T = eVar;
        F(str, str2, d.e.OfferWallCredits, null, new j());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(String str, String str2, Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.z = str;
        this.A = str2;
        this.B = map;
        this.T = eVar;
        com.ironsource.sdk.g.b bVar = this.w0;
        bVar.j = map;
        bVar.h = true;
        F(str, str2, d.e.OfferWall, null, new i());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(Map<String, String> map, com.ironsource.sdk.j.e eVar) {
        this.B = map;
        StringBuilder N = wo1.N("SSA_CORE.SDKController.runFunction('", "showOfferWall", "','", "onShowOfferWallSuccess", "','");
        N.append("onShowOfferWallFail");
        N.append("');");
        b(N.toString());
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject) {
        b(b("updateConsentInfo", jSONObject != null ? jSONObject.toString() : null));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.c cVar) {
        b(w(d.e.Interstitial, jSONObject));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void a(JSONObject jSONObject, com.ironsource.sdk.j.a.d dVar) {
        b(w(d.e.RewardedVideo, jSONObject));
    }

    public final void a(boolean z2, String str) {
        b(b("viewableChange", a("webview", str, null, null, null, null, null, null, "isViewable", z2)));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(Context context) {
        R(new t(context));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void b(com.ironsource.sdk.g.c cVar, Map<String, String> map, com.ironsource.sdk.j.a.c cVar2) {
        b(w(d.e.Interstitial, new JSONObject(SDKUtils.mergeHashMaps(new Map[]{map, cVar.a()}))));
    }

    public void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String str2 = "console.log(\"JS exeption: \" + JSON.stringify(e));";
        if (s != d.EnumC0131d.MODE_0.d && (s < d.EnumC0131d.MODE_1.d || s > d.EnumC0131d.MODE_3.d)) {
            str2 = "empty";
        }
        StringBuilder N = wo1.N("try{", str, "}catch(e){", str2, "}");
        String str3 = "javascript:" + N.toString();
        Logger.i(this.w, str3);
        E(new n(N, str3));
    }

    @Override // com.ironsource.sdk.controller.m
    public final d.c c() {
        return d.c.Web;
    }

    @Override // com.ironsource.sdk.controller.m
    public final boolean c(String str) {
        com.ironsource.sdk.g.c a2 = this.z0.a(d.e.Interstitial, str);
        return a2 != null && a2.f;
    }

    @Override // com.ironsource.sdk.controller.m
    public final void d() {
        b(x("destroyBanner", "", "onDestroyBannersSuccess", "onDestroyBannersFail"));
    }

    public final void d(String str) {
        String str2 = this.w;
        Logger.i(str2, "device status changed, connection type " + str);
        com.ironsource.sdk.a.b.a(str);
        b(b("deviceStatusChanged", a("connectionType", str, null, null, null, null, null, null, null, false)));
    }

    @Override // android.webkit.WebView, com.ironsource.sdk.controller.m
    public void destroy() {
        super.destroy();
        com.ironsource.sdk.k.b bVar = this.C;
        if (bVar != null) {
            bVar.a();
        }
        com.ironsource.sdk.service.Connectivity.b bVar2 = this.I0;
        if (bVar2 != null) {
            bVar2.a.a();
        }
        CountDownTimer countDownTimer = this.f;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void e() {
        b(i0("enterForeground"));
    }

    public final void e(String str) {
        if (str.equals("forceClose")) {
            s0();
        }
        b(b("engageEnd", a("action", str, null, null, null, null, null, null, null, false)));
    }

    @Override // com.ironsource.sdk.controller.m
    public final void f() {
        b(i0("enterBackground"));
    }

    public final boolean f(String str) {
        List<String> b2 = com.ironsource.sdk.utils.b.a().b();
        try {
            if (b2.isEmpty()) {
                return false;
            }
            for (String str2 : b2) {
                if (str.contains(str2)) {
                    a.AnonymousClass1.a(this.J0.a(), str, null);
                    return true;
                }
            }
            return false;
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.ironsource.sdk.controller.m
    public final void g() {
        a(this.w0);
    }

    @Override // com.ironsource.sdk.controller.m
    public final void h() {
        com.ironsource.sdk.a.a aVar = new com.ironsource.sdk.a.a();
        com.ironsource.sdk.controller.f fVar = this.u0;
        aVar.a("generalmessage", Integer.valueOf(fVar.b));
        com.ironsource.sdk.a.d.a(com.ironsource.sdk.a.f.r, aVar.a);
        fVar.a = System.currentTimeMillis();
        if (this.u0.d()) {
            a(1);
        }
    }

    public final void i() {
        b(i0("interceptedUrlToStore"));
    }

    public final void k() {
        try {
            onPause();
        } catch (Throwable th) {
            String str = this.w;
            Logger.i(str, "WebViewController: onPause() - " + th);
        }
    }

    public final void l() {
        try {
            onResume();
        } catch (Throwable th) {
            String str = this.w;
            Logger.i(str, "WebViewController: onResume() - " + th);
        }
    }

    @Override // android.webkit.DownloadListener
    public void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
        String str5 = this.w;
        Logger.i(str5, str + " " + str4);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        com.ironsource.sdk.j.g gVar;
        if (i2 == 4 && (gVar = this.K0) != null && gVar.onBackButtonPressed()) {
            return true;
        }
        return super.onKeyDown(i2, keyEvent);
    }

    public final com.ironsource.sdk.k.b r() {
        return com.ironsource.sdk.k.b.a(this.W, this.v);
    }

    public void s0() {
        com.ironsource.sdk.j.g gVar = this.K0;
        if (gVar != null) {
            gVar.onCloseRequested();
        }
    }

    @Override // android.webkit.WebView
    public WebBackForwardList saveState(Bundle bundle) {
        return super.saveState(bundle);
    }
}