package com.facebook.ads.redexgen.X;

import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.p7700g.p99005.bx;
import com.p7700g.p99005.sr;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: assets/audience_network.dex */
public final class O1 extends FrameLayout {
    public static byte[] A04;
    public static String[] A05;
    public static final int A06;
    public static final int A07;
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public final int A00;
    public final RelativeLayout A01;
    public final View$OnClickListenerC1087Wo A02;
    public final C0860Ns A03;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        byte[] bArr = {69, 73, 75, 8, 64, 71, 69, 67, 68, 73, 73, 77, 8, 71, 66, 85, 8, 79, 72, 82, 67, 84, 85, 82, 79, 82, 79, 71, 74, 8, 69, 74, 79, 69, 77, 67, 66, 7, 16, 2, 20, 7, 17, 16, 17, bx.W5, 3, 28, 17, 16, 26};
        String[] strArr = A05;
        if (strArr[3].charAt(15) != strArr[4].charAt(15)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[5] = "M6cOBFfgZV5WrXqkO4ySzzXWKNERUvDd";
        strArr2[1] = "WlW2JqkldnDOleaZiTbYh0p7usvkNGUh";
        A04 = bArr;
    }

    public static void A02() {
        A05 = new String[]{"ETopWcrKoMciXJ", "1fAm0Qu4GTtFv02w82npEu9QoUOkP81a", "kVTrWQ9", "rJ2v45uLjqrwh5Cb8v0uvinsp2r56JAZ", "ea7XoHjS0E3igDkbOVl09dybSdR2gWYC", "2SqEzPP8dz4OE7L9BTgTSspAixKmYBe2", "Gvao2GnTf255Ph834nKKQFNtQ7sU5Fe8", "O3MbW7jFVfRGmhn"};
    }

    static {
        A02();
        A01();
        A09 = (int) (C0795Le.A01 * 36.0f);
        A0A = (int) (C0795Le.A01 * 36.0f);
        A06 = (int) (C0795Le.A01 * 23.0f);
        A08 = (int) (C0795Le.A01 * 8.0f);
        A07 = (int) (C0795Le.A01 * 3.0f);
        A0B = (int) (C0795Le.A01 * 4.0f);
    }

    public O1(C0860Ns c0860Ns, String str, C1H c1h, InterfaceC0842Na interfaceC0842Na) {
        super(c0860Ns.A05());
        String A00;
        this.A03 = c0860Ns;
        this.A00 = c1h.A08(true);
        this.A01 = new RelativeLayout(c0860Ns.A05());
        addView(this.A01, new FrameLayout.LayoutParams(-1, -1));
        this.A01.setClickable(false);
        A04(str);
        if (c0860Ns.A04().A0T().equals(A00(37, 14, 107))) {
            A00 = EnumC0888Ou.A04.A02();
        } else {
            A00 = A00(0, 37, 56);
        }
        this.A02 = new View$OnClickListenerC1087Wo(c0860Ns.A05(), A00, null, c0860Ns.A06(), c0860Ns.A09(), c0860Ns.A0B(), c0860Ns.A07());
        this.A02.setCta(c0860Ns.A04().A0M().A0G(), c0860Ns.A04().A0Q(), new HashMap(), interfaceC0842Na);
        this.A02.setIsInAppBrowser(true);
        addView(this.A02, new FrameLayout.LayoutParams(-1, -1));
    }

    private void A03(View view) {
        ImageView imageView = new ImageView(this.A03.A05());
        imageView.setImageBitmap(C0804Ln.A00(EnumC0803Lm.MINIMIZE_ARROW));
        imageView.setRotation(180.0f);
        imageView.setClickable(false);
        imageView.setColorFilter(this.A00);
        int i = A06;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        int i2 = A07;
        imageView.setPadding(i2, i2, i2, i2);
        layoutParams.addRule(2, view.getId());
        layoutParams.addRule(14);
        this.A01.addView(imageView, layoutParams);
    }

    private void A04(String str) {
        Button button = new Button(this.A03.A05());
        C0795Le.A0N(button);
        int i = A0A;
        button.setPadding(i, 0, i, 0);
        button.setText(str.toUpperCase(Locale.getDefault()));
        button.setTextSize(14.0f);
        button.setTypeface(Typeface.defaultFromStyle(1));
        C0795Le.A0S(button, this.A00, A0B);
        button.setTextColor(sr.t);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, A09);
        layoutParams.addRule(12);
        layoutParams.addRule(14);
        this.A01.addView(button, layoutParams);
        A03(button);
    }

    @Override // android.view.View
    public final boolean performClick() {
        return this.A02.performClick();
    }
}