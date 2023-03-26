package com.p7700g.p99005;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.p7700g.p99005.i2;

/* compiled from: Alarms.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class xc0 {
    private static final String a = tb0.f("Alarms");

    private xc0() {
    }

    public static void a(@x1 Context context, @x1 rc0 workManager, @x1 String workSpecId) {
        oe0 I = workManager.M().I();
        ne0 c = I.c(workSpecId);
        if (c != null) {
            b(context, workSpecId, c.b);
            tb0.c().a(a, String.format("Removing SystemIdInfo for workSpecId (%s)", workSpecId), new Throwable[0]);
            I.d(workSpecId);
        }
    }

    private static void b(@x1 Context context, @x1 String workSpecId, int alarmId) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(kg.v0);
        PendingIntent service = PendingIntent.getService(context, alarmId, yc0.b(context, workSpecId), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        tb0.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", workSpecId, Integer.valueOf(alarmId)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(@x1 Context context, @x1 rc0 workManager, @x1 String workSpecId, long triggerAtMillis) {
        WorkDatabase M = workManager.M();
        oe0 I = M.I();
        ne0 c = I.c(workSpecId);
        if (c != null) {
            b(context, workSpecId, c.b);
            d(context, workSpecId, c.b, triggerAtMillis);
            return;
        }
        int b = new gf0(M).b();
        I.b(new ne0(workSpecId, b));
        d(context, workSpecId, b, triggerAtMillis);
    }

    private static void d(@x1 Context context, @x1 String workSpecId, int alarmId, long triggerAtMillis) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(kg.v0);
        PendingIntent service = PendingIntent.getService(context, alarmId, yc0.b(context, workSpecId), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, triggerAtMillis, service);
        }
    }
}