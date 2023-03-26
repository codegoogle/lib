package com.p7700g.p99005;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.greedygame.core.AppConfig;
import com.greedygame.core.GreedyGameAds;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class p03 {
    @NotNull
    public static final a a = new a(null);
    @NotNull
    private static final p03 b = new p03(320, 50);
    @NotNull
    private static final p03 c = new p03(320, 100);
    @NotNull
    private static final p03 d = new p03(468, 60);
    @NotNull
    private static final p03 e = new p03(728, 90);
    @NotNull
    private static final p03 f = new p03(300, 250);
    @NotNull
    private static final p03 g = new p03(0, 0);
    private final int h;
    private final int i;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final p03 a() {
            return p03.b;
        }

        @NotNull
        public final p03 b(@Nullable Integer num) {
            return (num != null && num.intValue() == 1) ? a() : (num != null && num.intValue() == 2) ? c() : (num != null && num.intValue() == 3) ? f() : (num != null && num.intValue() == 4) ? d() : (num != null && num.intValue() == 5) ? e() : g();
        }

        @NotNull
        public final p03 c() {
            return p03.c;
        }

        @NotNull
        public final p03 d() {
            return p03.d;
        }

        @NotNull
        public final p03 e() {
            return p03.e;
        }

        @NotNull
        public final p03 f() {
            return p03.f;
        }

        @NotNull
        public final p03 g() {
            return p03.g;
        }
    }

    public p03(int i, int i2) {
        this.h = i;
        this.i = i2;
    }

    public final float a() {
        AppConfig r;
        Context e2;
        Resources resources;
        float f2 = this.h;
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        DisplayMetrics displayMetrics = null;
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (e2 = r.e()) != null && (resources = e2.getResources()) != null) {
            displayMetrics = resources.getDisplayMetrics();
        }
        return TypedValue.applyDimension(1, f2, displayMetrics);
    }

    public final float b() {
        AppConfig r;
        Context e2;
        Resources resources;
        float f2 = this.i;
        GreedyGameAds iNSTANCE$com_greedygame_sdkx_core = GreedyGameAds.a.getINSTANCE$com_greedygame_sdkx_core();
        DisplayMetrics displayMetrics = null;
        if (iNSTANCE$com_greedygame_sdkx_core != null && (r = iNSTANCE$com_greedygame_sdkx_core.r()) != null && (e2 = r.e()) != null && (resources = e2.getResources()) != null) {
            displayMetrics = resources.getDisplayMetrics();
        }
        return TypedValue.applyDimension(1, f2, displayMetrics);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p03) {
            p03 p03Var = (p03) obj;
            return this.h == p03Var.h && this.i == p03Var.i;
        }
        return false;
    }

    public int hashCode() {
        return (this.h * 31) + this.i;
    }

    @NotNull
    public String toString() {
        StringBuilder G = wo1.G("S2SBannerSize(width=");
        G.append(this.h);
        G.append(", height=");
        return wo1.y(G, this.i, ')');
    }
}