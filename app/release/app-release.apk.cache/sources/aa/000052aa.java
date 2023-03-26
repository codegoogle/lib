package com.p7700g.p99005;

import android.os.CancellationSignal;

/* compiled from: CancellationSignal.java */
/* loaded from: classes.dex */
public final class nm {
    private boolean a;
    private b b;
    private Object c;
    private boolean d;

    /* compiled from: CancellationSignal.java */
    @e2(16)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(Object obj) {
            ((CancellationSignal) obj).cancel();
        }

        @e1
        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    /* compiled from: CancellationSignal.java */
    /* loaded from: classes.dex */
    public interface b {
        void onCancel();
    }

    private void f() {
        while (this.d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            if (this.a) {
                return;
            }
            this.a = true;
            this.d = true;
            b bVar = this.b;
            Object obj = this.c;
            if (bVar != null) {
                try {
                    bVar.onCancel();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.d = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                a.a(obj);
            }
            synchronized (this) {
                this.d = false;
                notifyAll();
            }
        }
    }

    @z1
    public Object b() {
        Object obj;
        synchronized (this) {
            if (this.c == null) {
                CancellationSignal b2 = a.b();
                this.c = b2;
                if (this.a) {
                    a.a(b2);
                }
            }
            obj = this.c;
        }
        return obj;
    }

    public boolean c() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        return z;
    }

    public void d(@z1 b bVar) {
        synchronized (this) {
            f();
            if (this.b == bVar) {
                return;
            }
            this.b = bVar;
            if (this.a && bVar != null) {
                bVar.onCancel();
            }
        }
    }

    public void e() {
        if (c()) {
            throw new zm();
        }
    }
}