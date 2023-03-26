package com.p7700g.p99005;

import android.view.View;
import com.p7700g.p99005.lr3;

/* compiled from: FadeTransformation.java */
/* loaded from: classes3.dex */
public class wr3 implements lr3.l {
    @Override // com.p7700g.p99005.lr3.l
    public void a(View view, float f) {
        view.setTranslationX((-f) * view.getWidth());
        if (f < -1.0f || f > 1.0f) {
            view.setAlpha(0.0f);
            return;
        }
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i <= 0 || f <= 1.0f) {
            view.setAlpha(i <= 0 ? f + 1.0f : 1.0f - f);
        } else if (f == 0.0f) {
            view.setAlpha(1.0f);
        }
    }
}