package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.au5;
import com.p7700g.p99005.hr5;
import com.p7700g.p99005.jr5;
import com.p7700g.p99005.qm3;
import com.p7700g.p99005.rs2;
import com.p7700g.p99005.vv5;
import com.p7700g.p99005.xu0;
import com.p7700g.p99005.yq5;
import com.p7700g.p99005.yr5;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Cache.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0004+\u0007S\u001aB!\b\u0000\u0012\u0006\u00106\u001a\u00020*\u0012\u0006\u0010M\u001a\u00020$\u0012\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010QB\u0019\b\u0016\u0012\u0006\u00106\u001a\u00020*\u0012\u0006\u0010M\u001a\u00020$¢\u0006\u0004\bP\u0010RJ\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0006¢\u0006\u0004\b\u001b\u0010\u0019J\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010!\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020 ¢\u0006\u0004\b#\u0010\"J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020$¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010\u0019J\u000f\u0010)\u001a\u00020\u0006H\u0016¢\u0006\u0004\b)\u0010\u0019J\u000f\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00062\u0006\u0010.\u001a\u00020-H\u0000¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0006H\u0000¢\u0006\u0004\b1\u0010\u0019J\r\u00102\u001a\u00020 ¢\u0006\u0004\b2\u0010\"J\r\u00103\u001a\u00020 ¢\u0006\u0004\b3\u0010\"J\r\u00104\u001a\u00020 ¢\u0006\u0004\b4\u0010\"R\u0013\u00106\u001a\u00020*8G@\u0006¢\u0006\u0006\u001a\u0004\b5\u0010,R\"\u0010;\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u00107\u001a\u0004\b8\u0010\"\"\u0004\b9\u0010:R\"\u0010?\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b<\u00107\u001a\u0004\b=\u0010\"\"\u0004\b>\u0010:R\u0016\u0010@\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00107R\u0016\u0010B\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u00107R\u0016\u0010D\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00107R\u001c\u0010I\u001a\u00020\u00048\u0000@\u0000X\u0080\u0004¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u0013\u0010K\u001a\u00020J8F@\u0006¢\u0006\u0006\u001a\u0004\bK\u0010L¨\u0006T"}, d2 = {"Lcom/p7700g/p99005/fq5;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lcom/p7700g/p99005/yr5$b;", "Lcom/p7700g/p99005/yr5;", "editor", "Lcom/p7700g/p99005/yq4;", "b", "(Lcom/p7700g/p99005/yr5$b;)V", "Lcom/p7700g/p99005/hr5;", "request", "Lcom/p7700g/p99005/jr5;", "h", "(Lcom/p7700g/p99005/hr5;)Lcom/p7700g/p99005/jr5;", "response", "Lcom/p7700g/p99005/wr5;", "w", "(Lcom/p7700g/p99005/jr5;)Lcom/p7700g/p99005/wr5;", "z", "(Lcom/p7700g/p99005/hr5;)V", "cached", "network", bx.y4, "(Lcom/p7700g/p99005/jr5;Lcom/p7700g/p99005/jr5;)V", "q", "()V", "d", "f", "", "", "X", "()Ljava/util/Iterator;", "", "Y", "()I", "Z", "", "K", "()J", "s", "flush", com.anythink.expressad.foundation.d.c.cd, "Ljava/io/File;", "a", "()Ljava/io/File;", "Lcom/p7700g/p99005/xr5;", "cacheStrategy", "U", "(Lcom/p7700g/p99005/xr5;)V", "P", com.ironsource.sdk.controller.v.a, com.anythink.expressad.d.a.b.dH, bx.B4, "e", "directory", AFHydra.STATUS_IDLE, "k", "E", "(I)V", "writeAbortCount", "y", "l", "F", "writeSuccessCount", "networkCount", AFHydra.EV_BYTECOUNT, "hitCount", "C", "requestCount", "x", "Lcom/p7700g/p99005/yr5;", "j", "()Lcom/p7700g/p99005/yr5;", com.anythink.expressad.foundation.g.a.a.a, "", "isClosed", "()Z", "maxSize", "Lcom/p7700g/p99005/st5;", "fileSystem", "<init>", "(Ljava/io/File;JLcom/p7700g/p99005/st5;)V", "(Ljava/io/File;J)V", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class fq5 implements Closeable, Flushable {
    private static final int s = 201105;
    private static final int t = 0;
    private static final int u = 1;
    private static final int v = 2;
    public static final b w = new b(null);
    private int A;
    private int B;
    private int C;
    @NotNull
    private final yr5 x;
    private int y;
    private int z;

    /* compiled from: Cache.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0018\u001a\u00060\u0012R\u00020\u0013\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0018\u001a\u00060\u0012R\u00020\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\r¨\u0006\u001d"}, d2 = {"com/p7700g/p99005/fq5$a", "Lcom/p7700g/p99005/kr5;", "Lcom/p7700g/p99005/br5;", "k", "()Lcom/p7700g/p99005/br5;", "", "j", "()J", "Lcom/p7700g/p99005/uv5;", bx.B4, "()Lcom/p7700g/p99005/uv5;", "", "w", "Ljava/lang/String;", "contentType", "u", "Lcom/p7700g/p99005/uv5;", "bodySource", "Lcom/p7700g/p99005/yr5$d;", "Lcom/p7700g/p99005/yr5;", com.ironsource.sdk.controller.v.a, "Lcom/p7700g/p99005/yr5$d;", "F", "()Lcom/p7700g/p99005/yr5$d;", "snapshot", "x", "contentLength", "<init>", "(Lcom/p7700g/p99005/yr5$d;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a extends kr5 {
        private final uv5 u;
        @NotNull
        private final yr5.d v;
        private final String w;
        private final String x;

        /* compiled from: Cache.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p7700g/p99005/fq5$a$a", "Lcom/p7700g/p99005/bw5;", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.p7700g.p99005.fq5$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0174a extends bw5 {
            public final /* synthetic */ xw5 u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0174a(xw5 xw5Var, xw5 xw5Var2) {
                super(xw5Var2);
                this.u = xw5Var;
            }

            @Override // com.p7700g.p99005.bw5, com.p7700g.p99005.xw5, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                a.this.F().close();
                super.close();
            }
        }

        public a(@NotNull yr5.d dVar, @Nullable String str, @Nullable String str2) {
            c25.p(dVar, "snapshot");
            this.v = dVar;
            this.w = str;
            this.x = str2;
            xw5 d = dVar.d(1);
            this.u = jw5.d(new C0174a(d, d));
        }

        @Override // com.p7700g.p99005.kr5
        @NotNull
        public uv5 A() {
            return this.u;
        }

        @NotNull
        public final yr5.d F() {
            return this.v;
        }

        @Override // com.p7700g.p99005.kr5
        public long j() {
            String str = this.x;
            if (str != null) {
                return sr5.e0(str, -1L);
            }
            return -1L;
        }

        @Override // com.p7700g.p99005.kr5
        @Nullable
        public br5 k() {
            String str = this.w;
            if (str != null) {
                return br5.e.d(str);
            }
            return null;
        }
    }

    /* compiled from: Cache.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&J\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u00020\u0019*\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0011\u0010\u001e\u001a\u00020\u0002*\u00020\u0014¢\u0006\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010#\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010!R\u0016\u0010$\u001a\u00020\u00118\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010!¨\u0006'"}, d2 = {"com/p7700g/p99005/fq5$b", "", "Lcom/p7700g/p99005/yq5;", "", "", "d", "(Lcom/p7700g/p99005/yq5;)Ljava/util/Set;", "requestHeaders", "responseHeaders", "e", "(Lcom/p7700g/p99005/yq5;Lcom/p7700g/p99005/yq5;)Lcom/p7700g/p99005/yq5;", "Lcom/p7700g/p99005/zq5;", "url", "b", "(Lcom/p7700g/p99005/zq5;)Ljava/lang/String;", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "", "c", "(Lcom/p7700g/p99005/uv5;)I", "Lcom/p7700g/p99005/jr5;", "cachedResponse", "cachedRequest", "Lcom/p7700g/p99005/hr5;", "newRequest", "", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/jr5;Lcom/p7700g/p99005/yq5;Lcom/p7700g/p99005/hr5;)Z", "a", "(Lcom/p7700g/p99005/jr5;)Z", "f", "(Lcom/p7700g/p99005/jr5;)Lcom/p7700g/p99005/yq5;", "ENTRY_BODY", AFHydra.STATUS_IDLE, "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        private final Set<String> d(yq5 yq5Var) {
            int size = yq5Var.size();
            TreeSet treeSet = null;
            for (int i = 0; i < size; i++) {
                if (b95.K1(sm4.w, yq5Var.h(i), true)) {
                    String t = yq5Var.t(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(b95.S1(j35.a));
                    }
                    for (String str : c95.S4(t, new char[]{e14.f0}, false, 0, 6, null)) {
                        Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                        treeSet.add(c95.E5(str).toString());
                    }
                }
            }
            return treeSet != null ? treeSet : yt4.k();
        }

        private final yq5 e(yq5 yq5Var, yq5 yq5Var2) {
            Set<String> d = d(yq5Var2);
            if (d.isEmpty()) {
                return sr5.b;
            }
            yq5.a aVar = new yq5.a();
            int size = yq5Var.size();
            for (int i = 0; i < size; i++) {
                String h = yq5Var.h(i);
                if (d.contains(h)) {
                    aVar.b(h, yq5Var.t(i));
                }
            }
            return aVar.i();
        }

        public final boolean a(@NotNull jr5 jr5Var) {
            c25.p(jr5Var, "$this$hasVaryAll");
            return d(jr5Var.Y()).contains(tm4.g);
        }

        @jz4
        @NotNull
        public final String b(@NotNull zq5 zq5Var) {
            c25.p(zq5Var, "url");
            return vv5.u.l(zq5Var.toString()).c1().H();
        }

        public final int c(@NotNull uv5 uv5Var) throws IOException {
            c25.p(uv5Var, rs2.f.b);
            try {
                long q0 = uv5Var.q0();
                String m1 = uv5Var.m1();
                if (q0 >= 0 && q0 <= Integer.MAX_VALUE) {
                    if (!(m1.length() > 0)) {
                        return (int) q0;
                    }
                }
                throw new IOException("expected an int but was \"" + q0 + m1 + h95.b);
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        @NotNull
        public final yq5 f(@NotNull jr5 jr5Var) {
            c25.p(jr5Var, "$this$varyHeaders");
            jr5 X0 = jr5Var.X0();
            c25.m(X0);
            return e(X0.T1().k(), jr5Var.Y());
        }

        public final boolean g(@NotNull jr5 jr5Var, @NotNull yq5 yq5Var, @NotNull hr5 hr5Var) {
            c25.p(jr5Var, "cachedResponse");
            c25.p(yq5Var, "cachedRequest");
            c25.p(hr5Var, "newRequest");
            Set<String> d = d(jr5Var.Y());
            if ((d instanceof Collection) && d.isEmpty()) {
                return true;
            }
            for (String str : d) {
                if (!c25.g(yq5Var.u(str), hr5Var.j(str))) {
                    return false;
                }
            }
            return true;
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Cache.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0012\u001a\u00060\u000fR\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00060\u000fR\u00020\u00108\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0016\u0010\u0015\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014¨\u0006\u0019"}, d2 = {"com/p7700g/p99005/fq5$d", "Lcom/p7700g/p99005/wr5;", "Lcom/p7700g/p99005/yq4;", "abort", "()V", "Lcom/p7700g/p99005/vw5;", "a", "()Lcom/p7700g/p99005/vw5;", "", "c", "Z", "()Z", "d", "(Z)V", e31.c, "Lcom/p7700g/p99005/yr5$b;", "Lcom/p7700g/p99005/yr5;", "Lcom/p7700g/p99005/yr5$b;", "editor", "b", "Lcom/p7700g/p99005/vw5;", "body", "cacheOut", "<init>", "(Lcom/p7700g/p99005/fq5;Lcom/p7700g/p99005/yr5$b;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public final class d implements wr5 {
        private final vw5 a;
        private final vw5 b;
        private boolean c;
        private final yr5.b d;
        public final /* synthetic */ fq5 e;

        /* compiled from: Cache.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p7700g/p99005/fq5$d$a", "Lcom/p7700g/p99005/aw5;", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class a extends aw5 {
            public a(vw5 vw5Var) {
                super(vw5Var);
            }

            @Override // com.p7700g.p99005.aw5, com.p7700g.p99005.vw5, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (d.this.e) {
                    if (d.this.c()) {
                        return;
                    }
                    d.this.d(true);
                    fq5 fq5Var = d.this.e;
                    fq5Var.F(fq5Var.l() + 1);
                    super.close();
                    d.this.d.b();
                }
            }
        }

        public d(@NotNull fq5 fq5Var, yr5.b bVar) {
            c25.p(bVar, "editor");
            this.e = fq5Var;
            this.d = bVar;
            vw5 f = bVar.f(1);
            this.a = f;
            this.b = new a(f);
        }

        @Override // com.p7700g.p99005.wr5
        @NotNull
        public vw5 a() {
            return this.b;
        }

        @Override // com.p7700g.p99005.wr5
        public void abort() {
            synchronized (this.e) {
                if (this.c) {
                    return;
                }
                this.c = true;
                fq5 fq5Var = this.e;
                fq5Var.E(fq5Var.k() + 1);
                sr5.l(this.a);
                try {
                    this.d.a();
                } catch (IOException unused) {
                }
            }
        }

        public final boolean c() {
            return this.c;
        }

        public final void d(boolean z) {
            this.c = z;
        }
    }

    /* compiled from: Cache.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0015\u001a\f\u0012\b\u0012\u00060\u0011R\u00020\u00120\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"com/p7700g/p99005/fq5$e", "", "", "", "hasNext", "()Z", "a", "()Ljava/lang/String;", "Lcom/p7700g/p99005/yq4;", la1.b, "()V", "t", "Ljava/lang/String;", "nextUrl", "u", "Z", "canRemove", "Lcom/p7700g/p99005/yr5$d;", "Lcom/p7700g/p99005/yr5;", "s", "Ljava/util/Iterator;", "delegate", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class e implements Iterator<String>, q35 {
        private final Iterator<yr5.d> s;
        private String t;
        private boolean u;

        public e() {
            this.s = fq5.this.j().g2();
        }

        @Override // java.util.Iterator
        @NotNull
        /* renamed from: a */
        public String next() {
            if (hasNext()) {
                String str = this.t;
                c25.m(str);
                this.t = null;
                this.u = true;
                return str;
            }
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.t != null) {
                return true;
            }
            this.u = false;
            while (this.s.hasNext()) {
                try {
                    yr5.d next = this.s.next();
                    this.t = jw5.d(next.d(0)).m1();
                    ux4.a(next, null);
                    return true;
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.u) {
                this.s.remove();
                return;
            }
            throw new IllegalStateException("remove() before next()".toString());
        }
    }

    public fq5(@NotNull File file, long j, @NotNull st5 st5Var) {
        c25.p(file, "directory");
        c25.p(st5Var, "fileSystem");
        this.x = new yr5(st5Var, file, s, 2, j, fs5.a);
    }

    private final void b(yr5.b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (IOException unused) {
            }
        }
    }

    @jz4
    @NotNull
    public static final String r(@NotNull zq5 zq5Var) {
        return w.b(zq5Var);
    }

    public final synchronized int A() {
        return this.C;
    }

    public final void E(int i) {
        this.z = i;
    }

    public final void F(int i) {
        this.y = i;
    }

    public final long K() throws IOException {
        return this.x.f2();
    }

    public final synchronized void P() {
        this.B++;
    }

    public final synchronized void U(@NotNull xr5 xr5Var) {
        c25.p(xr5Var, "cacheStrategy");
        this.C++;
        if (xr5Var.b() != null) {
            this.A++;
        } else if (xr5Var.a() != null) {
            this.B++;
        }
    }

    public final void W(@NotNull jr5 jr5Var, @NotNull jr5 jr5Var2) {
        c25.p(jr5Var, "cached");
        c25.p(jr5Var2, "network");
        c cVar = new c(jr5Var2);
        kr5 v2 = jr5Var.v();
        Objects.requireNonNull(v2, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        yr5.b bVar = null;
        try {
            bVar = ((a) v2).F().a();
            if (bVar != null) {
                cVar.f(bVar);
                bVar.b();
            }
        } catch (IOException unused) {
            b(bVar);
        }
    }

    @NotNull
    public final Iterator<String> X() throws IOException {
        return new e();
    }

    public final synchronized int Y() {
        return this.z;
    }

    public final synchronized int Z() {
        return this.y;
    }

    @fz4(name = "-deprecated_directory")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "directory", imports = {}))
    @NotNull
    public final File a() {
        return this.x.Y();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.x.close();
    }

    public final void d() throws IOException {
        this.x.E();
    }

    @fz4(name = "directory")
    @NotNull
    public final File e() {
        return this.x.Y();
    }

    public final void f() throws IOException {
        this.x.U();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.x.flush();
    }

    @Nullable
    public final jr5 h(@NotNull hr5 hr5Var) {
        c25.p(hr5Var, "request");
        try {
            yr5.d W = this.x.W(w.b(hr5Var.q()));
            if (W != null) {
                try {
                    c cVar = new c(W.d(0));
                    jr5 d2 = cVar.d(W);
                    if (cVar.b(hr5Var, d2)) {
                        return d2;
                    }
                    kr5 v2 = d2.v();
                    if (v2 != null) {
                        sr5.l(v2);
                    }
                    return null;
                } catch (IOException unused) {
                    sr5.l(W);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    public final boolean isClosed() {
        return this.x.isClosed();
    }

    @NotNull
    public final yr5 j() {
        return this.x;
    }

    public final int k() {
        return this.z;
    }

    public final int l() {
        return this.y;
    }

    public final synchronized int m() {
        return this.B;
    }

    public final void q() throws IOException {
        this.x.d1();
    }

    public final long s() {
        return this.x.X0();
    }

    public final synchronized int v() {
        return this.A;
    }

    @Nullable
    public final wr5 w(@NotNull jr5 jr5Var) {
        yr5.b bVar;
        c25.p(jr5Var, "response");
        String m = jr5Var.T1().m();
        if (ws5.a.a(jr5Var.T1().m())) {
            try {
                z(jr5Var.T1());
            } catch (IOException unused) {
            }
            return null;
        } else if (!c25.g(m, "GET")) {
            return null;
        } else {
            b bVar2 = w;
            if (bVar2.a(jr5Var)) {
                return null;
            }
            c cVar = new c(jr5Var);
            try {
                bVar = yr5.P(this.x, bVar2.b(jr5Var.T1().q()), 0L, 2, null);
                if (bVar != null) {
                    try {
                        cVar.f(bVar);
                        return new d(this, bVar);
                    } catch (IOException unused2) {
                        b(bVar);
                        return null;
                    }
                }
                return null;
            } catch (IOException unused3) {
                bVar = null;
            }
        }
    }

    public final void z(@NotNull hr5 hr5Var) throws IOException {
        c25.p(hr5Var, "request");
        this.x.a2(w.b(hr5Var.q()));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public fq5(@NotNull File file, long j) {
        this(file, j, st5.a);
        c25.p(file, "directory");
    }

    /* compiled from: Cache.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0088\u0001\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00062\u00020\u0001:\u00013B\u0011\b\u0016\u0012\u0006\u0010?\u001a\u00020>¢\u0006\u0004\b@\u0010AB\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b@\u0010BJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u000b2\n\u0010\u0010\u001a\u00060\u000eR\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00152\n\u0010\u001b\u001a\u00060\u001aR\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010 \u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001fR\u0016\u0010.\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010&R\u0016\u00100\u001a\u00020\u001e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010\u001fR\u0016\u00102\u001a\u00020(8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010*R\u0016\u00105\u001a\u00020\u00178B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006C"}, d2 = {"com/p7700g/p99005/fq5$c", "", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "", "Ljava/security/cert/Certificate;", "c", "(Lcom/p7700g/p99005/uv5;)Ljava/util/List;", "Lcom/p7700g/p99005/tv5;", "sink", "certificates", "Lcom/p7700g/p99005/yq4;", "e", "(Lcom/p7700g/p99005/tv5;Ljava/util/List;)V", "Lcom/p7700g/p99005/yr5$b;", "Lcom/p7700g/p99005/yr5;", "editor", "f", "(Lcom/p7700g/p99005/yr5$b;)V", "Lcom/p7700g/p99005/hr5;", "request", "Lcom/p7700g/p99005/jr5;", "response", "", "b", "(Lcom/p7700g/p99005/hr5;Lcom/p7700g/p99005/jr5;)Z", "Lcom/p7700g/p99005/yr5$d;", "snapshot", "d", "(Lcom/p7700g/p99005/yr5$d;)Lcom/p7700g/p99005/jr5;", "", "Ljava/lang/String;", "url", "", "h", AFHydra.STATUS_IDLE, "code", "Lcom/p7700g/p99005/yq5;", "Lcom/p7700g/p99005/yq5;", "varyHeaders", "", com.anythink.expressad.d.a.b.dH, "J", "receivedResponseMillis", "requestMethod", "j", "responseHeaders", "i", qm3.b.j, "l", "sentRequestMillis", "a", "()Z", "isHttps", "Lcom/p7700g/p99005/gr5;", com.anythink.basead.d.g.i, "Lcom/p7700g/p99005/gr5;", xu0.f.m, "Lcom/p7700g/p99005/xq5;", "k", "Lcom/p7700g/p99005/xq5;", "handshake", "Lcom/p7700g/p99005/xw5;", "rawSource", "<init>", "(Lcom/p7700g/p99005/xw5;)V", "(Lcom/p7700g/p99005/jr5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class c {
        private static final String a;
        private static final String b;
        public static final a c = new a(null);
        private final String d;
        private final yq5 e;
        private final String f;
        private final gr5 g;
        private final int h;
        private final String i;
        private final yq5 j;
        private final xq5 k;
        private final long l;
        private final long m;

        /* compiled from: Cache.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"com/p7700g/p99005/fq5$c$a", "", "", "RECEIVED_MILLIS", "Ljava/lang/String;", "SENT_MILLIS", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            au5.a aVar;
            StringBuilder sb = new StringBuilder();
            sb.append(au5.e.g().i());
            sb.append("-Sent-Millis");
            a = sb.toString();
            b = aVar.g().i() + "-Received-Millis";
        }

        public c(@NotNull xw5 xw5Var) throws IOException {
            mr5 mr5Var;
            c25.p(xw5Var, "rawSource");
            try {
                uv5 d = jw5.d(xw5Var);
                this.d = d.m1();
                this.f = d.m1();
                yq5.a aVar = new yq5.a();
                int c2 = fq5.w.c(d);
                for (int i = 0; i < c2; i++) {
                    aVar.f(d.m1());
                }
                this.e = aVar.i();
                bt5 b2 = bt5.e.b(d.m1());
                this.g = b2.f;
                this.h = b2.g;
                this.i = b2.h;
                yq5.a aVar2 = new yq5.a();
                int c3 = fq5.w.c(d);
                for (int i2 = 0; i2 < c3; i2++) {
                    aVar2.f(d.m1());
                }
                String str = a;
                String j = aVar2.j(str);
                String str2 = b;
                String j2 = aVar2.j(str2);
                aVar2.l(str);
                aVar2.l(str2);
                this.l = j != null ? Long.parseLong(j) : 0L;
                this.m = j2 != null ? Long.parseLong(j2) : 0L;
                this.j = aVar2.i();
                if (a()) {
                    String m1 = d.m1();
                    if (!(m1.length() > 0)) {
                        lq5 b3 = lq5.r1.b(d.m1());
                        List<Certificate> c4 = c(d);
                        List<Certificate> c5 = c(d);
                        if (!d.f0()) {
                            mr5Var = mr5.y.a(d.m1());
                        } else {
                            mr5Var = mr5.SSL_3_0;
                        }
                        this.k = xq5.a.c(mr5Var, b3, c4, c5);
                    } else {
                        throw new IOException("expected \"\" but was \"" + m1 + h95.b);
                    }
                } else {
                    this.k = null;
                }
            } finally {
                xw5Var.close();
            }
        }

        private final boolean a() {
            return b95.u2(this.d, "https://", false, 2, null);
        }

        private final List<Certificate> c(uv5 uv5Var) throws IOException {
            int c2 = fq5.w.c(uv5Var);
            if (c2 == -1) {
                return js4.F();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(c2);
                for (int i = 0; i < c2; i++) {
                    String m1 = uv5Var.m1();
                    sv5 sv5Var = new sv5();
                    vv5 h = vv5.u.h(m1);
                    c25.m(h);
                    sv5Var.y1(h);
                    arrayList.add(certificateFactory.generateCertificate(sv5Var.W1()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void e(tv5 tv5Var, List<? extends Certificate> list) throws IOException {
            try {
                tv5Var.Q1(list.size()).g0(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    byte[] encoded = list.get(i).getEncoded();
                    vv5.a aVar = vv5.u;
                    c25.o(encoded, "bytes");
                    tv5Var.K0(vv5.a.p(aVar, encoded, 0, 0, 3, null).h()).g0(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean b(@NotNull hr5 hr5Var, @NotNull jr5 jr5Var) {
            c25.p(hr5Var, "request");
            c25.p(jr5Var, "response");
            return c25.g(this.d, hr5Var.q().toString()) && c25.g(this.f, hr5Var.m()) && fq5.w.g(jr5Var, this.e, hr5Var);
        }

        @NotNull
        public final jr5 d(@NotNull yr5.d dVar) {
            c25.p(dVar, "snapshot");
            String c2 = this.j.c("Content-Type");
            String c3 = this.j.c(sm4.i);
            return new jr5.a().E(new hr5.a().B(this.d).p(this.f, null).o(this.e).b()).B(this.g).g(this.h).y(this.i).w(this.j).b(new a(dVar, c2, c3)).u(this.k).F(this.l).C(this.m).c();
        }

        public final void f(@NotNull yr5.b bVar) throws IOException {
            c25.p(bVar, "editor");
            tv5 c2 = jw5.c(bVar.f(0));
            try {
                c2.K0(this.d).g0(10);
                c2.K0(this.f).g0(10);
                c2.Q1(this.e.size()).g0(10);
                int size = this.e.size();
                for (int i = 0; i < size; i++) {
                    c2.K0(this.e.h(i)).K0(": ").K0(this.e.t(i)).g0(10);
                }
                c2.K0(new bt5(this.g, this.h, this.i).toString()).g0(10);
                c2.Q1(this.j.size() + 2).g0(10);
                int size2 = this.j.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    c2.K0(this.j.h(i2)).K0(": ").K0(this.j.t(i2)).g0(10);
                }
                c2.K0(a).K0(": ").Q1(this.l).g0(10);
                c2.K0(b).K0(": ").Q1(this.m).g0(10);
                if (a()) {
                    c2.g0(10);
                    xq5 xq5Var = this.k;
                    c25.m(xq5Var);
                    c2.K0(xq5Var.g().e()).g0(10);
                    e(c2, this.k.m());
                    e(c2, this.k.k());
                    c2.K0(this.k.o().h()).g0(10);
                }
                yq4 yq4Var = yq4.a;
                ux4.a(c2, null);
            } finally {
            }
        }

        public c(@NotNull jr5 jr5Var) {
            c25.p(jr5Var, "response");
            this.d = jr5Var.T1().q().toString();
            this.e = fq5.w.f(jr5Var);
            this.f = jr5Var.T1().m();
            this.g = jr5Var.J1();
            this.h = jr5Var.E();
            this.i = jr5Var.x0();
            this.j = jr5Var.Y();
            this.k = jr5Var.K();
            this.l = jr5Var.Y1();
            this.m = jr5Var.K1();
        }
    }
}