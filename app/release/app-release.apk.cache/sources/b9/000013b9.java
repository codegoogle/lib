package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.AdError;
import com.p7700g.p99005.g15;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ra  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0946Ra implements InterfaceC03020v {
    public static byte[] A02;
    public static String[] A03;
    public final /* synthetic */ C0638Eu A00;
    public final /* synthetic */ Runnable A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] - i3) - 16);
            if (A03[2].charAt(4) == 'y') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "2VG06oAYTcRzKBDE7gWFCU36hzL5px1b";
            strArr[7] = "j1xG2z3v9jq0UO66H2WqYNbpklLAu6IG";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{111, -94, -94, 115, 113, -97, 119, 113, -124, -93, -80, -80, -89, -76, 98, -85, -81, -78, -76, -89, -75, -75, -85, -79, -80, 98, -88, -85, -76, -89, -90, -118, -119, 93, 124, -119, -119, g15.b, -115, 103, -118, -126, -126, -124, -119, -126, 100, -120, -117, -115, g15.b, -114, -114, -124, -118, -119};
    }

    public static void A02() {
        A03 = new String[]{"7FIKHU9lgq27", "AgQqvAltXhi1bYF8zppFCZ", "CRAmwsbXNtyv0vmCJJ9qOPCwxUiND3E6", "ItQqdqoRYHMWKQzbVRTeHzNwEAi", "W2szVhKnaW", "HNVKE5hkEvipBMdeuLWXlSQ07SgK2Jmi", "9NOG2BA2dnlUEqMWgY53wMXC47FXKBrl", "EneshuO9jiHnlHF2bjWwp7WA0EKVaMOF"};
    }

    public C0946Ra(C0638Eu c0638Eu, Runnable runnable) {
        this.A00 = c0638Eu;
        this.A01 = runnable;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03020v
    public final void A91(RD rd) {
        C0591Cv c0591Cv;
        c0591Cv = this.A00.A00;
        c0591Cv.A0A().A3k();
        this.A00.A07.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03020v
    public final void A92(RD rd, View view) {
        C0591Cv c0591Cv;
        c0591Cv = this.A00.A00;
        c0591Cv.A0A().A3j(rd == this.A00.A01);
        if (rd != this.A00.A01) {
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        InterfaceC02940n interfaceC02940n = this.A00.A02;
        C0638Eu c0638Eu = this.A00;
        c0638Eu.A02 = rd;
        ((AbstractC0950Re) c0638Eu).A00 = view;
        if (!c0638Eu.A0D) {
            this.A00.A07.A0E(rd);
            return;
        }
        this.A00.A07.A0D(view);
        this.A00.A0P(interfaceC02940n);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03020v
    public final void A93(RD rd, AdError adError) {
        C0591Cv c0591Cv;
        c0591Cv = this.A00.A00;
        c0591Cv.A0A().A3l(rd == this.A00.A01, adError.getErrorCode());
        if (rd != this.A00.A01) {
            return;
        }
        this.A00.A0G().removeCallbacks(this.A01);
        this.A00.A0P(rd);
        this.A00.A0O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03020v
    public final void A94(RD rd) {
        C0591Cv c0591Cv;
        K0.A05(A00(31, 25, 11), A00(8, 23, 50), A00(0, 8, 46));
        c0591Cv = this.A00.A00;
        c0591Cv.A0A().A3m();
        this.A00.A07.A0C();
        this.A00.A0M();
    }
}