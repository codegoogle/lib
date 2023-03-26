package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public class NZ implements DialogInterface.OnClickListener {
    public final /* synthetic */ C0843Nb A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ Map A02;

    public NZ(C0843Nb c0843Nb, String str, Map map) {
        this.A00 = c0843Nb;
        this.A01 = str;
        this.A02 = map;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        JE je;
        je = this.A00.A04;
        je.A8L(this.A01, this.A02);
    }
}