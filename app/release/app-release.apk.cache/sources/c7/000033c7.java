package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

/* loaded from: classes3.dex */
public class CrashProvider extends ContentProvider {
    private String A;
    private Context s;
    private f t;
    private String u;
    private Uri w;
    private String z;
    private UriMatcher v = new UriMatcher(-1);
    private int x = 1;
    private int y = 2;
    private String B = "REPORTS";

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int match = this.v.match(uri);
        if (match != 1) {
            if (match == 2) {
                return this.A;
            }
            throw new IllegalArgumentException("Invalid URI: " + uri);
        }
        return this.z;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        this.s = getContext();
        this.t = new f(this.s);
        this.u = this.s.getPackageName();
        this.w = Uri.parse("content://" + this.u + "/REPORTS");
        this.z = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.A = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.v.match(uri);
        if (match != 1) {
            if (match == 2) {
                return f.a(Integer.parseInt(uri.getLastPathSegment()));
            }
            throw new IllegalArgumentException("Invalid URI: " + uri);
        }
        return f.b();
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}