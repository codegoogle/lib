package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.p7700g.p99005.ax5;
import com.p7700g.p99005.bx;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;
import org.xbill.DNS.WKSRecord;

/* renamed from: com.facebook.ads.redexgen.X.Ww  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1095Ww extends AbstractRunnableC0770Kc {
    public static byte[] A05;
    public final /* synthetic */ int A00;
    public final /* synthetic */ C8H A01;
    public final /* synthetic */ InterfaceC04788b A02;
    public final /* synthetic */ C04858j A03;
    public final /* synthetic */ String A04;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{-37, -3, 30, 27, 46, 32, bx.l7, 28, 43, 26, 44, 33, bx.l7, 27, 30, 28, 26, 46, 44, 30, bx.l7, 44, -2, 39, 47, 34, 43, 40, 39, 38, 30, 39, 45, -3, 26, 45, 26, 9, 43, 40, 47, 34, 29, 30, 43, bx.l7, 39, 40, 45, bx.l7, 34, 39, 35, 30, 28, 45, 30, 29, -46, -24, -19, -22, -97, -24, -14, -97, -19, -12, -21, -21, -96, 30, 33, 33, 38, 49, 38, 44, 43, 30, 41, 28, 38, 43, 35, 44, 45, 66, 45, 53, 56, 45, 46, 56, 49, 43, 48, 53, ax5.a, 55, 43, ax5.a, 60, 45, 47, 49, 62, 60, 62, 67, 64, 104, 91, 89, 101, 104, 90, 85, 90, 87, 106, 87, 88, 87, 105, 91, -18, bx.j7, -19, -15, bx.j7, -17, -16, -37, -27, -32, 44, 46, 27, 45, 50, 41, 30, 49, 51, 32, 50, 55, 46, 35, 29, 33, 45, 34, 35};
    }

    public C1095Ww(C8H c8h, String str, int i, C04858j c04858j, InterfaceC04788b interfaceC04788b) {
        this.A01 = c8h;
        this.A04 = str;
        this.A00 = i;
        this.A03 = c04858j;
        this.A02 = interfaceC04788b;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        String stackTrace;
        Map<String, String> A4S;
        String A6R;
        AtomicReference atomicReference;
        try {
            if (C04798c.A0J(this.A01, this.A04, this.A00, this.A03)) {
                return;
            }
            JO.A06(this.A01, JG.A0A.toString() + A00(0, 1, 41) + this.A04);
            Throwable cause = this.A03.getCause();
            if (cause != null) {
                stackTrace = LN.A03(this.A01, cause);
            } else if (J9.A0S(this.A01)) {
                stackTrace = LN.A03(this.A01, this.A03);
            } else {
                stackTrace = A00(0, 0, 106) + this.A03.getMessage();
            }
            if (J9.A0V(this.A01)) {
                A4S = this.A01.A02().A4S();
            } else if (this.A02 != null) {
                A4S = this.A02.A6A();
            } else if (C04798c.A02) {
                String message = A00(1, 57, 65);
                C04798c.A0G(new RuntimeException(message, this.A03));
                A4S = new HashMap<>();
            } else {
                A4S = this.A01.A02().A4S();
            }
            A4S.put(A00(WKSRecord.Service.PROFILE, 7, 65), this.A04);
            A4S.put(A00(143, 12, 70), String.valueOf(this.A00));
            JSONObject A02 = this.A03.A02();
            if (A02 != null) {
                A4S.put(A00(71, 15, 69), A02.toString());
            }
            if ((A00(106, 5, 99).equals(this.A04) || A00(111, 15, 126).equals(this.A04)) && (A6R = this.A01.A02().A6R()) != null) {
                A4S.put(A00(86, 20, 84), A6R);
            }
            String A07 = this.A01.A07();
            if (A07 != null && !TextUtils.isEmpty(A07)) {
                A4S.put(A00(126, 10, 4), A07);
            }
            atomicReference = C04798c.A0A;
            InterfaceC04778a interfaceC04778a = (InterfaceC04778a) atomicReference.get();
            if (interfaceC04778a == null) {
                C04798c.A0G(new RuntimeException(A00(58, 13, 7)));
            } else {
                interfaceC04778a.ADu(stackTrace, A4S, this.A01);
            }
        } catch (Throwable th) {
            C04798c.A0G(th);
        }
    }
}