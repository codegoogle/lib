package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.t0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xd2;
import com.p7700g.p99005.z1;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.c<View> {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private int d;

    /* loaded from: classes3.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public final /* synthetic */ View s;
        public final /* synthetic */ int t;
        public final /* synthetic */ xd2 u;

        public a(View view, int i, xd2 xd2Var) {
            this.s = view;
            this.t = i;
            this.u = xd2Var;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.s.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.d == this.t) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                xd2 xd2Var = this.u;
                expandableBehavior.K((View) xd2Var, this.s, xd2Var.b(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.d = 0;
    }

    private boolean H(boolean z) {
        if (!z) {
            return this.d == 1;
        }
        int i = this.d;
        return i == 0 || i == 2;
    }

    @z1
    public static <T extends ExpandableBehavior> T J(@x1 View view, @x1 Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.g) {
            CoordinatorLayout.c f = ((CoordinatorLayout.g) layoutParams).f();
            if (f instanceof ExpandableBehavior) {
                return cls.cast(f);
            }
            throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    @z1
    public xd2 I(@x1 CoordinatorLayout coordinatorLayout, @x1 View view) {
        List<View> q = coordinatorLayout.q(view);
        int size = q.size();
        for (int i = 0; i < size; i++) {
            View view2 = q.get(i);
            if (f(coordinatorLayout, view, view2)) {
                return (xd2) view2;
            }
        }
        return null;
    }

    public abstract boolean K(View view, View view2, boolean z, boolean z2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean f(CoordinatorLayout coordinatorLayout, View view, View view2);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @t0
    public boolean i(CoordinatorLayout coordinatorLayout, View view, View view2) {
        xd2 xd2Var = (xd2) view2;
        if (H(xd2Var.b())) {
            this.d = xd2Var.b() ? 1 : 2;
            return K((View) xd2Var, view, xd2Var.b(), true);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @t0
    public boolean m(@x1 CoordinatorLayout coordinatorLayout, @x1 View view, int i) {
        xd2 I;
        if (sr.T0(view) || (I = I(coordinatorLayout, view)) == null || !H(I.b())) {
            return false;
        }
        int i2 = I.b() ? 1 : 2;
        this.d = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i2, I));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 0;
    }
}