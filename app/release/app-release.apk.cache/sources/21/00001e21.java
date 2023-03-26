package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import com.p7700g.p99005.z1;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbbd {
    @VisibleForTesting
    public int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    @z1
    public final zzbbc zza(boolean z) {
        synchronized (this.zzb) {
            zzbbc zzbbcVar = null;
            if (this.zzc.isEmpty()) {
                zzcfi.zze("Queue empty");
                return null;
            }
            int i = 0;
            if (this.zzc.size() >= 2) {
                int i2 = Integer.MIN_VALUE;
                int i3 = 0;
                for (zzbbc zzbbcVar2 : this.zzc) {
                    int zzb = zzbbcVar2.zzb();
                    if (zzb > i2) {
                        i = i3;
                    }
                    int i4 = zzb > i2 ? zzb : i2;
                    if (zzb > i2) {
                        zzbbcVar = zzbbcVar2;
                    }
                    i3++;
                    i2 = i4;
                }
                this.zzc.remove(i);
                return zzbbcVar;
            }
            zzbbc zzbbcVar3 = (zzbbc) this.zzc.get(0);
            if (z) {
                this.zzc.remove(0);
            } else {
                zzbbcVar3.zzi();
            }
            return zzbbcVar3;
        }
    }

    public final void zzb(zzbbc zzbbcVar) {
        synchronized (this.zzb) {
            if (this.zzc.size() >= 10) {
                int size = this.zzc.size();
                zzcfi.zze("Queue is full, current size = " + size);
                this.zzc.remove(0);
            }
            int i = this.zza;
            this.zza = i + 1;
            zzbbcVar.zzj(i);
            zzbbcVar.zzn();
            this.zzc.add(zzbbcVar);
        }
    }

    public final boolean zzc(zzbbc zzbbcVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzbbc zzbbcVar2 = (zzbbc) it.next();
                if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzM()) {
                    if (zzbbcVar != zzbbcVar2 && zzbbcVar2.zzd().equals(zzbbcVar.zzd())) {
                        it.remove();
                        return true;
                    }
                } else if (!com.google.android.gms.ads.internal.zzt.zzo().zzh().zzN() && zzbbcVar != zzbbcVar2 && zzbbcVar2.zzf().equals(zzbbcVar.zzf())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final boolean zzd(zzbbc zzbbcVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzbbcVar);
        }
    }
}