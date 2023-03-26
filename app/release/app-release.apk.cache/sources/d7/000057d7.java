package com.p7700g.p99005;

import android.content.Context;
import android.os.Build;
import com.p7700g.p99005.i2;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* compiled from: WorkDatabasePathHelper.java */
@i2({i2.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public class qc0 {
    private static final String b = "androidx.work.workdb";
    private static final String a = tb0.f("WrkDbPathHelper");
    private static final String[] c = {"-journal", "-shm", "-wal"};

    private qc0() {
    }

    @x1
    @r2
    public static File a(@x1 Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return b(context);
        }
        return c(context, b);
    }

    @x1
    @r2
    public static File b(@x1 Context context) {
        return context.getDatabasePath(b);
    }

    @e2(23)
    private static File c(@x1 Context context, @x1 String filePath) {
        return new File(context.getNoBackupFilesDir(), filePath);
    }

    @x1
    public static String d() {
        return b;
    }

    public static void e(@x1 Context context) {
        String format;
        File b2 = b(context);
        if (Build.VERSION.SDK_INT < 23 || !b2.exists()) {
            return;
        }
        tb0.c().a(a, "Migrating WorkDatabase to the no-backup directory", new Throwable[0]);
        Map<File, File> f = f(context);
        for (File file : f.keySet()) {
            File file2 = f.get(file);
            if (file.exists() && file2 != null) {
                if (file2.exists()) {
                    tb0.c().h(a, String.format("Over-writing contents of %s", file2), new Throwable[0]);
                }
                if (file.renameTo(file2)) {
                    format = String.format("Migrated %s to %s", file, file2);
                } else {
                    format = String.format("Renaming %s to %s failed", file, file2);
                }
                tb0.c().a(a, format, new Throwable[0]);
            }
        }
    }

    @x1
    @r2
    public static Map<File, File> f(@x1 Context context) {
        File b2;
        File a2;
        String[] strArr;
        HashMap hashMap = new HashMap();
        if (Build.VERSION.SDK_INT >= 23) {
            hashMap.put(b(context), a(context));
            for (String str : c) {
                hashMap.put(new File(b2.getPath() + str), new File(a2.getPath() + str));
            }
        }
        return hashMap;
    }
}