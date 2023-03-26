package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.p7700g.p99005.sr;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import org.xbill.DNS.TTL;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaej implements zzyr {
    public static final zzyy zza = zzaef.zza;
    private static final byte[] zzb = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private static final zzad zzc;
    private int zzA;
    private int zzB;
    private boolean zzC;
    private zzyu zzD;
    private zzzy[] zzE;
    private zzzy[] zzF;
    private boolean zzG;
    private final List zzd;
    private final SparseArray zze;
    private final zzdy zzf;
    private final zzdy zzg;
    private final zzdy zzh;
    private final byte[] zzi;
    private final zzdy zzj;
    private final zzabe zzk;
    private final zzdy zzl;
    private final ArrayDeque zzm;
    private final ArrayDeque zzn;
    private int zzo;
    private int zzp;
    private long zzq;
    private int zzr;
    @z1
    private zzdy zzs;
    private long zzt;
    private int zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    @z1
    private zzaei zzy;
    private int zzz;

    static {
        zzab zzabVar = new zzab();
        zzabVar.zzS("application/x-emsg");
        zzc = zzabVar.zzY();
    }

    public zzaej() {
        this(0, null);
    }

    private static int zze(int i) throws zzbp {
        if (i >= 0) {
            return i;
        }
        throw zzbp.zza("Unexpected negative value: " + i, null);
    }

    @z1
    private static zzv zzf(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzadu zzaduVar = (zzadu) list.get(i);
            if (zzaduVar.zzd == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] zzH = zzaduVar.zza.zzH();
                UUID zza2 = zzaeq.zza(zzH);
                if (zza2 != null) {
                    arrayList.add(new zzu(zza2, null, "video/mp4", zzH));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzv(arrayList);
    }

    private final void zzg() {
        this.zzo = 0;
        this.zzr = 0;
    }

    private static void zzh(zzdy zzdyVar, int i, zzaev zzaevVar) throws zzbp {
        zzdyVar.zzF(i + 8);
        int zze = zzdyVar.zze() & sr.s;
        if ((zze & 1) == 0) {
            boolean z = (zze & 2) != 0;
            int zzn = zzdyVar.zzn();
            if (zzn == 0) {
                Arrays.fill(zzaevVar.zzl, 0, zzaevVar.zze, false);
                return;
            }
            int i2 = zzaevVar.zze;
            if (zzn == i2) {
                Arrays.fill(zzaevVar.zzl, 0, zzn, z);
                zzaevVar.zza(zzdyVar.zza());
                zzdy zzdyVar2 = zzaevVar.zzn;
                zzdyVar.zzB(zzdyVar2.zzH(), 0, zzdyVar2.zzd());
                zzaevVar.zzn.zzF(0);
                zzaevVar.zzo = false;
                return;
            }
            throw zzbp.zza("Senc sample count " + zzn + " is different from fragment sample count" + i2, null);
        }
        throw zzbp.zzc("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    private final void zzi(long j) throws zzbp {
        zzaej zzaejVar;
        SparseArray sparseArray;
        zzadt zzadtVar;
        int i;
        int i2;
        byte[] bArr;
        int i3;
        int i4;
        int i5;
        int i6;
        byte[] bArr2;
        byte[] bArr3;
        int i7;
        boolean z;
        int i8;
        zzadt zzadtVar2;
        byte[] bArr4;
        zzaev zzaevVar;
        List list;
        int i9;
        int i10;
        int i11;
        zzadt zzadtVar3;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        zzaee zzaeeVar;
        long j2;
        zzaej zzaejVar2 = this;
        while (!zzaejVar2.zzm.isEmpty() && ((zzadt) zzaejVar2.zzm.peek()).zza == j) {
            zzadt zzadtVar4 = (zzadt) zzaejVar2.zzm.pop();
            int i22 = zzadtVar4.zzd;
            int i23 = 12;
            int i24 = 8;
            if (i22 == 1836019574) {
                zzv zzf = zzf(zzadtVar4.zzb);
                zzadt zza2 = zzadtVar4.zza(1836475768);
                Objects.requireNonNull(zza2);
                SparseArray sparseArray2 = new SparseArray();
                int size = zza2.zzb.size();
                long j3 = -9223372036854775807L;
                int i25 = 0;
                while (i25 < size) {
                    zzadu zzaduVar = (zzadu) zza2.zzb.get(i25);
                    int i26 = zzaduVar.zzd;
                    if (i26 == 1953654136) {
                        zzdy zzdyVar = zzaduVar.zza;
                        zzdyVar.zzF(i23);
                        Pair create = Pair.create(Integer.valueOf(zzdyVar.zze()), new zzaee(zzdyVar.zze() - 1, zzdyVar.zze(), zzdyVar.zze(), zzdyVar.zze()));
                        sparseArray2.put(((Integer) create.first).intValue(), (zzaee) create.second);
                    } else if (i26 == 1835362404) {
                        zzdy zzdyVar2 = zzaduVar.zza;
                        zzdyVar2.zzF(8);
                        j3 = zzadv.zze(zzdyVar2.zze()) == 0 ? zzdyVar2.zzs() : zzdyVar2.zzt();
                    }
                    i25++;
                    i23 = 12;
                }
                List zzc2 = zzaed.zzc(zzadtVar4, new zzzg(), j3, zzf, false, false, new zzfok() { // from class: com.google.android.gms.internal.ads.zzaeg
                    @Override // com.google.android.gms.internal.ads.zzfok
                    public final Object apply(Object obj) {
                        return (zzaet) obj;
                    }
                });
                int size2 = zzc2.size();
                if (zzaejVar2.zze.size() == 0) {
                    for (int i27 = 0; i27 < size2; i27++) {
                        zzaew zzaewVar = (zzaew) zzc2.get(i27);
                        zzaet zzaetVar = zzaewVar.zza;
                        zzaejVar2.zze.put(zzaetVar.zza, new zzaei(zzaejVar2.zzD.zzv(i27, zzaetVar.zzb), zzaewVar, zzj(sparseArray2, zzaetVar.zza)));
                        zzaejVar2.zzw = Math.max(zzaejVar2.zzw, zzaetVar.zze);
                    }
                    zzaejVar2.zzD.zzB();
                } else {
                    zzcw.zzf(zzaejVar2.zze.size() == size2);
                    for (int i28 = 0; i28 < size2; i28++) {
                        zzaew zzaewVar2 = (zzaew) zzc2.get(i28);
                        zzaet zzaetVar2 = zzaewVar2.zza;
                        ((zzaei) zzaejVar2.zze.get(zzaetVar2.zza)).zzh(zzaewVar2, zzj(sparseArray2, zzaetVar2.zza));
                    }
                }
            } else {
                if (i22 == 1836019558) {
                    SparseArray sparseArray3 = zzaejVar2.zze;
                    byte[] bArr5 = zzaejVar2.zzi;
                    int size3 = zzadtVar4.zzc.size();
                    int i29 = 0;
                    while (i29 < size3) {
                        zzadt zzadtVar5 = (zzadt) zzadtVar4.zzc.get(i29);
                        if (zzadtVar5.zzd == 1953653094) {
                            zzadu zzb2 = zzadtVar5.zzb(1952868452);
                            Objects.requireNonNull(zzb2);
                            zzdy zzdyVar3 = zzb2.zza;
                            zzdyVar3.zzF(i24);
                            int zze = zzdyVar3.zze() & sr.s;
                            zzaei zzaeiVar = (zzaei) sparseArray3.get(zzdyVar3.zze());
                            if (zzaeiVar == null) {
                                zzaeiVar = null;
                            } else {
                                if ((zze & 1) != 0) {
                                    long zzt = zzdyVar3.zzt();
                                    zzaev zzaevVar2 = zzaeiVar.zzb;
                                    zzaevVar2.zzb = zzt;
                                    zzaevVar2.zzc = zzt;
                                }
                                zzaee zzaeeVar2 = zzaeiVar.zze;
                                int zze2 = (zze & 2) != 0 ? zzdyVar3.zze() - 1 : zzaeeVar2.zza;
                                if ((zze & 8) != 0) {
                                    i3 = zzdyVar3.zze();
                                } else {
                                    i3 = zzaeeVar2.zzb;
                                }
                                if ((zze & 16) != 0) {
                                    i4 = zzdyVar3.zze();
                                } else {
                                    i4 = zzaeeVar2.zzc;
                                }
                                if ((zze & 32) != 0) {
                                    i5 = zzdyVar3.zze();
                                } else {
                                    i5 = zzaeeVar2.zzd;
                                }
                                zzaeiVar.zzb.zza = new zzaee(zze2, i3, i4, i5);
                            }
                            if (zzaeiVar != null) {
                                zzaev zzaevVar3 = zzaeiVar.zzb;
                                long j4 = zzaevVar3.zzp;
                                boolean z2 = zzaevVar3.zzq;
                                zzaeiVar.zzi();
                                zzaeiVar.zzl = true;
                                zzadu zzb3 = zzadtVar5.zzb(1952867444);
                                if (zzb3 != null) {
                                    zzdy zzdyVar4 = zzb3.zza;
                                    zzdyVar4.zzF(i24);
                                    zzaevVar3.zzp = zzadv.zze(zzdyVar4.zze()) == 1 ? zzdyVar4.zzt() : zzdyVar4.zzs();
                                    zzaevVar3.zzq = true;
                                } else {
                                    zzaevVar3.zzp = j4;
                                    zzaevVar3.zzq = z2;
                                }
                                List list2 = zzadtVar5.zzb;
                                int size4 = list2.size();
                                int i30 = 0;
                                int i31 = 0;
                                int i32 = 0;
                                while (true) {
                                    i6 = 1953658222;
                                    if (i30 >= size4) {
                                        break;
                                    }
                                    zzadu zzaduVar2 = (zzadu) list2.get(i30);
                                    SparseArray sparseArray4 = sparseArray3;
                                    if (zzaduVar2.zzd == 1953658222) {
                                        zzdy zzdyVar5 = zzaduVar2.zza;
                                        zzdyVar5.zzF(12);
                                        int zzn = zzdyVar5.zzn();
                                        if (zzn > 0) {
                                            i32 += zzn;
                                            i31++;
                                        }
                                    }
                                    i30++;
                                    sparseArray3 = sparseArray4;
                                }
                                sparseArray = sparseArray3;
                                zzaeiVar.zzh = 0;
                                zzaeiVar.zzg = 0;
                                zzaeiVar.zzf = 0;
                                zzaev zzaevVar4 = zzaeiVar.zzb;
                                zzaevVar4.zzd = i31;
                                zzaevVar4.zze = i32;
                                if (zzaevVar4.zzg.length < i31) {
                                    zzaevVar4.zzf = new long[i31];
                                    zzaevVar4.zzg = new int[i31];
                                }
                                if (zzaevVar4.zzh.length < i32) {
                                    int i33 = (i32 * 125) / 100;
                                    zzaevVar4.zzh = new int[i33];
                                    zzaevVar4.zzi = new long[i33];
                                    zzaevVar4.zzj = new boolean[i33];
                                    zzaevVar4.zzl = new boolean[i33];
                                }
                                int i34 = 0;
                                int i35 = 0;
                                int i36 = 0;
                                while (true) {
                                    long j5 = 0;
                                    if (i34 >= size4) {
                                        break;
                                    }
                                    zzadu zzaduVar3 = (zzadu) list2.get(i34);
                                    if (zzaduVar3.zzd == i6) {
                                        int i37 = i36 + 1;
                                        zzdy zzdyVar6 = zzaduVar3.zza;
                                        zzdyVar6.zzF(8);
                                        int zze3 = zzdyVar6.zze() & sr.s;
                                        list = list2;
                                        zzaet zzaetVar3 = zzaeiVar.zzd.zza;
                                        i9 = size3;
                                        zzaev zzaevVar5 = zzaeiVar.zzb;
                                        i11 = size4;
                                        zzaee zzaeeVar3 = zzaevVar5.zza;
                                        int i38 = zzeg.zza;
                                        zzaevVar5.zzg[i36] = zzdyVar6.zzn();
                                        long[] jArr = zzaevVar5.zzf;
                                        zzadtVar2 = zzadtVar4;
                                        bArr4 = bArr5;
                                        long j6 = zzaevVar5.zzb;
                                        jArr[i36] = j6;
                                        if ((zze3 & 1) != 0) {
                                            i8 = i34;
                                            jArr[i36] = j6 + zzdyVar6.zze();
                                        } else {
                                            i8 = i34;
                                        }
                                        int i39 = zze3 & 4;
                                        int i40 = zzaeeVar3.zzd;
                                        if (i39 != 0) {
                                            i40 = zzdyVar6.zze();
                                        }
                                        int i41 = zze3 & 256;
                                        int i42 = zze3 & 512;
                                        int i43 = zze3 & 1024;
                                        int i44 = zze3 & 2048;
                                        int i45 = i40;
                                        long[] jArr2 = zzaetVar3.zzh;
                                        if (jArr2 != null) {
                                            i10 = i29;
                                            zzadtVar3 = zzadtVar5;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j5 = ((long[]) zzeg.zzG(zzaetVar3.zzi))[0];
                                            }
                                        } else {
                                            i10 = i29;
                                            zzadtVar3 = zzadtVar5;
                                        }
                                        int[] iArr = zzaevVar5.zzh;
                                        long[] jArr3 = zzaevVar5.zzi;
                                        boolean[] zArr = zzaevVar5.zzj;
                                        zzaevVar = zzaevVar3;
                                        int i46 = zzaevVar5.zzg[i36] + i35;
                                        long j7 = zzaetVar3.zzc;
                                        int i47 = i35;
                                        long j8 = zzaevVar5.zzp;
                                        while (i47 < i46) {
                                            if (i41 != 0) {
                                                i12 = i41;
                                                i13 = zzdyVar6.zze();
                                            } else {
                                                i12 = i41;
                                                i13 = zzaeeVar3.zzb;
                                            }
                                            zze(i13);
                                            if (i42 != 0) {
                                                i14 = i42;
                                                i15 = zzdyVar6.zze();
                                            } else {
                                                i14 = i42;
                                                i15 = zzaeeVar3.zzc;
                                            }
                                            zze(i15);
                                            if (i43 != 0) {
                                                i16 = i39;
                                                i17 = zzdyVar6.zze();
                                            } else {
                                                i16 = i39;
                                                if (i47 == 0) {
                                                    if (i39 != 0) {
                                                        i17 = i45;
                                                        i47 = 0;
                                                    } else {
                                                        i47 = 0;
                                                    }
                                                }
                                                i17 = zzaeeVar3.zzd;
                                            }
                                            if (i44 != 0) {
                                                i18 = i46;
                                                i19 = i43;
                                                i20 = i44;
                                                i21 = zzdyVar6.zze();
                                            } else {
                                                i18 = i46;
                                                i19 = i43;
                                                i20 = i44;
                                                i21 = 0;
                                            }
                                            long zzw = zzeg.zzw((i21 + j8) - j5, 1000000L, j7);
                                            jArr3[i47] = zzw;
                                            if (zzaevVar5.zzq) {
                                                zzaeeVar = zzaeeVar3;
                                                j2 = j7;
                                            } else {
                                                zzaeeVar = zzaeeVar3;
                                                j2 = j7;
                                                jArr3[i47] = zzw + zzaeiVar.zzd.zzh;
                                            }
                                            iArr[i47] = i15;
                                            zArr[i47] = 1 == (((i17 >> 16) & 1) ^ 1);
                                            j8 += i13;
                                            i47++;
                                            zzaeeVar3 = zzaeeVar;
                                            j7 = j2;
                                            i41 = i12;
                                            i42 = i14;
                                            i39 = i16;
                                            i46 = i18;
                                            i43 = i19;
                                            i44 = i20;
                                        }
                                        zzaevVar5.zzp = j8;
                                        i36 = i37;
                                        i35 = i46;
                                    } else {
                                        i8 = i34;
                                        zzadtVar2 = zzadtVar4;
                                        bArr4 = bArr5;
                                        zzaevVar = zzaevVar3;
                                        list = list2;
                                        i9 = size3;
                                        i10 = i29;
                                        i11 = size4;
                                        zzadtVar3 = zzadtVar5;
                                    }
                                    i34 = i8 + 1;
                                    list2 = list;
                                    size3 = i9;
                                    size4 = i11;
                                    zzadtVar4 = zzadtVar2;
                                    bArr5 = bArr4;
                                    i29 = i10;
                                    zzadtVar5 = zzadtVar3;
                                    zzaevVar3 = zzaevVar;
                                    i6 = 1953658222;
                                }
                                zzadtVar = zzadtVar4;
                                byte[] bArr6 = bArr5;
                                zzaev zzaevVar6 = zzaevVar3;
                                i = size3;
                                i2 = i29;
                                zzadt zzadtVar6 = zzadtVar5;
                                zzaet zzaetVar4 = zzaeiVar.zzd.zza;
                                zzaee zzaeeVar4 = zzaevVar6.zza;
                                Objects.requireNonNull(zzaeeVar4);
                                zzaeu zza3 = zzaetVar4.zza(zzaeeVar4.zza);
                                zzadu zzb4 = zzadtVar6.zzb(1935763834);
                                if (zzb4 != null) {
                                    Objects.requireNonNull(zza3);
                                    zzdy zzdyVar7 = zzb4.zza;
                                    int i48 = zza3.zzd;
                                    zzdyVar7.zzF(8);
                                    if ((zzdyVar7.zze() & 1) == 1) {
                                        zzdyVar7.zzG(8);
                                    }
                                    int zzk = zzdyVar7.zzk();
                                    int zzn2 = zzdyVar7.zzn();
                                    int i49 = zzaevVar6.zze;
                                    if (zzn2 > i49) {
                                        throw zzbp.zza("Saiz sample count " + zzn2 + " is greater than fragment sample count" + i49, null);
                                    }
                                    if (zzk == 0) {
                                        boolean[] zArr2 = zzaevVar6.zzl;
                                        i7 = 0;
                                        for (int i50 = 0; i50 < zzn2; i50++) {
                                            int zzk2 = zzdyVar7.zzk();
                                            i7 += zzk2;
                                            zArr2[i50] = zzk2 > i48;
                                        }
                                        z = false;
                                    } else {
                                        boolean z3 = zzk > i48;
                                        i7 = zzk * zzn2;
                                        z = false;
                                        Arrays.fill(zzaevVar6.zzl, 0, zzn2, z3);
                                    }
                                    Arrays.fill(zzaevVar6.zzl, zzn2, zzaevVar6.zze, z);
                                    if (i7 > 0) {
                                        zzaevVar6.zza(i7);
                                    }
                                }
                                zzadu zzb5 = zzadtVar6.zzb(1935763823);
                                if (zzb5 != null) {
                                    zzdy zzdyVar8 = zzb5.zza;
                                    zzdyVar8.zzF(8);
                                    int zze4 = zzdyVar8.zze();
                                    if ((zze4 & 1) == 1) {
                                        zzdyVar8.zzG(8);
                                    }
                                    int zzn3 = zzdyVar8.zzn();
                                    if (zzn3 != 1) {
                                        throw zzbp.zza("Unexpected saio entry count: " + zzn3, null);
                                    }
                                    zzaevVar6.zzc += zzadv.zze(zze4) == 0 ? zzdyVar8.zzs() : zzdyVar8.zzt();
                                }
                                zzadu zzb6 = zzadtVar6.zzb(1936027235);
                                if (zzb6 != null) {
                                    zzh(zzb6.zza, 0, zzaevVar6);
                                }
                                String str = zza3 != null ? zza3.zzb : null;
                                zzdy zzdyVar9 = null;
                                zzdy zzdyVar10 = null;
                                for (int i51 = 0; i51 < zzadtVar6.zzb.size(); i51++) {
                                    zzadu zzaduVar4 = (zzadu) zzadtVar6.zzb.get(i51);
                                    zzdy zzdyVar11 = zzaduVar4.zza;
                                    int i52 = zzaduVar4.zzd;
                                    if (i52 == 1935828848) {
                                        zzdyVar11.zzF(12);
                                        if (zzdyVar11.zze() == 1936025959) {
                                            zzdyVar9 = zzdyVar11;
                                        }
                                    } else if (i52 == 1936158820) {
                                        zzdyVar11.zzF(12);
                                        if (zzdyVar11.zze() == 1936025959) {
                                            zzdyVar10 = zzdyVar11;
                                        }
                                    }
                                }
                                if (zzdyVar9 != null && zzdyVar10 != null) {
                                    zzdyVar9.zzF(8);
                                    int zze5 = zzdyVar9.zze();
                                    zzdyVar9.zzG(4);
                                    if (zzadv.zze(zze5) == 1) {
                                        zzdyVar9.zzG(4);
                                    }
                                    if (zzdyVar9.zze() == 1) {
                                        zzdyVar10.zzF(8);
                                        int zze6 = zzadv.zze(zzdyVar10.zze());
                                        zzdyVar10.zzG(4);
                                        if (zze6 == 1) {
                                            if (zzdyVar10.zzs() == 0) {
                                                throw zzbp.zzc("Variable length description in sgpd found (unsupported)");
                                            }
                                        } else if (zze6 >= 2) {
                                            zzdyVar10.zzG(4);
                                        }
                                        if (zzdyVar10.zzs() == 1) {
                                            zzdyVar10.zzG(1);
                                            int zzk3 = zzdyVar10.zzk();
                                            int i53 = (zzk3 & 240) >> 4;
                                            int i54 = zzk3 & 15;
                                            if (zzdyVar10.zzk() == 1) {
                                                int zzk4 = zzdyVar10.zzk();
                                                byte[] bArr7 = new byte[16];
                                                zzdyVar10.zzB(bArr7, 0, 16);
                                                if (zzk4 == 0) {
                                                    int zzk5 = zzdyVar10.zzk();
                                                    byte[] bArr8 = new byte[zzk5];
                                                    zzdyVar10.zzB(bArr8, 0, zzk5);
                                                    bArr3 = bArr8;
                                                } else {
                                                    bArr3 = null;
                                                }
                                                zzaevVar6.zzk = true;
                                                zzaevVar6.zzm = new zzaeu(true, str, zzk4, bArr7, i53, i54, bArr3);
                                            }
                                        } else {
                                            throw zzbp.zzc("Entry count in sgpd != 1 (unsupported).");
                                        }
                                    } else {
                                        throw zzbp.zzc("Entry count in sbgp != 1 (unsupported).");
                                    }
                                }
                                int size5 = zzadtVar6.zzb.size();
                                int i55 = 0;
                                while (i55 < size5) {
                                    zzadu zzaduVar5 = (zzadu) zzadtVar6.zzb.get(i55);
                                    if (zzaduVar5.zzd == 1970628964) {
                                        zzdy zzdyVar12 = zzaduVar5.zza;
                                        zzdyVar12.zzF(8);
                                        bArr2 = bArr6;
                                        zzdyVar12.zzB(bArr2, 0, 16);
                                        if (Arrays.equals(bArr2, zzb)) {
                                            zzh(zzdyVar12, 16, zzaevVar6);
                                        }
                                    } else {
                                        bArr2 = bArr6;
                                    }
                                    i55++;
                                    bArr6 = bArr2;
                                }
                                bArr = bArr6;
                                bArr5 = bArr;
                                size3 = i;
                                zzadtVar4 = zzadtVar;
                                i24 = 8;
                                i29 = i2 + 1;
                                sparseArray3 = sparseArray;
                            }
                        }
                        sparseArray = sparseArray3;
                        zzadtVar = zzadtVar4;
                        i = size3;
                        i2 = i29;
                        bArr = bArr5;
                        bArr5 = bArr;
                        size3 = i;
                        zzadtVar4 = zzadtVar;
                        i24 = 8;
                        i29 = i2 + 1;
                        sparseArray3 = sparseArray;
                    }
                    zzv zzf2 = zzf(zzadtVar4.zzb);
                    zzaejVar = this;
                    if (zzf2 != null) {
                        int size6 = zzaejVar.zze.size();
                        for (int i56 = 0; i56 < size6; i56++) {
                            zzaei zzaeiVar2 = (zzaei) zzaejVar.zze.valueAt(i56);
                            zzaet zzaetVar5 = zzaeiVar2.zzd.zza;
                            zzaee zzaeeVar5 = zzaeiVar2.zzb.zza;
                            int i57 = zzeg.zza;
                            zzaeu zza4 = zzaetVar5.zza(zzaeeVar5.zza);
                            zzv zzb7 = zzf2.zzb(zza4 != null ? zza4.zzb : null);
                            zzab zzb8 = zzaeiVar2.zzd.zza.zzf.zzb();
                            zzb8.zzB(zzb7);
                            zzaeiVar2.zza.zzk(zzb8.zzY());
                        }
                    }
                    if (zzaejVar.zzv != -9223372036854775807L) {
                        int size7 = zzaejVar.zze.size();
                        for (int i58 = 0; i58 < size7; i58++) {
                            zzaei zzaeiVar3 = (zzaei) zzaejVar.zze.valueAt(i58);
                            long j9 = zzaejVar.zzv;
                            int i59 = zzaeiVar3.zzf;
                            while (true) {
                                zzaev zzaevVar7 = zzaeiVar3.zzb;
                                if (i59 < zzaevVar7.zze && zzaevVar7.zzi[i59] < j9) {
                                    if (zzaevVar7.zzj[i59]) {
                                        zzaeiVar3.zzi = i59;
                                    }
                                    i59++;
                                }
                            }
                        }
                        zzaejVar.zzv = -9223372036854775807L;
                    }
                } else {
                    zzaejVar = zzaejVar2;
                    if (!zzaejVar.zzm.isEmpty()) {
                        ((zzadt) zzaejVar.zzm.peek()).zzc(zzadtVar4);
                    }
                }
                zzaejVar2 = zzaejVar;
            }
        }
        zzg();
    }

    private static final zzaee zzj(SparseArray sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return (zzaee) sparseArray.valueAt(0);
        }
        zzaee zzaeeVar = (zzaee) sparseArray.get(i);
        Objects.requireNonNull(zzaeeVar);
        return zzaeeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x023f, code lost:
        r5.zzs(r12, r20, r33.zzz, 0, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0252, code lost:
        if (r33.zzn.isEmpty() != false) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0254, code lost:
        r1 = (com.google.android.gms.internal.ads.zzaeh) r33.zzn.removeFirst();
        r33.zzu -= r1.zzc;
        r3 = r1.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0267, code lost:
        if (r1.zzb == false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0269, code lost:
        r3 = r3 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x026a, code lost:
        r5 = r33.zzE;
        r6 = r5.length;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x026e, code lost:
        if (r8 >= r6) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0270, code lost:
        r5[r8].zzs(r3, 1, r1.zzc, r33.zzu, null);
        r8 = r8 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0289, code lost:
        if (r2.zzk() != false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x028b, code lost:
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x028d, code lost:
        r33.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
        r4 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0095, code lost:
        if (r33.zzo != 3) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
        r3 = r2.zzb();
        r33.zzz = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        if (r2.zzf >= r2.zzi) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a3, code lost:
        ((com.google.android.gms.internal.ads.zzyl) r34).zzo(r3, false);
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ac, code lost:
        if (r1 != null) goto L311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00af, code lost:
        r3 = r2.zzb.zzn;
        r1 = r1.zzd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b5, code lost:
        if (r1 == 0) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
        r3.zzG(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:
        if (r2.zzb.zzb(r2.zzf) == false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c4, code lost:
        r3.zzG(r3.zzo() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d1, code lost:
        if (r2.zzk() != false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d3, code lost:
        r33.zzy = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d5, code lost:
        r33.zzo = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d7, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
        if (r2.zzd.zza.zzg != 1) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e2, code lost:
        r33.zzz = r3 - 8;
        ((com.google.android.gms.internal.ads.zzyl) r34).zzo(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00fa, code lost:
        if ("audio/ac4".equals(r2.zzd.zza.zzf.zzm) == false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fc, code lost:
        r33.zzA = r2.zzc(r33.zzz, 7);
        com.google.android.gms.internal.ads.zzxz.zzb(r33.zzz, r33.zzj);
        com.google.android.gms.internal.ads.zzzw.zzb(r2.zza, r33.zzj, 7);
        r3 = r33.zzA + 7;
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0119, code lost:
        r3 = r2.zzc(r33.zzz, 0);
        r33.zzA = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0121, code lost:
        r33.zzz += r3;
        r33.zzo = 4;
        r33.zzB = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x012b, code lost:
        r3 = r2.zzd.zza;
        r5 = r2.zza;
        r12 = r2.zze();
        r6 = r3.zzj;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0137, code lost:
        if (r6 != 0) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0139, code lost:
        r3 = r33.zzA;
        r4 = r33.zzz;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013d, code lost:
        if (r3 >= r4) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x013f, code lost:
        r33.zzA += com.google.android.gms.internal.ads.zzzw.zza(r5, r34, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014a, code lost:
        r10 = r33.zzg.zzH();
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r14 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0160, code lost:
        if (r33.zzA >= r33.zzz) goto L389;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0162, code lost:
        r11 = r33.zzB;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0166, code lost:
        if (r11 != 0) goto L383;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0168, code lost:
        ((com.google.android.gms.internal.ads.zzyl) r34).zzn(r10, r6, r14, r9);
        r33.zzg.zzF(r9);
        r11 = r33.zzg.zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0179, code lost:
        if (r11 <= 0) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x017b, code lost:
        r33.zzB = r11 - 1;
        r33.zzf.zzF(r9);
        com.google.android.gms.internal.ads.zzzw.zzb(r5, r33.zzf, 4);
        com.google.android.gms.internal.ads.zzzw.zzb(r5, r33.zzg, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0192, code lost:
        if (r33.zzF.length <= 0) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0194, code lost:
        r11 = r3.zzf.zzm;
        r17 = r10[4];
        r9 = com.google.android.gms.internal.ads.zzzo.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a2, code lost:
        if ("video/avc".equals(r11) == false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a6, code lost:
        if ((r17 & 31) == r4) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a9, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01af, code lost:
        if ("video/hevc".equals(r11) == false) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b6, code lost:
        if (((r17 & 126) >> r8) != 39) goto L379;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b9, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01ba, code lost:
        r33.zzC = r9;
        r33.zzA += 5;
        r33.zzz += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01ce, code lost:
        throw com.google.android.gms.internal.ads.zzbp.zza("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01d1, code lost:
        if (r33.zzC == false) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01d3, code lost:
        r33.zzh.zzC(r11);
        ((com.google.android.gms.internal.ads.zzyl) r34).zzn(r33.zzh.zzH(), 0, r33.zzB, false);
        com.google.android.gms.internal.ads.zzzw.zzb(r5, r33.zzh, r33.zzB);
        r4 = r33.zzB;
        r8 = r33.zzh;
        r8 = com.google.android.gms.internal.ads.zzzo.zzb(r8.zzH(), r8.zzd());
        r33.zzh.zzF("video/hevc".equals(r3.zzf.zzm) ? 1 : 0);
        r33.zzh.zzE(r8);
        com.google.android.gms.internal.ads.zzyi.zza(r12, r33.zzh, r33.zzF);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0218, code lost:
        r4 = com.google.android.gms.internal.ads.zzzw.zza(r5, r34, r11, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x021e, code lost:
        r33.zzA += r4;
        r33.zzB -= r4;
        r4 = 6;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x022a, code lost:
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022e, code lost:
        r20 = r2.zza();
        r1 = r2.zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0236, code lost:
        if (r1 == null) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0238, code lost:
        r23 = r1.zzc;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x023d, code lost:
        r23 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v10 */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        boolean z;
        boolean z2;
        long zzw;
        long zzw2;
        String str;
        String str2;
        long zzs;
        long j;
        zzzy[] zzzyVarArr;
        long zzt;
        long zzt2;
        while (true) {
            int i = this.zzo;
            int i2 = 1;
            ?? r9 = 0;
            if (i == 0) {
                if (this.zzr == 0) {
                    if (!zzysVar.zzn(this.zzl.zzH(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzr = 8;
                    this.zzl.zzF(0);
                    this.zzq = this.zzl.zzs();
                    this.zzp = this.zzl.zze();
                }
                long j2 = this.zzq;
                if (j2 == 1) {
                    ((zzyl) zzysVar).zzn(this.zzl.zzH(), 8, 8, false);
                    this.zzr += 8;
                    this.zzq = this.zzl.zzt();
                } else if (j2 == 0) {
                    long zzd = zzysVar.zzd();
                    if (zzd == -1) {
                        zzd = !this.zzm.isEmpty() ? ((zzadt) this.zzm.peek()).zza : -1L;
                    }
                    if (zzd != -1) {
                        this.zzq = (zzd - zzysVar.zzf()) + this.zzr;
                    }
                }
                long j3 = this.zzq;
                long j4 = this.zzr;
                if (j3 >= j4) {
                    long zzf = zzysVar.zzf() - j4;
                    int i3 = this.zzp;
                    if ((i3 == 1836019558 || i3 == 1835295092) && !this.zzG) {
                        this.zzD.zzL(new zzzt(this.zzw, zzf));
                        this.zzG = true;
                    }
                    if (this.zzp == 1836019558) {
                        int size = this.zze.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            zzaev zzaevVar = ((zzaei) this.zze.valueAt(i4)).zzb;
                            zzaevVar.zzc = zzf;
                            zzaevVar.zzb = zzf;
                        }
                    }
                    int i5 = this.zzp;
                    if (i5 == 1835295092) {
                        this.zzy = null;
                        this.zzt = zzf + this.zzq;
                        this.zzo = 2;
                    } else if (i5 == 1836019574 || i5 == 1953653099 || i5 == 1835297121 || i5 == 1835626086 || i5 == 1937007212 || i5 == 1836019558 || i5 == 1953653094 || i5 == 1836475768 || i5 == 1701082227) {
                        long zzf2 = (zzysVar.zzf() + this.zzq) - 8;
                        this.zzm.push(new zzadt(i5, zzf2));
                        if (this.zzq == this.zzr) {
                            zzi(zzf2);
                        } else {
                            zzg();
                        }
                    } else if (i5 != 1751411826 && i5 != 1835296868 && i5 != 1836476516 && i5 != 1936286840 && i5 != 1937011556 && i5 != 1937011827 && i5 != 1668576371 && i5 != 1937011555 && i5 != 1937011578 && i5 != 1937013298 && i5 != 1937007471 && i5 != 1668232756 && i5 != 1937011571 && i5 != 1952867444 && i5 != 1952868452 && i5 != 1953196132 && i5 != 1953654136 && i5 != 1953658222 && i5 != 1886614376 && i5 != 1935763834 && i5 != 1935763823 && i5 != 1936027235 && i5 != 1970628964 && i5 != 1935828848 && i5 != 1936158820 && i5 != 1701606260 && i5 != 1835362404 && i5 != 1701671783) {
                        if (this.zzq > TTL.MAX_VALUE) {
                            throw zzbp.zzc("Skipping atom with length > 2147483647 (unsupported).");
                        }
                        this.zzs = null;
                        this.zzo = 1;
                    } else if (this.zzr == 8) {
                        long j5 = this.zzq;
                        if (j5 <= TTL.MAX_VALUE) {
                            zzdy zzdyVar = new zzdy((int) j5);
                            System.arraycopy(this.zzl.zzH(), 0, zzdyVar.zzH(), 0, 8);
                            this.zzs = zzdyVar;
                            this.zzo = 1;
                        } else {
                            throw zzbp.zzc("Leaf atom with length > 2147483647 (unsupported).");
                        }
                    } else {
                        throw zzbp.zzc("Leaf atom defines extended atom size (unsupported).");
                    }
                } else {
                    throw zzbp.zzc("Atom size less than header length (unsupported).");
                }
            } else if (i != 1) {
                long j6 = Long.MAX_VALUE;
                if (i != 2) {
                    zzaei zzaeiVar = this.zzy;
                    if (zzaeiVar != null) {
                        break;
                    }
                    SparseArray sparseArray = this.zze;
                    int size2 = sparseArray.size();
                    long j7 = Long.MAX_VALUE;
                    zzaei zzaeiVar2 = null;
                    for (int i6 = 0; i6 < size2; i6++) {
                        zzaei zzaeiVar3 = (zzaei) sparseArray.valueAt(i6);
                        z = zzaeiVar3.zzl;
                        if (z || zzaeiVar3.zzf != zzaeiVar3.zzd.zzb) {
                            z2 = zzaeiVar3.zzl;
                            if (!z2 || zzaeiVar3.zzh != zzaeiVar3.zzb.zzd) {
                                long zzd2 = zzaeiVar3.zzd();
                                if (zzd2 < j7) {
                                    zzaeiVar2 = zzaeiVar3;
                                    j7 = zzd2;
                                }
                            }
                        }
                    }
                    if (zzaeiVar2 == null) {
                        int zzf3 = (int) (this.zzt - zzysVar.zzf());
                        if (zzf3 >= 0) {
                            ((zzyl) zzysVar).zzo(zzf3, false);
                            zzg();
                        } else {
                            throw zzbp.zza("Offset to end of mdat was negative.", null);
                        }
                    } else {
                        int zzd3 = (int) (zzaeiVar2.zzd() - zzysVar.zzf());
                        if (zzd3 < 0) {
                            zzd3 = 0;
                        }
                        ((zzyl) zzysVar).zzo(zzd3, false);
                        this.zzy = zzaeiVar2;
                        zzaeiVar = zzaeiVar2;
                    }
                } else {
                    int size3 = this.zze.size();
                    zzaei zzaeiVar4 = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        zzaev zzaevVar2 = ((zzaei) this.zze.valueAt(i7)).zzb;
                        if (zzaevVar2.zzo) {
                            long j8 = zzaevVar2.zzc;
                            if (j8 < j6) {
                                zzaeiVar4 = (zzaei) this.zze.valueAt(i7);
                                j6 = j8;
                            }
                        }
                    }
                    if (zzaeiVar4 == null) {
                        this.zzo = 3;
                    } else {
                        int zzf4 = (int) (j6 - zzysVar.zzf());
                        if (zzf4 >= 0) {
                            zzyl zzylVar = (zzyl) zzysVar;
                            zzylVar.zzo(zzf4, false);
                            zzaev zzaevVar3 = zzaeiVar4.zzb;
                            zzdy zzdyVar2 = zzaevVar3.zzn;
                            zzylVar.zzn(zzdyVar2.zzH(), 0, zzdyVar2.zzd(), false);
                            zzaevVar3.zzn.zzF(0);
                            zzaevVar3.zzo = false;
                        } else {
                            throw zzbp.zza("Offset to encryption data was negative.", null);
                        }
                    }
                }
            } else {
                int i8 = ((int) this.zzq) - this.zzr;
                zzdy zzdyVar3 = this.zzs;
                if (zzdyVar3 != null) {
                    ((zzyl) zzysVar).zzn(zzdyVar3.zzH(), 8, i8, false);
                    zzadu zzaduVar = new zzadu(this.zzp, zzdyVar3);
                    long zzf5 = zzysVar.zzf();
                    if (!this.zzm.isEmpty()) {
                        ((zzadt) this.zzm.peek()).zzd(zzaduVar);
                    } else {
                        int i9 = zzaduVar.zzd;
                        if (i9 == 1936286840) {
                            zzdy zzdyVar4 = zzaduVar.zza;
                            zzdyVar4.zzF(8);
                            int zze = zzdyVar4.zze();
                            zzdyVar4.zzG(4);
                            long zzs2 = zzdyVar4.zzs();
                            if (zzadv.zze(zze) == 0) {
                                zzt = zzdyVar4.zzs();
                                zzt2 = zzdyVar4.zzs();
                            } else {
                                zzt = zzdyVar4.zzt();
                                zzt2 = zzdyVar4.zzt();
                            }
                            long j9 = zzt2 + zzf5;
                            long j10 = zzt;
                            long j11 = j9;
                            long zzw3 = zzeg.zzw(j10, 1000000L, zzs2);
                            zzdyVar4.zzG(2);
                            int zzo = zzdyVar4.zzo();
                            int[] iArr = new int[zzo];
                            long[] jArr = new long[zzo];
                            long[] jArr2 = new long[zzo];
                            long[] jArr3 = new long[zzo];
                            long j12 = zzw3;
                            int i10 = 0;
                            while (i10 < zzo) {
                                int zze2 = zzdyVar4.zze();
                                if ((zze2 & Integer.MIN_VALUE) == 0) {
                                    long zzs3 = zzdyVar4.zzs();
                                    iArr[i10] = zze2 & Integer.MAX_VALUE;
                                    jArr[i10] = j11;
                                    jArr3[i10] = j12;
                                    long j13 = j10 + zzs3;
                                    long[] jArr4 = jArr3;
                                    int i11 = i10;
                                    long[] jArr5 = jArr2;
                                    j12 = zzeg.zzw(j13, 1000000L, zzs2);
                                    jArr5[i11] = j12 - jArr4[i11];
                                    zzdyVar4.zzG(4);
                                    j11 += iArr[i11];
                                    i10 = i11 + 1;
                                    jArr = jArr;
                                    jArr3 = jArr4;
                                    jArr2 = jArr5;
                                    j10 = j13;
                                    zzo = zzo;
                                } else {
                                    throw zzbp.zza("Unhandled indirect reference", null);
                                }
                            }
                            Pair create = Pair.create(Long.valueOf(zzw3), new zzyj(iArr, jArr, jArr2, jArr3));
                            this.zzx = ((Long) create.first).longValue();
                            this.zzD.zzL((zzzu) create.second);
                            this.zzG = true;
                        } else if (i9 == 1701671783) {
                            zzdy zzdyVar5 = zzaduVar.zza;
                            if (this.zzE.length != 0) {
                                zzdyVar5.zzF(8);
                                int zze3 = zzadv.zze(zzdyVar5.zze());
                                if (zze3 == 0) {
                                    String zzv = zzdyVar5.zzv((char) 0);
                                    Objects.requireNonNull(zzv);
                                    String zzv2 = zzdyVar5.zzv((char) 0);
                                    Objects.requireNonNull(zzv2);
                                    long zzs4 = zzdyVar5.zzs();
                                    zzw = zzeg.zzw(zzdyVar5.zzs(), 1000000L, zzs4);
                                    long j14 = this.zzx;
                                    long j15 = j14 != -9223372036854775807L ? j14 + zzw : -9223372036854775807L;
                                    zzw2 = zzeg.zzw(zzdyVar5.zzs(), 1000L, zzs4);
                                    str = zzv;
                                    str2 = zzv2;
                                    zzs = zzdyVar5.zzs();
                                    j = j15;
                                } else if (zze3 == 1) {
                                    long zzs5 = zzdyVar5.zzs();
                                    long zzw4 = zzeg.zzw(zzdyVar5.zzt(), 1000000L, zzs5);
                                    long zzw5 = zzeg.zzw(zzdyVar5.zzs(), 1000L, zzs5);
                                    long zzs6 = zzdyVar5.zzs();
                                    String zzv3 = zzdyVar5.zzv((char) 0);
                                    Objects.requireNonNull(zzv3);
                                    String zzv4 = zzdyVar5.zzv((char) 0);
                                    Objects.requireNonNull(zzv4);
                                    zzw2 = zzw5;
                                    zzs = zzs6;
                                    str = zzv3;
                                    str2 = zzv4;
                                    j = zzw4;
                                    zzw = -9223372036854775807L;
                                }
                                byte[] bArr = new byte[zzdyVar5.zza()];
                                zzdyVar5.zzB(bArr, 0, zzdyVar5.zza());
                                zzdy zzdyVar6 = new zzdy(this.zzk.zza(new zzabd(str, str2, zzw2, zzs, bArr)));
                                int zza2 = zzdyVar6.zza();
                                for (zzzy zzzyVar : this.zzE) {
                                    zzdyVar6.zzF(0);
                                    zzzyVar.zzq(zzdyVar6, zza2);
                                }
                                if (j == -9223372036854775807L) {
                                    this.zzn.addLast(new zzaeh(zzw, true, zza2));
                                    this.zzu += zza2;
                                } else if (this.zzn.isEmpty()) {
                                    for (zzzy zzzyVar2 : this.zzE) {
                                        zzzyVar2.zzs(j, 1, zza2, 0, null);
                                    }
                                } else {
                                    this.zzn.addLast(new zzaeh(j, false, zza2));
                                    this.zzu += zza2;
                                }
                            }
                        }
                    }
                } else {
                    ((zzyl) zzysVar).zzo(i8, false);
                }
                zzi(zzysVar.zzf());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzD = zzyuVar;
        zzg();
        zzzy[] zzzyVarArr = new zzzy[2];
        this.zzE = zzzyVarArr;
        int i = 0;
        zzzy[] zzzyVarArr2 = (zzzy[]) zzeg.zzad(zzzyVarArr, 0);
        this.zzE = zzzyVarArr2;
        for (zzzy zzzyVar : zzzyVarArr2) {
            zzzyVar.zzk(zzc);
        }
        this.zzF = new zzzy[this.zzd.size()];
        int i2 = 100;
        while (i < this.zzF.length) {
            int i3 = i2 + 1;
            zzzy zzv = this.zzD.zzv(i2, 3);
            zzv.zzk((zzad) this.zzd.get(i));
            this.zzF[i] = zzv;
            i++;
            i2 = i3;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j, long j2) {
        int size = this.zze.size();
        for (int i = 0; i < size; i++) {
            ((zzaei) this.zze.valueAt(i)).zzi();
        }
        this.zzn.clear();
        this.zzu = 0;
        this.zzv = j2;
        this.zzm.clear();
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        return zzaes.zza(zzysVar);
    }

    public zzaej(int i, @z1 zzee zzeeVar) {
        this.zzd = Collections.unmodifiableList(Collections.emptyList());
        this.zzk = new zzabe();
        this.zzl = new zzdy(16);
        this.zzf = new zzdy(zzzo.zza);
        this.zzg = new zzdy(5);
        this.zzh = new zzdy();
        byte[] bArr = new byte[16];
        this.zzi = bArr;
        this.zzj = new zzdy(bArr);
        this.zzm = new ArrayDeque();
        this.zzn = new ArrayDeque();
        this.zze = new SparseArray();
        this.zzw = -9223372036854775807L;
        this.zzv = -9223372036854775807L;
        this.zzx = -9223372036854775807L;
        this.zzD = zzyu.zza;
        this.zzE = new zzzy[0];
        this.zzF = new zzzy[0];
    }
}