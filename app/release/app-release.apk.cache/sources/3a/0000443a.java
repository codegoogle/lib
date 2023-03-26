package com.p7700g.p99005;

import android.view.View;
import com.p7700g.p99005.b03;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ga3 extends da3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga3(@NotNull q13 q13Var, @NotNull n13<?> n13Var) {
        super(q13Var, n13Var);
        c25.p(q13Var, "mediationPresenter");
        c25.p(n13Var, "adView");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        if ((r1.length() > 0) == true) goto L10;
     */
    @Override // com.p7700g.p99005.da3, com.p7700g.p99005.l13
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void f() {
        if (yz2.a.e(i())) {
            i().setContentView(b03.k.V);
        } else {
            i().setContentView(b03.k.Z);
            View findViewById = i().findViewById(b03.h.x1);
            String p = k().p();
            boolean z = true;
            if (p != null) {
            }
            z = false;
            findViewById.setVisibility(z ? 0 : 8);
        }
        super.f();
    }
}