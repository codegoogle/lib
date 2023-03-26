package com.p7700g.p99005;

import com.greedygame.core.models.core.NativeMediatedAsset;
import com.greedygame.core.network.model.responses.Partner;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class n13<T> {
    @Nullable
    private final T a;
    @NotNull
    private final NativeMediatedAsset b;
    @NotNull
    private final Partner c;

    /* loaded from: classes3.dex */
    public enum a {
        ADMOB_AD("admob_ad"),
        ADMOB_BANNER("admob_banner"),
        ADMOB_INTERSTITIAL("admob_interstitial"),
        FACEBOOK_NATIVE("facebook_native"),
        FACEBOOK_BANNER("facebook_banner"),
        FACEBOOK_INTERSTITIAL("facebook_interstitial"),
        S2S_CLIENT("s2s_client"),
        MOPUB_NATIVE("mopub_native"),
        MOPUB_STATIC("mopub_static"),
        MOPUB_VIDEO("mopub_video"),
        INVALID("invalid"),
        EMPTY("");
        
        @NotNull
        private final String F;

        a(String str) {
            this.F = str;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return this.F;
        }
    }

    public n13(@Nullable T t, @NotNull NativeMediatedAsset nativeMediatedAsset, @NotNull Partner partner) {
        c25.p(nativeMediatedAsset, "nativeMediatedAsset");
        c25.p(partner, "partner");
        this.a = t;
        this.b = nativeMediatedAsset;
        this.c = partner;
    }

    @Nullable
    public final T a() {
        return this.a;
    }

    @NotNull
    public final NativeMediatedAsset b() {
        return this.b;
    }

    @NotNull
    public final Partner c() {
        return this.c;
    }
}