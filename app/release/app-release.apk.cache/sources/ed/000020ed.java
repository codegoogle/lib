package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzcbq {
    @z1
    public static final zzcbe zza(Context context, String str, zzbua zzbuaVar) {
        try {
            IBinder zze = ((zzcbi) zzcfm.zzb(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", zzcbp.zza)).zze(ObjectWrapper.wrap(context), str, zzbuaVar, 221908000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof zzcbe ? (zzcbe) queryLocalInterface : new zzcbc(zze);
        } catch (RemoteException | zzcfl e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}