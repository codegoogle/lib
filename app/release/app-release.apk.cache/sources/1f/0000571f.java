package com.p7700g.p99005;

import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.lang.reflect.ReflectPermission;
import java.net.URL;
import java.net.URLConnection;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: ServiceFinder.java */
/* loaded from: classes3.dex */
public final class py3<T> implements Iterable<T> {
    private static final Logger s;
    private static final String t = "META-INF/jersey-module-version";
    private static final String u = "META-INF/services/";
    private static final String v;
    private static final Set<String> w;
    private final boolean A;
    private final Class<T> x;
    private final String y;
    private final ClassLoader z;

    /* compiled from: ServiceFinder.java */
    /* loaded from: classes3.dex */
    public static class a extends HashSet<String> {
        public a() {
            add("jersey-client");
            add("jersey-core");
            add("jersey-gf-server");
            add("jersey-gf-servlet");
            add("jersey-gf-statsproviders");
            add("jersey-grizzly");
            add("jersey-json");
            add("jersey-moxy");
            add("jersey-multipart");
            add("jersey-server");
            add("jersey-servlet");
            add("jersey-statsproviders");
            add("glassfish-embedded");
        }
    }

    /* compiled from: ServiceFinder.java */
    /* loaded from: classes3.dex */
    public static class b<T> {
        public final Class<T> s;
        public final String t;
        public final ClassLoader u;
        public final boolean v;
        public Enumeration<URL> w;
        public Iterator<String> x;
        public Set<String> y;
        public String z;

        public /* synthetic */ b(Class cls, String str, ClassLoader classLoader, boolean z, a aVar) {
            this(cls, str, classLoader, z);
        }

        private void a() {
            Logger logger = py3.s;
            Level level = Level.CONFIG;
            if (logger.isLoggable(level)) {
                py3.s.log(level, sx3.i(this.z, this.s));
            }
            this.z = null;
        }

        public final void b() {
            if (this.w == null) {
                try {
                    String str = py3.u + this.t;
                    this.w = py3.n(str, py3.D(this.u, str));
                } catch (IOException e) {
                    py3.h(this.t, ": " + e);
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
            r0 = r7.x.next();
            r7.z = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
            if (r7.v == false) goto L52;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
            java.security.AccessController.doPrivileged(com.p7700g.p99005.jv3.f(r0, r7.u));
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
            r0 = r0.getException();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
            if ((r0 instanceof java.lang.ClassNotFoundException) != false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
            a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
            if ((r0 instanceof java.lang.NoClassDefFoundError) != false) goto L43;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
            r2 = com.p7700g.p99005.py3.s;
            r4 = java.util.logging.Level.CONFIG;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x004d, code lost:
            if (r2.isLoggable(r4) != false) goto L46;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004f, code lost:
            com.p7700g.p99005.py3.s.log(r4, com.p7700g.p99005.sx3.b(r0.getLocalizedMessage(), r7.z, r7.s));
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
            r7.z = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
            if ((r0 instanceof java.lang.ClassFormatError) != false) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
            r2 = com.p7700g.p99005.py3.s;
            r4 = java.util.logging.Level.CONFIG;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0073, code lost:
            if (r2.isLoggable(r4) != false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
            com.p7700g.p99005.py3.s.log(r4, com.p7700g.p99005.sx3.a(r0.getLocalizedMessage(), r7.z, r7.s));
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
            r7.z = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
            if ((r0 instanceof java.lang.RuntimeException) != false) goto L39;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
            throw ((java.lang.RuntimeException) r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
            throw new java.lang.IllegalStateException(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
            a();
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean hasNext() throws oy3 {
            if (this.z != null) {
                return true;
            }
            b();
            while (this.z == null) {
                while (true) {
                    Iterator<String> it = this.x;
                    if (it != null && it.hasNext()) {
                        break;
                    } else if (!this.w.hasMoreElements()) {
                        return false;
                    } else {
                        this.x = py3.H(this.t, this.w.nextElement(), this.y);
                    }
                }
            }
            return true;
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        private b(Class<T> cls, String str, ClassLoader classLoader, boolean z) {
            this.w = null;
            this.x = null;
            this.y = new TreeSet();
            this.z = null;
            this.s = cls;
            this.t = str;
            this.u = classLoader;
            this.v = z;
        }
    }

    /* compiled from: ServiceFinder.java */
    /* loaded from: classes3.dex */
    public static final class c<T> extends f<T> {
        @Override // com.p7700g.p99005.py3.f
        public Iterator<Class<T>> c(Class<T> cls, String str, ClassLoader classLoader, boolean z) {
            return new d(cls, str, classLoader, z, null);
        }

        @Override // com.p7700g.p99005.py3.f
        public Iterator<T> d(Class<T> cls, String str, ClassLoader classLoader, boolean z) {
            return new e(cls, str, classLoader, z, null);
        }
    }

    /* compiled from: ServiceFinder.java */
    /* loaded from: classes3.dex */
    public static final class d<T> extends b<T> implements Iterator<Class<T>> {
        public /* synthetic */ d(Class cls, String str, ClassLoader classLoader, boolean z, a aVar) {
            this(cls, str, classLoader, z);
        }

        @Override // java.util.Iterator
        /* renamed from: c */
        public Class<T> next() {
            if (hasNext()) {
                String str = this.z;
                this.z = null;
                try {
                    Class<T> cls = (Class) AccessController.doPrivileged(jv3.f(str, this.u));
                    Logger logger = py3.s;
                    Level level = Level.FINEST;
                    if (logger.isLoggable(level)) {
                        Logger logger2 = py3.s;
                        logger2.log(level, "Loading next class: " + cls.getName());
                    }
                    return cls;
                } catch (ClassNotFoundException unused) {
                    py3.h(this.t, sx3.i(str, this.s));
                    return null;
                } catch (PrivilegedActionException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof ClassNotFoundException) {
                        py3.h(this.t, sx3.i(str, this.s));
                    } else if (cause instanceof NoClassDefFoundError) {
                        py3.h(this.t, sx3.b(cause.getLocalizedMessage(), str, this.s));
                    } else if (cause instanceof ClassFormatError) {
                        py3.h(this.t, sx3.a(cause.getLocalizedMessage(), str, this.s));
                    } else {
                        py3.i(this.t, sx3.g(str, this.s, cause.getLocalizedMessage()), cause);
                    }
                    return null;
                }
            }
            throw new NoSuchElementException();
        }

        private d(Class<T> cls, String str, ClassLoader classLoader, boolean z) {
            super(cls, str, classLoader, z, null);
        }
    }

    /* compiled from: ServiceFinder.java */
    /* loaded from: classes3.dex */
    public static final class e<T> extends b<T> implements Iterator<T> {
        private T A;

        public /* synthetic */ e(Class cls, String str, ClassLoader classLoader, boolean z, a aVar) {
            this(cls, str, classLoader, z);
        }

        private void a() throws oy3 {
            if (this.v) {
                Logger logger = py3.s;
                Level level = Level.CONFIG;
                if (logger.isLoggable(level)) {
                    py3.s.log(level, sx3.i(this.z, this.s));
                }
                this.z = null;
                return;
            }
            py3.h(this.t, sx3.i(this.z, this.s));
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
            r0 = r7.x.next();
            r7.z = r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0024, code lost:
            r7.A = r7.s.cast(((java.lang.Class) java.security.AccessController.doPrivileged(com.p7700g.p99005.jv3.f(r0, r7.u))).newInstance());
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
            r0 = r0.getCause();
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
            if ((r0 instanceof java.lang.ClassNotFoundException) != false) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
            a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
            if ((r0 instanceof java.lang.ClassFormatError) != false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
            if (r7.v != false) goto L63;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
            r3 = com.p7700g.p99005.py3.s;
            r4 = java.util.logging.Level.CONFIG;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
            if (r3.isLoggable(r4) != false) goto L66;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
            com.p7700g.p99005.py3.s.log(r4, com.p7700g.p99005.sx3.a(r0.getLocalizedMessage(), r7.z, r7.s));
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
            r7.z = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
            com.p7700g.p99005.py3.i(r7.t, com.p7700g.p99005.sx3.a(r0.getLocalizedMessage(), r7.z, r7.s), r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0086, code lost:
            com.p7700g.p99005.py3.i(r7.t, com.p7700g.p99005.sx3.h(r7.z, r7.s, r0.getLocalizedMessage()), r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0099, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009c, code lost:
            if (r7.v != false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x009e, code lost:
            r3 = com.p7700g.p99005.py3.s;
            r4 = java.util.logging.Level.CONFIG;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00a8, code lost:
            if (r3.isLoggable(r4) != false) goto L45;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
            com.p7700g.p99005.py3.s.log(r4, com.p7700g.p99005.sx3.b(r0.getLocalizedMessage(), r7.z, r7.s));
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00bd, code lost:
            r7.z = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00c1, code lost:
            com.p7700g.p99005.py3.i(r7.t, com.p7700g.p99005.sx3.b(r0.getLocalizedMessage(), r7.z, r7.s), r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x00d4, code lost:
            a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x00d9, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
            com.p7700g.p99005.py3.i(r7.t, com.p7700g.p99005.sx3.h(r7.z, r7.s, r0.getLocalizedMessage()), r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x00ed, code lost:
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x00f0, code lost:
            if (r7.v != false) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x00f2, code lost:
            r3 = com.p7700g.p99005.py3.s;
            r4 = java.util.logging.Level.CONFIG;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00fc, code lost:
            if (r3.isLoggable(r4) != false) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00fe, code lost:
            com.p7700g.p99005.py3.s.log(r4, com.p7700g.p99005.sx3.h(r7.z, r7.s, r0.getLocalizedMessage()));
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x0111, code lost:
            r7.z = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:48:0x0115, code lost:
            com.p7700g.p99005.py3.i(r7.t, com.p7700g.p99005.sx3.h(r7.z, r7.s, r0.getLocalizedMessage()), r0);
         */
        @Override // com.p7700g.p99005.py3.b, java.util.Iterator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean hasNext() throws oy3 {
            if (this.z != null) {
                return true;
            }
            b();
            while (this.z == null) {
                while (true) {
                    Iterator<String> it = this.x;
                    if (it != null && it.hasNext()) {
                        break;
                    } else if (!this.w.hasMoreElements()) {
                        return false;
                    } else {
                        this.x = py3.H(this.t, this.w.nextElement(), this.y);
                    }
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public T next() {
            if (hasNext()) {
                this.z = null;
                return this.A;
            }
            throw new NoSuchElementException();
        }

        private e(Class<T> cls, String str, ClassLoader classLoader, boolean z) {
            super(cls, str, classLoader, z, null);
        }
    }

    /* compiled from: ServiceFinder.java */
    /* loaded from: classes3.dex */
    public static abstract class f<T> {
        private static volatile f a;

        /* JADX INFO: Access modifiers changed from: private */
        public static f e() {
            f fVar = a;
            if (fVar == null) {
                synchronized (f.class) {
                    fVar = a;
                    if (fVar == null) {
                        fVar = new c();
                        a = fVar;
                    }
                }
            }
            return fVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void f(f fVar) throws SecurityException {
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                securityManager.checkPermission(new ReflectPermission("suppressAccessChecks"));
            }
            synchronized (f.class) {
                a = fVar;
            }
        }

        public abstract Iterator<Class<T>> c(Class<T> cls, String str, ClassLoader classLoader, boolean z);

        public abstract Iterator<T> d(Class<T> cls, String str, ClassLoader classLoader, boolean z);
    }

    static {
        Logger logger = Logger.getLogger(py3.class.getName());
        s = logger;
        v = A();
        w = new a();
        if (jv3.r() != null) {
            logger.log(Level.CONFIG, "Running in an OSGi environment");
        } else {
            logger.log(Level.CONFIG, "Running in a non-OSGi environment");
        }
    }

    private py3(Class<T> cls, ClassLoader classLoader, boolean z) {
        this(cls, cls.getName(), classLoader, z);
    }

    private static String A() {
        try {
            URL B = B(py3.class.getClassLoader(), py3.class.getName().replace(CryptoConstants.ALIAS_SEPARATOR, "/") + ".class");
            if (B == null) {
                Logger logger = s;
                Level level = Level.FINE;
                logger.log(level, "Error getting " + py3.class.getName() + " class as a resource");
                return null;
            }
            return y(py3.class.getName(), B);
        } catch (IOException e2) {
            Logger logger2 = s;
            Level level2 = Level.FINE;
            StringBuilder G = wo1.G("Error loading META-INF/jersey-module-version associated with ");
            G.append(py3.class.getName());
            logger2.log(level2, G.toString(), (Throwable) e2);
            return null;
        }
    }

    private static URL B(ClassLoader classLoader, String str) throws IOException {
        if (classLoader == null) {
            return C(str);
        }
        URL resource = classLoader.getResource(str);
        return resource != null ? resource : C(str);
    }

    private static URL C(String str) throws IOException {
        if (py3.class.getClassLoader() != null) {
            return py3.class.getClassLoader().getResource(str);
        }
        return ClassLoader.getSystemResource(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Enumeration<URL> D(ClassLoader classLoader, String str) throws IOException {
        if (classLoader == null) {
            return E(str);
        }
        Enumeration<URL> resources = classLoader.getResources(str);
        return (resources == null || !resources.hasMoreElements()) ? E(str) : resources;
    }

    private static Enumeration<URL> E(String str) throws IOException {
        if (py3.class.getClassLoader() != null) {
            return py3.class.getClassLoader().getResources(str);
        }
        return ClassLoader.getSystemResources(str);
    }

    private static boolean G(URL url) {
        String url2 = url.toString();
        for (String str : w) {
            if (url2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static Iterator<String> H(String str, URL url, Set<String> set) throws oy3 {
        InputStream inputStream;
        StringBuilder sb;
        BufferedReader bufferedReader;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader2 = 0;
        try {
            try {
                URLConnection openConnection = url.openConnection();
                openConnection.setUseCaches(false);
                inputStream = openConnection.getInputStream();
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
                    int i = 1;
                    do {
                        bufferedReader2 = str;
                        try {
                            i = I(bufferedReader2, url, bufferedReader, i, arrayList, set);
                        } catch (IOException e2) {
                            e = e2;
                            bufferedReader2 = bufferedReader;
                            h(str, ": " + e);
                            if (bufferedReader2 != 0) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException e3) {
                                    e = e3;
                                    sb = new StringBuilder();
                                    sb.append(": ");
                                    sb.append(e);
                                    h(str, sb.toString());
                                    return arrayList.iterator();
                                }
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            return arrayList.iterator();
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (IOException e4) {
                                    h(str, ": " + e4);
                                    throw th;
                                }
                            }
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            throw th;
                        }
                    } while (i >= 0);
                } catch (IOException e5) {
                    e = e5;
                }
            } catch (IOException e6) {
                e = e6;
                inputStream = null;
            } catch (Throwable th2) {
                th = th2;
                inputStream = null;
            }
            try {
                bufferedReader.close();
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e7) {
                e = e7;
                sb = new StringBuilder();
                sb.append(": ");
                sb.append(e);
                h(str, sb.toString());
                return arrayList.iterator();
            }
            return arrayList.iterator();
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static int I(String str, URL url, BufferedReader bufferedReader, int i, List<String> list, Set<String> set) throws IOException, oy3 {
        String readLine = bufferedReader.readLine();
        if (readLine == null) {
            return -1;
        }
        int indexOf = readLine.indexOf(35);
        if (indexOf >= 0) {
            readLine = readLine.substring(0, indexOf);
        }
        String trim = readLine.trim();
        int length = trim.length();
        if (length != 0) {
            if (trim.indexOf(32) >= 0 || trim.indexOf(9) >= 0) {
                m(str, url, i, sx3.c());
            }
            int codePointAt = trim.codePointAt(0);
            if (!Character.isJavaIdentifierStart(codePointAt)) {
                m(str, url, i, sx3.d(trim));
            }
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = trim.codePointAt(charCount);
                if (!Character.isJavaIdentifierPart(codePointAt2) && codePointAt2 != 46) {
                    m(str, url, i, sx3.d(trim));
                }
                charCount += Character.charCount(codePointAt2);
            }
            if (!set.contains(trim)) {
                list.add(trim);
                set.add(trim);
            }
        }
        return i + 1;
    }

    public static void J(f fVar) throws SecurityException {
        f.f(fVar);
    }

    private Iterator<Class<T>> g() {
        return f.e().c(this.x, this.y, this.z, this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(String str, String str2) throws oy3 {
        throw new oy3(wo1.u(str, ": ", str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void i(String str, String str2, Throwable th) throws oy3 {
        oy3 oy3Var = new oy3(wo1.u(str, ": ", str2));
        oy3Var.initCause(th);
        throw oy3Var;
    }

    private static void m(String str, URL url, int i, String str2) throws oy3 {
        h(str, url + ":" + i + ": " + str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Enumeration<URL> n(String str, Enumeration<URL> enumeration) {
        String y;
        if (v == null || !enumeration.hasMoreElements()) {
            return enumeration;
        }
        ArrayList list = Collections.list(enumeration);
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            URL url = (URL) listIterator.next();
            if (G(url) && (y = y(str, url)) != null && !v.equals(y)) {
                listIterator.remove();
            }
        }
        return Collections.enumeration(list);
    }

    public static <T> py3<T> o(Class<T> cls) throws oy3 {
        return t(cls, Thread.currentThread().getContextClassLoader(), false);
    }

    public static <T> py3<T> p(Class<T> cls, ClassLoader classLoader) throws oy3 {
        return t(cls, classLoader, false);
    }

    public static <T> py3<T> t(Class<T> cls, ClassLoader classLoader, boolean z) throws oy3 {
        return new py3<>(cls, classLoader, z);
    }

    public static <T> py3<T> u(Class<T> cls, boolean z) throws oy3 {
        return t(cls, Thread.currentThread().getContextClassLoader(), z);
    }

    public static py3<?> x(String str) throws oy3 {
        return new py3<>(Object.class, str, Thread.currentThread().getContextClassLoader(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String y(String str, URL url) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        try {
            String url2 = url.toString();
            if (url2.endsWith("class")) {
                str = str.replace(CryptoConstants.ALIAS_SEPARATOR, "/") + ".class";
            }
            inputStream = new URL(url2.replace(str, t)).openStream();
        } catch (IOException unused) {
            inputStream = null;
        } catch (Throwable th) {
            th = th;
            if (inputStream2 != null) {
            }
            throw th;
        }
        try {
            try {
                String readLine = new BufferedReader(new InputStreamReader(inputStream)).readLine();
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused2) {
                        Logger logger = s;
                        Level level = Level.FINE;
                        StringBuilder G = wo1.G("Error closing stream associated with ");
                        G.append(py3.class.getName());
                        logger.log(level, G.toString());
                    }
                }
                return readLine;
            } catch (Throwable th2) {
                inputStream2 = inputStream;
                th = th2;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (IOException unused3) {
                        Logger logger2 = s;
                        Level level2 = Level.FINE;
                        StringBuilder G2 = wo1.G("Error closing stream associated with ");
                        G2.append(py3.class.getName());
                        logger2.log(level2, G2.toString());
                    }
                }
                throw th;
            }
        } catch (IOException unused4) {
            s.log(Level.FINE, "Error loading META-INF/jersey-module-version associated with " + py3.class.getName());
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused5) {
                    Logger logger3 = s;
                    Level level3 = Level.FINE;
                    StringBuilder G3 = wo1.G("Error closing stream associated with ");
                    G3.append(py3.class.getName());
                    logger3.log(level3, G3.toString());
                }
            }
            return null;
        }
    }

    public Class<T>[] L() throws oy3 {
        ArrayList arrayList = new ArrayList();
        Iterator<Class<T>> g = g();
        while (g.hasNext()) {
            arrayList.add(g.next());
        }
        return (Class[]) arrayList.toArray((Class[]) Array.newInstance(Class.class, arrayList.size()));
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return f.e().d(this.x, this.y, this.z, this.A);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public T[] toArray() throws oy3 {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return (T[]) arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.x, arrayList.size()));
    }

    private py3(Class<T> cls, String str, ClassLoader classLoader, boolean z) {
        this.x = cls;
        this.y = str;
        this.z = classLoader;
        this.A = z;
    }
}