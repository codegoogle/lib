package com.p7700g.p99005;

import android.annotation.TargetApi;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class x23 extends WebViewClient {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private static final String b = "WebClnt";
    @NotNull
    private final b c;
    private String d;
    @NotNull
    private String e;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(int i);
    }

    private final void b(String str, int i) {
        String str2 = b;
        xz2.c(str2, c25.C("Error url: ", str));
        String[] strArr = new String[1];
        String str3 = this.d;
        if (str3 != null) {
            strArr[0] = c25.C("Load Url: ", str3);
            xz2.c(str2, strArr);
            if (!TextUtils.isEmpty(str)) {
                j73 j73Var = j73.a;
                String str4 = this.d;
                if (str4 == null) {
                    c25.S("engagementUrl");
                    throw null;
                } else if (j73Var.b(str, str4)) {
                    xz2.c(str2, "Status code sent to WebView");
                    this.c.a(i);
                    return;
                }
            }
            xz2.c(str2, "Status code not sent to WebView");
            return;
        }
        c25.S("engagementUrl");
        throw null;
    }

    public final void a(@NotNull String str) {
        c25.p(str, "<set-?>");
        this.e = str;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest, @NotNull WebResourceError webResourceError) {
        c25.p(webView, com.anythink.expressad.a.B);
        c25.p(webResourceRequest, "request");
        c25.p(webResourceError, "error");
        String str = "[ERROR] Received resource failed error ";
        if (Build.VERSION.SDK_INT >= 23) {
            StringBuilder L = wo1.L("[ERROR] Received resource failed error ", " with description: ");
            L.append((Object) webResourceError.getDescription());
            L.append(" | error code: ");
            L.append(webResourceError.getErrorCode());
            L.append(" | url: ");
            L.append(webResourceRequest.getUrl());
            str = L.toString();
            String uri = webResourceRequest.getUrl().toString();
            c25.o(uri, "request.url.toString()");
            b(uri, webResourceError.getErrorCode());
        }
        xz2.c(b, str);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest, @NotNull WebResourceResponse webResourceResponse) {
        c25.p(webView, com.anythink.expressad.a.B);
        c25.p(webResourceRequest, "request");
        c25.p(webResourceResponse, "errorResponse");
        String str = "[ERROR] Received http error with status code: " + webResourceResponse.getStatusCode() + " | reason: " + ((Object) webResourceResponse.getReasonPhrase()) + " | url: " + webResourceRequest.getUrl();
        String uri = webResourceRequest.getUrl().toString();
        c25.o(uri, "request.url.toString()");
        b(uri, webResourceResponse.getStatusCode());
        xz2.c(b, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(@NotNull WebView webView, @NotNull String str) {
        c25.p(webView, com.anythink.expressad.a.B);
        c25.p(str, "url");
        return b95.J1(str, "favicon.ico", false, 2, null);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(21)
    @xn4(message = "deprecated", replaceWith = @op4(expression = "", imports = {}))
    public boolean shouldOverrideUrlLoading(@NotNull WebView webView, @NotNull WebResourceRequest webResourceRequest) {
        c25.p(webView, com.anythink.expressad.a.B);
        c25.p(webResourceRequest, "request");
        String uri = webResourceRequest.getUrl().toString();
        c25.o(uri, "request.url.toString()");
        return shouldOverrideUrlLoading(webView, uri);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(@NotNull WebView webView, int i, @NotNull String str, @NotNull String str2) {
        c25.p(webView, com.anythink.expressad.a.B);
        c25.p(str, "description");
        c25.p(str2, "failingUrl");
        super.onReceivedError(webView, i, str, str2);
        String str3 = b;
        xz2.c(str3, "[ERROR] Received html error with description: " + str + " | error code: " + i + " | url: " + str2);
        b(str2, i);
    }
}