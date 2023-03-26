package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.z1;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzabq extends zzacb {
    public static final Parcelable.Creator<zzabq> CREATOR = new zzabp();
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzacb[] zzg;

    public zzabq(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readInt();
        this.zzc = parcel.readInt();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
        int readInt = parcel.readInt();
        this.zzg = new zzacb[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zzg[i2] = (zzacb) parcel.readParcelable(zzacb.class.getClassLoader());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzacb, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabq.class == obj.getClass()) {
            zzabq zzabqVar = (zzabq) obj;
            if (this.zzb == zzabqVar.zzb && this.zzc == zzabqVar.zzc && this.zzd == zzabqVar.zzd && this.zze == zzabqVar.zze && zzeg.zzS(this.zza, zzabqVar.zza) && Arrays.equals(this.zzg, zzabqVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((this.zzb + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) this.zze)) * 31;
        String str = this.zza;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeInt(this.zzb);
        parcel.writeInt(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
        parcel.writeInt(this.zzg.length);
        for (zzacb zzacbVar : this.zzg) {
            parcel.writeParcelable(zzacbVar, 0);
        }
    }

    public zzabq(String str, int i, int i2, long j, long j2, zzacb[] zzacbVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzacbVarArr;
    }
}