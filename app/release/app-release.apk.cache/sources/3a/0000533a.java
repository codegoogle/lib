package com.p7700g.p99005;

import java.util.zip.Inflater;
import org.jetbrains.annotations.NotNull;

/* compiled from: InflaterSource.kt */
@fz4(name = "-InflaterSourceExtensions")
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/p7700g/p99005/xw5;", "Ljava/util/zip/Inflater;", "inflater", "Lcom/p7700g/p99005/hw5;", "a", "(Lcom/p7700g/p99005/xw5;Ljava/util/zip/Inflater;)Lcom/p7700g/p99005/hw5;", "okio"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class nv5 {
    @NotNull
    public static final hw5 a(@NotNull xw5 xw5Var, @NotNull Inflater inflater) {
        c25.p(xw5Var, "$this$inflate");
        c25.p(inflater, "inflater");
        return new hw5(xw5Var, inflater);
    }

    public static /* synthetic */ hw5 b(xw5 xw5Var, Inflater inflater, int i, Object obj) {
        if ((i & 1) != 0) {
            inflater = new Inflater();
        }
        c25.p(xw5Var, "$this$inflate");
        c25.p(inflater, "inflater");
        return new hw5(xw5Var, inflater);
    }
}