package com.p7700g.p99005;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* compiled from: ScrollerCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class mt {
    public OverScroller a;

    public mt(Context context, Interpolator interpolator) {
        this.a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
    }

    @Deprecated
    public static mt c(Context context) {
        return d(context, null);
    }

    @Deprecated
    public static mt d(Context context, Interpolator interpolator) {
        return new mt(context, interpolator);
    }

    @Deprecated
    public void a() {
        this.a.abortAnimation();
    }

    @Deprecated
    public boolean b() {
        return this.a.computeScrollOffset();
    }

    @Deprecated
    public void e(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.fling(i, i2, i3, i4, i5, i6, i7, i8);
    }

    @Deprecated
    public void f(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.a.fling(i, i2, i3, i4, i5, i6, i7, i8, i9, i10);
    }

    @Deprecated
    public float g() {
        return this.a.getCurrVelocity();
    }

    @Deprecated
    public int h() {
        return this.a.getCurrX();
    }

    @Deprecated
    public int i() {
        return this.a.getCurrY();
    }

    @Deprecated
    public int j() {
        return this.a.getFinalX();
    }

    @Deprecated
    public int k() {
        return this.a.getFinalY();
    }

    @Deprecated
    public boolean l() {
        return this.a.isFinished();
    }

    @Deprecated
    public boolean m() {
        return this.a.isOverScrolled();
    }

    @Deprecated
    public void n(int i, int i2, int i3) {
        this.a.notifyHorizontalEdgeReached(i, i2, i3);
    }

    @Deprecated
    public void o(int i, int i2, int i3) {
        this.a.notifyVerticalEdgeReached(i, i2, i3);
    }

    @Deprecated
    public boolean p(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.a.springBack(i, i2, i3, i4, i5, i6);
    }

    @Deprecated
    public void q(int i, int i2, int i3, int i4) {
        this.a.startScroll(i, i2, i3, i4);
    }

    @Deprecated
    public void r(int i, int i2, int i3, int i4, int i5) {
        this.a.startScroll(i, i2, i3, i4, i5);
    }
}