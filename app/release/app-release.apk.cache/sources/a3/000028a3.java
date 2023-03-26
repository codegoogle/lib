package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzewr implements zzemx {
    public final zzcnf zza;
    private final Context zzb;
    private final Executor zzc;
    private final zzexh zzd;
    private final zzeza zze;
    private final zzcfo zzf;
    private final ViewGroup zzg;
    private final zzfhu zzh;
    @GuardedBy("this")
    private final zzfcb zzi;
    @GuardedBy("this")
    @Nullable
    private zzfvl zzj;

    public zzewr(Context context, Executor executor, zzcnf zzcnfVar, zzeza zzezaVar, zzexh zzexhVar, zzfcb zzfcbVar, zzcfo zzcfoVar) {
        this.zzb = context;
        this.zzc = executor;
        this.zza = zzcnfVar;
        this.zze = zzezaVar;
        this.zzd = zzexhVar;
        this.zzi = zzfcbVar;
        this.zzf = zzcfoVar;
        this.zzg = new FrameLayout(context);
        this.zzh = zzcnfVar.zzy();
    }

    public static /* synthetic */ zzdbb zzd(zzewr zzewrVar, zzeyy zzeyyVar) {
        return zzewrVar.zzm(zzeyyVar);
    }

    public final synchronized zzdbb zzm(zzeyy zzeyyVar) {
        zzewq zzewqVar = (zzewq) zzeyyVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzgQ)).booleanValue()) {
            zzcvs zzcvsVar = new zzcvs(this.zzg);
            zzdbd zzdbdVar = new zzdbd();
            zzdbdVar.zzc(this.zzb);
            zzdbdVar.zzf(zzewqVar.zza);
            zzdbf zzg = zzdbdVar.zzg();
            zzdhd zzdhdVar = new zzdhd();
            zzdhdVar.zzc(this.zzd, this.zzc);
            zzdhdVar.zzl(this.zzd, this.zzc);
            return zzc(zzcvsVar, zzg, zzdhdVar.zzn());
        }
        zzexh zzi = zzexh.zzi(this.zzd);
        zzdhd zzdhdVar2 = new zzdhd();
        zzdhdVar2.zzb(zzi, this.zzc);
        zzdhdVar2.zzg(zzi, this.zzc);
        zzdhdVar2.zzh(zzi, this.zzc);
        zzdhdVar2.zzi(zzi, this.zzc);
        zzdhdVar2.zzc(zzi, this.zzc);
        zzdhdVar2.zzl(zzi, this.zzc);
        zzdhdVar2.zzm(zzi);
        zzcvs zzcvsVar2 = new zzcvs(this.zzg);
        zzdbd zzdbdVar2 = new zzdbd();
        zzdbdVar2.zzc(this.zzb);
        zzdbdVar2.zzf(zzewqVar.zza);
        return zzc(zzcvsVar2, zzdbdVar2.zzg(), zzdhdVar2.zzn());
    }

    @Override // com.google.android.gms.internal.ads.zzemx
    public final boolean zza() {
        zzfvl zzfvlVar = this.zzj;
        return (zzfvlVar == null || zzfvlVar.isDone()) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0045 A[Catch: all -> 0x00f4, TRY_LEAVE, TryCatch #0 {, blocks: (B:42:0x0001, B:44:0x0011, B:48:0x0026, B:53:0x0045, B:56:0x0056, B:60:0x005c, B:62:0x006c, B:64:0x0074, B:66:0x0089, B:68:0x00a2, B:70:0x00a6, B:71:0x00af, B:51:0x003e), top: B:77:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0056 A[Catch: all -> 0x00f4, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:42:0x0001, B:44:0x0011, B:48:0x0026, B:53:0x0045, B:56:0x0056, B:60:0x005c, B:62:0x006c, B:64:0x0074, B:66:0x0089, B:68:0x00a2, B:70:0x00a6, B:71:0x00af, B:51:0x003e), top: B:77:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzemx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized boolean zzb(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, zzemv zzemvVar, zzemw zzemwVar) throws RemoteException {
        boolean z;
        zzfhs zzfhsVar;
        if (((Boolean) zzbjn.zzd.zze()).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziv)).booleanValue()) {
                z = true;
                if (this.zzf.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziw)).intValue() || !z) {
                    Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
                }
                if (str != null) {
                    zzcfi.zzg("Ad unit ID should not be null for app open ad.");
                    this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzewl
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzewr.this.zzk();
                        }
                    });
                    return false;
                } else if (this.zzj != null) {
                    return false;
                } else {
                    if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
                        zzeza zzezaVar = this.zze;
                        if (zzezaVar.zzd() != null) {
                            zzfhs zzh = ((zzcvd) zzezaVar.zzd()).zzh();
                            zzh.zzh(7);
                            zzh.zzb(zzlVar.zzp);
                            zzfhsVar = zzh;
                            zzfcx.zza(this.zzb, zzlVar.zzf);
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue() && zzlVar.zzf) {
                                this.zza.zzk().zzl(true);
                            }
                            zzfcb zzfcbVar = this.zzi;
                            zzfcbVar.zzs(str);
                            zzfcbVar.zzr(com.google.android.gms.ads.internal.client.zzq.zzb());
                            zzfcbVar.zzE(zzlVar);
                            zzfcd zzG = zzfcbVar.zzG();
                            zzfhh zzb = zzfhg.zzb(this.zzb, zzfhr.zzf(zzG), 7, zzlVar);
                            zzewq zzewqVar = new zzewq(null);
                            zzewqVar.zza = zzG;
                            zzfvl zzc = this.zze.zzc(new zzezb(zzewqVar, null), new zzeyz() { // from class: com.google.android.gms.internal.ads.zzewm
                                @Override // com.google.android.gms.internal.ads.zzeyz
                                public final zzdbb zza(zzeyy zzeyyVar) {
                                    return zzewr.zzd(zzewr.this, zzeyyVar);
                                }
                            }, null);
                            this.zzj = zzc;
                            zzfvc.zzr(zzc, new zzewo(this, zzemwVar, zzfhsVar, zzb, zzewqVar), this.zzc);
                            return true;
                        }
                    }
                    zzfhsVar = null;
                    zzfcx.zza(this.zzb, zzlVar.zzf);
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzhv)).booleanValue()) {
                        this.zza.zzk().zzl(true);
                    }
                    zzfcb zzfcbVar2 = this.zzi;
                    zzfcbVar2.zzs(str);
                    zzfcbVar2.zzr(com.google.android.gms.ads.internal.client.zzq.zzb());
                    zzfcbVar2.zzE(zzlVar);
                    zzfcd zzG2 = zzfcbVar2.zzG();
                    zzfhh zzb2 = zzfhg.zzb(this.zzb, zzfhr.zzf(zzG2), 7, zzlVar);
                    zzewq zzewqVar2 = new zzewq(null);
                    zzewqVar2.zza = zzG2;
                    zzfvl zzc2 = this.zze.zzc(new zzezb(zzewqVar2, null), new zzeyz() { // from class: com.google.android.gms.internal.ads.zzewm
                        @Override // com.google.android.gms.internal.ads.zzeyz
                        public final zzdbb zza(zzeyy zzeyyVar) {
                            return zzewr.zzd(zzewr.this, zzeyyVar);
                        }
                    }, null);
                    this.zzj = zzc2;
                    zzfvc.zzr(zzc2, new zzewo(this, zzemwVar, zzfhsVar, zzb2, zzewqVar2), this.zzc);
                    return true;
                }
            }
        }
        z = false;
        if (this.zzf.zzc >= ((Integer) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zziw)).intValue()) {
        }
        Preconditions.checkMainThread("loadAd must be called on the main UI thread.");
        if (str != null) {
        }
    }

    public abstract zzdbb zzc(zzcvs zzcvsVar, zzdbf zzdbfVar, zzdhf zzdhfVar);

    public final /* synthetic */ void zzk() {
        this.zzd.zza(zzfdc.zzd(6, null, null));
    }

    public final void zzl(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi.zzt(zzwVar);
    }
}