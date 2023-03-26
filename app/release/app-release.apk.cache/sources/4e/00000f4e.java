package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.8l  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C04878l extends QZ {
    @Nullable
    public AbstractC0856No A00;
    public final InterfaceC04074z A01;
    public final AtomicBoolean A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;

    public C04878l(C1080Wh c1080Wh, InterfaceC0818Mb interfaceC0818Mb, JE je, AnonymousClass16 anonymousClass16, C7H c7h, M6 m6) {
        super(c1080Wh, interfaceC0818Mb, je, anonymousClass16, c7h, m6);
        this.A01 = new QY(this);
        this.A03 = new AtomicBoolean(false);
        this.A02 = new AtomicBoolean(false);
        this.A04 = new AtomicBoolean(false);
    }

    private AbstractC0856No A01(int i) {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        new AsyncTaskC1091Ws(imageView, super.A03).A06(super.A01.A0M().A0E().A00(), super.A01.A0M().A0E().A01()).A07(new QW(this)).A08(super.A01.A0M().A0E().A07());
        return C0857Np.A00(new C0859Nr(super.A03, super.A04, this.A08, super.A01, imageView, this.A0A, this.A06).A0D(this.A07.getToolbarHeight()).A0F(this.A07).A0C(i).A0H(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A03.get() && this.A02.get()) {
            A0Q();
        }
    }

    private void A06(int i) {
        C0795Le.A0M(this.A00);
        this.A00 = A01(i);
        C1H colors = this.A00.getColors();
        AbstractC0856No abstractC0856No = this.A00;
        boolean z = true;
        C0795Le.A0P(this, colors.A07(abstractC0856No != null && (abstractC0856No.A0c() || (this.A00 instanceof Si))));
        this.A07.A05(colors, this.A00.A0c());
        addView(this.A00, 0, QZ.A0D);
        AbstractC0856No abstractC0856No2 = this.A00;
        setUpFullscreenMode((abstractC0856No2 == null || !abstractC0856No2.A0c()) ? false : false);
    }

    @Override // com.facebook.ads.redexgen.X.QZ
    public final void A0R() {
        C0795Le.A0O(this.A00);
        C0795Le.A0O(this.A07);
        this.A02.set(true);
        A05();
        int A03 = super.A01.A0M().A0E().A03();
        if (A03 > 0) {
            AbstractC0856No abstractC0856No = this.A00;
            if (abstractC0856No != null) {
                abstractC0856No.A0a();
            }
            A0S(A03, new QX(this));
            return;
        }
        this.A04.set(true);
        this.A07.setToolbarActionMode(getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.X.QZ
    public final void A0T(AnonymousClass51 anonymousClass51) {
        anonymousClass51.A0L(this.A01);
        A06(anonymousClass51.A0I().getResources().getConfiguration().orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        C0795Le.A0K(this.A00);
        C0795Le.A0K(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.QZ
    public final boolean A0U() {
        AbstractC0856No abstractC0856No = this.A00;
        return abstractC0856No != null && abstractC0856No.A0d(false);
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void AAO(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void AAl(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        AbstractC0856No abstractC0856No = this.A00;
        if (abstractC0856No != null) {
            return abstractC0856No.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.QZ, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A01.A0M().A0M()) {
            A06(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QZ, com.facebook.ads.redexgen.X.M7
    public final void onDestroy() {
        AbstractC0856No abstractC0856No = this.A00;
        if (abstractC0856No != null) {
            abstractC0856No.A0W();
        }
        super.onDestroy();
    }
}