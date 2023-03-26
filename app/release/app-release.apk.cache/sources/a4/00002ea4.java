package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import com.p7700g.p99005.wo1;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzqh extends Exception {
    public final String zza;
    public final boolean zzb;
    @z1
    public final zzqf zzc;
    @z1
    public final String zzd;
    @z1
    public final zzqh zze;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzqh(zzad zzadVar, @z1 Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + r13, th, r5, false, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_" + r11, null);
        String valueOf = String.valueOf(zzadVar);
        String str = zzadVar.zzm;
        int abs = Math.abs(i);
    }

    public static /* bridge */ /* synthetic */ zzqh zza(zzqh zzqhVar, zzqh zzqhVar2) {
        return new zzqh(zzqhVar.getMessage(), zzqhVar.getCause(), zzqhVar.zza, false, zzqhVar.zzc, zzqhVar.zzd, zzqhVar2);
    }

    public zzqh(zzad zzadVar, @z1 Throwable th, boolean z, zzqf zzqfVar) {
        this(wo1.v("Decoder init failed: ", zzqfVar.zza, ", ", String.valueOf(zzadVar)), th, zzadVar.zzm, false, zzqfVar, (zzeg.zza < 21 || !(th instanceof MediaCodec.CodecException)) ? null : ((MediaCodec.CodecException) th).getDiagnosticInfo(), null);
    }

    private zzqh(String str, @z1 Throwable th, String str2, boolean z, @z1 zzqf zzqfVar, @z1 String str3, @z1 zzqh zzqhVar) {
        super(str, th);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzqfVar;
        this.zzd = str3;
        this.zze = zzqhVar;
    }
}