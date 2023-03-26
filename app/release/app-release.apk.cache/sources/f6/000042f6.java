package com.p7700g.p99005;

import android.view.View;

/* compiled from: NestedScrollingParent2.java */
/* loaded from: classes.dex */
public interface fr extends hr {
    void onNestedPreScroll(@x1 View view, int i, int i2, @x1 int[] iArr, int i3);

    void onNestedScroll(@x1 View view, int i, int i2, int i3, int i4, int i5);

    void onNestedScrollAccepted(@x1 View view, @x1 View view2, int i, int i2);

    boolean onStartNestedScroll(@x1 View view, @x1 View view2, int i, int i2);

    void onStopNestedScroll(@x1 View view, int i);
}