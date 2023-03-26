package com.p7700g.p99005;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.p7700g.p99005.jm3;
import com.p7700g.p99005.qm3;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: OneSignalDbHelper.java */
/* loaded from: classes3.dex */
public class rm3 extends SQLiteOpenHelper implements pm3 {
    private static final String A = ",";
    private static final int B = 5;
    private static final int C = 400;
    public static final String D = "CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);";
    private static final String E = "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);";
    private static rm3 H = null;
    public static final int s = 8;
    private static final String u = "OneSignal.db";
    private static final String v = " INTEGER PRIMARY KEY";
    private static final String w = " TEXT";
    private static final String x = " INTEGER";
    private static final String y = " FLOAT";
    private static final String z = " TIMESTAMP";
    private static final Object t = new Object();
    public static final String[] F = {qm3.b.n, qm3.b.o, qm3.b.p, qm3.b.q, qm3.b.r, qm3.b.s};
    private static tk3 G = new sk3();
    private static wo3 I = new wo3();

    public rm3(Context context) {
        super(context, u, (SQLiteDatabase.CursorFactory) null, j());
    }

    private static void A(SQLiteDatabase sQLiteDatabase) {
        s(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
        s(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
        s(sQLiteDatabase, qm3.b.s);
    }

    private static void E(SQLiteDatabase sQLiteDatabase) {
        s(sQLiteDatabase, zo3.j);
    }

    private static void F(SQLiteDatabase sQLiteDatabase) {
        s(sQLiteDatabase, zo3.m);
        w(sQLiteDatabase);
    }

    private static void K(SQLiteDatabase sQLiteDatabase) {
        s(sQLiteDatabase, E);
    }

    private void P(SQLiteDatabase sQLiteDatabase) {
        I.c(sQLiteDatabase);
        I.a(sQLiteDatabase);
    }

    private static int j() {
        return 8;
    }

    public static rm3 k(Context context) {
        if (H == null) {
            synchronized (t) {
                if (H == null) {
                    H = new rm3(context.getApplicationContext());
                }
            }
        }
        return H;
    }

    private SQLiteDatabase l() {
        SQLiteDatabase writableDatabase;
        synchronized (t) {
            try {
                try {
                    writableDatabase = getWritableDatabase();
                } catch (SQLiteCantOpenDatabaseException e) {
                    throw e;
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                }
            } finally {
            }
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0018 A[Catch: all -> 0x000b, LOOP:0: B:21:0x0005->B:17:0x0018, LOOP_END, TryCatch #2 {all -> 0x000b, blocks: (B:5:0x0005, B:6:0x0009, B:15:0x0013, B:17:0x0018, B:18:0x001f), top: B:21:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private SQLiteDatabase m() {
        SQLiteDatabase l;
        synchronized (t) {
            Throwable th = null;
            int i = 0;
            while (true) {
                try {
                    try {
                        l = l();
                    } catch (SQLiteCantOpenDatabaseException e) {
                        e = e;
                        if (th == null) {
                            th = e;
                        }
                        i++;
                        if (i >= 5) {
                            SystemClock.sleep(i * C);
                        } else {
                            throw th;
                        }
                    } catch (SQLiteDatabaseLockedException e2) {
                        e = e2;
                        if (th == null) {
                        }
                        i++;
                        if (i >= 5) {
                        }
                    }
                    SystemClock.sleep(i * C);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return l;
    }

    private void q(SQLiteDatabase sQLiteDatabase, int i) {
        if (i < 2) {
            z(sQLiteDatabase);
        }
        if (i < 3) {
            A(sQLiteDatabase);
        }
        if (i < 4) {
            E(sQLiteDatabase);
        }
        if (i < 5) {
            F(sQLiteDatabase);
        }
        if (i == 5) {
            w(sQLiteDatabase);
        }
        if (i < 7) {
            K(sQLiteDatabase);
        }
        if (i < 8) {
            P(sQLiteDatabase);
        }
    }

    public static StringBuilder r() {
        long b = jm3.X0().b() / 1000;
        StringBuilder sb = new StringBuilder();
        sb.append("created_time > ");
        sb.append(b - 604800);
        sb.append(" AND ");
        sb.append(qm3.b.h);
        wo1.h0(sb, " = 0 AND ", qm3.b.g, " = 0 AND ", qm3.b.f);
        sb.append(" = 0");
        StringBuilder sb2 = new StringBuilder(sb.toString());
        if (jm3.H0().o()) {
            sb2.append(" AND expire_time > " + b);
        }
        return sb2;
    }

    private static void s(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
    }

    private static void w(SQLiteDatabase sQLiteDatabase) {
        I.b(sQLiteDatabase);
    }

    private static void z(SQLiteDatabase sQLiteDatabase) {
        s(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
        s(sQLiteDatabase, qm3.b.p);
    }

    @Override // com.p7700g.p99005.pm3
    public int a(@x1 String str, @x1 ContentValues contentValues, @z1 String str2, @z1 String[] strArr) {
        tk3 tk3Var;
        String str3;
        tk3 tk3Var2;
        String str4;
        int i = 0;
        if (contentValues == null || contentValues.toString().isEmpty()) {
            return 0;
        }
        synchronized (t) {
            SQLiteDatabase m = m();
            try {
                m.beginTransaction();
                i = m.update(str, contentValues, str2, strArr);
                m.setTransactionSuccessful();
            } catch (SQLiteException e) {
                tk3 tk3Var3 = G;
                tk3Var3.a("Error updating on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e);
                if (m != null) {
                    try {
                        try {
                            m.endTransaction();
                        } catch (SQLiteException e2) {
                            e = e2;
                            tk3Var2 = G;
                            str4 = "Error closing transaction! ";
                            tk3Var2.a(str4, e);
                            return i;
                        }
                    } catch (IllegalStateException e3) {
                        e = e3;
                        tk3Var = G;
                        str3 = "Error closing transaction! ";
                        tk3Var.a(str3, e);
                        return i;
                    }
                }
            } catch (IllegalStateException e4) {
                tk3 tk3Var4 = G;
                tk3Var4.a("Error under update transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e4);
                if (m != null) {
                    try {
                        m.endTransaction();
                    } catch (SQLiteException e5) {
                        e = e5;
                        tk3Var2 = G;
                        str4 = "Error closing transaction! ";
                        tk3Var2.a(str4, e);
                        return i;
                    } catch (IllegalStateException e6) {
                        e = e6;
                        tk3Var = G;
                        str3 = "Error closing transaction! ";
                        tk3Var.a(str3, e);
                        return i;
                    }
                }
            }
            try {
                m.endTransaction();
            } catch (SQLiteException e7) {
                e = e7;
                tk3Var2 = G;
                str4 = "Error closing transaction! ";
                tk3Var2.a(str4, e);
                return i;
            } catch (IllegalStateException e8) {
                e = e8;
                tk3Var = G;
                str3 = "Error closing transaction! ";
                tk3Var.a(str3, e);
                return i;
            }
        }
        return i;
    }

    @Override // com.p7700g.p99005.pm3
    public Cursor b(@x1 String str, @z1 String[] strArr, @z1 String str2, @z1 String[] strArr2, @z1 String str3, @z1 String str4, @z1 String str5, @z1 String str6) {
        Cursor query;
        synchronized (t) {
            query = m().query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        }
        return query;
    }

    @Override // com.p7700g.p99005.pm3
    public Cursor d(@x1 String str, @z1 String[] strArr, @z1 String str2, String[] strArr2, @z1 String str3, @z1 String str4, @z1 String str5) {
        Cursor query;
        synchronized (t) {
            query = m().query(str, strArr, str2, strArr2, str3, str4, str5);
        }
        return query;
    }

    @Override // com.p7700g.p99005.pm3
    public void e(@x1 String str, @z1 String str2, @z1 ContentValues contentValues) throws SQLException {
        tk3 tk3Var;
        String str3;
        tk3 tk3Var2;
        String str4;
        synchronized (t) {
            SQLiteDatabase m = m();
            try {
                m.beginTransaction();
                m.insertOrThrow(str, str2, contentValues);
                m.setTransactionSuccessful();
            } catch (SQLiteException e) {
                tk3 tk3Var3 = G;
                tk3Var3.a("Error inserting or throw on table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e);
                if (m != null) {
                    try {
                        try {
                            m.endTransaction();
                        } catch (SQLiteException e2) {
                            e = e2;
                            tk3Var2 = G;
                            str4 = "Error closing transaction! ";
                            tk3Var2.a(str4, e);
                        }
                    } catch (IllegalStateException e3) {
                        e = e3;
                        tk3Var = G;
                        str3 = "Error closing transaction! ";
                        tk3Var.a(str3, e);
                    }
                }
            } catch (IllegalStateException e4) {
                tk3 tk3Var4 = G;
                tk3Var4.a("Error under inserting or throw transaction under table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e4);
                if (m != null) {
                    try {
                        m.endTransaction();
                    } catch (SQLiteException e5) {
                        e = e5;
                        tk3Var2 = G;
                        str4 = "Error closing transaction! ";
                        tk3Var2.a(str4, e);
                    } catch (IllegalStateException e6) {
                        e = e6;
                        tk3Var = G;
                        str3 = "Error closing transaction! ";
                        tk3Var.a(str3, e);
                    }
                }
            }
            try {
                m.endTransaction();
            } catch (SQLiteException e7) {
                e = e7;
                tk3Var2 = G;
                str4 = "Error closing transaction! ";
                tk3Var2.a(str4, e);
            } catch (IllegalStateException e8) {
                e = e8;
                tk3Var = G;
                str3 = "Error closing transaction! ";
                tk3Var.a(str3, e);
            }
        }
    }

    @Override // com.p7700g.p99005.pm3
    public void f(@x1 String str, @z1 String str2, @z1 String[] strArr) {
        tk3 tk3Var;
        String str3;
        tk3 tk3Var2;
        String str4;
        synchronized (t) {
            SQLiteDatabase m = m();
            try {
                m.beginTransaction();
                m.delete(str, str2, strArr);
                m.setTransactionSuccessful();
            } catch (SQLiteException e) {
                tk3 tk3Var3 = G;
                tk3Var3.a("Error deleting on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e);
                if (m != null) {
                    try {
                        try {
                            m.endTransaction();
                        } catch (SQLiteException e2) {
                            e = e2;
                            tk3Var2 = G;
                            str4 = "Error closing transaction! ";
                            tk3Var2.a(str4, e);
                        }
                    } catch (IllegalStateException e3) {
                        e = e3;
                        tk3Var = G;
                        str3 = "Error closing transaction! ";
                        tk3Var.a(str3, e);
                    }
                }
            } catch (IllegalStateException e4) {
                tk3 tk3Var4 = G;
                tk3Var4.a("Error under delete transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e4);
                if (m != null) {
                    try {
                        m.endTransaction();
                    } catch (SQLiteException e5) {
                        e = e5;
                        tk3Var2 = G;
                        str4 = "Error closing transaction! ";
                        tk3Var2.a(str4, e);
                    } catch (IllegalStateException e6) {
                        e = e6;
                        tk3Var = G;
                        str3 = "Error closing transaction! ";
                        tk3Var.a(str3, e);
                    }
                }
            }
            try {
                m.endTransaction();
            } catch (SQLiteException e7) {
                e = e7;
                tk3Var2 = G;
                str4 = "Error closing transaction! ";
                tk3Var2.a(str4, e);
            } catch (IllegalStateException e8) {
                e = e8;
                tk3Var = G;
                str3 = "Error closing transaction! ";
                tk3Var.a(str3, e);
            }
        }
    }

    @Override // com.p7700g.p99005.pm3
    public void h(@x1 String str, @z1 String str2, @z1 ContentValues contentValues) {
        tk3 tk3Var;
        String str3;
        tk3 tk3Var2;
        String str4;
        synchronized (t) {
            SQLiteDatabase m = m();
            try {
                m.beginTransaction();
                m.insert(str, str2, contentValues);
                m.setTransactionSuccessful();
            } catch (SQLiteException e) {
                tk3 tk3Var3 = G;
                tk3Var3.a("Error inserting on table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e);
                if (m != null) {
                    try {
                        try {
                            m.endTransaction();
                        } catch (SQLiteException e2) {
                            e = e2;
                            tk3Var2 = G;
                            str4 = "Error closing transaction! ";
                            tk3Var2.a(str4, e);
                        }
                    } catch (IllegalStateException e3) {
                        e = e3;
                        tk3Var = G;
                        str3 = "Error closing transaction! ";
                        tk3Var.a(str3, e);
                    }
                }
            } catch (IllegalStateException e4) {
                tk3 tk3Var4 = G;
                tk3Var4.a("Error under inserting transaction under table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e4);
                if (m != null) {
                    try {
                        m.endTransaction();
                    } catch (SQLiteException e5) {
                        e = e5;
                        tk3Var2 = G;
                        str4 = "Error closing transaction! ";
                        tk3Var2.a(str4, e);
                    } catch (IllegalStateException e6) {
                        e = e6;
                        tk3Var = G;
                        str3 = "Error closing transaction! ";
                        tk3Var.a(str3, e);
                    }
                }
            }
            try {
                m.endTransaction();
            } catch (SQLiteException e7) {
                e = e7;
                tk3Var2 = G;
                str4 = "Error closing transaction! ";
                tk3Var2.a(str4, e);
            } catch (IllegalStateException e8) {
                e = e8;
                tk3Var = G;
                str3 = "Error closing transaction! ";
                tk3Var.a(str3, e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (t) {
            sQLiteDatabase.execSQL(D);
            sQLiteDatabase.execSQL(zo3.l);
            sQLiteDatabase.execSQL(zo3.n);
            sQLiteDatabase.execSQL(E);
            for (String str : F) {
                sQLiteDatabase.execSQL(str);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        jm3.a(jm3.u0.WARN, "SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.");
        synchronized (t) {
            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
            ArrayList arrayList = new ArrayList(rawQuery.getCount());
            while (rawQuery.moveToNext()) {
                arrayList.add(rawQuery.getString(0));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!str.startsWith("sqlite_")) {
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                }
            }
            rawQuery.close();
            onCreate(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        jm3.u0 u0Var = jm3.u0.DEBUG;
        jm3.a(u0Var, "OneSignal Database onUpgrade from: " + i + " to: " + i2);
        synchronized (t) {
            try {
                q(sQLiteDatabase, i);
            } catch (SQLiteException e) {
                jm3.b(jm3.u0.ERROR, "Error in upgrade, migration may have already run! Skipping!", e);
            }
        }
    }

    public void v(wo3 wo3Var) {
        I = wo3Var;
    }
}