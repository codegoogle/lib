package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.content.Context;
import com.p7700g.p99005.fr5;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: OkHttpFactory.java */
/* loaded from: classes2.dex */
public class od1 {

    /* compiled from: OkHttpFactory.java */
    /* loaded from: classes2.dex */
    public class a implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        public void checkClientTrusted(@x1 X509Certificate[] x509CertificateArr, @x1 String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        public void checkServerTrusted(@x1 X509Certificate[] x509CertificateArr, @x1 String str) {
        }

        @Override // javax.net.ssl.X509TrustManager
        @x1
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    public static /* synthetic */ boolean a(String str, SSLSession sSLSession) {
        return true;
    }

    @x1
    public static fr5.a b(@x1 Context context, @z1 td1 td1Var) {
        return c(context, td1Var, true, false);
    }

    @x1
    public static fr5.a c(@x1 Context context, @z1 td1 td1Var, boolean z, boolean z2) {
        rd1 e;
        fr5.a aVar = new fr5.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        fr5.a t = aVar.j0(3L, timeUnit).k(3L, timeUnit).h(10L, timeUnit).u(z).t(z);
        if (td1Var != null && (e = rd1.e(context, td1Var)) != null) {
            t.q(e).O0(new sd1(td1Var));
        }
        if (z2) {
            d(t);
        }
        return t;
    }

    @SuppressLint({"TrustAllX509TrustManager", "TrulyRandom"})
    public static void d(@x1 fr5.a aVar) {
        try {
            TrustManager[] trustManagerArr = {new a()};
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, trustManagerArr, new SecureRandom());
            aVar.Q0(sSLContext.getSocketFactory(), (X509TrustManager) trustManagerArr[0]);
            aVar.Z(wc1.a);
        } catch (Throwable unused) {
        }
    }
}