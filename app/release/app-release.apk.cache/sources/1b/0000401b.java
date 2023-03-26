package com.p7700g.p99005;

import android.database.Cursor;
import com.p7700g.p99005.p92;

/* compiled from: lambda */
/* loaded from: classes2.dex */
public final /* synthetic */ class e92 implements p92.b {
    public static final /* synthetic */ e92 a = new e92();

    @Override // com.p7700g.p99005.p92.b
    public final Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}