package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.ads.internal.view.ToolbarActionView$ToolbarActionMode;
import com.p7700g.p99005.zg2;
import java.util.Arrays;
import java.util.HashMap;

/* renamed from: com.facebook.ads.redexgen.X.Qm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0932Qm extends AbstractC0856No {
    @Nullable
    public static C0932Qm A0O;
    public static byte[] A0P;
    public static String[] A0Q;
    public static final int A0R;
    public static final int A0S;
    public static final int A0T;
    public static final int A0U;
    public static final int A0V;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public View A06;
    public LinearLayout A07;
    public LinearLayout A08;
    public TextView A09;
    public AnonymousClass16 A0A;
    public N9 A0B;
    public NA A0C;
    @Nullable
    public XS A0D;
    public C0860Ns A0E;
    public O1 A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final View A0K;
    public final AbstractC02860f A0L;
    public final JL A0M;
    public final H2 A0N;

    public static String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0P, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 122);
        }
        return new String(copyOfRange);
    }

    public static void A0M() {
        A0P = new byte[]{36};
    }

    public static void A0N() {
        A0Q = new String[]{"E7d9V", "HfiTPdnQE6JsOHdYoOA4lRNnbQ3", "7AVXCU5oRbsgBqmorHmAVCwb6r5tuTQ8", "hoWzaZbN7yXesQFa", "a3ZYa3", "EXUfJIeYYGyfdCGOPOS2l0on83CPH94Z", "MYJwByDzw5bCUSkxw6qgTJ7WJbI", "X3l5ZIwYV4"};
    }

    static {
        A0N();
        A0M();
        A0T = (int) (C0795Le.A01 * 26.0f);
        A0R = (int) (C0795Le.A01 * 4.0f);
        A0V = (int) (C0795Le.A01 * 8.0f);
        A0S = C2G.A01(-1, 77);
        A0U = (int) (C0795Le.A01 * 12.0f);
        A0O = null;
    }

    public C0932Qm(C0860Ns c0860Ns) {
        super(c0860Ns, true);
        this.A01 = 0;
        this.A0G = false;
        this.A0I = false;
        this.A0J = false;
        this.A0E = c0860Ns;
        this.A0A = this.A0E.A04();
        this.A0M = new JL(c0860Ns.A04().A0Q(), c0860Ns.A06());
        this.A0N = this.A0E.A0A();
        H2 h2 = this.A0N;
        if (h2 != null) {
            C0795Le.A0N(h2);
        }
        this.A0K = this.A0E.A03();
        this.A0L = C02870g.A01(c0860Ns.A05(), c0860Ns.A06(), c0860Ns.A04().A0Q(), Uri.parse(c0860Ns.A04().A0M().A0G().A04()), new HashMap(), false, true);
        C0854Nm.A00(c0860Ns.A05(), this, c0860Ns.A04().A0M().A0E().A07());
        setupLayoutConfiguration(false);
        A0H();
        A0C();
        A0D();
        postDelayed(new SQ(this), 1000L);
        A0L();
    }

    private void A0B() {
        C0795Le.A0M(this.A08);
        this.A08 = new LinearLayout(this.A0E.A05());
        C0795Le.A0V(this.A08, getAdContextWrapper());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0G ? this.A02 / 4 : this.A02 / 5);
        layoutParams.addRule(12);
        this.A08.setLayoutParams(layoutParams);
        addView(this.A08, 2);
    }

    private void A0C() {
        C0795Le.A0M(this.A07);
        this.A07 = new LinearLayout(this.A0E.A05());
        this.A07.setOrientation(1);
        C0795Le.A0N(this.A07);
        A0J();
        this.A07.setBackgroundColor(-1);
        addView(this.A07);
    }

    private void A0D() {
        C0795Le.A0M(this.A0B);
        this.A0B = new N9(this.A0E.A05());
        C0795Le.A0N(this.A0B);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 0.1f;
        this.A0B.setListener(new C0935Qp(this));
        this.A0B.setOnTouchListener(new View$OnTouchListenerC0864Nw(this));
        this.A07.addView(this.A0B, layoutParams);
        C0795Le.A0M(this.A0C);
        this.A0C = new NA(this.A0E.A05(), null, 16842872);
        this.A07.addView(this.A0C, new LinearLayout.LayoutParams(-1, A0R));
    }

    private void A0E() {
        View view = this.A0K;
        if (view != null) {
            C0795Le.A0M(view);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(AbstractC0856No.A0A, AbstractC0856No.A0A);
            layoutParams.addRule(10);
            layoutParams.addRule(11);
            layoutParams.setMargins(AbstractC0856No.A09, this.A05, AbstractC0856No.A09, AbstractC0856No.A09);
            addView(this.A0K, layoutParams);
        }
    }

    private void A0F() {
        H2 h2 = this.A0N;
        if (h2 != null) {
            C0795Le.A0M(h2);
            H2 h22 = this.A0N;
            int i = A0U;
            h22.setPadding(i, i, i, i);
            this.A0N.A0A(-1, A0S);
            this.A0N.setTranslationY(0.0f);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, A0T);
            if (this.A0H) {
                layoutParams.addRule(8, this.A06.getId());
            } else {
                String[] strArr = A0Q;
                if (strArr[3].length() == strArr[0].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0Q;
                strArr2[3] = "zjul6o0OG2Ezis8Q";
                strArr2[0] = "LmcEL";
                layoutParams.addRule(12);
            }
            addView(this.A0N, layoutParams);
        }
    }

    private void A0G() {
        M1 A08 = this.A0E.A08();
        if (A08 == null) {
            return;
        }
        A08.setPageDetailsVisible((this.A0H || A08.A07()) ? false : true);
    }

    private void A0H() {
        this.A06 = this.A0E.A02();
        C0795Le.A0M(this.A06);
        C0795Le.A0N(this.A06);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(15);
        addView(this.A06, 1, layoutParams);
        this.A09 = new TextView(this.A0E.A05());
        C0795Le.A0N(this.A09);
        this.A09.setGravity(17);
        this.A09.setTextColor(getColors().A05(true));
        this.A09.setEllipsize(TextUtils.TruncateAt.END);
        this.A09.setMaxLines(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        int i = A0V;
        layoutParams2.setMargins(i, i / 2, i, this.A0N == null ? i : A0T);
        addView(this.A09, layoutParams2);
        C0795Le.A0N(this.A09);
        C0860Ns c0860Ns = this.A0E;
        this.A0F = new O1(c0860Ns, c0860Ns.A04().A0M().A0G().A03(), getColors(), new SJ(this));
        C0795Le.A0J(1001, this.A0F);
        addView(this.A0F);
        A0K();
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, (this.A03 * 4) / 5);
        if (A0e()) {
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.addRule(12);
            LinearLayout linearLayout = this.A07;
            String[] strArr = A0Q;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Q;
            strArr2[7] = "mOqhFUC5R4";
            strArr2[4] = "x2rQdK";
            linearLayout.setLayoutParams(layoutParams);
        } else {
            layoutParams.setMargins(0, this.A03 + 1, 0, 0);
        }
        this.A07.setTranslationY(0.0f);
        this.A07.setLayoutParams(layoutParams);
    }

    private void A0K() {
        int i;
        if (!this.A0G) {
            int i2 = this.A02;
            String[] strArr = A0Q;
            if (strArr[6].length() == strArr[1].length()) {
                String[] strArr2 = A0Q;
                strArr2[2] = "bVoeq9MG5etfSqxTxXE6PlzRTEtccpLF";
                strArr2[2] = "bVoeq9MG5etfSqxTxXE6PlzRTEtccpLF";
                i = i2 / 5;
            }
            throw new RuntimeException();
        }
        i = this.A02 / 4;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, i);
        layoutParams.addRule(14);
        String[] strArr3 = A0Q;
        if (strArr3[6].length() == strArr3[1].length()) {
            String[] strArr4 = A0Q;
            strArr4[6] = "SHdOplU7mObztTib9yLp7cTgFqT";
            strArr4[1] = "8sjFKcaHqREVec5LNIXiQvlIl9H";
            layoutParams.addRule(2, this.A09.getId());
            layoutParams.setMargins(0, 0, 0, 0);
            this.A0F.setLayoutParams(layoutParams);
            return;
        }
        throw new RuntimeException();
    }

    private void A0L() {
        A0F();
        A0E();
        A0G();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0R(String str) {
        C0795Le.A0M(this.A0D);
        this.A0D = new XS(this.A0E.A05(), new C0934Qo(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 0.9f;
        this.A07.addView(this.A0D, layoutParams);
        this.A0D.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0S(boolean z) {
        ObjectAnimator objectAnimator;
        int i;
        int i2;
        long j;
        int i3;
        this.A0H = z;
        postDelayed(new C0933Qn(this, z), 250L);
        ObjectAnimator ctaTransAnim = null;
        String A0A = A0A(0, 1, 39);
        if (z) {
            O1 o1 = this.A0F;
            objectAnimator = ObjectAnimator.ofFloat(o1, A0A, o1.getY(), this.A03 / 5);
        } else {
            objectAnimator = null;
        }
        LinearLayout linearLayout = this.A07;
        float[] fArr = new float[2];
        fArr[0] = linearLayout.getY();
        int i4 = this.A03;
        if (z) {
            i4 /= 5;
        }
        fArr[1] = i4;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(linearLayout, A0A, fArr);
        ofFloat.setDuration(500L);
        int i5 = (this.A03 / 2) - (this.A01 / 2);
        View view = this.A06;
        float[] fArr2 = new float[2];
        fArr2[0] = view.getY();
        fArr2[1] = (z || this.A0G) ? 0.0f : i5;
        ObjectAnimator browserTransAnim = ObjectAnimator.ofFloat(view, A0A, fArr2);
        browserTransAnim.setDuration(500L);
        H2 h2 = this.A0N;
        int height = h2 == null ? 0 : h2.getHeight();
        if (z) {
            int i6 = this.A02;
            String[] strArr = A0Q;
            if (strArr[6].length() == strArr[1].length()) {
                String[] strArr2 = A0Q;
                strArr2[7] = "g83HcTndNM";
                strArr2[4] = "KO02it";
                i = (i6 / 5) - height;
            }
            throw new RuntimeException();
        }
        i = (this.A03 - A0T) - A0V;
        H2 h22 = this.A0N;
        if (h22 != null) {
            float[] fArr3 = new float[2];
            fArr3[0] = h22.getY();
            String[] strArr3 = A0Q;
            if (strArr3[6].length() == strArr3[1].length()) {
                String[] strArr4 = A0Q;
                strArr4[2] = "uMAfPHErUq8gYLqYGWwvrPw2H7I5hxcd";
                strArr4[2] = "uMAfPHErUq8gYLqYGWwvrPw2H7I5hxcd";
                fArr3[1] = i;
                ctaTransAnim = ObjectAnimator.ofFloat(h22, A0A, fArr3);
            }
            throw new RuntimeException();
        }
        int[] iArr = new int[2];
        iArr[0] = this.A06.getHeight();
        if (z) {
            i2 = this.A03 / 5;
        } else {
            i2 = this.A01;
        }
        iArr[1] = i2;
        ValueAnimator duration = ValueAnimator.ofInt(iArr).setDuration(500L);
        duration.addUpdateListener(new C0865Nx(this));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.playTogether(ofFloat, browserTransAnim, duration);
        if (objectAnimator != null) {
            j = 500;
            objectAnimator.setDuration(500L);
            i3 = 1;
            animatorSet.playTogether(objectAnimator);
        } else {
            j = 500;
            i3 = 1;
        }
        if (ctaTransAnim != null) {
            ctaTransAnim.setDuration(j);
            Animator[] animatorArr = new Animator[i3];
            animatorArr[0] = ctaTransAnim;
            animatorSet.playTogether(animatorArr);
        }
        animatorSet.addListener(new C0866Ny(this, z));
        animatorSet.start();
    }

    private void A0T(boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        setupLayoutConfiguration(z);
        C0795Le.A0M(this.A06);
        this.A06 = this.A0E.A02();
        C0795Le.A0N(this.A06);
        if (this.A0H) {
            layoutParams = new RelativeLayout.LayoutParams(-1, this.A03 / 5);
            layoutParams.addRule(14);
            layoutParams.addRule(10);
        } else {
            layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            A0C();
            A0D();
        }
        this.A06.setTranslationY(0.0f);
        String[] strArr = A0Q;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0Q;
        strArr2[7] = "FZuJEB1DgE";
        strArr2[4] = "ioAK5D";
        addView(this.A06, 1, layoutParams);
        A0B();
        A0K();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final void A0W() {
        super.A0W();
        A0O = null;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final void A0X() {
        M1 A08 = this.A0E.A08();
        if (A08 == null) {
            return;
        }
        A08.setPageDetailsVisible((A0e() || A08.A07()) ? false : true);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final void A0Y() {
        if (this.A0E.A08() != null) {
            M1 A08 = this.A0E.A08();
            String[] strArr = A0Q;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0Q;
            strArr2[3] = "MMiJw7TNUivh7iTB";
            strArr2[0] = "GEB80";
            A08.setPageDetailsVisible(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final void A0Z() {
        this.A0J = false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final void A0a() {
        this.A0J = true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final void A0b(AnonymousClass19 anonymousClass19, String str, double d, @Nullable Bundle bundle) {
        super.A0b(anonymousClass19, str, d, bundle);
        String A05 = anonymousClass19.A0F().A05();
        if (A05 == null || A05.trim().length() == 0) {
            C0795Le.A0Q(this.A08, 8);
        } else {
            this.A09.setText(A05);
        }
        if (d > zg2.s) {
            this.A01 = (int) (this.A04 / d);
        }
        this.A01 = this.A0G ? this.A02 : this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final boolean A0c() {
        return true;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    public final boolean A0d(boolean z) {
        if (A0e()) {
            A0S(false);
            return true;
        }
        return false;
    }

    public final boolean A0e() {
        return this.A0H;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No
    @ToolbarActionView$ToolbarActionMode
    public int getCloseButtonStyle() {
        if (A0e()) {
            return 3;
        }
        if (this.A0J) {
            return 2;
        }
        return super.getCloseButtonStyle();
    }

    private String getUrl() {
        return this.A0E.A04().A0M().A0G().A04();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0856No, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A0T(A0e());
        A0L();
        setupLayoutConfiguration(A0e());
        A0J();
    }

    private void setupLayoutConfiguration(boolean z) {
        this.A0G = getResources().getConfiguration().orientation == 2;
        this.A05 = this.A0E.A08() == null ? 0 : this.A0E.A08().getToolbarHeight();
        this.A0H = z;
        this.A02 = Resources.getSystem().getDisplayMetrics().heightPixels;
        this.A04 = Resources.getSystem().getDisplayMetrics().widthPixels;
        this.A03 = this.A02 + (this.A0G ? 0 : this.A05);
        this.A01 = this.A02;
    }
}