package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.ads.redexgen.X.Ls  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0809Ls {
    @Nullable
    public static C0809Ls A02;
    public final C1170Zx A00;
    public final C0811Lu A01;

    public C0809Ls(C1080Wh c1080Wh, Executor executor, AnonymousClass90 anonymousClass90) {
        this.A01 = new C0811Lu(c1080Wh);
        this.A00 = new C1170Zx(executor, anonymousClass90, c1080Wh);
    }

    private void A00() {
        this.A01.A03(this.A00);
    }

    public static void A01(C1080Wh c1080Wh, Executor executor, AnonymousClass90 anonymousClass90) {
        if (!J8.A0v(c1080Wh)) {
            return;
        }
        C0809Ls c0809Ls = A02;
        if (c0809Ls == null) {
            A02 = new C0809Ls(c1080Wh, executor, anonymousClass90);
            A02.A00();
            return;
        }
        c0809Ls.A02(anonymousClass90);
    }

    private void A02(AnonymousClass90 anonymousClass90) {
        this.A00.A07(anonymousClass90);
    }
}