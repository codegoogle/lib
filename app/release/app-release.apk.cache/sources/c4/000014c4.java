package com.facebook.ads.redexgen.X;

import android.os.SystemClock;

/* renamed from: com.facebook.ads.redexgen.X.Vw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1069Vw implements InterfaceC04416i {
    public final /* synthetic */ C1070Vx A00;

    public C1069Vw(C1070Vx c1070Vx) {
        this.A00 = c1070Vx;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        return this.A00.A04(((float) SystemClock.uptimeMillis()) / 1000.0f);
    }
}