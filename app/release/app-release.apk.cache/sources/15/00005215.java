package com.p7700g.p99005;

import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.p7700g.p99005.i2;
import java.util.List;

/* compiled from: Schedulers.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class nc0 {
    public static final String a = "androidx.work.impl.background.gcm.GcmScheduler";
    private static final String b = tb0.f("Schedulers");

    private nc0() {
    }

    @x1
    public static mc0 a(@x1 Context context, @x1 rc0 workManager) {
        if (Build.VERSION.SDK_INT >= 23) {
            fd0 fd0Var = new fd0(context, workManager);
            if0.c(context, SystemJobService.class, true);
            tb0.c().a(b, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return fd0Var;
        }
        mc0 c = c(context);
        if (c == null) {
            cd0 cd0Var = new cd0(context);
            if0.c(context, SystemAlarmService.class, true);
            tb0.c().a(b, "Created SystemAlarmScheduler", new Throwable[0]);
            return cd0Var;
        }
        return c;
    }

    public static void b(@x1 hb0 configuration, @x1 WorkDatabase workDatabase, List<mc0> schedulers) {
        if (schedulers == null || schedulers.size() == 0) {
            return;
        }
        xe0 L = workDatabase.L();
        workDatabase.c();
        try {
            List<we0> g = L.g(configuration.h());
            List<we0> F = L.F(200);
            if (g != null && g.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                for (we0 we0Var : g) {
                    L.d(we0Var.d, currentTimeMillis);
                }
            }
            workDatabase.A();
            if (g != null && g.size() > 0) {
                we0[] we0VarArr = (we0[]) g.toArray(new we0[g.size()]);
                for (mc0 mc0Var : schedulers) {
                    if (mc0Var.c()) {
                        mc0Var.a(we0VarArr);
                    }
                }
            }
            if (F == null || F.size() <= 0) {
                return;
            }
            we0[] we0VarArr2 = (we0[]) F.toArray(new we0[F.size()]);
            for (mc0 mc0Var2 : schedulers) {
                if (!mc0Var2.c()) {
                    mc0Var2.a(we0VarArr2);
                }
            }
        } finally {
            workDatabase.i();
        }
    }

    @z1
    private static mc0 c(@x1 Context context) {
        try {
            mc0 mc0Var = (mc0) Class.forName(a).getConstructor(Context.class).newInstance(context);
            tb0.c().a(b, String.format("Created %s", a), new Throwable[0]);
            return mc0Var;
        } catch (Throwable th) {
            tb0.c().a(b, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}