package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class JM implements View.OnAttachStateChangeListener {
    public final /* synthetic */ JK A00;
    public final /* synthetic */ JL A01;

    public JM(JL jl, JK jk) {
        this.A01 = jl;
        this.A00 = jk;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A03(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}