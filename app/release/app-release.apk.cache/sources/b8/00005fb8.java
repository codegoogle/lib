package com.p7700g.p99005;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* compiled from: HeaderScrollingViewBehavior.java */
/* loaded from: classes2.dex */
public abstract class ua2 extends va2<View> {
    public final Rect d;
    public final Rect e;
    private int f;
    private int g;

    public ua2() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    private static int V(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    @Override // com.p7700g.p99005.va2
    public void K(@x1 CoordinatorLayout coordinatorLayout, @x1 View view, int i) {
        View P = P(coordinatorLayout.q(view));
        if (P != null) {
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) view.getLayoutParams();
            Rect rect = this.d;
            rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, P.getBottom() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin, ((P.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
            gs lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && sr.T(coordinatorLayout) && !sr.T(view)) {
                rect.left = lastWindowInsets.p() + rect.left;
                rect.right -= lastWindowInsets.q();
            }
            Rect rect2 = this.e;
            nq.b(V(gVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int Q = Q(P);
            view.layout(rect2.left, rect2.top - Q, rect2.right, rect2.bottom - Q);
            this.f = rect2.top - P.getBottom();
            return;
        }
        super.K(coordinatorLayout, view, i);
        this.f = 0;
    }

    @z1
    public abstract View P(List<View> list);

    public final int Q(View view) {
        if (this.g == 0) {
            return 0;
        }
        float R = R(view);
        int i = this.g;
        return bm.e((int) (R * i), 0, i);
    }

    public float R(View view) {
        return 1.0f;
    }

    public final int S() {
        return this.g;
    }

    public int T(@x1 View view) {
        return view.getMeasuredHeight();
    }

    public final int U() {
        return this.f;
    }

    public final void W(int i) {
        this.g = i;
    }

    public boolean X() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean n(@x1 CoordinatorLayout coordinatorLayout, @x1 View view, int i, int i2, int i3, int i4) {
        View P;
        gs lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (P = P(coordinatorLayout.q(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                if (sr.T(P) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size = lastWindowInsets.o() + lastWindowInsets.r() + size;
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int T = T(P) + size;
            int measuredHeight = P.getMeasuredHeight();
            if (X()) {
                view.setTranslationY(-measuredHeight);
            } else {
                T -= measuredHeight;
            }
            coordinatorLayout.I(view, i, i2, View.MeasureSpec.makeMeasureSpec(T, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
            return true;
        }
        return false;
    }

    public ua2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
}