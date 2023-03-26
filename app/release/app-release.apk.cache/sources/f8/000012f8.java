package com.facebook.ads.redexgen.X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class OT extends FrameLayout {
    public static final int A07 = (int) (C0795Le.A01 * 16.0f);
    public C05159n A00;
    @Nullable
    public C7w A01;
    public HS A02;
    public C04597a A03;
    public C7B A04;
    public final C1080Wh A05;
    public final JL A06;

    public OT(C1080Wh c1080Wh, JL jl) {
        super(c1080Wh);
        this.A06 = jl;
        this.A05 = c1080Wh;
        setUpView(c1080Wh);
    }

    public final void A01() {
        A0b(true, 10);
    }

    public final void A02() {
        C7w c7w = this.A01;
        if (c7w != null) {
            c7w.A0h();
            this.A01 = null;
        }
    }

    public final void A03(C9K c9k) {
        getEventBus().A06(c9k);
    }

    public final void A04(JE je, String str, Map<String, String> extraParams) {
        A02();
        this.A01 = new C7w(this.A05, je, this.A00, str, extraParams);
    }

    public final void A05(EnumC0886Os enumC0886Os) {
        A0Y(enumC0886Os, 13);
    }

    public final boolean A06() {
        return A0h();
    }

    @VisibleForTesting
    public C0792Lb getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A03.setImage(str);
    }

    private void setUpPlugins(C1080Wh c1080Wh) {
        A0U();
        this.A03 = new C04597a(c1080Wh);
        A0Z(this.A03);
        this.A02 = new HS(c1080Wh, this.A06);
        A0Z(new C04657i(c1080Wh));
        A0Z(this.A02);
        this.A04 = new C7B(c1080Wh, true, this.A06);
        A0Z(this.A04);
        A0Z(new HU(this.A04, P4.A03, true, true));
        if (!A0d()) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i = A07;
        layoutParams.setMargins(i, i, i, i);
        this.A02.setLayoutParams(layoutParams);
        addView(this.A02);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.9n] */
    private void setUpVideo(final C1080Wh c1080Wh) {
        this.A00 = new C0792Lb(c1080Wh) { // from class: com.facebook.ads.redexgen.X.9n
            @Override // android.widget.RelativeLayout, android.view.View
            public final void onMeasure(int newHeightSpec, int i) {
                if (View.MeasureSpec.getMode(newHeightSpec) == 1073741824) {
                    i = newHeightSpec;
                } else if (View.MeasureSpec.getMode(i) == 1073741824) {
                    newHeightSpec = i;
                }
                super.onMeasure(newHeightSpec, i);
            }
        };
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        C0795Le.A0N(this.A00);
        addView(this.A00);
        setOnClickListener(new OS(this));
    }

    private void setUpView(C1080Wh c1080Wh) {
        setUpVideo(c1080Wh);
        setUpPlugins(c1080Wh);
    }

    public void setVideoURI(String str) {
        setVideoURI(str);
    }

    public void setVolume(float f) {
        setVolume(f);
        this.A02.A0A();
    }
}