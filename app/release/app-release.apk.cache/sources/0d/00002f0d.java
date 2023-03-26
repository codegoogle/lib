package com.google.android.gms.internal.ads;

import com.p7700g.p99005.zg2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzue extends zzug {
    private final zzvu zzd;
    private final zzfrj zze;
    private final zzcx zzf;

    public zzue(zzck zzckVar, int[] iArr, int i, zzvu zzvuVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzcx zzcxVar) {
        super(zzckVar, iArr, 0);
        this.zzd = zzvuVar;
        this.zze = zzfrj.zzm(list);
        this.zzf = zzcxVar;
    }

    public static /* bridge */ /* synthetic */ zzfrj zzf(zzvf[] zzvfVarArr) {
        int i;
        int i2;
        int[] iArr;
        ArrayList arrayList = new ArrayList();
        char c = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i3 >= 2) {
                break;
            }
            zzvf zzvfVar = zzvfVarArr[i3];
            if (zzvfVar != null && zzvfVar.zzb.length > 1) {
                zzfrg zzi = zzfrj.zzi();
                zzi.zze(new zzuc(0L, 0L));
                arrayList.add(zzi);
            } else {
                arrayList.add(null);
            }
            i3++;
        }
        long[][] jArr = new long[2];
        for (int i4 = 0; i4 < 2; i4++) {
            zzvf zzvfVar2 = zzvfVarArr[i4];
            if (zzvfVar2 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[zzvfVar2.zzb.length];
                int i5 = 0;
                while (true) {
                    if (i5 >= zzvfVar2.zzb.length) {
                        break;
                    }
                    jArr[i4][i5] = zzvfVar2.zza.zzb(iArr[i5]).zzi;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr2 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            long[] jArr3 = jArr[i6];
            jArr2[i6] = jArr3.length == 0 ? 0L : jArr3[0];
        }
        zzg(arrayList, jArr2);
        zzfru zza = zzfsm.zzc(zzfsr.zzc()).zzb(2).zza();
        int i7 = 0;
        while (i7 < i) {
            int length = jArr[i7].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr4 = jArr[i7];
                    int length2 = jArr4.length;
                    double d = zg2.s;
                    if (i8 >= length2) {
                        break;
                    }
                    long j = jArr4[i8];
                    if (j != -1) {
                        d = Math.log(j);
                    }
                    dArr[i8] = d;
                    i8++;
                }
                int i9 = length - 1;
                double d2 = dArr[i9] - dArr[c];
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = i10 + 1;
                    zza.zzs(Double.valueOf(d2 == zg2.s ? 1.0d : (((dArr[i10] + dArr[i11]) * 0.5d) - dArr[c]) / d2), Integer.valueOf(i7));
                    i10 = i11;
                    c = 0;
                }
            }
            i7++;
            c = 0;
            i = 2;
            i2 = 1;
        }
        zzfrj zzm = zzfrj.zzm(zza.zzt());
        for (int i12 = 0; i12 < zzm.size(); i12++) {
            int intValue = ((Integer) zzm.get(i12)).intValue();
            int i13 = iArr2[intValue] + 1;
            iArr2[intValue] = i13;
            jArr2[intValue] = jArr[intValue][i13];
            zzg(arrayList, jArr2);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j2 = jArr2[i14];
                jArr2[i14] = j2 + j2;
            }
        }
        zzg(arrayList, jArr2);
        zzfrg zzi2 = zzfrj.zzi();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            zzfrg zzfrgVar = (zzfrg) arrayList.get(i15);
            zzi2.zze(zzfrgVar == null ? zzfrj.zzo() : zzfrgVar.zzg());
        }
        return zzi2.zzg();
    }

    private static void zzg(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfrg zzfrgVar = (zzfrg) list.get(i2);
            if (zzfrgVar != null) {
                zzfrgVar.zze(new zzuc(j, jArr[i2]));
            }
        }
    }
}