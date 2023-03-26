package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.p7700g.p99005.r2;
import com.p7700g.p99005.z1;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@16.0.0 */
/* loaded from: classes2.dex */
public final class zze {
    @GuardedBy("MessengerIpcClient.class")
    @z1
    private static zze zza;
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    @GuardedBy("this")
    private zzf zzd = new zzf(this);
    @GuardedBy("this")
    private int zze = 1;

    @r2
    private zze(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzc = scheduledExecutorService;
        this.zzb = context.getApplicationContext();
    }

    public static synchronized zze zza(Context context) {
        zze zzeVar;
        synchronized (zze.class) {
            if (zza == null) {
                zza = new zze(context, com.google.android.gms.internal.cloudmessaging.zza.zza().zza(1, new NamedThreadFactory("MessengerIpcClient"), com.google.android.gms.internal.cloudmessaging.zzf.zzb));
            }
            zzeVar = zza;
        }
        return zzeVar;
    }

    public final Task<Bundle> zzb(int i, Bundle bundle) {
        return zza(new zzs(zza(), 1, bundle));
    }

    public final Task<Void> zza(int i, Bundle bundle) {
        return zza(new zzn(zza(), 2, bundle));
    }

    private final synchronized <T> Task<T> zza(zzq<T> zzqVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String.valueOf(zzqVar).length();
        }
        if (!this.zzd.zza((zzq<?>) zzqVar)) {
            zzf zzfVar = new zzf(this);
            this.zzd = zzfVar;
            zzfVar.zza((zzq<?>) zzqVar);
        }
        return zzqVar.zzb.getTask();
    }

    private final synchronized int zza() {
        int i;
        i = this.zze;
        this.zze = i + 1;
        return i;
    }
}