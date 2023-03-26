package com.google.android.gms.ads;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzee;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@KeepForSdkWithMembers
/* loaded from: classes2.dex */
public class MobileAdsInitProvider extends ContentProvider {
    private final zzee zza = new zzee();

    @Override // android.content.ContentProvider
    public void attachInfo(@x1 Context context, @x1 ProviderInfo providerInfo) {
        this.zza.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public int delete(@x1 Uri uri, @x1 String str, @x1 String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    @z1
    public String getType(@x1 Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    @z1
    public Uri insert(@x1 Uri uri, @x1 ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    @z1
    public Cursor query(@x1 Uri uri, @x1 String[] strArr, @x1 String str, @x1 String[] strArr2, @x1 String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(@x1 Uri uri, @x1 ContentValues contentValues, @x1 String str, @x1 String[] strArr) {
        return 0;
    }
}