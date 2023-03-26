package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.p7700g.p99005.gc0;
import com.p7700g.p99005.tk;
import com.p7700g.p99005.z1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.xbill.DNS.TTL;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzaed {
    private static final byte[] zza = zzeg.zzZ("OpusHead");

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ae, code lost:
        if (r3 != 13) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair zza(zzadu zzaduVar) {
        zzdy zzdyVar = zzaduVar.zza;
        zzdyVar.zzF(8);
        zzbl zzblVar = null;
        zzbl zzblVar2 = null;
        while (zzdyVar.zza() >= 8) {
            int zzc = zzdyVar.zzc();
            int zze = zzdyVar.zze();
            int zze2 = zzdyVar.zze();
            if (zze2 == 1835365473) {
                zzdyVar.zzF(zzc);
                int i = zzc + zze;
                zzdyVar.zzG(8);
                zzd(zzdyVar);
                while (true) {
                    if (zzdyVar.zzc() >= i) {
                        break;
                    }
                    int zzc2 = zzdyVar.zzc();
                    int zze3 = zzdyVar.zze();
                    if (zzdyVar.zze() == 1768715124) {
                        zzdyVar.zzF(zzc2);
                        int i2 = zzc2 + zze3;
                        zzdyVar.zzG(8);
                        ArrayList arrayList = new ArrayList();
                        while (zzdyVar.zzc() < i2) {
                            zzbk zza2 = zzaek.zza(zzdyVar);
                            if (zza2 != null) {
                                arrayList.add(zza2);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            zzblVar = new zzbl(arrayList);
                        }
                    } else {
                        zzdyVar.zzF(zzc2 + zze3);
                    }
                }
                zzblVar = null;
            } else if (zze2 == 1936553057) {
                zzdyVar.zzF(zzc);
                int i3 = zzc + zze;
                zzdyVar.zzG(12);
                while (true) {
                    if (zzdyVar.zzc() >= i3) {
                        break;
                    }
                    int zzc3 = zzdyVar.zzc();
                    int zze4 = zzdyVar.zze();
                    if (zzdyVar.zze() != 1935766900) {
                        zzdyVar.zzF(zzc3 + zze4);
                    } else if (zze4 >= 14) {
                        zzdyVar.zzG(5);
                        int zzk = zzdyVar.zzk();
                        float f = 120.0f;
                        if (zzk == 12) {
                            if (zzk == 12) {
                                f = 240.0f;
                            }
                        }
                        zzdyVar.zzG(1);
                        zzblVar2 = new zzbl(new zzacu(f, zzdyVar.zzk()));
                    }
                }
                zzblVar2 = null;
            }
            zzdyVar.zzF(zzc + zze);
        }
        return Pair.create(zzblVar, zzblVar2);
    }

    @z1
    public static zzbl zzb(zzadt zzadtVar) {
        zzaco zzacoVar;
        zzadu zzb = zzadtVar.zzb(1751411826);
        zzadu zzb2 = zzadtVar.zzb(1801812339);
        zzadu zzb3 = zzadtVar.zzb(1768715124);
        if (zzb == null || zzb2 == null || zzb3 == null || zzg(zzb.zza) != 1835299937) {
            return null;
        }
        zzdy zzdyVar = zzb2.zza;
        zzdyVar.zzF(12);
        int zze = zzdyVar.zze();
        String[] strArr = new String[zze];
        for (int i = 0; i < zze; i++) {
            int zze2 = zzdyVar.zze();
            zzdyVar.zzG(4);
            strArr[i] = zzdyVar.zzx(zze2 - 8, zzfoi.zzc);
        }
        zzdy zzdyVar2 = zzb3.zza;
        zzdyVar2.zzF(8);
        ArrayList arrayList = new ArrayList();
        while (zzdyVar2.zza() > 8) {
            int zzc = zzdyVar2.zzc();
            int zze3 = zzdyVar2.zze();
            int zze4 = zzdyVar2.zze() - 1;
            if (zze4 >= 0 && zze4 < zze) {
                String str = strArr[zze4];
                int i2 = zzc + zze3;
                int i3 = zzaek.zzb;
                while (true) {
                    int zzc2 = zzdyVar2.zzc();
                    if (zzc2 >= i2) {
                        zzacoVar = null;
                        break;
                    }
                    int zze5 = zzdyVar2.zze();
                    if (zzdyVar2.zze() == 1684108385) {
                        int zze6 = zzdyVar2.zze();
                        int zze7 = zzdyVar2.zze();
                        int i4 = zze5 - 16;
                        byte[] bArr = new byte[i4];
                        zzdyVar2.zzB(bArr, 0, i4);
                        zzacoVar = new zzaco(str, bArr, zze7, zze6);
                        break;
                    }
                    zzdyVar2.zzF(zzc2 + zze5);
                }
                if (zzacoVar != null) {
                    arrayList.add(zzacoVar);
                }
            }
            zzdyVar2.zzF(zzc + zze3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzbl(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
        if (r6 == 0) goto L624;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0649, code lost:
        if (r0 != 3) goto L531;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x0739, code lost:
        if (r33 == null) goto L572;
     */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07a4  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x09b3  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x0a7b A[LOOP:13: B:483:0x0a7b->B:487:0x0a85, LOOP_START, PHI: r21 
      PHI: (r21v8 int) = (r21v7 int), (r21v9 int) binds: [B:482:0x0a79, B:487:0x0a85] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:500:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0ac7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:615:0x0a72 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List zzc(zzadt zzadtVar, zzzg zzzgVar, long j, @z1 zzv zzvVar, boolean z, boolean z2, zzfok zzfokVar) throws zzbp {
        int i;
        long j2;
        int i2;
        int i3;
        int i4;
        long j3;
        int i5;
        int i6;
        int zze;
        ArrayList arrayList;
        int i7;
        zzadz zzadzVar;
        int i8;
        zzadt zzadtVar2;
        zzadt zza2;
        long[] jArr;
        long[] jArr2;
        zzaet zzaetVar;
        int i9;
        zzfok zzfokVar2;
        Pair zzh;
        String str;
        int i10;
        zzadt zzadtVar3;
        zzaec zzaecVar;
        zzdy zzdyVar;
        zzv zzvVar2;
        int i11;
        String str2;
        int i12;
        zzadz zzadzVar2;
        int i13;
        int i14;
        float f;
        byte[] bArr;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        zzadz zzadzVar3;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z3;
        zzadz zzadzVar4;
        int i25;
        boolean z4;
        int i26;
        float f2;
        byte[] bArr2;
        int i27;
        boolean z5;
        byte[] bArr3;
        String str3;
        byte[] bArr4;
        String str4;
        List list;
        String str5;
        String str6;
        String str7;
        int i28;
        zzfrj zzfrjVar;
        long j4;
        long j5;
        ArrayList arrayList2;
        zzady zzaebVar;
        zzadu zzaduVar;
        boolean z6;
        int i29;
        int i30;
        int i31;
        int zza3;
        int[] iArr;
        zzaet zzaetVar2;
        int i32;
        int i33;
        long j6;
        int i34;
        int i35;
        int i36;
        boolean z7;
        long[] jArr3;
        int[] iArr2;
        long[] jArr4;
        int[] iArr3;
        long j7;
        int i37;
        int i38;
        int i39;
        zzdy zzdyVar2;
        int i40;
        int i41;
        long[] jArr5;
        int i42;
        zzaew zzaewVar;
        long[] jArr6;
        int[] iArr4;
        int[] iArr5;
        long[] jArr7;
        int i43;
        int i44;
        int i45;
        zzaew zzaewVar2;
        zzadt zzadtVar4 = zzadtVar;
        zzv zzvVar3 = zzvVar;
        ArrayList arrayList3 = new ArrayList();
        int i46 = 0;
        while (i46 < zzadtVar4.zzc.size()) {
            zzadt zzadtVar5 = (zzadt) zzadtVar4.zzc.get(i46);
            if (zzadtVar5.zzd != 1953653099) {
                arrayList2 = arrayList3;
                i = i46;
            } else {
                zzadu zzb = zzadtVar4.zzb(1836476516);
                Objects.requireNonNull(zzb);
                zzadt zza4 = zzadtVar5.zza(1835297121);
                Objects.requireNonNull(zza4);
                zzadu zzb2 = zza4.zzb(1751411826);
                Objects.requireNonNull(zzb2);
                int zze2 = zze(zzg(zzb2.zza));
                i = i46;
                if (zze2 == -1) {
                    zzfokVar2 = zzfokVar;
                    zzadtVar2 = zzadtVar5;
                    arrayList = arrayList3;
                    zzaetVar = null;
                    i8 = -1;
                } else {
                    zzadu zzb3 = zzadtVar5.zzb(1953196132);
                    Objects.requireNonNull(zzb3);
                    zzdy zzdyVar3 = zzb3.zza;
                    zzdyVar3.zzF(8);
                    int zze3 = zzadv.zze(zzdyVar3.zze());
                    zzdyVar3.zzG(zze3 == 0 ? 8 : 16);
                    int zze4 = zzdyVar3.zze();
                    zzdyVar3.zzG(4);
                    int zzc = zzdyVar3.zzc();
                    int i47 = zze3 == 0 ? 4 : 8;
                    int i48 = 0;
                    while (true) {
                        if (i48 < i47) {
                            if (zzdyVar3.zzH()[zzc + i48] != -1) {
                                j2 = zze3 == 0 ? zzdyVar3.zzs() : zzdyVar3.zzt();
                            } else {
                                i48++;
                            }
                        } else {
                            zzdyVar3.zzG(i47);
                            break;
                        }
                    }
                    j2 = -9223372036854775807L;
                    zzdyVar3.zzG(16);
                    int zze5 = zzdyVar3.zze();
                    int zze6 = zzdyVar3.zze();
                    zzdyVar3.zzG(4);
                    int zze7 = zzdyVar3.zze();
                    int zze8 = zzdyVar3.zze();
                    int i49 = 65536;
                    if (zze5 == 0) {
                        if (zze6 == 65536) {
                            if (zze7 != -65536) {
                                zze6 = 65536;
                            } else if (zze8 == 0) {
                                i4 = 90;
                                zzaec zzaecVar2 = new zzaec(zze4, j2, i4);
                                if (j == -9223372036854775807L) {
                                    j5 = zzaecVar2.zzb;
                                    j3 = j5;
                                } else {
                                    j3 = j;
                                }
                                zzdy zzdyVar4 = zzb.zza;
                                zzdyVar4.zzF(8);
                                zzdyVar4.zzG(zzadv.zze(zzdyVar4.zze()) == 0 ? 8 : 16);
                                long zzs = zzdyVar4.zzs();
                                long zzw = j3 != -9223372036854775807L ? zzeg.zzw(j3, 1000000L, zzs) : -9223372036854775807L;
                                zzadt zza5 = zza4.zza(1835626086);
                                Objects.requireNonNull(zza5);
                                zzadt zza6 = zza5.zza(1937007212);
                                Objects.requireNonNull(zza6);
                                zzadu zzb4 = zza4.zzb(1835296868);
                                Objects.requireNonNull(zzb4);
                                Pair zzi = zzi(zzb4.zza);
                                zzadu zzb5 = zza6.zzb(1937011556);
                                Objects.requireNonNull(zzb5);
                                zzdy zzdyVar5 = zzb5.zza;
                                i5 = zzaecVar2.zza;
                                i6 = zzaecVar2.zzc;
                                String str8 = (String) zzi.second;
                                zzdyVar5.zzF(12);
                                zze = zzdyVar5.zze();
                                zzadz zzadzVar5 = new zzadz(zze);
                                arrayList = arrayList3;
                                i7 = 0;
                                while (i7 < zze) {
                                    int zzc2 = zzdyVar5.zzc();
                                    Pair pair = zzi;
                                    int zze9 = zzdyVar5.zze();
                                    String str9 = "childAtomSize must be positive";
                                    zzyv.zzb(zze9 > 0, "childAtomSize must be positive");
                                    int zze10 = zzdyVar5.zze();
                                    int i50 = zze;
                                    if (zze10 == 1635148593 || zze10 == 1635148595 || zze10 == 1701733238 || zze10 == 1831958048 || zze10 == 1836070006 || zze10 == 1752589105 || zze10 == 1751479857 || zze10 == 1932670515 || zze10 == 1211250227 || zze10 == 1987063864 || zze10 == 1987063865 || zze10 == 1635135537 || zze10 == 1685479798 || zze10 == 1685479729 || zze10 == 1685481573 || zze10 == 1685481521) {
                                        str = str8;
                                        int i51 = i6;
                                        int i52 = i5;
                                        i10 = zze2;
                                        zzadtVar3 = zzadtVar5;
                                        zzaecVar = zzaecVar2;
                                        zzdyVar = zzdyVar5;
                                        zzdyVar.zzF(zzc2 + 16);
                                        zzdyVar.zzG(16);
                                        int zzo = zzdyVar.zzo();
                                        int zzo2 = zzdyVar.zzo();
                                        zzdyVar.zzG(50);
                                        int zzc3 = zzdyVar.zzc();
                                        if (zze10 == 1701733238) {
                                            Pair zzj = zzj(zzdyVar, zzc2, zze9);
                                            if (zzj != null) {
                                                int intValue = ((Integer) zzj.first).intValue();
                                                zzvVar2 = zzvVar3 == null ? null : zzvVar3.zzb(((zzaeu) zzj.second).zzb);
                                                zzadzVar5.zza[i7] = (zzaeu) zzj.second;
                                                zze10 = intValue;
                                            } else {
                                                zzvVar2 = zzvVar3;
                                                zze10 = 1701733238;
                                            }
                                            zzdyVar.zzF(zzc3);
                                        } else {
                                            zzvVar2 = zzvVar3;
                                        }
                                        if (zze10 == 1831958048) {
                                            int i53 = zze10;
                                            str2 = "video/mpeg";
                                            i11 = i53;
                                        } else {
                                            i11 = 1211250227;
                                            if (zze10 == 1211250227) {
                                                str2 = "video/3gpp";
                                            } else {
                                                i11 = zze10;
                                                str2 = null;
                                            }
                                        }
                                        int i54 = zzc3;
                                        zzv zzvVar4 = zzvVar2;
                                        i12 = i7;
                                        String str10 = null;
                                        float f3 = 1.0f;
                                        byte[] bArr5 = null;
                                        int i55 = -1;
                                        int i56 = -1;
                                        int i57 = -1;
                                        ByteBuffer byteBuffer = null;
                                        zzadx zzadxVar = null;
                                        int i58 = -1;
                                        List list2 = null;
                                        String str11 = str2;
                                        boolean z8 = false;
                                        while (true) {
                                            if (i54 - zzc2 >= zze9) {
                                                zzadzVar2 = zzadzVar5;
                                                i13 = zzc2;
                                                i14 = zzo2;
                                                f = f3;
                                                bArr = bArr5;
                                                i15 = i55;
                                                break;
                                            }
                                            zzdyVar.zzF(i54);
                                            int zzc4 = zzdyVar.zzc();
                                            int zze11 = zzdyVar.zze();
                                            if (zze11 == 0) {
                                                i15 = i55;
                                                if (zzdyVar.zzc() - zzc2 == zze9) {
                                                    zzadzVar2 = zzadzVar5;
                                                    i13 = zzc2;
                                                    i14 = zzo2;
                                                    f = f3;
                                                    bArr = bArr5;
                                                    break;
                                                }
                                                i23 = 0;
                                            } else {
                                                i15 = i55;
                                                i23 = zze11;
                                            }
                                            if (i23 > 0) {
                                                i24 = zzc2;
                                                z3 = true;
                                            } else {
                                                i24 = zzc2;
                                                z3 = false;
                                            }
                                            zzyv.zzb(z3, str9);
                                            int zze12 = zzdyVar.zze();
                                            String str12 = str9;
                                            if (zze12 == 1635148611) {
                                                zzyv.zzb(str11 == null, null);
                                                zzdyVar.zzF(zzc4 + 8);
                                                zzya zza7 = zzya.zza(zzdyVar);
                                                list = zza7.zza;
                                                zzadzVar5.zzc = zza7.zzb;
                                                if (!z8) {
                                                    f3 = zza7.zze;
                                                }
                                                str5 = zza7.zzf;
                                                str6 = "video/avc";
                                            } else if (zze12 == 1752589123) {
                                                zzyv.zzb(str11 == null, null);
                                                zzdyVar.zzF(zzc4 + 8);
                                                zzzh zza8 = zzzh.zza(zzdyVar);
                                                list = zza8.zza;
                                                zzadzVar5.zzc = zza8.zzb;
                                                if (!z8) {
                                                    f3 = zza8.zzc;
                                                }
                                                str5 = zza8.zzd;
                                                str6 = "video/hevc";
                                            } else {
                                                if (zze12 == 1685480259 || zze12 == 1685485123) {
                                                    zzadzVar4 = zzadzVar5;
                                                    i25 = i11;
                                                    z4 = z8;
                                                    i26 = zzo2;
                                                    f2 = f3;
                                                    bArr2 = bArr5;
                                                    i27 = zze9;
                                                    zzyo zza9 = zzyo.zza(zzdyVar);
                                                    if (zza9 != null) {
                                                        str10 = zza9.zza;
                                                        str11 = "video/dolby-vision";
                                                    }
                                                } else {
                                                    if (zze12 == 1987076931) {
                                                        zzyv.zzb(str11 == null, null);
                                                        str4 = i11 == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                                    } else if (zze12 == 1635135811) {
                                                        zzyv.zzb(str11 == null, null);
                                                        str4 = "video/av01";
                                                    } else if (zze12 == 1668050025) {
                                                        if (byteBuffer == null) {
                                                            byteBuffer = zzl();
                                                        }
                                                        ByteBuffer byteBuffer2 = byteBuffer;
                                                        byteBuffer2.position(21);
                                                        byteBuffer2.putShort(zzdyVar.zzy());
                                                        byteBuffer2.putShort(zzdyVar.zzy());
                                                        zzadzVar4 = zzadzVar5;
                                                        byteBuffer = byteBuffer2;
                                                        i25 = i11;
                                                        i26 = zzo2;
                                                        i27 = zze9;
                                                        i54 += i23;
                                                        zzc2 = i24;
                                                        i55 = i15;
                                                        str9 = str12;
                                                        i11 = i25;
                                                        zze9 = i27;
                                                        zzadzVar5 = zzadzVar4;
                                                        zzo2 = i26;
                                                    } else {
                                                        if (zze12 == 1835295606) {
                                                            if (byteBuffer == null) {
                                                                byteBuffer = zzl();
                                                            }
                                                            ByteBuffer byteBuffer3 = byteBuffer;
                                                            short zzy = zzdyVar.zzy();
                                                            short zzy2 = zzdyVar.zzy();
                                                            i25 = i11;
                                                            short zzy3 = zzdyVar.zzy();
                                                            z4 = z8;
                                                            short zzy4 = zzdyVar.zzy();
                                                            i27 = zze9;
                                                            short zzy5 = zzdyVar.zzy();
                                                            zzadzVar4 = zzadzVar5;
                                                            short zzy6 = zzdyVar.zzy();
                                                            bArr2 = bArr5;
                                                            short zzy7 = zzdyVar.zzy();
                                                            f2 = f3;
                                                            short zzy8 = zzdyVar.zzy();
                                                            long zzs2 = zzdyVar.zzs();
                                                            long zzs3 = zzdyVar.zzs();
                                                            i26 = zzo2;
                                                            byteBuffer3.position(1);
                                                            byteBuffer3.putShort(zzy5);
                                                            byteBuffer3.putShort(zzy6);
                                                            byteBuffer3.putShort(zzy);
                                                            byteBuffer3.putShort(zzy2);
                                                            byteBuffer3.putShort(zzy3);
                                                            byteBuffer3.putShort(zzy4);
                                                            byteBuffer3.putShort(zzy7);
                                                            byteBuffer3.putShort(zzy8);
                                                            byteBuffer3.putShort((short) (zzs2 / gc0.c));
                                                            byteBuffer3.putShort((short) (zzs3 / gc0.c));
                                                            byteBuffer = byteBuffer3;
                                                        } else {
                                                            zzadzVar4 = zzadzVar5;
                                                            i25 = i11;
                                                            z4 = z8;
                                                            i26 = zzo2;
                                                            f2 = f3;
                                                            bArr2 = bArr5;
                                                            i27 = zze9;
                                                            if (zze12 == 1681012275) {
                                                                zzyv.zzb(str11 == null, null);
                                                                str11 = "video/3gpp";
                                                            } else if (zze12 == 1702061171) {
                                                                zzyv.zzb(str11 == null, null);
                                                                zzadx zzk = zzk(zzdyVar, zzc4);
                                                                str3 = zzk.zza;
                                                                bArr4 = zzk.zzb;
                                                                zzadxVar = zzk;
                                                                str11 = str3;
                                                                list2 = bArr4 != null ? zzfrj.zzp(bArr4) : list2;
                                                            } else if (zze12 == 1885434736) {
                                                                zzdyVar.zzF(zzc4 + 8);
                                                                f3 = zzdyVar.zzn() / zzdyVar.zzn();
                                                                bArr5 = bArr2;
                                                                z8 = true;
                                                                i54 += i23;
                                                                zzc2 = i24;
                                                                i55 = i15;
                                                                str9 = str12;
                                                                i11 = i25;
                                                                zze9 = i27;
                                                                zzadzVar5 = zzadzVar4;
                                                                zzo2 = i26;
                                                            } else if (zze12 == 1937126244) {
                                                                int i59 = zzc4 + 8;
                                                                while (true) {
                                                                    if (i59 - zzc4 >= i23) {
                                                                        bArr3 = null;
                                                                        break;
                                                                    }
                                                                    zzdyVar.zzF(i59);
                                                                    int zze13 = zzdyVar.zze();
                                                                    if (zzdyVar.zze() == 1886547818) {
                                                                        bArr3 = Arrays.copyOfRange(zzdyVar.zzH(), i59, zze13 + i59);
                                                                        break;
                                                                    }
                                                                    i59 += zze13;
                                                                }
                                                                bArr5 = bArr3;
                                                                z8 = z4;
                                                                f3 = f2;
                                                                i54 += i23;
                                                                zzc2 = i24;
                                                                i55 = i15;
                                                                str9 = str12;
                                                                i11 = i25;
                                                                zze9 = i27;
                                                                zzadzVar5 = zzadzVar4;
                                                                zzo2 = i26;
                                                            } else if (zze12 == 1936995172) {
                                                                int zzk2 = zzdyVar.zzk();
                                                                int i60 = 3;
                                                                zzdyVar.zzG(3);
                                                                if (zzk2 == 0) {
                                                                    int zzk3 = zzdyVar.zzk();
                                                                    if (zzk3 == 0) {
                                                                        i60 = 0;
                                                                    } else if (zzk3 == 1) {
                                                                        i60 = 1;
                                                                    } else if (zzk3 == 2) {
                                                                        i60 = 2;
                                                                    }
                                                                    i15 = i60;
                                                                }
                                                                i60 = i15;
                                                                i15 = i60;
                                                            } else if (zze12 == 1668246642) {
                                                                int zze14 = zzdyVar.zze();
                                                                if (zze14 != 1852009592 && zze14 != 1852009571) {
                                                                    "Unsupported color type: ".concat(zzadv.zzf(zze14));
                                                                } else {
                                                                    int zzo3 = zzdyVar.zzo();
                                                                    int zzo4 = zzdyVar.zzo();
                                                                    zzdyVar.zzG(2);
                                                                    if (i23 == 19) {
                                                                        z5 = (zzdyVar.zzk() & 128) != 0;
                                                                        i23 = 19;
                                                                    } else {
                                                                        z5 = false;
                                                                    }
                                                                    int zza10 = zzo.zza(zzo3);
                                                                    int i61 = true != z5 ? 2 : 1;
                                                                    i58 = zza10;
                                                                    i56 = zzo.zzb(zzo4);
                                                                    i57 = i61;
                                                                }
                                                            }
                                                        }
                                                        z8 = z4;
                                                        bArr5 = bArr2;
                                                        f3 = f2;
                                                        i54 += i23;
                                                        zzc2 = i24;
                                                        i55 = i15;
                                                        str9 = str12;
                                                        i11 = i25;
                                                        zze9 = i27;
                                                        zzadzVar5 = zzadzVar4;
                                                        zzo2 = i26;
                                                    }
                                                    zzadzVar4 = zzadzVar5;
                                                    str11 = str4;
                                                    i25 = i11;
                                                    i26 = zzo2;
                                                    i27 = zze9;
                                                    i54 += i23;
                                                    zzc2 = i24;
                                                    i55 = i15;
                                                    str9 = str12;
                                                    i11 = i25;
                                                    zze9 = i27;
                                                    zzadzVar5 = zzadzVar4;
                                                    zzo2 = i26;
                                                }
                                                z8 = z4;
                                                bArr5 = bArr2;
                                                f3 = f2;
                                                i54 += i23;
                                                zzc2 = i24;
                                                i55 = i15;
                                                str9 = str12;
                                                i11 = i25;
                                                zze9 = i27;
                                                zzadzVar5 = zzadzVar4;
                                                zzo2 = i26;
                                            }
                                            zzadzVar4 = zzadzVar5;
                                            i25 = i11;
                                            list2 = list;
                                            i26 = zzo2;
                                            str11 = str6;
                                            i27 = zze9;
                                            str10 = str5;
                                            i54 += i23;
                                            zzc2 = i24;
                                            i55 = i15;
                                            str9 = str12;
                                            i11 = i25;
                                            zze9 = i27;
                                            zzadzVar5 = zzadzVar4;
                                            zzo2 = i26;
                                        }
                                        i16 = zze9;
                                        if (str11 == null) {
                                            i17 = i52;
                                            i18 = i51;
                                            zzadzVar3 = zzadzVar2;
                                        } else {
                                            zzab zzabVar = new zzab();
                                            i17 = i52;
                                            zzabVar.zzG(i17);
                                            zzabVar.zzS(str11);
                                            zzabVar.zzx(str10);
                                            zzabVar.zzX(zzo);
                                            zzabVar.zzF(i14);
                                            zzabVar.zzP(f);
                                            i18 = i51;
                                            zzabVar.zzR(i18);
                                            zzabVar.zzQ(bArr);
                                            zzabVar.zzV(i15);
                                            zzabVar.zzI(list2);
                                            zzabVar.zzB(zzvVar4);
                                            int i62 = i58;
                                            if (i62 == -1) {
                                                i20 = i57;
                                                i19 = i56;
                                                if (i20 == -1) {
                                                    if (i19 == -1) {
                                                    }
                                                }
                                            } else {
                                                i19 = i56;
                                                i20 = i57;
                                            }
                                            zzabVar.zzy(new zzo(i62, i20, i19, byteBuffer != null ? byteBuffer.array() : null));
                                            if (zzadxVar != null) {
                                                i21 = zzadxVar.zzc;
                                                zzabVar.zzv(i21);
                                                i22 = zzadxVar.zzd;
                                                zzabVar.zzO(i22);
                                            }
                                            zzadzVar3 = zzadzVar2;
                                            zzadzVar3.zzb = zzabVar.zzY();
                                        }
                                    } else if (zze10 == 1836069985 || zze10 == 1701733217 || zze10 == 1633889587 || zze10 == 1700998451 || zze10 == 1633889588 || zze10 == 1835823201 || zze10 == 1685353315 || zze10 == 1685353317 || zze10 == 1685353320 || zze10 == 1685353324 || zze10 == 1685353336 || zze10 == 1935764850 || zze10 == 1935767394 || zze10 == 1819304813 || zze10 == 1936684916 || zze10 == 1953984371 || zze10 == 778924082 || zze10 == 778924083 || zze10 == 1835557169 || zze10 == 1835560241 || zze10 == 1634492771 || zze10 == 1634492791 || zze10 == 1970037111 || zze10 == 1332770163 || zze10 == 1716281667) {
                                        str = str8;
                                        zzaecVar = zzaecVar2;
                                        i10 = zze2;
                                        zzdyVar = zzdyVar5;
                                        zzadtVar3 = zzadtVar5;
                                        zzm(zzdyVar5, zze10, zzc2, zze9, i5, str, z2, zzvVar, zzadzVar5, i7);
                                        zzadzVar3 = zzadzVar5;
                                        i13 = zzc2;
                                        i12 = i7;
                                        i16 = zze9;
                                        i17 = i5;
                                        i18 = i6;
                                    } else {
                                        if (zze10 == 1414810956 || zze10 == 1954034535 || zze10 == 2004251764 || zze10 == 1937010800 || zze10 == 1664495672) {
                                            zzdyVar5.zzF(zzc2 + 16);
                                            if (zze10 == 1414810956) {
                                                str7 = "application/ttml+xml";
                                            } else {
                                                if (zze10 == 1954034535) {
                                                    int i63 = zze9 - 16;
                                                    byte[] bArr6 = new byte[i63];
                                                    zzdyVar5.zzB(bArr6, 0, i63);
                                                    i28 = zze2;
                                                    j4 = Long.MAX_VALUE;
                                                    zzfrjVar = zzfrj.zzp(bArr6);
                                                    str7 = "application/x-quicktime-tx3g";
                                                } else if (zze10 == 2004251764) {
                                                    str7 = "application/x-mp4-vtt";
                                                } else if (zze10 == 1937010800) {
                                                    str7 = "application/ttml+xml";
                                                    i28 = zze2;
                                                    zzfrjVar = null;
                                                    j4 = 0;
                                                } else {
                                                    zzadzVar5.zzd = 1;
                                                    str7 = "application/x-mp4-cea-608";
                                                }
                                                zzab zzabVar2 = new zzab();
                                                zzabVar2.zzG(i5);
                                                zzabVar2.zzS(str7);
                                                zzabVar2.zzK(str8);
                                                zzabVar2.zzW(j4);
                                                zzabVar2.zzI(zzfrjVar);
                                                zzadzVar5.zzb = zzabVar2.zzY();
                                                i13 = zzc2;
                                                str = str8;
                                                i18 = i6;
                                                i17 = i5;
                                                zzadtVar3 = zzadtVar5;
                                                i12 = i7;
                                                zzaecVar = zzaecVar2;
                                                i16 = zze9;
                                                i10 = i28;
                                            }
                                            i28 = zze2;
                                            zzfrjVar = null;
                                            j4 = Long.MAX_VALUE;
                                            zzab zzabVar22 = new zzab();
                                            zzabVar22.zzG(i5);
                                            zzabVar22.zzS(str7);
                                            zzabVar22.zzK(str8);
                                            zzabVar22.zzW(j4);
                                            zzabVar22.zzI(zzfrjVar);
                                            zzadzVar5.zzb = zzabVar22.zzY();
                                            i13 = zzc2;
                                            str = str8;
                                            i18 = i6;
                                            i17 = i5;
                                            zzadtVar3 = zzadtVar5;
                                            i12 = i7;
                                            zzaecVar = zzaecVar2;
                                            i16 = zze9;
                                            i10 = i28;
                                        } else {
                                            if (zze10 == 1835365492) {
                                                zzn(zzdyVar5, 1835365492, zzc2, i5, zzadzVar5);
                                            } else if (zze10 == 1667329389) {
                                                zzab zzabVar3 = new zzab();
                                                zzabVar3.zzG(i5);
                                                zzabVar3.zzS("application/x-camera-motion");
                                                zzadzVar5.zzb = zzabVar3.zzY();
                                            }
                                            i13 = zzc2;
                                            str = str8;
                                            i18 = i6;
                                            i17 = i5;
                                            i10 = zze2;
                                            zzadtVar3 = zzadtVar5;
                                            i12 = i7;
                                            zzaecVar = zzaecVar2;
                                            i16 = zze9;
                                        }
                                        zzadzVar3 = zzadzVar5;
                                        zzdyVar = zzdyVar5;
                                    }
                                    zzdyVar.zzF(i13 + i16);
                                    i7 = i12 + 1;
                                    zzvVar3 = zzvVar;
                                    i5 = i17;
                                    i6 = i18;
                                    zzadzVar5 = zzadzVar3;
                                    zzdyVar5 = zzdyVar;
                                    zzi = pair;
                                    str8 = str;
                                    zzaecVar2 = zzaecVar;
                                    zze2 = i10;
                                    zze = i50;
                                    zzadtVar5 = zzadtVar3;
                                }
                                zzadzVar = zzadzVar5;
                                int i64 = zze2;
                                zzaec zzaecVar3 = zzaecVar2;
                                Pair pair2 = zzi;
                                i8 = -1;
                                zzadtVar2 = zzadtVar5;
                                zza2 = zzadtVar2.zza(1701082227);
                                if (zza2 != null || (zzh = zzh(zza2)) == null) {
                                    jArr = null;
                                    jArr2 = null;
                                } else {
                                    jArr2 = (long[]) zzh.second;
                                    jArr = (long[]) zzh.first;
                                }
                                if (zzadzVar.zzb == null) {
                                    zzfokVar2 = zzfokVar;
                                    zzaetVar = null;
                                } else {
                                    i9 = zzaecVar3.zza;
                                    zzaetVar = new zzaet(i9, i64, ((Long) pair2.first).longValue(), zzs, zzw, zzadzVar.zzb, zzadzVar.zzd, zzadzVar.zza, zzadzVar.zzc, jArr, jArr2);
                                    zzfokVar2 = zzfokVar;
                                }
                            } else {
                                zze6 = 65536;
                                zze7 = tk.c;
                            }
                        }
                        zze5 = 0;
                    }
                    if (zze5 != 0) {
                        i49 = zze7;
                        i2 = zze6;
                        i3 = zze5;
                    } else if (zze6 == -65536) {
                        if (zze7 != 65536) {
                            i49 = zze7;
                        } else if (zze8 == 0) {
                            i4 = 270;
                            zzaec zzaecVar22 = new zzaec(zze4, j2, i4);
                            if (j == -9223372036854775807L) {
                            }
                            zzdy zzdyVar42 = zzb.zza;
                            zzdyVar42.zzF(8);
                            zzdyVar42.zzG(zzadv.zze(zzdyVar42.zze()) == 0 ? 8 : 16);
                            long zzs4 = zzdyVar42.zzs();
                            if (j3 != -9223372036854775807L) {
                            }
                            zzadt zza52 = zza4.zza(1835626086);
                            Objects.requireNonNull(zza52);
                            zzadt zza62 = zza52.zza(1937007212);
                            Objects.requireNonNull(zza62);
                            zzadu zzb42 = zza4.zzb(1835296868);
                            Objects.requireNonNull(zzb42);
                            Pair zzi2 = zzi(zzb42.zza);
                            zzadu zzb52 = zza62.zzb(1937011556);
                            Objects.requireNonNull(zzb52);
                            zzdy zzdyVar52 = zzb52.zza;
                            i5 = zzaecVar22.zza;
                            i6 = zzaecVar22.zzc;
                            String str82 = (String) zzi2.second;
                            zzdyVar52.zzF(12);
                            zze = zzdyVar52.zze();
                            zzadz zzadzVar52 = new zzadz(zze);
                            arrayList = arrayList3;
                            i7 = 0;
                            while (i7 < zze) {
                            }
                            zzadzVar = zzadzVar52;
                            int i642 = zze2;
                            zzaec zzaecVar32 = zzaecVar22;
                            Pair pair22 = zzi2;
                            i8 = -1;
                            zzadtVar2 = zzadtVar5;
                            zza2 = zzadtVar2.zza(1701082227);
                            if (zza2 != null) {
                            }
                            jArr = null;
                            jArr2 = null;
                            if (zzadzVar.zzb == null) {
                            }
                        }
                        i3 = 0;
                        i2 = tk.c;
                    } else {
                        i49 = zze7;
                        i2 = zze6;
                        i3 = 0;
                    }
                    i4 = (i3 == -65536 && i2 == 0 && i49 == 0 && zze8 == -65536) ? 180 : 0;
                    zzaec zzaecVar222 = new zzaec(zze4, j2, i4);
                    if (j == -9223372036854775807L) {
                    }
                    zzdy zzdyVar422 = zzb.zza;
                    zzdyVar422.zzF(8);
                    zzdyVar422.zzG(zzadv.zze(zzdyVar422.zze()) == 0 ? 8 : 16);
                    long zzs42 = zzdyVar422.zzs();
                    if (j3 != -9223372036854775807L) {
                    }
                    zzadt zza522 = zza4.zza(1835626086);
                    Objects.requireNonNull(zza522);
                    zzadt zza622 = zza522.zza(1937007212);
                    Objects.requireNonNull(zza622);
                    zzadu zzb422 = zza4.zzb(1835296868);
                    Objects.requireNonNull(zzb422);
                    Pair zzi22 = zzi(zzb422.zza);
                    zzadu zzb522 = zza622.zzb(1937011556);
                    Objects.requireNonNull(zzb522);
                    zzdy zzdyVar522 = zzb522.zza;
                    i5 = zzaecVar222.zza;
                    i6 = zzaecVar222.zzc;
                    String str822 = (String) zzi22.second;
                    zzdyVar522.zzF(12);
                    zze = zzdyVar522.zze();
                    zzadz zzadzVar522 = new zzadz(zze);
                    arrayList = arrayList3;
                    i7 = 0;
                    while (i7 < zze) {
                    }
                    zzadzVar = zzadzVar522;
                    int i6422 = zze2;
                    zzaec zzaecVar322 = zzaecVar222;
                    Pair pair222 = zzi22;
                    i8 = -1;
                    zzadtVar2 = zzadtVar5;
                    zza2 = zzadtVar2.zza(1701082227);
                    if (zza2 != null) {
                    }
                    jArr = null;
                    jArr2 = null;
                    if (zzadzVar.zzb == null) {
                    }
                }
                zzaet zzaetVar3 = (zzaet) zzfokVar2.apply(zzaetVar);
                if (zzaetVar3 != null) {
                    zzadt zza11 = zzadtVar2.zza(1835297121);
                    Objects.requireNonNull(zza11);
                    zzadt zza12 = zza11.zza(1835626086);
                    Objects.requireNonNull(zza12);
                    zzadt zza13 = zza12.zza(1937007212);
                    Objects.requireNonNull(zza13);
                    zzadu zzb6 = zza13.zzb(1937011578);
                    if (zzb6 != null) {
                        zzaebVar = new zzaea(zzb6, zzaetVar3.zzf);
                    } else {
                        zzadu zzb7 = zza13.zzb(1937013298);
                        if (zzb7 != null) {
                            zzaebVar = new zzaeb(zzb7);
                        } else {
                            throw zzbp.zza("Track has no sample table size information", null);
                        }
                    }
                    int zzb8 = zzaebVar.zzb();
                    if (zzb8 == 0) {
                        zzaewVar = new zzaew(zzaetVar3, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                    } else {
                        zzadu zzb9 = zza13.zzb(1937007471);
                        if (zzb9 == null) {
                            zzadu zzb10 = zza13.zzb(1668232756);
                            Objects.requireNonNull(zzb10);
                            zzaduVar = zzb10;
                            z6 = true;
                        } else {
                            zzaduVar = zzb9;
                            z6 = false;
                        }
                        zzdy zzdyVar6 = zzaduVar.zza;
                        zzadu zzb11 = zza13.zzb(1937011555);
                        Objects.requireNonNull(zzb11);
                        zzdy zzdyVar7 = zzb11.zza;
                        zzadu zzb12 = zza13.zzb(1937011827);
                        Objects.requireNonNull(zzb12);
                        zzdy zzdyVar8 = zzb12.zza;
                        zzadu zzb13 = zza13.zzb(1937011571);
                        zzdy zzdyVar9 = zzb13 != null ? zzb13.zza : null;
                        zzadu zzb14 = zza13.zzb(1668576371);
                        zzdy zzdyVar10 = zzb14 != null ? zzb14.zza : null;
                        zzadw zzadwVar = new zzadw(zzdyVar7, zzdyVar6, z6);
                        zzdyVar8.zzF(12);
                        int zzn = zzdyVar8.zzn() + i8;
                        int zzn2 = zzdyVar8.zzn();
                        int zzn3 = zzdyVar8.zzn();
                        if (zzdyVar10 != null) {
                            zzdyVar10.zzF(12);
                            i29 = zzdyVar10.zzn();
                        } else {
                            i29 = 0;
                        }
                        if (zzdyVar9 != null) {
                            zzdyVar9.zzF(12);
                            i30 = zzdyVar9.zzn();
                            if (i30 > 0) {
                                i31 = zzdyVar9.zzn() - 1;
                                zza3 = zzaebVar.zza();
                                String str13 = zzaetVar3.zzf.zzm;
                                if (zza3 != i8 && (("audio/raw".equals(str13) || "audio/g711-mlaw".equals(str13) || "audio/g711-alaw".equals(str13)) && zzn == 0)) {
                                    if (i29 == 0 || i30 != 0) {
                                        zzn = 0;
                                    } else {
                                        int i65 = zzadwVar.zza;
                                        long[] jArr8 = new long[i65];
                                        int[] iArr6 = new int[i65];
                                        while (zzadwVar.zza()) {
                                            int i66 = zzadwVar.zzb;
                                            jArr8[i66] = zzadwVar.zzd;
                                            iArr6[i66] = zzadwVar.zzc;
                                        }
                                        long j8 = zzn3;
                                        int i67 = 8192 / zza3;
                                        int i68 = 0;
                                        for (int i69 = 0; i69 < i65; i69++) {
                                            i68 += zzeg.zze(iArr6[i69], i67);
                                        }
                                        long[] jArr9 = new long[i68];
                                        iArr2 = new int[i68];
                                        jArr4 = new long[i68];
                                        int[] iArr7 = new int[i68];
                                        int i70 = 0;
                                        int i71 = 0;
                                        int i72 = 0;
                                        int i73 = 0;
                                        while (i70 < i65) {
                                            int i74 = iArr6[i70];
                                            long j9 = jArr8[i70];
                                            int i75 = i74;
                                            int i76 = i73;
                                            int i77 = i65;
                                            int i78 = i72;
                                            int i79 = i76;
                                            while (i75 > 0) {
                                                int min = Math.min(i67, i75);
                                                jArr9[i79] = j9;
                                                long[] jArr10 = jArr8;
                                                int i80 = zza3 * min;
                                                iArr2[i79] = i80;
                                                i78 = Math.max(i78, i80);
                                                jArr4[i79] = i71 * j8;
                                                iArr7[i79] = 1;
                                                j9 += iArr2[i79];
                                                i71 += min;
                                                i75 -= min;
                                                i79++;
                                                jArr8 = jArr10;
                                                iArr6 = iArr6;
                                            }
                                            i70++;
                                            int i81 = i79;
                                            i72 = i78;
                                            i65 = i77;
                                            i73 = i81;
                                        }
                                        zzaetVar2 = zzaetVar3;
                                        jArr3 = jArr9;
                                        iArr3 = iArr7;
                                        i37 = i72;
                                        j7 = j8 * i71;
                                        zzaet zzaetVar4 = zzaetVar2;
                                        long zzw2 = zzeg.zzw(j7, 1000000L, zzaetVar4.zzc);
                                        jArr5 = zzaetVar4.zzh;
                                        if (jArr5 != null) {
                                            zzeg.zzQ(jArr4, 1000000L, zzaetVar4.zzc);
                                            zzaewVar2 = new zzaew(zzaetVar4, jArr3, iArr2, i37, jArr4, iArr3, zzw2);
                                        } else {
                                            if (jArr5.length == 1 && zzaetVar4.zzb == 1 && jArr4.length >= 2) {
                                                long[] jArr11 = zzaetVar4.zzi;
                                                Objects.requireNonNull(jArr11);
                                                long j10 = jArr11[0];
                                                long zzw3 = j10 + zzeg.zzw(jArr5[0], zzaetVar4.zzc, zzaetVar4.zzd);
                                                if (zzo(jArr4, j7, j10, zzw3)) {
                                                    long zzw4 = zzeg.zzw(j10 - jArr4[0], zzaetVar4.zzf.zzA, zzaetVar4.zzc);
                                                    long zzw5 = zzeg.zzw(j7 - zzw3, zzaetVar4.zzf.zzA, zzaetVar4.zzc);
                                                    if (zzw4 == 0) {
                                                        if (zzw5 != 0) {
                                                            zzw4 = 0;
                                                        }
                                                    }
                                                    if (zzw4 <= TTL.MAX_VALUE && zzw5 <= TTL.MAX_VALUE) {
                                                        zzzgVar.zza = (int) zzw4;
                                                        zzzgVar.zzb = (int) zzw5;
                                                        zzeg.zzQ(jArr4, 1000000L, zzaetVar4.zzc);
                                                        zzaewVar2 = new zzaew(zzaetVar4, jArr3, iArr2, i37, jArr4, iArr3, zzeg.zzw(zzaetVar4.zzh[0], 1000000L, zzaetVar4.zzd));
                                                    }
                                                }
                                            }
                                            long[] jArr12 = zzaetVar4.zzh;
                                            int length = jArr12.length;
                                            if (length == 1) {
                                                if (jArr12[0] == 0) {
                                                    long[] jArr13 = zzaetVar4.zzi;
                                                    Objects.requireNonNull(jArr13);
                                                    long j11 = jArr13[0];
                                                    for (int i82 = 0; i82 < jArr4.length; i82++) {
                                                        jArr4[i82] = zzeg.zzw(jArr4[i82] - j11, 1000000L, zzaetVar4.zzc);
                                                    }
                                                    zzaewVar2 = new zzaew(zzaetVar4, jArr3, iArr2, i37, jArr4, iArr3, zzeg.zzw(j7 - j11, 1000000L, zzaetVar4.zzc));
                                                } else {
                                                    length = 1;
                                                }
                                            }
                                            boolean z9 = zzaetVar4.zzb == 1;
                                            int[] iArr8 = new int[length];
                                            int[] iArr9 = new int[length];
                                            long[] jArr14 = zzaetVar4.zzi;
                                            Objects.requireNonNull(jArr14);
                                            int i83 = 0;
                                            int i84 = 0;
                                            int i85 = 0;
                                            boolean z10 = false;
                                            while (true) {
                                                long[] jArr15 = zzaetVar4.zzh;
                                                i42 = i37;
                                                if (i83 >= jArr15.length) {
                                                    break;
                                                }
                                                int[] iArr10 = iArr2;
                                                long j12 = jArr14[i83];
                                                if (j12 != -1) {
                                                    long j13 = jArr15[i83];
                                                    jArr7 = jArr3;
                                                    i43 = zzb8;
                                                    int i86 = i85;
                                                    boolean z11 = z10;
                                                    long zzw6 = zzeg.zzw(j13, zzaetVar4.zzc, zzaetVar4.zzd);
                                                    int i87 = 1;
                                                    iArr8[i83] = zzeg.zzd(jArr4, j12, true, true);
                                                    iArr9[i83] = zzeg.zzb(jArr4, j12 + zzw6, z9, false);
                                                    while (true) {
                                                        i44 = iArr8[i83];
                                                        i45 = iArr9[i83];
                                                        if (i44 >= i45 || (iArr3[i44] & i87) != 0) {
                                                            break;
                                                        }
                                                        iArr8[i83] = i44 + 1;
                                                        i87 = 1;
                                                    }
                                                    i84 = (i45 - i44) + i84;
                                                    i85 = i45;
                                                    z10 = z11 | (i86 != i44);
                                                } else {
                                                    jArr7 = jArr3;
                                                    i43 = zzb8;
                                                }
                                                i83++;
                                                jArr3 = jArr7;
                                                i37 = i42;
                                                iArr2 = iArr10;
                                                zzb8 = i43;
                                            }
                                            long[] jArr16 = jArr3;
                                            int[] iArr11 = iArr2;
                                            boolean z12 = z10 | (i84 != zzb8);
                                            long[] jArr17 = z12 ? new long[i84] : jArr16;
                                            int[] iArr12 = z12 ? new int[i84] : iArr11;
                                            int i88 = true == z12 ? 0 : i42;
                                            int[] iArr13 = z12 ? new int[i84] : iArr3;
                                            long[] jArr18 = new long[i84];
                                            int i89 = i88;
                                            long j14 = 0;
                                            int i90 = 0;
                                            int i91 = 0;
                                            while (i90 < zzaetVar4.zzh.length) {
                                                long j15 = zzaetVar4.zzi[i90];
                                                int i92 = iArr8[i90];
                                                int[] iArr14 = iArr8;
                                                int i93 = iArr9[i90];
                                                if (z12) {
                                                    iArr4 = iArr9;
                                                    int i94 = i93 - i92;
                                                    System.arraycopy(jArr16, i92, jArr17, i91, i94);
                                                    jArr6 = jArr16;
                                                    iArr5 = iArr11;
                                                    System.arraycopy(iArr5, i92, iArr12, i91, i94);
                                                    System.arraycopy(iArr3, i92, iArr13, i91, i94);
                                                } else {
                                                    jArr6 = jArr16;
                                                    iArr4 = iArr9;
                                                    iArr5 = iArr11;
                                                }
                                                int i95 = i89;
                                                while (i92 < i93) {
                                                    int[] iArr15 = iArr13;
                                                    int i96 = i93;
                                                    long[] jArr19 = jArr4;
                                                    int[] iArr16 = iArr3;
                                                    long j16 = j14;
                                                    jArr18[i91] = zzeg.zzw(j14, 1000000L, zzaetVar4.zzd) + zzeg.zzw(Math.max(0L, jArr4[i92] - j15), 1000000L, zzaetVar4.zzc);
                                                    if (z12 && iArr12[i91] > i95) {
                                                        i95 = iArr5[i92];
                                                    }
                                                    i91++;
                                                    i92++;
                                                    iArr13 = iArr15;
                                                    j14 = j16;
                                                    jArr4 = jArr19;
                                                    iArr3 = iArr16;
                                                    i93 = i96;
                                                }
                                                i90++;
                                                j14 += zzaetVar4.zzh[i90];
                                                i89 = i95;
                                                iArr13 = iArr13;
                                                iArr8 = iArr14;
                                                iArr9 = iArr4;
                                                iArr11 = iArr5;
                                                jArr16 = jArr6;
                                            }
                                            zzaewVar = new zzaew(zzaetVar4, jArr17, iArr12, i89, jArr18, iArr13, zzeg.zzw(j14, 1000000L, zzaetVar4.zzd));
                                        }
                                        zzaewVar = zzaewVar2;
                                    }
                                }
                                long[] jArr20 = new long[zzb8];
                                iArr = new int[zzb8];
                                long[] jArr21 = new long[zzb8];
                                int[] iArr17 = new int[zzb8];
                                zzaetVar2 = zzaetVar3;
                                int i97 = zzn;
                                int i98 = zzn2;
                                int i99 = zzn3;
                                int i100 = i29;
                                int i101 = i31;
                                int i102 = 0;
                                i32 = 0;
                                int i103 = 0;
                                i33 = 0;
                                j6 = 0;
                                long j17 = 0;
                                i34 = i30;
                                i35 = 0;
                                while (true) {
                                    if (i35 < zzb8) {
                                        i36 = i33;
                                        break;
                                    }
                                    boolean z13 = true;
                                    while (true) {
                                        if (i33 != 0) {
                                            i38 = zzb8;
                                            i39 = i102;
                                            zzdyVar2 = zzdyVar8;
                                            i40 = i33;
                                            break;
                                        }
                                        z13 = zzadwVar.zza();
                                        if (!z13) {
                                            i38 = zzb8;
                                            i39 = i102;
                                            zzdyVar2 = zzdyVar8;
                                            i40 = 0;
                                            break;
                                        }
                                        int i104 = i102;
                                        long j18 = zzadwVar.zzd;
                                        i33 = zzadwVar.zzc;
                                        j6 = j18;
                                        zzdyVar8 = zzdyVar8;
                                        i102 = i104;
                                        zzb8 = zzb8;
                                    }
                                    if (!z13) {
                                        jArr20 = Arrays.copyOf(jArr20, i35);
                                        iArr = Arrays.copyOf(iArr, i35);
                                        jArr21 = Arrays.copyOf(jArr21, i35);
                                        iArr17 = Arrays.copyOf(iArr17, i35);
                                        zzb8 = i35;
                                        i36 = i33;
                                        i102 = i39;
                                        break;
                                    }
                                    if (zzdyVar10 != null) {
                                        i102 = i39;
                                        while (true) {
                                            if (i32 != 0) {
                                                i41 = -1;
                                                break;
                                            } else if (i100 <= 0) {
                                                i41 = -1;
                                                i32 = 0;
                                                break;
                                            } else {
                                                i32 = zzdyVar10.zzn();
                                                i102 = zzdyVar10.zze();
                                                i100--;
                                            }
                                        }
                                        i32 += i41;
                                    } else {
                                        i102 = i39;
                                    }
                                    jArr20[i35] = j6;
                                    int zzc5 = zzaebVar.zzc();
                                    iArr[i35] = zzc5;
                                    if (zzc5 > i103) {
                                        i103 = zzc5;
                                    }
                                    zzadw zzadwVar2 = zzadwVar;
                                    int i105 = i32;
                                    jArr21[i35] = j17 + i102;
                                    iArr17[i35] = zzdyVar9 == null ? 1 : 0;
                                    if (i35 == i101) {
                                        iArr17[i35] = 1;
                                        i34--;
                                        if (i34 > 0) {
                                            Objects.requireNonNull(zzdyVar9);
                                            i101 = zzdyVar9.zzn() - 1;
                                        }
                                    }
                                    j17 += i99;
                                    int i106 = i98 - 1;
                                    if (i106 != 0) {
                                        i98 = i106;
                                    } else if (i97 > 0) {
                                        i97--;
                                        i98 = zzdyVar2.zzn();
                                        i99 = zzdyVar2.zze();
                                    } else {
                                        i98 = 0;
                                    }
                                    j6 += iArr[i35];
                                    i35++;
                                    zzadwVar = zzadwVar2;
                                    i32 = i105;
                                    zzdyVar8 = zzdyVar2;
                                    i33 = i40 - 1;
                                    zzb8 = i38;
                                }
                                long j19 = j17 + i102;
                                if (zzdyVar10 != null) {
                                    while (i100 > 0) {
                                        if (zzdyVar10.zzn() != 0) {
                                            z7 = false;
                                            break;
                                        }
                                        zzdyVar10.zze();
                                        i100--;
                                    }
                                }
                                z7 = true;
                                if (i34 == 0) {
                                    if (i98 == 0) {
                                        if (i36 == 0) {
                                            if (i97 == 0) {
                                                if (i32 == 0) {
                                                    if (z7) {
                                                    }
                                                    jArr3 = jArr20;
                                                    iArr2 = iArr;
                                                    jArr4 = jArr21;
                                                    iArr3 = iArr17;
                                                    j7 = j19;
                                                    i37 = i103;
                                                    zzaet zzaetVar42 = zzaetVar2;
                                                    long zzw22 = zzeg.zzw(j7, 1000000L, zzaetVar42.zzc);
                                                    jArr5 = zzaetVar42.zzh;
                                                    if (jArr5 != null) {
                                                    }
                                                    zzaewVar = zzaewVar2;
                                                }
                                            }
                                        }
                                    }
                                }
                                jArr3 = jArr20;
                                iArr2 = iArr;
                                jArr4 = jArr21;
                                iArr3 = iArr17;
                                j7 = j19;
                                i37 = i103;
                                zzaet zzaetVar422 = zzaetVar2;
                                long zzw222 = zzeg.zzw(j7, 1000000L, zzaetVar422.zzc);
                                jArr5 = zzaetVar422.zzh;
                                if (jArr5 != null) {
                                }
                                zzaewVar = zzaewVar2;
                            } else {
                                zzdyVar9 = null;
                            }
                        } else {
                            i30 = 0;
                        }
                        i31 = -1;
                        zza3 = zzaebVar.zza();
                        String str132 = zzaetVar3.zzf.zzm;
                        if (zza3 != i8) {
                            if (i29 == 0) {
                            }
                            zzn = 0;
                        }
                        long[] jArr202 = new long[zzb8];
                        iArr = new int[zzb8];
                        long[] jArr212 = new long[zzb8];
                        int[] iArr172 = new int[zzb8];
                        zzaetVar2 = zzaetVar3;
                        int i972 = zzn;
                        int i982 = zzn2;
                        int i992 = zzn3;
                        int i1002 = i29;
                        int i1012 = i31;
                        int i1022 = 0;
                        i32 = 0;
                        int i1032 = 0;
                        i33 = 0;
                        j6 = 0;
                        long j172 = 0;
                        i34 = i30;
                        i35 = 0;
                        while (true) {
                            if (i35 < zzb8) {
                            }
                            j6 += iArr[i35];
                            i35++;
                            zzadwVar = zzadwVar2;
                            i32 = i105;
                            zzdyVar8 = zzdyVar2;
                            i33 = i40 - 1;
                            zzb8 = i38;
                        }
                        long j192 = j172 + i1022;
                        if (zzdyVar10 != null) {
                        }
                        z7 = true;
                        if (i34 == 0) {
                        }
                        jArr3 = jArr202;
                        iArr2 = iArr;
                        jArr4 = jArr212;
                        iArr3 = iArr172;
                        j7 = j192;
                        i37 = i1032;
                        zzaet zzaetVar4222 = zzaetVar2;
                        long zzw2222 = zzeg.zzw(j7, 1000000L, zzaetVar4222.zzc);
                        jArr5 = zzaetVar4222.zzh;
                        if (jArr5 != null) {
                        }
                        zzaewVar = zzaewVar2;
                    }
                    arrayList2 = arrayList;
                    arrayList2.add(zzaewVar);
                } else {
                    arrayList2 = arrayList;
                }
            }
            i46 = i + 1;
            zzadtVar4 = zzadtVar;
            zzvVar3 = zzvVar;
            arrayList3 = arrayList2;
        }
        return arrayList3;
    }

    public static void zzd(zzdy zzdyVar) {
        int zzc = zzdyVar.zzc();
        zzdyVar.zzG(4);
        if (zzdyVar.zze() != 1751411826) {
            zzc += 4;
        }
        zzdyVar.zzF(zzc);
    }

    private static int zze(int i) {
        if (i == 1936684398) {
            return 1;
        }
        if (i == 1986618469) {
            return 2;
        }
        if (i == 1952807028 || i == 1935832172 || i == 1937072756 || i == 1668047728) {
            return 3;
        }
        return i == 1835365473 ? 5 : -1;
    }

    private static int zzf(zzdy zzdyVar) {
        int zzk = zzdyVar.zzk();
        int i = zzk & 127;
        while ((zzk & 128) == 128) {
            zzk = zzdyVar.zzk();
            i = (i << 7) | (zzk & 127);
        }
        return i;
    }

    private static int zzg(zzdy zzdyVar) {
        zzdyVar.zzF(16);
        return zzdyVar.zze();
    }

    @z1
    private static Pair zzh(zzadt zzadtVar) {
        zzadu zzb = zzadtVar.zzb(1701606260);
        if (zzb == null) {
            return null;
        }
        zzdy zzdyVar = zzb.zza;
        zzdyVar.zzF(8);
        int zze = zzadv.zze(zzdyVar.zze());
        int zzn = zzdyVar.zzn();
        long[] jArr = new long[zzn];
        long[] jArr2 = new long[zzn];
        for (int i = 0; i < zzn; i++) {
            jArr[i] = zze == 1 ? zzdyVar.zzt() : zzdyVar.zzs();
            jArr2[i] = zze == 1 ? zzdyVar.zzr() : zzdyVar.zze();
            if (zzdyVar.zzy() == 1) {
                zzdyVar.zzG(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static Pair zzi(zzdy zzdyVar) {
        zzdyVar.zzF(8);
        int zze = zzadv.zze(zzdyVar.zze());
        zzdyVar.zzG(zze == 0 ? 8 : 16);
        long zzs = zzdyVar.zzs();
        zzdyVar.zzG(zze == 0 ? 4 : 8);
        int zzo = zzdyVar.zzo();
        StringBuilder sb = new StringBuilder();
        sb.append((char) (((zzo >> 10) & 31) + 96));
        sb.append((char) (((zzo >> 5) & 31) + 96));
        sb.append((char) ((zzo & 31) + 96));
        return Pair.create(Long.valueOf(zzs), sb.toString());
    }

    @z1
    private static Pair zzj(zzdy zzdyVar, int i, int i2) throws zzbp {
        Integer num;
        zzaeu zzaeuVar;
        Pair create;
        int i3;
        int i4;
        byte[] bArr;
        int zzc = zzdyVar.zzc();
        while (zzc - i < i2) {
            zzdyVar.zzF(zzc);
            int zze = zzdyVar.zze();
            zzyv.zzb(zze > 0, "childAtomSize must be positive");
            if (zzdyVar.zze() == 1936289382) {
                int i5 = zzc + 8;
                int i6 = -1;
                int i7 = 0;
                String str = null;
                Integer num2 = null;
                while (i5 - zzc < zze) {
                    zzdyVar.zzF(i5);
                    int zze2 = zzdyVar.zze();
                    int zze3 = zzdyVar.zze();
                    if (zze3 == 1718775137) {
                        num2 = Integer.valueOf(zzdyVar.zze());
                    } else if (zze3 == 1935894637) {
                        zzdyVar.zzG(4);
                        str = zzdyVar.zzx(4, zzfoi.zzc);
                    } else if (zze3 == 1935894633) {
                        i6 = i5;
                        i7 = zze2;
                    }
                    i5 += zze2;
                }
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    zzyv.zzb(num2 != null, "frma atom is mandatory");
                    zzyv.zzb(i6 != -1, "schi atom is mandatory");
                    int i8 = i6 + 8;
                    while (true) {
                        if (i8 - i6 >= i7) {
                            num = num2;
                            zzaeuVar = null;
                            break;
                        }
                        zzdyVar.zzF(i8);
                        int zze4 = zzdyVar.zze();
                        if (zzdyVar.zze() == 1952804451) {
                            int zze5 = zzdyVar.zze();
                            zzdyVar.zzG(1);
                            if (zzadv.zze(zze5) == 0) {
                                zzdyVar.zzG(1);
                                i3 = 0;
                                i4 = 0;
                            } else {
                                int zzk = zzdyVar.zzk();
                                i3 = zzk & 15;
                                i4 = (zzk & 240) >> 4;
                            }
                            boolean z = zzdyVar.zzk() == 1;
                            int zzk2 = zzdyVar.zzk();
                            byte[] bArr2 = new byte[16];
                            zzdyVar.zzB(bArr2, 0, 16);
                            if (z && zzk2 == 0) {
                                int zzk3 = zzdyVar.zzk();
                                byte[] bArr3 = new byte[zzk3];
                                zzdyVar.zzB(bArr3, 0, zzk3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = num2;
                            zzaeuVar = new zzaeu(z, str, zzk2, bArr2, i4, i3, bArr);
                        } else {
                            i8 += zze4;
                        }
                    }
                    zzyv.zzb(zzaeuVar != null, "tenc atom is mandatory");
                    int i9 = zzeg.zza;
                    create = Pair.create(num, zzaeuVar);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            zzc += zze;
        }
        return null;
    }

    private static zzadx zzk(zzdy zzdyVar, int i) {
        zzdyVar.zzF(i + 12);
        zzdyVar.zzG(1);
        zzf(zzdyVar);
        zzdyVar.zzG(2);
        int zzk = zzdyVar.zzk();
        if ((zzk & 128) != 0) {
            zzdyVar.zzG(2);
        }
        if ((zzk & 64) != 0) {
            zzdyVar.zzG(zzdyVar.zzo());
        }
        if ((zzk & 32) != 0) {
            zzdyVar.zzG(2);
        }
        zzdyVar.zzG(1);
        zzf(zzdyVar);
        String zzd = zzbo.zzd(zzdyVar.zzk());
        if (!"audio/mpeg".equals(zzd) && !"audio/vnd.dts".equals(zzd) && !"audio/vnd.dts.hd".equals(zzd)) {
            zzdyVar.zzG(4);
            int zzn = zzdyVar.zzn();
            int zzn2 = zzdyVar.zzn();
            zzdyVar.zzG(1);
            int zzf = zzf(zzdyVar);
            byte[] bArr = new byte[zzf];
            zzdyVar.zzB(bArr, 0, zzf);
            if (zzn2 <= 0) {
                zzn2 = -1;
            }
            return new zzadx(zzd, bArr, zzn2, zzn > 0 ? zzn : -1);
        }
        return new zzadx(zzd, null, -1, -1);
    }

    private static ByteBuffer zzl() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzm(zzdy zzdyVar, int i, int i2, int i3, int i4, String str, boolean z, @z1 zzv zzvVar, zzadz zzadzVar, int i5) throws zzbp {
        int i6;
        int zzl;
        int zze;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        byte[] bArr;
        int i14;
        String str2;
        boolean z2;
        boolean z3;
        int i15 = i2;
        int i16 = i3;
        zzv zzvVar2 = zzvVar;
        zzdyVar.zzF(i15 + 16);
        if (z) {
            i6 = zzdyVar.zzo();
            zzdyVar.zzG(6);
        } else {
            zzdyVar.zzG(8);
            i6 = 0;
        }
        if (i6 == 0 || i6 == 1) {
            int zzo = zzdyVar.zzo();
            zzdyVar.zzG(6);
            zzl = zzdyVar.zzl();
            zzdyVar.zzF(zzdyVar.zzc() - 4);
            zze = zzdyVar.zze();
            if (i6 == 1) {
                zzdyVar.zzG(16);
            }
            i7 = zzo;
        } else if (i6 != 2) {
            return;
        } else {
            zzdyVar.zzG(16);
            zzl = (int) Math.round(Double.longBitsToDouble(zzdyVar.zzr()));
            i7 = zzdyVar.zzn();
            zzdyVar.zzG(20);
            zze = 0;
        }
        int zzc = zzdyVar.zzc();
        int i17 = 1701733217;
        int i18 = i;
        if (i18 == 1701733217) {
            Pair zzj = zzj(zzdyVar, i15, i16);
            if (zzj != null) {
                i17 = ((Integer) zzj.first).intValue();
                zzvVar2 = zzvVar2 == null ? null : zzvVar2.zzb(((zzaeu) zzj.second).zzb);
                zzadzVar.zza[i5] = (zzaeu) zzj.second;
            }
            zzdyVar.zzF(zzc);
            i18 = i17;
        }
        String str3 = "audio/raw";
        if (i18 == 1633889587) {
            str3 = "audio/ac3";
        } else if (i18 == 1700998451) {
            str3 = "audio/eac3";
        } else if (i18 == 1633889588) {
            str3 = "audio/ac4";
        } else if (i18 == 1685353315) {
            str3 = "audio/vnd.dts";
        } else if (i18 == 1685353320 || i18 == 1685353324) {
            str3 = "audio/vnd.dts.hd";
        } else if (i18 == 1685353317) {
            str3 = "audio/vnd.dts.hd;profile=lbr";
        } else if (i18 == 1685353336) {
            str3 = "audio/vnd.dts.uhd;profile=p2";
        } else if (i18 == 1935764850) {
            str3 = "audio/3gpp";
        } else if (i18 != 1935767394) {
            if (i18 == 1819304813 || i18 == 1936684916) {
                i8 = 2;
            } else if (i18 == 1953984371) {
                i8 = 268435456;
            } else if (i18 == 778924082 || i18 == 778924083) {
                str3 = "audio/mpeg";
            } else if (i18 == 1835557169) {
                str3 = "audio/mha1";
            } else if (i18 == 1835560241) {
                str3 = "audio/mhm1";
            } else if (i18 == 1634492771) {
                str3 = "audio/alac";
            } else if (i18 == 1634492791) {
                str3 = "audio/g711-alaw";
            } else if (i18 == 1970037111) {
                str3 = "audio/g711-mlaw";
            } else if (i18 == 1332770163) {
                str3 = "audio/opus";
            } else if (i18 == 1716281667) {
                str3 = "audio/flac";
            } else if (i18 == 1835823201) {
                str3 = "audio/true-hd";
            } else {
                i8 = -1;
                str3 = null;
            }
            String str4 = str3;
            zzadx zzadxVar = null;
            String str5 = null;
            List list = null;
            while (zzc - i15 < i16) {
                zzdyVar.zzF(zzc);
                int zze2 = zzdyVar.zze();
                String str6 = "childAtomSize must be positive";
                zzyv.zzb(zze2 > 0, "childAtomSize must be positive");
                int zze3 = zzdyVar.zze();
                if (zze3 == 1835557187) {
                    int i19 = zze2 - 13;
                    byte[] bArr2 = new byte[i19];
                    zzdyVar.zzF(zzc + 13);
                    zzdyVar.zzB(bArr2, 0, i19);
                    list = zzfrj.zzp(bArr2);
                    i11 = i8;
                } else {
                    if (zze3 == 1702061171) {
                        i11 = i8;
                        i12 = zzc;
                        i13 = -1;
                    } else if (z && zze3 == 2002876005) {
                        int zzc2 = zzdyVar.zzc();
                        if (zzc2 >= zzc) {
                            i14 = zzc2;
                            str2 = null;
                            z2 = true;
                        } else {
                            i14 = zzc2;
                            str2 = null;
                            z2 = false;
                        }
                        zzyv.zzb(z2, str2);
                        i12 = i14;
                        while (true) {
                            if (i12 - zzc >= zze2) {
                                i11 = i8;
                                i13 = -1;
                                i12 = -1;
                                break;
                            }
                            zzdyVar.zzF(i12);
                            int zze4 = zzdyVar.zze();
                            if (zze4 > 0) {
                                i11 = i8;
                                z3 = true;
                            } else {
                                i11 = i8;
                                z3 = false;
                            }
                            zzyv.zzb(z3, str6);
                            String str7 = str6;
                            if (zzdyVar.zze() == 1702061171) {
                                i13 = -1;
                                break;
                            }
                            i12 += zze4;
                            i8 = i11;
                            str6 = str7;
                        }
                    } else {
                        i11 = i8;
                        if (zze3 == 1684103987) {
                            zzdyVar.zzF(zzc + 8);
                            zzadzVar.zzb = zzxw.zzc(zzdyVar, Integer.toString(i4), str, zzvVar2);
                        } else if (zze3 == 1684366131) {
                            zzdyVar.zzF(zzc + 8);
                            zzadzVar.zzb = zzxw.zzd(zzdyVar, Integer.toString(i4), str, zzvVar2);
                        } else if (zze3 == 1684103988) {
                            zzdyVar.zzF(zzc + 8);
                            String num = Integer.toString(i4);
                            int i20 = zzxz.zza;
                            zzdyVar.zzG(1);
                            int i21 = 1 != ((zzdyVar.zzk() & 32) >> 5) ? 44100 : 48000;
                            zzab zzabVar = new zzab();
                            zzabVar.zzH(num);
                            zzabVar.zzS("audio/ac4");
                            zzabVar.zzw(2);
                            zzabVar.zzT(i21);
                            zzabVar.zzB(zzvVar2);
                            zzabVar.zzK(str);
                            zzadzVar.zzb = zzabVar.zzY();
                        } else if (zze3 == 1684892784) {
                            if (zze <= 0) {
                                throw zzbp.zza("Invalid sample rate for Dolby TrueHD MLP stream: " + zze, null);
                            }
                            zzl = zze;
                            i7 = 2;
                        } else if (zze3 == 1684305011) {
                            zzab zzabVar2 = new zzab();
                            zzabVar2.zzG(i4);
                            zzabVar2.zzS(str4);
                            zzabVar2.zzw(i7);
                            zzabVar2.zzT(zzl);
                            zzabVar2.zzB(zzvVar2);
                            zzabVar2.zzK(str);
                            zzadzVar.zzb = zzabVar2.zzY();
                        } else if (zze3 == 1682927731) {
                            int i22 = zze2 - 8;
                            byte[] bArr3 = zza;
                            byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length + i22);
                            zzdyVar.zzF(zzc + 8);
                            zzdyVar.zzB(copyOf, bArr3.length, i22);
                            list = zzzp.zza(copyOf);
                        } else {
                            if (zze3 == 1684425825) {
                                int i23 = zze2 - 12;
                                byte[] bArr4 = new byte[i23 + 4];
                                bArr4[0] = 102;
                                bArr4[1] = 76;
                                bArr4[2] = 97;
                                bArr4[3] = 67;
                                zzdyVar.zzF(zzc + 12);
                                zzdyVar.zzB(bArr4, 4, i23);
                                list = zzfrj.zzp(bArr4);
                            } else if (zze3 == 1634492771) {
                                int i24 = zze2 - 12;
                                byte[] bArr5 = new byte[i24];
                                zzdyVar.zzF(zzc + 12);
                                zzdyVar.zzB(bArr5, 0, i24);
                                zzdy zzdyVar2 = new zzdy(bArr5);
                                zzdyVar2.zzF(9);
                                int zzk = zzdyVar2.zzk();
                                zzdyVar2.zzF(20);
                                Pair create = Pair.create(Integer.valueOf(zzdyVar2.zzn()), Integer.valueOf(zzk));
                                int intValue = ((Integer) create.first).intValue();
                                int intValue2 = ((Integer) create.second).intValue();
                                list = zzfrj.zzp(bArr5);
                                zzl = intValue;
                                i7 = intValue2;
                                zzc += zze2;
                                i15 = i2;
                                i16 = i3;
                                i8 = i11;
                            }
                            zzc += zze2;
                            i15 = i2;
                            i16 = i3;
                            i8 = i11;
                        }
                    }
                    if (i12 != i13) {
                        zzadx zzk2 = zzk(zzdyVar, i12);
                        str4 = zzk2.zza;
                        bArr = zzk2.zzb;
                        if (bArr != null) {
                            if ("audio/mp4a-latm".equals(str4)) {
                                zzxs zza2 = zzxt.zza(bArr);
                                zzl = zza2.zza;
                                i7 = zza2.zzb;
                                str5 = zza2.zzc;
                            }
                            list = zzfrj.zzp(bArr);
                        }
                        zzadxVar = zzk2;
                    }
                    zzc += zze2;
                    i15 = i2;
                    i16 = i3;
                    i8 = i11;
                }
                zzc += zze2;
                i15 = i2;
                i16 = i3;
                i8 = i11;
            }
            int i25 = i8;
            if (zzadzVar.zzb == null || str4 == null) {
            }
            zzab zzabVar3 = new zzab();
            zzabVar3.zzG(i4);
            zzabVar3.zzS(str4);
            zzabVar3.zzx(str5);
            zzabVar3.zzw(i7);
            zzabVar3.zzT(zzl);
            zzabVar3.zzN(i25);
            zzabVar3.zzI(list);
            zzabVar3.zzB(zzvVar2);
            zzabVar3.zzK(str);
            if (zzadxVar != null) {
                i9 = zzadxVar.zzc;
                zzabVar3.zzv(i9);
                i10 = zzadxVar.zzd;
                zzabVar3.zzO(i10);
            }
            zzadzVar.zzb = zzabVar3.zzY();
            return;
        } else {
            str3 = "audio/amr-wb";
        }
        i8 = -1;
        String str42 = str3;
        zzadx zzadxVar2 = null;
        String str52 = null;
        List list2 = null;
        while (zzc - i15 < i16) {
        }
        int i252 = i8;
        if (zzadzVar.zzb == null) {
        }
    }

    private static void zzn(zzdy zzdyVar, int i, int i2, int i3, zzadz zzadzVar) {
        zzdyVar.zzF(i2 + 16);
        zzdyVar.zzv((char) 0);
        String zzv = zzdyVar.zzv((char) 0);
        if (zzv != null) {
            zzab zzabVar = new zzab();
            zzabVar.zzG(i3);
            zzabVar.zzS(zzv);
            zzadzVar.zzb = zzabVar.zzY();
        }
    }

    private static boolean zzo(long[] jArr, long j, long j2, long j3) {
        int length = jArr.length;
        int i = length - 1;
        return jArr[0] <= j2 && j2 < jArr[zzeg.zzf(4, 0, i)] && jArr[zzeg.zzf(length + (-4), 0, i)] < j3 && j3 <= j;
    }
}