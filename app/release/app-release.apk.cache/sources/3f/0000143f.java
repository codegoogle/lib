package com.facebook.ads.redexgen.X;

import android.content.pm.ApplicationInfo;

/* renamed from: com.facebook.ads.redexgen.X.Tn  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1008Tn implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ U7 A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"273FKnw5fEMMMPHYpDWr2uCxLH", "MURfYE", "2MrWxfjycJYz8CRz8nVEoUtgAppiNGkb", "dgs6GO1Bgwq7bEpFzLz1V7Vq3FkVRsxg", "uUhMN1Ac0a0MVvdzsNpT9rjxKSsemVru", "HLxj17LMU0ZLExoNf0E99eYx3QTlHuEl", "3ccBwYNuPT2bbHKd70up9vlieZX79PEX", "FpcSlILO2LyEt0C9jtDQqRZtHAa4Q2N9"};
    }

    public C1008Tn(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ApplicationInfo applicationInfo;
        ApplicationInfo applicationInfo2;
        applicationInfo = this.A00.A01;
        if (applicationInfo == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        U7 u7 = this.A00;
        applicationInfo2 = u7.A01;
        if (A01[1].length() != 3) {
            String[] strArr = A01;
            strArr[3] = "Yec9tINwCXE8zEgRYPM9thJfbPEs0Pqz";
            strArr[3] = "Yec9tINwCXE8zEgRYPM9thJfbPEs0Pqz";
            return u7.A09(applicationInfo2.taskAffinity);
        }
        throw new RuntimeException();
    }
}