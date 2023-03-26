package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class SV extends AbstractC0856No {
    public SV(C0860Ns c0860Ns, boolean z) {
        super(c0860Ns, true);
        RelativeLayout relativeLayout = new RelativeLayout(c0860Ns.A05());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        C0795Le.A0V(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c0860Ns.A05());
        linearLayout.setOrientation(!z ? 1 : 0);
        linearLayout.setGravity(80);
        C0795Le.A0N(linearLayout);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(AbstractC0856No.A09, 0, AbstractC0856No.A09, AbstractC0856No.A09);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(z ? -2 : -1, -2);
        layoutParams3.setMargins(z ? AbstractC0856No.A09 : 0, z ? 0 : AbstractC0856No.A09, 0, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z ? 0 : -1, -2);
        layoutParams4.setMargins(0, 0, 0, 0);
        layoutParams4.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams4);
        linearLayout.addView(getCtaButton(), layoutParams3);
        relativeLayout.addView(linearLayout, layoutParams2);
        View A02 = c0860Ns.A02();
        RelativeLayout.LayoutParams auxContainerParams = new RelativeLayout.LayoutParams(-1, -1);
        addView(A02, auxContainerParams);
        addView(relativeLayout, layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final void A0b(AnonymousClass19 anonymousClass19, String str, double d, @Nullable Bundle bundle) {
        super.A0b(anonymousClass19, str, d, bundle);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final boolean A0c() {
        return true;
    }
}