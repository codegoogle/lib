package com.p7700g.p99005;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;
import com.p7700g.p99005.i2;

/* compiled from: IdGenerator.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class gf0 {
    public static final int a = 0;
    public static final String b = "androidx.work.util.id";
    public static final String c = "next_job_scheduler_id";
    public static final String d = "next_alarm_manager_id";
    private final WorkDatabase e;

    public gf0(@x1 WorkDatabase workDatabase) {
        this.e = workDatabase;
    }

    public static void a(@x1 Context context, @x1 n60 sqLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(b, 0);
        if (sharedPreferences.contains(c) || sharedPreferences.contains(c)) {
            int i = sharedPreferences.getInt(c, 0);
            int i2 = sharedPreferences.getInt(d, 0);
            sqLiteDatabase.t();
            try {
                sqLiteDatabase.B0(pc0.v, new Object[]{c, Integer.valueOf(i)});
                sqLiteDatabase.B0(pc0.v, new Object[]{d, Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                sqLiteDatabase.A0();
            } finally {
                sqLiteDatabase.W0();
            }
        }
    }

    private int c(String key) {
        this.e.c();
        try {
            Long b2 = this.e.G().b(key);
            int i = 0;
            int intValue = b2 != null ? b2.intValue() : 0;
            if (intValue != Integer.MAX_VALUE) {
                i = intValue + 1;
            }
            e(key, i);
            this.e.A();
            return intValue;
        } finally {
            this.e.i();
        }
    }

    private void e(String key, int value) {
        this.e.G().c(new ie0(key, value));
    }

    public int b() {
        int c2;
        synchronized (gf0.class) {
            c2 = c(d);
        }
        return c2;
    }

    public int d(int minInclusive, int maxInclusive) {
        synchronized (gf0.class) {
            int c2 = c(c);
            if (c2 >= minInclusive && c2 <= maxInclusive) {
                minInclusive = c2;
            }
            e(c, minInclusive + 1);
        }
        return minInclusive;
    }
}