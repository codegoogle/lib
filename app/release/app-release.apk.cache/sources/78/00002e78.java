package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzor implements zznn {
    public final /* synthetic */ zzos zza;

    public /* synthetic */ zzor(zzos zzosVar, zzoq zzoqVar) {
        this.zza = zzosVar;
    }

    @Override // com.google.android.gms.internal.ads.zznn
    public final void zza(Exception exc) {
        zzdn.zza("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzos.zzU(this.zza).zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zznn
    public final void zzb() {
        zzos zzosVar = this.zza;
        if (zzos.zzT(zzosVar) != null) {
            zzos.zzT(zzosVar).zzb();
        }
    }
}