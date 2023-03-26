package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.p7700g.p99005.pn2;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* loaded from: classes3.dex */
public class FirebaseInitProvider extends ContentProvider {
    private static final String s = "FirebaseInitProvider";
    @r2
    public static final String t = "com.google.firebase.firebaseinitprovider";

    private static void a(@x1 ProviderInfo providerInfo) {
        Preconditions.checkNotNull(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if (t.equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(@x1 Context context, @x1 ProviderInfo providerInfo) {
        a(providerInfo);
        super.attachInfo(context, providerInfo);
    }

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
    public boolean onCreate() {
        pn2.v(getContext());
        return false;
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