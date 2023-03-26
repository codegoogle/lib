package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;
import android.view.animation.AlphaAnimation;
import com.facebook.ads.internal.api.BuildConfigApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.4H  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4H extends AbstractC1175a2<C0901Ph> implements C8F {
    public static String[] A02;
    public C1080Wh A00;
    public boolean A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"iVby5wy6H7l4dzY0Hld0xs9tuHtnGk", "Nr0U5YnFPaRVMsCPPiWFbDdqiRS3TX59", "NmHEOi9mcJk9OQjZmIqLk3AYwOx5ICK3", "j6OxXppfxNxejmkkIb10P2S2ED13bfax", "YxA", "okdCTGqDBxOQkU", "XAA3rxsPdfTGxXL8JCFSxOB2RupP9g", "Mu"};
    }

    public C4H(C0901Ph c0901Ph, C1080Wh c1080Wh) {
        super(c0901Ph);
        this.A00 = c1080Wh;
        this.A01 = false;
    }

    private void A01(int i) {
        if (!this.A01) {
            this.A00.A0A().A3C(i);
        }
        String[] strArr = A02;
        if (strArr[0].length() != strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "k6Oe58jhR2JQ133LIP7LsY5lW6eco9l5";
        strArr2[1] = "k6Oe58jhR2JQ133LIP7LsY5lW6eco9l5";
        this.A01 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0068, code lost:
        if (r0 == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void A07() {
        View view;
        WeakReference weakReference;
        boolean viewIsNull;
        int i;
        int i2;
        int i3;
        C0902Pi c0902Pi;
        boolean z;
        Map map;
        Map map2;
        boolean viewIsNull2;
        boolean viewIsNull3;
        boolean viewIsNull4;
        AbstractRunnableC0770Kc abstractRunnableC0770Kc;
        Handler handler;
        AbstractRunnableC0770Kc abstractRunnableC0770Kc2;
        int i4;
        boolean viewIsNull5;
        boolean viewIsNull6;
        Map map3;
        C0902Pi c0902Pi2;
        C0901Ph A08 = A08();
        int i5 = 0;
        if (A08 == null) {
            A01(0);
            return;
        }
        view = A08.A0C;
        weakReference = A08.A0E;
        AbstractC0900Pg abstractC0900Pg = (AbstractC0900Pg) weakReference.get();
        int i6 = 1;
        boolean z2 = view == null;
        if (!z2 && abstractC0900Pg != null) {
            i = A08.A0A;
            C0902Pi A0E = C0901Ph.A0E(view, i, this.A00);
            boolean viewIsNull7 = A0E.A04();
            if (viewIsNull7) {
                C0901Ph.A05(A08);
            } else {
                A08.A00 = 0;
            }
            i2 = A08.A00;
            i3 = A08.A09;
            boolean z3 = i2 > i3;
            c0902Pi = A08.A05;
            if (c0902Pi != null) {
                c0902Pi2 = A08.A05;
                boolean viewIsNull8 = c0902Pi2.A04();
                if (viewIsNull8) {
                    z = true;
                    if (!z3) {
                        boolean viewIsNull9 = A0E.A04();
                    }
                    A08.A05 = A0E;
                    String valueOf = String.valueOf(A0E.A01());
                    synchronized (A08) {
                        map = A08.A06;
                        boolean viewIsNull10 = map.containsKey(valueOf);
                        if (viewIsNull10) {
                            map3 = A08.A06;
                            i5 = ((Integer) map3.get(valueOf)).intValue();
                        }
                        map2 = A08.A06;
                        map2.put(valueOf, Integer.valueOf(i5 + 1));
                    }
                    if (z3 && !z) {
                        this.A01 = true;
                        A08.A03 = System.currentTimeMillis();
                        viewIsNull5 = A08.A07;
                        if (viewIsNull5) {
                            this.A00.A0A().A3D();
                        }
                        abstractC0900Pg.A04();
                        boolean viewIsNull11 = BuildConfigApi.isDebug();
                        if (viewIsNull11) {
                            boolean viewIsNull12 = AdInternalSettings.isVisibleAnimation();
                            if (viewIsNull12) {
                                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                                alphaAnimation.setDuration(500L);
                                view.startAnimation(alphaAnimation);
                            }
                        }
                        viewIsNull6 = A08.A0F;
                        if (!viewIsNull6) {
                            return;
                        }
                    } else if (!z3 && z) {
                        this.A01 = true;
                        viewIsNull3 = A08.A07;
                        if (viewIsNull3) {
                            C0S A0A = this.A00.A0A();
                            C0R A022 = A0E.A02();
                            String resultCode = A02[1];
                            if (resultCode.charAt(31) == 'Y') {
                                throw new RuntimeException();
                            }
                            String[] strArr = A02;
                            strArr[0] = "aqGg3VLISO1RonzxWpaMuFcsA6T1VU";
                            strArr[6] = "xPzVxhTd5JHIqZhWukTWbX9dZKpXQ5";
                            A0A.A2i(A022);
                        }
                        abstractC0900Pg.A02();
                    } else {
                        abstractC0900Pg.A03();
                        boolean viewIsNull13 = this.A01;
                        if (!viewIsNull13) {
                            viewIsNull2 = A08.A07;
                            if (viewIsNull2) {
                                this.A00.A0A().A3B(A0E.A02());
                            }
                        }
                        this.A01 = true;
                    }
                    viewIsNull4 = A08.A08;
                    if (viewIsNull4) {
                        return;
                    }
                    abstractRunnableC0770Kc = A08.A04;
                    if (abstractRunnableC0770Kc == null) {
                        return;
                    }
                    handler = A08.A0B;
                    abstractRunnableC0770Kc2 = A08.A04;
                    i4 = A08.A02;
                    handler.postDelayed(abstractRunnableC0770Kc2, i4);
                    return;
                }
            }
            z = false;
            if (!z3) {
            }
            A08.A05 = A0E;
            String valueOf2 = String.valueOf(A0E.A01());
            synchronized (A08) {
            }
        } else {
            viewIsNull = A08.A07;
            if (viewIsNull) {
                if (!z2) {
                    i6 = 2;
                }
                A01(i6);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8F
    public final C1080Wh A5G() {
        return this.A00;
    }
}