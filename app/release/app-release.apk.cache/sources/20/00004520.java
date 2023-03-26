package com.p7700g.p99005;

import com.p7700g.p99005.xu0;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Protocol.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006j\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/p7700g/p99005/gr5;", "", "", "toString", "()Ljava/lang/String;", bx.B4, "Ljava/lang/String;", xu0.f.m, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "z", "a", "HTTP_1_0", "HTTP_1_1", "SPDY_3", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public enum gr5 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public static final a z = new a(null);
    private final String A;

    /* compiled from: Protocol.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"com/p7700g/p99005/gr5$a", "", "", xu0.f.m, "Lcom/p7700g/p99005/gr5;", "a", "(Ljava/lang/String;)Lcom/p7700g/p99005/gr5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @jz4
        @NotNull
        public final gr5 a(@NotNull String str) throws IOException {
            c25.p(str, xu0.f.m);
            gr5 gr5Var = gr5.HTTP_1_0;
            if (!c25.g(str, gr5Var.A)) {
                gr5Var = gr5.HTTP_1_1;
                if (!c25.g(str, gr5Var.A)) {
                    gr5Var = gr5.H2_PRIOR_KNOWLEDGE;
                    if (!c25.g(str, gr5Var.A)) {
                        gr5Var = gr5.HTTP_2;
                        if (!c25.g(str, gr5Var.A)) {
                            gr5Var = gr5.SPDY_3;
                            if (!c25.g(str, gr5Var.A)) {
                                gr5Var = gr5.QUIC;
                                if (!c25.g(str, gr5Var.A)) {
                                    throw new IOException(wo1.t("Unexpected protocol: ", str));
                                }
                            }
                        }
                    }
                }
            }
            return gr5Var;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    gr5(String str) {
        this.A = str;
    }

    @jz4
    @NotNull
    public static final gr5 b(@NotNull String str) throws IOException {
        return z.a(str);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.A;
    }
}