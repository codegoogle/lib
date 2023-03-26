package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.p7700g.p99005.z1;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public abstract class zzvj extends zzvm {
    @z1
    private zzvi zza;

    public abstract Pair zzb(zzvi zzviVar, int[][][] iArr, int[] iArr2, zzsa zzsaVar, zzci zzciVar) throws zzgt;

    @Override // com.google.android.gms.internal.ads.zzvm
    public final zzvn zzj(zzju[] zzjuVarArr, zzty zztyVar, zzsa zzsaVar, zzci zzciVar) throws zzgt {
        boolean z;
        int[] iArr;
        int[] iArr2 = new int[3];
        zzck[][] zzckVarArr = new zzck[3];
        int[][][] iArr3 = new int[3][];
        for (int i = 0; i < 3; i++) {
            int i2 = zztyVar.zzc;
            zzckVarArr[i] = new zzck[i2];
            iArr3[i] = new int[i2];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzjuVarArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zztyVar.zzc) {
            zzck zzb = zztyVar.zzb(i5);
            int i6 = zzb.zzd;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i3) {
                zzju zzjuVar = zzjuVarArr[i7];
                int i10 = 0;
                for (int i11 = 0; i11 <= 0; i11++) {
                    i10 = Math.max(i10, zzjuVar.zzO(zzb.zzb(i11)) & 7);
                }
                boolean z3 = iArr2[i7] == 0;
                if (i10 > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = i10;
                } else if (i10 == i9 && i6 == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = i10;
                    z2 = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                iArr = new int[1];
            } else {
                zzju zzjuVar2 = zzjuVarArr[i8];
                int[] iArr5 = new int[1];
                for (int i12 = 0; i12 <= 0; i12++) {
                    iArr5[i12] = zzjuVar2.zzO(zzb.zzb(i12));
                }
                iArr = iArr5;
            }
            int i13 = iArr2[i8];
            zzckVarArr[i8][i13] = zzb;
            iArr3[i8][i13] = iArr;
            iArr2[i8] = i13 + 1;
            i5++;
            i3 = 2;
        }
        zzty[] zztyVarArr = new zzty[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i14 = 0;
        while (i14 < i3) {
            int i15 = iArr2[i14];
            zztyVarArr[i14] = new zzty((zzck[]) zzeg.zzad(zzckVarArr[i14], i15));
            iArr3[i14] = (int[][]) zzeg.zzad(iArr3[i14], i15);
            strArr[i14] = zzjuVarArr[i14].zzK();
            iArr6[i14] = zzjuVarArr[i14].zzb();
            i14++;
            i3 = 2;
        }
        zzvi zzviVar = new zzvi(strArr, iArr6, zztyVarArr, iArr4, iArr3, new zzty((zzck[]) zzeg.zzad(zzckVarArr[2], iArr2[2])));
        Pair zzb2 = zzb(zzviVar, iArr3, iArr4, zzsaVar, zzciVar);
        zzvk[] zzvkVarArr = (zzvk[]) zzb2.second;
        List[] listArr = new List[zzvkVarArr.length];
        for (int i16 = 0; i16 < zzvkVarArr.length; i16++) {
            zzvk zzvkVar = zzvkVarArr[i16];
            listArr[i16] = zzvkVar != null ? zzfrj.zzp(zzvkVar) : zzfrj.zzo();
        }
        zzfrg zzfrgVar = new zzfrg();
        for (int i17 = 0; i17 < 2; i17++) {
            zzty zzd = zzviVar.zzd(i17);
            List list = listArr[i17];
            for (int i18 = 0; i18 < zzd.zzc; i18++) {
                zzck zzb3 = zzd.zzb(i18);
                boolean z4 = zzviVar.zza(i17, i18, false) != 0;
                int i19 = zzb3.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                for (int i20 = 0; i20 <= 0; i20++) {
                    iArr7[i20] = zzviVar.zzb(i17, i18, i20) & 7;
                    int i21 = 0;
                    while (true) {
                        if (i21 >= list.size()) {
                            z = false;
                            break;
                        }
                        zzvk zzvkVar2 = (zzvk) list.get(i21);
                        if (zzvkVar2.zze().equals(zzb3) && zzvkVar2.zzb(i20) != -1) {
                            z = true;
                            break;
                        }
                        i21++;
                    }
                    zArr[i20] = z;
                }
                zzfrgVar.zze(new zzcs(zzb3, z4, iArr7, zArr));
            }
        }
        zzty zze = zzviVar.zze();
        for (int i22 = 0; i22 < zze.zzc; i22++) {
            zzck zzb4 = zze.zzb(i22);
            int i23 = zzb4.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            zzfrgVar.zze(new zzcs(zzb4, false, iArr8, new boolean[1]));
        }
        return new zzvn((zzjv[]) zzb2.first, (zzvg[]) zzb2.second, new zzct(zzfrgVar.zzg()), zzviVar);
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final void zzk(@z1 Object obj) {
        this.zza = (zzvi) obj;
    }
}