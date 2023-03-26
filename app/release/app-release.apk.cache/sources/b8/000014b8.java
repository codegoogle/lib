package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.p7700g.p99005.ax5;
import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Vk  reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1057Vk extends C6Z {
    public static byte[] A07;
    public static final String A08;
    public final Context A00;
    @Nullable
    public final PackageInfo A01;
    @Nullable
    public final PackageManager A02;
    public final C04325z A03;
    @Nullable
    public final ActivityInfo[] A04;
    @Nullable
    public final ServiceInfo[] A05;
    @Nullable
    public final String[] A06;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 119);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A07 = new byte[]{29, 57, 35, 35, 57, 62, 55, 112, 0, 49, 51, 59, 49, 55, 53, 112, 0, 53, 34, 61, 57, 35, 35, 57, ax5.a, 62, 35};
    }

    static {
        A07();
        A08 = C1057Vk.class.getSimpleName();
    }

    public C1057Vk(Context context, C04325z c04325z) {
        super(context, c04325z);
        this.A00 = context;
        this.A03 = c04325z;
        this.A01 = A02(context);
        this.A02 = context.getPackageManager();
        this.A04 = A08(context);
        this.A05 = A0A(context);
        this.A06 = A0C(context);
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private PackageInfo A02(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(A08, A06(0, 27, 39), e);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private ActivityInfo[] A08(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(A08, A06(0, 27, 39), e);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private ServiceInfo[] A0A(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4).services;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(A08, A06(0, 27, 39), e);
            return null;
        }
    }

    @Nullable
    @SuppressLint({"BadMethodUse-android.util.Log.e"})
    private String[] A0C(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(A08, A06(0, 27, 39), e);
            return null;
        }
    }

    public final InterfaceC04416i A0H() {
        return new C1055Vi(this);
    }

    public final InterfaceC04416i A0I() {
        return new C1054Vh(this);
    }

    public final InterfaceC04416i A0J() {
        return new C1056Vj(this);
    }

    public final InterfaceC04416i A0K() {
        return new C1053Vg(this);
    }

    public final InterfaceC04416i A0L() {
        return new C1048Vb(this);
    }

    public final InterfaceC04416i A0M() {
        return new VX(this);
    }

    public final InterfaceC04416i A0N() {
        return new C1049Vc(this);
    }

    public final InterfaceC04416i A0O() {
        return new C1052Vf(this);
    }

    public final InterfaceC04416i A0P() {
        return new C1050Vd(this);
    }

    public final InterfaceC04416i A0Q() {
        return new C1051Ve(this);
    }

    public final InterfaceC04416i A0R() {
        return new C1047Va(this);
    }

    public final InterfaceC04416i A0S() {
        return new VZ(this);
    }

    public final InterfaceC04416i A0T() {
        return new VY(this);
    }

    public final InterfaceC04416i A0U() {
        return new VV(this);
    }

    public final InterfaceC04416i A0V() {
        return new VU(this);
    }

    public final InterfaceC04416i A0W() {
        return new VW(this);
    }

    public final InterfaceC04416i A0X() {
        return new VS(this);
    }

    public final InterfaceC04416i A0Y() {
        return new VR(this);
    }

    public final InterfaceC04416i A0Z() {
        return new VT(this);
    }
}