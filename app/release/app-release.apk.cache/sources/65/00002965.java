package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
@SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* loaded from: classes2.dex */
public final class zzfdv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfdv> CREATOR = new zzfdw();
    @Nullable
    public final Context zza;
    public final zzfds zzb;
    @SafeParcelable.Field(id = 2)
    public final int zzc;
    @SafeParcelable.Field(id = 3)
    public final int zzd;
    @SafeParcelable.Field(id = 4)
    public final int zze;
    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfds[] zzh;
    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;
    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;
    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfdv(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) int i2, @SafeParcelable.Param(id = 3) int i3, @SafeParcelable.Param(id = 4) int i4, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i5, @SafeParcelable.Param(id = 7) int i6) {
        zzfds[] values = zzfds.values();
        this.zzh = values;
        int[] zza = zzfdt.zza();
        this.zzl = zza;
        int[] zza2 = zzfdu.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = values[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = zza[i5];
        this.zzk = i6;
        int i7 = zza2[i6];
    }

    @Nullable
    public static zzfdv zza(zzfds zzfdsVar, Context context) {
        if (zzfdsVar == zzfds.Rewarded) {
            return new zzfdv(context, zzfdsVar, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfq)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfw)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfy)).intValue(), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfA), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfs), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfu));
        } else if (zzfdsVar == zzfds.Interstitial) {
            return new zzfdv(context, zzfdsVar, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfr)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfx)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfz)).intValue(), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfB), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzft), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfv));
        } else if (zzfdsVar == zzfds.AppOpen) {
            return new zzfdv(context, zzfdsVar, ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfE)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfG)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfH)).intValue(), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfC), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfD), (String) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfF));
        } else {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zzi);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfdv(@Nullable Context context, zzfds zzfdsVar, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfds.values();
        this.zzl = zzfdt.zza();
        this.zzm = zzfdu.zza();
        this.zza = context;
        this.zzi = zzfdsVar.ordinal();
        this.zzb = zzfdsVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.zzg = i4;
        this.zzj = i4 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}