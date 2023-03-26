package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.p7700g.p99005.z1;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzexp extends com.google.android.gms.ads.internal.client.zzbr implements com.google.android.gms.ads.internal.overlay.zzo, zzbca {
    @GuardedBy("this")
    @z1
    public zzcvo zza;
    private final zzcnf zzb;
    private final Context zzc;
    private final String zze;
    private final zzexj zzf;
    private final zzexh zzg;
    private final zzcfo zzh;
    @GuardedBy("this")
    @z1
    private zzcup zzj;
    private AtomicBoolean zzd = new AtomicBoolean();
    @GuardedBy("this")
    private long zzi = -1;

    public zzexp(zzcnf zzcnfVar, Context context, String str, zzexj zzexjVar, zzexh zzexhVar, zzcfo zzcfoVar) {
        this.zzb = zzcnfVar;
        this.zzc = context;
        this.zze = str;
        this.zzf = zzexjVar;
        this.zzg = zzexhVar;
        this.zzh = zzcfoVar;
        zzexhVar.zzo(this);
    }

    private final synchronized void zzp(int i) {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzg.zzj();
            zzcup zzcupVar = this.zzj;
            if (zzcupVar != null) {
                com.google.android.gms.ads.internal.zzt.zzb().zze(zzcupVar);
            }
            if (this.zza != null) {
                long j = -1;
                if (this.zzi != -1) {
                    j = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zzi;
                }
                this.zza.zze(j, i);
            }
            zzx();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        Preconditions.checkMainThread("setAdSize must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbcj zzbcjVar) {
        this.zzg.zzr(zzbcjVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzf.zzl(zzwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzL(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbye zzbyeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzO(zzbiu zzbiuVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbyh zzbyhVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcar zzcarVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzU(com.google.android.gms.ads.internal.client.zzff zzffVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzW(IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzX() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzY() {
        return this.zzf.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final boolean zzZ() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzbca
    public final void zza() {
        zzp(3);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c A[Catch: all -> 0x0087, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:9:0x0025, B:13:0x0042, B:15:0x004d, B:18:0x0052, B:21:0x0064, B:25:0x006c, B:12:0x003d), top: B:31:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) throws RemoteException {
        boolean z;
        if (((Boolean) zzbjn.zzd.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                z = true;
                if (this.zzh.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziw)).intValue() || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
                com.google.android.gms.ads.internal.zzt.zzp();
                if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc) && zzlVar.zzs == null) {
                    zzcfi.zzg("Failed to load the ad because app ID is missing.");
                    this.zzg.zza(zzfdc.zzd(4, null, null));
                    return false;
                }
                if (zzY()) {
                    this.zzd = new AtomicBoolean();
                    return this.zzf.zzb(zzlVar, this.zze, new zzexn(this), new zzexo(this));
                }
                return false;
            }
        }
        z = false;
        if (this.zzh.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziw)).intValue()) {
        }
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzt.zzp();
        if (com.google.android.gms.ads.internal.util.zzs.zzD(this.zzc)) {
            zzcfi.zzg("Failed to load the ad because app ID is missing.");
            this.zzg.zza(zzfdc.zzd(4, null, null));
            return false;
        }
        if (zzY()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzi = com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime();
        int zza = this.zza.zza();
        if (zza <= 0) {
            return;
        }
        zzcup zzcupVar = new zzcup(this.zzb.zzB(), com.google.android.gms.ads.internal.zzt.zzA());
        this.zzj = zzcupVar;
        zzcupVar.zzd(zza, new Runnable() { // from class: com.google.android.gms.internal.ads.zzexm
            @Override // java.lang.Runnable
            public final void run() {
                zzexp.this.zzo();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbC() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbK() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbr() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final synchronized void zze() {
        zzcvo zzcvoVar = this.zza;
        if (zzcvoVar != null) {
            zzcvoVar.zze(com.google.android.gms.ads.internal.zzt.zzA().elapsedRealtime() - this.zzi, 1);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzf(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            zzp(2);
        } else if (i2 == 1) {
            zzp(4);
        } else if (i2 == 2) {
            zzp(3);
        } else if (i2 != 3) {
        } else {
            zzp(6);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbf zzi() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbz zzj() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdh zzk() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized com.google.android.gms.ads.internal.client.zzdk zzl() {
        return null;
    }

    public final /* synthetic */ void zzm() {
        zzp(5);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        return null;
    }

    @VisibleForTesting
    public final void zzo() {
        this.zzb.zzA().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexl
            @Override // java.lang.Runnable
            public final void run() {
                zzexp.this.zzm();
            }
        });
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzr() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzs() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzcvo zzcvoVar = this.zza;
        if (zzcvoVar != null) {
            zzcvoVar.zzV();
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }
}