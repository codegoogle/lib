package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzyq implements zzzy {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzzy
    public final /* synthetic */ int zze(zzp zzpVar, int i, boolean z) {
        return zzzw.zza(this, zzpVar, i, true);
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final int zzf(zzp zzpVar, int i, boolean z, int i2) throws IOException {
        int zza = zzpVar.zza(this.zza, 0, Math.min(4096, i));
        if (zza == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final void zzk(zzad zzadVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final /* synthetic */ void zzq(zzdy zzdyVar, int i) {
        zzzw.zzb(this, zzdyVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final void zzr(zzdy zzdyVar, int i, int i2) {
        zzdyVar.zzG(i);
    }

    @Override // com.google.android.gms.internal.ads.zzzy
    public final void zzs(long j, int i, int i2, int i3, @z1 zzzx zzzxVar) {
    }
}