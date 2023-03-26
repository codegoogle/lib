package com.facebook.ads.redexgen.X;

import android.util.AttributeSet;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public abstract class K6 extends RelativeLayout implements InterfaceC0887Ot {
    @Nullable
    public C0792Lb A00;

    public K6(C1080Wh c1080Wh) {
        super(c1080Wh);
    }

    public K6(C1080Wh c1080Wh, AttributeSet attributeSet, int i) {
        super(c1080Wh, attributeSet, i);
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0887Ot
    public final void A7s(C0792Lb c0792Lb) {
        this.A00 = c0792Lb;
        A07();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0887Ot
    public final void ADa(C0792Lb c0792Lb) {
        A08();
        this.A00 = null;
    }

    @Nullable
    public C0792Lb getVideoView() {
        return this.A00;
    }
}