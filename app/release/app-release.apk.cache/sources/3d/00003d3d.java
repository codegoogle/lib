package com.p7700g.p99005;

import com.anchorfree.hdr.AFHydra;
import com.p7700g.p99005.aa;
import java.util.List;
import org.jetbrains.annotations.NotNull;

/* compiled from: Tuples.kt */
@fz4(name = "TuplesKt")
@vo4(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\u001a2\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0002H\u00022\u0006\u0010\u0004\u001a\u0002H\u0003H\u0086\u0004¢\u0006\u0002\u0010\u0005\u001a\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\u0001\u001a(\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\b0\u0007\"\u0004\b\u0000\u0010\b*\u0014\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u0002H\b0\t¨\u0006\n"}, d2 = {aa.h.d, "Lkotlin/Pair;", bx.B4, AFHydra.EV_BYTECOUNT, "that", "(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;", "toList", "", "T", "Lkotlin/Triple;", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class cq4 {
    @NotNull
    public static final <A, B> hp4<A, B> a(A a, B b) {
        return new hp4<>(a, b);
    }

    @NotNull
    public static final <T> List<T> b(@NotNull hp4<? extends T, ? extends T> hp4Var) {
        c25.p(hp4Var, "<this>");
        return js4.M(hp4Var.m(), hp4Var.n());
    }

    @NotNull
    public static final <T> List<T> c(@NotNull bq4<? extends T, ? extends T, ? extends T> bq4Var) {
        c25.p(bq4Var, "<this>");
        return js4.M(bq4Var.n(), bq4Var.o(), bq4Var.p());
    }
}