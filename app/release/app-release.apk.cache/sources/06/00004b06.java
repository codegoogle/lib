package com.p7700g.p99005;

import android.database.Cursor;
import java.io.Closeable;
import java.io.IOException;

/* compiled from: CloseHelper.java */
/* loaded from: classes3.dex */
public class jp3 {
    public static void a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }

    public static void b(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}