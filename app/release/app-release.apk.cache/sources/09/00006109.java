package com.p7700g.p99005;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChildHelper.java */
/* loaded from: classes.dex */
public class v20 {
    private static final boolean a = false;
    private static final String b = "ChildrenHelper";
    public final b c;
    public final a d = new a();
    public final List<View> e = new ArrayList();

    /* compiled from: ChildHelper.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final int a = 64;
        public static final long b = Long.MIN_VALUE;
        public long c = 0;
        public a d;

        private void c() {
            if (this.d == null) {
                this.d = new a();
            }
        }

        public void a(int i) {
            if (i >= 64) {
                a aVar = this.d;
                if (aVar != null) {
                    aVar.a(i - 64);
                    return;
                }
                return;
            }
            this.c &= ~(1 << i);
        }

        public int b(int i) {
            a aVar = this.d;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.c);
                }
                return Long.bitCount(this.c & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.c & ((1 << i) - 1));
            } else {
                return Long.bitCount(this.c) + aVar.b(i - 64);
            }
        }

        public boolean d(int i) {
            if (i < 64) {
                return (this.c & (1 << i)) != 0;
            }
            c();
            return this.d.d(i - 64);
        }

        public void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.d.e(i - 64, z);
                return;
            }
            long j = this.c;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.c = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (z2 || this.d != null) {
                c();
                this.d.e(0, z2);
            }
        }

        public boolean f(int i) {
            if (i >= 64) {
                c();
                return this.d.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.c;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.c = j3;
            long j4 = j - 1;
            this.c = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.d;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.d.f(0);
            }
            return z;
        }

        public void g() {
            this.c = 0L;
            a aVar = this.d;
            if (aVar != null) {
                aVar.g();
            }
        }

        public void h(int i) {
            if (i >= 64) {
                c();
                this.d.h(i - 64);
                return;
            }
            this.c |= 1 << i;
        }

        public String toString() {
            if (this.d == null) {
                return Long.toBinaryString(this.c);
            }
            return this.d.toString() + "xx" + Long.toBinaryString(this.c);
        }
    }

    /* compiled from: ChildHelper.java */
    /* loaded from: classes.dex */
    public interface b {
        View a(int i);

        void addView(View view, int i);

        void b(View view);

        int c();

        void d();

        int e(View view);

        RecyclerView.f0 f(View view);

        void g(int i);

        void h(View view);

        void i(int i);

        void j(View view, int i, ViewGroup.LayoutParams layoutParams);
    }

    public v20(b bVar) {
        this.c = bVar;
    }

    private int h(int i) {
        if (i < 0) {
            return -1;
        }
        int c = this.c.c();
        int i2 = i;
        while (i2 < c) {
            int b2 = i - (i2 - this.d.b(i2));
            if (b2 == 0) {
                while (this.d.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    private void l(View view) {
        this.e.add(view);
        this.c.b(view);
    }

    private boolean t(View view) {
        if (this.e.remove(view)) {
            this.c.h(view);
            return true;
        }
        return false;
    }

    public void a(View view, int i, boolean z) {
        int h;
        if (i < 0) {
            h = this.c.c();
        } else {
            h = h(i);
        }
        this.d.e(h, z);
        if (z) {
            l(view);
        }
        this.c.addView(view, h);
    }

    public void b(View view, boolean z) {
        a(view, -1, z);
    }

    public void c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int h;
        if (i < 0) {
            h = this.c.c();
        } else {
            h = h(i);
        }
        this.d.e(h, z);
        if (z) {
            l(view);
        }
        this.c.j(view, h, layoutParams);
    }

    public void d(int i) {
        int h = h(i);
        this.d.f(h);
        this.c.g(h);
    }

    public View e(int i) {
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.e.get(i2);
            RecyclerView.f0 f = this.c.f(view);
            if (f.m() == i && !f.u() && !f.w()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i) {
        return this.c.a(h(i));
    }

    public int g() {
        return this.c.c() - this.e.size();
    }

    public View i(int i) {
        return this.c.a(i);
    }

    public int j() {
        return this.c.c();
    }

    public void k(View view) {
        int e = this.c.e(view);
        if (e >= 0) {
            this.d.h(e);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public int m(View view) {
        int e = this.c.e(view);
        if (e == -1 || this.d.d(e)) {
            return -1;
        }
        return e - this.d.b(e);
    }

    public boolean n(View view) {
        return this.e.contains(view);
    }

    public void o() {
        this.d.g();
        for (int size = this.e.size() - 1; size >= 0; size--) {
            this.c.h(this.e.get(size));
            this.e.remove(size);
        }
        this.c.d();
    }

    public void p(View view) {
        int e = this.c.e(view);
        if (e < 0) {
            return;
        }
        if (this.d.f(e)) {
            t(view);
        }
        this.c.i(e);
    }

    public void q(int i) {
        int h = h(i);
        View a2 = this.c.a(h);
        if (a2 == null) {
            return;
        }
        if (this.d.f(h)) {
            t(a2);
        }
        this.c.i(h);
    }

    public boolean r(View view) {
        int e = this.c.e(view);
        if (e == -1) {
            t(view);
            return true;
        } else if (this.d.d(e)) {
            this.d.f(e);
            t(view);
            this.c.i(e);
            return true;
        } else {
            return false;
        }
    }

    public void s(View view) {
        int e = this.c.e(view);
        if (e >= 0) {
            if (this.d.d(e)) {
                this.d.a(e);
                t(view);
                return;
            }
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public String toString() {
        return this.d.toString() + ", hidden list:" + this.e.size();
    }
}