package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.83  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass83 extends ZY {
    public static byte[] A0E;
    public static String[] A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public int A00;
    public int A01;
    @Nullable
    public LinearLayout A02;
    public RQ A03;
    public C7H A04;
    @Nullable
    public C2R A05;
    @Nullable
    public C0846Ne A06;
    public C0890Ow A07;
    @DoNotStrip
    public AbstractC0900Pg A08;
    public C0901Ph A09;
    public String A0A;
    public List<OQ> A0B;
    public final C1080Wh A0C;
    public final LX A0D;

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0F;
            if (strArr[0].charAt(22) != strArr[6].charAt(22)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[5] = "I427OJiZERIl1pgFYs7VIJxgJMuHqTWY";
            strArr2[4] = "m1VK8a3APoHjuOOKlTc7gi9yCeUy6Tbh";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 74);
            i4++;
        }
    }

    public static void A0A() {
        A0E = new byte[]{118, 115, 72, 115, 118, 99, 118, 72, 117, 98, 121, 115, 123, 114};
    }

    public static void A0B() {
        A0F = new String[]{"hEO5MspmmQwWZDjfO9hYkGtE8t8ljCUN", "895GOd6GqHS2SDNwtQvAqIE", "zBXblOu1CdgXx49mdyV8flA", "GxqIbNjcrUQMSJiuMkyJv1mwkudVYaGP", "be3ZgXhlaup3yXbKLr41yKjcTusIQNjx", "HLi8FTj59ZkYUe8FmXrpO0CEflvtIm0o", "7bereGXxKpIS6kk2UNHV0kt11i4QSfeP", "LRvrjmvhZNKPrr4qRukG9JYrfPQqD7wd"};
    }

    static {
        A0B();
        A0A();
        A0G = (int) (C0795Le.A01 * 48.0f);
        A0H = (int) (C0795Le.A01 * 8.0f);
        A0I = (int) (C0795Le.A01 * 8.0f);
        A0K = (int) (C0795Le.A01 * 56.0f);
        A0J = (int) (C0795Le.A01 * 12.0f);
    }

    public AnonymousClass83(C1080Wh c1080Wh, JE je, C7H c7h, M6 m6, RQ rq) {
        super(c1080Wh, je, m6, rq);
        this.A0D = new LX();
        this.A04 = c7h;
        this.A0C = c1080Wh;
    }

    private final void A0C() {
        LinearLayout linearLayout = this.A02;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            this.A02 = null;
        }
        C2R c2r = this.A05;
        if (c2r != null) {
            c2r.removeAllViews();
            this.A05 = null;
        }
        C0846Ne c0846Ne = this.A06;
        if (c0846Ne != null) {
            c0846Ne.removeAllViews();
            this.A06 = null;
        }
    }

    private final void A0D(int i, @Nullable Bundle bundle) {
        int childSpacing;
        int i2;
        int i3;
        AnonymousClass83 anonymousClass83;
        this.A02 = new LinearLayout(getContext());
        if (i == 1) {
            this.A02.setGravity(17);
        } else {
            this.A02.setGravity(48);
        }
        this.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A02.setOrientation(1);
        int i4 = C0795Le.A02.widthPixels;
        int childSpacing2 = C0795Le.A02.heightPixels;
        if (i == 1) {
            int width = A0H;
            int i5 = i4 - (width * 4);
            int width2 = childSpacing2 / 2;
            childSpacing = Math.min(i5, width2);
            i2 = (i4 - childSpacing) / 8;
            i3 = i2 * 4;
        } else {
            int height = A0K;
            int width3 = A0G;
            int height2 = height + width3;
            int width4 = A0H;
            childSpacing = childSpacing2 - (height2 + (width4 * 4));
            i2 = A0H;
            i3 = i2 * 2;
        }
        this.A08 = new C0879Ol(this);
        this.A09 = new C0901Ph(this, 1, new WeakReference(this.A08), this.A0C);
        C0901Ph c0901Ph = this.A09;
        int extraSpacing = this.A00;
        c0901Ph.A0Y(extraSpacing);
        C0901Ph c0901Ph2 = this.A09;
        int extraSpacing2 = this.A01;
        c0901Ph2.A0Z(extraSpacing2);
        this.A05 = new C2R(this.A0C);
        this.A05.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.A07 = new C0890Ow(this.A05, i, this.A0B, this.A09, bundle);
        this.A05.setAdapter(new C0889Ov(this.A0C, this.A0B, this.A03, super.A0A, this.A04, this.A09, this.A0D, getAudienceNetworkListener(), this.A0A, childSpacing, i2, i3, i, this.A07));
        if (i == 1) {
            anonymousClass83 = this;
            anonymousClass83.A0F(anonymousClass83.A07);
        } else {
            anonymousClass83 = this;
        }
        LinearLayout linearLayout = anonymousClass83.A02;
        C2R c2r = anonymousClass83.A05;
        if (A0F[7].charAt(26) == 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[0] = "pS0yYjaDPNGuTrfnUmeGhxtdEtLadoEJ";
        strArr[6] = "mwC7eMAbLdHre0yQkkMBVztsNAF33a9m";
        linearLayout.addView(c2r);
        C0846Ne c0846Ne = anonymousClass83.A06;
        if (c0846Ne != null) {
            LinearLayout linearLayout2 = anonymousClass83.A02;
            String[] strArr2 = A0F;
            String str = strArr2[5];
            String str2 = strArr2[4];
            int charAt = str.charAt(16);
            int width5 = str2.charAt(16);
            if (charAt == width5) {
                throw new RuntimeException();
            }
            String[] strArr3 = A0F;
            strArr3[3] = "7ZjVpxQcOo2BFfYt51qxyVC8jdlns0bj";
            strArr3[3] = "7ZjVpxQcOo2BFfYt51qxyVC8jdlns0bj";
            linearLayout2.addView(c0846Ne);
        }
        anonymousClass83.A0R(anonymousClass83.A02, false, i);
        String[] strArr4 = A0F;
        String str3 = strArr4[0];
        String str4 = strArr4[6];
        int charAt2 = str3.charAt(22);
        int width6 = str4.charAt(22);
        if (charAt2 != width6) {
            return;
        }
        String[] strArr5 = A0F;
        strArr5[3] = "nKvQ299cRrmi8SltfoUYXILZ1CbfqCSq";
        strArr5[3] = "nKvQ299cRrmi8SltfoUYXILZ1CbfqCSq";
    }

    private void A0E(RQ rq) {
        this.A03 = rq;
        this.A0A = this.A03.A0Q();
        this.A00 = this.A03.A0G();
        this.A01 = this.A03.A0H();
        List<AnonymousClass19> A0W = this.A03.A0W();
        this.A0B = new ArrayList(A0W.size());
        for (int i = 0; i < A0W.size(); i++) {
            this.A0B.add(new OQ(i, A0W.size(), A0W.get(i)));
        }
    }

    private void A0F(C0890Ow c0890Ow) {
        new ET().A0I(this.A05);
        c0890Ow.A0d(new C0875Oh(this));
        this.A06 = new C0846Ne(this.A0C, super.A05.A01(), this.A0B.size());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0I);
        layoutParams.setMargins(0, A0J, 0, 0);
        this.A06.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.ZY
    public final boolean A0X() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void A7r(Intent intent, Bundle bundle, AnonymousClass51 anonymousClass51) {
        super.A0S(anonymousClass51);
        A0E((RQ) intent.getSerializableExtra(A08(0, 14, 93)));
        A0D(anonymousClass51.A0I().getResources().getConfiguration().orientation, bundle);
        anonymousClass51.A0L(new OM(this, anonymousClass51));
        int A03 = super.A08.A0M().A0E().A03();
        if (A03 > 0) {
            A0Q(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.ZY, com.facebook.ads.redexgen.X.M7
    public final void AAO(boolean z) {
        super.AAO(z);
        C0890Ow c0890Ow = this.A07;
        if (c0890Ow != null) {
            c0890Ow.A0a();
        }
    }

    @Override // com.facebook.ads.redexgen.X.ZY, com.facebook.ads.redexgen.X.M7
    public final void AAl(boolean z) {
        super.AAl(z);
        this.A07.A0b();
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void ACg(Bundle bundle) {
        C0890Ow c0890Ow = this.A07;
        if (c0890Ow != null) {
            c0890Ow.A0c(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.ZY
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle bundle = new Bundle();
        ACg(bundle);
        A0C();
        A0D(configuration.orientation, bundle);
        super.onConfigurationChanged(configuration);
    }

    @Override // com.facebook.ads.redexgen.X.ZY, com.facebook.ads.redexgen.X.M7
    public final void onDestroy() {
        super.onDestroy();
        if (!TextUtils.isEmpty(this.A0A)) {
            super.A0A.A80(this.A0A, new NU().A04(this.A09).A03(this.A0D).A06());
        }
        A0C();
        this.A09.A0X();
        this.A09 = null;
        this.A08 = null;
        this.A0B = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0D.A07(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }
}