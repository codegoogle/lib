package com.p7700g.p99005;

import android.os.Build;
import com.p7700g.p99005.fr5;
import java.security.KeyStore;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.Collection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* compiled from: EliteTrust.java */
/* loaded from: classes2.dex */
public class aa1 {
    public static final String a = "EliteTrust";
    private static final String b = "X.509";
    private static final String c = "-----BEGIN CERTIFICATE-----\nMIIFKTCCAxGgAwIBAgIUS/v8GY5XkknZ4mV8cS+AhYG++a0wDQYJKoZIhvcNAQEL\nBQAwKzEpMCcGA1UEAxMgSHlkcmEgQXV0aGVudGljYXRpb24gUlNBIFJvb3QgQ0Ew\nHhcNMTcxMDEzMjIzNDA4WhcNMzcxMDA4MjIzNDM4WjArMSkwJwYDVQQDEyBIeWRy\nYSBBdXRoZW50aWNhdGlvbiBSU0EgUm9vdCBDQTCCAiIwDQYJKoZIhvcNAQEBBQAD\nggIPADCCAgoCggIBAKrK9/H0aDZYmRArqFVrw0k4+FXTukf8jYaTi6p5LMoeWjS8\nRXBPlpT3ZHJ2Dbws9ffvRC0n5vKPKXMp8gLx3POnW45rssBRSP5T+Tc/qk5dGgF/\nGs8jhgKTgRAxk1hLpx10811bTO3LbJmzNH+halLfr8J7CMnAg/3Esb9zVMqtPJ5a\nngBqwJqOn1AxweMbYgNxW3zCoYq5Qu3T1AOFviQjrG2MjXYqP7c4x+1BLszPtevz\nAt8ViKGMta2+sSKzqmBRpGWrhniF2MBCznRh9SMGUAyVhgw/Ua/DgYU8mTV6itqu\nv1jHjOdk6eB6f8cPqN7dYLhtiHy3iINRiwEaDRxHep10sXkK04ZgwLo29WjrQ7Bw\nPNHfCUzK/V27xCE6Zz/Fj+o+/z4i75qSWwjFk6pBgXUZuHPqntOVbVpSyyFf/kGd\n2KqtF6zPv4dOmoC1yzqns53BJAAiAp+185yoKRcKZIrfH7bmelcjMcmnLJfeKC9B\nhcKe6MY1LgboLqB0axWwVSkPgmZlfDnL8HfoRqSZAgxDgHZilgQRzcZbiodKEnEq\nTy9tBu29e+qazDS7mMFN4s79mj+4HrJeHekpRZWtPGa86Dzkh51jwukS1pxjtHzU\ng38MuiyxjiLLG3eI+4RjOF4alq/lEsprXHThVDQZj5X0rdoFqaJB8z5OMiMhAgMB\nAAGjRTBDMA4GA1UdDwEB/wQEAwIBBjASBgNVHRMBAf8ECDAGAQH/AgECMB0GA1Ud\nDgQWBBSjpO2ILG96eCUgXYp3eyOPqDsswjANBgkqhkiG9w0BAQsFAAOCAgEAS5Zk\n3Imfme3Zt2DKApcd8RgYoCBH9MdqOfrQlPRXegFzIG+ew8AuERdyKO76ORfTGqvz\nqOZ7tMjyB6MQp+5nfi9KjfstjUSd5r9yXGngXhrllz28alWVhoitO0FumUDgI7/j\nOLFrEPEOakV4s7ZW3C7yF8SjKunSDmUgi6c+CYgkh5Funccvje/iMT/9OIvFHTkg\nWZYXO0cBx1usxsvTHyavaquM6F3kSCfyiuIoZc+x188Cxg2a10EEnEemsw8FhBy+\nJZzN+boBTNBQkX0IkwxQfnyixAhRrz5AWe438VpqWV87GnhwsUpgkqV5zK09vlcY\n2YY9u2JVL/Q84bk3OfKPtLAT67Y3V1+Yc7ghZcmJW7xGYCyR5yDrwwk6uy+YtOkj\no4yOKfJZhz9WNIj3tUWWiIUctMuncBL6+r1fe9UxqZhNJBRBe5/25jbRQF55Oq6a\noJ2Z7QN5C8htLfBnepHKbMyYhp5kiYTHAy52MtwHXaqA93oQSvclroZQurwEp0BV\nhtsvunrFl14flhaix/IT/S81/MLk8trVNKNnwV7UIudRFGfxF9KT+z7V8WKOapTy\neY5s6jqf91eTfRFrKajdXCO/ROe23PgXEcoWcPLhwmwTBpG7ut5s55vj9UHk7Kky\nMg/tCGRRaT316jIfH8Xt1jb7Rmz6klFs5/dAs0k=\n-----END CERTIFICATE-----\n";
    private static final String d = "-----BEGIN CERTIFICATE-----\nMIIFdDCCA1ygAwIBAgIJAKTqeHBrI/CTMA0GCSqGSIb3DQEBCwUAMFYxGDAWBgNV\nBAoMD0FuY2hvckZyZWUgSW5jLjELMAkGA1UEBhMCVVMxLTArBgNVBAMMJEh5ZHJh\nIEF1dGhlbnRpY2F0aW9uIFJTQSBSb290IENBIC0gMjAeFw0xNzEyMjIxMDQzNDha\nFw00NzEyMjIxMDQzNDhaMFYxGDAWBgNVBAoMD0FuY2hvckZyZWUgSW5jLjELMAkG\nA1UEBhMCVVMxLTArBgNVBAMMJEh5ZHJhIEF1dGhlbnRpY2F0aW9uIFJTQSBSb290\nIENBIC0gMjCCAiIwDQYJKoZIhvcNAQEBBQADggIPADCCAgoCggIBAMtAY9+PXX88\nmf9rgrteD3kdJd0NuVuU22Q8IZPAf7DrvAobIvYAKA4HGWwjroqkCRV3nYPE4NpD\nB9YvKmcS2ia4b5ZHA43OTuRJWNovAuN2mHWlxvBIFt80ira9+Xju7eqaXd+QEKXi\nbeMBPHZnpeZEmF7LSoU3hvG/Iu9hSQiEPMz7Neb9iHTOxI2xtBYCnx8O2yoOBp7w\nlRYa3sFbqgQFLy6Ul2aXgYml4lL6q+Ijf5U/KpNR2u7Lclpkz2uZHTm2/u2yr0d/\n8HfkVUVO2177rQNtNyXWD7iPJebWyea645jKWwOVmgXu3ONI0I/LU1DOg/+4wiIT\nvCzpl9Ax0U9OtLWFmNNW4eUDcOthQM5JekhYNWN2KKufg+0dgbwkFX6NgM60nLld\n0wQt6kvW/EXnSa48MSlwynV7Ulsdpjz2dwf/X+SVH7WvSoWtj+V+SuPjaSAZeACf\n3m6yRT0jN5MD5bTjly+52uYDbLOg3hC5oWa/UC+WkdKiUtJ0nkNf0jWhoq1AfxzN\ni+NHxktxUNcaEllIJb1SYkXf4hIqoBiTufhowFJjLzhqlpwAwIbBensqGB5JkfKe\nrcVK80US4oMPC4Ms4HpajqlTtB98QaPvrEtiDmlCqWeziHn68f2adKEA/Q/CRQqm\nXi0qtYfzsRjkuM781l9R17yuxQcBrA7zAgMBAAGjRTBDMA4GA1UdDwEB/wQEAwIB\nBjASBgNVHRMBAf8ECDAGAQH/AgECMB0GA1UdDgQWBBTO7tHA3J0solcq+inpiNnd\nO589qjANBgkqhkiG9w0BAQsFAAOCAgEAIfLrcFe4tV4+WKybDyv9z35LZJa6emim\nZ8IpSz8BgKFKT7Qe9sK13SDUXRL8DlBWyn5+FrEpAiY425lOvyE0ao8PNKhbVnzU\nUnFF7q4lrTq8aPhS5lk0oxeW7p5O2BC9YJfN3H9P+qJNW8T0vC5h0iMGelkd8sM3\nWWwMNvw9UKrNEDaV+U4kFbA0N1IZn+UpYX41prTJnB6VKfU81d8h6GIimx/k4RaB\nBZ3CeSl5kVkcDbU2ciLyvNfrV/HcADIt8zQqj3FMNaekHDXSg21ayBYUYkhKdoTf\nIrBuzB63+848bZR3NHe8JuN4F7HpHEmWJlef6EHsFIiboA8oQmq0EFcfVOmn+u8N\no9cQaJGa7Xs09AhhVUMuy37Jdea+v59bbweBhUmknAbnB5Qv2CQ5hzD9vApmB30t\n+oRjrFeb19joSFDEsuIkd8ERNfxZP3NOlMMwkMqZIplsDPd4MrZB96dN17JEhgAl\nIAJZ8+7P83fdRc30w4FwhDTD0s/2hF/kc/SXPYDNqLI1zJOXa/ZW5l2GcCGLojDs\nKGWa5l2xp6fGYy3QHizMfihSNvPfWPRcYVfstJRRs9Ksb0S5+rSgSXWLzsNjDk+J\n6EI0UL8y8JuIYij2JGFRSqOf30JlLXZNGk6gBG4/QcJaVHL4oUjzJNeH+lwvNg3I\n6NvSYYAXprg=\n-----END CERTIFICATE-----\n";

    /* JADX WARN: Multi-variable type inference failed */
    @x1
    public static void a(@x1 fr5.a aVar) {
        X509TrustManager b2;
        ba1 ba1Var;
        try {
            KeyStore c2 = c();
            if (Build.VERSION.SDK_INT >= 24) {
                ca1 ca1Var = new ca1(c2);
                b2 = ca1Var.b();
                ba1Var = ca1Var;
            } else {
                ba1 ba1Var2 = new ba1(c2);
                b2 = ba1Var2.b();
                ba1Var = ba1Var2;
            }
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{ba1Var}, null);
            aVar.Q0(sSLContext.getSocketFactory(), b2);
        } catch (Throwable unused) {
        }
    }

    @x1
    private static Collection<? extends Certificate> b() throws CertificateException {
        return CertificateFactory.getInstance(b).generateCertificates(new sv5().K0(c).K0(d).W1());
    }

    @x1
    private static KeyStore c() throws Exception {
        KeyStore keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
        keyStore.load(null, null);
        int i = 0;
        for (Certificate certificate : b()) {
            StringBuilder G = wo1.G(a);
            int i2 = i + 1;
            G.append(i);
            keyStore.setCertificateEntry(G.toString(), certificate);
            i = i2;
        }
        return keyStore;
    }
}