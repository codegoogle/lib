package com.facebook.ads.redexgen.X;

import android.content.pm.PackageManager;
import android.util.Base64;
import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.av  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1230av extends AbstractRunnableC0770Kc {
    public static byte[] A02;
    public static String[] A03;
    public final /* synthetic */ KC A00;
    public final /* synthetic */ KF A01;

    static {
        A03();
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[2].charAt(31) == strArr[3].charAt(31)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[7] = "vKWhPjbFalI70MxhKihYQQhrE25QXeUX";
            strArr2[7] = "vKWhPjbFalI70MxhKihYQQhrE25QXeUX";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 89);
            i4++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-51, -85, -67, -96, -97, -84, -84, -93, -80, -67, -87, -93, -73};
    }

    public static void A03() {
        A03 = new String[]{"HdBP5Xz", "1x1Spdd4leaR6rMyIqz7jDuVALPBafGP", "axXL5TnL0HBMXsVKsrA9GDOWQxSG9OY6", "1dEgnVHIT0m43fI6JYH9hpNhfyiBWS6N", "iEi5yE", "UjLwzpYsoJIrFySVWBkKISpV5tCrd9dB", "Qbq65yz", "qKKFep347IAmJ8sue1lLg6VgEBnKG6W3"};
    }

    public C1230av(KF kf, KC kc) {
        this.A01 = kf;
        this.A00 = kc;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        C1080Wh c1080Wh;
        C1080Wh c1080Wh2;
        C1080Wh c1080Wh3;
        C1080Wh c1080Wh4;
        long j;
        C1080Wh c1080Wh5;
        String str;
        Map<? extends String, ? extends String> map;
        InterfaceC0907Pn A04;
        Map map2;
        C1080Wh c1080Wh6;
        C1080Wh c1080Wh7;
        C1080Wh c1080Wh8;
        c1080Wh = this.A01.A05;
        C04938r.A08(c1080Wh);
        c1080Wh2 = this.A01.A05;
        C04135f.A08(c1080Wh2);
        KF kf = this.A01;
        KC kc = this.A00;
        C9C A00 = C9C.A00();
        c1080Wh3 = this.A01.A05;
        boolean z = true;
        kf.A04 = kc.A09(A00.A01(c1080Wh3, true).A69());
        try {
            map2 = this.A01.A04;
            String A002 = A00(1, 12, 5);
            StringBuilder sb = new StringBuilder();
            c1080Wh6 = this.A01.A05;
            sb.append(c1080Wh6.getPackageName());
            sb.append(A00(0, 1, 84));
            c1080Wh7 = this.A01.A05;
            PackageManager packageManager = c1080Wh7.getPackageManager();
            c1080Wh8 = this.A01.A05;
            sb.append(packageManager.getInstallerPackageName(c1080Wh8.getPackageName()));
            map2.put(A002, new String(Base64.encode(sb.toString().getBytes(), 2)));
        } catch (Exception unused) {
        }
        try {
            if (this.A00.A06() != EnumC0760Js.A04 && this.A00.A06() != EnumC0760Js.A06 && this.A00.A06() != EnumC0760Js.A05 && this.A00.A06() != null) {
                z = false;
            }
            c1080Wh5 = this.A01.A05;
            InterfaceC0906Pm A022 = Q4.A02(z, c1080Wh5);
            str = this.A01.A07;
            Q0 q0 = new Q0();
            map = this.A01.A04;
            byte[] A09 = q0.A06(map).A09();
            A04 = this.A01.A04(LW.A00());
            A022.ABe(str, A09, A04);
        } catch (Exception e) {
            AdErrorType adErrorType = AdErrorType.AD_REQUEST_FAILED;
            String message = e.getMessage();
            c1080Wh4 = this.A01.A05;
            C0S A0A = c1080Wh4.A0A();
            KF kf2 = this.A01;
            String errorMessage = A03[4];
            if (errorMessage.length() == 14) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[0] = "AzlAWwW";
            strArr[6] = "AhjxiUn";
            j = kf2.A00;
            A0A.A2m(LW.A01(j), adErrorType.getErrorCode(), message, adErrorType.isPublicError());
            this.A01.A0G(C0755Jm.A02(adErrorType, message));
        }
    }
}