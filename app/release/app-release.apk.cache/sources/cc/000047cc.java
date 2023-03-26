package com.p7700g.p99005;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Collection;

/* compiled from: FileCombiner.java */
/* loaded from: classes.dex */
public class i31 {
    private static void a(@x1 File file, @x1 File file2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2, true);
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[kb0.c];
            fileOutputStream.write("\n".getBytes(Charset.forName("UTF-8")));
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return;
                }
            }
        } catch (Throwable unused) {
        }
    }

    @x1
    public static File b(@x1 String str, @x1 Collection<File> collection) throws IOException {
        File createTempFile = File.createTempFile("assets", str);
        for (File file : collection) {
            if (file != null) {
                a(file, createTempFile);
            }
        }
        return createTempFile;
    }
}