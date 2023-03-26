package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.ea2;
import com.p7700g.p99005.v42;
import com.p7700g.p99005.z42;

@e2(api = 21)
/* loaded from: classes2.dex */
public class JobInfoSchedulerService extends JobService {
    private /* synthetic */ void a(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public /* synthetic */ void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        z42.f(getApplicationContext());
        v42.a d = v42.a().b(string).d(ea2.b(i));
        if (string2 != null) {
            d.c(Base64.decode(string2, 0));
        }
        z42.c().e().k(d.a(), i2, new Runnable() { // from class: com.p7700g.p99005.s72
            @Override // java.lang.Runnable
            public final void run() {
                JobInfoSchedulerService.this.jobFinished(jobParameters, false);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}