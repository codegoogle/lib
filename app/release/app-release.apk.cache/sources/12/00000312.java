package com.anchorfree.sdk;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.text.TextUtils;
import com.p7700g.p99005.b31;
import com.p7700g.p99005.c41;
import com.p7700g.p99005.kj1;
import com.p7700g.p99005.r81;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public class DBProvider extends ContentProvider {
    @x1
    public static final String s = "keys";
    @x1
    public static final String t = "keys/*";
    @x1
    private static final kj1 u = kj1.b("DBProvider");
    @x1
    private final UriMatcher v = new UriMatcher(-1);
    @z1
    private b31 w;
    @z1
    private String x;

    @x1
    public static String a(@x1 Context context) {
        return String.format("%s.hydra.sdk.db.provider", context.getPackageName());
    }

    @x1
    private Uri b() {
        StringBuilder G = wo1.G("content://");
        G.append(this.x);
        return Uri.withAppendedPath(Uri.parse(G.toString()), s);
    }

    @x1
    @z1
    private String c(@x1 String str) {
        byte[] c;
        return (TextUtils.isEmpty(str) || (c = c41.c(str)) == null) ? str : b31.b(c);
    }

    @Override // android.content.ContentProvider
    public int delete(@x1 Uri uri, @z1 String str, @z1 String[] strArr) {
        try {
            int match = this.v.match(uri);
            if (match == 1 || match == 2) {
                int delete = ((b31) r81.f(this.w)).getWritableDatabase().delete(b31.s, str, strArr);
                getContext().getContentResolver().notifyChange(Uri.withAppendedPath(b(), uri.getLastPathSegment()), null);
                return delete;
            }
            return 0;
        } catch (Throwable th) {
            u.f(th);
            return 0;
        }
    }

    @Override // android.content.ContentProvider
    @z1
    public String getType(@x1 Uri uri) {
        int match = this.v.match(uri);
        if (match == 1 || match == 2) {
            return "key/value";
        }
        return null;
    }

    @Override // android.content.ContentProvider
    @z1
    public Uri insert(@x1 Uri uri, @x1 ContentValues contentValues) {
        try {
        } catch (Throwable th) {
            u.f(th);
        }
        if (this.v.match(uri) != 1) {
            return null;
        }
        String asString = contentValues.getAsString(b31.t);
        String asString2 = contentValues.getAsString(b31.u);
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put(b31.t, asString);
        contentValues2.put(b31.u, c(asString2));
        ((b31) r81.f(this.w)).getWritableDatabase().insertWithOnConflict(b31.s, null, contentValues2, 5);
        Uri withAppendedPath = Uri.withAppendedPath(b(), asString);
        getContext().getContentResolver().notifyChange(withAppendedPath, null);
        return withAppendedPath;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.w = new b31(getContext());
        String a = a(getContext());
        this.x = a;
        this.v.addURI(a, s, 1);
        this.v.addURI(this.x, t, 2);
        return true;
    }

    @Override // android.content.ContentProvider
    @z1
    public Cursor query(@x1 Uri uri, @z1 String[] strArr, @z1 String str, @z1 String[] strArr2, @z1 String str2) {
        Cursor cursor;
        byte[] a;
        try {
        } catch (Throwable th) {
            th = th;
            cursor = null;
        }
        if (this.v.match(uri) != 1) {
            return null;
        }
        cursor = ((b31) r81.f(this.w)).getReadableDatabase().query(b31.s, strArr, str, strArr2, null, null, str2);
        try {
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{b31.t, b31.u}, cursor.getCount());
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndex(b31.u));
                if (!TextUtils.isEmpty(string) && (a = b31.a(string.getBytes(Charset.forName("UTF-8")))) != null) {
                    string = c41.b(a);
                }
                matrixCursor.addRow(new Object[]{cursor.getString(cursor.getColumnIndex(b31.t)), string});
            }
            cursor.close();
            return matrixCursor;
        } catch (Throwable th2) {
            th = th2;
            try {
                u.f(th);
                return null;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    @Override // android.content.ContentProvider
    public int update(@x1 Uri uri, @z1 ContentValues contentValues, @z1 String str, @z1 String[] strArr) {
        try {
            int match = this.v.match(uri);
            if (match == 1 || match == 2) {
                int updateWithOnConflict = ((b31) r81.f(this.w)).getWritableDatabase().updateWithOnConflict(b31.s, contentValues, str, strArr, 5);
                getContext().getContentResolver().notifyChange(Uri.withAppendedPath(b(), uri.getLastPathSegment()), null);
                return updateWithOnConflict;
            }
            return 0;
        } catch (Throwable th) {
            u.f(th);
            return 0;
        }
    }
}