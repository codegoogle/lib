package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfmv {
    public final /* synthetic */ zzfmw zza;
    private final byte[] zzb;
    private int zzc;
    private int zzd;

    public /* synthetic */ zzfmv(zzfmw zzfmwVar, byte[] bArr, zzfmu zzfmuVar) {
        this.zza = zzfmwVar;
        this.zzb = bArr;
    }

    public final zzfmv zza(int i) {
        this.zzd = i;
        return this;
    }

    public final zzfmv zzb(int i) {
        this.zzc = i;
        return this;
    }

    public final synchronized void zzc() {
        try {
            zzfmw zzfmwVar = this.zza;
            if (zzfmwVar.zzb) {
                zzfmwVar.zza.zzj(this.zzb);
                this.zza.zza.zzi(this.zzc);
                this.zza.zza.zzg(this.zzd);
                this.zza.zza.zzh(null);
                this.zza.zza.zzf();
            }
        } catch (RemoteException unused) {
        }
    }
}