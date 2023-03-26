package com.google.android.gms.internal.ads;

import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfeq {
    private final zzfej zza;
    private final zzfvl zzb;
    @GuardedBy("this")
    private boolean zzc = false;
    @GuardedBy("this")
    private boolean zzd = false;

    public zzfeq(final zzfdo zzfdoVar, final zzfei zzfeiVar, final zzfej zzfejVar) {
        this.zza = zzfejVar;
        this.zzb = zzfvc.zzg(zzfvc.zzn(zzfeiVar.zza(zzfejVar), new zzfuj() { // from class: com.google.android.gms.internal.ads.zzfeo
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzfeq.this.zzb(zzfeiVar, zzfdoVar, zzfejVar, (zzfdx) obj);
            }
        }, zzfejVar.zzb()), Exception.class, new zzfuj() { // from class: com.google.android.gms.internal.ads.zzfep
            @Override // com.google.android.gms.internal.ads.zzfuj
            public final zzfvl zza(Object obj) {
                return zzfeq.this.zzc(zzfeiVar, (Exception) obj);
            }
        }, zzfejVar.zzb());
    }

    public final synchronized zzfvl zza(zzfej zzfejVar) {
        if (!this.zzd && !this.zzc) {
            if (this.zza.zza() != null && zzfejVar.zza() != null && this.zza.zza().equals(zzfejVar.zza())) {
                this.zzc = true;
                return this.zzb;
            }
            return null;
        }
        return null;
    }

    public final /* synthetic */ zzfvl zzb(zzfei zzfeiVar, zzfdo zzfdoVar, zzfej zzfejVar, zzfdx zzfdxVar) throws Exception {
        synchronized (this) {
            this.zzd = true;
            zzfeiVar.zzb(zzfdxVar);
            if (!this.zzc) {
                zzfdoVar.zzd(zzfejVar.zza(), zzfdxVar);
                return zzfvc.zzi(null);
            }
            return zzfvc.zzi(new zzfeh(zzfdxVar, zzfejVar));
        }
    }

    public final /* synthetic */ zzfvl zzc(zzfei zzfeiVar, Exception exc) throws Exception {
        synchronized (this) {
            this.zzd = true;
            throw exc;
        }
    }

    public final synchronized void zzd(zzfuy zzfuyVar) {
        zzfvc.zzr(zzfvc.zzn(this.zzb, zzfen.zza, this.zza.zzb()), zzfuyVar, this.zza.zzb());
    }
}