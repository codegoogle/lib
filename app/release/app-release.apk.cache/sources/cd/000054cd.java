package com.p7700g.p99005;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConnectionSpec.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u000b\u0018\u0000 &2\u00020\u0001:\u0002\n\u000eB9\b\u0000\u0012\u0006\u0010(\u001a\u00020\u0004\u0012\u0006\u0010\"\u001a\u00020\u0004\u0012\u000e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010#\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010#¢\u0006\u0004\b,\u0010-J\u001f\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\bH\u0007¢\u0006\u0004\b\r\u0010\u000bJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\"\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000fR\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010$R\u001b\u0010'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8G@\u0006¢\u0006\u0006\u001a\u0004\b&\u0010\u000bR\u0019\u0010(\u001a\u00020\u00048\u0007@\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b\u001f\u0010\u000fR\u001b\u0010*\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\b8G@\u0006¢\u0006\u0006\u001a\u0004\b)\u0010\u000bR\u001e\u0010+\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$¨\u0006."}, d2 = {"Lcom/p7700g/p99005/oq5;", "", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "", "isFallback", "j", "(Ljavax/net/ssl/SSLSocket;Z)Lcom/p7700g/p99005/oq5;", "", "Lcom/p7700g/p99005/lq5;", "a", "()Ljava/util/List;", "Lcom/p7700g/p99005/mr5;", "c", "b", "()Z", "Lcom/p7700g/p99005/yq4;", "f", "(Ljavax/net/ssl/SSLSocket;Z)V", "socket", "h", "(Ljavax/net/ssl/SSLSocket;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "i", "Z", "k", "supportsTlsExtensions", "", "[Ljava/lang/String;", "tlsVersionsAsString", com.anythink.basead.d.g.i, "cipherSuites", "isTls", "l", "tlsVersions", "cipherSuitesAsString", "<init>", "(ZZ[Ljava/lang/String;[Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class oq5 {
    private static final lq5[] a;
    private static final lq5[] b;
    @cz4
    @NotNull
    public static final oq5 c;
    @cz4
    @NotNull
    public static final oq5 d;
    @cz4
    @NotNull
    public static final oq5 e;
    @cz4
    @NotNull
    public static final oq5 f;
    public static final b g = new b(null);
    private final boolean h;
    private final boolean i;
    private final String[] j;
    private final String[] k;

    /* compiled from: ConnectionSpec.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0011\b\u0010\u0012\u0006\u0010&\u001a\u00020\u0013¢\u0006\u0004\b)\u0010\u001eB\u0011\b\u0016\u0012\u0006\u0010*\u001a\u00020\u0017¢\u0006\u0004\b)\u0010+J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005\"\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\"\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0004J!\u0010\u0010\u001a\u00020\u00022\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\u0005\"\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0012\u001a\u00020\u00022\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0005\"\u00020\n¢\u0006\u0004\b\u0012\u0010\fJ\u0017\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0014\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010&\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b$\u0010\u001c\"\u0004\b%\u0010\u001eR*\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b'\u0010!\"\u0004\b(\u0010#¨\u0006,"}, d2 = {"com/p7700g/p99005/oq5$a", "", "Lcom/p7700g/p99005/oq5$a;", "a", "()Lcom/p7700g/p99005/oq5$a;", "", "Lcom/p7700g/p99005/lq5;", "cipherSuites", "e", "([Lokhttp3/CipherSuite;)Lcom/p7700g/p99005/oq5$a;", "", "d", "([Ljava/lang/String;)Lcom/p7700g/p99005/oq5$a;", "b", "Lcom/p7700g/p99005/mr5;", "tlsVersions", "p", "([Lokhttp3/TlsVersion;)Lcom/p7700g/p99005/oq5$a;", ij3.b, "", "supportsTlsExtensions", "n", "(Z)Lcom/p7700g/p99005/oq5$a;", "Lcom/p7700g/p99005/oq5;", "c", "()Lcom/p7700g/p99005/oq5;", "Z", com.anythink.basead.d.g.i, "()Z", "k", "(Z)V", "[Ljava/lang/String;", "f", "()[Ljava/lang/String;", "j", "([Ljava/lang/String;)V", "h", "l", "tls", "i", com.anythink.expressad.d.a.b.dH, "<init>", "connectionSpec", "(Lcom/p7700g/p99005/oq5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private boolean a;
        @Nullable
        private String[] b;
        @Nullable
        private String[] c;
        private boolean d;

        public a(boolean z) {
            this.a = z;
        }

        @NotNull
        public final a a() {
            if (this.a) {
                this.b = null;
                return this;
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @NotNull
        public final a b() {
            if (this.a) {
                this.c = null;
                return this;
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        @NotNull
        public final oq5 c() {
            return new oq5(this.a, this.d, this.b, this.c);
        }

        @NotNull
        public final a d(@NotNull String... strArr) {
            c25.p(strArr, "cipherSuites");
            if (this.a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.b = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one cipher suite is required".toString());
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @NotNull
        public final a e(@NotNull lq5... lq5VarArr) {
            c25.p(lq5VarArr, "cipherSuites");
            if (this.a) {
                ArrayList arrayList = new ArrayList(lq5VarArr.length);
                for (lq5 lq5Var : lq5VarArr) {
                    arrayList.add(lq5Var.e());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                return d((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no cipher suites for cleartext connections".toString());
        }

        @Nullable
        public final String[] f() {
            return this.b;
        }

        public final boolean g() {
            return this.d;
        }

        public final boolean h() {
            return this.a;
        }

        @Nullable
        public final String[] i() {
            return this.c;
        }

        public final void j(@Nullable String[] strArr) {
            this.b = strArr;
        }

        public final void k(boolean z) {
            this.d = z;
        }

        public final void l(boolean z) {
            this.a = z;
        }

        public final void m(@Nullable String[] strArr) {
            this.c = strArr;
        }

        @xn4(message = "since OkHttp 3.13 all TLS-connections are expected to support TLS extensions.\nIn a future release setting this to true will be unnecessary and setting it to false\nwill have no effect.")
        @NotNull
        public final a n(boolean z) {
            if (this.a) {
                this.d = z;
                return this;
            }
            throw new IllegalArgumentException("no TLS extensions for cleartext connections".toString());
        }

        @NotNull
        public final a o(@NotNull String... strArr) {
            c25.p(strArr, "tlsVersions");
            if (this.a) {
                if (!(strArr.length == 0)) {
                    Object clone = strArr.clone();
                    Objects.requireNonNull(clone, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                    this.c = (String[]) clone;
                    return this;
                }
                throw new IllegalArgumentException("At least one TLS version is required".toString());
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        @NotNull
        public final a p(@NotNull mr5... mr5VarArr) {
            c25.p(mr5VarArr, "tlsVersions");
            if (this.a) {
                ArrayList arrayList = new ArrayList(mr5VarArr.length);
                for (mr5 mr5Var : mr5VarArr) {
                    arrayList.add(mr5Var.h());
                }
                Object[] array = arrayList.toArray(new String[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                String[] strArr = (String[]) array;
                return o((String[]) Arrays.copyOf(strArr, strArr.length));
            }
            throw new IllegalArgumentException("no TLS versions for cleartext connections".toString());
        }

        public a(@NotNull oq5 oq5Var) {
            c25.p(oq5Var, "connectionSpec");
            this.a = oq5Var.i();
            this.b = oq5Var.j;
            this.c = oq5Var.k;
            this.d = oq5Var.k();
        }
    }

    /* compiled from: ConnectionSpec.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\bR\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005R\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"com/p7700g/p99005/oq5$b", "", "", "Lcom/p7700g/p99005/lq5;", "APPROVED_CIPHER_SUITES", "[Lokhttp3/CipherSuite;", "Lcom/p7700g/p99005/oq5;", "CLEARTEXT", "Lcom/p7700g/p99005/oq5;", "COMPATIBLE_TLS", "MODERN_TLS", "RESTRICTED_CIPHER_SUITES", "RESTRICTED_TLS", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        lq5 lq5Var = lq5.m1;
        lq5 lq5Var2 = lq5.n1;
        lq5 lq5Var3 = lq5.o1;
        lq5 lq5Var4 = lq5.Y0;
        lq5 lq5Var5 = lq5.c1;
        lq5 lq5Var6 = lq5.Z0;
        lq5 lq5Var7 = lq5.d1;
        lq5 lq5Var8 = lq5.j1;
        lq5 lq5Var9 = lq5.i1;
        lq5[] lq5VarArr = {lq5Var, lq5Var2, lq5Var3, lq5Var4, lq5Var5, lq5Var6, lq5Var7, lq5Var8, lq5Var9};
        a = lq5VarArr;
        lq5[] lq5VarArr2 = {lq5Var, lq5Var2, lq5Var3, lq5Var4, lq5Var5, lq5Var6, lq5Var7, lq5Var8, lq5Var9, lq5.J0, lq5.K0, lq5.h0, lq5.i0, lq5.F, lq5.J, lq5.j};
        b = lq5VarArr2;
        a e2 = new a(true).e((lq5[]) Arrays.copyOf(lq5VarArr, lq5VarArr.length));
        mr5 mr5Var = mr5.TLS_1_3;
        mr5 mr5Var2 = mr5.TLS_1_2;
        c = e2.p(mr5Var, mr5Var2).n(true).c();
        d = new a(true).e((lq5[]) Arrays.copyOf(lq5VarArr2, lq5VarArr2.length)).p(mr5Var, mr5Var2).n(true).c();
        e = new a(true).e((lq5[]) Arrays.copyOf(lq5VarArr2, lq5VarArr2.length)).p(mr5Var, mr5Var2, mr5.TLS_1_1, mr5.TLS_1_0).n(true).c();
        f = new a(false).c();
    }

    public oq5(boolean z, boolean z2, @Nullable String[] strArr, @Nullable String[] strArr2) {
        this.h = z;
        this.i = z2;
        this.j = strArr;
        this.k = strArr2;
    }

    private final oq5 j(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        if (this.j != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            c25.o(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = sr5.I(enabledCipherSuites2, this.j, lq5.r1.c());
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        if (this.k != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            c25.o(enabledProtocols2, "sslSocket.enabledProtocols");
            enabledProtocols = sr5.I(enabledProtocols2, this.k, wu4.l());
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        c25.o(supportedCipherSuites, "supportedCipherSuites");
        int A = sr5.A(supportedCipherSuites, "TLS_FALLBACK_SCSV", lq5.r1.c());
        if (z && A != -1) {
            c25.o(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[A];
            c25.o(str, "supportedCipherSuites[indexOfFallbackScsv]");
            enabledCipherSuites = sr5.o(enabledCipherSuites, str);
        }
        a aVar = new a(this);
        c25.o(enabledCipherSuites, "cipherSuitesIntersection");
        a d2 = aVar.d((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        c25.o(enabledProtocols, "tlsVersionsIntersection");
        return d2.o((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length)).c();
    }

    @fz4(name = "-deprecated_cipherSuites")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "cipherSuites", imports = {}))
    @Nullable
    public final List<lq5> a() {
        return g();
    }

    @fz4(name = "-deprecated_supportsTlsExtensions")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "supportsTlsExtensions", imports = {}))
    public final boolean b() {
        return this.i;
    }

    @fz4(name = "-deprecated_tlsVersions")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "tlsVersions", imports = {}))
    @Nullable
    public final List<mr5> c() {
        return l();
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof oq5) {
            if (obj == this) {
                return true;
            }
            boolean z = this.h;
            oq5 oq5Var = (oq5) obj;
            if (z != oq5Var.h) {
                return false;
            }
            return !z || (Arrays.equals(this.j, oq5Var.j) && Arrays.equals(this.k, oq5Var.k) && this.i == oq5Var.i);
        }
        return false;
    }

    public final void f(@NotNull SSLSocket sSLSocket, boolean z) {
        c25.p(sSLSocket, "sslSocket");
        oq5 j = j(sSLSocket, z);
        if (j.l() != null) {
            sSLSocket.setEnabledProtocols(j.k);
        }
        if (j.g() != null) {
            sSLSocket.setEnabledCipherSuites(j.j);
        }
    }

    @fz4(name = "cipherSuites")
    @Nullable
    public final List<lq5> g() {
        String[] strArr = this.j;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(lq5.r1.b(str));
            }
            return rs4.Q5(arrayList);
        }
        return null;
    }

    public final boolean h(@NotNull SSLSocket sSLSocket) {
        c25.p(sSLSocket, "socket");
        if (this.h) {
            String[] strArr = this.k;
            if (strArr == null || sr5.w(strArr, sSLSocket.getEnabledProtocols(), wu4.l())) {
                String[] strArr2 = this.j;
                return strArr2 == null || sr5.w(strArr2, sSLSocket.getEnabledCipherSuites(), lq5.r1.c());
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        if (this.h) {
            String[] strArr = this.j;
            int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
            String[] strArr2 = this.k;
            return ((hashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.i ? 1 : 0);
        }
        return 17;
    }

    @fz4(name = "isTls")
    public final boolean i() {
        return this.h;
    }

    @fz4(name = "supportsTlsExtensions")
    public final boolean k() {
        return this.i;
    }

    @fz4(name = "tlsVersions")
    @Nullable
    public final List<mr5> l() {
        String[] strArr = this.k;
        if (strArr != null) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String str : strArr) {
                arrayList.add(mr5.y.a(str));
            }
            return rs4.Q5(arrayList);
        }
        return null;
    }

    @NotNull
    public String toString() {
        if (this.h) {
            StringBuilder L = wo1.L("ConnectionSpec(", "cipherSuites=");
            L.append(Objects.toString(g(), "[all enabled]"));
            L.append(", ");
            L.append("tlsVersions=");
            L.append(Objects.toString(l(), "[all enabled]"));
            L.append(", ");
            L.append("supportsTlsExtensions=");
            L.append(this.i);
            L.append(')');
            return L.toString();
        }
        return "ConnectionSpec()";
    }
}