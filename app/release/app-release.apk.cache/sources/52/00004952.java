package com.p7700g.p99005;

import com.p7700g.p99005.rs2;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* compiled from: -DeprecatedOkio.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0006J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0004H\u0007¢\u0006\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/p7700g/p99005/iv5;", "", "Ljava/io/File;", o31.b, "Lcom/p7700g/p99005/vw5;", "a", "(Ljava/io/File;)Lcom/p7700g/p99005/vw5;", "sink", "Lcom/p7700g/p99005/tv5;", "c", "(Lcom/p7700g/p99005/vw5;)Lcom/p7700g/p99005/tv5;", "Lcom/p7700g/p99005/xw5;", rs2.f.b, "Lcom/p7700g/p99005/uv5;", "d", "(Lcom/p7700g/p99005/xw5;)Lcom/p7700g/p99005/uv5;", "e", "Ljava/io/OutputStream;", "outputStream", "f", "(Ljava/io/OutputStream;)Lcom/p7700g/p99005/vw5;", "Ljava/nio/file/Path;", la1.k, "", "Ljava/nio/file/OpenOption;", "options", "h", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lcom/p7700g/p99005/vw5;", "Ljava/net/Socket;", "socket", com.anythink.basead.d.g.i, "(Ljava/net/Socket;)Lcom/p7700g/p99005/vw5;", "i", "(Ljava/io/File;)Lcom/p7700g/p99005/xw5;", "Ljava/io/InputStream;", "inputStream", "j", "(Ljava/io/InputStream;)Lcom/p7700g/p99005/xw5;", "l", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lcom/p7700g/p99005/xw5;", "k", "(Ljava/net/Socket;)Lcom/p7700g/p99005/xw5;", "b", "()Lcom/p7700g/p99005/vw5;", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 1})
@xn4(message = "changed in Okio 2.x")
/* loaded from: classes3.dex */
public final class iv5 {
    @NotNull
    public static final iv5 a = new iv5();

    private iv5() {
    }

    @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "file.appendingSink()", imports = {"okio.appendingSink"}))
    @NotNull
    public final vw5 a(@NotNull File file) {
        c25.p(file, o31.b);
        return jw5.a(file);
    }

    @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "blackholeSink()", imports = {"okio.blackholeSink"}))
    @NotNull
    public final vw5 b() {
        return jw5.b();
    }

    @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "sink.buffer()", imports = {"okio.buffer"}))
    @NotNull
    public final tv5 c(@NotNull vw5 vw5Var) {
        c25.p(vw5Var, "sink");
        return jw5.c(vw5Var);
    }

    @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "source.buffer()", imports = {"okio.buffer"}))
    @NotNull
    public final uv5 d(@NotNull xw5 xw5Var) {
        c25.p(xw5Var, rs2.f.b);
        return jw5.d(xw5Var);
    }

    @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "file.sink()", imports = {"okio.sink"}))
    @NotNull
    public final vw5 e(@NotNull File file) {
        c25.p(file, o31.b);
        return kw5.p(file, false, 1, null);
    }

    @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "outputStream.sink()", imports = {"okio.sink"}))
    @NotNull
    public final vw5 f(@NotNull OutputStream outputStream) {
        c25.p(outputStream, "outputStream");
        return jw5.n(outputStream);
    }

    @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "socket.sink()", imports = {"okio.sink"}))
    @NotNull
    public final vw5 g(@NotNull Socket socket) {
        c25.p(socket, "socket");
        return jw5.o(socket);
    }

    @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "path.sink(*options)", imports = {"okio.sink"}))
    @NotNull
    public final vw5 h(@NotNull Path path, @NotNull OpenOption... openOptionArr) {
        c25.p(path, la1.k);
        c25.p(openOptionArr, "options");
        return jw5.p(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "file.source()", imports = {"okio.source"}))
    @NotNull
    public final xw5 i(@NotNull File file) {
        c25.p(file, o31.b);
        return jw5.r(file);
    }

    @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "inputStream.source()", imports = {"okio.source"}))
    @NotNull
    public final xw5 j(@NotNull InputStream inputStream) {
        c25.p(inputStream, "inputStream");
        return jw5.s(inputStream);
    }

    @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "socket.source()", imports = {"okio.source"}))
    @NotNull
    public final xw5 k(@NotNull Socket socket) {
        c25.p(socket, "socket");
        return jw5.t(socket);
    }

    @xn4(level = zn4.ERROR, message = "moved to extension function", replaceWith = @op4(expression = "path.source(*options)", imports = {"okio.source"}))
    @NotNull
    public final xw5 l(@NotNull Path path, @NotNull OpenOption... openOptionArr) {
        c25.p(path, la1.k);
        c25.p(openOptionArr, "options");
        return jw5.u(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }
}