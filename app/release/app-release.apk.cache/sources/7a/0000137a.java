package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.proguard.annotations.DoNotStrip;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public abstract class QZ extends FrameLayout implements M7 {
    public static final RelativeLayout.LayoutParams A0D = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AnonymousClass16 A01;
    public final C7H A02;
    public final C1080Wh A03;
    public final JE A04;
    public final JL A05;
    public final LX A06;
    public final M1 A07;
    public final M6 A08;
    public final InterfaceC0818Mb A09;
    public final C0901Ph A0A;
    public final LS A0B;
    @DoNotStrip
    public final AbstractC0900Pg A0C;

    public abstract void A0R();

    public abstract void A0T(AnonymousClass51 anonymousClass51);

    public abstract boolean A0U();

    public QZ(C1080Wh c1080Wh, InterfaceC0818Mb interfaceC0818Mb, JE je, AnonymousClass16 anonymousClass16, C7H c7h, M6 m6) {
        super(c1080Wh);
        this.A0C = new C0923Qd(this);
        this.A06 = new LX();
        this.A00 = false;
        this.A03 = c1080Wh;
        this.A09 = interfaceC0818Mb;
        this.A04 = je;
        this.A01 = anonymousClass16;
        this.A02 = c7h;
        this.A08 = m6;
        this.A05 = new JL(this.A01.A0Q(), this.A04);
        this.A0A = new C0901Ph(this, 1, new WeakReference(this.A0C), this.A03);
        this.A0A.A0Y(this.A01.A0G());
        this.A0A.A0Z(this.A01.A0H());
        this.A07 = A0O();
        this.A0B = new LS(this);
        this.A0B.A05(LR.A03);
    }

    private M1 A0O() {
        M1 fullScreenAdToolbar;
        if (J8.A1Q(this.A03)) {
            fullScreenAdToolbar = new C1162Zn(this.A03, this.A08, this.A05, 4, 2);
        } else {
            fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A0E());
        }
        int A03 = this.A01.A0M().A0E().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A0O(), this.A01.A0Q(), A03, this.A01.A0P());
        fullScreenAdToolbar.A05(this.A01.A0L().A01(), true);
        if (A03 < 0 && this.A01.A0M().A0L()) {
            fullScreenAdToolbar.setToolbarActionMode(4);
        }
        fullScreenAdToolbar.setToolbarListener(new C0920Qa(this));
        return fullScreenAdToolbar;
    }

    private void A0P() {
        if (this.A01.A0M().A0O()) {
            OH A0B = new OF(this.A03, this.A01.A0M().A0F(), this.A01.A0O()).A08(this.A01.A0L().A01()).A0B();
            JN.A04(A0B, this.A05, JK.A0U);
            addView(A0B, A0D);
            A0B.A04(new C0921Qb(this));
            return;
        }
        A0R();
    }

    public final void A0Q() {
        if (!this.A00) {
            this.A0A.A0W();
            this.A00 = true;
        }
    }

    public final void A0S(int i, AbstractRunnableC0770Kc abstractRunnableC0770Kc) {
        new L4(i, new C0922Qc(this, i, abstractRunnableC0770Kc)).A08();
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void A7r(Intent intent, @Nullable Bundle bundle, AnonymousClass51 anonymousClass51) {
        this.A08.A3L(this, A0D);
        A0T(anonymousClass51);
        A0P();
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void ACg(Bundle bundle) {
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A0Q())) {
            this.A04.A80(this.A01.A0Q(), new NU().A04(this.A0A).A03(this.A06).A06());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A07(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(M6 m6) {
    }

    public void setUpFullscreenMode(boolean z) {
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        this.A0B.A05(z ? LR.A04 : LR.A03);
    }
}