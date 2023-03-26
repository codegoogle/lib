package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: -Platform.kt */
@fz4(name = "-Platform")
@vo4(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u000b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f*\n\u0010\u000e\"\u00020\r2\u00020\r*\n\u0010\u0010\"\u00020\u000f2\u00020\u000f*\n\u0010\u0012\"\u00020\u00112\u00020\u0011*\n\u0010\u0014\"\u00020\u00132\u00020\u0013*\n\u0010\u0016\"\u00020\u00152\u00020\u0015\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"", "", "c", "([B)Ljava/lang/String;", "a", "(Ljava/lang/String;)[B", "R", "", "lock", "Lkotlin/Function0;", "block", "b", "(Ljava/lang/Object;Lcom/p7700g/p99005/uz4;)Ljava/lang/Object;", "Ljava/lang/ArrayIndexOutOfBoundsException;", "ArrayIndexOutOfBoundsException", "Ljava/io/Closeable;", "Closeable", "Ljava/io/EOFException;", "EOFException", "Ljava/io/FileNotFoundException;", "FileNotFoundException", "Ljava/io/IOException;", "IOException", "okio"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class ov5 {
    @NotNull
    public static final byte[] a(@NotNull String str) {
        c25.p(str, "$this$asUtf8ToByteArray");
        byte[] bytes = str.getBytes(f85.b);
        c25.o(bytes, "(this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final <R> R b(@NotNull Object obj, @NotNull uz4<? extends R> uz4Var) {
        R x;
        c25.p(obj, "lock");
        c25.p(uz4Var, "block");
        synchronized (obj) {
            try {
                x = uz4Var.x();
                z15.d(1);
            } catch (Throwable th) {
                z15.d(1);
                z15.c(1);
                throw th;
            }
        }
        z15.c(1);
        return x;
    }

    @NotNull
    public static final String c(@NotNull byte[] bArr) {
        c25.p(bArr, "$this$toUtf8String");
        return new String(bArr, f85.b);
    }
}