package com.p7700g.p99005;

import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Charsets.kt */
@vo4(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0010\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlin/text/Charsets;", "", "()V", "ISO_8859_1", "Ljava/nio/charset/Charset;", "US_ASCII", "UTF_16", "UTF_16BE", "UTF_16LE", "UTF_32", "UTF32", "()Ljava/nio/charset/Charset;", "UTF_32BE", "UTF32_BE", "UTF_32LE", "UTF32_LE", "UTF_8", "utf_32", "utf_32be", "utf_32le", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class f85 {
    @NotNull
    public static final f85 a = new f85();
    @cz4
    @NotNull
    public static final Charset b;
    @cz4
    @NotNull
    public static final Charset c;
    @cz4
    @NotNull
    public static final Charset d;
    @cz4
    @NotNull
    public static final Charset e;
    @cz4
    @NotNull
    public static final Charset f;
    @cz4
    @NotNull
    public static final Charset g;
    @Nullable
    private static Charset h;
    @Nullable
    private static Charset i;
    @Nullable
    private static Charset j;

    static {
        Charset forName = Charset.forName("UTF-8");
        c25.o(forName, "forName(\"UTF-8\")");
        b = forName;
        Charset forName2 = Charset.forName("UTF-16");
        c25.o(forName2, "forName(\"UTF-16\")");
        c = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        c25.o(forName3, "forName(\"UTF-16BE\")");
        d = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        c25.o(forName4, "forName(\"UTF-16LE\")");
        e = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        c25.o(forName5, "forName(\"US-ASCII\")");
        f = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        c25.o(forName6, "forName(\"ISO-8859-1\")");
        g = forName6;
    }

    private f85() {
    }

    @fz4(name = "UTF32")
    @NotNull
    public final Charset a() {
        Charset charset = h;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32");
            c25.o(forName, "forName(\"UTF-32\")");
            h = forName;
            return forName;
        }
        return charset;
    }

    @fz4(name = "UTF32_BE")
    @NotNull
    public final Charset b() {
        Charset charset = j;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32BE");
            c25.o(forName, "forName(\"UTF-32BE\")");
            j = forName;
            return forName;
        }
        return charset;
    }

    @fz4(name = "UTF32_LE")
    @NotNull
    public final Charset c() {
        Charset charset = i;
        if (charset == null) {
            Charset forName = Charset.forName("UTF-32LE");
            c25.o(forName, "forName(\"UTF-32LE\")");
            i = forName;
            return forName;
        }
        return charset;
    }
}