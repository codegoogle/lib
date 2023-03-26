package com.anythink.expressad.foundation.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.anythink.expressad.foundation.c.d;

/* loaded from: classes2.dex */
public final class c extends b {
    private static c a;

    private c(Context context) {
        super(context);
    }

    public static synchronized c a(Context context) {
        c cVar;
        synchronized (c.class) {
            if (a == null) {
                a = new c(context.getApplicationContext());
            }
            cVar = a;
        }
        return cVar;
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(d.a.J);
        } catch (Exception e) {
            if (com.anythink.expressad.a.a) {
                e.printStackTrace();
            }
        }
    }

    private static void e(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaign'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'frequence'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'campaignclick'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'click_time'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'load_stat'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'video'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'fq_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dailyplaycap'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'display_resource_type'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'unit_id'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'c_replace_temp'");
        } catch (Exception e) {
            if (com.anythink.expressad.a.a) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.anythink.expressad.foundation.c.b
    public final void b(SQLiteDatabase sQLiteDatabase) {
        e(sQLiteDatabase);
        d(sQLiteDatabase);
    }

    @Override // com.anythink.expressad.foundation.c.b
    public final String c() {
        return "anythink_expressad.db";
    }

    @Override // com.anythink.expressad.foundation.c.b
    public final void c(SQLiteDatabase sQLiteDatabase) {
        e(sQLiteDatabase);
        d(sQLiteDatabase);
    }

    @Override // com.anythink.expressad.foundation.c.b
    public final int d() {
        return 67;
    }

    @Override // com.anythink.expressad.foundation.c.b
    public final void a(SQLiteDatabase sQLiteDatabase) {
        d(sQLiteDatabase);
    }
}