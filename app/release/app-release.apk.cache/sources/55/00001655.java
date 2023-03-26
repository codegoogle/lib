package com.facebook.soloader;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.StrictMode;
import android.text.TextUtils;
import com.p7700g.p99005.wo1;
import dalvik.system.BaseDexClassLoader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

/* compiled from: SoLoader.java */
@ThreadSafe
/* loaded from: classes2.dex */
public class w {
    public static final String a = "SoLoader";
    public static final boolean b = false;
    @Nullable
    public static v d = null;
    @GuardedBy("sSoSourcesLock")
    @Nullable
    private static a0[] h = null;
    @GuardedBy("sSoSourcesLock")
    @Nullable
    private static com.facebook.soloader.c i = null;
    private static final String n = "lib-main";
    private static final String o = "lib-";
    public static final int p = 1;
    public static final int q = 2;
    public static final int r = 4;
    public static final int s = 8;
    @GuardedBy("sSoSourcesLock")
    private static int t;
    private static final ReentrantReadWriteLock e = new ReentrantReadWriteLock();
    @GuardedBy("sSoSourcesLock")
    @Nullable
    private static x[] f = null;
    private static int g = 0;
    @GuardedBy("SoLoader.class")
    private static final HashSet<String> j = new HashSet<>();
    @GuardedBy("SoLoader.class")
    private static final Map<String, Object> k = new HashMap();
    private static final Set<String> l = Collections.newSetFromMap(new ConcurrentHashMap());
    @Nullable
    private static z m = null;
    public static final boolean c = true;

    /* compiled from: SoLoader.java */
    /* loaded from: classes2.dex */
    public static class a implements v {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ Runtime d;
        public final /* synthetic */ Method e;

        public a(boolean z, String str, String str2, Runtime runtime, Method method) {
            this.a = z;
            this.b = str;
            this.c = str2;
            this.d = runtime;
            this.e = method;
        }

        private String b(String str) {
            try {
                File file = new File(str);
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read > 0) {
                            messageDigest.update(bArr, 0, read);
                        } else {
                            String format = String.format("%32x", new BigInteger(1, messageDigest.digest()));
                            fileInputStream.close();
                            return format;
                        }
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e) {
                return e.toString();
            } catch (SecurityException e2) {
                return e2.toString();
            } catch (NoSuchAlgorithmException e3) {
                return e3.toString();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
            if (r10 == null) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
            b(r9);
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:?, code lost:
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
        @Override // com.facebook.soloader.v
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void a(String str, int i) {
            Throwable th;
            Throwable e;
            if (this.a) {
                String str2 = (i & 4) == 4 ? this.b : this.c;
                try {
                    try {
                        try {
                            synchronized (this.d) {
                                try {
                                    String str3 = (String) this.e.invoke(this.d, str, w.class.getClassLoader(), str2);
                                    if (str3 != null) {
                                        throw new UnsatisfiedLinkError(str3);
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    } catch (IllegalAccessException e2) {
                        e = e2;
                        e = e;
                        throw new RuntimeException("Error: Cannot load " + str, e);
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        e = e;
                        throw new RuntimeException("Error: Cannot load " + str, e);
                    } catch (InvocationTargetException e4) {
                        e = e4;
                        e = e;
                        throw new RuntimeException("Error: Cannot load " + str, e);
                    } catch (Throwable th4) {
                        th = th4;
                        str2 = null;
                        if (str2 != null) {
                        }
                        throw th;
                    }
                    try {
                        throw th;
                    } catch (IllegalAccessException e5) {
                        e = e5;
                        throw new RuntimeException("Error: Cannot load " + str, e);
                    } catch (IllegalArgumentException e6) {
                        e = e6;
                        throw new RuntimeException("Error: Cannot load " + str, e);
                    } catch (InvocationTargetException e7) {
                        e = e7;
                        throw new RuntimeException("Error: Cannot load " + str, e);
                    }
                } catch (Throwable th5) {
                    th = th5;
                    if (str2 != null) {
                        b(str);
                    }
                    throw th;
                }
            }
            System.load(str);
        }
    }

    /* compiled from: SoLoader.java */
    @e
    @TargetApi(14)
    /* loaded from: classes2.dex */
    public static class b {
        private b() {
        }

        public static String a() {
            ClassLoader classLoader = w.class.getClassLoader();
            if (classLoader instanceof BaseDexClassLoader) {
                try {
                    return (String) BaseDexClassLoader.class.getMethod("getLdLibraryPath", new Class[0]).invoke((BaseDexClassLoader) classLoader, new Object[0]);
                } catch (Exception e) {
                    throw new RuntimeException("Cannot call getLdLibraryPath", e);
                }
            }
            StringBuilder G = wo1.G("ClassLoader ");
            G.append(classLoader.getClass().getName());
            G.append(" should be of type BaseDexClassLoader");
            throw new IllegalStateException(G.toString());
        }
    }

    /* compiled from: SoLoader.java */
    /* loaded from: classes2.dex */
    public static final class c extends UnsatisfiedLinkError {
        public c(Throwable th) {
            super("APK was built for a different platform");
            initCause(th);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        r0 = r3[r4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        r0 = com.facebook.soloader.w.e;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a() {
        ReentrantReadWriteLock reentrantReadWriteLock = e;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f != null) {
                String[] h2 = y.h();
                int i2 = 0;
                loop0: while (true) {
                    x[] xVarArr = f;
                    if (i2 >= xVarArr.length) {
                        e.readLock().unlock();
                        return true;
                    }
                    String[] b2 = xVarArr[i2].b();
                    int i3 = 0;
                    while (i3 < b2.length) {
                        boolean z = false;
                        for (int i4 = 0; i4 < h2.length && !z; i4++) {
                            z = b2[i3].equals(h2[i4]);
                        }
                        if (!z) {
                            break loop0;
                        }
                        i3++;
                    }
                    i2++;
                }
            }
            reentrantReadWriteLock.readLock().unlock();
            return false;
        } catch (Throwable th) {
            e.readLock().unlock();
            throw th;
        }
    }

    private static void b() {
        ReentrantReadWriteLock reentrantReadWriteLock = e;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f != null) {
                reentrantReadWriteLock.readLock().unlock();
                return;
            }
            throw new RuntimeException("SoLoader.init() not yet called");
        } catch (Throwable th) {
            e.readLock().unlock();
            throw th;
        }
    }

    public static void c() {
        v(null);
    }

    private static void d(String str, int i2, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        boolean z;
        UnsatisfiedLinkError unsatisfiedLinkError;
        boolean z2;
        ReentrantReadWriteLock reentrantReadWriteLock = e;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f != null) {
                reentrantReadWriteLock.readLock().unlock();
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                if (c) {
                    com.facebook.soloader.a.a("SoLoader.loadLibrary[" + str + "]");
                }
                int i3 = 0;
                do {
                    try {
                        e.readLock().lock();
                        int i4 = g;
                        int i5 = 0;
                        while (true) {
                            if (i3 != 0) {
                                break;
                            }
                            x[] xVarArr = f;
                            if (i5 < xVarArr.length) {
                                i3 = xVarArr[i5].c(str, i2, threadPolicy);
                                if (i3 == 3 && h != null) {
                                    a0[] a0VarArr = h;
                                    int length = a0VarArr.length;
                                    int i6 = 0;
                                    while (true) {
                                        if (i6 >= length) {
                                            break;
                                        }
                                        a0 a0Var = a0VarArr[i6];
                                        a0Var.p(str);
                                        int c2 = a0Var.c(str, i2, threadPolicy);
                                        if (c2 == 1) {
                                            i3 = c2;
                                            break;
                                        }
                                        i6++;
                                    }
                                } else {
                                    i5++;
                                }
                            } else {
                                break;
                            }
                        }
                        ReentrantReadWriteLock reentrantReadWriteLock2 = e;
                        reentrantReadWriteLock2.readLock().unlock();
                        if ((i2 & 2) == 2 && i3 == 0) {
                            reentrantReadWriteLock2.writeLock().lock();
                            com.facebook.soloader.c cVar = i;
                            if (cVar != null && cVar.f()) {
                                g++;
                            }
                            z2 = g != i4;
                            reentrantReadWriteLock2.writeLock().unlock();
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                    } finally {
                        if (i3 == 0 || i3 == r4) {
                        }
                    }
                } while (z2);
                if (c) {
                    com.facebook.soloader.a.b();
                }
                if (z) {
                    StrictMode.setThreadPolicy(threadPolicy);
                }
                if (i3 == 0 || i3 == 3) {
                    throw new UnsatisfiedLinkError(wo1.t("couldn't find DSO to load: ", str));
                }
                return;
            }
            throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
        } catch (Throwable th) {
            e.readLock().unlock();
            throw th;
        }
    }

    @Nullable
    private static Method e() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23 && i2 <= 27) {
            try {
                Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (NoSuchMethodException | SecurityException unused) {
            }
        }
        return null;
    }

    public static void f(Context context, int i2) throws IOException {
        g(context, i2, null);
    }

    private static void g(Context context, int i2, @Nullable v vVar) throws IOException {
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        try {
            i(vVar);
            j(context, i2, vVar);
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
        }
    }

    public static void h(Context context, boolean z) {
        try {
            f(context, z ? 1 : 0);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private static synchronized void i(@Nullable v vVar) {
        synchronized (w.class) {
            if (vVar != null) {
                d = vVar;
                return;
            }
            Runtime runtime = Runtime.getRuntime();
            Method e2 = e();
            boolean z = e2 != null;
            String a2 = z ? b.a() : null;
            d = new a(z, a2, p(a2), runtime, e2);
        }
    }

    private static void j(Context context, int i2, @Nullable v vVar) throws IOException {
        int i3;
        e.writeLock().lock();
        try {
            if (f == null) {
                t = i2;
                ArrayList arrayList = new ArrayList();
                String str = System.getenv("LD_LIBRARY_PATH");
                if (str == null) {
                    str = "/vendor/lib:/system/lib";
                }
                String[] split = str.split(":");
                for (int i4 = 0; i4 < split.length; i4++) {
                    String str2 = split[i4];
                    arrayList.add(new d(new File(split[i4]), 2));
                }
                if (context != null) {
                    if ((i2 & 1) != 0) {
                        h = null;
                        arrayList.add(0, new n(context, n));
                    } else {
                        int i5 = context.getApplicationInfo().flags;
                        if ((i5 & 1) != 0 && (i5 & 128) == 0) {
                            i3 = 0;
                        } else {
                            com.facebook.soloader.c cVar = new com.facebook.soloader.c(context, 0);
                            i = cVar;
                            cVar.toString();
                            arrayList.add(0, i);
                            i3 = 1;
                        }
                        if ((t & 8) != 0) {
                            h = null;
                        } else {
                            File file = new File(context.getApplicationInfo().sourceDir);
                            ArrayList arrayList2 = new ArrayList();
                            com.facebook.soloader.b bVar = new com.facebook.soloader.b(context, file, n, i3);
                            arrayList2.add(bVar);
                            bVar.toString();
                            if (context.getApplicationInfo().splitSourceDirs != null) {
                                String[] strArr = context.getApplicationInfo().splitSourceDirs;
                                int length = strArr.length;
                                int i6 = 0;
                                int i7 = 0;
                                while (i6 < length) {
                                    com.facebook.soloader.b bVar2 = new com.facebook.soloader.b(context, new File(strArr[i6]), o + i7, i3);
                                    bVar2.toString();
                                    arrayList2.add(bVar2);
                                    i6++;
                                    i7++;
                                }
                            }
                            h = (a0[]) arrayList2.toArray(new a0[arrayList2.size()]);
                            arrayList.addAll(0, arrayList2);
                        }
                    }
                }
                x[] xVarArr = (x[]) arrayList.toArray(new x[arrayList.size()]);
                int q2 = q();
                int length2 = xVarArr.length;
                while (true) {
                    int i8 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    String str3 = "Preparing SO source: " + xVarArr[i8];
                    xVarArr[i8].d(q2);
                    length2 = i8;
                }
                f = xVarArr;
                g++;
            }
        } finally {
            e.writeLock().unlock();
        }
    }

    public static boolean k(String str) {
        return l(str, 0);
    }

    public static boolean l(String str, int i2) throws UnsatisfiedLinkError {
        boolean z;
        ReentrantReadWriteLock reentrantReadWriteLock = e;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    b();
                } else {
                    synchronized (w.class) {
                        z = !j.contains(str);
                        if (z) {
                            z zVar = m;
                            if (zVar != null) {
                                zVar.a(str);
                            } else {
                                System.loadLibrary(str);
                            }
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return z;
                }
            }
            reentrantReadWriteLock.readLock().unlock();
            String b2 = q.b(str);
            return n(System.mapLibraryName(b2 != null ? b2 : str), str, b2, i2 | 2, null);
        } catch (Throwable th) {
            e.readLock().unlock();
            throw th;
        }
    }

    public static void m(String str, int i2, StrictMode.ThreadPolicy threadPolicy) {
        n(str, null, null, i2, threadPolicy);
    }

    private static boolean n(String str, @Nullable String str2, @Nullable String str3, int i2, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        Object obj;
        boolean z2 = false;
        if (TextUtils.isEmpty(str2) || !l.contains(str2)) {
            synchronized (w.class) {
                HashSet<String> hashSet = j;
                if (!hashSet.contains(str)) {
                    z = false;
                } else if (str3 == null) {
                    return false;
                } else {
                    z = true;
                }
                Map<String, Object> map = k;
                if (map.containsKey(str)) {
                    obj = map.get(str);
                } else {
                    Object obj2 = new Object();
                    map.put(str, obj2);
                    obj = obj2;
                }
                synchronized (obj) {
                    if (!z) {
                        synchronized (w.class) {
                            if (hashSet.contains(str)) {
                                if (str3 == null) {
                                    return false;
                                }
                                z = true;
                            }
                            if (!z) {
                                try {
                                    try {
                                        d(str, i2, threadPolicy);
                                        synchronized (w.class) {
                                            hashSet.add(str);
                                        }
                                    } catch (IOException e2) {
                                        throw new RuntimeException(e2);
                                    }
                                } catch (UnsatisfiedLinkError e3) {
                                    String message = e3.getMessage();
                                    if (message != null && message.contains("unexpected e_machine:")) {
                                        throw new c(e3);
                                    }
                                    throw e3;
                                }
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(str2) && l.contains(str2)) {
                        z2 = true;
                    }
                    if (str3 != null && !z2) {
                        boolean z3 = c;
                        if (z3) {
                            com.facebook.soloader.a.a("MergedSoMapping.invokeJniOnload[" + str2 + "]");
                        }
                        q.a(str2);
                        l.add(str2);
                        if (z3) {
                            com.facebook.soloader.a.b();
                        }
                    }
                    return !z;
                }
            }
        }
        return false;
    }

    public static String o() {
        e.readLock().lock();
        try {
            b();
            ArrayList arrayList = new ArrayList();
            for (x xVar : f) {
                xVar.a(arrayList);
            }
            return TextUtils.join(":", arrayList);
        } finally {
            e.readLock().unlock();
        }
    }

    @Nullable
    public static String p(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    private static int q() {
        ReentrantReadWriteLock reentrantReadWriteLock = e;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i2 = (t & 2) != 0 ? 1 : 0;
            reentrantReadWriteLock.writeLock().unlock();
            return i2;
        } catch (Throwable th) {
            e.writeLock().unlock();
            throw th;
        }
    }

    public static void r(x xVar) throws IOException {
        ReentrantReadWriteLock reentrantReadWriteLock = e;
        reentrantReadWriteLock.writeLock().lock();
        try {
            String str = "Prepending to SO sources: " + xVar;
            b();
            xVar.d(q());
            x[] xVarArr = f;
            x[] xVarArr2 = new x[xVarArr.length + 1];
            xVarArr2[0] = xVar;
            System.arraycopy(xVarArr, 0, xVarArr2, 1, xVarArr.length);
            f = xVarArr2;
            g++;
            String str2 = "Prepended to SO sources: " + xVar;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            e.writeLock().unlock();
            throw th;
        }
    }

    public static void s() {
        synchronized (w.class) {
            j.clear();
            k.clear();
            d = null;
        }
        v(null);
    }

    public static void t() {
        v(new x[]{new t()});
    }

    public static void u(v vVar) {
        d = vVar;
    }

    public static void v(x[] xVarArr) {
        ReentrantReadWriteLock reentrantReadWriteLock = e;
        reentrantReadWriteLock.writeLock().lock();
        try {
            f = xVarArr;
            g++;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            e.writeLock().unlock();
            throw th;
        }
    }

    public static void w(z zVar) {
        m = zVar;
    }

    public static File x(String str) throws UnsatisfiedLinkError {
        b();
        try {
            return y(System.mapLibraryName(str));
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static File y(String str) throws IOException {
        e.readLock().lock();
        int i2 = 0;
        while (true) {
            try {
                x[] xVarArr = f;
                if (i2 < xVarArr.length) {
                    File e2 = xVarArr[i2].e(str);
                    if (e2 != null) {
                        return e2;
                    }
                    i2++;
                } else {
                    e.readLock().unlock();
                    throw new FileNotFoundException(str);
                }
            } finally {
                e.readLock().unlock();
            }
        }
    }
}