package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class N5 implements View.OnTouchListener {
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int action = motionEvent.getAction();
        if (action == 0) {
            i = N9.A08;
            C0795Le.A0P(view, i);
        } else if (action == 1) {
            C0795Le.A0P(view, 0);
        }
        return false;
    }
}