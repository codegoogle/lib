package com.p7700g.p99005;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: NestedScrollingParentHelper.java */
/* loaded from: classes.dex */
public class ir {
    private int a;
    private int b;

    public ir(@x1 ViewGroup viewGroup) {
    }

    public int a() {
        return this.a | this.b;
    }

    public void b(@x1 View view, @x1 View view2, int i) {
        c(view, view2, i, 0);
    }

    public void c(@x1 View view, @x1 View view2, int i, int i2) {
        if (i2 == 1) {
            this.b = i;
        } else {
            this.a = i;
        }
    }

    public void d(@x1 View view) {
        e(view, 0);
    }

    public void e(@x1 View view, int i) {
        if (i == 1) {
            this.b = 0;
        } else {
            this.a = 0;
        }
    }
}