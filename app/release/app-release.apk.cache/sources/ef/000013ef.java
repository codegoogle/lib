package com.facebook.ads.redexgen.X;

import android.content.res.Resources;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p7700g.p99005.zg2;

/* loaded from: assets/audience_network.dex */
public final class SU extends AbstractC0856No {
    public static final int A01 = Resources.getSystem().getDisplayMetrics().widthPixels;
    public final C0867Nz A00;

    public SU(C0860Ns c0860Ns, boolean z) {
        super(c0860Ns, z);
        this.A00 = new C0867Nz(c0860Ns.A05(), c0860Ns.A02());
        this.A00.A01(getTitleDescContainer(), z);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.setMargins(AbstractC0856No.A09, AbstractC0856No.A09, AbstractC0856No.A09, AbstractC0856No.A09);
        getCtaButton().setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(c0860Ns.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams2.addRule(2, getCtaButton().getId());
        frameLayout.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.gravity = 17;
        layoutParams3.setMargins(AbstractC0856No.A09, 0, AbstractC0856No.A09, 0);
        frameLayout.addView(this.A00, layoutParams3);
        addView(frameLayout);
        addView(getCtaButton());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final boolean A0M() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final boolean A0P() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final void A0b(AnonymousClass19 anonymousClass19, String str, double d, @Nullable Bundle bundle) {
        super.A0b(anonymousClass19, str, d, bundle);
        if (d > zg2.s) {
            this.A00.A00((int) ((A01 - (AbstractC0856No.A09 * 2)) / d));
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final boolean A0c() {
        return false;
    }
}