package com.p7700g.p99005;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: FadeTabIndicatorInterpolator.java */
/* loaded from: classes3.dex */
public class ii2 extends ji2 {
    private static final float b = 0.5f;

    @Override // com.p7700g.p99005.ji2
    public void d(li2 li2Var, View view, View view2, float f, @x1 Drawable drawable) {
        float b2;
        int i = (f > 0.5f ? 1 : (f == 0.5f ? 0 : -1));
        if (i >= 0) {
            view = view2;
        }
        RectF a = ji2.a(li2Var, view);
        if (i < 0) {
            b2 = ha2.b(1.0f, 0.0f, 0.0f, 0.5f, f);
        } else {
            b2 = ha2.b(0.0f, 1.0f, 0.5f, 1.0f, f);
        }
        drawable.setBounds((int) a.left, drawable.getBounds().top, (int) a.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (b2 * 255.0f));
    }
}