package com.onesignal;

import android.app.job.JobParameters;
import android.app.job.JobService;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.wl3;

@e2(api = 21)
/* loaded from: classes3.dex */
public class SyncJobService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        wl3.r().b(this, new wl3.b(this, jobParameters));
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        boolean m = wl3.r().m();
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.a(u0Var, "SyncJobService onStopJob called, system conditions not available reschedule: " + m);
        return m;
    }
}