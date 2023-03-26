package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfvv implements Runnable {
    @CheckForNull
    public zzfvx zza;

    public zzfvv(zzfvx zzfvxVar) {
        this.zza = zzfvxVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0005, code lost:
        r1 = r0.zza;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zzfvl zzfvlVar;
        ScheduledFuture scheduledFuture;
        zzfvx zzfvxVar = this.zza;
        if (zzfvxVar == null || zzfvlVar == null) {
            return;
        }
        this.zza = null;
        if (zzfvlVar.isDone()) {
            zzfvxVar.zzt(zzfvlVar);
            return;
        }
        try {
            scheduledFuture = zzfvxVar.zzb;
            zzfvxVar.zzb = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                if (abs > 10) {
                    str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                }
            }
            zzfvxVar.zze(new zzfvw(str + ": " + zzfvlVar, null));
        } finally {
            zzfvlVar.cancel(true);
        }
    }
}