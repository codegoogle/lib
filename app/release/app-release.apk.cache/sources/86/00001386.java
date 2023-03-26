package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ql  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0931Ql implements NT {
    public final WeakReference<AbstractC0930Qk> A00;

    public C0931Ql(AbstractC0930Qk abstractC0930Qk) {
        this.A00 = new WeakReference<>(abstractC0930Qk);
    }

    @Override // com.facebook.ads.redexgen.X.NT
    public final void A9g(boolean z) {
        AbstractC0930Qk abstractC0930Qk = this.A00.get();
        if (abstractC0930Qk != null) {
            abstractC0930Qk.A06 = z;
            abstractC0930Qk.A01();
        }
    }
}