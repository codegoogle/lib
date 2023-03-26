package com.p7700g.p99005;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

/* compiled from: JvmOkio.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\t\u001a\u00020\u0001*\u00020\b¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\u000b\u001a\u00020\u0005*\u00020\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u0001*\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0001*\u00020\r¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0014\u001a\u00020\u0005*\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u001a\u001a\u00020\u0001*\u00020\u00162\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a'\u0010\u001c\u001a\u00020\u0005*\u00020\u00162\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010!\u001a\u00020 *\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"\u001a\u0019\u0010$\u001a\u00020#*\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b$\u0010%\u001a\u0019\u0010)\u001a\u00020(*\u00020\u00012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010,\u001a\u00020+*\u00020\u00052\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b,\u0010-\u001a\u0019\u00100\u001a\u00020(*\u00020\u00012\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101\u001a\u0019\u00102\u001a\u00020+*\u00020\u00052\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b2\u00103\"$\u0010:\u001a\n 5*\u0004\u0018\u000104048\u0002@\u0002X\u0082\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u001e\u0010?\u001a\u00020\u000e*\u00060;j\u0002`<8@@\u0000X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Ljava/io/OutputStream;", "Lcom/p7700g/p99005/vw5;", com.anythink.expressad.d.a.b.dH, "(Ljava/io/OutputStream;)Lcom/p7700g/p99005/vw5;", "Ljava/io/InputStream;", "Lcom/p7700g/p99005/xw5;", "r", "(Ljava/io/InputStream;)Lcom/p7700g/p99005/xw5;", "Ljava/net/Socket;", "n", "(Ljava/net/Socket;)Lcom/p7700g/p99005/vw5;", "s", "(Ljava/net/Socket;)Lcom/p7700g/p99005/xw5;", "Ljava/io/File;", "", "append", "l", "(Ljava/io/File;Z)Lcom/p7700g/p99005/vw5;", "b", "(Ljava/io/File;)Lcom/p7700g/p99005/vw5;", "q", "(Ljava/io/File;)Lcom/p7700g/p99005/xw5;", "Ljava/nio/file/Path;", "", "Ljava/nio/file/OpenOption;", "options", ij3.b, "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lcom/p7700g/p99005/vw5;", "t", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Lcom/p7700g/p99005/xw5;", "Ljavax/crypto/Cipher;", "cipher", "Lcom/p7700g/p99005/wv5;", "c", "(Lcom/p7700g/p99005/vw5;Ljavax/crypto/Cipher;)Lcom/p7700g/p99005/wv5;", "Lcom/p7700g/p99005/xv5;", "d", "(Lcom/p7700g/p99005/xw5;Ljavax/crypto/Cipher;)Lcom/p7700g/p99005/xv5;", "Ljavax/crypto/Mac;", "mac", "Lcom/p7700g/p99005/fw5;", com.anythink.basead.d.g.i, "(Lcom/p7700g/p99005/vw5;Ljavax/crypto/Mac;)Lcom/p7700g/p99005/fw5;", "Lcom/p7700g/p99005/gw5;", "i", "(Lcom/p7700g/p99005/xw5;Ljavax/crypto/Mac;)Lcom/p7700g/p99005/gw5;", "Ljava/security/MessageDigest;", "digest", "f", "(Lcom/p7700g/p99005/vw5;Ljava/security/MessageDigest;)Lcom/p7700g/p99005/fw5;", "h", "(Lcom/p7700g/p99005/xw5;Ljava/security/MessageDigest;)Lcom/p7700g/p99005/gw5;", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "a", "Ljava/util/logging/Logger;", "e", "()Ljava/util/logging/Logger;", "logger", "Ljava/lang/AssertionError;", "Lkotlin/AssertionError;", "j", "(Ljava/lang/AssertionError;)Z", "isAndroidGetsocknameError", "okio"}, k = 5, mv = {1, 4, 1}, xs = "okio/Okio")
/* loaded from: classes3.dex */
public final /* synthetic */ class kw5 {
    private static final Logger a = Logger.getLogger("okio.Okio");

    @NotNull
    public static final vw5 b(@NotNull File file) throws FileNotFoundException {
        c25.p(file, "$this$appendingSink");
        return jw5.n(new FileOutputStream(file, true));
    }

    @NotNull
    public static final wv5 c(@NotNull vw5 vw5Var, @NotNull Cipher cipher) {
        c25.p(vw5Var, "$this$cipherSink");
        c25.p(cipher, "cipher");
        return new wv5(jw5.c(vw5Var), cipher);
    }

    @NotNull
    public static final xv5 d(@NotNull xw5 xw5Var, @NotNull Cipher cipher) {
        c25.p(xw5Var, "$this$cipherSource");
        c25.p(cipher, "cipher");
        return new xv5(jw5.d(xw5Var), cipher);
    }

    private static final Logger e() {
        return a;
    }

    @NotNull
    public static final fw5 f(@NotNull vw5 vw5Var, @NotNull MessageDigest messageDigest) {
        c25.p(vw5Var, "$this$hashingSink");
        c25.p(messageDigest, "digest");
        return new fw5(vw5Var, messageDigest);
    }

    @NotNull
    public static final fw5 g(@NotNull vw5 vw5Var, @NotNull Mac mac) {
        c25.p(vw5Var, "$this$hashingSink");
        c25.p(mac, "mac");
        return new fw5(vw5Var, mac);
    }

    @NotNull
    public static final gw5 h(@NotNull xw5 xw5Var, @NotNull MessageDigest messageDigest) {
        c25.p(xw5Var, "$this$hashingSource");
        c25.p(messageDigest, "digest");
        return new gw5(xw5Var, messageDigest);
    }

    @NotNull
    public static final gw5 i(@NotNull xw5 xw5Var, @NotNull Mac mac) {
        c25.p(xw5Var, "$this$hashingSource");
        c25.p(mac, "mac");
        return new gw5(xw5Var, mac);
    }

    public static final boolean j(@NotNull AssertionError assertionError) {
        c25.p(assertionError, "$this$isAndroidGetsocknameError");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            return message != null ? c95.V2(message, "getsockname failed", false, 2, null) : false;
        }
        return false;
    }

    @gz4
    @NotNull
    public static final vw5 k(@NotNull File file) throws FileNotFoundException {
        return p(file, false, 1, null);
    }

    @gz4
    @NotNull
    public static final vw5 l(@NotNull File file, boolean z) throws FileNotFoundException {
        c25.p(file, "$this$sink");
        return jw5.n(new FileOutputStream(file, z));
    }

    @NotNull
    public static final vw5 m(@NotNull OutputStream outputStream) {
        c25.p(outputStream, "$this$sink");
        return new nw5(outputStream, new zw5());
    }

    @NotNull
    public static final vw5 n(@NotNull Socket socket) throws IOException {
        c25.p(socket, "$this$sink");
        ww5 ww5Var = new ww5(socket);
        OutputStream outputStream = socket.getOutputStream();
        c25.o(outputStream, "getOutputStream()");
        return ww5Var.B(new nw5(outputStream, ww5Var));
    }

    @IgnoreJRERequirement
    @NotNull
    public static final vw5 o(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        c25.p(path, "$this$sink");
        c25.p(openOptionArr, "options");
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        c25.o(newOutputStream, "Files.newOutputStream(this, *options)");
        return jw5.n(newOutputStream);
    }

    public static /* synthetic */ vw5 p(File file, boolean z, int i, Object obj) throws FileNotFoundException {
        if ((i & 1) != 0) {
            z = false;
        }
        return jw5.m(file, z);
    }

    @NotNull
    public static final xw5 q(@NotNull File file) throws FileNotFoundException {
        c25.p(file, "$this$source");
        return jw5.s(new FileInputStream(file));
    }

    @NotNull
    public static final xw5 r(@NotNull InputStream inputStream) {
        c25.p(inputStream, "$this$source");
        return new iw5(inputStream, new zw5());
    }

    @NotNull
    public static final xw5 s(@NotNull Socket socket) throws IOException {
        c25.p(socket, "$this$source");
        ww5 ww5Var = new ww5(socket);
        InputStream inputStream = socket.getInputStream();
        c25.o(inputStream, "getInputStream()");
        return ww5Var.C(new iw5(inputStream, ww5Var));
    }

    @IgnoreJRERequirement
    @NotNull
    public static final xw5 t(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        c25.p(path, "$this$source");
        c25.p(openOptionArr, "options");
        InputStream newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        c25.o(newInputStream, "Files.newInputStream(this, *options)");
        return jw5.s(newInputStream);
    }
}