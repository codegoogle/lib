package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzam extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzbua zzc;
    public final /* synthetic */ zzau zzd;

    public zzam(zzau zzauVar, Context context, String str, zzbua zzbuaVar) {
        this.zzd = zzauVar;
        this.zza = context;
        this.zzb = str;
        this.zzc = zzbuaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "native_ad");
        return new zzeo();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzb(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221908000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    @z1
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbza zzbzaVar;
        zzi zziVar;
        zzbhz.zzc(this.zza);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzif)).booleanValue()) {
            try {
                IBinder zze = ((zzbp) zzcfm.zzb(this.zza, "com.google.android.gms.ads.ChimeraAdLoaderBuilderCreatorImpl", zzal.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, this.zzc, 221908000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
                return queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(zze);
            } catch (RemoteException | zzcfl | NullPointerException e) {
                this.zzd.zzh = zzbyy.zza(this.zza);
                zzbzaVar = this.zzd.zzh;
                zzbzaVar.zzd(e, "ClientApiBroker.createAdLoaderBuilder");
                return null;
            }
        }
        zziVar = this.zzd.zzb;
        return zziVar.zza(this.zza, this.zzb, this.zzc);
    }
}