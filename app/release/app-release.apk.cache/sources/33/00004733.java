package com.p7700g.p99005;

import android.view.View;
import com.p7700g.p99005.lr3;

/* compiled from: VerticalShutTransformation.java */
/* loaded from: classes3.dex */
public class hs3 implements lr3.l {
    @Override // com.p7700g.p99005.lr3.l
    public void a(View view, float f) {
        view.setTranslationX((-f) * view.getWidth());
        view.setCameraDistance(1.0E9f);
        double d = f;
        if (d < 0.5d && d > -0.5d) {
            view.setVisibility(0);
        } else {
            view.setVisibility(4);
        }
        if (f < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f <= 0.0f) {
            view.setAlpha(1.0f);
            view.setRotationX(((1.0f - Math.abs(f)) + 1.0f) * 180.0f);
        } else if (f <= 1.0f) {
            view.setAlpha(1.0f);
            view.setRotationX(((1.0f - Math.abs(f)) + 1.0f) * (-180.0f));
        } else {
            view.setAlpha(0.0f);
        }
    }
}