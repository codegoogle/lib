package com.p7700g.p99005;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GifFrameLoader.java */
/* loaded from: classes2.dex */
public class zw1 {
    private final up1 a;
    private final Handler b;
    private final List<b> c;
    public final jp1 d;
    private final ls1 e;
    private boolean f;
    private boolean g;
    private boolean h;
    private ip1<Bitmap> i;
    private a j;
    private boolean k;
    private a l;
    private Bitmap m;
    private nq1<Bitmap> n;
    private a o;
    @z1
    private d p;
    private int q;
    private int r;
    private int s;

    /* compiled from: GifFrameLoader.java */
    @r2
    /* loaded from: classes2.dex */
    public static class a extends hz1<Bitmap> {
        private final Handler v;
        public final int w;
        private final long x;
        private Bitmap y;

        public a(Handler handler, int i, long j) {
            this.v = handler;
            this.w = i;
            this.x = j;
        }

        public Bitmap a() {
            return this.y;
        }

        @Override // com.p7700g.p99005.sz1
        /* renamed from: d */
        public void c(@x1 Bitmap bitmap, @z1 a02<? super Bitmap> a02Var) {
            this.y = bitmap;
            this.v.sendMessageAtTime(this.v.obtainMessage(1, this), this.x);
        }

        @Override // com.p7700g.p99005.sz1
        public void p(@z1 Drawable drawable) {
            this.y = null;
        }
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    /* loaded from: classes2.dex */
    public class c implements Handler.Callback {
        public static final int s = 1;
        public static final int t = 2;

        public c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                zw1.this.o((a) message.obj);
                return true;
            } else if (i == 2) {
                zw1.this.d.z((a) message.obj);
                return false;
            } else {
                return false;
            }
        }
    }

    /* compiled from: GifFrameLoader.java */
    @r2
    /* loaded from: classes2.dex */
    public interface d {
        void a();
    }

    public zw1(yo1 yo1Var, up1 up1Var, int i, int i2, nq1<Bitmap> nq1Var, Bitmap bitmap) {
        this(yo1Var.h(), yo1.E(yo1Var.j()), up1Var, null, k(yo1.E(yo1Var.j()), i, i2), nq1Var, bitmap);
    }

    private static gq1 g() {
        return new k02(Double.valueOf(Math.random()));
    }

    private static ip1<Bitmap> k(jp1 jp1Var, int i, int i2) {
        return jp1Var.u().b(zy1.q1(qr1.b).j1(true).W0(true).L0(i, i2));
    }

    private void n() {
        if (!this.f || this.g) {
            return;
        }
        if (this.h) {
            x02.a(this.o == null, "Pending target must be null when starting from the first frame");
            this.a.i();
            this.h = false;
        }
        a aVar = this.o;
        if (aVar != null) {
            this.o = null;
            o(aVar);
            return;
        }
        this.g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.a.e();
        this.a.b();
        this.l = new a(this.b, this.a.k(), uptimeMillis);
        this.i.b(zy1.I1(g())).n(this.a).A1(this.l);
    }

    private void p() {
        Bitmap bitmap = this.m;
        if (bitmap != null) {
            this.e.a(bitmap);
            this.m = null;
        }
    }

    private void t() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.k = false;
        n();
    }

    private void u() {
        this.f = false;
    }

    public void a() {
        this.c.clear();
        p();
        u();
        a aVar = this.j;
        if (aVar != null) {
            this.d.z(aVar);
            this.j = null;
        }
        a aVar2 = this.l;
        if (aVar2 != null) {
            this.d.z(aVar2);
            this.l = null;
        }
        a aVar3 = this.o;
        if (aVar3 != null) {
            this.d.z(aVar3);
            this.o = null;
        }
        this.a.clear();
        this.k = true;
    }

    public ByteBuffer b() {
        return this.a.h().asReadOnlyBuffer();
    }

    public Bitmap c() {
        a aVar = this.j;
        return aVar != null ? aVar.a() : this.m;
    }

    public int d() {
        a aVar = this.j;
        if (aVar != null) {
            return aVar.w;
        }
        return -1;
    }

    public Bitmap e() {
        return this.m;
    }

    public int f() {
        return this.a.d();
    }

    public nq1<Bitmap> h() {
        return this.n;
    }

    public int i() {
        return this.s;
    }

    public int j() {
        return this.a.p();
    }

    public int l() {
        return this.a.o() + this.q;
    }

    public int m() {
        return this.r;
    }

    @r2
    public void o(a aVar) {
        d dVar = this.p;
        if (dVar != null) {
            dVar.a();
        }
        this.g = false;
        if (this.k) {
            this.b.obtainMessage(2, aVar).sendToTarget();
        } else if (!this.f) {
            if (this.h) {
                this.b.obtainMessage(2, aVar).sendToTarget();
            } else {
                this.o = aVar;
            }
        } else {
            if (aVar.a() != null) {
                p();
                a aVar2 = this.j;
                this.j = aVar;
                for (int size = this.c.size() - 1; size >= 0; size--) {
                    this.c.get(size).a();
                }
                if (aVar2 != null) {
                    this.b.obtainMessage(2, aVar2).sendToTarget();
                }
            }
            n();
        }
    }

    public void q(nq1<Bitmap> nq1Var, Bitmap bitmap) {
        this.n = (nq1) x02.d(nq1Var);
        this.m = (Bitmap) x02.d(bitmap);
        this.i = this.i.b(new zy1().a1(nq1Var));
        this.q = z02.h(bitmap);
        this.r = bitmap.getWidth();
        this.s = bitmap.getHeight();
    }

    public void r() {
        x02.a(!this.f, "Can't restart a running animation");
        this.h = true;
        a aVar = this.o;
        if (aVar != null) {
            this.d.z(aVar);
            this.o = null;
        }
    }

    @r2
    public void s(@z1 d dVar) {
        this.p = dVar;
    }

    public void v(b bVar) {
        if (!this.k) {
            if (!this.c.contains(bVar)) {
                boolean isEmpty = this.c.isEmpty();
                this.c.add(bVar);
                if (isEmpty) {
                    t();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
    }

    public void w(b bVar) {
        this.c.remove(bVar);
        if (this.c.isEmpty()) {
            u();
        }
    }

    public zw1(ls1 ls1Var, jp1 jp1Var, up1 up1Var, Handler handler, ip1<Bitmap> ip1Var, nq1<Bitmap> nq1Var, Bitmap bitmap) {
        this.c = new ArrayList();
        this.d = jp1Var;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.e = ls1Var;
        this.b = handler;
        this.i = ip1Var;
        this.a = up1Var;
        q(nq1Var, bitmap);
    }
}