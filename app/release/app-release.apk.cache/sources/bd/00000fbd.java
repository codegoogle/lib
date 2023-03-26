package com.facebook.ads.redexgen.X;

import android.os.Handler;
import androidx.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Aa  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0528Aa {
    public int A00;
    public int A01;
    public Handler A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final AY A0A;
    public final AZ A0B;
    public final AbstractC0536Aj A0C;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public C0528Aa(AY ay, AZ az, AbstractC0536Aj abstractC0536Aj, int i, Handler handler) {
        this.A0A = ay;
        this.A0B = az;
        this.A0C = abstractC0536Aj;
        this.A03 = handler;
        this.A01 = i;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Handler A03() {
        return this.A03;
    }

    public final AZ A04() {
        return this.A0B;
    }

    public final C0528Aa A05() {
        I1.A04(!this.A09);
        if (this.A02 == -9223372036854775807L) {
            I1.A03(this.A05);
        }
        this.A09 = true;
        this.A0A.ACr(this);
        return this;
    }

    public final C0528Aa A06(int i) {
        I1.A04(!this.A09);
        this.A00 = i;
        return this;
    }

    public final C0528Aa A07(@Nullable Object obj) {
        I1.A04(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final AbstractC0536Aj A08() {
        return this.A0C;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z) {
        this.A07 |= z;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        I1.A04(this.A09);
        I1.A04(this.A03.getLooper().getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}