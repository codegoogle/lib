package com.anythink.expressad.video.module;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.expressad.atsignalcommon.windvane.j;
import com.anythink.expressad.foundation.b.a;
import com.anythink.expressad.foundation.h.n;
import com.anythink.expressad.foundation.webview.BrowserView;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.videocommon.b.g;
import com.anythink.expressad.videocommon.b.h;
import com.anythink.expressad.videocommon.e.c;
import com.anythink.expressad.videocommon.e.d;
import com.p7700g.p99005.tm4;

/* loaded from: classes2.dex */
public class AnythinkAlertWebview extends AnythinkH5EndCardView {
    private String z;

    public AnythinkAlertWebview(Context context) {
        super(context);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final String a() {
        if (TextUtils.isEmpty(this.w)) {
            return "";
        }
        c.a().a(a.b().e(), this.w, false);
        String I = d.I();
        this.z = I;
        return !TextUtils.isEmpty(I) ? g.a().c(this.z) : "";
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    public final RelativeLayout.LayoutParams b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        String a = a();
        if (this.f_ && this.b_ != null && !TextUtils.isEmpty(a)) {
            BrowserView.DownloadListener downloadListener = new BrowserView.DownloadListener(this.b_);
            downloadListener.setTitle(this.b_.bb());
            this.r.setDownloadListener(downloadListener);
            this.r.setCampaignId(this.b_.aZ());
            setCloseVisible(8);
            this.r.setApiManagerJSFactory(bVar);
            this.r.setWebViewListener(new com.anythink.expressad.atsignalcommon.a.b() { // from class: com.anythink.expressad.video.module.AnythinkAlertWebview.1
                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    n.d("AlertWebview", "===========finish+".concat(String.valueOf(str)));
                    j.a();
                    j.a(webView, "onJSBridgeConnected", "");
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    n.d("AlertWebview", "===========onReceivedError");
                    if (AnythinkAlertWebview.this.v) {
                        return;
                    }
                    n.a(AnythinkBaseView.TAG, "onReceivedError,url:".concat(String.valueOf(str2)));
                    AnythinkAlertWebview.this.v = true;
                }

                @Override // com.anythink.expressad.atsignalcommon.a.b, com.anythink.expressad.atsignalcommon.windvane.e
                public final void readyState(WebView webView, int i) {
                    super.readyState(webView, i);
                    n.d("MBridgeAlertWebview", "===========readyState  :  ".concat(String.valueOf(i)));
                    AnythinkAlertWebview anythinkAlertWebview = AnythinkAlertWebview.this;
                    if (anythinkAlertWebview.v) {
                        return;
                    }
                    anythinkAlertWebview.u = i == 1;
                }
            });
            setHtmlSource(h.a().b(a));
            this.u = false;
            if (TextUtils.isEmpty(this.t)) {
                n.a(AnythinkBaseView.TAG, "load url:".concat(String.valueOf(a)));
                this.r.loadUrl(a);
            } else {
                n.a(AnythinkBaseView.TAG, "load html...");
                this.r.loadDataWithBaseURL(a, this.t, tm4.D, "UTF-8", null);
            }
            this.r.setBackgroundColor(0);
            setBackgroundColor(0);
            return;
        }
        this.e_.a(101, "");
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.h
    public void webviewshow() {
        RelativeLayout relativeLayout = this.p;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundColor(0);
        }
        super.webviewshow();
    }

    public AnythinkAlertWebview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}