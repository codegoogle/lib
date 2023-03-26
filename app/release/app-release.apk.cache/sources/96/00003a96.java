package com.p7700g.p99005;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: UnifiedTrustManager.java */
/* loaded from: classes2.dex */
public class ba1 implements X509TrustManager {
    @x1
    private final X509TrustManager a = a(null);
    @x1
    private final X509TrustManager b;

    public ba1(@x1 KeyStore keyStore) throws Exception {
        this.b = a(keyStore);
    }

    @x1
    private X509TrustManager a(@z1 KeyStore keyStore) throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        return (X509TrustManager) trustManagerFactory.getTrustManagers()[0];
    }

    @x1
    public X509TrustManager b() {
        return this.a;
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkClientTrusted(@x1 X509Certificate[] x509CertificateArr, @x1 String str) throws CertificateException {
        try {
            this.a.checkClientTrusted(x509CertificateArr, str);
        } catch (CertificateException unused) {
            this.b.checkClientTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public void checkServerTrusted(@x1 X509Certificate[] x509CertificateArr, @x1 String str) throws CertificateException {
        try {
            this.a.checkServerTrusted(x509CertificateArr, str);
        } catch (CertificateException unused) {
            this.b.checkServerTrusted(x509CertificateArr, str);
        }
    }

    @Override // javax.net.ssl.X509TrustManager
    public X509Certificate[] getAcceptedIssuers() {
        X509Certificate[] acceptedIssuers = this.a.getAcceptedIssuers();
        X509Certificate[] acceptedIssuers2 = this.b.getAcceptedIssuers();
        X509Certificate[] x509CertificateArr = (X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length + acceptedIssuers2.length);
        System.arraycopy(acceptedIssuers2, 0, x509CertificateArr, acceptedIssuers.length, acceptedIssuers2.length);
        return x509CertificateArr;
    }
}