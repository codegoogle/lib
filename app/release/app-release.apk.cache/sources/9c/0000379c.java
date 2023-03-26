package com.microsoft.appcenter.utils.crypto;

import android.annotation.SuppressLint;
import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import com.microsoft.appcenter.utils.crypto.CryptoUtils;
import com.p7700g.p99005.wo1;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.cert.CertificateExpiredException;
import java.security.cert.X509Certificate;
import java.util.Calendar;
import java.util.Date;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes3.dex */
public class CryptoRsaHandler implements CryptoHandler {
    private CryptoUtils.ICipher getCipher(CryptoUtils.ICryptoFactory iCryptoFactory, int i) throws Exception {
        return iCryptoFactory.getCipher(CryptoConstants.CIPHER_RSA, i >= 23 ? CryptoConstants.PROVIDER_ANDROID_M : CryptoConstants.PROVIDER_ANDROID_OLD);
    }

    @Override // com.microsoft.appcenter.utils.crypto.CryptoHandler
    public byte[] decrypt(CryptoUtils.ICryptoFactory iCryptoFactory, int i, KeyStore.Entry entry, byte[] bArr) throws Exception {
        CryptoUtils.ICipher cipher = getCipher(iCryptoFactory, i);
        cipher.init(2, ((KeyStore.PrivateKeyEntry) entry).getPrivateKey());
        return cipher.doFinal(bArr);
    }

    @Override // com.microsoft.appcenter.utils.crypto.CryptoHandler
    public byte[] encrypt(CryptoUtils.ICryptoFactory iCryptoFactory, int i, KeyStore.Entry entry, byte[] bArr) throws Exception {
        CryptoUtils.ICipher cipher = getCipher(iCryptoFactory, i);
        X509Certificate x509Certificate = (X509Certificate) ((KeyStore.PrivateKeyEntry) entry).getCertificate();
        try {
            x509Certificate.checkValidity();
            cipher.init(1, x509Certificate.getPublicKey());
            return cipher.doFinal(bArr);
        } catch (CertificateExpiredException e) {
            throw new InvalidKeyException(e);
        }
    }

    @Override // com.microsoft.appcenter.utils.crypto.CryptoHandler
    @SuppressLint({"InlinedApi", "TrulyRandom"})
    public void generateKey(CryptoUtils.ICryptoFactory iCryptoFactory, String str, Context context) throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.add(1, 1);
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", CryptoConstants.ANDROID_KEY_STORE);
        keyPairGenerator.initialize(new KeyPairGeneratorSpec.Builder(context).setAlias(str).setSubject(new X500Principal(wo1.t("CN=", str))).setStartDate(new Date()).setEndDate(calendar.getTime()).setSerialNumber(BigInteger.TEN).setKeySize(2048).build());
        keyPairGenerator.generateKeyPair();
    }

    @Override // com.microsoft.appcenter.utils.crypto.CryptoHandler
    public String getAlgorithm() {
        return "RSA/ECB/PKCS1Padding/2048";
    }
}