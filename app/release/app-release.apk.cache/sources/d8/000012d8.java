package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nw  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC0864Nw implements View.OnTouchListener {
    public final /* synthetic */ C0932Qm A00;

    public View$OnTouchListenerC0864Nw(C0932Qm c0932Qm) {
        this.A00 = c0932Qm;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                float y = motionEvent.getY();
                f = this.A00.A00;
                if (f < y) {
                    this.A00.A0S(false);
                }
            }
        } else {
            this.A00.A00 = motionEvent.getY();
        }
        return true;
    }
}