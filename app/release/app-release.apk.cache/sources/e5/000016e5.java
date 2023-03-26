package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzblk;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzbnb;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;
import com.p7700g.p99005.z1;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzas extends zzav {
    public final /* synthetic */ View zza;
    public final /* synthetic */ HashMap zzb;
    public final /* synthetic */ HashMap zzc;
    public final /* synthetic */ zzau zzd;

    public zzas(zzau zzauVar, View view, HashMap hashMap, HashMap hashMap2) {
        this.zzd = zzauVar;
        this.zza = view;
        this.zzb = hashMap;
        this.zzc = hashMap2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzeu();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzi(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc));
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    @z1
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbza zzbzaVar;
        zzbnb zzbnbVar;
        zzbhz.zzc(this.zza.getContext());
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzif)).booleanValue()) {
            try {
                return zzblk.zze(((zzblo) zzcfm.zzb(this.zza.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", zzar.zza)).zze(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
            } catch (RemoteException | zzcfl | NullPointerException e) {
                this.zzd.zzh = zzbyy.zza(this.zza.getContext());
                zzbzaVar = this.zzd.zzh;
                zzbzaVar.zzd(e, "ClientApiBroker.createNativeAdViewHolderDelegate");
                return null;
            }
        }
        zzbnbVar = this.zzd.zzg;
        return zzbnbVar.zza(this.zza, this.zzb, this.zzc);
    }
}