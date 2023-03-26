package com.p7700g.p99005;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WebSocketExtensions.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u0000 \t2\u00020\u0001:\u0001\u0006BG\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\"\u0010#J\u0015\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0007JP\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0011\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0016\u0010\u0014\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010 R\u0016\u0010\u0011\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u0016\u0010\u0013\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 ¨\u0006$"}, d2 = {"Lcom/p7700g/p99005/zu5;", "", "", "clientOriginated", "i", "(Z)Z", "a", "()Z", "", "b", "()Ljava/lang/Integer;", "c", "d", "e", "f", "perMessageDeflate", "clientMaxWindowBits", "clientNoContextTakeover", "serverMaxWindowBits", "serverNoContextTakeover", "unknownValues", com.anythink.basead.d.g.i, "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)Lcom/p7700g/p99005/zu5;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "Z", "h", "<init>", "(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class zu5 {
    private static final String a = "Sec-WebSocket-Extensions";
    public static final a b = new a(null);
    @cz4
    public final boolean c;
    @cz4
    @Nullable
    public final Integer d;
    @cz4
    public final boolean e;
    @cz4
    @Nullable
    public final Integer f;
    @cz4
    public final boolean g;
    @cz4
    public final boolean h;

    /* compiled from: WebSocketExtensions.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"com/p7700g/p99005/zu5$a", "", "Lcom/p7700g/p99005/yq5;", "responseHeaders", "Lcom/p7700g/p99005/zu5;", "a", "(Lcom/p7700g/p99005/yq5;)Lcom/p7700g/p99005/zu5;", "", "HEADER_WEB_SOCKET_EXTENSION", "Ljava/lang/String;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        @NotNull
        public final zu5 a(@NotNull yq5 yq5Var) throws IOException {
            c25.p(yq5Var, "responseHeaders");
            int size = yq5Var.size();
            boolean z = false;
            Integer num = null;
            boolean z2 = false;
            Integer num2 = null;
            boolean z3 = false;
            boolean z4 = false;
            for (int i = 0; i < size; i++) {
                if (b95.K1(yq5Var.h(i), zu5.a, true)) {
                    String t = yq5Var.t(i);
                    int i2 = 0;
                    while (i2 < t.length()) {
                        int r = sr5.r(t, e14.f0, i2, 0, 4, null);
                        int p = sr5.p(t, ';', i2, r);
                        String g0 = sr5.g0(t, i2, p);
                        int i3 = p + 1;
                        if (b95.K1(g0, "permessage-deflate", true)) {
                            if (z) {
                                z4 = true;
                            }
                            while (i3 < r) {
                                int p2 = sr5.p(t, ';', i3, r);
                                int p3 = sr5.p(t, '=', i3, p2);
                                String g02 = sr5.g0(t, i3, p3);
                                String l4 = p3 < p2 ? c95.l4(sr5.g0(t, p3 + 1, p2), "\"") : null;
                                int i4 = p2 + 1;
                                if (b95.K1(g02, "client_max_window_bits", true)) {
                                    if (num != null) {
                                        z4 = true;
                                    }
                                    num = l4 != null ? a95.X0(l4) : null;
                                    if (num != null) {
                                        i3 = i4;
                                    }
                                    z4 = true;
                                    i3 = i4;
                                } else {
                                    if (b95.K1(g02, "client_no_context_takeover", true)) {
                                        if (z2) {
                                            z4 = true;
                                        }
                                        if (l4 != null) {
                                            z4 = true;
                                        }
                                        z2 = true;
                                    } else if (b95.K1(g02, "server_max_window_bits", true)) {
                                        if (num2 != null) {
                                            z4 = true;
                                        }
                                        num2 = l4 != null ? a95.X0(l4) : null;
                                        if (num2 != null) {
                                        }
                                        z4 = true;
                                    } else {
                                        if (b95.K1(g02, "server_no_context_takeover", true)) {
                                            if (z3) {
                                                z4 = true;
                                            }
                                            if (l4 != null) {
                                                z4 = true;
                                            }
                                            z3 = true;
                                        }
                                        z4 = true;
                                    }
                                    i3 = i4;
                                }
                            }
                            i2 = i3;
                            z = true;
                        } else {
                            i2 = i3;
                            z4 = true;
                        }
                    }
                }
            }
            return new zu5(z, num, z2, num2, z3, z4);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public zu5() {
        this(false, null, false, null, false, false, 63, null);
    }

    public zu5(boolean z, @Nullable Integer num, boolean z2, @Nullable Integer num2, boolean z3, boolean z4) {
        this.c = z;
        this.d = num;
        this.e = z2;
        this.f = num2;
        this.g = z3;
        this.h = z4;
    }

    public static /* synthetic */ zu5 h(zu5 zu5Var, boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = zu5Var.c;
        }
        if ((i & 2) != 0) {
            num = zu5Var.d;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            z2 = zu5Var.e;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            num2 = zu5Var.f;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            z3 = zu5Var.g;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            z4 = zu5Var.h;
        }
        return zu5Var.g(z, num3, z5, num4, z6, z4);
    }

    public final boolean a() {
        return this.c;
    }

    @Nullable
    public final Integer b() {
        return this.d;
    }

    public final boolean c() {
        return this.e;
    }

    @Nullable
    public final Integer d() {
        return this.f;
    }

    public final boolean e() {
        return this.g;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof zu5) {
                zu5 zu5Var = (zu5) obj;
                return this.c == zu5Var.c && c25.g(this.d, zu5Var.d) && this.e == zu5Var.e && c25.g(this.f, zu5Var.f) && this.g == zu5Var.g && this.h == zu5Var.h;
            }
            return false;
        }
        return true;
    }

    public final boolean f() {
        return this.h;
    }

    @NotNull
    public final zu5 g(boolean z, @Nullable Integer num, boolean z2, @Nullable Integer num2, boolean z3, boolean z4) {
        return new zu5(z, num, z2, num2, z3, z4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    public int hashCode() {
        boolean z = this.c;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        Integer num = this.d;
        int hashCode = (i + (num != null ? num.hashCode() : 0)) * 31;
        ?? r2 = this.e;
        int i2 = r2;
        if (r2 != 0) {
            i2 = 1;
        }
        int i3 = (hashCode + i2) * 31;
        Integer num2 = this.f;
        int hashCode2 = (i3 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ?? r22 = this.g;
        int i4 = r22;
        if (r22 != 0) {
            i4 = 1;
        }
        int i5 = (hashCode2 + i4) * 31;
        boolean z2 = this.h;
        return i5 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean i(boolean z) {
        if (z) {
            return this.e;
        }
        return this.g;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("WebSocketExtensions(perMessageDeflate=");
        G.append(this.c);
        G.append(", clientMaxWindowBits=");
        G.append(this.d);
        G.append(", clientNoContextTakeover=");
        G.append(this.e);
        G.append(", serverMaxWindowBits=");
        G.append(this.f);
        G.append(", serverNoContextTakeover=");
        G.append(this.g);
        G.append(", unknownValues=");
        G.append(this.h);
        G.append(")");
        return G.toString();
    }

    public /* synthetic */ zu5(boolean z, Integer num, boolean z2, Integer num2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? num2 : null, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? false : z4);
    }
}