package com.p7700g.p99005;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: HeaderBehavior.java */
/* loaded from: classes2.dex */
public abstract class ta2<V extends View> extends va2<V> {
    private static final int d = -1;
    @z1
    private Runnable e;
    public OverScroller f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    @z1
    private VelocityTracker k;

    /* compiled from: HeaderBehavior.java */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        private final CoordinatorLayout s;
        private final V t;

        public a(CoordinatorLayout coordinatorLayout, V v) {
            this.s = coordinatorLayout;
            this.t = v;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.t == null || (overScroller = ta2.this.f) == null) {
                return;
            }
            if (overScroller.computeScrollOffset()) {
                ta2 ta2Var = ta2.this;
                ta2Var.X(this.s, this.t, ta2Var.f.getCurrY());
                sr.o1(this.t, this);
                return;
            }
            ta2.this.V(this.s, this.t);
        }
    }

    public ta2() {
        this.h = -1;
        this.j = -1;
    }

    private void Q() {
        if (this.k == null) {
            this.k = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean E(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 MotionEvent motionEvent) {
        boolean z;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.k;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.k.computeCurrentVelocity(1000);
                R(coordinatorLayout, v, -T(v), 0, this.k.getYVelocity(this.h));
                z = true;
                this.g = false;
                this.h = -1;
                velocityTracker = this.k;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.k = null;
                }
                velocityTracker2 = this.k;
                if (velocityTracker2 != null) {
                }
                if (this.g) {
                    return true;
                }
            }
        } else {
            if (actionMasked == 2) {
                int findPointerIndex = motionEvent.findPointerIndex(this.h);
                if (findPointerIndex == -1) {
                    return false;
                }
                int y = (int) motionEvent.getY(findPointerIndex);
                this.i = y;
                W(coordinatorLayout, v, this.i - y, S(v), 0);
            } else if (actionMasked != 3) {
                if (actionMasked == 6) {
                    int i = motionEvent.getActionIndex() == 0 ? 1 : 0;
                    this.h = motionEvent.getPointerId(i);
                    this.i = (int) (motionEvent.getY(i) + 0.5f);
                }
            }
            z = false;
            velocityTracker2 = this.k;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            return !this.g || z;
        }
        z = false;
        this.g = false;
        this.h = -1;
        velocityTracker = this.k;
        if (velocityTracker != null) {
        }
        velocityTracker2 = this.k;
        if (velocityTracker2 != null) {
        }
        if (this.g) {
        }
    }

    public boolean P(V v) {
        return false;
    }

    public final boolean R(CoordinatorLayout coordinatorLayout, @x1 V v, int i, int i2, float f) {
        Runnable runnable = this.e;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.e = null;
        }
        if (this.f == null) {
            this.f = new OverScroller(v.getContext());
        }
        this.f.fling(0, H(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f.computeScrollOffset()) {
            a aVar = new a(coordinatorLayout, v);
            this.e = aVar;
            sr.o1(v, aVar);
            return true;
        }
        V(coordinatorLayout, v);
        return false;
    }

    public int S(@x1 V v) {
        return -v.getHeight();
    }

    public int T(@x1 V v) {
        return v.getHeight();
    }

    public int U() {
        return H();
    }

    public void V(CoordinatorLayout coordinatorLayout, V v) {
    }

    public final int W(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return Y(coordinatorLayout, v, U() - i, i2, i3);
    }

    public int X(CoordinatorLayout coordinatorLayout, V v, int i) {
        return Y(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public int Y(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int e;
        int H = H();
        if (i2 == 0 || H < i2 || H > i3 || H == (e = bm.e(i, i2, i3))) {
            return 0;
        }
        N(e);
        return H - e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(@x1 CoordinatorLayout coordinatorLayout, @x1 V v, @x1 MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.j < 0) {
            this.j = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.g) {
            int i = this.h;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.i) > this.j) {
                this.i = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.h = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = P(v) && coordinatorLayout.A(v, x, y2);
            this.g = z;
            if (z) {
                this.i = y2;
                this.h = motionEvent.getPointerId(0);
                Q();
                OverScroller overScroller = this.f;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.k;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public ta2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = -1;
        this.j = -1;
    }
}