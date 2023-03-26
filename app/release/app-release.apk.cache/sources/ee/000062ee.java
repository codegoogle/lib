package com.p7700g.p99005;

import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.ip;

/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
public class w30 {
    private static final boolean a = false;
    @r2
    public final y7<RecyclerView.f0, a> b = new y7<>();
    @r2
    public final v7<RecyclerView.f0> c = new v7<>();

    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public static class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 4;
        public static final int d = 8;
        public static final int e = 3;
        public static final int f = 12;
        public static final int g = 14;
        public static ip.a<a> h = new ip.b(20);
        public int i;
        @z1
        public RecyclerView.l.d j;
        @z1
        public RecyclerView.l.d k;

        private a() {
        }

        public static void a() {
            do {
            } while (h.b() != null);
        }

        public static a b() {
            a b2 = h.b();
            return b2 == null ? new a() : b2;
        }

        public static void c(a aVar) {
            aVar.i = 0;
            aVar.j = null;
            aVar.k = null;
            h.a(aVar);
        }
    }

    /* compiled from: ViewInfoStore.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(RecyclerView.f0 f0Var);

        void b(RecyclerView.f0 f0Var, @z1 RecyclerView.l.d dVar, RecyclerView.l.d dVar2);

        void c(RecyclerView.f0 f0Var, @x1 RecyclerView.l.d dVar, @z1 RecyclerView.l.d dVar2);

        void d(RecyclerView.f0 f0Var, @x1 RecyclerView.l.d dVar, @x1 RecyclerView.l.d dVar2);
    }

    private RecyclerView.l.d l(RecyclerView.f0 f0Var, int i) {
        a r;
        RecyclerView.l.d dVar;
        int k = this.b.k(f0Var);
        if (k >= 0 && (r = this.b.r(k)) != null) {
            int i2 = r.i;
            if ((i2 & i) != 0) {
                int i3 = (~i) & i2;
                r.i = i3;
                if (i == 4) {
                    dVar = r.j;
                } else if (i == 8) {
                    dVar = r.k;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.b.p(k);
                    a.c(r);
                }
                return dVar;
            }
        }
        return null;
    }

    public void a(RecyclerView.f0 f0Var, RecyclerView.l.d dVar) {
        a aVar = this.b.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.b.put(f0Var, aVar);
        }
        aVar.i |= 2;
        aVar.j = dVar;
    }

    public void b(RecyclerView.f0 f0Var) {
        a aVar = this.b.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.b.put(f0Var, aVar);
        }
        aVar.i |= 1;
    }

    public void c(long j, RecyclerView.f0 f0Var) {
        this.c.u(j, f0Var);
    }

    public void d(RecyclerView.f0 f0Var, RecyclerView.l.d dVar) {
        a aVar = this.b.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.b.put(f0Var, aVar);
        }
        aVar.k = dVar;
        aVar.i |= 8;
    }

    public void e(RecyclerView.f0 f0Var, RecyclerView.l.d dVar) {
        a aVar = this.b.get(f0Var);
        if (aVar == null) {
            aVar = a.b();
            this.b.put(f0Var, aVar);
        }
        aVar.j = dVar;
        aVar.i |= 4;
    }

    public void f() {
        this.b.clear();
        this.c.b();
    }

    public RecyclerView.f0 g(long j) {
        return this.c.h(j);
    }

    public boolean h(RecyclerView.f0 f0Var) {
        a aVar = this.b.get(f0Var);
        return (aVar == null || (aVar.i & 1) == 0) ? false : true;
    }

    public boolean i(RecyclerView.f0 f0Var) {
        a aVar = this.b.get(f0Var);
        return (aVar == null || (aVar.i & 4) == 0) ? false : true;
    }

    public void j() {
        a.a();
    }

    public void k(RecyclerView.f0 f0Var) {
        p(f0Var);
    }

    @z1
    public RecyclerView.l.d m(RecyclerView.f0 f0Var) {
        return l(f0Var, 8);
    }

    @z1
    public RecyclerView.l.d n(RecyclerView.f0 f0Var) {
        return l(f0Var, 4);
    }

    public void o(b bVar) {
        for (int size = this.b.size() - 1; size >= 0; size--) {
            RecyclerView.f0 n = this.b.n(size);
            a p = this.b.p(size);
            int i = p.i;
            if ((i & 3) == 3) {
                bVar.a(n);
            } else if ((i & 1) != 0) {
                RecyclerView.l.d dVar = p.j;
                if (dVar == null) {
                    bVar.a(n);
                } else {
                    bVar.c(n, dVar, p.k);
                }
            } else if ((i & 14) == 14) {
                bVar.b(n, p.j, p.k);
            } else if ((i & 12) == 12) {
                bVar.d(n, p.j, p.k);
            } else if ((i & 4) != 0) {
                bVar.c(n, p.j, null);
            } else if ((i & 8) != 0) {
                bVar.b(n, p.j, p.k);
            }
            a.c(p);
        }
    }

    public void p(RecyclerView.f0 f0Var) {
        a aVar = this.b.get(f0Var);
        if (aVar == null) {
            return;
        }
        aVar.i &= -2;
    }

    public void q(RecyclerView.f0 f0Var) {
        int H = this.c.H() - 1;
        while (true) {
            if (H < 0) {
                break;
            } else if (f0Var == this.c.I(H)) {
                this.c.C(H);
                break;
            } else {
                H--;
            }
        }
        a remove = this.b.remove(f0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}