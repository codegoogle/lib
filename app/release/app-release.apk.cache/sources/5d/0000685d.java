package com.p7700g.p99005;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* compiled from: BaseSDKContentProvider.java */
/* loaded from: classes.dex */
public abstract class z11 extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(@x1 Uri uri, @z1 String str, @z1 String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @z1
    public String getType(@x1 Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @z1
    public Uri insert(@x1 Uri uri, @z1 ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    @z1
    public Cursor query(@x1 Uri uri, @z1 String[] strArr, @z1 String str, @z1 String[] strArr2, @z1 String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@x1 Uri uri, @z1 ContentValues contentValues, @z1 String str, @z1 String[] strArr) {
        return 0;
    }
}