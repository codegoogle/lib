package com.p7700g.p99005;

import com.p7700g.p99005.zw3;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.Set;

/* compiled from: FileSchemeScanner.java */
/* loaded from: classes3.dex */
public class uw3 implements ww3 {

    /* compiled from: FileSchemeScanner.java */
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

    private void c(File file, sw3 sw3Var) {
        File[] listFiles;
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                c(file2, sw3Var);
            } else if (sw3Var.a(file2.getName())) {
                try {
                    new zw3(new BufferedInputStream(new FileInputStream(file2))).a(new a(sw3Var, file2));
                } catch (IOException e) {
                    throw new rw3(wo1.r("IO error when scanning jar file ", file2), e);
                }
            } else {
                continue;
            }
        }
    }

    @Override // com.p7700g.p99005.ww3
    public void a(URI uri, sw3 sw3Var) {
        File file = new File(uri.getPath());
        if (file.isDirectory()) {
            c(file, sw3Var);
        }
    }

    @Override // com.p7700g.p99005.ww3
    public Set<String> b() {
        return Collections.singleton(o31.b);
    }
}