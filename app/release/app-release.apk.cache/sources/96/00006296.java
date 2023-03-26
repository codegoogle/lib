package com.p7700g.p99005;

import com.p7700g.p99005.ms3;
import com.p7700g.p99005.zw3;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: JarZipSchemeScanner.java */
/* loaded from: classes3.dex */
public class vw3 implements ww3 {

    /* compiled from: JarZipSchemeScanner.java */
    /* loaded from: classes3.dex */
    public class a implements zw3.a {
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

    @Override // com.p7700g.p99005.ww3
    public void a(URI uri, sw3 sw3Var) {
        String rawSchemeSpecificPart = uri.getRawSchemeSpecificPart();
        try {
            c(rawSchemeSpecificPart.substring(0, rawSchemeSpecificPart.lastIndexOf(33))).a(new a(rawSchemeSpecificPart.substring(rawSchemeSpecificPart.lastIndexOf(33) + 2), sw3Var));
        } catch (IOException e) {
            throw new rw3("IO error when scanning jar " + uri, e);
        }
    }

    @Override // com.p7700g.p99005.ww3
    public Set<String> b() {
        return new HashSet(Arrays.asList("jar", "zip"));
    }

    public zw3 c(String str) throws IOException {
        try {
            return new zw3(new URL(str).openStream());
        } catch (MalformedURLException unused) {
            return new zw3(new FileInputStream(ms3.h(str, ms3.c.PATH)));
        }
    }
}