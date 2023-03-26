package com.facebook.ads.internal.view;

import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.redexgen.X.C0795Le;
import com.facebook.ads.redexgen.X.C0816Lz;
import com.facebook.ads.redexgen.X.C1080Wh;
import com.facebook.ads.redexgen.X.C1H;
import com.facebook.ads.redexgen.X.C1Q;
import com.facebook.ads.redexgen.X.C1X;
import com.facebook.ads.redexgen.X.JL;
import com.facebook.ads.redexgen.X.M0;
import com.facebook.ads.redexgen.X.M1;
import com.facebook.ads.redexgen.X.M6;
import com.facebook.ads.redexgen.X.MA;
import com.facebook.ads.redexgen.X.MT;
import com.facebook.ads.redexgen.X.OP;
import com.p7700g.p99005.sr;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class FullScreenAdToolbar extends M1 {
    public static byte[] A07;
    public static String[] A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    @Nullable
    public M0 A00;
    public final RelativeLayout A01;
    public final JL A02;
    public final C0816Lz A03;
    public final M6 A04;
    public final MT A05;
    public final OP A06;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 113);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A07 = new byte[]{-26, 15, 18, 22, 8, -61, -28, 7, 56, 75, 86, 85, 88, 90, 6, 39, 74};
    }

    public static void A04() {
        A08 = new String[]{"elaUgpg", "xyZ5KhWZZkOCw26QnbyRE89VYXYHkT38", "j2Hg99bd5kkvFLrtwtqoGvtE7T", "FtK0h2Y990QReQxCoMrwn7Y", "09p430KvfvIa5D7TMMbG57be7BWhVuc0", "4K9Dg6G4rdQDm1ubILJxRl9GbBVTjarc", "MQsbPX4", "ODYsITK"};
    }

    static {
        A04();
        A03();
        A09 = (int) (C0795Le.A01 * 10.0f);
        A0D = (int) (C0795Le.A01 * 16.0f);
        int i = A0D;
        int i2 = A09;
        A0B = i - i2;
        A0C = (i * 2) - i2;
        A0A = (int) (C0795Le.A01 * 4.0f);
    }

    public FullScreenAdToolbar(C1080Wh c1080Wh, M6 m6, JL jl, @ToolbarActionView$ToolbarActionMode int i, int i2) {
        super(c1080Wh);
        this.A04 = m6;
        this.A02 = jl;
        setGravity(16);
        this.A05 = new MT(c1080Wh, i);
        this.A05.setContentDescription(A02(0, 8, 50));
        this.A05.setActionClickListener(new MA(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        int i3 = A0B;
        layoutParams.setMargins(i3, i3, A0C, i3);
        addView(this.A05, layoutParams);
        this.A01 = new RelativeLayout(c1080Wh);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2);
        layoutParams2.weight = 1.0f;
        this.A06 = new OP(c1080Wh);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        this.A06.setLayoutParams(layoutParams3);
        this.A01.addView(this.A06);
        addView(this.A01, layoutParams2);
        this.A03 = new C0816Lz(c1080Wh, i2);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        int i4 = A0D;
        layoutParams4.setMargins(0, i4 / 2, i4 / 2, i4 / 2);
        addView(this.A03, layoutParams4);
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final void A05(C1H c1h, boolean z) {
        int A04 = c1h.A04(z);
        this.A06.A01(c1h.A0A(z), A04);
        this.A03.setIconColors(A04);
        this.A03.setContentDescription(A02(8, 9, 117));
        this.A05.setColors(A04);
        if (z) {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1778384896, 0});
            gradientDrawable.setCornerRadius(0.0f);
            C0795Le.A0W(this, gradientDrawable);
            C0795Le.A0T(this.A03, 0, sr.t, A0A);
            return;
        }
        C0795Le.A0P(this, 0);
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public final boolean A07() {
        return this.A05.A02();
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public int getToolbarHeight() {
        return M1.A00;
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public void setAdReportingVisible(boolean z) {
        this.A03.setVisibility(z ? 0 : 8);
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public void setPageDetails(C1Q c1q, String str, int i, C1X c1x) {
        this.A05.setInitialUnskippableSeconds(i);
        this.A06.setPageDetails(c1q);
        this.A03.setAdDetails(c1q, str, this.A02, this.A04);
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public void setPageDetailsVisible(boolean z) {
        this.A01.removeAllViews();
        if (z) {
            RelativeLayout relativeLayout = this.A01;
            OP op = this.A06;
            if (A08[4].charAt(4) != '3') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[2] = "uYrc95dj4mq6YR3RipRhNZPjST";
            strArr[3] = "ufyXPPKrvmASdIniU0CJIS9";
            relativeLayout.addView(op);
        }
        MT mt = this.A05;
        String[] strArr2 = A08;
        if (strArr2[2].length() == strArr2[3].length()) {
            mt.setToolbarMessageEnabled(!z);
            return;
        }
        String[] strArr3 = A08;
        strArr3[1] = "RoBBOPMqmB8G6B1FErbRchWOJuWn3pgq";
        strArr3[1] = "RoBBOPMqmB8G6B1FErbRchWOJuWn3pgq";
        mt.setToolbarMessageEnabled(!z);
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public void setProgress(float f) {
        this.A05.setProgress(f);
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public void setToolbarActionMessage(String str) {
        this.A05.setToolbarMessage(str);
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public void setToolbarActionMode(@ToolbarActionView$ToolbarActionMode int i) {
        this.A05.setToolbarActionMode(i);
    }

    @Override // com.facebook.ads.redexgen.X.M1
    public void setToolbarListener(M0 m0) {
        this.A00 = m0;
    }
}