package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: CacheControl.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b!\u0018\u0000 \u000b2\u00020\u0001:\u0002\u000f\u0007Bs\b\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0006\u0012\u0006\u0010(\u001a\u00020\u0006\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b/\u00100J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0015\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\bR\u0019\u0010\u0017\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\bR\u0019\u0010\u001a\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004R\u0019\u0010\u001c\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0018\u001a\u0004\b\u001b\u0010\u0004R\u0019\u0010\u001f\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u0004R\u0019\u0010\"\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b \u0010\u0018\u001a\u0004\b!\u0010\u0004R\u0018\u0010%\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0019\u0010'\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b&\u0010\u0004R\u0019\u0010(\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b#\u0010\bR\u0019\u0010*\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b)\u0010\u0004R\u0019\u0010,\u001a\u00020\u00028\u0007@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b+\u0010\u0004R\u0019\u0010-\u001a\u00020\u00068\u0007@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0013\u001a\u0004\b\u001d\u0010\bR\u0019\u0010.\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b \u0010\u0004¨\u00061"}, d2 = {"Lcom/p7700g/p99005/gq5;", "", "", "f", "()Z", com.anythink.basead.d.g.i, "", "b", "()I", "j", "e", "c", "d", "i", "h", "a", "", "toString", "()Ljava/lang/String;", AFHydra.STATUS_IDLE, "n", "maxAgeSeconds", "w", "sMaxAgeSeconds", "Z", "l", "isPrivate", "t", "noTransform", ij3.b, "k", "immutable", com.anythink.expressad.d.a.b.dH, "u", "onlyIfCached", "p", "Ljava/lang/String;", "headerValue", "q", "mustRevalidate", "minFreshSeconds", "r", "noCache", "s", "noStore", "maxStaleSeconds", "isPublic", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class gq5 {
    private final boolean d;
    private final boolean e;
    private final int f;
    private final int g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final int k;
    private final int l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private String p;
    public static final b c = new b(null);
    @cz4
    @NotNull
    public static final gq5 a = new a().g().a();
    @cz4
    @NotNull
    public static final gq5 b = new a().j().e(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* compiled from: CacheControl.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u000eJ\r\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\bJ\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\bJ\r\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\bJ\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001aR\u0016\u0010 \u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0016\u0010\"\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0016\u0010#\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d¨\u0006&"}, d2 = {"com/p7700g/p99005/gq5$a", "", "", "", "b", "(J)I", "Lcom/p7700g/p99005/gq5$a;", com.anythink.basead.d.g.i, "()Lcom/p7700g/p99005/gq5$a;", "h", "maxAge", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "d", "(ILjava/util/concurrent/TimeUnit;)Lcom/p7700g/p99005/gq5$a;", "maxStale", "e", "minFresh", "f", "j", "i", "c", "Lcom/p7700g/p99005/gq5;", "a", "()Lcom/p7700g/p99005/gq5;", "", "Z", "immutable", "onlyIfCached", AFHydra.STATUS_IDLE, "minFreshSeconds", "noCache", "noStore", "maxStaleSeconds", "noTransform", "maxAgeSeconds", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private boolean a;
        private boolean b;
        private int c = -1;
        private int d = -1;
        private int e = -1;
        private boolean f;
        private boolean g;
        private boolean h;

        private final int b(long j) {
            if (j > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int) j;
        }

        @NotNull
        public final gq5 a() {
            return new gq5(this.a, this.b, this.c, -1, false, false, false, this.d, this.e, this.f, this.g, this.h, null, null);
        }

        @NotNull
        public final a c() {
            this.h = true;
            return this;
        }

        @NotNull
        public final a d(int i, @NotNull TimeUnit timeUnit) {
            c25.p(timeUnit, "timeUnit");
            if (i >= 0) {
                this.c = b(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(wo1.l("maxAge < 0: ", i).toString());
        }

        @NotNull
        public final a e(int i, @NotNull TimeUnit timeUnit) {
            c25.p(timeUnit, "timeUnit");
            if (i >= 0) {
                this.d = b(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(wo1.l("maxStale < 0: ", i).toString());
        }

        @NotNull
        public final a f(int i, @NotNull TimeUnit timeUnit) {
            c25.p(timeUnit, "timeUnit");
            if (i >= 0) {
                this.e = b(timeUnit.toSeconds(i));
                return this;
            }
            throw new IllegalArgumentException(wo1.l("minFresh < 0: ", i).toString());
        }

        @NotNull
        public final a g() {
            this.a = true;
            return this;
        }

        @NotNull
        public final a h() {
            this.b = true;
            return this;
        }

        @NotNull
        public final a i() {
            this.g = true;
            return this;
        }

        @NotNull
        public final a j() {
            this.f = true;
            return this;
        }
    }

    /* compiled from: CacheControl.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\n8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, d2 = {"com/p7700g/p99005/gq5$b", "", "", "characters", "", "startIndex", "a", "(Ljava/lang/String;Ljava/lang/String;I)I", "Lcom/p7700g/p99005/yq5;", "headers", "Lcom/p7700g/p99005/gq5;", "c", "(Lcom/p7700g/p99005/yq5;)Lcom/p7700g/p99005/gq5;", "FORCE_CACHE", "Lcom/p7700g/p99005/gq5;", "FORCE_NETWORK", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {
        private b() {
        }

        private final int a(String str, String str2, int i) {
            int length = str.length();
            while (i < length) {
                if (c95.U2(str2, str.charAt(i), false, 2, null)) {
                    return i;
                }
                i++;
            }
            return str.length();
        }

        public static /* synthetic */ int b(b bVar, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return bVar.a(str, str2, i);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00dd  */
        @jz4
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final gq5 c(@NotNull yq5 yq5Var) {
            int i;
            int i2;
            boolean z;
            int i3;
            String str;
            yq5 yq5Var2 = yq5Var;
            c25.p(yq5Var2, "headers");
            int size = yq5Var.size();
            boolean z2 = true;
            int i4 = 0;
            boolean z3 = true;
            String str2 = null;
            boolean z4 = false;
            boolean z5 = false;
            int i5 = -1;
            int i6 = -1;
            boolean z6 = false;
            boolean z7 = false;
            boolean z8 = false;
            int i7 = -1;
            int i8 = -1;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            while (i4 < size) {
                String h = yq5Var2.h(i4);
                String t = yq5Var2.t(i4);
                if (b95.K1(h, sm4.f, z2)) {
                    if (str2 == null) {
                        str2 = t;
                        i2 = 0;
                        while (i2 < t.length()) {
                            int a = a(t, "=,;", i2);
                            String substring = t.substring(i2, a);
                            c25.o(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            Objects.requireNonNull(substring, "null cannot be cast to non-null type kotlin.CharSequence");
                            String obj = c95.E5(substring).toString();
                            int i9 = size;
                            if (a != t.length()) {
                                z = z3;
                                if (t.charAt(a) != ',' && t.charAt(a) != ';') {
                                    int G = sr5.G(t, a + 1);
                                    if (G < t.length() && t.charAt(G) == '\"') {
                                        int i10 = G + 1;
                                        int q3 = c95.q3(t, h95.b, i10, false, 4, null);
                                        str = t.substring(i10, q3);
                                        c25.o(str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                        i3 = q3 + 1;
                                    } else {
                                        i3 = a(t, ",;", G);
                                        String substring2 = t.substring(G, i3);
                                        c25.o(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                        Objects.requireNonNull(substring2, "null cannot be cast to non-null type kotlin.CharSequence");
                                        str = c95.E5(substring2).toString();
                                    }
                                    z2 = true;
                                    if (!b95.K1("no-cache", obj, true)) {
                                        z4 = true;
                                    } else if (b95.K1("no-store", obj, true)) {
                                        z5 = true;
                                    } else if (b95.K1("max-age", obj, true)) {
                                        i5 = sr5.f0(str, -1);
                                    } else if (b95.K1("s-maxage", obj, true)) {
                                        i6 = sr5.f0(str, -1);
                                    } else if (b95.K1("private", obj, true)) {
                                        z6 = true;
                                    } else if (b95.K1("public", obj, true)) {
                                        z7 = true;
                                    } else if (b95.K1("must-revalidate", obj, true)) {
                                        z8 = true;
                                    } else if (b95.K1("max-stale", obj, true)) {
                                        i7 = sr5.f0(str, Integer.MAX_VALUE);
                                    } else if (b95.K1("min-fresh", obj, true)) {
                                        i8 = sr5.f0(str, -1);
                                    } else if (b95.K1("only-if-cached", obj, true)) {
                                        z9 = true;
                                    } else if (b95.K1("no-transform", obj, true)) {
                                        z10 = true;
                                    } else if (b95.K1("immutable", obj, true)) {
                                        z11 = true;
                                    }
                                    i2 = i3;
                                    size = i9;
                                    z3 = z;
                                }
                            } else {
                                z = z3;
                            }
                            i3 = a + 1;
                            str = null;
                            z2 = true;
                            if (!b95.K1("no-cache", obj, true)) {
                            }
                            i2 = i3;
                            size = i9;
                            z3 = z;
                        }
                        i = size;
                        i4++;
                        yq5Var2 = yq5Var;
                        size = i;
                    }
                } else if (!b95.K1(h, "Pragma", z2)) {
                    i = size;
                    i4++;
                    yq5Var2 = yq5Var;
                    size = i;
                }
                z3 = false;
                i2 = 0;
                while (i2 < t.length()) {
                }
                i = size;
                i4++;
                yq5Var2 = yq5Var;
                size = i;
            }
            return new gq5(z4, z5, i5, i6, z6, z7, z8, i7, i8, z9, z10, z11, !z3 ? null : str2, null);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private gq5(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str) {
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = i2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
        this.k = i3;
        this.l = i4;
        this.m = z6;
        this.n = z7;
        this.o = z8;
        this.p = str;
    }

    @jz4
    @NotNull
    public static final gq5 v(@NotNull yq5 yq5Var) {
        return c.c(yq5Var);
    }

    @fz4(name = "-deprecated_immutable")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "immutable", imports = {}))
    public final boolean a() {
        return this.o;
    }

    @fz4(name = "-deprecated_maxAgeSeconds")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "maxAgeSeconds", imports = {}))
    public final int b() {
        return this.f;
    }

    @fz4(name = "-deprecated_maxStaleSeconds")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "maxStaleSeconds", imports = {}))
    public final int c() {
        return this.k;
    }

    @fz4(name = "-deprecated_minFreshSeconds")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "minFreshSeconds", imports = {}))
    public final int d() {
        return this.l;
    }

    @fz4(name = "-deprecated_mustRevalidate")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "mustRevalidate", imports = {}))
    public final boolean e() {
        return this.j;
    }

    @fz4(name = "-deprecated_noCache")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "noCache", imports = {}))
    public final boolean f() {
        return this.d;
    }

    @fz4(name = "-deprecated_noStore")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "noStore", imports = {}))
    public final boolean g() {
        return this.e;
    }

    @fz4(name = "-deprecated_noTransform")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "noTransform", imports = {}))
    public final boolean h() {
        return this.n;
    }

    @fz4(name = "-deprecated_onlyIfCached")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "onlyIfCached", imports = {}))
    public final boolean i() {
        return this.m;
    }

    @fz4(name = "-deprecated_sMaxAgeSeconds")
    @xn4(level = zn4.ERROR, message = "moved to val", replaceWith = @op4(expression = "sMaxAgeSeconds", imports = {}))
    public final int j() {
        return this.g;
    }

    @fz4(name = "immutable")
    public final boolean k() {
        return this.o;
    }

    public final boolean l() {
        return this.h;
    }

    public final boolean m() {
        return this.i;
    }

    @fz4(name = "maxAgeSeconds")
    public final int n() {
        return this.f;
    }

    @fz4(name = "maxStaleSeconds")
    public final int o() {
        return this.k;
    }

    @fz4(name = "minFreshSeconds")
    public final int p() {
        return this.l;
    }

    @fz4(name = "mustRevalidate")
    public final boolean q() {
        return this.j;
    }

    @fz4(name = "noCache")
    public final boolean r() {
        return this.d;
    }

    @fz4(name = "noStore")
    public final boolean s() {
        return this.e;
    }

    @fz4(name = "noTransform")
    public final boolean t() {
        return this.n;
    }

    @NotNull
    public String toString() {
        String str = this.p;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.d) {
                sb.append("no-cache, ");
            }
            if (this.e) {
                sb.append("no-store, ");
            }
            if (this.f != -1) {
                sb.append("max-age=");
                sb.append(this.f);
                sb.append(", ");
            }
            if (this.g != -1) {
                sb.append("s-maxage=");
                sb.append(this.g);
                sb.append(", ");
            }
            if (this.h) {
                sb.append("private, ");
            }
            if (this.i) {
                sb.append("public, ");
            }
            if (this.j) {
                sb.append("must-revalidate, ");
            }
            if (this.k != -1) {
                sb.append("max-stale=");
                sb.append(this.k);
                sb.append(", ");
            }
            if (this.l != -1) {
                sb.append("min-fresh=");
                sb.append(this.l);
                sb.append(", ");
            }
            if (this.m) {
                sb.append("only-if-cached, ");
            }
            if (this.n) {
                sb.append("no-transform, ");
            }
            if (this.o) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            c25.o(sb2, "StringBuilder().apply(builderAction).toString()");
            this.p = sb2;
            return sb2;
        }
        return str;
    }

    @fz4(name = "onlyIfCached")
    public final boolean u() {
        return this.m;
    }

    @fz4(name = "sMaxAgeSeconds")
    public final int w() {
        return this.g;
    }

    public /* synthetic */ gq5(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, boolean z8, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, i2, z3, z4, z5, i3, i4, z6, z7, z8, str);
    }
}