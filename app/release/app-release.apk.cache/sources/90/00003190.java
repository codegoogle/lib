package com.google.android.gms.tasks;

import com.p7700g.p99005.x1;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes2.dex */
public final class zzr<TResult> {
    private final Object zza = new Object();
    @GuardedBy("mLock")
    private Queue<zzq<TResult>> zzb;
    @GuardedBy("mLock")
    private boolean zzc;

    public final void zza(@x1 zzq<TResult> zzqVar) {
        synchronized (this.zza) {
            if (this.zzb == null) {
                this.zzb = new ArrayDeque();
            }
            this.zzb.add(zzqVar);
        }
    }

    public final void zzb(@x1 Task<TResult> task) {
        zzq<TResult> poll;
        synchronized (this.zza) {
            if (this.zzb != null && !this.zzc) {
                this.zzc = true;
                while (true) {
                    synchronized (this.zza) {
                        poll = this.zzb.poll();
                        if (poll == null) {
                            this.zzc = false;
                            return;
                        }
                    }
                    poll.zzd(task);
                }
            }
        }
    }
}