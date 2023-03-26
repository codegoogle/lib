package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ox  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0891Ox implements O4 {
    public final /* synthetic */ C0890Ow A00;

    public C0891Ox(C0890Ow c0890Ow) {
        this.A00 = c0890Ow;
    }

    @Override // com.facebook.ads.redexgen.X.O4
    public final void ABK(View view) {
        boolean z;
        z = this.A00.A07;
        if (z) {
            this.A00.A05 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.O4
    public final void ABL(View view) {
        boolean z;
        C0901Ph c0901Ph;
        C0901Ph c0901Ph2;
        AbstractC0930Qk abstractC0930Qk = (AbstractC0930Qk) view;
        abstractC0930Qk.A0g();
        z = this.A00.A07;
        if (z) {
            this.A00.A05 = true;
        }
        c0901Ph = this.A00.A0E;
        if (c0901Ph.A0b() && ((Integer) abstractC0930Qk.getTag(-1593835536)).intValue() == 0) {
            c0901Ph2 = this.A00.A0E;
            c0901Ph2.A0W();
        }
    }
}