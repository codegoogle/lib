package com.p7700g.p99005;

import com.greedygame.core.network.model.responses.Partner;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public enum lc3 {
    BRAND,
    S2S,
    ADMOB,
    ADMOB_BANNER,
    ADMOB_INTERSTITIAL,
    ADMOB_REWARDED_AD,
    ADMOB_REWARDED_INTERSTITIAL,
    ADMOB_APP_OPEN,
    MOPUB,
    FACEBOOK,
    FACEBOOK_BANNER,
    FACEBOOK_INTERSTITIAL,
    FACEBOOK_REWARDED,
    S2S_INTERSTITIAL,
    S2S_BANNER,
    S2S_VIDEO,
    ERROR;
    
    @NotNull
    public static final a s = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: com.p7700g.p99005.lc3$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0209a {
            public static final /* synthetic */ int[] a;

            static {
                k13.values();
                int[] iArr = new int[4];
                iArr[k13.S2S.ordinal()] = 1;
                iArr[k13.SDK.ordinal()] = 2;
                iArr[k13.BRAND.ordinal()] = 3;
                iArr[k13.INVALID.ordinal()] = 4;
                a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final lc3 a(k13 k13Var, String str) {
            lc3 lc3Var;
            if (k13Var != null && str != null) {
                int i = C0209a.a[k13Var.ordinal()];
                if (i == 1) {
                    return c25.g(str, p13.S2S_INTERSTITIAL.f()) ? lc3.S2S_INTERSTITIAL : c25.g(str, p13.S2S_BANNER.f()) ? lc3.S2S_BANNER : c25.g(str, p13.S2S_VIDEO.f()) ? lc3.S2S_VIDEO : lc3.S2S;
                }
                if (i != 2) {
                    if (i == 3) {
                        return lc3.BRAND;
                    }
                    if (i != 4) {
                        throw new wo4();
                    }
                    lc3Var = lc3.ERROR;
                } else if (c25.g(str, p13.ADMOB.f())) {
                    lc3Var = lc3.ADMOB;
                } else if (c25.g(str, p13.ADMOB_BANNER.f())) {
                    lc3Var = lc3.ADMOB_BANNER;
                } else if (c25.g(str, p13.ADMOB_INTERSTITIAL.f())) {
                    lc3Var = lc3.ADMOB_INTERSTITIAL;
                } else if (c25.g(str, p13.ADMOB_REWARDED.f())) {
                    lc3Var = lc3.ADMOB_REWARDED_AD;
                } else if (c25.g(str, p13.ADMOB_REWARDED_INTERSTITIAL.f())) {
                    lc3Var = lc3.ADMOB_REWARDED_INTERSTITIAL;
                } else if (c25.g(str, p13.ADMOB_APP_OPEN.f())) {
                    lc3Var = lc3.ADMOB_APP_OPEN;
                } else if (c25.g(str, p13.FACEBOOK.f())) {
                    lc3Var = lc3.FACEBOOK;
                } else if (c25.g(str, p13.FACEBOOK_BANNER.f())) {
                    lc3Var = lc3.FACEBOOK_BANNER;
                } else if (c25.g(str, p13.FACEBOOK_INTERSTITIAL.f())) {
                    lc3Var = lc3.FACEBOOK_INTERSTITIAL;
                } else if (c25.g(str, p13.FACEBOOK_REWARDED.f())) {
                    lc3Var = lc3.FACEBOOK_REWARDED;
                } else {
                    lc3Var = c25.g(str, p13.MOPUB.f()) ? lc3.MOPUB : lc3.ERROR;
                }
                xz2.c(cz2.c(lc3.s), String.valueOf(lc3Var));
                return lc3Var;
            }
            xz2.c(cz2.c(this), "ERROR");
            return lc3.ERROR;
        }

        @NotNull
        public final lc3 b(@Nullable Partner partner) {
            return a(partner == null ? null : partner.e(), partner != null ? partner.g() : null);
        }
    }
}