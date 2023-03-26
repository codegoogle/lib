package com.p7700g.p99005;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker.java */
/* loaded from: classes.dex */
public final class a30 implements Runnable {
    public static final ThreadLocal<a30> s = new ThreadLocal<>();
    public static Comparator<c> t = new a();
    public long v;
    public long w;
    public ArrayList<RecyclerView> u = new ArrayList<>();
    private ArrayList<c> x = new ArrayList<>();

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public static class a implements Comparator<c> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.d;
            if ((recyclerView == null) != (cVar2.d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.a;
            if (z != cVar2.a) {
                return z ? -1 : 1;
            }
            int i = cVar2.b - cVar.b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.c - cVar2.c;
            if (i2 != 0) {
                return i2;
            }
            return 0;
        }
    }

    /* compiled from: GapWorker.java */
    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.o.c {
        public int a;
        public int b;
        public int[] c;
        public int d;

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 >= 0) {
                int i3 = this.d * 2;
                int[] iArr = this.c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[i3 * 2];
                    this.c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }

        public void b() {
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.d = 0;
        }

        public void c(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.L0;
            if (recyclerView.K0 == null || oVar == null || !oVar.I0()) {
                return;
            }
            if (z) {
                if (!recyclerView.C0.q()) {
                    oVar.s(recyclerView.K0.e(), this);
                }
            } else if (!recyclerView.B0()) {
                oVar.r(this.a, this.b, recyclerView.D1, this);
            }
            int i = this.d;
            if (i > oVar.m) {
                oVar.m = i;
                oVar.n = z;
                recyclerView.A0.L();
            }
        }

        public boolean d(int i) {
            if (this.c != null) {
                int i2 = this.d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    /* compiled from: GapWorker.java */
    /* loaded from: classes.dex */
    public static class c {
        public boolean a;
        public int b;
        public int c;
        public RecyclerView d;
        public int e;

        public void a() {
            this.a = false;
            this.b = 0;
            this.c = 0;
            this.d = null;
            this.e = 0;
        }
    }

    private void b() {
        c cVar;
        int size = this.u.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.u.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.C1.c(recyclerView, false);
                i += recyclerView.C1.d;
            }
        }
        this.x.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.u.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.C1;
                int abs = Math.abs(bVar.b) + Math.abs(bVar.a);
                for (int i5 = 0; i5 < bVar.d * 2; i5 += 2) {
                    if (i3 >= this.x.size()) {
                        cVar = new c();
                        this.x.add(cVar);
                    } else {
                        cVar = this.x.get(i3);
                    }
                    int[] iArr = bVar.c;
                    int i6 = iArr[i5 + 1];
                    cVar.a = i6 <= abs;
                    cVar.b = abs;
                    cVar.c = i6;
                    cVar.d = recyclerView2;
                    cVar.e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.x, t);
    }

    private void c(c cVar, long j) {
        RecyclerView.f0 i = i(cVar.d, cVar.e, cVar.a ? Long.MAX_VALUE : j);
        if (i == null || i.q == null || !i.t() || i.u()) {
            return;
        }
        h(i.q.get(), j);
    }

    private void d(long j) {
        for (int i = 0; i < this.x.size(); i++) {
            c cVar = this.x.get(i);
            if (cVar.d == null) {
                return;
            }
            c(cVar, j);
            cVar.a();
        }
    }

    public static boolean e(RecyclerView recyclerView, int i) {
        int j = recyclerView.D0.j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.f0 s0 = RecyclerView.s0(recyclerView.D0.i(i2));
            if (s0.r == i && !s0.u()) {
                return true;
            }
        }
        return false;
    }

    private void h(@z1 RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.c1 && recyclerView.D0.j() != 0) {
            recyclerView.m1();
        }
        b bVar = recyclerView.C1;
        bVar.c(recyclerView, true);
        if (bVar.d != 0) {
            try {
                in.b(RecyclerView.T);
                recyclerView.D1.k(recyclerView.K0);
                for (int i = 0; i < bVar.d * 2; i += 2) {
                    i(recyclerView, bVar.c[i], j);
                }
            } finally {
                in.d();
            }
        }
    }

    private RecyclerView.f0 i(RecyclerView recyclerView, int i, long j) {
        if (e(recyclerView, i)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.A0;
        try {
            recyclerView.Y0();
            RecyclerView.f0 J = wVar.J(i, false, j);
            if (J != null) {
                if (J.t() && !J.u()) {
                    wVar.C(J.p);
                } else {
                    wVar.a(J, false);
                }
            }
            return J;
        } finally {
            recyclerView.a1(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.u.add(recyclerView);
    }

    public void f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.v == 0) {
            this.v = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.C1.e(i, i2);
    }

    public void g(long j) {
        b();
        d(j);
    }

    public void j(RecyclerView recyclerView) {
        this.u.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            in.b(RecyclerView.S);
            if (!this.u.isEmpty()) {
                int size = this.u.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.u.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j) + this.w);
                }
            }
        } finally {
            this.v = 0L;
            in.d();
        }
    }
}