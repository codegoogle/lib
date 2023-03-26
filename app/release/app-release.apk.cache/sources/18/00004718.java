package com.p7700g.p99005;

import android.view.View;

/* compiled from: NestedScrollingParent.java */
/* loaded from: classes.dex */
public interface hr {
    int getNestedScrollAxes();

    boolean onNestedFling(@x1 View view, float f, float f2, boolean z);

    boolean onNestedPreFling(@x1 View view, float f, float f2);

    void onNestedPreScroll(@x1 View view, int i, int i2, @x1 int[] iArr);

    void onNestedScroll(@x1 View view, int i, int i2, int i3, int i4);

    void onNestedScrollAccepted(@x1 View view, @x1 View view2, int i);

    boolean onStartNestedScroll(@x1 View view, @x1 View view2, int i);

    void onStopNestedScroll(@x1 View view);
}