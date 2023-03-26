package com.p7700g.p99005;

import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import com.p7700g.p99005.v43;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class c23 extends t43<byte[]> {
    @NotNull
    private static final a J = new a(null);
    @Deprecated
    @NotNull
    private static final String K = "CrashRequest";
    @Deprecated
    private static final float L = 1.2f;
    @Deprecated
    private static final int M = 30000;
    @Deprecated
    private static final int N = 2;
    @NotNull
    private final String O;
    @Nullable
    private final la3<String> P;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c23(@NotNull String str, @NotNull String str2, @Nullable final la3<String> la3Var) {
        super(1, str, new v43.a() { // from class: com.p7700g.p99005.z13
            @Override // com.p7700g.p99005.v43.a
            public final void b(b53 b53Var) {
                c23.Y(la3.this, b53Var);
            }
        });
        c25.p(str, "url");
        c25.p(str2, "data");
        this.O = str2;
        this.P = la3Var;
        O(new j43(30000, 2, L));
        Q(false);
    }

    public static final void V(la3 la3Var, b53 b53Var) {
        h23<String> h23Var = new h23<>(b53Var.getLocalizedMessage(), (int) com.anythink.expressad.video.dynview.a.a.t, true);
        if (la3Var == null) {
            return;
        }
        la3Var.b(h23Var, new Exception(b53Var.getLocalizedMessage()));
    }

    public static /* synthetic */ void Y(la3 la3Var, b53 b53Var) {
        V(la3Var, b53Var);
    }

    @Override // com.p7700g.p99005.t43
    @NotNull
    public v43<byte[]> K(@Nullable p43 p43Var) {
        v43<byte[]> c = v43.c(p43Var == null ? null : p43Var.b, k53.c(p43Var));
        c25.o(c, "success(\n            response?.data,\n            HttpHeaderParser.parseCacheHeaders(response)\n        )");
        return c;
    }

    @Override // com.p7700g.p99005.t43
    /* renamed from: W */
    public void f(@Nullable byte[] bArr) {
        if (bArr == null) {
            return;
        }
        Z();
    }

    @Nullable
    public final la3<String> X() {
        return this.P;
    }

    public final void Z() {
        h23<String> h23Var = new h23<>("Crash Report Submitted", 200, true);
        la3<String> la3Var = this.P;
        if (la3Var == null) {
            return;
        }
        la3Var.a(h23Var);
    }

    @Override // com.p7700g.p99005.t43
    @NotNull
    public byte[] j() {
        String str = this.O;
        Charset charset = f85.b;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = str.getBytes(charset);
        c25.o(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // com.p7700g.p99005.t43
    @NotNull
    public String k() {
        j35 j35Var = j35.a;
        String format = String.format("application/json; charset=%s", Arrays.copyOf(new Object[]{"utf8"}, 1));
        c25.o(format, "java.lang.String.format(format, *args)");
        return format;
    }

    @Override // com.p7700g.p99005.t43
    @NotNull
    public Map<String, String> o() {
        AppConfig r;
        xz2.c(K, "Adding Headers");
        Map<String, String> o = super.o();
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        if ((iNSTANCE$com_greedygame_sdkx_core == null || (r = iNSTANCE$com_greedygame_sdkx_core.r()) == null || !r.w()) ? false : true) {
            xz2.c(K, "Adding Debug Header to crash report request");
            c25.o(o, "headersMap");
            o.put("X-Gg-Debug", "true");
        }
        c25.o(o, "headersMap");
        return o;
    }

    @Override // com.p7700g.p99005.t43
    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("Crash Report ");
        G.append((Object) D());
        G.append(" ::: ");
        G.append(this.O);
        return G.toString();
    }
}