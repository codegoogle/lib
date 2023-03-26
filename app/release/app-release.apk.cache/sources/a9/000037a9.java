package com.microsoft.appcenter.utils.storage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import com.microsoft.appcenter.utils.AppCenterLog;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;

/* loaded from: classes3.dex */
public class FileManager {
    @SuppressLint({"StaticFieldLeak"})
    private static Context sContext;

    public static void cleanDirectory(@x1 File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                deleteDirectory(file2);
            }
        }
    }

    public static boolean delete(@x1 String str) {
        return delete(new File(str));
    }

    public static boolean deleteDirectory(@x1 File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                deleteDirectory(file2);
            }
        }
        return file.delete();
    }

    @x1
    public static String[] getFilenames(@x1 String str, @z1 FilenameFilter filenameFilter) {
        File file = new File(str);
        return file.exists() ? file.list(filenameFilter) : new String[0];
    }

    public static synchronized void initialize(Context context) {
        synchronized (FileManager.class) {
            if (sContext == null) {
                sContext = context;
            }
        }
    }

    @z1
    public static File lastModifiedFile(@x1 String str, @z1 FilenameFilter filenameFilter) {
        return lastModifiedFile(new File(str), filenameFilter);
    }

    public static void mkdir(@x1 String str) {
        new File(str).mkdirs();
    }

    public static String read(@x1 String str) {
        return read(new File(str));
    }

    public static byte[] readBytes(@x1 File file) {
        byte[] bArr = new byte[(int) file.length()];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            new DataInputStream(fileInputStream).readFully(bArr);
            fileInputStream.close();
            return bArr;
        } catch (IOException e) {
            StringBuilder G = wo1.G("Could not read file ");
            G.append(file.getAbsolutePath());
            AppCenterLog.error("AppCenter", G.toString(), e);
            return null;
        }
    }

    public static void write(@x1 String str, @x1 String str2) throws IOException {
        write(new File(str), str2);
    }

    public static boolean delete(@x1 File file) {
        return file.delete();
    }

    @z1
    public static File lastModifiedFile(@x1 File file, @z1 FilenameFilter filenameFilter) {
        File file2 = null;
        if (file.exists()) {
            File[] listFiles = file.listFiles(filenameFilter);
            long j = 0;
            if (listFiles != null) {
                for (File file3 : listFiles) {
                    if (file3.lastModified() > j) {
                        j = file3.lastModified();
                        file2 = file3;
                    }
                }
            }
        }
        return file2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    public static String read(@x1 File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader((File) file));
            String property = System.getProperty("line.separator");
            StringBuilder sb = new StringBuilder();
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                sb.append(readLine);
                while (true) {
                    String readLine2 = bufferedReader.readLine();
                    if (readLine2 == null) {
                        break;
                    }
                    sb.append(property);
                    sb.append(readLine2);
                }
            }
            bufferedReader.close();
            file = sb.toString();
            return file;
        } catch (IOException e) {
            StringBuilder G = wo1.G("Could not read file ");
            G.append(file.getAbsolutePath());
            AppCenterLog.error("AppCenter", G.toString(), e);
            return null;
        }
    }

    public static void write(@x1 File file, @x1 String str) throws IOException {
        if (TextUtils.isEmpty(str) || TextUtils.getTrimmedLength(str) <= 0) {
            return;
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
        try {
            bufferedWriter.write(str);
        } finally {
            bufferedWriter.close();
        }
    }
}