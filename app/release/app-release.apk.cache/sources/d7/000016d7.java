package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbxo;
import com.google.android.gms.internal.ads.zzcfl;
import com.google.android.gms.internal.ads.zzcfm;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzae extends zzav {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzbua zzb;

    public zzae(zzau zzauVar, Context context, zzbua zzbuaVar) {
        this.zza = context;
        this.zzb = zzbuaVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zza() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    public final /* bridge */ /* synthetic */ Object zzb(zzcc zzccVar) throws RemoteException {
        return zzccVar.zzk(ObjectWrapper.wrap(this.zza), this.zzb, 221908000);
    }

    @Override // com.google.android.gms.ads.internal.client.zzav
    @z1
    public final /* bridge */ /* synthetic */ Object zzc() throws RemoteException {
        try {
            return ((zzbxo) zzcfm.zzb(this.zza, "com.google.android.gms.ads.DynamiteOfflineUtilsCreatorImpl", zzad.zza)).zze(ObjectWrapper.wrap(this.zza), this.zzb, 221908000);
        } catch (RemoteException | zzcfl | NullPointerException unused) {
            return null;
        }
    }
}