package com.p7700g.p99005;

import android.os.Handler;
import com.p7700g.p99005.mz;

/* compiled from: ServiceLifecycleDispatcher.java */
/* loaded from: classes.dex */
public class i00 {
    private final rz a;
    private final Handler b = new Handler();
    private a c;

    /* compiled from: ServiceLifecycleDispatcher.java */
    /* loaded from: classes.dex */
    public static class a implements Runnable {
        private final rz s;
        public final mz.b t;
        private boolean u = false;

        public a(@x1 rz rzVar, mz.b bVar) {
            this.s = rzVar;
            this.t = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.u) {
                return;
            }
            this.s.j(this.t);
            this.u = true;
        }
    }

    public i00(@x1 qz qzVar) {
        this.a = new rz(qzVar);
    }

    private void f(mz.b bVar) {
        a aVar = this.c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.a, bVar);
        this.c = aVar2;
        this.b.postAtFrontOfQueue(aVar2);
    }

    @x1
    public mz a() {
        return this.a;
    }

    public void b() {
        f(mz.b.ON_START);
    }

    public void c() {
        f(mz.b.ON_CREATE);
    }

    public void d() {
        f(mz.b.ON_STOP);
        f(mz.b.ON_DESTROY);
    }

    public void e() {
        f(mz.b.ON_START);
    }
}