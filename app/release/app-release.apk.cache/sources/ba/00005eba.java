package com.p7700g.p99005;

import android.view.View;
import com.p7700g.p99005.lr3;

/* compiled from: CubeOutRotationTransformation.java */
/* loaded from: classes3.dex */
public class tr3 implements lr3.l {
    @Override // com.p7700g.p99005.lr3.l
    public void a(View view, float f) {
        if (f < -1.0f) {
            view.setAlpha(0.0f);
        } else if (f <= 0.0f) {
            view.setAlpha(1.0f);
            view.setPivotX(view.getWidth());
            view.setRotationY(Math.abs(f) * (-90.0f));
        } else if (f <= 1.0f) {
            view.setAlpha(1.0f);
            view.setPivotX(0.0f);
            view.setRotationY(Math.abs(f) * 90.0f);
        } else {
            view.setAlpha(0.0f);
        }
    }
}