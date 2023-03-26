package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import com.p7700g.p99005.e2;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzi {
    public static final zzi zza = new zzi(0, 0, 1, 1, 0, null);
    public static final zzl zzb = zze.zza;
    public final int zzc = 1;
    @z1
    private AudioAttributes zzd;

    public /* synthetic */ zzi(int i, int i2, int i3, int i4, int i5, zzh zzhVar) {
    }

    public final boolean equals(@z1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzi.class != obj.getClass()) {
            return false;
        }
        zzi zziVar = (zzi) obj;
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }

    @e2(21)
    public final AudioAttributes zza() {
        if (this.zzd == null) {
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
            int i = zzeg.zza;
            if (i >= 29) {
                zzf.zza(usage, 1);
            }
            if (i >= 32) {
                zzg.zza(usage, 0);
            }
            this.zzd = usage.build();
        }
        return this.zzd;
    }
}