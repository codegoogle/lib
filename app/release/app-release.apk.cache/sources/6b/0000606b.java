package com.p7700g.p99005;

import android.annotation.SuppressLint;
import android.util.AtomicFile;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import org.jetbrains.annotations.NotNull;

/* compiled from: AtomicFile.kt */
@vo4(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0087\b\u001a\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u001a3\u0010\u0007\u001a\u00020\b*\u00020\u00022!\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0004\u0012\u00020\b0\nH\u0087\bø\u0001\u0000\u001a\u0014\u0010\u000f\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0001H\u0007\u001a\u001e\u0010\u0011\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"readBytes", "", "Landroid/util/AtomicFile;", "readText", "", "charset", "Ljava/nio/charset/Charset;", "tryWrite", "", "block", "Lkotlin/Function1;", "Ljava/io/FileOutputStream;", "Lkotlin/ParameterName;", "name", "out", "writeBytes", "array", "writeText", "text", "core-ktx_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
@SuppressLint({"ClassVerificationFailure"})
/* loaded from: classes.dex */
public final class uo {
    @e2(17)
    @NotNull
    public static final byte[] a(@NotNull AtomicFile atomicFile) {
        c25.p(atomicFile, "<this>");
        byte[] readFully = atomicFile.readFully();
        c25.o(readFully, "readFully()");
        return readFully;
    }

    @e2(17)
    @NotNull
    public static final String b(@NotNull AtomicFile atomicFile, @NotNull Charset charset) {
        c25.p(atomicFile, "<this>");
        c25.p(charset, "charset");
        byte[] readFully = atomicFile.readFully();
        c25.o(readFully, "readFully()");
        return new String(readFully, charset);
    }

    public static /* synthetic */ String c(AtomicFile atomicFile, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = f85.b;
        }
        return b(atomicFile, charset);
    }

    @e2(17)
    public static final void d(@NotNull AtomicFile atomicFile, @NotNull f05<? super FileOutputStream, yq4> f05Var) {
        c25.p(atomicFile, "<this>");
        c25.p(f05Var, "block");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            c25.o(startWrite, "stream");
            f05Var.M(startWrite);
            z15.d(1);
            atomicFile.finishWrite(startWrite);
            z15.c(1);
        } catch (Throwable th) {
            z15.d(1);
            atomicFile.failWrite(startWrite);
            z15.c(1);
            throw th;
        }
    }

    @e2(17)
    public static final void e(@NotNull AtomicFile atomicFile, @NotNull byte[] bArr) {
        c25.p(atomicFile, "<this>");
        c25.p(bArr, "array");
        FileOutputStream startWrite = atomicFile.startWrite();
        try {
            c25.o(startWrite, "stream");
            startWrite.write(bArr);
            atomicFile.finishWrite(startWrite);
        } catch (Throwable th) {
            atomicFile.failWrite(startWrite);
            throw th;
        }
    }

    @e2(17)
    public static final void f(@NotNull AtomicFile atomicFile, @NotNull String str, @NotNull Charset charset) {
        c25.p(atomicFile, "<this>");
        c25.p(str, "text");
        c25.p(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        c25.o(bytes, "this as java.lang.String).getBytes(charset)");
        e(atomicFile, bytes);
    }

    public static /* synthetic */ void g(AtomicFile atomicFile, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = f85.b;
        }
        f(atomicFile, str, charset);
    }
}