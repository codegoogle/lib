package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.Sw */
/* loaded from: assets/audience_network.dex */
public final class C0991Sw extends AbstractC02950o {
    public static byte[] A03;
    public View A00;
    public final C04044w A01;
    public final C0591Cv A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-23, 7, 20, 20, 21, 26, -58, 22, 24, Flags.CD, 25, Flags.CD, 20, 26, -58, 20, 27, 18, 18, -58, 7, 10, -4, 15, Flags.CD, 29};
    }

    public C0991Sw(C04044w c04044w) {
        this.A02 = c04044w.A0A();
        this.A01 = c04044w;
    }

    public static /* synthetic */ View A00(C0991Sw c0991Sw) {
        return c0991Sw.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0B() {
        this.A02.A0A().A3e();
        KT.A00(new C0989Su(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0C() {
        this.A02.A0A().A3h();
        KT.A00(new C0990Sv(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0D(View view) {
        if (view != null) {
            this.A02.A0A().A3g();
            this.A00 = view;
            this.A01.A08().removeAllViews();
            this.A01.A08().addView(this.A00);
            if (this.A00 instanceof C1098Wz) {
                C0762Ju.A04(this.A01.A06(), this.A00, this.A01.A0B());
            }
            C0638Eu A09 = this.A01.A09();
            if (A09 != null) {
                A09.A0J();
            }
            KT.A00(new C0988St(this));
            C04044w c04044w = this.A01;
            c04044w.A0C(c04044w.A08(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && J8.A0q(this.A01.A08().getContext())) {
                final NS ns = new NS();
                this.A01.A0D(ns);
                ns.A0D(this.A01.getPlacementId());
                ns.A0C(this.A01.A08().getContext().getPackageName());
                if (this.A01.A09() != null && this.A01.A09().A0H() != null) {
                    ns.A0A(this.A01.A09().A0H().A0C());
                }
                View view2 = this.A00;
                if (view2 instanceof C1098Wz) {
                    ns.A0B(((C1098Wz) view2).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.55
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        if (C0991Sw.A00(C0991Sw.this) != null) {
                            ns.setBounds(0, 0, C0991Sw.A00(C0991Sw.this).getWidth(), C0991Sw.A00(C0991Sw.this).getHeight());
                            NS ns2 = ns;
                            ns2.A0E(!ns2.A0F());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(ns);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 113));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0E(InterfaceC02940n interfaceC02940n) {
        this.A02.A0A().A3f(this.A01.A09() != null);
        if (this.A01.A09() != null) {
            this.A01.A09().A0K();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC02950o
    public final void A0F(C0755Jm c0755Jm) {
        this.A02.A0A().A2d(LW.A01(this.A01.A05()), c0755Jm.A04().getErrorCode(), c0755Jm.A05());
        KT.A00(new C0987Ss(this, c0755Jm));
    }
}