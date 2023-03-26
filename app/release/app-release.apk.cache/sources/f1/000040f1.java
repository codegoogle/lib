package com.p7700g.p99005;

import android.view.View;
import android.view.ViewParent;

/* compiled from: NestedScrollingChildHelper.java */
/* loaded from: classes.dex */
public class er {
    private ViewParent a;
    private ViewParent b;
    private final View c;
    private boolean d;
    private int[] e;

    public er(@x1 View view) {
        this.c = view;
    }

    private boolean h(int i, int i2, int i3, int i4, @z1 int[] iArr, int i5, @z1 int[] iArr2) {
        ViewParent i6;
        int i7;
        int i8;
        int[] iArr3;
        if (!m() || (i6 = i(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.c.getLocationInWindow(iArr);
            i7 = iArr[0];
            i8 = iArr[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr2 == null) {
            int[] j = j();
            j[0] = 0;
            j[1] = 0;
            iArr3 = j;
        } else {
            iArr3 = iArr2;
        }
        xr.i(i6, this.c, i, i2, i3, i4, i5, iArr3);
        if (iArr != null) {
            this.c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i7;
            iArr[1] = iArr[1] - i8;
        }
        return true;
    }

    private ViewParent i(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.b;
        }
        return this.a;
    }

    private int[] j() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    private void q(int i, ViewParent viewParent) {
        if (i == 0) {
            this.a = viewParent;
        } else if (i != 1) {
        } else {
            this.b = viewParent;
        }
    }

    public boolean a(float f, float f2, boolean z) {
        ViewParent i;
        if (!m() || (i = i(0)) == null) {
            return false;
        }
        return xr.c(i, this.c, f, f2, z);
    }

    public boolean b(float f, float f2) {
        ViewParent i;
        if (!m() || (i = i(0)) == null) {
            return false;
        }
        return xr.d(i, this.c, f, f2);
    }

    public boolean c(int i, int i2, @z1 int[] iArr, @z1 int[] iArr2) {
        return d(i, i2, iArr, iArr2, 0);
    }

    public boolean d(int i, int i2, @z1 int[] iArr, @z1 int[] iArr2, int i3) {
        ViewParent i4;
        int i5;
        int i6;
        if (!m() || (i4 = i(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                return false;
            }
            return false;
        }
        if (iArr2 != null) {
            this.c.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        xr.f(i4, this.c, i, i2, iArr, i3);
        if (iArr2 != null) {
            this.c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    public void e(int i, int i2, int i3, int i4, @z1 int[] iArr, int i5, @z1 int[] iArr2) {
        h(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean f(int i, int i2, int i3, int i4, @z1 int[] iArr) {
        return h(i, i2, i3, i4, iArr, 0, null);
    }

    public boolean g(int i, int i2, int i3, int i4, @z1 int[] iArr, int i5) {
        return h(i, i2, i3, i4, iArr, i5, null);
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i) {
        return i(i) != null;
    }

    public boolean m() {
        return this.d;
    }

    public void n() {
        sr.F2(this.c);
    }

    public void o(@x1 View view) {
        sr.F2(this.c);
    }

    public void p(boolean z) {
        if (this.d) {
            sr.F2(this.c);
        }
        this.d = z;
    }

    public boolean r(int i) {
        return s(i, 0);
    }

    public boolean s(int i, int i2) {
        if (l(i2)) {
            return true;
        }
        if (m()) {
            View view = this.c;
            for (ViewParent parent = this.c.getParent(); parent != null; parent = parent.getParent()) {
                if (xr.m(parent, view, this.c, i, i2)) {
                    q(i2, parent);
                    xr.k(parent, view, this.c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
            return false;
        }
        return false;
    }

    public void t() {
        u(0);
    }

    public void u(int i) {
        ViewParent i2 = i(i);
        if (i2 != null) {
            xr.o(i2, this.c, i);
            q(i, null);
        }
    }
}