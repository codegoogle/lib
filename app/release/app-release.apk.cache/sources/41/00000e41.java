package com.facebook.ads.redexgen.X;

import android.graphics.Rect;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4C  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C4C {
    @Deprecated
    private final void A00(Rect rect, int i, ES es) {
        rect.set(0, 0, 0, 0);
    }

    public final void A01(Rect rect, View view, ES es, C4U c4u) {
        A00(rect, ((C4G) view.getLayoutParams()).A00(), es);
    }
}