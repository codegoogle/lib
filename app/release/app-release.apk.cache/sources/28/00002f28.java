package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import com.p7700g.p99005.z1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzve extends zzvj {
    public static final /* synthetic */ int zza = 0;
    private static final zzfsr zzb = zzfsr.zzb(zzun.zza);
    private static final zzfsr zzc = zzfsr.zzb(zzuo.zza);
    private final AtomicReference zzd;
    private final zzud zze;

    @Deprecated
    public zzve() {
        zzut zzutVar = zzut.zzD;
        throw null;
    }

    public static int zza(zzad zzadVar, @z1 String str, boolean z) {
        if (TextUtils.isEmpty(str) || !str.equals(zzadVar.zzd)) {
            String zzf = zzf(str);
            String zzf2 = zzf(zzadVar.zzd);
            if (zzf2 == null || zzf == null) {
                return (z && zzf2 == null) ? 1 : 0;
            } else if (zzf2.startsWith(zzf) || zzf.startsWith(zzf2)) {
                return 3;
            } else {
                return zzeg.zzag(zzf2, "-")[0].equals(zzeg.zzag(zzf, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    @z1
    public static String zzf(@z1 String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean zzi(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    private static void zzp(zzty zztyVar, zzcp zzcpVar, Map map) {
        for (int i = 0; i < zztyVar.zzc; i++) {
            if (((zzcm) zzcpVar.zzB.get(zztyVar.zzb(i))) != null) {
                throw null;
            }
        }
    }

    @z1
    private static final Pair zzq(int i, zzvi zzviVar, int[][][] iArr, zzuz zzuzVar, Comparator comparator) {
        RandomAccess randomAccess;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 2; i2++) {
            if (i == zzviVar.zzc(i2)) {
                zzty zzd = zzviVar.zzd(i2);
                for (int i3 = 0; i3 < zzd.zzc; i3++) {
                    zzck zzb2 = zzd.zzb(i3);
                    List zza2 = zzuzVar.zza(i2, zzb2, iArr[i2][i3]);
                    int i4 = zzb2.zzb;
                    int i5 = 1;
                    boolean[] zArr = new boolean[1];
                    int i6 = 0;
                    while (i6 <= 0) {
                        zzva zzvaVar = (zzva) zza2.get(i6);
                        int zzb3 = zzvaVar.zzb();
                        if (!zArr[i6] && zzb3 != 0) {
                            if (zzb3 == i5) {
                                randomAccess = zzfrj.zzp(zzvaVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(zzvaVar);
                                for (int i7 = i6 + 1; i7 <= 0; i7++) {
                                    zzva zzvaVar2 = (zzva) zza2.get(i7);
                                    if (zzvaVar2.zzb() == 2 && zzvaVar.zzc(zzvaVar2)) {
                                        arrayList2.add(zzvaVar2);
                                        zArr[i7] = true;
                                    }
                                }
                                randomAccess = arrayList2;
                            }
                            arrayList.add(randomAccess);
                        }
                        i6++;
                        i5 = 1;
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i8 = 0; i8 < list.size(); i8++) {
            iArr2[i8] = ((zzva) list.get(i8)).zzc;
        }
        zzva zzvaVar3 = (zzva) list.get(0);
        return Pair.create(new zzvf(zzvaVar3.zzb, iArr2, 0), Integer.valueOf(zzvaVar3.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    public final Pair zzb(zzvi zzviVar, int[][][] iArr, final int[] iArr2, zzsa zzsaVar, zzci zzciVar) throws zzgt {
        int i;
        final boolean z;
        final String str;
        int[] iArr3;
        int length;
        zzvg zza2;
        int[][][] iArr4 = iArr;
        final zzut zzutVar = (zzut) this.zzd.get();
        int i2 = 2;
        zzvf[] zzvfVarArr = new zzvf[2];
        Pair zzq = zzq(2, zzviVar, iArr4, new zzuz() { // from class: com.google.android.gms.internal.ads.zzuj
            /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
            @Override // com.google.android.gms.internal.ads.zzuz
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final List zza(int i3, zzck zzckVar, int[] iArr5) {
                int i4;
                int i5;
                int i6;
                int i7;
                int i8;
                Point point;
                int i9;
                int i10;
                zzut zzutVar2 = zzut.this;
                int[] iArr6 = iArr2;
                int i11 = zzve.zza;
                int i12 = iArr6[i3];
                int i13 = zzutVar2.zzl;
                int i14 = zzutVar2.zzm;
                boolean z2 = zzutVar2.zzn;
                int i15 = Integer.MAX_VALUE;
                if (i13 == Integer.MAX_VALUE) {
                    i15 = Integer.MAX_VALUE;
                } else if (i14 != Integer.MAX_VALUE) {
                    int i16 = 0;
                    int i17 = Integer.MAX_VALUE;
                    while (true) {
                        int i18 = zzckVar.zzb;
                        if (i16 > 0) {
                            break;
                        }
                        zzad zzb2 = zzckVar.zzb(i16);
                        int i19 = zzb2.zzr;
                        if (i19 > 0 && (i4 = zzb2.zzs) > 0) {
                            if (z2) {
                                if ((i19 > i4) != (i13 > i14)) {
                                    i6 = i13;
                                    i5 = i14;
                                    i7 = i19 * i6;
                                    i8 = i4 * i5;
                                    if (i7 < i8) {
                                        point = new Point(i5, zzeg.zze(i8, i19));
                                    } else {
                                        point = new Point(zzeg.zze(i7, i4), i6);
                                    }
                                    i9 = zzb2.zzr;
                                    int i20 = zzb2.zzs;
                                    i10 = i9 * i20;
                                    if (i9 >= ((int) (point.x * 0.98f)) && i20 >= ((int) (point.y * 0.98f)) && i10 < i17) {
                                        i17 = i10;
                                    }
                                }
                            }
                            i5 = i13;
                            i6 = i14;
                            i7 = i19 * i6;
                            i8 = i4 * i5;
                            if (i7 < i8) {
                            }
                            i9 = zzb2.zzr;
                            int i202 = zzb2.zzs;
                            i10 = i9 * i202;
                            if (i9 >= ((int) (point.x * 0.98f))) {
                                i17 = i10;
                            }
                        }
                        i16++;
                    }
                    i15 = i17;
                }
                zzfrg zzi = zzfrj.zzi();
                int i21 = 0;
                while (true) {
                    int i22 = zzckVar.zzb;
                    if (i21 <= 0) {
                        int zza3 = zzckVar.zzb(i21).zza();
                        zzi.zze(new zzvd(i3, zzckVar, i21, zzutVar2, iArr5[i21], i12, i15 == Integer.MAX_VALUE || (zza3 != -1 && zza3 <= i15)));
                        i21++;
                    } else {
                        return zzi.zzg();
                    }
                }
            }
        }, zzuk.zza);
        if (zzq != null) {
            zzvfVarArr[((Integer) zzq.second).intValue()] = (zzvf) zzq.first;
        }
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= 2) {
                z = false;
                break;
            } else if (zzviVar.zzc(i3) == 2 && zzviVar.zzd(i3).zzc > 0) {
                z = true;
                break;
            } else {
                i3++;
            }
        }
        Pair zzq2 = zzq(1, zzviVar, iArr4, new zzuz() { // from class: com.google.android.gms.internal.ads.zzuh
            @Override // com.google.android.gms.internal.ads.zzuz
            public final List zza(int i4, zzck zzckVar, int[] iArr5) {
                zzut zzutVar2 = zzut.this;
                boolean z2 = z;
                int i5 = zzve.zza;
                zzfrg zzi = zzfrj.zzi();
                int i6 = 0;
                while (true) {
                    int i7 = zzckVar.zzb;
                    if (i6 <= 0) {
                        zzi.zze(new zzup(i4, zzckVar, i6, zzutVar2, iArr5[i6], z2));
                        i6++;
                    } else {
                        return zzi.zzg();
                    }
                }
            }
        }, zzui.zza);
        if (zzq2 != null) {
            zzvfVarArr[((Integer) zzq2.second).intValue()] = (zzvf) zzq2.first;
        }
        if (zzq2 == null) {
            str = null;
        } else {
            Object obj = zzq2.first;
            str = ((zzvf) obj).zza.zzb(((zzvf) obj).zzb[0]).zzd;
        }
        int i4 = 3;
        Pair zzq3 = zzq(3, zzviVar, iArr4, new zzuz() { // from class: com.google.android.gms.internal.ads.zzul
            @Override // com.google.android.gms.internal.ads.zzuz
            public final List zza(int i5, zzck zzckVar, int[] iArr5) {
                zzut zzutVar2 = zzut.this;
                String str2 = str;
                int i6 = zzve.zza;
                zzfrg zzi = zzfrj.zzi();
                int i7 = 0;
                while (true) {
                    int i8 = zzckVar.zzb;
                    if (i7 <= 0) {
                        zzi.zze(new zzuy(i5, zzckVar, i7, zzutVar2, iArr5[i7], str2));
                        i7++;
                    } else {
                        return zzi.zzg();
                    }
                }
            }
        }, zzum.zza);
        if (zzq3 != null) {
            zzvfVarArr[((Integer) zzq3.second).intValue()] = (zzvf) zzq3.first;
        }
        int i5 = 0;
        while (i5 < i2) {
            int zzc2 = zzviVar.zzc(i5);
            if (zzc2 != i2 && zzc2 != i && zzc2 != i4) {
                zzty zzd = zzviVar.zzd(i5);
                int[][] iArr5 = iArr4[i5];
                int i6 = 0;
                zzck zzckVar = null;
                int i7 = 0;
                zzuq zzuqVar = null;
                while (i6 < zzd.zzc) {
                    zzck zzb2 = zzd.zzb(i6);
                    int[] iArr6 = iArr5[i6];
                    zzuq zzuqVar2 = zzuqVar;
                    int i8 = 0;
                    while (true) {
                        int i9 = zzb2.zzb;
                        if (i8 <= 0) {
                            if (zzi(iArr6[i8], zzutVar.zzP)) {
                                zzuq zzuqVar3 = new zzuq(zzb2.zzb(i8), iArr6[i8]);
                                if (zzuqVar2 == null || zzuqVar3.compareTo(zzuqVar2) > 0) {
                                    i7 = i8;
                                    zzuqVar2 = zzuqVar3;
                                    zzckVar = zzb2;
                                }
                            }
                            i8++;
                        }
                    }
                    i6++;
                    zzuqVar = zzuqVar2;
                }
                zzvfVarArr[i5] = zzckVar == null ? null : new zzvf(zzckVar, new int[]{i7}, 0);
            }
            i5++;
            iArr4 = iArr;
            i2 = 2;
            i = 1;
            i4 = 3;
        }
        HashMap hashMap = new HashMap();
        for (int i10 = 0; i10 < 2; i10++) {
            zzp(zzviVar.zzd(i10), zzutVar, hashMap);
        }
        zzp(zzviVar.zze(), zzutVar, hashMap);
        for (int i11 = 0; i11 < 2; i11++) {
            if (((zzcm) hashMap.get(Integer.valueOf(zzviVar.zzc(i11)))) != null) {
                throw null;
            }
        }
        int i12 = 0;
        for (int i13 = 2; i12 < i13; i13 = 2) {
            zzty zzd2 = zzviVar.zzd(i12);
            if (zzutVar.zzg(i12, zzd2)) {
                if (zzutVar.zze(i12, zzd2) == null) {
                    zzvfVarArr[i12] = null;
                } else {
                    throw null;
                }
            }
            i12++;
        }
        int i14 = 0;
        for (int i15 = 2; i14 < i15; i15 = 2) {
            int zzc3 = zzviVar.zzc(i14);
            if (zzutVar.zzf(i14) || zzutVar.zzC.contains(Integer.valueOf(zzc3))) {
                zzvfVarArr[i14] = null;
            }
            i14++;
        }
        zzud zzudVar = this.zze;
        zzvu zzl = zzl();
        zzfrj zzf = zzue.zzf(zzvfVarArr);
        int i16 = 2;
        zzvg[] zzvgVarArr = new zzvg[2];
        int i17 = 0;
        while (i17 < i16) {
            zzvf zzvfVar = zzvfVarArr[i17];
            if (zzvfVar != null && (length = (iArr3 = zzvfVar.zzb).length) != 0) {
                if (length == 1) {
                    zza2 = new zzvh(zzvfVar.zza, iArr3[0], 0, 0, null);
                } else {
                    zza2 = zzudVar.zza(zzvfVar.zza, iArr3, 0, zzl, (zzfrj) zzf.get(i17));
                }
                zzvgVarArr[i17] = zza2;
            }
            i17++;
            i16 = 2;
        }
        zzjv[] zzjvVarArr = new zzjv[i16];
        for (int i18 = 0; i18 < i16; i18++) {
            zzjvVarArr[i18] = (zzutVar.zzf(i18) || zzutVar.zzC.contains(Integer.valueOf(zzviVar.zzc(i18))) || (zzviVar.zzc(i18) != -2 && zzvgVarArr[i18] == null)) ? null : zzjv.zza;
        }
        boolean z2 = zzutVar.zzQ;
        return Pair.create(zzjvVarArr, zzvgVarArr);
    }

    public final zzut zzc() {
        return (zzut) this.zzd.get();
    }

    public final void zzg(zzuv zzuvVar) {
        zzut zzutVar = new zzut(zzuvVar);
        if (((zzut) this.zzd.getAndSet(zzutVar)).equals(zzutVar)) {
            return;
        }
        zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzvm
    public final boolean zzh() {
        return true;
    }

    public zzve(Context context) {
        zzud zzudVar = new zzud();
        zzut zzc2 = zzut.zzc(context);
        this.zze = zzudVar;
        this.zzd = new AtomicReference(zzc2);
    }
}