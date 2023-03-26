package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.bM  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1255bM implements NT {
    public static String[] A01;
    public final /* synthetic */ C1258bP A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"PnhhxO44eyGR", "6RYeLXmAClA1SiGKn201px", "WqNcg2MFF", "kFMGwY5yNNV", "mQRpAL1oxGJgw", "Eqf6jMIzeI3tCjJb", "9imsVe3tjkVzhTosgYrmf1lKW7QE2MSM", "NRYl8cTHkwcGHXULnCD2cakkWnkUWd4e"};
    }

    public C1255bM(C1258bP c1258bP) {
        this.A00 = c1258bP;
    }

    @Override // com.facebook.ads.redexgen.X.NT
    public final void A9g(boolean z) {
        AtomicBoolean atomicBoolean;
        AtomicBoolean atomicBoolean2;
        JT jt;
        JT jt2;
        atomicBoolean = this.A00.A0D;
        atomicBoolean.set(z);
        atomicBoolean2 = this.A00.A0E;
        if (!atomicBoolean2.get()) {
            return;
        }
        jt = this.A00.A02;
        if (jt != null) {
            C1258bP c1258bP = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "moHDWw2Q1";
            strArr2[2] = "moHDWw2Q1";
            jt2 = c1258bP.A02;
            jt2.AAP(z);
        }
    }
}