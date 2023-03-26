package com.p7700g.p99005;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.p7700g.p99005.t30;
import com.p7700g.p99005.u30;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MessageThreadUtil.java */
/* loaded from: classes.dex */
public class j30<T> implements t30<T> {

    /* compiled from: MessageThreadUtil.java */
    /* loaded from: classes.dex */
    public class a implements t30.b<T> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public final c d = new c();
        private final Handler e = new Handler(Looper.getMainLooper());
        private Runnable f = new RunnableC0198a();
        public final /* synthetic */ t30.b g;

        /* compiled from: MessageThreadUtil.java */
        /* renamed from: com.p7700g.p99005.j30$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0198a implements Runnable {
            public RunnableC0198a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d a = a.this.d.a();
                while (a != null) {
                    int i = a.d;
                    if (i == 1) {
                        a.this.g.c(a.e, a.f);
                    } else if (i == 2) {
                        a.this.g.a(a.e, (u30.a) a.j);
                    } else if (i == 3) {
                        a.this.g.b(a.e, a.f);
                    }
                    a = a.this.d.a();
                }
            }
        }

        public a(t30.b bVar) {
            this.g = bVar;
        }

        private void d(d dVar) {
            this.d.c(dVar);
            this.e.post(this.f);
        }

        @Override // com.p7700g.p99005.t30.b
        public void a(int i, u30.a<T> aVar) {
            d(d.c(2, i, aVar));
        }

        @Override // com.p7700g.p99005.t30.b
        public void b(int i, int i2) {
            d(d.a(3, i, i2));
        }

        @Override // com.p7700g.p99005.t30.b
        public void c(int i, int i2) {
            d(d.a(1, i, i2));
        }
    }

    /* compiled from: MessageThreadUtil.java */
    /* loaded from: classes.dex */
    public class b implements t30.a<T> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public final c e = new c();
        private final Executor f = AsyncTask.THREAD_POOL_EXECUTOR;
        public AtomicBoolean g = new AtomicBoolean(false);
        private Runnable h = new a();
        public final /* synthetic */ t30.a i;

        /* compiled from: MessageThreadUtil.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    d a = b.this.e.a();
                    if (a == null) {
                        b.this.g.set(false);
                        return;
                    }
                    int i = a.d;
                    if (i == 1) {
                        b.this.e.b(1);
                        b.this.i.d(a.e);
                    } else if (i == 2) {
                        b.this.e.b(2);
                        b.this.e.b(3);
                        b.this.i.a(a.e, a.f, a.g, a.h, a.i);
                    } else if (i == 3) {
                        b.this.i.c(a.e, a.f);
                    } else if (i == 4) {
                        b.this.i.b((u30.a) a.j);
                    }
                }
            }
        }

        public b(t30.a aVar) {
            this.i = aVar;
        }

        private void e() {
            if (this.g.compareAndSet(false, true)) {
                this.f.execute(this.h);
            }
        }

        private void f(d dVar) {
            this.e.c(dVar);
            e();
        }

        private void g(d dVar) {
            this.e.d(dVar);
            e();
        }

        @Override // com.p7700g.p99005.t30.a
        public void a(int i, int i2, int i3, int i4, int i5) {
            g(d.b(2, i, i2, i3, i4, i5, null));
        }

        @Override // com.p7700g.p99005.t30.a
        public void b(u30.a<T> aVar) {
            f(d.c(4, 0, aVar));
        }

        @Override // com.p7700g.p99005.t30.a
        public void c(int i, int i2) {
            f(d.a(3, i, i2));
        }

        @Override // com.p7700g.p99005.t30.a
        public void d(int i) {
            g(d.c(1, i, null));
        }
    }

    /* compiled from: MessageThreadUtil.java */
    /* loaded from: classes.dex */
    public static class c {
        private d a;

        public synchronized d a() {
            d dVar = this.a;
            if (dVar == null) {
                return null;
            }
            this.a = dVar.c;
            return dVar;
        }

        public synchronized void b(int i) {
            d dVar;
            while (true) {
                dVar = this.a;
                if (dVar == null || dVar.d != i) {
                    break;
                }
                this.a = dVar.c;
                dVar.d();
            }
            if (dVar != null) {
                d dVar2 = dVar.c;
                while (dVar2 != null) {
                    d dVar3 = dVar2.c;
                    if (dVar2.d == i) {
                        dVar.c = dVar3;
                        dVar2.d();
                    } else {
                        dVar = dVar2;
                    }
                    dVar2 = dVar3;
                }
            }
        }

        public synchronized void c(d dVar) {
            d dVar2 = this.a;
            if (dVar2 == null) {
                this.a = dVar;
                return;
            }
            while (true) {
                d dVar3 = dVar2.c;
                if (dVar3 == null) {
                    dVar2.c = dVar;
                    return;
                }
                dVar2 = dVar3;
            }
        }

        public synchronized void d(d dVar) {
            dVar.c = this.a;
            this.a = dVar;
        }
    }

    /* compiled from: MessageThreadUtil.java */
    /* loaded from: classes.dex */
    public static class d {
        private static d a;
        private static final Object b = new Object();
        public d c;
        public int d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        public Object j;

        public static d a(int i, int i2, int i3) {
            return b(i, i2, i3, 0, 0, 0, null);
        }

        public static d b(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            d dVar;
            synchronized (b) {
                dVar = a;
                if (dVar == null) {
                    dVar = new d();
                } else {
                    a = dVar.c;
                    dVar.c = null;
                }
                dVar.d = i;
                dVar.e = i2;
                dVar.f = i3;
                dVar.g = i4;
                dVar.h = i5;
                dVar.i = i6;
                dVar.j = obj;
            }
            return dVar;
        }

        public static d c(int i, int i2, Object obj) {
            return b(i, i2, 0, 0, 0, 0, obj);
        }

        public void d() {
            this.c = null;
            this.i = 0;
            this.h = 0;
            this.g = 0;
            this.f = 0;
            this.e = 0;
            this.d = 0;
            this.j = null;
            synchronized (b) {
                d dVar = a;
                if (dVar != null) {
                    this.c = dVar;
                }
                a = this;
            }
        }
    }

    @Override // com.p7700g.p99005.t30
    public t30.a<T> a(t30.a<T> aVar) {
        return new b(aVar);
    }

    @Override // com.p7700g.p99005.t30
    public t30.b<T> b(t30.b<T> bVar) {
        return new a(bVar);
    }
}