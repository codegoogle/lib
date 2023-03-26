package com.p7700g.p99005;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.fb0;
import java.util.Locale;

/* compiled from: ScrollEventAdapter.java */
/* loaded from: classes.dex */
public final class eb0 extends RecyclerView.t {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;
    private static final int e = 4;
    private static final int f = -1;
    private fb0.j g;
    @x1
    private final fb0 h;
    @x1
    private final RecyclerView i;
    @x1
    private final LinearLayoutManager j;
    private int k;
    private int l;
    private a m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;

    /* compiled from: ScrollEventAdapter.java */
    /* loaded from: classes.dex */
    public static final class a {
        public int a;
        public float b;
        public int c;

        public void a() {
            this.a = -1;
            this.b = 0.0f;
            this.c = 0;
        }
    }

    public eb0(@x1 fb0 fb0Var) {
        this.h = fb0Var;
        RecyclerView recyclerView = fb0Var.I;
        this.i = recyclerView;
        this.j = (LinearLayoutManager) recyclerView.getLayoutManager();
        this.m = new a();
        q();
    }

    private void c(int i, float f2, int i2) {
        fb0.j jVar = this.g;
        if (jVar != null) {
            jVar.b(i, f2, i2);
        }
    }

    private void d(int i) {
        fb0.j jVar = this.g;
        if (jVar != null) {
            jVar.c(i);
        }
    }

    private void e(int i) {
        if ((this.k == 3 && this.l == 0) || this.l == i) {
            return;
        }
        this.l = i;
        fb0.j jVar = this.g;
        if (jVar != null) {
            jVar.a(i);
        }
    }

    private int f() {
        return this.j.y2();
    }

    private boolean l() {
        int i = this.k;
        return i == 1 || i == 4;
    }

    private void q() {
        this.k = 0;
        this.l = 0;
        this.m.a();
        this.n = -1;
        this.o = -1;
        this.p = false;
        this.q = false;
        this.s = false;
        this.r = false;
    }

    private void s(boolean z) {
        this.s = z;
        this.k = z ? 4 : 1;
        int i = this.o;
        if (i != -1) {
            this.n = i;
            this.o = -1;
        } else if (this.n == -1) {
            this.n = f();
        }
        e(1);
    }

    private void t() {
        int top;
        a aVar = this.m;
        int y2 = this.j.y2();
        aVar.a = y2;
        if (y2 == -1) {
            aVar.a();
            return;
        }
        View J = this.j.J(y2);
        if (J == null) {
            aVar.a();
            return;
        }
        int j0 = this.j.j0(J);
        int u0 = this.j.u0(J);
        int x0 = this.j.x0(J);
        int O = this.j.O(J);
        ViewGroup.LayoutParams layoutParams = J.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            j0 += marginLayoutParams.leftMargin;
            u0 += marginLayoutParams.rightMargin;
            x0 += marginLayoutParams.topMargin;
            O += marginLayoutParams.bottomMargin;
        }
        int height = J.getHeight() + x0 + O;
        int width = J.getWidth() + j0 + u0;
        if (this.j.Q2() == 0) {
            top = (J.getLeft() - j0) - this.i.getPaddingLeft();
            if (this.h.k()) {
                top = -top;
            }
            height = width;
        } else {
            top = (J.getTop() - x0) - this.i.getPaddingTop();
        }
        int i = -top;
        aVar.c = i;
        if (i < 0) {
            if (new ya0(this.j).d()) {
                throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
            }
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.c)));
        }
        aVar.b = height == 0 ? 0.0f : i / height;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(@x1 RecyclerView recyclerView, int i) {
        boolean z = true;
        if ((this.k != 1 || this.l != 1) && i == 1) {
            s(false);
        } else if (l() && i == 2) {
            if (this.q) {
                e(2);
                this.p = true;
            }
        } else {
            if (l() && i == 0) {
                t();
                if (!this.q) {
                    int i2 = this.m.a;
                    if (i2 != -1) {
                        c(i2, 0.0f, 0);
                    }
                } else {
                    a aVar = this.m;
                    if (aVar.c == 0) {
                        int i3 = this.n;
                        int i4 = aVar.a;
                        if (i3 != i4) {
                            d(i4);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    e(0);
                    q();
                }
            }
            if (this.k == 2 && i == 0 && this.r) {
                t();
                a aVar2 = this.m;
                if (aVar2.c == 0) {
                    int i5 = this.o;
                    int i6 = aVar2.a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        d(i6);
                    }
                    e(0);
                    q();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if ((r5 < 0) == r3.h.k()) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(@x1 RecyclerView recyclerView, int i, int i2) {
        boolean z;
        int i3;
        this.q = true;
        t();
        if (this.p) {
            this.p = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                }
                z = false;
                if (z) {
                    a aVar = this.m;
                    if (aVar.c != 0) {
                        i3 = aVar.a + 1;
                        this.o = i3;
                        if (this.n != i3) {
                            d(i3);
                        }
                    }
                }
                i3 = this.m.a;
                this.o = i3;
                if (this.n != i3) {
                }
            }
            z = true;
            if (z) {
            }
            i3 = this.m.a;
            this.o = i3;
            if (this.n != i3) {
            }
        } else if (this.k == 0) {
            int i4 = this.m.a;
            if (i4 == -1) {
                i4 = 0;
            }
            d(i4);
        }
        a aVar2 = this.m;
        int i5 = aVar2.a;
        if (i5 == -1) {
            i5 = 0;
        }
        c(i5, aVar2.b, aVar2.c);
        a aVar3 = this.m;
        int i6 = aVar3.a;
        int i7 = this.o;
        if ((i6 == i7 || i7 == -1) && aVar3.c == 0 && this.l != 1) {
            e(0);
            q();
        }
    }

    public double g() {
        t();
        a aVar = this.m;
        return aVar.a + aVar.b;
    }

    public int h() {
        return this.l;
    }

    public boolean i() {
        return this.l == 1;
    }

    public boolean j() {
        return this.s;
    }

    public boolean k() {
        return this.l == 0;
    }

    public void m() {
        this.k = 4;
        s(true);
    }

    public void n() {
        this.r = true;
    }

    public void o() {
        if (!i() || this.s) {
            this.s = false;
            t();
            a aVar = this.m;
            if (aVar.c == 0) {
                int i = aVar.a;
                if (i != this.n) {
                    d(i);
                }
                e(0);
                q();
                return;
            }
            e(2);
        }
    }

    public void p(int i, boolean z) {
        this.k = z ? 2 : 3;
        this.s = false;
        boolean z2 = this.o != i;
        this.o = i;
        e(2);
        if (z2) {
            d(i);
        }
    }

    public void r(fb0.j jVar) {
        this.g = jVar;
    }
}