package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zznx extends Thread {
    public final /* synthetic */ AudioTrack zza;
    public final /* synthetic */ zzom zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zznx(zzom zzomVar, String str, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.zzb = zzomVar;
        this.zza = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ConditionVariable conditionVariable;
        try {
            this.zza.flush();
            this.zza.release();
        } finally {
            conditionVariable = this.zzb.zzf;
            conditionVariable.open();
        }
    }
}