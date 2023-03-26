package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.os.Build;

/* compiled from: AlarmManagerCompat.java */
/* loaded from: classes.dex */
public final class wf {

    /* compiled from: AlarmManagerCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExact(i, j, pendingIntent);
        }
    }

    /* compiled from: AlarmManagerCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static AlarmManager.AlarmClockInfo a(long j, PendingIntent pendingIntent) {
            return new AlarmManager.AlarmClockInfo(j, pendingIntent);
        }

        @e1
        public static void b(AlarmManager alarmManager, Object obj, PendingIntent pendingIntent) {
            alarmManager.setAlarmClock((AlarmManager.AlarmClockInfo) obj, pendingIntent);
        }
    }

    /* compiled from: AlarmManagerCompat.java */
    @e2(23)
    /* loaded from: classes.dex */
    public static class c {
        private c() {
        }

        @e1
        public static void a(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setAndAllowWhileIdle(i, j, pendingIntent);
        }

        @e1
        public static void b(AlarmManager alarmManager, int i, long j, PendingIntent pendingIntent) {
            alarmManager.setExactAndAllowWhileIdle(i, j, pendingIntent);
        }
    }

    private wf() {
    }

    @SuppressLint({"MissingPermission"})
    public static void a(@x1 AlarmManager alarmManager, long j, @x1 PendingIntent pendingIntent, @x1 PendingIntent pendingIntent2) {
        b.b(alarmManager, b.a(j, pendingIntent), pendingIntent2);
    }

    public static void b(@x1 AlarmManager alarmManager, int i, long j, @x1 PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            c.a(alarmManager, i, j, pendingIntent);
        } else {
            alarmManager.set(i, j, pendingIntent);
        }
    }

    public static void c(@x1 AlarmManager alarmManager, int i, long j, @x1 PendingIntent pendingIntent) {
        a.a(alarmManager, i, j, pendingIntent);
    }

    public static void d(@x1 AlarmManager alarmManager, int i, long j, @x1 PendingIntent pendingIntent) {
        if (Build.VERSION.SDK_INT >= 23) {
            c.b(alarmManager, i, j, pendingIntent);
        } else {
            c(alarmManager, i, j, pendingIntent);
        }
    }
}