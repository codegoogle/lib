package com.p7700g.p99005;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.p7700g.p99005.li2;

/* compiled from: TabIndicatorInterpolator.java */
/* loaded from: classes3.dex */
public class ji2 {
    @b1(unit = 0)
    private static final int a = 24;

    public static RectF a(li2 li2Var, @z1 View view) {
        if (view == null) {
            return new RectF();
        }
        if (!li2Var.D() && (view instanceof li2.n)) {
            return b((li2.n) view, 24);
        }
        return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
    }

    public static RectF b(@x1 li2.n nVar, @b1(unit = 0) int i) {
        int contentWidth = nVar.getContentWidth();
        int contentHeight = nVar.getContentHeight();
        int e = (int) kf2.e(nVar.getContext(), i);
        if (contentWidth < e) {
            contentWidth = e;
        }
        int right = (nVar.getRight() + nVar.getLeft()) / 2;
        int bottom = (nVar.getBottom() + nVar.getTop()) / 2;
        int i2 = contentWidth / 2;
        return new RectF(right - i2, bottom - (contentHeight / 2), i2 + right, (right / 2) + bottom);
    }

    public void c(li2 li2Var, View view, @x1 Drawable drawable) {
        RectF a2 = a(li2Var, view);
        drawable.setBounds((int) a2.left, drawable.getBounds().top, (int) a2.right, drawable.getBounds().bottom);
    }

    public void d(li2 li2Var, View view, View view2, @g1(from = 0.0d, to = 1.0d) float f, @x1 Drawable drawable) {
        RectF a2 = a(li2Var, view);
        RectF a3 = a(li2Var, view2);
        drawable.setBounds(ha2.c((int) a2.left, (int) a3.left, f), drawable.getBounds().top, ha2.c((int) a2.right, (int) a3.right, f), drawable.getBounds().bottom);
    }
}