package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import com.p7700g.p99005.cg0;
import com.p7700g.p99005.gn2;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.jd0;
import com.p7700g.p99005.kd0;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.rc0;
import com.p7700g.p99005.tb0;
import com.p7700g.p99005.we0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import com.p7700g.p99005.zf0;
import java.util.Collections;
import java.util.List;

@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ConstraintTrackingWorker extends ListenableWorker implements jd0 {
    private static final String s = tb0.f("ConstraintTrkngWrkr");
    public static final String t = "androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME";
    private WorkerParameters u;
    public final Object v;
    public volatile boolean w;
    public zf0<ListenableWorker.a> x;
    @z1
    private ListenableWorker y;

    /* loaded from: classes.dex */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ConstraintTrackingWorker.this.g();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        public final /* synthetic */ gn2 s;

        public b(final gn2 val$innerFuture) {
            this.s = val$innerFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (ConstraintTrackingWorker.this.v) {
                if (ConstraintTrackingWorker.this.w) {
                    ConstraintTrackingWorker.this.e();
                } else {
                    ConstraintTrackingWorker.this.x.s(this.s);
                }
            }
        }
    }

    public ConstraintTrackingWorker(@x1 Context appContext, @x1 WorkerParameters workerParams) {
        super(appContext, workerParams);
        this.u = workerParams;
        this.v = new Object();
        this.w = false;
        this.x = zf0.v();
    }

    @i2({i2.a.LIBRARY_GROUP})
    @r2
    @z1
    public ListenableWorker a() {
        return this.y;
    }

    @Override // com.p7700g.p99005.jd0
    public void b(@x1 List<String> workSpecIds) {
        tb0.c().a(s, String.format("Constraints changed for %s", workSpecIds), new Throwable[0]);
        synchronized (this.v) {
            this.w = true;
        }
    }

    @i2({i2.a.LIBRARY_GROUP})
    @x1
    @r2
    public WorkDatabase c() {
        return rc0.H(getApplicationContext()).M();
    }

    public void d() {
        this.x.q(ListenableWorker.a.a());
    }

    public void e() {
        this.x.q(ListenableWorker.a.d());
    }

    @Override // com.p7700g.p99005.jd0
    public void f(@x1 List<String> workSpecIds) {
    }

    public void g() {
        String A = getInputData().A(t);
        if (TextUtils.isEmpty(A)) {
            tb0.c().b(s, "No worker to delegate to.", new Throwable[0]);
            d();
            return;
        }
        ListenableWorker b2 = getWorkerFactory().b(getApplicationContext(), A, this.u);
        this.y = b2;
        if (b2 == null) {
            tb0.c().a(s, "No worker to delegate to.", new Throwable[0]);
            d();
            return;
        }
        we0 u = c().L().u(getId().toString());
        if (u == null) {
            d();
            return;
        }
        kd0 kd0Var = new kd0(getApplicationContext(), getTaskExecutor(), this);
        kd0Var.d(Collections.singletonList(u));
        if (kd0Var.c(getId().toString())) {
            tb0.c().a(s, String.format("Constraints met for delegate %s", A), new Throwable[0]);
            try {
                gn2<ListenableWorker.a> startWork = this.y.startWork();
                startWork.a(new b(startWork), getBackgroundExecutor());
                return;
            } catch (Throwable th) {
                tb0 c = tb0.c();
                String str = s;
                c.a(str, String.format("Delegated worker %s threw exception in startWork.", A), th);
                synchronized (this.v) {
                    if (this.w) {
                        tb0.c().a(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                        e();
                    } else {
                        d();
                    }
                    return;
                }
            }
        }
        tb0.c().a(s, String.format("Constraints not met for delegate %s. Requesting retry.", A), new Throwable[0]);
        e();
    }

    @Override // androidx.work.ListenableWorker
    @i2({i2.a.LIBRARY_GROUP})
    @x1
    @r2
    public cg0 getTaskExecutor() {
        return rc0.H(getApplicationContext()).O();
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.y;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.y;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        this.y.stop();
    }

    @Override // androidx.work.ListenableWorker
    @x1
    public gn2<ListenableWorker.a> startWork() {
        getBackgroundExecutor().execute(new a());
        return this.x;
    }
}