package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahb {
    private final List zza;
    private final zzzy[] zzb;

    public zzahb(List list) {
        this.zza = list;
        this.zzb = new zzzy[list.size()];
    }

    public final void zza(long j, zzdy zzdyVar) {
        zzyi.zza(j, zzdyVar, this.zzb);
    }

    public final void zzb(zzyu zzyuVar, zzahm zzahmVar) {
        for (int i = 0; i < this.zzb.length; i++) {
            zzahmVar.zzc();
            zzzy zzv = zzyuVar.zzv(zzahmVar.zza(), 3);
            zzad zzadVar = (zzad) this.zza.get(i);
            String str = zzadVar.zzm;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzcw.zze(z, "Invalid closed caption mime type provided: ".concat(String.valueOf(str)));
            String str2 = zzadVar.zzb;
            if (str2 == null) {
                str2 = zzahmVar.zzb();
            }
            zzab zzabVar = new zzab();
            zzabVar.zzH(str2);
            zzabVar.zzS(str);
            zzabVar.zzU(zzadVar.zze);
            zzabVar.zzK(zzadVar.zzd);
            zzabVar.zzu(zzadVar.zzE);
            zzabVar.zzI(zzadVar.zzo);
            zzv.zzk(zzabVar.zzY());
            this.zzb[i] = zzv;
        }
    }
}