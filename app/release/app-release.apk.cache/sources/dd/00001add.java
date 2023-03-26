package com.google.android.gms.common.util;

import android.os.Build;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.p7700g.p99005.jm;
import com.p7700g.p99005.v0;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes2.dex */
public final class PlatformVersion {
    private PlatformVersion() {
    }

    @KeepForSdk
    @v0(api = 11)
    public static boolean isAtLeastHoneycomb() {
        return true;
    }

    @KeepForSdk
    @v0(api = 12)
    public static boolean isAtLeastHoneycombMR1() {
        return true;
    }

    @KeepForSdk
    @v0(api = 14)
    public static boolean isAtLeastIceCreamSandwich() {
        return true;
    }

    @KeepForSdk
    @v0(api = 15)
    public static boolean isAtLeastIceCreamSandwichMR1() {
        return true;
    }

    @KeepForSdk
    @v0(api = 16)
    public static boolean isAtLeastJellyBean() {
        return true;
    }

    @KeepForSdk
    @v0(api = 17)
    public static boolean isAtLeastJellyBeanMR1() {
        return true;
    }

    @KeepForSdk
    @v0(api = 18)
    public static boolean isAtLeastJellyBeanMR2() {
        return true;
    }

    @KeepForSdk
    @v0(api = 19)
    public static boolean isAtLeastKitKat() {
        return true;
    }

    @KeepForSdk
    @v0(api = 20)
    public static boolean isAtLeastKitKatWatch() {
        return true;
    }

    @KeepForSdk
    @v0(api = 21)
    public static boolean isAtLeastLollipop() {
        return true;
    }

    @KeepForSdk
    @v0(api = 22)
    public static boolean isAtLeastLollipopMR1() {
        return Build.VERSION.SDK_INT >= 22;
    }

    @KeepForSdk
    @v0(api = 23)
    public static boolean isAtLeastM() {
        return Build.VERSION.SDK_INT >= 23;
    }

    @KeepForSdk
    @v0(api = 24)
    public static boolean isAtLeastN() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @KeepForSdk
    @v0(api = 26)
    public static boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @KeepForSdk
    @v0(api = 28)
    public static boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    @KeepForSdk
    @v0(api = 29)
    public static boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @KeepForSdk
    @v0(api = 30)
    public static boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @KeepForSdk
    @v0(api = 31)
    public static boolean isAtLeastS() {
        return Build.VERSION.SDK_INT >= 31;
    }

    @KeepForSdk
    @v0(api = 32)
    public static boolean isAtLeastSv2() {
        return Build.VERSION.SDK_INT >= 32;
    }

    @KeepForSdk
    @v0(api = 33)
    public static boolean isAtLeastT() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }

    @KeepForSdk
    @v0(api = 33, codename = "UpsideDownCake")
    public static boolean isAtLeastU() {
        if (isAtLeastT()) {
            return jm.l();
        }
        return false;
    }
}