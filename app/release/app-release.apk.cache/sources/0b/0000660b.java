package com.p7700g.p99005;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Handshake.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B;\b\u0000\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0005\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0.¢\u0006\u0004\b0\u00101J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0011\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000eJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u0018*\u00020\t8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u001f\u001a\u0004\u0018\u00010\f8G@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000eR\u0015\u0010!\u001a\u0004\u0018\u00010\f8G@\u0006¢\u0006\u0006\u001a\u0004\b \u0010\u000eR\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007@\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010\u000bR\u0019\u0010'\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010\u0004R#\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\b8G@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010\u000bR\u0019\u0010-\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0007¨\u00062"}, d2 = {"Lcom/p7700g/p99005/xq5;", "", "Lcom/p7700g/p99005/mr5;", "f", "()Lcom/p7700g/p99005/mr5;", "Lcom/p7700g/p99005/lq5;", "a", "()Lcom/p7700g/p99005/lq5;", "", "Ljava/security/cert/Certificate;", "d", "()Ljava/util/List;", "Ljava/security/Principal;", "e", "()Ljava/security/Principal;", "b", "c", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "j", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "name", "n", "peerPrincipal", "l", "localPrincipal", "Ljava/util/List;", "k", "localCertificates", "Lcom/p7700g/p99005/mr5;", ij3.b, "tlsVersion", "Lcom/p7700g/p99005/qo4;", com.anythink.expressad.d.a.b.dH, "peerCertificates", "Lcom/p7700g/p99005/lq5;", com.anythink.basead.d.g.i, "cipherSuite", "Lkotlin/Function0;", "peerCertificatesFn", "<init>", "(Lcom/p7700g/p99005/mr5;Lcom/p7700g/p99005/lq5;Ljava/util/List;Lcom/p7700g/p99005/uz4;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class xq5 {
    public static final a a = new a(null);
    @NotNull
    private final qo4 b;
    @NotNull
    private final mr5 c;
    @NotNull
    private final lq5 d;
    @NotNull
    private final List<Certificate> e;

    /* compiled from: Handshake.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00000\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004*\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\nJ;\u0010\u0013\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"com/p7700g/p99005/xq5$a", "", "", "Ljava/security/cert/Certificate;", "", "d", "([Ljava/security/cert/Certificate;)Ljava/util/List;", "Ljavax/net/ssl/SSLSession;", "Lcom/p7700g/p99005/xq5;", "b", "(Ljavax/net/ssl/SSLSession;)Lcom/p7700g/p99005/xq5;", "sslSession", "a", "Lcom/p7700g/p99005/mr5;", "tlsVersion", "Lcom/p7700g/p99005/lq5;", "cipherSuite", "peerCertificates", "localCertificates", "c", "(Lcom/p7700g/p99005/mr5;Lcom/p7700g/p99005/lq5;Ljava/util/List;Ljava/util/List;)Lcom/p7700g/p99005/xq5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: Handshake.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "h", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
        /* renamed from: com.p7700g.p99005.xq5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0267a extends e25 implements uz4<List<? extends Certificate>> {
            public final /* synthetic */ List t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0267a(List list) {
                super(0);
                this.t = list;
            }

            @Override // com.p7700g.p99005.uz4
            @NotNull
            /* renamed from: h */
            public final List<Certificate> x() {
                return this.t;
            }
        }

        /* compiled from: Handshake.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "h", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class b extends e25 implements uz4<List<? extends Certificate>> {
            public final /* synthetic */ List t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(List list) {
                super(0);
                this.t = list;
            }

            @Override // com.p7700g.p99005.uz4
            @NotNull
            /* renamed from: h */
            public final List<Certificate> x() {
                return this.t;
            }
        }

        private a() {
        }

        private final List<Certificate> d(Certificate[] certificateArr) {
            if (certificateArr != null) {
                return sr5.z((Certificate[]) Arrays.copyOf(certificateArr, certificateArr.length));
            }
            return js4.F();
        }

        @fz4(name = "-deprecated_get")
        @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "sslSession.handshake()", imports = {}))
        @NotNull
        public final xq5 a(@NotNull SSLSession sSLSession) throws IOException {
            c25.p(sSLSession, "sslSession");
            return b(sSLSession);
        }

        @fz4(name = "get")
        @jz4
        @NotNull
        public final xq5 b(@NotNull SSLSession sSLSession) throws IOException {
            List<Certificate> F;
            c25.p(sSLSession, "$this$handshake");
            String cipherSuite = sSLSession.getCipherSuite();
            if (cipherSuite != null) {
                int hashCode = cipherSuite.hashCode();
                if (hashCode == 1019404634 ? !cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") : !(hashCode == 1208658923 && cipherSuite.equals("SSL_NULL_WITH_NULL_NULL"))) {
                    lq5 b2 = lq5.r1.b(cipherSuite);
                    String protocol = sSLSession.getProtocol();
                    if (protocol != null) {
                        if (!c25.g("NONE", protocol)) {
                            mr5 a = mr5.y.a(protocol);
                            try {
                                F = d(sSLSession.getPeerCertificates());
                            } catch (SSLPeerUnverifiedException unused) {
                                F = js4.F();
                            }
                            return new xq5(a, b2, d(sSLSession.getLocalCertificates()), new b(F));
                        }
                        throw new IOException("tlsVersion == NONE");
                    }
                    throw new IllegalStateException("tlsVersion == null".toString());
                }
                throw new IOException(wo1.t("cipherSuite == ", cipherSuite));
            }
            throw new IllegalStateException("cipherSuite == null".toString());
        }

        @jz4
        @NotNull
        public final xq5 c(@NotNull mr5 mr5Var, @NotNull lq5 lq5Var, @NotNull List<? extends Certificate> list, @NotNull List<? extends Certificate> list2) {
            c25.p(mr5Var, "tlsVersion");
            c25.p(lq5Var, "cipherSuite");
            c25.p(list, "peerCertificates");
            c25.p(list2, "localCertificates");
            return new xq5(mr5Var, lq5Var, sr5.c0(list2), new C0267a(sr5.c0(list)));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Handshake.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "h", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b extends e25 implements uz4<List<? extends Certificate>> {
        public final /* synthetic */ uz4 t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(uz4 uz4Var) {
            super(0);
            this.t = uz4Var;
        }

        @Override // com.p7700g.p99005.uz4
        @NotNull
        /* renamed from: h */
        public final List<Certificate> x() {
            try {
                return (List) this.t.x();
            } catch (SSLPeerUnverifiedException unused) {
                return js4.F();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public xq5(@NotNull mr5 mr5Var, @NotNull lq5 lq5Var, @NotNull List<? extends Certificate> list, @NotNull uz4<? extends List<? extends Certificate>> uz4Var) {
        c25.p(mr5Var, "tlsVersion");
        c25.p(lq5Var, "cipherSuite");
        c25.p(list, "localCertificates");
        c25.p(uz4Var, "peerCertificatesFn");
        this.c = mr5Var;
        this.d = lq5Var;
        this.e = list;
        this.b = so4.c(new b(uz4Var));
    }

    @fz4(name = "get")
    @jz4
    @NotNull
    public static final xq5 h(@NotNull SSLSession sSLSession) throws IOException {
        return a.b(sSLSession);
    }

    @jz4
    @NotNull
    public static final xq5 i(@NotNull mr5 mr5Var, @NotNull lq5 lq5Var, @NotNull List<? extends Certificate> list, @NotNull List<? extends Certificate> list2) {
        return a.c(mr5Var, lq5Var, list, list2);
    }

    private final String j(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            return ((X509Certificate) certificate).getSubjectDN().toString();
        }
        String type = certificate.getType();
        c25.o(type, "type");
        return type;
    }

    @fz4(name = "-deprecated_cipherSuite")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "cipherSuite", imports = {}))
    @NotNull
    public final lq5 a() {
        return this.d;
    }

    @fz4(name = "-deprecated_localCertificates")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "localCertificates", imports = {}))
    @NotNull
    public final List<Certificate> b() {
        return this.e;
    }

    @fz4(name = "-deprecated_localPrincipal")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "localPrincipal", imports = {}))
    @Nullable
    public final Principal c() {
        return l();
    }

    @fz4(name = "-deprecated_peerCertificates")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "peerCertificates", imports = {}))
    @NotNull
    public final List<Certificate> d() {
        return m();
    }

    @fz4(name = "-deprecated_peerPrincipal")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "peerPrincipal", imports = {}))
    @Nullable
    public final Principal e() {
        return n();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof xq5) {
            xq5 xq5Var = (xq5) obj;
            if (xq5Var.c == this.c && c25.g(xq5Var.d, this.d) && c25.g(xq5Var.m(), m()) && c25.g(xq5Var.e, this.e)) {
                return true;
            }
        }
        return false;
    }

    @fz4(name = "-deprecated_tlsVersion")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "tlsVersion", imports = {}))
    @NotNull
    public final mr5 f() {
        return this.c;
    }

    @fz4(name = "cipherSuite")
    @NotNull
    public final lq5 g() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        int hashCode2 = m().hashCode();
        return this.e.hashCode() + ((hashCode2 + ((hashCode + ((this.c.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    @fz4(name = "localCertificates")
    @NotNull
    public final List<Certificate> k() {
        return this.e;
    }

    @fz4(name = "localPrincipal")
    @Nullable
    public final Principal l() {
        Object B2 = rs4.B2(this.e);
        if (!(B2 instanceof X509Certificate)) {
            B2 = null;
        }
        X509Certificate x509Certificate = (X509Certificate) B2;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @fz4(name = "peerCertificates")
    @NotNull
    public final List<Certificate> m() {
        return (List) this.b.getValue();
    }

    @fz4(name = "peerPrincipal")
    @Nullable
    public final Principal n() {
        Object B2 = rs4.B2(m());
        if (!(B2 instanceof X509Certificate)) {
            B2 = null;
        }
        X509Certificate x509Certificate = (X509Certificate) B2;
        if (x509Certificate != null) {
            return x509Certificate.getSubjectX500Principal();
        }
        return null;
    }

    @fz4(name = "tlsVersion")
    @NotNull
    public final mr5 o() {
        return this.c;
    }

    @NotNull
    public String toString() {
        List<Certificate> m = m();
        ArrayList arrayList = new ArrayList(ks4.Z(m, 10));
        for (Certificate certificate : m) {
            arrayList.add(j(certificate));
        }
        String obj = arrayList.toString();
        StringBuilder L = wo1.L("Handshake{", "tlsVersion=");
        L.append(this.c);
        L.append(gl4.R);
        L.append("cipherSuite=");
        L.append(this.d);
        L.append(gl4.R);
        L.append("peerCertificates=");
        L.append(obj);
        L.append(gl4.R);
        L.append("localCertificates=");
        List<Certificate> list = this.e;
        ArrayList arrayList2 = new ArrayList(ks4.Z(list, 10));
        for (Certificate certificate2 : list) {
            arrayList2.add(j(certificate2));
        }
        L.append(arrayList2);
        L.append('}');
        return L.toString();
    }
}