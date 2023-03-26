package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzahi implements zzyr {
    public static final zzyy zza = zzahf.zza;
    private final List zzb;
    private final zzdy zzc;
    private final SparseIntArray zzd;
    private final zzahl zze;
    private final SparseArray zzf;
    private final SparseBooleanArray zzg;
    private final SparseBooleanArray zzh;
    private final zzahe zzi;
    private zzahd zzj;
    private zzyu zzk;
    private int zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;

    public zzahi() {
        this(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0194, code lost:
        if (r1 == false) goto L78;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        ?? r3;
        long j;
        boolean z;
        long zzd = zzysVar.zzd();
        if (this.zzm) {
            if (zzd != -1) {
                zzahe zzaheVar = this.zzi;
                if (!zzaheVar.zzd()) {
                    return zzaheVar.zza(zzysVar, zzzrVar, this.zzq);
                }
            }
            if (this.zzn) {
                j = 0;
            } else {
                this.zzn = true;
                zzahe zzaheVar2 = this.zzi;
                if (zzaheVar2.zzb() != -9223372036854775807L) {
                    j = 0;
                    zzahd zzahdVar = new zzahd(zzaheVar2.zzc(), zzaheVar2.zzb(), zzd, this.zzq, 112800);
                    this.zzj = zzahdVar;
                    this.zzk.zzL(zzahdVar.zzb());
                } else {
                    j = 0;
                    this.zzk.zzL(new zzzt(zzaheVar2.zzb(), 0L));
                }
            }
            if (this.zzo) {
                z = false;
                this.zzo = false;
                zzc(j, j);
                if (zzysVar.zzf() != j) {
                    zzzrVar.zza = j;
                    return 1;
                }
            } else {
                z = false;
            }
            zzahd zzahdVar2 = this.zzj;
            r3 = z;
            if (zzahdVar2 != null) {
                r3 = z;
                if (zzahdVar2.zze()) {
                    return zzahdVar2.zza(zzysVar, zzzrVar);
                }
            }
        } else {
            r3 = 0;
        }
        zzdy zzdyVar = this.zzc;
        byte[] zzH = zzdyVar.zzH();
        if (9400 - zzdyVar.zzc() < 188) {
            int zza2 = zzdyVar.zza();
            if (zza2 > 0) {
                System.arraycopy(zzH, zzdyVar.zzc(), zzH, r3, zza2);
            }
            this.zzc.zzD(zzH, zza2);
        }
        while (true) {
            zzdy zzdyVar2 = this.zzc;
            if (zzdyVar2.zza() < 188) {
                int zzd2 = zzdyVar2.zzd();
                int zza3 = zzysVar.zza(zzH, zzd2, 9400 - zzd2);
                if (zza3 == -1) {
                    return -1;
                }
                this.zzc.zzE(zzd2 + zza3);
            } else {
                int zzc = zzdyVar2.zzc();
                int zzd3 = zzdyVar2.zzd();
                int zza4 = zzaho.zza(zzdyVar2.zzH(), zzc, zzd3);
                this.zzc.zzF(zza4);
                int i = zza4 + 188;
                if (i > zzd3) {
                    this.zzp = (zza4 - zzc) + this.zzp;
                } else {
                    this.zzp = r3;
                }
                zzdy zzdyVar3 = this.zzc;
                int zzd4 = zzdyVar3.zzd();
                if (i > zzd4) {
                    return r3;
                }
                int zze = zzdyVar3.zze();
                if ((8388608 & zze) != 0) {
                    this.zzc.zzF(i);
                    return r3;
                }
                int i2 = (4194304 & zze) != 0 ? 1 : 0;
                int i3 = (zze >> 8) & 8191;
                int i4 = zze & 32;
                zzahn zzahnVar = (zze & 16) != 0 ? (zzahn) this.zzf.get(i3) : null;
                if (zzahnVar == null) {
                    this.zzc.zzF(i);
                    return r3;
                }
                int i5 = zze & 15;
                int i6 = this.zzd.get(i3, i5 - 1);
                this.zzd.put(i3, i5);
                if (i6 == i5) {
                    this.zzc.zzF(i);
                    return r3;
                }
                if (i5 != ((i6 + 1) & 15)) {
                    zzahnVar.zzc();
                }
                if (i4 != 0) {
                    int zzk = this.zzc.zzk();
                    i2 |= (this.zzc.zzk() & 64) != 0 ? 2 : 0;
                    this.zzc.zzG(zzk - 1);
                }
                boolean z2 = this.zzm;
                if (z2 || !this.zzh.get(i3, r3)) {
                    this.zzc.zzE(i);
                    zzahnVar.zza(this.zzc, i2);
                    this.zzc.zzE(zzd4);
                }
                if (this.zzm && zzd != -1) {
                    this.zzo = true;
                }
                this.zzc.zzF(i);
                return r3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzk = zzyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j, long j2) {
        zzahd zzahdVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            zzee zzeeVar = (zzee) this.zzb.get(i);
            if (zzeeVar.zze() != -9223372036854775807L) {
                long zzc = zzeeVar.zzc();
                if (zzc != -9223372036854775807L) {
                    if (zzc != 0) {
                        if (zzc == j2) {
                        }
                    }
                }
            }
            zzeeVar.zzf(j2);
        }
        if (j2 != 0 && (zzahdVar = this.zzj) != null) {
            zzahdVar.zzd(j2);
        }
        this.zzc.zzC(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzf.size(); i2++) {
            ((zzahn) this.zzf.valueAt(i2)).zzc();
        }
        this.zzp = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r2 = r2 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzd(zzys zzysVar) throws IOException {
        byte[] zzH = this.zzc.zzH();
        zzyl zzylVar = (zzyl) zzysVar;
        zzylVar.zzm(zzH, 0, 940, false);
        int i = 0;
        while (i < 188) {
            for (int i2 = 0; i2 < 5; i2++) {
                if (zzH[(i2 * 188) + i] != 71) {
                    break;
                }
            }
            zzylVar.zzo(i, false);
            return true;
        }
        return false;
    }

    public zzahi(int i) {
        this(1, 0, 112800);
    }

    public zzahi(int i, int i2, int i3) {
        zzee zzeeVar = new zzee(0L);
        this.zze = new zzafx(0);
        this.zzb = Collections.singletonList(zzeeVar);
        this.zzc = new zzdy(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzg = sparseBooleanArray;
        this.zzh = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzf = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzi = new zzahe(112800);
        this.zzk = zzyu.zza;
        this.zzq = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzf.put(sparseArray2.keyAt(i4), (zzahn) sparseArray2.valueAt(i4));
        }
        this.zzf.put(0, new zzaha(new zzahg(this)));
    }
}