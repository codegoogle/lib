package com.facebook.ads.redexgen.X;

import android.app.KeyguardManager;
import android.content.Context;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class VI extends C6Z {
    public static byte[] A01;
    public final KeyguardManager A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 7);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-57, -63, -43, -61, -47, -67, -50, -64};
    }

    public VI(Context context, C04325z c04325z) {
        super(context, c04325z);
        this.A00 = (KeyguardManager) context.getSystemService(A02(0, 8, 85));
    }

    public final InterfaceC04416i A0H() {
        return new VE(this);
    }

    public final InterfaceC04416i A0I() {
        return new VF(this);
    }

    public final InterfaceC04416i A0J() {
        return new VG(this);
    }

    public final InterfaceC04416i A0K() {
        return new VH(this);
    }
}