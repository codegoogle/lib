package com.google.android.gms.internal.ads;

import com.p7700g.p99005.z1;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzss extends zzrj {
    private static final zzbb zza;
    private final zzsc[] zzb;
    private final zzci[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfsf zzf;
    private int zzg;
    private long[][] zzh;
    @z1
    private zzsr zzi;
    private final zzrl zzj;

    static {
        zzah zzahVar = new zzah();
        zzahVar.zza("MergingMediaSource");
        zza = zzahVar.zzc();
    }

    public zzss(boolean z, boolean z2, zzsc... zzscVarArr) {
        zzrl zzrlVar = new zzrl();
        this.zzb = zzscVarArr;
        this.zzj = zzrlVar;
        this.zzd = new ArrayList(Arrays.asList(zzscVarArr));
        this.zzg = -1;
        this.zzc = new zzci[zzscVarArr.length];
        this.zzh = new long[0];
        this.zze = new HashMap();
        this.zzf = zzfsm.zzb(8).zzb(2).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final void zzB(zzry zzryVar) {
        zzsq zzsqVar = (zzsq) zzryVar;
        int i = 0;
        while (true) {
            zzsc[] zzscVarArr = this.zzb;
            if (i >= zzscVarArr.length) {
                return;
            }
            zzscVarArr[i].zzB(zzsqVar.zzn(i));
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final zzry zzD(zzsa zzsaVar, zzvv zzvvVar, long j) {
        int length = this.zzb.length;
        zzry[] zzryVarArr = new zzry[length];
        int zza2 = this.zzc[0].zza(zzsaVar.zza);
        for (int i = 0; i < length; i++) {
            zzryVarArr[i] = this.zzb[i].zzD(zzsaVar.zzc(this.zzc[i].zzf(zza2)), zzvvVar, j - this.zzh[zza2][i]);
        }
        return new zzsq(this.zzj, this.zzh[zza2], zzryVarArr, null);
    }

    @Override // com.google.android.gms.internal.ads.zzrj, com.google.android.gms.internal.ads.zzrb
    public final void zzn(@z1 zzfs zzfsVar) {
        super.zzn(zzfsVar);
        for (int i = 0; i < this.zzb.length; i++) {
            zzy(Integer.valueOf(i), this.zzb[i]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj, com.google.android.gms.internal.ads.zzrb
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    @z1
    public final /* bridge */ /* synthetic */ zzsa zzv(Object obj, zzsa zzsaVar) {
        if (((Integer) obj).intValue() == 0) {
            return zzsaVar;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzrj, com.google.android.gms.internal.ads.zzsc
    public final void zzw() throws IOException {
        zzsr zzsrVar = this.zzi;
        if (zzsrVar == null) {
            super.zzw();
            return;
        }
        throw zzsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final /* bridge */ /* synthetic */ void zzx(Object obj, zzsc zzscVar, zzci zzciVar) {
        int i;
        if (this.zzi != null) {
            return;
        }
        if (this.zzg == -1) {
            i = zzciVar.zzb();
            this.zzg = i;
        } else {
            int zzb = zzciVar.zzb();
            int i2 = this.zzg;
            if (zzb != i2) {
                this.zzi = new zzsr(0);
                return;
            }
            i = i2;
        }
        if (this.zzh.length == 0) {
            this.zzh = (long[][]) Array.newInstance(long.class, i, this.zzc.length);
        }
        this.zzd.remove(zzscVar);
        this.zzc[((Integer) obj).intValue()] = zzciVar;
        if (this.zzd.isEmpty()) {
            zzo(this.zzc[0]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzsc
    public final zzbb zzz() {
        zzsc[] zzscVarArr = this.zzb;
        return zzscVarArr.length > 0 ? zzscVarArr[0].zzz() : zza;
    }
}