package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public class TB implements C5J {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C5L A01;
    public final /* synthetic */ C1267bZ A02;

    public TB(C5L c5l, ImageView imageView, C1267bZ c1267bZ) {
        this.A01 = c5l;
        this.A00 = imageView;
        this.A02 = c1267bZ;
    }

    @Override // com.facebook.ads.redexgen.X.C5J
    public final void A9h(@Nullable Drawable drawable) {
        C1267bZ.A0Z(drawable, this.A00);
        this.A02.A1E(drawable);
    }
}