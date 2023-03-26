package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Tm  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1007Tm extends C6Z {
    public static byte[] A04;
    @Nullable
    public ConfigurationInfo A00;
    public final ActivityManager.RunningAppProcessInfo A01;
    public final ActivityManager A02;
    public final Context A03;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 6);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A04 = new byte[]{13, 15, 24, 5, 26, 5, 24, 21};
    }

    public C1007Tm(Context context, C04325z c04325z) {
        super(context, c04325z);
        this.A03 = context;
        this.A02 = (ActivityManager) this.A03.getSystemService(A04(0, 8, 106));
        ActivityManager activityManager = this.A02;
        if (activityManager != null) {
            this.A00 = activityManager.getDeviceConfigurationInfo();
        }
        this.A01 = new ActivityManager.RunningAppProcessInfo();
    }

    public final InterfaceC04416i A0H() {
        return new C1004Tj(this);
    }

    public final InterfaceC04416i A0I() {
        return new C1005Tk(this);
    }

    public final InterfaceC04416i A0J() {
        return new C1000Tf(this);
    }

    public final InterfaceC04416i A0K() {
        return new C1001Tg(this);
    }

    public final InterfaceC04416i A0L() {
        return new C1002Th(this);
    }

    public final InterfaceC04416i A0M() {
        return new C0999Te(this);
    }

    public final InterfaceC04416i A0N() {
        return new C1003Ti(this);
    }

    public final InterfaceC04416i A0O() {
        return new C0998Td(this);
    }

    public final InterfaceC04416i A0P() {
        return new C1006Tl(this);
    }

    public final InterfaceC04416i A0Q() {
        return new C0996Tb(this);
    }

    public final InterfaceC04416i A0R() {
        return new C0997Tc(this);
    }
}