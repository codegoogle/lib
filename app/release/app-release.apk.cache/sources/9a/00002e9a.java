package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzpy {
    private long zza;
    private long zzb;
    private boolean zzc;

    private final long zzd(long j) {
        return Math.max(0L, ((this.zzb - 529) * 1000000) / j) + this.zza;
    }

    public final long zza(zzad zzadVar) {
        return zzd(zzadVar.zzA);
    }

    public final long zzb(zzad zzadVar, zzgb zzgbVar) {
        if (this.zzb == 0) {
            this.zza = zzgbVar.zzd;
        }
        if (this.zzc) {
            return zzgbVar.zzd;
        }
        ByteBuffer byteBuffer = zzgbVar.zzb;
        Objects.requireNonNull(byteBuffer);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            i = (i << 8) | (byteBuffer.get(i2) & 255);
        }
        int zzc = zzzl.zzc(i);
        if (zzc == -1) {
            this.zzc = true;
            this.zzb = 0L;
            this.zza = zzgbVar.zzd;
            return zzgbVar.zzd;
        }
        long zzd = zzd(zzadVar.zzA);
        this.zzb += zzc;
        return zzd;
    }

    public final void zzc() {
        this.zza = 0L;
        this.zzb = 0L;
        this.zzc = false;
    }
}