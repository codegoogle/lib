package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.RequiresApi;

@RequiresApi(19)
/* renamed from: com.facebook.ads.redexgen.X.18  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass18 extends AnonymousClass29 {
    @Override // com.facebook.ads.redexgen.X.C0631El, com.facebook.ads.redexgen.X.C03522t
    public final void A0D(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    @Override // com.facebook.ads.redexgen.X.C03522t
    public final boolean A0J(View view) {
        return view.isAttachedToWindow();
    }
}