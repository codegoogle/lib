package com.p7700g.p99005;

import android.os.Environment;
import java.io.File;

/* compiled from: EnvironmentCompat.java */
/* loaded from: classes.dex */
public final class qm {
    private static final String a = "EnvironmentCompat";
    public static final String b = "unknown";

    /* compiled from: EnvironmentCompat.java */
    @e2(19)
    /* loaded from: classes.dex */
    public static class a {
        private a() {
        }

        @e1
        public static String a(File file) {
            return Environment.getStorageState(file);
        }
    }

    /* compiled from: EnvironmentCompat.java */
    @e2(21)
    /* loaded from: classes.dex */
    public static class b {
        private b() {
        }

        @e1
        public static String a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    private qm() {
    }

    @x1
    public static String a(@x1 File file) {
        return b.a(file);
    }
}