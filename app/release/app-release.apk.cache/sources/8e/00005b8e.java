package com.p7700g.p99005;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: EventDb.java */
/* loaded from: classes2.dex */
public class s91 extends SQLiteOpenHelper {
    @x1
    private static final kj1 s = kj1.b("EventDbHelper");
    @x1
    private static final int t = 2;
    @x1
    private static final String u = "anchorfree-ucr.db";

    public s91(@x1 Context context) {
        super(context, u, (SQLiteDatabase.CursorFactory) null, 2);
    }

    private void a(@x1 SQLiteDatabase sQLiteDatabase, int i) {
        if (i != 2) {
            return;
        }
        sQLiteDatabase.execSQL(r91.f);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@x1 SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(r91.e);
            sQLiteDatabase.execSQL(r91.f);
        } catch (Throwable th) {
            s.f(th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(@x1 SQLiteDatabase sQLiteDatabase, int i, int i2) {
        try {
            sQLiteDatabase.execSQL(r91.g);
            sQLiteDatabase.execSQL(r91.h);
        } catch (Throwable th) {
            s.f(th);
        }
        onCreate(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@x1 SQLiteDatabase sQLiteDatabase, int i, int i2) {
        while (true) {
            i++;
            if (i > i2) {
                return;
            }
            try {
                a(sQLiteDatabase, i);
            } catch (Throwable th) {
                s.f(th);
            }
        }
    }
}