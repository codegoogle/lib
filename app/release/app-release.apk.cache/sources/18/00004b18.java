package com.p7700g.p99005;

import com.p7700g.p99005.vv5;
import java.security.Principal;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CertificatePinner.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\n\u0018\u0000 \u00102\u00020\u0001:\u0003\b\u0010\rB#\b\u0000\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120 \u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b(\u0010)J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u000f\"\u00020\u0005H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00120 8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010#R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/p7700g/p99005/jq5;", "", "", "hostname", "", "Ljava/security/cert/Certificate;", "peerCertificates", "Lcom/p7700g/p99005/yq4;", "a", "(Ljava/lang/String;Ljava/util/List;)V", "Lkotlin/Function0;", "Ljava/security/cert/X509Certificate;", "cleanedPeerCertificatesFn", "c", "(Ljava/lang/String;Lcom/p7700g/p99005/uz4;)V", "", "b", "(Ljava/lang/String;[Ljava/security/cert/Certificate;)V", "Lcom/p7700g/p99005/jq5$c;", "d", "(Ljava/lang/String;)Ljava/util/List;", "Lcom/p7700g/p99005/ru5;", "certificateChainCleaner", "j", "(Lcom/p7700g/p99005/ru5;)Lcom/p7700g/p99005/jq5;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "pins", "Lcom/p7700g/p99005/ru5;", "e", "()Lcom/p7700g/p99005/ru5;", "<init>", "(Ljava/util/Set;Lcom/p7700g/p99005/ru5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class jq5 {
    @NotNull
    private final Set<c> c;
    @Nullable
    private final ru5 d;
    public static final b b = new b(null);
    @cz4
    @NotNull
    public static final jq5 a = new a().b();

    /* compiled from: CertificatePinner.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004\"\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"com/p7700g/p99005/jq5$a", "", "", "pattern", "", "pins", "Lcom/p7700g/p99005/jq5$a;", "a", "(Ljava/lang/String;[Ljava/lang/String;)Lcom/p7700g/p99005/jq5$a;", "Lcom/p7700g/p99005/jq5;", "b", "()Lcom/p7700g/p99005/jq5;", "", "Lcom/p7700g/p99005/jq5$c;", "Ljava/util/List;", "c", "()Ljava/util/List;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        private final List<c> a = new ArrayList();

        @NotNull
        public final a a(@NotNull String str, @NotNull String... strArr) {
            c25.p(str, "pattern");
            c25.p(strArr, "pins");
            for (String str2 : strArr) {
                this.a.add(new c(str, str2));
            }
            return this;
        }

        @NotNull
        public final jq5 b() {
            return new jq5(rs4.V5(this.a), null, 2, null);
        }

        @NotNull
        public final List<c> c() {
            return this.a;
        }
    }

    /* compiled from: CertificatePinner.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"com/p7700g/p99005/jq5$b", "", "Ljava/security/cert/X509Certificate;", "Lcom/p7700g/p99005/vv5;", "b", "(Ljava/security/cert/X509Certificate;)Lcom/p7700g/p99005/vv5;", "c", "Ljava/security/cert/Certificate;", "certificate", "", "a", "(Ljava/security/cert/Certificate;)Ljava/lang/String;", "Lcom/p7700g/p99005/jq5;", "DEFAULT", "Lcom/p7700g/p99005/jq5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        @jz4
        @NotNull
        public final String a(@NotNull Certificate certificate) {
            c25.p(certificate, "certificate");
            if (certificate instanceof X509Certificate) {
                StringBuilder G = wo1.G("sha256/");
                G.append(c((X509Certificate) certificate).h());
                return G.toString();
            }
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates".toString());
        }

        @jz4
        @NotNull
        public final vv5 b(@NotNull X509Certificate x509Certificate) {
            c25.p(x509Certificate, "$this$sha1Hash");
            vv5.a aVar = vv5.u;
            PublicKey publicKey = x509Certificate.getPublicKey();
            c25.o(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            c25.o(encoded, "publicKey.encoded");
            return vv5.a.p(aVar, encoded, 0, 0, 3, null).t3();
        }

        @jz4
        @NotNull
        public final vv5 c(@NotNull X509Certificate x509Certificate) {
            c25.p(x509Certificate, "$this$sha256Hash");
            vv5.a aVar = vv5.u;
            PublicKey publicKey = x509Certificate.getPublicKey();
            c25.o(publicKey, "publicKey");
            byte[] encoded = publicKey.getEncoded();
            c25.o(encoded, "publicKey.encoded");
            return vv5.a.p(aVar, encoded, 0, 0, 3, null).w3();
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CertificatePinner.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0018\u001a\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001a\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u001c\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\f¨\u0006 "}, d2 = {"com/p7700g/p99005/jq5$c", "", "", "hostname", "", "e", "(Ljava/lang/String;)Z", "Ljava/security/cert/X509Certificate;", "certificate", "d", "(Ljava/security/cert/X509Certificate;)Z", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lcom/p7700g/p99005/vv5;", "c", "Lcom/p7700g/p99005/vv5;", "a", "()Lcom/p7700g/p99005/vv5;", "hash", "Ljava/lang/String;", "pattern", "b", "hashAlgorithm", "pin", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class c {
        @NotNull
        private final String a;
        @NotNull
        private final String b;
        @NotNull
        private final vv5 c;

        public c(@NotNull String str, @NotNull String str2) {
            c25.p(str, "pattern");
            c25.p(str2, "pin");
            if ((b95.u2(str, "*.", false, 2, null) && c95.r3(str, tm4.g, 1, false, 4, null) == -1) || (b95.u2(str, "**.", false, 2, null) && c95.r3(str, tm4.g, 2, false, 4, null) == -1) || c95.r3(str, tm4.g, 0, false, 6, null) == -1) {
                String e = pr5.e(str);
                if (e != null) {
                    this.a = e;
                    if (b95.u2(str2, "sha1/", false, 2, null)) {
                        this.b = "sha1";
                        vv5.a aVar = vv5.u;
                        String substring = str2.substring(5);
                        c25.o(substring, "(this as java.lang.String).substring(startIndex)");
                        vv5 h = aVar.h(substring);
                        if (h == null) {
                            throw new IllegalArgumentException(wo1.t("Invalid pin hash: ", str2));
                        }
                        this.c = h;
                        return;
                    } else if (b95.u2(str2, "sha256/", false, 2, null)) {
                        this.b = "sha256";
                        vv5.a aVar2 = vv5.u;
                        String substring2 = str2.substring(7);
                        c25.o(substring2, "(this as java.lang.String).substring(startIndex)");
                        vv5 h2 = aVar2.h(substring2);
                        if (h2 == null) {
                            throw new IllegalArgumentException(wo1.t("Invalid pin hash: ", str2));
                        }
                        this.c = h2;
                        return;
                    } else {
                        throw new IllegalArgumentException(wo1.t("pins must start with 'sha256/' or 'sha1/': ", str2));
                    }
                }
                throw new IllegalArgumentException(wo1.t("Invalid pattern: ", str));
            }
            throw new IllegalArgumentException(wo1.t("Unexpected pattern: ", str).toString());
        }

        @NotNull
        public final vv5 a() {
            return this.c;
        }

        @NotNull
        public final String b() {
            return this.b;
        }

        @NotNull
        public final String c() {
            return this.a;
        }

        public final boolean d(@NotNull X509Certificate x509Certificate) {
            c25.p(x509Certificate, "certificate");
            String str = this.b;
            int hashCode = str.hashCode();
            if (hashCode != -903629273) {
                if (hashCode == 3528965 && str.equals("sha1")) {
                    return c25.g(this.c, jq5.b.b(x509Certificate));
                }
            } else if (str.equals("sha256")) {
                return c25.g(this.c, jq5.b.c(x509Certificate));
            }
            return false;
        }

        public final boolean e(@NotNull String str) {
            boolean d2;
            boolean d22;
            c25.p(str, "hostname");
            if (b95.u2(this.a, "**.", false, 2, null)) {
                int length = this.a.length() - 3;
                int length2 = str.length() - length;
                d22 = b95.d2(str, str.length() - length, this.a, 3, length, (r12 & 16) != 0 ? false : false);
                if (!d22) {
                    return false;
                }
                if (length2 != 0 && str.charAt(length2 - 1) != '.') {
                    return false;
                }
            } else if (b95.u2(this.a, "*.", false, 2, null)) {
                int length3 = this.a.length() - 1;
                int length4 = str.length() - length3;
                d2 = b95.d2(str, str.length() - length3, this.a, 1, length3, (r12 & 16) != 0 ? false : false);
                if (!d2 || c95.E3(str, '.', length4 - 1, false, 4, null) != -1) {
                    return false;
                }
            } else {
                return c25.g(str, this.a);
            }
            return true;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return ((c25.g(this.a, cVar.a) ^ true) || (c25.g(this.b, cVar.b) ^ true) || (c25.g(this.c, cVar.c) ^ true)) ? false : true;
            }
            return false;
        }

        public int hashCode() {
            return this.c.hashCode() + wo1.x(this.b, this.a.hashCode() * 31, 31);
        }

        @NotNull
        public String toString() {
            return this.b + j14.P + this.c.h();
        }
    }

    /* compiled from: CertificatePinner.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "h", "()Ljava/util/List;"}, k = 3, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class d extends e25 implements uz4<List<? extends X509Certificate>> {
        public final /* synthetic */ List u;
        public final /* synthetic */ String v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List list, String str) {
            super(0);
            this.u = list;
            this.v = str;
        }

        @Override // com.p7700g.p99005.uz4
        @NotNull
        /* renamed from: h */
        public final List<X509Certificate> x() {
            List<Certificate> list;
            ru5 e = jq5.this.e();
            if (e == null || (list = e.a(this.u, this.v)) == null) {
                list = this.u;
            }
            ArrayList arrayList = new ArrayList(ks4.Z(list, 10));
            for (Certificate certificate : list) {
                Objects.requireNonNull(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                arrayList.add((X509Certificate) certificate);
            }
            return arrayList;
        }
    }

    public jq5(@NotNull Set<c> set, @Nullable ru5 ru5Var) {
        c25.p(set, "pins");
        this.c = set;
        this.d = ru5Var;
    }

    @jz4
    @NotNull
    public static final String g(@NotNull Certificate certificate) {
        return b.a(certificate);
    }

    @jz4
    @NotNull
    public static final vv5 h(@NotNull X509Certificate x509Certificate) {
        return b.b(x509Certificate);
    }

    @jz4
    @NotNull
    public static final vv5 i(@NotNull X509Certificate x509Certificate) {
        return b.c(x509Certificate);
    }

    public final void a(@NotNull String str, @NotNull List<? extends Certificate> list) throws SSLPeerUnverifiedException {
        c25.p(str, "hostname");
        c25.p(list, "peerCertificates");
        c(str, new d(list, str));
    }

    @xn4(message = "replaced with {@link #check(String, List)}.", replaceWith = @op4(expression = "check(hostname, peerCertificates.toList())", imports = {}))
    public final void b(@NotNull String str, @NotNull Certificate... certificateArr) throws SSLPeerUnverifiedException {
        c25.p(str, "hostname");
        c25.p(certificateArr, "peerCertificates");
        a(str, as4.iz(certificateArr));
    }

    public final void c(@NotNull String str, @NotNull uz4<? extends List<? extends X509Certificate>> uz4Var) {
        c25.p(str, "hostname");
        c25.p(uz4Var, "cleanedPeerCertificatesFn");
        List<c> d2 = d(str);
        if (d2.isEmpty()) {
            return;
        }
        List<? extends X509Certificate> x = uz4Var.x();
        for (X509Certificate x509Certificate : x) {
            vv5 vv5Var = null;
            vv5 vv5Var2 = null;
            for (c cVar : d2) {
                String b2 = cVar.b();
                int hashCode = b2.hashCode();
                if (hashCode != -903629273) {
                    if (hashCode == 3528965 && b2.equals("sha1")) {
                        if (vv5Var2 == null) {
                            vv5Var2 = b.b(x509Certificate);
                        }
                        if (c25.g(cVar.a(), vv5Var2)) {
                            return;
                        }
                    }
                    StringBuilder G = wo1.G("unsupported hashAlgorithm: ");
                    G.append(cVar.b());
                    throw new AssertionError(G.toString());
                } else if (b2.equals("sha256")) {
                    if (vv5Var == null) {
                        vv5Var = b.c(x509Certificate);
                    }
                    if (c25.g(cVar.a(), vv5Var)) {
                        return;
                    }
                } else {
                    StringBuilder G2 = wo1.G("unsupported hashAlgorithm: ");
                    G2.append(cVar.b());
                    throw new AssertionError(G2.toString());
                }
            }
        }
        StringBuilder L = wo1.L("Certificate pinning failure!", "\n  Peer certificate chain:");
        for (X509Certificate x509Certificate2 : x) {
            L.append("\n    ");
            L.append(b.a(x509Certificate2));
            L.append(": ");
            Principal subjectDN = x509Certificate2.getSubjectDN();
            c25.o(subjectDN, "element.subjectDN");
            L.append(subjectDN.getName());
        }
        L.append("\n  Pinned certificates for ");
        L.append(str);
        L.append(":");
        for (c cVar2 : d2) {
            L.append("\n    ");
            L.append(cVar2);
        }
        String sb = L.toString();
        c25.o(sb, "StringBuilder().apply(builderAction).toString()");
        throw new SSLPeerUnverifiedException(sb);
    }

    @NotNull
    public final List<c> d(@NotNull String str) {
        c25.p(str, "hostname");
        Set<c> set = this.c;
        List<c> F = js4.F();
        for (Object obj : set) {
            if (((c) obj).e(str)) {
                if (F.isEmpty()) {
                    F = new ArrayList<>();
                }
                k35.g(F).add(obj);
            }
        }
        return F;
    }

    @Nullable
    public final ru5 e() {
        return this.d;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof jq5) {
            jq5 jq5Var = (jq5) obj;
            if (c25.g(jq5Var.c, this.c) && c25.g(jq5Var.d, this.d)) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final Set<c> f() {
        return this.c;
    }

    public int hashCode() {
        int hashCode = (this.c.hashCode() + 1517) * 41;
        ru5 ru5Var = this.d;
        return hashCode + (ru5Var != null ? ru5Var.hashCode() : 0);
    }

    @NotNull
    public final jq5 j(@NotNull ru5 ru5Var) {
        c25.p(ru5Var, "certificateChainCleaner");
        return c25.g(this.d, ru5Var) ? this : new jq5(this.c, ru5Var);
    }

    public /* synthetic */ jq5(Set set, ru5 ru5Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, (i & 2) != 0 ? null : ru5Var);
    }
}