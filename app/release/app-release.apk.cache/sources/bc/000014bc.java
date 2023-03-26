package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vo  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1061Vo extends C6Z {
    public static byte[] A01;
    public final PowerManager A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 14);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{101, 122, 98, 112, 103};
    }

    public C1061Vo(Context context, C04325z c04325z) {
        super(context, c04325z);
        this.A00 = (PowerManager) context.getSystemService(A02(0, 5, 27));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"DeprecatedMethod"})
    public boolean A04() {
        if (Build.VERSION.SDK_INT >= 20) {
            this.A00.isInteractive();
        }
        return this.A00.isScreenOn();
    }

    public final InterfaceC04416i A0H() {
        return new C1059Vm(this);
    }

    @TargetApi(20)
    public final InterfaceC04416i A0I() {
        return new C1058Vl(this);
    }

    public final InterfaceC04416i A0J() {
        return new C1060Vn(this);
    }
}