package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class NG extends C0848Ng {
    public final ImageView A00;
    public final C1080Wh A01;

    public NG(C1080Wh c1080Wh) {
        super(c1080Wh);
        this.A01 = c1080Wh;
        this.A00 = new ImageView(c1080Wh);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        AsyncTaskC1091Ws asyncTaskC1091Ws = new AsyncTaskC1091Ws(this.A00, this.A01);
        asyncTaskC1091Ws.A05();
        asyncTaskC1091Ws.A08(str);
    }
}