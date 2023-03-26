package com.anchorfree.ucr;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.p7700g.p99005.r81;
import com.p7700g.p99005.r91;
import com.p7700g.p99005.s91;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.util.Objects;

/* loaded from: classes2.dex */
public class UCRContentProvider extends ContentProvider {
    private static final int s = 1;
    private static final int t = 2;
    private static final int u = 3;
    @x1
    private static final UriMatcher v = new UriMatcher(-1);
    @z1
    private s91 w;

    @x1
    public static String a(@x1 Context context) {
        return String.format("%s.ucr.provider", context.getPackageName());
    }

    @x1
    public static Uri b(@x1 Context context) {
        return Uri.parse(String.format("content://%s.ucr.provider/events", context.getPackageName()));
    }

    @x1
    public static Uri c(@x1 Context context) {
        return Uri.parse(String.format("content://%s.ucr.provider/history", context.getPackageName()));
    }

    @Override // android.content.ContentProvider
    public int delete(@x1 Uri uri, @z1 String str, @z1 String[] strArr) {
        SQLiteDatabase writableDatabase;
        int match;
        try {
            writableDatabase = ((s91) r81.f(this.w)).getWritableDatabase();
            match = v.match(uri);
        } catch (Throwable unused) {
        }
        if (match != 1) {
            if (match != 2) {
                if (match == 3) {
                    return writableDatabase.delete(r91.b.a, str, strArr);
                }
                return 0;
            }
            return writableDatabase.delete("entry", "_id=?", new String[]{uri.getLastPathSegment()});
        }
        return writableDatabase.delete("entry", str, strArr);
    }

    @Override // android.content.ContentProvider
    @z1
    public String getType(@x1 Uri uri) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override // android.content.ContentProvider
    @z1
    public Uri insert(@x1 Uri uri, @z1 ContentValues contentValues) {
        UriMatcher uriMatcher;
        try {
            uriMatcher = v;
        } catch (Throwable unused) {
        }
        if (uriMatcher.match(uri) == 1) {
            long insert = ((s91) r81.f(this.w)).getWritableDatabase().insert("entry", null, contentValues);
            Context context = getContext();
            Objects.requireNonNull(context);
            Uri withAppendedPath = Uri.withAppendedPath(b(context), String.valueOf(insert));
            getContext().getContentResolver().notifyChange(withAppendedPath, null);
            return withAppendedPath;
        }
        if (uriMatcher.match(uri) == 3) {
            long insert2 = ((s91) r81.f(this.w)).getWritableDatabase().insert(r91.b.a, null, contentValues);
            Context context2 = getContext();
            Objects.requireNonNull(context2);
            Uri withAppendedPath2 = Uri.withAppendedPath(c(context2), String.valueOf(insert2));
            getContext().getContentResolver().notifyChange(withAppendedPath2, null);
            return withAppendedPath2;
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.w = new s91((Context) r81.f(getContext()));
        UriMatcher uriMatcher = v;
        uriMatcher.addURI(a(getContext()), "events", 1);
        uriMatcher.addURI(a(getContext()), "events/#", 2);
        uriMatcher.addURI(a(getContext()), r91.b.a, 3);
        return true;
    }

    @Override // android.content.ContentProvider
    @z1
    public Cursor query(@x1 Uri uri, @z1 String[] strArr, @z1 String str, @z1 String[] strArr2, @z1 String str2) {
        try {
            SQLiteDatabase readableDatabase = ((s91) r81.f(this.w)).getReadableDatabase();
            int match = v.match(uri);
            if (match != 1) {
                if (match != 2) {
                    if (match != 3) {
                        return null;
                    }
                    return readableDatabase.query(r91.b.a, strArr, null, null, null, null, str2);
                }
                return readableDatabase.query("entry", strArr, "_id=?", new String[]{uri.getLastPathSegment()}, null, null, null);
            }
            return readableDatabase.query("entry", strArr, str, strArr2, null, null, str2);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public int update(@x1 Uri uri, @z1 ContentValues contentValues, @z1 String str, @z1 String[] strArr) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}