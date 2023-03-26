package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class NW extends AnonymousClass43<C0826Mj> {
    public static final int A05 = (int) (C0795Le.A01 * 250.0f);
    public int A00 = 0;
    public boolean A01 = false;
    public final int A02;
    public final C1080Wh A03;
    public final List<String> A04;

    public NW(C1080Wh c1080Wh, List<String> list, int i) {
        this.A04 = list;
        this.A02 = i;
        this.A03 = c1080Wh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    /* renamed from: A01 */
    public final C0826Mj A07(ViewGroup viewGroup, int i) {
        return new C0826Mj(new NG(this.A03));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    /* renamed from: A02 */
    public final void A0F(C0826Mj c0826Mj, int startSpacing) {
        int i;
        int i2;
        String str = this.A04.get(startSpacing);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        if (this.A00 == 2 && this.A01) {
            i = A05;
        } else {
            int leftMargin = this.A02;
            i = leftMargin * 4;
        }
        if (startSpacing != 0) {
            i = this.A02;
        }
        int leftMargin2 = A0E();
        if (startSpacing >= leftMargin2 - 1) {
            int leftMargin3 = this.A02;
            i2 = leftMargin3 * 4;
        } else {
            i2 = this.A02;
        }
        marginLayoutParams.setMargins(i, 0, i2, 0);
        c0826Mj.A0m().setLayoutParams(marginLayoutParams);
        c0826Mj.A0m().A00(str);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    public final int A0E() {
        return this.A04.size();
    }

    public final void A0G(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }
}