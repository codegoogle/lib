package com.anythink.core.common.j;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class j {
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
        if ((b() <= 31457280) != false) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static File a(Context context) {
        File file;
        File externalFilesDir;
        File file2 = null;
        try {
            externalFilesDir = context.getExternalFilesDir(null);
        } catch (Throwable unused) {
        }
        if (externalFilesDir != null) {
            file = a(externalFilesDir);
            if (file != null) {
                return file;
            }
            if (file == null && b(context)) {
                file = a(new File(Environment.getExternalStorageDirectory().getPath() + File.separator + context.getPackageName()));
            }
            file2 = file;
            return file2 != null ? new File(context.getFilesDir().getAbsoluteFile().getAbsolutePath()) : file2;
        }
        file = null;
        if (file == null) {
            file = a(new File(Environment.getExternalStorageDirectory().getPath() + File.separator + context.getPackageName()));
        }
        file2 = file;
        if (file2 != null) {
        }
    }

    private static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return context.getPackageManager().checkPermission("android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) == 0;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static boolean c() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    private static long b() {
        if ("mounted".equals(Environment.getExternalStorageState())) {
            try {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                return statFs.getAvailableBlocks() * statFs.getBlockSize();
            } catch (Error unused) {
            } catch (Exception e) {
                e.printStackTrace();
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

    private static boolean a() {
        return b() > 31457280;
    }

    private static String a(String str) {
        return f.a(str);
    }
}