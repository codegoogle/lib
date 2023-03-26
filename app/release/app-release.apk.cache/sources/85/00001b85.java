package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzacl extends zzacb {
    public static final Parcelable.Creator<zzacl> CREATOR = new zzack();
    @z1
    public final String zza;
    public final String zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzacl(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zza = parcel.readString();
        this.zzb = parcel.readString();
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzacl.class == obj.getClass()) {
            zzacl zzaclVar = (zzacl) obj;
            if (this.zzf.equals(zzaclVar.zzf) && zzeg.zzS(this.zza, zzaclVar.zza) && zzeg.zzS(this.zzb, zzaclVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int x = wo1.x(this.zzf, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
        String str = this.zza;
        int hashCode = (x + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.zzb;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzacb
    public final String toString() {
        return wo1.u(this.zzf, ": url=", this.zzb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    public zzacl(String str, @z1 String str2, String str3) {
        super(str);
        this.zza = str2;
        this.zzb = str3;
    }
}