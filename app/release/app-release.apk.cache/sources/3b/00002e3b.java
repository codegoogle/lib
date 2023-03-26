package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzmk {
    private final zzcf zza;
    private zzfrj zzb = zzfrj.zzo();
    private zzfrm zzc = zzfrm.zzd();
    @z1
    private zzsa zzd;
    private zzsa zze;
    private zzsa zzf;

    public zzmk(zzcf zzcfVar) {
        this.zza = zzcfVar;
    }

    @z1
    private static zzsa zzj(zzcb zzcbVar, zzfrj zzfrjVar, @z1 zzsa zzsaVar, zzcf zzcfVar) {
        zzci zzn = zzcbVar.zzn();
        int zzg = zzcbVar.zzg();
        Object zzf = zzn.zzo() ? null : zzn.zzf(zzg);
        int zzc = (zzcbVar.zzs() || zzn.zzo()) ? -1 : zzn.zzd(zzg, zzcfVar, false).zzc(zzeg.zzv(zzcbVar.zzl()));
        for (int i = 0; i < zzfrjVar.size(); i++) {
            zzsa zzsaVar2 = (zzsa) zzfrjVar.get(i);
            if (zzm(zzsaVar2, zzf, zzcbVar.zzs(), zzcbVar.zzd(), zzcbVar.zze(), zzc)) {
                return zzsaVar2;
            }
        }
        if (zzfrjVar.isEmpty() && zzsaVar != null) {
            if (zzm(zzsaVar, zzf, zzcbVar.zzs(), zzcbVar.zzd(), zzcbVar.zze(), zzc)) {
                return zzsaVar;
            }
        }
        return null;
    }

    private final void zzk(zzfrl zzfrlVar, @z1 zzsa zzsaVar, zzci zzciVar) {
        if (zzsaVar == null) {
            return;
        }
        if (zzciVar.zza(zzsaVar.zza) != -1) {
            zzfrlVar.zza(zzsaVar, zzciVar);
            return;
        }
        zzci zzciVar2 = (zzci) this.zzc.get(zzsaVar);
        if (zzciVar2 != null) {
            zzfrlVar.zza(zzsaVar, zzciVar2);
        }
    }

    private final void zzl(zzci zzciVar) {
        zzfrl zzfrlVar = new zzfrl();
        if (this.zzb.isEmpty()) {
            zzk(zzfrlVar, this.zze, zzciVar);
            if (!zzfoq.zza(this.zzf, this.zze)) {
                zzk(zzfrlVar, this.zzf, zzciVar);
            }
            if (!zzfoq.zza(this.zzd, this.zze) && !zzfoq.zza(this.zzd, this.zzf)) {
                zzk(zzfrlVar, this.zzd, zzciVar);
            }
        } else {
            for (int i = 0; i < this.zzb.size(); i++) {
                zzk(zzfrlVar, (zzsa) this.zzb.get(i), zzciVar);
            }
            if (!this.zzb.contains(this.zzd)) {
                zzk(zzfrlVar, this.zzd, zzciVar);
            }
        }
        this.zzc = zzfrlVar.zzc();
    }

    private static boolean zzm(zzsa zzsaVar, @z1 Object obj, boolean z, int i, int i2, int i3) {
        if (zzsaVar.zza.equals(obj)) {
            if (z) {
                if (zzsaVar.zzb != i || zzsaVar.zzc != i2) {
                    return false;
                }
            } else if (zzsaVar.zzb != -1 || zzsaVar.zze != i3) {
                return false;
            }
            return true;
        }
        return false;
    }

    @z1
    public final zzci zza(zzsa zzsaVar) {
        return (zzci) this.zzc.get(zzsaVar);
    }

    @z1
    public final zzsa zzb() {
        return this.zzd;
    }

    @z1
    public final zzsa zzc() {
        Object next;
        Object obj;
        if (this.zzb.isEmpty()) {
            return null;
        }
        zzfrj zzfrjVar = this.zzb;
        if (zzfrjVar instanceof List) {
            if (!zzfrjVar.isEmpty()) {
                obj = zzfrjVar.get(zzfrjVar.size() - 1);
            } else {
                throw new NoSuchElementException();
            }
        } else {
            Iterator<E> it = zzfrjVar.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            obj = next;
        }
        return (zzsa) obj;
    }

    @z1
    public final zzsa zzd() {
        return this.zze;
    }

    @z1
    public final zzsa zze() {
        return this.zzf;
    }

    public final void zzg(zzcb zzcbVar) {
        this.zzd = zzj(zzcbVar, this.zzb, this.zze, this.zza);
    }

    public final void zzh(List list, @z1 zzsa zzsaVar, zzcb zzcbVar) {
        this.zzb = zzfrj.zzm(list);
        if (!list.isEmpty()) {
            this.zze = (zzsa) list.get(0);
            Objects.requireNonNull(zzsaVar);
            this.zzf = zzsaVar;
        }
        if (this.zzd == null) {
            this.zzd = zzj(zzcbVar, this.zzb, this.zze, this.zza);
        }
        zzl(zzcbVar.zzn());
    }

    public final void zzi(zzcb zzcbVar) {
        this.zzd = zzj(zzcbVar, this.zzb, this.zze, this.zza);
        zzl(zzcbVar.zzn());
    }
}