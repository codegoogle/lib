package com.p7700g.p99005;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* compiled from: MultiDexExtractor.java */
/* loaded from: classes.dex */
public final class j20 implements Closeable {
    private static final String A = "crc";
    private static final String B = "dex.number";
    private static final String C = "dex.crc.";
    private static final String D = "dex.time.";
    private static final int E = 16384;
    private static final long F = -1;
    private static final String G = "MultiDex.lock";
    private static final String s = "MultiDex";
    private static final String t = "classes";
    public static final String u = ".dex";
    private static final String v = ".classes";
    public static final String w = ".zip";
    private static final int x = 3;
    private static final String y = "multidex.version";
    private static final String z = "timestamp";
    private final File H;
    private final long I;
    private final File J;
    private final RandomAccessFile K;
    private final FileChannel L;
    private final FileLock M;

    /* compiled from: MultiDexExtractor.java */
    /* loaded from: classes.dex */
    public class a implements FileFilter {
        public a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            return !file.getName().equals(j20.G);
        }
    }

    /* compiled from: MultiDexExtractor.java */
    /* loaded from: classes.dex */
    public static class b extends File {
        public long s;

        public b(File file, String str) {
            super(file, str);
            this.s = -1L;
        }
    }

    public j20(File file, File file2) throws IOException {
        file.getPath();
        file2.getPath();
        this.H = file;
        this.J = file2;
        this.I = h(file);
        File file3 = new File(file2, G);
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.K = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.L = channel;
            try {
                file3.getPath();
                this.M = channel.lock();
                file3.getPath();
            } catch (IOException e) {
                e = e;
                b(this.L);
                throw e;
            } catch (Error e2) {
                e = e2;
                b(this.L);
                throw e;
            } catch (RuntimeException e3) {
                e = e3;
                b(this.L);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e4) {
            b(this.K);
            throw e4;
        }
    }

    private void a() {
        File[] listFiles = this.J.listFiles(new a());
        if (listFiles == null) {
            this.J.getPath();
            return;
        }
        for (File file : listFiles) {
            file.getPath();
            file.length();
            if (!file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    private static void b(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    private static void d(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(wo1.t("tmp-", str), w, file.getParentFile());
        createTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            ZipEntry zipEntry2 = new ZipEntry("classes.dex");
            zipEntry2.setTime(zipEntry.getTime());
            zipOutputStream.putNextEntry(zipEntry2);
            byte[] bArr = new byte[16384];
            for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                zipOutputStream.write(bArr, 0, read);
            }
            zipOutputStream.closeEntry();
            zipOutputStream.close();
            if (createTempFile.setReadOnly()) {
                file.getPath();
                if (createTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            }
            throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
        } finally {
            b(inputStream);
            createTempFile.delete();
        }
    }

    private static SharedPreferences e(Context context) {
        return context.getSharedPreferences(y, 4);
    }

    private static long f(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    private static long h(File file) throws IOException {
        long c = l20.c(file);
        return c == -1 ? c - 1 : c;
    }

    private static boolean j(Context context, File file, long j, String str) {
        SharedPreferences e = e(context);
        if (e.getLong(str + "timestamp", -1L) == f(file)) {
            if (e.getLong(str + A, -1L) == j) {
                return false;
            }
        }
        return true;
    }

    private List<b> l(Context context, String str) throws IOException {
        String str2 = this.H.getName() + v;
        SharedPreferences e = e(context);
        int i = e.getInt(str + B, 1);
        ArrayList arrayList = new ArrayList(i + (-1));
        int i2 = 2;
        while (i2 <= i) {
            b bVar = new b(this.J, wo1.n(str2, i2, w));
            if (bVar.isFile()) {
                bVar.s = h(bVar);
                long j = e.getLong(str + C + i2, -1L);
                long j2 = e.getLong(str + D + i2, -1L);
                long lastModified = bVar.lastModified();
                if (j2 == lastModified) {
                    String str3 = str2;
                    SharedPreferences sharedPreferences = e;
                    if (j == bVar.s) {
                        arrayList.add(bVar);
                        i2++;
                        e = sharedPreferences;
                        str2 = str3;
                    }
                }
                throw new IOException("Invalid extracted dex: " + bVar + " (key \"" + str + "\"), expected modification time: " + j2 + ", modification time: " + lastModified + ", expected crc: " + j + ", file crc: " + bVar.s);
            }
            StringBuilder G2 = wo1.G("Missing extracted secondary dex file '");
            G2.append(bVar.getPath());
            G2.append("'");
            throw new IOException(G2.toString());
        }
        return arrayList;
    }

    private List<b> m() throws IOException {
        String str = this.H.getName() + v;
        a();
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.H);
        int i = 2;
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                b bVar = new b(this.J, str + i + w);
                arrayList.add(bVar);
                String str2 = "Extraction is needed for file " + bVar;
                int i2 = 0;
                boolean z2 = false;
                while (i2 < 3 && !z2) {
                    i2++;
                    d(zipFile, entry, bVar, str);
                    try {
                        bVar.s = h(bVar);
                        z2 = true;
                    } catch (IOException unused) {
                        bVar.getAbsolutePath();
                        z2 = false;
                    }
                    bVar.getAbsolutePath();
                    bVar.length();
                    if (!z2) {
                        bVar.delete();
                        if (bVar.exists()) {
                            bVar.getPath();
                        }
                    }
                }
                if (z2) {
                    i++;
                    entry = zipFile.getEntry(t + i + u);
                } else {
                    throw new IOException("Could not create zip file " + bVar.getAbsolutePath() + " for secondary dex (" + i + ")");
                }
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException unused2) {
            }
        }
    }

    private static void q(Context context, String str, long j, long j2, List<b> list) {
        SharedPreferences.Editor edit = e(context).edit();
        edit.putLong(str + "timestamp", j);
        edit.putLong(wo1.C(new StringBuilder(), str, A), j2);
        edit.putInt(str + B, list.size() + 1);
        int i = 2;
        for (b bVar : list) {
            edit.putLong(str + C + i, bVar.s);
            edit.putLong(str + D + i, bVar.lastModified());
            i++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.M.release();
        this.L.close();
        this.K.close();
    }

    public List<? extends File> k(Context context, String str, boolean z2) throws IOException {
        List<b> m;
        this.H.getPath();
        if (this.M.isValid()) {
            if (!z2 && !j(context, this.H, this.I, str)) {
                try {
                    m = l(context, str);
                } catch (IOException unused) {
                    m = m();
                    q(context, str, f(this.H), this.I, m);
                }
            } else {
                m = m();
                q(context, str, f(this.H), this.I, m);
            }
            m.size();
            return m;
        }
        throw new IllegalStateException("MultiDexExtractor was closed");
    }
}