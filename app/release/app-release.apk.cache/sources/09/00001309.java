package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ok  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC0878Ok implements View.OnTouchListener {
    public final /* synthetic */ C0792Lb A00;

    public View$OnTouchListenerC0878Ok(C0792Lb c0792Lb) {
        this.A00 = c0792Lb;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C9J c9j;
        c9j = this.A00.A0A;
        c9j.A03(new IF(view, motionEvent));
        return false;
    }
}