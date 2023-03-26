package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class EU extends SX {
    public final /* synthetic */ ET A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EU(ET et, Context context) {
        super(context);
        this.A00 = et;
    }

    @Override // com.facebook.ads.redexgen.X.SX, com.facebook.ads.redexgen.X.C4S
    public final void A0J(View view, C4U c4u, C4Q c4q) {
        ET et = this.A00;
        int[] A0J = et.A0J(((AbstractC0982Sn) et).A00.getLayoutManager(), view);
        int i = A0J[0];
        int i2 = A0J[1];
        int A0N = A0N(Math.max(Math.abs(i), Math.abs(i2)));
        if (A0N > 0) {
            c4q.A05(i, i2, A0N, ((SX) this).A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SX
    public final float A0K(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.SX
    public final int A0M(int i) {
        return Math.min(100, super.A0M(i));
    }
}