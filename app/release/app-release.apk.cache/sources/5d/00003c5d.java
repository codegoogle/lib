package com.p7700g.p99005;

import com.google.android.gms.ads.AdView;
import com.greedygame.core.network.model.responses.Ad;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class c93 extends v83 {
    @NotNull
    public static final a m = new a(null);
    @NotNull
    private final yb3 n;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c93(@NotNull yb3 yb3Var) {
        super(yb3Var);
        c25.p(yb3Var, "baseView");
        this.n = yb3Var;
    }

    @Override // com.p7700g.p99005.v83, com.p7700g.p99005.q13, com.p7700g.p99005.s23
    @NotNull
    public yb3 a() {
        return this.n;
    }

    @Override // com.p7700g.p99005.v83, com.p7700g.p99005.q13
    public void x() {
        if (y() == null) {
            a().a();
        }
        n13<?> y = y();
        yq4 yq4Var = null;
        if (y != null) {
            n13<?> y2 = y();
            Object a2 = y2 == null ? null : y2.a();
            Objects.requireNonNull(a2, "null cannot be cast to non-null type com.google.android.gms.ads.AdView");
            AdView adView = (AdView) a2;
            Ad p = p();
            if (p != null) {
                new b93(this, y, p, adView).f();
                yq4Var = yq4.a;
            }
        }
        if (yq4Var == null) {
            a().a();
        }
    }
}