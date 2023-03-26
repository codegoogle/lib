package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import com.p7700g.p99005.wo1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzavq extends Exception {
    public final String zza;
    public final String zzb;
    public final String zzc;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzavq(zzart zzartVar, Throwable th, boolean z, int i) {
        super("Decoder init failed: [" + i + "], " + r5, th);
        String valueOf = String.valueOf(zzartVar);
        this.zza = zzartVar.zzf;
        this.zzb = null;
        this.zzc = wo1.l("com.google.android.exoplayer.MediaCodecTrackRenderer_neg_", Math.abs(i));
    }

    public zzavq(zzart zzartVar, Throwable th, boolean z, String str) {
        super(wo1.v("Decoder init failed: ", str, ", ", String.valueOf(zzartVar)), th);
        this.zza = zzartVar.zzf;
        this.zzb = str;
        String str2 = null;
        if (zzazo.zza >= 21 && (th instanceof MediaCodec.CodecException)) {
            str2 = ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        this.zzc = str2;
    }
}