package com.p7700g.p99005;

import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.security.MessageDigest;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import org.jetbrains.annotations.NotNull;

@vo4(bv = {1, 0, 3}, d1 = {"com/p7700g/p99005/kw5", "com/p7700g/p99005/lw5"}, d2 = {}, k = 4, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class jw5 {
    @NotNull
    public static final vw5 a(@NotNull File file) throws FileNotFoundException {
        return kw5.b(file);
    }

    @fz4(name = "blackhole")
    @NotNull
    public static final vw5 b() {
        return lw5.a();
    }

    @NotNull
    public static final tv5 c(@NotNull vw5 vw5Var) {
        return lw5.b(vw5Var);
    }

    @NotNull
    public static final uv5 d(@NotNull xw5 xw5Var) {
        return lw5.c(xw5Var);
    }

    @NotNull
    public static final wv5 e(@NotNull vw5 vw5Var, @NotNull Cipher cipher) {
        return kw5.c(vw5Var, cipher);
    }

    @NotNull
    public static final xv5 f(@NotNull xw5 xw5Var, @NotNull Cipher cipher) {
        return kw5.d(xw5Var, cipher);
    }

    @NotNull
    public static final fw5 g(@NotNull vw5 vw5Var, @NotNull MessageDigest messageDigest) {
        return kw5.f(vw5Var, messageDigest);
    }

    @NotNull
    public static final fw5 h(@NotNull vw5 vw5Var, @NotNull Mac mac) {
        return kw5.g(vw5Var, mac);
    }

    @NotNull
    public static final gw5 i(@NotNull xw5 xw5Var, @NotNull MessageDigest messageDigest) {
        return kw5.h(xw5Var, messageDigest);
    }

    @NotNull
    public static final gw5 j(@NotNull xw5 xw5Var, @NotNull Mac mac) {
        return kw5.i(xw5Var, mac);
    }

    public static final boolean k(@NotNull AssertionError assertionError) {
        return kw5.j(assertionError);
    }

    @gz4
    @NotNull
    public static final vw5 l(@NotNull File file) throws FileNotFoundException {
        return kw5.p(file, false, 1, null);
    }

    @gz4
    @NotNull
    public static final vw5 m(@NotNull File file, boolean z) throws FileNotFoundException {
        return kw5.l(file, z);
    }

    @NotNull
    public static final vw5 n(@NotNull OutputStream outputStream) {
        return kw5.m(outputStream);
    }

    @NotNull
    public static final vw5 o(@NotNull Socket socket) throws IOException {
        return kw5.n(socket);
    }

    @IgnoreJRERequirement
    @NotNull
    public static final vw5 p(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        return kw5.o(path, openOptionArr);
    }

    @NotNull
    public static final xw5 r(@NotNull File file) throws FileNotFoundException {
        return kw5.q(file);
    }

    @NotNull
    public static final xw5 s(@NotNull InputStream inputStream) {
        return kw5.r(inputStream);
    }

    @NotNull
    public static final xw5 t(@NotNull Socket socket) throws IOException {
        return kw5.s(socket);
    }

    @IgnoreJRERequirement
    @NotNull
    public static final xw5 u(@NotNull Path path, @NotNull OpenOption... openOptionArr) throws IOException {
        return kw5.t(path, openOptionArr);
    }

    public static final <T extends Closeable, R> R v(T t, @NotNull f05<? super T, ? extends R> f05Var) {
        return (R) lw5.d(t, f05Var);
    }
}