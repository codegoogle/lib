package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.p7700g.p99005.im3;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.ki3;
import com.p7700g.p99005.kj3;
import com.p7700g.p99005.nb0;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.rm3;
import com.p7700g.p99005.um3;
import com.p7700g.p99005.vb0;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public class OSNotificationRestoreWorkManager {
    private static final int b = 200;
    public static final int d = 259200;
    public static boolean e;
    public static final String[] a = {"notification_id", qm3.b.c, qm3.b.m, qm3.b.k};
    private static final String c = NotificationRestoreWorker.class.getCanonicalName();

    /* loaded from: classes3.dex */
    public static class NotificationRestoreWorker extends Worker {
        public NotificationRestoreWorker(@x1 Context context, @x1 WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        @Override // androidx.work.Worker
        @x1
        public ListenableWorker.a doWork() {
            Context applicationContext = getApplicationContext();
            if (jm3.g == null) {
                jm3.q1(applicationContext);
            }
            if (!OSUtils.a(applicationContext)) {
                return ListenableWorker.a.a();
            }
            if (OSNotificationRestoreWorkManager.e) {
                return ListenableWorker.a.a();
            }
            OSNotificationRestoreWorkManager.e = true;
            jm3.a(jm3.u0.INFO, "Restoring notifications");
            rm3 k = rm3.k(applicationContext);
            StringBuilder r = rm3.r();
            OSNotificationRestoreWorkManager.f(applicationContext, r);
            OSNotificationRestoreWorkManager.d(applicationContext, k, r);
            return ListenableWorker.a.e();
        }
    }

    public static void c(Context context, boolean z) {
        im3.a(context).m(c, nb0.KEEP, new vb0.a(NotificationRestoreWorker.class).k(z ? 15 : 0, TimeUnit.SECONDS).b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(Context context, rm3 rm3Var, StringBuilder sb) {
        jm3.u0 u0Var = jm3.u0.INFO;
        StringBuilder G = wo1.G("Querying DB for notifications to restore: ");
        G.append(sb.toString());
        jm3.a(u0Var, G.toString());
        Cursor cursor = null;
        try {
            cursor = rm3Var.b(qm3.b.a, a, sb.toString(), null, null, null, "_id DESC", kj3.b);
            e(context, cursor, 200);
            ki3.c(rm3Var, context);
            if (cursor == null || cursor.isClosed()) {
            }
        } catch (Throwable th) {
            try {
                jm3.b(jm3.u0.ERROR, "Error restoring notification records! ", th);
                if (cursor == null) {
                    return;
                }
            } finally {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
        }
    }

    public static void e(Context context, Cursor cursor, int i) {
        if (cursor.moveToFirst()) {
            do {
                OSNotificationWorkManager.b(context, cursor.getString(cursor.getColumnIndex("notification_id")), cursor.getInt(cursor.getColumnIndex(qm3.b.c)), cursor.getString(cursor.getColumnIndex(qm3.b.m)), cursor.getLong(cursor.getColumnIndex(qm3.b.k)), true, false);
                if (i > 0) {
                    OSUtils.Y(i);
                }
            } while (cursor.moveToNext());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Context context, StringBuilder sb) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        StatusBarNotification[] d2 = um3.d(context);
        if (d2.length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : d2) {
            arrayList.add(Integer.valueOf(statusBarNotification.getId()));
        }
        sb.append(" AND android_notification_id NOT IN (");
        sb.append(TextUtils.join(",", arrayList));
        sb.append(")");
    }
}