package com.p7700g.p99005;

import android.view.View;
import com.p7700g.p99005.hd3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class jd3 extends hd3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd3(@NotNull hd3.a aVar) {
        super(aVar);
        c25.p(aVar, "builder");
    }

    @Override // com.p7700g.p99005.hd3
    @Nullable
    public View o() {
        w33 w33Var = new w33(c(), null, 0, 6, null);
        w33Var.setStyles(g().getStyles());
        return w33Var;
    }
}