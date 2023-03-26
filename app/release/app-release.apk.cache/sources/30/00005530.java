package com.p7700g.p99005;

import com.p7700g.p99005.zw3;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

/* compiled from: JarFileScanner.java */
/* loaded from: classes3.dex */
public final class ow3 {

    /* compiled from: JarFileScanner.java */
    /* loaded from: classes3.dex */
    public static class a implements zw3.a {
        public final /* synthetic */ String a;
        public final /* synthetic */ sw3 b;

        public a(String str, sw3 sw3Var) {
            this.a = str;
            this.b = sw3Var;
        }

        @Override // com.p7700g.p99005.zw3.a
        public void a(InputStream inputStream) throws IOException {
            ow3.b(inputStream, this.a, this.b);
        }
    }

    public static void a(File file, String str, sw3 sw3Var) throws IOException {
        new zw3(new FileInputStream(file)).a(new a(str, sw3Var));
    }

    public static void b(InputStream inputStream, String str, sw3 sw3Var) throws IOException {
        JarInputStream jarInputStream;
        JarInputStream jarInputStream2 = null;
        try {
            jarInputStream = new JarInputStream(inputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            for (JarEntry nextJarEntry = jarInputStream.getNextJarEntry(); nextJarEntry != null; nextJarEntry = jarInputStream.getNextJarEntry()) {
                if (!nextJarEntry.isDirectory() && nextJarEntry.getName().startsWith(str) && sw3Var.a(nextJarEntry.getName())) {
                    sw3Var.b(nextJarEntry.getName(), jarInputStream);
                }
                jarInputStream.closeEntry();
            }
            jarInputStream.close();
        } catch (Throwable th2) {
            th = th2;
            jarInputStream2 = jarInputStream;
            if (jarInputStream2 != null) {
                jarInputStream2.close();
            }
            throw th;
        }
    }
}