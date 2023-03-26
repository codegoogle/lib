package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: _USequences.kt */
@vo4(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"sum", "Lkotlin/UInt;", "Lkotlin/sequences/Sequence;", "Lkotlin/UByte;", "sumOfUByte", "(Lkotlin/sequences/Sequence;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Lkotlin/sequences/Sequence;)J", "Lkotlin/UShort;", "sumOfUShort", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/sequences/USequencesKt")
/* loaded from: classes3.dex */
public class v75 {
    @dr4(markerClass = {go4.class})
    @fz4(name = "sumOfUByte")
    @tp4(version = "1.5")
    public static final int a(@NotNull g75<fq4> g75Var) {
        c25.p(g75Var, "<this>");
        int i = 0;
        for (fq4 fq4Var : g75Var) {
            i = jq4.h(jq4.h(fq4Var.c1() & 255) + i);
        }
        return i;
    }

    @dr4(markerClass = {go4.class})
    @fz4(name = "sumOfUInt")
    @tp4(version = "1.5")
    public static final int b(@NotNull g75<jq4> g75Var) {
        c25.p(g75Var, "<this>");
        int i = 0;
        for (jq4 jq4Var : g75Var) {
            i = wo1.I(jq4Var, i);
        }
        return i;
    }

    @dr4(markerClass = {go4.class})
    @fz4(name = "sumOfULong")
    @tp4(version = "1.5")
    public static final long c(@NotNull g75<nq4> g75Var) {
        c25.p(g75Var, "<this>");
        long j = 0;
        for (nq4 nq4Var : g75Var) {
            j = nq4.h(nq4Var.n1() + j);
        }
        return j;
    }

    @dr4(markerClass = {go4.class})
    @fz4(name = "sumOfUShort")
    @tp4(version = "1.5")
    public static final int d(@NotNull g75<tq4> g75Var) {
        c25.p(g75Var, "<this>");
        int i = 0;
        for (tq4 tq4Var : g75Var) {
            i = jq4.h(jq4.h(tq4Var.c1() & tq4.u) + i);
        }
        return i;
    }
}