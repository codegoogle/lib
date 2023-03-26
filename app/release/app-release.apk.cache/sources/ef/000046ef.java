package com.p7700g.p99005;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Properties;

/* compiled from: FactoryFinder.java */
/* loaded from: classes3.dex */
public class hn4 {

    /* compiled from: FactoryFinder.java */
    /* loaded from: classes3.dex */
    public static class a implements PrivilegedAction<ClassLoader> {
        @Override // java.security.PrivilegedAction
        /* renamed from: a */
        public ClassLoader run() {
            try {
                return Thread.currentThread().getContextClassLoader();
            } catch (SecurityException unused) {
                return null;
            }
        }
    }

    public static Object a(String str, String str2) throws ClassNotFoundException {
        InputStream resourceAsStream;
        ClassLoader b = b();
        String t = wo1.t("META-INF/services/", str);
        try {
            if (b == null) {
                resourceAsStream = ClassLoader.getSystemResourceAsStream(t);
            } else {
                resourceAsStream = b.getResourceAsStream(t);
            }
            if (resourceAsStream != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(resourceAsStream, "UTF-8"));
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                if (readLine != null && !"".equals(readLine)) {
                    return c(readLine, b);
                }
            }
        } catch (Exception unused) {
        }
        try {
            String property = System.getProperty("java.home");
            StringBuilder sb = new StringBuilder();
            sb.append(property);
            String str3 = File.separator;
            sb.append(str3);
            sb.append("lib");
            sb.append(str3);
            sb.append("jaxrs.properties");
            File file = new File(sb.toString());
            if (file.exists()) {
                Properties properties = new Properties();
                properties.load(new FileInputStream(file));
                return c(properties.getProperty(str), b);
            }
        } catch (Exception unused2) {
        }
        try {
            String property2 = System.getProperty(str);
            if (property2 != null) {
                return c(property2, b);
            }
        } catch (SecurityException unused3) {
        }
        if (str2 != null) {
            return c(str2, b);
        }
        throw new ClassNotFoundException(wo1.u("Provider for ", str, " cannot be found"), null);
    }

    public static ClassLoader b() {
        return (ClassLoader) AccessController.doPrivileged(new a());
    }

    private static Object c(String str, ClassLoader classLoader) throws ClassNotFoundException {
        Class<?> cls;
        try {
            try {
                if (classLoader == null) {
                    cls = Class.forName(str);
                } else {
                    try {
                        cls = Class.forName(str, false, classLoader);
                    } catch (ClassNotFoundException unused) {
                        cls = Class.forName(str);
                    }
                }
                return cls.newInstance();
            } catch (ClassNotFoundException e) {
                throw e;
            }
        } catch (Exception e2) {
            throw new ClassNotFoundException("Provider " + str + " could not be instantiated: " + e2, e2);
        }
    }
}