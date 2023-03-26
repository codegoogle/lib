package com.facebook.ads.redexgen.X;

import android.view.View;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Nr */
/* loaded from: assets/audience_network.dex */
public class C0859Nr {
    @Nullable
    public View A02;
    @Nullable
    public M1 A03;
    @Nullable
    public H2 A04;
    public final View A05;
    public final AnonymousClass16 A06;
    public final C1080Wh A07;
    public final JE A08;
    public final LX A09;
    public final M6 A0A;
    public final C0901Ph A0B;
    public int A01 = 0;
    public int A00 = 1;

    public C0859Nr(C1080Wh c1080Wh, JE je, M6 m6, AnonymousClass16 anonymousClass16, View view, C0901Ph c0901Ph, LX lx) {
        this.A07 = c1080Wh;
        this.A08 = je;
        this.A0A = m6;
        this.A06 = anonymousClass16;
        this.A05 = view;
        this.A0B = c0901Ph;
        this.A09 = lx;
    }

    public final C0859Nr A0C(int i) {
        this.A00 = i;
        return this;
    }

    public final C0859Nr A0D(int i) {
        this.A01 = i;
        return this;
    }

    public final C0859Nr A0E(View view) {
        this.A02 = view;
        return this;
    }

    public final C0859Nr A0F(M1 m1) {
        this.A03 = m1;
        return this;
    }

    public final C0859Nr A0G(H2 h2) {
        this.A04 = h2;
        return this;
    }

    public final C0860Ns A0H() {
        return new C0860Ns(this);
    }
}