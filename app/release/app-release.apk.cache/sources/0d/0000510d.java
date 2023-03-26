package com.p7700g.p99005;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: TlsVersion.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u0019\u0010\b\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/p7700g/p99005/mr5;", "", "", "f", "()Ljava/lang/String;", "z", "Ljava/lang/String;", "h", "javaName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "y", "a", "TLS_1_3", "TLS_1_2", "TLS_1_1", "TLS_1_0", "SSL_3_0", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public enum mr5 {
    TLS_1_3("TLSv1.3"),
    TLS_1_2("TLSv1.2"),
    TLS_1_1("TLSv1.1"),
    TLS_1_0("TLSv1"),
    SSL_3_0("SSLv3");
    
    public static final a y = new a(null);
    @NotNull
    private final String z;

    /* compiled from: TlsVersion.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"com/p7700g/p99005/mr5$a", "", "", "javaName", "Lcom/p7700g/p99005/mr5;", "a", "(Ljava/lang/String;)Lcom/p7700g/p99005/mr5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @jz4
        @NotNull
        public final mr5 a(@NotNull String str) {
            c25.p(str, "javaName");
            int hashCode = str.hashCode();
            if (hashCode != 79201641) {
                if (hashCode != 79923350) {
                    switch (hashCode) {
                        case -503070503:
                            if (str.equals("TLSv1.1")) {
                                return mr5.TLS_1_1;
                            }
                            break;
                        case -503070502:
                            if (str.equals("TLSv1.2")) {
                                return mr5.TLS_1_2;
                            }
                            break;
                        case -503070501:
                            if (str.equals("TLSv1.3")) {
                                return mr5.TLS_1_3;
                            }
                            break;
                    }
                } else if (str.equals("TLSv1")) {
                    return mr5.TLS_1_0;
                }
            } else if (str.equals("SSLv3")) {
                return mr5.SSL_3_0;
            }
            throw new IllegalArgumentException(wo1.t("Unexpected TLS version: ", str));
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    mr5(String str) {
        this.z = str;
    }

    @jz4
    @NotNull
    public static final mr5 g(@NotNull String str) {
        return y.a(str);
    }

    @fz4(name = "-deprecated_javaName")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "javaName", imports = {}))
    @NotNull
    public final String f() {
        return this.z;
    }

    @fz4(name = "javaName")
    @NotNull
    public final String h() {
        return this.z;
    }
}