package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.p7700g.p99005.z1;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzbym {
    @GuardedBy("InternalQueryInfoGenerator.class")
    private static zzcdz zza;
    private final Context zzb;
    private final AdFormat zzc;
    @z1
    private final com.google.android.gms.ads.internal.client.zzdr zzd;

    public zzbym(Context context, AdFormat adFormat, @z1 com.google.android.gms.ads.internal.client.zzdr zzdrVar) {
        this.zzb = context;
        this.zzc = adFormat;
        this.zzd = zzdrVar;
    }

    @z1
    public static zzcdz zza(Context context) {
        zzcdz zzcdzVar;
        synchronized (zzbym.class) {
            if (zza == null) {
                zza = com.google.android.gms.ads.internal.client.zzaw.zza().zzq(context, new zzbtx());
            }
            zzcdzVar = zza;
        }
        return zzcdzVar;
    }

    public final void zzb(QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.client.zzl zza2;
        zzcdz zza3 = zza(this.zzb);
        if (zza3 == null) {
            queryInfoGenerationCallback.onFailure("Internal Error, query info generator is null.");
            return;
        }
        IObjectWrapper wrap = ObjectWrapper.wrap(this.zzb);
        com.google.android.gms.ads.internal.client.zzdr zzdrVar = this.zzd;
        if (zzdrVar == null) {
            zza2 = new com.google.android.gms.ads.internal.client.zzm().zza();
        } else {
            zza2 = com.google.android.gms.ads.internal.client.zzp.zza.zza(this.zzb, zzdrVar);
        }
        try {
            zza3.zze(wrap, new zzced(null, this.zzc.name(), null, zza2), new zzbyl(this, queryInfoGenerationCallback));
        } catch (RemoteException unused) {
            queryInfoGenerationCallback.onFailure("Internal Error.");
        }
    }
}