package com.p7700g.p99005;

import com.greedygame.core.network.model.responses.SignalResponse;
import com.greedygame.core.signals.UnitClickSignal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tb3 extends pb3 {
    @NotNull
    private final UnitClickSignal j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tb3(@NotNull UnitClickSignal unitClickSignal, @Nullable ka3<n23, SignalResponse> ka3Var) {
        super(unitClickSignal, ka3Var);
        c25.p(unitClickSignal, "model");
        this.j = unitClickSignal;
    }

    @Override // com.p7700g.p99005.pb3, com.p7700g.p99005.b23
    @Nullable
    public qa3<n23> d() {
        return new qa3<>(this.j, UnitClickSignal.class);
    }
}