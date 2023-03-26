package com.p7700g.p99005;

import org.jetbrains.annotations.NotNull;

/* compiled from: MathJVM.kt */
@vo4(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lkotlin/math/Constants;", "", "()V", "LN2", "", "epsilon", "taylor_2_bound", "taylor_n_bound", "upper_taylor_2_bound", "upper_taylor_n_bound", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class x35 {
    @NotNull
    public static final x35 a = new x35();
    @cz4
    public static final double b = Math.log(2.0d);
    @cz4
    public static final double c;
    @cz4
    public static final double d;
    @cz4
    public static final double e;
    @cz4
    public static final double f;
    @cz4
    public static final double g;

    static {
        double ulp = Math.ulp(1.0d);
        c = ulp;
        double sqrt = Math.sqrt(ulp);
        d = sqrt;
        double sqrt2 = Math.sqrt(sqrt);
        e = sqrt2;
        double d2 = 1;
        f = d2 / sqrt;
        g = d2 / sqrt2;
    }

    private x35() {
    }
}