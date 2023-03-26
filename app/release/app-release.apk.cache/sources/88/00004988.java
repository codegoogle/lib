package com.p7700g.p99005;

import androidx.lifecycle.LiveData;

/* compiled from: Transformations.java */
/* loaded from: classes.dex */
public class j00 {

    /* compiled from: Transformations.java */
    /* loaded from: classes.dex */
    public static class a implements yz<X> {
        public final /* synthetic */ vz a;
        public final /* synthetic */ m5 b;

        public a(vz vzVar, m5 m5Var) {
            this.a = vzVar;
            this.b = m5Var;
        }

        @Override // com.p7700g.p99005.yz
        public void a(@z1 X x) {
            this.a.q(this.b.apply(x));
        }
    }

    /* compiled from: Transformations.java */
    /* loaded from: classes.dex */
    public static class b implements yz<X> {
        public LiveData<Y> a;
        public final /* synthetic */ m5 b;
        public final /* synthetic */ vz c;

        /* compiled from: Transformations.java */
        /* loaded from: classes.dex */
        public class a implements yz<Y> {
            public a() {
            }

            @Override // com.p7700g.p99005.yz
            public void a(@z1 Y y) {
                b.this.c.q(y);
            }
        }

        public b(m5 m5Var, vz vzVar) {
            this.b = m5Var;
            this.c = vzVar;
        }

        @Override // com.p7700g.p99005.yz
        public void a(@z1 X x) {
            LiveData<Y> liveData = (LiveData) this.b.apply(x);
            Object obj = this.a;
            if (obj == liveData) {
                return;
            }
            if (obj != null) {
                this.c.s(obj);
            }
            this.a = liveData;
            if (liveData != 0) {
                this.c.r(liveData, new a());
            }
        }
    }

    /* compiled from: Transformations.java */
    /* loaded from: classes.dex */
    public static class c implements yz<X> {
        public boolean a = true;
        public final /* synthetic */ vz b;

        public c(vz vzVar) {
            this.b = vzVar;
        }

        @Override // com.p7700g.p99005.yz
        public void a(X x) {
            T f = this.b.f();
            if (this.a || ((f == 0 && x != 0) || !(f == 0 || f.equals(x)))) {
                this.a = false;
                this.b.q(x);
            }
        }
    }

    private j00() {
    }

    @x1
    @u1
    public static <X> LiveData<X> a(@x1 LiveData<X> liveData) {
        vz vzVar = new vz();
        vzVar.r(liveData, new c(vzVar));
        return vzVar;
    }

    @x1
    @u1
    public static <X, Y> LiveData<Y> b(@x1 LiveData<X> liveData, @x1 m5<X, Y> m5Var) {
        vz vzVar = new vz();
        vzVar.r(liveData, new a(vzVar, m5Var));
        return vzVar;
    }

    @x1
    @u1
    public static <X, Y> LiveData<Y> c(@x1 LiveData<X> liveData, @x1 m5<X, LiveData<Y>> m5Var) {
        vz vzVar = new vz();
        vzVar.r(liveData, new b(m5Var, vzVar));
        return vzVar;
    }
}