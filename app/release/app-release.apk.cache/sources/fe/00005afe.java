package com.p7700g.p99005;

import android.annotation.SuppressLint;
import androidx.lifecycle.Lifecycling;
import com.p7700g.p99005.mz;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: LifecycleRegistry.java */
/* loaded from: classes.dex */
public class rz extends mz {
    private k5<pz, a> b;
    private mz.c c;
    private final WeakReference<qz> d;
    private int e;
    private boolean f;
    private boolean g;
    private ArrayList<mz.c> h;
    private final boolean i;

    /* compiled from: LifecycleRegistry.java */
    /* loaded from: classes.dex */
    public static class a {
        public mz.c a;
        public oz b;

        public a(pz pzVar, mz.c cVar) {
            this.b = Lifecycling.g(pzVar);
            this.a = cVar;
        }

        public void a(qz qzVar, mz.b bVar) {
            mz.c f = bVar.f();
            this.a = rz.m(this.a, f);
            this.b.i(qzVar, bVar);
            this.a = f;
        }
    }

    public rz(@x1 qz qzVar) {
        this(qzVar, true);
    }

    private void d(qz qzVar) {
        Iterator<Map.Entry<pz, a>> descendingIterator = this.b.descendingIterator();
        while (descendingIterator.hasNext() && !this.g) {
            Map.Entry<pz, a> next = descendingIterator.next();
            a value = next.getValue();
            while (value.a.compareTo(this.c) > 0 && !this.g && this.b.contains(next.getKey())) {
                mz.b a2 = mz.b.a(value.a);
                if (a2 != null) {
                    p(a2.f());
                    value.a(qzVar, a2);
                    o();
                } else {
                    StringBuilder G = wo1.G("no event down from ");
                    G.append(value.a);
                    throw new IllegalStateException(G.toString());
                }
            }
        }
    }

    private mz.c e(pz pzVar) {
        Map.Entry<pz, a> h = this.b.h(pzVar);
        mz.c cVar = null;
        mz.c cVar2 = h != null ? h.getValue().a : null;
        if (!this.h.isEmpty()) {
            ArrayList<mz.c> arrayList = this.h;
            cVar = arrayList.get(arrayList.size() - 1);
        }
        return m(m(this.c, cVar2), cVar);
    }

    @x1
    @r2
    public static rz f(@x1 qz qzVar) {
        return new rz(qzVar, false);
    }

    @SuppressLint({"RestrictedApi"})
    private void g(String str) {
        if (this.i && !h5.f().c()) {
            throw new IllegalStateException(wo1.u("Method ", str, " must be called on the main thread"));
        }
    }

    private void h(qz qzVar) {
        l5<pz, a>.d c = this.b.c();
        while (c.hasNext() && !this.g) {
            Map.Entry next = c.next();
            a aVar = (a) next.getValue();
            while (aVar.a.compareTo(this.c) < 0 && !this.g && this.b.contains((pz) next.getKey())) {
                p(aVar.a);
                mz.b g = mz.b.g(aVar.a);
                if (g != null) {
                    aVar.a(qzVar, g);
                    o();
                } else {
                    StringBuilder G = wo1.G("no event up from ");
                    G.append(aVar.a);
                    throw new IllegalStateException(G.toString());
                }
            }
        }
    }

    private boolean k() {
        if (this.b.size() == 0) {
            return true;
        }
        mz.c cVar = this.b.a().getValue().a;
        mz.c cVar2 = this.b.d().getValue().a;
        return cVar == cVar2 && this.c == cVar2;
    }

    public static mz.c m(@x1 mz.c cVar, @z1 mz.c cVar2) {
        return (cVar2 == null || cVar2.compareTo(cVar) >= 0) ? cVar : cVar2;
    }

    private void n(mz.c cVar) {
        mz.c cVar2 = this.c;
        if (cVar2 == cVar) {
            return;
        }
        if (cVar2 == mz.c.INITIALIZED && cVar == mz.c.DESTROYED) {
            StringBuilder G = wo1.G("no event down from ");
            G.append(this.c);
            throw new IllegalStateException(G.toString());
        }
        this.c = cVar;
        if (!this.f && this.e == 0) {
            this.f = true;
            r();
            this.f = false;
            if (this.c == mz.c.DESTROYED) {
                this.b = new k5<>();
                return;
            }
            return;
        }
        this.g = true;
    }

    private void o() {
        ArrayList<mz.c> arrayList = this.h;
        arrayList.remove(arrayList.size() - 1);
    }

    private void p(mz.c cVar) {
        this.h.add(cVar);
    }

    private void r() {
        qz qzVar = this.d.get();
        if (qzVar != null) {
            while (!k()) {
                this.g = false;
                if (this.c.compareTo(this.b.a().getValue().a) < 0) {
                    d(qzVar);
                }
                Map.Entry<pz, a> d = this.b.d();
                if (!this.g && d != null && this.c.compareTo(d.getValue().a) > 0) {
                    h(qzVar);
                }
            }
            this.g = false;
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    @Override // com.p7700g.p99005.mz
    public void a(@x1 pz pzVar) {
        qz qzVar;
        g("addObserver");
        mz.c cVar = this.c;
        mz.c cVar2 = mz.c.DESTROYED;
        if (cVar != cVar2) {
            cVar2 = mz.c.INITIALIZED;
        }
        a aVar = new a(pzVar, cVar2);
        if (this.b.f(pzVar, aVar) == null && (qzVar = this.d.get()) != null) {
            boolean z = this.e != 0 || this.f;
            mz.c e = e(pzVar);
            this.e++;
            while (aVar.a.compareTo(e) < 0 && this.b.contains(pzVar)) {
                p(aVar.a);
                mz.b g = mz.b.g(aVar.a);
                if (g != null) {
                    aVar.a(qzVar, g);
                    o();
                    e = e(pzVar);
                } else {
                    StringBuilder G = wo1.G("no event up from ");
                    G.append(aVar.a);
                    throw new IllegalStateException(G.toString());
                }
            }
            if (!z) {
                r();
            }
            this.e--;
        }
    }

    @Override // com.p7700g.p99005.mz
    @x1
    public mz.c b() {
        return this.c;
    }

    @Override // com.p7700g.p99005.mz
    public void c(@x1 pz pzVar) {
        g("removeObserver");
        this.b.g(pzVar);
    }

    public int i() {
        g("getObserverCount");
        return this.b.size();
    }

    public void j(@x1 mz.b bVar) {
        g("handleLifecycleEvent");
        n(bVar.f());
    }

    @u1
    @Deprecated
    public void l(@x1 mz.c cVar) {
        g("markState");
        q(cVar);
    }

    @u1
    public void q(@x1 mz.c cVar) {
        g("setCurrentState");
        n(cVar);
    }

    private rz(@x1 qz qzVar, boolean z) {
        this.b = new k5<>();
        this.e = 0;
        this.f = false;
        this.g = false;
        this.h = new ArrayList<>();
        this.d = new WeakReference<>(qzVar);
        this.c = mz.c.INITIALIZED;
        this.i = z;
    }
}