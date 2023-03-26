package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Nu  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0862Nu implements View.OnClickListener {
    public static String[] A01;
    public final /* synthetic */ C05029a A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"c2PEJ6DOqpui9EPvmckbHNLd48C", "0LubsyKGJKKePfKATMceGef14XY86Ri5", "M6oVByKNfKe8LZIrCewzhyGONHgeYcNo", "g1oo9eCM7RcmOvTxZ1VejNMrbdbCR0G4", "3al8rHdAj04D", "Lmo63BJo3ocNRJpk0", "u0Zxd4kfnWeayuGPbNnNq6ZbpiAglx3D", "JRUzdnx3lrNIQCskW6e2Avl8V"};
    }

    public View$OnClickListenerC0862Nu(C05029a c05029a) {
        this.A00 = c05029a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A07 = false;
            this.A00.A0C();
        } catch (Throwable th) {
            if (A01[3].charAt(5) != 'e') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "oQ6hKoRa6K50vxrlE5lU8mLQHveYoJVv";
            strArr[1] = "5HqmMGmqvKeUZ55y8iy1lLJbe1y4dd8I";
            KU.A00(th, this);
        }
    }
}