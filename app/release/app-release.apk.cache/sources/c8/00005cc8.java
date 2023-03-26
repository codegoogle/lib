package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.microsoft.appcenter.utils.crypto.CryptoConstants;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import org.jetbrains.annotations.NotNull;

/* compiled from: OkHostnameVerifier.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ#\u0010\f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\bJ\u001b\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u000e8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u001b¨\u0006 "}, d2 = {"Lcom/p7700g/p99005/su5;", "Ljavax/net/ssl/HostnameVerifier;", "", "ipAddress", "Ljava/security/cert/X509Certificate;", "certificate", "", "f", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z", "hostname", "e", "pattern", "d", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "type", "", "b", "(Ljava/security/cert/X509Certificate;I)Ljava/util/List;", "host", "Ljavax/net/ssl/SSLSession;", yo3.e, "verify", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "c", "a", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", AFHydra.STATUS_IDLE, "ALT_DNS_NAME", "ALT_IPA_NAME", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class su5 implements HostnameVerifier {
    private static final int a = 2;
    private static final int b = 7;
    public static final su5 c = new su5();

    private su5() {
    }

    private final List<String> b(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && !(!c25.g(list.get(0), Integer.valueOf(i))) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
            return js4.F();
        } catch (CertificateParsingException unused) {
            return js4.F();
        }
    }

    private final boolean d(String str, String str2) {
        if (!(str == null || str.length() == 0) && !b95.u2(str, CryptoConstants.ALIAS_SEPARATOR, false, 2, null) && !b95.J1(str, "..", false, 2, null)) {
            if (!(str2 == null || str2.length() == 0) && !b95.u2(str2, CryptoConstants.ALIAS_SEPARATOR, false, 2, null) && !b95.J1(str2, "..", false, 2, null)) {
                if (!b95.J1(str, CryptoConstants.ALIAS_SEPARATOR, false, 2, null)) {
                    str = wo1.t(str, CryptoConstants.ALIAS_SEPARATOR);
                }
                String str3 = str;
                if (!b95.J1(str2, CryptoConstants.ALIAS_SEPARATOR, false, 2, null)) {
                    str2 = wo1.t(str2, CryptoConstants.ALIAS_SEPARATOR);
                }
                Locale locale = Locale.US;
                c25.o(locale, "Locale.US");
                Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
                String lowerCase = str2.toLowerCase(locale);
                c25.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!c95.V2(lowerCase, tm4.g, false, 2, null)) {
                    return c25.g(str3, lowerCase);
                }
                if (!b95.u2(lowerCase, "*.", false, 2, null) || c95.q3(lowerCase, n04.z, 1, false, 4, null) != -1 || str3.length() < lowerCase.length() || c25.g("*.", lowerCase)) {
                    return false;
                }
                String substring = lowerCase.substring(1);
                c25.o(substring, "(this as java.lang.String).substring(startIndex)");
                if (b95.J1(str3, substring, false, 2, null)) {
                    int length = str3.length() - substring.length();
                    return length <= 0 || c95.E3(str3, '.', length + (-1), false, 4, null) == -1;
                }
                return false;
            }
        }
        return false;
    }

    private final boolean e(String str, X509Certificate x509Certificate) {
        Locale locale = Locale.US;
        c25.o(locale, "Locale.US");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        c25.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        List<String> b2 = b(x509Certificate, 2);
        if ((b2 instanceof Collection) && b2.isEmpty()) {
            return false;
        }
        for (String str2 : b2) {
            if (c.d(lowerCase, str2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean f(String str, X509Certificate x509Certificate) {
        String e = pr5.e(str);
        List<String> b2 = b(x509Certificate, 7);
        if ((b2 instanceof Collection) && b2.isEmpty()) {
            return false;
        }
        for (String str2 : b2) {
            if (c25.g(e, pr5.e(str2))) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final List<String> a(@NotNull X509Certificate x509Certificate) {
        c25.p(x509Certificate, "certificate");
        return rs4.y4(b(x509Certificate, 7), b(x509Certificate, 2));
    }

    public final boolean c(@NotNull String str, @NotNull X509Certificate x509Certificate) {
        c25.p(str, "host");
        c25.p(x509Certificate, "certificate");
        return sr5.h(str) ? f(str, x509Certificate) : e(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(@NotNull String str, @NotNull SSLSession sSLSession) {
        c25.p(str, "host");
        c25.p(sSLSession, yo3.e);
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return c(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}