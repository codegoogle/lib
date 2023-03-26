package com.p7700g.p99005;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* compiled from: SnackbarManager.java */
/* loaded from: classes3.dex */
public class ei2 {
    public static final int a = 0;
    private static final int b = 1500;
    private static final int c = 2750;
    private static ei2 d;
    @x1
    private final Object e = new Object();
    @x1
    private final Handler f = new Handler(Looper.getMainLooper(), new a());
    @z1
    private c g;
    @z1
    private c h;

    /* compiled from: SnackbarManager.java */
    /* loaded from: classes3.dex */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(@x1 Message message) {
            if (message.what != 0) {
                return false;
            }
            ei2.this.d((c) message.obj);
            return true;
        }
    }

    /* compiled from: SnackbarManager.java */
    /* loaded from: classes3.dex */
    public interface b {
        void a(int i);

        void show();
    }

    /* compiled from: SnackbarManager.java */
    /* loaded from: classes3.dex */
    public static class c {
        @x1
        public final WeakReference<b> a;
        public int b;
        public boolean c;

        public c(int i, b bVar) {
            this.a = new WeakReference<>(bVar);
            this.b = i;
        }

        public boolean a(@z1 b bVar) {
            return bVar != null && this.a.get() == bVar;
        }
    }

    private ei2() {
    }

    private boolean a(@x1 c cVar, int i) {
        b bVar = cVar.a.get();
        if (bVar != null) {
            this.f.removeCallbacksAndMessages(cVar);
            bVar.a(i);
            return true;
        }
        return false;
    }

    public static ei2 c() {
        if (d == null) {
            d = new ei2();
        }
        return d;
    }

    private boolean g(b bVar) {
        c cVar = this.g;
        return cVar != null && cVar.a(bVar);
    }

    private boolean h(b bVar) {
        c cVar = this.h;
        return cVar != null && cVar.a(bVar);
    }

    private void m(@x1 c cVar) {
        int i = cVar.b;
        if (i == -2) {
            return;
        }
        if (i <= 0) {
            i = i == -1 ? 1500 : c;
        }
        this.f.removeCallbacksAndMessages(cVar);
        Handler handler = this.f;
        handler.sendMessageDelayed(Message.obtain(handler, 0, cVar), i);
    }

    private void o() {
        c cVar = this.h;
        if (cVar != null) {
            this.g = cVar;
            this.h = null;
            b bVar = cVar.a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.g = null;
            }
        }
    }

    public void b(b bVar, int i) {
        synchronized (this.e) {
            if (g(bVar)) {
                a(this.g, i);
            } else if (h(bVar)) {
                a(this.h, i);
            }
        }
    }

    public void d(@x1 c cVar) {
        synchronized (this.e) {
            if (this.g == cVar || this.h == cVar) {
                a(cVar, 2);
            }
        }
    }

    public boolean e(b bVar) {
        boolean g;
        synchronized (this.e) {
            g = g(bVar);
        }
        return g;
    }

    public boolean f(b bVar) {
        boolean z;
        synchronized (this.e) {
            z = g(bVar) || h(bVar);
        }
        return z;
    }

    public void i(b bVar) {
        synchronized (this.e) {
            if (g(bVar)) {
                this.g = null;
                if (this.h != null) {
                    o();
                }
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.e) {
            if (g(bVar)) {
                m(this.g);
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.e) {
            if (g(bVar)) {
                c cVar = this.g;
                if (!cVar.c) {
                    cVar.c = true;
                    this.f.removeCallbacksAndMessages(cVar);
                }
            }
        }
    }

    public void l(b bVar) {
        synchronized (this.e) {
            if (g(bVar)) {
                c cVar = this.g;
                if (cVar.c) {
                    cVar.c = false;
                    m(cVar);
                }
            }
        }
    }

    public void n(int i, b bVar) {
        synchronized (this.e) {
            if (g(bVar)) {
                c cVar = this.g;
                cVar.b = i;
                this.f.removeCallbacksAndMessages(cVar);
                m(this.g);
                return;
            }
            if (h(bVar)) {
                this.h.b = i;
            } else {
                this.h = new c(i, bVar);
            }
            c cVar2 = this.g;
            if (cVar2 == null || !a(cVar2, 4)) {
                this.g = null;
                o();
            }
        }
    }
}