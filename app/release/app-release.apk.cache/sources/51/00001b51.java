package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaan extends zzaas {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaan(zzzy zzzyVar) {
        super(zzzyVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final boolean zza(zzdy zzdyVar) throws zzaar {
        if (!this.zzc) {
            int zzk = zzdyVar.zzk();
            int i = zzk >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzk >> 2) & 3];
                zzab zzabVar = new zzab();
                zzabVar.zzS("audio/mpeg");
                zzabVar.zzw(1);
                zzabVar.zzT(i2);
                this.zza.zzk(zzabVar.zzY());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                zzab zzabVar2 = new zzab();
                zzabVar2.zzS(str);
                zzabVar2.zzw(1);
                zzabVar2.zzT(8000);
                this.zza.zzk(zzabVar2.zzY());
                this.zzd = true;
            } else if (i != 10) {
                throw new zzaar(wo1.l("Audio format not supported: ", i));
            }
            this.zzc = true;
        } else {
            zzdyVar.zzG(1);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaas
    public final boolean zzb(zzdy zzdyVar, long j) throws zzbp {
        if (this.zze == 2) {
            int zza = zzdyVar.zza();
            this.zza.zzq(zzdyVar, zza);
            this.zza.zzs(j, 1, zza, 0, null);
            return true;
        }
        int zzk = zzdyVar.zzk();
        if (zzk == 0 && !this.zzd) {
            int zza2 = zzdyVar.zza();
            byte[] bArr = new byte[zza2];
            zzdyVar.zzB(bArr, 0, zza2);
            zzxs zza3 = zzxt.zza(bArr);
            zzab zzabVar = new zzab();
            zzabVar.zzS("audio/mp4a-latm");
            zzabVar.zzx(zza3.zzc);
            zzabVar.zzw(zza3.zzb);
            zzabVar.zzT(zza3.zza);
            zzabVar.zzI(Collections.singletonList(bArr));
            this.zza.zzk(zzabVar.zzY());
            this.zzd = true;
            return false;
        } else if (this.zze != 10 || zzk == 1) {
            int zza4 = zzdyVar.zza();
            this.zza.zzq(zzdyVar, zza4);
            this.zza.zzs(j, 1, zza4, 0, null);
            return true;
        } else {
            return false;
        }
    }
}