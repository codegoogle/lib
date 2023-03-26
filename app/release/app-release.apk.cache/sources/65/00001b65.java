package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzabg implements zzbk {
    public static final Parcelable.Creator<zzabg> CREATOR = new zzabf();
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzabg(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    public zzabg(Parcel parcel) {
        this.zza = parcel.readInt();
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zzb = readString;
        this.zzc = parcel.readString();
        this.zzd = parcel.readInt();
        this.zze = parcel.readInt();
        this.zzf = parcel.readInt();
        this.zzg = parcel.readInt();
        this.zzh = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public static zzabg zzb(zzdy zzdyVar) {
        int zze = zzdyVar.zze();
        String zzx = zzdyVar.zzx(zzdyVar.zze(), zzfoi.zza);
        String zzx2 = zzdyVar.zzx(zzdyVar.zze(), zzfoi.zzc);
        int zze2 = zzdyVar.zze();
        int zze3 = zzdyVar.zze();
        int zze4 = zzdyVar.zze();
        int zze5 = zzdyVar.zze();
        int zze6 = zzdyVar.zze();
        byte[] bArr = new byte[zze6];
        zzdyVar.zzB(bArr, 0, zze6);
        return new zzabg(zze, zzx, zzx2, zze2, zze3, zze4, zze5, bArr);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabg.class == obj.getClass()) {
            zzabg zzabgVar = (zzabg) obj;
            if (this.zza == zzabgVar.zza && this.zzb.equals(zzabgVar.zzb) && this.zzc.equals(zzabgVar.zzc) && this.zzd == zzabgVar.zzd && this.zze == zzabgVar.zze && this.zzf == zzabgVar.zzf && this.zzg == zzabgVar.zzg && Arrays.equals(this.zzh, zzabgVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int x = wo1.x(this.zzb, (this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31, 31);
        return Arrays.hashCode(this.zzh) + ((((((((wo1.x(this.zzc, x, 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        return wo1.v("Picture: mimeType=", this.zzb, ", description=", this.zzc);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeInt(this.zzd);
        parcel.writeInt(this.zze);
        parcel.writeInt(this.zzf);
        parcel.writeInt(this.zzg);
        parcel.writeByteArray(this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzbk
    public final void zza(zzbf zzbfVar) {
        zzbfVar.zza(this.zzh, this.zza);
    }
}