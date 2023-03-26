package com.p7700g.p99005;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: PathReadWrite.kt */
@vo4(d1 = {"\u0000\u0082\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a%\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a%\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u001e\u0010\f\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a:\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\u0015\u001a:\u0010\u0016\u001a\u00020\u0017*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\u0018\u001a=\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2!\u0010\u001a\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\u00010\u001bH\u0087\bø\u0001\u0000\u001a&\u0010 \u001a\u00020!*\u00020\u00022\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010\"\u001a&\u0010#\u001a\u00020$*\u00020\u00022\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010%\u001a\r\u0010&\u001a\u00020\u0004*\u00020\u0002H\u0087\b\u001a\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001c0(*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0087\b\u001a\u0016\u0010)\u001a\u00020\u001c*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a0\u0010*\u001a\u00020+*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010,\u001a?\u0010-\u001a\u0002H.\"\u0004\b\u0000\u0010.*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0018\u0010/\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u000b\u0012\u0004\u0012\u0002H.0\u001bH\u0087\bø\u0001\u0000¢\u0006\u0002\u00100\u001a.\u00101\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00102\u001a>\u00103\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00104\u001a>\u00103\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u00105\u001a7\u00106\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0007¢\u0006\u0002\u00107\u001a0\u00108\u001a\u000209*\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\n2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0087\b¢\u0006\u0002\u0010:\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006;"}, d2 = {"appendBytes", "", "Ljava/nio/file/Path;", "array", "", "appendLines", "lines", "", "", "charset", "Ljava/nio/charset/Charset;", "Lkotlin/sequences/Sequence;", "appendText", "text", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "options", "", "Ljava/nio/file/OpenOption;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedReader;", "bufferedWriter", "Ljava/io/BufferedWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;I[Ljava/nio/file/OpenOption;)Ljava/io/BufferedWriter;", "forEachLine", "action", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "line", "inputStream", "Ljava/io/InputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;", "outputStream", "Ljava/io/OutputStream;", "(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStream;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/InputStreamReader;", "useLines", "T", "block", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "writeBytes", "(Ljava/nio/file/Path;[B[Ljava/nio/file/OpenOption;)V", "writeLines", "(Ljava/nio/file/Path;Ljava/lang/Iterable;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "(Ljava/nio/file/Path;Lkotlin/sequences/Sequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/nio/file/Path;", "writeText", "(Ljava/nio/file/Path;Ljava/lang/CharSequence;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)V", "writer", "Ljava/io/OutputStreamWriter;", "(Ljava/nio/file/Path;Ljava/nio/charset/Charset;[Ljava/nio/file/OpenOption;)Ljava/io/OutputStreamWriter;", "kotlin-stdlib-jdk7"}, k = 5, mv = {1, 6, 0}, xi = 49, xs = "kotlin/io/path/PathsKt")
/* loaded from: classes3.dex */
public class uy4 {
    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path A(Path path, g75<? extends CharSequence> g75Var, Charset charset, OpenOption... openOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(g75Var, "lines");
        c25.p(charset, "charset");
        c25.p(openOptionArr, "options");
        Path write = Files.write(path, o75.N(g75Var), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        c25.o(write, "write(this, lines.asIterable(), charset, *options)");
        return write;
    }

    public static /* synthetic */ Path B(Path path, Iterable iterable, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = f85.b;
        }
        c25.p(path, "<this>");
        c25.p(iterable, "lines");
        c25.p(charset, "charset");
        c25.p(openOptionArr, "options");
        Path write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        c25.o(write, "write(this, lines, charset, *options)");
        return write;
    }

    public static /* synthetic */ Path C(Path path, g75 g75Var, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = f85.b;
        }
        c25.p(path, "<this>");
        c25.p(g75Var, "lines");
        c25.p(charset, "charset");
        c25.p(openOptionArr, "options");
        Path write = Files.write(path, o75.N(g75Var), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        c25.o(write, "write(this, lines.asIterable(), charset, *options)");
        return write;
    }

    @dr4(markerClass = {ry4.class})
    @tp4(version = "1.5")
    public static final void D(@NotNull Path path, @NotNull CharSequence charSequence, @NotNull Charset charset, @NotNull OpenOption... openOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(charSequence, "text");
        c25.p(charset, "charset");
        c25.p(openOptionArr, "options");
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        c25.o(newOutputStream, "newOutputStream(this, *options)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(newOutputStream, charset);
        try {
            outputStreamWriter.append(charSequence);
            ux4.a(outputStreamWriter, null);
        } finally {
        }
    }

    public static /* synthetic */ void E(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = f85.b;
        }
        D(path, charSequence, charset, openOptionArr);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final OutputStreamWriter F(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(charset, "charset");
        c25.p(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    public static /* synthetic */ OutputStreamWriter G(Path path, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        c25.p(path, "<this>");
        c25.p(charset, "charset");
        c25.p(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final void a(Path path, byte[] bArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(bArr, "array");
        Files.write(path, bArr, StandardOpenOption.APPEND);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path b(Path path, Iterable<? extends CharSequence> iterable, Charset charset) throws IOException {
        c25.p(path, "<this>");
        c25.p(iterable, "lines");
        c25.p(charset, "charset");
        Path write = Files.write(path, iterable, charset, StandardOpenOption.APPEND);
        c25.o(write, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return write;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path c(Path path, g75<? extends CharSequence> g75Var, Charset charset) throws IOException {
        c25.p(path, "<this>");
        c25.p(g75Var, "lines");
        c25.p(charset, "charset");
        Path write = Files.write(path, o75.N(g75Var), charset, StandardOpenOption.APPEND);
        c25.o(write, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return write;
    }

    public static /* synthetic */ Path d(Path path, Iterable iterable, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = f85.b;
        }
        c25.p(path, "<this>");
        c25.p(iterable, "lines");
        c25.p(charset, "charset");
        Path write = Files.write(path, iterable, charset, StandardOpenOption.APPEND);
        c25.o(write, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return write;
    }

    public static /* synthetic */ Path e(Path path, g75 g75Var, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = f85.b;
        }
        c25.p(path, "<this>");
        c25.p(g75Var, "lines");
        c25.p(charset, "charset");
        Path write = Files.write(path, o75.N(g75Var), charset, StandardOpenOption.APPEND);
        c25.o(write, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return write;
    }

    @dr4(markerClass = {ry4.class})
    @tp4(version = "1.5")
    public static final void f(@NotNull Path path, @NotNull CharSequence charSequence, @NotNull Charset charset) throws IOException {
        c25.p(path, "<this>");
        c25.p(charSequence, "text");
        c25.p(charset, "charset");
        OutputStream newOutputStream = Files.newOutputStream(path, StandardOpenOption.APPEND);
        c25.o(newOutputStream, "newOutputStream(this, StandardOpenOption.APPEND)");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(newOutputStream, charset);
        try {
            outputStreamWriter.append(charSequence);
            ux4.a(outputStreamWriter, null);
        } finally {
        }
    }

    public static /* synthetic */ void g(Path path, CharSequence charSequence, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = f85.b;
        }
        f(path, charSequence, charset);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final BufferedReader h(Path path, Charset charset, int i, OpenOption... openOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(charset, "charset");
        c25.p(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    public static /* synthetic */ BufferedReader i(Path path, Charset charset, int i, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = f85.b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        c25.p(path, "<this>");
        c25.p(charset, "charset");
        c25.p(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final BufferedWriter j(Path path, Charset charset, int i, OpenOption... openOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(charset, "charset");
        c25.p(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    public static /* synthetic */ BufferedWriter k(Path path, Charset charset, int i, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = f85.b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        c25.p(path, "<this>");
        c25.p(charset, "charset");
        c25.p(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final void l(Path path, Charset charset, f05<? super String, yq4> f05Var) throws IOException {
        c25.p(path, "<this>");
        c25.p(charset, "charset");
        c25.p(f05Var, "action");
        BufferedReader newBufferedReader = Files.newBufferedReader(path, charset);
        c25.o(newBufferedReader, "newBufferedReader(this, charset)");
        try {
            for (String str : qy4.h(newBufferedReader)) {
                f05Var.M(str);
            }
            yq4 yq4Var = yq4.a;
            z15.d(1);
            ux4.a(newBufferedReader, null);
            z15.c(1);
        } finally {
        }
    }

    public static /* synthetic */ void m(Path path, Charset charset, f05 f05Var, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        c25.p(path, "<this>");
        c25.p(charset, "charset");
        c25.p(f05Var, "action");
        BufferedReader newBufferedReader = Files.newBufferedReader(path, charset);
        c25.o(newBufferedReader, "newBufferedReader(this, charset)");
        try {
            for (String str : qy4.h(newBufferedReader)) {
                f05Var.M(str);
            }
            yq4 yq4Var = yq4.a;
            z15.d(1);
            ux4.a(newBufferedReader, null);
            z15.c(1);
        } finally {
        }
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final InputStream n(Path path, OpenOption... openOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(openOptionArr, "options");
        InputStream newInputStream = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        c25.o(newInputStream, "newInputStream(this, *options)");
        return newInputStream;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final OutputStream o(Path path, OpenOption... openOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(openOptionArr, "options");
        OutputStream newOutputStream = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        c25.o(newOutputStream, "newOutputStream(this, *options)");
        return newOutputStream;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final byte[] p(Path path) throws IOException {
        c25.p(path, "<this>");
        byte[] readAllBytes = Files.readAllBytes(path);
        c25.o(readAllBytes, "readAllBytes(this)");
        return readAllBytes;
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final List<String> q(Path path, Charset charset) throws IOException {
        c25.p(path, "<this>");
        c25.p(charset, "charset");
        List<String> readAllLines = Files.readAllLines(path, charset);
        c25.o(readAllLines, "readAllLines(this, charset)");
        return readAllLines;
    }

    public static /* synthetic */ List r(Path path, Charset charset, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        c25.p(path, "<this>");
        c25.p(charset, "charset");
        List<String> readAllLines = Files.readAllLines(path, charset);
        c25.o(readAllLines, "readAllLines(this, charset)");
        return readAllLines;
    }

    @dr4(markerClass = {ry4.class})
    @tp4(version = "1.5")
    @NotNull
    public static final String s(@NotNull Path path, @NotNull Charset charset) throws IOException {
        c25.p(path, "<this>");
        c25.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(new OpenOption[0], 0)), charset);
        try {
            String k = qy4.k(inputStreamReader);
            ux4.a(inputStreamReader, null);
            return k;
        } finally {
        }
    }

    public static /* synthetic */ String t(Path path, Charset charset, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        return s(path, charset);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final InputStreamReader u(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(charset, "charset");
        c25.p(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    public static /* synthetic */ InputStreamReader v(Path path, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        c25.p(path, "<this>");
        c25.p(charset, "charset");
        c25.p(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final <T> T w(Path path, Charset charset, f05<? super g75<String>, ? extends T> f05Var) throws IOException {
        c25.p(path, "<this>");
        c25.p(charset, "charset");
        c25.p(f05Var, "block");
        BufferedReader newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            c25.o(newBufferedReader, "it");
            T M = f05Var.M(qy4.h(newBufferedReader));
            z15.d(1);
            ux4.a(newBufferedReader, null);
            z15.c(1);
            return M;
        } finally {
        }
    }

    public static /* synthetic */ Object x(Path path, Charset charset, f05 f05Var, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        c25.p(path, "<this>");
        c25.p(charset, "charset");
        c25.p(f05Var, "block");
        BufferedReader newBufferedReader = Files.newBufferedReader(path, charset);
        try {
            c25.o(newBufferedReader, "it");
            Object M = f05Var.M(qy4.h(newBufferedReader));
            z15.d(1);
            ux4.a(newBufferedReader, null);
            z15.c(1);
            return M;
        } finally {
        }
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final void y(Path path, byte[] bArr, OpenOption... openOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(bArr, "array");
        c25.p(openOptionArr, "options");
        Files.write(path, bArr, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @dr4(markerClass = {ry4.class})
    @dx4
    @tp4(version = "1.5")
    private static final Path z(Path path, Iterable<? extends CharSequence> iterable, Charset charset, OpenOption... openOptionArr) throws IOException {
        c25.p(path, "<this>");
        c25.p(iterable, "lines");
        c25.p(charset, "charset");
        c25.p(openOptionArr, "options");
        Path write = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        c25.o(write, "write(this, lines, charset, *options)");
        return write;
    }
}