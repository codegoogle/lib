package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import com.anchorfree.vpnsdk.transporthydra.proxyservice.HydraProxyService;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: HydraProxy.java */
/* loaded from: classes2.dex */
public class eh1 implements db1, ab1 {
    @SuppressLint({"StaticFieldLeak"})
    public static final eh1 a = new eh1();
    @x1
    private static volatile en1 b = en1.IDLE;
    private final kj1 c = kj1.b("HydraProxy");
    private final mj1<HydraProxyService> d = new mj1<>();
    private final Queue<Runnable> e = new ArrayDeque();
    private final List<db1> f = new CopyOnWriteArrayList();
    private final Handler g = new Handler(Looper.getMainLooper());
    private boolean h;
    @z1
    private ServiceConnection i;
    @z1
    private Context j;

    /* compiled from: HydraProxy.java */
    /* loaded from: classes2.dex */
    public class a implements ua1<go1> {
        public final /* synthetic */ va1 b;

        public a(va1 va1Var) {
            this.b = va1Var;
        }

        @Override // com.p7700g.p99005.ua1
        public void a(@x1 gc1 gc1Var) {
            this.b.a(gc1Var);
            eh1.this.y(en1.IDLE);
        }

        @Override // com.p7700g.p99005.ua1
        /* renamed from: c */
        public void b(@x1 go1 go1Var) {
            ((HydraProxyService) r81.f((HydraProxyService) eh1.this.d.b())).l(go1Var.u, (String) r81.f(go1Var.z), this.b);
        }
    }

    /* compiled from: HydraProxy.java */
    /* loaded from: classes2.dex */
    public class b implements db1 {
        public final /* synthetic */ va1 a;

        public b(va1 va1Var) {
            this.a = va1Var;
        }

        @Override // com.p7700g.p99005.db1
        public void m(@x1 en1 en1Var) {
            if (en1Var == en1.IDLE) {
                eh1.this.c.c("Found IDLE state, killing service", new Object[0]);
                eh1.this.B();
                this.a.complete();
                eh1.this.w(this);
            }
        }

        @Override // com.p7700g.p99005.db1
        public void n(@x1 gc1 gc1Var) {
            kj1 kj1Var = eh1.this.c;
            kj1Var.c("HydraProxy error: " + gc1Var, new Object[0]);
            eh1.this.B();
            this.a.a(gc1Var);
            eh1.this.w(this);
            eh1.this.y(en1.IDLE);
        }
    }

    /* compiled from: HydraProxy.java */
    /* loaded from: classes2.dex */
    public class c implements va1 {
        public final /* synthetic */ va1 b;
        public final /* synthetic */ db1 c;

        public c(va1 va1Var, db1 db1Var) {
            this.b = va1Var;
            this.c = db1Var;
        }

        @Override // com.p7700g.p99005.va1
        public void a(@x1 gc1 gc1Var) {
            this.b.a(gc1Var);
            eh1.this.w(this.c);
            eh1.this.y(en1.IDLE);
        }

        @Override // com.p7700g.p99005.va1
        public void complete() {
            eh1.this.c.c("Waiting for vpn state listener callback to complete...", new Object[0]);
        }
    }

    /* compiled from: HydraProxy.java */
    /* loaded from: classes2.dex */
    public class d implements ServiceConnection {
        private d() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(@x1 ComponentName componentName, @x1 IBinder iBinder) {
            eh1.this.c.c("Proxy services connected", new Object[0]);
            HydraProxyService a = ((HydraProxyService.c) iBinder).a();
            eh1.this.d.c(a);
            eh1.this.h = true;
            a.j(eh1.this);
            for (Runnable runnable : eh1.this.e) {
                runnable.run();
            }
            eh1.this.e.clear();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(@x1 ComponentName componentName) {
            eh1.this.c.c("Proxy services disconnected", new Object[0]);
            ((HydraProxyService) r81.f((HydraProxyService) eh1.this.d.b())).j(null);
            eh1.this.h = false;
            eh1.this.d.a();
            eh1.this.y(en1.IDLE);
        }

        public /* synthetic */ d(eh1 eh1Var, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B() {
        Context context = (Context) r81.f(this.j);
        if (this.h) {
            context.unbindService(this.i);
        }
        context.stopService(new Intent(context, HydraProxyService.class));
        this.i = new d(this, null);
        this.h = false;
    }

    private void h() {
        try {
            Context context = (Context) r81.f(this.j);
            context.bindService(new Intent(context, HydraProxyService.class), this.i, 1);
        } catch (Exception unused) {
            y(en1.IDLE);
        }
    }

    private void j(@x1 Runnable runnable) {
        if (this.h) {
            runnable.run();
            return;
        }
        this.e.add(runnable);
        h();
    }

    private void k() {
        for (db1 db1Var : this.f) {
            db1Var.m(b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ void p(HydraProxyService.d dVar) {
        ((HydraProxyService) r81.f(this.d.b())).i(dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ void r(en1 en1Var) {
        kj1 kj1Var = this.c;
        kj1Var.c("uiHandler.post: triggered uiHandler with state " + en1Var, new Object[0]);
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void t(ho1 ho1Var, va1 va1Var) {
        ho1Var.load("", ti1.s, new Bundle(), new a(va1Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public /* synthetic */ void v(va1 va1Var, db1 db1Var) {
        ((HydraProxyService) r81.f(this.d.b())).n(new c(va1Var, db1Var));
    }

    public void A(@x1 final va1 va1Var) {
        this.c.c("Stopping Hydra proxy", new Object[0]);
        final b bVar = new b(va1Var);
        g(bVar);
        j(new Runnable() { // from class: com.p7700g.p99005.ah1
            @Override // java.lang.Runnable
            public final void run() {
                eh1.this.v(va1Var, bVar);
            }
        });
    }

    @Override // com.p7700g.p99005.ab1
    public void a(long j, long j2) {
    }

    public void g(@x1 db1 db1Var) {
        if (this.f.contains(db1Var)) {
            return;
        }
        this.f.add(db1Var);
    }

    public void i() {
        this.f.clear();
    }

    public void l(@x1 Context context) {
        hu0.b(context.getApplicationContext(), "hydra");
        this.j = context;
        this.i = new d(this, null);
    }

    @Override // com.p7700g.p99005.db1
    public void m(@x1 en1 en1Var) {
        kj1 kj1Var = this.c;
        kj1Var.c("State changed: " + en1Var, new Object[0]);
        y(en1Var);
    }

    @Override // com.p7700g.p99005.db1
    public void n(@x1 gc1 gc1Var) {
        this.c.e("Exception ", gc1Var);
        for (db1 db1Var : this.f) {
            db1Var.n(gc1Var);
        }
        A(va1.a);
    }

    public void w(@x1 db1 db1Var) {
        this.f.remove(db1Var);
    }

    public void x(@x1 final HydraProxyService.d dVar) {
        j(new Runnable() { // from class: com.p7700g.p99005.bh1
            @Override // java.lang.Runnable
            public final void run() {
                eh1.this.p(dVar);
            }
        });
    }

    public synchronized void y(@x1 final en1 en1Var) {
        kj1 kj1Var = this.c;
        kj1Var.c("setState: changing state from " + en1Var + " to " + en1Var, new Object[0]);
        b = en1Var;
        this.g.post(new Runnable() { // from class: com.p7700g.p99005.dh1
            @Override // java.lang.Runnable
            public final void run() {
                eh1.this.r(en1Var);
            }
        });
    }

    public void z(@x1 final ho1 ho1Var, @x1 final va1 va1Var) {
        this.c.c("Starting Hydra proxy", new Object[0]);
        ((Context) r81.f(this.j)).bindService(new Intent(this.j, HydraProxyService.class), this.i, 1);
        y(en1.CONNECTING_CREDENTIALS);
        j(new Runnable() { // from class: com.p7700g.p99005.ch1
            @Override // java.lang.Runnable
            public final void run() {
                eh1.this.t(ho1Var, va1Var);
            }
        });
    }
}