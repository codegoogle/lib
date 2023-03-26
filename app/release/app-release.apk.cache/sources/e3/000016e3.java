package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import android.widget.FrameLayout;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzble;
import com.google.android.gms.internal.ads.zzbli;
import com.google.android.gms.internal.ads.zzbna;
import com.google.android.gms.internal.ads.zzbyy;
import com.google.android.gms.internal.ads.zzbza;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaq extends zzav {
    public final /* synthetic */ FrameLayout zza;
    public final /* synthetic */ FrameLayout zzb;
    public final /* synthetic */ Context zzc;
    public final /* synthetic */ zzau zzd;

    public zzaq(zzau zzauVar, FrameLayout frameLayout, FrameLayout frameLayout2, Context context) {
        this.zzd = zzauVar;
        this.zza = frameLayout;
        this.zzb = frameLayout2;
        this.zzc = context;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        zzau.zzs(this.zzc, "native_ad_view_delegate");
        return new zzet();
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzh(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb));
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    @z1
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        zzbza zzbzaVar;
        zzbna zzbnaVar;
        zzbhz.zzc(this.zzc);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzif)).booleanValue()) {
            try {
                return zzble.zzbB(((zzbli) zzcfm.zzb(this.zzc, "com.google.android.gms.ads.ChimeraNativeAdViewDelegateCreatorImpl", zzap.zza)).zze(ObjectWrapper.wrap(this.zzc), ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), 221908000));
            } catch (RemoteException | zzcfl | NullPointerException e) {
                this.zzd.zzh = zzbyy.zza(this.zzc);
                zzbzaVar = this.zzd.zzh;
                zzbzaVar.zzd(e, "ClientApiBroker.createNativeAdViewDelegate");
                return null;
            }
        }
        zzbnaVar = this.zzd.zzd;
        return zzbnaVar.zza(this.zzc, this.zza, this.zzb);
    }
}