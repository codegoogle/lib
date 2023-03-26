package com.anchorfree.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.x41;
import com.p7700g.p99005.z1;

/* loaded from: classes.dex */
public class UnifiedSDKInitProviderMain extends x41 {
    @Override // com.p7700g.p99005.x41, android.content.ContentProvider
    @z1
    public /* bridge */ /* synthetic */ Bundle call(@x1 String str, @z1 String str2, @z1 Bundle bundle) {
        return super.call(str, str2, bundle);
    }

    @Override // com.p7700g.p99005.x41, android.content.ContentProvider
    public /* bridge */ /* synthetic */ int delete(@x1 Uri uri, @z1 String str, @z1 String[] strArr) {
        return super.delete(uri, str, strArr);
    }

    @Override // com.p7700g.p99005.x41, android.content.ContentProvider
    @z1
    public /* bridge */ /* synthetic */ String getType(@x1 Uri uri) {
        return super.getType(uri);
    }

    @Override // com.p7700g.p99005.x41, android.content.ContentProvider
    @z1
    public /* bridge */ /* synthetic */ Uri insert(@x1 Uri uri, @z1 ContentValues contentValues) {
        return super.insert(uri, contentValues);
    }

    @Override // com.p7700g.p99005.x41, android.content.ContentProvider
    public /* bridge */ /* synthetic */ boolean onCreate() {
        return super.onCreate();
    }

    @Override // com.p7700g.p99005.x41, android.content.ContentProvider
    @z1
    public /* bridge */ /* synthetic */ Cursor query(@x1 Uri uri, @z1 String[] strArr, @z1 String str, @z1 String[] strArr2, @z1 String str2) {
        return super.query(uri, strArr, str, strArr2, str2);
    }

    @Override // com.p7700g.p99005.x41, android.content.ContentProvider
    public /* bridge */ /* synthetic */ int update(@x1 Uri uri, @z1 ContentValues contentValues, @z1 String str, @z1 String[] strArr) {
        return super.update(uri, contentValues, str, strArr);
    }
}