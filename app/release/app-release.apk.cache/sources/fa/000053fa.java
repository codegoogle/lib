package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: IOUtils.java */
/* loaded from: classes2.dex */
public class o81 {
    @x1
    public static byte[] a(@x1 InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    @x1
    public static byte[] b(@x1 Context context, @x1 String str) throws IOException {
        return a(context.openFileInput(str));
    }

    @x1
    public static byte[] c(@x1 Resources resources, @d2 int i) throws IOException {
        InputStream openRawResource = resources.openRawResource(i);
        try {
            return a(openRawResource);
        } finally {
            openRawResource.close();
        }
    }

    public static void d(@x1 Context context, @x1 String str, @x1 byte[] bArr) {
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 0);
            openFileOutput.write(bArr);
            openFileOutput.close();
        } catch (Exception unused) {
        }
    }
}