package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzqb {
    public final zzqf zza;
    public final MediaFormat zzb;
    public final zzad zzc;
    @z1
    public final Surface zzd;
    @z1
    public final MediaCrypto zze = null;

    private zzqb(zzqf zzqfVar, MediaFormat mediaFormat, zzad zzadVar, @z1 Surface surface, @z1 MediaCrypto mediaCrypto, int i) {
        this.zza = zzqfVar;
        this.zzb = mediaFormat;
        this.zzc = zzadVar;
        this.zzd = surface;
    }

    public static zzqb zza(zzqf zzqfVar, MediaFormat mediaFormat, zzad zzadVar, @z1 MediaCrypto mediaCrypto) {
        return new zzqb(zzqfVar, mediaFormat, zzadVar, null, null, 0);
    }

    public static zzqb zzb(zzqf zzqfVar, MediaFormat mediaFormat, zzad zzadVar, @z1 Surface surface, @z1 MediaCrypto mediaCrypto) {
        return new zzqb(zzqfVar, mediaFormat, zzadVar, surface, null, 0);
    }
}