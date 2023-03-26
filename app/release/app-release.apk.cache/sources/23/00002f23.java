package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.p7700g.p99005.z1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzv implements Comparator<zzu>, Parcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new zzs();
    @z1
    public final String zza;
    public final int zzb;
    private final zzu[] zzc;
    private int zzd;

    public zzv(Parcel parcel) {
        this.zza = parcel.readString();
        zzu[] zzuVarArr = (zzu[]) zzeg.zzG((zzu[]) parcel.createTypedArray(zzu.CREATOR));
        this.zzc = zzuVarArr;
        this.zzb = zzuVarArr.length;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(zzu zzuVar, zzu zzuVar2) {
        zzu zzuVar3 = zzuVar;
        zzu zzuVar4 = zzuVar2;
        UUID uuid = zzm.zza;
        if (uuid.equals(zzuVar3.zza)) {
            return !uuid.equals(zzuVar4.zza) ? 1 : 0;
        }
        return zzuVar3.zza.compareTo(zzuVar4.zza);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzv.class == obj.getClass()) {
            zzv zzvVar = (zzv) obj;
            if (zzeg.zzS(this.zza, zzvVar.zza) && Arrays.equals(this.zzc, zzvVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzd;
        if (i == 0) {
            String str = this.zza;
            int hashCode = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.zzc);
            this.zzd = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeTypedArray(this.zzc, 0);
    }

    public final zzu zza(int i) {
        return this.zzc[i];
    }

    public final zzv zzb(@z1 String str) {
        return zzeg.zzS(this.zza, str) ? this : new zzv(str, false, this.zzc);
    }

    private zzv(@z1 String str, boolean z, zzu... zzuVarArr) {
        this.zza = str;
        zzuVarArr = z ? (zzu[]) zzuVarArr.clone() : zzuVarArr;
        this.zzc = zzuVarArr;
        this.zzb = zzuVarArr.length;
        Arrays.sort(zzuVarArr, this);
    }

    public zzv(@z1 String str, zzu... zzuVarArr) {
        this(null, true, zzuVarArr);
    }

    public zzv(List list) {
        this(null, false, (zzu[]) list.toArray(new zzu[0]));
    }
}