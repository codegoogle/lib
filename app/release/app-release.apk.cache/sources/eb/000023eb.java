package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzddz extends zzdhc implements com.google.android.gms.ads.internal.overlay.zzo {
    public zzddz(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        zzo(zzddv.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbC() {
        zzo(zzddu.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbK() {
        zzo(zzddy.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzbr() {
        zzo(zzddt.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        zzo(zzddw.zza);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzf(final int i) {
        zzo(new zzdhb() { // from class: com.google.android.gms.internal.ads.zzddx
            @Override // com.google.android.gms.internal.ads.zzdhb
            public final void zza(Object obj) {
                ((com.google.android.gms.ads.internal.overlay.zzo) obj).zzf(i);
            }
        });
    }
}