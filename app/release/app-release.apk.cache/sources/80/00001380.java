package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;

/* renamed from: com.facebook.ads.redexgen.X.Qf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0925Qf extends NK {
    public final /* synthetic */ C0924Qe A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0925Qf(C0924Qe c0924Qe, C1080Wh c1080Wh) {
        super(c1080Wh);
        this.A00 = c0924Qe;
    }

    @Override // com.facebook.ads.redexgen.X.NK
    public final WebChromeClient A0A() {
        return new O9(this.A00, null);
    }

    @Override // com.facebook.ads.redexgen.X.NK
    public final WebViewClient A0B() {
        return new OA(this.A00, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        LX lx;
        lx = this.A00.A0B;
        lx.A07(motionEvent, this, this);
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }
}