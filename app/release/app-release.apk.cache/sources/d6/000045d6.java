package com.p7700g.p99005;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import com.p7700g.p99005.t40;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: RoomTrackingLiveData.java */
/* loaded from: classes.dex */
public class h50<T> extends LiveData<T> {
    public final d50 m;
    public final boolean n;
    public final Callable<T> o;
    private final s40 p;
    public final t40.c q;
    public final AtomicBoolean r = new AtomicBoolean(true);
    public final AtomicBoolean s = new AtomicBoolean(false);
    public final AtomicBoolean t = new AtomicBoolean(false);
    public final Runnable u = new a();
    public final Runnable v = new b();

    /* compiled from: RoomTrackingLiveData.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @s2
        public void run() {
            boolean z;
            if (h50.this.t.compareAndSet(false, true)) {
                h50.this.m.l().b(h50.this.q);
            }
            do {
                if (h50.this.s.compareAndSet(false, true)) {
                    T t = null;
                    z = false;
                    while (h50.this.r.compareAndSet(true, false)) {
                        try {
                            try {
                                t = h50.this.o.call();
                                z = true;
                            } catch (Exception e) {
                                throw new RuntimeException("Exception while computing database live data.", e);
                            }
                        } finally {
                            h50.this.s.set(false);
                        }
                    }
                    if (z) {
                        h50.this.n(t);
                    }
                } else {
                    z = false;
                }
                if (!z) {
                    return;
                }
            } while (h50.this.r.get());
        }
    }

    /* compiled from: RoomTrackingLiveData.java */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        @u1
        public void run() {
            boolean h = h50.this.h();
            if (h50.this.r.compareAndSet(false, true) && h) {
                h50.this.s().execute(h50.this.u);
            }
        }
    }

    /* compiled from: RoomTrackingLiveData.java */
    /* loaded from: classes.dex */
    public class c extends t40.c {
        public c(String[] strArr) {
            super(strArr);
        }

        @Override // com.p7700g.p99005.t40.c
        public void b(@x1 Set<String> set) {
            h5.f().b(h50.this.v);
        }
    }

    @SuppressLint({"RestrictedApi"})
    public h50(d50 d50Var, s40 s40Var, boolean z, Callable<T> callable, String[] strArr) {
        this.m = d50Var;
        this.n = z;
        this.o = callable;
        this.p = s40Var;
        this.q = new c(strArr);
    }

    @Override // androidx.lifecycle.LiveData
    public void l() {
        super.l();
        this.p.b(this);
        s().execute(this.u);
    }

    @Override // androidx.lifecycle.LiveData
    public void m() {
        super.m();
        this.p.c(this);
    }

    public Executor s() {
        if (this.n) {
            return this.m.p();
        }
        return this.m.n();
    }
}