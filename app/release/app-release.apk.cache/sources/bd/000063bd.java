package com.p7700g.p99005;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;

/* compiled from: SQLiteCursorCompat.java */
/* loaded from: classes.dex */
public final class wi {

    /* compiled from: SQLiteCursorCompat.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static void a(SQLiteCursor sQLiteCursor, boolean z) {
            sQLiteCursor.setFillWindowForwardOnly(z);
        }
    }

    private wi() {
    }

    public static void a(@x1 SQLiteCursor sQLiteCursor, boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            a.a(sQLiteCursor, z);
        }
    }
}