package com.facebook.ads.redexgen.X;

import android.graphics.Paint;

/* loaded from: assets/audience_network.dex */
public class PB extends Paint {
    public final /* synthetic */ PC A00;
    public final /* synthetic */ boolean A01;

    public PB(PC pc, boolean z) {
        this.A00 = pc;
        this.A01 = z;
        setStyle(Paint.Style.FILL_AND_STROKE);
        setStrokeCap(Paint.Cap.ROUND);
        setStrokeWidth(3.0f);
        setAntiAlias(true);
        setColor(this.A01 ? -1 : -10066330);
    }
}