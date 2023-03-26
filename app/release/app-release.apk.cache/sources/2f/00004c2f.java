package com.p7700g.p99005;

import com.greedygame.core.network.model.responses.SignalResponse;
import com.greedygame.core.signals.AdInvalidSignal;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class kb3 extends pb3 {
    @NotNull
    private final AdInvalidSignal j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb3(@NotNull AdInvalidSignal adInvalidSignal, @Nullable ka3<n23, SignalResponse> ka3Var) {
        super(adInvalidSignal, ka3Var);
        c25.p(adInvalidSignal, "signalModel");
        this.j = adInvalidSignal;
    }

    @Override // com.p7700g.p99005.pb3, com.p7700g.p99005.b23
    @Nullable
    public qa3<n23> d() {
        return new qa3<>(this.j, AdInvalidSignal.class);
    }

    public /* synthetic */ kb3(AdInvalidSignal adInvalidSignal, ka3 ka3Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adInvalidSignal, (i & 2) != 0 ? null : ka3Var);
    }
}