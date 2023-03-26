package com.google.android.gms.internal.ads;

import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
/* loaded from: classes2.dex */
public final class zzgmd<T> implements zzgmt<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzgnu.zzi();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzgma zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzglo zzn;
    private final zzgnk zzo;
    private final zzgkd zzp;
    private final zzgmf zzq;
    private final zzglv zzr;

    private zzgmd(int[] iArr, Object[] objArr, int i, int i2, zzgma zzgmaVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzgmf zzgmfVar, zzglo zzgloVar, zzgnk zzgnkVar, zzgkd zzgkdVar, zzglv zzglvVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzgmaVar instanceof zzgkq;
        this.zzj = z;
        boolean z3 = false;
        if (zzgkdVar != null && zzgkdVar.zzh(zzgmaVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzq = zzgmfVar;
        this.zzn = zzgloVar;
        this.zzo = zzgnkVar;
        this.zzp = zzgkdVar;
        this.zzg = zzgmaVar;
        this.zzr = zzglvVar;
    }

    private final int zzA(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzB(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzC(int i) {
        return this.zzc[i + 1];
    }

    private static long zzD(Object obj, long j) {
        return ((Long) zzgnu.zzh(obj, j)).longValue();
    }

    private final zzgku zzE(int i) {
        int i2 = i / 3;
        return (zzgku) this.zzd[i2 + i2 + 1];
    }

    private final zzgmt zzF(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzgmt zzgmtVar = (zzgmt) this.zzd[i3];
        if (zzgmtVar != null) {
            return zzgmtVar;
        }
        zzgmt zzb2 = zzgmi.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzG(Object obj, int i, Object obj2, zzgnk zzgnkVar) {
        int i2 = this.zzc[i];
        Object zzh = zzgnu.zzh(obj, zzC(i) & 1048575);
        if (zzh == null || zzE(i) == null) {
            return obj2;
        }
        zzglu zzgluVar = (zzglu) zzh;
        zzglt zzgltVar = (zzglt) zzH(i);
        throw null;
    }

    private final Object zzH(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzI(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder N = wo1.N("Field ", str, " for ", name, " not found. Known fields are ");
            N.append(arrays);
            throw new RuntimeException(N.toString());
        }
    }

    private final void zzJ(Object obj, Object obj2, int i) {
        long zzC = zzC(i) & 1048575;
        if (zzQ(obj2, i)) {
            Object zzh = zzgnu.zzh(obj, zzC);
            Object zzh2 = zzgnu.zzh(obj2, zzC);
            if (zzh != null && zzh2 != null) {
                zzgnu.zzv(obj, zzC, zzgla.zzg(zzh, zzh2));
                zzM(obj, i);
            } else if (zzh2 != null) {
                zzgnu.zzv(obj, zzC, zzh2);
                zzM(obj, i);
            }
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        int zzC = zzC(i);
        int i2 = this.zzc[i];
        long j = zzC & 1048575;
        if (zzT(obj2, i2, i)) {
            Object zzh = zzT(obj, i2, i) ? zzgnu.zzh(obj, j) : null;
            Object zzh2 = zzgnu.zzh(obj2, j);
            if (zzh != null && zzh2 != null) {
                zzgnu.zzv(obj, j, zzgla.zzg(zzh, zzh2));
                zzN(obj, i2, i);
            } else if (zzh2 != null) {
                zzgnu.zzv(obj, j, zzh2);
                zzN(obj, i2, i);
            }
        }
    }

    private final void zzL(Object obj, int i, zzgml zzgmlVar) throws IOException {
        if (zzP(i)) {
            zzgnu.zzv(obj, i & 1048575, zzgmlVar.zzu());
        } else if (this.zzi) {
            zzgnu.zzv(obj, i & 1048575, zzgmlVar.zzt());
        } else {
            zzgnu.zzv(obj, i & 1048575, zzgmlVar.zzp());
        }
    }

    private final void zzM(Object obj, int i) {
        int zzz = zzz(i);
        long j = 1048575 & zzz;
        if (j == 1048575) {
            return;
        }
        zzgnu.zzt(obj, j, (1 << (zzz >>> 20)) | zzgnu.zzd(obj, j));
    }

    private final void zzN(Object obj, int i, int i2) {
        zzgnu.zzt(obj, zzz(i2) & 1048575, i);
    }

    private final boolean zzO(Object obj, Object obj2, int i) {
        return zzQ(obj, i) == zzQ(obj2, i);
    }

    private static boolean zzP(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzQ(Object obj, int i) {
        int zzz = zzz(i);
        long j = zzz & 1048575;
        if (j != 1048575) {
            return (zzgnu.zzd(obj, j) & (1 << (zzz >>> 20))) != 0;
        }
        int zzC = zzC(i);
        long j2 = zzC & 1048575;
        switch (zzB(zzC)) {
            case 0:
                return Double.doubleToRawLongBits(zzgnu.zzb(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzgnu.zzc(obj, j2)) != 0;
            case 2:
                return zzgnu.zzf(obj, j2) != 0;
            case 3:
                return zzgnu.zzf(obj, j2) != 0;
            case 4:
                return zzgnu.zzd(obj, j2) != 0;
            case 5:
                return zzgnu.zzf(obj, j2) != 0;
            case 6:
                return zzgnu.zzd(obj, j2) != 0;
            case 7:
                return zzgnu.zzz(obj, j2);
            case 8:
                Object zzh = zzgnu.zzh(obj, j2);
                if (zzh instanceof String) {
                    return !((String) zzh).isEmpty();
                } else if (zzh instanceof zzgji) {
                    return !zzgji.zzb.equals(zzh);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzgnu.zzh(obj, j2) != null;
            case 10:
                return !zzgji.zzb.equals(zzgnu.zzh(obj, j2));
            case 11:
                return zzgnu.zzd(obj, j2) != 0;
            case 12:
                return zzgnu.zzd(obj, j2) != 0;
            case 13:
                return zzgnu.zzd(obj, j2) != 0;
            case 14:
                return zzgnu.zzf(obj, j2) != 0;
            case 15:
                return zzgnu.zzd(obj, j2) != 0;
            case 16:
                return zzgnu.zzf(obj, j2) != 0;
            case 17:
                return zzgnu.zzh(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzR(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzQ(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzS(Object obj, int i, zzgmt zzgmtVar) {
        return zzgmtVar.zzk(zzgnu.zzh(obj, i & 1048575));
    }

    private final boolean zzT(Object obj, int i, int i2) {
        return zzgnu.zzd(obj, (long) (zzz(i2) & 1048575)) == i;
    }

    private static boolean zzU(Object obj, long j) {
        return ((Boolean) zzgnu.zzh(obj, j)).booleanValue();
    }

    private final void zzV(Object obj, zzgjy zzgjyVar) throws IOException {
        int i;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int zzC = zzC(i3);
                int[] iArr = this.zzc;
                int i6 = iArr[i3];
                int zzB = zzB(zzC);
                if (zzB <= 17) {
                    int i7 = iArr[i3 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i5) {
                        i4 = unsafe.getInt(obj, i8);
                        i5 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = zzC & i2;
                switch (zzB) {
                    case 0:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzf(i6, zzgnu.zzb(obj, j));
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 1:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzo(i6, zzgnu.zzc(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 2:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzt(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 3:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzJ(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 4:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzr(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 5:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzm(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 6:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzk(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 7:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzb(i6, zzgnu.zzz(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 8:
                        if ((i4 & i) != 0) {
                            zzX(i6, unsafe.getObject(obj, j), zzgjyVar);
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 9:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzv(i6, unsafe.getObject(obj, j), zzF(i3));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 10:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzd(i6, (zzgji) unsafe.getObject(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 11:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzH(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 12:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzi(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 13:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzw(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 14:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzy(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 15:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzA(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 16:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzC(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 17:
                        if ((i4 & i) != 0) {
                            zzgjyVar.zzq(i6, unsafe.getObject(obj, j), zzF(i3));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 18:
                        zzgmv.zzL(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 19:
                        zzgmv.zzP(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 20:
                        zzgmv.zzS(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 21:
                        zzgmv.zzaa(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 22:
                        zzgmv.zzR(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 23:
                        zzgmv.zzO(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 24:
                        zzgmv.zzN(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 25:
                        zzgmv.zzJ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 26:
                        zzgmv.zzY(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar);
                        break;
                    case 27:
                        zzgmv.zzT(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, zzF(i3));
                        break;
                    case 28:
                        zzgmv.zzK(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar);
                        break;
                    case 29:
                        zzgmv.zzZ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, false);
                        break;
                    case 30:
                        zzgmv.zzM(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, false);
                        break;
                    case 31:
                        zzgmv.zzU(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, false);
                        break;
                    case 32:
                        zzgmv.zzV(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, false);
                        break;
                    case 33:
                        zzgmv.zzW(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, false);
                        break;
                    case 34:
                        zzgmv.zzX(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, false);
                        break;
                    case 35:
                        zzgmv.zzL(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, true);
                        break;
                    case 36:
                        zzgmv.zzP(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, true);
                        break;
                    case 37:
                        zzgmv.zzS(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, true);
                        break;
                    case 38:
                        zzgmv.zzaa(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, true);
                        break;
                    case 39:
                        zzgmv.zzR(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, true);
                        break;
                    case 40:
                        zzgmv.zzO(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, true);
                        break;
                    case 41:
                        zzgmv.zzN(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, true);
                        break;
                    case 42:
                        zzgmv.zzJ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, true);
                        break;
                    case 43:
                        zzgmv.zzZ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, true);
                        break;
                    case 44:
                        zzgmv.zzM(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, true);
                        break;
                    case 45:
                        zzgmv.zzU(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, true);
                        break;
                    case 46:
                        zzgmv.zzV(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, true);
                        break;
                    case 47:
                        zzgmv.zzW(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, true);
                        break;
                    case 48:
                        zzgmv.zzX(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, true);
                        break;
                    case 49:
                        zzgmv.zzQ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzgjyVar, zzF(i3));
                        break;
                    case 50:
                        zzW(zzgjyVar, i6, unsafe.getObject(obj, j), i3);
                        break;
                    case 51:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzf(i6, zzo(obj, j));
                            break;
                        }
                        break;
                    case 52:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzo(i6, zzp(obj, j));
                            break;
                        }
                        break;
                    case 53:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzt(i6, zzD(obj, j));
                            break;
                        }
                        break;
                    case 54:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzJ(i6, zzD(obj, j));
                            break;
                        }
                        break;
                    case 55:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzr(i6, zzs(obj, j));
                            break;
                        }
                        break;
                    case 56:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzm(i6, zzD(obj, j));
                            break;
                        }
                        break;
                    case 57:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzk(i6, zzs(obj, j));
                            break;
                        }
                        break;
                    case 58:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzb(i6, zzU(obj, j));
                            break;
                        }
                        break;
                    case 59:
                        if (zzT(obj, i6, i3)) {
                            zzX(i6, unsafe.getObject(obj, j), zzgjyVar);
                            break;
                        }
                        break;
                    case 60:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzv(i6, unsafe.getObject(obj, j), zzF(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzd(i6, (zzgji) unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                    case 62:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzH(i6, zzs(obj, j));
                            break;
                        }
                        break;
                    case 63:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzi(i6, zzs(obj, j));
                            break;
                        }
                        break;
                    case 64:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzw(i6, zzs(obj, j));
                            break;
                        }
                        break;
                    case 65:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzy(i6, zzD(obj, j));
                            break;
                        }
                        break;
                    case 66:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzA(i6, zzs(obj, j));
                            break;
                        }
                        break;
                    case 67:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzC(i6, zzD(obj, j));
                            break;
                        }
                        break;
                    case 68:
                        if (zzT(obj, i6, i3)) {
                            zzgjyVar.zzq(i6, unsafe.getObject(obj, j), zzF(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            zzgnk zzgnkVar = this.zzo;
            zzgnkVar.zzr(zzgnkVar.zzd(obj), zzgjyVar);
            return;
        }
        this.zzp.zza(obj);
        throw null;
    }

    private final void zzW(zzgjy zzgjyVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzglt zzgltVar = (zzglt) zzH(i2);
        throw null;
    }

    private static final void zzX(int i, Object obj, zzgjy zzgjyVar) throws IOException {
        if (obj instanceof String) {
            zzgjyVar.zzF(i, (String) obj);
        } else {
            zzgjyVar.zzd(i, (zzgji) obj);
        }
    }

    public static zzgnl zzd(Object obj) {
        zzgkq zzgkqVar = (zzgkq) obj;
        zzgnl zzgnlVar = zzgkqVar.zzc;
        if (zzgnlVar == zzgnl.zzc()) {
            zzgnl zze = zzgnl.zze();
            zzgkqVar.zzc = zze;
            return zze;
        }
        return zzgnlVar;
    }

    public static zzgmd zzl(Class cls, zzglx zzglxVar, zzgmf zzgmfVar, zzglo zzgloVar, zzgnk zzgnkVar, zzgkd zzgkdVar, zzglv zzglvVar) {
        if (zzglxVar instanceof zzgmk) {
            return zzm((zzgmk) zzglxVar, zzgmfVar, zzgloVar, zzgnkVar, zzgkdVar, zzglvVar);
        }
        zzgnh zzgnhVar = (zzgnh) zzglxVar;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0385  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzgmd zzm(zzgmk zzgmkVar, zzgmf zzgmfVar, zzglo zzgloVar, zzgnk zzgnkVar, zzgkd zzgkdVar, zzglv zzglvVar) {
        int i;
        int charAt;
        int charAt2;
        int charAt3;
        int[] iArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char charAt4;
        int i7;
        char charAt5;
        int i8;
        char charAt6;
        int i9;
        char charAt7;
        int i10;
        char charAt8;
        int i11;
        char charAt9;
        int i12;
        char charAt10;
        int i13;
        char charAt11;
        int i14;
        int i15;
        int i16;
        int[] iArr2;
        int i17;
        int i18;
        int i19;
        int objectFieldOffset;
        Object[] objArr;
        String str;
        Class<?> cls;
        int i20;
        int i21;
        int i22;
        Field zzI;
        char charAt12;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field zzI2;
        Object obj2;
        Field zzI3;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        int i29;
        char charAt16;
        boolean z = zzgmkVar.zzc() == 2;
        String zzd = zzgmkVar.zzd();
        int length = zzd.length();
        char c = 55296;
        if (zzd.charAt(0) >= 55296) {
            int i30 = 1;
            while (true) {
                i = i30 + 1;
                if (zzd.charAt(i30) < 55296) {
                    break;
                }
                i30 = i;
            }
        } else {
            i = 1;
        }
        int i31 = i + 1;
        int charAt17 = zzd.charAt(i);
        if (charAt17 >= 55296) {
            int i32 = charAt17 & 8191;
            int i33 = 13;
            while (true) {
                i29 = i31 + 1;
                charAt16 = zzd.charAt(i31);
                if (charAt16 < 55296) {
                    break;
                }
                i32 |= (charAt16 & 8191) << i33;
                i33 += 13;
                i31 = i29;
            }
            charAt17 = i32 | (charAt16 << i33);
            i31 = i29;
        }
        if (charAt17 == 0) {
            iArr = zza;
            i3 = 0;
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i4 = 0;
            charAt3 = 0;
            i2 = 0;
        } else {
            int i34 = i31 + 1;
            int charAt18 = zzd.charAt(i31);
            if (charAt18 >= 55296) {
                int i35 = charAt18 & 8191;
                int i36 = 13;
                while (true) {
                    i13 = i34 + 1;
                    charAt11 = zzd.charAt(i34);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i35 |= (charAt11 & 8191) << i36;
                    i36 += 13;
                    i34 = i13;
                }
                charAt18 = i35 | (charAt11 << i36);
                i34 = i13;
            }
            int i37 = i34 + 1;
            int charAt19 = zzd.charAt(i34);
            if (charAt19 >= 55296) {
                int i38 = charAt19 & 8191;
                int i39 = 13;
                while (true) {
                    i12 = i37 + 1;
                    charAt10 = zzd.charAt(i37);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i38 |= (charAt10 & 8191) << i39;
                    i39 += 13;
                    i37 = i12;
                }
                charAt19 = i38 | (charAt10 << i39);
                i37 = i12;
            }
            int i40 = i37 + 1;
            charAt = zzd.charAt(i37);
            if (charAt >= 55296) {
                int i41 = charAt & 8191;
                int i42 = 13;
                while (true) {
                    i11 = i40 + 1;
                    charAt9 = zzd.charAt(i40);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i41 |= (charAt9 & 8191) << i42;
                    i42 += 13;
                    i40 = i11;
                }
                charAt = i41 | (charAt9 << i42);
                i40 = i11;
            }
            int i43 = i40 + 1;
            int charAt20 = zzd.charAt(i40);
            if (charAt20 >= 55296) {
                int i44 = charAt20 & 8191;
                int i45 = 13;
                while (true) {
                    i10 = i43 + 1;
                    charAt8 = zzd.charAt(i43);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i44 |= (charAt8 & 8191) << i45;
                    i45 += 13;
                    i43 = i10;
                }
                charAt20 = i44 | (charAt8 << i45);
                i43 = i10;
            }
            int i46 = i43 + 1;
            charAt2 = zzd.charAt(i43);
            if (charAt2 >= 55296) {
                int i47 = charAt2 & 8191;
                int i48 = 13;
                while (true) {
                    i9 = i46 + 1;
                    charAt7 = zzd.charAt(i46);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i47 |= (charAt7 & 8191) << i48;
                    i48 += 13;
                    i46 = i9;
                }
                charAt2 = i47 | (charAt7 << i48);
                i46 = i9;
            }
            int i49 = i46 + 1;
            int charAt21 = zzd.charAt(i46);
            if (charAt21 >= 55296) {
                int i50 = charAt21 & 8191;
                int i51 = 13;
                while (true) {
                    i8 = i49 + 1;
                    charAt6 = zzd.charAt(i49);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i50 |= (charAt6 & 8191) << i51;
                    i51 += 13;
                    i49 = i8;
                }
                charAt21 = i50 | (charAt6 << i51);
                i49 = i8;
            }
            int i52 = i49 + 1;
            int charAt22 = zzd.charAt(i49);
            if (charAt22 >= 55296) {
                int i53 = charAt22 & 8191;
                int i54 = 13;
                while (true) {
                    i7 = i52 + 1;
                    charAt5 = zzd.charAt(i52);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i53 |= (charAt5 & 8191) << i54;
                    i54 += 13;
                    i52 = i7;
                }
                charAt22 = i53 | (charAt5 << i54);
                i52 = i7;
            }
            int i55 = i52 + 1;
            charAt3 = zzd.charAt(i52);
            if (charAt3 >= 55296) {
                int i56 = charAt3 & 8191;
                int i57 = 13;
                while (true) {
                    i6 = i55 + 1;
                    charAt4 = zzd.charAt(i55);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i56 |= (charAt4 & 8191) << i57;
                    i57 += 13;
                    i55 = i6;
                }
                charAt3 = i56 | (charAt4 << i57);
                i55 = i6;
            }
            iArr = new int[charAt3 + charAt21 + charAt22];
            i2 = charAt18 + charAt18 + charAt19;
            i3 = charAt18;
            i31 = i55;
            int i58 = charAt21;
            i4 = charAt20;
            i5 = i58;
        }
        Unsafe unsafe = zzb;
        Object[] zze = zzgmkVar.zze();
        Class<?> cls2 = zzgmkVar.zza().getClass();
        int[] iArr3 = new int[charAt2 * 3];
        Object[] objArr2 = new Object[charAt2 + charAt2];
        int i59 = charAt3 + i5;
        int i60 = charAt3;
        int i61 = i59;
        int i62 = 0;
        int i63 = 0;
        while (i31 < length) {
            int i64 = i31 + 1;
            int charAt23 = zzd.charAt(i31);
            if (charAt23 >= c) {
                int i65 = charAt23 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i28 = i66 + 1;
                    charAt15 = zzd.charAt(i66);
                    if (charAt15 < c) {
                        break;
                    }
                    i65 |= (charAt15 & 8191) << i67;
                    i67 += 13;
                    i66 = i28;
                }
                charAt23 = i65 | (charAt15 << i67);
                i14 = i28;
            } else {
                i14 = i64;
            }
            int i68 = i14 + 1;
            int charAt24 = zzd.charAt(i14);
            if (charAt24 >= c) {
                int i69 = charAt24 & 8191;
                int i70 = i68;
                int i71 = 13;
                while (true) {
                    i27 = i70 + 1;
                    charAt14 = zzd.charAt(i70);
                    i15 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i69 |= (charAt14 & 8191) << i71;
                    i71 += 13;
                    i70 = i27;
                    length = i15;
                }
                charAt24 = i69 | (charAt14 << i71);
                i16 = i27;
            } else {
                i15 = length;
                i16 = i68;
            }
            int i72 = charAt24 & 255;
            int i73 = charAt3;
            if ((charAt24 & 1024) != 0) {
                iArr[i63] = i62;
                i63++;
            }
            if (i72 >= 51) {
                int i74 = i16 + 1;
                int charAt25 = zzd.charAt(i16);
                if (charAt25 >= 55296) {
                    int i75 = charAt25 & 8191;
                    int i76 = i74;
                    int i77 = 13;
                    while (true) {
                        i26 = i76 + 1;
                        charAt13 = zzd.charAt(i76);
                        i18 = i4;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i75 |= (charAt13 & 8191) << i77;
                        i77 += 13;
                        i76 = i26;
                        i4 = i18;
                    }
                    charAt25 = i75 | (charAt13 << i77);
                    i24 = i26;
                } else {
                    i18 = i4;
                    i24 = i74;
                }
                int i78 = i72 - 51;
                i20 = i24;
                if (i78 == 9 || i78 == 17) {
                    int i79 = i62 / 3;
                    i25 = i2 + 1;
                    objArr2[i79 + i79 + 1] = zze[i2];
                } else {
                    if (i78 == 12 && !z) {
                        int i80 = i62 / 3;
                        i25 = i2 + 1;
                        objArr2[i80 + i80 + 1] = zze[i2];
                    }
                    int i81 = charAt25 + charAt25;
                    obj = zze[i81];
                    if (!(obj instanceof Field)) {
                        zzI2 = (Field) obj;
                    } else {
                        zzI2 = zzI(cls2, (String) obj);
                        zze[i81] = zzI2;
                    }
                    iArr2 = iArr3;
                    i17 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzI2);
                    int i82 = i81 + 1;
                    obj2 = zze[i82];
                    if (!(obj2 instanceof Field)) {
                        zzI3 = (Field) obj2;
                    } else {
                        zzI3 = zzI(cls2, (String) obj2);
                        zze[i82] = zzI3;
                    }
                    cls = cls2;
                    i21 = (int) unsafe.objectFieldOffset(zzI3);
                    objArr = objArr2;
                    str = zzd;
                    objectFieldOffset = objectFieldOffset2;
                    i22 = 0;
                }
                i2 = i25;
                int i812 = charAt25 + charAt25;
                obj = zze[i812];
                if (!(obj instanceof Field)) {
                }
                iArr2 = iArr3;
                i17 = charAt;
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzI2);
                int i822 = i812 + 1;
                obj2 = zze[i822];
                if (!(obj2 instanceof Field)) {
                }
                cls = cls2;
                i21 = (int) unsafe.objectFieldOffset(zzI3);
                objArr = objArr2;
                str = zzd;
                objectFieldOffset = objectFieldOffset22;
                i22 = 0;
            } else {
                iArr2 = iArr3;
                i17 = charAt;
                i18 = i4;
                int i83 = i2 + 1;
                Field zzI4 = zzI(cls2, (String) zze[i2]);
                if (i72 == 9 || i72 == 17) {
                    int i84 = i62 / 3;
                    objArr2[i84 + i84 + 1] = zzI4.getType();
                } else {
                    if (i72 == 27 || i72 == 49) {
                        int i85 = i62 / 3;
                        i23 = i83 + 1;
                        objArr2[i85 + i85 + 1] = zze[i83];
                    } else if (i72 == 12 || i72 == 30 || i72 == 44) {
                        if (!z) {
                            int i86 = i62 / 3;
                            i23 = i83 + 1;
                            objArr2[i86 + i86 + 1] = zze[i83];
                        }
                    } else if (i72 == 50) {
                        int i87 = i60 + 1;
                        iArr[i60] = i62;
                        int i88 = i62 / 3;
                        int i89 = i88 + i88;
                        int i90 = i83 + 1;
                        objArr2[i89] = zze[i83];
                        if ((charAt24 & 2048) != 0) {
                            i83 = i90 + 1;
                            objArr2[i89 + 1] = zze[i90];
                            i60 = i87;
                        } else {
                            i60 = i87;
                            i19 = i90;
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzI4);
                            objArr = objArr2;
                            if ((charAt24 & 4096) == 4096 || i72 > 17) {
                                str = zzd;
                                cls = cls2;
                                i20 = i16;
                                i21 = 1048575;
                                i22 = 0;
                            } else {
                                int i91 = i16 + 1;
                                int charAt26 = zzd.charAt(i16);
                                if (charAt26 >= 55296) {
                                    int i92 = charAt26 & 8191;
                                    int i93 = 13;
                                    while (true) {
                                        i20 = i91 + 1;
                                        charAt12 = zzd.charAt(i91);
                                        if (charAt12 < 55296) {
                                            break;
                                        }
                                        i92 |= (charAt12 & 8191) << i93;
                                        i93 += 13;
                                        i91 = i20;
                                    }
                                    charAt26 = i92 | (charAt12 << i93);
                                } else {
                                    i20 = i91;
                                }
                                int i94 = (charAt26 / 32) + i3 + i3;
                                Object obj3 = zze[i94];
                                if (obj3 instanceof Field) {
                                    zzI = (Field) obj3;
                                } else {
                                    zzI = zzI(cls2, (String) obj3);
                                    zze[i94] = zzI;
                                }
                                str = zzd;
                                cls = cls2;
                                i21 = (int) unsafe.objectFieldOffset(zzI);
                                i22 = charAt26 % 32;
                            }
                            if (i72 >= 18 && i72 <= 49) {
                                iArr[i61] = objectFieldOffset;
                                i61++;
                            }
                            i2 = i19;
                        }
                    }
                    i19 = i23;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzI4);
                    objArr = objArr2;
                    if ((charAt24 & 4096) == 4096) {
                    }
                    str = zzd;
                    cls = cls2;
                    i20 = i16;
                    i21 = 1048575;
                    i22 = 0;
                    if (i72 >= 18) {
                        iArr[i61] = objectFieldOffset;
                        i61++;
                    }
                    i2 = i19;
                }
                i19 = i83;
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzI4);
                objArr = objArr2;
                if ((charAt24 & 4096) == 4096) {
                }
                str = zzd;
                cls = cls2;
                i20 = i16;
                i21 = 1048575;
                i22 = 0;
                if (i72 >= 18) {
                }
                i2 = i19;
            }
            int i95 = i62 + 1;
            iArr2[i62] = charAt23;
            int i96 = i95 + 1;
            iArr2[i95] = ((charAt24 & 256) != 0 ? 268435456 : 0) | ((charAt24 & 512) != 0 ? 536870912 : 0) | (i72 << 20) | objectFieldOffset;
            i62 = i96 + 1;
            iArr2[i96] = (i22 << 20) | i21;
            zzd = str;
            charAt = i17;
            charAt3 = i73;
            cls2 = cls;
            i31 = i20;
            length = i15;
            objArr2 = objArr;
            iArr3 = iArr2;
            i4 = i18;
            c = 55296;
        }
        return new zzgmd(iArr3, objArr2, charAt, i4, zzgmkVar.zza(), z, false, iArr, charAt3, i59, zzgmfVar, zzgloVar, zzgnkVar, zzgkdVar, zzglvVar, null);
    }

    private static double zzo(Object obj, long j) {
        return ((Double) zzgnu.zzh(obj, j)).doubleValue();
    }

    private static float zzp(Object obj, long j) {
        return ((Float) zzgnu.zzh(obj, j)).floatValue();
    }

    private final int zzq(Object obj) {
        int i;
        int zzE;
        int zzE2;
        int zzE3;
        int zzF;
        int zzE4;
        int zzy;
        int zzE5;
        int zzE6;
        int zzd;
        int zzE7;
        int zzo;
        int zzE8;
        int zzF2;
        int zzi;
        int zzD;
        int zzE9;
        int i2;
        int zzE10;
        int zzd2;
        int zzE11;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i4 < this.zzc.length) {
            int zzC = zzC(i4);
            int[] iArr = this.zzc;
            int i8 = iArr[i4];
            int zzB = zzB(zzC);
            if (zzB <= 17) {
                int i9 = iArr[i4 + 2];
                int i10 = i9 & i3;
                i = 1 << (i9 >>> 20);
                if (i10 != i7) {
                    i6 = unsafe.getInt(obj, i10);
                    i7 = i10;
                }
            } else {
                i = 0;
            }
            long j = i3 & zzC;
            switch (zzB) {
                case 0:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzE = zzgjx.zzE(i8 << 3);
                        zzo = zzE + 8;
                        i5 += zzo;
                        break;
                    }
                case 1:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzE2 = zzgjx.zzE(i8 << 3);
                        zzo = zzE2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 2:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzE3 = zzgjx.zzE(i8 << 3);
                        zzF = zzgjx.zzF(j2);
                        zzo = zzE3 + zzF;
                        i5 += zzo;
                        break;
                    }
                case 3:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        zzE3 = zzgjx.zzE(i8 << 3);
                        zzF = zzgjx.zzF(j3);
                        zzo = zzE3 + zzF;
                        i5 += zzo;
                        break;
                    }
                case 4:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i11 = unsafe.getInt(obj, j);
                        zzE4 = zzgjx.zzE(i8 << 3);
                        zzy = zzgjx.zzy(i11);
                        zzo = zzy + zzE4;
                        i5 += zzo;
                        break;
                    }
                case 5:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzE = zzgjx.zzE(i8 << 3);
                        zzo = zzE + 8;
                        i5 += zzo;
                        break;
                    }
                case 6:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzE2 = zzgjx.zzE(i8 << 3);
                        zzo = zzE2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 7:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzE5 = zzgjx.zzE(i8 << 3);
                        zzo = zzE5 + 1;
                        i5 += zzo;
                        break;
                    }
                case 8:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzgji) {
                            zzE6 = zzgjx.zzE(i8 << 3);
                            zzd = ((zzgji) object).zzd();
                            zzE7 = zzgjx.zzE(zzd);
                            i5 = zzE7 + zzd + zzE6 + i5;
                            break;
                        } else {
                            zzE4 = zzgjx.zzE(i8 << 3);
                            zzy = zzgjx.zzC((String) object);
                            zzo = zzy + zzE4;
                            i5 += zzo;
                            break;
                        }
                    }
                case 9:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzo = zzgmv.zzo(i8, unsafe.getObject(obj, j), zzF(i4));
                        i5 += zzo;
                        break;
                    }
                case 10:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzE6 = zzgjx.zzE(i8 << 3);
                        zzd = ((zzgji) unsafe.getObject(obj, j)).zzd();
                        zzE7 = zzgjx.zzE(zzd);
                        i5 = zzE7 + zzd + zzE6 + i5;
                        break;
                    }
                case 11:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i12 = unsafe.getInt(obj, j);
                        zzE4 = zzgjx.zzE(i8 << 3);
                        zzy = zzgjx.zzE(i12);
                        zzo = zzy + zzE4;
                        i5 += zzo;
                        break;
                    }
                case 12:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        zzE4 = zzgjx.zzE(i8 << 3);
                        zzy = zzgjx.zzy(i13);
                        zzo = zzy + zzE4;
                        i5 += zzo;
                        break;
                    }
                case 13:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzE2 = zzgjx.zzE(i8 << 3);
                        zzo = zzE2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 14:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzE = zzgjx.zzE(i8 << 3);
                        zzo = zzE + 8;
                        i5 += zzo;
                        break;
                    }
                case 15:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        zzE4 = zzgjx.zzE(i8 << 3);
                        zzy = zzgjx.zzE((i14 >> 31) ^ (i14 + i14));
                        zzo = zzy + zzE4;
                        i5 += zzo;
                        break;
                    }
                case 16:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        zzE8 = zzgjx.zzE(i8 << 3);
                        zzF2 = zzgjx.zzF((j4 >> 63) ^ (j4 + j4));
                        zzo = zzF2 + zzE8;
                        i5 += zzo;
                        break;
                    }
                case 17:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzo = zzgjx.zzx(i8, (zzgma) unsafe.getObject(obj, j), zzF(i4));
                        i5 += zzo;
                        break;
                    }
                case 18:
                    zzo = zzgmv.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 19:
                    zzo = zzgmv.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 20:
                    zzo = zzgmv.zzm(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 21:
                    zzo = zzgmv.zzx(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 22:
                    zzo = zzgmv.zzk(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 23:
                    zzo = zzgmv.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 24:
                    zzo = zzgmv.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 25:
                    zzo = zzgmv.zza(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 26:
                    zzo = zzgmv.zzu(i8, (List) unsafe.getObject(obj, j));
                    i5 += zzo;
                    break;
                case 27:
                    zzo = zzgmv.zzp(i8, (List) unsafe.getObject(obj, j), zzF(i4));
                    i5 += zzo;
                    break;
                case 28:
                    zzo = zzgmv.zzc(i8, (List) unsafe.getObject(obj, j));
                    i5 += zzo;
                    break;
                case 29:
                    zzo = zzgmv.zzv(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 30:
                    zzo = zzgmv.zzd(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 31:
                    zzo = zzgmv.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 32:
                    zzo = zzgmv.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 33:
                    zzo = zzgmv.zzq(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 34:
                    zzo = zzgmv.zzs(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 35:
                    zzi = zzgmv.zzi((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjx.zzD(i8);
                        zzE9 = zzgjx.zzE(zzi);
                        i2 = zzE9 + zzD + zzi;
                        i5 += i2;
                        break;
                    }
                case 36:
                    zzi = zzgmv.zzg((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjx.zzD(i8);
                        zzE9 = zzgjx.zzE(zzi);
                        i2 = zzE9 + zzD + zzi;
                        i5 += i2;
                        break;
                    }
                case 37:
                    zzi = zzgmv.zzn((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjx.zzD(i8);
                        zzE9 = zzgjx.zzE(zzi);
                        i2 = zzE9 + zzD + zzi;
                        i5 += i2;
                        break;
                    }
                case 38:
                    zzi = zzgmv.zzy((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjx.zzD(i8);
                        zzE9 = zzgjx.zzE(zzi);
                        i2 = zzE9 + zzD + zzi;
                        i5 += i2;
                        break;
                    }
                case 39:
                    zzi = zzgmv.zzl((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjx.zzD(i8);
                        zzE9 = zzgjx.zzE(zzi);
                        i2 = zzE9 + zzD + zzi;
                        i5 += i2;
                        break;
                    }
                case 40:
                    zzi = zzgmv.zzi((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjx.zzD(i8);
                        zzE9 = zzgjx.zzE(zzi);
                        i2 = zzE9 + zzD + zzi;
                        i5 += i2;
                        break;
                    }
                case 41:
                    zzi = zzgmv.zzg((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjx.zzD(i8);
                        zzE9 = zzgjx.zzE(zzi);
                        i2 = zzE9 + zzD + zzi;
                        i5 += i2;
                        break;
                    }
                case 42:
                    zzi = zzgmv.zzb((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjx.zzD(i8);
                        zzE9 = zzgjx.zzE(zzi);
                        i2 = zzE9 + zzD + zzi;
                        i5 += i2;
                        break;
                    }
                case 43:
                    zzi = zzgmv.zzw((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjx.zzD(i8);
                        zzE9 = zzgjx.zzE(zzi);
                        i2 = zzE9 + zzD + zzi;
                        i5 += i2;
                        break;
                    }
                case 44:
                    zzi = zzgmv.zze((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjx.zzD(i8);
                        zzE9 = zzgjx.zzE(zzi);
                        i2 = zzE9 + zzD + zzi;
                        i5 += i2;
                        break;
                    }
                case 45:
                    zzi = zzgmv.zzg((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjx.zzD(i8);
                        zzE9 = zzgjx.zzE(zzi);
                        i2 = zzE9 + zzD + zzi;
                        i5 += i2;
                        break;
                    }
                case 46:
                    zzi = zzgmv.zzi((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjx.zzD(i8);
                        zzE9 = zzgjx.zzE(zzi);
                        i2 = zzE9 + zzD + zzi;
                        i5 += i2;
                        break;
                    }
                case 47:
                    zzi = zzgmv.zzr((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjx.zzD(i8);
                        zzE9 = zzgjx.zzE(zzi);
                        i2 = zzE9 + zzD + zzi;
                        i5 += i2;
                        break;
                    }
                case 48:
                    zzi = zzgmv.zzt((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzD = zzgjx.zzD(i8);
                        zzE9 = zzgjx.zzE(zzi);
                        i2 = zzE9 + zzD + zzi;
                        i5 += i2;
                        break;
                    }
                case 49:
                    zzo = zzgmv.zzj(i8, (List) unsafe.getObject(obj, j), zzF(i4));
                    i5 += zzo;
                    break;
                case 50:
                    zzglv.zza(i8, unsafe.getObject(obj, j), zzH(i4));
                    break;
                case 51:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        zzE = zzgjx.zzE(i8 << 3);
                        zzo = zzE + 8;
                        i5 += zzo;
                        break;
                    }
                case 52:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        zzE2 = zzgjx.zzE(i8 << 3);
                        zzo = zzE2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 53:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        long zzD2 = zzD(obj, j);
                        zzE3 = zzgjx.zzE(i8 << 3);
                        zzF = zzgjx.zzF(zzD2);
                        zzo = zzE3 + zzF;
                        i5 += zzo;
                        break;
                    }
                case 54:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        long zzD3 = zzD(obj, j);
                        zzE3 = zzgjx.zzE(i8 << 3);
                        zzF = zzgjx.zzF(zzD3);
                        zzo = zzE3 + zzF;
                        i5 += zzo;
                        break;
                    }
                case 55:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        int zzs = zzs(obj, j);
                        zzE4 = zzgjx.zzE(i8 << 3);
                        zzy = zzgjx.zzy(zzs);
                        zzo = zzy + zzE4;
                        i5 += zzo;
                        break;
                    }
                case 56:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        zzE = zzgjx.zzE(i8 << 3);
                        zzo = zzE + 8;
                        i5 += zzo;
                        break;
                    }
                case 57:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        zzE2 = zzgjx.zzE(i8 << 3);
                        zzo = zzE2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 58:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        zzE5 = zzgjx.zzE(i8 << 3);
                        zzo = zzE5 + 1;
                        i5 += zzo;
                        break;
                    }
                case 59:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzgji) {
                            zzE10 = zzgjx.zzE(i8 << 3);
                            zzd2 = ((zzgji) object2).zzd();
                            zzE11 = zzgjx.zzE(zzd2);
                            i2 = zzE11 + zzd2 + zzE10;
                            i5 += i2;
                            break;
                        } else {
                            zzE4 = zzgjx.zzE(i8 << 3);
                            zzy = zzgjx.zzC((String) object2);
                            zzo = zzy + zzE4;
                            i5 += zzo;
                            break;
                        }
                    }
                case 60:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        zzo = zzgmv.zzo(i8, unsafe.getObject(obj, j), zzF(i4));
                        i5 += zzo;
                        break;
                    }
                case 61:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        zzE10 = zzgjx.zzE(i8 << 3);
                        zzd2 = ((zzgji) unsafe.getObject(obj, j)).zzd();
                        zzE11 = zzgjx.zzE(zzd2);
                        i2 = zzE11 + zzd2 + zzE10;
                        i5 += i2;
                        break;
                    }
                case 62:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        int zzs2 = zzs(obj, j);
                        zzE4 = zzgjx.zzE(i8 << 3);
                        zzy = zzgjx.zzE(zzs2);
                        zzo = zzy + zzE4;
                        i5 += zzo;
                        break;
                    }
                case 63:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        int zzs3 = zzs(obj, j);
                        zzE4 = zzgjx.zzE(i8 << 3);
                        zzy = zzgjx.zzy(zzs3);
                        zzo = zzy + zzE4;
                        i5 += zzo;
                        break;
                    }
                case 64:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        zzE2 = zzgjx.zzE(i8 << 3);
                        zzo = zzE2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 65:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        zzE = zzgjx.zzE(i8 << 3);
                        zzo = zzE + 8;
                        i5 += zzo;
                        break;
                    }
                case 66:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        int zzs4 = zzs(obj, j);
                        zzE4 = zzgjx.zzE(i8 << 3);
                        zzy = zzgjx.zzE((zzs4 >> 31) ^ (zzs4 + zzs4));
                        zzo = zzy + zzE4;
                        i5 += zzo;
                        break;
                    }
                case 67:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        long zzD4 = zzD(obj, j);
                        zzE8 = zzgjx.zzE(i8 << 3);
                        zzF2 = zzgjx.zzF((zzD4 >> 63) ^ (zzD4 + zzD4));
                        zzo = zzF2 + zzE8;
                        i5 += zzo;
                        break;
                    }
                case 68:
                    if (!zzT(obj, i8, i4)) {
                        break;
                    } else {
                        zzo = zzgjx.zzx(i8, (zzgma) unsafe.getObject(obj, j), zzF(i4));
                        i5 += zzo;
                        break;
                    }
            }
            i4 += 3;
            i3 = 1048575;
        }
        zzgnk zzgnkVar = this.zzo;
        int zza2 = zzgnkVar.zza(zzgnkVar.zzd(obj)) + i5;
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return zza2;
    }

    private final int zzr(Object obj) {
        int zzE;
        int zzE2;
        int zzE3;
        int zzF;
        int zzE4;
        int zzy;
        int zzE5;
        int zzE6;
        int zzd;
        int zzE7;
        int zzo;
        int zzi;
        int zzD;
        int zzE8;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int zzC = zzC(i3);
            int zzB = zzB(zzC);
            int i4 = this.zzc[i3];
            long j = zzC & 1048575;
            if (zzB >= zzgki.zzJ.zza() && zzB <= zzgki.zzW.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (zzB) {
                case 0:
                    if (zzQ(obj, i3)) {
                        zzE = zzgjx.zzE(i4 << 3);
                        zzo = zzE + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (zzQ(obj, i3)) {
                        zzE2 = zzgjx.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (zzQ(obj, i3)) {
                        long zzf = zzgnu.zzf(obj, j);
                        zzE3 = zzgjx.zzE(i4 << 3);
                        zzF = zzgjx.zzF(zzf);
                        zzo = zzF + zzE3;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (zzQ(obj, i3)) {
                        long zzf2 = zzgnu.zzf(obj, j);
                        zzE3 = zzgjx.zzE(i4 << 3);
                        zzF = zzgjx.zzF(zzf2);
                        zzo = zzF + zzE3;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (zzQ(obj, i3)) {
                        int zzd2 = zzgnu.zzd(obj, j);
                        zzE4 = zzgjx.zzE(i4 << 3);
                        zzy = zzgjx.zzy(zzd2);
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (zzQ(obj, i3)) {
                        zzE = zzgjx.zzE(i4 << 3);
                        zzo = zzE + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (zzQ(obj, i3)) {
                        zzE2 = zzgjx.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (zzQ(obj, i3)) {
                        zzE5 = zzgjx.zzE(i4 << 3);
                        zzo = zzE5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (zzQ(obj, i3)) {
                        Object zzh = zzgnu.zzh(obj, j);
                        if (zzh instanceof zzgji) {
                            zzE6 = zzgjx.zzE(i4 << 3);
                            zzd = ((zzgji) zzh).zzd();
                            zzE7 = zzgjx.zzE(zzd);
                            i = zzE7 + zzd + zzE6;
                            i2 += i;
                        } else {
                            zzE4 = zzgjx.zzE(i4 << 3);
                            zzy = zzgjx.zzC((String) zzh);
                            zzo = zzy + zzE4;
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (zzQ(obj, i3)) {
                        zzo = zzgmv.zzo(i4, zzgnu.zzh(obj, j), zzF(i3));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (zzQ(obj, i3)) {
                        zzE6 = zzgjx.zzE(i4 << 3);
                        zzd = ((zzgji) zzgnu.zzh(obj, j)).zzd();
                        zzE7 = zzgjx.zzE(zzd);
                        i = zzE7 + zzd + zzE6;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 11:
                    if (zzQ(obj, i3)) {
                        int zzd3 = zzgnu.zzd(obj, j);
                        zzE4 = zzgjx.zzE(i4 << 3);
                        zzy = zzgjx.zzE(zzd3);
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (zzQ(obj, i3)) {
                        int zzd4 = zzgnu.zzd(obj, j);
                        zzE4 = zzgjx.zzE(i4 << 3);
                        zzy = zzgjx.zzy(zzd4);
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (zzQ(obj, i3)) {
                        zzE2 = zzgjx.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (zzQ(obj, i3)) {
                        zzE = zzgjx.zzE(i4 << 3);
                        zzo = zzE + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (zzQ(obj, i3)) {
                        int zzd5 = zzgnu.zzd(obj, j);
                        zzE4 = zzgjx.zzE(i4 << 3);
                        zzy = zzgjx.zzE((zzd5 >> 31) ^ (zzd5 + zzd5));
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (zzQ(obj, i3)) {
                        long zzf3 = zzgnu.zzf(obj, j);
                        zzE4 = zzgjx.zzE(i4 << 3);
                        zzy = zzgjx.zzF((zzf3 >> 63) ^ (zzf3 + zzf3));
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (zzQ(obj, i3)) {
                        zzo = zzgjx.zzx(i4, (zzgma) zzgnu.zzh(obj, j), zzF(i3));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    zzo = zzgmv.zzh(i4, (List) zzgnu.zzh(obj, j), false);
                    break;
                case 19:
                    zzo = zzgmv.zzf(i4, (List) zzgnu.zzh(obj, j), false);
                    break;
                case 20:
                    zzo = zzgmv.zzm(i4, (List) zzgnu.zzh(obj, j), false);
                    break;
                case 21:
                    zzo = zzgmv.zzx(i4, (List) zzgnu.zzh(obj, j), false);
                    break;
                case 22:
                    zzo = zzgmv.zzk(i4, (List) zzgnu.zzh(obj, j), false);
                    break;
                case 23:
                    zzo = zzgmv.zzh(i4, (List) zzgnu.zzh(obj, j), false);
                    break;
                case 24:
                    zzo = zzgmv.zzf(i4, (List) zzgnu.zzh(obj, j), false);
                    break;
                case 25:
                    zzo = zzgmv.zza(i4, (List) zzgnu.zzh(obj, j), false);
                    break;
                case 26:
                    zzo = zzgmv.zzu(i4, (List) zzgnu.zzh(obj, j));
                    break;
                case 27:
                    zzo = zzgmv.zzp(i4, (List) zzgnu.zzh(obj, j), zzF(i3));
                    break;
                case 28:
                    zzo = zzgmv.zzc(i4, (List) zzgnu.zzh(obj, j));
                    break;
                case 29:
                    zzo = zzgmv.zzv(i4, (List) zzgnu.zzh(obj, j), false);
                    break;
                case 30:
                    zzo = zzgmv.zzd(i4, (List) zzgnu.zzh(obj, j), false);
                    break;
                case 31:
                    zzo = zzgmv.zzf(i4, (List) zzgnu.zzh(obj, j), false);
                    break;
                case 32:
                    zzo = zzgmv.zzh(i4, (List) zzgnu.zzh(obj, j), false);
                    break;
                case 33:
                    zzo = zzgmv.zzq(i4, (List) zzgnu.zzh(obj, j), false);
                    break;
                case 34:
                    zzo = zzgmv.zzs(i4, (List) zzgnu.zzh(obj, j), false);
                    break;
                case 35:
                    zzi = zzgmv.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i4);
                        zzE8 = zzgjx.zzE(zzi);
                        i = zzE8 + zzD + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 36:
                    zzi = zzgmv.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i4);
                        zzE8 = zzgjx.zzE(zzi);
                        i = zzE8 + zzD + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 37:
                    zzi = zzgmv.zzn((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i4);
                        zzE8 = zzgjx.zzE(zzi);
                        i = zzE8 + zzD + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 38:
                    zzi = zzgmv.zzy((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i4);
                        zzE8 = zzgjx.zzE(zzi);
                        i = zzE8 + zzD + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 39:
                    zzi = zzgmv.zzl((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i4);
                        zzE8 = zzgjx.zzE(zzi);
                        i = zzE8 + zzD + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 40:
                    zzi = zzgmv.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i4);
                        zzE8 = zzgjx.zzE(zzi);
                        i = zzE8 + zzD + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 41:
                    zzi = zzgmv.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i4);
                        zzE8 = zzgjx.zzE(zzi);
                        i = zzE8 + zzD + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 42:
                    zzi = zzgmv.zzb((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i4);
                        zzE8 = zzgjx.zzE(zzi);
                        i = zzE8 + zzD + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 43:
                    zzi = zzgmv.zzw((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i4);
                        zzE8 = zzgjx.zzE(zzi);
                        i = zzE8 + zzD + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 44:
                    zzi = zzgmv.zze((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i4);
                        zzE8 = zzgjx.zzE(zzi);
                        i = zzE8 + zzD + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 45:
                    zzi = zzgmv.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i4);
                        zzE8 = zzgjx.zzE(zzi);
                        i = zzE8 + zzD + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 46:
                    zzi = zzgmv.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i4);
                        zzE8 = zzgjx.zzE(zzi);
                        i = zzE8 + zzD + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 47:
                    zzi = zzgmv.zzr((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i4);
                        zzE8 = zzgjx.zzE(zzi);
                        i = zzE8 + zzD + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 48:
                    zzi = zzgmv.zzt((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzD = zzgjx.zzD(i4);
                        zzE8 = zzgjx.zzE(zzi);
                        i = zzE8 + zzD + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 49:
                    zzo = zzgmv.zzj(i4, (List) zzgnu.zzh(obj, j), zzF(i3));
                    break;
                case 50:
                    zzglv.zza(i4, zzgnu.zzh(obj, j), zzH(i3));
                    continue;
                case 51:
                    if (zzT(obj, i4, i3)) {
                        zzE = zzgjx.zzE(i4 << 3);
                        zzo = zzE + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (zzT(obj, i4, i3)) {
                        zzE2 = zzgjx.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (zzT(obj, i4, i3)) {
                        long zzD2 = zzD(obj, j);
                        zzE3 = zzgjx.zzE(i4 << 3);
                        zzF = zzgjx.zzF(zzD2);
                        zzo = zzF + zzE3;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (zzT(obj, i4, i3)) {
                        long zzD3 = zzD(obj, j);
                        zzE3 = zzgjx.zzE(i4 << 3);
                        zzF = zzgjx.zzF(zzD3);
                        zzo = zzF + zzE3;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (zzT(obj, i4, i3)) {
                        int zzs = zzs(obj, j);
                        zzE4 = zzgjx.zzE(i4 << 3);
                        zzy = zzgjx.zzy(zzs);
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (zzT(obj, i4, i3)) {
                        zzE = zzgjx.zzE(i4 << 3);
                        zzo = zzE + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (zzT(obj, i4, i3)) {
                        zzE2 = zzgjx.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (zzT(obj, i4, i3)) {
                        zzE5 = zzgjx.zzE(i4 << 3);
                        zzo = zzE5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (zzT(obj, i4, i3)) {
                        Object zzh2 = zzgnu.zzh(obj, j);
                        if (zzh2 instanceof zzgji) {
                            zzE6 = zzgjx.zzE(i4 << 3);
                            zzd = ((zzgji) zzh2).zzd();
                            zzE7 = zzgjx.zzE(zzd);
                            i = zzE7 + zzd + zzE6;
                            i2 += i;
                        } else {
                            zzE4 = zzgjx.zzE(i4 << 3);
                            zzy = zzgjx.zzC((String) zzh2);
                            zzo = zzy + zzE4;
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (zzT(obj, i4, i3)) {
                        zzo = zzgmv.zzo(i4, zzgnu.zzh(obj, j), zzF(i3));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (zzT(obj, i4, i3)) {
                        zzE6 = zzgjx.zzE(i4 << 3);
                        zzd = ((zzgji) zzgnu.zzh(obj, j)).zzd();
                        zzE7 = zzgjx.zzE(zzd);
                        i = zzE7 + zzd + zzE6;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 62:
                    if (zzT(obj, i4, i3)) {
                        int zzs2 = zzs(obj, j);
                        zzE4 = zzgjx.zzE(i4 << 3);
                        zzy = zzgjx.zzE(zzs2);
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (zzT(obj, i4, i3)) {
                        int zzs3 = zzs(obj, j);
                        zzE4 = zzgjx.zzE(i4 << 3);
                        zzy = zzgjx.zzy(zzs3);
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (zzT(obj, i4, i3)) {
                        zzE2 = zzgjx.zzE(i4 << 3);
                        zzo = zzE2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (zzT(obj, i4, i3)) {
                        zzE = zzgjx.zzE(i4 << 3);
                        zzo = zzE + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (zzT(obj, i4, i3)) {
                        int zzs4 = zzs(obj, j);
                        zzE4 = zzgjx.zzE(i4 << 3);
                        zzy = zzgjx.zzE((zzs4 >> 31) ^ (zzs4 + zzs4));
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (zzT(obj, i4, i3)) {
                        long zzD4 = zzD(obj, j);
                        zzE4 = zzgjx.zzE(i4 << 3);
                        zzy = zzgjx.zzF((zzD4 >> 63) ^ (zzD4 + zzD4));
                        zzo = zzy + zzE4;
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (zzT(obj, i4, i3)) {
                        zzo = zzgjx.zzx(i4, (zzgma) zzgnu.zzh(obj, j), zzF(i3));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i2 += zzo;
        }
        zzgnk zzgnkVar = this.zzo;
        return zzgnkVar.zza(zzgnkVar.zzd(obj)) + i2;
    }

    private static int zzs(Object obj, long j) {
        return ((Integer) zzgnu.zzh(obj, j)).intValue();
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzgiu zzgiuVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i3);
        Object object = unsafe.getObject(obj, j);
        if (zzglv.zzb(object)) {
            zzglu zzb2 = zzglu.zza().zzb();
            zzglv.zzc(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzglt zzgltVar = (zzglt) zzH;
        throw null;
    }

    private final int zzu(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzgiu zzgiuVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzgiv.zzn(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzgiv.zzb(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzgiv.zzm(bArr, i, zzgiuVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzgiuVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzgiv.zzj(bArr, i, zzgiuVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzgiuVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzgiv.zzn(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzgiv.zzb(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzgiv.zzm(bArr, i, zzgiuVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzgiuVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzgiv.zzj(bArr, i, zzgiuVar);
                    int i9 = zzgiuVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzgnz.zzj(bArr, zzj2, zzj2 + i9)) {
                        throw zzglc.zzd();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i9, zzgla.zzb));
                        zzj2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int zzd = zzgiv.zzd(zzF(i8), bArr, i, i2, zzgiuVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzgiuVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzgla.zzg(object, zzgiuVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzd;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzgiv.zza(bArr, i, zzgiuVar);
                    unsafe.putObject(obj, j, zzgiuVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzgiv.zzj(bArr, i, zzgiuVar);
                    int i10 = zzgiuVar.zza;
                    zzgku zzE = zzE(i8);
                    if (zzE != null && !zzE.zza(i10)) {
                        zzd(obj).zzh(i3, Long.valueOf(i10));
                    } else {
                        unsafe.putObject(obj, j, Integer.valueOf(i10));
                        unsafe.putInt(obj, j2, i4);
                    }
                    return zzj3;
                }
                break;
            case 66:
                if (i5 == 0) {
                    int zzj4 = zzgiv.zzj(bArr, i, zzgiuVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzgjq.zzF(zzgiuVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzgiv.zzm(bArr, i, zzgiuVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzgjq.zzG(zzgiuVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int zzc = zzgiv.zzc(zzF(i8), bArr, i, i2, (i3 & (-8)) | 4, zzgiuVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, zzgiuVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzgla.zzg(object2, zzgiuVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzc;
                }
                break;
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x02e7, code lost:
        if (r0 != r5) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02e9, code lost:
        r15 = r30;
        r14 = r31;
        r12 = r32;
        r13 = r34;
        r11 = r35;
        r1 = r20;
        r2 = r23;
        r6 = r26;
        r7 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02fd, code lost:
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x032e, code lost:
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0351, code lost:
        if (r0 != r15) goto L106;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v9, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzv(Object obj, byte[] bArr, int i, int i2, zzgiu zzgiuVar) throws IOException {
        byte b;
        int i3;
        int zzx;
        int i4;
        int i5;
        int i6;
        int i7;
        Unsafe unsafe;
        int i8;
        int i9;
        int i10;
        Unsafe unsafe2;
        int i11;
        int i12;
        int i13;
        Unsafe unsafe3;
        Unsafe unsafe4;
        zzgmd<T> zzgmdVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i14 = i2;
        zzgiu zzgiuVar2 = zzgiuVar;
        Unsafe unsafe5 = zzb;
        int i15 = -1;
        int i16 = 1048575;
        int i17 = i;
        int i18 = -1;
        int i19 = 0;
        int i20 = 0;
        int i21 = 1048575;
        while (i17 < i14) {
            int i22 = i17 + 1;
            byte b2 = bArr2[i17];
            if (b2 < 0) {
                i3 = zzgiv.zzk(b2, bArr2, i22, zzgiuVar2);
                b = zzgiuVar2.zza;
            } else {
                b = b2;
                i3 = i22;
            }
            int i23 = b >>> 3;
            int i24 = b & 7;
            if (i23 > i18) {
                zzx = zzgmdVar.zzy(i23, i19 / 3);
            } else {
                zzx = zzgmdVar.zzx(i23);
            }
            int i25 = zzx;
            if (i25 == i15) {
                i9 = i3;
                i4 = i23;
                unsafe = unsafe5;
                i5 = 0;
            } else {
                int[] iArr = zzgmdVar.zzc;
                int i26 = iArr[i25 + 1];
                int zzB = zzB(i26);
                Unsafe unsafe6 = unsafe5;
                long j = i26 & i16;
                if (zzB <= 17) {
                    int i27 = iArr[i25 + 2];
                    int i28 = 1 << (i27 >>> 20);
                    int i29 = i27 & 1048575;
                    if (i29 != i21) {
                        i10 = i25;
                        if (i21 != 1048575) {
                            long j2 = i21;
                            unsafe4 = unsafe6;
                            unsafe4.putInt(obj2, j2, i20);
                        } else {
                            unsafe4 = unsafe6;
                        }
                        if (i29 != 1048575) {
                            i20 = unsafe4.getInt(obj2, i29);
                        }
                        unsafe2 = unsafe4;
                        i21 = i29;
                    } else {
                        i10 = i25;
                        unsafe2 = unsafe6;
                    }
                    switch (zzB) {
                        case 0:
                            i11 = i3;
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 1) {
                                zzgnu.zzr(obj2, j, Double.longBitsToDouble(zzgiv.zzn(bArr2, i11)));
                                i17 = i11 + 8;
                                i20 |= i28;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 1:
                            i11 = i3;
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 5) {
                                zzgnu.zzs(obj2, j, Float.intBitsToFloat(zzgiv.zzb(bArr2, i11)));
                                i17 = i11 + 4;
                                i20 |= i28;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 2:
                        case 3:
                            i11 = i3;
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 0) {
                                int zzm = zzgiv.zzm(bArr2, i11, zzgiuVar2);
                                unsafe3.putLong(obj, j, zzgiuVar2.zzb);
                                i20 |= i28;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i17 = zzm;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 4:
                        case 11:
                            i11 = i3;
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 0) {
                                i17 = zzgiv.zzj(bArr2, i11, zzgiuVar2);
                                unsafe3.putInt(obj2, j, zzgiuVar2.zza);
                                i20 |= i28;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 5:
                        case 14:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 1) {
                                unsafe3.putLong(obj, j, zzgiv.zzn(bArr2, i3));
                                i17 = i3 + 8;
                                i20 |= i28;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 6:
                        case 13:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 5) {
                                unsafe3.putInt(obj2, j, zzgiv.zzb(bArr2, i3));
                                i17 = i3 + 4;
                                i20 |= i28;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 7:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 0) {
                                i17 = zzgiv.zzm(bArr2, i3, zzgiuVar2);
                                zzgnu.zzp(obj2, j, zzgiuVar2.zzb != 0);
                                i20 |= i28;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 8:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 2) {
                                if ((i26 & 536870912) == 0) {
                                    i17 = zzgiv.zzg(bArr2, i3, zzgiuVar2);
                                } else {
                                    i17 = zzgiv.zzh(bArr2, i3, zzgiuVar2);
                                }
                                unsafe3.putObject(obj2, j, zzgiuVar2.zzc);
                                i20 |= i28;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 9:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 2) {
                                i17 = zzgiv.zzd(zzgmdVar.zzF(i13), bArr2, i3, i14, zzgiuVar2);
                                Object object = unsafe3.getObject(obj2, j);
                                if (object == null) {
                                    unsafe3.putObject(obj2, j, zzgiuVar2.zzc);
                                } else {
                                    unsafe3.putObject(obj2, j, zzgla.zzg(object, zzgiuVar2.zzc));
                                }
                                i20 |= i28;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 10:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 2) {
                                i17 = zzgiv.zza(bArr2, i3, zzgiuVar2);
                                unsafe3.putObject(obj2, j, zzgiuVar2.zzc);
                                i20 |= i28;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 12:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 0) {
                                i17 = zzgiv.zzj(bArr2, i3, zzgiuVar2);
                                unsafe3.putInt(obj2, j, zzgiuVar2.zza);
                                i20 |= i28;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 15:
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 0) {
                                i17 = zzgiv.zzj(bArr2, i3, zzgiuVar2);
                                unsafe3.putInt(obj2, j, zzgjq.zzF(zzgiuVar2.zza));
                                i20 |= i28;
                                unsafe5 = unsafe3;
                                i19 = i13;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                            i11 = i3;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                        case 16:
                            if (i24 != 0) {
                                i12 = i21;
                                int i30 = i10;
                                i4 = i23;
                                unsafe3 = unsafe2;
                                i11 = i3;
                                i13 = i30;
                                i9 = i11;
                                unsafe = unsafe3;
                                i5 = i13;
                                i21 = i12;
                                break;
                            } else {
                                int zzm2 = zzgiv.zzm(bArr2, i3, zzgiuVar2);
                                i12 = i21;
                                int i31 = i10;
                                i4 = i23;
                                unsafe2.putLong(obj, j, zzgjq.zzG(zzgiuVar2.zzb));
                                i20 |= i28;
                                unsafe5 = unsafe2;
                                i19 = i31;
                                i17 = zzm2;
                                i21 = i12;
                                i18 = i4;
                                break;
                            }
                        default:
                            i11 = i3;
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            i9 = i11;
                            unsafe = unsafe3;
                            i5 = i13;
                            i21 = i12;
                            break;
                    }
                    i16 = 1048575;
                    i15 = -1;
                } else {
                    i4 = i23;
                    int i32 = i3;
                    int i33 = i21;
                    if (zzB != 27) {
                        i5 = i25;
                        if (zzB <= 49) {
                            i7 = i20;
                            i8 = i33;
                            unsafe = unsafe6;
                            i17 = zzw(obj, bArr, i32, i2, b, i4, i24, i5, i26, zzB, j, zzgiuVar);
                        } else {
                            i6 = i32;
                            i7 = i20;
                            unsafe = unsafe6;
                            i8 = i33;
                            if (zzB != 50) {
                                i17 = zzu(obj, bArr, i6, i2, b, i4, i24, i26, zzB, j, i5, zzgiuVar);
                            } else if (i24 == 2) {
                                i17 = zzt(obj, bArr, i6, i2, i5, j, zzgiuVar);
                            }
                        }
                    } else if (i24 == 2) {
                        zzgkz zzgkzVar = (zzgkz) unsafe6.getObject(obj2, j);
                        if (!zzgkzVar.zzc()) {
                            int size = zzgkzVar.size();
                            zzgkzVar = zzgkzVar.zzd(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj2, j, zzgkzVar);
                        }
                        i17 = zzgiv.zze(zzgmdVar.zzF(i25), b, bArr, i32, i2, zzgkzVar, zzgiuVar);
                        unsafe5 = unsafe6;
                        i20 = i20;
                        i21 = i33;
                        i18 = i4;
                        i19 = i25;
                        i16 = 1048575;
                        i15 = -1;
                    } else {
                        i5 = i25;
                        i6 = i32;
                        i7 = i20;
                        unsafe = unsafe6;
                        i8 = i33;
                    }
                    i9 = i6;
                    i20 = i7;
                    i21 = i8;
                }
                unsafe5 = unsafe;
                i16 = 1048575;
                i15 = -1;
            }
            i17 = zzgiv.zzi(b, bArr, i9, i2, zzd(obj), zzgiuVar);
            zzgmdVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i14 = i2;
            zzgiuVar2 = zzgiuVar;
            i18 = i4;
            i19 = i5;
            unsafe5 = unsafe;
            i16 = 1048575;
            i15 = -1;
        }
        int i34 = i20;
        Unsafe unsafe7 = unsafe5;
        if (i21 != 1048575) {
            unsafe7.putInt(obj, i21, i34);
        }
        if (i17 == i2) {
            return i17;
        }
        throw zzglc.zzg();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0152  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x021a -> B:120:0x021b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x014f -> B:67:0x0150). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01cc -> B:100:0x01cd). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzw(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzgiu zzgiuVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int zzj;
        int i12;
        int i13 = i;
        Unsafe unsafe = zzb;
        zzgkz zzgkzVar = (zzgkz) unsafe.getObject(obj, j2);
        if (!zzgkzVar.zzc()) {
            int size = zzgkzVar.size();
            zzgkzVar = zzgkzVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzgkzVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzgjz zzgjzVar = (zzgjz) zzgkzVar;
                    int zzj2 = zzgiv.zzj(bArr, i13, zzgiuVar);
                    int i14 = zzgiuVar.zza + zzj2;
                    while (zzj2 < i14) {
                        zzgjzVar.zze(Double.longBitsToDouble(zzgiv.zzn(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i14) {
                        return zzj2;
                    }
                    throw zzglc.zzj();
                }
                if (i5 == 1) {
                    zzgjz zzgjzVar2 = (zzgjz) zzgkzVar;
                    zzgjzVar2.zze(Double.longBitsToDouble(zzgiv.zzn(bArr, i)));
                    while (true) {
                        i8 = i13 + 8;
                        if (i8 < i2) {
                            i13 = zzgiv.zzj(bArr, i8, zzgiuVar);
                            if (i3 == zzgiuVar.zza) {
                                zzgjzVar2.zze(Double.longBitsToDouble(zzgiv.zzn(bArr, i13)));
                            }
                        }
                    }
                    return i8;
                }
                return i13;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzgkj zzgkjVar = (zzgkj) zzgkzVar;
                    int zzj3 = zzgiv.zzj(bArr, i13, zzgiuVar);
                    int i15 = zzgiuVar.zza + zzj3;
                    while (zzj3 < i15) {
                        zzgkjVar.zze(Float.intBitsToFloat(zzgiv.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i15) {
                        return zzj3;
                    }
                    throw zzglc.zzj();
                }
                if (i5 == 5) {
                    zzgkj zzgkjVar2 = (zzgkj) zzgkzVar;
                    zzgkjVar2.zze(Float.intBitsToFloat(zzgiv.zzb(bArr, i)));
                    while (true) {
                        i9 = i13 + 4;
                        if (i9 < i2) {
                            i13 = zzgiv.zzj(bArr, i9, zzgiuVar);
                            if (i3 == zzgiuVar.zza) {
                                zzgkjVar2.zze(Float.intBitsToFloat(zzgiv.zzb(bArr, i13)));
                            }
                        }
                    }
                    return i9;
                }
                return i13;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzglp zzglpVar = (zzglp) zzgkzVar;
                    int zzj4 = zzgiv.zzj(bArr, i13, zzgiuVar);
                    int i16 = zzgiuVar.zza + zzj4;
                    while (zzj4 < i16) {
                        zzj4 = zzgiv.zzm(bArr, zzj4, zzgiuVar);
                        zzglpVar.zzg(zzgiuVar.zzb);
                    }
                    if (zzj4 == i16) {
                        return zzj4;
                    }
                    throw zzglc.zzj();
                }
                if (i5 == 0) {
                    zzglp zzglpVar2 = (zzglp) zzgkzVar;
                    int zzm = zzgiv.zzm(bArr, i13, zzgiuVar);
                    zzglpVar2.zzg(zzgiuVar.zzb);
                    while (zzm < i2) {
                        int zzj5 = zzgiv.zzj(bArr, zzm, zzgiuVar);
                        if (i3 != zzgiuVar.zza) {
                            return zzm;
                        }
                        zzm = zzgiv.zzm(bArr, zzj5, zzgiuVar);
                        zzglpVar2.zzg(zzgiuVar.zzb);
                    }
                    return zzm;
                }
                return i13;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzgiv.zzf(bArr, i13, zzgkzVar, zzgiuVar);
                }
                if (i5 == 0) {
                    return zzgiv.zzl(i3, bArr, i, i2, zzgkzVar, zzgiuVar);
                }
                return i13;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzglp zzglpVar3 = (zzglp) zzgkzVar;
                    int zzj6 = zzgiv.zzj(bArr, i13, zzgiuVar);
                    int i17 = zzgiuVar.zza + zzj6;
                    while (zzj6 < i17) {
                        zzglpVar3.zzg(zzgiv.zzn(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i17) {
                        return zzj6;
                    }
                    throw zzglc.zzj();
                }
                if (i5 == 1) {
                    zzglp zzglpVar4 = (zzglp) zzgkzVar;
                    zzglpVar4.zzg(zzgiv.zzn(bArr, i));
                    while (true) {
                        i10 = i13 + 8;
                        if (i10 < i2) {
                            i13 = zzgiv.zzj(bArr, i10, zzgiuVar);
                            if (i3 == zzgiuVar.zza) {
                                zzglpVar4.zzg(zzgiv.zzn(bArr, i13));
                            }
                        }
                    }
                    return i10;
                }
                return i13;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzgkr zzgkrVar = (zzgkr) zzgkzVar;
                    int zzj7 = zzgiv.zzj(bArr, i13, zzgiuVar);
                    int i18 = zzgiuVar.zza + zzj7;
                    while (zzj7 < i18) {
                        zzgkrVar.zzh(zzgiv.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i18) {
                        return zzj7;
                    }
                    throw zzglc.zzj();
                }
                if (i5 == 5) {
                    zzgkr zzgkrVar2 = (zzgkr) zzgkzVar;
                    zzgkrVar2.zzh(zzgiv.zzb(bArr, i));
                    while (true) {
                        i11 = i13 + 4;
                        if (i11 < i2) {
                            i13 = zzgiv.zzj(bArr, i11, zzgiuVar);
                            if (i3 == zzgiuVar.zza) {
                                zzgkrVar2.zzh(zzgiv.zzb(bArr, i13));
                            }
                        }
                    }
                    return i11;
                }
                return i13;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzgiw zzgiwVar = (zzgiw) zzgkzVar;
                    zzj = zzgiv.zzj(bArr, i13, zzgiuVar);
                    int i19 = zzgiuVar.zza + zzj;
                    while (zzj < i19) {
                        zzj = zzgiv.zzm(bArr, zzj, zzgiuVar);
                        zzgiwVar.zze(zzgiuVar.zzb != 0);
                    }
                    if (zzj != i19) {
                        throw zzglc.zzj();
                    }
                    return zzj;
                }
                if (i5 == 0) {
                    zzgiw zzgiwVar2 = (zzgiw) zzgkzVar;
                    int zzm2 = zzgiv.zzm(bArr, i13, zzgiuVar);
                    zzgiwVar2.zze(zzgiuVar.zzb != 0);
                    while (zzm2 < i2) {
                        int zzj8 = zzgiv.zzj(bArr, zzm2, zzgiuVar);
                        if (i3 != zzgiuVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzgiv.zzm(bArr, zzj8, zzgiuVar);
                        zzgiwVar2.zze(zzgiuVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i13;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        i13 = zzgiv.zzj(bArr, i13, zzgiuVar);
                        int i20 = zzgiuVar.zza;
                        if (i20 < 0) {
                            throw zzglc.zzf();
                        }
                        if (i20 == 0) {
                            zzgkzVar.add("");
                            while (i13 < i2) {
                                int zzj9 = zzgiv.zzj(bArr, i13, zzgiuVar);
                                if (i3 == zzgiuVar.zza) {
                                    i13 = zzgiv.zzj(bArr, zzj9, zzgiuVar);
                                    i20 = zzgiuVar.zza;
                                    if (i20 < 0) {
                                        throw zzglc.zzf();
                                    }
                                    if (i20 == 0) {
                                        zzgkzVar.add("");
                                    } else {
                                        zzgkzVar.add(new String(bArr, i13, i20, zzgla.zzb));
                                        i13 += i20;
                                        while (i13 < i2) {
                                        }
                                    }
                                }
                            }
                        } else {
                            zzgkzVar.add(new String(bArr, i13, i20, zzgla.zzb));
                            i13 += i20;
                            while (i13 < i2) {
                            }
                        }
                    } else {
                        i13 = zzgiv.zzj(bArr, i13, zzgiuVar);
                        int i21 = zzgiuVar.zza;
                        if (i21 < 0) {
                            throw zzglc.zzf();
                        }
                        if (i21 == 0) {
                            zzgkzVar.add("");
                            while (i13 < i2) {
                                int zzj10 = zzgiv.zzj(bArr, i13, zzgiuVar);
                                if (i3 == zzgiuVar.zza) {
                                    i13 = zzgiv.zzj(bArr, zzj10, zzgiuVar);
                                    int i22 = zzgiuVar.zza;
                                    if (i22 < 0) {
                                        throw zzglc.zzf();
                                    }
                                    if (i22 == 0) {
                                        zzgkzVar.add("");
                                    } else {
                                        i12 = i13 + i22;
                                        if (zzgnz.zzj(bArr, i13, i12)) {
                                            zzgkzVar.add(new String(bArr, i13, i22, zzgla.zzb));
                                            i13 = i12;
                                            while (i13 < i2) {
                                            }
                                        } else {
                                            throw zzglc.zzd();
                                        }
                                    }
                                }
                            }
                        } else {
                            i12 = i13 + i21;
                            if (zzgnz.zzj(bArr, i13, i12)) {
                                zzgkzVar.add(new String(bArr, i13, i21, zzgla.zzb));
                                i13 = i12;
                                while (i13 < i2) {
                                }
                            } else {
                                throw zzglc.zzd();
                            }
                        }
                    }
                }
                return i13;
            case 27:
                if (i5 == 2) {
                    return zzgiv.zze(zzF(i6), i3, bArr, i, i2, zzgkzVar, zzgiuVar);
                }
                return i13;
            case 28:
                if (i5 == 2) {
                    int zzj11 = zzgiv.zzj(bArr, i13, zzgiuVar);
                    int i23 = zzgiuVar.zza;
                    if (i23 >= 0) {
                        if (i23 <= bArr.length - zzj11) {
                            if (i23 == 0) {
                                zzgkzVar.add(zzgji.zzb);
                                while (zzj11 < i2) {
                                    int zzj12 = zzgiv.zzj(bArr, zzj11, zzgiuVar);
                                    if (i3 != zzgiuVar.zza) {
                                        return zzj11;
                                    }
                                    zzj11 = zzgiv.zzj(bArr, zzj12, zzgiuVar);
                                    i23 = zzgiuVar.zza;
                                    if (i23 >= 0) {
                                        if (i23 > bArr.length - zzj11) {
                                            throw zzglc.zzj();
                                        }
                                        if (i23 == 0) {
                                            zzgkzVar.add(zzgji.zzb);
                                        } else {
                                            zzgkzVar.add(zzgji.zzw(bArr, zzj11, i23));
                                            zzj11 += i23;
                                            while (zzj11 < i2) {
                                            }
                                        }
                                    } else {
                                        throw zzglc.zzf();
                                    }
                                }
                                return zzj11;
                            }
                            zzgkzVar.add(zzgji.zzw(bArr, zzj11, i23));
                            zzj11 += i23;
                            while (zzj11 < i2) {
                            }
                            return zzj11;
                        }
                        throw zzglc.zzj();
                    }
                    throw zzglc.zzf();
                }
                return i13;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zzj = zzgiv.zzl(i3, bArr, i, i2, zzgkzVar, zzgiuVar);
                    }
                    return i13;
                }
                zzj = zzgiv.zzf(bArr, i13, zzgkzVar, zzgiuVar);
                zzgkq zzgkqVar = (zzgkq) obj;
                zzgnl zzgnlVar = zzgkqVar.zzc;
                if (zzgnlVar == zzgnl.zzc()) {
                    zzgnlVar = null;
                }
                Object zzC = zzgmv.zzC(i4, zzgkzVar, zzE(i6), zzgnlVar, this.zzo);
                if (zzC != null) {
                    zzgkqVar.zzc = (zzgnl) zzC;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzgkr zzgkrVar3 = (zzgkr) zzgkzVar;
                    int zzj13 = zzgiv.zzj(bArr, i13, zzgiuVar);
                    int i24 = zzgiuVar.zza + zzj13;
                    while (zzj13 < i24) {
                        zzj13 = zzgiv.zzj(bArr, zzj13, zzgiuVar);
                        zzgkrVar3.zzh(zzgjq.zzF(zzgiuVar.zza));
                    }
                    if (zzj13 == i24) {
                        return zzj13;
                    }
                    throw zzglc.zzj();
                }
                if (i5 == 0) {
                    zzgkr zzgkrVar4 = (zzgkr) zzgkzVar;
                    int zzj14 = zzgiv.zzj(bArr, i13, zzgiuVar);
                    zzgkrVar4.zzh(zzgjq.zzF(zzgiuVar.zza));
                    while (zzj14 < i2) {
                        int zzj15 = zzgiv.zzj(bArr, zzj14, zzgiuVar);
                        if (i3 != zzgiuVar.zza) {
                            return zzj14;
                        }
                        zzj14 = zzgiv.zzj(bArr, zzj15, zzgiuVar);
                        zzgkrVar4.zzh(zzgjq.zzF(zzgiuVar.zza));
                    }
                    return zzj14;
                }
                return i13;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzglp zzglpVar5 = (zzglp) zzgkzVar;
                    int zzj16 = zzgiv.zzj(bArr, i13, zzgiuVar);
                    int i25 = zzgiuVar.zza + zzj16;
                    while (zzj16 < i25) {
                        zzj16 = zzgiv.zzm(bArr, zzj16, zzgiuVar);
                        zzglpVar5.zzg(zzgjq.zzG(zzgiuVar.zzb));
                    }
                    if (zzj16 == i25) {
                        return zzj16;
                    }
                    throw zzglc.zzj();
                }
                if (i5 == 0) {
                    zzglp zzglpVar6 = (zzglp) zzgkzVar;
                    int zzm3 = zzgiv.zzm(bArr, i13, zzgiuVar);
                    zzglpVar6.zzg(zzgjq.zzG(zzgiuVar.zzb));
                    while (zzm3 < i2) {
                        int zzj17 = zzgiv.zzj(bArr, zzm3, zzgiuVar);
                        if (i3 != zzgiuVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzgiv.zzm(bArr, zzj17, zzgiuVar);
                        zzglpVar6.zzg(zzgjq.zzG(zzgiuVar.zzb));
                    }
                    return zzm3;
                }
                return i13;
            default:
                if (i5 == 3) {
                    zzgmt zzF = zzF(i6);
                    int i26 = (i3 & (-8)) | 4;
                    int zzc = zzgiv.zzc(zzF, bArr, i, i2, i26, zzgiuVar);
                    zzgkzVar.add(zzgiuVar.zzc);
                    while (zzc < i2) {
                        int zzj18 = zzgiv.zzj(bArr, zzc, zzgiuVar);
                        if (i3 != zzgiuVar.zza) {
                            return zzc;
                        }
                        zzc = zzgiv.zzc(zzF, bArr, zzj18, i2, i26, zzgiuVar);
                        zzgkzVar.add(zzgiuVar.zzc);
                    }
                    return zzc;
                }
                return i13;
        }
    }

    private final int zzx(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzA(i, 0);
    }

    private final int zzy(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzA(i, i2);
    }

    private final int zzz(int i) {
        return this.zzc[i + 2];
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final int zza(Object obj) {
        return this.zzj ? zzr(obj) : zzq(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final int zzb(Object obj) {
        int i;
        int zzc;
        int i2;
        int zzs;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzC = zzC(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & zzC;
            int i6 = 37;
            switch (zzB(zzC)) {
                case 0:
                    i = i3 * 53;
                    zzc = zzgla.zzc(Double.doubleToLongBits(zzgnu.zzb(obj, j)));
                    i3 = zzc + i;
                    break;
                case 1:
                    i = i3 * 53;
                    zzc = Float.floatToIntBits(zzgnu.zzc(obj, j));
                    i3 = zzc + i;
                    break;
                case 2:
                    i = i3 * 53;
                    zzc = zzgla.zzc(zzgnu.zzf(obj, j));
                    i3 = zzc + i;
                    break;
                case 3:
                    i = i3 * 53;
                    zzc = zzgla.zzc(zzgnu.zzf(obj, j));
                    i3 = zzc + i;
                    break;
                case 4:
                    i = i3 * 53;
                    zzc = zzgnu.zzd(obj, j);
                    i3 = zzc + i;
                    break;
                case 5:
                    i = i3 * 53;
                    zzc = zzgla.zzc(zzgnu.zzf(obj, j));
                    i3 = zzc + i;
                    break;
                case 6:
                    i = i3 * 53;
                    zzc = zzgnu.zzd(obj, j);
                    i3 = zzc + i;
                    break;
                case 7:
                    i = i3 * 53;
                    zzc = zzgla.zza(zzgnu.zzz(obj, j));
                    i3 = zzc + i;
                    break;
                case 8:
                    i = i3 * 53;
                    zzc = ((String) zzgnu.zzh(obj, j)).hashCode();
                    i3 = zzc + i;
                    break;
                case 9:
                    Object zzh = zzgnu.zzh(obj, j);
                    if (zzh != null) {
                        i6 = zzh.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i = i3 * 53;
                    zzc = zzgnu.zzh(obj, j).hashCode();
                    i3 = zzc + i;
                    break;
                case 11:
                    i = i3 * 53;
                    zzc = zzgnu.zzd(obj, j);
                    i3 = zzc + i;
                    break;
                case 12:
                    i = i3 * 53;
                    zzc = zzgnu.zzd(obj, j);
                    i3 = zzc + i;
                    break;
                case 13:
                    i = i3 * 53;
                    zzc = zzgnu.zzd(obj, j);
                    i3 = zzc + i;
                    break;
                case 14:
                    i = i3 * 53;
                    zzc = zzgla.zzc(zzgnu.zzf(obj, j));
                    i3 = zzc + i;
                    break;
                case 15:
                    i = i3 * 53;
                    zzc = zzgnu.zzd(obj, j);
                    i3 = zzc + i;
                    break;
                case 16:
                    i = i3 * 53;
                    zzc = zzgla.zzc(zzgnu.zzf(obj, j));
                    i3 = zzc + i;
                    break;
                case 17:
                    Object zzh2 = zzgnu.zzh(obj, j);
                    if (zzh2 != null) {
                        i6 = zzh2.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = i3 * 53;
                    zzc = zzgnu.zzh(obj, j).hashCode();
                    i3 = zzc + i;
                    break;
                case 50:
                    i = i3 * 53;
                    zzc = zzgnu.zzh(obj, j).hashCode();
                    i3 = zzc + i;
                    break;
                case 51:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzgla.zzc(Double.doubleToLongBits(zzo(obj, j)));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = Float.floatToIntBits(zzp(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzgla.zzc(zzD(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzgla.zzc(zzD(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzs = zzs(obj, j);
                        i3 = i2 + zzs;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzgla.zzc(zzD(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzs = zzs(obj, j);
                        i3 = i2 + zzs;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzgla.zza(zzU(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = ((String) zzgnu.zzh(obj, j)).hashCode();
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzgnu.zzh(obj, j).hashCode();
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzgnu.zzh(obj, j).hashCode();
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzs = zzs(obj, j);
                        i3 = i2 + zzs;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzs = zzs(obj, j);
                        i3 = i2 + zzs;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzs = zzs(obj, j);
                        i3 = i2 + zzs;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzgla.zzc(zzD(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzT(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzs = zzs(obj, j);
                        i3 = i2 + zzs;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzgla.zzc(zzD(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzT(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzgnu.zzh(obj, j).hashCode();
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzo.zzd(obj).hashCode() + (i3 * 53);
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return hashCode;
    }

    public final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzgiu zzgiuVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        zzgmd<T> zzgmdVar;
        Object obj3;
        int i5;
        int i6;
        int i7;
        int zzx;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Object obj4;
        zzgiu zzgiuVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int zzm;
        int i20;
        int i21;
        int i22;
        int i23;
        zzgmd<T> zzgmdVar2 = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i24 = i2;
        int i25 = i3;
        zzgiu zzgiuVar3 = zzgiuVar;
        Unsafe unsafe2 = zzb;
        int i26 = i;
        int i27 = 0;
        int i28 = -1;
        int i29 = 0;
        int i30 = 0;
        int i31 = 1048575;
        while (true) {
            if (i26 < i24) {
                int i32 = i26 + 1;
                byte b = bArr2[i26];
                if (b < 0) {
                    i7 = zzgiv.zzk(b, bArr2, i32, zzgiuVar3);
                    i6 = zzgiuVar3.zza;
                } else {
                    i6 = b;
                    i7 = i32;
                }
                int i33 = i6 >>> 3;
                int i34 = i6 & 7;
                if (i33 > i28) {
                    zzx = zzgmdVar2.zzy(i33, i29 / 3);
                } else {
                    zzx = zzgmdVar2.zzx(i33);
                }
                if (zzx == -1) {
                    i8 = i7;
                    i9 = i6;
                    i10 = i30;
                    i11 = i33;
                    unsafe = unsafe2;
                    i4 = i25;
                    i12 = 0;
                } else {
                    int[] iArr = zzgmdVar2.zzc;
                    int i35 = iArr[zzx + 1];
                    int zzB = zzB(i35);
                    int i36 = i6;
                    int i37 = i7;
                    long j = i35 & 1048575;
                    if (zzB <= 17) {
                        int i38 = iArr[zzx + 2];
                        int i39 = 1 << (i38 >>> 20);
                        int i40 = i38 & 1048575;
                        if (i40 != i31) {
                            i14 = zzx;
                            if (i31 != 1048575) {
                                unsafe2.putInt(obj5, i31, i30);
                            }
                            i30 = unsafe2.getInt(obj5, i40);
                            i15 = i40;
                        } else {
                            i14 = zzx;
                            i15 = i31;
                        }
                        int i41 = i30;
                        switch (zzB) {
                            case 0:
                                i16 = i36;
                                i17 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 1) {
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    zzgnu.zzr(obj5, j, Double.longBitsToDouble(zzgiv.zzn(bArr2, i17)));
                                    i26 = i17 + 8;
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 1:
                                i16 = i36;
                                i17 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 5) {
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    zzgnu.zzs(obj5, j, Float.intBitsToFloat(zzgiv.zzb(bArr2, i17)));
                                    i26 = i17 + 4;
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 2:
                            case 3:
                                i16 = i36;
                                i17 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 0) {
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    zzm = zzgiv.zzm(bArr2, i17, zzgiuVar3);
                                    unsafe2.putLong(obj, j, zzgiuVar3.zzb);
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i26 = zzm;
                                    i27 = i16;
                                    i28 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 4:
                            case 11:
                                i16 = i36;
                                i17 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 0) {
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zzgiv.zzj(bArr2, i17, zzgiuVar3);
                                    unsafe2.putInt(obj5, j, zzgiuVar3.zza);
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 5:
                            case 14:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 1) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, j, zzgiv.zzn(bArr2, i20));
                                    i26 = i20 + 8;
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 6:
                            case 13:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 5) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    unsafe2.putInt(obj5, j, zzgiv.zzb(bArr2, i20));
                                    i26 = i20 + 4;
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 7:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 0) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zzgiv.zzm(bArr2, i20, zzgiuVar3);
                                    zzgnu.zzp(obj5, j, zzgiuVar3.zzb != 0);
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 8:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 2) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    if ((536870912 & i35) == 0) {
                                        i26 = zzgiv.zzg(bArr2, i20, zzgiuVar3);
                                    } else {
                                        i26 = zzgiv.zzh(bArr2, i20, zzgiuVar3);
                                    }
                                    unsafe2.putObject(obj5, j, zzgiuVar3.zzc);
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 9:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 2) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zzgiv.zzd(zzgmdVar2.zzF(i19), bArr2, i20, i24, zzgiuVar3);
                                    if ((i41 & i39) == 0) {
                                        unsafe2.putObject(obj5, j, zzgiuVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j, zzgla.zzg(unsafe2.getObject(obj5, j), zzgiuVar3.zzc));
                                    }
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 10:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 2) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zzgiv.zza(bArr2, i20, zzgiuVar3);
                                    unsafe2.putObject(obj5, j, zzgiuVar3.zzc);
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 12:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 0) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zzgiv.zzj(bArr2, i20, zzgiuVar3);
                                    int i42 = zzgiuVar3.zza;
                                    zzgku zzE = zzgmdVar2.zzE(i19);
                                    if (zzE != null && !zzE.zza(i42)) {
                                        zzd(obj).zzh(i16, Long.valueOf(i42));
                                        i30 = i41;
                                        i29 = i19;
                                        i27 = i16;
                                        i28 = i18;
                                        i31 = i15;
                                        i25 = i3;
                                    } else {
                                        unsafe2.putInt(obj5, j, i42);
                                        i30 = i41 | i39;
                                        i29 = i19;
                                        i27 = i16;
                                        i28 = i18;
                                        i31 = i15;
                                        i25 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i16 = i36;
                                i20 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 0) {
                                    i17 = i20;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zzgiv.zzj(bArr2, i20, zzgiuVar3);
                                    unsafe2.putInt(obj5, j, zzgjq.zzF(zzgiuVar3.zza));
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            case 16:
                                if (i34 != 0) {
                                    i16 = i36;
                                    i18 = i33;
                                    i19 = i14;
                                    i17 = i37;
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    zzm = zzgiv.zzm(bArr2, i37, zzgiuVar3);
                                    i16 = i36;
                                    i18 = i33;
                                    i19 = i14;
                                    unsafe2.putLong(obj, j, zzgjq.zzG(zzgiuVar3.zzb));
                                    i30 = i41 | i39;
                                    i29 = i19;
                                    i26 = zzm;
                                    i27 = i16;
                                    i28 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                            default:
                                i16 = i36;
                                i17 = i37;
                                i18 = i33;
                                i19 = i14;
                                if (i34 != 3) {
                                    i8 = i17;
                                    i10 = i41;
                                    i12 = i19;
                                    unsafe = unsafe2;
                                    i9 = i16;
                                    i11 = i18;
                                    i31 = i15;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zzgiv.zzc(zzgmdVar2.zzF(i19), bArr, i17, i2, (i18 << 3) | 4, zzgiuVar);
                                    if ((i41 & i39) == 0) {
                                        unsafe2.putObject(obj5, j, zzgiuVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j, zzgla.zzg(unsafe2.getObject(obj5, j), zzgiuVar3.zzc));
                                    }
                                    i30 = i41 | i39;
                                    bArr2 = bArr;
                                    i24 = i2;
                                    i29 = i19;
                                    i27 = i16;
                                    i28 = i18;
                                    i31 = i15;
                                    i25 = i3;
                                }
                        }
                    } else {
                        int i43 = zzx;
                        if (zzB != 27) {
                            i10 = i30;
                            i21 = i31;
                            if (zzB <= 49) {
                                i23 = i36;
                                i12 = i43;
                                i11 = i33;
                                unsafe = unsafe2;
                                i26 = zzw(obj, bArr, i37, i2, i36, i33, i34, i12, i35, zzB, j, zzgiuVar);
                                if (i26 != i37) {
                                    zzgmdVar2 = this;
                                    obj5 = obj;
                                    bArr2 = bArr;
                                    i27 = i23;
                                    i24 = i2;
                                    i25 = i3;
                                    zzgiuVar3 = zzgiuVar;
                                    i29 = i12;
                                    i30 = i10;
                                    i28 = i11;
                                    i31 = i21;
                                    unsafe2 = unsafe;
                                } else {
                                    i9 = i23;
                                    i4 = i3;
                                    i8 = i26;
                                    i31 = i21;
                                }
                            } else {
                                i22 = i37;
                                i23 = i36;
                                i12 = i43;
                                unsafe = unsafe2;
                                i11 = i33;
                                if (zzB != 50) {
                                    i26 = zzu(obj, bArr, i22, i2, i23, i11, i34, i35, zzB, j, i12, zzgiuVar);
                                    if (i26 != i22) {
                                        zzgmdVar2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i27 = i23;
                                        i24 = i2;
                                        i25 = i3;
                                        zzgiuVar3 = zzgiuVar;
                                        i29 = i12;
                                        i30 = i10;
                                        i28 = i11;
                                        i31 = i21;
                                        unsafe2 = unsafe;
                                    } else {
                                        i9 = i23;
                                        i4 = i3;
                                        i8 = i26;
                                        i31 = i21;
                                    }
                                } else if (i34 == 2) {
                                    i26 = zzt(obj, bArr, i22, i2, i12, j, zzgiuVar);
                                    if (i26 != i22) {
                                        zzgmdVar2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i27 = i23;
                                        i24 = i2;
                                        i25 = i3;
                                        zzgiuVar3 = zzgiuVar;
                                        i29 = i12;
                                        i30 = i10;
                                        i28 = i11;
                                        i31 = i21;
                                        unsafe2 = unsafe;
                                    } else {
                                        i9 = i23;
                                        i4 = i3;
                                        i8 = i26;
                                        i31 = i21;
                                    }
                                }
                            }
                        } else if (i34 == 2) {
                            zzgkz zzgkzVar = (zzgkz) unsafe2.getObject(obj5, j);
                            if (!zzgkzVar.zzc()) {
                                int size = zzgkzVar.size();
                                zzgkzVar = zzgkzVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj5, j, zzgkzVar);
                            }
                            i15 = i31;
                            i26 = zzgiv.zze(zzgmdVar2.zzF(i43), i36, bArr, i37, i2, zzgkzVar, zzgiuVar);
                            bArr2 = bArr;
                            i24 = i2;
                            i29 = i43;
                            i27 = i36;
                            i28 = i33;
                            i30 = i30;
                            i31 = i15;
                            i25 = i3;
                        } else {
                            i10 = i30;
                            i21 = i31;
                            i22 = i37;
                            i23 = i36;
                            i12 = i43;
                            unsafe = unsafe2;
                            i11 = i33;
                        }
                        i9 = i23;
                        i4 = i3;
                        i8 = i22;
                        i31 = i21;
                    }
                }
                if (i9 != i4 || i4 == 0) {
                    if (this.zzh) {
                        zzgiuVar2 = zzgiuVar;
                        if (zzgiuVar2.zzd != zzgkc.zza()) {
                            i13 = i11;
                            if (zzgiuVar2.zzd.zzc(this.zzg, i13) == null) {
                                i26 = zzgiv.zzi(i9, bArr, i8, i2, zzd(obj), zzgiuVar);
                                obj4 = obj;
                                i24 = i2;
                                i27 = i9;
                                zzgmdVar2 = this;
                                zzgiuVar3 = zzgiuVar2;
                                i28 = i13;
                                obj5 = obj4;
                                i29 = i12;
                                i30 = i10;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i25 = i4;
                            } else {
                                zzgkn zzgknVar = (zzgkn) obj;
                                throw null;
                            }
                        } else {
                            obj4 = obj;
                        }
                    } else {
                        obj4 = obj;
                        zzgiuVar2 = zzgiuVar;
                    }
                    i13 = i11;
                    i26 = zzgiv.zzi(i9, bArr, i8, i2, zzd(obj), zzgiuVar);
                    i24 = i2;
                    i27 = i9;
                    zzgmdVar2 = this;
                    zzgiuVar3 = zzgiuVar2;
                    i28 = i13;
                    obj5 = obj4;
                    i29 = i12;
                    i30 = i10;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i25 = i4;
                } else {
                    i5 = 1048575;
                    zzgmdVar = this;
                    obj2 = obj;
                    i26 = i8;
                    i27 = i9;
                    i30 = i10;
                    obj3 = null;
                }
            } else {
                unsafe = unsafe2;
                i4 = i25;
                obj2 = obj5;
                zzgmdVar = zzgmdVar2;
                obj3 = null;
                i5 = 1048575;
            }
        }
        if (i31 != i5) {
            unsafe.putInt(obj2, i31, i30);
        }
        for (int i44 = zzgmdVar.zzl; i44 < zzgmdVar.zzm; i44++) {
            zzgmdVar.zzG(obj2, zzgmdVar.zzk[i44], obj3, zzgmdVar.zzo);
        }
        if (i4 == 0) {
            if (i26 != i2) {
                throw zzglc.zzg();
            }
        } else if (i26 > i2 || i27 != i4) {
            throw zzglc.zzg();
        }
        return i26;
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final Object zze() {
        return ((zzgkq) this.zzg).zzb(4, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final void zzf(Object obj) {
        int i;
        int i2 = this.zzl;
        while (true) {
            i = this.zzm;
            if (i2 >= i) {
                break;
            }
            long zzC = zzC(this.zzk[i2]) & 1048575;
            Object zzh = zzgnu.zzh(obj, zzC);
            if (zzh != null) {
                ((zzglu) zzh).zzc();
                zzgnu.zzv(obj, zzC, zzh);
            }
            i2++;
        }
        int length = this.zzk.length;
        while (i < length) {
            this.zzn.zzb(obj, this.zzk[i]);
            i++;
        }
        this.zzo.zzm(obj);
        if (this.zzh) {
            this.zzp.zze(obj);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final void zzg(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzC = zzC(i);
            long j = 1048575 & zzC;
            int i2 = this.zzc[i];
            switch (zzB(zzC)) {
                case 0:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzr(obj, j, zzgnu.zzb(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzs(obj, j, zzgnu.zzc(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzu(obj, j, zzgnu.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzu(obj, j, zzgnu.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzt(obj, j, zzgnu.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzu(obj, j, zzgnu.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzt(obj, j, zzgnu.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzp(obj, j, zzgnu.zzz(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzv(obj, j, zzgnu.zzh(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzJ(obj, obj2, i);
                    break;
                case 10:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzv(obj, j, zzgnu.zzh(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzt(obj, j, zzgnu.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzt(obj, j, zzgnu.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzt(obj, j, zzgnu.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzu(obj, j, zzgnu.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzt(obj, j, zzgnu.zzd(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzQ(obj2, i)) {
                        zzgnu.zzu(obj, j, zzgnu.zzf(obj2, j));
                        zzM(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzJ(obj, obj2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    this.zzn.zzc(obj, obj2, j);
                    break;
                case 50:
                    zzgmv.zzI(this.zzr, obj, obj2, j);
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zzT(obj2, i2, i)) {
                        zzgnu.zzv(obj, j, zzgnu.zzh(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzK(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzT(obj2, i2, i)) {
                        zzgnu.zzv(obj, j, zzgnu.zzh(obj2, j));
                        zzN(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzK(obj, obj2, i);
                    break;
            }
        }
        zzgmv.zzF(this.zzo, obj, obj2);
        if (this.zzh) {
            zzgmv.zzE(this.zzp, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final void zzh(Object obj, zzgml zzgmlVar, zzgkc zzgkcVar) throws IOException {
        Objects.requireNonNull(zzgkcVar);
        zzgnk zzgnkVar = this.zzo;
        zzgkd zzgkdVar = this.zzp;
        zzgkh zzgkhVar = null;
        Object obj2 = null;
        while (true) {
            try {
                int zzc = zzgmlVar.zzc();
                int zzx = zzx(zzc);
                if (zzx >= 0) {
                    int zzC = zzC(zzx);
                    try {
                        switch (zzB(zzC)) {
                            case 0:
                                zzgnu.zzr(obj, zzC & 1048575, zzgmlVar.zza());
                                zzM(obj, zzx);
                                break;
                            case 1:
                                zzgnu.zzs(obj, zzC & 1048575, zzgmlVar.zzb());
                                zzM(obj, zzx);
                                break;
                            case 2:
                                zzgnu.zzu(obj, zzC & 1048575, zzgmlVar.zzl());
                                zzM(obj, zzx);
                                break;
                            case 3:
                                zzgnu.zzu(obj, zzC & 1048575, zzgmlVar.zzo());
                                zzM(obj, zzx);
                                break;
                            case 4:
                                zzgnu.zzt(obj, zzC & 1048575, zzgmlVar.zzg());
                                zzM(obj, zzx);
                                break;
                            case 5:
                                zzgnu.zzu(obj, zzC & 1048575, zzgmlVar.zzk());
                                zzM(obj, zzx);
                                break;
                            case 6:
                                zzgnu.zzt(obj, zzC & 1048575, zzgmlVar.zzf());
                                zzM(obj, zzx);
                                break;
                            case 7:
                                zzgnu.zzp(obj, zzC & 1048575, zzgmlVar.zzN());
                                zzM(obj, zzx);
                                break;
                            case 8:
                                zzL(obj, zzC, zzgmlVar);
                                zzM(obj, zzx);
                                break;
                            case 9:
                                if (zzQ(obj, zzx)) {
                                    long j = zzC & 1048575;
                                    zzgnu.zzv(obj, j, zzgla.zzg(zzgnu.zzh(obj, j), zzgmlVar.zzs(zzF(zzx), zzgkcVar)));
                                    break;
                                } else {
                                    zzgnu.zzv(obj, zzC & 1048575, zzgmlVar.zzs(zzF(zzx), zzgkcVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 10:
                                zzgnu.zzv(obj, zzC & 1048575, zzgmlVar.zzp());
                                zzM(obj, zzx);
                                break;
                            case 11:
                                zzgnu.zzt(obj, zzC & 1048575, zzgmlVar.zzj());
                                zzM(obj, zzx);
                                break;
                            case 12:
                                int zze = zzgmlVar.zze();
                                zzgku zzE = zzE(zzx);
                                if (zzE != null && !zzE.zza(zze)) {
                                    obj2 = zzgmv.zzD(zzc, zze, obj2, zzgnkVar);
                                    break;
                                }
                                zzgnu.zzt(obj, zzC & 1048575, zze);
                                zzM(obj, zzx);
                                break;
                            case 13:
                                zzgnu.zzt(obj, zzC & 1048575, zzgmlVar.zzh());
                                zzM(obj, zzx);
                                break;
                            case 14:
                                zzgnu.zzu(obj, zzC & 1048575, zzgmlVar.zzm());
                                zzM(obj, zzx);
                                break;
                            case 15:
                                zzgnu.zzt(obj, zzC & 1048575, zzgmlVar.zzi());
                                zzM(obj, zzx);
                                break;
                            case 16:
                                zzgnu.zzu(obj, zzC & 1048575, zzgmlVar.zzn());
                                zzM(obj, zzx);
                                break;
                            case 17:
                                if (zzQ(obj, zzx)) {
                                    long j2 = zzC & 1048575;
                                    zzgnu.zzv(obj, j2, zzgla.zzg(zzgnu.zzh(obj, j2), zzgmlVar.zzr(zzF(zzx), zzgkcVar)));
                                    break;
                                } else {
                                    zzgnu.zzv(obj, zzC & 1048575, zzgmlVar.zzr(zzF(zzx), zzgkcVar));
                                    zzM(obj, zzx);
                                    break;
                                }
                            case 18:
                                zzgmlVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 19:
                                zzgmlVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 20:
                                zzgmlVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 21:
                                zzgmlVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 22:
                                zzgmlVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 23:
                                zzgmlVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 24:
                                zzgmlVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 25:
                                zzgmlVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 26:
                                if (zzP(zzC)) {
                                    ((zzgjr) zzgmlVar).zzK(this.zzn.zza(obj, zzC & 1048575), true);
                                    break;
                                } else {
                                    ((zzgjr) zzgmlVar).zzK(this.zzn.zza(obj, zzC & 1048575), false);
                                    break;
                                }
                            case 27:
                                zzgmlVar.zzF(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzgkcVar);
                                break;
                            case 28:
                                zzgmlVar.zzw(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 29:
                                zzgmlVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 30:
                                List zza2 = this.zzn.zza(obj, zzC & 1048575);
                                zzgmlVar.zzy(zza2);
                                obj2 = zzgmv.zzC(zzc, zza2, zzE(zzx), obj2, zzgnkVar);
                                break;
                            case 31:
                                zzgmlVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 32:
                                zzgmlVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 33:
                                zzgmlVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 34:
                                zzgmlVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 35:
                                zzgmlVar.zzx(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 36:
                                zzgmlVar.zzB(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 37:
                                zzgmlVar.zzE(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 38:
                                zzgmlVar.zzM(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 39:
                                zzgmlVar.zzD(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 40:
                                zzgmlVar.zzA(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 41:
                                zzgmlVar.zzz(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 42:
                                zzgmlVar.zzv(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 43:
                                zzgmlVar.zzL(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 44:
                                List zza3 = this.zzn.zza(obj, zzC & 1048575);
                                zzgmlVar.zzy(zza3);
                                obj2 = zzgmv.zzC(zzc, zza3, zzE(zzx), obj2, zzgnkVar);
                                break;
                            case 45:
                                zzgmlVar.zzG(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 46:
                                zzgmlVar.zzH(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 47:
                                zzgmlVar.zzI(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 48:
                                zzgmlVar.zzJ(this.zzn.zza(obj, zzC & 1048575));
                                break;
                            case 49:
                                zzgmlVar.zzC(this.zzn.zza(obj, zzC & 1048575), zzF(zzx), zzgkcVar);
                                break;
                            case 50:
                                Object zzH = zzH(zzx);
                                long zzC2 = zzC(zzx) & 1048575;
                                Object zzh = zzgnu.zzh(obj, zzC2);
                                if (zzh != null) {
                                    if (zzglv.zzb(zzh)) {
                                        Object zzb2 = zzglu.zza().zzb();
                                        zzglv.zzc(zzb2, zzh);
                                        zzgnu.zzv(obj, zzC2, zzb2);
                                        zzh = zzb2;
                                    }
                                } else {
                                    zzh = zzglu.zza().zzb();
                                    zzgnu.zzv(obj, zzC2, zzh);
                                }
                                zzglu zzgluVar = (zzglu) zzh;
                                zzglt zzgltVar = (zzglt) zzH;
                                throw null;
                                break;
                            case 51:
                                zzgnu.zzv(obj, zzC & 1048575, Double.valueOf(zzgmlVar.zza()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 52:
                                zzgnu.zzv(obj, zzC & 1048575, Float.valueOf(zzgmlVar.zzb()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 53:
                                zzgnu.zzv(obj, zzC & 1048575, Long.valueOf(zzgmlVar.zzl()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 54:
                                zzgnu.zzv(obj, zzC & 1048575, Long.valueOf(zzgmlVar.zzo()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 55:
                                zzgnu.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmlVar.zzg()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 56:
                                zzgnu.zzv(obj, zzC & 1048575, Long.valueOf(zzgmlVar.zzk()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 57:
                                zzgnu.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmlVar.zzf()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 58:
                                zzgnu.zzv(obj, zzC & 1048575, Boolean.valueOf(zzgmlVar.zzN()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 59:
                                zzL(obj, zzC, zzgmlVar);
                                zzN(obj, zzc, zzx);
                                break;
                            case 60:
                                if (zzT(obj, zzc, zzx)) {
                                    long j3 = zzC & 1048575;
                                    zzgnu.zzv(obj, j3, zzgla.zzg(zzgnu.zzh(obj, j3), zzgmlVar.zzs(zzF(zzx), zzgkcVar)));
                                } else {
                                    zzgnu.zzv(obj, zzC & 1048575, zzgmlVar.zzs(zzF(zzx), zzgkcVar));
                                    zzM(obj, zzx);
                                }
                                zzN(obj, zzc, zzx);
                                break;
                            case 61:
                                zzgnu.zzv(obj, zzC & 1048575, zzgmlVar.zzp());
                                zzN(obj, zzc, zzx);
                                break;
                            case 62:
                                zzgnu.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmlVar.zzj()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 63:
                                int zze2 = zzgmlVar.zze();
                                zzgku zzE2 = zzE(zzx);
                                if (zzE2 != null && !zzE2.zza(zze2)) {
                                    obj2 = zzgmv.zzD(zzc, zze2, obj2, zzgnkVar);
                                    break;
                                }
                                zzgnu.zzv(obj, zzC & 1048575, Integer.valueOf(zze2));
                                zzN(obj, zzc, zzx);
                                break;
                            case 64:
                                zzgnu.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmlVar.zzh()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 65:
                                zzgnu.zzv(obj, zzC & 1048575, Long.valueOf(zzgmlVar.zzm()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 66:
                                zzgnu.zzv(obj, zzC & 1048575, Integer.valueOf(zzgmlVar.zzi()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 67:
                                zzgnu.zzv(obj, zzC & 1048575, Long.valueOf(zzgmlVar.zzn()));
                                zzN(obj, zzc, zzx);
                                break;
                            case 68:
                                zzgnu.zzv(obj, zzC & 1048575, zzgmlVar.zzr(zzF(zzx), zzgkcVar));
                                zzN(obj, zzc, zzx);
                                break;
                            default:
                                if (obj2 == null) {
                                    obj2 = zzgnkVar.zzf();
                                }
                                if (!zzgnkVar.zzp(obj2, zzgmlVar)) {
                                    for (int i = this.zzl; i < this.zzm; i++) {
                                        obj2 = zzG(obj, this.zzk[i], obj2, zzgnkVar);
                                    }
                                    if (obj2 != null) {
                                        zzgnkVar.zzn(obj, obj2);
                                        return;
                                    }
                                    return;
                                }
                                break;
                        }
                    } catch (zzglb unused) {
                        zzgnkVar.zzq(zzgmlVar);
                        if (obj2 == null) {
                            obj2 = zzgnkVar.zzc(obj);
                        }
                        if (!zzgnkVar.zzp(obj2, zzgmlVar)) {
                            for (int i2 = this.zzl; i2 < this.zzm; i2++) {
                                obj2 = zzG(obj, this.zzk[i2], obj2, zzgnkVar);
                            }
                            if (obj2 != null) {
                                zzgnkVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                } else if (zzc == Integer.MAX_VALUE) {
                    for (int i3 = this.zzl; i3 < this.zzm; i3++) {
                        obj2 = zzG(obj, this.zzk[i3], obj2, zzgnkVar);
                    }
                    if (obj2 != null) {
                        zzgnkVar.zzn(obj, obj2);
                        return;
                    }
                    return;
                } else {
                    Object zzc2 = !this.zzh ? null : zzgkdVar.zzc(zzgkcVar, this.zzg, zzc);
                    if (zzc2 != null) {
                        if (zzgkhVar == null) {
                            zzgkhVar = zzgkdVar.zzb(obj);
                        }
                        zzgkh zzgkhVar2 = zzgkhVar;
                        obj2 = zzgkdVar.zzd(zzgmlVar, zzc2, zzgkcVar, zzgkhVar2, obj2, zzgnkVar);
                        zzgkhVar = zzgkhVar2;
                    } else {
                        zzgnkVar.zzq(zzgmlVar);
                        if (obj2 == null) {
                            obj2 = zzgnkVar.zzc(obj);
                        }
                        if (!zzgnkVar.zzp(obj2, zzgmlVar)) {
                            for (int i4 = this.zzl; i4 < this.zzm; i4++) {
                                obj2 = zzG(obj, this.zzk[i4], obj2, zzgnkVar);
                            }
                            if (obj2 != null) {
                                zzgnkVar.zzn(obj, obj2);
                                return;
                            }
                            return;
                        }
                    }
                }
            } catch (Throwable th) {
                for (int i5 = this.zzl; i5 < this.zzm; i5++) {
                    obj2 = zzG(obj, this.zzk[i5], obj2, zzgnkVar);
                }
                if (obj2 != null) {
                    zzgnkVar.zzn(obj, obj2);
                }
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzgiu zzgiuVar) throws IOException {
        if (this.zzj) {
            zzv(obj, bArr, i, i2, zzgiuVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzgiuVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzH;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzC = zzC(i);
            long j = zzC & 1048575;
            switch (zzB(zzC)) {
                case 0:
                    if (zzO(obj, obj2, i) && Double.doubleToLongBits(zzgnu.zzb(obj, j)) == Double.doubleToLongBits(zzgnu.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzO(obj, obj2, i) && Float.floatToIntBits(zzgnu.zzc(obj, j)) == Float.floatToIntBits(zzgnu.zzc(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzO(obj, obj2, i) && zzgnu.zzf(obj, j) == zzgnu.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzO(obj, obj2, i) && zzgnu.zzf(obj, j) == zzgnu.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzO(obj, obj2, i) && zzgnu.zzd(obj, j) == zzgnu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzO(obj, obj2, i) && zzgnu.zzf(obj, j) == zzgnu.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzO(obj, obj2, i) && zzgnu.zzd(obj, j) == zzgnu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzO(obj, obj2, i) && zzgnu.zzz(obj, j) == zzgnu.zzz(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzO(obj, obj2, i) && zzgmv.zzH(zzgnu.zzh(obj, j), zzgnu.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzO(obj, obj2, i) && zzgmv.zzH(zzgnu.zzh(obj, j), zzgnu.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzO(obj, obj2, i) && zzgmv.zzH(zzgnu.zzh(obj, j), zzgnu.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzO(obj, obj2, i) && zzgnu.zzd(obj, j) == zzgnu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzO(obj, obj2, i) && zzgnu.zzd(obj, j) == zzgnu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzO(obj, obj2, i) && zzgnu.zzd(obj, j) == zzgnu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzO(obj, obj2, i) && zzgnu.zzf(obj, j) == zzgnu.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzO(obj, obj2, i) && zzgnu.zzd(obj, j) == zzgnu.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzO(obj, obj2, i) && zzgnu.zzf(obj, j) == zzgnu.zzf(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzO(obj, obj2, i) && zzgmv.zzH(zzgnu.zzh(obj, j), zzgnu.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    zzH = zzgmv.zzH(zzgnu.zzh(obj, j), zzgnu.zzh(obj2, j));
                    break;
                case 50:
                    zzH = zzgmv.zzH(zzgnu.zzh(obj, j), zzgnu.zzh(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzz = zzz(i) & 1048575;
                    if (zzgnu.zzd(obj, zzz) == zzgnu.zzd(obj2, zzz) && zzgmv.zzH(zzgnu.zzh(obj, j), zzgnu.zzh(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzH) {
                return false;
            }
        }
        if (this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            if (this.zzh) {
                this.zzp.zza(obj);
                this.zzp.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzl) {
            int i6 = this.zzk[i5];
            int i7 = this.zzc[i6];
            int zzC = zzC(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i3) {
                if (i9 != 1048575) {
                    i4 = zzb.getInt(obj, i9);
                }
                i2 = i4;
                i = i9;
            } else {
                i = i3;
                i2 = i4;
            }
            if ((268435456 & zzC) != 0 && !zzR(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzB = zzB(zzC);
            if (zzB != 9 && zzB != 17) {
                if (zzB != 27) {
                    if (zzB == 60 || zzB == 68) {
                        if (zzT(obj, i7, i6) && !zzS(obj, zzC, zzF(i6))) {
                            return false;
                        }
                    } else if (zzB != 49) {
                        if (zzB == 50 && !((zzglu) zzgnu.zzh(obj, zzC & 1048575)).isEmpty()) {
                            zzglt zzgltVar = (zzglt) zzH(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzgnu.zzh(obj, zzC & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzgmt zzF = zzF(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzF.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzR(obj, i6, i, i2, i10) && !zzS(obj, zzC, zzF(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.zzh) {
            this.zzp.zza(obj);
            throw null;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgmt
    public final void zzn(Object obj, zzgjy zzgjyVar) throws IOException {
        if (!this.zzj) {
            zzV(obj, zzgjyVar);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzC = zzC(i);
                int i2 = this.zzc[i];
                switch (zzB(zzC)) {
                    case 0:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzf(i2, zzgnu.zzb(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzo(i2, zzgnu.zzc(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzt(i2, zzgnu.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzJ(i2, zzgnu.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzr(i2, zzgnu.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzm(i2, zzgnu.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzk(i2, zzgnu.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzb(i2, zzgnu.zzz(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzQ(obj, i)) {
                            zzX(i2, zzgnu.zzh(obj, zzC & 1048575), zzgjyVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzv(i2, zzgnu.zzh(obj, zzC & 1048575), zzF(i));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzd(i2, (zzgji) zzgnu.zzh(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzH(i2, zzgnu.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzi(i2, zzgnu.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzw(i2, zzgnu.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzy(i2, zzgnu.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzA(i2, zzgnu.zzd(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzC(i2, zzgnu.zzf(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzQ(obj, i)) {
                            zzgjyVar.zzq(i2, zzgnu.zzh(obj, zzC & 1048575), zzF(i));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzgmv.zzL(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 19:
                        zzgmv.zzP(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 20:
                        zzgmv.zzS(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 21:
                        zzgmv.zzaa(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 22:
                        zzgmv.zzR(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 23:
                        zzgmv.zzO(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 24:
                        zzgmv.zzN(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 25:
                        zzgmv.zzJ(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 26:
                        zzgmv.zzY(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar);
                        break;
                    case 27:
                        zzgmv.zzT(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, zzF(i));
                        break;
                    case 28:
                        zzgmv.zzK(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar);
                        break;
                    case 29:
                        zzgmv.zzZ(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 30:
                        zzgmv.zzM(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 31:
                        zzgmv.zzU(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 32:
                        zzgmv.zzV(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 33:
                        zzgmv.zzW(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 34:
                        zzgmv.zzX(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, false);
                        break;
                    case 35:
                        zzgmv.zzL(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 36:
                        zzgmv.zzP(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 37:
                        zzgmv.zzS(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 38:
                        zzgmv.zzaa(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 39:
                        zzgmv.zzR(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 40:
                        zzgmv.zzO(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 41:
                        zzgmv.zzN(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 42:
                        zzgmv.zzJ(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 43:
                        zzgmv.zzZ(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 44:
                        zzgmv.zzM(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 45:
                        zzgmv.zzU(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 46:
                        zzgmv.zzV(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 47:
                        zzgmv.zzW(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 48:
                        zzgmv.zzX(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, true);
                        break;
                    case 49:
                        zzgmv.zzQ(i2, (List) zzgnu.zzh(obj, zzC & 1048575), zzgjyVar, zzF(i));
                        break;
                    case 50:
                        zzW(zzgjyVar, i2, zzgnu.zzh(obj, zzC & 1048575), i);
                        break;
                    case 51:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzf(i2, zzo(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzo(i2, zzp(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzt(i2, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzJ(i2, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzr(i2, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzm(i2, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzk(i2, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzb(i2, zzU(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzT(obj, i2, i)) {
                            zzX(i2, zzgnu.zzh(obj, zzC & 1048575), zzgjyVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzv(i2, zzgnu.zzh(obj, zzC & 1048575), zzF(i));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzd(i2, (zzgji) zzgnu.zzh(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzH(i2, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzi(i2, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzw(i2, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzy(i2, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzA(i2, zzs(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzC(i2, zzD(obj, zzC & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzT(obj, i2, i)) {
                            zzgjyVar.zzq(i2, zzgnu.zzh(obj, zzC & 1048575), zzF(i));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzgnk zzgnkVar = this.zzo;
            zzgnkVar.zzr(zzgnkVar.zzd(obj), zzgjyVar);
        } else {
            this.zzp.zza(obj);
            throw null;
        }
    }
}