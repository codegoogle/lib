package com.p7700g.p99005;

import android.graphics.drawable.Drawable;
import android.widget.AbsListView;
import java.util.List;
import java.util.Queue;

/* compiled from: ListPreloader.java */
/* loaded from: classes2.dex */
public class cp1<T> implements AbsListView.OnScrollListener {
    private final int a;
    private final d b;
    private final jp1 c;
    private final a<T> d;
    private final b<T> e;
    private int f;
    private int g;
    private int i;
    private int h = -1;
    private boolean j = true;

    /* compiled from: ListPreloader.java */
    /* loaded from: classes2.dex */
    public interface a<U> {
        @x1
        List<U> a(int i);

        @z1
        ip1<?> b(@x1 U u);
    }

    /* compiled from: ListPreloader.java */
    /* loaded from: classes2.dex */
    public interface b<T> {
        @z1
        int[] a(@x1 T t, int i, int i2);
    }

    /* compiled from: ListPreloader.java */
    /* loaded from: classes2.dex */
    public static final class c implements sz1<Object> {
        public int s;
        public int t;
        @z1
        private vy1 u;

        @Override // com.p7700g.p99005.sz1
        public void b(@x1 rz1 rz1Var) {
        }

        @Override // com.p7700g.p99005.sz1
        public void c(@x1 Object obj, @z1 a02<? super Object> a02Var) {
        }

        @Override // com.p7700g.p99005.sz1
        public void j(@z1 vy1 vy1Var) {
            this.u = vy1Var;
        }

        @Override // com.p7700g.p99005.sz1
        public void k(@z1 Drawable drawable) {
        }

        @Override // com.p7700g.p99005.sz1
        public void l(@z1 Drawable drawable) {
        }

        @Override // com.p7700g.p99005.sz1
        @z1
        public vy1 m() {
            return this.u;
        }

        @Override // com.p7700g.p99005.wx1
        public void onDestroy() {
        }

        @Override // com.p7700g.p99005.wx1
        public void onStart() {
        }

        @Override // com.p7700g.p99005.wx1
        public void onStop() {
        }

        @Override // com.p7700g.p99005.sz1
        public void p(@z1 Drawable drawable) {
        }

        @Override // com.p7700g.p99005.sz1
        public void q(@x1 rz1 rz1Var) {
            rz1Var.e(this.t, this.s);
        }
    }

    /* compiled from: ListPreloader.java */
    /* loaded from: classes2.dex */
    public static final class d {
        public final Queue<c> a;

        public d(int i) {
            this.a = z02.f(i);
            for (int i2 = 0; i2 < i; i2++) {
                this.a.offer(new c());
            }
        }

        public c a(int i, int i2) {
            c poll = this.a.poll();
            this.a.offer(poll);
            poll.t = i;
            poll.s = i2;
            return poll;
        }
    }

    public cp1(@x1 jp1 jp1Var, @x1 a<T> aVar, @x1 b<T> bVar, int i) {
        this.c = jp1Var;
        this.d = aVar;
        this.e = bVar;
        this.a = i;
        this.b = new d(i + 1);
    }

    private void a() {
        for (int i = 0; i < this.b.a.size(); i++) {
            this.c.z(this.b.a(0, 0));
        }
    }

    private void b(int i, int i2) {
        int min;
        int i3;
        if (i < i2) {
            i3 = Math.max(this.f, i);
            min = i2;
        } else {
            min = Math.min(this.g, i);
            i3 = i2;
        }
        int min2 = Math.min(this.i, min);
        int min3 = Math.min(this.i, Math.max(0, i3));
        if (i < i2) {
            for (int i4 = min3; i4 < min2; i4++) {
                d(this.d.a(i4), i4, true);
            }
        } else {
            for (int i5 = min2 - 1; i5 >= min3; i5--) {
                d(this.d.a(i5), i5, false);
            }
        }
        this.g = min3;
        this.f = min2;
    }

    private void c(int i, boolean z) {
        if (this.j != z) {
            this.j = z;
            a();
        }
        b(i, (z ? this.a : -this.a) + i);
    }

    private void d(List<T> list, int i, boolean z) {
        int size = list.size();
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                e(list.get(i2), i, i2);
            }
            return;
        }
        for (int i3 = size - 1; i3 >= 0; i3--) {
            e(list.get(i3), i, i3);
        }
    }

    private void e(@z1 T t, int i, int i2) {
        int[] a2;
        ip1<?> b2;
        if (t == null || (a2 = this.e.a(t, i, i2)) == null || (b2 = this.d.b(t)) == null) {
            return;
        }
        b2.A1(this.b.a(a2[0], a2[1]));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        this.i = i3;
        int i4 = this.h;
        if (i > i4) {
            c(i2 + i, true);
        } else if (i < i4) {
            c(i, false);
        }
        this.h = i;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}