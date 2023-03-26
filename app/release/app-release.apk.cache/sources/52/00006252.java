package com.p7700g.p99005;

import android.view.View;
import com.p7700g.p99005.lr3;

/* compiled from: DepthTransformation.java */
/* loaded from: classes3.dex */
public class vr3 implements lr3.l {
    @Override // com.p7700g.p99005.lr3.l
    public void a(View view, float f) {
        if (f < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f <= 0.0f) {
            view.setAlpha(1.0f);
            view.setTranslationX(0.0f);
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        } else if (f <= 1.0f) {
            view.setTranslationX((-f) * view.getWidth());
            view.setAlpha(1.0f - Math.abs(f));
            view.setScaleX(1.0f - Math.abs(f));
            view.setScaleY(1.0f - Math.abs(f));
        } else {
            view.setAlpha(0.0f);
        }
    }
}