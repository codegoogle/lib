package com.p7700g.p99005;

import android.view.View;
import com.p7700g.p99005.lr3;

/* compiled from: ZoomOutTransformation.java */
/* loaded from: classes3.dex */
public class is3 implements lr3.l {
    private static final float a = 0.65f;
    private static final float b = 0.3f;

    @Override // com.p7700g.p99005.lr3.l
    public void a(View view, float f) {
        if (f < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f <= 1.0f) {
            view.setScaleX(Math.max((float) a, 1.0f - Math.abs(f)));
            view.setScaleY(Math.max((float) a, 1.0f - Math.abs(f)));
            view.setAlpha(Math.max(0.3f, 1.0f - Math.abs(f)));
        } else {
            view.setAlpha(0.0f);
        }
    }
}