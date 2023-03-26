package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Sf  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0976Sf implements InterfaceC03824a {
    public final /* synthetic */ C4F A00;

    public C0976Sf(C4F c4f) {
        this.A00 = c4f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03824a
    public final View A5d(int i) {
        return this.A00.A0u(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03824a
    public final int A5f(View view) {
        return this.A00.A0k(view) + ((C4G) view.getLayoutParams()).bottomMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03824a
    public final int A5g(View view) {
        return this.A00.A0p(view) - ((C4G) view.getLayoutParams()).topMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03824a
    public final int A6e() {
        return this.A00.A0Y() - this.A00.A0e();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03824a
    public final int A6f() {
        return this.A00.A0h();
    }
}