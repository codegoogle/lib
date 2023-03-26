package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Se  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0975Se implements InterfaceC03824a {
    public final /* synthetic */ C4F A00;

    public C0975Se(C4F c4f) {
        this.A00 = c4f;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03824a
    public final View A5d(int i) {
        return this.A00.A0u(i);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03824a
    public final int A5f(View view) {
        return this.A00.A0o(view) + ((C4G) view.getLayoutParams()).rightMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03824a
    public final int A5g(View view) {
        return this.A00.A0l(view) - ((C4G) view.getLayoutParams()).leftMargin;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03824a
    public final int A6e() {
        return this.A00.A0i() - this.A00.A0g();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03824a
    public final int A6f() {
        return this.A00.A0f();
    }
}