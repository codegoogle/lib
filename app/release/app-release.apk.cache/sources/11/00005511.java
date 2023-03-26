package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* compiled from: AnimationHandler.java */
/* loaded from: classes.dex */
public class ou {
    private static final long a = 10;
    public static final ThreadLocal<ou> b = new ThreadLocal<>();
    private c f;
    private final y7<b, Long> c = new y7<>();
    public final ArrayList<b> d = new ArrayList<>();
    private final a e = new a();
    public long g = 0;
    private boolean h = false;

    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public class a {
        public a() {
        }

        public void a() {
            ou.this.g = SystemClock.uptimeMillis();
            ou ouVar = ou.this;
            ouVar.c(ouVar.g);
            if (ou.this.d.size() > 0) {
                ou.this.f().a();
            }
        }
    }

    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public interface b {
        boolean a(long j);
    }

    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public static abstract class c {
        public final a a;

        public c(a aVar) {
            this.a = aVar;
        }

        public abstract void a();
    }

    /* compiled from: AnimationHandler.java */
    /* loaded from: classes.dex */
    public static class d extends c {
        private final Runnable b;
        private final Handler c;
        public long d;

        /* compiled from: AnimationHandler.java */
        /* loaded from: classes.dex */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.d = SystemClock.uptimeMillis();
                d.this.a.a();
            }
        }

        public d(a aVar) {
            super(aVar);
            this.d = -1L;
            this.b = new a();
            this.c = new Handler(Looper.myLooper());
        }

        @Override // com.p7700g.p99005.ou.c
        public void a() {
            this.c.postDelayed(this.b, Math.max(10 - (SystemClock.uptimeMillis() - this.d), 0L));
        }
    }

    /* compiled from: AnimationHandler.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class e extends c {
        private final Choreographer b;
        private final Choreographer.FrameCallback c;

        /* compiled from: AnimationHandler.java */
        /* loaded from: classes.dex */
        public class a implements Choreographer.FrameCallback {
            public a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j) {
                e.this.a.a();
            }
        }

        public e(a aVar) {
            super(aVar);
            this.b = Choreographer.getInstance();
            this.c = new a();
        }

        @Override // com.p7700g.p99005.ou.c
        public void a() {
            this.b.postFrameCallback(this.c);
        }
    }

    private void b() {
        if (this.h) {
            for (int size = this.d.size() - 1; size >= 0; size--) {
                if (this.d.get(size) == null) {
                    this.d.remove(size);
                }
            }
            this.h = false;
        }
    }

    public static long d() {
        ThreadLocal<ou> threadLocal = b;
        if (threadLocal.get() == null) {
            return 0L;
        }
        return threadLocal.get().g;
    }

    public static ou e() {
        ThreadLocal<ou> threadLocal = b;
        if (threadLocal.get() == null) {
            threadLocal.set(new ou());
        }
        return threadLocal.get();
    }

    private boolean g(b bVar, long j) {
        Long l = this.c.get(bVar);
        if (l == null) {
            return true;
        }
        if (l.longValue() < j) {
            this.c.remove(bVar);
            return true;
        }
        return false;
    }

    public void a(b bVar, long j) {
        if (this.d.size() == 0) {
            f().a();
        }
        if (!this.d.contains(bVar)) {
            this.d.add(bVar);
        }
        if (j > 0) {
            this.c.put(bVar, Long.valueOf(SystemClock.uptimeMillis() + j));
        }
    }

    public void c(long j) {
        long uptimeMillis = SystemClock.uptimeMillis();
        for (int i = 0; i < this.d.size(); i++) {
            b bVar = this.d.get(i);
            if (bVar != null && g(bVar, uptimeMillis)) {
                bVar.a(j);
            }
        }
        b();
    }

    public c f() {
        if (this.f == null) {
            this.f = new e(this.e);
        }
        return this.f;
    }

    public void h(b bVar) {
        this.c.remove(bVar);
        int indexOf = this.d.indexOf(bVar);
        if (indexOf >= 0) {
            this.d.set(indexOf, null);
            this.h = true;
        }
    }

    public void i(c cVar) {
        this.f = cVar;
    }
}