package com.p7700g.p99005;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: ReadWrite.kt */
@fz4(name = "TextStreamsKt")
@vo4(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u0017\u0010\u0000\u001a\u00020\u0005*\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004H\u0087\b\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u001a\u001e\u0010\n\u001a\u00020\u000b*\u00020\u00022\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000b0\r\u001a\u0010\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010*\u00020\u0001\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u0013\u001a\u0010\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015*\u00020\u0002\u001a\n\u0010\u0016\u001a\u00020\u000e*\u00020\u0002\u001a\u0017\u0010\u0016\u001a\u00020\u000e*\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u001a*\u00020\u000eH\u0087\b\u001a8\u0010\u001b\u001a\u0002H\u001c\"\u0004\b\u0000\u0010\u001c*\u00020\u00022\u0018\u0010\u001d\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0010\u0012\u0004\u0012\u0002H\u001c0\rH\u0086\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\u0010\u001e\u0082\u0002\u000f\n\u0005\b\u009920\u0001\n\u0006\b\u0011(\u001f0\u0001¨\u0006 "}, d2 = {"buffered", "Ljava/io/BufferedReader;", "Ljava/io/Reader;", "bufferSize", "", "Ljava/io/BufferedWriter;", "Ljava/io/Writer;", "copyTo", "", "out", "forEachLine", "", "action", "Lkotlin/Function1;", "", "lineSequence", "Lkotlin/sequences/Sequence;", "readBytes", "", "Ljava/net/URL;", "readLines", "", "readText", "charset", "Ljava/nio/charset/Charset;", "reader", "Ljava/io/StringReader;", "useLines", "T", "block", "(Ljava/io/Reader;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Requires newer compiler version to be inlined correctly.", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class qy4 {

    /* compiled from: ReadWrite.kt */
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
    private static final BufferedReader a(Reader reader, int i) {
        c25.p(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    @dx4
    private static final BufferedWriter b(Writer writer, int i) {
        c25.p(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    public static /* synthetic */ BufferedReader c(Reader reader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        c25.p(reader, "<this>");
        return reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, i);
    }

    public static /* synthetic */ BufferedWriter d(Writer writer, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        c25.p(writer, "<this>");
        return writer instanceof BufferedWriter ? (BufferedWriter) writer : new BufferedWriter(writer, i);
    }

    public static final long e(@NotNull Reader reader, @NotNull Writer writer, int i) {
        c25.p(reader, "<this>");
        c25.p(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += read;
            read = reader.read(cArr);
        }
        return j;
    }

    public static /* synthetic */ long f(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return e(reader, writer, i);
    }

    public static final void g(@NotNull Reader reader, @NotNull f05<? super String, yq4> f05Var) {
        c25.p(reader, "<this>");
        c25.p(f05Var, "action");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            for (String str : h(bufferedReader)) {
                f05Var.M(str);
            }
            yq4 yq4Var = yq4.a;
            ux4.a(bufferedReader, null);
        } finally {
        }
    }

    @NotNull
    public static final g75<String> h(@NotNull BufferedReader bufferedReader) {
        c25.p(bufferedReader, "<this>");
        return m75.f(new ky4(bufferedReader));
    }

    @NotNull
    public static final byte[] i(@NotNull URL url) {
        c25.p(url, "<this>");
        InputStream openStream = url.openStream();
        try {
            c25.o(openStream, "it");
            byte[] p = tx4.p(openStream);
            ux4.a(openStream, null);
            return p;
        } finally {
        }
    }

    @NotNull
    public static final List<String> j(@NotNull Reader reader) {
        c25.p(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        g(reader, new a(arrayList));
        return arrayList;
    }

    @NotNull
    public static final String k(@NotNull Reader reader) {
        c25.p(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        f(reader, stringWriter, 0, 2, null);
        String stringWriter2 = stringWriter.toString();
        c25.o(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    @dx4
    private static final String l(URL url, Charset charset) {
        c25.p(url, "<this>");
        c25.p(charset, "charset");
        return new String(i(url), charset);
    }

    public static /* synthetic */ String m(URL url, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        c25.p(url, "<this>");
        c25.p(charset, "charset");
        return new String(i(url), charset);
    }

    @dx4
    private static final StringReader n(String str) {
        c25.p(str, "<this>");
        return new StringReader(str);
    }

    public static final <T> T o(@NotNull Reader reader, @NotNull f05<? super g75<String>, ? extends T> f05Var) {
        c25.p(reader, "<this>");
        c25.p(f05Var, "block");
        BufferedReader bufferedReader = reader instanceof BufferedReader ? (BufferedReader) reader : new BufferedReader(reader, 8192);
        try {
            T M = f05Var.M(h(bufferedReader));
            z15.d(1);
            ux4.a(bufferedReader, null);
            z15.c(1);
            return M;
        } finally {
        }
    }
}