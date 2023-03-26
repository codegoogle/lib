package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.p7700g.p99005.z1;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzemp extends com.google.android.gms.ads.internal.client.zzbr {
    private final com.google.android.gms.ads.internal.client.zzq zza;
    private final Context zzb;
    private final zzezo zzc;
    private final String zzd;
    private final zzcfo zze;
    private final zzemh zzf;
    private final zzfao zzg;
    @GuardedBy("this")
    @z1
    private zzdjz zzh;
    @GuardedBy("this")
    private boolean zzi = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaA)).booleanValue();

    public zzemp(Context context, com.google.android.gms.ads.internal.client.zzq zzqVar, String str, zzezo zzezoVar, zzemh zzemhVar, zzfao zzfaoVar, zzcfo zzcfoVar) {
        this.zza = zzqVar;
        this.zzd = str;
        this.zzb = context;
        this.zzc = zzezoVar;
        this.zzf = zzemhVar;
        this.zzg = zzfaoVar;
        this.zze = zzcfoVar;
    }

    private final synchronized boolean zze() {
        boolean z;
        zzdjz zzdjzVar = this.zzh;
        if (zzdjzVar != null) {
            z = zzdjzVar.zza() ? false : true;
        }
        return z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzA() {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzB() {
        Preconditions.checkMainThread("resume must be called on the main UI thread.");
        zzdjz zzdjzVar = this.zzh;
        if (zzdjzVar != null) {
            zzdjzVar.zzm().zzc(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzC(com.google.android.gms.ads.internal.client.zzbc zzbcVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzD(com.google.android.gms.ads.internal.client.zzbf zzbfVar) {
        Preconditions.checkMainThread("setAdListener must be called on the main UI thread.");
        this.zzf.zze(zzbfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzE(com.google.android.gms.ads.internal.client.zzbw zzbwVar) {
        Preconditions.checkMainThread("setAdMetadataListener must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzF(com.google.android.gms.ads.internal.client.zzq zzqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzG(com.google.android.gms.ads.internal.client.zzbz zzbzVar) {
        Preconditions.checkMainThread("setAppEventListener must be called on the main UI thread.");
        this.zzf.zzi(zzbzVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzH(zzbcj zzbcjVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzI(com.google.android.gms.ads.internal.client.zzw zzwVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzJ(com.google.android.gms.ads.internal.client.zzcg zzcgVar) {
        this.zzf.zzs(zzcgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzK(com.google.android.gms.ads.internal.client.zzdo zzdoVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzL(boolean z) {
        Preconditions.checkMainThread("setImmersiveMode must be called on the main UI thread.");
        this.zzi = z;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzM(zzbye zzbyeVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzN(boolean z) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzO(zzbiu zzbiuVar) {
        Preconditions.checkMainThread("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        this.zzc.zzi(zzbiuVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzP(com.google.android.gms.ads.internal.client.zzde zzdeVar) {
        Preconditions.checkMainThread("setPaidEventListener must be called on the main UI thread.");
        this.zzf.zzh(zzdeVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzQ(zzbyh zzbyhVar, String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzR(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzS(zzcar zzcarVar) {
        this.zzg.zzf(zzcarVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzT(String str) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzU(com.google.android.gms.ads.internal.client.zzff zzffVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzW(IObjectWrapper iObjectWrapper) {
        if (this.zzh == null) {
            zzcfi.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzk(zzfdc.zzd(9, null, null));
            return;
        }
        this.zzh.zzc(this.zzi, (Activity) ObjectWrapper.unwrap(iObjectWrapper));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzX() {
        Preconditions.checkMainThread("showInterstitial must be called on the main UI thread.");
        zzdjz zzdjzVar = this.zzh;
        if (zzdjzVar == null) {
            zzcfi.zzj("Interstitial can not be shown before loaded.");
            this.zzf.zzk(zzfdc.zzd(9, null, null));
            return;
        }
        zzdjzVar.zzc(this.zzi, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzY() {
        return this.zzc.zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized boolean zzZ() {
        Preconditions.checkMainThread("isLoaded must be called on the main UI thread.");
        return zze();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[Catch: all -> 0x008c, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0010, B:9:0x0025, B:13:0x0042, B:15:0x004e, B:17:0x0052, B:19:0x005b, B:22:0x0065, B:26:0x006d, B:12:0x003d), top: B:32:0x0001 }] */
    @Override // com.google.android.gms.ads.internal.client.zzbs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzaa(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        boolean z;
        if (((Boolean) zzbjn.zzf.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                z = true;
                if (this.zze.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziw)).intValue() || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
                com.google.android.gms.ads.internal.zzt.zzp();
                if (!com.google.android.gms.ads.internal.util.zzs.zzD(this.zzb) && zzlVar.zzs == null) {
                    zzcfi.zzg("Failed to load the ad because app ID is missing.");
                    zzemh zzemhVar = this.zzf;
                    if (zzemhVar != null) {
                        zzemhVar.zza(zzfdc.zzd(4, null, null));
                    }
                    return false;
                } else if (zze()) {
                    zzfcx.zza(this.zzb, zzlVar.zzf);
                    this.zzh = null;
                    return this.zzc.zzb(zzlVar, this.zzd, new zzezh(this.zza), new zzemo(this));
                } else {
                    return false;
                }
            }
        }
        z = false;
        if (this.zze.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziw)).intValue()) {
        }
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        com.google.android.gms.ads.internal.zzt.zzp();
        if (!com.google.android.gms.ads.internal.util.zzs.zzD(this.zzb)) {
        }
        if (zze()) {
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzab(com.google.android.gms.ads.internal.client.zzcd zzcdVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final Bundle zzd() {
        Preconditions.checkMainThread("getAdMetadata must be called on the main UI thread.");
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbf zzi() {
        return this.zzf.zzc();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzbz zzj() {
        return this.zzf.zzd();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    @z1
    public final synchronized com.google.android.gms.ads.internal.client.zzdh zzk() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfK)).booleanValue()) {
            zzdjz zzdjzVar = this.zzh;
            if (zzdjzVar == null) {
                return null;
            }
            return zzdjzVar.zzl();
        }
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final com.google.android.gms.ads.internal.client.zzdk zzl() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final IObjectWrapper zzn() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized String zzr() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    @z1
    public final synchronized String zzs() {
        zzdjz zzdjzVar = this.zzh;
        if (zzdjzVar == null || zzdjzVar.zzl() == null) {
            return null;
        }
        return zzdjzVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    @z1
    public final synchronized String zzt() {
        zzdjz zzdjzVar = this.zzh;
        if (zzdjzVar == null || zzdjzVar.zzl() == null) {
            return null;
        }
        return zzdjzVar.zzl().zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzx() {
        Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        zzdjz zzdjzVar = this.zzh;
        if (zzdjzVar != null) {
            zzdjzVar.zzm().zza(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final void zzy(com.google.android.gms.ads.internal.client.zzl zzlVar, com.google.android.gms.ads.internal.client.zzbi zzbiVar) {
        this.zzf.zzf(zzbiVar);
        zzaa(zzlVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbs
    public final synchronized void zzz() {
        Preconditions.checkMainThread("pause must be called on the main UI thread.");
        zzdjz zzdjzVar = this.zzh;
        if (zzdjzVar != null) {
            zzdjzVar.zzm().zzb(null);
        }
    }
}