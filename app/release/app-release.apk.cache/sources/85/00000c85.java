package com.facebook.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.p7700g.p99005.z1;

/* loaded from: classes2.dex */
public class AudienceNetworkContentProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public int delete(Uri uri, @z1 String str, @z1 String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @z1
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @z1
    public Uri insert(Uri uri, @z1 ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        Context context = getContext();
        if (context != null) {
            DynamicLoaderFactory.initialize(context, null, null, true);
            return false;
        }
        return false;
    }

    @Override // android.content.ContentProvider
    @z1
    public Cursor query(Uri uri, @z1 String[] strArr, @z1 String str, @z1 String[] strArr2, @z1 String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, @z1 ContentValues contentValues, @z1 String str, @z1 String[] strArr) {
        return 0;
    }
}