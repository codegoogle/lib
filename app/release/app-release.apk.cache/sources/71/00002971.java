package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfeg implements zzfuy {
    public final /* synthetic */ zzfej zza;
    public final /* synthetic */ zzfek zzb;

    public zzfeg(zzfek zzfekVar, zzfej zzfejVar) {
        this.zzb = zzfekVar;
        this.zza = zzfejVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfuy
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i;
        Void r4 = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            arrayDeque = this.zzb.zzd;
            arrayDeque.addFirst(this.zza);
            zzfek zzfekVar = this.zzb;
            i = zzfekVar.zzf;
            if (i == 1) {
                zzfekVar.zzh();
            }
        }
    }
}