package com.p7700g.p99005;

import android.view.View;
import com.google.android.gms.ads.nativead.NativeAd;
import com.p7700g.p99005.b03;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d83 extends a83 {
    @NotNull
    private final NativeAd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d83(@NotNull q13 q13Var, @NotNull n13<?> n13Var, @NotNull NativeAd nativeAd) {
        super(q13Var, n13Var, nativeAd);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
        c25.p(nativeAd, "ad");
        this.f = nativeAd;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
        if ((r1.length() > 0) == true) goto L10;
     */
    @Override // com.p7700g.p99005.a83, com.p7700g.p99005.l13
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f() {
        if (yz2.a.e(i())) {
            i().setContentView(b03.k.S);
        } else {
            i().setContentView(b03.k.W);
            View findViewById = i().findViewById(b03.h.x1);
            String store = this.f.getStore();
            boolean z = true;
            if (store != null) {
            }
            z = false;
            findViewById.setVisibility(z ? 0 : 8);
        }
        super.f();
    }
}