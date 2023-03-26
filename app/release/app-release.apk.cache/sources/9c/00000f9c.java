package com.facebook.ads.redexgen.X;

import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: assets/audience_network.dex */
public final class A2 implements InterfaceC1233ay, Comparator<C0709Hp> {
    public static String[] A03;
    public long A00;
    public final long A01;
    public final TreeSet<C0709Hp> A02 = new TreeSet<>(this);

    static {
        A01();
    }

    public static void A01() {
        A03 = new String[]{"qrCZDebBZXOMsu5PI8FdamZv", "usPTrKdLrE7MLvxS6mJMRwkls4hZpcPz", "BDrpv9J1bckqz2zbQbGMwvdv", "cHdTuf55w1r5Lcr9n47avjSAGBdp9rLc", "v1mI", "NFtkBlX9Mz", "lz", "jBDMosIM65rjrOuIbY8WA7ZUxyDm84U3"};
    }

    public A2(long j) {
        this.A01 = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00 */
    public final int compare(C0709Hp c0709Hp, C0709Hp c0709Hp2) {
        if (c0709Hp.A00 - c0709Hp2.A00 == 0) {
            return c0709Hp.compareTo(c0709Hp2);
        }
        return c0709Hp.A00 < c0709Hp2.A00 ? -1 : 1;
    }

    private void A02(InterfaceC0705Hl interfaceC0705Hl, long j) {
        while (this.A00 + j > this.A01) {
            boolean isEmpty = this.A02.isEmpty();
            if (A03[4].length() == 25) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "3qXh8T5e4LOlD1IWJEc6SNWF";
            strArr[2] = "YJzC3pPkQPrTmiUzc4g95RWz";
            if (!isEmpty) {
                try {
                    interfaceC0705Hl.ACO(this.A02.first());
                } catch (C0703Hj unused) {
                }
            } else {
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0704Hk
    public final void AAy(InterfaceC0705Hl interfaceC0705Hl, C0709Hp c0709Hp) {
        this.A02.add(c0709Hp);
        this.A00 += c0709Hp.A01;
        A02(interfaceC0705Hl, 0L);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0704Hk
    public final void AAz(InterfaceC0705Hl interfaceC0705Hl, C0709Hp c0709Hp) {
        this.A02.remove(c0709Hp);
        this.A00 -= c0709Hp.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0704Hk
    public final void AB0(InterfaceC0705Hl interfaceC0705Hl, C0709Hp c0709Hp, C0709Hp c0709Hp2) {
        AAz(interfaceC0705Hl, c0709Hp);
        AAy(interfaceC0705Hl, c0709Hp2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1233ay
    public final void AB1(InterfaceC0705Hl interfaceC0705Hl, String str, long j, long j2) {
        A02(interfaceC0705Hl, j2);
    }
}