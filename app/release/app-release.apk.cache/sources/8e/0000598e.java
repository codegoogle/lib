package com.p7700g.p99005;

import com.facebook.ads.NativeAd;
import com.greedygame.core.network.model.responses.Ad;
import com.greedygame.core.network.model.responses.UiiConfiguration;
import java.util.Objects;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r83 extends q13 {
    @NotNull
    private final yb3 l;

    /* loaded from: classes3.dex */
    public /* synthetic */ class a {
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
    public r83(@NotNull yb3 yb3Var) {
        super(yb3Var);
        c25.p(yb3Var, "baseView");
        this.l = yb3Var;
    }

    private final void B(NativeAd nativeAd) {
        l13 s83Var;
        UiiConfiguration F;
        n13<?> y = y();
        if (y == null) {
            return;
        }
        if (yz2.a.e(a().f())) {
            s83Var = new u83(this, y, nativeAd);
        } else {
            Ad p = p();
            UiiConfiguration.c cVar = null;
            if (p != null && (F = p.F()) != null) {
                cVar = F.d();
            }
            int i = cVar == null ? -1 : a.a[cVar.ordinal()];
            if (i == -1 || i == 1) {
                s83Var = new s83(this, y, nativeAd);
            } else if (i == 2) {
                s83Var = new u83(this, y, nativeAd);
            } else if (i != 3) {
                throw new wo4();
            } else {
                s83Var = new t83(this, y, nativeAd);
            }
        }
        s83Var.f();
    }

    @Override // com.p7700g.p99005.q13, com.p7700g.p99005.s23
    @NotNull
    public yb3 a() {
        return this.l;
    }

    @Override // com.p7700g.p99005.q13
    public void x() {
        if (y() != null) {
            n13<?> y = y();
            c25.m(y);
            if (y.a() instanceof NativeAd) {
                n13<?> y2 = y();
                c25.m(y2);
                Object a2 = y2.a();
                Objects.requireNonNull(a2, "null cannot be cast to non-null type com.facebook.ads.NativeAd");
                B((NativeAd) a2);
                return;
            }
        }
        a().a();
    }
}