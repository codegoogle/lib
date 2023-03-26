package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzcfi;
import com.p7700g.p99005.z1;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzi extends RemoteCreator {
    public zzi() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof zzbp ? (zzbp) queryLocalInterface : new zzbp(iBinder);
    }

    @z1
    public final zzbo zza(Context context, String str, zzbua zzbuaVar) {
        try {
            IBinder zze = ((zzbp) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), str, zzbuaVar, 221908000);
            if (zze == null) {
                return null;
            }
            IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof zzbo ? (zzbo) queryLocalInterface : new zzbm(zze);
        } catch (RemoteException | RemoteCreator.RemoteCreatorException e) {
            zzcfi.zzk("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}