package com.google.android.gms.ads;

import android.content.Context;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.ads.zzcfb;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.x1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@VisibleForTesting
/* loaded from: classes2.dex */
public final class AdSize {
    public static final int AUTO_HEIGHT = -2;
    public static final int FULL_WIDTH = -1;
    private final int zzb;
    private final int zzc;
    private final String zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;
    private boolean zzh;
    private int zzi;
    @x1
    public static final AdSize BANNER = new AdSize(320, 50, "320x50_mb");
    @x1
    public static final AdSize FULL_BANNER = new AdSize(468, 60, "468x60_as");
    @x1
    public static final AdSize LARGE_BANNER = new AdSize(320, 100, "320x100_as");
    @x1
    public static final AdSize LEADERBOARD = new AdSize(728, 90, "728x90_as");
    @x1
    public static final AdSize MEDIUM_RECTANGLE = new AdSize(300, 250, "300x250_as");
    @x1
    public static final AdSize WIDE_SKYSCRAPER = new AdSize(160, 600, "160x600_as");
    @x1
    @Deprecated
    public static final AdSize SMART_BANNER = new AdSize(-1, -2, "smart_banner");
    @x1
    public static final AdSize FLUID = new AdSize(-3, -4, "fluid");
    @x1
    public static final AdSize INVALID = new AdSize(0, 0, "invalid");
    @x1
    public static final AdSize zza = new AdSize(50, 50, "50x50_mb");
    @x1
    public static final AdSize SEARCH = new AdSize(-3, 0, "search_v2");

    public AdSize(int i, int i2) {
        this(i, i2, wo1.v(i == -1 ? "FULL" : String.valueOf(i), "x", i2 == -2 ? "AUTO" : String.valueOf(i2), "_as"));
    }

    @x1
    public static AdSize getCurrentOrientationAnchoredAdaptiveBannerAdSize(@x1 Context context, int i) {
        AdSize zzc = zzcfb.zzc(context, i, 50, 0);
        zzc.zze = true;
        return zzc;
    }

    @x1
    public static AdSize getCurrentOrientationInlineAdaptiveBannerAdSize(@x1 Context context, int i) {
        int zza2 = zzcfb.zza(context, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.zzg = zza2;
        adSize.zzf = true;
        return adSize;
    }

    @x1
    public static AdSize getCurrentOrientationInterscrollerAdSize(@x1 Context context, int i) {
        return zzj(i, zzcfb.zza(context, 0));
    }

    @x1
    public static AdSize getInlineAdaptiveBannerAdSize(int i, int i2) {
        AdSize adSize = new AdSize(i, 0);
        adSize.zzg = i2;
        adSize.zzf = true;
        if (i2 < 32) {
            zzcfi.zzj("The maximum height set for the inline adaptive ad size was " + i2 + " dp, which is below the minimum recommended value of 32 dp.");
        }
        return adSize;
    }

    @x1
    public static AdSize getLandscapeAnchoredAdaptiveBannerAdSize(@x1 Context context, int i) {
        AdSize zzc = zzcfb.zzc(context, i, 50, 2);
        zzc.zze = true;
        return zzc;
    }

    @x1
    public static AdSize getLandscapeInlineAdaptiveBannerAdSize(@x1 Context context, int i) {
        int zza2 = zzcfb.zza(context, 2);
        AdSize adSize = new AdSize(i, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        adSize.zzg = zza2;
        adSize.zzf = true;
        return adSize;
    }

    @x1
    public static AdSize getLandscapeInterscrollerAdSize(@x1 Context context, int i) {
        return zzj(i, zzcfb.zza(context, 2));
    }

    @x1
    public static AdSize getPortraitAnchoredAdaptiveBannerAdSize(@x1 Context context, int i) {
        AdSize zzc = zzcfb.zzc(context, i, 50, 1);
        zzc.zze = true;
        return zzc;
    }

    @x1
    public static AdSize getPortraitInlineAdaptiveBannerAdSize(@x1 Context context, int i) {
        int zza2 = zzcfb.zza(context, 1);
        AdSize adSize = new AdSize(i, 0);
        if (zza2 == -1) {
            return INVALID;
        }
        adSize.zzg = zza2;
        adSize.zzf = true;
        return adSize;
    }

    @x1
    public static AdSize getPortraitInterscrollerAdSize(@x1 Context context, int i) {
        return zzj(i, zzcfb.zza(context, 1));
    }

    private static AdSize zzj(int i, int i2) {
        if (i2 == -1) {
            return INVALID;
        }
        AdSize adSize = new AdSize(i, 0);
        adSize.zzi = i2;
        adSize.zzh = true;
        return adSize;
    }

    public boolean equals(@z1 Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof AdSize) {
            AdSize adSize = (AdSize) obj;
            return this.zzb == adSize.zzb && this.zzc == adSize.zzc && this.zzd.equals(adSize.zzd);
        }
        return false;
    }

    public int getHeight() {
        return this.zzc;
    }

    public int getHeightInPixels(@x1 Context context) {
        int i = this.zzc;
        if (i == -4 || i == -3) {
            return -1;
        }
        if (i != -2) {
            zzaw.zzb();
            return zzcfb.zzw(context, this.zzc);
        }
        return zzq.zza(context.getResources().getDisplayMetrics());
    }

    public int getWidth() {
        return this.zzb;
    }

    public int getWidthInPixels(@x1 Context context) {
        int i = this.zzb;
        if (i != -3) {
            if (i != -1) {
                zzaw.zzb();
                return zzcfb.zzw(context, this.zzb);
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            Parcelable.Creator<zzq> creator = zzq.CREATOR;
            return displayMetrics.widthPixels;
        }
        return -1;
    }

    public int hashCode() {
        return this.zzd.hashCode();
    }

    public boolean isAutoHeight() {
        return this.zzc == -2;
    }

    public boolean isFluid() {
        return this.zzb == -3 && this.zzc == -4;
    }

    public boolean isFullWidth() {
        return this.zzb == -1;
    }

    @x1
    public String toString() {
        return this.zzd;
    }

    public final int zza() {
        return this.zzi;
    }

    public final int zzb() {
        return this.zzg;
    }

    public final void zzc(int i) {
        this.zzg = i;
    }

    public final void zzd(int i) {
        this.zzi = i;
    }

    public final void zze(boolean z) {
        this.zzf = true;
    }

    public final void zzf(boolean z) {
        this.zzh = true;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public final boolean zzh() {
        return this.zzf;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public AdSize(int i, int i2, String str) {
        if (i < 0 && i != -1 && i != -3) {
            throw new IllegalArgumentException(wo1.l("Invalid width for AdSize: ", i));
        }
        if (i2 < 0 && i2 != -2 && i2 != -4) {
            throw new IllegalArgumentException(wo1.l("Invalid height for AdSize: ", i2));
        }
        this.zzb = i;
        this.zzc = i2;
        this.zzd = str;
    }
}