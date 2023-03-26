package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import com.p7700g.p99005.e2;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@e2(24)
/* loaded from: classes2.dex */
public final class zzfx {
    private final MediaCodec.CryptoInfo zza;
    private final MediaCodec.CryptoInfo.Pattern zzb = new MediaCodec.CryptoInfo.Pattern(0, 0);

    public static /* bridge */ /* synthetic */ void zza(zzfx zzfxVar, int i, int i2) {
        zzfxVar.zzb.set(i, i2);
        zzfxVar.zza.setPattern(zzfxVar.zzb);
    }
}