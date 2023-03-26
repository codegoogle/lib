package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzawu implements zzaxl {
    public final /* synthetic */ zzawv zza;
    private final int zzb;

    public zzawu(zzawv zzawvVar, int i) {
        this.zza = zzawvVar;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final int zzb(zzaru zzaruVar, zzato zzatoVar, boolean z) {
        return this.zza.zze(this.zzb, zzaruVar, zzatoVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zzc() throws IOException {
        this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final void zzd(long j) {
        this.zza.zzy(this.zzb, j);
    }

    @Override // com.google.android.gms.internal.ads.zzaxl
    public final boolean zze() {
        return this.zza.zzA(this.zzb);
    }
}