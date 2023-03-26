package com.p7700g.p99005;

import android.os.Bundle;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.UiiConfiguration;
import com.mopub.nativeads.NativeClickHandler;
import com.mopub.nativeads.StaticNativeAd;
import com.mopub.nativeads.VideoNativeAd;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class t93 extends q13 {
    @NotNull
    public static final a l = new a(null);
    @NotNull
    private final yb3 m;
    @Nullable
    private NativeClickHandler n;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            UiiConfiguration.c.values();
            int[] iArr = new int[3];
            iArr[UiiConfiguration.c.FLAT.ordinal()] = 1;
            iArr[UiiConfiguration.c.WRAP.ordinal()] = 2;
            iArr[UiiConfiguration.c.WRAP_GRADIENT.ordinal()] = 3;
            a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t93(@NotNull yb3 yb3Var) {
        super(yb3Var);
        c25.p(yb3Var, "baseView");
        this.m = yb3Var;
    }

    private final void B(StaticNativeAd staticNativeAd) {
        l13 r93Var;
        UiiConfiguration F;
        n13<?> y = y();
        if (y == null) {
            return;
        }
        if (yz2.a.e(a().f())) {
            r93Var = new v93(this, y, staticNativeAd);
        } else {
            Ad p = p();
            UiiConfiguration.c cVar = null;
            if (p != null && (F = p.F()) != null) {
                cVar = F.d();
            }
            int i = cVar == null ? -1 : b.a[cVar.ordinal()];
            if (i == -1 || i == 1) {
                r93Var = new r93(this, y, staticNativeAd);
            } else if (i == 2) {
                r93Var = new v93(this, y, staticNativeAd);
            } else if (i != 3) {
                throw new wo4();
            } else {
                r93Var = new s93(this, y, staticNativeAd);
            }
        }
        r93Var.f();
    }

    private final void C(VideoNativeAd videoNativeAd) {
        l13 r93Var;
        UiiConfiguration F;
        n13<?> y = y();
        if (y == null) {
            return;
        }
        if (yz2.a.e(a().f())) {
            r93Var = new v93(this, y, videoNativeAd);
        } else {
            Ad p = p();
            UiiConfiguration.c cVar = null;
            if (p != null && (F = p.F()) != null) {
                cVar = F.d();
            }
            int i = cVar == null ? -1 : b.a[cVar.ordinal()];
            if (i == -1 || i == 1) {
                r93Var = new r93(this, y, videoNativeAd);
            } else if (i == 2) {
                r93Var = new v93(this, y, videoNativeAd);
            } else if (i != 3) {
                throw new wo4();
            } else {
                r93Var = new s93(this, y, videoNativeAd);
            }
        }
        r93Var.f();
    }

    @Override // com.p7700g.p99005.q13, com.p7700g.p99005.s23
    @NotNull
    public yb3 a() {
        return this.m;
    }

    @Override // com.p7700g.p99005.q13, com.p7700g.p99005.s23
    public void c(@Nullable Bundle bundle) {
        this.n = new NativeClickHandler(a().getContext());
        super.c(bundle);
    }

    @Override // com.p7700g.p99005.q13
    public void x() {
        if (y() != null) {
            n13<?> y = y();
            Object a2 = y == null ? null : y.a();
            if (a2 instanceof StaticNativeAd) {
                n13<?> y2 = y();
                r1 = y2 != null ? y2.a() : null;
                Objects.requireNonNull(r1, "null cannot be cast to non-null type com.mopub.nativeads.StaticNativeAd");
                B((StaticNativeAd) r1);
            } else if (a2 instanceof VideoNativeAd) {
                n13<?> y3 = y();
                r1 = y3 != null ? y3.a() : null;
                Objects.requireNonNull(r1, "null cannot be cast to non-null type com.mopub.nativeads.VideoNativeAd");
                C((VideoNativeAd) r1);
            }
            r1 = yq4.a;
        }
        if (r1 == null) {
            a().a();
        }
    }
}