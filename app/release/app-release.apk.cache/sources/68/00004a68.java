package com.p7700g.p99005;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* compiled from: InterpolateOnScrollPositionChangeHelper.java */
/* loaded from: classes3.dex */
public class jh2 {
    private View a;
    private lh2 b;
    private ScrollView c;
    private final int[] d = new int[2];
    private final int[] e = new int[2];
    private final ViewTreeObserver.OnScrollChangedListener f = new a();

    /* compiled from: InterpolateOnScrollPositionChangeHelper.java */
    /* loaded from: classes3.dex */
    public class a implements ViewTreeObserver.OnScrollChangedListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            jh2.this.e();
        }
    }

    public jh2(View view, lh2 lh2Var, ScrollView scrollView) {
        this.a = view;
        this.b = lh2Var;
        this.c = scrollView;
    }

    public void a(ScrollView scrollView) {
        this.c = scrollView;
    }

    public void b(lh2 lh2Var) {
        this.b = lh2Var;
    }

    public void c(@x1 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this.f);
    }

    public void d(@x1 ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this.f);
    }

    public void e() {
        ScrollView scrollView = this.c;
        if (scrollView == null) {
            return;
        }
        if (scrollView.getChildCount() != 0) {
            this.c.getLocationInWindow(this.d);
            this.c.getChildAt(0).getLocationInWindow(this.e);
            int top = (this.a.getTop() - this.d[1]) + this.e[1];
            int height = this.a.getHeight();
            int height2 = this.c.getHeight();
            if (top < 0) {
                this.b.p0(Math.max(0.0f, Math.min(1.0f, (top / height) + 1.0f)));
                this.a.invalidate();
                return;
            }
            int i = top + height;
            if (i > height2) {
                this.b.p0(Math.max(0.0f, Math.min(1.0f, 1.0f - ((i - height2) / height))));
                this.a.invalidate();
                return;
            } else if (this.b.z() != 1.0f) {
                this.b.p0(1.0f);
                this.a.invalidate();
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
    }
}