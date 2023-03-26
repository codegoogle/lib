package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.p7700g.p99005.z1;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdei extends zzdhc {
    private final ScheduledExecutorService zzb;
    private final Clock zzc;
    @GuardedBy("this")
    private long zzd;
    @GuardedBy("this")
    private long zze;
    @GuardedBy("this")
    private boolean zzf;
    @GuardedBy("this")
    @z1
    private ScheduledFuture zzg;

    public zzdei(ScheduledExecutorService scheduledExecutorService, Clock clock) {
        super(Collections.emptySet());
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = false;
        this.zzb = scheduledExecutorService;
        this.zzc = clock;
    }

    private final synchronized void zze(long j) {
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.zzg.cancel(true);
        }
        this.zzd = this.zzc.elapsedRealtime() + j;
        this.zzg = this.zzb.schedule(new zzdeh(this, null), j, TimeUnit.MILLISECONDS);
    }

    public final synchronized void zza() {
        this.zzf = false;
        zze(0L);
    }

    public final synchronized void zzb() {
        if (this.zzf) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzg;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            this.zze = -1L;
        } else {
            this.zzg.cancel(true);
            this.zze = this.zzd - this.zzc.elapsedRealtime();
        }
        this.zzf = true;
    }

    public final synchronized void zzc() {
        if (this.zzf) {
            if (this.zze > 0 && this.zzg.isCancelled()) {
                zze(this.zze);
            }
            this.zzf = false;
        }
    }

    public final synchronized void zzd(int i) {
        if (i <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i);
        if (this.zzf) {
            long j = this.zze;
            if (j <= 0 || millis >= j) {
                millis = j;
            }
            this.zze = millis;
            return;
        }
        long elapsedRealtime = this.zzc.elapsedRealtime();
        long j2 = this.zzd;
        if (elapsedRealtime > j2 || j2 - this.zzc.elapsedRealtime() > millis) {
            zze(millis);
        }
    }
}