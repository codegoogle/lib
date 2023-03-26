package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.ads.RewardData;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import com.facebook.proguard.annotations.DoNotStrip;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p7700g.p99005.g15;
import com.p7700g.p99005.sr;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.Xt */
/* loaded from: assets/audience_network.dex */
public final class C1118Xt extends RelativeLayout implements M7, MQ {
    public static byte[] A0j;
    public static String[] A0k;
    public static final int A0l;
    public static final int A0m;
    public static final int A0n;
    public static final int A0o;
    public static final int A0p;
    public static final int A0q;
    public static final RelativeLayout.LayoutParams A0r;
    public static final int A0s;
    public static final int A0t;
    public static final int A0u;
    public static final int A0v;
    public static final int A0w;
    public int A00;
    public int A01;
    @Nullable
    public View A02;
    public View A03;
    @Nullable
    public M1 A04;
    @Nullable
    public M6 A05;
    @Nullable
    public NX A06;
    public C0871Od A07;
    public C0872Oe A08;
    @Nullable
    public C0792Lb A09;
    @Nullable
    public EnumC0886Os A0A;
    public C0702Hi A0B;
    @Nullable
    public HU A0C;
    @Nullable
    public C7B A0D;
    @Nullable
    public C0679Gl A0E;
    public C0674Gg A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final int A0K;
    public final Handler A0L;
    public final Handler A0M;
    public final RelativeLayout A0N;
    public final C1H A0O;
    public final RR A0P;
    public final InterfaceC04074z A0Q;
    public final C1080Wh A0R;
    public final JE A0S;
    public final JL A0T;
    public final LS A0U;
    public final LX A0V;
    public final C7w A0W;
    public final K4 A0X;
    public final K2 A0Y;
    public final AbstractC0754Jk A0Z;
    public final JH A0a;
    public final AbstractC0724Ie A0b;
    public final HS A0c;
    public final H2 A0d;
    @DoNotStrip
    public final AbstractC0900Pg A0e;
    public final C0901Ph A0f;
    public final AtomicBoolean A0g;
    public final boolean A0h;
    public final boolean A0i;

    public static String A0F(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0j, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 83);
        }
        return new String(copyOfRange);
    }

    public static void A0S() {
        A0j = new byte[]{29, 16, Flags.CD, 12, 22};
    }

    public static void A0T() {
        A0k = new String[]{"vsdEBwVgd8xuD4acIyCMTbEVgnYoxSzn", "ksTg5", "PS2LqNPtHz7Bj2TqhJ7TZjs4LL9ATMRr", "qSNvo2HWKXxTUkx77WQBoFZa4uZWek8Z", "kV", "kWwRq1ENXLXBTFEhopAwPvilnneCtOoi", "1j3TsCoxoqnujqaJP1b9vcmgNjtc01PK", "DySaXvgrVXG8E60xfPO0YxcmTr0eS0sa"};
    }

    static {
        A0T();
        A0S();
        A0n = (int) (C0795Le.A01 * 10.0f);
        A0o = (int) (C0795Le.A01 * 18.0f);
        A0q = (int) (C0795Le.A01 * 16.0f);
        A0m = (int) (C0795Le.A01 * 48.0f);
        A0p = (int) (C0795Le.A01 * 28.0f);
        A0l = (int) (C0795Le.A01 * 250.0f);
        A0w = (int) (C0795Le.A01 * 12.0f);
        A0v = (int) (C0795Le.A01 * 26.0f);
        A0s = (int) (C0795Le.A01 * 4.0f);
        A0t = C2G.A01(-1, 77);
        A0u = C2G.A01(A0t, 90);
        A0r = new RelativeLayout.LayoutParams(-1, -1);
    }

    public C1118Xt(C1080Wh c1080Wh, JE je, C0792Lb c0792Lb, M6 m6, RR rr) {
        super(c1080Wh);
        this.A0L = new Handler(Looper.getMainLooper());
        this.A0Q = new Y6(this);
        this.A0X = new K4() { // from class: com.facebook.ads.redexgen.X.9s
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C7v c7v) {
                C1118Xt.A0b(C1118Xt.this, c7v);
            }
        };
        this.A0Y = new K2() { // from class: com.facebook.ads.redexgen.X.9r
            public static byte[] A01;

            static {
                A01();
            }

            public static String A00(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 4);
                }
                return new String(copyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{-108, -89, -94, -93, -83, -114, -86, -97, -73, g15.b, -97, -95, -87, -125, -80, -80, -83, -80};
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A02 */
            public final void A04(K3 k3) {
                C1118Xt.A0c(C1118Xt.this, A00(0, 18, 58));
            }
        };
        this.A0a = new JH() { // from class: com.facebook.ads.redexgen.X.9q
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(JJ jj) {
                C0792Lb c0792Lb2;
                RR rr2;
                AtomicBoolean atomicBoolean;
                C0792Lb c0792Lb3;
                c0792Lb2 = C1118Xt.this.A09;
                if (c0792Lb2 == null) {
                    return;
                }
                C1118Xt.this.A0G = true;
                rr2 = C1118Xt.this.A0P;
                if (!rr2.A0M().A0O()) {
                    C1118Xt.this.A0P();
                }
                atomicBoolean = C1118Xt.this.A0g;
                c0792Lb3 = C1118Xt.this.A09;
                atomicBoolean.set(c0792Lb3.A0d());
                C1118Xt.this.A0R();
            }
        };
        this.A0Z = new AbstractC0754Jk() { // from class: com.facebook.ads.redexgen.X.9p
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.C9K
            /* renamed from: A00 */
            public final void A04(C0761Jt c0761Jt) {
                if (!C1118Xt.A0k(C1118Xt.this)) {
                    C1118Xt.A0E(C1118Xt.this).A0W();
                    C1118Xt.A0m(C1118Xt.this, true);
                }
            }
        };
        this.A0b = new C05169o(this);
        this.A0V = new LX();
        this.A0g = new AtomicBoolean(false);
        this.A0M = new Handler();
        this.A0I = false;
        this.A0H = false;
        this.A0G = false;
        this.A0J = false;
        this.A01 = -1;
        this.A0R = c1080Wh;
        this.A0h = false;
        this.A0i = J8.A1e(this.A0R);
        this.A05 = m6;
        this.A0S = je;
        this.A0P = rr;
        this.A0T = new JL(this.A0P.A0Q(), this.A0S);
        this.A09 = c0792Lb;
        this.A09.setFunnelLoggingHandler(this.A0T);
        this.A0O = this.A0P.A0L().A01();
        this.A0N = new RelativeLayout(c1080Wh);
        this.A0d = new H2(this.A0R);
        this.A0c = new HS(this.A0R, this.A0T);
        C1C A0E = this.A0P.A0M().A0E();
        this.A0K = Math.min(A0E.A02(), A0E.A04());
        this.A09.setVolume(A0E.A09() ? 0.0f : 1.0f);
        this.A03 = new View(this.A0R);
        C0795Le.A0N(this.A03);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        layoutParams.addRule(13);
        this.A03.setLayoutParams(layoutParams);
        this.A0e = new Y4(this);
        this.A0f = new C0901Ph(this, 1, new WeakReference(this.A0e), c1080Wh);
        this.A0f.A0Y(250);
        this.A0W = new C7w(this.A0R, this.A0S, this.A09, this.A0P.A0Q());
        this.A07 = new C0871Od(this.A0R, this.A0S, this.A0P);
        this.A08 = new C0872Oe(this.A0R, new C1101Xc(), this.A0P.A0V(), this.A05);
        new AsyncTaskC1091Ws(this, c1080Wh).A08(A0E.A07());
        this.A09.setVideoProgressReportIntervalMs(rr.A0F());
        this.A09.getEventBus().A04(this.A0X, this.A0Y, this.A0a, this.A0Z, this.A0b);
        c1080Wh.A0A().A2q();
        this.A0U = new LS(this);
        this.A0U.A05(LR.A03);
    }

    public static /* synthetic */ C0901Ph A0E(C1118Xt c1118Xt) {
        return c1118Xt.A0f;
    }

    private void A0H() {
        C1080Wh c1080Wh = this.A0R;
        if (c1080Wh == null) {
            return;
        }
        FrameLayout frameLayout = new FrameLayout(c1080Wh);
        frameLayout.setLayoutParams(A0r);
        C0795Le.A0P(frameLayout, 1711276032);
        this.A0N.addView(frameLayout, 0);
    }

    public void A0I() {
        M6 m6 = this.A05;
        if (m6 == null) {
            return;
        }
        m6.A3s(EnumC0888Ou.A08.A02());
    }

    private void A0J() {
        NX nx = this.A06;
        if (nx != null) {
            nx.removeAllViews();
            this.A0N.removeView(this.A0d);
            NX nx2 = this.A06;
            nx2.setLayoutParams(nx2.A0C(this.A03));
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, C1165Zs.A0G);
            layoutParams.addRule(12);
            this.A0N.addView(this.A0d, layoutParams);
        }
    }

    private void A0K() {
        NX nx = this.A06;
        if (nx != null) {
            nx.removeAllViews();
            this.A0N.removeView(this.A0d);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, C1165Zs.A0H);
            layoutParams.setMargins(0, 0, 0, C1165Zs.A0I);
            this.A06.addView(this.A0d, layoutParams);
            NX nx2 = this.A06;
            nx2.setLayoutParams(nx2.A0C(this.A03));
        }
    }

    public void A0L() {
        this.A0I = true;
        C0795Le.A0X(this.A0N);
        C0792Lb c0792Lb = this.A09;
        if (c0792Lb != null) {
            c0792Lb.A0U();
            this.A09.setVisibility(4);
        }
        M1 m1 = this.A04;
        if (m1 == null) {
            return;
        }
        m1.setPageDetailsVisible(false);
        this.A04.setToolbarActionMode(0);
        this.A04.setToolbarActionMessage(A0F(0, 0, 87));
        C0795Le.A0d(this.A09, this.A0c, this.A0d);
        Pair<EnumC0870Oc, View> A03 = this.A07.A03(getCTAButton());
        this.A02 = (View) A03.second;
        int i = ML.A00[((EnumC0870Oc) A03.first).ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            C0795Le.A0d(this.A06);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            int i2 = A0q;
            layoutParams.setMargins(i2, i2, i2, i2);
            this.A0N.addView((View) A03.second, layoutParams);
            this.A0V.A06();
            return;
        }
        if (J8.A1M(this.A0R) && this.A06 != null) {
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
            NX nx = this.A06;
            RelativeLayout.LayoutParams screenshotParams = nx.A0B(this.A03);
            nx.setLayoutParams(screenshotParams);
            if (getResources().getConfiguration().orientation == 1) {
                layoutParams2.setMargins(0, this.A04.getToolbarHeight(), 0, A0n);
                layoutParams2.addRule(2, this.A06.getId());
            } else {
                int i3 = A0n;
                layoutParams2.setMargins(0, i3, 0, i3);
                layoutParams2.addRule(0, this.A03.getId());
            }
            this.A0N.addView((View) A03.second, layoutParams2);
        } else if (!this.A0i) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams3.setMargins(0, this.A04.getToolbarHeight(), 0, 0);
            this.A0N.addView((View) A03.second, layoutParams3);
            NX nx2 = this.A06;
            if (nx2 != null) {
                int id = nx2.getId();
                if (A0k[4].length() != 2) {
                    throw new RuntimeException();
                }
                String[] strArr = A0k;
                strArr[2] = "unAGmyqFwvprojiFSqdEJubKYqzfvtr5";
                strArr[2] = "unAGmyqFwvprojiFSqdEJubKYqzfvtr5";
                layoutParams3.addRule(2, id);
            }
        } else {
            this.A0N.addView((View) A03.second);
        }
        NX nx3 = this.A06;
        if (nx3 != null) {
            nx3.setVisibility(0);
            this.A06.A0E(true);
        }
        A0Q();
        this.A0V.A06();
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x017b, code lost:
        if (r4 != false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A0M() {
        int A03;
        C0792Lb c0792Lb = this.A09;
        if (c0792Lb == null || this.A0R == null) {
            return;
        }
        c0792Lb.A0U();
        this.A09.A0Z(new C7R(this.A0R));
        this.A09.A0Z(this.A0c);
        this.A09.A0Z(this.A0d);
        this.A0D = new C7B(this.A0R, true, this.A0T);
        View view = new View(this.A0R);
        view.setLayoutParams(A0r);
        C0795Le.A0P(view, 1711276032);
        HU mOverlayFadeablePlugin = new HU(view, P4.A03, true);
        this.A09.addView(view);
        this.A09.A0Z(mOverlayFadeablePlugin);
        HU hu = new HU(this.A0D, P4.A03, true);
        this.A09.A0Z(this.A0D);
        this.A09.A0Z(hu);
        this.A00 = C0795Le.A03(this.A0R);
        boolean z = this.A07.A04() == EnumC0870Oc.A04 && this.A00 == 2 && this.A0i;
        if (J8.A1M(this.A0R)) {
            this.A06 = new C1165Zs(this.A0R, A0m, this.A0O, EnumC0888Ou.A04.A02(), this.A0S, this.A05, this.A0f, this.A0V);
        } else if (!this.A0h) {
            this.A06 = new C0851Nj(this.A0R, A0m, this.A0O, this.A0S, this.A05, this.A07.A04() == EnumC0870Oc.A03 || z, this.A07.A04() == EnumC0870Oc.A03, this.A0f, this.A0V, this.A0i);
            this.A0C = new HU(this.A06, P4.A03, true);
            C0792Lb c0792Lb2 = this.A09;
            HU fadeableTouchPlayPausePlugin = this.A0C;
            c0792Lb2.A0Z(fadeableTouchPlayPausePlugin);
        } else {
            this.A06 = new C1082Wj(this.A0R, A0m, this.A0P.A0M().A0F().A00() == C1E.A05, this.A0O, EnumC0888Ou.A04.A02(), this.A0S, this.A05, this.A0f, this.A0V, this.A0i);
            this.A0F = new C0674Gg(this.A06, 400, 100, 0);
            A0U();
            this.A0F.A3O(true, false);
        }
        this.A06.setInfo(this.A0P.A0M().A0F(), this.A0P.A0M().A0G(), this.A0P.A0Q(), this.A0P.A0O().A01(), null);
        if (J8.A1Q(this.A0R)) {
            this.A04 = new C1162Zn(this.A0R, this.A05, this.A0T, 4, 2);
        } else {
            this.A04 = new FullScreenAdToolbar(this.A0R, this.A05, this.A0T, 1, this.A0P.A0E());
        }
        C1C A0E = this.A0P.A0M().A0E();
        if (A0k[2].charAt(24) == 'V') {
            throw new RuntimeException();
        }
        String[] strArr = A0k;
        strArr[0] = "ojxzoF4PDWiV84DGFs6AtBM1F0eVuyGg";
        strArr[7] = "alduKPjTMh6rkwAuCUpPOV1JaeST9WCN";
        if (A0E.A03() < 0) {
            A03 = this.A0P.A0M().A0E().A04();
        } else {
            A03 = this.A0P.A0M().A0E().A03();
        }
        this.A01 = A03;
        this.A04.setPageDetails(this.A0P.A0O(), this.A0P.A0Q(), this.A01, this.A0P.A0P());
        if (this.A0P.A0M().A0E().A03() < 0) {
            this.A04.setToolbarActionMode(4);
        }
        if (this.A07.A04() == EnumC0870Oc.A03) {
            boolean z2 = this.A0h;
            if (A0k[2].charAt(24) == 'V') {
                throw new RuntimeException();
            }
            String[] strArr2 = A0k;
            strArr2[1] = "6yYw8";
            strArr2[1] = "6yYw8";
        }
        this.A04.setPageDetailsVisible(false);
        this.A04.setToolbarListener(new Y8(this));
    }

    public void A0N() {
        String A07;
        if (J8.A1Q(this.A0R)) {
            this.A04.A06(this);
            return;
        }
        RewardData A0K = this.A0P.A0K();
        if (A0K == null) {
            A07 = this.A0P.A0N().A06();
        } else {
            A07 = this.A0P.A0N().A07(A0K.getCurrency(), A0K.getQuantity());
        }
        MF mf = new MF(this.A0R, -1, sr.t, A07, null, this.A0P.A0N().A05(), this.A0P.A0N().A04(), C0804Ln.A00(EnumC0803Lm.REWARD_ICON));
        mf.A02.setOnClickListener(new MJ(this, mf));
        mf.A01.setOnClickListener(new MK(this, mf));
        C0795Le.A0K(this.A0N);
        C0795Le.A0K(this.A04);
        C0795Le.A0P(mf, 1711276032);
        mf.setClickable(true);
        C0792Lb c0792Lb = this.A09;
        if (c0792Lb != null && !c0792Lb.A0g()) {
            this.A09.A0c(false, false, 16);
        }
        addView(mf, new RelativeLayout.LayoutParams(-1, -1));
        mf.bringToFront();
    }

    private void A0O() {
        if (this.A0P.A0M().A0O() && this.A05 != null) {
            OH A0B = new OF(this.A0R, this.A0P.A0M().A0F(), this.A0P.A0O()).A08(this.A0P.A0L().A01()).A0B();
            JN.A04(A0B, this.A0T, JK.A0U);
            this.A05.A3K(A0B, 1, A0r);
            A0B.bringToFront();
            A0B.A04(new Y0(this));
            this.A0R.A0A().A2b();
        }
    }

    public void A0P() {
        C0792Lb c0792Lb = this.A09;
        if (c0792Lb == null) {
            return;
        }
        c0792Lb.A0Y(EnumC0886Os.A03, 22);
        postDelayed(new Y9(this), J8.A0I(getContext()));
    }

    private void A0Q() {
        C0871Od c0871Od;
        if (this.A0i && this.A02 != null && (c0871Od = this.A07) != null && c0871Od.A04() == EnumC0870Oc.A04) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            boolean z = this.A00 == 2;
            layoutParams.setMargins(0, !z ? getToolbarHeight() : A0n, 0, !z ? 0 : A0n);
            NW nw = (NW) ((ES) this.A02).getAdapter();
            nw.A08();
            int i = this.A00;
            boolean isLandscape = this.A0i;
            nw.A0G(i, isLandscape);
            NX nx = this.A06;
            if (nx != null) {
                if (z) {
                    nx.A0D(this.A00);
                } else {
                    int id = nx.getId();
                    String[] strArr = A0k;
                    if (strArr[5].charAt(31) == strArr[3].charAt(31)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0k;
                    strArr2[0] = "LwDo8VVUwsuJrlNU8QrzJ41vhXhK4VzE";
                    strArr2[7] = "9aOkUkxqZvQgWgLWjLrmfK9aYM0kVuqh";
                    layoutParams.addRule(2, id);
                }
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(!z ? -1 : A0l, z ? -1 : -2);
                layoutParams2.addRule(12);
                NX nx2 = this.A06;
                int i2 = A0q;
                int toolbarHeight = !z ? i2 : getToolbarHeight() + i2;
                int i3 = A0q;
                nx2.setPadding(i2, toolbarHeight, i3, i3);
                this.A06.setLayoutParams(layoutParams2);
            }
            this.A02.setLayoutParams(layoutParams);
            this.A02.setOverScrollMode(2);
        }
    }

    public void A0R() {
        this.A0c.setVisibility(this.A0g.get() ? 0 : 8);
        this.A0c.A0A();
    }

    private final void A0U() {
        if (this.A06 == null) {
            return;
        }
        this.A0B = new C0702Hi(true);
        C0679Gl c0679Gl = this.A0E;
        if (c0679Gl != null) {
            this.A0B.A0J(c0679Gl);
        }
        C1H A01 = this.A0P.A0L().A01();
        this.A0B.A0J(new C0675Gh(this.A06.getCTAButton(), 300, A01.A08(true), -14934495));
        this.A0B.A0J(new C0680Gm(this.A06.getCTAButton(), 300, C0795Le.A09(A0t, A0u, A0s), C0795Le.A06(A01.A08(true), A0s)));
        this.A0B.A0J(new C0676Gi(this.A06.getExpandableLayout(), IronSourceConstants.REWARDED_VIDEO_DAILY_CAPPED, false));
        this.A0B.A0I(IronSourceConstants.IS_AUCTION_FAILED);
        this.A0B.A7s(this.A09);
    }

    private final void A0V() {
        C0792Lb c0792Lb = this.A09;
        if (c0792Lb != null) {
            c0792Lb.A0W(2);
            this.A09.A0S();
        }
        C0901Ph c0901Ph = this.A0f;
        if (c0901Ph != null) {
            c0901Ph.A0X();
        }
    }

    public static /* synthetic */ void A0b(C1118Xt c1118Xt, C7v c7v) {
        c1118Xt.A0d(c7v);
    }

    public static /* synthetic */ void A0c(C1118Xt c1118Xt, String str) {
        c1118Xt.A0e(str);
    }

    public void A0d(C7v c7v) {
        if (this.A0I) {
            return;
        }
        this.A08.A06();
        A0L();
        M6 m6 = this.A05;
        if (m6 != null) {
            m6.A3t(EnumC0888Ou.A06.A02(), c7v);
        }
    }

    public void A0e(String str) {
        this.A0R.A0A().A2r(str);
        int i = 0;
        int i2 = 0;
        C0792Lb c0792Lb = this.A09;
        if (c0792Lb != null) {
            i = c0792Lb.getCurrentPositionInMillis();
            i2 = this.A09.getDuration();
        }
        A0V();
        this.A0R.A04().A82(A0F(0, 5, 84), C04848i.A2B, new C04858j(str));
        if (J8.A0x(this.A0R)) {
            A0d(new C7v(i, i2));
            return;
        }
        M6 m6 = this.A05;
        if (m6 == null) {
            return;
        }
        m6.A3s(EnumC0888Ou.A09.A02());
    }

    public boolean A0f() {
        C0792Lb c0792Lb = this.A09;
        return c0792Lb != null && c0792Lb.getCurrentPositionInMillis() / 1000 >= this.A0P.A0M().A0E().A02();
    }

    public static /* synthetic */ boolean A0k(C1118Xt c1118Xt) {
        return c1118Xt.A0J;
    }

    public static /* synthetic */ boolean A0m(C1118Xt c1118Xt, boolean z) {
        c1118Xt.A0J = z;
        return z;
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void A7r(Intent intent, Bundle bundle, AnonymousClass51 anonymousClass51) {
        if (this.A09 != null) {
            M6 m6 = this.A05;
            if (A0k[2].charAt(24) == 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A0k;
            strArr[0] = "e6V6RqcsweZ5TPTb9FgQuQ0pryALZ0j5";
            strArr[7] = "lv4Tf42JMHAUVPcypCqljFxIq3tnjr4p";
            if (m6 == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 19) {
                this.A0U.A05(LR.A04);
            }
            A0M();
            anonymousClass51.A0L(this.A0Q);
            this.A09.setVideoURI(new C7H(this.A0R).A0M(this.A0P.A0M().A0E().A08()));
            setUpContentLayoutForVideo(anonymousClass51.A0I().getResources().getConfiguration().orientation);
            addView(this.A0N, A0r);
            M1 m1 = this.A04;
            if (m1 != null) {
                C0795Le.A0N(m1);
                this.A04.A05(this.A0O, true);
                addView(this.A04, new RelativeLayout.LayoutParams(-1, this.A04.getToolbarHeight()));
            }
            this.A05.A3K(this, 0, A0r);
            A0O();
            postDelayed(new Y1(this), J8.A0J(getContext()));
        }
    }

    @Override // com.facebook.ads.redexgen.X.MQ
    public final void A8o() {
        C0792Lb c0792Lb = this.A09;
        if (c0792Lb != null) {
            EnumC0886Os enumC0886Os = EnumC0886Os.A03;
            if (A0k[6].charAt(1) != 'j') {
                throw new RuntimeException();
            }
            String[] strArr = A0k;
            strArr[6] = "Tj2Tj3snk4deQrW2TFaqKUqYHOA0aFA3";
            strArr[6] = "Tj2Tj3snk4deQrW2TFaqKUqYHOA0aFA3";
            c0792Lb.A0Y(enumC0886Os, 23);
        }
    }

    @Override // com.facebook.ads.redexgen.X.MQ
    public final void A8p() {
        A0L();
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void AAO(boolean z) {
        C0792Lb c0792Lb = this.A09;
        if (c0792Lb == null || c0792Lb.A0f()) {
            return;
        }
        this.A0A = this.A09.getVideoStartReason();
        this.A0H = z;
        C0792Lb c0792Lb2 = this.A09;
        if (A0k[1].length() != 5) {
            throw new RuntimeException();
        }
        String[] strArr = A0k;
        strArr[4] = "af";
        strArr[4] = "af";
        c0792Lb2.A0b(false, 14);
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void AAl(boolean z) {
        C0792Lb c0792Lb = this.A09;
        if (c0792Lb == null || c0792Lb.A0g() || this.A0I || this.A09.getState() == EnumC0898Pe.A06 || this.A0A == null) {
            return;
        }
        if (!this.A0H || z) {
            C0792Lb c0792Lb2 = this.A09;
            String[] strArr = A0k;
            if (strArr[0].charAt(9) == strArr[7].charAt(9)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0k;
            strArr2[1] = "7lFur";
            strArr2[1] = "7lFur";
            c0792Lb2.A0Y(this.A0A, 21);
        }
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void ACg(Bundle bundle) {
    }

    @Nullable
    private View$OnClickListenerC1087Wo getCTAButton() {
        if (this.A05 == null) {
            return null;
        }
        View$OnClickListenerC1087Wo view$OnClickListenerC1087Wo = new View$OnClickListenerC1087Wo(this.A0R, EnumC0888Ou.A04.A02(), this.A0O, this.A0S, this.A05, this.A0f, this.A0V);
        view$OnClickListenerC1087Wo.setRoundedCornersEnabled(true);
        view$OnClickListenerC1087Wo.setViewShowsOverMedia(true);
        C0795Le.A0J(1001, view$OnClickListenerC1087Wo);
        view$OnClickListenerC1087Wo.setCta(this.A0P.A0M().A0G(), this.A0P.A0Q(), new HashMap());
        return view$OnClickListenerC1087Wo;
    }

    private int getToolbarHeight() {
        M1 m1 = this.A04;
        return m1 == null ? M1.A00 : m1.getToolbarHeight();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        C0679Gl c0679Gl;
        if (J8.A1M(this.A0R) && this.A06 != null) {
            boolean z = configuration.orientation == 1;
            if (this.A02 != null && this.A04 != null) {
                this.A06.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                NX nx = this.A06;
                nx.setLayoutParams(nx.A0B(this.A03));
                if (z) {
                    layoutParams.setMargins(0, this.A04.getToolbarHeight(), 0, A0n);
                    layoutParams.addRule(2, this.A06.getId());
                } else {
                    int i = A0n;
                    layoutParams.setMargins(0, i, 0, i);
                    layoutParams.addRule(0, this.A03.getId());
                }
                this.A02.setLayoutParams(layoutParams);
            } else if (this.A09 != null) {
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                if (z) {
                    A0K();
                    layoutParams2.addRule(13);
                } else {
                    A0J();
                    layoutParams2.addRule(0, this.A03.getId());
                    layoutParams2.setMargins(0, 0, 0, 0);
                }
                this.A09.setLayoutParams(layoutParams2);
            }
        } else {
            NX nx2 = this.A06;
            if (A0k[1].length() != 5) {
                throw new RuntimeException();
            }
            String[] strArr = A0k;
            strArr[2] = "taNSjGkhdG2DcrPTICkef1XKgKxpKPDd";
            strArr[2] = "taNSjGkhdG2DcrPTICkef1XKgKxpKPDd";
            if (nx2 != null) {
                nx2.A0D(configuration.orientation);
                if (this.A0h && (c0679Gl = this.A0E) != null) {
                    c0679Gl.A09(this.A06.A09(configuration.orientation));
                }
            }
        }
        this.A00 = configuration.orientation;
        A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.M7
    public final void onDestroy() {
        this.A0U.A03();
        A0V();
        C0792Lb c0792Lb = this.A09;
        if (c0792Lb != null) {
            c0792Lb.getEventBus().A05(this.A0X, this.A0Y, this.A0a, this.A0Z, this.A0b);
        }
        if (!TextUtils.isEmpty(this.A0P.A0Q())) {
            this.A0S.A80(this.A0P.A0Q(), new NU().A04(this.A0f).A03(this.A0V).A06());
        }
        M1 m1 = this.A04;
        if (m1 != null) {
            m1.setToolbarListener(null);
        }
        this.A0W.A0h();
        this.A09 = null;
        this.A06 = null;
        this.A0C = null;
        this.A05 = null;
        this.A0d.A09();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0V.A07(motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View expandableLayout = this.A06.getExpandableLayout();
        if (expandableLayout != null && this.A0h && z && this.A0E == null) {
            this.A0E = new C0679Gl(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A0B.A0J(this.A0E);
            this.A0B.A0H();
        }
    }

    public void setListener(M6 m6) {
    }

    @VisibleForTesting
    public void setServerSideRewardHandler(C0872Oe c0872Oe) {
        this.A08 = c0872Oe;
    }

    private void setUpContentLayoutForVideo(int i) {
        this.A0N.removeAllViews();
        A0H();
        if (this.A06 != null) {
            C1080Wh c1080Wh = this.A0R;
            if (A0k[2].charAt(24) == 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A0k;
            strArr[5] = "4i2csOaoNdqQlmOU4oeneSGIvSddu1uE";
            strArr[3] = "nuT450uQsQsD47HYSiniJ05GRT2hP0Qn";
            if (J8.A1M(c1080Wh)) {
                this.A0N.addView(this.A03);
                this.A0d.A0A(-1, A0t);
                if (i == 1) {
                    A0K();
                    this.A0N.addView(this.A09, A0r);
                } else {
                    A0J();
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams.addRule(0, this.A03.getId());
                    layoutParams.setMargins(0, 0, 0, 0);
                    this.A0N.addView(this.A09, layoutParams);
                }
                this.A0N.addView(this.A06);
            } else {
                this.A0N.addView(this.A09, A0r);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(12);
                this.A06.A0E(false);
                C0795Le.A0N(this.A06);
                this.A06.A0D(i);
                NX nx = this.A06;
                int i2 = A0q;
                nx.setPadding(i2, i2, i2, i2);
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, this.A0h ? A0v : -2);
                if (this.A0h) {
                    int i3 = A0q;
                    layoutParams2.setMargins(i3, i3, i3, i3);
                    H2 h2 = this.A0d;
                    int i4 = A0w;
                    h2.setPadding(i4, i4, i4, i4);
                    this.A0d.A0A(-1, A0t);
                }
                layoutParams3.addRule(12);
                this.A0N.addView(this.A0d, layoutParams3);
                this.A0N.addView(this.A06, layoutParams2);
            }
        }
        int i5 = A0p;
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(i5, i5);
        layoutParams4.addRule(10);
        layoutParams4.addRule(11);
        int i6 = A0n;
        layoutParams4.setMargins(i6, getToolbarHeight() + i6, A0n, A0o);
        this.A0N.addView(this.A0c, layoutParams4);
        A0R();
    }
}