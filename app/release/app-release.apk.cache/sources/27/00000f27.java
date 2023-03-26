package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.86  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass86 extends K2 {
    public final /* synthetic */ AnonymousClass85 A00;

    public AnonymousClass86(AnonymousClass85 anonymousClass85) {
        this.A00 = anonymousClass85;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9K
    /* renamed from: A00 */
    public final void A04(K3 k3) {
        new Handler(Looper.getMainLooper()).post(new OI(this));
    }
}