package com.p7700g.p99005;

import com.anythink.core.api.ATAdConst;
import com.p7700g.p99005.zq5;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FormBody.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\u0018\u0000 %2\u00020\u0001:\u0002\u0016\u0014B%\b\u0000\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u001b\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001b¢\u0006\u0004\b#\u0010$J!\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0013\u0010 \u001a\u00020\t8G@\u0006¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u001b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001d¨\u0006&"}, d2 = {"Lcom/p7700g/p99005/wq5;", "Lcom/p7700g/p99005/ir5;", "Lcom/p7700g/p99005/tv5;", "sink", "", "countBytes", "", "y", "(Lcom/p7700g/p99005/tv5;Z)J", "", "s", "()I", la1.l, "", "t", "(I)Ljava/lang/String;", com.ironsource.sdk.controller.v.a, "u", "x", "Lcom/p7700g/p99005/br5;", "b", "()Lcom/p7700g/p99005/br5;", "a", "()J", "Lcom/p7700g/p99005/yq4;", "r", "(Lcom/p7700g/p99005/tv5;)V", "", "e", "Ljava/util/List;", "encodedValues", "w", ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, "d", "encodedNames", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "c", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class wq5 extends ir5 {
    private final List<String> d;
    private final List<String> e;
    public static final b c = new b(null);
    private static final br5 b = br5.e.c("application/x-www-form-urlencoded");

    /* compiled from: FormBody.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/p7700g/p99005/wq5$b", "", "Lcom/p7700g/p99005/br5;", "CONTENT_TYPE", "Lcom/p7700g/p99005/br5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public wq5(@NotNull List<String> list, @NotNull List<String> list2) {
        c25.p(list, "encodedNames");
        c25.p(list2, "encodedValues");
        this.d = sr5.c0(list);
        this.e = sr5.c0(list2);
    }

    private final long y(tv5 tv5Var, boolean z) {
        sv5 o;
        if (z) {
            o = new sv5();
        } else {
            c25.m(tv5Var);
            o = tv5Var.o();
        }
        int size = this.d.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                o.g0(38);
            }
            o.K0(this.d.get(i));
            o.g0(61);
            o.K0(this.e.get(i));
        }
        if (z) {
            long z2 = o.z2();
            o.d();
            return z2;
        }
        return 0L;
    }

    @Override // com.p7700g.p99005.ir5
    public long a() {
        return y(null, true);
    }

    @Override // com.p7700g.p99005.ir5
    @NotNull
    public br5 b() {
        return b;
    }

    @Override // com.p7700g.p99005.ir5
    public void r(@NotNull tv5 tv5Var) throws IOException {
        c25.p(tv5Var, "sink");
        y(tv5Var, false);
    }

    @fz4(name = "-deprecated_size")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE, imports = {}))
    public final int s() {
        return w();
    }

    @NotNull
    public final String t(int i) {
        return this.d.get(i);
    }

    @NotNull
    public final String u(int i) {
        return this.e.get(i);
    }

    @NotNull
    public final String v(int i) {
        return zq5.b.n(zq5.m, t(i), 0, 0, true, 3, null);
    }

    @fz4(name = ATAdConst.NETWORK_REQUEST_PARAMS_KEY.BANNER_SIZE)
    public final int w() {
        return this.d.size();
    }

    @NotNull
    public final String x(int i) {
        return zq5.b.n(zq5.m, u(i), 0, 0, true, 3, null);
    }

    /* compiled from: FormBody.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\b\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0007J\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\rR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0010R\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0015"}, d2 = {"com/p7700g/p99005/wq5$a", "", "", "name", "value", "Lcom/p7700g/p99005/wq5$a;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/p7700g/p99005/wq5$a;", "b", "Lcom/p7700g/p99005/wq5;", "c", "()Lcom/p7700g/p99005/wq5;", "Ljava/nio/charset/Charset;", "Ljava/nio/charset/Charset;", "charset", "", "Ljava/util/List;", "values", "names", "<init>", "(Ljava/nio/charset/Charset;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private final List<String> a;
        private final List<String> b;
        private final Charset c;

        @gz4
        public a() {
            this(null, 1, null);
        }

        @gz4
        public a(@Nullable Charset charset) {
            this.c = charset;
            this.a = new ArrayList();
            this.b = new ArrayList();
        }

        @NotNull
        public final a a(@NotNull String str, @NotNull String str2) {
            c25.p(str, "name");
            c25.p(str2, "value");
            List<String> list = this.a;
            zq5.b bVar = zq5.m;
            list.add(zq5.b.f(bVar, str, 0, 0, zq5.j, false, false, true, false, this.c, 91, null));
            this.b.add(zq5.b.f(bVar, str2, 0, 0, zq5.j, false, false, true, false, this.c, 91, null));
            return this;
        }

        @NotNull
        public final a b(@NotNull String str, @NotNull String str2) {
            c25.p(str, "name");
            c25.p(str2, "value");
            List<String> list = this.a;
            zq5.b bVar = zq5.m;
            list.add(zq5.b.f(bVar, str, 0, 0, zq5.j, true, false, true, false, this.c, 83, null));
            this.b.add(zq5.b.f(bVar, str2, 0, 0, zq5.j, true, false, true, false, this.c, 83, null));
            return this;
        }

        @NotNull
        public final wq5 c() {
            return new wq5(this.a, this.b);
        }

        public /* synthetic */ a(Charset charset, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : charset);
        }
    }
}