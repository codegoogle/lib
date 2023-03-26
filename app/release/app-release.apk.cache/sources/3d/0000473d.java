package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.rs2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: Hpack.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\b\u000eB\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\nR%\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u0006R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\nR\u001f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001c¨\u0006 "}, d2 = {"Lcom/p7700g/p99005/ht5;", "", "", "Lcom/p7700g/p99005/vv5;", "", "d", "()Ljava/util/Map;", "name", "a", "(Lcom/p7700g/p99005/vv5;)Lcom/p7700g/p99005/vv5;", AFHydra.STATUS_IDLE, "PREFIX_7_BITS", "e", "SETTINGS_HEADER_TABLE_SIZE", "b", "PREFIX_5_BITS", "h", "Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "c", "PREFIX_6_BITS", "f", "SETTINGS_HEADER_TABLE_SIZE_LIMIT", "PREFIX_4_BITS", "", "Lcom/p7700g/p99005/gt5;", com.anythink.basead.d.g.i, "[Lokhttp3/internal/http2/Header;", "()[Lokhttp3/internal/http2/Header;", "STATIC_HEADER_TABLE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class ht5 {
    private static final int a = 15;
    private static final int b = 31;
    private static final int c = 63;
    private static final int d = 127;
    private static final int e = 4096;
    private static final int f = 16384;
    @NotNull
    private static final gt5[] g;
    @NotNull
    private static final Map<vv5, Integer> h;
    public static final ht5 i;

    static {
        ht5 ht5Var = new ht5();
        i = ht5Var;
        vv5 vv5Var = gt5.h;
        vv5 vv5Var2 = gt5.i;
        vv5 vv5Var3 = gt5.j;
        vv5 vv5Var4 = gt5.g;
        g = new gt5[]{new gt5(gt5.k, ""), new gt5(vv5Var, "GET"), new gt5(vv5Var, "POST"), new gt5(vv5Var2, "/"), new gt5(vv5Var2, "/index.html"), new gt5(vv5Var3, "http"), new gt5(vv5Var3, "https"), new gt5(vv5Var4, "200"), new gt5(vv5Var4, "204"), new gt5(vv5Var4, "206"), new gt5(vv5Var4, "304"), new gt5(vv5Var4, "400"), new gt5(vv5Var4, "404"), new gt5(vv5Var4, "500"), new gt5("accept-charset", ""), new gt5("accept-encoding", "gzip, deflate"), new gt5("accept-language", ""), new gt5("accept-ranges", ""), new gt5("accept", ""), new gt5("access-control-allow-origin", ""), new gt5("age", ""), new gt5("allow", ""), new gt5("authorization", ""), new gt5("cache-control", ""), new gt5("content-disposition", ""), new gt5("content-encoding", ""), new gt5("content-language", ""), new gt5("content-length", ""), new gt5("content-location", ""), new gt5("content-range", ""), new gt5("content-type", ""), new gt5("cookie", ""), new gt5("date", ""), new gt5("etag", ""), new gt5("expect", ""), new gt5("expires", ""), new gt5("from", ""), new gt5("host", ""), new gt5("if-match", ""), new gt5("if-modified-since", ""), new gt5("if-none-match", ""), new gt5("if-range", ""), new gt5("if-unmodified-since", ""), new gt5("last-modified", ""), new gt5("link", ""), new gt5(ik3.b, ""), new gt5("max-forwards", ""), new gt5("proxy-authenticate", ""), new gt5("proxy-authorization", ""), new gt5("range", ""), new gt5("referer", ""), new gt5("refresh", ""), new gt5("retry-after", ""), new gt5("server", ""), new gt5("set-cookie", ""), new gt5("strict-transport-security", ""), new gt5("transfer-encoding", ""), new gt5("user-agent", ""), new gt5("vary", ""), new gt5("via", ""), new gt5("www-authenticate", "")};
        h = ht5Var.d();
    }

    private ht5() {
    }

    private final Map<vv5, Integer> d() {
        gt5[] gt5VarArr = g;
        LinkedHashMap linkedHashMap = new LinkedHashMap(gt5VarArr.length);
        int length = gt5VarArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            gt5[] gt5VarArr2 = g;
            if (!linkedHashMap.containsKey(gt5VarArr2[i2].n)) {
                linkedHashMap.put(gt5VarArr2[i2].n, Integer.valueOf(i2));
            }
        }
        Map<vv5, Integer> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        c25.o(unmodifiableMap, "Collections.unmodifiableMap(result)");
        return unmodifiableMap;
    }

    @NotNull
    public final vv5 a(@NotNull vv5 vv5Var) throws IOException {
        c25.p(vv5Var, "name");
        int C3 = vv5Var.C3();
        for (int i2 = 0; i2 < C3; i2++) {
            byte b2 = (byte) 65;
            byte b3 = (byte) 90;
            byte A = vv5Var.A(i2);
            if (b2 <= A && b3 >= A) {
                StringBuilder G = wo1.G("PROTOCOL_ERROR response malformed: mixed case name: ");
                G.append(vv5Var.p4());
                throw new IOException(G.toString());
            }
        }
        return vv5Var;
    }

    @NotNull
    public final Map<vv5, Integer> b() {
        return h;
    }

    @NotNull
    public final gt5[] c() {
        return g;
    }

    /* compiled from: Hpack.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u00102\u001a\u000209\u0012\u0006\u00103\u001a\u00020\u0006\u0012\b\b\u0002\u00105\u001a\u00020\u0006¢\u0006\u0004\b:\u0010;J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u000f\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0004J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00190\u001f¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b\"\u0010\u001eJ\r\u0010#\u001a\u00020\u0002¢\u0006\u0004\b#\u0010\u0004J\u001d\u0010&\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020\u0013¢\u0006\u0004\b(\u0010)R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00190*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0016\u0010.\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b \u0010-R\u0016\u0010/\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010-R\u0016\u00102\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00101R\u0016\u00103\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u0016\u00104\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010-R\u0016\u00105\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010-R\u001e\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0019068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\r\u00107¨\u0006<"}, d2 = {"com/p7700g/p99005/ht5$a", "", "Lcom/p7700g/p99005/yq4;", "a", "()V", "b", "", "bytesToRecover", "d", "(I)I", la1.l, com.anythink.expressad.d.a.b.dH, "(I)V", "c", "q", "r", "nameIndex", ij3.b, "p", "Lcom/p7700g/p99005/vv5;", "f", "(I)Lcom/p7700g/p99005/vv5;", "", "h", "(I)Z", "Lcom/p7700g/p99005/gt5;", "entry", com.anythink.basead.d.g.i, "(ILcom/p7700g/p99005/gt5;)V", "j", "()I", "", "e", "()Ljava/util/List;", "i", "l", "firstByte", "prefixMask", "n", "(II)I", "k", "()Lcom/p7700g/p99005/vv5;", "", "Ljava/util/List;", "headerList", AFHydra.STATUS_IDLE, "headerCount", "dynamicTableByteCount", "Lcom/p7700g/p99005/uv5;", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "headerTableSizeSetting", "nextHeaderIndex", "maxDynamicTableByteCount", "", "[Lokhttp3/internal/http2/Header;", "dynamicTable", "Lcom/p7700g/p99005/xw5;", "<init>", "(Lcom/p7700g/p99005/xw5;II)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private final List<gt5> a;
        private final uv5 b;
        @cz4
        @NotNull
        public gt5[] c;
        private int d;
        @cz4
        public int e;
        @cz4
        public int f;
        private final int g;
        private int h;

        @gz4
        public a(@NotNull xw5 xw5Var, int i) {
            this(xw5Var, i, 0, 4, null);
        }

        @gz4
        public a(@NotNull xw5 xw5Var, int i, int i2) {
            c25.p(xw5Var, rs2.f.b);
            this.g = i;
            this.h = i2;
            this.a = new ArrayList();
            this.b = jw5.d(xw5Var);
            gt5[] gt5VarArr = new gt5[8];
            this.c = gt5VarArr;
            this.d = gt5VarArr.length - 1;
        }

        private final void a() {
            int i = this.h;
            int i2 = this.f;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    d(i2 - i);
                }
            }
        }

        private final void b() {
            zr4.w2(this.c, null, 0, 0, 6, null);
            this.d = this.c.length - 1;
            this.e = 0;
            this.f = 0;
        }

        private final int c(int i) {
            return this.d + 1 + i;
        }

        private final int d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.c.length;
                while (true) {
                    length--;
                    i2 = this.d;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    gt5 gt5Var = this.c[length];
                    c25.m(gt5Var);
                    int i4 = gt5Var.m;
                    i -= i4;
                    this.f -= i4;
                    this.e--;
                    i3++;
                }
                gt5[] gt5VarArr = this.c;
                System.arraycopy(gt5VarArr, i2 + 1, gt5VarArr, i2 + 1 + i3, this.e);
                this.d += i3;
            }
            return i3;
        }

        private final vv5 f(int i) throws IOException {
            if (h(i)) {
                return ht5.i.c()[i].n;
            }
            int c = c(i - ht5.i.c().length);
            if (c >= 0) {
                gt5[] gt5VarArr = this.c;
                if (c < gt5VarArr.length) {
                    gt5 gt5Var = gt5VarArr[c];
                    c25.m(gt5Var);
                    return gt5Var.n;
                }
            }
            StringBuilder G = wo1.G("Header index too large ");
            G.append(i + 1);
            throw new IOException(G.toString());
        }

        private final void g(int i, gt5 gt5Var) {
            this.a.add(gt5Var);
            int i2 = gt5Var.m;
            if (i != -1) {
                gt5 gt5Var2 = this.c[c(i)];
                c25.m(gt5Var2);
                i2 -= gt5Var2.m;
            }
            int i3 = this.h;
            if (i2 > i3) {
                b();
                return;
            }
            int d = d((this.f + i2) - i3);
            if (i == -1) {
                int i4 = this.e + 1;
                gt5[] gt5VarArr = this.c;
                if (i4 > gt5VarArr.length) {
                    gt5[] gt5VarArr2 = new gt5[gt5VarArr.length * 2];
                    System.arraycopy(gt5VarArr, 0, gt5VarArr2, gt5VarArr.length, gt5VarArr.length);
                    this.d = this.c.length - 1;
                    this.c = gt5VarArr2;
                }
                int i5 = this.d;
                this.d = i5 - 1;
                this.c[i5] = gt5Var;
                this.e++;
            } else {
                this.c[c(i) + d + i] = gt5Var;
            }
            this.f += i2;
        }

        private final boolean h(int i) {
            return i >= 0 && i <= ht5.i.c().length - 1;
        }

        private final int j() throws IOException {
            return sr5.b(this.b.readByte(), 255);
        }

        private final void m(int i) throws IOException {
            if (h(i)) {
                this.a.add(ht5.i.c()[i]);
                return;
            }
            int c = c(i - ht5.i.c().length);
            if (c >= 0) {
                gt5[] gt5VarArr = this.c;
                if (c < gt5VarArr.length) {
                    List<gt5> list = this.a;
                    gt5 gt5Var = gt5VarArr[c];
                    c25.m(gt5Var);
                    list.add(gt5Var);
                    return;
                }
            }
            StringBuilder G = wo1.G("Header index too large ");
            G.append(i + 1);
            throw new IOException(G.toString());
        }

        private final void o(int i) throws IOException {
            g(-1, new gt5(f(i), k()));
        }

        private final void p() throws IOException {
            g(-1, new gt5(ht5.i.a(k()), k()));
        }

        private final void q(int i) throws IOException {
            this.a.add(new gt5(f(i), k()));
        }

        private final void r() throws IOException {
            this.a.add(new gt5(ht5.i.a(k()), k()));
        }

        @NotNull
        public final List<gt5> e() {
            List<gt5> Q5 = rs4.Q5(this.a);
            this.a.clear();
            return Q5;
        }

        public final int i() {
            return this.h;
        }

        @NotNull
        public final vv5 k() throws IOException {
            int j = j();
            boolean z = (j & 128) == 128;
            long n = n(j, 127);
            if (z) {
                sv5 sv5Var = new sv5();
                ot5.d.b(this.b, n, sv5Var);
                return sv5Var.f1();
            }
            return this.b.D(n);
        }

        public final void l() throws IOException {
            while (!this.b.f0()) {
                int b = sr5.b(this.b.readByte(), 255);
                if (b == 128) {
                    throw new IOException("index == 0");
                }
                if ((b & 128) == 128) {
                    m(n(b, 127) - 1);
                } else if (b == 64) {
                    p();
                } else if ((b & 64) == 64) {
                    o(n(b, 63) - 1);
                } else if ((b & 32) == 32) {
                    int n = n(b, 31);
                    this.h = n;
                    if (n >= 0 && n <= this.g) {
                        a();
                    } else {
                        StringBuilder G = wo1.G("Invalid dynamic table size update ");
                        G.append(this.h);
                        throw new IOException(G.toString());
                    }
                } else if (b != 16 && b != 0) {
                    q(n(b, 15) - 1);
                } else {
                    r();
                }
            }
        }

        public final int n(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int j = j();
                if ((j & 128) == 0) {
                    return i2 + (j << i4);
                }
                i2 += (j & 127) << i4;
                i4 += 7;
            }
        }

        public /* synthetic */ a(xw5 xw5Var, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(xw5Var, i, (i3 & 4) != 0 ? i : i2);
        }
    }

    /* compiled from: Hpack.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\b\b\u0002\u0010(\u001a\u00020%\u0012\u0006\u0010,\u001a\u00020)¢\u0006\u0004\b0\u00101J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u0004J\u001b\u0010\u0010\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR\u001e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0 8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010!R\u0016\u0010#\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0016\u0010$\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001eR\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010-\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0016\u0010.\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0016\u0010/\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001e¨\u00062"}, d2 = {"com/p7700g/p99005/ht5$b", "", "Lcom/p7700g/p99005/yq4;", "b", "()V", "", "bytesToRecover", "c", "(I)I", "Lcom/p7700g/p99005/gt5;", "entry", "d", "(Lcom/p7700g/p99005/gt5;)V", "a", "", "headerBlock", com.anythink.basead.d.g.i, "(Ljava/util/List;)V", "value", "prefixMask", "bits", "h", "(III)V", "Lcom/p7700g/p99005/vv5;", "data", "f", "(Lcom/p7700g/p99005/vv5;)V", "headerTableSizeSetting", "e", "(I)V", AFHydra.STATUS_IDLE, "maxDynamicTableByteCount", "", "[Lokhttp3/internal/http2/Header;", "dynamicTable", "headerCount", "smallestHeaderTableSizeSetting", "", "i", "Z", "useCompression", "Lcom/p7700g/p99005/sv5;", "j", "Lcom/p7700g/p99005/sv5;", "out", "emitDynamicTableSizeUpdate", "nextHeaderIndex", "dynamicTableByteCount", "<init>", "(IZLcom/p7700g/p99005/sv5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private int a;
        private boolean b;
        @cz4
        public int c;
        @cz4
        @NotNull
        public gt5[] d;
        private int e;
        @cz4
        public int f;
        @cz4
        public int g;
        @cz4
        public int h;
        private final boolean i;
        private final sv5 j;

        @gz4
        public b(int i, @NotNull sv5 sv5Var) {
            this(i, false, sv5Var, 2, null);
        }

        @gz4
        public b(int i, boolean z, @NotNull sv5 sv5Var) {
            c25.p(sv5Var, "out");
            this.h = i;
            this.i = z;
            this.j = sv5Var;
            this.a = Integer.MAX_VALUE;
            this.c = i;
            gt5[] gt5VarArr = new gt5[8];
            this.d = gt5VarArr;
            this.e = gt5VarArr.length - 1;
        }

        @gz4
        public b(@NotNull sv5 sv5Var) {
            this(0, false, sv5Var, 3, null);
        }

        private final void a() {
            int i = this.c;
            int i2 = this.g;
            if (i < i2) {
                if (i == 0) {
                    b();
                } else {
                    c(i2 - i);
                }
            }
        }

        private final void b() {
            zr4.w2(this.d, null, 0, 0, 6, null);
            this.e = this.d.length - 1;
            this.f = 0;
            this.g = 0;
        }

        private final int c(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.d.length;
                while (true) {
                    length--;
                    i2 = this.e;
                    if (length < i2 || i <= 0) {
                        break;
                    }
                    gt5 gt5Var = this.d[length];
                    c25.m(gt5Var);
                    i -= gt5Var.m;
                    int i4 = this.g;
                    gt5 gt5Var2 = this.d[length];
                    c25.m(gt5Var2);
                    this.g = i4 - gt5Var2.m;
                    this.f--;
                    i3++;
                }
                gt5[] gt5VarArr = this.d;
                System.arraycopy(gt5VarArr, i2 + 1, gt5VarArr, i2 + 1 + i3, this.f);
                gt5[] gt5VarArr2 = this.d;
                int i5 = this.e;
                Arrays.fill(gt5VarArr2, i5 + 1, i5 + 1 + i3, (Object) null);
                this.e += i3;
            }
            return i3;
        }

        private final void d(gt5 gt5Var) {
            int i = gt5Var.m;
            int i2 = this.c;
            if (i > i2) {
                b();
                return;
            }
            c((this.g + i) - i2);
            int i3 = this.f + 1;
            gt5[] gt5VarArr = this.d;
            if (i3 > gt5VarArr.length) {
                gt5[] gt5VarArr2 = new gt5[gt5VarArr.length * 2];
                System.arraycopy(gt5VarArr, 0, gt5VarArr2, gt5VarArr.length, gt5VarArr.length);
                this.e = this.d.length - 1;
                this.d = gt5VarArr2;
            }
            int i4 = this.e;
            this.e = i4 - 1;
            this.d[i4] = gt5Var;
            this.f++;
            this.g += i;
        }

        public final void e(int i) {
            this.h = i;
            int min = Math.min(i, 16384);
            int i2 = this.c;
            if (i2 == min) {
                return;
            }
            if (min < i2) {
                this.a = Math.min(this.a, min);
            }
            this.b = true;
            this.c = min;
            a();
        }

        public final void f(@NotNull vv5 vv5Var) throws IOException {
            c25.p(vv5Var, "data");
            if (this.i) {
                ot5 ot5Var = ot5.d;
                if (ot5Var.d(vv5Var) < vv5Var.C3()) {
                    sv5 sv5Var = new sv5();
                    ot5Var.c(vv5Var, sv5Var);
                    vv5 f1 = sv5Var.f1();
                    h(f1.C3(), 127, 128);
                    this.j.y1(f1);
                    return;
                }
            }
            h(vv5Var.C3(), 127, 0);
            this.j.y1(vv5Var);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void g(@NotNull List<gt5> list) throws IOException {
            int i;
            int i2;
            c25.p(list, "headerBlock");
            if (this.b) {
                int i3 = this.a;
                if (i3 < this.c) {
                    h(i3, 31, 32);
                }
                this.b = false;
                this.a = Integer.MAX_VALUE;
                h(this.c, 31, 32);
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                gt5 gt5Var = list.get(i4);
                vv5 e4 = gt5Var.n.e4();
                vv5 vv5Var = gt5Var.o;
                ht5 ht5Var = ht5.i;
                Integer num = ht5Var.b().get(e4);
                if (num != null) {
                    i2 = num.intValue() + 1;
                    if (2 <= i2 && 7 >= i2) {
                        if (c25.g(ht5Var.c()[i2 - 1].o, vv5Var)) {
                            i = i2;
                        } else if (c25.g(ht5Var.c()[i2].o, vv5Var)) {
                            i2++;
                            i = i2;
                        }
                        if (i2 == -1) {
                            int i5 = this.e + 1;
                            int length = this.d.length;
                            while (true) {
                                if (i5 >= length) {
                                    break;
                                }
                                gt5 gt5Var2 = this.d[i5];
                                c25.m(gt5Var2);
                                if (c25.g(gt5Var2.n, e4)) {
                                    gt5 gt5Var3 = this.d[i5];
                                    c25.m(gt5Var3);
                                    if (c25.g(gt5Var3.o, vv5Var)) {
                                        i2 = ht5.i.c().length + (i5 - this.e);
                                        break;
                                    } else if (i == -1) {
                                        i = (i5 - this.e) + ht5.i.c().length;
                                    }
                                }
                                i5++;
                            }
                        }
                        if (i2 == -1) {
                            h(i2, 127, 128);
                        } else if (i == -1) {
                            this.j.g0(64);
                            f(e4);
                            f(vv5Var);
                            d(gt5Var);
                        } else if (e4.E3(gt5.a) && (!c25.g(gt5.k, e4))) {
                            h(i, 15, 0);
                            f(vv5Var);
                        } else {
                            h(i, 63, 64);
                            f(vv5Var);
                            d(gt5Var);
                        }
                    }
                    i = i2;
                } else {
                    i = -1;
                }
                i2 = -1;
                if (i2 == -1) {
                }
                if (i2 == -1) {
                }
            }
        }

        public final void h(int i, int i2, int i3) {
            if (i < i2) {
                this.j.g0(i | i3);
                return;
            }
            this.j.g0(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.j.g0(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.j.g0(i4);
        }

        public /* synthetic */ b(int i, boolean z, sv5 sv5Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 4096 : i, (i2 & 2) != 0 ? true : z, sv5Var);
        }
    }
}