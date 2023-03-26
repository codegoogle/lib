package com.p7700g.p99005;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.qm3;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: NotificationLimitManager.java */
/* loaded from: classes3.dex */
public class kj3 {
    private static final int a = 49;
    public static final String b = Integer.toString(49);

    public static void a(Context context, int i) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                c(context, i);
            } else {
                b(context, i);
            }
        } catch (Throwable unused) {
            b(context, i);
        }
    }

    public static void b(Context context, int i) {
        boolean isClosed;
        int count;
        rm3 k = rm3.k(context);
        Cursor cursor = null;
        try {
            cursor = k.b(qm3.b.a, new String[]{qm3.b.c}, rm3.r().toString(), null, null, null, "_id", e() + i);
            count = (cursor.getCount() - d()) + i;
        } catch (Throwable th) {
            try {
                jm3.b(jm3.u0.ERROR, "Error clearing oldest notifications over limit! ", th);
                if (cursor == null) {
                    return;
                }
                if (isClosed) {
                    return;
                }
            } finally {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
        }
        if (count < 1) {
            if (cursor.isClosed()) {
                return;
            }
            cursor.close();
            return;
        }
        while (cursor.moveToNext()) {
            jm3.l2(cursor.getInt(cursor.getColumnIndex(qm3.b.c)));
            count--;
            if (count <= 0) {
                break;
            }
        }
        if (cursor.isClosed()) {
        }
    }

    @e2(api = 23)
    public static void c(Context context, int i) throws Throwable {
        StatusBarNotification[] d = um3.d(context);
        int length = (d.length - d()) + i;
        if (length < 1) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (StatusBarNotification statusBarNotification : d) {
            if (!f(statusBarNotification)) {
                treeMap.put(Long.valueOf(statusBarNotification.getNotification().when), Integer.valueOf(statusBarNotification.getId()));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            jm3.l2(((Integer) entry.getValue()).intValue());
            length--;
            if (length <= 0) {
                return;
            }
        }
    }

    private static int d() {
        return 49;
    }

    private static String e() {
        return b;
    }

    @e2(api = 21)
    public static boolean f(StatusBarNotification statusBarNotification) {
        return (statusBarNotification.getNotification().flags & 512) != 0;
    }
}