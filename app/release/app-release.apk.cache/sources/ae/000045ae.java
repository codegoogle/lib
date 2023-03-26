package com.p7700g.p99005;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.DexFile;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.zip.ZipFile;

/* compiled from: MultiDex.java */
/* loaded from: classes.dex */
public final class h20 {
    public static final String a = "MultiDex";
    private static final String b = "secondary-dexes";
    private static final String c = "code_cache";
    private static final String d = "secondary-dexes";
    private static final int e = 20;
    private static final int f = 4;
    private static final int g = 2;
    private static final int h = 1;
    private static final String i = "";
    private static final Set<File> j = new HashSet();
    private static final boolean k = o(System.getProperty("java.vm.version"));

    /* compiled from: MultiDex.java */
    /* loaded from: classes.dex */
    public static final class a {
        private static final int a = 4;
        private final InterfaceC0186a b;

        /* compiled from: MultiDex.java */
        /* renamed from: com.p7700g.p99005.h20$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public interface InterfaceC0186a {
            Object a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException;
        }

        /* compiled from: MultiDex.java */
        /* loaded from: classes.dex */
        public static class b implements InterfaceC0186a {
            private final Constructor<?> a;

            public b(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, ZipFile.class, DexFile.class);
                this.a = constructor;
                constructor.setAccessible(true);
            }

            @Override // com.p7700g.p99005.h20.a.InterfaceC0186a
            public Object a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException, IOException {
                return this.a.newInstance(file, new ZipFile(file), dexFile);
            }
        }

        /* compiled from: MultiDex.java */
        /* loaded from: classes.dex */
        public static class c implements InterfaceC0186a {
            private final Constructor<?> a;

            public c(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, File.class, DexFile.class);
                this.a = constructor;
                constructor.setAccessible(true);
            }

            @Override // com.p7700g.p99005.h20.a.InterfaceC0186a
            public Object a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.a.newInstance(file, file, dexFile);
            }
        }

        /* compiled from: MultiDex.java */
        /* loaded from: classes.dex */
        public static class d implements InterfaceC0186a {
            private final Constructor<?> a;

            public d(Class<?> cls) throws SecurityException, NoSuchMethodException {
                Constructor<?> constructor = cls.getConstructor(File.class, Boolean.TYPE, File.class, DexFile.class);
                this.a = constructor;
                constructor.setAccessible(true);
            }

            @Override // com.p7700g.p99005.h20.a.InterfaceC0186a
            public Object a(File file, DexFile dexFile) throws IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
                return this.a.newInstance(file, Boolean.FALSE, file, dexFile);
            }
        }

        private a() throws ClassNotFoundException, SecurityException, NoSuchMethodException {
            InterfaceC0186a dVar;
            Class<?> cls = Class.forName("dalvik.system.DexPathList$Element");
            try {
                try {
                    dVar = new b(cls);
                } catch (NoSuchMethodException unused) {
                    dVar = new d(cls);
                }
            } catch (NoSuchMethodException unused2) {
                dVar = new c(cls);
            }
            this.b = dVar;
        }

        public static void a(ClassLoader classLoader, List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {
            Object obj = h20.g(classLoader, "pathList").get(classLoader);
            Object[] b2 = new a().b(list);
            try {
                h20.f(obj, "dexElements", b2);
            } catch (NoSuchFieldException unused) {
                h20.f(obj, "pathElements", b2);
            }
        }

        private Object[] b(List<? extends File> list) throws IOException, SecurityException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
            int size = list.size();
            Object[] objArr = new Object[size];
            for (int i = 0; i < size; i++) {
                File file = list.get(i);
                objArr[i] = this.b.a(file, DexFile.loadDex(file.getPath(), c(file), 0));
            }
            return objArr;
        }

        private static String c(File file) {
            File parentFile = file.getParentFile();
            String name = file.getName();
            return new File(parentFile, name.substring(0, name.length() - a) + j20.u).getPath();
        }
    }

    /* compiled from: MultiDex.java */
    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public static void a(ClassLoader classLoader, List<? extends File> list, File file) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException {
            IOException[] iOExceptionArr;
            Object obj = h20.g(classLoader, "pathList").get(classLoader);
            ArrayList arrayList = new ArrayList();
            h20.f(obj, "dexElements", b(obj, new ArrayList(list), file, arrayList));
            if (arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    IOException iOException = (IOException) it.next();
                }
                Field g = h20.g(obj, "dexElementsSuppressedExceptions");
                IOException[] iOExceptionArr2 = (IOException[]) g.get(obj);
                if (iOExceptionArr2 == null) {
                    iOExceptionArr = (IOException[]) arrayList.toArray(new IOException[arrayList.size()]);
                } else {
                    IOException[] iOExceptionArr3 = new IOException[arrayList.size() + iOExceptionArr2.length];
                    arrayList.toArray(iOExceptionArr3);
                    System.arraycopy(iOExceptionArr2, 0, iOExceptionArr3, arrayList.size(), iOExceptionArr2.length);
                    iOExceptionArr = iOExceptionArr3;
                }
                g.set(obj, iOExceptionArr);
                IOException iOException2 = new IOException("I/O exception during makeDexElement");
                iOException2.initCause((Throwable) arrayList.get(0));
                throw iOException2;
            }
        }

        private static Object[] b(Object obj, ArrayList<File> arrayList, File file, ArrayList<IOException> arrayList2) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException {
            return (Object[]) h20.h(obj, "makeDexElements", ArrayList.class, File.class, ArrayList.class).invoke(obj, arrayList, file, arrayList2);
        }
    }

    /* compiled from: MultiDex.java */
    /* loaded from: classes.dex */
    public static final class c {
        private c() {
        }

        public static void a(ClassLoader classLoader, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, IOException {
            int size = list.size();
            Field g = h20.g(classLoader, la1.k);
            StringBuilder sb = new StringBuilder((String) g.get(classLoader));
            String[] strArr = new String[size];
            File[] fileArr = new File[size];
            ZipFile[] zipFileArr = new ZipFile[size];
            DexFile[] dexFileArr = new DexFile[size];
            ListIterator<? extends File> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                File next = listIterator.next();
                String absolutePath = next.getAbsolutePath();
                sb.append(':');
                sb.append(absolutePath);
                int previousIndex = listIterator.previousIndex();
                strArr[previousIndex] = absolutePath;
                fileArr[previousIndex] = next;
                zipFileArr[previousIndex] = new ZipFile(next);
                dexFileArr[previousIndex] = DexFile.loadDex(absolutePath, absolutePath + j20.u, 0);
            }
            g.set(classLoader, sb.toString());
            h20.f(classLoader, "mPaths", strArr);
            h20.f(classLoader, "mFiles", fileArr);
            h20.f(classLoader, "mZips", zipFileArr);
            h20.f(classLoader, "mDexs", dexFileArr);
        }
    }

    private h20() {
    }

    private static void d(Context context) throws Exception {
        File file = new File(context.getFilesDir(), "secondary-dexes");
        if (file.isDirectory()) {
            file.getPath();
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                file.getPath();
                return;
            }
            for (File file2 : listFiles) {
                file2.getPath();
                file2.length();
                if (!file2.delete()) {
                    file2.getPath();
                } else {
                    file2.getPath();
                }
            }
            if (!file.delete()) {
                file.getPath();
            } else {
                file.getPath();
            }
        }
    }

    private static void e(Context context, File file, File file2, String str, String str2, boolean z) throws IOException, IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, InstantiationException {
        Set<File> set = j;
        synchronized (set) {
            if (set.contains(file)) {
                return;
            }
            set.add(file);
            System.getProperty("java.vm.version");
            ClassLoader j2 = j(context);
            if (j2 == null) {
                return;
            }
            try {
                d(context);
            } catch (Throwable unused) {
            }
            File k2 = k(context, file2, str);
            j20 j20Var = new j20(file, k2);
            IOException e2 = null;
            try {
                n(j2, k2, j20Var.k(context, str2, false));
            } catch (IOException e3) {
                if (z) {
                    n(j2, k2, j20Var.k(context, str2, true));
                } else {
                    throw e3;
                }
            }
            try {
                j20Var.close();
            } catch (IOException e4) {
                e2 = e4;
            }
            if (e2 != null) {
                throw e2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Object obj, String str, Object[] objArr) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        Field g2 = g(obj, str);
        Object[] objArr2 = (Object[]) g2.get(obj);
        Object[] objArr3 = (Object[]) Array.newInstance(objArr2.getClass().getComponentType(), objArr2.length + objArr.length);
        System.arraycopy(objArr2, 0, objArr3, 0, objArr2.length);
        System.arraycopy(objArr, 0, objArr3, objArr2.length, objArr.length);
        g2.set(obj, objArr3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field g(Object obj, String str) throws NoSuchFieldException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
            }
        }
        StringBuilder M = wo1.M("Field ", str, " not found in ");
        M.append(obj.getClass());
        throw new NoSuchFieldException(M.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Method h(Object obj, String str, Class<?>... clsArr) throws NoSuchMethodException {
        for (Class<?> cls = obj.getClass(); cls != null; cls = cls.getSuperclass()) {
            try {
                Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
            }
        }
        StringBuilder M = wo1.M("Method ", str, " with parameters ");
        M.append(Arrays.asList(clsArr));
        M.append(" not found in ");
        M.append(obj.getClass());
        throw new NoSuchMethodException(M.toString());
    }

    private static ApplicationInfo i(Context context) {
        try {
            return context.getApplicationInfo();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    private static ClassLoader j(Context context) {
        ClassLoader classLoader;
        try {
            classLoader = context.getClassLoader();
        } catch (RuntimeException unused) {
        }
        if (classLoader instanceof BaseDexClassLoader) {
            return classLoader;
        }
        return null;
    }

    private static File k(Context context, File file, String str) throws IOException {
        File file2 = new File(file, c);
        try {
            p(file2);
        } catch (IOException unused) {
            file2 = new File(context.getFilesDir(), c);
            p(file2);
        }
        File file3 = new File(file2, str);
        p(file3);
        return file3;
    }

    public static void l(Context context) {
        if (k) {
            return;
        }
        try {
            ApplicationInfo i2 = i(context);
            if (i2 == null) {
                return;
            }
            e(context, new File(i2.sourceDir), new File(i2.dataDir), "secondary-dexes", "", true);
        } catch (Exception e2) {
            StringBuilder G = wo1.G("MultiDex installation failed (");
            G.append(e2.getMessage());
            G.append(").");
            throw new RuntimeException(G.toString());
        }
    }

    public static void m(Context context, Context context2) {
        ApplicationInfo i2;
        if (k) {
            return;
        }
        try {
            ApplicationInfo i3 = i(context);
            if (i3 == null || (i2 = i(context2)) == null) {
                return;
            }
            String str = context.getPackageName() + CryptoConstants.ALIAS_SEPARATOR;
            File file = new File(i2.dataDir);
            e(context2, new File(i3.sourceDir), file, str + "secondary-dexes", str, false);
            e(context2, new File(i2.sourceDir), file, "secondary-dexes", "", false);
        } catch (Exception e2) {
            StringBuilder G = wo1.G("MultiDex installation failed (");
            G.append(e2.getMessage());
            G.append(").");
            throw new RuntimeException(G.toString());
        }
    }

    private static void n(ClassLoader classLoader, File file, List<? extends File> list) throws IllegalArgumentException, IllegalAccessException, NoSuchFieldException, InvocationTargetException, NoSuchMethodException, IOException, SecurityException, ClassNotFoundException, InstantiationException {
        if (list.isEmpty()) {
            return;
        }
        b.a(classLoader, list, file);
    }

    public static boolean o(String str) {
        if (str != null) {
            StringTokenizer stringTokenizer = new StringTokenizer(str, CryptoConstants.ALIAS_SEPARATOR);
            String nextToken = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            String nextToken2 = stringTokenizer.hasMoreTokens() ? stringTokenizer.nextToken() : null;
            if (nextToken == null || nextToken2 == null) {
                return false;
            }
            try {
                int parseInt = Integer.parseInt(nextToken);
                return parseInt > 2 || (parseInt == 2 && Integer.parseInt(nextToken2) >= 1);
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    private static void p(File file) throws IOException {
        file.mkdir();
        if (file.isDirectory()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null) {
            file.getPath();
        } else {
            file.getPath();
            parentFile.isDirectory();
            parentFile.isFile();
            parentFile.exists();
            parentFile.canRead();
            parentFile.canWrite();
        }
        StringBuilder G = wo1.G("Failed to create directory ");
        G.append(file.getPath());
        throw new IOException(G.toString());
    }
}