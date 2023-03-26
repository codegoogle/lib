package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
@ParametersAreNonnullByDefault
@Deprecated
/* loaded from: classes2.dex */
public final class zzbim {
    private final Map zza = new HashMap();
    private final zzbio zzb;

    public zzbim(zzbio zzbioVar) {
        this.zzb = zzbioVar;
    }

    public final zzbio zza() {
        return this.zzb;
    }

    public final void zzb(String str, @z1 zzbil zzbilVar) {
        this.zza.put(str, zzbilVar);
    }

    public final void zzc(String str, String str2, long j) {
        zzbio zzbioVar = this.zzb;
        zzbil zzbilVar = (zzbil) this.zza.get(str2);
        String[] strArr = {str};
        if (zzbilVar != null) {
            zzbioVar.zze(zzbilVar, j, strArr);
        }
        this.zza.put(str, new zzbil(j, null, null));
    }
}