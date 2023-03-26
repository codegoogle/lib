package com.p7700g.p99005;

import com.greedygame.core.GreedyGameAds;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class dc3 {
    @NotNull
    public static final dc3 a = new dc3();

    private dc3() {
    }

    public final boolean a() {
        return GreedyGameAds.a.isSdkInitialized();
    }

    public final boolean b() {
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core == null) {
            return false;
        }
        return iNSTANCE$com_greedygame_sdkx_core.A();
    }
}