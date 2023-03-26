package com.p7700g.p99005;

import com.p7700g.p99005.i2;
import java.util.concurrent.Executor;

/* compiled from: ArchTaskExecutor.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class h5 extends j5 {
    private static volatile h5 a;
    @x1
    private static final Executor b = new a();
    @x1
    private static final Executor c = new b();
    @x1
    private j5 d;
    @x1
    private j5 e;

    /* compiled from: ArchTaskExecutor.java */
    /* loaded from: classes.dex */
    public static class a implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            h5.f().d(runnable);
        }
    }

    /* compiled from: ArchTaskExecutor.java */
    /* loaded from: classes.dex */
    public static class b implements Executor {
        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            h5.f().a(runnable);
        }
    }

    private h5() {
        i5 i5Var = new i5();
        this.e = i5Var;
        this.d = i5Var;
    }

    @x1
    public static Executor e() {
        return c;
    }

    @x1
    public static h5 f() {
        if (a != null) {
            return a;
        }
        synchronized (h5.class) {
            if (a == null) {
                a = new h5();
            }
        }
        return a;
    }

    @x1
    public static Executor g() {
        return b;
    }

    @Override // com.p7700g.p99005.j5
    public void a(Runnable runnable) {
        this.d.a(runnable);
    }

    @Override // com.p7700g.p99005.j5
    public boolean c() {
        return this.d.c();
    }

    @Override // com.p7700g.p99005.j5
    public void d(Runnable runnable) {
        this.d.d(runnable);
    }

    public void h(@z1 j5 j5Var) {
        if (j5Var == null) {
            j5Var = this.e;
        }
        this.d = j5Var;
    }
}