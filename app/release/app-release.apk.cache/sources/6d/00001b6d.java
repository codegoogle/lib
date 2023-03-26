package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzabo extends zzacb {
    public static final Parcelable.Creator<zzabo> CREATOR = new zzabn();
    public final byte[] zza;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzabo(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = zzeg.zza;
        this.zza = (byte[]) zzeg.zzG(parcel.createByteArray());
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzabo.class == obj.getClass()) {
            zzabo zzaboVar = (zzabo) obj;
            if (this.zzf.equals(zzaboVar.zzf) && Arrays.equals(this.zza, zzaboVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza) + wo1.x(this.zzf, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzf);
        parcel.writeByteArray(this.zza);
    }

    public zzabo(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }
}