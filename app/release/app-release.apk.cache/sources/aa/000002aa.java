package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.WorkerParameters;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.ed0;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.jc0;
import com.p7700g.p99005.rc0;
import com.p7700g.p99005.tb0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@e2(23)
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class SystemJobService extends JobService implements jc0 {
    private static final String s = tb0.f("SystemJobService");
    private rc0 t;
    private final Map<String, JobParameters> u = new HashMap();

    @z1
    private static String a(@x1 JobParameters parameters) {
        try {
            PersistableBundle extras = parameters.getExtras();
            if (extras == null || !extras.containsKey(ed0.b)) {
                return null;
            }
            return extras.getString(ed0.b);
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // com.p7700g.p99005.jc0
    public void d(@x1 String workSpecId, boolean needsReschedule) {
        JobParameters remove;
        tb0.c().a(s, String.format("%s executed on JobScheduler", workSpecId), new Throwable[0]);
        synchronized (this.u) {
            remove = this.u.remove(workSpecId);
        }
        if (remove != null) {
            jobFinished(remove, needsReschedule);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            rc0 H = rc0.H(getApplicationContext());
            this.t = H;
            H.J().c(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                tb0.c().h(s, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        rc0 rc0Var = this.t;
        if (rc0Var != null) {
            rc0Var.J().j(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(@x1 JobParameters params) {
        if (this.t == null) {
            tb0.c().a(s, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(params, true);
            return false;
        }
        String a = a(params);
        if (TextUtils.isEmpty(a)) {
            tb0.c().b(s, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.u) {
            if (this.u.containsKey(a)) {
                tb0.c().a(s, String.format("Job is already being executed by SystemJobService: %s", a), new Throwable[0]);
                return false;
            }
            tb0.c().a(s, String.format("onStartJob for %s", a), new Throwable[0]);
            this.u.put(a, params);
            WorkerParameters.a aVar = null;
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                aVar = new WorkerParameters.a();
                if (params.getTriggeredContentUris() != null) {
                    aVar.b = Arrays.asList(params.getTriggeredContentUris());
                }
                if (params.getTriggeredContentAuthorities() != null) {
                    aVar.a = Arrays.asList(params.getTriggeredContentAuthorities());
                }
                if (i >= 28) {
                    aVar.c = params.getNetwork();
                }
            }
            this.t.V(a, aVar);
            return true;
        }
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@x1 JobParameters params) {
        if (this.t == null) {
            tb0.c().a(s, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a = a(params);
        if (TextUtils.isEmpty(a)) {
            tb0.c().b(s, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        tb0.c().a(s, String.format("onStopJob for %s", a), new Throwable[0]);
        synchronized (this.u) {
            this.u.remove(a);
        }
        this.t.X(a);
        return !this.t.J().g(a);
    }
}