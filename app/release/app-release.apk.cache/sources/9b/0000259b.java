package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzdtz {
    @GuardedBy("this")
    private final Map zza = new HashMap();

    @Nullable
    public final synchronized zzdty zza(String str) {
        return (zzdty) this.zza.get(str);
    }

    @Nullable
    public final zzdty zzb(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzdty zza = zza((String) it.next());
            if (zza != null) {
                return zza;
            }
        }
        return null;
    }

    public final String zzc(String str) {
        zzbwg zzbwgVar;
        zzdty zza = zza(str);
        return (zza == null || (zzbwgVar = zza.zzb) == null) ? "" : zzbwgVar.toString();
    }

    public final synchronized void zzd(String str, zzfcy zzfcyVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdty(str, zzfcyVar.zze(), zzfcyVar.zzf()));
        } catch (zzfci unused) {
        }
    }

    public final synchronized void zze(String str, zzbvt zzbvtVar) {
        if (this.zza.containsKey(str)) {
            return;
        }
        try {
            this.zza.put(str, new zzdty(str, zzbvtVar.zzf(), zzbvtVar.zzg()));
        } catch (Throwable unused) {
        }
    }
}