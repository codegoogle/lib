package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.z1;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzabs extends zzacb {
    public static final Parcelable.Creator<zzabs> CREATOR = new zzabr();
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzacb[] zze;

    public zzabs(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zza = readString;
        this.zzb = parcel.readByte() != 0;
        this.zzc = parcel.readByte() != 0;
        this.zzd = (String[]) zzeg.zzG(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.zze = new zzacb[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.zze[i2] = (zzacb) parcel.readParcelable(zzacb.class.getClassLoader());
        }
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabs.class == obj.getClass()) {
            zzabs zzabsVar = (zzabs) obj;
            if (this.zzb == zzabsVar.zzb && this.zzc == zzabsVar.zzc && zzeg.zzS(this.zza, zzabsVar.zza) && Arrays.equals(this.zzd, zzabsVar.zzd) && Arrays.equals(this.zze, zzabsVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((((this.zzb ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + (this.zzc ? 1 : 0)) * 31;
        String str = this.zza;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByte(this.zzb ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.zzc ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.zzd);
        parcel.writeInt(this.zze.length);
        for (zzacb zzacbVar : this.zze) {
            parcel.writeParcelable(zzacbVar, 0);
        }
    }

    public zzabs(String str, boolean z, boolean z2, String[] strArr, zzacb[] zzacbVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = strArr;
        this.zze = zzacbVarArr;
    }
}