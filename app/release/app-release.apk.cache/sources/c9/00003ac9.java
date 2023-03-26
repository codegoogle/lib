package com.p7700g.p99005;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SystemAlarmDispatcher.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class bd0 implements jc0 {
    public static final String s = tb0.f("SystemAlarmDispatcher");
    private static final String t = "ProcessCommand";
    private static final String u = "KEY_START_ID";
    private static final int v = 0;
    private final rc0 A;
    public final yc0 B;
    private final Handler C;
    public final List<Intent> D;
    public Intent E;
    @z1
    private c F;
    public final Context w;
    private final cg0 x;
    private final wf0 y;
    private final lc0 z;

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bd0 bd0Var;
            d dVar;
            synchronized (bd0.this.D) {
                bd0 bd0Var2 = bd0.this;
                bd0Var2.E = bd0Var2.D.get(0);
            }
            Intent intent = bd0.this.E;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = bd0.this.E.getIntExtra(bd0.u, 0);
                tb0 c = tb0.c();
                String str = bd0.s;
                c.a(str, String.format("Processing command %s, %s", bd0.this.E, Integer.valueOf(intExtra)), new Throwable[0]);
                PowerManager.WakeLock b = sf0.b(bd0.this.w, String.format("%s (%s)", action, Integer.valueOf(intExtra)));
                try {
                    tb0.c().a(str, String.format("Acquiring operation wake lock (%s) %s", action, b), new Throwable[0]);
                    b.acquire();
                    bd0 bd0Var3 = bd0.this;
                    bd0Var3.B.p(bd0Var3.E, intExtra, bd0Var3);
                    tb0.c().a(str, String.format("Releasing operation wake lock (%s) %s", action, b), new Throwable[0]);
                    b.release();
                    bd0Var = bd0.this;
                    dVar = new d(bd0Var);
                } catch (Throwable th) {
                    try {
                        tb0 c2 = tb0.c();
                        String str2 = bd0.s;
                        c2.b(str2, "Unexpected error in onHandleIntent", th);
                        tb0.c().a(str2, String.format("Releasing operation wake lock (%s) %s", action, b), new Throwable[0]);
                        b.release();
                        bd0Var = bd0.this;
                        dVar = new d(bd0Var);
                    } catch (Throwable th2) {
                        tb0.c().a(bd0.s, String.format("Releasing operation wake lock (%s) %s", action, b), new Throwable[0]);
                        b.release();
                        bd0 bd0Var4 = bd0.this;
                        bd0Var4.k(new d(bd0Var4));
                        throw th2;
                    }
                }
                bd0Var.k(dVar);
            }
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public static class b implements Runnable {
        private final bd0 s;
        private final Intent t;
        private final int u;

        public b(@x1 bd0 dispatcher, @x1 Intent intent, int startId) {
            this.s = dispatcher;
            this.t = intent;
            this.u = startId;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.a(this.t, this.u);
        }
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public interface c {
        void a();
    }

    /* compiled from: SystemAlarmDispatcher.java */
    /* loaded from: classes.dex */
    public static class d implements Runnable {
        private final bd0 s;

        public d(@x1 bd0 dispatcher) {
            this.s = dispatcher;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.s.c();
        }
    }

    public bd0(@x1 Context context) {
        this(context, null, null);
    }

    private void b() {
        if (this.C.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @u1
    private boolean i(@x1 String action) {
        b();
        synchronized (this.D) {
            for (Intent intent : this.D) {
                if (action.equals(intent.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    @u1
    private void l() {
        b();
        PowerManager.WakeLock b2 = sf0.b(this.w, t);
        try {
            b2.acquire();
            this.A.O().c(new a());
        } finally {
            b2.release();
        }
    }

    @u1
    public boolean a(@x1 final Intent intent, final int startId) {
        tb0 c2 = tb0.c();
        String str = s;
        c2.a(str, String.format("Adding command %s (%s)", intent, Integer.valueOf(startId)), new Throwable[0]);
        b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            tb0.c().h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if (yc0.w.equals(action) && i(yc0.w)) {
            return false;
        } else {
            intent.putExtra(u, startId);
            synchronized (this.D) {
                boolean z = this.D.isEmpty() ? false : true;
                this.D.add(intent);
                if (!z) {
                    l();
                }
            }
            return true;
        }
    }

    @u1
    public void c() {
        tb0 c2 = tb0.c();
        String str = s;
        c2.a(str, "Checking if commands are complete.", new Throwable[0]);
        b();
        synchronized (this.D) {
            if (this.E != null) {
                tb0.c().a(str, String.format("Removing command %s", this.E), new Throwable[0]);
                if (this.D.remove(0).equals(this.E)) {
                    this.E = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            nf0 d2 = this.x.d();
            if (!this.B.o() && this.D.isEmpty() && !d2.b()) {
                tb0.c().a(str, "No more commands & intents.", new Throwable[0]);
                c cVar = this.F;
                if (cVar != null) {
                    cVar.a();
                }
            } else if (!this.D.isEmpty()) {
                l();
            }
        }
    }

    @Override // com.p7700g.p99005.jc0
    public void d(@x1 String workSpecId, boolean needsReschedule) {
        k(new b(this, yc0.c(this.w, workSpecId, needsReschedule), 0));
    }

    public lc0 e() {
        return this.z;
    }

    public cg0 f() {
        return this.x;
    }

    public rc0 g() {
        return this.A;
    }

    public wf0 h() {
        return this.y;
    }

    public void j() {
        tb0.c().a(s, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.z.j(this);
        this.y.d();
        this.F = null;
    }

    public void k(@x1 Runnable runnable) {
        this.C.post(runnable);
    }

    public void m(@x1 c listener) {
        if (this.F != null) {
            tb0.c().b(s, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.F = listener;
        }
    }

    @r2
    public bd0(@x1 Context context, @z1 lc0 processor, @z1 rc0 workManager) {
        Context applicationContext = context.getApplicationContext();
        this.w = applicationContext;
        this.B = new yc0(applicationContext);
        this.y = new wf0();
        workManager = workManager == null ? rc0.H(context) : workManager;
        this.A = workManager;
        processor = processor == null ? workManager.J() : processor;
        this.z = processor;
        this.x = workManager.O();
        processor.c(this);
        this.D = new ArrayList();
        this.E = null;
        this.C = new Handler(Looper.getMainLooper());
    }
}