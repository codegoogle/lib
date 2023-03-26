package com.p7700g.p99005;

import com.p7700g.p99005.br5;
import com.p7700g.p99005.rs2;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ResponseBody.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 ,2\u00020\u0001:\u0002\u0015\u001dB\u0007¢\u0006\u0004\b+\u0010'JB\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H&¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010 \u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\r\u0010#\u001a\u00020\"¢\u0006\u0004\b#\u0010$J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/p7700g/p99005/kr5;", "Ljava/io/Closeable;", "", "T", "Lkotlin/Function1;", "Lcom/p7700g/p99005/uv5;", "consumer", "", "sizeMapper", "h", "(Lcom/p7700g/p99005/f05;Lcom/p7700g/p99005/f05;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "f", "()Ljava/nio/charset/Charset;", "Lcom/p7700g/p99005/br5;", "k", "()Lcom/p7700g/p99005/br5;", "", "j", "()J", "Ljava/io/InputStream;", "a", "()Ljava/io/InputStream;", bx.B4, "()Lcom/p7700g/p99005/uv5;", "", "d", "()[B", "Lcom/p7700g/p99005/vv5;", "b", "()Lcom/p7700g/p99005/vv5;", "Ljava/io/Reader;", "e", "()Ljava/io/Reader;", "", "E", "()Ljava/lang/String;", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "t", "Ljava/io/Reader;", "reader", "<init>", "s", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class kr5 implements Closeable {
    public static final b s = new b(null);
    private Reader t;

    /* compiled from: ResponseBody.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"com/p7700g/p99005/kr5$a", "Ljava/io/Reader;", "", "cbuf", "", pc5.e, "len", "read", "([CII)I", "Lcom/p7700g/p99005/yq4;", com.anythink.expressad.foundation.d.c.cd, "()V", "t", "Ljava/io/Reader;", "delegate", "Lcom/p7700g/p99005/uv5;", "u", "Lcom/p7700g/p99005/uv5;", rs2.f.b, "", "s", "Z", "closed", "Ljava/nio/charset/Charset;", com.ironsource.sdk.controller.v.a, "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lcom/p7700g/p99005/uv5;Ljava/nio/charset/Charset;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a extends Reader {
        private boolean s;
        private Reader t;
        private final uv5 u;
        private final Charset v;

        public a(@NotNull uv5 uv5Var, @NotNull Charset charset) {
            c25.p(uv5Var, rs2.f.b);
            c25.p(charset, "charset");
            this.u = uv5Var;
            this.v = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.s = true;
            Reader reader = this.t;
            if (reader != null) {
                reader.close();
            } else {
                this.u.close();
            }
        }

        @Override // java.io.Reader
        public int read(@NotNull char[] cArr, int i, int i2) throws IOException {
            c25.p(cArr, "cbuf");
            if (!this.s) {
                Reader reader = this.t;
                if (reader == null) {
                    reader = new InputStreamReader(this.u.W1(), sr5.P(this.u, this.v));
                    this.t = reader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    /* compiled from: ResponseBody.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u0005*\u00020\u000e2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001a\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"com/p7700g/p99005/kr5$b", "", "", "Lcom/p7700g/p99005/br5;", "contentType", "Lcom/p7700g/p99005/kr5;", "a", "(Ljava/lang/String;Lcom/p7700g/p99005/br5;)Lcom/p7700g/p99005/kr5;", "", "h", "([BLcom/p7700g/p99005/br5;)Lcom/p7700g/p99005/kr5;", "Lcom/p7700g/p99005/vv5;", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/vv5;Lcom/p7700g/p99005/br5;)Lcom/p7700g/p99005/kr5;", "Lcom/p7700g/p99005/uv5;", "", "contentLength", "f", "(Lcom/p7700g/p99005/uv5;Lcom/p7700g/p99005/br5;J)Lcom/p7700g/p99005/kr5;", "content", "c", "(Lcom/p7700g/p99005/br5;Ljava/lang/String;)Lcom/p7700g/p99005/kr5;", "e", "(Lcom/p7700g/p99005/br5;[B)Lcom/p7700g/p99005/kr5;", "d", "(Lcom/p7700g/p99005/br5;Lcom/p7700g/p99005/vv5;)Lcom/p7700g/p99005/kr5;", "b", "(Lcom/p7700g/p99005/br5;JLcom/p7700g/p99005/uv5;)Lcom/p7700g/p99005/kr5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class b {

        /* compiled from: ResponseBody.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/p7700g/p99005/kr5$b$a", "Lcom/p7700g/p99005/kr5;", "Lcom/p7700g/p99005/br5;", "k", "()Lcom/p7700g/p99005/br5;", "", "j", "()J", "Lcom/p7700g/p99005/uv5;", bx.B4, "()Lcom/p7700g/p99005/uv5;", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class a extends kr5 {
            public final /* synthetic */ uv5 u;
            public final /* synthetic */ br5 v;
            public final /* synthetic */ long w;

            public a(uv5 uv5Var, br5 br5Var, long j) {
                this.u = uv5Var;
                this.v = br5Var;
                this.w = j;
            }

            @Override // com.p7700g.p99005.kr5
            @NotNull
            public uv5 A() {
                return this.u;
            }

            @Override // com.p7700g.p99005.kr5
            public long j() {
                return this.w;
            }

            @Override // com.p7700g.p99005.kr5
            @Nullable
            public br5 k() {
                return this.v;
            }
        }

        private b() {
        }

        public static /* synthetic */ kr5 i(b bVar, String str, br5 br5Var, int i, Object obj) {
            if ((i & 1) != 0) {
                br5Var = null;
            }
            return bVar.a(str, br5Var);
        }

        public static /* synthetic */ kr5 j(b bVar, uv5 uv5Var, br5 br5Var, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                br5Var = null;
            }
            if ((i & 2) != 0) {
                j = -1;
            }
            return bVar.f(uv5Var, br5Var, j);
        }

        public static /* synthetic */ kr5 k(b bVar, vv5 vv5Var, br5 br5Var, int i, Object obj) {
            if ((i & 1) != 0) {
                br5Var = null;
            }
            return bVar.g(vv5Var, br5Var);
        }

        public static /* synthetic */ kr5 l(b bVar, byte[] bArr, br5 br5Var, int i, Object obj) {
            if ((i & 1) != 0) {
                br5Var = null;
            }
            return bVar.h(bArr, br5Var);
        }

        @fz4(name = "create")
        @jz4
        @NotNull
        public final kr5 a(@NotNull String str, @Nullable br5 br5Var) {
            c25.p(str, "$this$toResponseBody");
            Charset charset = f85.b;
            if (br5Var != null) {
                Charset g = br5.g(br5Var, null, 1, null);
                if (g == null) {
                    br5.a aVar = br5.e;
                    br5Var = aVar.d(br5Var + "; charset=utf-8");
                } else {
                    charset = g;
                }
            }
            sv5 g1 = new sv5().g1(str, charset);
            return f(g1, br5Var, g1.z2());
        }

        @jz4
        @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @NotNull
        public final kr5 b(@Nullable br5 br5Var, long j, @NotNull uv5 uv5Var) {
            c25.p(uv5Var, "content");
            return f(uv5Var, br5Var, j);
        }

        @jz4
        @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @NotNull
        public final kr5 c(@Nullable br5 br5Var, @NotNull String str) {
            c25.p(str, "content");
            return a(str, br5Var);
        }

        @jz4
        @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @NotNull
        public final kr5 d(@Nullable br5 br5Var, @NotNull vv5 vv5Var) {
            c25.p(vv5Var, "content");
            return g(vv5Var, br5Var);
        }

        @jz4
        @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @NotNull
        public final kr5 e(@Nullable br5 br5Var, @NotNull byte[] bArr) {
            c25.p(bArr, "content");
            return h(bArr, br5Var);
        }

        @fz4(name = "create")
        @jz4
        @NotNull
        public final kr5 f(@NotNull uv5 uv5Var, @Nullable br5 br5Var, long j) {
            c25.p(uv5Var, "$this$asResponseBody");
            return new a(uv5Var, br5Var, j);
        }

        @fz4(name = "create")
        @jz4
        @NotNull
        public final kr5 g(@NotNull vv5 vv5Var, @Nullable br5 br5Var) {
            c25.p(vv5Var, "$this$toResponseBody");
            return f(new sv5().y1(vv5Var), br5Var, vv5Var.C3());
        }

        @fz4(name = "create")
        @jz4
        @NotNull
        public final kr5 h(@NotNull byte[] bArr, @Nullable br5 br5Var) {
            c25.p(bArr, "$this$toResponseBody");
            return f(new sv5().w1(bArr), br5Var, bArr.length);
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private final Charset f() {
        Charset f;
        br5 k = k();
        return (k == null || (f = k.f(f85.b)) == null) ? f85.b : f;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T h(f05<? super uv5, ? extends T> f05Var, f05<? super T, Integer> f05Var2) {
        long j = j();
        if (j <= Integer.MAX_VALUE) {
            uv5 A = A();
            try {
                T M = f05Var.M(A);
                z15.d(1);
                ux4.a(A, null);
                z15.c(1);
                int intValue = f05Var2.M(M).intValue();
                if (j == -1 || j == intValue) {
                    return M;
                }
                throw new IOException("Content-Length (" + j + ") and stream length (" + intValue + ") disagree");
            } finally {
            }
        } else {
            throw new IOException(wo1.p("Cannot buffer entire body for content length: ", j));
        }
    }

    @fz4(name = "create")
    @jz4
    @NotNull
    public static final kr5 l(@NotNull String str, @Nullable br5 br5Var) {
        return s.a(str, br5Var);
    }

    @jz4
    @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @NotNull
    public static final kr5 m(@Nullable br5 br5Var, long j, @NotNull uv5 uv5Var) {
        return s.b(br5Var, j, uv5Var);
    }

    @jz4
    @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @NotNull
    public static final kr5 q(@Nullable br5 br5Var, @NotNull String str) {
        return s.c(br5Var, str);
    }

    @jz4
    @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @NotNull
    public static final kr5 r(@Nullable br5 br5Var, @NotNull vv5 vv5Var) {
        return s.d(br5Var, vv5Var);
    }

    @jz4
    @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @NotNull
    public static final kr5 s(@Nullable br5 br5Var, @NotNull byte[] bArr) {
        return s.e(br5Var, bArr);
    }

    @fz4(name = "create")
    @jz4
    @NotNull
    public static final kr5 v(@NotNull uv5 uv5Var, @Nullable br5 br5Var, long j) {
        return s.f(uv5Var, br5Var, j);
    }

    @fz4(name = "create")
    @jz4
    @NotNull
    public static final kr5 w(@NotNull vv5 vv5Var, @Nullable br5 br5Var) {
        return s.g(vv5Var, br5Var);
    }

    @fz4(name = "create")
    @jz4
    @NotNull
    public static final kr5 z(@NotNull byte[] bArr, @Nullable br5 br5Var) {
        return s.h(bArr, br5Var);
    }

    @NotNull
    public abstract uv5 A();

    @NotNull
    public final String E() throws IOException {
        uv5 A = A();
        try {
            String R0 = A.R0(sr5.P(A, f()));
            ux4.a(A, null);
            return R0;
        } finally {
        }
    }

    @NotNull
    public final InputStream a() {
        return A().W1();
    }

    @NotNull
    public final vv5 b() throws IOException {
        long j = j();
        if (j <= Integer.MAX_VALUE) {
            uv5 A = A();
            try {
                vv5 f1 = A.f1();
                ux4.a(A, null);
                int C3 = f1.C3();
                if (j == -1 || j == C3) {
                    return f1;
                }
                throw new IOException("Content-Length (" + j + ") and stream length (" + C3 + ") disagree");
            } finally {
            }
        } else {
            throw new IOException(wo1.p("Cannot buffer entire body for content length: ", j));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        sr5.l(A());
    }

    @NotNull
    public final byte[] d() throws IOException {
        long j = j();
        if (j <= Integer.MAX_VALUE) {
            uv5 A = A();
            try {
                byte[] b0 = A.b0();
                ux4.a(A, null);
                int length = b0.length;
                if (j == -1 || j == length) {
                    return b0;
                }
                throw new IOException("Content-Length (" + j + ") and stream length (" + length + ") disagree");
            } finally {
            }
        } else {
            throw new IOException(wo1.p("Cannot buffer entire body for content length: ", j));
        }
    }

    @NotNull
    public final Reader e() {
        Reader reader = this.t;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(A(), f());
        this.t = aVar;
        return aVar;
    }

    public abstract long j();

    @Nullable
    public abstract br5 k();
}