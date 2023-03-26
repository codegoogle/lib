package com.p7700g.p99005;

/* compiled from: NestedScrollingChild.java */
/* loaded from: classes.dex */
public interface dr {
    boolean dispatchNestedFling(float f, float f2, boolean z);

    boolean dispatchNestedPreFling(float f, float f2);

    boolean dispatchNestedPreScroll(int i, int i2, @z1 int[] iArr, @z1 int[] iArr2);

    boolean dispatchNestedScroll(int i, int i2, int i3, int i4, @z1 int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z);

    boolean startNestedScroll(int i);

    void stopNestedScroll();
}