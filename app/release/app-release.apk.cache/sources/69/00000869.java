package com.anythink.expressad.foundation.h;

import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.j20;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.zg2;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public final class l extends d {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    public static final int d = 4;
    public static final String e = "/download/.at";
    public static final String f = "/atdownload";
    private static final String g = "SameFileTool";

    /* loaded from: classes2.dex */
    public static class a {
        public static final int a = 448;
        public static final int b = 256;
        public static final int c = 128;
        public static final int d = 64;
        public static final int e = 56;
        public static final int f = 32;
        public static final int g = 16;
        public static final int h = 8;
        public static final int i = 7;
        public static final int j = 4;
        public static final int k = 2;
        public static final int l = 1;
    }

    private static double a(long j, int i) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? zg2.s : Double.valueOf(decimalFormat.format(j / 1.073741824E9d)).doubleValue();
                }
                return Double.valueOf(decimalFormat.format(j / 1048576.0d)).doubleValue();
            }
            return Double.valueOf(decimalFormat.format(j / 1024.0d)).doubleValue();
        }
        return Double.valueOf(decimalFormat.format(j)).doubleValue();
    }

    private static double b(String str, int i) {
        long j;
        File file = new File(str);
        try {
            if (file.isDirectory()) {
                j = d(file);
            } else {
                j = c(file);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            n.d("获取文件大小", "获取失败!");
            j = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return i != 4 ? zg2.s : Double.valueOf(decimalFormat.format(j / 1.073741824E9d)).doubleValue();
                }
                return Double.valueOf(decimalFormat.format(j / 1048576.0d)).doubleValue();
            }
            return Double.valueOf(decimalFormat.format(j / 1024.0d)).doubleValue();
        }
        return Double.valueOf(decimalFormat.format(j)).doubleValue();
    }

    private static long c(File file) {
        long j = 0;
        FileInputStream fileInputStream = null;
        try {
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        try {
            try {
                if (file.exists()) {
                    FileInputStream fileInputStream2 = new FileInputStream(file);
                    try {
                        j = fileInputStream2.available();
                        fileInputStream = fileInputStream2;
                    } catch (Exception e3) {
                        e = e3;
                        fileInputStream = fileInputStream2;
                        e.printStackTrace();
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        return j;
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream = fileInputStream2;
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception e4) {
                                e4.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } else {
                    file.createNewFile();
                    n.d("获取文件大小", "文件不存在!");
                }
            } catch (Exception e5) {
                e = e5;
            }
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return j;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static long d(File file) {
        long c2;
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles != null) {
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    c2 = d(listFiles[i]);
                } else {
                    c2 = c(listFiles[i]);
                }
                j += c2;
            }
        }
        return j;
    }

    private static String e(String str) {
        long j;
        File file = new File(str);
        try {
            if (file.isDirectory()) {
                j = d(file);
            } else {
                j = c(file);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            n.d("获取文件大小", "获取失败!");
            j = 0;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j == 0) {
            return "0B";
        }
        if (j < 1024) {
            return decimalFormat.format(j) + AFHydra.EV_BYTECOUNT;
        } else if (j < PlaybackStateCompat.M) {
            return decimalFormat.format(j / 1024.0d) + "KB";
        } else if (j < 1073741824) {
            return decimalFormat.format(j / 1048576.0d) + "AT";
        } else {
            return decimalFormat.format(j / 1.073741824E9d) + "GB";
        }
    }

    private static void f(String str) {
        try {
            ArrayList<File> e2 = e(new File(str));
            Collections.sort(e2, new Comparator<File>() { // from class: com.anythink.expressad.foundation.h.l.4
                private static int a(File file, File file2) {
                    int i = ((file.lastModified() - file2.lastModified()) > 0L ? 1 : ((file.lastModified() - file2.lastModified()) == 0L ? 0 : -1));
                    if (i > 0) {
                        return 1;
                    }
                    return i == 0 ? 0 : -1;
                }

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(File file, File file2) {
                    int i = ((file.lastModified() - file2.lastModified()) > 0L ? 1 : ((file.lastModified() - file2.lastModified()) == 0L ? 0 : -1));
                    if (i > 0) {
                        return 1;
                    }
                    return i == 0 ? 0 : -1;
                }

                @Override // java.util.Comparator
                public final boolean equals(Object obj) {
                    return true;
                }
            });
            int size = (e2.size() - 1) / 2;
            for (int i = 0; i < size; i++) {
                File file = e2.get(i);
                if (file.exists() && file.isFile()) {
                    file.delete();
                }
            }
        } catch (Exception unused) {
            n.d(g, "del memory failed");
        }
    }

    private static void g(String str) {
        File[] b2;
        try {
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                for (File file2 : b(str)) {
                    if (file2.exists() && file2.isFile()) {
                        file2.delete();
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public static String d(String str) {
        return !TextUtils.isEmpty(str) ? o.a(w.a(str.trim())) : "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
        if (r1 == null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(File file) {
        StringBuffer stringBuffer;
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        if (file == null) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            try {
                try {
                    stringBuffer = new StringBuffer();
                } catch (Throwable th) {
                    th = th;
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (IOException unused) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                stringBuffer = null;
            }
        } catch (IOException e3) {
            e = e3;
            stringBuffer = null;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader2 != null) {
            }
            throw th;
        }
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    stringBuffer.append(readLine + "\n");
                }
            } catch (IOException e4) {
                e = e4;
                e.printStackTrace();
            }
            try {
                break;
            } catch (IOException unused2) {
            }
        }
        bufferedReader.close();
        if (stringBuffer != null) {
            return stringBuffer.toString();
        }
        return null;
    }

    private static boolean d(String str, int i) {
        try {
            Class<?> cls = Class.forName("android.os.FileUtils");
            Class<?> cls2 = Integer.TYPE;
            cls.getMethod("setPermissions", String.class, cls2, cls2, cls2).invoke(null, str, Integer.valueOf(i), -1, -1);
            return true;
        } catch (ClassNotFoundException e2) {
            n.a(g, "error when set permissions:", e2);
            return false;
        } catch (IllegalAccessException e3) {
            n.a(g, "error when set permissions:", e3);
            return false;
        } catch (IllegalArgumentException e4) {
            n.a(g, "error when set permissions:", e4);
            return false;
        } catch (NoSuchMethodException e5) {
            n.a(g, "error when set permissions:", e5);
            return false;
        } catch (InvocationTargetException e6) {
            n.a(g, "error when set permissions:", e6);
            return false;
        }
    }

    public static void c(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis() - 1440000;
            File file = new File(str);
            if (file.exists() && file.isDirectory()) {
                long currentTimeMillis2 = System.currentTimeMillis();
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.lastModified() + currentTimeMillis < currentTimeMillis2) {
                            b(file2);
                            try {
                                File file3 = new File(str + j20.w);
                                if (file3.exists() && file3.isFile()) {
                                    b(file3);
                                }
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }

    private static ArrayList<File> e(File file) {
        File[] listFiles;
        ArrayList<File> arrayList = new ArrayList<>();
        for (File file2 : file.listFiles(new FileFilter() { // from class: com.anythink.expressad.foundation.h.l.3
            @Override // java.io.FileFilter
            public final boolean accept(File file3) {
                return !file3.isHidden() || file3.isDirectory();
            }
        })) {
            if (!file2.isDirectory()) {
                arrayList.add(file2);
            } else {
                arrayList.addAll(e(file2));
            }
        }
        return arrayList;
    }

    private static String b(long j) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        if (j == 0) {
            return "0B";
        }
        if (j < 1024) {
            return decimalFormat.format(j) + AFHydra.EV_BYTECOUNT;
        } else if (j < PlaybackStateCompat.M) {
            return decimalFormat.format(j / 1024.0d) + "KB";
        } else if (j < 1073741824) {
            return decimalFormat.format(j / 1048576.0d) + "AT";
        } else {
            return decimalFormat.format(j / 1.073741824E9d) + "GB";
        }
    }

    public static boolean a(String str) {
        if (com.anythink.expressad.foundation.g.d.e.a(str)) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.isFile();
    }

    public static File[] b(String str) {
        try {
            File file = new File(str);
            if (file.exists()) {
                return file.listFiles();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a() {
        new Thread(new Runnable() { // from class: com.anythink.expressad.foundation.h.l.1
            @Override // java.lang.Runnable
            public final void run() {
                File[] b2;
                try {
                    if (com.anythink.expressad.foundation.b.a.b().d() != null) {
                        String b3 = com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_VC);
                        try {
                            File file = new File(b3);
                            if (file.exists() && file.isDirectory()) {
                                for (File file2 : l.b(b3)) {
                                    if (file2.exists() && file2.isFile()) {
                                        file2.delete();
                                    }
                                }
                            }
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                } catch (Exception e3) {
                    if (com.anythink.expressad.a.a) {
                        e3.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public static void a(long j) {
        try {
            Iterator<File> it = e(new File(com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_RES_MANAGER_DIR))).iterator();
            while (it.hasNext()) {
                File next = it.next();
                if (next.lastModified() < j && next.exists() && next.isFile()) {
                    next.delete();
                }
            }
        } catch (Throwable th) {
            n.b(g, th.getMessage(), th);
        }
    }

    public static void b() {
        new Thread(new Runnable() { // from class: com.anythink.expressad.foundation.h.l.2
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.anythink.expressad.d.b.a();
                    com.anythink.expressad.foundation.b.a.b().e();
                    com.anythink.expressad.d.a b2 = com.anythink.expressad.d.b.b();
                    if (b2 == null) {
                        com.anythink.expressad.d.b.a();
                        b2 = com.anythink.expressad.d.b.c();
                    }
                    l.a(com.anythink.expressad.foundation.g.c.d.b(com.anythink.expressad.foundation.g.c.a.ANYTHINK_RES_MANAGER_DIR), b2.b());
                    l.a(System.currentTimeMillis() - (b2.o() * 1000));
                } catch (Exception e2) {
                    if (com.anythink.expressad.a.a) {
                        e2.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public static String b(File file) {
        try {
            if (file.isFile()) {
                file.delete();
                return "";
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles != null && listFiles.length != 0) {
                    for (File file2 : listFiles) {
                        b(file2);
                    }
                    file.delete();
                    return "";
                }
                file.delete();
                return "";
            } else {
                return "";
            }
        } catch (Exception e2) {
            return e2.getMessage();
        }
    }

    private static void c(String str, int i) {
        try {
            if (d(new File(str)) > i * 1048576) {
                f(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable unused) {
            n.d(g, "clean memory failed");
        }
    }

    private static boolean a(String str, String str2, String str3) {
        try {
            if (q.b()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                String str4 = File.separator;
                sb.append(str4);
                sb.append(str3);
                String sb2 = sb.toString();
                File file = new File(sb2);
                if (file.exists() && file.isFile() && q.a(file.length())) {
                    File file2 = new File(str2);
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    int b2 = b(sb2, str2 + str4 + str3);
                    if (file.exists() && b2 == 0) {
                        file.delete();
                        return true;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

    private static boolean c(String str, String str2) {
        File[] listFiles;
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str) && str2 != null && !TextUtils.isEmpty(str2)) {
                    File file = new File(str);
                    if (file.isDirectory() && file.listFiles() != null && file.listFiles().length > 0 && (listFiles = file.listFiles()) != null) {
                        for (File file2 : listFiles) {
                            if (file2.isFile()) {
                                if (str2.equals(file2.getName())) {
                                    return true;
                                }
                            } else {
                                c(file2.getAbsolutePath(), str2);
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return false;
    }

    private static int b(String str, String str2) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream = null;
        try {
            if (q.a) {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    fileOutputStream = new FileOutputStream(str2);
                } catch (Exception unused) {
                    fileOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = null;
                }
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        fileOutputStream.write(bArr, 0, read);
                    }
                    File file = new File(str2);
                    if (file.exists()) {
                        if (file.isFile()) {
                            try {
                                fileInputStream2.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                            return 0;
                        }
                    }
                    try {
                        fileInputStream2.close();
                    } catch (IOException e4) {
                        e4.printStackTrace();
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                    return -1;
                } catch (Exception unused2) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e6) {
                            e6.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e7) {
                            e7.printStackTrace();
                        }
                    }
                    return -1;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e8) {
                            e8.printStackTrace();
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                    }
                    throw th;
                }
            }
            return -1;
        } catch (Exception unused3) {
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static boolean a(byte[] bArr, File file) {
        FileOutputStream fileOutputStream = null;
        try {
            try {
                if (file.getParentFile() != null && !file.exists()) {
                    file.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                try {
                    fileOutputStream2.write(bArr);
                    try {
                        fileOutputStream2.close();
                        return true;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return true;
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                            return false;
                        } catch (IOException e4) {
                            e4.printStackTrace();
                            return false;
                        }
                    }
                    return false;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException e5) {
                            e5.printStackTrace();
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e6) {
            e = e6;
        }
    }

    public static String a(String str, String str2) {
        FileOutputStream fileOutputStream;
        if (str == null || str2 == null) {
            return "unzip srcFile or destDir is null ";
        }
        if (!str2.endsWith("/")) {
            str2 = wo1.t(str2, "/");
        }
        File file = new File(str);
        if (!file.exists()) {
            return "unzip file not exists";
        }
        InputStream inputStream = null;
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            fileOutputStream = null;
            while (entries.hasMoreElements()) {
                try {
                    ZipEntry nextElement = entries.nextElement();
                    if (nextElement == null) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                        }
                        return "unzip zipEntry is null";
                    } else if (!nextElement.getName().contains("../")) {
                        File file2 = new File(str2 + nextElement.getName());
                        if (nextElement.isDirectory()) {
                            file2.mkdirs();
                        } else {
                            if (!file2.getParentFile().exists()) {
                                file2.getParentFile().mkdirs();
                            }
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                            try {
                                inputStream = zipFile.getInputStream(nextElement);
                                byte[] bArr = new byte[1024];
                                while (true) {
                                    int read = inputStream.read(bArr, 0, 1024);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream2.write(bArr, 0, read);
                                    fileOutputStream2.flush();
                                }
                                fileOutputStream = fileOutputStream2;
                            } catch (Throwable th) {
                                th = th;
                                fileOutputStream = fileOutputStream2;
                                try {
                                    if (com.anythink.expressad.a.a) {
                                        th.printStackTrace();
                                    }
                                    return th.getMessage();
                                } finally {
                                    if (inputStream != null) {
                                        try {
                                            inputStream.close();
                                        } catch (IOException e4) {
                                            e4.printStackTrace();
                                        }
                                    }
                                    if (fileOutputStream != null) {
                                        try {
                                            fileOutputStream.close();
                                        } catch (IOException e5) {
                                            e5.printStackTrace();
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        throw new Exception("zipEntry's name is unsafe!");
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
            zipFile.close();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                    return "";
                } catch (IOException e7) {
                    e7.printStackTrace();
                    return "";
                }
            }
            return "";
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static /* synthetic */ void a(String str, int i) {
        try {
            if (d(new File(str)) > i * 1048576) {
                f(str);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (Throwable unused) {
            n.d(g, "clean memory failed");
        }
    }
}