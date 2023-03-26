package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: ArrayIterators.kt */
@vo4(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0017\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u00042\u0006\u0010\u0002\u001a\u00020\u0005\u001a\u000e\u0010\u0000\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u000e\u0010\u0000\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\t\u001a\u000e\u0010\u0000\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b\u001a\u000e\u0010\u0000\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\r\u001a\u000e\u0010\u0000\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f\u001a\u000e\u0010\u0000\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0011¨\u0006\u0012"}, d2 = {"iterator", "Lkotlin/collections/BooleanIterator;", "array", "", "Lkotlin/collections/ByteIterator;", "", "Lkotlin/collections/CharIterator;", "", "Lkotlin/collections/DoubleIterator;", "", "Lkotlin/collections/FloatIterator;", "", "Lkotlin/collections/IntIterator;", "", "Lkotlin/collections/LongIterator;", "", "Lkotlin/collections/ShortIterator;", "", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class b15 {
    @NotNull
    public static final cs4 a(@NotNull boolean[] zArr) {
        c25.p(zArr, "array");
        return new t05(zArr);
    }

    @NotNull
    public static final es4 b(@NotNull byte[] bArr) {
        c25.p(bArr, "array");
        return new u05(bArr);
    }

    @NotNull
    public static final fs4 c(@NotNull char[] cArr) {
        c25.p(cArr, "array");
        return new v05(cArr);
    }

    @NotNull
    public static final ss4 d(@NotNull double[] dArr) {
        c25.p(dArr, "array");
        return new w05(dArr);
    }

    @NotNull
    public static final xs4 e(@NotNull float[] fArr) {
        c25.p(fArr, "array");
        return new x05(fArr);
    }

    @NotNull
    public static final ft4 f(@NotNull int[] iArr) {
        c25.p(iArr, "array");
        return new y05(iArr);
    }

    @NotNull
    public static final gt4 g(@NotNull long[] jArr) {
        c25.p(jArr, "array");
        return new c15(jArr);
    }

    @NotNull
    public static final au4 h(@NotNull short[] sArr) {
        c25.p(sArr, "array");
        return new d15(sArr);
    }
}