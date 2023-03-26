package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdErrorType;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import org.json.JSONException;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.ap  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1224ap implements InterfaceC0907Pn {
    public static byte[] A02;
    public final /* synthetic */ long A00;
    public final /* synthetic */ KF A01;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{8, 15, 94, 89, 9, 88, 10, 14, 89, 9, 10, 93, Flags.CD, 14, 95, 12, 16, 9, 21, 20, 31, 34, 57, ax5.a, bx.W5, 46, 51, 53, 52, 96, 122, 83, 101, 114, 118, 101, 114, 32, 101, 114, 114, 111, 114, 32, 111, 99, 99, 117, 114, 114, 101, 100, 117, 67, 84, 80, 67, 84, 6, 84, 67, 86, 74, 79, 67, 66, 6, 85, 83, 69, 69, 67, 85, 85, 64, 83, 74, 74, 95, 19, 18, ax5.a, 19, 17, 12, 16, 25, 8, 25, 61, 60, 23, 32, 32, 61, 32};
    }

    public C1224ap(KF kf, long j) {
        this.A01 = kf;
        this.A00 = j;
    }

    private final void A02(C0919Pz c0919Pz) {
        KC kc;
        C1080Wh c1080Wh;
        long j;
        C1080Wh c1080Wh2;
        long j2;
        KG kg;
        C1080Wh c1080Wh3;
        String str;
        C1080Wh c1080Wh4;
        long j3;
        kc = this.A01.A01;
        KB.A07(kc);
        try {
            InterfaceC0905Pl A00 = c0919Pz.A00();
            if (A00 != null) {
                String A5U = A00.A5U();
                kg = this.A01.A06;
                c1080Wh3 = this.A01.A05;
                long j4 = this.A00;
                str = this.A01.A03;
                KI A06 = kg.A06(c1080Wh3, A5U, j4, str);
                if (A06.A01() == KH.A03) {
                    C1203aU c1203aU = (C1203aU) A06;
                    String A04 = c1203aU.A04();
                    AdErrorType adErrorTypeFromCode = AdErrorType.adErrorTypeFromCode(c1203aU.A03(), AdErrorType.ERROR_MESSAGE);
                    if (A04 != null) {
                        A5U = A04;
                    }
                    c1080Wh4 = this.A01.A05;
                    C0S A0A = c1080Wh4.A0A();
                    j3 = this.A01.A00;
                    A0A.A2m(LW.A01(j3), adErrorTypeFromCode.getErrorCode(), A5U, adErrorTypeFromCode.isPublicError());
                    this.A01.A0G(C0755Jm.A02(adErrorTypeFromCode, A5U));
                    return;
                }
            }
            AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
            String message = c0919Pz.getMessage();
            c1080Wh2 = this.A01.A05;
            C0S A0A2 = c1080Wh2.A0A();
            j2 = this.A01.A00;
            A0A2.A2m(LW.A01(j2), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
            this.A01.A0G(C0755Jm.A02(adErrorType, message));
        } catch (JSONException e) {
            AdErrorType adErrorType2 = AdErrorType.NETWORK_ERROR;
            String message2 = c0919Pz.getMessage();
            c1080Wh = this.A01.A05;
            C0S A0A3 = c1080Wh.A0A();
            j = this.A01.A00;
            long A01 = LW.A01(j);
            int errorCode = adErrorType2.getErrorCode();
            StringBuilder sb = new StringBuilder();
            String errorMessage = A00(16, 15, 14);
            sb.append(errorMessage);
            String errorMessage2 = e.getMessage();
            sb.append(errorMessage2);
            A0A3.A2m(A01, errorCode, sb.toString(), adErrorType2.isPublicError());
            this.A01.A0G(C0755Jm.A02(adErrorType2, message2));
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0907Pn
    public final void A9C(InterfaceC0905Pl interfaceC0905Pl) {
        KC kc;
        K0.A05(A00(79, 10, 40), A00(52, 27, 114), A00(8, 8, 59));
        if (interfaceC0905Pl != null) {
            String A5U = interfaceC0905Pl.A5U();
            kc = this.A01.A01;
            KB.A07(kc);
            this.A01.A0P(A5U, this.A00);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0907Pn
    public final void A9Y(Exception exc) {
        C1080Wh c1080Wh;
        long j;
        K0.A05(A00(89, 7, 6), A00(31, 21, 84), A00(0, 8, 104));
        if (C0919Pz.class.equals(exc.getClass())) {
            A02((C0919Pz) exc);
            return;
        }
        AdErrorType adErrorType = AdErrorType.NETWORK_ERROR;
        String message = exc.getMessage();
        c1080Wh = this.A01.A05;
        C0S A0A = c1080Wh.A0A();
        j = this.A01.A00;
        A0A.A2m(LW.A01(j), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
        this.A01.A0G(C0755Jm.A02(adErrorType, message));
    }
}