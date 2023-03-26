package com.p7700g.p99005;

import android.view.View;
import com.p7700g.p99005.lr3;

/* compiled from: PopTransformation.java */
/* loaded from: classes3.dex */
public class cs3 implements lr3.l {
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
    }
}