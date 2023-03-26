package com.p7700g.p99005;

import android.app.job.JobParameters;
import android.app.job.JobService;

/* compiled from: OneSignalJobServiceBase.java */
@e2(api = 21)
/* loaded from: classes3.dex */
public abstract class tm3 extends JobService {

    /* compiled from: OneSignalJobServiceBase.java */
    /* loaded from: classes3.dex */
    public class a implements Runnable {
        public final /* synthetic */ JobService s;
        public final /* synthetic */ JobParameters t;

        public a(JobService jobService, JobParameters jobParameters) {
            this.s = jobService;
            this.t = jobParameters;
        }

        @Override // java.lang.Runnable
        public void run() {
            tm3.this.a(this.s, this.t);
            tm3.this.jobFinished(this.t, false);
        }
    }

    public abstract void a(JobService jobService, JobParameters jobParameters);

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        if (jobParameters.getExtras() == null) {
            return false;
        }
        new Thread(new a(this, jobParameters), "OS_JOBSERVICE_BASE").start();
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}