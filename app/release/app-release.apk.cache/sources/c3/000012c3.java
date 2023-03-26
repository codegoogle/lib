package com.facebook.ads.redexgen.X;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.util.Log;
import androidx.annotation.Nullable;
import com.p7700g.p99005.ax5;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Nb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0843Nb {
    public static byte[] A09;
    @Nullable
    public InterfaceC0842Na A00;
    public boolean A01 = true;
    public boolean A02;
    public final C1080Wh A03;
    public final JE A04;
    public final LX A05;
    public final M6 A06;
    public final C0901Ph A07;
    public final String A08;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 104);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A09 = new byte[]{31, 8, 29, 30, 41, 40, 40, 51, 50, 31, 48, 53, ax5.a, 55, 16, 53, 47, 40, 57, 50, 57, 46, 114, 69, 69, 88, 69, 23, 82, 79, 82, 84, 66, 67, 94, 89, 80, 23, 86, 84, 67, 94, 88, 89, 73, 126, 126, 99, 126, 44, 123, 100, 101, 96, 105, 44, 99, 124, 105, 98, 101, 98, 107, 44};
    }

    public C0843Nb(C1080Wh c1080Wh, String str, C0901Ph c0901Ph, LX lx, JE je, M6 m6) {
        this.A03 = c1080Wh;
        this.A08 = str;
        this.A07 = c0901Ph;
        this.A05 = lx;
        this.A04 = je;
        this.A06 = m6;
    }

    public static void A03(C1080Wh c1080Wh, @Nullable C0901Ph c0901Ph, LX lx, JE je, C1I c1i, String str) {
        AbstractC02860f A01 = C02870g.A01(c1080Wh, je, str, Uri.parse(c1i.A04()), new NU().A04(c0901Ph).A03(lx).A06(), false, false);
        if (A01 != null) {
            A01.A0A();
        }
    }

    private void A05(String str, String str2, Map<String, String> map) {
        this.A04.A8M(str, map);
        L9.A00(new NY(this, map, str, str2), new NZ(this, str, map), C0785Ks.A00());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(String str, String str2, Map<String, String> map) {
        String A01 = A01(0, 22, 52);
        try {
            AbstractC02860f A012 = C02870g.A01(this.A03, this.A04, str, Uri.parse(str2), new NU(map).A04(this.A07).A03(this.A05).A06(), this.A01, this.A02);
            if (A012 != null) {
                A012.A0D();
            }
            if (this.A00 != null) {
                this.A00.A9H();
            }
            this.A06.A3s(this.A08);
        } catch (ActivityNotFoundException e) {
            Log.e(A01, A01(44, 20, 100) + str2, e);
        } catch (Exception e2) {
            Log.e(A01, A01(22, 22, 95), e2);
        }
    }

    public final void A07(InterfaceC0842Na interfaceC0842Na) {
        this.A00 = interfaceC0842Na;
    }

    public final void A08(String str, String str2, Map<String, String> map) {
        new JL(str, this.A04).A03(JK.A0J, null);
        if (this.A05.A0A(this.A03)) {
            this.A04.A7z(str, map);
        } else if (J8.A0z(this.A03)) {
            A05(str, str2, map);
        } else {
            A06(str, str2, map);
        }
    }

    public final void A09(boolean z) {
        this.A02 = z;
    }

    public final void A0A(boolean z) {
        this.A01 = z;
    }
}