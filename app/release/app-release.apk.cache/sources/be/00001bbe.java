package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.microsoft.appcenter.AppCenter;
import com.p7700g.p99005.z1;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import org.xbill.DNS.TTL;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaeo implements zzyr, zzzu {
    public static final zzyy zza = zzael.zza;
    private final zzdy zzb;
    private final zzdy zzc;
    private final zzdy zzd;
    private final zzdy zze;
    private final ArrayDeque zzf;
    private final zzaer zzg;
    private final List zzh;
    private int zzi;
    private int zzj;
    private long zzk;
    private int zzl;
    @z1
    private zzdy zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private zzyu zzr;
    private zzaen[] zzs;
    private long[][] zzt;
    private int zzu;
    private long zzv;
    private int zzw;
    @z1
    private zzacr zzx;

    public zzaeo() {
        this(0);
    }

    private static int zzf(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int zzi(zzaew zzaewVar, long j) {
        int zza2 = zzaewVar.zza(j);
        return zza2 == -1 ? zzaewVar.zzb(j) : zza2;
    }

    private static long zzj(zzaew zzaewVar, long j, long j2) {
        int zzi = zzi(zzaewVar, j);
        return zzi == -1 ? j2 : Math.min(zzaewVar.zzc[zzi], j2);
    }

    private final void zzk() {
        this.zzi = 0;
        this.zzl = 0;
    }

    private final void zzl(long j) throws zzbp {
        zzbl zzblVar;
        zzbl zzblVar2;
        long j2;
        List list;
        int i;
        int i2;
        int i3;
        while (!this.zzf.isEmpty() && ((zzadt) this.zzf.peek()).zza == j) {
            zzadt zzadtVar = (zzadt) this.zzf.pop();
            if (zzadtVar.zzd == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z = this.zzw == 1;
                zzzg zzzgVar = new zzzg();
                zzadu zzb = zzadtVar.zzb(1969517665);
                if (zzb != null) {
                    Pair zza2 = zzaed.zza(zzb);
                    zzbl zzblVar3 = (zzbl) zza2.first;
                    zzbl zzblVar4 = (zzbl) zza2.second;
                    if (zzblVar3 != null) {
                        zzzgVar.zzb(zzblVar3);
                    }
                    zzblVar = zzblVar4;
                    zzblVar2 = zzblVar3;
                } else {
                    zzblVar = null;
                    zzblVar2 = null;
                }
                zzadt zza3 = zzadtVar.zza(1835365473);
                long j3 = -9223372036854775807L;
                zzbl zzb2 = zza3 != null ? zzaed.zzb(zza3) : null;
                List zzc = zzaed.zzc(zzadtVar, zzzgVar, -9223372036854775807L, null, false, z, zzaem.zza);
                int size = zzc.size();
                long j4 = -9223372036854775807L;
                int i4 = 0;
                int i5 = -1;
                while (true) {
                    j2 = 0;
                    if (i4 >= size) {
                        break;
                    }
                    zzaew zzaewVar = (zzaew) zzc.get(i4);
                    if (zzaewVar.zzb == 0) {
                        list = zzc;
                        i = size;
                    } else {
                        zzaet zzaetVar = zzaewVar.zza;
                        list = zzc;
                        long j5 = zzaetVar.zze;
                        if (j5 == j3) {
                            j5 = zzaewVar.zzh;
                        }
                        long max = Math.max(j4, j5);
                        i = size;
                        zzaen zzaenVar = new zzaen(zzaetVar, zzaewVar, this.zzr.zzv(i4, zzaetVar.zzb));
                        if ("audio/true-hd".equals(zzaetVar.zzf.zzm)) {
                            i2 = zzaewVar.zze * 16;
                        } else {
                            i2 = zzaewVar.zze + 30;
                        }
                        zzab zzb3 = zzaetVar.zzf.zzb();
                        zzb3.zzL(i2);
                        if (zzaetVar.zzb == 2 && j5 > 0 && (i3 = zzaewVar.zzb) > 1) {
                            zzb3.zzE(i3 / (((float) j5) / 1000000.0f));
                        }
                        int i6 = zzaetVar.zzb;
                        int i7 = zzaek.zzb;
                        if (i6 == 1 && zzzgVar.zza()) {
                            zzb3.zzC(zzzgVar.zza);
                            zzb3.zzD(zzzgVar.zzb);
                        }
                        int i8 = zzaetVar.zzb;
                        zzbl[] zzblVarArr = new zzbl[2];
                        zzblVarArr[0] = zzblVar;
                        zzblVarArr[1] = this.zzh.isEmpty() ? null : new zzbl(this.zzh);
                        zzbl zzblVar5 = new zzbl(new zzbk[0]);
                        if (i8 == 1) {
                            if (zzblVar2 != null) {
                                zzblVar5 = zzblVar2;
                            }
                        } else if (i8 == 2 && zzb2 != null) {
                            int i9 = 0;
                            while (true) {
                                if (i9 >= zzb2.zza()) {
                                    break;
                                }
                                zzbk zzb4 = zzb2.zzb(i9);
                                if (zzb4 instanceof zzaco) {
                                    zzaco zzacoVar = (zzaco) zzb4;
                                    if ("com.android.capture.fps".equals(zzacoVar.zza)) {
                                        zzblVar5 = new zzbl(zzacoVar);
                                        break;
                                    }
                                }
                                i9++;
                            }
                        }
                        for (int i10 = 0; i10 < 2; i10++) {
                            zzblVar5 = zzblVar5.zzd(zzblVarArr[i10]);
                        }
                        if (zzblVar5.zza() > 0) {
                            zzb3.zzM(zzblVar5);
                        }
                        zzaenVar.zzc.zzk(zzb3.zzY());
                        if (zzaetVar.zzb == 2 && i5 == -1) {
                            i5 = arrayList.size();
                        }
                        arrayList.add(zzaenVar);
                        j4 = max;
                    }
                    i4++;
                    zzc = list;
                    size = i;
                    j3 = -9223372036854775807L;
                }
                this.zzu = i5;
                this.zzv = j4;
                zzaen[] zzaenVarArr = (zzaen[]) arrayList.toArray(new zzaen[0]);
                this.zzs = zzaenVarArr;
                int length = zzaenVarArr.length;
                long[][] jArr = new long[length];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i11 = 0; i11 < zzaenVarArr.length; i11++) {
                    jArr[i11] = new long[zzaenVarArr[i11].zzb.zzb];
                    jArr2[i11] = zzaenVarArr[i11].zzb.zzf[0];
                }
                int i12 = 0;
                while (i12 < zzaenVarArr.length) {
                    long j6 = Long.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < zzaenVarArr.length; i14++) {
                        if (!zArr[i14]) {
                            long j7 = jArr2[i14];
                            if (j7 <= j6) {
                                i13 = i14;
                                j6 = j7;
                            }
                        }
                    }
                    int i15 = iArr[i13];
                    long[] jArr3 = jArr[i13];
                    jArr3[i15] = j2;
                    zzaew zzaewVar2 = zzaenVarArr[i13].zzb;
                    j2 += zzaewVar2.zzd[i15];
                    int i16 = i15 + 1;
                    iArr[i13] = i16;
                    if (i16 < jArr3.length) {
                        jArr2[i13] = zzaewVar2.zzf[i16];
                    } else {
                        zArr[i13] = true;
                        i12++;
                    }
                }
                this.zzt = jArr;
                this.zzr.zzB();
                this.zzr.zzL(this);
                this.zzf.clear();
                this.zzi = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzadt) this.zzf.peek()).zzc(zzadtVar);
            }
        }
        if (this.zzi != 2) {
            zzk();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x037e, code lost:
        r3 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    @Override // com.google.android.gms.internal.ads.zzyr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zza(zzys zzysVar, zzzr zzzrVar) throws IOException {
        boolean z;
        boolean z2;
        while (true) {
            int i = this.zzi;
            if (i == 0) {
                if (this.zzl == 0) {
                    if (!zzysVar.zzn(this.zze.zzH(), 0, 8, true)) {
                        return -1;
                    }
                    this.zzl = 8;
                    this.zze.zzF(0);
                    this.zzk = this.zze.zzs();
                    this.zzj = this.zze.zze();
                }
                long j = this.zzk;
                if (j == 1) {
                    zzysVar.zzi(this.zze.zzH(), 8, 8);
                    this.zzl += 8;
                    this.zzk = this.zze.zzt();
                } else if (j == 0) {
                    long zzd = zzysVar.zzd();
                    if (zzd == -1) {
                        zzadt zzadtVar = (zzadt) this.zzf.peek();
                        zzd = zzadtVar != null ? zzadtVar.zza : -1L;
                    }
                    if (zzd != -1) {
                        this.zzk = (zzd - zzysVar.zzf()) + this.zzl;
                    }
                }
                long j2 = this.zzk;
                int i2 = this.zzl;
                if (j2 >= i2) {
                    int i3 = this.zzj;
                    if (i3 == 1836019574 || i3 == 1953653099 || i3 == 1835297121 || i3 == 1835626086 || i3 == 1937007212 || i3 == 1701082227 || i3 == 1835365473) {
                        long zzf = zzysVar.zzf();
                        long j3 = this.zzk;
                        long j4 = this.zzl;
                        long j5 = (zzf + j3) - j4;
                        if (j3 != j4 && this.zzj == 1835365473) {
                            this.zzd.zzC(8);
                            zzysVar.zzh(this.zzd.zzH(), 0, 8);
                            zzaed.zzd(this.zzd);
                            zzysVar.zzk(this.zzd.zzc());
                            zzysVar.zzj();
                        }
                        this.zzf.push(new zzadt(this.zzj, j5));
                        if (this.zzk == this.zzl) {
                            zzl(j5);
                        } else {
                            zzk();
                        }
                    } else if (i3 != 1835296868 && i3 != 1836476516 && i3 != 1751411826 && i3 != 1937011556 && i3 != 1937011827 && i3 != 1937011571 && i3 != 1668576371 && i3 != 1701606260 && i3 != 1937011555 && i3 != 1937011578 && i3 != 1937013298 && i3 != 1937007471 && i3 != 1668232756 && i3 != 1953196132 && i3 != 1718909296 && i3 != 1969517665 && i3 != 1801812339 && i3 != 1768715124) {
                        long zzf2 = zzysVar.zzf();
                        long j6 = this.zzl;
                        long j7 = zzf2 - j6;
                        if (this.zzj == 1836086884) {
                            this.zzx = new zzacr(0L, j7, -9223372036854775807L, j7 + j6, this.zzk - j6);
                        }
                        this.zzm = null;
                        this.zzi = 1;
                    } else {
                        boolean z3 = false;
                        zzcw.zzf(z3);
                        zzcw.zzf(this.zzk <= TTL.MAX_VALUE);
                        zzdy zzdyVar = new zzdy((int) this.zzk);
                        System.arraycopy(this.zze.zzH(), 0, zzdyVar.zzH(), 0, 8);
                        this.zzm = zzdyVar;
                        this.zzi = 1;
                    }
                } else {
                    throw zzbp.zzc("Atom size less than header length (unsupported).");
                }
            } else if (i != 1) {
                long zzf3 = zzysVar.zzf();
                int i4 = this.zzn;
                if (i4 == -1) {
                    long j8 = Long.MAX_VALUE;
                    long j9 = Long.MAX_VALUE;
                    long j10 = Long.MAX_VALUE;
                    int i5 = 0;
                    int i6 = -1;
                    boolean z4 = true;
                    boolean z5 = true;
                    int i7 = -1;
                    while (true) {
                        zzaen[] zzaenVarArr = this.zzs;
                        if (i5 >= zzaenVarArr.length) {
                            break;
                        }
                        zzaen zzaenVar = zzaenVarArr[i5];
                        int i8 = zzaenVar.zze;
                        zzaew zzaewVar = zzaenVar.zzb;
                        if (i8 != zzaewVar.zzb) {
                            long j11 = zzaewVar.zzc[i8];
                            long j12 = ((long[][]) zzeg.zzG(this.zzt))[i5][i8];
                            long j13 = j11 - zzf3;
                            boolean z6 = j13 < 0 || j13 >= PlaybackStateCompat.K;
                            if (z6) {
                                z = z5;
                            } else {
                                if (!z5) {
                                    z = false;
                                }
                                z5 = z6;
                                i6 = i5;
                                j9 = j13;
                                j10 = j12;
                                if (j12 < j8) {
                                    z4 = z6;
                                    i7 = i5;
                                    j8 = j12;
                                }
                            }
                            if (z6 != z || j13 >= j9) {
                                z5 = z;
                                if (j12 < j8) {
                                }
                            }
                            z5 = z6;
                            i6 = i5;
                            j9 = j13;
                            j10 = j12;
                            if (j12 < j8) {
                            }
                        }
                        i5++;
                    }
                    i4 = (j8 == Long.MAX_VALUE || !z4 || j10 < j8 + AppCenter.DEFAULT_MAX_STORAGE_SIZE_IN_BYTES) ? i6 : i7;
                    this.zzn = i4;
                    if (i4 == -1) {
                        return -1;
                    }
                }
                zzaen zzaenVar2 = this.zzs[i4];
                zzzy zzzyVar = zzaenVar2.zzc;
                int i9 = zzaenVar2.zze;
                zzaew zzaewVar2 = zzaenVar2.zzb;
                long j14 = zzaewVar2.zzc[i9];
                int i10 = zzaewVar2.zzd[i9];
                zzzz zzzzVar = zzaenVar2.zzd;
                long j15 = (j14 - zzf3) + this.zzo;
                if (j15 >= 0 && j15 < PlaybackStateCompat.K) {
                    if (zzaenVar2.zza.zzg == 1) {
                        j15 += 8;
                        i10 -= 8;
                    }
                    zzysVar.zzk((int) j15);
                    zzaet zzaetVar = zzaenVar2.zza;
                    int i11 = zzaetVar.zzj;
                    if (i11 != 0) {
                        byte[] zzH = this.zzc.zzH();
                        zzH[0] = 0;
                        zzH[1] = 0;
                        zzH[2] = 0;
                        int i12 = 4 - i11;
                        while (this.zzp < i10) {
                            int i13 = this.zzq;
                            if (i13 == 0) {
                                zzysVar.zzi(zzH, i12, i11);
                                this.zzo += i11;
                                this.zzc.zzF(0);
                                int zze = this.zzc.zze();
                                if (zze >= 0) {
                                    this.zzq = zze;
                                    this.zzb.zzF(0);
                                    zzzw.zzb(zzzyVar, this.zzb, 4);
                                    this.zzp += 4;
                                    i10 += i12;
                                } else {
                                    throw zzbp.zza("Invalid NAL length", null);
                                }
                            } else {
                                int zza2 = zzzw.zza(zzzyVar, zzysVar, i13, false);
                                this.zzo += zza2;
                                this.zzp += zza2;
                                this.zzq -= zza2;
                            }
                        }
                    } else {
                        if ("audio/ac4".equals(zzaetVar.zzf.zzm)) {
                            if (this.zzp == 0) {
                                zzxz.zzb(i10, this.zzd);
                                zzzw.zzb(zzzyVar, this.zzd, 7);
                                this.zzp += 7;
                            }
                            i10 += 7;
                        } else if (zzzzVar != null) {
                            zzzzVar.zzd(zzysVar);
                        }
                        while (true) {
                            int i14 = this.zzp;
                            if (i14 >= i10) {
                                break;
                            }
                            int zza3 = zzzw.zza(zzzyVar, zzysVar, i10 - i14, false);
                            this.zzo += zza3;
                            this.zzp += zza3;
                            this.zzq -= zza3;
                        }
                    }
                    zzaew zzaewVar3 = zzaenVar2.zzb;
                    long j16 = zzaewVar3.zzf[i9];
                    int i15 = zzaewVar3.zzg[i9];
                    if (zzzzVar != null) {
                        zzzzVar.zzc(zzzyVar, j16, i15, i10, 0, null);
                        if (i9 + 1 == zzaenVar2.zzb.zzb) {
                            zzzzVar.zza(zzzyVar, null);
                        }
                    } else {
                        zzzyVar.zzs(j16, i15, i10, 0, null);
                    }
                    zzaenVar2.zze++;
                    this.zzn = -1;
                    this.zzo = 0;
                    this.zzp = 0;
                    this.zzq = 0;
                    return 0;
                }
                zzzrVar.zza = j14;
                return 1;
            } else {
                long j17 = this.zzk - this.zzl;
                long zzf4 = zzysVar.zzf() + j17;
                zzdy zzdyVar2 = this.zzm;
                if (zzdyVar2 != null) {
                    zzysVar.zzi(zzdyVar2.zzH(), this.zzl, (int) j17);
                    if (this.zzj == 1718909296) {
                        zzdyVar2.zzF(8);
                        int zzf5 = zzf(zzdyVar2.zze());
                        if (zzf5 == 0) {
                            zzdyVar2.zzG(4);
                            while (true) {
                                if (zzdyVar2.zza() <= 0) {
                                    zzf5 = 0;
                                    break;
                                }
                                zzf5 = zzf(zzdyVar2.zze());
                                if (zzf5 != 0) {
                                    break;
                                }
                            }
                        }
                        this.zzw = zzf5;
                    } else if (!this.zzf.isEmpty()) {
                        ((zzadt) this.zzf.peek()).zzd(new zzadu(this.zzj, zzdyVar2));
                    }
                } else if (j17 < PlaybackStateCompat.K) {
                    zzysVar.zzk((int) j17);
                } else {
                    zzzrVar.zza = zzysVar.zzf() + j17;
                    z2 = true;
                    zzl(zzf4);
                    if (z2 && this.zzi != 2) {
                        return 1;
                    }
                }
                z2 = false;
                zzl(zzf4);
                if (z2) {
                    return 1;
                }
                continue;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzb(zzyu zzyuVar) {
        this.zzr = zzyuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final void zzc(long j, long j2) {
        zzaen[] zzaenVarArr;
        this.zzf.clear();
        this.zzl = 0;
        this.zzn = -1;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        if (j == 0) {
            zzk();
            return;
        }
        for (zzaen zzaenVar : this.zzs) {
            zzaew zzaewVar = zzaenVar.zzb;
            int zza2 = zzaewVar.zza(j2);
            if (zza2 == -1) {
                zza2 = zzaewVar.zzb(j2);
            }
            zzaenVar.zze = zza2;
            zzzz zzzzVar = zzaenVar.zzd;
            if (zzzzVar != null) {
                zzzzVar.zzb();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzyr
    public final boolean zzd(zzys zzysVar) throws IOException {
        return zzaes.zzb(zzysVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final long zze() {
        return this.zzv;
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final zzzs zzg(long j) {
        long j2;
        long j3;
        int zzb;
        zzaen[] zzaenVarArr = this.zzs;
        if (zzaenVarArr.length == 0) {
            zzzv zzzvVar = zzzv.zza;
            return new zzzs(zzzvVar, zzzvVar);
        }
        int i = this.zzu;
        long j4 = -1;
        if (i != -1) {
            zzaew zzaewVar = zzaenVarArr[i].zzb;
            int zzi = zzi(zzaewVar, j);
            if (zzi == -1) {
                zzzv zzzvVar2 = zzzv.zza;
                return new zzzs(zzzvVar2, zzzvVar2);
            }
            long j5 = zzaewVar.zzf[zzi];
            j2 = zzaewVar.zzc[zzi];
            if (j5 >= j || zzi >= zzaewVar.zzb - 1 || (zzb = zzaewVar.zzb(j)) == -1 || zzb == zzi) {
                j3 = -9223372036854775807L;
            } else {
                j3 = zzaewVar.zzf[zzb];
                j4 = zzaewVar.zzc[zzb];
            }
            j = j5;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
        }
        int i2 = 0;
        while (true) {
            zzaen[] zzaenVarArr2 = this.zzs;
            if (i2 >= zzaenVarArr2.length) {
                break;
            }
            if (i2 != this.zzu) {
                zzaew zzaewVar2 = zzaenVarArr2[i2].zzb;
                long zzj = zzj(zzaewVar2, j, j2);
                if (j3 != -9223372036854775807L) {
                    j4 = zzj(zzaewVar2, j3, j4);
                }
                j2 = zzj;
            }
            i2++;
        }
        zzzv zzzvVar3 = new zzzv(j, j2);
        return j3 == -9223372036854775807L ? new zzzs(zzzvVar3, zzzvVar3) : new zzzs(zzzvVar3, new zzzv(j3, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzzu
    public final boolean zzh() {
        return true;
    }

    public zzaeo(int i) {
        this.zzi = 0;
        this.zzg = new zzaer();
        this.zzh = new ArrayList();
        this.zze = new zzdy(16);
        this.zzf = new ArrayDeque();
        this.zzb = new zzdy(zzzo.zza);
        this.zzc = new zzdy(4);
        this.zzd = new zzdy();
        this.zzn = -1;
        this.zzr = zzyu.zza;
        this.zzs = new zzaen[0];
    }
}