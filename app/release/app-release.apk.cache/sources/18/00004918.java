package com.p7700g.p99005;

import com.p7700g.p99005.br5;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RequestBody.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b&\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/p7700g/p99005/ir5;", "", "Lcom/p7700g/p99005/br5;", "b", "()Lcom/p7700g/p99005/br5;", "", "a", "()J", "Lcom/p7700g/p99005/tv5;", "sink", "Lcom/p7700g/p99005/yq4;", "r", "(Lcom/p7700g/p99005/tv5;)V", "", "p", "()Z", "q", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public abstract class ir5 {
    public static final a a = new a(null);

    /* compiled from: RequestBody.kt */
    @vo4(bv = {1, 0, 3}, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u0005*\u00020\u00112\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u0019\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"com/p7700g/p99005/ir5$a", "", "", "Lcom/p7700g/p99005/br5;", "contentType", "Lcom/p7700g/p99005/ir5;", "b", "(Ljava/lang/String;Lcom/p7700g/p99005/br5;)Lcom/p7700g/p99005/ir5;", "Lcom/p7700g/p99005/vv5;", "i", "(Lcom/p7700g/p99005/vv5;Lcom/p7700g/p99005/br5;)Lcom/p7700g/p99005/ir5;", "", "", "offset", "byteCount", com.anythink.expressad.d.a.b.dH, "([BLcom/p7700g/p99005/br5;II)Lcom/p7700g/p99005/ir5;", "Ljava/io/File;", "a", "(Ljava/io/File;Lcom/p7700g/p99005/br5;)Lcom/p7700g/p99005/ir5;", "content", "d", "(Lcom/p7700g/p99005/br5;Ljava/lang/String;)Lcom/p7700g/p99005/ir5;", "e", "(Lcom/p7700g/p99005/br5;Lcom/p7700g/p99005/vv5;)Lcom/p7700g/p99005/ir5;", "h", "(Lcom/p7700g/p99005/br5;[BII)Lcom/p7700g/p99005/ir5;", o31.b, "c", "(Lcom/p7700g/p99005/br5;Ljava/io/File;)Lcom/p7700g/p99005/ir5;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes3.dex */
    public static final class a {

        /* compiled from: RequestBody.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/p7700g/p99005/ir5$a$a", "Lcom/p7700g/p99005/ir5;", "Lcom/p7700g/p99005/br5;", "b", "()Lcom/p7700g/p99005/br5;", "", "a", "()J", "Lcom/p7700g/p99005/tv5;", "sink", "Lcom/p7700g/p99005/yq4;", "r", "(Lcom/p7700g/p99005/tv5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* renamed from: com.p7700g.p99005.ir5$a$a */
        /* loaded from: classes3.dex */
        public static final class C0197a extends ir5 {
            public final /* synthetic */ File b;
            public final /* synthetic */ br5 c;

            public C0197a(File file, br5 br5Var) {
                this.b = file;
                this.c = br5Var;
            }

            @Override // com.p7700g.p99005.ir5
            public long a() {
                return this.b.length();
            }

            @Override // com.p7700g.p99005.ir5
            @Nullable
            public br5 b() {
                return this.c;
            }

            @Override // com.p7700g.p99005.ir5
            public void r(@NotNull tv5 tv5Var) {
                c25.p(tv5Var, "sink");
                xw5 r = jw5.r(this.b);
                try {
                    tv5Var.b1(r);
                    ux4.a(r, null);
                } finally {
                }
            }
        }

        /* compiled from: RequestBody.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/p7700g/p99005/ir5$a$b", "Lcom/p7700g/p99005/ir5;", "Lcom/p7700g/p99005/br5;", "b", "()Lcom/p7700g/p99005/br5;", "", "a", "()J", "Lcom/p7700g/p99005/tv5;", "sink", "Lcom/p7700g/p99005/yq4;", "r", "(Lcom/p7700g/p99005/tv5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class b extends ir5 {
            public final /* synthetic */ vv5 b;
            public final /* synthetic */ br5 c;

            public b(vv5 vv5Var, br5 br5Var) {
                this.b = vv5Var;
                this.c = br5Var;
            }

            @Override // com.p7700g.p99005.ir5
            public long a() {
                return this.b.C3();
            }

            @Override // com.p7700g.p99005.ir5
            @Nullable
            public br5 b() {
                return this.c;
            }

            @Override // com.p7700g.p99005.ir5
            public void r(@NotNull tv5 tv5Var) {
                c25.p(tv5Var, "sink");
                tv5Var.y1(this.b);
            }
        }

        /* compiled from: RequestBody.kt */
        @vo4(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/p7700g/p99005/ir5$a$c", "Lcom/p7700g/p99005/ir5;", "Lcom/p7700g/p99005/br5;", "b", "()Lcom/p7700g/p99005/br5;", "", "a", "()J", "Lcom/p7700g/p99005/tv5;", "sink", "Lcom/p7700g/p99005/yq4;", "r", "(Lcom/p7700g/p99005/tv5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
        /* loaded from: classes3.dex */
        public static final class c extends ir5 {
            public final /* synthetic */ byte[] b;
            public final /* synthetic */ br5 c;
            public final /* synthetic */ int d;
            public final /* synthetic */ int e;

            public c(byte[] bArr, br5 br5Var, int i, int i2) {
                this.b = bArr;
                this.c = br5Var;
                this.d = i;
                this.e = i2;
            }

            @Override // com.p7700g.p99005.ir5
            public long a() {
                return this.d;
            }

            @Override // com.p7700g.p99005.ir5
            @Nullable
            public br5 b() {
                return this.c;
            }

            @Override // com.p7700g.p99005.ir5
            public void r(@NotNull tv5 tv5Var) {
                c25.p(tv5Var, "sink");
                tv5Var.V0(this.b, this.e, this.d);
            }
        }

        private a() {
        }

        public static /* synthetic */ ir5 n(a aVar, File file, br5 br5Var, int i, Object obj) {
            if ((i & 1) != 0) {
                br5Var = null;
            }
            return aVar.a(file, br5Var);
        }

        public static /* synthetic */ ir5 o(a aVar, String str, br5 br5Var, int i, Object obj) {
            if ((i & 1) != 0) {
                br5Var = null;
            }
            return aVar.b(str, br5Var);
        }

        public static /* synthetic */ ir5 p(a aVar, br5 br5Var, byte[] bArr, int i, int i2, int i3, Object obj) {
            if ((i3 & 4) != 0) {
                i = 0;
            }
            if ((i3 & 8) != 0) {
                i2 = bArr.length;
            }
            return aVar.h(br5Var, bArr, i, i2);
        }

        public static /* synthetic */ ir5 q(a aVar, vv5 vv5Var, br5 br5Var, int i, Object obj) {
            if ((i & 1) != 0) {
                br5Var = null;
            }
            return aVar.i(vv5Var, br5Var);
        }

        public static /* synthetic */ ir5 r(a aVar, byte[] bArr, br5 br5Var, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                br5Var = null;
            }
            if ((i3 & 2) != 0) {
                i = 0;
            }
            if ((i3 & 4) != 0) {
                i2 = bArr.length;
            }
            return aVar.m(bArr, br5Var, i, i2);
        }

        @fz4(name = "create")
        @jz4
        @NotNull
        public final ir5 a(@NotNull File file, @Nullable br5 br5Var) {
            c25.p(file, "$this$asRequestBody");
            return new C0197a(file, br5Var);
        }

        @fz4(name = "create")
        @jz4
        @NotNull
        public final ir5 b(@NotNull String str, @Nullable br5 br5Var) {
            c25.p(str, "$this$toRequestBody");
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
            byte[] bytes = str.getBytes(charset);
            c25.o(bytes, "(this as java.lang.String).getBytes(charset)");
            return m(bytes, br5Var, 0, bytes.length);
        }

        @jz4
        @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @op4(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @NotNull
        public final ir5 c(@Nullable br5 br5Var, @NotNull File file) {
            c25.p(file, o31.b);
            return a(file, br5Var);
        }

        @jz4
        @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        public final ir5 d(@Nullable br5 br5Var, @NotNull String str) {
            c25.p(str, "content");
            return b(str, br5Var);
        }

        @jz4
        @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        public final ir5 e(@Nullable br5 br5Var, @NotNull vv5 vv5Var) {
            c25.p(vv5Var, "content");
            return i(vv5Var, br5Var);
        }

        @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        @gz4
        @jz4
        public final ir5 f(@Nullable br5 br5Var, @NotNull byte[] bArr) {
            return p(this, br5Var, bArr, 0, 0, 12, null);
        }

        @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        @gz4
        @jz4
        public final ir5 g(@Nullable br5 br5Var, @NotNull byte[] bArr, int i) {
            return p(this, br5Var, bArr, i, 0, 8, null);
        }

        @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @NotNull
        @gz4
        @jz4
        public final ir5 h(@Nullable br5 br5Var, @NotNull byte[] bArr, int i, int i2) {
            c25.p(bArr, "content");
            return m(bArr, br5Var, i, i2);
        }

        @fz4(name = "create")
        @jz4
        @NotNull
        public final ir5 i(@NotNull vv5 vv5Var, @Nullable br5 br5Var) {
            c25.p(vv5Var, "$this$toRequestBody");
            return new b(vv5Var, br5Var);
        }

        @NotNull
        @gz4
        @fz4(name = "create")
        @jz4
        public final ir5 j(@NotNull byte[] bArr) {
            return r(this, bArr, null, 0, 0, 7, null);
        }

        @NotNull
        @gz4
        @fz4(name = "create")
        @jz4
        public final ir5 k(@NotNull byte[] bArr, @Nullable br5 br5Var) {
            return r(this, bArr, br5Var, 0, 0, 6, null);
        }

        @NotNull
        @gz4
        @fz4(name = "create")
        @jz4
        public final ir5 l(@NotNull byte[] bArr, @Nullable br5 br5Var, int i) {
            return r(this, bArr, br5Var, i, 0, 4, null);
        }

        @NotNull
        @gz4
        @fz4(name = "create")
        @jz4
        public final ir5 m(@NotNull byte[] bArr, @Nullable br5 br5Var, int i, int i2) {
            c25.p(bArr, "$this$toRequestBody");
            sr5.k(bArr.length, i, i2);
            return new c(bArr, br5Var, i2, i);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @fz4(name = "create")
    @jz4
    @NotNull
    public static final ir5 c(@NotNull File file, @Nullable br5 br5Var) {
        return a.a(file, br5Var);
    }

    @fz4(name = "create")
    @jz4
    @NotNull
    public static final ir5 d(@NotNull String str, @Nullable br5 br5Var) {
        return a.b(str, br5Var);
    }

    @jz4
    @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @op4(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @NotNull
    public static final ir5 e(@Nullable br5 br5Var, @NotNull File file) {
        return a.c(br5Var, file);
    }

    @jz4
    @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    public static final ir5 f(@Nullable br5 br5Var, @NotNull String str) {
        return a.d(br5Var, str);
    }

    @jz4
    @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    public static final ir5 g(@Nullable br5 br5Var, @NotNull vv5 vv5Var) {
        return a.e(br5Var, vv5Var);
    }

    @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    @gz4
    @jz4
    public static final ir5 h(@Nullable br5 br5Var, @NotNull byte[] bArr) {
        return a.p(a, br5Var, bArr, 0, 0, 12, null);
    }

    @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    @gz4
    @jz4
    public static final ir5 i(@Nullable br5 br5Var, @NotNull byte[] bArr, int i) {
        return a.p(a, br5Var, bArr, i, 0, 8, null);
    }

    @xn4(level = zn4.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @op4(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @NotNull
    @gz4
    @jz4
    public static final ir5 j(@Nullable br5 br5Var, @NotNull byte[] bArr, int i, int i2) {
        return a.h(br5Var, bArr, i, i2);
    }

    @fz4(name = "create")
    @jz4
    @NotNull
    public static final ir5 k(@NotNull vv5 vv5Var, @Nullable br5 br5Var) {
        return a.i(vv5Var, br5Var);
    }

    @NotNull
    @gz4
    @fz4(name = "create")
    @jz4
    public static final ir5 l(@NotNull byte[] bArr) {
        return a.r(a, bArr, null, 0, 0, 7, null);
    }

    @NotNull
    @gz4
    @fz4(name = "create")
    @jz4
    public static final ir5 m(@NotNull byte[] bArr, @Nullable br5 br5Var) {
        return a.r(a, bArr, br5Var, 0, 0, 6, null);
    }

    @NotNull
    @gz4
    @fz4(name = "create")
    @jz4
    public static final ir5 n(@NotNull byte[] bArr, @Nullable br5 br5Var, int i) {
        return a.r(a, bArr, br5Var, i, 0, 4, null);
    }

    @NotNull
    @gz4
    @fz4(name = "create")
    @jz4
    public static final ir5 o(@NotNull byte[] bArr, @Nullable br5 br5Var, int i, int i2) {
        return a.m(bArr, br5Var, i, i2);
    }

    public long a() throws IOException {
        return -1L;
    }

    @Nullable
    public abstract br5 b();

    public boolean p() {
        return false;
    }

    public boolean q() {
        return false;
    }

    public abstract void r(@NotNull tv5 tv5Var) throws IOException;
}