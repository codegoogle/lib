package com.p7700g.p99005;

import android.util.Pair;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import com.p7700g.p99005.i2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: NetworkCache.java */
@i2({i2.a.LIBRARY})
/* loaded from: classes.dex */
public class xm0 {
    @x1
    private final vm0 a;

    public xm0(@x1 vm0 vm0Var) {
        this.a = vm0Var;
    }

    private static String c(String str, tm0 tm0Var, boolean z) {
        StringBuilder G = wo1.G("lottie_cache_");
        G.append(str.replaceAll("\\W+", ""));
        G.append(z ? tm0Var.f() : tm0Var.v);
        return G.toString();
    }

    @z1
    private File d(String str) throws FileNotFoundException {
        File file = new File(e(), c(str, tm0.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(e(), c(str, tm0.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    private File e() {
        File a = this.a.a();
        if (a.isFile()) {
            a.delete();
        }
        if (!a.exists()) {
            a.mkdirs();
        }
        return a;
    }

    public void a() {
        File e = e();
        if (e.exists()) {
            File[] listFiles = e.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : e.listFiles()) {
                    file.delete();
                }
            }
            e.delete();
        }
    }

    @s2
    @z1
    public Pair<tm0, InputStream> b(String str) {
        tm0 tm0Var;
        try {
            File d = d(str);
            if (d == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(d);
            if (d.getAbsolutePath().endsWith(j20.w)) {
                tm0Var = tm0.ZIP;
            } else {
                tm0Var = tm0.JSON;
            }
            StringBuilder M = wo1.M("Cache hit for ", str, " at ");
            M.append(d.getAbsolutePath());
            yo0.a(M.toString());
            return new Pair<>(tm0Var, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public void f(String str, tm0 tm0Var) {
        File file = new File(e(), c(str, tm0Var, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean renameTo = file.renameTo(file2);
        yo0.a("Copying temp file to real file (" + file2 + ")");
        if (renameTo) {
            return;
        }
        StringBuilder G = wo1.G("Unable to rename cache file ");
        G.append(file.getAbsolutePath());
        G.append(" to ");
        G.append(file2.getAbsolutePath());
        G.append(CryptoConstants.ALIAS_SEPARATOR);
        yo0.e(G.toString());
    }

    public File g(String str, InputStream inputStream, tm0 tm0Var) throws IOException {
        File file = new File(e(), c(str, tm0Var, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    return file;
                }
            }
        } finally {
            inputStream.close();
        }
    }
}