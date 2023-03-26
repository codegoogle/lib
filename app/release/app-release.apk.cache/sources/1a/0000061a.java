package com.anythink.core.common.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.anythink.core.common.c.d;
import com.anythink.core.common.c.e;
import com.anythink.core.common.c.f;
import com.anythink.core.common.c.g;
import com.anythink.core.common.c.h;
import com.anythink.core.common.c.i;
import com.anythink.core.common.c.j;

/* loaded from: classes2.dex */
public class c extends b {
    private static c a;

    private c(Context context) {
        super(context);
    }

    public static c a(Context context) {
        if (a == null) {
            synchronized (c.class) {
                a = new c(context.getApplicationContext());
            }
        }
        return a;
    }

    private void c(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(d.a.f);
            sQLiteDatabase.execSQL(g.a.h);
            a(sQLiteDatabase, 3, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void d(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'sdkconfig'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'request_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'placement_ad_impression'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_action_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dsp_offer_show_record'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'dsp_offer_install_record'");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void e(SQLiteDatabase sQLiteDatabase) {
        d(sQLiteDatabase);
        c(sQLiteDatabase);
    }

    @Override // com.anythink.core.common.c.b
    public final void b(SQLiteDatabase sQLiteDatabase) {
        d(sQLiteDatabase);
        c(sQLiteDatabase);
    }

    @Override // com.anythink.core.common.c.b
    public final String c() {
        return "anythink.db";
    }

    @Override // com.anythink.core.common.c.b
    public final int d() {
        return 6;
    }

    @Override // com.anythink.core.common.c.b
    public final void a(SQLiteDatabase sQLiteDatabase) {
        c(sQLiteDatabase);
    }

    @Override // com.anythink.core.common.c.b
    public final void a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        while (i < i2) {
            if (i == 1 || i == 2) {
                d(sQLiteDatabase);
                c(sQLiteDatabase);
            } else if (i == 3) {
                sQLiteDatabase.execSQL(j.a.j);
            } else if (i == 4) {
                sQLiteDatabase.execSQL(h.a.h);
                sQLiteDatabase.execSQL(i.a.f);
            } else if (i == 5) {
                sQLiteDatabase.execSQL(f.a.h);
                sQLiteDatabase.execSQL(e.a.f);
            }
            i++;
        }
    }
}