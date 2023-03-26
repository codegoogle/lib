package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: SDKInitProvider.java */
/* loaded from: classes.dex */
public class x41 extends ContentProvider {
    @x1
    private static final kj1 s = kj1.b("UnifiedSDKInitProvider");
    @z1
    @SuppressLint({"StaticFieldLeak"})
    public static q51 t;

    @Override // android.content.ContentProvider
    @z1
    public Bundle call(@x1 String str, @z1 String str2, @z1 Bundle bundle) {
        if (e31.b.equals(str)) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean(e31.c, true);
            return bundle2;
        }
        return super.call(str, str2, bundle);
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
        s.c("onCreate", new Object[0]);
        Context context = (Context) r81.f(getContext());
        p51.a(context);
        t = new q51(context);
        return true;
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