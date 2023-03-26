package com.p7700g.p99005;

import android.view.View;
import com.p7700g.p99005.lr3;

/* compiled from: AntiClockSpinTransformation.java */
/* loaded from: classes3.dex */
public class nr3 implements lr3.l {
    @Override // com.p7700g.p99005.lr3.l
    public void a(View view, float f) {
        view.setTranslationX((-f) * view.getWidth());
        if (Math.abs(f) < 0.5d) {
            view.setVisibility(0);
            view.setScaleX(1.0f - Math.abs(f));
            view.setScaleY(1.0f - Math.abs(f));
        } else if (Math.abs(f) > 0.5d) {
            view.setVisibility(8);
        }
        if (f < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f <= 0.0f) {
            view.setAlpha(1.0f);
            view.setRotation((1.0f - Math.abs(f)) * 360.0f);
        } else if (f <= 1.0f) {
            view.setAlpha(1.0f);
            view.setRotation((1.0f - Math.abs(f)) * (-360.0f));
        } else {
            view.setAlpha(0.0f);
        }
    }
}