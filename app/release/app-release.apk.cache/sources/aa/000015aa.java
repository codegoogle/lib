package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.g15;
import java.util.Arrays;
import org.xbill.DNS.WKSRecord;

@TargetApi(19)
/* renamed from: com.facebook.ads.redexgen.X.Zi  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1158Zi implements M7 {
    public static byte[] A0C;
    public static String[] A0D;
    public static final String A0E;
    public long A00;
    public String A02;
    public String A03;
    public final AnonymousClass51 A07;
    public final JE A08;
    public final N9 A09;
    public final NA A0A;
    public final XS A0B;
    public final InterfaceC04074z A06 = new C1161Zl(this);
    public boolean A05 = true;
    public long A01 = -1;
    public boolean A04 = true;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0D;
            if (strArr[1].charAt(18) == strArr[4].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[7] = "WrA4t0RN";
            strArr2[7] = "WrA4t0RN";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 62);
            i4++;
        }
    }

    public static void A04() {
        A0C = new byte[]{114, -120, -120, -107, -120, -84, -41, -43, -120, -85, -41, -42, -36, -51, -42, -36, -120, -76, -41, -55, -52, -51, -52, -120, -68, -47, -43, -51, -94, -120, -70, -48, -48, -35, -48, -8, 17, 30, 20, 28, 21, 34, -48, 4, 25, 29, 21, -22, -48, -98, -76, -76, -63, -76, -32, 3, -11, -8, -76, -38, -3, 2, -3, 7, -4, -76, -24, -3, 1, -7, -50, -76, -101, -79, -79, -66, -79, -35, 0, -14, -11, -79, -28, 5, -14, 3, 5, -79, -27, -6, -2, -10, -53, -79, -57, -35, -35, -22, -35, 15, 34, 48, 45, 44, 43, 48, 34, -35, 2, 43, 33, -35, 17, 38, bx.W5, 34, -9, -35, -112, -90, -90, -77, -90, bx.l7, -23, -8, -11, -14, -14, -90, -40, -21, -25, -22, -1, -90, -38, -17, -13, -21, -64, -90, 92, 114, 114, g15.c, 114, -91, -73, -59, -59, -69, -63, -64, 114, -104, -69, -64, -69, -59, -70, 114, -90, -69, -65, -73, -116, 114, -98, -89, -41, -44, -36, -40, -54, -41, -123, -40, -54, -40, -40, -50, -44, -45, -123, -55, -58, bx.l7, -58, -123, -47, -44, -52, -52, -54, -55, -123, -91, -123, 8, 9, 22, 28, 27, bx.j7, 9, 19, 8, 21, 18, 23, 39, 36, 44, 40, 26, 39, 10, 7, 1, -59, -50, -53, -57, -48, -42, -74, -47, -51, -57, -48, bx.l7, -46, -33, -43, -35, -42, -29, -59, -38, -34, -42};
    }

    public static void A05() {
        A0D = new String[]{"VjNTozFJBHBTAbZvfj55MfAwGP9LBSf6", "Pq0aBOwFzXTv3d8c4kUbGJ29Dl7JaeBe", "6Jh9GB1FdSmhvo4jirjJmKwQUVM2B32M", "TGGBgusTs1FvyAgmLwAY3Gsc6eBuJSRW", "x90wDNv6CtBtNBa5WCDyDNAaFj8t5cCY", "GDNjvFSJPJLifqCEdIwxfegvvEeKItWd", "ZGbO0A4ZRQBBFZeQfXm02pkO19XETszh", "zRbEM6nv1u3uOOYe"};
    }

    static {
        A05();
        A04();
        A0E = C1158Zi.class.getSimpleName();
    }

    public C1158Zi(AnonymousClass51 anonymousClass51, C1080Wh c1080Wh, JE je, M6 m6) {
        this.A07 = anonymousClass51;
        this.A08 = je;
        int i = (int) (C0795Le.A01 * 2.0f);
        this.A09 = new N9(c1080Wh);
        this.A09.setId(View.generateViewId());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(10);
        this.A09.setListener(new C1160Zk(this, anonymousClass51));
        m6.A3L(this.A09, layoutParams);
        this.A0B = new XS(c1080Wh, new C1159Zj(this));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(3, this.A09.getId());
        layoutParams2.addRule(12);
        m6.A3L(this.A0B, layoutParams2);
        this.A0A = new NA(c1080Wh, null, 16842872);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, i);
        layoutParams3.addRule(3, this.A09.getId());
        this.A0A.setProgress(0);
        m6.A3L(this.A0A, layoutParams3);
        anonymousClass51.A0L(this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void A7r(Intent intent, Bundle bundle, AnonymousClass51 anonymousClass51) {
        if (this.A01 < 0) {
            this.A01 = System.currentTimeMillis();
        }
        String A03 = A03(231, 11, 51);
        String A032 = A03(220, 11, 36);
        String A033 = A03(210, 10, 119);
        if (bundle == null) {
            this.A02 = intent.getStringExtra(A033);
            this.A03 = intent.getStringExtra(A032);
            String[] strArr = A0D;
            if (strArr[0].charAt(28) != strArr[2].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[5] = "h34ynCyxETZN0C4DuHOjqZ0ETc7IsjOt";
            strArr2[5] = "h34ynCyxETZN0C4DuHOjqZ0ETc7IsjOt";
            this.A00 = intent.getLongExtra(A03, -1L);
        } else {
            this.A02 = bundle.getString(A033);
            this.A03 = bundle.getString(A032);
            this.A00 = bundle.getLong(A03, -1L);
        }
        String str = this.A02;
        if (str == null) {
            str = A03(199, 11, 105);
        }
        this.A09.setUrl(str);
        this.A0B.loadUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void AAO(boolean z) {
        ND A07;
        this.A0B.onPause();
        if (this.A04) {
            this.A04 = false;
            this.A08.A7y(this.A03, new NC(this.A0B.getFirstUrl()).A01(this.A00).A03(this.A01).A04(this.A0B.getResponseEndMs()).A00(this.A0B.getDomContentLoadedMs()).A05(this.A0B.getScrollReadyMs()).A02(this.A0B.getLoadFinishMs()).A06(System.currentTimeMillis()).A07().A02());
            if (BuildConfigApi.isDebug()) {
                String str = A03(169, 30, 39) + System.currentTimeMillis() + A03(168, 1, 38) + A03(30, 19, 114) + A07.A01 + A03(72, 22, 83) + A07.A03 + A03(94, 24, 127) + A07.A04 + A03(0, 30, 42) + A07.A00 + A03(118, 24, 72) + A07.A05 + A03(49, 23, 86) + A07.A02 + A03(WKSRecord.Service.BL_IDM, 26, 20) + A07.A06;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void AAl(boolean z) {
        this.A0B.onResume();
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void ACg(Bundle bundle) {
        bundle.putString(A03(210, 10, 119), this.A02);
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void onDestroy() {
        this.A07.A0M(this.A06);
        NQ.A04(this.A0B);
        this.A0B.destroy();
    }
}