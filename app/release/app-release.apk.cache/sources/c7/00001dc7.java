package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaxw extends zzaya {
    private final AtomicReference zza;

    public zzaxw() {
        this(null);
    }

    public static boolean zza(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    private static int zzh(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        } else if (i2 == -1) {
            return 1;
        } else {
            return i - i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaya
    public final zzaxu[] zzb(zzarz[] zzarzVarArr, zzaxq[] zzaxqVarArr, int[][][] iArr) throws zzarf {
        zzaxp zzaxpVar;
        int[] iArr2;
        ArrayList arrayList;
        boolean z;
        int i;
        int zzh;
        int i2 = 2;
        zzaxu[] zzaxuVarArr = new zzaxu[2];
        zzaxv zzaxvVar = (zzaxv) this.zza.get();
        int i3 = 0;
        boolean z2 = false;
        while (true) {
            int i4 = 1;
            if (i3 >= i2) {
                break;
            }
            if (zzarzVarArr[i3].zzc() == i2) {
                if (!z2) {
                    zzarz zzarzVar = zzarzVarArr[i3];
                    zzaxq zzaxqVar = zzaxqVarArr[i3];
                    int[][] iArr3 = iArr[i3];
                    int i5 = zzaxvVar.zzd;
                    int i6 = 0;
                    zzaxp zzaxpVar2 = null;
                    int i7 = 0;
                    int i8 = 0;
                    int i9 = -1;
                    int i10 = -1;
                    while (i6 < zzaxqVar.zzb) {
                        zzaxp zzb = zzaxqVar.zzb(i6);
                        int i11 = zzb.zza;
                        ArrayList arrayList2 = new ArrayList(i4);
                        for (int i12 = 0; i12 <= 0; i12++) {
                            arrayList2.add(Integer.valueOf(i12));
                        }
                        int[] iArr4 = iArr3[i6];
                        int i13 = i10;
                        int i14 = 0;
                        while (i14 <= 0) {
                            zzaxq zzaxqVar2 = zzaxqVar;
                            if (zza(iArr4[i14], true)) {
                                zzart zzb2 = zzb.zzb(i14);
                                if (arrayList2.contains(Integer.valueOf(i14))) {
                                    int i15 = zzb2.zzj;
                                    int i16 = zzb2.zzb;
                                    zzaxpVar = zzb;
                                    z = true;
                                } else {
                                    zzaxpVar = zzb;
                                    z = false;
                                }
                                if (true != z) {
                                    arrayList = arrayList2;
                                    i = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i = 2;
                                }
                                iArr2 = iArr4;
                                boolean zza = zza(iArr4[i14], false);
                                if (zza) {
                                    i += 1000;
                                }
                                boolean z3 = i > i8;
                                if (i == i8) {
                                    if (zzb2.zza() != i13) {
                                        zzh = zzh(zzb2.zza(), i13);
                                    } else {
                                        zzh = zzh(zzb2.zzb, i9);
                                    }
                                    z3 = !(zza && z) ? zzh >= 0 : zzh <= 0;
                                }
                                if (z3) {
                                    i9 = zzb2.zzb;
                                    i13 = zzb2.zza();
                                    i8 = i;
                                    i7 = i14;
                                    zzaxpVar2 = zzaxpVar;
                                }
                            } else {
                                zzaxpVar = zzb;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i14++;
                            zzaxqVar = zzaxqVar2;
                            zzb = zzaxpVar;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        i6++;
                        i10 = i13;
                        i4 = 1;
                    }
                    zzaxx zzaxxVar = zzaxpVar2 == null ? null : new zzaxx(zzaxpVar2, i7, 0, null);
                    zzaxuVarArr[i3] = zzaxxVar;
                    z2 = zzaxxVar != null;
                }
                int i17 = zzaxqVarArr[i3].zzb;
            }
            i3++;
            i2 = 2;
        }
        int i18 = 0;
        boolean z4 = false;
        while (i18 < i2) {
            if (zzarzVarArr[i18].zzc() == 1 && !z4) {
                zzaxq zzaxqVar3 = zzaxqVarArr[i18];
                int[][] iArr5 = iArr[i18];
                String str = zzaxvVar.zza;
                int i19 = -1;
                int i20 = -1;
                int i21 = 0;
                int i22 = 0;
                while (i21 < zzaxqVar3.zzb) {
                    zzaxp zzb3 = zzaxqVar3.zzb(i21);
                    int[] iArr6 = iArr5[i21];
                    int i23 = i22;
                    int i24 = i20;
                    int i25 = i19;
                    int i26 = 0;
                    while (true) {
                        int i27 = zzb3.zza;
                        if (i26 <= 0) {
                            if (zza(iArr6[i26], true)) {
                                zzart zzb4 = zzb3.zzb(i26);
                                int i28 = iArr6[i26];
                                int i29 = 1 != (zzb4.zzx & 1) ? 1 : 2;
                                if (zza(i28, false)) {
                                    i29 += 1000;
                                }
                                if (i29 > i23) {
                                    i24 = i26;
                                    i25 = i21;
                                    i23 = i29;
                                }
                            }
                            i26++;
                        }
                    }
                    i21++;
                    i19 = i25;
                    i20 = i24;
                    i22 = i23;
                }
                zzaxx zzaxxVar2 = i19 == -1 ? null : new zzaxx(zzaxqVar3.zzb(i19), i20, 0, null);
                zzaxuVarArr[i18] = zzaxxVar2;
                z4 = zzaxxVar2 != null;
            }
            i18++;
            i2 = 2;
        }
        return zzaxuVarArr;
    }

    public zzaxw(zzayb zzaybVar) {
        this.zza = new AtomicReference(new zzaxv());
    }
}