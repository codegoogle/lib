package com.p7700g.p99005;

import com.p7700g.p99005.zw3;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: BundleSchemeScanner.java */
/* loaded from: classes3.dex */
public class tw3 implements ww3 {

    /* compiled from: BundleSchemeScanner.java */
    /* loaded from: classes3.dex */
    public class a implements zw3.a {
        public final /* synthetic */ sw3 a;
        public final /* synthetic */ URI b;

        public a(sw3 sw3Var, URI uri) {
            this.a = sw3Var;
            this.b = uri;
        }

        @Override // com.p7700g.p99005.zw3.a
        public void a(InputStream inputStream) throws IOException {
            this.a.b(this.b.getPath(), inputStream);
        }
    }

    @Override // com.p7700g.p99005.ww3
    public void a(URI uri, sw3 sw3Var) throws rw3 {
        if (sw3Var.a(uri.getPath())) {
            try {
                new zw3(new BufferedInputStream(uri.toURL().openStream())).a(new a(sw3Var, uri));
            } catch (IOException e) {
                throw new rw3("IO error when scanning bundle class " + uri, e);
            }
        }
    }

    @Override // com.p7700g.p99005.ww3
    public Set<String> b() {
        return new HashSet(Arrays.asList("bundle"));
    }
}