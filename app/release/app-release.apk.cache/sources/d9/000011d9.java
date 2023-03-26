package com.facebook.ads.redexgen.X;

import java.util.LinkedList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Jj  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0753Jj {
    public final InterfaceC0751Jh A0B;
    public final boolean A0F;
    public final String A0C = C0753Jj.class.getSimpleName();
    public final int A07 = 101;
    public final int A0A = 102;
    public final int A08 = 103;
    public final int A03 = 104;
    public final int A09 = 105;
    public final int A02 = 106;
    public final int A04 = 107;
    public final int A05 = 108;
    public final int A06 = 109;
    public final int A01 = 110;
    public final boolean A0E = false;
    public long A00 = -1;
    public final List<C0752Ji> A0D = new LinkedList();

    public C0753Jj(C8H c8h, InterfaceC0751Jh interfaceC0751Jh) {
        int A0D = J9.A0D(c8h);
        if (A0D < 1) {
            this.A0F = false;
        } else {
            double sessionRandom = A0D;
            this.A0F = c8h.A05().A00() < 1.0d / sessionRandom;
        }
        this.A0B = interfaceC0751Jh;
    }

    private int A00() {
        return this.A0B.A5s();
    }

    private int A01() {
        if (this.A00 > 0) {
            return (int) (System.currentTimeMillis() - this.A00);
        }
        return -1;
    }

    private void A03(C0752Ji c0752Ji) {
        synchronized (this.A0D) {
            this.A0D.add(c0752Ji);
        }
    }

    public final void A04() {
        if (!this.A0F) {
            return;
        }
        A03(new C0752Ji(A01(), 110, A00(), null));
    }

    public final void A05() {
        if (!this.A0F) {
            return;
        }
        A03(new C0752Ji(A01(), 106, A00(), null));
    }

    public final void A06() {
        if (!this.A0F) {
            return;
        }
        A03(new C0752Ji(A01(), 104, A00(), null));
    }

    public final void A07() {
        if (!this.A0F) {
            return;
        }
        A03(new C0752Ji(A01(), 109, -1, null));
    }

    public final void A08() {
        if (!this.A0F) {
            return;
        }
        A03(new C0752Ji(A01(), 107, A00(), null));
    }

    public final void A09() {
        if (!this.A0F) {
            return;
        }
        A03(new C0752Ji(A01(), 108, A00(), null));
    }

    public final void A0A() {
        if (!this.A0F) {
            return;
        }
        this.A00 = System.currentTimeMillis();
        A03(new C0752Ji(0, 101, -1, null));
    }

    public final void A0B() {
        if (!this.A0F) {
            return;
        }
        A03(new C0752Ji(A01(), 105, A00(), null));
    }

    public final void A0C() {
        if (!this.A0F) {
            return;
        }
        A03(new C0752Ji(A01(), 102, A00(), null));
    }

    public final void A0D(C8H c8h, String str) {
        if (!this.A0F) {
            return;
        }
        A03(new C0752Ji(A01(), 103, A00(), null));
        ExecutorC0800Lj.A06.execute(new RunnableC0750Jg(this, str, c8h));
    }
}