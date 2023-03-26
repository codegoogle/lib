package com.p7700g.p99005;

import com.greedygame.core.adview.general.GGAdview;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface k93 {
    @NotNull
    public static final a a = a.a;

    /* loaded from: classes3.dex */
    public static final class a {
        public static final /* synthetic */ a a = new a();

        private a() {
        }

        @Nullable
        public final k93 a(@NotNull GGAdview gGAdview, @NotNull n03 n03Var, @NotNull n13<?> n13Var, @NotNull o33 o33Var, boolean z) {
            c25.p(gGAdview, "ggAdview");
            c25.p(n03Var, "unitConfig");
            c25.p(n13Var, "partnerAdInfo");
            c25.p(o33Var, com.anythink.expressad.a.B);
            if (z) {
                String g = n13Var.c().g();
                if (c25.g(g, y33.ADMOB.g())) {
                    return new l93(gGAdview, n03Var, n13Var, o33Var);
                }
                if (c25.g(g, y33.FACEBOOK.g())) {
                    return new m93(n13Var, o33Var);
                }
                if (c25.g(g, y33.MOPUB.g())) {
                    return new n93(n13Var, o33Var);
                }
                return null;
            }
            return null;
        }
    }

    void a();
}