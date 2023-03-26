package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ev  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0639Ev extends RP {
    public final C1080Wh A00;

    public C0639Ev(C1U c1u, List<C1267bZ> list, C1080Wh c1080Wh) {
        super(c1u, list, c1080Wh);
        this.A00 = c1080Wh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    /* renamed from: A01 */
    public final C1155Zf A07(ViewGroup viewGroup, int i) {
        return new C1155Zf(new MC(this.A00));
    }

    @Override // com.facebook.ads.redexgen.X.RP, com.facebook.ads.redexgen.X.AnonymousClass43
    /* renamed from: A0I */
    public final void A0F(C1155Zf c1155Zf, int i) {
        super.A0F(c1155Zf, i);
        MC mc = (MC) c1155Zf.A0m();
        MR mr = (MR) mc.getImageCardView();
        mr.setImageDrawable(null);
        A0G(mr, i);
        C1267bZ c1267bZ = ((RP) this).A01.get(i);
        c1267bZ.A0x().A0D(this.A00);
        c1267bZ.A1H(mc, mc);
    }
}