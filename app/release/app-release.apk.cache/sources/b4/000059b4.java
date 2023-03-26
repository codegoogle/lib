package com.p7700g.p99005;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.lifecycle.LiveData;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import com.p7700g.p99005.ac0;
import com.p7700g.p99005.hb0;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.tb0;
import com.p7700g.p99005.we0;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkManagerImpl.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class rc0 extends ec0 {
    public static final int b = 22;
    public static final int c = 23;
    public static final String d = "androidx.work.multiprocess.RemoteWorkManagerClient";
    private Context h;
    private hb0 i;
    private WorkDatabase j;
    private cg0 k;
    private List<mc0> l;
    private lc0 m;
    private jf0 n;
    private boolean o;
    private BroadcastReceiver.PendingResult p;
    private volatile jg0 q;
    private static final String a = tb0.f("WorkManagerImpl");
    private static rc0 e = null;
    private static rc0 f = null;
    private static final Object g = new Object();

    /* compiled from: WorkManagerImpl.java */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        public final /* synthetic */ zf0 s;
        public final /* synthetic */ jf0 t;

        public a(final zf0 val$future, final jf0 val$preferenceUtils) {
            this.s = val$future;
            this.t = val$preferenceUtils;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.s.q(Long.valueOf(this.t.a()));
            } catch (Throwable th) {
                this.s.r(th);
            }
        }
    }

    /* compiled from: WorkManagerImpl.java */
    /* loaded from: classes.dex */
    public class b implements m5<List<we0.c>, dc0> {
        public b() {
        }

        @Override // com.p7700g.p99005.m5
        /* renamed from: a */
        public dc0 apply(List<we0.c> input) {
            if (input == null || input.size() <= 0) {
                return null;
            }
            return input.get(0).a();
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    public rc0(@x1 Context context, @x1 hb0 configuration, @x1 cg0 workTaskExecutor) {
        this(context, configuration, workTaskExecutor, context.getResources().getBoolean(ac0.a.d));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (com.p7700g.p99005.rc0.f != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        com.p7700g.p99005.rc0.f = new com.p7700g.p99005.rc0(r4, r5, new com.p7700g.p99005.dg0(r5.l()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        com.p7700g.p99005.rc0.e = com.p7700g.p99005.rc0.f;
     */
    @i2({i2.a.LIBRARY_GROUP})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A(@x1 Context context, @x1 hb0 configuration) {
        synchronized (g) {
            rc0 rc0Var = e;
            if (rc0Var != null && f != null) {
                throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
            }
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    @z1
    @Deprecated
    public static rc0 G() {
        synchronized (g) {
            rc0 rc0Var = e;
            if (rc0Var != null) {
                return rc0Var;
            }
            return f;
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public static rc0 H(@x1 Context context) {
        rc0 G;
        synchronized (g) {
            G = G();
            if (G == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof hb0.c) {
                    A(applicationContext, ((hb0.c) applicationContext).a());
                    G = H(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return G;
    }

    private void P(@x1 Context context, @x1 hb0 configuration, @x1 cg0 workTaskExecutor, @x1 WorkDatabase workDatabase, @x1 List<mc0> schedulers, @x1 lc0 processor) {
        Context applicationContext = context.getApplicationContext();
        this.h = applicationContext;
        this.i = configuration;
        this.k = workTaskExecutor;
        this.j = workDatabase;
        this.l = schedulers;
        this.m = processor;
        this.n = new jf0(workDatabase);
        this.o = false;
        if (Build.VERSION.SDK_INT >= 24 && applicationContext.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.k.c(new ForceStopRunnable(applicationContext, this));
    }

    @i2({i2.a.LIBRARY_GROUP})
    public static void S(@z1 rc0 delegate) {
        synchronized (g) {
            e = delegate;
        }
    }

    private void Y() {
        try {
            this.q = (jg0) Class.forName(d).getConstructor(Context.class, rc0.class).newInstance(this.h, this);
        } catch (Throwable th) {
            tb0.c().a(a, "Unable to initialize multi-process support", th);
        }
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public wb0 B() {
        lf0 lf0Var = new lf0(this);
        this.k.c(lf0Var);
        return lf0Var.a();
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public List<mc0> C(@x1 Context context, @x1 hb0 configuration, @x1 cg0 taskExecutor) {
        return Arrays.asList(nc0.a(context, this), new vc0(context, configuration, taskExecutor, this));
    }

    @x1
    public oc0 D(@x1 String uniqueWorkName, @x1 mb0 existingPeriodicWorkPolicy, @x1 yb0 periodicWork) {
        nb0 nb0Var;
        if (existingPeriodicWorkPolicy == mb0.KEEP) {
            nb0Var = nb0.KEEP;
        } else {
            nb0Var = nb0.REPLACE;
        }
        return new oc0(this, uniqueWorkName, nb0Var, Collections.singletonList(periodicWork));
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public Context E() {
        return this.h;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public hb0 F() {
        return this.i;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public jf0 I() {
        return this.n;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public lc0 J() {
        return this.m;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @z1
    public jg0 K() {
        if (this.q == null) {
            synchronized (g) {
                if (this.q == null) {
                    Y();
                    if (this.q == null && !TextUtils.isEmpty(this.i.c())) {
                        throw new IllegalStateException("Invalid multiprocess configuration. Define an `implementation` dependency on :work:work-multiprocess library");
                    }
                }
            }
        }
        return this.q;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public List<mc0> L() {
        return this.l;
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public WorkDatabase M() {
        return this.j;
    }

    public LiveData<List<dc0>> N(@x1 List<String> workSpecIds) {
        return hf0.a(this.j.L().y(workSpecIds), we0.c, this.k);
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    public cg0 O() {
        return this.k;
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void Q() {
        synchronized (g) {
            this.o = true;
            BroadcastReceiver.PendingResult pendingResult = this.p;
            if (pendingResult != null) {
                pendingResult.finish();
                this.p = null;
            }
        }
    }

    public void R() {
        if (Build.VERSION.SDK_INT >= 23) {
            fd0.b(E());
        }
        M().L().H();
        nc0.b(F(), M(), L());
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void T(@x1 BroadcastReceiver.PendingResult rescheduleReceiverResult) {
        synchronized (g) {
            this.p = rescheduleReceiverResult;
            if (this.o) {
                rescheduleReceiverResult.finish();
                this.p = null;
            }
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void U(@x1 String workSpecId) {
        V(workSpecId, null);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void V(@x1 String workSpecId, @z1 WorkerParameters.a runtimeExtras) {
        this.k.c(new of0(this, workSpecId, runtimeExtras));
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void W(@x1 String workSpecId) {
        this.k.c(new qf0(this, workSpecId, true));
    }

    @i2({i2.a.LIBRARY_GROUP})
    public void X(@x1 String workSpecId) {
        this.k.c(new qf0(this, workSpecId, false));
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public cc0 b(@x1 String uniqueWorkName, @x1 nb0 existingWorkPolicy, @x1 List<vb0> work) {
        if (!work.isEmpty()) {
            return new oc0(this, uniqueWorkName, existingWorkPolicy, work);
        }
        throw new IllegalArgumentException("beginUniqueWork needs at least one OneTimeWorkRequest.");
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public cc0 d(@x1 List<vb0> work) {
        if (!work.isEmpty()) {
            return new oc0(this, work);
        }
        throw new IllegalArgumentException("beginWith needs at least one OneTimeWorkRequest.");
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public wb0 e() {
        ef0 b2 = ef0.b(this);
        this.k.c(b2);
        return b2.f();
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public wb0 f(@x1 final String tag) {
        ef0 e2 = ef0.e(tag, this);
        this.k.c(e2);
        return e2.f();
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public wb0 g(@x1 String uniqueWorkName) {
        ef0 d2 = ef0.d(uniqueWorkName, this, true);
        this.k.c(d2);
        return d2.f();
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public wb0 h(@x1 UUID id) {
        ef0 c2 = ef0.c(id, this);
        this.k.c(c2);
        return c2.f();
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public PendingIntent i(@x1 UUID id) {
        return PendingIntent.getService(this.h, 0, ee0.a(this.h, id.toString()), jm.i() ? 167772160 : 134217728);
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public wb0 k(@x1 List<? extends gc0> requests) {
        if (!requests.isEmpty()) {
            return new oc0(this, requests).c();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public wb0 l(@x1 String uniqueWorkName, @x1 mb0 existingPeriodicWorkPolicy, @x1 yb0 periodicWork) {
        return D(uniqueWorkName, existingPeriodicWorkPolicy, periodicWork).c();
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public wb0 n(@x1 String uniqueWorkName, @x1 nb0 existingWorkPolicy, @x1 List<vb0> work) {
        return new oc0(this, uniqueWorkName, existingWorkPolicy, work).c();
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public gn2<Long> q() {
        zf0 v = zf0.v();
        this.k.c(new a(v, this.n));
        return v;
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public LiveData<Long> r() {
        return this.n.b();
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public gn2<dc0> s(@x1 UUID id) {
        pf0<dc0> c2 = pf0.c(this, id);
        this.k.d().execute(c2);
        return c2.f();
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public LiveData<dc0> t(@x1 UUID id) {
        return hf0.a(this.j.L().y(Collections.singletonList(id.toString())), new b(), this.k);
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public gn2<List<dc0>> u(@x1 fc0 workQuery) {
        pf0<List<dc0>> e2 = pf0.e(this, workQuery);
        this.k.d().execute(e2);
        return e2.f();
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public gn2<List<dc0>> v(@x1 String tag) {
        pf0<List<dc0>> b2 = pf0.b(this, tag);
        this.k.d().execute(b2);
        return b2.f();
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public LiveData<List<dc0>> w(@x1 String tag) {
        return hf0.a(this.j.L().o(tag), we0.c, this.k);
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public gn2<List<dc0>> x(@x1 String uniqueWorkName) {
        pf0<List<dc0>> d2 = pf0.d(this, uniqueWorkName);
        this.k.d().execute(d2);
        return d2.f();
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public LiveData<List<dc0>> y(@x1 String uniqueWorkName) {
        return hf0.a(this.j.L().m(uniqueWorkName), we0.c, this.k);
    }

    @Override // com.p7700g.p99005.ec0
    @x1
    public LiveData<List<dc0>> z(@x1 fc0 workQuery) {
        return hf0.a(this.j.H().b(mf0.b(workQuery)), we0.c, this.k);
    }

    @i2({i2.a.LIBRARY_GROUP})
    public rc0(@x1 Context context, @x1 hb0 configuration, @x1 cg0 workTaskExecutor, boolean useTestDatabase) {
        this(context, configuration, workTaskExecutor, WorkDatabase.B(context.getApplicationContext(), workTaskExecutor.d(), useTestDatabase));
    }

    @i2({i2.a.LIBRARY_GROUP})
    public rc0(@x1 Context context, @x1 hb0 configuration, @x1 cg0 workTaskExecutor, @x1 WorkDatabase database) {
        Context applicationContext = context.getApplicationContext();
        tb0.e(new tb0.a(configuration.j()));
        List<mc0> C = C(applicationContext, configuration, workTaskExecutor);
        P(context, configuration, workTaskExecutor, database, C, new lc0(context, configuration, workTaskExecutor, database, C));
    }

    @i2({i2.a.LIBRARY_GROUP})
    public rc0(@x1 Context context, @x1 hb0 configuration, @x1 cg0 workTaskExecutor, @x1 WorkDatabase workDatabase, @x1 List<mc0> schedulers, @x1 lc0 processor) {
        P(context, configuration, workTaskExecutor, workDatabase, schedulers, processor);
    }
}