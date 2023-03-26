package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
@SafeParcelable.Class(creator = "AdErrorParcelCreator")
/* loaded from: classes2.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();
    @SafeParcelable.Field(id = 1)
    public final int zza;
    @SafeParcelable.Field(id = 2)
    public final String zzb;
    @SafeParcelable.Field(id = 3)
    public final String zzc;
    @z1
    @SafeParcelable.Field(id = 4)
    public zze zzd;
    @z1
    @SafeParcelable.Field(id = 5, type = "android.os.IBinder")
    public IBinder zze;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) @z1 zze zzeVar, @SafeParcelable.Param(id = 5) @z1 IBinder iBinder) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzeVar;
        this.zze = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        SafeParcelWriter.writeIBinder(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final AdError zza() {
        zze zzeVar = this.zzd;
        return new AdError(this.zza, this.zzb, this.zzc, zzeVar == null ? null : new AdError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc));
    }

    public final LoadAdError zzb() {
        zze zzeVar = this.zzd;
        zzdh zzdhVar = null;
        AdError adError = zzeVar == null ? null : new AdError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc);
        int i = this.zza;
        String str = this.zzb;
        String str2 = this.zzc;
        IBinder iBinder = this.zze;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            zzdhVar = queryLocalInterface instanceof zzdh ? (zzdh) queryLocalInterface : new zzdf(iBinder);
        }
        return new LoadAdError(i, str, str2, adError, ResponseInfo.zza(zzdhVar));
    }
}