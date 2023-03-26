package com.google.android.gms.internal.ads;

import android.util.Pair;
import android.util.SparseArray;
import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.UUID;
import org.xbill.DNS.TTL;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzavf implements zzatw {
    public static final zzaty zza = new zzavc();
    private static final int zzb = zzazo.zzg("seig");
    private static final byte[] zzc = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    private final SparseArray zzd;
    private final zzazh zze;
    private final zzazh zzf;
    private final zzazh zzg;
    private final zzazh zzh;
    private final zzazh zzi;
    private final byte[] zzj;
    private final Stack zzk;
    private final LinkedList zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private zzazh zzq;
    private long zzr;
    private long zzs;
    private zzave zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private zzatx zzx;
    private boolean zzy;

    public zzavf() {
        this(0, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static zzats zza(List list) {
        int zzf;
        Pair create;
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            zzaus zzausVar = (zzaus) list.get(i);
            int i2 = zzausVar.zzaR;
            int i3 = zzaut.zzX;
            if (i2 == i3) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = zzausVar.zza.zza;
                zzazh zzazhVar = new zzazh(bArr);
                if (zzazhVar.zzd() >= 32) {
                    zzazhVar.zzv(0);
                    if (zzazhVar.zze() == zzazhVar.zza() + 4 && zzazhVar.zze() == i3 && (zzf = zzaut.zzf(zzazhVar.zze())) <= 1) {
                        UUID uuid2 = new UUID(zzazhVar.zzl(), zzazhVar.zzl());
                        if (zzf == 1) {
                            zzazhVar.zzw(zzazhVar.zzi() * 16);
                        }
                        int zzi = zzazhVar.zzi();
                        if (zzi == zzazhVar.zza()) {
                            byte[] bArr2 = new byte[zzi];
                            zzazhVar.zzq(bArr2, 0, zzi);
                            create = Pair.create(uuid2, bArr2);
                            uuid = create != null ? null : (UUID) create.first;
                            if (uuid == null) {
                                arrayList.add(new zzatr(uuid, "video/mp4", bArr, false));
                            }
                        }
                    }
                }
                create = null;
                if (create != null) {
                }
                if (uuid == null) {
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zzats(arrayList);
    }

    private final void zzb() {
        this.zzm = 0;
        this.zzp = 0;
    }

    private static void zzc(zzazh zzazhVar, int i, zzavn zzavnVar) throws zzarw {
        zzazhVar.zzv(i + 8);
        int zze = zzaut.zze(zzazhVar.zze());
        if ((zze & 1) == 0) {
            boolean z = (zze & 2) != 0;
            int zzi = zzazhVar.zzi();
            int i2 = zzavnVar.zze;
            if (zzi == i2) {
                Arrays.fill(zzavnVar.zzm, 0, zzi, z);
                zzavnVar.zza(zzazhVar.zza());
                zzazhVar.zzq(zzavnVar.zzp.zza, 0, zzavnVar.zzo);
                zzavnVar.zzp.zzv(0);
                zzavnVar.zzq = false;
                return;
            }
            throw new zzarw(wo1.o("Length mismatch: ", zzi, ", ", i2));
        }
        throw new zzarw("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x0600, code lost:
        zzb();
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0604, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzh(long j) throws zzarw {
        zzavl zza2;
        zzavf zzavfVar;
        byte[] bArr;
        zzaur zzaurVar;
        SparseArray sparseArray;
        int i;
        int i2;
        zzavn zzavnVar;
        byte[] bArr2;
        int i3;
        byte[] bArr3;
        zzaur zzaurVar2;
        int i4;
        int i5;
        List list;
        int i6;
        zzaur zzaurVar3;
        zzavn zzavnVar2;
        zzave zzaveVar;
        int i7;
        int i8;
        long j2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        zzavb zzavbVar;
        int i17;
        loop0: while (true) {
            zzavf zzavfVar2 = this;
            zzavf zzavfVar3 = zzavfVar2;
            while (!zzavfVar3.zzk.isEmpty() && ((zzaur) zzavfVar3.zzk.peek()).zza == j) {
                zzaur zzaurVar4 = (zzaur) zzavfVar3.zzk.pop();
                int i18 = zzaurVar4.zzaR;
                int i19 = 12;
                int i20 = 8;
                if (i18 == zzaut.zzE) {
                    zzats zza3 = zza(zzaurVar4.zzb);
                    zzaur zza4 = zzaurVar4.zza(zzaut.zzP);
                    SparseArray sparseArray2 = new SparseArray();
                    int size = zza4.zzb.size();
                    int i21 = 0;
                    long j3 = -9223372036854775807L;
                    while (i21 < size) {
                        zzaus zzausVar = (zzaus) zza4.zzb.get(i21);
                        int i22 = zzausVar.zzaR;
                        if (i22 == zzaut.zzB) {
                            zzazh zzazhVar = zzausVar.zza;
                            zzazhVar.zzv(i19);
                            Pair create = Pair.create(Integer.valueOf(zzazhVar.zze()), new zzavb(zzazhVar.zzi() - 1, zzazhVar.zzi(), zzazhVar.zzi(), zzazhVar.zze()));
                            sparseArray2.put(((Integer) create.first).intValue(), (zzavb) create.second);
                        } else if (i22 == zzaut.zzQ) {
                            zzazh zzazhVar2 = zzausVar.zza;
                            zzazhVar2.zzv(8);
                            j3 = zzaut.zzf(zzazhVar2.zze()) == 0 ? zzazhVar2.zzm() : zzazhVar2.zzn();
                        }
                        i21++;
                        i19 = 12;
                    }
                    SparseArray sparseArray3 = new SparseArray();
                    int size2 = zzaurVar4.zzc.size();
                    for (int i23 = 0; i23 < size2; i23++) {
                        zzaur zzaurVar5 = (zzaur) zzaurVar4.zzc.get(i23);
                        if (zzaurVar5.zzaR == zzaut.zzG && (zza2 = zzava.zza(zzaurVar5, zzaurVar4.zzb(zzaut.zzF), j3, zza3, false)) != null) {
                            sparseArray3.put(zza2.zza, zza2);
                        }
                    }
                    int size3 = sparseArray3.size();
                    if (zzavfVar3.zzd.size() == 0) {
                        for (int i24 = 0; i24 < size3; i24++) {
                            zzavl zzavlVar = (zzavl) sparseArray3.valueAt(i24);
                            zzave zzaveVar2 = new zzave(zzavfVar3.zzx.zzbi(i24, zzavlVar.zzb));
                            zzaveVar2.zza(zzavlVar, (zzavb) sparseArray2.get(zzavlVar.zza));
                            zzavfVar3.zzd.put(zzavlVar.zza, zzaveVar2);
                            zzavfVar3.zzs = Math.max(zzavfVar3.zzs, zzavlVar.zze);
                        }
                        zzavfVar3.zzx.zzb();
                    } else {
                        zzayz.zze(zzavfVar3.zzd.size() == size3);
                        for (int i25 = 0; i25 < size3; i25++) {
                            zzavl zzavlVar2 = (zzavl) sparseArray3.valueAt(i25);
                            ((zzave) zzavfVar3.zzd.get(zzavlVar2.zza)).zza(zzavlVar2, (zzavb) sparseArray2.get(zzavlVar2.zza));
                        }
                    }
                } else {
                    if (i18 == zzaut.zzN) {
                        SparseArray sparseArray4 = zzavfVar3.zzd;
                        byte[] bArr4 = zzavfVar3.zzj;
                        int size4 = zzaurVar4.zzc.size();
                        int i26 = 0;
                        while (i26 < size4) {
                            zzaur zzaurVar6 = (zzaur) zzaurVar4.zzc.get(i26);
                            if (zzaurVar6.zzaR == zzaut.zzO) {
                                zzazh zzazhVar3 = zzaurVar6.zzb(zzaut.zzA).zza;
                                zzazhVar3.zzv(i20);
                                int zze = zzaut.zze(zzazhVar3.zze());
                                zzave zzaveVar3 = (zzave) sparseArray4.get(zzazhVar3.zze());
                                if (zzaveVar3 == null) {
                                    zzaveVar3 = null;
                                } else {
                                    if ((zze & 1) != 0) {
                                        long zzn = zzazhVar3.zzn();
                                        zzavn zzavnVar3 = zzaveVar3.zza;
                                        zzavnVar3.zzb = zzn;
                                        zzavnVar3.zzc = zzn;
                                    }
                                    zzavb zzavbVar2 = zzaveVar3.zzd;
                                    zzaveVar3.zza.zza = new zzavb((zze & 2) != 0 ? zzazhVar3.zzi() - 1 : zzavbVar2.zza, (zze & 8) != 0 ? zzazhVar3.zzi() : zzavbVar2.zzb, (zze & 16) != 0 ? zzazhVar3.zzi() : zzavbVar2.zzc, (zze & 32) != 0 ? zzazhVar3.zzi() : zzavbVar2.zzd);
                                }
                                if (zzaveVar3 != null) {
                                    zzavn zzavnVar4 = zzaveVar3.zza;
                                    long j4 = zzavnVar4.zzr;
                                    zzaveVar3.zzb();
                                    int i27 = zzaut.zzz;
                                    if (zzaurVar6.zzb(i27) != null) {
                                        zzazh zzazhVar4 = zzaurVar6.zzb(i27).zza;
                                        zzazhVar4.zzv(i20);
                                        j4 = zzaut.zzf(zzazhVar4.zze()) == 1 ? zzazhVar4.zzn() : zzazhVar4.zzm();
                                    }
                                    List list2 = zzaurVar6.zzb;
                                    int size5 = list2.size();
                                    int i28 = 0;
                                    int i29 = 0;
                                    int i30 = 0;
                                    while (i30 < size5) {
                                        SparseArray sparseArray5 = sparseArray4;
                                        zzaus zzausVar2 = (zzaus) list2.get(i30);
                                        int i31 = size4;
                                        long j5 = j4;
                                        if (zzausVar2.zzaR == zzaut.zzC) {
                                            zzazh zzazhVar5 = zzausVar2.zza;
                                            zzazhVar5.zzv(12);
                                            int zzi = zzazhVar5.zzi();
                                            if (zzi > 0) {
                                                i28 += zzi;
                                                i29++;
                                            }
                                        }
                                        i30++;
                                        size4 = i31;
                                        sparseArray4 = sparseArray5;
                                        j4 = j5;
                                    }
                                    sparseArray = sparseArray4;
                                    i = size4;
                                    long j6 = j4;
                                    zzaveVar3.zzg = 0;
                                    zzaveVar3.zzf = 0;
                                    zzaveVar3.zze = 0;
                                    zzavn zzavnVar5 = zzaveVar3.zza;
                                    zzavnVar5.zzd = i29;
                                    zzavnVar5.zze = i28;
                                    int[] iArr = zzavnVar5.zzg;
                                    if (iArr == null || iArr.length < i29) {
                                        zzavnVar5.zzf = new long[i29];
                                        zzavnVar5.zzg = new int[i29];
                                    }
                                    int[] iArr2 = zzavnVar5.zzh;
                                    if (iArr2 == null || iArr2.length < i28) {
                                        int i32 = (i28 * 125) / 100;
                                        zzavnVar5.zzh = new int[i32];
                                        zzavnVar5.zzi = new int[i32];
                                        zzavnVar5.zzj = new long[i32];
                                        zzavnVar5.zzk = new boolean[i32];
                                        zzavnVar5.zzm = new boolean[i32];
                                    }
                                    int i33 = 0;
                                    int i34 = 0;
                                    int i35 = 0;
                                    while (i33 < size5) {
                                        zzaus zzausVar3 = (zzaus) list2.get(i33);
                                        if (zzausVar3.zzaR == zzaut.zzC) {
                                            int i36 = i35 + 1;
                                            zzazh zzazhVar6 = zzausVar3.zza;
                                            zzazhVar6.zzv(8);
                                            int zze2 = zzaut.zze(zzazhVar6.zze());
                                            zzavl zzavlVar3 = zzaveVar3.zzc;
                                            list = list2;
                                            zzavn zzavnVar6 = zzaveVar3.zza;
                                            i6 = size5;
                                            zzavb zzavbVar3 = zzavnVar6.zza;
                                            zzavnVar6.zzg[i35] = zzazhVar6.zzi();
                                            long[] jArr = zzavnVar6.zzf;
                                            bArr3 = bArr4;
                                            long j7 = zzavnVar6.zzb;
                                            jArr[i35] = j7;
                                            if ((zze2 & 1) != 0) {
                                                zzaurVar2 = zzaurVar4;
                                                zzaurVar3 = zzaurVar6;
                                                zzavnVar2 = zzavnVar4;
                                                jArr[i35] = j7 + zzazhVar6.zze();
                                            } else {
                                                zzaurVar2 = zzaurVar4;
                                                zzaurVar3 = zzaurVar6;
                                                zzavnVar2 = zzavnVar4;
                                            }
                                            int i37 = zze2 & 4;
                                            int i38 = zzavbVar3.zzd;
                                            if (i37 != 0) {
                                                i38 = zzazhVar6.zzi();
                                            }
                                            int i39 = zze2 & 256;
                                            int i40 = zze2 & 512;
                                            int i41 = zze2 & 1024;
                                            int i42 = zze2 & 2048;
                                            long[] jArr2 = zzavlVar3.zzi;
                                            if (jArr2 != null) {
                                                i7 = i38;
                                                i5 = i26;
                                                if (jArr2.length == 1 && jArr2[0] == 0) {
                                                    i8 = i42;
                                                    j2 = zzazo.zzj(zzavlVar3.zzj[0], 1000L, zzavlVar3.zzc);
                                                    int[] iArr3 = zzavnVar6.zzh;
                                                    zzaveVar = zzaveVar3;
                                                    int[] iArr4 = zzavnVar6.zzi;
                                                    i4 = i33;
                                                    long[] jArr3 = zzavnVar6.zzj;
                                                    boolean[] zArr = zzavnVar6.zzk;
                                                    i9 = zzavnVar6.zzg[i35] + i34;
                                                    int i43 = i34;
                                                    long j8 = zzavlVar3.zzc;
                                                    long j9 = j2;
                                                    long j10 = i35 <= 0 ? zzavnVar6.zzr : j6;
                                                    i10 = i43;
                                                    while (i10 < i9) {
                                                        if (i39 != 0) {
                                                            i11 = zzazhVar6.zzi();
                                                        } else {
                                                            i11 = zzavbVar3.zzb;
                                                        }
                                                        if (i40 != 0) {
                                                            i12 = i39;
                                                            i13 = zzazhVar6.zzi();
                                                        } else {
                                                            i12 = i39;
                                                            i13 = zzavbVar3.zzc;
                                                        }
                                                        if (i10 == 0) {
                                                            i10 = 0;
                                                            if (i37 != 0) {
                                                                i14 = i37;
                                                                i15 = i7;
                                                                if (i8 == 0) {
                                                                    i16 = i8;
                                                                    zzavbVar = zzavbVar3;
                                                                    i17 = i40;
                                                                    iArr4[i10] = (int) ((zzazhVar6.zze() * 1000) / j8);
                                                                } else {
                                                                    i16 = i8;
                                                                    zzavbVar = zzavbVar3;
                                                                    i17 = i40;
                                                                    iArr4[i10] = 0;
                                                                }
                                                                jArr3[i10] = zzazo.zzj(j10, 1000L, j8) - j9;
                                                                iArr3[i10] = i13;
                                                                zArr[i10] = 1 != (((i15 >> 16) & 1) ^ 1);
                                                                j10 += i11;
                                                                i10++;
                                                                i39 = i12;
                                                                i37 = i14;
                                                                i8 = i16;
                                                                zzavbVar3 = zzavbVar;
                                                                i40 = i17;
                                                            }
                                                        }
                                                        if (i41 != 0) {
                                                            i14 = i37;
                                                            i15 = zzazhVar6.zze();
                                                        } else {
                                                            i14 = i37;
                                                            i15 = zzavbVar3.zzd;
                                                        }
                                                        if (i8 == 0) {
                                                        }
                                                        jArr3[i10] = zzazo.zzj(j10, 1000L, j8) - j9;
                                                        iArr3[i10] = i13;
                                                        zArr[i10] = 1 != (((i15 >> 16) & 1) ^ 1);
                                                        j10 += i11;
                                                        i10++;
                                                        i39 = i12;
                                                        i37 = i14;
                                                        i8 = i16;
                                                        zzavbVar3 = zzavbVar;
                                                        i40 = i17;
                                                    }
                                                    zzavnVar6.zzr = j10;
                                                    i34 = i9;
                                                    i35 = i36;
                                                }
                                            } else {
                                                i7 = i38;
                                                i5 = i26;
                                            }
                                            i8 = i42;
                                            j2 = 0;
                                            int[] iArr32 = zzavnVar6.zzh;
                                            zzaveVar = zzaveVar3;
                                            int[] iArr42 = zzavnVar6.zzi;
                                            i4 = i33;
                                            long[] jArr32 = zzavnVar6.zzj;
                                            boolean[] zArr2 = zzavnVar6.zzk;
                                            i9 = zzavnVar6.zzg[i35] + i34;
                                            int i432 = i34;
                                            long j82 = zzavlVar3.zzc;
                                            long j92 = j2;
                                            if (i35 <= 0) {
                                            }
                                            i10 = i432;
                                            while (i10 < i9) {
                                            }
                                            zzavnVar6.zzr = j10;
                                            i34 = i9;
                                            i35 = i36;
                                        } else {
                                            bArr3 = bArr4;
                                            zzaurVar2 = zzaurVar4;
                                            i4 = i33;
                                            i5 = i26;
                                            list = list2;
                                            i6 = size5;
                                            zzaurVar3 = zzaurVar6;
                                            zzavnVar2 = zzavnVar4;
                                            zzaveVar = zzaveVar3;
                                        }
                                        i33 = i4 + 1;
                                        list2 = list;
                                        size5 = i6;
                                        bArr4 = bArr3;
                                        zzaurVar4 = zzaurVar2;
                                        zzaurVar6 = zzaurVar3;
                                        zzavnVar4 = zzavnVar2;
                                        i26 = i5;
                                        zzaveVar3 = zzaveVar;
                                    }
                                    byte[] bArr5 = bArr4;
                                    zzaurVar = zzaurVar4;
                                    i2 = i26;
                                    zzavn zzavnVar7 = zzavnVar4;
                                    zzave zzaveVar4 = zzaveVar3;
                                    zzaus zzb2 = zzaurVar6.zzb(zzaut.zzaf);
                                    if (zzb2 != null) {
                                        zzavnVar = zzavnVar7;
                                        zzavm zzavmVar = zzaveVar4.zzc.zzh[zzavnVar.zza.zza];
                                        zzazh zzazhVar7 = zzb2.zza;
                                        int i44 = zzavmVar.zza;
                                        zzazhVar7.zzv(8);
                                        if ((zzaut.zze(zzazhVar7.zze()) & 1) == 1) {
                                            zzazhVar7.zzw(8);
                                        }
                                        int zzg = zzazhVar7.zzg();
                                        int zzi2 = zzazhVar7.zzi();
                                        int i45 = zzavnVar.zze;
                                        if (zzi2 == i45) {
                                            if (zzg == 0) {
                                                boolean[] zArr3 = zzavnVar.zzm;
                                                i3 = 0;
                                                for (int i46 = 0; i46 < zzi2; i46++) {
                                                    int zzg2 = zzazhVar7.zzg();
                                                    i3 += zzg2;
                                                    zArr3[i46] = zzg2 > i44;
                                                }
                                            } else {
                                                i3 = zzg * zzi2;
                                                Arrays.fill(zzavnVar.zzm, 0, zzi2, zzg > i44);
                                            }
                                            zzavnVar.zza(i3);
                                        } else {
                                            throw new zzarw(wo1.o("Length mismatch: ", zzi2, ", ", i45));
                                        }
                                    } else {
                                        zzavnVar = zzavnVar7;
                                    }
                                    zzaus zzb3 = zzaurVar6.zzb(zzaut.zzag);
                                    if (zzb3 != null) {
                                        zzazh zzazhVar8 = zzb3.zza;
                                        zzazhVar8.zzv(8);
                                        int zze3 = zzazhVar8.zze();
                                        if ((zzaut.zze(zze3) & 1) == 1) {
                                            zzazhVar8.zzw(8);
                                        }
                                        int zzi3 = zzazhVar8.zzi();
                                        if (zzi3 != 1) {
                                            throw new zzarw(wo1.l("Unexpected saio entry count: ", zzi3));
                                        }
                                        zzavnVar.zzc += zzaut.zzf(zze3) == 0 ? zzazhVar8.zzm() : zzazhVar8.zzn();
                                    }
                                    zzaus zzb4 = zzaurVar6.zzb(zzaut.zzak);
                                    if (zzb4 != null) {
                                        zzc(zzb4.zza, 0, zzavnVar);
                                    }
                                    zzaus zzb5 = zzaurVar6.zzb(zzaut.zzah);
                                    zzaus zzb6 = zzaurVar6.zzb(zzaut.zzai);
                                    if (zzb5 != null && zzb6 != null) {
                                        zzazh zzazhVar9 = zzb5.zza;
                                        zzazh zzazhVar10 = zzb6.zza;
                                        zzazhVar9.zzv(8);
                                        int zze4 = zzazhVar9.zze();
                                        int zze5 = zzazhVar9.zze();
                                        int i47 = zzb;
                                        if (zze5 == i47) {
                                            if (zzaut.zzf(zze4) == 1) {
                                                zzazhVar9.zzw(4);
                                            }
                                            if (zzazhVar9.zze() == 1) {
                                                zzazhVar10.zzv(8);
                                                int zze6 = zzazhVar10.zze();
                                                if (zzazhVar10.zze() == i47) {
                                                    int zzf = zzaut.zzf(zze6);
                                                    if (zzf == 1) {
                                                        if (zzazhVar10.zzm() == 0) {
                                                            throw new zzarw("Variable length decription in sgpd found (unsupported)");
                                                        }
                                                    } else if (zzf >= 2) {
                                                        zzazhVar10.zzw(4);
                                                    }
                                                    if (zzazhVar10.zzm() == 1) {
                                                        zzazhVar10.zzw(2);
                                                        if (zzazhVar10.zzg() == 1) {
                                                            int zzg3 = zzazhVar10.zzg();
                                                            byte[] bArr6 = new byte[16];
                                                            zzazhVar10.zzq(bArr6, 0, 16);
                                                            zzavnVar.zzl = true;
                                                            zzavnVar.zzn = new zzavm(true, zzg3, bArr6);
                                                        }
                                                    } else {
                                                        throw new zzarw("Entry count in sgpd != 1 (unsupported).");
                                                    }
                                                }
                                            } else {
                                                throw new zzarw("Entry count in sbgp != 1 (unsupported).");
                                            }
                                        }
                                    }
                                    int size6 = zzaurVar6.zzb.size();
                                    int i48 = 0;
                                    while (i48 < size6) {
                                        zzaus zzausVar4 = (zzaus) zzaurVar6.zzb.get(i48);
                                        if (zzausVar4.zzaR == zzaut.zzaj) {
                                            zzazh zzazhVar11 = zzausVar4.zza;
                                            zzazhVar11.zzv(8);
                                            bArr2 = bArr5;
                                            zzazhVar11.zzq(bArr2, 0, 16);
                                            if (Arrays.equals(bArr2, zzc)) {
                                                zzc(zzazhVar11, 16, zzavnVar);
                                            }
                                        } else {
                                            bArr2 = bArr5;
                                        }
                                        i48++;
                                        bArr5 = bArr2;
                                    }
                                    bArr = bArr5;
                                    i20 = 8;
                                    i26 = i2 + 1;
                                    bArr4 = bArr;
                                    size4 = i;
                                    sparseArray4 = sparseArray;
                                    zzaurVar4 = zzaurVar;
                                }
                            }
                            bArr = bArr4;
                            zzaurVar = zzaurVar4;
                            sparseArray = sparseArray4;
                            i = size4;
                            i2 = i26;
                            i26 = i2 + 1;
                            bArr4 = bArr;
                            size4 = i;
                            sparseArray4 = sparseArray;
                            zzaurVar4 = zzaurVar;
                        }
                        zzats zza5 = zza(zzaurVar4.zzb);
                        if (zza5 != null) {
                            zzavfVar = this;
                            int size7 = zzavfVar.zzd.size();
                            for (int i49 = 0; i49 < size7; i49++) {
                                zzave zzaveVar5 = (zzave) zzavfVar.zzd.valueAt(i49);
                                zzaveVar5.zzb.zza(zzaveVar5.zzc.zzf.zzc(zza5));
                            }
                            zzavfVar3 = zzavfVar;
                        }
                    } else {
                        zzavfVar = zzavfVar2;
                        if (!zzavfVar3.zzk.isEmpty()) {
                            ((zzaur) zzavfVar3.zzk.peek()).zzc(zzaurVar4);
                        }
                    }
                    zzavfVar2 = zzavfVar;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zzd(zzatx zzatxVar) {
        this.zzx = zzatxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final void zze(long j, long j2) {
        int size = this.zzd.size();
        for (int i = 0; i < size; i++) {
            ((zzave) this.zzd.valueAt(i)).zzb();
        }
        this.zzl.clear();
        this.zzk.clear();
        zzb();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
        r2 = r25.zzt;
        r3 = r2.zza;
        r5 = r3.zzh;
        r9 = r2.zze;
        r5 = r5[r9];
        r25.zzu = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r3.zzl == false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
        r5 = r3.zzp;
        r10 = r3.zza.zza;
        r11 = r3.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
        if (r11 == null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0093, code lost:
        r11 = r2.zzc.zzh[r10];
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0099, code lost:
        r10 = r11.zza;
        r3 = r3.zzm[r9];
        r9 = r25.zzh;
        r11 = r9.zza;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a3, code lost:
        if (true == r3) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a5, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a7, code lost:
        r12 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a9, code lost:
        r11[0] = (byte) (r12 | r10);
        r9.zzv(0);
        r2 = r2.zzb;
        r2.zzb(r25.zzh, 1);
        r2.zzb(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ba, code lost:
        if (r3 != false) goto L296;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bc, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
        r3 = r5.zzj();
        r5.zzw(-2);
        r3 = (r3 * 6) + 2;
        r2.zzb(r5, r3);
        r10 = (r10 + 1) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
        r25.zzv = r10;
        r5 = r25.zzu + r10;
        r25.zzu = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d7, code lost:
        r25.zzv = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00df, code lost:
        if (r25.zzt.zzc.zzg != 1) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e1, code lost:
        r25.zzu = r5 - 8;
        r26.zzi(8, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
        r25.zzm = 4;
        r25.zzw = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ed, code lost:
        r2 = r25.zzt;
        r3 = r2.zza;
        r5 = r2.zzc;
        r9 = r2.zzb;
        r2 = r2.zze;
        r6 = r5.zzk;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f9, code lost:
        if (r6 != 0) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fb, code lost:
        r4 = r25.zzv;
        r6 = r25.zzu;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ff, code lost:
        if (r4 >= r6) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0101, code lost:
        r25.zzv += r9.zzd(r26, r6 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x010c, code lost:
        r10 = r25.zzf.zza;
        r10[0] = 0;
        r10[1] = 0;
        r10[2] = 0;
        r4 = r6 + 1;
        r6 = 4 - r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x011f, code lost:
        if (r25.zzv >= r25.zzu) goto L295;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0121, code lost:
        r11 = r25.zzw;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0123, code lost:
        if (r11 != 0) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0125, code lost:
        r26.zzh(r10, r6, r4, false);
        r25.zzf.zzv(0);
        r25.zzw = r25.zzf.zzi() - 1;
        r25.zze.zzv(0);
        r9.zzb(r25.zze, 4);
        r9.zzb(r25.zzf, 1);
        r25.zzv += 5;
        r25.zzu += r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0153, code lost:
        r11 = r9.zzd(r26, r11, false);
        r25.zzv += r11;
        r25.zzw -= r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0162, code lost:
        r10 = (r3.zzj[r2] + r3.zzi[r2]) * 1000;
        r1 = r3.zzl;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0172, code lost:
        if (true == r1) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0174, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0176, code lost:
        r4 = 1073741824;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0178, code lost:
        r12 = r4 | (r3.zzk[r2] ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017e, code lost:
        if (r1 == false) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0180, code lost:
        r1 = r3.zzn;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0182, code lost:
        if (r1 != null) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0184, code lost:
        r1 = r5.zzh[r3.zza.zza];
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x018c, code lost:
        r2 = r25.zzt;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0190, code lost:
        if (r1 == r2.zzi) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0192, code lost:
        r2 = new com.google.android.gms.internal.ads.zzaue(1, r1.zzb);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019a, code lost:
        r2 = r2.zzh;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x019c, code lost:
        r15 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x019e, code lost:
        r1 = null;
        r15 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a0, code lost:
        r2 = r25.zzt;
        r2.zzh = r15;
        r2.zzi = r1;
        r9.zzc(r10, r12, r25.zzu, 0, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b2, code lost:
        if (r25.zzl.isEmpty() == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b4, code lost:
        r1 = r25.zzt;
        r1.zze++;
        r2 = r1.zzf + 1;
        r1.zzf = r2;
        r3 = r3.zzg;
        r4 = r1.zzg;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01c6, code lost:
        if (r2 != r3[r4]) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01c8, code lost:
        r1.zzg = r4 + 1;
        r1.zzf = 0;
        r25.zzt = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d0, code lost:
        r25.zzm = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01d3, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01d4, code lost:
        r2 = ((com.google.android.gms.internal.ads.zzavd) r25.zzl.removeFirst()).zzb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01df, code lost:
        throw null;
     */
    @Override // com.google.android.gms.internal.ads.zzatw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzf(zzatv zzatvVar, zzaub zzaubVar) throws IOException, InterruptedException {
        long zzn;
        long zzn2;
        while (true) {
            int i = this.zzm;
            int i2 = 0;
            if (i == 0) {
                if (this.zzp == 0) {
                    if (!zzatvVar.zzh(this.zzi.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.zzp = 8;
                    this.zzi.zzv(0);
                    this.zzo = this.zzi.zzm();
                    this.zzn = this.zzi.zze();
                }
                long j = this.zzo;
                if (j == 1) {
                    zzatvVar.zzh(this.zzi.zza, 8, 8, false);
                    this.zzp += 8;
                    j = this.zzi.zzn();
                    this.zzo = j;
                }
                long j2 = this.zzp;
                if (j >= j2) {
                    long zzd = zzatvVar.zzd() - j2;
                    if (this.zzn == zzaut.zzN) {
                        int size = this.zzd.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            zzavn zzavnVar = ((zzave) this.zzd.valueAt(i3)).zza;
                            zzavnVar.zzc = zzd;
                            zzavnVar.zzb = zzd;
                        }
                    }
                    int i4 = this.zzn;
                    if (i4 == zzaut.zzk) {
                        this.zzt = null;
                        this.zzr = zzd + this.zzo;
                        if (!this.zzy) {
                            this.zzx.zzc(new zzauc(this.zzs));
                            this.zzy = true;
                        }
                        this.zzm = 2;
                    } else if (i4 != zzaut.zzE && i4 != zzaut.zzG && i4 != zzaut.zzH && i4 != zzaut.zzI && i4 != zzaut.zzJ && i4 != zzaut.zzN && i4 != zzaut.zzO && i4 != zzaut.zzP && i4 != zzaut.zzS) {
                        if (i4 != zzaut.zzV && i4 != zzaut.zzU && i4 != zzaut.zzF && i4 != zzaut.zzD && i4 != zzaut.zzW && i4 != zzaut.zzz && i4 != zzaut.zzA && i4 != zzaut.zzR && i4 != zzaut.zzB && i4 != zzaut.zzC && i4 != zzaut.zzX && i4 != zzaut.zzaf && i4 != zzaut.zzag && i4 != zzaut.zzak && i4 != zzaut.zzaj && i4 != zzaut.zzah && i4 != zzaut.zzai && i4 != zzaut.zzT && i4 != zzaut.zzQ && i4 != zzaut.zzaI) {
                            if (this.zzo <= TTL.MAX_VALUE) {
                                this.zzq = null;
                                this.zzm = 1;
                            } else {
                                throw new zzarw("Skipping atom with length > 2147483647 (unsupported).");
                            }
                        } else if (this.zzp == 8) {
                            long j3 = this.zzo;
                            if (j3 <= TTL.MAX_VALUE) {
                                zzazh zzazhVar = new zzazh((int) j3);
                                this.zzq = zzazhVar;
                                System.arraycopy(this.zzi.zza, 0, zzazhVar.zza, 0, 8);
                                this.zzm = 1;
                            } else {
                                throw new zzarw("Leaf atom with length > 2147483647 (unsupported).");
                            }
                        } else {
                            throw new zzarw("Leaf atom defines extended atom size (unsupported).");
                        }
                    } else {
                        long zzd2 = (zzatvVar.zzd() + this.zzo) - 8;
                        this.zzk.add(new zzaur(i4, zzd2));
                        if (this.zzo == this.zzp) {
                            zzh(zzd2);
                        } else {
                            zzb();
                        }
                    }
                } else {
                    throw new zzarw("Atom size less than header length (unsupported).");
                }
            } else if (i != 1) {
                long j4 = Long.MAX_VALUE;
                if (i != 2) {
                    if (i != 3) {
                        break;
                    } else {
                        if (this.zzt != null) {
                            break;
                        }
                        SparseArray sparseArray = this.zzd;
                        int size2 = sparseArray.size();
                        zzave zzaveVar = null;
                        for (int i5 = 0; i5 < size2; i5++) {
                            zzave zzaveVar2 = (zzave) sparseArray.valueAt(i5);
                            int i6 = zzaveVar2.zzg;
                            zzavn zzavnVar2 = zzaveVar2.zza;
                            if (i6 != zzavnVar2.zzd) {
                                long j5 = zzavnVar2.zzf[i6];
                                if (j5 < j4) {
                                    zzaveVar = zzaveVar2;
                                    j4 = j5;
                                }
                            }
                        }
                        if (zzaveVar == null) {
                            int zzd3 = (int) (this.zzr - zzatvVar.zzd());
                            if (zzd3 >= 0) {
                                zzatvVar.zzi(zzd3, false);
                                zzb();
                            } else {
                                throw new zzarw("Offset to end of mdat was negative.");
                            }
                        } else {
                            int zzd4 = (int) (zzaveVar.zza.zzf[zzaveVar.zzg] - zzatvVar.zzd());
                            if (zzd4 < 0) {
                                zzd4 = 0;
                            }
                            zzatvVar.zzi(zzd4, false);
                            this.zzt = zzaveVar;
                        }
                    }
                } else {
                    int size3 = this.zzd.size();
                    zzave zzaveVar3 = null;
                    for (int i7 = 0; i7 < size3; i7++) {
                        zzavn zzavnVar3 = ((zzave) this.zzd.valueAt(i7)).zza;
                        if (zzavnVar3.zzq) {
                            long j6 = zzavnVar3.zzc;
                            if (j6 < j4) {
                                zzaveVar3 = (zzave) this.zzd.valueAt(i7);
                                j4 = j6;
                            }
                        }
                    }
                    if (zzaveVar3 == null) {
                        this.zzm = 3;
                    } else {
                        int zzd5 = (int) (j4 - zzatvVar.zzd());
                        if (zzd5 >= 0) {
                            zzatvVar.zzi(zzd5, false);
                            zzavn zzavnVar4 = zzaveVar3.zza;
                            zzatvVar.zzh(zzavnVar4.zzp.zza, 0, zzavnVar4.zzo, false);
                            zzavnVar4.zzp.zzv(0);
                            zzavnVar4.zzq = false;
                        } else {
                            throw new zzarw("Offset to encryption data was negative.");
                        }
                    }
                }
            } else {
                int i8 = ((int) this.zzo) - this.zzp;
                zzazh zzazhVar2 = this.zzq;
                if (zzazhVar2 != null) {
                    zzatvVar.zzh(zzazhVar2.zza, 8, i8, false);
                    zzaus zzausVar = new zzaus(this.zzn, this.zzq);
                    long zzd6 = zzatvVar.zzd();
                    if (!this.zzk.isEmpty()) {
                        ((zzaur) this.zzk.peek()).zzd(zzausVar);
                    } else if (zzausVar.zzaR == zzaut.zzD) {
                        zzazh zzazhVar3 = zzausVar.zza;
                        zzazhVar3.zzv(8);
                        int zze = zzazhVar3.zze();
                        zzazhVar3.zzw(4);
                        long zzm = zzazhVar3.zzm();
                        if (zzaut.zzf(zze) == 0) {
                            zzn = zzazhVar3.zzm();
                            zzn2 = zzazhVar3.zzm();
                        } else {
                            zzn = zzazhVar3.zzn();
                            zzn2 = zzazhVar3.zzn();
                        }
                        long j7 = zzn2 + zzd6;
                        long j8 = zzn;
                        long j9 = j7;
                        long zzj = zzazo.zzj(j8, 1000000L, zzm);
                        zzazhVar3.zzw(2);
                        int zzj2 = zzazhVar3.zzj();
                        int[] iArr = new int[zzj2];
                        long[] jArr = new long[zzj2];
                        long[] jArr2 = new long[zzj2];
                        long[] jArr3 = new long[zzj2];
                        long j10 = zzj;
                        while (i2 < zzj2) {
                            int zze2 = zzazhVar3.zze();
                            if ((zze2 & Integer.MIN_VALUE) == 0) {
                                long zzm2 = zzazhVar3.zzm();
                                iArr[i2] = zze2 & Integer.MAX_VALUE;
                                jArr[i2] = j9;
                                jArr3[i2] = j10;
                                long j11 = j8 + zzm2;
                                int i9 = zzj2;
                                long[] jArr4 = jArr2;
                                long[] jArr5 = jArr3;
                                j10 = zzazo.zzj(j11, 1000000L, zzm);
                                jArr4[i2] = j10 - jArr5[i2];
                                zzazhVar3.zzw(4);
                                j9 += iArr[i2];
                                i2++;
                                jArr3 = jArr5;
                                jArr2 = jArr4;
                                jArr = jArr;
                                zzj2 = i9;
                                j8 = j11;
                            } else {
                                throw new zzarw("Unhandled indirect reference");
                            }
                        }
                        Pair create = Pair.create(Long.valueOf(zzj), new zzatu(iArr, jArr, jArr2, jArr3));
                        ((Long) create.first).longValue();
                        this.zzx.zzc((zzaud) create.second);
                        this.zzy = true;
                    }
                } else {
                    zzatvVar.zzi(i8, false);
                }
                zzh(zzatvVar.zzd());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzatw
    public final boolean zzg(zzatv zzatvVar) throws IOException, InterruptedException {
        return zzavk.zza(zzatvVar);
    }

    public zzavf(int i, zzazl zzazlVar, zzavl zzavlVar) {
        this.zzi = new zzazh(16);
        this.zze = new zzazh(zzazf.zza);
        this.zzf = new zzazh(5);
        this.zzg = new zzazh();
        this.zzh = new zzazh(1);
        this.zzj = new byte[16];
        this.zzk = new Stack();
        this.zzl = new LinkedList();
        this.zzd = new SparseArray();
        this.zzs = -9223372036854775807L;
        zzb();
    }
}