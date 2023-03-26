package com.facebook.ads.redexgen.X;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: assets/audience_network.dex */
public abstract class AV implements InterfaceC1183aA {
    public static String[] A06;
    public long A00;
    public long A01;
    public C03482p A02;
    public final ArrayDeque<C03482p> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC0529Ab> A04;
    public final PriorityQueue<C03482p> A05;

    static {
        A0L();
    }

    public static void A0L() {
        A06 = new String[]{"xrToQ1M30eypgaiDt2KcbeXQSJmH4zEy", "FOMm0GJvPogulFgRKU73d9QQGInBRxBZ", "DAifx7fz7Oznb", "tEspMkbIuGZVzgapMfnbK02RMeMH6P5b", "hnmT", "jbKY175w2AZdEkpyONR9SNFucMTvW6Vd", "vt70xpgsPpIXmuxmiV", "wsDuhCL"};
    }

    public abstract GG A0N();

    public abstract void A0R(C0543Aq c0543Aq);

    public abstract boolean A0T();

    public AV() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new C03482p());
        }
        this.A04 = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.A04.add(new C03472o(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0M(C03482p c03482p) {
        c03482p.A07();
        this.A03.add(c03482p);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0556Bd
    /* renamed from: A0O */
    public C0543Aq A4h() throws GH {
        I1.A04(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0556Bd
    /* renamed from: A0P */
    public AbstractC0529Ab A4i() throws GH {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C1121Xw) this.A05.peek()).A00 <= this.A00) {
            C03482p poll = this.A05.poll();
            if (poll.A04()) {
                AbstractC0529Ab pollFirst = this.A04.pollFirst();
                pollFirst.A00(4);
                if (A06[6].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A06;
                strArr[4] = "hAEA";
                strArr[4] = "hAEA";
                A0M(poll);
                return pollFirst;
            }
            A0R(poll);
            if (A0T()) {
                GG A0N = A0N();
                if (!poll.A03()) {
                    AbstractC0529Ab pollFirst2 = this.A04.pollFirst();
                    pollFirst2.A09(((C1121Xw) poll).A00, A0N, Long.MAX_VALUE);
                    A0M(poll);
                    return pollFirst2;
                }
            }
            A0M(poll);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0556Bd
    /* renamed from: A0Q */
    public void ABw(C0543Aq c0543Aq) throws GH {
        I1.A03(c0543Aq == this.A02);
        if (c0543Aq.A03()) {
            C03482p c03482p = this.A02;
            String[] strArr = A06;
            if (strArr[5].charAt(10) != strArr[3].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[5] = "0mhI93daunZi59PwiuGO0KbLyKVCPwQH";
            strArr2[3] = "r2E3xZENv7Zr1SQt92aJBQoSxSc5nrbU";
            A0M(c03482p);
        } else {
            C03482p c03482p2 = this.A02;
            long j = this.A01;
            this.A01 = 1 + j;
            c03482p2.A00 = j;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0S(AbstractC0529Ab abstractC0529Ab) {
        abstractC0529Ab.A07();
        this.A04.add(abstractC0529Ab);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0556Bd
    public void ACD() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1183aA
    public void AD4(long j) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0556Bd
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0M(this.A05.poll());
        }
        C03482p c03482p = this.A02;
        if (c03482p != null) {
            A0M(c03482p);
            this.A02 = null;
        }
    }
}