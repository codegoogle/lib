package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzty {
    public static final zzty zza = new zzty(new zzck[0]);
    public static final zzl zzb = zztx.zza;
    public final int zzc;
    private final zzfrj zzd;
    private int zze;

    public zzty(zzck... zzckVarArr) {
        this.zzd = zzfrj.zzn(zzckVarArr);
        this.zzc = zzckVarArr.length;
        int i = 0;
        while (i < this.zzd.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.zzd.size(); i3++) {
                if (((zzck) this.zzd.get(i)).equals(this.zzd.get(i3))) {
                    zzdn.zza("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzty.class == obj.getClass()) {
            zzty zztyVar = (zzty) obj;
            if (this.zzc == zztyVar.zzc && this.zzd.equals(zztyVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i == 0) {
            int hashCode = this.zzd.hashCode();
            this.zze = hashCode;
            return hashCode;
        }
        return i;
    }

    public final int zza(zzck zzckVar) {
        int indexOf = this.zzd.indexOf(zzckVar);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final zzck zzb(int i) {
        return (zzck) this.zzd.get(i);
    }
}