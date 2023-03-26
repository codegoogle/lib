package com.p7700g.p99005;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import org.jetbrains.annotations.NotNull;

/* compiled from: FastServiceLoader.kt */
@vo4(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J!\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\t\u001a\u00020\u0004H\u0082\bJ1\u0010\n\u001a\u0002H\u000b\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\bH\u0002¢\u0006\u0002\u0010\u0010J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012H\u0000¢\u0006\u0002\b\u0014J/\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u000b0\u0012\"\u0004\b\u0000\u0010\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J,\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e*\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u0002H\u001e0!H\u0082\b¢\u0006\u0002\u0010\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlinx/coroutines/internal/FastServiceLoader;", "", "()V", "PREFIX", "", "createInstanceOf", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "baseClass", "Ljava/lang/Class;", "serviceClass", "getProviderInstance", "S", "name", "loader", "Ljava/lang/ClassLoader;", kg.B0, "(Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/Class;)Ljava/lang/Object;", "load", "", "loadMainDispatcherFactory", "loadMainDispatcherFactory$kotlinx_coroutines_core", "loadProviders", "loadProviders$kotlinx_coroutines_core", "parse", "url", "Ljava/net/URL;", "parseFile", "r", "Ljava/io/BufferedReader;", "use", "R", "Ljava/util/jar/JarFile;", "block", "Lkotlin/Function1;", "(Ljava/util/jar/JarFile;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class xl5 {
    @NotNull
    public static final xl5 a = new xl5();
    @NotNull
    private static final String b = "META-INF/services/";

    private xl5() {
    }

    private final mm5 a(Class<mm5> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> S b(String str, ClassLoader classLoader, Class<S> cls) {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> c(Class<S> cls, ClassLoader classLoader) {
        try {
            return e(cls, classLoader);
        } catch (Throwable unused) {
            return rs4.Q5(ServiceLoader.load(cls, classLoader));
        }
    }

    private final List<String> f(URL url) {
        String url2 = url.toString();
        if (b95.u2(url2, "jar", false, 2, null)) {
            String w5 = c95.w5(c95.p5(url2, "jar:file:", null, 2, null), '!', null, 2, null);
            String p5 = c95.p5(url2, "!/", null, 2, null);
            JarFile jarFile = new JarFile(w5, false);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(p5)), "UTF-8"));
                List<String> g = a.g(bufferedReader);
                ux4.a(bufferedReader, null);
                jarFile.close();
                return g;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        jarFile.close();
                        throw th2;
                    } catch (Throwable th3) {
                        co4.a(th, th3);
                        throw th;
                    }
                }
            }
        }
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(url.openStream()));
        try {
            List<String> g2 = a.g(bufferedReader2);
            ux4.a(bufferedReader2, null);
            return g2;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ux4.a(bufferedReader2, th4);
                throw th5;
            }
        }
    }

    private final List<String> g(BufferedReader bufferedReader) {
        boolean z;
        boolean z2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return rs4.Q5(linkedHashSet);
            }
            String obj = c95.E5(c95.x5(readLine, "#", null, 2, null)).toString();
            int i = 0;
            while (true) {
                if (i >= obj.length()) {
                    z = true;
                    break;
                }
                char charAt = obj.charAt(i);
                i++;
                if (charAt == '.' || Character.isJavaIdentifierPart(charAt)) {
                    z2 = true;
                    continue;
                } else {
                    z2 = false;
                    continue;
                }
                if (!z2) {
                    z = false;
                    break;
                }
            }
            if (z) {
                if (obj.length() > 0) {
                    linkedHashSet.add(obj);
                }
            } else {
                throw new IllegalArgumentException(c25.C("Illegal service provider class name: ", obj).toString());
            }
        }
    }

    private final <R> R h(JarFile jarFile, f05<? super JarFile, ? extends R> f05Var) {
        try {
            R M = f05Var.M(jarFile);
            z15.d(1);
            jarFile.close();
            z15.c(1);
            return M;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                z15.d(1);
                try {
                    jarFile.close();
                    z15.c(1);
                    throw th2;
                } catch (Throwable th3) {
                    co4.a(th, th3);
                    throw th;
                }
            }
        }
    }

    @NotNull
    public final List<mm5> d() {
        mm5 mm5Var;
        if (!yl5.a()) {
            return c(mm5.class, mm5.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            mm5 mm5Var2 = null;
            try {
                mm5Var = (mm5) mm5.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, mm5.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused) {
                mm5Var = null;
            }
            if (mm5Var != null) {
                arrayList.add(mm5Var);
            }
            try {
                mm5Var2 = (mm5) mm5.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, mm5.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
            } catch (ClassNotFoundException unused2) {
            }
            if (mm5Var2 == null) {
                return arrayList;
            }
            arrayList.add(mm5Var2);
            return arrayList;
        } catch (Throwable unused3) {
            return c(mm5.class, mm5.class.getClassLoader());
        }
    }

    @NotNull
    public final <S> List<S> e(@NotNull Class<S> cls, @NotNull ClassLoader classLoader) {
        ArrayList<URL> list = Collections.list(classLoader.getResources(c25.C(b, cls.getName())));
        c25.o(list, "list(this)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            os4.o0(arrayList, a.f(url));
        }
        Set<String> V5 = rs4.V5(arrayList);
        if (!V5.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(ks4.Z(V5, 10));
            for (String str : V5) {
                arrayList2.add(a.b(str, classLoader, cls));
            }
            return arrayList2;
        }
        throw new IllegalArgumentException("No providers were loaded with FastServiceLoader".toString());
    }
}