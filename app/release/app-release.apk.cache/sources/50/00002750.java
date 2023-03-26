package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzekc implements zzddc {
    public boolean zza = false;
    public final /* synthetic */ zzefg zzb;
    public final /* synthetic */ zzcga zzc;
    public final /* synthetic */ zzekd zzd;

    public zzekc(zzekd zzekdVar, zzefg zzefgVar, zzcga zzcgaVar) {
        this.zzd = zzekdVar;
        this.zzb = zzefgVar;
        this.zzc = zzcgaVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzev)).booleanValue()) {
            i = 3;
        }
        this.zzc.zze(new zzefh(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final synchronized void zza(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, zzekd.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final synchronized void zzc(int i, @z1 String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzekd.zze(this.zzb.zza, i);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzddc
    public final synchronized void zzd() {
        this.zzc.zzd(null);
    }
}