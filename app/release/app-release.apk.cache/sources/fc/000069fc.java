package com.p7700g.p99005;

import com.p7700g.p99005.pw3;
import com.p7700g.p99005.py3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleReference;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.SynchronousBundleListener;

/* compiled from: OsgiRegistry.java */
/* loaded from: classes3.dex */
public final class zu3 implements SynchronousBundleListener {
    private static final String a = "com.sun.jersey.core";
    private static final Logger b = Logger.getLogger(zu3.class.getName());
    private static zu3 c;
    private final BundleContext d;
    private final Map<Long, Map<String, Callable<List<Class<?>>>>> e = new HashMap();
    private final ReadWriteLock f = new ReentrantReadWriteLock();
    private Map<String, Bundle> g = new HashMap();

    /* compiled from: OsgiRegistry.java */
    /* loaded from: classes3.dex */
    public class a extends pw3.a {
        public a() {
        }

        @Override // com.p7700g.p99005.pw3.a
        public Enumeration<URL> d(String str, ClassLoader classLoader) throws IOException {
            a aVar = this;
            String str2 = str;
            LinkedList linkedList = new LinkedList();
            Bundle[] bundles = zu3.this.d.getBundles();
            int length = bundles.length;
            boolean z = false;
            int i = 0;
            while (i < length) {
                Bundle bundle = bundles[i];
                int i2 = 2;
                String[] strArr = new String[2];
                strArr[z ? 1 : 0] = str2;
                strArr[1] = wo1.t("WEB-INF/classes/", str2);
                int i3 = 0;
                while (i3 < i2) {
                    Enumeration findEntries = bundle.findEntries(strArr[i3], tm4.g, z);
                    if (findEntries != null) {
                        while (findEntries.hasMoreElements()) {
                            URL url = (URL) findEntries.nextElement();
                            String path = url.getPath();
                            StringBuilder G = wo1.G(str);
                            Enumeration enumeration = findEntries;
                            G.append(path.substring(path.lastIndexOf(47)));
                            zu3.this.g.put(G.toString().replace(j14.P, '.').replace(".class", ""), bundle);
                            linkedList.add(url);
                            findEntries = enumeration;
                        }
                    }
                    i3++;
                    i2 = 2;
                    z = false;
                }
                Enumeration findEntries2 = bundle.findEntries("/", "*.jar", true);
                if (findEntries2 != null) {
                    while (findEntries2.hasMoreElements()) {
                        URL url2 = (URL) findEntries2.nextElement();
                        InputStream resourceAsStream = classLoader.getResourceAsStream(url2.getPath());
                        if (resourceAsStream == null) {
                            zu3.b.config(sx3.e(url2));
                        } else {
                            try {
                                JarInputStream jarInputStream = new JarInputStream(resourceAsStream);
                                while (true) {
                                    try {
                                        try {
                                            JarEntry nextJarEntry = jarInputStream.getNextJarEntry();
                                            if (nextJarEntry == null) {
                                                break;
                                            }
                                            String name = nextJarEntry.getName();
                                            if (name.endsWith(".class") && name.contains(str2)) {
                                                zu3.this.g.put(name.replace(".class", "").replace(j14.P, '.'), bundle);
                                                linkedList.add(bundle.getResource(name));
                                            }
                                            aVar = this;
                                            str2 = str;
                                        } catch (Exception e) {
                                            zu3.b.log(Level.CONFIG, sx3.f(url2), (Throwable) e);
                                        }
                                    } catch (Throwable th) {
                                        try {
                                            jarInputStream.close();
                                        } catch (IOException unused) {
                                        }
                                        throw th;
                                    }
                                }
                                jarInputStream.close();
                            } catch (IOException e2) {
                                zu3.b.log(Level.CONFIG, sx3.f(url2), (Throwable) e2);
                                try {
                                    resourceAsStream.close();
                                } catch (IOException unused2) {
                                }
                                aVar = this;
                                str2 = str;
                            }
                        }
                    }
                }
                i++;
                z = false;
                aVar = this;
                str2 = str;
            }
            return Collections.enumeration(linkedList);
        }
    }

    /* compiled from: OsgiRegistry.java */
    /* loaded from: classes3.dex */
    public static class b implements Callable<List<Class<?>>> {
        private final String a;
        private final URL b;
        private final String c;
        private final Bundle d;

        public b(String str, URL url, Bundle bundle) {
            this.a = str;
            this.b = url;
            this.c = url.toExternalForm();
            this.d = bundle;
        }

        /* JADX WARN: Not initialized variable reg: 2, insn: 0x00c4: MOVE  (r7 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:40:0x00c4 */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public List<Class<?>> call() throws Exception {
            Exception e;
            Error e2;
            BufferedReader bufferedReader;
            Throwable th;
            BufferedReader bufferedReader2;
            BufferedReader bufferedReader3 = null;
            try {
                try {
                    Logger logger = zu3.b;
                    Level level = Level.FINEST;
                    if (logger.isLoggable(level)) {
                        zu3.b.log(level, "Loading providers for SPI: {0}", this.a);
                    }
                    bufferedReader = new BufferedReader(new InputStreamReader(this.b.openStream(), "UTF-8"));
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (true) {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                try {
                                    break;
                                } catch (IOException e3) {
                                    Logger logger2 = zu3.b;
                                    Level level2 = Level.FINE;
                                    StringBuilder G = wo1.G("Error closing SPI registry stream:");
                                    G.append(this.b);
                                    logger2.log(level2, G.toString(), (Throwable) e3);
                                }
                            } else if (readLine.trim().length() != 0) {
                                Logger logger3 = zu3.b;
                                Level level3 = Level.FINEST;
                                if (logger3.isLoggable(level3)) {
                                    zu3.b.log(level3, "SPI provider: {0}", readLine);
                                }
                                arrayList.add(this.d.loadClass(readLine));
                            }
                        }
                        bufferedReader.close();
                        return arrayList;
                    } catch (Error e4) {
                        e2 = e4;
                        Logger logger4 = zu3.b;
                        Level level4 = Level.WARNING;
                        logger4.log(level4, "error caught while creating factories: " + e2);
                        throw e2;
                    } catch (Exception e5) {
                        e = e5;
                        Logger logger5 = zu3.b;
                        Level level5 = Level.WARNING;
                        logger5.log(level5, "exception caught while creating factories: " + e);
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        if (bufferedReader != null) {
                        }
                        throw th;
                    }
                } catch (Error e6) {
                    e2 = e6;
                } catch (Exception e7) {
                    e = e7;
                } catch (Throwable th3) {
                    th = th3;
                    Throwable th4 = th;
                    bufferedReader = bufferedReader3;
                    th = th4;
                    if (bufferedReader != null) {
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                bufferedReader3 = bufferedReader2;
                Throwable th42 = th;
                bufferedReader = bufferedReader3;
                th = th42;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e8) {
                        Logger logger6 = zu3.b;
                        Level level6 = Level.FINE;
                        StringBuilder G2 = wo1.G("Error closing SPI registry stream:");
                        G2.append(this.b);
                        logger6.log(level6, G2.toString(), (Throwable) e8);
                    }
                }
                throw th;
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.c.equals(((b) obj).c);
            }
            return false;
        }

        public int hashCode() {
            return this.c.hashCode();
        }

        public String toString() {
            return this.c;
        }
    }

    private zu3(BundleContext bundleContext) {
        this.d = bundleContext;
    }

    public static synchronized zu3 g() {
        zu3 zu3Var;
        BundleContext bundleContext;
        synchronized (zu3.class) {
            if (c == null && (jv3.class.getClassLoader() instanceof BundleReference) && (bundleContext = FrameworkUtil.getBundle(zu3.class).getBundleContext()) != null) {
                zu3 zu3Var2 = new zu3(bundleContext);
                c = zu3Var2;
                zu3Var2.i();
            }
            zu3Var = c;
        }
        return zu3Var;
    }

    private Bundle h(BundleContext bundleContext) {
        Bundle[] bundles;
        for (Bundle bundle : bundleContext.getBundles()) {
            String symbolicName = bundle.getSymbolicName();
            if (symbolicName != null && (symbolicName.endsWith("jersey-server") || symbolicName.endsWith("jersey-gf-server"))) {
                return bundle;
            }
        }
        return null;
    }

    private void i() {
        mn4 mn4Var;
        m();
        n();
        this.d.addBundleListener(this);
        l();
        try {
            if (h(this.d) == null) {
                b.config("jersey-client bundle registers JAX-RS RuntimeDelegate");
                mn4Var = (mn4) getClass().getClassLoader().loadClass("com.sun.ws.rs.ext.RuntimeDelegateImpl").newInstance();
            } else {
                b.config("jersey-server bundle activator registers JAX-RS RuntimeDelegate instance");
                mn4Var = (mn4) getClass().getClassLoader().loadClass("com.sun.jersey.server.impl.provider.RuntimeDelegateImpl").newInstance();
            }
        } catch (Exception e) {
            b.log(Level.SEVERE, "Unable to create RuntimeDelegate instance.", (Throwable) e);
            mn4Var = null;
        }
        mn4.h(mn4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<Class<?>> j(String str) {
        this.f.readLock().lock();
        try {
            LinkedList linkedList = new LinkedList();
            for (Map<String, Callable<List<Class<?>>>> map : this.e.values()) {
                if (map.containsKey(str)) {
                    try {
                        linkedList.addAll(map.get(str).call());
                    } catch (Exception unused) {
                    }
                }
            }
            return linkedList;
        } finally {
            this.f.readLock().unlock();
        }
    }

    private void k(Bundle bundle) {
        Logger logger = b;
        Level level = Level.FINEST;
        if (logger.isLoggable(level)) {
            logger.log(level, "checking bundle {0}", Long.valueOf(bundle.getBundleId()));
        }
        this.f.writeLock().lock();
        try {
            Map<String, Callable<List<Class<?>>>> map = this.e.get(Long.valueOf(bundle.getBundleId()));
            if (map == null) {
                map = new ConcurrentHashMap<>();
                this.e.put(Long.valueOf(bundle.getBundleId()), map);
            }
            this.f.writeLock().unlock();
            Enumeration findEntries = bundle.findEntries("META-INF/services/", tm4.g, false);
            if (findEntries != null) {
                while (findEntries.hasMoreElements()) {
                    URL url = (URL) findEntries.nextElement();
                    String url2 = url.toString();
                    if (!url2.endsWith("/")) {
                        String substring = url2.substring(url2.lastIndexOf("/") + 1);
                        map.put(substring, new b(substring, url, bundle));
                    }
                }
            }
        } catch (Throwable th) {
            this.f.writeLock().unlock();
            throw th;
        }
    }

    private void l() {
        Bundle[] bundles;
        for (Bundle bundle : this.d.getBundles()) {
            if (bundle.getState() == 4 || bundle.getState() == 8 || bundle.getState() == 32 || bundle.getState() == 16) {
                k(bundle);
            }
        }
    }

    private void m() {
        pw3.d(new a());
    }

    private void n() {
        py3.J(new c(this, null));
    }

    public void e(BundleEvent bundleEvent) {
        if (bundleEvent.getType() == 32) {
            k(bundleEvent.getBundle());
        } else if (bundleEvent.getType() == 64 || bundleEvent.getType() == 16) {
            Bundle bundle = bundleEvent.getBundle();
            this.f.writeLock().lock();
            try {
                this.e.remove(Long.valueOf(bundle.getBundleId()));
                this.g.values().removeAll(Collections.singleton(bundle));
                if (bundle.getSymbolicName().equals(a)) {
                    this.d.removeBundleListener(this);
                    this.e.clear();
                }
            } finally {
                this.f.writeLock().unlock();
            }
        }
    }

    public Class<?> f(String str) throws ClassNotFoundException {
        Bundle bundle = this.g.get(str);
        if (bundle != null) {
            return bundle.loadClass(str);
        }
        throw new ClassNotFoundException(str);
    }

    /* compiled from: OsgiRegistry.java */
    /* loaded from: classes3.dex */
    public final class c<T> extends py3.f<T> {
        public final py3.f b;

        /* compiled from: OsgiRegistry.java */
        /* loaded from: classes3.dex */
        public class a implements Iterator<T> {
            public Iterator<Class<?>> s;
            public final /* synthetic */ List t;
            public final /* synthetic */ Class u;
            public final /* synthetic */ String v;

            public a(List list, Class cls, String str) {
                this.t = list;
                this.u = cls;
                this.v = str;
                this.s = list.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.s.hasNext();
            }

            @Override // java.util.Iterator
            public T next() {
                Class<?> next = this.s.next();
                try {
                    return (T) this.u.cast(next.newInstance());
                } catch (Exception e) {
                    oy3 oy3Var = new oy3(this.v + ": " + sx3.h(next.getName(), this.u, e.getLocalizedMessage()));
                    oy3Var.initCause(e);
                    throw oy3Var;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: OsgiRegistry.java */
        /* loaded from: classes3.dex */
        public class b implements Iterator<Class<T>> {
            public Iterator<Class<?>> s;
            public final /* synthetic */ List t;

            public b(List list) {
                this.t = list;
                this.s = list.iterator();
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Class<T> next() {
                return (Class<T>) this.s.next();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.s.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        private c() {
            this.b = new py3.c();
        }

        @Override // com.p7700g.p99005.py3.f
        public Iterator<Class<T>> c(Class<T> cls, String str, ClassLoader classLoader, boolean z) {
            List j = zu3.this.j(str);
            if (!j.isEmpty()) {
                return new b(j);
            }
            return this.b.c(cls, str, classLoader, z);
        }

        @Override // com.p7700g.p99005.py3.f
        public Iterator<T> d(Class<T> cls, String str, ClassLoader classLoader, boolean z) {
            List j = zu3.this.j(str);
            if (!j.isEmpty()) {
                return new a(j, cls, str);
            }
            return this.b.d(cls, str, classLoader, z);
        }

        public /* synthetic */ c(zu3 zu3Var, a aVar) {
            this();
        }
    }
}