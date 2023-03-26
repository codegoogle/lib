package com.p7700g.p99005;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import androidx.room.MultiInstanceInvalidationService;
import com.p7700g.p99005.n40;
import com.p7700g.p99005.o40;
import com.p7700g.p99005.t40;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MultiInstanceInvalidationClient.java */
/* loaded from: classes.dex */
public class v40 {
    public final Context a;
    public final String b;
    public int c;
    public final t40 d;
    public final t40.c e;
    @z1
    public o40 f;
    public final Executor g;
    public final n40 h = new a();
    public final AtomicBoolean i = new AtomicBoolean(false);
    public final ServiceConnection j;
    public final Runnable k;
    public final Runnable l;
    private final Runnable m;

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    public class a extends n40.a {

        /* compiled from: MultiInstanceInvalidationClient.java */
        /* renamed from: com.p7700g.p99005.v40$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0259a implements Runnable {
            public final /* synthetic */ String[] s;

            public RunnableC0259a(String[] strArr) {
                this.s = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                v40.this.d.h(this.s);
            }
        }

        public a() {
        }

        @Override // com.p7700g.p99005.n40
        public void Q(String[] strArr) {
            v40.this.g.execute(new RunnableC0259a(strArr));
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            v40.this.f = o40.a.N1(iBinder);
            v40 v40Var = v40.this;
            v40Var.g.execute(v40Var.k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            v40 v40Var = v40.this;
            v40Var.g.execute(v40Var.l);
            v40.this.f = null;
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                v40 v40Var = v40.this;
                o40 o40Var = v40Var.f;
                if (o40Var != null) {
                    v40Var.c = o40Var.Z(v40Var.h, v40Var.b);
                    v40 v40Var2 = v40.this;
                    v40Var2.d.a(v40Var2.e);
                }
            } catch (RemoteException unused) {
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v40 v40Var = v40.this;
            v40Var.d.k(v40Var.e);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            v40 v40Var = v40.this;
            v40Var.d.k(v40Var.e);
            try {
                v40 v40Var2 = v40.this;
                o40 o40Var = v40Var2.f;
                if (o40Var != null) {
                    o40Var.E1(v40Var2.h, v40Var2.c);
                }
            } catch (RemoteException unused) {
            }
            v40 v40Var3 = v40.this;
            v40Var3.a.unbindService(v40Var3.j);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient.java */
    /* loaded from: classes.dex */
    public class f extends t40.c {
        public f(String[] strArr) {
            super(strArr);
        }

        @Override // com.p7700g.p99005.t40.c
        public boolean a() {
            return true;
        }

        @Override // com.p7700g.p99005.t40.c
        public void b(@x1 Set<String> set) {
            if (v40.this.i.get()) {
                return;
            }
            try {
                v40 v40Var = v40.this;
                o40 o40Var = v40Var.f;
                if (o40Var != null) {
                    o40Var.y1(v40Var.c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException unused) {
            }
        }
    }

    public v40(Context context, String str, t40 t40Var, Executor executor) {
        b bVar = new b();
        this.j = bVar;
        this.k = new c();
        this.l = new d();
        this.m = new e();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = str;
        this.d = t40Var;
        this.g = executor;
        this.e = new f((String[]) t40Var.h.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, MultiInstanceInvalidationService.class), bVar, 1);
    }

    public void a() {
        if (this.i.compareAndSet(false, true)) {
            this.g.execute(this.m);
        }
    }
}