package com.p7700g.p99005;

import android.database.sqlite.SQLiteDatabase;
import com.p7700g.p99005.r92;

/* compiled from: lambda */
/* loaded from: classes2.dex */
public final /* synthetic */ class b92 implements r92.a {
    public static final /* synthetic */ b92 a = new b92();

    @Override // com.p7700g.p99005.r92.a
    public final void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}