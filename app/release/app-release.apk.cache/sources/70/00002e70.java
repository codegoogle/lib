package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzoj extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ zzom zza;
    public final /* synthetic */ zzok zzb;

    public zzoj(zzok zzokVar, zzom zzomVar) {
        this.zzb = zzokVar;
        this.zza = zzomVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        AudioTrack audioTrack2;
        zznn zznnVar;
        boolean z;
        zznn zznnVar2;
        audioTrack2 = this.zzb.zza.zzq;
        zzcw.zzf(audioTrack == audioTrack2);
        zzom zzomVar = this.zzb.zza;
        zznnVar = zzomVar.zzn;
        if (zznnVar != null) {
            z = zzomVar.zzO;
            if (z) {
                zznnVar2 = zzomVar.zzn;
                zznnVar2.zzb();
            }
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        AudioTrack audioTrack2;
        zznn zznnVar;
        boolean z;
        zznn zznnVar2;
        audioTrack2 = this.zzb.zza.zzq;
        zzcw.zzf(audioTrack == audioTrack2);
        zzom zzomVar = this.zzb.zza;
        zznnVar = zzomVar.zzn;
        if (zznnVar != null) {
            z = zzomVar.zzO;
            if (z) {
                zznnVar2 = zzomVar.zzn;
                zznnVar2.zzb();
            }
        }
    }
}