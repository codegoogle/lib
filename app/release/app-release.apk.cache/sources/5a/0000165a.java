package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Parcel;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.p7700g.p99005.wo1;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* compiled from: SysUtil.java */
/* loaded from: classes2.dex */
public final class y {
    private static final byte a = 1;

    /* compiled from: SysUtil.java */
    @e
    @TargetApi(21)
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        @e
        public static void a(FileDescriptor fileDescriptor, long j) throws IOException {
            int i;
            try {
                Os.posix_fallocate(fileDescriptor, 0L, j);
            } catch (ErrnoException e) {
                if (e.errno != OsConstants.EOPNOTSUPP && (i = e.errno) != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                    throw new IOException(e.toString(), e);
                }
            }
        }

        @e
        public static String[] b() {
            return Build.SUPPORTED_ABIS;
        }
    }

    public static int a(RandomAccessFile randomAccessFile, InputStream inputStream, int i, byte[] bArr) throws IOException {
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, 0, Math.min(bArr.length, i - i2));
            if (read == -1) {
                break;
            }
            randomAccessFile.write(bArr, 0, read);
            i2 += read;
        }
        return i2;
    }

    public static void b(File file) throws IOException {
        if (!file.delete()) {
            throw new IOException(wo1.r("could not delete file ", file));
        }
    }

    public static void c(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                c(file2);
            }
        }
        if (!file.delete() && file.exists()) {
            throw new IOException(wo1.r("could not delete: ", file));
        }
    }

    public static void d(FileDescriptor fileDescriptor, long j) throws IOException {
        a.a(fileDescriptor, j);
    }

    public static int e(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != null && str.equals(strArr[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void f(File file) throws IOException {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    f(file2);
                }
                return;
            }
            throw new IOException(wo1.r("cannot list directory ", file));
        } else if (!file.getPath().endsWith("_lock")) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            try {
                randomAccessFile.getFD().sync();
                randomAccessFile.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
    }

    public static int g(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                return packageManager.getPackageInfo(context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException | RuntimeException unused) {
            }
        }
        return 0;
    }

    public static String[] h() {
        return a.b();
    }

    public static byte[] i(File file, Context context) throws IOException {
        File canonicalFile = file.getCanonicalFile();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeByte(a);
            obtain.writeString(canonicalFile.getPath());
            obtain.writeLong(canonicalFile.lastModified());
            obtain.writeInt(g(context));
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static void j(File file) throws IOException {
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException(wo1.r("cannot mkdir: ", file));
        }
    }
}