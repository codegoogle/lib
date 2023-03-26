package com.p7700g.p99005;

import android.os.StrictMode;
import android.util.Log;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* compiled from: RuntimeCompat.java */
/* loaded from: classes2.dex */
public final class lt1 {
    private static final String a = "GlideRuntimeCompat";
    private static final String b = "cpu[0-9]+";
    private static final String c = "/sys/devices/system/cpu/";

    /* compiled from: RuntimeCompat.java */
    /* loaded from: classes2.dex */
    public class a implements FilenameFilter {
        public final /* synthetic */ Pattern a;

        public a(Pattern pattern) {
            this.a = pattern;
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return this.a.matcher(str).matches();
        }
    }

    private lt1() {
    }

    public static int a() {
        return Runtime.getRuntime().availableProcessors();
    }

    private static int b() {
        File[] fileArr;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                fileArr = new File(c).listFiles(new a(Pattern.compile(b)));
            } catch (Throwable unused) {
                Log.isLoggable(a, 6);
                StrictMode.setThreadPolicy(allowThreadDiskReads);
                fileArr = null;
            }
            return Math.max(1, fileArr != null ? fileArr.length : 0);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }
}