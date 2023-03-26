package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzabk implements zzbk {
    public static final Parcelable.Creator<zzabk> CREATOR = new zzabj();
    public final int zza;
    @z1
    public final String zzb;
    @z1
    public final String zzc;
    @z1
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzabk(int i, @z1 String str, @z1 String str2, @z1 String str3, boolean z, int i2) {
        boolean z2 = true;
        if (i2 != -1 && i2 <= 0) {
            z2 = false;
        }
        zzcw.zzd(z2);
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z;
        this.zzf = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabk.class == obj.getClass()) {
            zzabk zzabkVar = (zzabk) obj;
            if (this.zza == zzabkVar.zza && zzeg.zzS(this.zzb, zzabkVar.zzb) && zzeg.zzS(this.zzc, zzabkVar.zzc) && zzeg.zzS(this.zzd, zzabkVar.zzd) && this.zze == zzabkVar.zze && this.zzf == zzabkVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        String str = this.zzb;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzc;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.zzd;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        String str = this.zzc;
        String str2 = this.zzb;
        int i = this.zza;
        int i2 = this.zzf;
        StringBuilder N = wo1.N("IcyHeaders: name=\"", str, "\", genre=\"", str2, "\", bitrate=");
        N.append(i);
        N.append(", metadataInterval=");
        N.append(i2);
        return N.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        zzeg.zzR(parcel, this.zze);
        parcel.writeInt(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbfVar) {
        String str = this.zzc;
        if (str != null) {
            zzbfVar.zzq(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzbfVar.zzj(str2);
        }
    }

    public zzabk(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        this.zze = zzeg.zzY(parcel);
        this.zzf = parcel.readInt();
    }
}