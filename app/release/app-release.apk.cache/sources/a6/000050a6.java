package com.p7700g.p99005;

import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.fb0;
import com.p7700g.p99005.li2;
import java.lang.ref.WeakReference;

/* compiled from: TabLayoutMediator.java */
/* loaded from: classes3.dex */
public final class mi2 {
    @x1
    private final li2 a;
    @x1
    private final fb0 b;
    private final boolean c;
    private final boolean d;
    private final b e;
    @z1
    private RecyclerView.g<?> f;
    private boolean g;
    @z1
    private c h;
    @z1
    private li2.f i;
    @z1
    private RecyclerView.i j;

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes3.dex */
    public class a extends RecyclerView.i {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            mi2.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void b(int i, int i2) {
            mi2.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void c(int i, int i2, @z1 Object obj) {
            mi2.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void d(int i, int i2) {
            mi2.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void e(int i, int i2, int i3) {
            mi2.this.d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void f(int i, int i2) {
            mi2.this.d();
        }
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(@x1 li2.i iVar, int i);
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes3.dex */
    public static class c extends fb0.j {
        @x1
        private final WeakReference<li2> a;
        private int b;
        private int c;

        public c(li2 li2Var) {
            this.a = new WeakReference<>(li2Var);
            d();
        }

        @Override // com.p7700g.p99005.fb0.j
        public void a(int i) {
            this.b = this.c;
            this.c = i;
        }

        @Override // com.p7700g.p99005.fb0.j
        public void b(int i, float f, int i2) {
            li2 li2Var = this.a.get();
            if (li2Var != null) {
                int i3 = this.c;
                boolean z = false;
                li2Var.R(i, f, i3 != 2 || this.b == 1, (i3 == 2 && this.b == 0) ? true : true);
            }
        }

        @Override // com.p7700g.p99005.fb0.j
        public void c(int i) {
            li2 li2Var = this.a.get();
            if (li2Var == null || li2Var.getSelectedTabPosition() == i || i >= li2Var.getTabCount()) {
                return;
            }
            int i2 = this.c;
            li2Var.O(li2Var.z(i), i2 == 0 || (i2 == 2 && this.b == 0));
        }

        public void d() {
            this.c = 0;
            this.b = 0;
        }
    }

    /* compiled from: TabLayoutMediator.java */
    /* loaded from: classes3.dex */
    public static class d implements li2.f {
        private final fb0 a;
        private final boolean b;

        public d(fb0 fb0Var, boolean z) {
            this.a = fb0Var;
            this.b = z;
        }

        @Override // com.p7700g.p99005.li2.c
        public void a(li2.i iVar) {
        }

        @Override // com.p7700g.p99005.li2.c
        public void b(@x1 li2.i iVar) {
            this.a.s(iVar.k(), this.b);
        }

        @Override // com.p7700g.p99005.li2.c
        public void c(li2.i iVar) {
        }
    }

    public mi2(@x1 li2 li2Var, @x1 fb0 fb0Var, @x1 b bVar) {
        this(li2Var, fb0Var, true, bVar);
    }

    public void a() {
        if (!this.g) {
            RecyclerView.g<?> adapter = this.b.getAdapter();
            this.f = adapter;
            if (adapter != null) {
                this.g = true;
                c cVar = new c(this.a);
                this.h = cVar;
                this.b.n(cVar);
                d dVar = new d(this.b, this.d);
                this.i = dVar;
                this.a.d(dVar);
                if (this.c) {
                    a aVar = new a();
                    this.j = aVar;
                    this.f.C(aVar);
                }
                d();
                this.a.Q(this.b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    public void b() {
        RecyclerView.g<?> gVar;
        if (this.c && (gVar = this.f) != null) {
            gVar.E(this.j);
            this.j = null;
        }
        this.a.J(this.i);
        this.b.x(this.h);
        this.i = null;
        this.h = null;
        this.f = null;
        this.g = false;
    }

    public boolean c() {
        return this.g;
    }

    public void d() {
        this.a.H();
        RecyclerView.g<?> gVar = this.f;
        if (gVar != null) {
            int e = gVar.e();
            for (int i = 0; i < e; i++) {
                li2.i E = this.a.E();
                this.e.a(E, i);
                this.a.h(E, false);
            }
            if (e > 0) {
                int min = Math.min(this.b.getCurrentItem(), this.a.getTabCount() - 1);
                if (min != this.a.getSelectedTabPosition()) {
                    li2 li2Var = this.a;
                    li2Var.N(li2Var.z(min));
                }
            }
        }
    }

    public mi2(@x1 li2 li2Var, @x1 fb0 fb0Var, boolean z, @x1 b bVar) {
        this(li2Var, fb0Var, z, true, bVar);
    }

    public mi2(@x1 li2 li2Var, @x1 fb0 fb0Var, boolean z, boolean z2, @x1 b bVar) {
        this.a = li2Var;
        this.b = fb0Var;
        this.c = z;
        this.d = z2;
        this.e = bVar;
    }
}