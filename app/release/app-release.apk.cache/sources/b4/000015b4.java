package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Zs  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1165Zs extends NX {
    public static byte[] A0E;
    public static String[] A0F;
    public static final int A0G;
    public static final int A0H;
    public static final int A0I;
    public static final int A0J;
    public static final int A0K;
    public static final int A0L;
    public static final int A0M;
    public static final int A0N;
    public C1G A00;
    public boolean A01;
    public boolean A02;
    public final ImageView A03;
    public final LinearLayout.LayoutParams A04;
    public final LinearLayout.LayoutParams A05;
    public final LinearLayout A06;
    public final LinearLayout A07;
    public final RelativeLayout.LayoutParams A08;
    public final RelativeLayout.LayoutParams A09;
    public final TextView A0A;
    public final TextView A0B;
    public final TextView A0C;
    public final TextView A0D;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A0F;
            if (strArr[6].charAt(12) != strArr[7].charAt(12)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0F;
            strArr2[3] = "CFHt0yNdC2PEY9oUs7GHhr9LuJSrb6a";
            strArr2[3] = "CFHt0yNdC2PEY9oUs7GHhr9LuJSrb6a";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 89);
            i4++;
        }
    }

    public static void A08() {
        A0E = new byte[]{-63, 19, 6, 23, 10, 6, 24, 20};
    }

    public static void A09() {
        A0F = new String[]{"Qaz6s2rZ", "AcoknuDDmNnfRhvATxJBAe7psr5ZdYIV", "xUaT3nis", "3ZYb8Y0gA5eZOJbeDVtSAHPMCBzrwI9S", "CaGCkJyqrjmkUmEgaxYP5OnLIzM2aaQv", "YMuz8", "po4IGEuOfM3V3RWL9cKG7EahlbwG6cRm", "tP1qXeWZ1rY33RxSca4DZNHo6L2lNWeK"};
    }

    static {
        A09();
        A08();
        A0H = (int) (C0795Le.A01 * 2.0f);
        A0G = (int) (C0795Le.A01 * 3.0f);
        A0I = (int) (C0795Le.A01 * 8.0f);
        A0M = (int) (C0795Le.A01 * 16.0f);
        A0N = (int) (C0795Le.A01 * 2.0f);
        A0J = (int) (C0795Le.A01 * 8.0f);
        A0K = (int) (C0795Le.A01 * 48.0f);
        A0L = (int) (C0795Le.A01 * 82.0f);
    }

    public C1165Zs(C1080Wh c1080Wh, int i, C1H c1h, String str, JE je, M6 m6, C0901Ph c0901Ph, LX lx) {
        super(c1080Wh, i, c1h, str, je, m6, c0901Ph, lx);
        this.A09 = new RelativeLayout.LayoutParams(-1, -2);
        this.A08 = new RelativeLayout.LayoutParams(-2, -1);
        this.A04 = new LinearLayout.LayoutParams(-1, 0);
        this.A05 = new LinearLayout.LayoutParams(-1, 0);
        this.A02 = false;
        this.A01 = false;
        setOrientation(1);
        int i2 = A0J;
        C0795Le.A0U(this, -1087164882, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2});
        setPadding(0, 0, 0, A0I);
        this.A09.addRule(12);
        RelativeLayout.LayoutParams layoutParams = this.A09;
        int i3 = A0M;
        layoutParams.setMargins(i3, 0, i3, i3);
        this.A03 = new ImageView(c1080Wh);
        this.A03.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.A03.setColorFilter(-1);
        this.A03.setImageBitmap(C0804Ln.A00(EnumC0803Lm.STAR));
        this.A0B = new TextView(c1080Wh);
        this.A0C = new TextView(c1080Wh);
        this.A0D = new TextView(c1080Wh);
        this.A0A = new TextView(c1080Wh);
        this.A06 = new LinearLayout(c1080Wh);
        this.A06.setOrientation(1);
        this.A07 = new LinearLayout(c1080Wh);
        this.A07.setOrientation(0);
        if (c1080Wh.A09() != null && c1080Wh.A09().getWindow() != null) {
            c1080Wh.A09().getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new M2(this));
        }
        setupMetadataContainer(getResources().getConfiguration().orientation == 1);
    }

    private RelativeLayout.LayoutParams A01(View view) {
        C0795Le.A0P(this, 0);
        this.A08.setMargins(0, 0, 0, 0);
        this.A08.addRule(1, view.getId());
        A05();
        return this.A08;
    }

    private void A05() {
        super.A01.removeAllViews();
        removeView(super.A03);
        setGravity(16);
        this.A04.setMargins(0, 0, A0M * 3, 0);
        C0795Le.A0b(this.A0D, true, 18);
        this.A05.setMargins(0, 0, A0M * 3, 0);
        this.A0A.setVisibility(0);
        this.A07.setLayoutParams(this.A04);
        this.A0D.setLayoutParams(this.A05);
        int i = A0L;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        int i2 = A0M;
        layoutParams.setMargins(i2, 0, i2, 0);
        layoutParams.addRule(9);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, A0L);
        layoutParams2.addRule(1, super.A04.getId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        int i3 = A0M;
        layoutParams3.setMargins(i3, i3, i3 * 3, 0);
        layoutParams3.addRule(3, super.A04.getId());
        super.A01.addView(super.A04, layoutParams);
        super.A01.addView(this.A06, layoutParams2);
        super.A01.addView(super.A03, layoutParams3);
    }

    private void A06() {
        super.A01.removeAllViews();
        removeView(super.A03);
        this.A04.setMargins(0, 0, A0M, 0);
        C0795Le.A0b(this.A0D, true, this.A01 ? 18 : 15);
        this.A05.setMargins(0, 0, A0M, 0);
        this.A0A.setVisibility(8);
        this.A07.setLayoutParams(this.A04);
        this.A0D.setLayoutParams(this.A05);
        int i = A0K;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        int i2 = A0M;
        layoutParams.setMargins(i2, 0, i2, 0);
        layoutParams.addRule(9);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, A0K);
        layoutParams2.addRule(1, super.A04.getId());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int i3 = A0M;
        layoutParams3.setMargins(i3, A0I, i3, 0);
        super.A01.addView(super.A04, layoutParams);
        super.A01.addView(this.A06, layoutParams2);
        addView(super.A03, layoutParams3);
    }

    private void A07() {
        this.A0D.setText(this.A00.A06());
        this.A0A.setText(this.A00.A05());
        if (!this.A00.A03().isEmpty()) {
            TextView textView = this.A0B;
            String A03 = this.A00.A03();
            if (A0F[5].length() != 5) {
                throw new RuntimeException();
            }
            String[] strArr = A0F;
            strArr[1] = "A4j7vT1O3iieC5LYKxgUzJw3IAPRsZqa";
            strArr[4] = "kbxlqPL3bcSaGLfdPxpm8hIEsv0pbZnU";
            textView.setText(A03);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            this.A0B.measure(makeMeasureSpec, makeMeasureSpec);
        } else {
            this.A0B.setVisibility(8);
            this.A03.setVisibility(8);
        }
        if (!this.A00.A02().isEmpty()) {
            this.A0C.setText(this.A00.A02() + A04(0, 8, 72));
            return;
        }
        this.A0C.setVisibility(8);
        if (!this.A00.A03().isEmpty()) {
            return;
        }
        this.A07.setVisibility(8);
        C0795Le.A0b(this.A0D, true, 18);
        this.A0D.setMaxLines(2);
        LinearLayout.LayoutParams layoutParams = this.A05;
        layoutParams.weight = 2.0f;
        this.A0D.setLayoutParams(layoutParams);
        this.A0A.setGravity(48);
        C0795Le.A0b(this.A0A, false, 15);
        this.A01 = true;
    }

    @Override // com.facebook.ads.redexgen.X.NX
    public final RelativeLayout.LayoutParams A0B(View view) {
        if (getResources().getConfiguration().orientation == 1) {
            A06();
            C0795Le.A0R(this, -1087164882, A0J);
            RelativeLayout.LayoutParams layoutParams = this.A09;
            int i = A0M;
            layoutParams.setMargins(i, 0, i, this.A02 ? i * 3 : i);
            int i2 = A0I;
            setPadding(0, i2, 0, i2);
            return this.A09;
        }
        this.A08.setMargins(0, 0, 0, 0);
        this.A08.addRule(1, view.getId());
        C0795Le.A0P(this, -1087164882);
        A05();
        return this.A08;
    }

    @Override // com.facebook.ads.redexgen.X.NX
    public final RelativeLayout.LayoutParams A0C(View view) {
        bringToFront();
        addView(super.A01);
        C0795Le.A0N(this.A0C);
        C0795Le.A0N(super.A04);
        C0795Le.A0N(this.A0D);
        C0795Le.A0N(this.A0B);
        C0795Le.A0N(this.A03);
        C0795Le.A0N(super.A03);
        C0795Le.A0N(this.A0A);
        C0795Le.A0N(this.A06);
        C0795Le.A0N(this.A07);
        if (getResources().getConfiguration().orientation == 1) {
            return getPortraitLayoutParams();
        }
        return A01(view);
    }

    @Override // com.facebook.ads.redexgen.X.NX
    public final void A0D(int i) {
    }

    @Override // com.facebook.ads.redexgen.X.NX
    public final void A0E(boolean z) {
    }

    private RelativeLayout.LayoutParams getPortraitLayoutParams() {
        int i = A0J;
        C0795Le.A0U(this, -1087164882, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
        RelativeLayout.LayoutParams layoutParams = this.A09;
        int i2 = A0M;
        layoutParams.setMargins(i2, 0, i2, this.A02 ? i2 * 3 : i2);
        A06();
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.NX
    public void setInfo(C1G c1g, C1I c1i, String str, String str2, @Nullable InterfaceC0842Na interfaceC0842Na) {
        super.setInfo(c1g, c1i, str, str2, interfaceC0842Na);
        this.A00 = c1g;
        A07();
    }

    private void setupMetadataContainer(boolean z) {
        this.A06.removeAllViews();
        this.A07.removeAllViews();
        LinearLayout.LayoutParams layoutParams = this.A04;
        layoutParams.weight = 1.0f;
        int i = A0M;
        if (!z) {
            i *= 3;
        }
        layoutParams.setMargins(0, 0, i, 0);
        this.A05.weight = this.A01 ? 2.0f : 1.0f;
        this.A0D.setMaxLines(this.A01 ? 2 : 1);
        C0795Le.A0b(this.A0D, true, (this.A01 || !z) ? 18 : 15);
        this.A0D.setTextColor(-1);
        this.A0D.setEllipsize(TextUtils.TruncateAt.END);
        this.A0D.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = this.A05;
        int i2 = A0M;
        if (!z) {
            i2 *= 3;
        }
        layoutParams2.setMargins(0, 0, i2, 0);
        this.A0A.setVisibility(z ? 8 : 0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        this.A0A.setMaxLines(1);
        this.A0A.setTextColor(-1);
        this.A0A.setGravity(this.A01 ? 48 : 16);
        C0795Le.A0b(this.A0A, false, this.A01 ? 15 : 13);
        this.A0A.setEllipsize(TextUtils.TruncateAt.END);
        layoutParams3.setMargins(0, 0, A0M * 3, 0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -1);
        this.A0B.setTextColor(-1);
        C0795Le.A0b(this.A0B, true, 13);
        this.A0B.setGravity(16);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -1);
        int i3 = A0N;
        layoutParams5.setMargins(0, i3, 0, i3);
        LinearLayout.LayoutParams reviewsCountViewParams = new LinearLayout.LayoutParams(-2, -1);
        this.A0C.setMaxLines(1);
        this.A0C.setTextColor(-1);
        this.A0C.setEllipsize(TextUtils.TruncateAt.END);
        this.A0C.setGravity(16);
        C0795Le.A0b(this.A0C, false, 13);
        this.A07.addView(this.A0B, layoutParams4);
        this.A07.addView(this.A03, layoutParams5);
        this.A07.addView(this.A0C, reviewsCountViewParams);
        this.A07.setVisibility(this.A01 ? 8 : 0);
        this.A06.addView(this.A0D, this.A05);
        this.A06.addView(this.A07, this.A04);
        this.A06.addView(this.A0A, layoutParams3);
    }
}