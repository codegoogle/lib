package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahp {
    private final List zza;
    private final zzzy[] zzb;

    public zzahp(List list) {
        this.zza = list;
        this.zzb = new zzzy[list.size()];
    }

    public final void zza(long j, zzdy zzdyVar) {
        if (zzdyVar.zza() < 9) {
            return;
        }
        int zze = zzdyVar.zze();
        int zze2 = zzdyVar.zze();
        int zzk = zzdyVar.zzk();
        if (zze == 434 && zze2 == 1195456820 && zzk == 3) {
            zzyi.zzb(j, zzdyVar, this.zzb);
        }
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
            zzab zzabVar = new zzab();
            zzabVar.zzH(zzahmVar.zzb());
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