package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ly  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0815Ly implements View.OnClickListener {
    public final /* synthetic */ C1Q A00;
    public final /* synthetic */ JL A01;
    public final /* synthetic */ C0816Lz A02;
    public final /* synthetic */ M6 A03;
    public final /* synthetic */ String A04;

    public View$OnClickListenerC0815Ly(C0816Lz c0816Lz, JL jl, M6 m6, String str, C1Q c1q) {
        this.A02 = c0816Lz;
        this.A01 = jl;
        this.A03 = m6;
        this.A04 = str;
        this.A00 = c1q;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1080Wh c1080Wh;
        C1080Wh c1080Wh2;
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A01.A03(JK.A0A, null);
            c1080Wh = this.A02.A02;
            if (AnonymousClass23.A0Q(c1080Wh.A00(), true)) {
                this.A03.A7n(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                Kw kw = new Kw();
                c1080Wh2 = this.A02.A02;
                Kw.A09(kw, c1080Wh2, Uri.parse(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }
}