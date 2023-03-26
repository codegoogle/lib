package com.p7700g.p99005;

import com.greedygame.core.GreedyGameAds;
import com.p7700g.p99005.sz2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class r03 implements sz2.b {
    @NotNull
    public static final a s = new a(null);

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements g13 {
        public final /* synthetic */ d03 b;

        public b(d03 d03Var) {
            this.b = d03Var;
        }

        @Override // com.p7700g.p99005.g13
        public void a(@NotNull s13 s13Var) {
            c25.p(s13Var, "cause");
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core != null) {
                iNSTANCE$com_greedygame_sdkx_core.F(this);
            }
            xz2.d("BaseAdViewImpl", c25.C("Ad Load failed since GreedyGameAds SDK could not be initialized with error ", s13Var));
            d03 d03Var = this.b;
            if (d03Var == null) {
                return;
            }
            d03Var.a(r13.SDK_NOT_INTIALIZED);
        }

        @Override // com.p7700g.p99005.g13
        public void onInitSuccess() {
            GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
            if (iNSTANCE$com_greedygame_sdkx_core != null) {
                iNSTANCE$com_greedygame_sdkx_core.F(this);
            }
            xz2.c("BaseAdViewImpl", "SDK Init is now complete.Loading ads as requested");
            r03.this.G(this.b);
        }
    }

    private final void I(d03 d03Var) {
        StringBuilder G = wo1.G("Scheduling ad load for ");
        G.append(H().c());
        G.append(" after SDK is initialized");
        xz2.c("BaseAdViewImpl", G.toString());
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        if (iNSTANCE$com_greedygame_sdkx_core == null) {
            return;
        }
        iNSTANCE$com_greedygame_sdkx_core.p(new b(d03Var));
    }

    public abstract void D();

    public final void E(@Nullable d03 d03Var) {
        dc3 dc3Var = dc3.a;
        if (dc3Var.b()) {
            I(d03Var);
        } else if (dc3Var.a()) {
        } else {
            xz2.d("BaseAdViewImpl", "GreedyGameAds SDK should be initialised before an ad can be loaded. Run GreedyGameAds.initWith method. Refer docs for more information");
            if (d03Var == null) {
                return;
            }
            d03Var.a(r13.SDK_NOT_INTIALIZED);
        }
    }

    public abstract void F();

    public abstract void G(@Nullable d03 d03Var);

    @NotNull
    public abstract n03 H();

    public final void J() {
        xz2.c("BaseAdViewImpl", "Adding network status observer");
        sz2 a2 = sz2.a.a();
        if (a2 == null) {
            return;
        }
        a2.e(this);
    }

    public final void K() {
        xz2.c("BaseAdViewImpl", "Removing network status observer");
        sz2 a2 = sz2.a.a();
        if (a2 == null) {
            return;
        }
        a2.q(this);
    }

    @Override // com.p7700g.p99005.sz2.b
    public void u() {
        F();
    }

    @Override // com.p7700g.p99005.sz2.b
    public void x() {
        D();
    }
}