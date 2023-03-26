package com.p7700g.p99005;

import com.p7700g.p99005.zw3;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FilesScanner.java */
/* loaded from: classes3.dex */
public class nw3 implements qw3 {
    private final File[] a;

    /* compiled from: FilesScanner.java */
    /* loaded from: classes3.dex */
    public class a implements zw3.a {
        public final /* synthetic */ sw3 a;
        public final /* synthetic */ File b;

        public a(sw3 sw3Var, File file) {
            this.a = sw3Var;
            this.b = file;
        }

        @Override // com.p7700g.p99005.zw3.a
        public void a(InputStream inputStream) throws IOException {
            this.a.b(this.b.getName(), inputStream);
        }
    }

    public nw3(File[] fileArr) {
        this.a = fileArr;
    }

    private void b(File file, sw3 sw3Var) {
        if (file.isDirectory()) {
            c(file, sw3Var);
        } else if (file.getName().endsWith(".jar") || file.getName().endsWith(j20.w)) {
            try {
                ow3.a(file, "", sw3Var);
            } catch (IOException e) {
                throw new rw3(wo1.r("IO error when scanning jar file ", file), e);
            }
        }
    }

    private void c(File file, sw3 sw3Var) {
        File[] listFiles;
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                c(file2, sw3Var);
            } else if (file2.getName().endsWith(".jar")) {
                try {
                    ow3.a(file2, "", sw3Var);
                } catch (IOException e) {
                    throw new rw3(wo1.r("IO error when scanning jar file ", file2), e);
                }
            } else if (sw3Var.a(file2.getName())) {
                try {
                    new zw3(new BufferedInputStream(new FileInputStream(file2))).a(new a(sw3Var, file2));
                } catch (IOException e2) {
                    throw new rw3(wo1.r("IO error when scanning file ", file2), e2);
                }
            } else {
                continue;
            }
        }
    }

    @Override // com.p7700g.p99005.qw3
    public void a(sw3 sw3Var) {
        for (File file : this.a) {
            b(file, sw3Var);
        }
    }
}