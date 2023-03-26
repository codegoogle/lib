package com.p7700g.p99005;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DBStore.java */
/* loaded from: classes.dex */
public class b31 extends SQLiteOpenHelper {
    @x1
    public static final String s = "key_value";
    @x1
    public static final String t = "_key";
    @x1
    public static final String u = "_value";
    private static final int v = 2;
    @x1
    private static final String w = "key_value_store.db";
    @x1
    private static final String x = "create table key_value(_key text, _value text, primary key(_key))";
    @x1
    private static final kj1 y = kj1.b("DBStore");

    public b31(@x1 Context context) {
        super(context, w, (SQLiteDatabase.CursorFactory) null, 2);
        c41.e(context.getCacheDir());
    }

    @z1
    public static byte[] a(@z1 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.decode(bArr, 19);
    }

    @z1
    public static String b(@z1 byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return new String(Base64.encode(bArr, 19), Charset.forName("UTF-8"));
    }

    private void d(@x1 SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            cursor = sQLiteDatabase.query(s, null, null, null, null, null, null);
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndex(u));
                String string2 = cursor.getString(cursor.getColumnIndex(t));
                if (!TextUtils.isEmpty(string)) {
                    byte[] c = c41.c(string);
                    if (c != null) {
                        arrayList.add(Pair.create(string2, b(c)));
                    } else {
                        arrayList.add(Pair.create(string2, string));
                    }
                }
            }
        } catch (Throwable th) {
            try {
                y.f(th);
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ContentValues contentValues = new ContentValues();
            contentValues.put(u, (String) pair.second);
            sQLiteDatabase.updateWithOnConflict(s, contentValues, "_key=?", new String[]{(String) pair.first}, 5);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(@x1 SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(x);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(@x1 SQLiteDatabase sQLiteDatabase, int i, int i2) {
        while (i <= i2) {
            if (i == 2) {
                d(sQLiteDatabase);
            }
            i++;
        }
    }
}