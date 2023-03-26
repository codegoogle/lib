package com.p7700g.p99005;

import com.p7700g.p99005.t43;
import com.p7700g.p99005.v43;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public class g23<T> extends t43<byte[]> {
    @NotNull
    public static final a J = new a(null);
    @NotNull
    private static final String K = "utf-8";
    @NotNull
    private static final String L;
    private static final float M = 1.2f;
    private static final int N = 30000;
    private static final int O = 0;
    @Nullable
    private final v43.b<byte[]> P;
    @NotNull
    private t43.d Q;
    @Nullable
    private qa3<T> R;
    @NotNull
    private final h93 S;
    @Nullable
    private p43 T;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @r2(otherwise = 4)
        public static /* synthetic */ void b() {
        }

        @NotNull
        public final String a() {
            return g23.L;
        }
    }

    static {
        j35 j35Var = j35.a;
        String format = String.format("application/json; charset=%s", Arrays.copyOf(new Object[]{"utf-8"}, 1));
        c25.o(format, "java.lang.String.format(format, *args)");
        L = format;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g23(int i, @NotNull String str, @Nullable v43.b<byte[]> bVar, @NotNull v43.a aVar) {
        super(i, str, aVar);
        c25.p(str, "url");
        c25.p(aVar, "errorListener");
        this.P = bVar;
        this.Q = t43.d.NORMAL;
        this.S = new h93();
        O(new j43(30000, 0, M));
        Q(false);
    }

    @Override // com.p7700g.p99005.t43
    @NotNull
    public v43<byte[]> K(@NotNull p43 p43Var) {
        c25.p(p43Var, "response");
        this.T = p43Var;
        v43<byte[]> c = v43.c(p43Var.b, k53.c(p43Var));
        c25.o(c, "success(response.data, HttpHeaderParser.parseCacheHeaders(response))");
        return c;
    }

    @Override // com.p7700g.p99005.t43
    /* renamed from: W */
    public void f(@NotNull byte[] bArr) {
        c25.p(bArr, "response");
        v43.b<byte[]> bVar = this.P;
        if (bVar == null) {
            return;
        }
        bVar.onResponse(bArr);
    }

    @Override // com.p7700g.p99005.t43
    @NotNull
    /* renamed from: X */
    public HashMap<String, String> o() {
        return this.S.a();
    }

    public final void X0(@NotNull t43.d dVar) {
        c25.p(dVar, "priority");
        this.Q = dVar;
    }

    @Nullable
    public final p43 Y() {
        return this.T;
    }

    @NotNull
    public final h93 Z() {
        return this.S;
    }

    @Override // com.p7700g.p99005.t43
    @Nullable
    public byte[] j() {
        qa3<T> qa3Var = this.R;
        if (qa3Var == null) {
            return null;
        }
        c25.m(qa3Var);
        return qa3Var.a();
    }

    @Override // com.p7700g.p99005.t43
    @NotNull
    public String k() {
        if (p() == 1) {
            return L;
        }
        String k = super.k();
        c25.o(k, "super.getBodyContentType()");
        return k;
    }

    @Override // com.p7700g.p99005.t43
    @xn4(message = "Use {@link #getBody()}.", replaceWith = @op4(expression = "body", imports = {}))
    @Nullable
    public byte[] s() {
        return j();
    }

    @Override // com.p7700g.p99005.t43
    @xn4(message = "Use {@link #getBodyContentType()}.", replaceWith = @op4(expression = "bodyContentType", imports = {}))
    @NotNull
    public String t() {
        return k();
    }

    @Override // com.p7700g.p99005.t43
    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(F() ? "[X] " : "[ ] ");
        sb.append((Object) D());
        sb.append(gl4.R);
        sb.append(w());
        sb.append(gl4.R);
        byte[] j = j();
        if (j == null) {
            j = new byte[0];
        }
        sb.append(new String(j, f85.b));
        return sb.toString();
    }

    @Override // com.p7700g.p99005.t43
    @NotNull
    public t43.d w() {
        return this.Q;
    }

    public final void w0(@Nullable p43 p43Var) {
        this.T = p43Var;
    }

    public final void x0(@Nullable qa3<T> qa3Var) {
        this.R = qa3Var;
    }
}