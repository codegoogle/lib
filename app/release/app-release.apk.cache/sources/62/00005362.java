package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Message;
import android.util.AttributeSet;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p7700g.p99005.q03;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class o03 extends WebView {
    @NotNull
    public static final b s = new b(null);
    @Nullable
    private d t;
    @Nullable
    private q03.a u;
    @NotNull
    private e v;
    @NotNull
    private final List<String> w;
    @NotNull
    private final String x;

    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final o03 a(@NotNull Context context, @NotNull d dVar) {
            c25.p(context, "context");
            c25.p(dVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            return new o03(context, dVar, null, 0, 12, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c {
        @NotNull
        public static final c a = new c();
        @NotNull
        private static final String b = "Failed to load the page  - TOO_MANY_REDIRECTS";
        @NotNull
        private static final String c = "Failed to load the page - Received Error";
        @NotNull
        private static final String d = "Failed to load the page - Received Http Error";
        @NotNull
        private static final String e = "Failed to load the page - Received SSL Error";

        private c() {
        }

        @NotNull
        public final String a() {
            return b;
        }

        @NotNull
        public final String b() {
            return c;
        }

        @NotNull
        public final String c() {
            return d;
        }

        @NotNull
        public final String d() {
            return e;
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void a(@NotNull o03 o03Var);

        void b(@NotNull o03 o03Var, @NotNull List<String> list);
    }

    /* loaded from: classes3.dex */
    public enum e {
        INITIAL,
        SUCCESS,
        FAIL
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class f {
        public static final /* synthetic */ int[] a;

        static {
            e.values();
            int[] iArr = new int[3];
            iArr[e.INITIAL.ordinal()] = 1;
            iArr[e.SUCCESS.ordinal()] = 2;
            iArr[e.FAIL.ordinal()] = 3;
            a = iArr;
        }
    }

    public /* synthetic */ o03(Context context, d dVar, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, dVar, (i2 & 4) != 0 ? null : attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b() {
        if (getProgress() != 100) {
            return;
        }
        int i = f.a[this.v.ordinal()];
        if (i == 2) {
            d dVar = this.t;
            if (dVar != null) {
                dVar.a(this);
            }
            this.t = null;
        } else if (i != 3) {
        } else {
            d dVar2 = this.t;
            if (dVar2 != null) {
                dVar2.b(this, this.w);
            }
            this.t = null;
        }
    }

    @Nullable
    public final q03.a getPageEventsListener() {
        return this.u;
    }

    public final void setPageEventsListener(@Nullable q03.a aVar) {
        this.u = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @gz4
    public o03(@NotNull Context context, @Nullable d dVar, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c25.p(context, "context");
        this.t = dVar;
        this.v = e.INITIAL;
        this.w = new ArrayList();
        this.x = "GGWebView";
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setWebViewClient(new a(context));
        setWebChromeClient(new WebChromeClient());
    }

    /* loaded from: classes3.dex */
    public static final class a extends WebViewClient {
        public final /* synthetic */ Context b;

        public a(Context context) {
            this.b = context;
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(@Nullable WebView webView, @Nullable String str) {
            xz2.c(o03.this.x, c25.C("Finished loading the page ", str));
            o03.this.v = e.SUCCESS;
            o03.this.w.clear();
            o03.this.b();
            super.onPageFinished(webView, str);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(@Nullable WebView webView, int i, @Nullable String str, @Nullable String str2) {
            String str3 = o03.this.x;
            xz2.c(str3, u85.p("\n                     Failed to load page. ERROR\n                     {\n                        \"errorCode\":" + i + ",\n                        \"description\":" + ((Object) str) + ",\n                        \"url\":" + ((Object) str2) + "\n                     }\n                 "));
            if (str2 != null && (str2.equals("about:blank") ^ true)) {
                return;
            }
            List list = o03.this.w;
            list.add(c.a.b() + " -> Error Code " + i);
            o03.this.v = e.FAIL;
            o03.this.b();
        }

        @Override // android.webkit.WebViewClient
        @e2(21)
        public void onReceivedHttpError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
            Uri url;
            String str = o03.this.x;
            boolean z = true;
            String[] strArr = new String[1];
            StringBuilder G = wo1.G("\n                         Failed to load page. HTTP ERROR\n                         {\n                            \"errorCode\":");
            G.append(webResourceResponse == null ? null : Integer.valueOf(webResourceResponse.getStatusCode()));
            G.append(",\n                            \"description\":");
            G.append(webResourceResponse == null ? null : webResourceResponse.getData());
            G.append(",\n                            \"url\":");
            G.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
            G.append("\n                         }\n                     ");
            strArr[0] = u85.p(G.toString());
            xz2.c(str, strArr);
            if ((webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || !(url.equals("about:blank") ^ true)) ? false : false) {
                return;
            }
            List list = o03.this.w;
            StringBuilder sb = new StringBuilder();
            sb.append(c.a.c());
            sb.append(" -> Error Code ");
            sb.append(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
            list.add(sb.toString());
            o03.this.v = e.FAIL;
            o03.this.b();
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(@Nullable WebView webView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
            String str = o03.this.x;
            String[] strArr = new String[1];
            StringBuilder G = wo1.G("\n                         Failed to load page.  SSL ERROR\n                         {\n                            \"url\":");
            G.append((Object) (sslError == null ? null : sslError.getUrl()));
            G.append("\n                         }\n                     ");
            strArr[0] = u85.p(G.toString());
            xz2.c(str, strArr);
            o03.this.w.add(c.a.d());
            o03.this.v = e.FAIL;
            o03.this.b();
        }

        @Override // android.webkit.WebViewClient
        public void onTooManyRedirects(@Nullable WebView webView, @Nullable Message message, @Nullable Message message2) {
            xz2.c(o03.this.x, "Failed to load page. TOO MANY REDIRECTS");
            o03.this.w.add(c.a.a());
            o03.this.v = e.FAIL;
            o03.this.b();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable String str) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            this.b.startActivity(intent);
            q03.a pageEventsListener = o03.this.getPageEventsListener();
            if (pageEventsListener == null) {
                return true;
            }
            pageEventsListener.a();
            return true;
        }

        @Override // android.webkit.WebViewClient
        @e2(21)
        public boolean shouldOverrideUrlLoading(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(webResourceRequest == null ? null : webResourceRequest.getUrl());
            intent.addFlags(268435456);
            this.b.startActivity(intent);
            q03.a pageEventsListener = o03.this.getPageEventsListener();
            if (pageEventsListener == null) {
                return true;
            }
            pageEventsListener.a();
            return true;
        }

        @Override // android.webkit.WebViewClient
        @e2(21)
        public void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            if (Build.VERSION.SDK_INT >= 23) {
                String str = o03.this.x;
                String[] strArr = new String[1];
                StringBuilder G = wo1.G("\n                         Failed to load page.  ERROR\n                         {\n                            \"errorCode\":");
                G.append(webResourceError == null ? null : Integer.valueOf(webResourceError.getErrorCode()));
                G.append(",\n                            \"description\":");
                G.append((Object) (webResourceError == null ? null : webResourceError.getDescription()));
                G.append(",\n                            \"url\":");
                G.append(webResourceRequest == null ? null : webResourceRequest.getUrl());
                G.append("\n                         }\n                     ");
                strArr[0] = u85.p(G.toString());
                xz2.c(str, strArr);
                List list = o03.this.w;
                StringBuilder sb = new StringBuilder();
                sb.append(c.a.b());
                sb.append(" -> Error Code ");
                sb.append(webResourceError != null ? Integer.valueOf(webResourceError.getErrorCode()) : null);
                list.add(sb.toString());
                o03.this.v = e.FAIL;
                o03.this.b();
                return;
            }
            String str2 = o03.this.x;
            String[] strArr2 = new String[1];
            StringBuilder G2 = wo1.G("\n                         Failed to load page. \n                         {\n                            \"url\":");
            G2.append(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            G2.append("\n                         }\n                     ");
            strArr2[0] = u85.p(G2.toString());
            xz2.c(str2, strArr2);
            o03.this.w.add(c.a.b());
            o03.this.v = e.FAIL;
            o03.this.b();
        }
    }
}