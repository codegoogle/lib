package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.anythink.core.api.ATAdConst;
import com.p7700g.p99005.br5;
import com.p7700g.p99005.ir5;
import com.p7700g.p99005.yq5;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MultipartBody.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 62\u00020\u0001:\u0003\u001a\u000f7B'\b\u0000\u0012\u0006\u0010.\u001a\u00020+\u0012\u0006\u0010$\u001a\u00020\u000e\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0004\b4\u00105J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0013\u0010 \u001a\u00020\u00128G@\u0006¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0014R\u0019\u0010$\u001a\u00020\u000e8\u0007@\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010R\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00178\u0007@\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0019R\u0016\u0010*\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010\"R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0013\u00100\u001a\u00020\t8G@\u0006¢\u0006\u0006\u001a\u0004\b/\u0010\u0016R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00068"}, d2 = {"Lcom/p7700g/p99005/cr5;", "Lcom/p7700g/p99005/ir5;", "Lcom/p7700g/p99005/tv5;", "sink", "", "countBytes", "", AFHydra.EV_BYTECOUNT, "(Lcom/p7700g/p99005/tv5;Z)J", "", la1.l, "Lcom/p7700g/p99005/cr5$c;", "x", "(I)Lcom/p7700g/p99005/cr5$c;", "Lcom/p7700g/p99005/br5;", "b", "()Lcom/p7700g/p99005/br5;", com.ironsource.sdk.controller.v.a, "", "s", "()Ljava/lang/String;", "u", "()I", "", "t", "()Ljava/util/List;", "a", "()J", "Lcom/p7700g/p99005/yq4;", "r", "(Lcom/p7700g/p99005/tv5;)V", "w", "boundary", "n", "Lcom/p7700g/p99005/br5;", bx.B4, "type", ij3.b, "Ljava/util/List;", "y", "parts", "k", "contentType", "Lcom/p7700g/p99005/vv5;", com.anythink.expressad.d.a.b.dH, "Lcom/p7700g/p99005/vv5;", "boundaryByteString", "z", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "l", "J", "contentLength", "<init>", "(Lcom/p7700g/p99005/vv5;Lcom/p7700g/p99005/br5;Ljava/util/List;)V", "j", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class cr5 extends ir5 {
    @cz4
    @NotNull
    public static final br5 b;
    @cz4
    @NotNull
    public static final br5 c;
    @cz4
    @NotNull
    public static final br5 d;
    @cz4
    @NotNull
    public static final br5 e;
    @cz4
    @NotNull
    public static final br5 f;
    private static final byte[] g;
    private static final byte[] h;
    private static final byte[] i;
    public static final b j = new b(null);
    private final br5 k;
    private long l;
    private final vv5 m;
    @NotNull
    private final br5 n;
    @NotNull
    private final List<c> o;

    /* compiled from: MultipartBody.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0007\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0016\u0010\u0013\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0016\u0010\u0014\u001a\u00020\t8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000b¨\u0006\u0017"}, d2 = {"com/p7700g/p99005/cr5$b", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "Lcom/p7700g/p99005/yq4;", "a", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "Lcom/p7700g/p99005/br5;", "ALTERNATIVE", "Lcom/p7700g/p99005/br5;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", zm4.c, zm4.d, "MIXED", "PARALLEL", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public final void a(@NotNull StringBuilder sb, @NotNull String str) {
            c25.p(sb, "$this$appendQuotedString");
            c25.p(str, "key");
            sb.append(h95.b);
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt == '\n') {
                    sb.append("%0A");
                } else if (charAt == '\r') {
                    sb.append("%0D");
                } else if (charAt != '\"') {
                    sb.append(charAt);
                } else {
                    sb.append("%22");
                }
            }
            sb.append(h95.b);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: MultipartBody.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u001b\b\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\n\u001a\u00020\u00058\u0007@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\u0007R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\u0004¨\u0006\u0010"}, d2 = {"com/p7700g/p99005/cr5$c", "", "Lcom/p7700g/p99005/yq5;", "b", "()Lcom/p7700g/p99005/yq5;", "Lcom/p7700g/p99005/ir5;", "a", "()Lcom/p7700g/p99005/ir5;", "c", "Lcom/p7700g/p99005/ir5;", "body", "Lcom/p7700g/p99005/yq5;", "h", "headers", "<init>", "(Lcom/p7700g/p99005/yq5;Lcom/p7700g/p99005/ir5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class c {
        public static final a a = new a(null);
        @Nullable
        private final yq5 b;
        @NotNull
        private final ir5 c;

        /* compiled from: MultipartBody.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"com/p7700g/p99005/cr5$c$a", "", "Lcom/p7700g/p99005/ir5;", "body", "Lcom/p7700g/p99005/cr5$c;", "b", "(Lcom/p7700g/p99005/ir5;)Lcom/p7700g/p99005/cr5$c;", "Lcom/p7700g/p99005/yq5;", "headers", "a", "(Lcom/p7700g/p99005/yq5;Lcom/p7700g/p99005/ir5;)Lcom/p7700g/p99005/cr5$c;", "", "name", "value", "c", "(Ljava/lang/String;Ljava/lang/String;)Lcom/p7700g/p99005/cr5$c;", "filename", "d", "(Ljava/lang/String;Ljava/lang/String;Lcom/p7700g/p99005/ir5;)Lcom/p7700g/p99005/cr5$c;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            @jz4
            @NotNull
            public final c a(@Nullable yq5 yq5Var, @NotNull ir5 ir5Var) {
                c25.p(ir5Var, "body");
                if ((yq5Var != null ? yq5Var.c("Content-Type") : null) == null) {
                    if ((yq5Var != null ? yq5Var.c(sm4.i) : null) == null) {
                        return new c(yq5Var, ir5Var, null);
                    }
                    throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
                }
                throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
            }

            @jz4
            @NotNull
            public final c b(@NotNull ir5 ir5Var) {
                c25.p(ir5Var, "body");
                return a(null, ir5Var);
            }

            @jz4
            @NotNull
            public final c c(@NotNull String str, @NotNull String str2) {
                c25.p(str, "name");
                c25.p(str2, "value");
                return d(str, null, ir5.a.o(ir5.a, str2, null, 1, null));
            }

            @jz4
            @NotNull
            public final c d(@NotNull String str, @Nullable String str2, @NotNull ir5 ir5Var) {
                c25.p(str, "name");
                c25.p(ir5Var, "body");
                StringBuilder sb = new StringBuilder();
                sb.append("form-data; name=");
                b bVar = cr5.j;
                bVar.a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    bVar.a(sb, str2);
                }
                String sb2 = sb.toString();
                c25.o(sb2, "StringBuilder().apply(builderAction).toString()");
                return a(new yq5.a().h("Content-Disposition", sb2).i(), ir5Var);
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private c(yq5 yq5Var, ir5 ir5Var) {
            this.b = yq5Var;
            this.c = ir5Var;
        }

        @jz4
        @NotNull
        public static final c d(@Nullable yq5 yq5Var, @NotNull ir5 ir5Var) {
            return a.a(yq5Var, ir5Var);
        }

        @jz4
        @NotNull
        public static final c e(@NotNull ir5 ir5Var) {
            return a.b(ir5Var);
        }

        @jz4
        @NotNull
        public static final c f(@NotNull String str, @NotNull String str2) {
            return a.c(str, str2);
        }

        @jz4
        @NotNull
        public static final c g(@NotNull String str, @Nullable String str2, @NotNull ir5 ir5Var) {
            return a.d(str, str2, ir5Var);
        }

        @fz4(name = "-deprecated_body")
        @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "body", imports = {}))
        @NotNull
        public final ir5 a() {
            return this.c;
        }

        @fz4(name = "-deprecated_headers")
        @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "headers", imports = {}))
        @Nullable
        public final yq5 b() {
            return this.b;
        }

        @fz4(name = "body")
        @NotNull
        public final ir5 c() {
            return this.c;
        }

        @fz4(name = "headers")
        @Nullable
        public final yq5 h() {
            return this.b;
        }

        public /* synthetic */ c(yq5 yq5Var, ir5 ir5Var, DefaultConstructorMarker defaultConstructorMarker) {
            this(yq5Var, ir5Var);
        }
    }

    static {
        br5.a aVar = br5.e;
        b = aVar.c("multipart/mixed");
        c = aVar.c("multipart/alternative");
        d = aVar.c("multipart/digest");
        e = aVar.c("multipart/parallel");
        f = aVar.c("multipart/form-data");
        g = new byte[]{(byte) 58, (byte) 32};
        h = new byte[]{(byte) 13, (byte) 10};
        byte b2 = (byte) 45;
        i = new byte[]{b2, b2};
    }

    public cr5(@NotNull vv5 vv5Var, @NotNull br5 br5Var, @NotNull List<c> list) {
        c25.p(vv5Var, "boundaryByteString");
        c25.p(br5Var, "type");
        c25.p(list, "parts");
        this.m = vv5Var;
        this.n = br5Var;
        this.o = list;
        br5.a aVar = br5.e;
        this.k = aVar.c(br5Var + "; boundary=" + w());
        this.l = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long B(tv5 tv5Var, boolean z) throws IOException {
        sv5 sv5Var;
        if (z) {
            tv5Var = new sv5();
            sv5Var = tv5Var;
        } else {
            sv5Var = 0;
        }
        int size = this.o.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = this.o.get(i2);
            yq5 h2 = cVar.h();
            ir5 c2 = cVar.c();
            c25.m(tv5Var);
            tv5Var.w1(i);
            tv5Var.y1(this.m);
            tv5Var.w1(h);
            if (h2 != null) {
                int size2 = h2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    tv5Var.K0(h2.h(i3)).w1(g).K0(h2.t(i3)).w1(h);
                }
            }
            br5 b2 = c2.b();
            if (b2 != null) {
                tv5Var.K0("Content-Type: ").K0(b2.toString()).w1(h);
            }
            long a2 = c2.a();
            if (a2 != -1) {
                tv5Var.K0("Content-Length: ").Q1(a2).w1(h);
            } else if (z) {
                c25.m(sv5Var);
                sv5Var.d();
                return -1L;
            }
            byte[] bArr = h;
            tv5Var.w1(bArr);
            if (z) {
                j2 += a2;
            } else {
                c2.r(tv5Var);
            }
            tv5Var.w1(bArr);
        }
        c25.m(tv5Var);
        byte[] bArr2 = i;
        tv5Var.w1(bArr2);
        tv5Var.y1(this.m);
        tv5Var.w1(bArr2);
        tv5Var.w1(h);
        if (z) {
            c25.m(sv5Var);
            long z2 = j2 + sv5Var.z2();
            sv5Var.d();
            return z2;
        }
        return j2;
    }

    @fz4(name = "type")
    @NotNull
    public final br5 A() {
        return this.n;
    }

    @Override // com.p7700g.p99005.ir5
    public long a() throws IOException {
        long j2 = this.l;
        if (j2 == -1) {
            long B = B(null, true);
            this.l = B;
            return B;
        }
        return j2;
    }

    @Override // com.p7700g.p99005.ir5
    @NotNull
    public br5 b() {
        return this.k;
    }

    @Override // com.p7700g.p99005.ir5
    public void r(@NotNull tv5 tv5Var) throws IOException {
        c25.p(tv5Var, "sink");
        B(tv5Var, false);
    }

    @fz4(name = "-deprecated_boundary")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "boundary", imports = {}))
    @NotNull
    public final String s() {
        return w();
    }

    @fz4(name = "-deprecated_parts")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "parts", imports = {}))
    @NotNull
    public final List<c> t() {
        return this.o;
    }

    @fz4(name = "-deprecated_size")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, imports = {}))
    public final int u() {
        return z();
    }

    @fz4(name = "-deprecated_type")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "type", imports = {}))
    @NotNull
    public final br5 v() {
        return this.n;
    }

    @fz4(name = "boundary")
    @NotNull
    public final String w() {
        return this.m.p4();
    }

    @NotNull
    public final c x(int i2) {
        return this.o.get(i2);
    }

    @fz4(name = "parts")
    @NotNull
    public final List<c> y() {
        return this.o;
    }

    @fz4(name = ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)
    public final int z() {
        return this.o.size();
    }

    /* compiled from: MultipartBody.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010$\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001fR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010!R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010#¨\u0006'"}, d2 = {"com/p7700g/p99005/cr5$a", "", "Lcom/p7700g/p99005/br5;", "type", "Lcom/p7700g/p99005/cr5$a;", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/br5;)Lcom/p7700g/p99005/cr5$a;", "Lcom/p7700g/p99005/ir5;", "body", "e", "(Lcom/p7700g/p99005/ir5;)Lcom/p7700g/p99005/cr5$a;", "Lcom/p7700g/p99005/yq5;", "headers", "c", "(Lcom/p7700g/p99005/yq5;Lcom/p7700g/p99005/ir5;)Lcom/p7700g/p99005/cr5$a;", "", "name", "value", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/p7700g/p99005/cr5$a;", "filename", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/p7700g/p99005/ir5;)Lcom/p7700g/p99005/cr5$a;", "Lcom/p7700g/p99005/cr5$c;", "part", "d", "(Lcom/p7700g/p99005/cr5$c;)Lcom/p7700g/p99005/cr5$a;", "Lcom/p7700g/p99005/cr5;", "f", "()Lcom/p7700g/p99005/cr5;", "", "Ljava/util/List;", "parts", "Lcom/p7700g/p99005/br5;", "Lcom/p7700g/p99005/vv5;", "Lcom/p7700g/p99005/vv5;", "boundary", "<init>", "(Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private final vv5 a;
        private br5 b;
        private final List<c> c;

        @gz4
        public a() {
            this(null, 1, null);
        }

        @gz4
        public a(@NotNull String str) {
            c25.p(str, "boundary");
            this.a = vv5.u.l(str);
            this.b = cr5.b;
            this.c = new ArrayList();
        }

        @NotNull
        public final a a(@NotNull String str, @NotNull String str2) {
            c25.p(str, "name");
            c25.p(str2, "value");
            d(c.a.c(str, str2));
            return this;
        }

        @NotNull
        public final a b(@NotNull String str, @Nullable String str2, @NotNull ir5 ir5Var) {
            c25.p(str, "name");
            c25.p(ir5Var, "body");
            d(c.a.d(str, str2, ir5Var));
            return this;
        }

        @NotNull
        public final a c(@Nullable yq5 yq5Var, @NotNull ir5 ir5Var) {
            c25.p(ir5Var, "body");
            d(c.a.a(yq5Var, ir5Var));
            return this;
        }

        @NotNull
        public final a d(@NotNull c cVar) {
            c25.p(cVar, "part");
            this.c.add(cVar);
            return this;
        }

        @NotNull
        public final a e(@NotNull ir5 ir5Var) {
            c25.p(ir5Var, "body");
            d(c.a.b(ir5Var));
            return this;
        }

        @NotNull
        public final cr5 f() {
            if (!this.c.isEmpty()) {
                return new cr5(this.a, this.b, sr5.c0(this.c));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        @NotNull
        public final a g(@NotNull br5 br5Var) {
            c25.p(br5Var, "type");
            if (c25.g(br5Var.l(), "multipart")) {
                this.b = br5Var;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + br5Var).toString());
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
            if ((i & 1) != 0) {
                str = UUID.randomUUID().toString();
                c25.o(str, "UUID.randomUUID().toString()");
            }
        }
    }
}