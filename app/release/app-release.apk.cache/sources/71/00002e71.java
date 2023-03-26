package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import com.p7700g.p99005.e2;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@e2(29)
/* loaded from: classes2.dex */
public final class zzok {
    public final /* synthetic */ zzom zza;
    private final Handler zzb = new Handler();
    private final AudioTrack.StreamEventCallback zzc;

    public zzok(zzom zzomVar) {
        this.zza = zzomVar;
        this.zzc = new zzoj(this, zzomVar);
    }

    public final void zza(AudioTrack audioTrack) {
        final Handler handler = this.zzb;
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zzoi
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.zzc);
    }

    public final void zzb(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}