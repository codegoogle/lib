package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.facebook.proguard.annotations.DoNotStrip;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public abstract class RP extends AnonymousClass43<C1155Zf> {
    public static final int A05 = (int) (C0795Le.A01 * 4.0f);
    @Nullable
    public AnonymousClass15 A00;
    public final List<C1267bZ> A01;
    public final int A02;
    public final C1080Wh A03;
    @DoNotStrip
    public final AbstractC0900Pg A04 = new RN(this);

    public RP(C1U c1u, List<C1267bZ> list, C1080Wh c1080Wh) {
        this.A03 = c1080Wh;
        this.A02 = c1u.getChildSpacing();
        this.A01 = list;
    }

    private ViewGroup.MarginLayoutParams A04(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int i2 = this.A02;
        if (i == 0) {
            i2 *= 2;
        }
        marginLayoutParams.setMargins(i2, 0, i >= this.A01.size() + (-1) ? this.A02 * 2 : this.A02, 0);
        return marginLayoutParams;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    public final int A0E() {
        return this.A01.size();
    }

    public final void A0G(ImageView imageView, int i) {
        C1267bZ c1267bZ = this.A01.get(i);
        JZ adCoverImage = c1267bZ.getAdCoverImage();
        if (adCoverImage != null) {
            AsyncTaskC1091Ws A052 = new AsyncTaskC1091Ws(imageView, this.A03).A05();
            A052.A07(new RO(this, i, c1267bZ));
            A052.A08(adCoverImage.getUrl());
        }
    }

    public final void A0H(AnonymousClass15 anonymousClass15) {
        this.A00 = anonymousClass15;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass43
    /* renamed from: A0I */
    public void A0F(C1155Zf c1155Zf, int i) {
        c1155Zf.A0m().setLayoutParams(A04(i));
    }
}