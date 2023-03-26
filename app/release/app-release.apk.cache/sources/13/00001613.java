package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.proguard.annotations.DoNotStrip;
import com.p7700g.p99005.bx;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.bP  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1258bP extends AnonymousClass56 implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G;
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public C1080Wh A01;
    @Nullable
    public JT A02;
    @Nullable
    public C05219t A04;
    public C04597a A05;
    public C7S A06;
    @DoNotStrip
    public AbstractC0900Pg A07;
    public C0901Ph A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC0883Op A0C = new C1252bJ(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public EnumC0748Je A03 = EnumC0748Je.A03;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{7, 32, 56, 47, 34, 39, bx.W5, 110, 60, 43, 32, bx.W5, 43, 60, 43, 60, 110, 45, 38, 39, 34, bx.W5, 110, 45, 33, 32, 40, 39, 41, 96, 14, 38, 39, bx.W5, 34, 21, bx.W5, 38, 52, 21, bx.W5, 39, 38, 44, 99, bx.W5, 48, 99, 45, 54, 47, 47, 120, 99, 54, 45, 34, 33, 47, 38, 99, 55, 44, 99, 37, bx.W5, 45, 39, 99, bx.W5, 55, 109, 16, 43, 36, 39, 41, 32, 101, 49, bx.W5, 101, 35, 44, 43, 33, 101, 8, 32, 33, 44, 36, 19, 44, 32, 50, 19, 44, 33, 32, bx.W5, 101, 38, 45, 44, 41, 33, 107};
    }

    public static void A0F() {
        A0G = new String[]{"mcYgxpLQMmIwsDd5yEmcOVEUvqtoI", "GHoJM0N9xHnxy27wJlEicj6316JJBG", "sAgmez8xlBVRjdgohc9cPNZKpCHjl", "UXd4O0RMEZeMz8rPKuZc9Jx8", "lkMSGOb1N9f2znZPpxO7v43dGPgWn", "ZJq7h5cFUWj9FCmvTSQNl6xA6rnC8", "yifDfgH7QVrqMR4w0vNHSMY9h4Ewh", "QZpfE8IVFABXRQwraZ"};
    }

    static {
        A0F();
        A0E();
        A0H = C1258bP.class.getSimpleName();
    }

    private JV A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new C1253bK(this, mediaViewVideoRendererApi);
    }

    private JV A02(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new C1254bL(this, mediaViewVideoRendererApi);
    }

    private AbstractC0900Pg A04() {
        return new C1256bN(this);
    }

    private C0901Ph A05() {
        return new C0901Ph(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        C05219t c05219t = this.A04;
        if (c05219t != null) {
            C0884Oq c0884Oq = (C0884Oq) c05219t.getVideoView();
            if (A0G[3].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[2] = "uL1T6UePNJ7Kw1irCYcqiA1GlgiEZ";
            strArr[0] = "2BZHbySyGqLzqR4K5b7TQMpiAd64K";
            c0884Oq.setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        C05219t c05219t = this.A04;
        if (c05219t != null) {
            c05219t.getVideoView().setOnTouchListener(new JS(this));
        }
    }

    private void A0B() {
        C05219t c05219t = this.A04;
        if (c05219t != null) {
            C0884Oq c0884Oq = (C0884Oq) c05219t.getVideoView();
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[7] = "MUEPyY1MJMWvhU3XHu";
            strArr2[7] = "MUEPyY1MJMWvhU3XHu";
            c0884Oq.setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09) {
            MediaViewVideoRenderer mediaViewVideoRenderer = this.A00;
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[4] = "vtumVYeB8x7vkBeCNzRl37Vgwgf5m";
            strArr2[1] = "l5c2Nb35iHyego1JNAmcVzJY15xyfp";
            if (mediaViewVideoRenderer.hasWindowFocus()) {
                this.A08.A0W();
                return;
            }
        }
        C05219t c05219t = this.A04;
        if (c05219t != null && c05219t.getState() == EnumC0898Pe.A05) {
            this.A0B = true;
        }
        this.A08.A0X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = EnumC0748Je.A03;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(C1267bZ c1267bZ, @Nullable JT jt) {
        String str;
        this.A0A = false;
        this.A0B = false;
        this.A02 = jt;
        A09();
        C04597a c04597a = this.A05;
        if (c1267bZ != null) {
            JZ adCoverImage = c1267bZ.getAdCoverImage();
            String[] strArr = A0G;
            if (strArr[2].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[3] = "zpp3cHPhluFOPvL30kkcY8af";
            strArr2[3] = "zpp3cHPhluFOPvL30kkcY8af";
            if (adCoverImage != null) {
                str = c1267bZ.getAdCoverImage().getUrl();
                c04597a.setImage(str, new C1255bM(this));
                this.A03 = c1267bZ.A14();
                this.A06.setPlayAccessibilityLabel(c1267bZ.A18());
                this.A06.setPauseAccessibilityLabel(c1267bZ.A17());
                this.A08.A0W();
            }
        }
        str = null;
        c04597a.setImage(str, new C1255bM(this));
        this.A03 = c1267bZ.A14();
        this.A06.setPlayAccessibilityLabel(c1267bZ.A18());
        this.A06.setPauseAccessibilityLabel(c1267bZ.A17());
        this.A08.A0W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(EnumC0886Os enumC0886Os) {
        C05219t c05219t = this.A04;
        if (c05219t != null) {
            c05219t.A0Y(enumC0886Os, 24);
        } else if (!AdInternalSettings.isDebugBuild()) {
        } else {
            Log.e(A0H, A06(30, 42, 60));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0L() {
        C05219t c05219t = this.A04;
        if (c05219t == null || c05219t.getState() == EnumC0898Pe.A06) {
            return false;
        }
        return this.A03 == EnumC0748Je.A05 || this.A03 == EnumC0748Je.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i) {
        JV A02;
        ((AnonymousClass56) mediaViewVideoRendererApi.getAdComponentViewApi()).A01(this);
        if (i == 0) {
            A02 = A02(mediaViewVideoRendererApi);
        } else if (i == 1) {
            A02 = A01(mediaViewVideoRendererApi);
        } else {
            throw new IllegalArgumentException(A06(0, 30, 49));
        }
        ((C5C) mediaViewVideoRendererApi).A07(A02);
        this.A01 = AnonymousClass57.A02(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new C04597a(this.A01);
        this.A07 = A04();
        this.A08 = A05();
        float f = C0795Le.A01;
        int i2 = (int) (2.0f * f);
        int i3 = (int) (25.0f * f);
        this.A06 = new C7S(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(i2, i3, i3, i2);
        this.A06.setLayoutParams(layoutParams);
        int i4 = 0;
        while (true) {
            int childCount = this.A00.getChildCount();
            if (A0G[3].length() == 24) {
                String[] strArr = A0G;
                strArr[2] = "oEzbzrDqpY4LpZuK9aeaZZijHYv0V";
                strArr[0] = "65U2aK7TrzSKlLOXQMMYyslcv3rZK";
                if (i4 >= childCount) {
                    break;
                }
                View childAt = this.A00.getChildAt(0);
                if (childAt instanceof C05219t) {
                    this.A04 = (C05219t) childAt;
                    break;
                }
                i4++;
            } else {
                throw new RuntimeException();
            }
        }
        C05219t c05219t = this.A04;
        if (c05219t == null) {
            if (AdInternalSettings.isDebugBuild()) {
                Log.e(A0H, A06(72, 36, 58));
            }
        } else {
            c05219t.A0Z(this.A05);
            this.A04.A0Z(this.A06);
        }
        this.A08.A0Y(0);
        this.A08.A0Z(250);
        A02.ACy();
        String[] strArr2 = A0G;
        if (strArr2[4].length() != strArr2[1].length()) {
            String[] strArr3 = A0G;
            strArr3[4] = "NjD77g9sbns6FUonJskLzorZMVzfs";
            strArr3[1] = "sF6jyMJNRDvSJleY8k7g51skJQqlgl";
            return;
        }
        String[] strArr4 = A0G;
        strArr4[2] = "irNdkufru0tgAA9z3l7YlJhRv0dZK";
        strArr4[0] = "zN5wNlZvELtjdUjcESL7VUEU7ru13";
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass56, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass56, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        this.A00.setOnTouchListener(new JR(this));
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass56, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass56, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0C();
    }
}