package com.microsoft.appcenter.utils.crypto;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import com.microsoft.appcenter.utils.crypto.CryptoUtils;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.x1;
import java.nio.ByteBuffer;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Calendar;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes3.dex */
public class CryptoAesAndEtmHandler implements CryptoHandler {
    private static final int AUTHENTICATION_KEY_LENGTH = 16;
    private static final int ENCRYPTION_KEY_LENGTH = 32;

    @e2(api = 23)
    private byte[] getMacBytes(byte[] bArr, byte[] bArr2, byte[] bArr3) throws InvalidKeyException, NoSuchAlgorithmException {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKeySpec);
        mac.update(bArr2);
        mac.update(bArr3);
        return mac.doFinal();
    }

    @Override // com.microsoft.appcenter.utils.crypto.CryptoHandler
    @e2(api = 23)
    public byte[] decrypt(CryptoUtils.ICryptoFactory iCryptoFactory, int i, KeyStore.Entry entry, byte[] bArr) throws Exception {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int i2 = wrap.get();
        if (i2 == 16) {
            byte[] bArr2 = new byte[i2];
            wrap.get(bArr2);
            int i3 = wrap.get();
            if (i3 == 32) {
                byte[] bArr3 = new byte[i3];
                wrap.get(bArr3);
                byte[] bArr4 = new byte[wrap.remaining()];
                wrap.get(bArr4);
                SecretKey secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
                byte[] subkey = getSubkey(secretKey, 32);
                if (MessageDigest.isEqual(getMacBytes(getSubkey(secretKey, 16), bArr2, bArr4), bArr3)) {
                    CryptoUtils.ICipher cipher = iCryptoFactory.getCipher(CryptoConstants.CIPHER_AES, null);
                    cipher.init(2, new SecretKeySpec(subkey, "AES"), new IvParameterSpec(bArr2));
                    return cipher.doFinal(bArr4);
                }
                throw new SecurityException("Could not authenticate MAC value.");
            }
            throw new IllegalArgumentException("Invalid MAC length.");
        }
        throw new IllegalArgumentException("Invalid IV length.");
    }

    @Override // com.microsoft.appcenter.utils.crypto.CryptoHandler
    @e2(api = 23)
    public byte[] encrypt(CryptoUtils.ICryptoFactory iCryptoFactory, int i, KeyStore.Entry entry, byte[] bArr) throws Exception {
        SecretKey secretKey = ((KeyStore.SecretKeyEntry) entry).getSecretKey();
        byte[] subkey = getSubkey(secretKey, 32);
        byte[] subkey2 = getSubkey(secretKey, 16);
        CryptoUtils.ICipher cipher = iCryptoFactory.getCipher(CryptoConstants.CIPHER_AES, null);
        cipher.init(1, new SecretKeySpec(subkey, "AES"));
        byte[] iv = cipher.getIV();
        byte[] doFinal = cipher.doFinal(bArr);
        byte[] macBytes = getMacBytes(subkey2, iv, doFinal);
        ByteBuffer allocate = ByteBuffer.allocate(iv.length + 1 + 1 + macBytes.length + doFinal.length);
        allocate.put((byte) iv.length);
        allocate.put(iv);
        allocate.put((byte) macBytes.length);
        allocate.put(macBytes);
        allocate.put(doFinal);
        return allocate.array();
    }

    @Override // com.microsoft.appcenter.utils.crypto.CryptoHandler
    @e2(api = 23)
    public void generateKey(CryptoUtils.ICryptoFactory iCryptoFactory, String str, Context context) throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, 1);
        CryptoUtils.IKeyGenerator keyGenerator = iCryptoFactory.getKeyGenerator("HmacSHA256", CryptoConstants.ANDROID_KEY_STORE);
        keyGenerator.init(new KeyGenParameterSpec.Builder(str, 4).setKeyValidityForOriginationEnd(calendar.getTime()).build());
        keyGenerator.generateKey();
    }

    @Override // com.microsoft.appcenter.utils.crypto.CryptoHandler
    @e2(api = 23)
    public String getAlgorithm() {
        return "AES/CBC/PKCS7Padding/256/HmacSHA256";
    }

    @e2(api = 23)
    @r2
    public byte[] getSubkey(@x1 SecretKey secretKey, int i) throws NoSuchAlgorithmException, InvalidKeyException {
        if (i >= 1) {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(secretKey);
            int ceil = (int) Math.ceil(i / mac.getMacLength());
            if (ceil <= 255) {
                byte[] bArr = new byte[0];
                ByteBuffer allocate = ByteBuffer.allocate(i);
                int i2 = 0;
                while (i2 < ceil) {
                    mac.update(bArr);
                    i2++;
                    mac.update((byte) i2);
                    bArr = mac.doFinal();
                    int min = Math.min(i, bArr.length);
                    allocate.put(bArr, 0, min);
                    i -= min;
                }
                return allocate.array();
            }
            throw new IllegalArgumentException("Output data length must be maximum of 255 * hash-length.");
        }
        throw new IllegalArgumentException("Output data length must be greater than zero.");
    }
}