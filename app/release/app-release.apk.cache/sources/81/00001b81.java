package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzach extends zzacb {
    public static final Parcelable.Creator<zzach> CREATOR = new zzacg();
    public final String zza;
    public final byte[] zzb;

    public zzach(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zza = readString;
        this.zzb = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzach.class == obj.getClass()) {
            zzach zzachVar = (zzach) obj;
            if (zzeg.zzS(this.zza, zzachVar.zza) && Arrays.equals(this.zzb, zzachVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        return Arrays.hashCode(this.zzb) + (((str != null ? str.hashCode() : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31);
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final String toString() {
        return wo1.u(this.zzf, ": owner=", this.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeByteArray(this.zzb);
    }

    public zzach(String str, byte[] bArr) {
        super("PRIV");
        this.zza = str;
        this.zzb = bArr;
    }
}