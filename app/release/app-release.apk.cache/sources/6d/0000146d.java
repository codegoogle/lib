package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Process;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network.dex */
public final class UX extends C6Z {
    public static byte[] A01;
    @Nullable
    public final BluetoothAdapter A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 106);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{-4, 9, -1, 13, 10, 4, -1, -55, Flags.CD, 0, 13, 8, 4, 14, 14, 4, 10, 9, -55, -35, -25, -16, -32, -17, -22, -22, -17, -29};
    }

    public UX(Context context, C04325z c04325z) {
        super(context, c04325z);
        this.A00 = A04(context) ? BluetoothAdapter.getDefaultAdapter() : null;
    }

    public static boolean A04(Context context) {
        return context.checkPermission(A02(0, 28, 49), Process.myPid(), Process.myUid()) == 0;
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC04416i A0H() {
        return new UT(this);
    }

    @SuppressLint({"MissingPermission", "CatchGeneralException"})
    public final InterfaceC04416i A0I() {
        return new UU(this);
    }

    @SuppressLint({"MissingPermission"})
    public final InterfaceC04416i A0J() {
        return new UV(this);
    }
}