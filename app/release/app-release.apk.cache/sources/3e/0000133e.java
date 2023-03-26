package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;

/* renamed from: com.facebook.ads.redexgen.X.Pb  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnTouchListenerC0895Pb implements View.OnTouchListener {
    public static String[] A01;
    public final /* synthetic */ GB A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"mce3RnjQuKnQyZwY2MYCRKsU6qDPnRTv", "6i", "za", "wlJBNttigYYlx2yteY8tG49BlED6WsVY", "MVnjYKLYm17azeeTFPLJcrer3BwrjfHl", "3Wee1YLSMyRTxC38n8Qm6eLBL9IfF0GN", "3z6wLog4xxMob0RUOVoWJU4Ax22Nftgw", "VSwWIM7jHdG3nIkp1OJVw48UFn88gUH7"};
    }

    public View$OnTouchListenerC0895Pb(GB gb) {
        this.A00 = gb;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        if (r4.isShowing() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
        r0 = r5.A00.A0A;
        r0.hide();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
        if (r4.isShowing() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
        r0 = r5.A00.A0A;
        r0.show();
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        MediaController mediaController;
        MediaController mediaController2;
        z = this.A00.A0G;
        if (z) {
            return true;
        }
        mediaController = this.A00.A0A;
        String[] strArr = A01;
        if (strArr[4].charAt(0) != strArr[6].charAt(0)) {
            String[] strArr2 = A01;
            strArr2[0] = "HvEVRWVu4b3A6ir0KswDbL9zFlDBl7Vo";
            strArr2[3] = "aSdZu49XGoInnb2I2ybBtqTd8GDfXNZF";
            if (mediaController != null && motionEvent.getAction() == 1) {
                mediaController2 = this.A00.A0A;
                if (A01[7].charAt(9) != 'o') {
                    String[] strArr3 = A01;
                    strArr3[5] = "PKAZCNEBQS248pKbgoN5vL2n8kWbkeSf";
                    strArr3[5] = "PKAZCNEBQS248pKbgoN5vL2n8kWbkeSf";
                } else {
                    String[] strArr4 = A01;
                    strArr4[0] = "se9uNVwp2KR0SqcPH5E6zAp8mBDLV9kP";
                    strArr4[3] = "7jkgWI5wEJtN4OtVk5f4fU2wMaDr3zYP";
                }
            }
            return true;
        }
        throw new RuntimeException();
    }
}