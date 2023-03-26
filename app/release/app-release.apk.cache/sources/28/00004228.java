package com.p7700g.p99005;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.p7700g.p99005.dc0;
import com.p7700g.p99005.i2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: SystemJobScheduler.java */
@e2(23)
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class fd0 implements mc0 {
    private static final String s = tb0.f("SystemJobScheduler");
    private final Context t;
    private final JobScheduler u;
    private final rc0 v;
    private final ed0 w;

    public fd0(@x1 Context context, @x1 rc0 workManager) {
        this(context, workManager, (JobScheduler) context.getSystemService("jobscheduler"), new ed0(context));
    }

    public static void b(@x1 Context context) {
        List<JobInfo> g;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (g = g(context, jobScheduler)) == null || g.isEmpty()) {
            return;
        }
        for (JobInfo jobInfo : g) {
            d(jobScheduler, jobInfo.getId());
        }
    }

    private static void d(@x1 JobScheduler jobScheduler, int id) {
        try {
            jobScheduler.cancel(id);
        } catch (Throwable th) {
            tb0.c().b(s, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(id)), th);
        }
    }

    @z1
    private static List<Integer> f(@x1 Context context, @x1 JobScheduler jobScheduler, @x1 String workSpecId) {
        List<JobInfo> g = g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : g) {
            if (workSpecId.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    @z1
    private static List<JobInfo> g(@x1 Context context, @x1 JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            tb0.c().b(s, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @z1
    private static String h(@x1 JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey(ed0.b)) {
                    return extras.getString(ed0.b);
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    public static boolean i(@x1 Context context, @x1 rc0 workManager) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> g = g(context, jobScheduler);
        List<String> a = workManager.M().I().a();
        boolean z = false;
        HashSet hashSet = new HashSet(g != null ? g.size() : 0);
        if (g != null && !g.isEmpty()) {
            for (JobInfo jobInfo : g) {
                String h = h(jobInfo);
                if (!TextUtils.isEmpty(h)) {
                    hashSet.add(h);
                } else {
                    d(jobScheduler, jobInfo.getId());
                }
            }
        }
        Iterator<String> it = a.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains(it.next())) {
                    tb0.c().a(s, "Reconciling jobs", new Throwable[0]);
                    z = true;
                    break;
                }
            } else {
                break;
            }
        }
        if (z) {
            WorkDatabase M = workManager.M();
            M.c();
            try {
                xe0 L = M.L();
                for (String str : a) {
                    L.d(str, -1L);
                }
                M.A();
            } finally {
                M.i();
            }
        }
        return z;
    }

    @Override // com.p7700g.p99005.mc0
    public void a(@x1 we0... workSpecs) {
        int d;
        List<Integer> f;
        int d2;
        WorkDatabase M = this.v.M();
        gf0 gf0Var = new gf0(M);
        for (we0 we0Var : workSpecs) {
            M.c();
            try {
                we0 u = M.L().u(we0Var.d);
                if (u == null) {
                    tb0.c().h(s, "Skipping scheduling " + we0Var.d + " because it's no longer in the DB", new Throwable[0]);
                    M.A();
                } else if (u.e != dc0.a.ENQUEUED) {
                    tb0.c().h(s, "Skipping scheduling " + we0Var.d + " because it is no longer enqueued", new Throwable[0]);
                    M.A();
                } else {
                    ne0 c = M.I().c(we0Var.d);
                    if (c != null) {
                        d = c.b;
                    } else {
                        d = gf0Var.d(this.v.F().i(), this.v.F().g());
                    }
                    if (c == null) {
                        this.v.M().I().b(new ne0(we0Var.d, d));
                    }
                    j(we0Var, d);
                    if (Build.VERSION.SDK_INT == 23 && (f = f(this.t, this.u, we0Var.d)) != null) {
                        int indexOf = f.indexOf(Integer.valueOf(d));
                        if (indexOf >= 0) {
                            f.remove(indexOf);
                        }
                        if (!f.isEmpty()) {
                            d2 = f.get(0).intValue();
                        } else {
                            d2 = gf0Var.d(this.v.F().i(), this.v.F().g());
                        }
                        j(we0Var, d2);
                    }
                    M.A();
                }
                M.i();
            } catch (Throwable th) {
                M.i();
                throw th;
            }
        }
    }

    @Override // com.p7700g.p99005.mc0
    public boolean c() {
        return true;
    }

    @Override // com.p7700g.p99005.mc0
    public void e(@x1 String workSpecId) {
        List<Integer> f = f(this.t, this.u, workSpecId);
        if (f == null || f.isEmpty()) {
            return;
        }
        for (Integer num : f) {
            d(this.u, num.intValue());
        }
        this.v.M().I().d(workSpecId);
    }

    @r2
    public void j(we0 workSpec, int jobId) {
        JobInfo a = this.w.a(workSpec, jobId);
        tb0 c = tb0.c();
        String str = s;
        c.a(str, String.format("Scheduling work ID %s Job ID %s", workSpec.d, Integer.valueOf(jobId)), new Throwable[0]);
        try {
            if (this.u.schedule(a) == 0) {
                tb0.c().h(str, String.format("Unable to schedule work ID %s", workSpec.d), new Throwable[0]);
                if (workSpec.t && workSpec.u == xb0.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    workSpec.t = false;
                    tb0.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", workSpec.d), new Throwable[0]);
                    j(workSpec, jobId);
                }
            }
        } catch (IllegalStateException e) {
            List<JobInfo> g = g(this.t, this.u);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(g != null ? g.size() : 0), Integer.valueOf(this.v.M().L().i().size()), Integer.valueOf(this.v.F().h()));
            tb0.c().b(s, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            tb0.c().b(s, String.format("Unable to schedule %s", workSpec), th);
        }
    }

    @r2
    public fd0(Context context, rc0 workManager, JobScheduler jobScheduler, ed0 systemJobInfoConverter) {
        this.t = context;
        this.v = workManager;
        this.u = jobScheduler;
        this.w = systemJobInfoConverter;
    }
}