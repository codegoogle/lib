package com.facebook.ads.redexgen.X;

import android.os.Build;

/* renamed from: com.facebook.ads.redexgen.X.2R  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C2R extends ES {
    public C2R(C1080Wh c1080Wh) {
        super(c1080Wh);
        setCarouselLayoutManager(c1080Wh);
    }

    @Override // com.facebook.ads.redexgen.X.ES
    public SW getLayoutManager() {
        return (SW) super.getLayoutManager();
    }

    private void setCarouselLayoutManager(C1080Wh c1080Wh) {
        SW sw = new SW(c1080Wh, 0, false);
        if (Build.VERSION.SDK_INT >= 24) {
            sw.A1W(true);
        }
        super.setLayoutManager(sw);
    }

    @Override // com.facebook.ads.redexgen.X.ES
    public void setLayoutManager(C4F c4f) {
    }
}