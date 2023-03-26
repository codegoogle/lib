package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzao extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzau zzb;

    public zzao(zzau zzauVar, Context context) {
        this.zzb = zzauVar;
        this.zza = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza, "mobile_ads_settings");
        return new zzes();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzg(ObjectWrapper.wrap(this.zza), 221908000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    @z1
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbza zzbzaVar;
        zzek zzekVar;
        zzbhz.zzc(this.zza);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzif)).booleanValue()) {
            try {
                IBinder zze = ((zzcn) zzcfm.zzb(this.zza, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzan.zza)).zze(ObjectWrapper.wrap(this.zza), 221908000);
                if (zze == null) {
                    return null;
                }
                IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
                return queryLocalInterface instanceof zzcm ? (zzcm) queryLocalInterface : new zzck(zze);
            } catch (RemoteException | zzcfl | NullPointerException e) {
                this.zzb.zzh = zzbyy.zza(this.zza);
                zzbzaVar = this.zzb.zzh;
                zzbzaVar.zzd(e, "ClientApiBroker.getMobileAdsSettingsManager");
                return null;
            }
        }
        zzekVar = this.zzb.zzc;
        return zzekVar.zza(this.zza);
    }
}