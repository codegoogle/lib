package com.anythink.expressad.foundation.h;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.p7700g.p99005.wo1;
import java.io.File;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class q {
    public static boolean a = false;
    public static String b = "";
    public static char[] c = {'P', 'a', 'c', 'k', 'a', 'g', 'e', 'M', 'a', 'n', 'a', 'g', 'e', 'r'};
    private static final String d = "common-exception";
    private static final String e = "SameSDCardTool";
    private static boolean f = false;
    private static int g = -1;
    private static int h = -1;
    private static int i = -1;
    private static int j = -1;

    public static void a(Context context) {
        if (f) {
            return;
        }
        try {
            try {
                b = context.getFilesDir().getAbsolutePath() + File.separator;
                if (context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) == 0) {
                    a = true;
                } else {
                    a = false;
                }
                b(context);
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            b = context.getFilesDir().getAbsolutePath() + File.separator;
            b(context);
        }
        f = true;
    }

    private static void b(Context context) {
        com.anythink.expressad.foundation.g.c.d.a(new com.anythink.expressad.foundation.g.c.b(c(context)), new com.anythink.expressad.foundation.g.c.c(b));
        com.anythink.expressad.foundation.g.c.d.a().b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        if ((c() > 31457280) == false) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String c(Context context) {
        File file;
        File externalFilesDir;
        File file2 = null;
        try {
            externalFilesDir = context.getExternalFilesDir(null);
        } catch (Throwable th) {
            n.b(d, "hasSDCard is failed", th);
        }
        if (externalFilesDir != null) {
            file = a(externalFilesDir);
            if (a) {
                if (file == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(Environment.getExternalStorageDirectory().getPath());
                    String str = File.separator;
                    wo1.h0(sb, str, "Android", str, "data");
                    sb.append(str);
                    sb.append(context.getPackageName());
                    file = a(new File(sb.toString()));
                }
            }
            file2 = file;
            if (file2 != null || !file2.exists()) {
                file2 = context.getFilesDir().getAbsoluteFile();
            }
            return file2.getAbsolutePath();
        }
        file = null;
        if (a) {
        }
        file2 = file;
        if (file2 != null) {
        }
        file2 = context.getFilesDir().getAbsoluteFile();
        return file2.getAbsolutePath();
    }

    private static boolean d() {
        return a;
    }

    private static int e() {
        try {
            Context d2 = com.anythink.expressad.foundation.b.a.b().d();
            long longValue = ((Long) u.b(d2, "freeExternalSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 1800000 || h == -1) {
                h = Long.valueOf((c() / 1000) / 1000).intValue();
                u.a(d2, "freeExternalSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            n.b(e, th.getMessage(), th);
        }
        return h;
    }

    private static boolean f() {
        return c() > 31457280;
    }

    private static int g() {
        if (g == -1) {
            try {
                g = new Long((h() / 1000) / 1000).intValue();
            } catch (Throwable th) {
                n.b(e, th.getMessage(), th);
            }
        }
        return g;
    }

    private static long h() {
        if (b()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getBlockCount() * statFs.getBlockSize();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return 0L;
    }

    private static int i() {
        try {
            Context d2 = com.anythink.expressad.foundation.b.a.b().d();
            long longValue = ((Long) u.b(d2, "TotalDataSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 1800000 || i == -1) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                i = Long.valueOf(((statFs.getBlockCount() * statFs.getBlockSize()) / 1000) / 1000).intValue();
                u.a(d2, "TotalDataSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            n.b(e, th.getMessage(), th);
        }
        return i;
    }

    private static int j() {
        try {
            Context d2 = com.anythink.expressad.foundation.b.a.b().d();
            long longValue = ((Long) u.b(d2, "FreeDataSize", 0L)).longValue();
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - longValue > 1800000 || j == -1) {
                StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
                j = Long.valueOf(((statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1000) / 1000).intValue();
                u.a(d2, "FreeDataSize", Long.valueOf(currentTimeMillis));
            }
        } catch (Throwable th) {
            n.b(e, th.getMessage(), th);
        }
        return j;
    }

    private static long k() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getAvailableBlocks() * statFs.getBlockSize();
    }

    private static long l() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return statFs.getBlockCount() * statFs.getBlockSize();
    }

    private static long d(Context context) {
        try {
            String absolutePath = context.getFilesDir().getAbsolutePath();
            StatFs statFs = new StatFs(absolutePath);
            statFs.restat(absolutePath);
            return statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Exception unused) {
            return 0L;
        }
    }

    public static boolean b() {
        try {
            return "mounted".equals(Environment.getExternalStorageState());
        } catch (Exception unused) {
            n.d("", "hasSDCard is failed");
            return false;
        }
    }

    public static long c() {
        if (b()) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getAvailableBlocks() * statFs.getBlockSize();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return 0L;
    }

    private static File a(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(UUID.randomUUID());
        File file2 = new File(file, sb.toString());
        if (file2.exists()) {
            file2.delete();
        }
        if (file2.mkdirs()) {
            file2.delete();
            return file.getAbsoluteFile();
        }
        return null;
    }

    public static String a() {
        return b;
    }

    public static boolean a(long j2) {
        return c() > j2;
    }
}