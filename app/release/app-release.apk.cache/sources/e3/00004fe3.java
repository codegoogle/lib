package com.p7700g.p99005;

import java.util.Random;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformRandom.kt */
@vo4(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\t\u0010\u0000\u001a\u00020\u0001H\u0081\b\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\u0001H\u0007\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\bH\u0007¨\u0006\n"}, d2 = {"defaultPlatformRandom", "Lkotlin/random/Random;", "doubleFromParts", "", "hi26", "", "low27", "asJavaRandom", "Ljava/util/Random;", "asKotlinRandom", "kotlin-stdlib"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class m45 {
    @tp4(version = "1.3")
    @NotNull
    public static final Random a(@NotNull n45 n45Var) {
        Random H;
        c25.p(n45Var, "<this>");
        i45 i45Var = n45Var instanceof i45 ? (i45) n45Var : null;
        return (i45Var == null || (H = i45Var.H()) == null) ? new k45(n45Var) : H;
    }

    @tp4(version = "1.3")
    @NotNull
    public static final n45 b(@NotNull Random random) {
        n45 f;
        c25.p(random, "<this>");
        k45 k45Var = random instanceof k45 ? (k45) random : null;
        return (k45Var == null || (f = k45Var.f()) == null) ? new l45(random) : f;
    }

    @dx4
    private static final n45 c() {
        return kx4.a.b();
    }

    public static final double d(int i, int i2) {
        return ((i << 27) + i2) / 9.007199254740992E15d;
    }
}