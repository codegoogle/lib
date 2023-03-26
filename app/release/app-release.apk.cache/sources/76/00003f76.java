package com.p7700g.p99005;

import com.anythink.expressad.foundation.c.d;
import com.p7700g.p99005.ar5;
import com.p7700g.p99005.qm3;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpLoggingInterceptor.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u0019\u0014B\u0013\b\u0007\u0012\b\b\u0002\u0010!\u001a\u00020\u001e¢\u0006\u0004\b&\u0010'J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R*\u0010\u0011\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00108\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010#\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/p7700g/p99005/dv5;", "Lcom/p7700g/p99005/ar5;", "Lcom/p7700g/p99005/yq5;", "headers", "", "i", "Lcom/p7700g/p99005/yq4;", "f", "(Lcom/p7700g/p99005/yq5;I)V", "", "c", "(Lcom/p7700g/p99005/yq5;)Z", "", "name", com.anythink.basead.d.g.i, "(Ljava/lang/String;)V", "Lcom/p7700g/p99005/dv5$a;", d.a.w, "h", "(Lcom/p7700g/p99005/dv5$a;)Lcom/p7700g/p99005/dv5;", "b", "()Lcom/p7700g/p99005/dv5$a;", "Lcom/p7700g/p99005/ar5$a;", "chain", "Lcom/p7700g/p99005/jr5;", "a", "(Lcom/p7700g/p99005/ar5$a;)Lcom/p7700g/p99005/jr5;", "", "Ljava/util/Set;", "headersToRedact", "Lcom/p7700g/p99005/dv5$b;", "d", "Lcom/p7700g/p99005/dv5$b;", "logger", "<set-?>", "Lcom/p7700g/p99005/dv5$a;", "e", "(Lcom/p7700g/p99005/dv5$a;)V", "<init>", "(Lcom/p7700g/p99005/dv5$b;)V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class dv5 implements ar5 {
    private volatile Set<String> b;
    @NotNull
    private volatile a c;
    private final b d;

    /* compiled from: HttpLoggingInterceptor.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/p7700g/p99005/dv5$a", "", "Lcom/p7700g/p99005/dv5$a;", "<init>", "(Ljava/lang/String;I)V", "NONE", zm4.a, "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public enum a {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* compiled from: HttpLoggingInterceptor.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"com/p7700g/p99005/dv5$b", "", "", qm3.b.j, "Lcom/p7700g/p99005/yq4;", "a", "(Ljava/lang/String;)V", "b", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public interface b {
        public static final a b = new a(null);
        @cz4
        @NotNull
        public static final b a = new a.C0167a();

        /* compiled from: HttpLoggingInterceptor.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"com/p7700g/p99005/dv5$b$a", "", "Lcom/p7700g/p99005/dv5$b;", "DEFAULT", "Lcom/p7700g/p99005/dv5$b;", "<init>", "()V", "a", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class a {
            public static final /* synthetic */ a a = null;

            /* compiled from: HttpLoggingInterceptor.kt */
            @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"com/p7700g/p99005/dv5$b$a$a", "Lcom/p7700g/p99005/dv5$b;", "", qm3.b.j, "Lcom/p7700g/p99005/yq4;", "a", "(Ljava/lang/String;)V", "<init>", "()V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
            /* renamed from: com.p7700g.p99005.dv5$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public static final class C0167a implements b {
                @Override // com.p7700g.p99005.dv5.b
                public void a(@NotNull String str) {
                    c25.p(str, qm3.b.j);
                    au5.n(au5.e.g(), str, 0, null, 6, null);
                }
            }

            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        void a(@NotNull String str);
    }

    @gz4
    public dv5() {
        this(null, 1, null);
    }

    @gz4
    public dv5(@NotNull b bVar) {
        c25.p(bVar, "logger");
        this.d = bVar;
        this.b = yt4.k();
        this.c = a.NONE;
    }

    private final boolean c(yq5 yq5Var) {
        String c = yq5Var.c("Content-Encoding");
        return (c == null || b95.K1(c, "identity", true) || b95.K1(c, "gzip", true)) ? false : true;
    }

    private final void f(yq5 yq5Var, int i) {
        String t = this.b.contains(yq5Var.h(i)) ? "██" : yq5Var.t(i);
        b bVar = this.d;
        bVar.a(yq5Var.h(i) + ": " + t);
    }

    @Override // com.p7700g.p99005.ar5
    @NotNull
    public jr5 a(@NotNull ar5.a aVar) throws IOException {
        String str;
        String str2;
        String sb;
        Charset charset;
        Charset charset2;
        c25.p(aVar, "chain");
        a aVar2 = this.c;
        hr5 x0 = aVar.x0();
        if (aVar2 == a.NONE) {
            return aVar.e(x0);
        }
        boolean z = aVar2 == a.BODY;
        boolean z2 = z || aVar2 == a.HEADERS;
        ir5 f = x0.f();
        mq5 f2 = aVar.f();
        StringBuilder G = wo1.G("--> ");
        G.append(x0.m());
        G.append(gl4.R);
        G.append(x0.q());
        if (f2 != null) {
            StringBuilder G2 = wo1.G(" ");
            G2.append(f2.a());
            str = G2.toString();
        } else {
            str = "";
        }
        G.append(str);
        String sb2 = G.toString();
        if (!z2 && f != 0) {
            StringBuilder L = wo1.L(sb2, " (");
            L.append(f.a());
            L.append("-byte body)");
            sb2 = L.toString();
        }
        this.d.a(sb2);
        if (z2) {
            yq5 k = x0.k();
            if (f != null) {
                br5 b2 = f.b();
                if (b2 != null && k.c("Content-Type") == null) {
                    this.d.a("Content-Type: " + b2);
                }
                if (f.a() != -1 && k.c(sm4.i) == null) {
                    b bVar = this.d;
                    StringBuilder G3 = wo1.G("Content-Length: ");
                    G3.append(f.a());
                    bVar.a(G3.toString());
                }
            }
            int size = k.size();
            for (int i = 0; i < size; i++) {
                f(k, i);
            }
            if (z && f != null) {
                if (c(x0.k())) {
                    b bVar2 = this.d;
                    StringBuilder G4 = wo1.G("--> END ");
                    G4.append(x0.m());
                    G4.append(" (encoded body omitted)");
                    bVar2.a(G4.toString());
                } else if (f.p()) {
                    b bVar3 = this.d;
                    StringBuilder G5 = wo1.G("--> END ");
                    G5.append(x0.m());
                    G5.append(" (duplex request body omitted)");
                    bVar3.a(G5.toString());
                } else if (f.q()) {
                    b bVar4 = this.d;
                    StringBuilder G6 = wo1.G("--> END ");
                    G6.append(x0.m());
                    G6.append(" (one-shot body omitted)");
                    bVar4.a(G6.toString());
                } else {
                    sv5 sv5Var = new sv5();
                    f.r(sv5Var);
                    br5 b3 = f.b();
                    if (b3 == null || (charset2 = b3.f(StandardCharsets.UTF_8)) == null) {
                        charset2 = StandardCharsets.UTF_8;
                        c25.o(charset2, "UTF_8");
                    }
                    this.d.a("");
                    if (fv5.a(sv5Var)) {
                        this.d.a(sv5Var.R0(charset2));
                        b bVar5 = this.d;
                        StringBuilder G7 = wo1.G("--> END ");
                        G7.append(x0.m());
                        G7.append(" (");
                        G7.append(f.a());
                        G7.append("-byte body)");
                        bVar5.a(G7.toString());
                    } else {
                        b bVar6 = this.d;
                        StringBuilder G8 = wo1.G("--> END ");
                        G8.append(x0.m());
                        G8.append(" (binary ");
                        G8.append(f.a());
                        G8.append("-byte body omitted)");
                        bVar6.a(G8.toString());
                    }
                }
            } else {
                b bVar7 = this.d;
                StringBuilder G9 = wo1.G("--> END ");
                G9.append(x0.m());
                bVar7.a(G9.toString());
            }
        }
        long nanoTime = System.nanoTime();
        try {
            jr5 e = aVar.e(x0);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - nanoTime);
            kr5 v = e.v();
            c25.m(v);
            long j = v.j();
            String str3 = j != -1 ? j + "-byte" : "unknown-length";
            b bVar8 = this.d;
            StringBuilder G10 = wo1.G("<-- ");
            G10.append(e.E());
            if (e.x0().length() == 0) {
                str2 = "-byte body omitted)";
                sb = "";
            } else {
                String x02 = e.x0();
                StringBuilder sb3 = new StringBuilder();
                str2 = "-byte body omitted)";
                sb3.append(String.valueOf((char) gl4.R));
                sb3.append(x02);
                sb = sb3.toString();
            }
            G10.append(sb);
            G10.append(gl4.R);
            G10.append(e.T1().q());
            G10.append(" (");
            G10.append(millis);
            G10.append("ms");
            G10.append(!z2 ? wo1.u(", ", str3, " body") : "");
            G10.append(')');
            bVar8.a(G10.toString());
            if (z2) {
                yq5 Y = e.Y();
                int size2 = Y.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    f(Y, i2);
                }
                if (z && vs5.c(e)) {
                    if (c(e.Y())) {
                        this.d.a("<-- END HTTP (encoded body omitted)");
                    } else {
                        uv5 A = v.A();
                        A.i1(Long.MAX_VALUE);
                        sv5 o = A.o();
                        Long l = null;
                        if (b95.K1("gzip", Y.c("Content-Encoding"), true)) {
                            Long valueOf = Long.valueOf(o.z2());
                            ew5 ew5Var = new ew5(o.clone());
                            try {
                                o = new sv5();
                                o.b1(ew5Var);
                                ux4.a(ew5Var, null);
                                l = valueOf;
                            } finally {
                            }
                        }
                        br5 k2 = v.k();
                        if (k2 == null || (charset = k2.f(StandardCharsets.UTF_8)) == null) {
                            charset = StandardCharsets.UTF_8;
                            c25.o(charset, "UTF_8");
                        }
                        if (!fv5.a(o)) {
                            this.d.a("");
                            b bVar9 = this.d;
                            StringBuilder G11 = wo1.G("<-- END HTTP (binary ");
                            G11.append(o.z2());
                            G11.append(str2);
                            bVar9.a(G11.toString());
                            return e;
                        }
                        if (j != 0) {
                            this.d.a("");
                            this.d.a(o.clone().R0(charset));
                        }
                        if (l != null) {
                            b bVar10 = this.d;
                            StringBuilder G12 = wo1.G("<-- END HTTP (");
                            G12.append(o.z2());
                            G12.append("-byte, ");
                            G12.append(l);
                            G12.append("-gzipped-byte body)");
                            bVar10.a(G12.toString());
                        } else {
                            b bVar11 = this.d;
                            StringBuilder G13 = wo1.G("<-- END HTTP (");
                            G13.append(o.z2());
                            G13.append("-byte body)");
                            bVar11.a(G13.toString());
                        }
                    }
                } else {
                    this.d.a("<-- END HTTP");
                }
            }
            return e;
        } catch (Exception e2) {
            this.d.a("<-- HTTP FAILED: " + e2);
            throw e2;
        }
    }

    @fz4(name = "-deprecated_level")
    @xn4(level = zn4.ERROR, message = "moved to var", replaceWith = @op4(expression = d.a.w, imports = {}))
    @NotNull
    public final a b() {
        return this.c;
    }

    @NotNull
    public final a d() {
        return this.c;
    }

    @fz4(name = d.a.w)
    public final void e(@NotNull a aVar) {
        c25.p(aVar, "<set-?>");
        this.c = aVar;
    }

    public final void g(@NotNull String str) {
        c25.p(str, "name");
        TreeSet treeSet = new TreeSet(b95.S1(j35.a));
        os4.o0(treeSet, this.b);
        treeSet.add(str);
        this.b = treeSet;
    }

    @NotNull
    public final dv5 h(@NotNull a aVar) {
        c25.p(aVar, d.a.w);
        this.c = aVar;
        return this;
    }

    public /* synthetic */ dv5(b bVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? b.a : bVar);
    }
}