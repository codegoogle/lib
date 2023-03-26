package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.4A  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4A {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final C4A A00(C4X c4x, int i) {
        View view = c4x.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final C4A A01(C4X c4x) {
        return A00(c4x, 0);
    }
}