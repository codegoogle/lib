package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.b9  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1243b9 extends AbstractRunnableC0770Kc {
    public static String[] A01;
    public final /* synthetic */ C1245bB A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"Ghau2wrk1frvp21ETj6mp24XqInrZhWz", "17fIRlTyn5cqQeNpKhzMID", "pR32sk291HY6M3I9Rqv7DOtrmJFLMHGG", "lklFRXjqHO02dLIfiJk5MunT6DW2lX4u", "pu6rG6tzkOYAls8kWhwJFGkhlkg8qDKn", "lnKlSHHeiiV2wTMqAgm3Jfjv4MIuVQTY", "NrilDOC5Woxhobx5Zl8i48KFnKR1bBLL", "sE8NFlpROkCeKIAQdfQPoEsulpgCWNDW"};
    }

    public C1243b9(C1245bB c1245bB) {
        this.A00 = c1245bB;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        long j;
        long j2;
        C1245bB.A00(this.A00);
        j = this.A00.A01;
        if (j > 0) {
            try {
                j2 = this.A00.A01;
                Thread.sleep(j2);
            } catch (InterruptedException unused) {
            }
        }
        this.A00.A0B();
        String[] strArr = A01;
        if (strArr[5].charAt(14) == strArr[6].charAt(14)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[5] = "LjJXLz5e9h3DI08dt7Kr5SwInwXqLWiO";
        strArr2[6] = "Pc0bl4Jkvuydlkjlb12SvYG2JTb7UQAm";
    }
}