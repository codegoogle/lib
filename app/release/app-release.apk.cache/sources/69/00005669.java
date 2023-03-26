package com.p7700g.p99005;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.onesignal.OSNotificationRestoreWorkManager;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.qm3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: NotificationSummaryManager.java */
/* loaded from: classes3.dex */
public class pj3 {
    public static void a(Context context, rm3 rm3Var, String str) {
        Integer b = b(rm3Var, str);
        boolean equals = str.equals(um3.g());
        NotificationManager i = um3.i(context);
        Integer h = um3.h(rm3Var, str, equals);
        if (h != null) {
            if (!jm3.e0()) {
                jm3.l2(h.intValue());
                return;
            }
            if (equals) {
                b = Integer.valueOf(um3.f());
            }
            if (b != null) {
                i.cancel(b.intValue());
            }
        }
    }

    public static Integer b(pm3 pm3Var, String str) {
        Integer num;
        Cursor d;
        Cursor cursor = null;
        try {
            d = pm3Var.d(qm3.b.a, new String[]{qm3.b.c}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1", new String[]{str}, null, null, null);
        } catch (Throwable th) {
            th = th;
            num = null;
        }
        try {
            if (!d.moveToFirst()) {
                d.close();
                if (!d.isClosed()) {
                    d.close();
                }
                return null;
            }
            Integer valueOf = Integer.valueOf(d.getInt(d.getColumnIndex(qm3.b.c)));
            d.close();
            if (d.isClosed()) {
                return valueOf;
            }
            d.close();
            return valueOf;
        } catch (Throwable th2) {
            th = th2;
            cursor = d;
            num = null;
            try {
                jm3.b(jm3.u0.ERROR, "Error getting android notification id for summary notification group: " + str, th);
                return num;
            } finally {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
        }
    }

    private static Cursor c(Context context, pm3 pm3Var, String str, boolean z) {
        Long valueOf;
        String string;
        Cursor d = pm3Var.d(qm3.b.a, new String[]{qm3.b.c, qm3.b.k, qm3.b.m}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, null, null, "_id DESC");
        int count = d.getCount();
        if (count == 0 && !str.equals(um3.g())) {
            d.close();
            Integer b = b(pm3Var, str);
            if (b == null) {
                return d;
            }
            um3.i(context).cancel(b.intValue());
            ContentValues contentValues = new ContentValues();
            contentValues.put(z ? qm3.b.h : qm3.b.g, (Integer) 1);
            pm3Var.a(qm3.b.a, contentValues, "android_notification_id = " + b, null);
            return d;
        } else if (count == 1) {
            d.close();
            if (b(pm3Var, str) == null) {
                return d;
            }
            d(context, str);
            return d;
        } else {
            try {
                d.moveToFirst();
                valueOf = Long.valueOf(d.getLong(d.getColumnIndex(qm3.b.k)));
                string = d.getString(d.getColumnIndex(qm3.b.m));
                d.close();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            if (b(pm3Var, str) == null) {
                return d;
            }
            al3 al3Var = new al3(context);
            al3Var.C(true);
            al3Var.D(valueOf);
            al3Var.u(new JSONObject(string));
            ui3.O(al3Var);
            return d;
        }
    }

    private static void d(Context context, String str) {
        String[] strArr = {str};
        Cursor cursor = null;
        try {
            cursor = rm3.k(context).d(qm3.b.a, OSNotificationRestoreWorkManager.a, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", strArr, null, null, null);
            OSNotificationRestoreWorkManager.e(context, cursor, 0);
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

    public static void e(Context context, pm3 pm3Var, int i) {
        Cursor d = pm3Var.d(qm3.b.a, new String[]{qm3.b.d}, wo1.l("android_notification_id = ", i), null, null, null, null);
        if (d.moveToFirst()) {
            String string = d.getString(d.getColumnIndex(qm3.b.d));
            d.close();
            if (string != null) {
                f(context, pm3Var, string, true);
                return;
            }
            return;
        }
        d.close();
    }

    public static void f(Context context, pm3 pm3Var, String str, boolean z) {
        try {
            Cursor c = c(context, pm3Var, str, z);
            if (c == null || c.isClosed()) {
                return;
            }
            c.close();
        } finally {
        }
    }
}