package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import com.p7700g.p99005.z1;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzfdp implements zzfdo {
    @GuardedBy("this")
    private final ConcurrentHashMap zza;
    private final zzfdv zzb;
    private final zzfdr zzc = new zzfdr();

    public zzfdp(zzfdv zzfdvVar) {
        this.zza = new ConcurrentHashMap(zzfdvVar.zzd);
        this.zzb = zzfdvVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzfdv> creator = zzfdv.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzay.zzc().zzb(zzbhz.zzfp)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzfdy) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfdn) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int zzb = ((zzfdn) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfdn) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzcfi.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfdo
    public final zzfdv zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfdo
    @z1
    public final synchronized zzfdx zzb(zzfdy zzfdyVar) {
        zzfdx zzfdxVar;
        zzfdn zzfdnVar = (zzfdn) this.zza.get(zzfdyVar);
        if (zzfdnVar != null) {
            zzfdxVar = zzfdnVar.zze();
            if (zzfdxVar == null) {
                this.zzc.zze();
            }
            zzfel zzf = zzfdnVar.zzf();
            if (zzfdxVar != null) {
                zzbeb zza = zzbeh.zza();
                zzbdz zza2 = zzbea.zza();
                zza2.zzd(2);
                zzbed zza3 = zzbee.zza();
                zza3.zza(zzf.zza);
                zza3.zzb(zzf.zzb);
                zza2.zza(zza3);
                zza.zza(zza2);
                zzfdxVar.zza.zzb().zzc().zze((zzbeh) zza.zzal());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzfdxVar = null;
        }
        return zzfdxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfdo
    @Deprecated
    public final zzfdy zzc(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zzfdz(zzlVar, str, new zzbzz(this.zzb.zza).zza().zzk, this.zzb.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfdo
    public final synchronized boolean zzd(zzfdy zzfdyVar, zzfdx zzfdxVar) {
        boolean zzh;
        zzfdn zzfdnVar = (zzfdn) this.zza.get(zzfdyVar);
        zzfdxVar.zzd = com.google.android.gms.ads.internal.zzt.zzA().currentTimeMillis();
        if (zzfdnVar == null) {
            zzfdv zzfdvVar = this.zzb;
            zzfdnVar = new zzfdn(zzfdvVar.zzd, zzfdvVar.zze * 1000);
            int size = this.zza.size();
            zzfdv zzfdvVar2 = this.zzb;
            if (size == zzfdvVar2.zzc) {
                int i = zzfdvVar2.zzg;
                int i2 = i - 1;
                zzfdy zzfdyVar2 = null;
                if (i != 0) {
                    long j = Long.MAX_VALUE;
                    if (i2 == 0) {
                        for (Map.Entry entry : this.zza.entrySet()) {
                            if (((zzfdn) entry.getValue()).zzc() < j) {
                                j = ((zzfdn) entry.getValue()).zzc();
                                zzfdyVar2 = (zzfdy) entry.getKey();
                            }
                        }
                        if (zzfdyVar2 != null) {
                            this.zza.remove(zzfdyVar2);
                        }
                    } else if (i2 == 1) {
                        for (Map.Entry entry2 : this.zza.entrySet()) {
                            if (((zzfdn) entry2.getValue()).zzd() < j) {
                                j = ((zzfdn) entry2.getValue()).zzd();
                                zzfdyVar2 = (zzfdy) entry2.getKey();
                            }
                        }
                        if (zzfdyVar2 != null) {
                            this.zza.remove(zzfdyVar2);
                        }
                    } else if (i2 == 2) {
                        int i3 = Integer.MAX_VALUE;
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfdn) entry3.getValue()).zza() < i3) {
                                i3 = ((zzfdn) entry3.getValue()).zza();
                                zzfdyVar2 = (zzfdy) entry3.getKey();
                            }
                        }
                        if (zzfdyVar2 != null) {
                            this.zza.remove(zzfdyVar2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    throw null;
                }
            }
            this.zza.put(zzfdyVar, zzfdnVar);
            this.zzc.zzd();
        }
        zzh = zzfdnVar.zzh(zzfdxVar);
        this.zzc.zzc();
        zzfdq zza = this.zzc.zza();
        zzfel zzf = zzfdnVar.zzf();
        zzbeb zza2 = zzbeh.zza();
        zzbdz zza3 = zzbea.zza();
        zza3.zzd(2);
        zzbef zza4 = zzbeg.zza();
        zza4.zza(zza.zza);
        zza4.zzb(zza.zzb);
        zza4.zzc(zzf.zzb);
        zza3.zzc(zza4);
        zza2.zza(zza3);
        zzfdxVar.zza.zzb().zzc().zzf((zzbeh) zza2.zzal());
        zzf();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzfdo
    public final synchronized boolean zze(zzfdy zzfdyVar) {
        zzfdn zzfdnVar = (zzfdn) this.zza.get(zzfdyVar);
        if (zzfdnVar != null) {
            return zzfdnVar.zzb() < this.zzb.zzd;
        }
        return true;
    }
}