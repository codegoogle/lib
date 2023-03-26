package com.p7700g.p99005;

import java.util.zip.Deflater;
import org.jetbrains.annotations.NotNull;

/* compiled from: DeflaterSink.kt */
@fz4(name = "-DeflaterSinkExtensions")
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/p7700g/p99005/vw5;", "Ljava/util/zip/Deflater;", "deflater", "Lcom/p7700g/p99005/yv5;", "a", "(Lcom/p7700g/p99005/vw5;Ljava/util/zip/Deflater;)Lcom/p7700g/p99005/yv5;", "okio"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes3.dex */
public final class hv5 {
    @NotNull
    public static final yv5 a(@NotNull vw5 vw5Var, @NotNull Deflater deflater) {
        c25.p(vw5Var, "$this$deflate");
        c25.p(deflater, "deflater");
        return new yv5(vw5Var, deflater);
    }

    public static /* synthetic */ yv5 b(vw5 vw5Var, Deflater deflater, int i, Object obj) {
        if ((i & 1) != 0) {
            deflater = new Deflater();
        }
        c25.p(vw5Var, "$this$deflate");
        c25.p(deflater, "deflater");
        return new yv5(vw5Var, deflater);
    }
}