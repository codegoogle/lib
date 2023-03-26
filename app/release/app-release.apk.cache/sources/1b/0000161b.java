package com.facebook.ads.redexgen.X;

import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.Arrays;
import java.util.Map;
import org.xbill.DNS.Flags;

/* renamed from: com.facebook.ads.redexgen.X.bX  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class View$OnClickListenerC1265bX implements View.OnClickListener, View.OnLongClickListener, View.OnTouchListener, C8F {
    public static byte[] A02;
    public final C1080Wh A00;
    public final /* synthetic */ C1267bZ A01;

    static {
        A03();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{43, 14, 74, 9, Flags.CD, 4, 4, 5, 30, 74, 8, 15, 74, 9, 6, 3, 9, 1, 15, 14, 74, 8, 15, 12, 5, 24, 15, 74, 3, 30, 74, 3, 25, 74, 28, 3, 15, 29, 15, 14, 68, 66, 109, 104, 98, 106, 114, 33, 105, 96, 113, 113, 100, 111, 100, 101, 33, 117, 110, 110, 33, 103, 96, 114, 117, 47, 20, 16, 19, 39, 54, 59, 55, 60, 49, 55, 28, 55, 38, 37, 61, 32, 57, 56, 25, 86, 2, 25, 3, 21, 30, 86, 18, 23, 2, 23, 86, 4, 19, 21, 25, 4, 18, 19, 18, 90, 86, 6, 26, 19, 23, 5, 19, 86, 19, 24, 5, 3, 4, 19, 86, 2, 25, 3, 21, 30, 86, 19, 0, 19, 24, 2, 5, 86, 4, 19, 23, 21, 30, 86, 2, 30, 19, 86, 23, 18, 86, 32, 31, 19, 1, 86, 20, 15, 86, 4, 19, 2, 3, 4, 24, 31, 24, 17, 86, 16, 23, 26, 5, 19, 86, 31, 16, 86, 15, 25, 3, 86, 31, 24, 2, 19, 4, 21, 19, 6, 2, 86, 2, 30, 19, 86, 19, 0, 19, 24, 2, 88, 33, 39, 60, 94, 68, 89};
    }

    public View$OnClickListenerC1265bX(C1267bZ c1267bZ, C1080Wh c1080Wh) {
        this.A01 = c1267bZ;
        this.A00 = c1080Wh;
    }

    public /* synthetic */ View$OnClickListenerC1265bX(C1267bZ c1267bZ, C1080Wh c1080Wh, C1259bQ c1259bQ) {
        this(c1267bZ, c1080Wh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> A01() {
        C0901Ph c0901Ph;
        LX lx;
        EnumC0746Jc enumC0746Jc;
        boolean z;
        boolean z2;
        EnumC0746Jc enumC0746Jc2;
        NU nu = new NU();
        c0901Ph = this.A01.A0N;
        NU A04 = nu.A04(c0901Ph);
        lx = this.A01.A0b;
        Map<String, String> A06 = A04.A03(lx).A06();
        enumC0746Jc = this.A01.A0H;
        if (enumC0746Jc != null) {
            enumC0746Jc2 = this.A01.A0H;
            A06.put(A00(201, 3, 11), String.valueOf(enumC0746Jc2.A04()));
        }
        z = this.A01.A0S;
        if (z) {
            z2 = this.A01.A0S;
            A06.put(A00(198, 3, 116), String.valueOf(z2));
        }
        return A06;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(Map<String, String> map) {
        if (this.A01.A0W != null) {
            this.A01.A0W.A0Z(map);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C8F
    public final C1080Wh A5G() {
        return this.A00;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LX lx;
        C1080Wh c1080Wh;
        LX lx2;
        C1080Wh c1080Wh2;
        C1080Wh c1080Wh3;
        LX lx3;
        LX lx4;
        if (KU.A02(this)) {
            return;
        }
        try {
            lx = this.A01.A0b;
            boolean A09 = lx.A09();
            String A00 = A00(66, 17, 105);
            if (!A09) {
                Log.e(A00, A00(83, 115, 77));
            }
            c1080Wh = this.A01.A0Y;
            int A0E = J8.A0E(c1080Wh);
            if (A0E >= 0) {
                lx3 = this.A01.A0b;
                if (lx3.A04() < A0E) {
                    lx4 = this.A01.A0b;
                    if (!lx4.A08()) {
                        Log.e(A00, A00(0, 41, 81));
                        return;
                    } else {
                        Log.e(A00, A00(41, 25, 58));
                        return;
                    }
                }
            }
            lx2 = this.A01.A0b;
            c1080Wh2 = this.A01.A0Y;
            if (lx2.A0A(c1080Wh2)) {
                if (this.A01.A0W != null) {
                    this.A01.A0W.A0a(A01());
                    return;
                }
                return;
            }
            c1080Wh3 = this.A01.A0Y;
            if (J8.A0z(c1080Wh3)) {
                if (this.A01.A0W != null) {
                    this.A01.A0W.A0d(A01());
                }
                L9.A00(new JW(this), new JX(this), C0785Ks.A00());
                return;
            }
            A05(A01());
        } catch (Throwable th) {
            KU.A00(th, this);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        View view2;
        NS ns;
        NS ns2;
        View view3;
        View view4;
        NS ns3;
        NS ns4;
        view2 = this.A01.A03;
        if (view2 != null) {
            ns = this.A01.A0K;
            if (ns != null) {
                ns2 = this.A01.A0K;
                view3 = this.A01.A03;
                int width = view3.getWidth();
                view4 = this.A01.A03;
                ns2.setBounds(0, 0, width, view4.getHeight());
                ns3 = this.A01.A0K;
                ns4 = this.A01.A0K;
                ns3.A0E(!ns4.A0F());
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        LX lx;
        View view2;
        View.OnTouchListener onTouchListener;
        View.OnTouchListener onTouchListener2;
        lx = this.A01.A0b;
        view2 = this.A01.A03;
        lx.A07(motionEvent, view2, view);
        onTouchListener = this.A01.A02;
        if (onTouchListener != null) {
            onTouchListener2 = this.A01.A02;
            if (onTouchListener2.onTouch(view, motionEvent)) {
                return true;
            }
        }
        return false;
    }
}