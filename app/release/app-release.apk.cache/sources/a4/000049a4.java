package com.p7700g.p99005;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import com.greedygame.core.reporting.crash.CrashReporterService;
import com.p7700g.p99005.py2;
import com.p7700g.p99005.ta3;
import com.p7700g.p99005.va3;
import java.lang.Thread;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class j23 implements ta3, Thread.UncaughtExceptionHandler {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private Context b;
    @NotNull
    private final String c;
    @Nullable
    private final Thread.UncaughtExceptionHandler d;
    @Nullable
    private py2 e;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements py2.a {
        public b() {
        }

        @Override // com.p7700g.p99005.py2.a
        public void a(@NotNull oy2 oy2Var) {
            c25.p(oy2Var, "error");
            xz2.b("GGCREPO", "Received an ANR", oy2Var);
            j23.b(j23.this, oy2Var, true, zz2.a(this), null, 8, null);
        }
    }

    public j23(@NotNull Context context, @NotNull String str) {
        c25.p(context, "context");
        c25.p(str, com.anythink.expressad.videocommon.e.b.u);
        this.b = context;
        this.c = str;
        this.d = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        f();
        xz2.c("GGCREPO", "Crash reporting enabled");
    }

    private final void c(String str) {
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("data", str);
        Object systemService = this.b.getSystemService("jobscheduler");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobInfo.Builder extras = new JobInfo.Builder((int) System.currentTimeMillis(), new ComponentName(this.b, CrashReporterService.class)).setRequiredNetworkType(1).setOverrideDeadline(5000L).setExtras(persistableBundle);
        xz2.c("GGCREPO", "Scheduling Crash Service");
        if (((JobScheduler) systemService).schedule(extras.build()) == 1) {
            xz2.c("GGCREPO", "Crash Service Scheduled successfully");
        } else {
            xz2.c("GGCREPO", "Crash Service Could Not be scheduled.");
        }
    }

    @Override // com.p7700g.p99005.ta3
    public void a() {
        this.e = new py2(0L, 1, null).d(true).g().c(new b());
        xz2.c("GGCREPO", "Anr watchdog created");
    }

    @Override // com.p7700g.p99005.ta3
    public void b() {
        xz2.c("GGCREPO", "Anr watchdog enabled");
        py2 py2Var = this.e;
        if (py2Var == null) {
            return;
        }
        py2Var.start();
    }

    public final void d(@NotNull Throwable th, boolean z, @NotNull String str, @Nullable String str2) {
        c25.p(th, "throwable");
        c25.p(str, "tag");
        xz2.c("GGCREPO", "Logging exception to server");
        if (z) {
            xz2.c("GGCREPO", "Stopped ANRWatchDog to prevent it from sending ANR report");
            e();
        }
        c(new va3.a(this.b).d(!z).c(th).b(str).e(str2).g(this.c).l().a().toString());
    }

    public void e() {
        xz2.c("GGCREPO", "Anr watchdog disabled");
        py2 py2Var = this.e;
        if (py2Var == null) {
            return;
        }
        py2Var.interrupt();
    }

    public void f() {
        ta3.a.a(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(@NotNull Thread thread, @NotNull Throwable th) {
        c25.p(thread, "thread");
        c25.p(th, "throwable");
        xz2.c("GGCREPO", "Received exception");
        xz2.c("GGCREPO", "Stopped ANRWatchDog to prevent it from sending ANR report");
        xz2.c("GGCREPO", c25.C("Throwable: ", th.getLocalizedMessage()));
        e();
        c(new va3.a(this.b).d(true).c(th).b("").e(gc3.s.a().c()).g(this.c).c(th).l().a().toString());
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.d;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }

    public static /* synthetic */ void b(j23 j23Var, Throwable th, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = gc3.s.a().c();
        }
        j23Var.d(th, z, str, str2);
    }
}