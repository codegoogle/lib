package com.p7700g.p99005;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.jb0;

/* compiled from: SystemJobInfoConverter.java */
@e2(api = 23)
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ed0 {
    private static final String a = tb0.f("SystemJobInfoConverter");
    public static final String b = "EXTRA_WORK_SPEC_ID";
    public static final String c = "EXTRA_IS_PERIODIC";
    private final ComponentName d;

    /* compiled from: SystemJobInfoConverter.java */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            ub0.values();
            int[] iArr = new int[6];
            a = iArr;
            try {
                iArr[ub0.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ub0.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ub0.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ub0.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ub0.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    @r2(otherwise = 3)
    public ed0(@x1 Context context) {
        this.d = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    @e2(24)
    private static JobInfo.TriggerContentUri b(jb0.a trigger) {
        return new JobInfo.TriggerContentUri(trigger.a(), trigger.b() ? 1 : 0);
    }

    public static int c(ub0 networkType) {
        int ordinal = networkType.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4 && Build.VERSION.SDK_INT >= 26) {
                            return 4;
                        }
                    } else if (Build.VERSION.SDK_INT >= 24) {
                        return 3;
                    }
                    tb0.c().a(a, String.format("API version too low. Cannot convert network type value %s", networkType), new Throwable[0]);
                    return 1;
                }
                return 2;
            }
            return 1;
        }
        return 0;
    }

    public static void d(@x1 JobInfo.Builder builder, @x1 ub0 networkType) {
        if (Build.VERSION.SDK_INT >= 30 && networkType == ub0.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        } else {
            builder.setRequiredNetworkType(c(networkType));
        }
    }

    public JobInfo a(we0 workSpec, int jobId) {
        ib0 ib0Var = workSpec.m;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(b, workSpec.d);
        persistableBundle.putBoolean(c, workSpec.d());
        JobInfo.Builder extras = new JobInfo.Builder(jobId, this.d).setRequiresCharging(ib0Var.g()).setRequiresDeviceIdle(ib0Var.h()).setExtras(persistableBundle);
        d(extras, ib0Var.b());
        if (!ib0Var.h()) {
            extras.setBackoffCriteria(workSpec.p, workSpec.o == gb0.LINEAR ? 0 : 1);
        }
        long max = Math.max(workSpec.a() - System.currentTimeMillis(), 0L);
        int i = Build.VERSION.SDK_INT;
        if (i <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!workSpec.t) {
            extras.setImportantWhileForeground(true);
        }
        if (i >= 24 && ib0Var.e()) {
            for (jb0.a aVar : ib0Var.a().b()) {
                extras.addTriggerContentUri(b(aVar));
            }
            extras.setTriggerContentUpdateDelay(ib0Var.c());
            extras.setTriggerContentMaxDelay(ib0Var.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(ib0Var.f());
            extras.setRequiresStorageNotLow(ib0Var.i());
        }
        boolean z = workSpec.n > 0;
        if (jm.i() && workSpec.t && !z) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}