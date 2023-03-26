package com.p7700g.p99005;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.p7700g.p99005.i2;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* compiled from: AsyncTaskLoader.java */
/* loaded from: classes.dex */
public abstract class l10<D> extends n10<D> {
    public static final String j = "AsyncTaskLoader";
    public static final boolean k = false;
    private final Executor l;
    public volatile l10<D>.a m;
    public volatile l10<D>.a n;
    public long o;
    public long p;
    public Handler q;

    /* compiled from: AsyncTaskLoader.java */
    /* loaded from: classes.dex */
    public final class a extends o10<Void, Void, D> implements Runnable {
        private final CountDownLatch I = new CountDownLatch(1);
        public boolean J;

        public a() {
        }

        @Override // com.p7700g.p99005.o10
        public void m(D d) {
            try {
                l10.this.E(this, d);
            } finally {
                this.I.countDown();
            }
        }

        @Override // com.p7700g.p99005.o10
        public void n(D d) {
            try {
                l10.this.F(this, d);
            } finally {
                this.I.countDown();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.J = false;
            l10.this.G();
        }

        @Override // com.p7700g.p99005.o10
        /* renamed from: u */
        public D b(Void... voidArr) {
            try {
                return (D) l10.this.K();
            } catch (zm e) {
                if (k()) {
                    return null;
                }
                throw e;
            }
        }

        public void v() {
            try {
                this.I.await();
            } catch (InterruptedException unused) {
            }
        }
    }

    public l10(@x1 Context context) {
        this(context, o10.y);
    }

    public void D() {
    }

    public void E(l10<D>.a aVar, D d) {
        J(d);
        if (this.n == aVar) {
            x();
            this.p = SystemClock.uptimeMillis();
            this.n = null;
            e();
            G();
        }
    }

    public void F(l10<D>.a aVar, D d) {
        if (this.m != aVar) {
            E(aVar, d);
        } else if (k()) {
            J(d);
        } else {
            c();
            this.p = SystemClock.uptimeMillis();
            this.m = null;
            f(d);
        }
    }

    public void G() {
        if (this.n != null || this.m == null) {
            return;
        }
        if (this.m.J) {
            this.m.J = false;
            this.q.removeCallbacks(this.m);
        }
        if (this.o > 0 && SystemClock.uptimeMillis() < this.p + this.o) {
            this.m.J = true;
            this.q.postAtTime(this.m, this.p + this.o);
            return;
        }
        this.m.e(this.l, null);
    }

    public boolean H() {
        return this.n != null;
    }

    @z1
    public abstract D I();

    public void J(@z1 D d) {
    }

    @z1
    public D K() {
        return I();
    }

    public void L(long j2) {
        this.o = j2;
        if (j2 != 0) {
            this.q = new Handler();
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void M() {
        l10<D>.a aVar = this.m;
        if (aVar != null) {
            aVar.v();
        }
    }

    @Override // com.p7700g.p99005.n10
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.m != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.m);
            printWriter.print(" waiting=");
            printWriter.println(this.m.J);
        }
        if (this.n != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.n);
            printWriter.print(" waiting=");
            printWriter.println(this.n.J);
        }
        if (this.o != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            up.c(this.o, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            up.b(this.p, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // com.p7700g.p99005.n10
    public boolean o() {
        if (this.m != null) {
            if (!this.e) {
                this.h = true;
            }
            if (this.n != null) {
                if (this.m.J) {
                    this.m.J = false;
                    this.q.removeCallbacks(this.m);
                }
                this.m = null;
                return false;
            } else if (this.m.J) {
                this.m.J = false;
                this.q.removeCallbacks(this.m);
                this.m = null;
                return false;
            } else {
                boolean a2 = this.m.a(false);
                if (a2) {
                    this.n = this.m;
                    D();
                }
                this.m = null;
                return a2;
            }
        }
        return false;
    }

    @Override // com.p7700g.p99005.n10
    public void q() {
        super.q();
        b();
        this.m = new a();
        G();
    }

    private l10(@x1 Context context, @x1 Executor executor) {
        super(context);
        this.p = -10000L;
        this.l = executor;
    }
}