package com.p7700g.p99005;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: VfsSchemeScanner.java */
/* loaded from: classes3.dex */
public class xw3 implements ww3 {

    /* compiled from: VfsSchemeScanner.java */
    /* loaded from: classes3.dex */
    public class a implements sw3 {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;
        public final /* synthetic */ sw3 c;
        public final /* synthetic */ URI d;

        /* compiled from: VfsSchemeScanner.java */
        /* renamed from: com.p7700g.p99005.xw3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public class C0269a extends FilterInputStream {
            public C0269a(InputStream inputStream) {
                super(inputStream);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
            }
        }

        public a(String str, String str2, sw3 sw3Var, URI uri) {
            this.a = str;
            this.b = str2;
            this.c = sw3Var;
            this.d = uri;
        }

        @Override // com.p7700g.p99005.sw3
        public boolean a(String str) {
            return str.equals(this.a);
        }

        @Override // com.p7700g.p99005.sw3
        public void b(String str, InputStream inputStream) throws IOException {
            try {
                ow3.b(new C0269a(inputStream), this.b, this.c);
            } catch (IOException e) {
                StringBuilder G = wo1.G("IO error when scanning war ");
                G.append(this.d);
                throw new rw3(G.toString(), e);
            }
        }
    }

    @Override // com.p7700g.p99005.ww3
    public void a(URI uri, sw3 sw3Var) {
        if (!uri.getScheme().equalsIgnoreCase("vfszip")) {
            new uw3().a(bn4.j(uri).y(o31.b).a(new Object[0]), sw3Var);
            return;
        }
        String uri2 = uri.toString();
        int indexOf = uri2.indexOf("/WEB-INF/classes");
        if (indexOf != -1) {
            String substring = uri2.substring(0, indexOf);
            String substring2 = uri2.substring(indexOf + 1);
            int lastIndexOf = substring.lastIndexOf(47);
            String substring3 = uri2.substring(0, lastIndexOf);
            if (substring3.endsWith(".ear")) {
                try {
                    ow3.b(new URL(substring3.replace("vfszip", o31.b)).openStream(), "", new a(uri2.substring(lastIndexOf + 1, substring.length()), substring2, sw3Var, uri));
                    return;
                } catch (IOException e) {
                    throw new rw3("IO error when scanning war " + uri, e);
                }
            }
            try {
                ow3.b(new URL(substring.replace("vfszip", o31.b)).openStream(), substring2, sw3Var);
                return;
            } catch (IOException e2) {
                throw new rw3("IO error when scanning war " + uri, e2);
            }
        }
        try {
            ow3.b(new URL(uri2).openStream(), "", sw3Var);
        } catch (IOException e3) {
            throw new rw3("IO error when scanning jar " + uri, e3);
        }
    }

    @Override // com.p7700g.p99005.ww3
    public Set<String> b() {
        return new HashSet(Arrays.asList("vfsfile", "vfszip", "vfs"));
    }
}