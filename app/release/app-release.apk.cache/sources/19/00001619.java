package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.internal.api.AdNativeComponentView;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.bV  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1264bV extends AbstractC0900Pg {
    public static String[] A04;
    public final /* synthetic */ View A00;
    public final /* synthetic */ RG A01;
    public final /* synthetic */ C1267bZ A02;
    public final /* synthetic */ boolean A03;

    static {
        A00();
    }

    public static void A00() {
        A04 = new String[]{"GAoEIcB27NxBQq2JilxmgvZ", "N3uA7bVXcBxYB", "KVc1", "Ty0ubyi0O", "aKccOd3zXPku8XZmrzh", "TnCBFIxn", "RWUalmqogpnzugTp0dpef0CjO7Qk", "Qg3VhAoh"};
    }

    public C1264bV(C1267bZ c1267bZ, View view, boolean z, RG rg) {
        this.A02 = c1267bZ;
        this.A00 = view;
        this.A03 = z;
        this.A01 = rg;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0900Pg
    public final void A02() {
        C0753Jj c0753Jj;
        c0753Jj = this.A02.A0a;
        c0753Jj.A06();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0900Pg
    public final void A03() {
        C0753Jj c0753Jj;
        c0753Jj = this.A02.A0a;
        c0753Jj.A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0900Pg
    public final void A04() {
        C0753Jj c0753Jj;
        C0753Jj c0753Jj2;
        C1080Wh c1080Wh;
        C0901Ph c0901Ph;
        WeakReference weakReference;
        LX lx;
        C0753Jj c0753Jj3;
        LX lx2;
        C0753Jj c0753Jj4;
        RL rl;
        View view;
        View view2;
        RL rl2;
        View view3;
        RL rl3;
        View view4;
        RL rl4;
        EnumC0746Jc enumC0746Jc;
        RL rl5;
        boolean z;
        RL rl6;
        boolean z2;
        RL rl7;
        boolean z3;
        RL rl8;
        boolean A0m;
        RL rl9;
        EnumC03060z enumC03060z;
        RL rl10;
        boolean z4;
        RL rl11;
        NativeAdLayout nativeAdLayout;
        RL rl12;
        String str;
        RL rl13;
        RL rl14;
        WeakReference weakReference2;
        WeakReference weakReference3;
        Drawable loadedNativeBannerIconDrawable;
        C0901Ph c0901Ph2;
        C0753Jj c0753Jj5;
        C0901Ph c0901Ph3;
        C0753Jj c0753Jj6;
        C0901Ph c0901Ph4;
        C0753Jj c0753Jj7;
        c0753Jj = this.A02.A0a;
        c0753Jj.A0C();
        if (J8.A1C(this.A02.A0x())) {
            View view5 = this.A00;
            if (view5 instanceof AdNativeComponentView) {
                View adContentsView = ((AdNativeComponentView) view5).getAdContentsView();
                if ((adContentsView instanceof C0884Oq) && !((C0884Oq) adContentsView).A04(1)) {
                    c0901Ph4 = this.A02.A0N;
                    c0901Ph4.A0V();
                    c0753Jj7 = this.A02.A0a;
                    c0753Jj7.A08();
                    return;
                }
            }
        }
        if (J8.A1D(this.A02.A0x())) {
            View view6 = this.A00;
            if (view6 instanceof AdNativeComponentView) {
                View adContentsView2 = ((AdNativeComponentView) view6).getAdContentsView();
                if ((adContentsView2 instanceof C0884Oq) && !((C0884Oq) adContentsView2).A03()) {
                    c0901Ph3 = this.A02.A0N;
                    c0901Ph3.A0V();
                    c0753Jj6 = this.A02.A0a;
                    c0753Jj6.A09();
                    return;
                }
            }
        }
        if (this.A03) {
            ImageView imageView = (ImageView) this.A00;
            loadedNativeBannerIconDrawable = this.A02.A01;
            if (loadedNativeBannerIconDrawable != null) {
                C1267bZ.A0Z(loadedNativeBannerIconDrawable, imageView);
            } else {
                c0901Ph2 = this.A02.A0N;
                c0901Ph2.A0V();
                c0753Jj5 = this.A02.A0a;
                c0753Jj5.A07();
                return;
            }
        }
        c0753Jj2 = this.A02.A0a;
        c1080Wh = this.A02.A0Y;
        c0753Jj2.A0D(c1080Wh, this.A01.A0R());
        c0901Ph = this.A02.A0N;
        c0901Ph.A0X();
        weakReference = this.A02.A0R;
        if (weakReference != null) {
            weakReference2 = this.A02.A0R;
            if (weakReference2.get() != null) {
                weakReference3 = this.A02.A0R;
                ((AbstractC0900Pg) weakReference3.get()).A04();
            }
        }
        lx = this.A02.A0b;
        boolean A08 = lx.A08();
        String[] strArr = A04;
        if (strArr[7].length() != strArr[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[3] = "ObY5yVnvL";
        strArr2[6] = "nKkzkW33vKK1X7mwQY6aSKGZ9X8E";
        if (A08) {
            c0753Jj3 = this.A02.A0a;
            c0753Jj3.A04();
            return;
        }
        lx2 = this.A02.A0b;
        lx2.A06();
        c0753Jj4 = this.A02.A0a;
        c0753Jj4.A05();
        rl = this.A02.A08;
        if (rl == null) {
            return;
        }
        view = this.A02.A03;
        if (view == null) {
            return;
        }
        view2 = this.A02.A05;
        String[] strArr3 = A04;
        if (strArr3[7].length() != strArr3[5].length()) {
            throw new RuntimeException();
        }
        String[] strArr4 = A04;
        strArr4[1] = "Gfe1v0LlPkpmg";
        strArr4[1] = "Gfe1v0LlPkpmg";
        if (view2 == null) {
            return;
        }
        rl2 = this.A02.A08;
        view3 = this.A02.A03;
        rl2.A09(view3);
        rl3 = this.A02.A08;
        view4 = this.A02.A05;
        rl3.A08(view4);
        rl4 = this.A02.A08;
        enumC0746Jc = this.A02.A0H;
        rl4.A0C(enumC0746Jc);
        rl5 = this.A02.A08;
        z = this.A02.A0S;
        rl5.A0F(z);
        rl6 = this.A02.A08;
        z2 = this.A02.A0V;
        rl6.A0J(z2);
        rl7 = this.A02.A08;
        z3 = this.A02.A0U;
        rl7.A0I(z3);
        rl8 = this.A02.A08;
        A0m = this.A02.A0m();
        rl8.A0G(A0m);
        rl9 = this.A02.A08;
        enumC03060z = this.A02.A07;
        rl9.A0A(enumC03060z);
        rl10 = this.A02.A08;
        z4 = this.A02.A0T;
        rl10.A0H(z4);
        rl11 = this.A02.A08;
        nativeAdLayout = this.A02.A06;
        rl11.A0B(C0824Mh.A00(nativeAdLayout));
        rl12 = this.A02.A08;
        str = this.A02.A0O;
        rl12.A0D(str);
        rl13 = this.A02.A08;
        rl13.A0K(this.A03);
        rl14 = this.A02.A08;
        rl14.A03();
    }
}