package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import com.p7700g.p99005.r20;
import com.p7700g.p99005.x20;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: AsyncListDiffer.java */
/* loaded from: classes.dex */
public class s20<T> {
    private static final Executor a = new c();
    private final i30 b;
    public final r20<T> c;
    public Executor d;
    private final List<b<T>> e;
    @z1
    private List<T> f;
    @x1
    private List<T> g;
    public int h;

    /* compiled from: AsyncListDiffer.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ List s;
        public final /* synthetic */ List t;
        public final /* synthetic */ int u;
        public final /* synthetic */ Runnable v;

        /* compiled from: AsyncListDiffer.java */
        /* renamed from: com.p7700g.p99005.s20$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class C0240a extends x20.b {
            public C0240a() {
            }

            @Override // com.p7700g.p99005.x20.b
            public boolean a(int i, int i2) {
                Object obj = a.this.s.get(i);
                Object obj2 = a.this.t.get(i2);
                if (obj == null || obj2 == null) {
                    if (obj == null && obj2 == null) {
                        return true;
                    }
                    throw new AssertionError();
                }
                return s20.this.c.b().a(obj, obj2);
            }

            @Override // com.p7700g.p99005.x20.b
            public boolean b(int i, int i2) {
                Object obj = a.this.s.get(i);
                Object obj2 = a.this.t.get(i2);
                if (obj == null || obj2 == null) {
                    return obj == null && obj2 == null;
                }
                return s20.this.c.b().b(obj, obj2);
            }

            @Override // com.p7700g.p99005.x20.b
            @z1
            public Object c(int i, int i2) {
                Object obj = a.this.s.get(i);
                Object obj2 = a.this.t.get(i2);
                if (obj != null && obj2 != null) {
                    return s20.this.c.b().c(obj, obj2);
                }
                throw new AssertionError();
            }

            @Override // com.p7700g.p99005.x20.b
            public int d() {
                return a.this.t.size();
            }

            @Override // com.p7700g.p99005.x20.b
            public int e() {
                return a.this.s.size();
            }
        }

        /* compiled from: AsyncListDiffer.java */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            public final /* synthetic */ x20.c s;

            public b(x20.c cVar) {
                this.s = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                s20 s20Var = s20.this;
                if (s20Var.h == aVar.u) {
                    s20Var.c(aVar.t, this.s, aVar.v);
                }
            }
        }

        public a(List list, List list2, int i, Runnable runnable) {
            this.s = list;
            this.t = list2;
            this.u = i;
            this.v = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            s20.this.d.execute(new b(x20.a(new C0240a())));
        }
    }

    /* compiled from: AsyncListDiffer.java */
    /* loaded from: classes.dex */
    public interface b<T> {
        void a(@x1 List<T> list, @x1 List<T> list2);
    }

    /* compiled from: AsyncListDiffer.java */
    /* loaded from: classes.dex */
    public static class c implements Executor {
        public final Handler s = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public void execute(@x1 Runnable runnable) {
            this.s.post(runnable);
        }
    }

    public s20(@x1 RecyclerView.g gVar, @x1 x20.d<T> dVar) {
        this(new q20(gVar), new r20.a(dVar).a());
    }

    private void d(@x1 List<T> list, @z1 Runnable runnable) {
        for (b<T> bVar : this.e) {
            bVar.a(list, this.g);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(@x1 b<T> bVar) {
        this.e.add(bVar);
    }

    @x1
    public List<T> b() {
        return this.g;
    }

    public void c(@x1 List<T> list, @x1 x20.c cVar, @z1 Runnable runnable) {
        List<T> list2 = this.g;
        this.f = list;
        this.g = Collections.unmodifiableList(list);
        cVar.f(this.b);
        d(list2, runnable);
    }

    public void e(@x1 b<T> bVar) {
        this.e.remove(bVar);
    }

    public void f(@z1 List<T> list) {
        g(list, null);
    }

    public void g(@z1 List<T> list, @z1 Runnable runnable) {
        int i = this.h + 1;
        this.h = i;
        List<T> list2 = this.f;
        if (list == list2) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        List<T> list3 = this.g;
        if (list == null) {
            int size = list2.size();
            this.f = null;
            this.g = Collections.emptyList();
            this.b.d(0, size);
            d(list3, runnable);
        } else if (list2 == null) {
            this.f = list;
            this.g = Collections.unmodifiableList(list);
            this.b.b(0, list.size());
            d(list3, runnable);
        } else {
            this.c.a().execute(new a(list2, list, i, runnable));
        }
    }

    public s20(@x1 i30 i30Var, @x1 r20<T> r20Var) {
        this.e = new CopyOnWriteArrayList();
        this.g = Collections.emptyList();
        this.b = i30Var;
        this.c = r20Var;
        if (r20Var.c() != null) {
            this.d = r20Var.c();
        } else {
            this.d = a;
        }
    }
}