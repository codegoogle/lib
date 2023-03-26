package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Zz  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1172Zz extends AbstractRunnableC0770Kc {
    public static String[] A02;
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ DialogInterface$OnClickListenerC0808Lr A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"r", "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    }

    public C1172Zz(DialogInterface$OnClickListenerC0808Lr dialogInterface$OnClickListenerC0808Lr, DialogInterface dialogInterface) {
        this.A01 = dialogInterface$OnClickListenerC0808Lr;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0770Kc
    public final void A07() {
        InterfaceC0906Pm interfaceC0906Pm;
        InterfaceC0906Pm interfaceC0906Pm2;
        Map<? extends String, ? extends String> A03;
        interfaceC0906Pm = this.A01.A01.A01;
        if (interfaceC0906Pm != null) {
            interfaceC0906Pm2 = this.A01.A01.A01;
            String A01 = KJ.A01();
            Q0 q0 = new Q0();
            A03 = this.A01.A01.A03(this.A01.A00.getText().toString());
            interfaceC0906Pm2.ABd(A01, q0.A06(A03).A09());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[6] = "1hADnGgCLejuT";
        strArr[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}