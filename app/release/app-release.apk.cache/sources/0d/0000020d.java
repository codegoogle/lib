package androidx.lifecycle;

import com.p7700g.p99005.h5;
import com.p7700g.p99005.l5;
import com.p7700g.p99005.mz;
import com.p7700g.p99005.oz;
import com.p7700g.p99005.qz;
import com.p7700g.p99005.u1;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.yz;
import com.p7700g.p99005.z1;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class LiveData<T> {
    public static final int a = -1;
    public static final Object b = new Object();
    public final Object c;
    private l5<yz<? super T>, LiveData<T>.c> d;
    public int e;
    private boolean f;
    private volatile Object g;
    public volatile Object h;
    private int i;
    private boolean j;
    private boolean k;
    private final Runnable l;

    /* loaded from: classes.dex */
    public class LifecycleBoundObserver extends LiveData<T>.c implements oz {
        @x1
        public final qz w;

        public LifecycleBoundObserver(@x1 qz qzVar, yz<? super T> yzVar) {
            super(yzVar);
            this.w = qzVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public void f() {
            this.w.getLifecycle().c(this);
        }

        @Override // com.p7700g.p99005.oz
        public void i(@x1 qz qzVar, @x1 mz.b bVar) {
            mz.c b = this.w.getLifecycle().b();
            if (b == mz.c.DESTROYED) {
                LiveData.this.o(this.s);
                return;
            }
            mz.c cVar = null;
            while (cVar != b) {
                e(k());
                cVar = b;
                b = this.w.getLifecycle().b();
            }
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean j(qz qzVar) {
            return this.w == qzVar;
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return this.w.getLifecycle().b().a(mz.c.STARTED);
        }
    }

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.c) {
                obj = LiveData.this.h;
                LiveData.this.h = LiveData.b;
            }
            LiveData.this.q(obj);
        }
    }

    /* loaded from: classes.dex */
    public class b extends LiveData<T>.c {
        public b(yz<? super T> yzVar) {
            super(yzVar);
        }

        @Override // androidx.lifecycle.LiveData.c
        public boolean k() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    public abstract class c {
        public final yz<? super T> s;
        public boolean t;
        public int u = -1;

        public c(yz<? super T> yzVar) {
            this.s = yzVar;
        }

        public void e(boolean z) {
            if (z == this.t) {
                return;
            }
            this.t = z;
            LiveData.this.c(z ? 1 : -1);
            if (this.t) {
                LiveData.this.e(this);
            }
        }

        public void f() {
        }

        public boolean j(qz qzVar) {
            return false;
        }

        public abstract boolean k();
    }

    public LiveData(T t) {
        this.c = new Object();
        this.d = new l5<>();
        this.e = 0;
        this.h = b;
        this.l = new a();
        this.g = t;
        this.i = 0;
    }

    public static void b(String str) {
        if (!h5.f().c()) {
            throw new IllegalStateException(wo1.u("Cannot invoke ", str, " on a background thread"));
        }
    }

    private void d(LiveData<T>.c cVar) {
        if (cVar.t) {
            if (!cVar.k()) {
                cVar.e(false);
                return;
            }
            int i = cVar.u;
            int i2 = this.i;
            if (i >= i2) {
                return;
            }
            cVar.u = i2;
            cVar.s.a((Object) this.g);
        }
    }

    @u1
    public void c(int i) {
        int i2 = this.e;
        this.e = i + i2;
        if (this.f) {
            return;
        }
        this.f = true;
        while (true) {
            try {
                int i3 = this.e;
                if (i2 == i3) {
                    return;
                }
                boolean z = i2 == 0 && i3 > 0;
                boolean z2 = i2 > 0 && i3 == 0;
                if (z) {
                    l();
                } else if (z2) {
                    m();
                }
                i2 = i3;
            } finally {
                this.f = false;
            }
        }
    }

    public void e(@z1 LiveData<T>.c cVar) {
        if (this.j) {
            this.k = true;
            return;
        }
        this.j = true;
        do {
            this.k = false;
            if (cVar != null) {
                d(cVar);
                cVar = null;
            } else {
                l5<yz<? super T>, LiveData<T>.c>.d c2 = this.d.c();
                while (c2.hasNext()) {
                    d((c) c2.next().getValue());
                    if (this.k) {
                        break;
                    }
                }
            }
        } while (this.k);
        this.j = false;
    }

    @z1
    public T f() {
        T t = (T) this.g;
        if (t != b) {
            return t;
        }
        return null;
    }

    public int g() {
        return this.i;
    }

    public boolean h() {
        return this.e > 0;
    }

    public boolean i() {
        return this.d.size() > 0;
    }

    @u1
    public void j(@x1 qz qzVar, @x1 yz<? super T> yzVar) {
        b("observe");
        if (qzVar.getLifecycle().b() == mz.c.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(qzVar, yzVar);
        LiveData<T>.c f = this.d.f(yzVar, lifecycleBoundObserver);
        if (f != null && !f.j(qzVar)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (f != null) {
            return;
        }
        qzVar.getLifecycle().a(lifecycleBoundObserver);
    }

    @u1
    public void k(@x1 yz<? super T> yzVar) {
        b("observeForever");
        b bVar = new b(yzVar);
        LiveData<T>.c f = this.d.f(yzVar, bVar);
        if (f instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (f != null) {
            return;
        }
        bVar.e(true);
    }

    public void l() {
    }

    public void m() {
    }

    public void n(T t) {
        boolean z;
        synchronized (this.c) {
            z = this.h == b;
            this.h = t;
        }
        if (z) {
            h5.f().d(this.l);
        }
    }

    @u1
    public void o(@x1 yz<? super T> yzVar) {
        b("removeObserver");
        LiveData<T>.c g = this.d.g(yzVar);
        if (g == null) {
            return;
        }
        g.f();
        g.e(false);
    }

    @u1
    public void p(@x1 qz qzVar) {
        b("removeObservers");
        Iterator<Map.Entry<yz<? super T>, LiveData<T>.c>> it = this.d.iterator();
        while (it.hasNext()) {
            Map.Entry<yz<? super T>, LiveData<T>.c> next = it.next();
            if (next.getValue().j(qzVar)) {
                o(next.getKey());
            }
        }
    }

    @u1
    public void q(T t) {
        b("setValue");
        this.i++;
        this.g = t;
        e(null);
    }

    public LiveData() {
        this.c = new Object();
        this.d = new l5<>();
        this.e = 0;
        Object obj = b;
        this.h = obj;
        this.l = new a();
        this.g = obj;
        this.i = -1;
    }
}