package com.p7700g.p99005;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

/* compiled from: ReaderWriter.java */
/* loaded from: classes3.dex */
public final class ix3 {
    public static final String b = "com.sun.jersey.core.util.ReaderWriter.BufferSize";
    public static final int c = 8192;
    public static final Charset a = Charset.forName("UTF-8");
    public static final int d = a();

    private static int a() {
        try {
            int intValue = Integer.valueOf(System.getProperty(b, Integer.toString(8192))).intValue();
            if (intValue > 0) {
                return intValue;
            }
            throw new NumberFormatException();
        } catch (NumberFormatException unused) {
            return 8192;
        }
    }

    public static final Charset b(tm4 tm4Var) {
        String str = tm4Var == null ? null : tm4Var.b().get("charset");
        return str == null ? a : Charset.forName(str);
    }

    public static final String c(InputStream inputStream, tm4 tm4Var) throws IOException {
        return d(new InputStreamReader(inputStream, b(tm4Var)));
    }

    public static final String d(Reader reader) throws IOException {
        StringBuilder sb = new StringBuilder();
        char[] cArr = new char[d];
        while (true) {
            int read = reader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                return sb.toString();
            }
        }
    }

    public static final void e(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[d];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            outputStream.write(bArr, 0, read);
        }
    }

    public static final void f(Reader reader, Writer writer) throws IOException {
        char[] cArr = new char[d];
        while (true) {
            int read = reader.read(cArr);
            if (read == -1) {
                return;
            }
            writer.write(cArr, 0, read);
        }
    }

    public static final void g(String str, OutputStream outputStream, tm4 tm4Var) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, b(tm4Var)));
        bufferedWriter.write(str);
        bufferedWriter.flush();
    }
}