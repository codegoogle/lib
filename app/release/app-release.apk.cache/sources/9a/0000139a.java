package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public abstract class R5 extends AbstractC02860f {
    public static byte[] A02;
    public static String[] A03;
    public final C02930m A00;
    public final boolean A01;

    static {
        A0C();
        A0B();
    }

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
            if (A03[3].charAt(0) != '7') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "PWjD";
            strArr[5] = "PWjD";
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A02 = new byte[]{93, 114, 119, 125, 117, 62, 114, 113, 121, 121, 123, 122, 71, 68, 70, 78, 122, 81, 76, 72, 64, 22, 31, 27, 12, 31, 37, 14, 19, 23, 31, 45, 55, 54, 33, 45, 47, 39};
    }

    public static void A0C() {
        A03 = new String[]{"1", "OJ2IOsbUnCKybSqk53zM3JXcifahO", "e4RldewFXKwYCBzcZ5CwWZ5XjhlRHNiJ", "729G42gqUNiz5ZAUAxRhvFZ2YWMhTd0L", "J1Ql0tv9onNfDvsMKNTgjNyaDa6Pnzub", "9fBm", "mbPUpspz4Nj5AFGqwEe2w9x9WWs", "2uSYGuFAJgr"};
    }

    public abstract void A0E();

    public R5(C1080Wh c1080Wh, JE je, String str, @Nullable C02930m c02930m, boolean z) {
        super(c1080Wh, je, str);
        this.A00 = c02930m;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02860f
    public final void A0D() {
        C02930m c02930m = this.A00;
        if (c02930m != null) {
            c02930m.A08(this.A02);
        }
        A0E();
    }

    public final void A0F(Map<String, String> userReturnDataMap, @Nullable EnumC02850e enumC02850e) {
        if (!TextUtils.isEmpty(this.A02)) {
            if (this instanceof F3) {
                super.A01.A8K(this.A02, userReturnDataMap);
            } else {
                JE je = super.A01;
                String str = this.A02;
                if (A03[6].length() != 8) {
                    String[] strArr = A03;
                    strArr[6] = "4hYdj7INWre5bef3R1byHGHBMmQCX";
                    strArr[6] = "4hYdj7INWre5bef3R1byHGHBMmQCX";
                    je.A88(str, userReturnDataMap);
                } else {
                    String[] strArr2 = A03;
                    strArr2[5] = "IMSq";
                    strArr2[5] = "IMSq";
                    je.A88(str, userReturnDataMap);
                }
            }
            boolean A022 = EnumC02850e.A02(enumC02850e);
            if (A03[1].length() == 32) {
                throw new RuntimeException();
            }
            String[] strArr3 = A03;
            strArr3[0] = "X";
            strArr3[0] = "X";
            C02930m c02930m = this.A00;
            if (c02930m != null) {
                c02930m.A07(enumC02850e);
                if (A022) {
                    this.A00.A06();
                }
            } else {
                HashMap hashMap = new HashMap();
                hashMap.put(A0A(21, 10, 100), Long.toString(-1L));
                hashMap.put(A0A(12, 9, 59), Long.toString(-1L));
                hashMap.put(A0A(31, 7, 92), EnumC02850e.A03.name());
                super.A01.A8N(this.A02, hashMap);
            }
        }
        C0790Kz.A02(super.A00, A0A(0, 12, 0));
    }
}