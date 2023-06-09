package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Gm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0680Gm implements PE {
    public TransitionDrawable A00;
    public TransitionDrawable A01;
    public final int A03;
    public final Drawable A04;
    public final Drawable A05;
    public final View A07;
    public final Handler A06 = new Handler();
    public PD A02 = PD.A05;

    public C0680Gm(View view, int i, Drawable drawable, Drawable drawable2) {
        this.A03 = i;
        this.A07 = view;
        this.A05 = drawable;
        this.A04 = drawable2;
        this.A01 = new TransitionDrawable(new Drawable[]{drawable, drawable2});
        this.A01.setCrossFadeEnabled(true);
        this.A00 = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        this.A00.setCrossFadeEnabled(true);
        C0795Le.A0W(this.A07, this.A01);
    }

    private void A04(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = PD.A06;
            C0795Le.A0W(this.A07, this.A00);
            this.A00.startTransition(this.A03);
            this.A06.postDelayed(new C0681Gn(this), this.A03);
            return;
        }
        C0795Le.A0W(this.A07, this.A05);
        this.A02 = PD.A05;
    }

    private void A05(boolean z) {
        this.A06.removeCallbacksAndMessages(null);
        if (z) {
            this.A02 = PD.A04;
            C0795Le.A0W(this.A07, this.A01);
            this.A01.startTransition(this.A03);
            this.A06.postDelayed(new C0691Gx(this), this.A03);
            return;
        }
        C0795Le.A0W(this.A07, this.A04);
        this.A02 = PD.A03;
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final void A3O(boolean z, boolean z2) {
        if (z2) {
            A04(z);
        } else {
            A05(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final PD A71() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.PE
    public final void cancel() {
        this.A06.removeCallbacksAndMessages(null);
        this.A01.resetTransition();
        this.A00.resetTransition();
        this.A02 = this.A02 == PD.A04 ? PD.A05 : PD.A03;
    }
}