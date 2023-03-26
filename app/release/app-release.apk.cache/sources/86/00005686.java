package com.p7700g.p99005;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;

/* compiled from: OneSignalDb.java */
/* loaded from: classes3.dex */
public interface pm3 {
    int a(@x1 String str, @x1 ContentValues contentValues, @z1 String str2, @z1 String[] strArr);

    Cursor b(@x1 String str, @z1 String[] strArr, @z1 String str2, @z1 String[] strArr2, @z1 String str3, @z1 String str4, @z1 String str5, @z1 String str6);

    Cursor d(@x1 String str, @z1 String[] strArr, @z1 String str2, String[] strArr2, @z1 String str3, @z1 String str4, @z1 String str5);

    void e(@x1 String str, @z1 String str2, @z1 ContentValues contentValues) throws SQLException;

    void f(@x1 String str, @z1 String str2, @z1 String[] strArr);

    void h(@x1 String str, @z1 String str2, @z1 ContentValues contentValues);
}