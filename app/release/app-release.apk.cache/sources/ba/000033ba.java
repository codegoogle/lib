package com.ironsource.b;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a extends SQLiteOpenHelper {
    private static a s;
    private final int t;
    private final int u;
    private final String v;
    private final String w;

    private a(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.t = 4;
        this.u = 400;
        this.v = "DROP TABLE IF EXISTS events";
        this.w = "CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )";
    }

    private synchronized SQLiteDatabase a(boolean z) {
        int i = 0;
        while (true) {
            try {
                if (z) {
                    return getWritableDatabase();
                }
                return getReadableDatabase();
            } finally {
            }
        }
    }

    public static synchronized a a(Context context, String str, int i) {
        a aVar;
        synchronized (a.class) {
            if (s == null) {
                s = new a(context, str, 5);
            }
            aVar = s;
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
        if (r11.isOpen() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006f, code lost:
        r11.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
        if (r11.isOpen() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized ArrayList<com.ironsource.mediationsdk.a.c> a(String str) {
        ArrayList<com.ironsource.mediationsdk.a.c> arrayList;
        SQLiteDatabase sQLiteDatabase;
        arrayList = new ArrayList<>();
        Cursor cursor = null;
        try {
            sQLiteDatabase = a(false);
            try {
                cursor = sQLiteDatabase.query("events", null, "type = ?", new String[]{str}, null, null, "timestamp ASC");
                if (cursor.getCount() > 0) {
                    cursor.moveToFirst();
                    while (!cursor.isAfterLast()) {
                        arrayList.add(new com.ironsource.mediationsdk.a.c(cursor.getInt(cursor.getColumnIndex("eventid")), cursor.getLong(cursor.getColumnIndex("timestamp")), new JSONObject(cursor.getString(cursor.getColumnIndex("data")))));
                        cursor.moveToNext();
                    }
                    cursor.close();
                }
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            } catch (Throwable unused) {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
                if (sQLiteDatabase != null) {
                }
                return arrayList;
            }
        } catch (Throwable unused2) {
            sQLiteDatabase = null;
        }
        return arrayList;
    }

    public final synchronized void a(List<com.ironsource.mediationsdk.a.c> list, String str) {
        SQLiteDatabase a;
        ContentValues contentValues;
        if (list != null) {
            if (!list.isEmpty()) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    a = a(true);
                } catch (Throwable unused) {
                }
                try {
                    for (com.ironsource.mediationsdk.a.c cVar : list) {
                        if (cVar != null) {
                            contentValues = new ContentValues(4);
                            contentValues.put("eventid", Integer.valueOf(cVar.a()));
                            contentValues.put("timestamp", Long.valueOf(cVar.b()));
                            contentValues.put("type", str);
                            contentValues.put("data", cVar.c());
                        } else {
                            contentValues = null;
                        }
                        if (a != null && contentValues != null) {
                            a.insert("events", null, contentValues);
                        }
                    }
                    if (a != null && a.isOpen()) {
                        a.close();
                    }
                } catch (Throwable unused2) {
                    sQLiteDatabase = a;
                    if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                        sQLiteDatabase.close();
                    }
                }
            }
        }
    }

    public final synchronized void b(String str) {
        String[] strArr = {str};
        SQLiteDatabase a = a(true);
        a.delete("events", "type = ?", strArr);
        if (a.isOpen()) {
            a.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY,eventid INTEGER,timestamp INTEGER,type TEXT,data TEXT )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS events");
        onCreate(sQLiteDatabase);
    }
}