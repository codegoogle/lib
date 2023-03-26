package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcvo extends zzcxx {
    @z1
    private final zzcli zzc;
    private final int zzd;
    private final Context zze;
    private final zzcuw zzf;
    private final zzdlg zzg;
    private final zzdip zzh;
    private final zzdcg zzi;
    private final boolean zzj;
    private boolean zzk;

    public zzcvo(zzcxw zzcxwVar, Context context, @z1 zzcli zzcliVar, int i, zzcuw zzcuwVar, zzdlg zzdlgVar, zzdip zzdipVar, zzdcg zzdcgVar) {
        super(zzcxwVar);
        this.zzk = false;
        this.zzc = zzcliVar;
        this.zze = context;
        this.zzd = i;
        this.zzf = zzcuwVar;
        this.zzg = zzdlgVar;
        this.zzh = zzdipVar;
        this.zzi = zzdcgVar;
        this.zzj = ((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzen)).booleanValue();
    }

    @Override // com.google.android.gms.internal.ads.zzcxx
    public final void zzV() {
        super.zzV();
        zzcli zzcliVar = this.zzc;
        if (zzcliVar != null) {
            zzcliVar.destroy();
        }
    }

    public final int zza() {
        return this.zzd;
    }

    public final void zzc(zzbca zzbcaVar) {
        zzcli zzcliVar = this.zzc;
        if (zzcliVar != null) {
            zzcliVar.zzaj(zzbcaVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
        r3 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzd(Activity activity, zzbcn zzbcnVar, boolean z) throws RemoteException {
        Activity activity2;
        if (activity == null) {
            activity2 = this.zze;
        }
        if (this.zzj) {
            this.zzh.zzb();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzay)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzp();
            if (com.google.android.gms.ads.internal.util.zzs.zzC(activity2)) {
                zzcfi.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzaz)).booleanValue()) {
                    new zzflf(activity2.getApplicationContext(), com.google.android.gms.ads.internal.zzt.zzt().zzb()).zza(this.zza.zzb.zzb.zzb);
                    return;
                }
                return;
            }
        }
        if (this.zzk) {
            zzcfi.zzj("App open interstitial ad is already visible.");
            this.zzi.zza(zzfdc.zzd(10, null, null));
        }
        if (this.zzk) {
            return;
        }
        try {
            this.zzg.zza(z, activity2, this.zzi);
            if (this.zzj) {
                this.zzh.zza();
            }
            this.zzk = true;
        } catch (zzdlf e) {
            this.zzi.zze(e);
        }
    }

    public final void zze(long j, int i) {
        this.zzf.zza(j, i);
    }
}