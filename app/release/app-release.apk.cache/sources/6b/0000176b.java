package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzcfb;
import com.p7700g.p99005.pt0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@SafeParcelable.Class(creator = "AdSizeParcelCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes2.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new zzr();
    @SafeParcelable.Field(id = 2)
    public final String zza;
    @SafeParcelable.Field(id = 3)
    public final int zzb;
    @SafeParcelable.Field(id = 4)
    public final int zzc;
    @SafeParcelable.Field(id = 5)
    public final boolean zzd;
    @SafeParcelable.Field(id = 6)
    public final int zze;
    @SafeParcelable.Field(id = 7)
    public final int zzf;
    @SafeParcelable.Field(id = 8)
    public final zzq[] zzg;
    @SafeParcelable.Field(id = 9)
    public final boolean zzh;
    @SafeParcelable.Field(id = 10)
    public final boolean zzi;
    @SafeParcelable.Field(id = 11)
    public boolean zzj;
    @SafeParcelable.Field(id = 12)
    public boolean zzk;
    @SafeParcelable.Field(id = 13)
    public boolean zzl;
    @SafeParcelable.Field(id = 14)
    public boolean zzm;
    @SafeParcelable.Field(id = 15)
    public boolean zzn;
    @SafeParcelable.Field(id = 16)
    public boolean zzo;

    public zzq() {
        this("interstitial_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static int zza(DisplayMetrics displayMetrics) {
        return (int) (zzf(displayMetrics) * displayMetrics.density);
    }

    public static zzq zzb() {
        return new zzq("interstitial_mb", 0, 0, false, 0, 0, null, false, false, false, false, true, false, false, false);
    }

    public static zzq zzc() {
        return new zzq("320x50_mb", 0, 0, false, 0, 0, null, true, false, false, false, false, false, false, false);
    }

    public static zzq zzd() {
        return new zzq("reward_mb", 0, 0, true, 0, 0, null, false, false, false, false, false, false, false, false);
    }

    public static zzq zze() {
        return new zzq("invalid", 0, 0, false, 0, 0, null, false, false, false, true, false, false, false, false);
    }

    private static int zzf(DisplayMetrics displayMetrics) {
        int i = (int) (displayMetrics.heightPixels / displayMetrics.density);
        if (i <= 400) {
            return 32;
        }
        return i <= 720 ? 50 : 90;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeInt(parcel, 3, this.zzb);
        SafeParcelWriter.writeInt(parcel, 4, this.zzc);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzd);
        SafeParcelWriter.writeInt(parcel, 6, this.zze);
        SafeParcelWriter.writeInt(parcel, 7, this.zzf);
        SafeParcelWriter.writeTypedArray(parcel, 8, this.zzg, i, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeBoolean(parcel, 11, this.zzj);
        SafeParcelWriter.writeBoolean(parcel, 12, this.zzk);
        SafeParcelWriter.writeBoolean(parcel, 13, this.zzl);
        SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 15, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzq(Context context, AdSize adSize) {
        this(context, new AdSize[]{adSize});
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzq(Context context, AdSize[] adSizeArr) {
        int height;
        int i;
        int i2;
        String str;
        int i3;
        double d;
        DisplayMetrics displayMetrics;
        AdSize adSize = adSizeArr[0];
        this.zzd = false;
        boolean isFluid = adSize.isFluid();
        this.zzi = isFluid;
        this.zzm = com.google.android.gms.ads.zzb.zzf(adSize);
        this.zzn = com.google.android.gms.ads.zzb.zzg(adSize);
        boolean zzh = com.google.android.gms.ads.zzb.zzh(adSize);
        this.zzo = zzh;
        if (isFluid) {
            AdSize adSize2 = AdSize.BANNER;
            this.zze = adSize2.getWidth();
            height = adSize2.getHeight();
            this.zzb = height;
        } else if (this.zzn) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzb.zza(adSize);
            this.zzb = height;
        } else if (zzh) {
            this.zze = adSize.getWidth();
            height = com.google.android.gms.ads.zzb.zzb(adSize);
            this.zzb = height;
        } else {
            this.zze = adSize.getWidth();
            height = adSize.getHeight();
            this.zzb = height;
        }
        int i4 = this.zze;
        DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
        if (i4 == -1) {
            zzaw.zzb();
            if (context.getResources().getConfiguration().orientation == 2) {
                if (((int) (displayMetrics.heightPixels / context.getResources().getDisplayMetrics().density)) < 600) {
                    zzaw.zzb();
                    DisplayMetrics displayMetrics3 = context.getResources().getDisplayMetrics();
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager != null) {
                        Display defaultDisplay = windowManager.getDefaultDisplay();
                        defaultDisplay.getRealMetrics(displayMetrics3);
                        int i5 = displayMetrics3.heightPixels;
                        int i6 = displayMetrics3.widthPixels;
                        defaultDisplay.getMetrics(displayMetrics3);
                        int i7 = displayMetrics3.heightPixels;
                        int i8 = displayMetrics3.widthPixels;
                        if (i7 == i5 && i8 == i6) {
                            int i9 = displayMetrics2.widthPixels;
                            zzaw.zzb();
                            int identifier = context.getResources().getIdentifier("navigation_bar_width", "dimen", pt0.a);
                            i3 = i9 - (identifier > 0 ? context.getResources().getDimensionPixelSize(identifier) : 0);
                            this.zzf = i3;
                            d = i3 / displayMetrics2.density;
                            i = (int) d;
                            if (d - i >= 0.01d) {
                                i++;
                            }
                        }
                    }
                }
            }
            i3 = displayMetrics2.widthPixels;
            this.zzf = i3;
            d = i3 / displayMetrics2.density;
            i = (int) d;
            if (d - i >= 0.01d) {
            }
        } else {
            i = this.zze;
            zzaw.zzb();
            this.zzf = zzcfb.zzo(displayMetrics2, this.zze);
        }
        if (height == -2) {
            i2 = zzf(displayMetrics2);
        } else {
            i2 = this.zzb;
        }
        zzaw.zzb();
        this.zzc = zzcfb.zzo(displayMetrics2, i2);
        if (i4 == -1 || height == -2) {
            this.zza = i + "x" + i2 + "_as";
        } else {
            if (this.zzn || this.zzo) {
                str = this.zze + "x" + this.zzb + "_as";
            } else if (isFluid) {
                str = "320x50_mb";
            } else {
                this.zza = adSize.toString();
            }
            this.zza = str;
        }
        int length = adSizeArr.length;
        if (length > 1) {
            this.zzg = new zzq[length];
            for (int i10 = 0; i10 < adSizeArr.length; i10++) {
                this.zzg[i10] = new zzq(context, adSizeArr[i10]);
            }
        } else {
            this.zzg = null;
        }
        this.zzh = false;
        this.zzj = false;
    }

    @SafeParcelable.Constructor
    public zzq(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) int i, @SafeParcelable.Param(id = 4) int i2, @SafeParcelable.Param(id = 5) boolean z, @SafeParcelable.Param(id = 6) int i3, @SafeParcelable.Param(id = 7) int i4, @SafeParcelable.Param(id = 8) zzq[] zzqVarArr, @SafeParcelable.Param(id = 9) boolean z2, @SafeParcelable.Param(id = 10) boolean z3, @SafeParcelable.Param(id = 11) boolean z4, @SafeParcelable.Param(id = 12) boolean z5, @SafeParcelable.Param(id = 13) boolean z6, @SafeParcelable.Param(id = 14) boolean z7, @SafeParcelable.Param(id = 15) boolean z8, @SafeParcelable.Param(id = 16) boolean z9) {
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = z;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = zzqVarArr;
        this.zzh = z2;
        this.zzi = z3;
        this.zzj = z4;
        this.zzk = z5;
        this.zzl = z6;
        this.zzm = z7;
        this.zzn = z8;
        this.zzo = z9;
    }
}