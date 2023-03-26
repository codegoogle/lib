package com.anythink.expressad.foundation.h;

import java.io.File;
import java.io.FileInputStream;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes2.dex */
public class k {
    public static char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static MessageDigest b = null;
    private static String c = "SameFileMD5";

    static {
        b = null;
        try {
            b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            System.err.println(k.class.getName() + "初始化失败，MessageDigest不支持MD5Util.");
            e.printStackTrace();
        }
    }

    private static String a(String str) {
        return a(new File(str));
    }

    public static String a(File file) {
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    b.update(fileInputStream2.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, file.length()));
                    byte[] digest = b.digest();
                    String a2 = a(digest, digest.length);
                    fileInputStream2.close();
                    return a2;
                } catch (Exception e) {
                    e = e;
                    fileInputStream = fileInputStream2;
                    n.b(c, "FILE EXCEPTION", e);
                    if (fileInputStream != null) {
                        fileInputStream.close();
                        return "";
                    }
                    return "";
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static String a(byte[] bArr) {
        return a(bArr, bArr.length);
    }

    private static String a(byte[] bArr, int i) {
        StringBuffer stringBuffer = new StringBuffer(i * 2);
        int i2 = i + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            a(bArr[i3], stringBuffer);
        }
        return stringBuffer.toString();
    }

    private static void a(byte b2, StringBuffer stringBuffer) {
        char[] cArr = a;
        char c2 = cArr[(b2 & 240) >> 4];
        char c3 = cArr[b2 & 15];
        stringBuffer.append(c2);
        stringBuffer.append(c3);
    }
}