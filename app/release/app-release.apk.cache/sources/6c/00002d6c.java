package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgpl extends zzgkm implements zzgmb {
    private zzgpl() {
        super(zzgpm.zzc());
    }

    public final zzgpl zza(String str) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgpm.zzd((zzgpm) this.zza, str);
        return this;
    }

    public final zzgpl zzb(long j) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgpm.zze((zzgpm) this.zza, j);
        return this;
    }

    public final zzgpl zzc(boolean z) {
        if (this.zzb) {
            zzap();
            this.zzb = false;
        }
        zzgpm.zzf((zzgpm) this.zza, z);
        return this;
    }

    public /* synthetic */ zzgpl(zzgoc zzgocVar) {
        super(zzgpm.zzc());
    }
}