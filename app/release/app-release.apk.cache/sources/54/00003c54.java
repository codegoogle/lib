package com.p7700g.p99005;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* compiled from: JobInfoScheduler.java */
@e2(api = 21)
/* loaded from: classes2.dex */
public class c82 implements i82 {
    private static final String a = "JobInfoScheduler";
    public static final String b = "attemptNumber";
    public static final String c = "backendName";
    public static final String d = "priority";
    public static final String e = "extras";
    private final Context f;
    private final i92 g;
    private final d82 h;

    public c82(Context context, i92 i92Var, d82 d82Var) {
        this.f = context;
        this.g = i92Var;
        this.h = d82Var;
    }

    private boolean d(JobScheduler jobScheduler, int i, int i2) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i3 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i) {
                return i3 >= i2;
            }
        }
        return false;
    }

    @Override // com.p7700g.p99005.i82
    public void a(v42 v42Var, int i) {
        b(v42Var, i, false);
    }

    @Override // com.p7700g.p99005.i82
    public void b(v42 v42Var, int i, boolean z) {
        ComponentName componentName = new ComponentName(this.f, JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f.getSystemService("jobscheduler");
        int c2 = c(v42Var);
        if (!z && d(jobScheduler, c2, i)) {
            d72.b(a, "Upload for context %s is already scheduled. Returning...", v42Var);
            return;
        }
        long A1 = this.g.A1(v42Var);
        JobInfo.Builder c3 = this.h.c(new JobInfo.Builder(c2, componentName), v42Var.d(), A1, i);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i);
        persistableBundle.putString("backendName", v42Var.b());
        persistableBundle.putInt("priority", ea2.a(v42Var.d()));
        if (v42Var.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(v42Var.c(), 0));
        }
        c3.setExtras(persistableBundle);
        d72.d(a, "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", v42Var, Integer.valueOf(c2), Long.valueOf(this.h.h(v42Var.d(), A1, i)), Long.valueOf(A1), Integer.valueOf(i));
        jobScheduler.schedule(c3.build());
    }

    @r2
    public int c(v42 v42Var) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(v42Var.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(ea2.a(v42Var.d())).array());
        if (v42Var.c() != null) {
            adler32.update(v42Var.c());
        }
        return (int) adler32.getValue();
    }
}