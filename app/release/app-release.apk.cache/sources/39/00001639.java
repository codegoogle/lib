package com.facebook.soloader;

import android.os.StrictMode;
import com.p7700g.p99005.f14;
import com.p7700g.p99005.wo1;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

/* compiled from: DirectorySoSource.java */
/* loaded from: classes2.dex */
public class d extends x {
    public static final int j = 1;
    public static final int k = 2;
    public final File l;
    public final int m;

    public d(File file, int i) {
        this.l = file;
        this.m = i;
    }

    private static String[] f(File file) throws IOException {
        boolean z = w.c;
        if (z) {
            StringBuilder G = wo1.G("SoLoader.getElfDependencies[");
            G.append(file.getName());
            G.append("]");
            a.a(G.toString());
        }
        try {
            String[] a = r.a(file);
            if (z) {
                a.b();
            }
            return a;
        } catch (Throwable th) {
            if (w.c) {
                a.b();
            }
            throw th;
        }
    }

    private void g(File file, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        String[] f = f(file);
        Arrays.toString(f);
        for (String str : f) {
            if (!str.startsWith("/")) {
                w.m(str, i | 1, threadPolicy);
            }
        }
    }

    @Override // com.facebook.soloader.x
    public void a(Collection<String> collection) {
        collection.add(this.l.getAbsolutePath());
    }

    @Override // com.facebook.soloader.x
    public int c(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return h(str, i, this.l, threadPolicy);
    }

    @Override // com.facebook.soloader.x
    @Nullable
    public File e(String str) throws IOException {
        File file = new File(this.l, str);
        if (file.exists()) {
            return file;
        }
        return null;
    }

    public int h(String str, int i, File file, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file.getCanonicalPath();
            return 0;
        }
        file.getCanonicalPath();
        if ((i & 1) == 0 || (this.m & 2) == 0) {
            if ((this.m & 1) != 0) {
                g(file2, i, threadPolicy);
            }
            try {
                w.d.a(file2.getAbsolutePath(), i);
                return 1;
            } catch (UnsatisfiedLinkError e) {
                if (e.getMessage().contains("bad ELF magic")) {
                    return 3;
                }
                throw e;
            }
        }
        return 2;
    }

    @Override // com.facebook.soloader.x
    public String toString() {
        String name;
        try {
            name = String.valueOf(this.l.getCanonicalPath());
        } catch (IOException unused) {
            name = this.l.getName();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append("[root = ");
        sb.append(name);
        sb.append(" flags = ");
        return wo1.y(sb, this.m, f14.v);
    }
}