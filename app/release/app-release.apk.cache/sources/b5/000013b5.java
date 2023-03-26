package com.facebook.ads.redexgen.X;

import android.webkit.WebView;
import com.facebook.ads.AdError;

/* loaded from: assets/audience_network.dex */
public class RW implements AnonymousClass79 {
    public final C1S A00;
    public final InterfaceC03131g A01;
    public final C7H A02;
    public final C1080Wh A03;
    public final boolean A04;

    public RW(C1080Wh c1080Wh, InterfaceC03131g interfaceC03131g, C7H c7h, C1S c1s, boolean z) {
        this.A03 = c1080Wh;
        this.A01 = interfaceC03131g;
        this.A02 = c7h;
        this.A00 = c1s;
        this.A04 = z;
    }

    public /* synthetic */ RW(C1080Wh c1080Wh, InterfaceC03131g interfaceC03131g, C7H c7h, C1S c1s, boolean z, C03121f c03121f) {
        this(c1080Wh, interfaceC03131g, c7h, c1s, z);
    }

    private void A00() {
        WebView webView = new WebView(this.A03);
        webView.getSettings().setCacheMode(1);
        webView.setWebViewClient(new C03141h(this.A00, this.A01, this.A04));
        webView.loadUrl(this.A00.A0F());
    }

    private void A01(boolean z) {
        if (this.A00.A0A() == C1T.A05) {
            A00();
            return;
        }
        String A0F = this.A00.A0F();
        if (z) {
            A0F = this.A02.A0L(this.A00.A0F());
        }
        this.A00.A0H(A0F);
        this.A01.AAS();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass79
    public final void A97() {
        if (this.A04) {
            this.A01.AAR(AdError.CACHE_ERROR);
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass79
    public final void A9E() {
        A01(true);
    }
}