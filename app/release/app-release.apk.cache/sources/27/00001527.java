package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class XX extends AbstractC0823Mg {
    public static String[] A02;
    public static final int A03;
    public final RelativeLayout A00;
    public final C1080Wh A01;

    public static void A0C() {
        A02 = new String[]{"ixUXsyhysd", "OPv8qP0MhbtkKZTtC7nh2I9a6WHAwpWs", "vXGbyjT4IhQUpn", "fkCzuvVfwHm7OJpjmgBYeP3AajMmrNF6", "BQFEEs7xBV9CwTHtkGRziYqWB8GhQG3x", "ODdJk2", "", "xXrbtEFvrY2"};
    }

    static {
        A0C();
        A03 = (int) (C0795Le.A01 * 8.0f);
    }

    public XX(C1080Wh c1080Wh, JE je, String str, C1Q c1q, M7 m7, M6 m6) {
        super(c1080Wh, je, str, c1q, m7, m6);
        this.A01 = c1080Wh;
        this.A00 = new RelativeLayout(getContext());
        addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
        C0795Le.A0P(this.A00, -1728053248);
        this.A00.setOnClickListener(new View$OnClickListenerC0828Ml(this));
    }

    public static RelativeLayout.LayoutParams A0A(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        if (A02[7].length() != 30) {
            String[] strArr = A02;
            strArr[2] = "p8zovDyK5QtHis";
            strArr[0] = "GXgRrx0bJv";
            layoutParams.addRule(12);
            return layoutParams;
        }
        throw new RuntimeException();
    }

    private void A0B() {
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            C0795Le.A0Z(this, transitionSet);
            return;
        }
        C0795Le.A0X(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0823Mg
    public final void A0K() {
        AnonymousClass26 A032 = AnonymousClass23.A03(this.A01.A00());
        C0837Mv adChoicesView = new C0837Mv(this.A01);
        adChoicesView.setInfo(EnumC0803Lm.HIDE_AD, AnonymousClass23.A0B(this.A01.A00()), AnonymousClass23.A0A(this.A01.A00()));
        adChoicesView.setOnClickListener(new View$OnClickListenerC0829Mm(this));
        AnonymousClass26 A04 = AnonymousClass23.A04(this.A01.A00());
        C0837Mv c0837Mv = new C0837Mv(this.A01);
        c0837Mv.setInfo(EnumC0803Lm.REPORT_AD, AnonymousClass23.A0F(this.A01.A00()), AnonymousClass23.A0E(this.A01.A00()));
        c0837Mv.setOnClickListener(new View$OnClickListenerC0830Mn(this));
        C0837Mv c0837Mv2 = new C0837Mv(this.A01);
        c0837Mv2.setInfo(EnumC0803Lm.AD_CHOICES_ICON, AnonymousClass23.A0G(this.A01.A00()), "");
        c0837Mv2.setOnClickListener(new View$OnClickListenerC0831Mo(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        int i = A03;
        linearLayout.setPadding(i * 2, i, i * 2, i);
        C0795Le.A0P(linearLayout, -1);
        if (!A032.A05().isEmpty()) {
            linearLayout.addView(adChoicesView, layoutParams);
        }
        if (!A04.A05().isEmpty()) {
            linearLayout.addView(c0837Mv, layoutParams);
        }
        linearLayout.addView(c0837Mv2, layoutParams);
        A0B();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0A(false));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0823Mg
    public final void A0L() {
        C0795Le.A0L(this);
        this.A00.removeAllViews();
        C0795Le.A0M(this);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0823Mg
    public final void A0M(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24) {
        String A08;
        String str;
        if (anonymousClass24 == AnonymousClass24.A04) {
            return;
        }
        boolean z = anonymousClass24 == AnonymousClass24.A05;
        C0821Me c0821Me = new C0821Me(this.A01, this.A0A);
        if (z) {
            A08 = AnonymousClass23.A09(this.A01.A00());
        } else {
            A08 = AnonymousClass23.A08(this.A01.A00());
        }
        C0821Me A0D = c0821Me.A0I(A08).A0H(AnonymousClass23.A07(this.A01.A00())).A0F(anonymousClass26.A04()).A0E(z ? EnumC0803Lm.REPORT_AD : EnumC0803Lm.HIDE_AD).A0D(z ? -552389 : -13272859);
        if (this.A09 != null) {
            str = this.A09.A01();
        } else {
            str = "";
        }
        C0822Mf A0M = A0D.A0G(str).A0M();
        C0795Le.A0P(A0M, -1);
        C0795Le.A0X(this);
        this.A00.removeAllViews();
        this.A00.addView(A0M, A0A(true));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0823Mg
    public final void A0N(AnonymousClass26 anonymousClass26, AnonymousClass24 anonymousClass24) {
        String A0B;
        boolean z = anonymousClass24 == AnonymousClass24.A05;
        C1080Wh c1080Wh = this.A01;
        InterfaceC0825Mi interfaceC0825Mi = this.A0A;
        if (z) {
            A0B = AnonymousClass23.A0F(this.A01.A00());
        } else {
            A0B = AnonymousClass23.A0B(this.A01.A00());
        }
        C0840My c0840My = new C0840My(c1080Wh, anonymousClass26, interfaceC0825Mi, A0B, z ? EnumC0803Lm.REPORT_AD : EnumC0803Lm.HIDE_AD);
        c0840My.setClickable(true);
        C0795Le.A0P(c0840My, -1);
        int i = A03;
        c0840My.setPadding(i * 2, i, i * 2, i);
        A0B();
        this.A00.removeAllViews();
        this.A00.addView(c0840My, A0A(false));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0823Mg
    public final boolean A0O() {
        return false;
    }
}