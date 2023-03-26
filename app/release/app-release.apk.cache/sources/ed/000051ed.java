package com.p7700g.p99005;

import android.content.res.Resources;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: FileIO.java */
/* loaded from: classes2.dex */
public class n81 {
    private static final int a = 1024;
    private static final int b = 1048576;
    private static final int c = 31457280;
    private static final int d = 4096;

    private static void a(@z1 File file, @z1 File file2) throws FileNotFoundException {
        Objects.requireNonNull(file, "Source must not be null");
        Objects.requireNonNull(file2, "Destination must not be null");
        if (file.exists()) {
            return;
        }
        throw new FileNotFoundException("Source '" + file + "' does not exist");
    }

    public static void b(File file) throws IOException {
        IOException e = null;
        for (File file2 : o(file)) {
            try {
                i(file2);
            } catch (IOException e2) {
                e = e2;
            }
        }
        if (e != null) {
            throw e;
        }
    }

    private static void c(@x1 Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private static void d(@x1 Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            c(closeable);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    public static void e(@x1 File file, @x1 File file2, @z1 FileFilter fileFilter) throws IOException {
        a(file, file2);
        if (file.isDirectory()) {
            if (!file.getCanonicalPath().equals(file2.getCanonicalPath())) {
                ?? emptyList = Collections.emptyList();
                if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
                    File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
                    if (listFiles != null && listFiles.length > 0) {
                        emptyList = new ArrayList(listFiles.length);
                        for (File file3 : listFiles) {
                            emptyList.add(new File(file2, file3.getName()).getCanonicalPath());
                        }
                    }
                }
                g(file, file2, fileFilter, emptyList);
                return;
            }
            throw new IOException("Source '" + file + "' and destination '" + file2 + "' are the same");
        }
        throw new IOException("Source '" + file + "' exists but is not a directory");
    }

    public static void f(File file) throws IOException {
        if (file.exists()) {
            if (!j(file)) {
                b(file);
            }
            if (file.delete()) {
                return;
            }
            throw new IOException("Unable to delete directory " + file + CryptoConstants.ALIAS_SEPARATOR);
        }
    }

    private static void g(@x1 File file, @x1 File file2, @z1 FileFilter fileFilter, @x1 List<String> list) throws IOException {
        File[] listFiles = fileFilter == null ? file.listFiles() : file.listFiles(fileFilter);
        if (listFiles != null) {
            if (file2.exists()) {
                if (!file2.isDirectory()) {
                    throw new IOException("Destination '" + file2 + "' exists but is not a directory");
                }
            } else if (!file2.mkdirs() && !file2.isDirectory()) {
                throw new IOException("Destination '" + file2 + "' directory cannot be created");
            }
            if (file2.canWrite()) {
                for (File file3 : listFiles) {
                    File file4 = new File(file2, file3.getName());
                    if (!list.contains(file3.getCanonicalPath())) {
                        if (file3.isDirectory()) {
                            g(file3, file4, fileFilter, list);
                        } else {
                            h(file3, file4);
                        }
                    }
                }
                return;
            }
            throw new IOException("Destination '" + file2 + "' cannot be written to");
        }
        throw new IOException(wo1.r("Failed to list contents of ", file));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.io.FileOutputStream] */
    private static void h(File file, File file2) throws IOException {
        FileInputStream fileInputStream;
        ?? r9;
        FileChannel fileChannel;
        if (file2.exists() && file2.isDirectory()) {
            throw new IOException("Destination '" + file2 + "' exists but is a directory");
        }
        FileChannel fileChannel2 = null;
        try {
            fileInputStream = new FileInputStream(file);
            try {
                r9 = new FileOutputStream(file2);
                try {
                    fileChannel = fileInputStream.getChannel();
                } catch (Throwable th) {
                    th = th;
                    fileChannel = null;
                }
            } catch (Throwable th2) {
                th = th2;
                r9 = 0;
                fileChannel = r9;
                d(new Closeable[]{fileChannel2, r9, fileChannel, fileInputStream});
                throw th;
            }
            try {
                fileChannel2 = r9.getChannel();
                long size = fileChannel.size();
                long j = 0;
                while (j < size) {
                    long j2 = size - j;
                    long transferFrom = fileChannel2.transferFrom(fileChannel, j, j2 > 31457280 ? 31457280L : j2);
                    if (transferFrom == 0) {
                        break;
                    }
                    j += transferFrom;
                }
                d(new Closeable[]{fileChannel2, r9, fileChannel, fileInputStream});
                long length = file.length();
                long length2 = file2.length();
                if (length == length2) {
                    return;
                }
                throw new IOException("Failed to copy full contents from '" + file + "' to '" + file2 + "' Expected length: " + length + " Actual: " + length2);
            } catch (Throwable th3) {
                th = th3;
                d(new Closeable[]{fileChannel2, r9, fileChannel, fileInputStream});
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            fileInputStream = null;
            r9 = 0;
        }
    }

    public static void i(File file) throws IOException {
        if (file.isDirectory()) {
            f(file);
            return;
        }
        boolean exists = file.exists();
        if (file.delete()) {
            return;
        }
        if (!exists) {
            throw new FileNotFoundException(wo1.r("File does not exist: ", file));
        }
        throw new IOException(wo1.r("Unable to delete file: ", file));
    }

    public static boolean j(File file) throws IOException {
        if (file.getParent() != null) {
            file = new File(file.getParentFile().getCanonicalFile(), file.getName());
        }
        return !file.getCanonicalFile().equals(file.getAbsoluteFile());
    }

    @x1
    private static byte[] k(@x1 InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @x1
    public static byte[] l(@x1 Resources resources, @d2 int i) throws IOException {
        InputStream openRawResource = resources.openRawResource(i);
        try {
            byte[] k = k(openRawResource);
            if (openRawResource != null) {
                openRawResource.close();
            }
            return k;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (openRawResource != null) {
                    try {
                        openRawResource.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @x1
    public static String m(@x1 File file) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            String n = n(fileInputStream);
            fileInputStream.close();
            return n;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    @x1
    public static String n(@x1 InputStream inputStream) throws IOException {
        return new String(k(inputStream), "UTF8");
    }

    private static File[] o(File file) throws IOException {
        if (file.exists()) {
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    return listFiles;
                }
                throw new IOException(wo1.r("Failed to list contents of ", file));
            }
            throw new IllegalArgumentException(file + " is not a directory");
        }
        throw new IllegalArgumentException(file + " does not exist");
    }

    public static void p(@x1 File file, @x1 String str) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
        try {
            bufferedWriter.write(str);
        } finally {
            c(bufferedWriter);
        }
    }

    public static void q(@x1 File file, @x1 byte[] bArr) throws IOException {
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
        try {
            bufferedOutputStream.write(bArr, 0, bArr.length);
        } finally {
            c(bufferedOutputStream);
        }
    }
}