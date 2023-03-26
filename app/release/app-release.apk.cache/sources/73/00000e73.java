package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.50  reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class AnonymousClass50 implements View.OnLongClickListener {
    public final /* synthetic */ AnonymousClass51 A00;

    public AnonymousClass50(AnonymousClass51 anonymousClass51) {
        this.A00 = anonymousClass51;
    }

    public /* synthetic */ AnonymousClass50(AnonymousClass51 anonymousClass51, C04054x c04054x) {
        this(anonymousClass51);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (AnonymousClass51.A02(this.A00) != null && AnonymousClass51.A00(this.A00) != null) {
            AnonymousClass51.A02(this.A00).setBounds(0, 0, AnonymousClass51.A00(this.A00).getWidth(), AnonymousClass51.A00(this.A00).getHeight());
            AnonymousClass51.A02(this.A00).A0E(!AnonymousClass51.A02(this.A00).A0F());
        }
        return true;
    }
}