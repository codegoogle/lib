package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.widget.Button;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.Nd  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0845Nd extends Button {
    public static final int A0B = (int) (C0795Le.A01 * 16.0f);
    public static final int A0C = (int) (C0795Le.A01 * 4.0f);
    public int A00;
    public int A01;
    public C1H A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final float A06;
    public final int A07;
    public final Runnable A08;
    public final Runnable A09;
    public final Runnable A0A;

    public C0845Nd(C1080Wh c1080Wh, C1H c1h) {
        super(c1080Wh);
        this.A03 = false;
        this.A01 = 0;
        this.A00 = 0;
        this.A04 = true;
        this.A05 = false;
        this.A08 = new C1085Wm(this);
        this.A0A = new C1084Wl(this);
        this.A09 = new C1083Wk(this);
        this.A02 = c1h;
        this.A07 = J8.A03(c1080Wh);
        this.A06 = J8.A00(c1080Wh);
        C0795Le.A0b(this, false, 16);
        setGravity(17);
        A04();
    }

    private void A04() {
        C1H c1h = this.A02;
        if (c1h != null) {
            this.A00 = c1h.A08(this.A05);
            this.A01 = this.A02.A09(this.A05);
        }
        C0795Le.A0S(this, this.A00, this.A04 ? A0C : 0);
        setTextColor(this.A01);
    }

    private void A05() {
        if (this.A07 < 0 || !J8.A1M(getContext()) || this.A03) {
            return;
        }
        this.A03 = true;
        if (J8.A1U(getContext()) && Build.VERSION.SDK_INT >= 16) {
            postDelayed(this.A08, this.A07);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        A05();
    }

    public void setRoundedCornersEnabled(boolean z) {
        this.A04 = z;
        A04();
    }

    public void setText(String str) {
        super.setText((CharSequence) str.toUpperCase(Locale.US));
    }

    public void setUpButtonColors(C1H c1h) {
        this.A02 = c1h;
        A04();
    }

    public void setViewShowsOverMedia(boolean z) {
        this.A05 = z;
        A04();
    }
}