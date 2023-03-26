package com.p7700g.p99005;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: ElasticTabIndicatorInterpolator.java */
/* loaded from: classes3.dex */
public class hi2 extends ji2 {
    private static float e(@g1(from = 0.0d, to = 1.0d) float f) {
        return (float) (1.0d - Math.cos((f * 3.141592653589793d) / 2.0d));
    }

    private static float f(@g1(from = 0.0d, to = 1.0d) float f) {
        return (float) Math.sin((f * 3.141592653589793d) / 2.0d);
    }

    @Override // com.p7700g.p99005.ji2
    public void d(li2 li2Var, View view, View view2, float f, @x1 Drawable drawable) {
        float f2;
        float e;
        RectF a = ji2.a(li2Var, view);
        RectF a2 = ji2.a(li2Var, view2);
        if (a.left < a2.left) {
            f2 = e(f);
            e = f(f);
        } else {
            f2 = f(f);
            e = e(f);
        }
        drawable.setBounds(ha2.c((int) a.left, (int) a2.left, f2), drawable.getBounds().top, ha2.c((int) a.right, (int) a2.right, e), drawable.getBounds().bottom);
    }
}