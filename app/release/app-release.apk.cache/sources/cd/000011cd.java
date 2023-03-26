package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class JX implements DialogInterface.OnClickListener {
    public final /* synthetic */ View$OnClickListenerC1265bX A00;

    public JX(View$OnClickListenerC1265bX view$OnClickListenerC1265bX) {
        this.A00 = view$OnClickListenerC1265bX;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Map<String, String> A01;
        if (this.A00.A01.A0W != null) {
            RG rg = this.A00.A01.A0W;
            A01 = this.A00.A01();
            rg.A0c(A01);
        }
    }
}