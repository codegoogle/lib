package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.ga2;

/* compiled from: MaterialDividerItemDecoration.java */
/* loaded from: classes3.dex */
public class sd2 extends RecyclerView.n {
    public static final int a = 0;
    public static final int b = 1;
    private static final int c = ga2.n.qi;
    @x1
    private Drawable d;
    private int e;
    @w0
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;
    private final Rect k;

    public sd2(@x1 Context context, int i) {
        this(context, null, i);
    }

    private void l(@x1 Canvas canvas, @x1 RecyclerView recyclerView) {
        int height;
        int i;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            i = 0;
        }
        int i2 = i + this.h;
        int i3 = height - this.i;
        int childCount = recyclerView.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            recyclerView.getLayoutManager().X(childAt, this.k);
            int round = Math.round(childAt.getTranslationX()) + this.k.right;
            this.d.setBounds((round - this.d.getIntrinsicWidth()) - this.e, i2, round, i3);
            this.d.draw(canvas);
        }
        canvas.restore();
    }

    private void m(@x1 Canvas canvas, @x1 RecyclerView recyclerView) {
        int width;
        int i;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            i = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(i, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            i = 0;
        }
        boolean z = sr.Y(recyclerView) == 1;
        int i2 = i + (z ? this.i : this.h);
        int i3 = width - (z ? this.h : this.i);
        int childCount = recyclerView.getChildCount();
        if (!this.j) {
            childCount--;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = recyclerView.getChildAt(i4);
            recyclerView.t0(childAt, this.k);
            int round = Math.round(childAt.getTranslationY()) + this.k.bottom;
            this.d.setBounds(i2, (round - this.d.getIntrinsicHeight()) - this.e, i3, round);
            this.d.draw(canvas);
        }
        canvas.restore();
    }

    public void A(@x1 Context context, @a1 int i) {
        z(context.getResources().getDimensionPixelSize(i));
    }

    public void B(boolean z) {
        this.j = z;
    }

    public void C(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(wo1.n("Invalid orientation: ", i, ". It should be either HORIZONTAL or VERTICAL"));
        }
        this.g = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(@x1 Rect rect, @x1 View view, @x1 RecyclerView recyclerView, @x1 RecyclerView.c0 c0Var) {
        rect.set(0, 0, 0, 0);
        if (this.g == 1) {
            rect.bottom = this.d.getIntrinsicHeight() + this.e;
        } else {
            rect.right = this.d.getIntrinsicWidth() + this.e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(@x1 Canvas canvas, @x1 RecyclerView recyclerView, @x1 RecyclerView.c0 c0Var) {
        if (recyclerView.getLayoutManager() == null) {
            return;
        }
        if (this.g == 1) {
            m(canvas, recyclerView);
        } else {
            l(canvas, recyclerView);
        }
    }

    @w0
    public int n() {
        return this.f;
    }

    @c2
    public int o() {
        return this.i;
    }

    @c2
    public int p() {
        return this.h;
    }

    @c2
    public int q() {
        return this.e;
    }

    public int r() {
        return this.g;
    }

    public boolean s() {
        return this.j;
    }

    public void t(@w0 int i) {
        this.f = i;
        Drawable r = fk.r(this.d);
        this.d = r;
        fk.n(r, i);
    }

    public void u(@x1 Context context, @y0 int i) {
        t(gh.f(context, i));
    }

    public void v(@c2 int i) {
        this.i = i;
    }

    public void w(@x1 Context context, @a1 int i) {
        v(context.getResources().getDimensionPixelOffset(i));
    }

    public void x(@c2 int i) {
        this.h = i;
    }

    public void y(@x1 Context context, @a1 int i) {
        x(context.getResources().getDimensionPixelOffset(i));
    }

    public void z(@c2 int i) {
        this.e = i;
    }

    public sd2(@x1 Context context, @z1 AttributeSet attributeSet, int i) {
        this(context, attributeSet, ga2.c.jb, i);
    }

    public sd2(@x1 Context context, @z1 AttributeSet attributeSet, int i, int i2) {
        this.k = new Rect();
        TypedArray j = cf2.j(context, attributeSet, ga2.o.mm, i, c, new int[0]);
        this.f = sg2.a(context, j, ga2.o.nm).getDefaultColor();
        this.e = j.getDimensionPixelSize(ga2.o.qm, context.getResources().getDimensionPixelSize(ga2.f.s5));
        this.h = j.getDimensionPixelOffset(ga2.o.pm, 0);
        this.i = j.getDimensionPixelOffset(ga2.o.om, 0);
        this.j = j.getBoolean(ga2.o.rm, true);
        j.recycle();
        this.d = new ShapeDrawable();
        t(this.f);
        C(i2);
    }
}