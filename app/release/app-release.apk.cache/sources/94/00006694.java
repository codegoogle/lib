package com.p7700g.p99005;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: DividerItemDecoration.java */
/* loaded from: classes.dex */
public class y20 extends RecyclerView.n {
    public static final int a = 0;
    public static final int b = 1;
    private static final String c = "DividerItem";
    private static final int[] d = {16843284};
    private Drawable e;
    private int f;
    private final Rect g = new Rect();

    public y20(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(d);
        this.e = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        p(i);
    }

    private void l(Canvas canvas, RecyclerView recyclerView) {
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
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getLayoutManager().X(childAt, this.g);
            int round = Math.round(childAt.getTranslationX()) + this.g.right;
            this.e.setBounds(round - this.e.getIntrinsicWidth(), i, round, height);
            this.e.draw(canvas);
        }
        canvas.restore();
    }

    private void m(Canvas canvas, RecyclerView recyclerView) {
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
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.t0(childAt, this.g);
            int round = Math.round(childAt.getTranslationY()) + this.g.bottom;
            this.e.setBounds(i, round - this.e.getIntrinsicHeight(), width, round);
            this.e.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        Drawable drawable = this.e;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
        if (recyclerView.getLayoutManager() == null || this.e == null) {
            return;
        }
        if (this.f == 1) {
            m(canvas, recyclerView);
        } else {
            l(canvas, recyclerView);
        }
    }

    @z1
    public Drawable n() {
        return this.e;
    }

    public void o(@x1 Drawable drawable) {
        if (drawable != null) {
            this.e = drawable;
            return;
        }
        throw new IllegalArgumentException("Drawable cannot be null.");
    }

    public void p(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f = i;
    }
}