package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzjm {
    private final zzmu zza;
    private final zzjl zze;
    private final zzsj zzf;
    private final zzpc zzg;
    private final HashMap zzh;
    private final Set zzi;
    private boolean zzj;
    @z1
    private zzfs zzk;
    private zztt zzl = new zztt(0);
    private final IdentityHashMap zzc = new IdentityHashMap();
    private final Map zzd = new HashMap();
    private final List zzb = new ArrayList();

    public zzjm(zzjl zzjlVar, zzkh zzkhVar, Handler handler, zzmu zzmuVar) {
        this.zza = zzmuVar;
        this.zze = zzjlVar;
        zzsj zzsjVar = new zzsj();
        this.zzf = zzsjVar;
        zzpc zzpcVar = new zzpc();
        this.zzg = zzpcVar;
        this.zzh = new HashMap();
        this.zzi = new HashSet();
        zzsjVar.zzb(handler, zzkhVar);
        zzpcVar.zzb(handler, zzkhVar);
    }

    private final void zzp(int i, int i2) {
        while (i < this.zzb.size()) {
            ((zzjk) this.zzb.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzq(zzjk zzjkVar) {
        zzjj zzjjVar = (zzjj) this.zzh.get(zzjkVar);
        if (zzjjVar != null) {
            zzjjVar.zza.zzi(zzjjVar.zzb);
        }
    }

    private final void zzr() {
        Iterator it = this.zzi.iterator();
        while (it.hasNext()) {
            zzjk zzjkVar = (zzjk) it.next();
            if (zzjkVar.zzc.isEmpty()) {
                zzq(zzjkVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzjk zzjkVar) {
        if (zzjkVar.zze && zzjkVar.zzc.isEmpty()) {
            zzjj zzjjVar = (zzjj) this.zzh.remove(zzjkVar);
            Objects.requireNonNull(zzjjVar);
            zzjjVar.zza.zzp(zzjjVar.zzb);
            zzjjVar.zza.zzs(zzjjVar.zzc);
            zzjjVar.zza.zzr(zzjjVar.zzc);
            this.zzi.remove(zzjkVar);
        }
    }

    private final void zzt(zzjk zzjkVar) {
        zzrv zzrvVar = zzjkVar.zza;
        zzsb zzsbVar = new zzsb() { // from class: com.google.android.gms.internal.ads.zzjh
            @Override // com.google.android.gms.internal.ads.zzsb
            public final void zza(zzsc zzscVar, zzci zzciVar) {
                zzjm.this.zze(zzscVar, zzciVar);
            }
        };
        zzji zzjiVar = new zzji(this, zzjkVar);
        this.zzh.put(zzjkVar, new zzjj(zzrvVar, zzsbVar, zzjiVar));
        zzrvVar.zzh(new Handler(zzeg.zzD(), null), zzjiVar);
        zzrvVar.zzg(new Handler(zzeg.zzD(), null), zzjiVar);
        zzrvVar.zzm(zzsbVar, this.zzk, this.zza);
    }

    private final void zzu(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            zzjk zzjkVar = (zzjk) this.zzb.remove(i2);
            this.zzd.remove(zzjkVar.zzb);
            zzp(i2, -zzjkVar.zza.zzA().zzc());
            zzjkVar.zze = true;
            if (this.zzj) {
                zzs(zzjkVar);
            }
        }
    }

    public final int zza() {
        return this.zzb.size();
    }

    public final zzci zzb() {
        if (this.zzb.isEmpty()) {
            return zzci.zza;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.zzb.size(); i2++) {
            zzjk zzjkVar = (zzjk) this.zzb.get(i2);
            zzjkVar.zzd = i;
            i += zzjkVar.zza.zzA().zzc();
        }
        return new zzjr(this.zzb, this.zzl, null);
    }

    public final /* synthetic */ void zze(zzsc zzscVar, zzci zzciVar) {
        this.zze.zzh();
    }

    public final void zzf(@z1 zzfs zzfsVar) {
        zzcw.zzf(!this.zzj);
        this.zzk = zzfsVar;
        for (int i = 0; i < this.zzb.size(); i++) {
            zzjk zzjkVar = (zzjk) this.zzb.get(i);
            zzt(zzjkVar);
            this.zzi.add(zzjkVar);
        }
        this.zzj = true;
    }

    public final void zzg() {
        for (zzjj zzjjVar : this.zzh.values()) {
            try {
                zzjjVar.zza.zzp(zzjjVar.zzb);
            } catch (RuntimeException e) {
                zzdn.zza("MediaSourceList", "Failed to release child source.", e);
            }
            zzjjVar.zza.zzs(zzjjVar.zzc);
            zzjjVar.zza.zzr(zzjjVar.zzc);
        }
        this.zzh.clear();
        this.zzi.clear();
        this.zzj = false;
    }

    public final void zzh(zzry zzryVar) {
        zzjk zzjkVar = (zzjk) this.zzc.remove(zzryVar);
        Objects.requireNonNull(zzjkVar);
        zzjkVar.zza.zzB(zzryVar);
        zzjkVar.zzc.remove(((zzrs) zzryVar).zza);
        if (!this.zzc.isEmpty()) {
            zzr();
        }
        zzs(zzjkVar);
    }

    public final boolean zzi() {
        return this.zzj;
    }

    public final zzci zzj(int i, List list, zztt zzttVar) {
        if (!list.isEmpty()) {
            this.zzl = zzttVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzjk zzjkVar = (zzjk) list.get(i2 - i);
                if (i2 > 0) {
                    zzjk zzjkVar2 = (zzjk) this.zzb.get(i2 - 1);
                    zzci zzA = zzjkVar2.zza.zzA();
                    zzjkVar.zzc(zzA.zzc() + zzjkVar2.zzd);
                } else {
                    zzjkVar.zzc(0);
                }
                zzp(i2, zzjkVar.zza.zzA().zzc());
                this.zzb.add(i2, zzjkVar);
                this.zzd.put(zzjkVar.zzb, zzjkVar);
                if (this.zzj) {
                    zzt(zzjkVar);
                    if (this.zzc.isEmpty()) {
                        this.zzi.add(zzjkVar);
                    } else {
                        zzq(zzjkVar);
                    }
                }
            }
        }
        return zzb();
    }

    public final zzci zzk(int i, int i2, int i3, zztt zzttVar) {
        zzcw.zzd(zza() >= 0);
        this.zzl = null;
        return zzb();
    }

    public final zzci zzl(int i, int i2, zztt zzttVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zza()) {
            z = true;
        }
        zzcw.zzd(z);
        this.zzl = zzttVar;
        zzu(i, i2);
        return zzb();
    }

    public final zzci zzm(List list, zztt zzttVar) {
        zzu(0, this.zzb.size());
        return zzj(this.zzb.size(), list, zzttVar);
    }

    public final zzci zzn(zztt zzttVar) {
        int zza = zza();
        if (zzttVar.zzc() != zza) {
            zzttVar = zzttVar.zzf().zzg(0, zza);
        }
        this.zzl = zzttVar;
        return zzb();
    }

    public final zzry zzo(zzsa zzsaVar, zzvv zzvvVar, long j) {
        Object obj = zzsaVar.zza;
        Object obj2 = ((Pair) obj).first;
        zzsa zzc = zzsaVar.zzc(((Pair) obj).second);
        zzjk zzjkVar = (zzjk) this.zzd.get(obj2);
        Objects.requireNonNull(zzjkVar);
        this.zzi.add(zzjkVar);
        zzjj zzjjVar = (zzjj) this.zzh.get(zzjkVar);
        if (zzjjVar != null) {
            zzjjVar.zza.zzk(zzjjVar.zzb);
        }
        zzjkVar.zzc.add(zzc);
        zzrs zzD = zzjkVar.zza.zzD(zzc, zzvvVar, j);
        this.zzc.put(zzD, zzjkVar);
        zzr();
        return zzD;
    }
}