package com.p7700g.p99005;

import android.database.CursorWindow;
import android.os.Build;

/* compiled from: CursorWindowCompat.java */
/* loaded from: classes.dex */
public final class ui {

    /* compiled from: CursorWindowCompat.java */
    @e2(15)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static CursorWindow a(String str) {
            return new CursorWindow(str);
        }
    }

    /* compiled from: CursorWindowCompat.java */
    @e2(28)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static CursorWindow a(String str, long j) {
            return new CursorWindow(str, j);
        }
    }

    private ui() {
    }

    @x1
    public static CursorWindow a(@z1 String str, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.a(str, j);
        }
        return a.a(str);
    }
}