package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzffn {
    public final /* synthetic */ zzffx zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzffn(zzffx zzffxVar, Object obj, List list, zzffm zzffmVar) {
        this.zza = zzffxVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzffw zza(Callable callable) {
        zzfvm zzfvmVar;
        zzfvb zzc = zzfvc.zzc(this.zzc);
        zzfvl zza = zzc.zza(zzffl.zza, zzcfv.zzf);
        zzffx zzffxVar = this.zza;
        Object obj = this.zzb;
        List list = this.zzc;
        zzfvmVar = zzffxVar.zzb;
        return new zzffw(zzffxVar, obj, zza, list, zzc.zza(callable, zzfvmVar));
    }
}