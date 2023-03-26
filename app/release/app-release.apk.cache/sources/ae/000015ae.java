package com.facebook.ads.redexgen.X;

import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class Zm extends MT {
    public static byte[] A00;
    public static String[] A01;
    public static final int A02;
    public static final int A03;
    public static final int A04;
    public static final int A05;
    public static final int A06;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 49);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-18, 6, 4, Flags.CD};
    }

    public static void A02() {
        A01 = new String[]{"eX0NjQS6Cv0cdupm07HV5hzKAxMqH0d", "wx0dbtAc6pD49FoTqFpKctGdSqsA8n1n", "9JOMWIFuCKG1ze3B51PWtKtXX7g1EywZ", "gAmwb49m1jF7v3L1lyLoTXmCcSr8lTwL", "cJX3oWeWBOAhIZgSwLbGNRfmWHdVGE1s", "ih2ASPIbB6Mipq7FMEYWa4gJohMeYNDI", "rzdVRvGtIJZPIPQmsJTUAvMIxIP5Lc8q", "0g5ABkfLP1KnY0Lvl5QhU96hc6mXXT01"};
    }

    static {
        A02();
        A01();
        A02 = (int) (C0795Le.A01 * 10.0f);
        A05 = (int) (C0795Le.A01 * 24.0f);
        A03 = (int) (C0795Le.A01 * 30.0f);
        A06 = (int) (C0795Le.A01 * 30.0f);
        A04 = (int) (C0795Le.A01 * 50.0f);
    }

    public Zm(C1080Wh c1080Wh, int i) {
        super(c1080Wh, i);
        int i2 = A02;
        super.setPadding(i2, 0, i2, 0);
        LinearLayout linearLayout = this.A02;
        int i3 = A02;
        linearLayout.setPadding(i3, i3 / 3, i3, i3 / 3);
        this.A03.setTextSize(13.0f);
        TextView textView = this.A03;
        int i4 = A02;
        textView.setPadding(i4 / 4, i4 / 2, i4 / 4, i4 / 2);
        this.A03.setTextColor(-1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        int i5 = A06;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i5, i5);
        layoutParams2.gravity = 16;
        C0844Nc c0844Nc = this.A04;
        int i6 = A02;
        c0844Nc.setPadding(i6 / 3, i6 / 3, i6 / 3, i6 / 3);
        this.A04.A02(C2G.A01(-1, 77), -1);
        int i7 = A05;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i7, i7);
        layoutParams3.setMargins(0, 0, 0, 0);
        layoutParams3.gravity = 16;
        this.A01.setPadding(0, 0, 0, 0);
        super.removeAllViews();
        super.addView(this.A02, layoutParams);
        this.A02.removeAllViews();
        this.A02.addView(this.A04, layoutParams2);
        this.A02.addView(this.A03, layoutParams);
        this.A02.addView(this.A01, layoutParams3);
        setToolbarActionMode(i);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(A04);
        gradientDrawable.setColor(i);
        C0795Le.A0W(this.A02, gradientDrawable);
    }

    @Override // com.facebook.ads.redexgen.X.MT
    public void setToolbarActionMode(int i) {
        EnumC0803Lm enumC0803Lm;
        this.A00 = i;
        this.A04.setVisibility(i == 2 ? 0 : 8);
        this.A01.setVisibility(i == 2 ? 8 : 0);
        setVisibility(0);
        if (i == 0) {
            enumC0803Lm = EnumC0803Lm.CROSS_APP_INSTALL;
            LinearLayout linearLayout = this.A02;
            int i2 = A02;
            linearLayout.setPadding(i2 / 3, i2 / 3, i2 / 3, i2 / 3);
            ViewGroup.LayoutParams layoutParams = this.A01.getLayoutParams();
            if (layoutParams != null) {
                int i3 = A03;
                layoutParams.height = i3;
                layoutParams.width = i3;
                this.A01.setLayoutParams(layoutParams);
            }
            this.A03.setVisibility(8);
        } else if (A01[6].charAt(19) != 'U') {
            throw new RuntimeException();
        } else {
            String[] strArr = A01;
            strArr[0] = "gbryvxzxWbgdISpi68yKK";
            strArr[0] = "gbryvxzxWbgdISpi68yKK";
            if (i != 1) {
                if (i != 2) {
                    enumC0803Lm = EnumC0803Lm.CROSS_APP_INSTALL;
                    String[] strArr2 = A01;
                    if (strArr2[2].charAt(9) != strArr2[1].charAt(9)) {
                        String[] strArr3 = A01;
                        strArr3[5] = "UrnokoQiBoDCm04uktVsKTex7gx9vt3n";
                        strArr3[4] = "egtCMqV5BxdQcc2mWmQaAJ5IHSQPeiLw";
                        setVisibility(8);
                    } else {
                        String[] strArr4 = A01;
                        strArr4[6] = "dtJQOcGhcOIZshHIUvOU7iXJcRU71ekd";
                        strArr4[6] = "dtJQOcGhcOIZshHIUvOU7iXJcRU71ekd";
                        setVisibility(8);
                    }
                } else {
                    enumC0803Lm = EnumC0803Lm.CROSS_APP_INSTALL;
                    this.A01.setVisibility(8);
                    this.A03.setVisibility(8);
                }
            } else {
                enumC0803Lm = EnumC0803Lm.SKIP_ARROW_APP_INSTALL;
                this.A03.setVisibility(0);
                setToolbarMessage(A00(0, 4, 106));
            }
        }
        this.A01.setImageBitmap(C0804Ln.A00(enumC0803Lm));
        C0795Le.A0J(1002, this.A01);
    }
}