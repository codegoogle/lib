package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mr  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC0834Mr implements View.OnClickListener {
    public static String[] A02;
    public final /* synthetic */ C0827Mk A00;
    public final /* synthetic */ XU A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"Oq", "EvGClE7if1wWI664DgGuGJMVxIj5MmF8", "WEj5b", "ZnP49bXAxkKFgNqp8", "Y2wBPaH57L9Gttlp", "AMrJJ9So27w7KiYttAq3AFMsZzT3RVfH", "8te6O8WI5P7ERWBX", "5xXH0hCktOzz8vKUWRcLVJoUpm5lTBxe"};
    }

    public View$OnClickListenerC0834Mr(XU xu, C0827Mk c0827Mk) {
        this.A01 = xu;
        this.A00 = c0827Mk;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (KU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0A.AAC(AnonymousClass24.A05);
        } catch (Throwable th) {
            if (A02[5].charAt(20) == 'D') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "snOHg";
            strArr[2] = "snOHg";
            KU.A00(th, this);
        }
    }
}