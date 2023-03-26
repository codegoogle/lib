package com.p7700g.p99005;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* compiled from: _UCollections.kt */
@vo4(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u001a\u0010\f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a\u001a\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u001a\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a\u001a\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"sum", "Lkotlin/UInt;", "", "Lkotlin/UByte;", "sumOfUByte", "(Ljava/lang/Iterable;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Ljava/lang/Iterable;)J", "Lkotlin/UShort;", "sumOfUShort", "toUByteArray", "Lkotlin/UByteArray;", "", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "(Ljava/util/Collection;)[S", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/collections/UCollectionsKt")
/* loaded from: classes3.dex */
public class gu4 {
    @dr4(markerClass = {go4.class})
    @fz4(name = "sumOfUByte")
    @tp4(version = "1.5")
    public static final int a(@NotNull Iterable<fq4> iterable) {
        c25.p(iterable, "<this>");
        int i = 0;
        for (fq4 fq4Var : iterable) {
            i = jq4.h(jq4.h(fq4Var.c1() & 255) + i);
        }
        return i;
    }

    @dr4(markerClass = {go4.class})
    @fz4(name = "sumOfUInt")
    @tp4(version = "1.5")
    public static final int b(@NotNull Iterable<jq4> iterable) {
        c25.p(iterable, "<this>");
        int i = 0;
        for (jq4 jq4Var : iterable) {
            i = wo1.I(jq4Var, i);
        }
        return i;
    }

    @dr4(markerClass = {go4.class})
    @fz4(name = "sumOfULong")
    @tp4(version = "1.5")
    public static final long c(@NotNull Iterable<nq4> iterable) {
        c25.p(iterable, "<this>");
        long j = 0;
        for (nq4 nq4Var : iterable) {
            j = nq4.h(nq4Var.n1() + j);
        }
        return j;
    }

    @dr4(markerClass = {go4.class})
    @fz4(name = "sumOfUShort")
    @tp4(version = "1.5")
    public static final int d(@NotNull Iterable<tq4> iterable) {
        c25.p(iterable, "<this>");
        int i = 0;
        for (tq4 tq4Var : iterable) {
            i = jq4.h(jq4.h(tq4Var.c1() & tq4.u) + i);
        }
        return i;
    }

    @go4
    @tp4(version = "1.3")
    @NotNull
    public static final byte[] e(@NotNull Collection<fq4> collection) {
        c25.p(collection, "<this>");
        byte[] c = gq4.c(collection.size());
        int i = 0;
        for (fq4 fq4Var : collection) {
            gq4.B(c, i, fq4Var.c1());
            i++;
        }
        return c;
    }

    @go4
    @tp4(version = "1.3")
    @NotNull
    public static final int[] f(@NotNull Collection<jq4> collection) {
        c25.p(collection, "<this>");
        int[] c = kq4.c(collection.size());
        int i = 0;
        for (jq4 jq4Var : collection) {
            kq4.B(c, i, jq4Var.n1());
            i++;
        }
        return c;
    }

    @go4
    @tp4(version = "1.3")
    @NotNull
    public static final long[] g(@NotNull Collection<nq4> collection) {
        c25.p(collection, "<this>");
        long[] c = oq4.c(collection.size());
        int i = 0;
        for (nq4 nq4Var : collection) {
            oq4.B(c, i, nq4Var.n1());
            i++;
        }
        return c;
    }

    @go4
    @tp4(version = "1.3")
    @NotNull
    public static final short[] h(@NotNull Collection<tq4> collection) {
        c25.p(collection, "<this>");
        short[] c = uq4.c(collection.size());
        int i = 0;
        for (tq4 tq4Var : collection) {
            uq4.B(c, i, tq4Var.c1());
            i++;
        }
        return c;
    }
}