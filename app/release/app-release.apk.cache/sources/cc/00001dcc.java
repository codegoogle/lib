package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzaya extends zzaye {
    private final SparseArray zza = new SparseArray();
    private final SparseBooleanArray zzb = new SparseBooleanArray();
    private zzaxy zzc;

    public abstract zzaxu[] zzb(zzarz[] zzarzVarArr, zzaxq[] zzaxqVarArr, int[][][] iArr) throws zzarf;

    @Override // com.google.android.gms.internal.ads.zzaye
    public final zzayf zzc(zzarz[] zzarzVarArr, zzaxq zzaxqVar) throws zzarf {
        int[] iArr;
        int[] iArr2 = new int[3];
        zzaxp[][] zzaxpVarArr = new zzaxp[3];
        int[][][] iArr3 = new int[3][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzaxqVar.zzb;
            zzaxpVarArr[i] = new zzaxp[i2];
            iArr3[i] = new int[i2];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            zzarzVarArr[i4].zze();
            iArr4[i4] = 4;
        }
        int i5 = 0;
        while (i5 < zzaxqVar.zzb) {
            zzaxp zzb = zzaxqVar.zzb(i5);
            int i6 = 0;
            int i7 = 0;
            int i8 = 2;
            while (true) {
                if (i6 >= i3) {
                    i6 = i8;
                    break;
                }
                zzarz zzarzVar = zzarzVarArr[i6];
                int i9 = 0;
                while (true) {
                    int i10 = zzb.zza;
                    if (i9 <= 0) {
                        int zzG = zzarzVar.zzG(zzb.zzb(i9)) & 3;
                        if (zzG > i7) {
                            if (zzG == 3) {
                                break;
                            }
                            i8 = i6;
                            i7 = zzG;
                        }
                        i9++;
                    }
                }
                i6++;
                i3 = 2;
            }
            if (i6 == 2) {
                int i11 = zzb.zza;
                iArr = new int[1];
            } else {
                zzarz zzarzVar2 = zzarzVarArr[i6];
                int i12 = zzb.zza;
                int[] iArr5 = new int[1];
                for (int i13 = 0; i13 <= 0; i13++) {
                    iArr5[i13] = zzarzVar2.zzG(zzb.zzb(i13));
                }
                iArr = iArr5;
            }
            int i14 = iArr2[i6];
            zzaxpVarArr[i6][i14] = zzb;
            iArr3[i6][i14] = iArr;
            iArr2[i6] = i14 + 1;
            i5++;
            i3 = 2;
        }
        zzaxq[] zzaxqVarArr = new zzaxq[2];
        int[] iArr6 = new int[2];
        int i15 = 0;
        for (int i16 = 2; i15 < i16; i16 = 2) {
            int i17 = iArr2[i15];
            zzaxqVarArr[i15] = new zzaxq((zzaxp[]) Arrays.copyOf(zzaxpVarArr[i15], i17));
            iArr3[i15] = (int[][]) Arrays.copyOf(iArr3[i15], i17);
            iArr6[i15] = zzarzVarArr[i15].zzc();
            i15++;
        }
        zzaxq zzaxqVar2 = new zzaxq((zzaxp[]) Arrays.copyOf(zzaxpVarArr[2], iArr2[2]));
        zzaxu[] zzb2 = zzb(zzarzVarArr, zzaxqVarArr, iArr3);
        int i18 = 0;
        for (int i19 = 2; i18 < i19; i19 = 2) {
            if (this.zzb.get(i18)) {
                zzb2[i18] = null;
            } else {
                zzaxq zzaxqVar3 = zzaxqVarArr[i18];
                Map map = (Map) this.zza.get(i18);
                if ((map == null ? null : (zzaxz) map.get(zzaxqVar3)) != null) {
                    throw null;
                }
            }
            i18++;
        }
        zzaxy zzaxyVar = new zzaxy(iArr6, zzaxqVarArr, iArr4, iArr3, zzaxqVar2);
        zzasa[] zzasaVarArr = new zzasa[2];
        for (int i20 = 0; i20 < 2; i20++) {
            zzasaVarArr[i20] = zzb2[i20] != null ? zzasa.zza : null;
        }
        return new zzayf(zzaxqVar, new zzayc(zzb2, null), zzaxyVar, zzasaVarArr);
    }

    @Override // com.google.android.gms.internal.ads.zzaye
    public final void zzd(Object obj) {
        this.zzc = (zzaxy) obj;
    }

    public final void zze(int i, boolean z) {
        if (this.zzb.get(i) == z) {
            return;
        }
        this.zzb.put(i, z);
        zzg();
    }
}