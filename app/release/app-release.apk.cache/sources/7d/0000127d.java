package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: assets/audience_network.dex */
public class MT extends LinearLayout {
    public static String[] A05;
    public static final int A06;
    public static final int A07;
    public int A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final TextView A03;
    public final C0844Nc A04;

    public static void A01() {
        A05 = new String[]{"RdKbZKE5ShqjtspsYuId0BpVT", "jFs6Ox2yxsj", "", "O0DGVMIkWcl", "ZjYxtVw01iwSMNXN0b17Jtyc9gHU9Z2d", "b1LSaO6GQJOSELIr8C99", "", "wukZGaaSm"};
    }

    static {
        A01();
        A06 = (int) (C0795Le.A01 * 10.0f);
        A07 = (int) (C0795Le.A01 * 44.0f);
    }

    public MT(C1080Wh c1080Wh, int i) {
        super(c1080Wh);
        this.A01 = new ImageView(c1080Wh);
        ImageView imageView = this.A01;
        int i2 = A06;
        imageView.setPadding(i2, i2, i2, i2);
        this.A04 = new C0844Nc(c1080Wh);
        this.A04.setProgress(0.0f);
        C0844Nc c0844Nc = this.A04;
        int i3 = A06;
        c0844Nc.setPadding(i3, i3, i3, i3);
        this.A03 = new TextView(c1080Wh);
        setOrientation(0);
        this.A02 = new LinearLayout(c1080Wh);
        this.A00 = i;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        int i = A07;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        C0795Le.A0b(this.A03, true, 16);
        this.A03.setTextColor(-1);
        this.A03.setVisibility(8);
        this.A02.addView(this.A01, layoutParams2);
        this.A02.addView(this.A04, layoutParams2);
        addView(this.A02, layoutParams);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        addView(this.A03, layoutParams3);
    }

    public final boolean A02() {
        return !this.A03.getText().toString().isEmpty();
    }

    public final boolean A03() {
        int i = this.A00;
        return (i == 2 || i == 4) ? false : true;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setColors(int i) {
        this.A04.A02(C2G.A01(i, 77), i);
        this.A01.setColorFilter(i);
    }

    public void setInitialUnskippableSeconds(int i) {
        if (i > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f) {
        this.A04.setProgressWithAnimation(f);
    }

    public void setToolbarActionMode(int i) {
        EnumC0803Lm enumC0803Lm;
        this.A00 = i;
        this.A04.setVisibility(i == 2 ? 0 : 8);
        this.A01.setVisibility(i == 2 ? 8 : 0);
        setVisibility(0);
        if (i == 0) {
            enumC0803Lm = EnumC0803Lm.CROSS;
        } else if (i == 1) {
            enumC0803Lm = EnumC0803Lm.SKIP_ARROW;
        } else if (i == 3) {
            enumC0803Lm = EnumC0803Lm.MINIMIZE_ARROW;
        } else if (i != 4) {
            enumC0803Lm = EnumC0803Lm.CROSS;
        } else {
            enumC0803Lm = EnumC0803Lm.CROSS;
            if (A05[4].charAt(13) == 'C') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "";
            strArr[2] = "";
            this.A01.setVisibility(8);
            setVisibility(8);
        }
        this.A01.setImageBitmap(C0804Ln.A00(enumC0803Lm));
        C0795Le.A0J(1002, this.A01);
    }

    public void setToolbarMessage(String str) {
        this.A03.setText(str);
        this.A03.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z) {
        this.A03.setVisibility(z ? 0 : 4);
    }
}