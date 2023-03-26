package com.p7700g.p99005;

import android.net.Uri;
import android.text.TextUtils;
import com.p7700g.p99005.t43;
import com.p7700g.p99005.v43;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class b23<T, R> {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private static final String b = "ApiRqst";
    @Nullable
    private ka3<T, R> c;
    private g23<T> d;
    private final long g = System.currentTimeMillis();
    @NotNull
    private final v43.b<byte[]> e = new v43.b() { // from class: com.p7700g.p99005.x13
        @Override // com.p7700g.p99005.v43.b
        public final void onResponse(Object obj) {
            b23.k(b23.this, (byte[]) obj);
        }
    };
    @NotNull
    private final v43.a f = new v43.a() { // from class: com.p7700g.p99005.y13
        @Override // com.p7700g.p99005.v43.a
        public final void b(b53 b53Var) {
            b23.l(b23.this, b53Var);
        }
    };

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b23(@Nullable ka3<T, R> ka3Var) {
        this.c = ka3Var;
    }

    public static final void a(b23 b23Var, byte[] bArr) {
        c25.p(b23Var, "this$0");
        xz2.c(b, "Network Request completed successfully");
        g23<T> g23Var = b23Var.d;
        if (g23Var == null) {
            c25.S("priorityRequest");
            throw null;
        }
        p43 Y = g23Var.Y();
        if (Y != null) {
            c25.o(bArr, "response");
            b23Var.o(b23Var, bArr, Y);
            return;
        }
        b23Var.n(b23Var, new b53("Empty network response"), new p43(new byte[0]));
    }

    public static final void b(b23 b23Var, b53 b53Var) {
        c25.p(b23Var, "this$0");
        if (b53Var.s != null) {
            c25.o(b53Var, "error");
            xz2.b(b, "URL Network Request error. ", b53Var);
        }
        c25.o(b53Var, "error");
        b23Var.n(b23Var, b53Var, b53Var.s);
    }

    public static /* synthetic */ void k(b23 b23Var, byte[] bArr) {
        a(b23Var, bArr);
    }

    public static /* synthetic */ void l(b23 b23Var, b53 b53Var) {
        b(b23Var, b53Var);
    }

    public final void c() {
        g23<T> g23Var = this.d;
        if (g23Var != null) {
            g23Var.c();
            String[] strArr = new String[1];
            g23<T> g23Var2 = this.d;
            if (g23Var2 == null) {
                c25.S("priorityRequest");
                throw null;
            }
            strArr[0] = c25.C("Cancelled Request ", g23Var2.z());
            xz2.c(b, strArr);
            return;
        }
        c25.S("priorityRequest");
        throw null;
    }

    @Nullable
    public abstract qa3<T> d();

    @Nullable
    public ka3<T, R> e() {
        return this.c;
    }

    public final long f() {
        return this.g;
    }

    public abstract int g();

    @NotNull
    public t43.d h() {
        return t43.d.NORMAL;
    }

    @NotNull
    public abstract x43 i();

    @NotNull
    public abstract Uri j();

    public void m(@NotNull h93 h93Var) {
        c25.p(h93Var, "requestHeaders");
    }

    @t0
    public void n(@NotNull b23<T, R> b23Var, @NotNull b53 b53Var, @Nullable p43 p43Var) {
        c25.p(b23Var, "request");
        c25.p(b53Var, "error");
        String[] strArr = new String[1];
        StringBuilder G = wo1.G("REQUEST: Success ");
        g23<T> g23Var = this.d;
        if (g23Var != null) {
            G.append(g23Var);
            G.append(" \n RESPONSE: Failure ");
            G.append((Object) b53Var.getLocalizedMessage());
            G.append(gl4.R);
            G.append(p43Var);
            strArr[0] = G.toString();
            xz2.c(b, strArr);
            return;
        }
        c25.S("priorityRequest");
        throw null;
    }

    @t0
    public void o(@NotNull b23<T, R> b23Var, @NotNull byte[] bArr, @NotNull p43 p43Var) {
        c25.p(b23Var, "request");
        c25.p(bArr, "response");
        c25.p(p43Var, "networkResponse");
        String[] strArr = new String[1];
        StringBuilder G = wo1.G("REQUEST: Success $");
        g23<T> g23Var = this.d;
        if (g23Var != null) {
            G.append(g23Var);
            G.append(" \n RESPONSE ");
            G.append(new String(bArr, f85.b));
            G.append(gl4.R);
            G.append(p43Var);
            strArr[0] = G.toString();
            xz2.c(b, strArr);
            return;
        }
        c25.S("priorityRequest");
        throw null;
    }

    public void p(@Nullable ka3<T, R> ka3Var) {
        this.c = ka3Var;
    }

    public final void q() {
        String uri = j().toString();
        c25.o(uri, "uri.toString()");
        String a2 = ma3.a.a(uri);
        if (!TextUtils.isEmpty(a2)) {
            int g = g();
            g23<T> g23Var = new g23<>(g, a2, this.e, this.f);
            this.d = g23Var;
            if (g == 1) {
                if (g23Var == null) {
                    c25.S("priorityRequest");
                    throw null;
                }
                g23Var.x0(d());
            }
            oa3 oa3Var = oa3.a;
            g23<T> g23Var2 = this.d;
            if (g23Var2 != null) {
                oa3Var.b(g23Var2.Z());
                g23<T> g23Var3 = this.d;
                if (g23Var3 != null) {
                    m(g23Var3.Z());
                    g23<T> g23Var4 = this.d;
                    if (g23Var4 != null) {
                        g23Var4.X0(h());
                        g23<T> g23Var5 = this.d;
                        if (g23Var5 != null) {
                            g23Var5.O(i());
                            g23<T> g23Var6 = this.d;
                            if (g23Var6 != null) {
                                g23Var6.S(a2);
                                na3 a3 = na3.s.a();
                                g23<T> g23Var7 = this.d;
                                if (g23Var7 != null) {
                                    a3.c(g23Var7);
                                    return;
                                } else {
                                    c25.S("priorityRequest");
                                    throw null;
                                }
                            }
                            c25.S("priorityRequest");
                            throw null;
                        }
                        c25.S("priorityRequest");
                        throw null;
                    }
                    c25.S("priorityRequest");
                    throw null;
                }
                c25.S("priorityRequest");
                throw null;
            }
            c25.S("priorityRequest");
            throw null;
        }
        xz2.c(b, "Network Request URL came out null or empty. Not running task. Do not expect callbacks");
    }
}