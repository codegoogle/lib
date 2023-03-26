package com.p7700g.p99005;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.xbill.DNS.TTL;

/* compiled from: FileReadWrite.kt */
@vo4(d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a!\u0010\n\u001a\u00020\u000b*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001a!\u0010\u000e\u001a\u00020\u000f*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\rH\u0087\b\u001aB\u0010\u0010\u001a\u00020\u0001*\u00020\u000226\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001aJ\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\r26\u0010\u0011\u001a2\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0016\u0012\u0004\u0012\u00020\u00010\u0012\u001a7\u0010\u0018\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2!\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u00010\u0019\u001a\r\u0010\u001b\u001a\u00020\u001c*\u00020\u0002H\u0087\b\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0017\u0010\u001f\u001a\u00020 *\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001a\n\u0010!\u001a\u00020\u0004*\u00020\u0002\u001a\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00070#*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0014\u0010$\u001a\u00020\u0007*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010%\u001a\u00020&*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u001aB\u0010'\u001a\u0002H(\"\u0004\b\u0000\u0010(*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\t2\u0018\u0010)\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070*\u0012\u0004\u0012\u0002H(0\u0019H\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010+\u001a\u0012\u0010-\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u001c\u0010.\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t\u001a\u0017\u0010/\u001a\u000200*\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\tH\u0087\b\u0082\u0002\u000f\n\u0005\b\u009920\u0001\n\u0006\b\u0011(,0\u0001¨\u00061"}, d2 = {"appendBytes", "", "Ljava/io/File;", "array", "", "appendText", "text", "", "charset", "Ljava/nio/charset/Charset;", "bufferedReader", "Ljava/io/BufferedReader;", "bufferSize", "", "bufferedWriter", "Ljava/io/BufferedWriter;", "forEachBlock", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "buffer", "bytesRead", "blockSize", "forEachLine", "Lkotlin/Function1;", "line", "inputStream", "Ljava/io/FileInputStream;", "outputStream", "Ljava/io/FileOutputStream;", "printWriter", "Ljava/io/PrintWriter;", "readBytes", "readLines", "", "readText", "reader", "Ljava/io/InputStreamReader;", "useLines", "T", "block", "Lkotlin/sequences/Sequence;", "(Ljava/io/File;Ljava/nio/charset/Charset;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Requires newer compiler version to be inlined correctly.", "writeBytes", "writeText", "writer", "Ljava/io/OutputStreamWriter;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/io/FilesKt")
/* loaded from: classes3.dex */
public class gy4 extends fy4 {

    /* compiled from: FileReadWrite.kt */
    @vo4(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends e25 implements f05<String, yq4> {
        public final /* synthetic */ ArrayList<String> t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ArrayList<String> arrayList) {
            super(1);
            this.t = arrayList;
        }

        @Override // com.p7700g.p99005.f05
        public /* bridge */ /* synthetic */ yq4 M(String str) {
            a(str);
            return yq4.a;
        }

        public final void a(@NotNull String str) {
            c25.p(str, "it");
            this.t.add(str);
        }
    }

    @dx4
    private static final InputStreamReader A(File file, Charset charset) {
        c25.p(file, "<this>");
        c25.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static /* synthetic */ InputStreamReader B(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        c25.p(file, "<this>");
        c25.p(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    public static final <T> T C(@NotNull File file, @NotNull Charset charset, @NotNull f05<? super g75<String>, ? extends T> f05Var) {
        c25.p(file, "<this>");
        c25.p(charset, "charset");
        c25.p(f05Var, "block");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            T M = f05Var.M(qy4.h(bufferedReader));
            z15.d(1);
            ux4.a(bufferedReader, null);
            z15.c(1);
            return M;
        } finally {
        }
    }

    public static /* synthetic */ Object D(File file, Charset charset, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            Object M = f05Var.M(qy4.h(bufferedReader));
            z15.d(1);
            ux4.a(bufferedReader, null);
            z15.c(1);
            return M;
        } finally {
        }
    }

    public static final void E(@NotNull File file, @NotNull byte[] bArr) {
        c25.p(file, "<this>");
        c25.p(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            yq4 yq4Var = yq4.a;
            ux4.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void F(@NotNull File file, @NotNull String str, @NotNull Charset charset) {
        c25.p(file, "<this>");
        c25.p(str, "text");
        c25.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        c25.o(bytes, "this as java.lang.String).getBytes(charset)");
        E(file, bytes);
    }

    public static /* synthetic */ void G(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = f85.b;
        }
        F(file, str, charset);
    }

    @dx4
    private static final OutputStreamWriter H(File file, Charset charset) {
        c25.p(file, "<this>");
        c25.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static /* synthetic */ OutputStreamWriter I(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        c25.p(file, "<this>");
        c25.p(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    public static final void g(@NotNull File file, @NotNull byte[] bArr) {
        c25.p(file, "<this>");
        c25.p(bArr, "array");
        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
        try {
            fileOutputStream.write(bArr);
            yq4 yq4Var = yq4.a;
            ux4.a(fileOutputStream, null);
        } finally {
        }
    }

    public static final void h(@NotNull File file, @NotNull String str, @NotNull Charset charset) {
        c25.p(file, "<this>");
        c25.p(str, "text");
        c25.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        c25.o(bytes, "this as java.lang.String).getBytes(charset)");
        g(file, bytes);
    }

    public static /* synthetic */ void i(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = f85.b;
        }
        h(file, str, charset);
    }

    @dx4
    private static final BufferedReader j(File file, Charset charset, int i) {
        c25.p(file, "<this>");
        c25.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i);
    }

    public static /* synthetic */ BufferedReader k(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = f85.b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        c25.p(file, "<this>");
        c25.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, i);
    }

    @dx4
    private static final BufferedWriter l(File file, Charset charset, int i) {
        c25.p(file, "<this>");
        c25.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i);
    }

    public static /* synthetic */ BufferedWriter m(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = f85.b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        c25.p(file, "<this>");
        c25.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, byte[]] */
    public static final void n(@NotNull File file, int i, @NotNull j05<? super byte[], ? super Integer, yq4> j05Var) {
        c25.p(file, "<this>");
        c25.p(j05Var, "action");
        ?? r2 = new byte[i55.n(i, 512)];
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(r2);
                if (read <= 0) {
                    yq4 yq4Var = yq4.a;
                    ux4.a(fileInputStream, null);
                    return;
                }
                j05Var.w3(r2, Integer.valueOf(read));
            } finally {
            }
        }
    }

    public static final void o(@NotNull File file, @NotNull j05<? super byte[], ? super Integer, yq4> j05Var) {
        c25.p(file, "<this>");
        c25.p(j05Var, "action");
        n(file, 4096, j05Var);
    }

    public static final void p(@NotNull File file, @NotNull Charset charset, @NotNull f05<? super String, yq4> f05Var) {
        c25.p(file, "<this>");
        c25.p(charset, "charset");
        c25.p(f05Var, "action");
        qy4.g(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), f05Var);
    }

    public static /* synthetic */ void q(File file, Charset charset, f05 f05Var, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        p(file, charset, f05Var);
    }

    @dx4
    private static final FileInputStream r(File file) {
        c25.p(file, "<this>");
        return new FileInputStream(file);
    }

    @dx4
    private static final FileOutputStream s(File file) {
        c25.p(file, "<this>");
        return new FileOutputStream(file);
    }

    @dx4
    private static final PrintWriter t(File file, Charset charset) {
        c25.p(file, "<this>");
        c25.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    public static /* synthetic */ PrintWriter u(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        c25.p(file, "<this>");
        c25.p(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        return new PrintWriter(outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192));
    }

    @NotNull
    public static final byte[] v(@NotNull File file) {
        c25.p(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length <= TTL.MAX_VALUE) {
                int i = (int) length;
                byte[] bArr = new byte[i];
                int i2 = i;
                int i3 = 0;
                while (i2 > 0) {
                    int read = fileInputStream.read(bArr, i3, i2);
                    if (read < 0) {
                        break;
                    }
                    i2 -= read;
                    i3 += read;
                }
                if (i2 > 0) {
                    bArr = Arrays.copyOf(bArr, i3);
                    c25.o(bArr, "copyOf(this, newSize)");
                } else {
                    int read2 = fileInputStream.read();
                    if (read2 != -1) {
                        yx4 yx4Var = new yx4(8193);
                        yx4Var.write(read2);
                        tx4.l(fileInputStream, yx4Var, 0, 2, null);
                        int size = yx4Var.size() + i;
                        if (size >= 0) {
                            byte[] a2 = yx4Var.a();
                            byte[] copyOf = Arrays.copyOf(bArr, size);
                            c25.o(copyOf, "copyOf(this, newSize)");
                            bArr = zr4.W0(a2, copyOf, i, 0, yx4Var.size());
                        } else {
                            throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                        }
                    }
                }
                ux4.a(fileInputStream, null);
                return bArr;
            }
            throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ux4.a(fileInputStream, th);
                throw th2;
            }
        }
    }

    @NotNull
    public static final List<String> w(@NotNull File file, @NotNull Charset charset) {
        c25.p(file, "<this>");
        c25.p(charset, "charset");
        ArrayList arrayList = new ArrayList();
        p(file, charset, new a(arrayList));
        return arrayList;
    }

    public static /* synthetic */ List x(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        return w(file, charset);
    }

    @NotNull
    public static final String y(@NotNull File file, @NotNull Charset charset) {
        c25.p(file, "<this>");
        c25.p(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String k = qy4.k(inputStreamReader);
            ux4.a(inputStreamReader, null);
            return k;
        } finally {
        }
    }

    public static /* synthetic */ String z(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        return y(file, charset);
    }
}