package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p7700g.p99005.z1;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzmo implements zzms {
    public static final zzfpj zza = zzmm.zza;
    private static final Random zzb = new Random();
    private final zzch zzc;
    private final zzcf zzd;
    private final HashMap zze;
    private final zzfpj zzf;
    private zzmr zzg;
    private zzci zzh;
    @z1
    private String zzi;

    public zzmo() {
        throw null;
    }

    private final zzmn zzk(int i, @z1 zzsa zzsaVar) {
        int i2;
        zzmn zzmnVar = null;
        long j = Long.MAX_VALUE;
        for (zzmn zzmnVar2 : this.zze.values()) {
            zzmnVar2.zzg(i, zzsaVar);
            if (zzmnVar2.zzj(i, zzsaVar)) {
                long zzb2 = zzmn.zzb(zzmnVar2);
                if (zzb2 == -1 || zzb2 < j) {
                    zzmnVar = zzmnVar2;
                    j = zzb2;
                } else if (i2 == 0) {
                    int i3 = zzeg.zza;
                    if (zzmn.zzc(zzmnVar) != null && zzmn.zzc(zzmnVar2) != null) {
                        zzmnVar = zzmnVar2;
                    }
                }
            }
        }
        if (zzmnVar == null) {
            String zzl = zzl();
            zzmn zzmnVar3 = new zzmn(this, zzl, i, zzsaVar);
            this.zze.put(zzl, zzmnVar3);
            return zzmnVar3;
        }
        return zzmnVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzl() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzm(zzki zzkiVar) {
        if (zzkiVar.zzb.zzo()) {
            this.zzi = null;
            return;
        }
        zzmn zzmnVar = (zzmn) this.zze.get(this.zzi);
        zzmn zzk = zzk(zzkiVar.zzc, zzkiVar.zzd);
        this.zzi = zzmn.zzd(zzk);
        zzh(zzkiVar);
        zzsa zzsaVar = zzkiVar.zzd;
        if (zzsaVar == null || !zzsaVar.zzb()) {
            return;
        }
        if (zzmnVar != null && zzmn.zzb(zzmnVar) == zzkiVar.zzd.zzd && zzmn.zzc(zzmnVar) != null && zzmn.zzc(zzmnVar).zzb == zzkiVar.zzd.zzb && zzmn.zzc(zzmnVar).zzc == zzkiVar.zzd.zzc) {
            return;
        }
        zzsa zzsaVar2 = zzkiVar.zzd;
        zzmn.zzd(zzk(zzkiVar.zzc, new zzsa(zzsaVar2.zza, zzsaVar2.zzd)));
        zzmn.zzd(zzk);
    }

    @Override // com.google.android.gms.internal.ads.zzms
    @z1
    public final synchronized String zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final synchronized String zze(zzci zzciVar, zzsa zzsaVar) {
        return zzmn.zzd(zzk(zzciVar.zzn(zzsaVar.zza, this.zzd).zzd, zzsaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final synchronized void zzf(zzki zzkiVar) {
        zzmr zzmrVar;
        this.zzi = null;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmn zzmnVar = (zzmn) it.next();
            it.remove();
            if (zzmn.zzi(zzmnVar) && (zzmrVar = this.zzg) != null) {
                zzmrVar.zzd(zzkiVar, zzmn.zzd(zzmnVar), false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final void zzg(zzmr zzmrVar) {
        this.zzg = zzmrVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003d, code lost:
        if (r10.zzd.zzd < com.google.android.gms.internal.ads.zzmn.zzb(r0)) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzms
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzh(zzki zzkiVar) {
        Objects.requireNonNull(this.zzg);
        if (zzkiVar.zzb.zzo()) {
            return;
        }
        zzmn zzmnVar = (zzmn) this.zze.get(this.zzi);
        if (zzkiVar.zzd != null && zzmnVar != null) {
            if (zzmn.zzb(zzmnVar) == -1) {
                if (zzmn.zza(zzmnVar) == zzkiVar.zzc) {
                }
                return;
            }
        }
        zzmn zzk = zzk(zzkiVar.zzc, zzkiVar.zzd);
        if (this.zzi == null) {
            this.zzi = zzmn.zzd(zzk);
        }
        zzsa zzsaVar = zzkiVar.zzd;
        if (zzsaVar != null && zzsaVar.zzb()) {
            zzmn zzk2 = zzk(zzkiVar.zzc, new zzsa(zzsaVar.zza, zzsaVar.zzd, zzsaVar.zzb));
            if (!zzmn.zzi(zzk2)) {
                zzmn.zzf(zzk2, true);
                zzkiVar.zzb.zzn(zzkiVar.zzd.zza, this.zzd);
                this.zzd.zzh(zzkiVar.zzd.zzb);
                Math.max(0L, zzeg.zzz(0L) + zzeg.zzz(0L));
                zzmn.zzd(zzk2);
            }
        }
        if (!zzmn.zzi(zzk)) {
            zzmn.zzf(zzk, true);
            zzmn.zzd(zzk);
        }
        if (!zzmn.zzd(zzk).equals(this.zzi) || zzmn.zzh(zzk)) {
            return;
        }
        zzmn.zze(zzk, true);
        this.zzg.zzc(zzkiVar, zzmn.zzd(zzk));
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final synchronized void zzi(zzki zzkiVar, int i) {
        Objects.requireNonNull(this.zzg);
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmn zzmnVar = (zzmn) it.next();
            if (zzmnVar.zzk(zzkiVar)) {
                it.remove();
                if (zzmn.zzi(zzmnVar)) {
                    boolean equals = zzmn.zzd(zzmnVar).equals(this.zzi);
                    boolean z = false;
                    if (i == 0 && equals && zzmn.zzh(zzmnVar)) {
                        z = true;
                    }
                    if (equals) {
                        this.zzi = null;
                    }
                    this.zzg.zzd(zzkiVar, zzmn.zzd(zzmnVar), z);
                }
            }
        }
        zzm(zzkiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzms
    public final synchronized void zzj(zzki zzkiVar) {
        Objects.requireNonNull(this.zzg);
        zzci zzciVar = this.zzh;
        this.zzh = zzkiVar.zzb;
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzmn zzmnVar = (zzmn) it.next();
            if (!zzmnVar.zzl(zzciVar, this.zzh) || zzmnVar.zzk(zzkiVar)) {
                it.remove();
                if (zzmn.zzi(zzmnVar)) {
                    if (zzmn.zzd(zzmnVar).equals(this.zzi)) {
                        this.zzi = null;
                    }
                    this.zzg.zzd(zzkiVar, zzmn.zzd(zzmnVar), false);
                }
            }
        }
        zzm(zzkiVar);
    }

    public zzmo(zzfpj zzfpjVar) {
        this.zzf = zzfpjVar;
        this.zzc = new zzch();
        this.zzd = new zzcf();
        this.zze = new HashMap();
        this.zzh = zzci.zza;
    }
}