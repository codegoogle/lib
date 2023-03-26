package com.facebook.ads.redexgen.X;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class O6 {
    public static AbstractC0930Qk A00(final C0860Ns c0860Ns, int i, final String str, final C0890Ow c0890Ow) {
        return i == 1 ? new AbstractC0930Qk(c0860Ns, str, c0890Ow) { // from class: com.facebook.ads.redexgen.X.8t
            public static final int A00 = (int) (C0795Le.A01 * 20.0f);
            public static final int A01 = (int) (C0795Le.A01 * 16.0f);

            @Override // com.facebook.ads.redexgen.X.AbstractC0856No
            public final boolean A0O() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0930Qk
            public final void A0h(C1080Wh c1080Wh) {
                C0853Nl titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                titleDescContainer.setPadding(0, 0, 0, A00);
                getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                LinearLayout linearLayout = new LinearLayout(c1080Wh);
                C0795Le.A0W(linearLayout, new ColorDrawable(-1));
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, getMediaContainer().getId());
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.setOrientation(1);
                int i2 = A01;
                linearLayout.setPadding(i2, i2, i2, i2);
                linearLayout.addView(titleDescContainer);
                linearLayout.addView(getCtaButton());
                addView(getMediaContainer());
                addView(linearLayout);
            }
        } : new AbstractC0930Qk(c0860Ns, str, c0890Ow) { // from class: com.facebook.ads.redexgen.X.9V
            public static final int A00 = (int) (C0795Le.A01 * 12.0f);

            @Override // com.facebook.ads.redexgen.X.AbstractC0930Qk, com.facebook.ads.redexgen.X.AbstractC0856No
            public final boolean A0M() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0856No
            public final boolean A0N() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.AbstractC0930Qk
            public final void A0h(C1080Wh c1080Wh) {
                C0853Nl titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(layoutParams);
                int i2 = A00;
                titleDescContainer.setPadding(i2, i2, i2, i2);
                C0795Le.A0V(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams2);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}