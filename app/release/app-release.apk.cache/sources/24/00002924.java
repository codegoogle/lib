package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfbk {
    private final Clock zza;
    private final Object zzb = new Object();
    @GuardedBy("lock")
    private volatile int zzd = 1;
    private volatile long zzc = 0;

    public zzfbk(Clock clock) {
        this.zza = clock;
    }

    private final void zze() {
        long currentTimeMillis = this.zza.currentTimeMillis();
        synchronized (this.zzb) {
            if (this.zzd == 3) {
                if (this.zzc + ((Long) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzeU)).longValue() <= currentTimeMillis) {
                    this.zzd = 1;
                }
            }
        }
    }

    private final void zzf(int i, int i2) {
        zze();
        long currentTimeMillis = this.zza.currentTimeMillis();
        synchronized (this.zzb) {
            if (this.zzd != i) {
                return;
            }
            this.zzd = i2;
            if (this.zzd == 3) {
                this.zzc = currentTimeMillis;
            }
        }
    }

    public final void zza() {
        zzf(2, 3);
    }

    public final void zzb(boolean z) {
        if (z) {
            zzf(1, 2);
        } else {
            zzf(2, 1);
        }
    }

    public final boolean zzc() {
        boolean z;
        synchronized (this.zzb) {
            zze();
            z = this.zzd == 3;
        }
        return z;
    }

    public final boolean zzd() {
        boolean z;
        synchronized (this.zzb) {
            zze();
            z = this.zzd == 2;
        }
        return z;
    }
}