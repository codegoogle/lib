package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.common.util.IOUtils;
import com.p7700g.p99005.x1;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfmk {
    public static File zza(@x1 File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File zzb(String str, String str2, @x1 File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(zzc(str, file), str2);
    }

    public static File zzc(String str, @x1 File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        zza(file2, false);
        return file2;
    }

    public static boolean zzd(@x1 File file) {
        boolean z;
        if (file.exists()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                int length = listFiles.length;
                z = true;
                for (int i = 0; i < length; i++) {
                    File file2 = listFiles[i];
                    z = file2 != null && zzd(file2) && z;
                }
            } else {
                z = true;
            }
            return file.delete() && z;
        }
        return true;
    }

    public static boolean zze(@x1 File file, @x1 byte[] bArr) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        try {
            fileOutputStream = new FileOutputStream(file);
        } catch (IOException unused) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.flush();
            IOUtils.closeQuietly(fileOutputStream);
            return true;
        } catch (IOException unused2) {
            fileOutputStream2 = fileOutputStream;
            IOUtils.closeQuietly(fileOutputStream2);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            IOUtils.closeQuietly(fileOutputStream2);
            throw th;
        }
    }
}