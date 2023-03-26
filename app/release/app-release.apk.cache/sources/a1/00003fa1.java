package com.p7700g.p99005;

import androidx.lifecycle.LiveData;
import com.p7700g.p99005.i2;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ComputableLiveData.java */
@i2({i2.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public abstract class dz<T> {
    public final Executor a;
    public final LiveData<T> b;
    public final AtomicBoolean c;
    public final AtomicBoolean d;
    @r2
    public final Runnable e;
    @r2
    public final Runnable f;

    /* compiled from: ComputableLiveData.java */
    /* loaded from: classes.dex */
    public class a extends LiveData<T> {
        public a() {
        }

        @Override // androidx.lifecycle.LiveData
        public void l() {
            dz dzVar = dz.this;
            dzVar.a.execute(dzVar.e);
        }
    }

    /* compiled from: ComputableLiveData.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @s2
        public void run() {
            do {
                boolean z = false;
                if (dz.this.d.compareAndSet(false, true)) {
                    Object obj = null;
                    boolean z2 = false;
                    while (dz.this.c.compareAndSet(true, false)) {
                        try {
                            obj = dz.this.a();
                            z2 = true;
                        } catch (Throwable th) {
                            dz.this.d.set(false);
                            throw th;
                        }
                    }
                    if (z2) {
                        dz.this.b.n(obj);
                    }
                    dz.this.d.set(false);
                    z = z2;
                }
                if (!z) {
                    return;
                }
            } while (dz.this.c.get());
        }
    }

    /* compiled from: ComputableLiveData.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        @u1
        public void run() {
            boolean h = dz.this.b.h();
            if (dz.this.c.compareAndSet(false, true) && h) {
                dz dzVar = dz.this;
                dzVar.a.execute(dzVar.e);
            }
        }
    }

    public dz() {
        this(h5.e());
    }

    @s2
    public abstract T a();

    @x1
    public LiveData<T> b() {
        return this.b;
    }

    public void c() {
        h5.f().b(this.f);
    }

    public dz(@x1 Executor executor) {
        this.c = new AtomicBoolean(true);
        this.d = new AtomicBoolean(false);
        this.e = new b();
        this.f = new c();
        this.a = executor;
        this.b = new a();
    }
}