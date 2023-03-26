package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OX implements View.OnTouchListener {
    public final /* synthetic */ OY A00;

    public OX(OY oy) {
        this.A00 = oy;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        JE je;
        AnonymousClass16 anonymousClass16;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            OY.A00(this.A00);
            je = this.A00.A06;
            anonymousClass16 = this.A00.A03;
            je.A8A(anonymousClass16.A0Q(), new NU().A04(this.A00.getViewabilityChecker()).A03(this.A00.getTouchDataRecorder()).A06());
            return false;
        }
        return false;
    }
}