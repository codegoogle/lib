package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: Ntv.java */
/* loaded from: classes.dex */
public class c41 {
    @x1
    private static final String a = "abcdefghijklmnopqrstuvwxyz";
    @z1
    private static Pair<String, String> e;
    @x1
    private static final Random b = new Random();
    @x1
    private static final kj1 c = kj1.b("Ntv");
    private static final Charset d = Charset.forName("UTF-8");
    @x1
    private static final Object f = new Object();

    @x1
    private static Pair<String, String> a(@x1 File file) {
        byte[] bArr = new byte[32];
        byte[] bArr2 = new byte[16];
        if (!file.exists()) {
            d(file, 32, 16, bArr, bArr2);
        } else {
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                c.c("keyLen: %d ivLen: %d", Integer.valueOf(fileInputStream.read(bArr)), Integer.valueOf(fileInputStream.read(bArr2)));
                fileInputStream.close();
            } catch (Throwable th) {
                c.f(th);
            }
        }
        return Pair.create(new String(bArr, Charset.forName("UTF-8")), new String(bArr2, d));
    }

    @z1
    public static String b(@x1 byte[] bArr) {
        try {
            if (e != null) {
                Charset charset = d;
                IvParameterSpec ivParameterSpec = new IvParameterSpec(((String) e.second).getBytes(charset));
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                cipher.init(2, new SecretKeySpec(((String) e.first).getBytes(charset), "AES"), ivParameterSpec);
                return new String(cipher.doFinal(bArr), Charset.forName("UTF-8"));
            }
            return null;
        } catch (Throwable th) {
            c.f(th);
            return null;
        }
    }

    @z1
    @SuppressLint({"TrulyRandom"})
    public static byte[] c(@x1 String str) {
        try {
            if (e != null) {
                Charset charset = d;
                IvParameterSpec ivParameterSpec = new IvParameterSpec(((String) e.second).getBytes(charset));
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                cipher.init(1, new SecretKeySpec(((String) e.first).getBytes(charset), "AES"), ivParameterSpec);
                return cipher.doFinal(str.getBytes(charset));
            }
            return null;
        } catch (Throwable th) {
            c.f(th);
            return null;
        }
    }

    private static void d(@x1 File file, int i, int i2, byte[] bArr, byte[] bArr2) {
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) a.charAt(Math.abs(b.nextInt(26)));
        }
        for (int i4 = 0; i4 < i2; i4++) {
            bArr2[i4] = (byte) a.charAt(Math.abs(b.nextInt(26)));
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(bArr);
            fileOutputStream.write(bArr2);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Throwable th) {
            c.f(th);
        }
    }

    public static void e(@x1 File file) {
        synchronized (f) {
            if (e == null) {
                e = a(new File(file, "rndseq"));
            }
        }
    }
}