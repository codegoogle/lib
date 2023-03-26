package com.p7700g.p99005;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: AtomicFile.java */
/* loaded from: classes.dex */
public class to {
    private static final String a = "AtomicFile";
    private final File b;
    private final File c;
    private final File d;

    public to(@x1 File file) {
        this.b = file;
        this.c = new File(file.getPath() + ".new");
        this.d = new File(file.getPath() + ".bak");
    }

    private static void g(@x1 File file, @x1 File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            String str = "Failed to delete file which is a directory " + file2;
        }
        if (file.renameTo(file2)) {
            return;
        }
        String str2 = "Failed to rename " + file + " to " + file2;
    }

    private static boolean i(@x1 FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a() {
        this.b.delete();
        this.c.delete();
        this.d.delete();
    }

    public void b(@z1 FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        i(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        if (this.c.delete()) {
            return;
        }
        StringBuilder G = wo1.G("Failed to delete new file ");
        G.append(this.c);
        G.toString();
    }

    public void c(@z1 FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        i(fileOutputStream);
        try {
            fileOutputStream.close();
        } catch (IOException unused) {
        }
        g(this.c, this.b);
    }

    @x1
    public File d() {
        return this.b;
    }

    @x1
    public FileInputStream e() throws FileNotFoundException {
        if (this.d.exists()) {
            g(this.d, this.b);
        }
        if (this.c.exists() && this.b.exists() && !this.c.delete()) {
            StringBuilder G = wo1.G("Failed to delete outdated new file ");
            G.append(this.c);
            G.toString();
        }
        return new FileInputStream(this.b);
    }

    @x1
    public byte[] f() throws IOException {
        FileInputStream e = e();
        try {
            byte[] bArr = new byte[e.available()];
            int i = 0;
            while (true) {
                int read = e.read(bArr, i, bArr.length - i);
                if (read <= 0) {
                    return bArr;
                }
                i += read;
                int available = e.available();
                if (available > bArr.length - i) {
                    byte[] bArr2 = new byte[available + i];
                    System.arraycopy(bArr, 0, bArr2, 0, i);
                    bArr = bArr2;
                }
            }
        } finally {
            e.close();
        }
    }

    @x1
    public FileOutputStream h() throws IOException {
        if (this.d.exists()) {
            g(this.d, this.b);
        }
        try {
            return new FileOutputStream(this.c);
        } catch (FileNotFoundException unused) {
            if (this.c.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(this.c);
                } catch (FileNotFoundException e) {
                    StringBuilder G = wo1.G("Failed to create new file ");
                    G.append(this.c);
                    throw new IOException(G.toString(), e);
                }
            }
            StringBuilder G2 = wo1.G("Failed to create directory for ");
            G2.append(this.c);
            throw new IOException(G2.toString());
        }
    }
}