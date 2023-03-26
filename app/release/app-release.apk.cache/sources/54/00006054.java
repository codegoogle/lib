package com.p7700g.p99005;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.p7700g.p99005.qm3;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: OneSignalNotificationManager.java */
/* loaded from: classes3.dex */
public class um3 {
    private static final String a = "os_group_undefined";
    private static final int b = -718463522;

    @z1
    public static boolean a(Context context, String str) {
        NotificationChannel notificationChannel;
        if (pg.p(context).a()) {
            return Build.VERSION.SDK_INT < 26 || (notificationChannel = i(context).getNotificationChannel(str)) == null || notificationChannel.getImportance() != 0;
        }
        return false;
    }

    @e2(api = 24)
    public static void b(Context context, ArrayList<StatusBarNotification> arrayList) {
        Iterator<StatusBarNotification> it = arrayList.iterator();
        while (it.hasNext()) {
            StatusBarNotification next = it.next();
            pg.p(context).C(next.getId(), Notification.Builder.recoverBuilder(context, next.getNotification()).setGroup(a).setOnlyAlertOnce(true).build());
        }
    }

    @e2(api = 23)
    public static ArrayList<StatusBarNotification> c(Context context) {
        StatusBarNotification[] d;
        ArrayList<StatusBarNotification> arrayList = new ArrayList<>();
        for (StatusBarNotification statusBarNotification : d(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean f = kj3.f(statusBarNotification);
            boolean z = notification.getGroup() == null || notification.getGroup().equals(g());
            if (!f && z) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    @e2(api = 23)
    public static StatusBarNotification[] d(Context context) {
        StatusBarNotification[] statusBarNotificationArr = new StatusBarNotification[0];
        try {
            return i(context).getActiveNotifications();
        } catch (Throwable unused) {
            return statusBarNotificationArr;
        }
    }

    @e2(api = 23)
    public static Integer e(Context context) {
        StatusBarNotification[] d;
        int i = 0;
        for (StatusBarNotification statusBarNotification : d(context)) {
            if (!kg.H(statusBarNotification.getNotification()) && a.equals(statusBarNotification.getNotification().getGroup())) {
                i++;
            }
        }
        return Integer.valueOf(i);
    }

    public static int f() {
        return b;
    }

    public static String g() {
        return a;
    }

    public static Integer h(rm3 rm3Var, String str, boolean z) {
        Cursor b2 = rm3Var.b(qm3.b.a, null, wo1.t(z ? "group_id IS NULL" : "group_id = ?", " AND dismissed = 0 AND opened = 0 AND is_summary = 0"), z ? null : new String[]{str}, null, null, "created_time DESC", "1");
        if (!b2.moveToFirst()) {
            b2.close();
            return null;
        }
        Integer valueOf = Integer.valueOf(b2.getInt(b2.getColumnIndex(qm3.b.c)));
        b2.close();
        return valueOf;
    }

    public static NotificationManager i(Context context) {
        return (NotificationManager) context.getSystemService(qm3.b.a);
    }
}