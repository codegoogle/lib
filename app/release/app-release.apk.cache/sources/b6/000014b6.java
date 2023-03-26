package com.facebook.ads.redexgen.X;

import android.content.pm.ActivityInfo;

/* renamed from: com.facebook.ads.redexgen.X.Vi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1055Vi implements InterfaceC04416i {
    public static String[] A01;
    public final /* synthetic */ C1057Vk A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"BjEOBj6HSQS8i4DRK2qoJX27hoC0R4DA", "kauKwe7CVPrqe4cOgSIwGmxqelbhToEk", "XZC7QZo7Jtp8ceyvJGPCObnucv7Agiw", "JUan8YMmX5ogxlB6aq0dkHVlKOHTqFeF", "IuTolVrjy7qRtOK6QcTLTodgNQuY61bU", "4L2hIP4Kb6m", "Yg6y90VIZ7Ah3ybSxqXW6wOi2HMwnGfT", "hl8KcVIJUlPiTEXEjbalUYczznSZgz62"};
    }

    public C1055Vi(C1057Vk c1057Vk) {
        this.A00 = c1057Vk;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04416i
    public final AbstractC04566x A50() {
        ActivityInfo[] activityInfoArr;
        ActivityInfo[] activityInfoArr2;
        activityInfoArr = this.A00.A04;
        if (activityInfoArr == null) {
            return this.A00.A08(EnumC04526t.A07);
        }
        C1057Vk c1057Vk = this.A00;
        activityInfoArr2 = c1057Vk.A04;
        if (A01[3].charAt(20) != 'k') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "ZFJR0DMAu8l3jjK6mMcKAcH3eLfgQnHb";
        strArr[4] = "ZFJR0DMAu8l3jjK6mMcKAcH3eLfgQnHb";
        return c1057Vk.A05(activityInfoArr2.length);
    }
}