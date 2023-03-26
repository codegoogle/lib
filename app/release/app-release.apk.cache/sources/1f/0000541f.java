package com.p7700g.p99005;

import android.net.Uri;
import com.greedygame.core.network.model.responses.SignalResponse;
import com.greedygame.core.signals.InstallReferrerSignal;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ob3 extends pb3 {
    @NotNull
    private final InstallReferrerSignal j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ob3(@NotNull InstallReferrerSignal installReferrerSignal, @NotNull ka3<n23, SignalResponse> ka3Var) {
        super(installReferrerSignal, ka3Var);
        c25.p(installReferrerSignal, "model");
        c25.p(ka3Var, "callback");
        this.j = installReferrerSignal;
    }

    @Override // com.p7700g.p99005.pb3, com.p7700g.p99005.b23
    @Nullable
    public qa3<n23> d() {
        return new qa3<>(this.j, InstallReferrerSignal.class);
    }

    @Override // com.p7700g.p99005.pb3, com.p7700g.p99005.b23
    @NotNull
    public Uri j() {
        Uri parse = Uri.parse(sa3.f());
        c25.o(parse, "parse(INSTALL_TRACKER_URL)");
        return parse;
    }
}