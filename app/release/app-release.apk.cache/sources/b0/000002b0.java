package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.work.impl.WorkDatabase;
import com.p7700g.p99005.dc0;
import com.p7700g.p99005.fd0;
import com.p7700g.p99005.hb0;
import com.p7700g.p99005.i2;
import com.p7700g.p99005.jm;
import com.p7700g.p99005.kf0;
import com.p7700g.p99005.kg;
import com.p7700g.p99005.nc0;
import com.p7700g.p99005.qb0;
import com.p7700g.p99005.qc0;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.rc0;
import com.p7700g.p99005.tb0;
import com.p7700g.p99005.ue0;
import com.p7700g.p99005.we0;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.xe0;
import com.p7700g.p99005.z1;
import java.util.List;
import java.util.concurrent.TimeUnit;

@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {
    @r2
    public static final String t = "ACTION_FORCE_STOP_RESCHEDULE";
    @r2
    public static final int u = 3;
    private static final int v = -1;
    private static final long w = 300;
    private int A = 0;
    private final Context y;
    private final rc0 z;
    private static final String s = tb0.f("ForceStopRunnable");
    private static final long x = TimeUnit.DAYS.toMillis(3650);

    @i2({i2.a.LIBRARY_GROUP})
    /* loaded from: classes.dex */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {
        private static final String a = tb0.f("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(@x1 Context context, @z1 Intent intent) {
            if (intent == null || !ForceStopRunnable.t.equals(intent.getAction())) {
                return;
            }
            tb0.c().g(a, "Rescheduling alarm that keeps track of force-stops.", new Throwable[0]);
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(@x1 Context context, @x1 rc0 workManager) {
        this.y = context.getApplicationContext();
        this.z = workManager;
    }

    @r2
    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, BroadcastReceiver.class));
        intent.setAction(t);
        return intent;
    }

    private static PendingIntent d(Context context, int flags) {
        return PendingIntent.getBroadcast(context, -1, c(context), flags);
    }

    @SuppressLint({"ClassVerificationFailure"})
    public static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(kg.v0);
        PendingIntent d = d(context, jm.i() ? 167772160 : 134217728);
        long currentTimeMillis = System.currentTimeMillis() + x;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, d);
        }
    }

    @r2
    public boolean a() {
        boolean i = Build.VERSION.SDK_INT >= 23 ? fd0.i(this.y, this.z) : false;
        WorkDatabase M = this.z.M();
        xe0 L = M.L();
        ue0 K = M.K();
        M.c();
        try {
            List<we0> n = L.n();
            boolean z = (n == null || n.isEmpty()) ? false : true;
            if (z) {
                for (we0 we0Var : n) {
                    L.b(dc0.a.ENQUEUED, we0Var.d);
                    L.d(we0Var.d, -1L);
                }
            }
            K.d();
            M.A();
            return z || i;
        } finally {
            M.i();
        }
    }

    @r2
    public void b() {
        boolean a = a();
        if (h()) {
            tb0.c().a(s, "Rescheduling Workers.", new Throwable[0]);
            this.z.R();
            this.z.I().f(false);
        } else if (e()) {
            tb0.c().a(s, "Application was force-stopped, rescheduling.", new Throwable[0]);
            this.z.R();
        } else if (a) {
            tb0.c().a(s, "Found unfinished work, scheduling it.", new Throwable[0]);
            nc0.b(this.z.F(), this.z.M(), this.z.L());
        }
    }

    @r2
    @SuppressLint({"ClassVerificationFailure"})
    public boolean e() {
        try {
            PendingIntent d = d(this.y, jm.i() ? 570425344 : 536870912);
            if (Build.VERSION.SDK_INT >= 30) {
                if (d != null) {
                    d.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.y.getSystemService(ActivityChooserModel.ATTRIBUTE_ACTIVITY)).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    for (int i = 0; i < historicalProcessExitReasons.size(); i++) {
                        if (historicalProcessExitReasons.get(i).getReason() == 10) {
                            return true;
                        }
                    }
                }
            } else if (d == null) {
                g(this.y);
                return true;
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e) {
            tb0.c().h(s, "Ignoring exception", e);
            return true;
        }
    }

    @r2
    public boolean f() {
        hb0 F = this.z.F();
        if (TextUtils.isEmpty(F.c())) {
            tb0.c().a(s, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean b = kf0.b(this.y, F);
        tb0.c().a(s, String.format("Is default app process = %s", Boolean.valueOf(b)), new Throwable[0]);
        return b;
    }

    @r2
    public boolean h() {
        return this.z.I().c();
    }

    @r2
    public void i(long duration) {
        try {
            Thread.sleep(duration);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i;
        try {
            if (f()) {
                while (true) {
                    qc0.e(this.y);
                    tb0.c().a(s, "Performing cleanup operations.", new Throwable[0]);
                    try {
                        b();
                        break;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e) {
                        i = this.A + 1;
                        this.A = i;
                        if (i >= 3) {
                            tb0 c = tb0.c();
                            String str = s;
                            c.b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            qb0 d = this.z.F().d();
                            if (d != null) {
                                tb0.c().a(str, "Routing exception to the specified exception handler", illegalStateException);
                                d.a(illegalStateException);
                            } else {
                                throw illegalStateException;
                            }
                        } else {
                            tb0.c().a(s, String.format("Retrying after %s", Long.valueOf(i * 300)), e);
                            i(this.A * 300);
                        }
                    }
                    tb0.c().a(s, String.format("Retrying after %s", Long.valueOf(i * 300)), e);
                    i(this.A * 300);
                }
            }
        } finally {
            this.z.Q();
        }
    }
}