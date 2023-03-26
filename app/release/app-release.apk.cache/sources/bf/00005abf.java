package com.p7700g.p99005;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* compiled from: StreamResetException.kt */
@vo4(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/p7700g/p99005/rt5;", "Ljava/io/IOException;", "Lcom/p7700g/p99005/ft5;", "s", "Lcom/p7700g/p99005/ft5;", IronSourceConstants.EVENTS_ERROR_CODE, "<init>", "(Lcom/p7700g/p99005/ft5;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes3.dex */
public final class rt5 extends IOException {
    @cz4
    @NotNull
    public final ft5 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rt5(@NotNull ft5 ft5Var) {
        super("stream was reset: " + ft5Var);
        c25.p(ft5Var, IronSourceConstants.EVENTS_ERROR_CODE);
        this.s = ft5Var;
    }
}