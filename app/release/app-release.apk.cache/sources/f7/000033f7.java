package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.ironsource.lifecycle.b;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class d implements Application.ActivityLifecycleCallbacks {
    private static d s = new d();
    public static AtomicBoolean t = new AtomicBoolean(false);
    private String u = "IronsourceLifecycleManager";
    public int v = 0;
    public int w = 0;
    public boolean x = true;
    public boolean y = true;
    public int z = com.ironsource.lifecycle.e.a;
    public List<com.ironsource.lifecycle.c> A = new CopyOnWriteArrayList();
    public Runnable B = new a();
    private b.a C = new f();

    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d.b(d.this);
            d.this.e();
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (com.ironsource.lifecycle.c cVar : d.this.A) {
                cVar.a();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = d.this.A.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* renamed from: com.ironsource.lifecycle.d$d  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class RunnableC0114d implements Runnable {
        public RunnableC0114d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Iterator it = d.this.A.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (com.ironsource.lifecycle.c cVar : d.this.A) {
                cVar.b();
            }
        }
    }

    /* loaded from: classes3.dex */
    public class f implements b.a {
        public f() {
        }

        @Override // com.ironsource.lifecycle.b.a
        public final void a(Activity activity) {
            d dVar = d.this;
            int i = dVar.v + 1;
            dVar.v = i;
            if (i == 1 && dVar.y) {
                com.ironsource.environment.e.c.a.c(new b());
                dVar.y = false;
                dVar.z = com.ironsource.lifecycle.e.b;
            }
        }

        @Override // com.ironsource.lifecycle.b.a
        public final void b(Activity activity) {
            d dVar = d.this;
            int i = dVar.w + 1;
            dVar.w = i;
            if (i == 1) {
                if (!dVar.x) {
                    com.ironsource.environment.e.c cVar = com.ironsource.environment.e.c.a;
                    com.ironsource.environment.e.c.a(dVar.B);
                    return;
                }
                com.ironsource.environment.e.c.a.c(new c());
                dVar.x = false;
                dVar.z = com.ironsource.lifecycle.e.c;
            }
        }
    }

    public static d a() {
        return s;
    }

    public static /* synthetic */ void b(d dVar) {
        if (dVar.w == 0) {
            dVar.x = true;
            com.ironsource.environment.e.c.a.c(new RunnableC0114d());
            dVar.z = com.ironsource.lifecycle.e.d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        if (this.v == 0 && this.x) {
            com.ironsource.environment.e.c.a.c(new e());
            this.y = true;
            this.z = com.ironsource.lifecycle.e.e;
        }
    }

    public final void a(com.ironsource.lifecycle.c cVar) {
        if (!IronsourceLifecycleProvider.a() || this.A.contains(cVar)) {
            return;
        }
        this.A.add(cVar);
    }

    public final boolean b() {
        return this.z == com.ironsource.lifecycle.e.e;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        com.ironsource.lifecycle.b.b(activity);
        com.ironsource.lifecycle.b a2 = com.ironsource.lifecycle.b.a(activity);
        if (a2 != null) {
            a2.s = this.C;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        int i = this.w - 1;
        this.w = i;
        if (i == 0) {
            com.ironsource.environment.e.c cVar = com.ironsource.environment.e.c.a;
            com.ironsource.environment.e.c.a(this.B, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.v--;
        e();
    }
}