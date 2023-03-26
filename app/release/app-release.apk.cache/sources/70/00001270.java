package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class MF extends RelativeLayout {
    @Nullable
    public TextView A00;
    public final Button A01;
    public final Button A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final TextView A05;
    public static final int A08 = (int) (C0795Le.A01 * 60.0f);
    public static final int A07 = (int) (C0795Le.A01 * 8.0f);
    public static final int A09 = (int) (C0795Le.A01 * 16.0f);
    public static final int A0A = (int) (C0795Le.A01 * 24.0f);
    public static final int A06 = (int) (C0795Le.A01 * 12.0f);

    public MF(C1080Wh c1080Wh, int i, int i2, String str, @Nullable String str2, String str3, String str4, Bitmap bitmap) {
        super(c1080Wh);
        this.A05 = new TextView(c1080Wh);
        this.A02 = new Button(c1080Wh);
        this.A01 = new Button(c1080Wh);
        this.A03 = new ImageView(c1080Wh);
        this.A04 = new LinearLayout(c1080Wh);
        if (!TextUtils.isEmpty(str2)) {
            this.A00 = new TextView(c1080Wh);
        }
        this.A05.setText(str);
        this.A05.setTextColor(i);
        C0795Le.A0b(this.A05, true, 20);
        TextView textView = this.A00;
        if (textView != null) {
            textView.setText(str2);
            this.A00.setTextColor(i);
            C0795Le.A0b(this.A00, false, 18);
        }
        this.A03.setImageBitmap(bitmap);
        this.A03.setColorFilter(i);
        this.A02.setText(str3);
        C0795Le.A0b(this.A02, true, 18);
        this.A02.setAllCaps(true);
        this.A02.setTextColor(i2);
        Button button = this.A02;
        int i3 = A06;
        button.setPadding(i3, i3, i3, i3);
        this.A01.setText(str4);
        C0795Le.A0b(this.A01, true, 18);
        this.A01.setAllCaps(true);
        this.A01.setTextColor(i);
        Button button2 = this.A01;
        int i4 = A06;
        button2.setPadding(i4, i4, i4, i4);
        int A01 = C2G.A01(i2, 20);
        C0795Le.A0S(this.A02, i, A07);
        C0795Le.A0S(this.A01, A01, A07);
        A00();
        setGravity(17);
    }

    private void A00() {
        int i = A0A;
        setPadding(i, i, i, i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        this.A04.setOrientation(1);
        this.A04.setGravity(14);
        addView(this.A04, layoutParams);
        int i2 = A08;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i2, i2);
        layoutParams2.setMargins(0, 0, 0, A09);
        layoutParams2.gravity = 1;
        this.A04.addView(this.A03, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, 0, A09 / 2);
        this.A05.setGravity(17);
        this.A04.addView(this.A05, layoutParams3);
        if (this.A00 != null) {
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.setMargins(0, 0, 0, A09);
            this.A00.setGravity(17);
            this.A04.addView(this.A00, layoutParams4);
        }
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.setMargins(0, 0, 0, A09);
        this.A04.addView(this.A02, layoutParams5);
        this.A04.addView(this.A01, layoutParams5);
    }
}