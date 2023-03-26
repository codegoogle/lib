package com.p7700g.p99005;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AESHelper.java */
/* loaded from: classes3.dex */
public class ah3 {
    public static int a = 256;
    public static int b = 128;
    public static String c = "AES/CBC/PKCS7Padding";
    public static String d = "AES";
    public static String e = "UTF-8";
    public static String f = "MD5";
    public static String g = "Salted__";

    private static byte[] a(byte[] password, int keySize, int ivSize, byte[] salt, int iterations, String hashAlgorithm, byte[] resultKey, byte[] resultIv) throws NoSuchAlgorithmException {
        int i = keySize / 32;
        int i2 = ivSize / 32;
        int i3 = i + i2;
        byte[] bArr = new byte[i3 * 4];
        MessageDigest messageDigest = MessageDigest.getInstance(hashAlgorithm);
        byte[] bArr2 = null;
        int i4 = 0;
        while (i4 < i3) {
            if (bArr2 != null) {
                messageDigest.update(bArr2);
            }
            messageDigest.update(password);
            bArr2 = messageDigest.digest(salt);
            messageDigest.reset();
            for (int i5 = 1; i5 < iterations; i5++) {
                bArr2 = messageDigest.digest(bArr2);
                messageDigest.reset();
            }
            System.arraycopy(bArr2, 0, bArr, i4 * 4, Math.min(bArr2.length, (i3 - i4) * 4));
            i4 += bArr2.length / 4;
        }
        int i6 = i * 4;
        System.arraycopy(bArr, 0, resultKey, 0, i6);
        System.arraycopy(bArr, i6, resultIv, 0, i2 * 4);
        return bArr;
    }

    private static byte[] b(byte[] password, int keySize, int ivSize, byte[] salt, byte[] resultKey, byte[] resultIv) throws NoSuchAlgorithmException {
        return a(password, keySize, ivSize, salt, 1, f, resultKey, resultIv);
    }

    public static String c(String password, String cipherText) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        byte[] c2 = yw3.c(cipherText.getBytes(e));
        byte[] copyOfRange = Arrays.copyOfRange(c2, 8, 16);
        byte[] copyOfRange2 = Arrays.copyOfRange(c2, 16, c2.length);
        byte[] bArr = new byte[a / 8];
        byte[] bArr2 = new byte[b / 8];
        b(password.getBytes(e), a, b, copyOfRange, bArr, bArr2);
        Cipher cipher = Cipher.getInstance(c);
        cipher.init(2, new SecretKeySpec(bArr, d), new IvParameterSpec(bArr2));
        return new String(cipher.doFinal(copyOfRange2));
    }

    public static String d(String password, String plainText) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, InvalidKeyException, BadPaddingException, IllegalBlockSizeException {
        byte[] e2 = e(8);
        byte[] bArr = new byte[a / 8];
        byte[] bArr2 = new byte[b / 8];
        b(password.getBytes(e), a, b, e2, bArr, bArr2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, d);
        Cipher cipher = Cipher.getInstance(c);
        cipher.init(1, secretKeySpec, new IvParameterSpec(bArr2));
        byte[] doFinal = cipher.doFinal(plainText.getBytes(e));
        byte[] bytes = g.getBytes(e);
        byte[] bArr3 = new byte[bytes.length + e2.length + doFinal.length];
        System.arraycopy(bytes, 0, bArr3, 0, bytes.length);
        System.arraycopy(e2, 0, bArr3, bytes.length, e2.length);
        System.arraycopy(doFinal, 0, bArr3, bytes.length + e2.length, doFinal.length);
        return new String(yw3.e(bArr3));
    }

    private static byte[] e(int length) {
        byte[] bArr = new byte[length];
        new SecureRandom().nextBytes(bArr);
        return bArr;
    }
}