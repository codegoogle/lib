package com.p7700g.p99005;

import com.p7700g.p99005.ms3;
import java.io.IOException;
import java.lang.reflect.ReflectPermission;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.AccessController;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PackageNamesScanner.java */
/* loaded from: classes3.dex */
public class pw3 implements qw3 {
    private final String[] a;
    private final ClassLoader b;
    private final Map<String, ww3> c;

    /* compiled from: PackageNamesScanner.java */
    /* loaded from: classes3.dex */
    public static abstract class a {
        private static volatile a a;

        /* compiled from: PackageNamesScanner.java */
        /* renamed from: com.p7700g.p99005.pw3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static class C0229a extends a {
            @Override // com.p7700g.p99005.pw3.a
            public Enumeration<URL> d(String str, ClassLoader classLoader) throws IOException {
                return classLoader.getResources(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static a c() {
            a aVar = a;
            if (aVar == null) {
                synchronized (a.class) {
                    aVar = a;
                    if (aVar == null) {
                        aVar = new C0229a();
                        a = aVar;
                    }
                }
            }
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void e(a aVar) throws SecurityException {
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                securityManager.checkPermission(new ReflectPermission("suppressAccessChecks"));
            }
            synchronized (a.class) {
                a = aVar;
            }
        }

        public abstract Enumeration<URL> d(String str, ClassLoader classLoader) throws IOException;
    }

    public pw3(String[] strArr) {
        this((ClassLoader) AccessController.doPrivileged(jv3.n()), strArr);
    }

    private void b(ww3 ww3Var) {
        for (String str : ww3Var.b()) {
            this.c.put(str.toLowerCase(), ww3Var);
        }
    }

    private void c(URI uri, sw3 sw3Var) {
        ww3 ww3Var = this.c.get(uri.getScheme().toLowerCase());
        if (ww3Var != null) {
            ww3Var.a(uri, sw3Var);
            return;
        }
        StringBuilder G = wo1.G("The URI scheme ");
        G.append(uri.getScheme());
        G.append(" of the URI ");
        G.append(uri);
        G.append(" is not supported. Package scanning deployment is not");
        G.append(" supported for such URIs.");
        G.append("\nTry using a different deployment mechanism such as");
        G.append(" explicitly declaring root resource and provider classes");
        G.append(" using an extension of javax.ws.rs.core.Application");
        throw new rw3(G.toString());
    }

    public static void d(a aVar) throws SecurityException {
        a.e(aVar);
    }

    private String e(URL url) {
        int length = url.getProtocol().length() + 1;
        if (url.getAuthority() != null && url.getAuthority().length() > 0) {
            length += url.getAuthority().length() + 2;
        }
        if (url.getPath() != null) {
            length += url.getPath().length();
        }
        if (url.getQuery() != null) {
            length += url.getQuery().length() + 1;
        }
        if (url.getRef() != null) {
            length += url.getRef().length() + 1;
        }
        StringBuilder sb = new StringBuilder(length);
        sb.append(url.getProtocol());
        sb.append(":");
        if (url.getAuthority() != null && url.getAuthority().length() > 0) {
            sb.append("//");
            sb.append(url.getAuthority());
        }
        if (url.getPath() != null) {
            sb.append(ms3.e(url.getPath(), ms3.c.PATH));
        }
        if (url.getQuery() != null) {
            sb.append('?');
            sb.append(ms3.e(url.getQuery(), ms3.c.QUERY));
        }
        if (url.getRef() != null) {
            sb.append("#");
            sb.append(url.getRef());
        }
        return sb.toString();
    }

    private URI f(URL url) throws URISyntaxException {
        try {
            return url.toURI();
        } catch (URISyntaxException unused) {
            return URI.create(e(url));
        }
    }

    @Override // com.p7700g.p99005.qw3
    public void a(sw3 sw3Var) {
        for (String str : this.a) {
            try {
                Enumeration<URL> d = a.c().d(str.replace('.', j14.P), this.b);
                while (d.hasMoreElements()) {
                    try {
                        c(f(d.nextElement()), sw3Var);
                    } catch (URISyntaxException e) {
                        throw new rw3("Error when converting a URL to a URI", e);
                    }
                }
            } catch (IOException e2) {
                throw new rw3("IO error when package scanning jar", e2);
            }
        }
    }

    public pw3(ClassLoader classLoader, String[] strArr) {
        this.a = strArr;
        this.b = classLoader;
        this.c = new HashMap();
        b(new vw3());
        b(new uw3());
        b(new xw3());
        b(new tw3());
        Iterator it = py3.o(ww3.class).iterator();
        while (it.hasNext()) {
            b((ww3) it.next());
        }
    }
}