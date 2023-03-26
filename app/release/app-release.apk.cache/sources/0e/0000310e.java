package com.google.android.gms.internal.measurement;

import com.p7700g.p99005.wo1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzlm<T> implements zzlu<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzmv.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzlj zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final int[] zzj;
    private final int zzk;
    private final int zzl;
    private final zzkx zzm;
    private final zzml zzn;
    private final zzjp zzo;
    private final zzlo zzp;
    private final zzle zzq;

    private zzlm(int[] iArr, Object[] objArr, int i, int i2, zzlj zzljVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar, byte[] bArr) {
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = z;
        boolean z3 = false;
        if (zzjpVar != null && zzjpVar.zzc(zzljVar)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzj = iArr2;
        this.zzk = i3;
        this.zzl = i4;
        this.zzp = zzloVar;
        this.zzm = zzkxVar;
        this.zzn = zzmlVar;
        this.zzo = zzjpVar;
        this.zzg = zzljVar;
        this.zzq = zzleVar;
    }

    private static int zzA(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzB(int i) {
        return this.zzc[i + 1];
    }

    private static long zzC(Object obj, long j) {
        return ((Long) zzmv.zzf(obj, j)).longValue();
    }

    private final zzkg zzD(int i) {
        int i2 = i / 3;
        return (zzkg) this.zzd[i2 + i2 + 1];
    }

    private final zzlu zzE(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzlu zzluVar = (zzlu) this.zzd[i3];
        if (zzluVar != null) {
            return zzluVar;
        }
        zzlu zzb2 = zzlr.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzF(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzG(Class cls, String str) {
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

    private final void zzH(Object obj, Object obj2, int i) {
        long zzB = zzB(i) & 1048575;
        if (zzO(obj2, i)) {
            Object zzf = zzmv.zzf(obj, zzB);
            Object zzf2 = zzmv.zzf(obj2, zzB);
            if (zzf != null && zzf2 != null) {
                zzmv.zzs(obj, zzB, zzkk.zzg(zzf, zzf2));
                zzJ(obj, i);
            } else if (zzf2 != null) {
                zzmv.zzs(obj, zzB, zzf2);
                zzJ(obj, i);
            }
        }
    }

    private final void zzI(Object obj, Object obj2, int i) {
        int zzB = zzB(i);
        int i2 = this.zzc[i];
        long j = zzB & 1048575;
        if (zzR(obj2, i2, i)) {
            Object zzf = zzR(obj, i2, i) ? zzmv.zzf(obj, j) : null;
            Object zzf2 = zzmv.zzf(obj2, j);
            if (zzf != null && zzf2 != null) {
                zzmv.zzs(obj, j, zzkk.zzg(zzf, zzf2));
                zzK(obj, i2, i);
            } else if (zzf2 != null) {
                zzmv.zzs(obj, j, zzf2);
                zzK(obj, i2, i);
            }
        }
    }

    private final void zzJ(Object obj, int i) {
        int zzy = zzy(i);
        long j = 1048575 & zzy;
        if (j == 1048575) {
            return;
        }
        zzmv.zzq(obj, j, (1 << (zzy >>> 20)) | zzmv.zzc(obj, j));
    }

    private final void zzK(Object obj, int i, int i2) {
        zzmv.zzq(obj, zzy(i2) & 1048575, i);
    }

    private final void zzL(Object obj, zznd zzndVar) throws IOException {
        int i;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i2 = 1048575;
            int i3 = 0;
            int i4 = 0;
            int i5 = 1048575;
            while (i3 < length) {
                int zzB = zzB(i3);
                int[] iArr = this.zzc;
                int i6 = iArr[i3];
                int zzA = zzA(zzB);
                if (zzA <= 17) {
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
                long j = zzB & i2;
                switch (zzA) {
                    case 0:
                        if ((i4 & i) != 0) {
                            zzndVar.zzf(i6, zzmv.zza(obj, j));
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 1:
                        if ((i4 & i) != 0) {
                            zzndVar.zzo(i6, zzmv.zzb(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 2:
                        if ((i4 & i) != 0) {
                            zzndVar.zzt(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 3:
                        if ((i4 & i) != 0) {
                            zzndVar.zzJ(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 4:
                        if ((i4 & i) != 0) {
                            zzndVar.zzr(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 5:
                        if ((i4 & i) != 0) {
                            zzndVar.zzm(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 6:
                        if ((i4 & i) != 0) {
                            zzndVar.zzk(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 7:
                        if ((i4 & i) != 0) {
                            zzndVar.zzb(i6, zzmv.zzw(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 8:
                        if ((i4 & i) != 0) {
                            zzT(i6, unsafe.getObject(obj, j), zzndVar);
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 9:
                        if ((i4 & i) != 0) {
                            zzndVar.zzv(i6, unsafe.getObject(obj, j), zzE(i3));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 10:
                        if ((i4 & i) != 0) {
                            zzndVar.zzd(i6, (zzjb) unsafe.getObject(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 11:
                        if ((i4 & i) != 0) {
                            zzndVar.zzH(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 12:
                        if ((i4 & i) != 0) {
                            zzndVar.zzi(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 13:
                        if ((i4 & i) != 0) {
                            zzndVar.zzw(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 14:
                        if ((i4 & i) != 0) {
                            zzndVar.zzy(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 15:
                        if ((i4 & i) != 0) {
                            zzndVar.zzA(i6, unsafe.getInt(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 16:
                        if ((i4 & i) != 0) {
                            zzndVar.zzC(i6, unsafe.getLong(obj, j));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 17:
                        if ((i4 & i) != 0) {
                            zzndVar.zzq(i6, unsafe.getObject(obj, j), zzE(i3));
                        } else {
                            continue;
                        }
                        i3 += 3;
                        i2 = 1048575;
                    case 18:
                        zzlw.zzJ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 19:
                        zzlw.zzN(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 20:
                        zzlw.zzQ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 21:
                        zzlw.zzY(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 22:
                        zzlw.zzP(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 23:
                        zzlw.zzM(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 24:
                        zzlw.zzL(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 25:
                        zzlw.zzH(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                        continue;
                        i3 += 3;
                        i2 = 1048575;
                    case 26:
                        zzlw.zzW(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar);
                        break;
                    case 27:
                        zzlw.zzR(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, zzE(i3));
                        break;
                    case 28:
                        zzlw.zzI(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar);
                        break;
                    case 29:
                        zzlw.zzX(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                        break;
                    case 30:
                        zzlw.zzK(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                        break;
                    case 31:
                        zzlw.zzS(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                        break;
                    case 32:
                        zzlw.zzT(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                        break;
                    case 33:
                        zzlw.zzU(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                        break;
                    case 34:
                        zzlw.zzV(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, false);
                        break;
                    case 35:
                        zzlw.zzJ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                        break;
                    case 36:
                        zzlw.zzN(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                        break;
                    case 37:
                        zzlw.zzQ(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                        break;
                    case 38:
                        zzlw.zzY(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                        break;
                    case 39:
                        zzlw.zzP(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                        break;
                    case 40:
                        zzlw.zzM(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                        break;
                    case 41:
                        zzlw.zzL(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                        break;
                    case 42:
                        zzlw.zzH(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                        break;
                    case 43:
                        zzlw.zzX(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                        break;
                    case 44:
                        zzlw.zzK(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                        break;
                    case 45:
                        zzlw.zzS(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                        break;
                    case 46:
                        zzlw.zzT(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                        break;
                    case 47:
                        zzlw.zzU(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                        break;
                    case 48:
                        zzlw.zzV(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, true);
                        break;
                    case 49:
                        zzlw.zzO(this.zzc[i3], (List) unsafe.getObject(obj, j), zzndVar, zzE(i3));
                        break;
                    case 50:
                        zzM(zzndVar, i6, unsafe.getObject(obj, j), i3);
                        break;
                    case 51:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzf(i6, zzn(obj, j));
                            break;
                        }
                        break;
                    case 52:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzo(i6, zzo(obj, j));
                            break;
                        }
                        break;
                    case 53:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzt(i6, zzC(obj, j));
                            break;
                        }
                        break;
                    case 54:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzJ(i6, zzC(obj, j));
                            break;
                        }
                        break;
                    case 55:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzr(i6, zzr(obj, j));
                            break;
                        }
                        break;
                    case 56:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzm(i6, zzC(obj, j));
                            break;
                        }
                        break;
                    case 57:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzk(i6, zzr(obj, j));
                            break;
                        }
                        break;
                    case 58:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzb(i6, zzS(obj, j));
                            break;
                        }
                        break;
                    case 59:
                        if (zzR(obj, i6, i3)) {
                            zzT(i6, unsafe.getObject(obj, j), zzndVar);
                            break;
                        }
                        break;
                    case 60:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzv(i6, unsafe.getObject(obj, j), zzE(i3));
                            break;
                        }
                        break;
                    case 61:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzd(i6, (zzjb) unsafe.getObject(obj, j));
                            break;
                        }
                        break;
                    case 62:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzH(i6, zzr(obj, j));
                            break;
                        }
                        break;
                    case 63:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzi(i6, zzr(obj, j));
                            break;
                        }
                        break;
                    case 64:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzw(i6, zzr(obj, j));
                            break;
                        }
                        break;
                    case 65:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzy(i6, zzC(obj, j));
                            break;
                        }
                        break;
                    case 66:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzA(i6, zzr(obj, j));
                            break;
                        }
                        break;
                    case 67:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzC(i6, zzC(obj, j));
                            break;
                        }
                        break;
                    case 68:
                        if (zzR(obj, i6, i3)) {
                            zzndVar.zzq(i6, unsafe.getObject(obj, j), zzE(i3));
                            break;
                        }
                        break;
                }
                i3 += 3;
                i2 = 1048575;
            }
            zzml zzmlVar = this.zzn;
            zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
            return;
        }
        this.zzo.zza(obj);
        throw null;
    }

    private final void zzM(zznd zzndVar, int i, Object obj, int i2) throws IOException {
        if (obj == null) {
            return;
        }
        zzlc zzlcVar = (zzlc) zzF(i2);
        throw null;
    }

    private final boolean zzN(Object obj, Object obj2, int i) {
        return zzO(obj, i) == zzO(obj2, i);
    }

    private final boolean zzO(Object obj, int i) {
        int zzy = zzy(i);
        long j = zzy & 1048575;
        if (j != 1048575) {
            return (zzmv.zzc(obj, j) & (1 << (zzy >>> 20))) != 0;
        }
        int zzB = zzB(i);
        long j2 = zzB & 1048575;
        switch (zzA(zzB)) {
            case 0:
                return Double.doubleToRawLongBits(zzmv.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzmv.zzb(obj, j2)) != 0;
            case 2:
                return zzmv.zzd(obj, j2) != 0;
            case 3:
                return zzmv.zzd(obj, j2) != 0;
            case 4:
                return zzmv.zzc(obj, j2) != 0;
            case 5:
                return zzmv.zzd(obj, j2) != 0;
            case 6:
                return zzmv.zzc(obj, j2) != 0;
            case 7:
                return zzmv.zzw(obj, j2);
            case 8:
                Object zzf = zzmv.zzf(obj, j2);
                if (zzf instanceof String) {
                    return !((String) zzf).isEmpty();
                } else if (zzf instanceof zzjb) {
                    return !zzjb.zzb.equals(zzf);
                } else {
                    throw new IllegalArgumentException();
                }
            case 9:
                return zzmv.zzf(obj, j2) != null;
            case 10:
                return !zzjb.zzb.equals(zzmv.zzf(obj, j2));
            case 11:
                return zzmv.zzc(obj, j2) != 0;
            case 12:
                return zzmv.zzc(obj, j2) != 0;
            case 13:
                return zzmv.zzc(obj, j2) != 0;
            case 14:
                return zzmv.zzd(obj, j2) != 0;
            case 15:
                return zzmv.zzc(obj, j2) != 0;
            case 16:
                return zzmv.zzd(obj, j2) != 0;
            case 17:
                return zzmv.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzP(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzO(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzQ(Object obj, int i, zzlu zzluVar) {
        return zzluVar.zzk(zzmv.zzf(obj, i & 1048575));
    }

    private final boolean zzR(Object obj, int i, int i2) {
        return zzmv.zzc(obj, (long) (zzy(i2) & 1048575)) == i;
    }

    private static boolean zzS(Object obj, long j) {
        return ((Boolean) zzmv.zzf(obj, j)).booleanValue();
    }

    private static final void zzT(int i, Object obj, zznd zzndVar) throws IOException {
        if (obj instanceof String) {
            zzndVar.zzF(i, (String) obj);
        } else {
            zzndVar.zzd(i, (zzjb) obj);
        }
    }

    public static zzmm zzd(Object obj) {
        zzkc zzkcVar = (zzkc) obj;
        zzmm zzmmVar = zzkcVar.zzc;
        if (zzmmVar == zzmm.zzc()) {
            zzmm zze = zzmm.zze();
            zzkcVar.zzc = zze;
            return zze;
        }
        return zzmmVar;
    }

    public static zzlm zzl(Class cls, zzlg zzlgVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
        if (zzlgVar instanceof zzlt) {
            return zzm((zzlt) zzlgVar, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar);
        }
        zzmi zzmiVar = (zzmi) zzlgVar;
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
    public static zzlm zzm(zzlt zzltVar, zzlo zzloVar, zzkx zzkxVar, zzml zzmlVar, zzjp zzjpVar, zzle zzleVar) {
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
        Field zzG;
        char charAt12;
        int i23;
        int i24;
        int i25;
        Object obj;
        Field zzG2;
        Object obj2;
        Field zzG3;
        int i26;
        char charAt13;
        int i27;
        char charAt14;
        int i28;
        char charAt15;
        int i29;
        char charAt16;
        boolean z = zzltVar.zzc() == 2;
        String zzd = zzltVar.zzd();
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
        Object[] zze = zzltVar.zze();
        Class<?> cls2 = zzltVar.zza().getClass();
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
                        zzG2 = (Field) obj;
                    } else {
                        zzG2 = zzG(cls2, (String) obj);
                        zze[i81] = zzG2;
                    }
                    iArr2 = iArr3;
                    i17 = charAt;
                    int objectFieldOffset2 = (int) unsafe.objectFieldOffset(zzG2);
                    int i82 = i81 + 1;
                    obj2 = zze[i82];
                    if (!(obj2 instanceof Field)) {
                        zzG3 = (Field) obj2;
                    } else {
                        zzG3 = zzG(cls2, (String) obj2);
                        zze[i82] = zzG3;
                    }
                    cls = cls2;
                    i21 = (int) unsafe.objectFieldOffset(zzG3);
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
                int objectFieldOffset22 = (int) unsafe.objectFieldOffset(zzG2);
                int i822 = i812 + 1;
                obj2 = zze[i822];
                if (!(obj2 instanceof Field)) {
                }
                cls = cls2;
                i21 = (int) unsafe.objectFieldOffset(zzG3);
                objArr = objArr2;
                str = zzd;
                objectFieldOffset = objectFieldOffset22;
                i22 = 0;
            } else {
                iArr2 = iArr3;
                i17 = charAt;
                i18 = i4;
                int i83 = i2 + 1;
                Field zzG4 = zzG(cls2, (String) zze[i2]);
                if (i72 == 9 || i72 == 17) {
                    int i84 = i62 / 3;
                    objArr2[i84 + i84 + 1] = zzG4.getType();
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
                            objectFieldOffset = (int) unsafe.objectFieldOffset(zzG4);
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
                                    zzG = (Field) obj3;
                                } else {
                                    zzG = zzG(cls2, (String) obj3);
                                    zze[i94] = zzG;
                                }
                                str = zzd;
                                cls = cls2;
                                i21 = (int) unsafe.objectFieldOffset(zzG);
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
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zzG4);
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
                objectFieldOffset = (int) unsafe.objectFieldOffset(zzG4);
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
        return new zzlm(iArr3, objArr2, charAt, i4, zzltVar.zza(), z, false, iArr, charAt3, i59, zzloVar, zzkxVar, zzmlVar, zzjpVar, zzleVar, null);
    }

    private static double zzn(Object obj, long j) {
        return ((Double) zzmv.zzf(obj, j)).doubleValue();
    }

    private static float zzo(Object obj, long j) {
        return ((Float) zzmv.zzf(obj, j)).floatValue();
    }

    private final int zzp(Object obj) {
        int i;
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int zzo;
        int zzA8;
        int zzB2;
        int zzi;
        int zzz;
        int zzA9;
        int i2;
        int zzA10;
        int zzd2;
        int zzA11;
        Unsafe unsafe = zzb;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1048575;
        while (i4 < this.zzc.length) {
            int zzB3 = zzB(i4);
            int[] iArr = this.zzc;
            int i8 = iArr[i4];
            int zzA12 = zzA(zzB3);
            if (zzA12 <= 17) {
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
            long j = i3 & zzB3;
            switch (zzA12) {
                case 0:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzA = zzjj.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i5 += zzo;
                        break;
                    }
                case 1:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzjj.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 2:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj, j);
                        zzA3 = zzjj.zzA(i8 << 3);
                        zzB = zzjj.zzB(j2);
                        zzo = zzA3 + zzB;
                        i5 += zzo;
                        break;
                    }
                case 3:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        long j3 = unsafe.getLong(obj, j);
                        zzA3 = zzjj.zzA(i8 << 3);
                        zzB = zzjj.zzB(j3);
                        zzo = zzA3 + zzB;
                        i5 += zzo;
                        break;
                    }
                case 4:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i11 = unsafe.getInt(obj, j);
                        zzA4 = zzjj.zzA(i8 << 3);
                        zzv = zzjj.zzv(i11);
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 5:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzA = zzjj.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i5 += zzo;
                        break;
                    }
                case 6:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzjj.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 7:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzA5 = zzjj.zzA(i8 << 3);
                        zzo = zzA5 + 1;
                        i5 += zzo;
                        break;
                    }
                case 8:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj, j);
                        if (object instanceof zzjb) {
                            zzA6 = zzjj.zzA(i8 << 3);
                            zzd = ((zzjb) object).zzd();
                            zzA7 = zzjj.zzA(zzd);
                            i5 = zzA7 + zzd + zzA6 + i5;
                            break;
                        } else {
                            zzA4 = zzjj.zzA(i8 << 3);
                            zzv = zzjj.zzy((String) object);
                            zzo = zzv + zzA4;
                            i5 += zzo;
                            break;
                        }
                    }
                case 9:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzo = zzlw.zzo(i8, unsafe.getObject(obj, j), zzE(i4));
                        i5 += zzo;
                        break;
                    }
                case 10:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzA6 = zzjj.zzA(i8 << 3);
                        zzd = ((zzjb) unsafe.getObject(obj, j)).zzd();
                        zzA7 = zzjj.zzA(zzd);
                        i5 = zzA7 + zzd + zzA6 + i5;
                        break;
                    }
                case 11:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i12 = unsafe.getInt(obj, j);
                        zzA4 = zzjj.zzA(i8 << 3);
                        zzv = zzjj.zzA(i12);
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 12:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i13 = unsafe.getInt(obj, j);
                        zzA4 = zzjj.zzA(i8 << 3);
                        zzv = zzjj.zzv(i13);
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 13:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzA2 = zzjj.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 14:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzA = zzjj.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i5 += zzo;
                        break;
                    }
                case 15:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i14 = unsafe.getInt(obj, j);
                        zzA4 = zzjj.zzA(i8 << 3);
                        zzv = zzjj.zzA((i14 >> 31) ^ (i14 + i14));
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 16:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        long j4 = unsafe.getLong(obj, j);
                        zzA8 = zzjj.zzA(i8 << 3);
                        zzB2 = zzjj.zzB((j4 >> 63) ^ (j4 + j4));
                        zzo = zzB2 + zzA8;
                        i5 += zzo;
                        break;
                    }
                case 17:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        zzo = zzjj.zzu(i8, (zzlj) unsafe.getObject(obj, j), zzE(i4));
                        i5 += zzo;
                        break;
                    }
                case 18:
                    zzo = zzlw.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 19:
                    zzo = zzlw.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 20:
                    zzo = zzlw.zzm(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 21:
                    zzo = zzlw.zzx(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 22:
                    zzo = zzlw.zzk(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 23:
                    zzo = zzlw.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 24:
                    zzo = zzlw.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 25:
                    zzo = zzlw.zza(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 26:
                    zzo = zzlw.zzu(i8, (List) unsafe.getObject(obj, j));
                    i5 += zzo;
                    break;
                case 27:
                    zzo = zzlw.zzp(i8, (List) unsafe.getObject(obj, j), zzE(i4));
                    i5 += zzo;
                    break;
                case 28:
                    zzo = zzlw.zzc(i8, (List) unsafe.getObject(obj, j));
                    i5 += zzo;
                    break;
                case 29:
                    zzo = zzlw.zzv(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 30:
                    zzo = zzlw.zzd(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 31:
                    zzo = zzlw.zzf(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 32:
                    zzo = zzlw.zzh(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 33:
                    zzo = zzlw.zzq(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 34:
                    zzo = zzlw.zzs(i8, (List) unsafe.getObject(obj, j), false);
                    i5 += zzo;
                    break;
                case 35:
                    zzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjj.zzz(i8);
                        zzA9 = zzjj.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 36:
                    zzi = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjj.zzz(i8);
                        zzA9 = zzjj.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 37:
                    zzi = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjj.zzz(i8);
                        zzA9 = zzjj.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 38:
                    zzi = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjj.zzz(i8);
                        zzA9 = zzjj.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 39:
                    zzi = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjj.zzz(i8);
                        zzA9 = zzjj.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 40:
                    zzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjj.zzz(i8);
                        zzA9 = zzjj.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 41:
                    zzi = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjj.zzz(i8);
                        zzA9 = zzjj.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 42:
                    zzi = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjj.zzz(i8);
                        zzA9 = zzjj.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 43:
                    zzi = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjj.zzz(i8);
                        zzA9 = zzjj.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 44:
                    zzi = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjj.zzz(i8);
                        zzA9 = zzjj.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 45:
                    zzi = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjj.zzz(i8);
                        zzA9 = zzjj.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 46:
                    zzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjj.zzz(i8);
                        zzA9 = zzjj.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 47:
                    zzi = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjj.zzz(i8);
                        zzA9 = zzjj.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 48:
                    zzi = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (zzi <= 0) {
                        break;
                    } else {
                        zzz = zzjj.zzz(i8);
                        zzA9 = zzjj.zzA(zzi);
                        i2 = zzA9 + zzz + zzi;
                        i5 += i2;
                        break;
                    }
                case 49:
                    zzo = zzlw.zzj(i8, (List) unsafe.getObject(obj, j), zzE(i4));
                    i5 += zzo;
                    break;
                case 50:
                    zzle.zza(i8, unsafe.getObject(obj, j), zzF(i4));
                    break;
                case 51:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        zzA = zzjj.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i5 += zzo;
                        break;
                    }
                case 52:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        zzA2 = zzjj.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 53:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        long zzC = zzC(obj, j);
                        zzA3 = zzjj.zzA(i8 << 3);
                        zzB = zzjj.zzB(zzC);
                        zzo = zzA3 + zzB;
                        i5 += zzo;
                        break;
                    }
                case 54:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        long zzC2 = zzC(obj, j);
                        zzA3 = zzjj.zzA(i8 << 3);
                        zzB = zzjj.zzB(zzC2);
                        zzo = zzA3 + zzB;
                        i5 += zzo;
                        break;
                    }
                case 55:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        int zzr = zzr(obj, j);
                        zzA4 = zzjj.zzA(i8 << 3);
                        zzv = zzjj.zzv(zzr);
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 56:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        zzA = zzjj.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i5 += zzo;
                        break;
                    }
                case 57:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        zzA2 = zzjj.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 58:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        zzA5 = zzjj.zzA(i8 << 3);
                        zzo = zzA5 + 1;
                        i5 += zzo;
                        break;
                    }
                case 59:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj, j);
                        if (object2 instanceof zzjb) {
                            zzA10 = zzjj.zzA(i8 << 3);
                            zzd2 = ((zzjb) object2).zzd();
                            zzA11 = zzjj.zzA(zzd2);
                            i2 = zzA11 + zzd2 + zzA10;
                            i5 += i2;
                            break;
                        } else {
                            zzA4 = zzjj.zzA(i8 << 3);
                            zzv = zzjj.zzy((String) object2);
                            zzo = zzv + zzA4;
                            i5 += zzo;
                            break;
                        }
                    }
                case 60:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        zzo = zzlw.zzo(i8, unsafe.getObject(obj, j), zzE(i4));
                        i5 += zzo;
                        break;
                    }
                case 61:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        zzA10 = zzjj.zzA(i8 << 3);
                        zzd2 = ((zzjb) unsafe.getObject(obj, j)).zzd();
                        zzA11 = zzjj.zzA(zzd2);
                        i2 = zzA11 + zzd2 + zzA10;
                        i5 += i2;
                        break;
                    }
                case 62:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        int zzr2 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i8 << 3);
                        zzv = zzjj.zzA(zzr2);
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 63:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        int zzr3 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i8 << 3);
                        zzv = zzjj.zzv(zzr3);
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 64:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        zzA2 = zzjj.zzA(i8 << 3);
                        zzo = zzA2 + 4;
                        i5 += zzo;
                        break;
                    }
                case 65:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        zzA = zzjj.zzA(i8 << 3);
                        zzo = zzA + 8;
                        i5 += zzo;
                        break;
                    }
                case 66:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        int zzr4 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i8 << 3);
                        zzv = zzjj.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        zzo = zzv + zzA4;
                        i5 += zzo;
                        break;
                    }
                case 67:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        long zzC3 = zzC(obj, j);
                        zzA8 = zzjj.zzA(i8 << 3);
                        zzB2 = zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        zzo = zzB2 + zzA8;
                        i5 += zzo;
                        break;
                    }
                case 68:
                    if (!zzR(obj, i8, i4)) {
                        break;
                    } else {
                        zzo = zzjj.zzu(i8, (zzlj) unsafe.getObject(obj, j), zzE(i4));
                        i5 += zzo;
                        break;
                    }
            }
            i4 += 3;
            i3 = 1048575;
        }
        zzml zzmlVar = this.zzn;
        int zza2 = zzmlVar.zza(zzmlVar.zzc(obj)) + i5;
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return zza2;
    }

    private final int zzq(Object obj) {
        int zzA;
        int zzA2;
        int zzA3;
        int zzB;
        int zzA4;
        int zzv;
        int zzA5;
        int zzA6;
        int zzd;
        int zzA7;
        int zzo;
        int zzi;
        int zzz;
        int zzA8;
        int i;
        Unsafe unsafe = zzb;
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzc.length; i3 += 3) {
            int zzB2 = zzB(i3);
            int zzA9 = zzA(zzB2);
            int i4 = this.zzc[i3];
            long j = zzB2 & 1048575;
            if (zzA9 >= zzju.zzJ.zza() && zzA9 <= zzju.zzW.zza()) {
                int i5 = this.zzc[i3 + 2];
            }
            switch (zzA9) {
                case 0:
                    if (zzO(obj, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 1:
                    if (zzO(obj, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if (zzO(obj, i3)) {
                        long zzd2 = zzmv.zzd(obj, j);
                        zzA3 = zzjj.zzA(i4 << 3);
                        zzB = zzjj.zzB(zzd2);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (zzO(obj, i3)) {
                        long zzd3 = zzmv.zzd(obj, j);
                        zzA3 = zzjj.zzA(i4 << 3);
                        zzB = zzjj.zzB(zzd3);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (zzO(obj, i3)) {
                        int zzc = zzmv.zzc(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzv(zzc);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (zzO(obj, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if (zzO(obj, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if (zzO(obj, i3)) {
                        zzA5 = zzjj.zzA(i4 << 3);
                        zzo = zzA5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if (zzO(obj, i3)) {
                        Object zzf = zzmv.zzf(obj, j);
                        if (zzf instanceof zzjb) {
                            zzA6 = zzjj.zzA(i4 << 3);
                            zzd = ((zzjb) zzf).zzd();
                            zzA7 = zzjj.zzA(zzd);
                            i = zzA7 + zzd + zzA6;
                            i2 += i;
                        } else {
                            zzA4 = zzjj.zzA(i4 << 3);
                            zzv = zzjj.zzy((String) zzf);
                            zzo = zzv + zzA4;
                            break;
                        }
                    } else {
                        continue;
                    }
                case 9:
                    if (zzO(obj, i3)) {
                        zzo = zzlw.zzo(i4, zzmv.zzf(obj, j), zzE(i3));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if (zzO(obj, i3)) {
                        zzA6 = zzjj.zzA(i4 << 3);
                        zzd = ((zzjb) zzmv.zzf(obj, j)).zzd();
                        zzA7 = zzjj.zzA(zzd);
                        i = zzA7 + zzd + zzA6;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 11:
                    if (zzO(obj, i3)) {
                        int zzc2 = zzmv.zzc(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzA(zzc2);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (zzO(obj, i3)) {
                        int zzc3 = zzmv.zzc(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzv(zzc3);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (zzO(obj, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if (zzO(obj, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if (zzO(obj, i3)) {
                        int zzc4 = zzmv.zzc(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzA((zzc4 >> 31) ^ (zzc4 + zzc4));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (zzO(obj, i3)) {
                        long zzd4 = zzmv.zzd(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzB((zzd4 >> 63) ^ (zzd4 + zzd4));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (zzO(obj, i3)) {
                        zzo = zzjj.zzu(i4, (zzlj) zzmv.zzf(obj, j), zzE(i3));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    zzo = zzlw.zzh(i4, (List) zzmv.zzf(obj, j), false);
                    break;
                case 19:
                    zzo = zzlw.zzf(i4, (List) zzmv.zzf(obj, j), false);
                    break;
                case 20:
                    zzo = zzlw.zzm(i4, (List) zzmv.zzf(obj, j), false);
                    break;
                case 21:
                    zzo = zzlw.zzx(i4, (List) zzmv.zzf(obj, j), false);
                    break;
                case 22:
                    zzo = zzlw.zzk(i4, (List) zzmv.zzf(obj, j), false);
                    break;
                case 23:
                    zzo = zzlw.zzh(i4, (List) zzmv.zzf(obj, j), false);
                    break;
                case 24:
                    zzo = zzlw.zzf(i4, (List) zzmv.zzf(obj, j), false);
                    break;
                case 25:
                    zzo = zzlw.zza(i4, (List) zzmv.zzf(obj, j), false);
                    break;
                case 26:
                    zzo = zzlw.zzu(i4, (List) zzmv.zzf(obj, j));
                    break;
                case 27:
                    zzo = zzlw.zzp(i4, (List) zzmv.zzf(obj, j), zzE(i3));
                    break;
                case 28:
                    zzo = zzlw.zzc(i4, (List) zzmv.zzf(obj, j));
                    break;
                case 29:
                    zzo = zzlw.zzv(i4, (List) zzmv.zzf(obj, j), false);
                    break;
                case 30:
                    zzo = zzlw.zzd(i4, (List) zzmv.zzf(obj, j), false);
                    break;
                case 31:
                    zzo = zzlw.zzf(i4, (List) zzmv.zzf(obj, j), false);
                    break;
                case 32:
                    zzo = zzlw.zzh(i4, (List) zzmv.zzf(obj, j), false);
                    break;
                case 33:
                    zzo = zzlw.zzq(i4, (List) zzmv.zzf(obj, j), false);
                    break;
                case 34:
                    zzo = zzlw.zzs(i4, (List) zzmv.zzf(obj, j), false);
                    break;
                case 35:
                    zzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 36:
                    zzi = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 37:
                    zzi = zzlw.zzn((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 38:
                    zzi = zzlw.zzy((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 39:
                    zzi = zzlw.zzl((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 40:
                    zzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 41:
                    zzi = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 42:
                    zzi = zzlw.zzb((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 43:
                    zzi = zzlw.zzw((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 44:
                    zzi = zzlw.zze((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 45:
                    zzi = zzlw.zzg((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 46:
                    zzi = zzlw.zzi((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 47:
                    zzi = zzlw.zzr((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 48:
                    zzi = zzlw.zzt((List) unsafe.getObject(obj, j));
                    if (zzi > 0) {
                        zzz = zzjj.zzz(i4);
                        zzA8 = zzjj.zzA(zzi);
                        i = zzA8 + zzz + zzi;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 49:
                    zzo = zzlw.zzj(i4, (List) zzmv.zzf(obj, j), zzE(i3));
                    break;
                case 50:
                    zzle.zza(i4, zzmv.zzf(obj, j), zzF(i3));
                    continue;
                case 51:
                    if (zzR(obj, i4, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 52:
                    if (zzR(obj, i4, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 53:
                    if (zzR(obj, i4, i3)) {
                        long zzC = zzC(obj, j);
                        zzA3 = zzjj.zzA(i4 << 3);
                        zzB = zzjj.zzB(zzC);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (zzR(obj, i4, i3)) {
                        long zzC2 = zzC(obj, j);
                        zzA3 = zzjj.zzA(i4 << 3);
                        zzB = zzjj.zzB(zzC2);
                        zzo = zzB + zzA3;
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (zzR(obj, i4, i3)) {
                        int zzr = zzr(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzv(zzr);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (zzR(obj, i4, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 57:
                    if (zzR(obj, i4, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 58:
                    if (zzR(obj, i4, i3)) {
                        zzA5 = zzjj.zzA(i4 << 3);
                        zzo = zzA5 + 1;
                        break;
                    } else {
                        continue;
                    }
                case 59:
                    if (zzR(obj, i4, i3)) {
                        Object zzf2 = zzmv.zzf(obj, j);
                        if (zzf2 instanceof zzjb) {
                            zzA6 = zzjj.zzA(i4 << 3);
                            zzd = ((zzjb) zzf2).zzd();
                            zzA7 = zzjj.zzA(zzd);
                            i = zzA7 + zzd + zzA6;
                            i2 += i;
                        } else {
                            zzA4 = zzjj.zzA(i4 << 3);
                            zzv = zzjj.zzy((String) zzf2);
                            zzo = zzv + zzA4;
                            break;
                        }
                    } else {
                        continue;
                    }
                case 60:
                    if (zzR(obj, i4, i3)) {
                        zzo = zzlw.zzo(i4, zzmv.zzf(obj, j), zzE(i3));
                        break;
                    } else {
                        continue;
                    }
                case 61:
                    if (zzR(obj, i4, i3)) {
                        zzA6 = zzjj.zzA(i4 << 3);
                        zzd = ((zzjb) zzmv.zzf(obj, j)).zzd();
                        zzA7 = zzjj.zzA(zzd);
                        i = zzA7 + zzd + zzA6;
                        i2 += i;
                    } else {
                        continue;
                    }
                case 62:
                    if (zzR(obj, i4, i3)) {
                        int zzr2 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzA(zzr2);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (zzR(obj, i4, i3)) {
                        int zzr3 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzv(zzr3);
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (zzR(obj, i4, i3)) {
                        zzA2 = zzjj.zzA(i4 << 3);
                        zzo = zzA2 + 4;
                        break;
                    } else {
                        continue;
                    }
                case 65:
                    if (zzR(obj, i4, i3)) {
                        zzA = zzjj.zzA(i4 << 3);
                        zzo = zzA + 8;
                        break;
                    } else {
                        continue;
                    }
                case 66:
                    if (zzR(obj, i4, i3)) {
                        int zzr4 = zzr(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzA((zzr4 >> 31) ^ (zzr4 + zzr4));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (zzR(obj, i4, i3)) {
                        long zzC3 = zzC(obj, j);
                        zzA4 = zzjj.zzA(i4 << 3);
                        zzv = zzjj.zzB((zzC3 >> 63) ^ (zzC3 + zzC3));
                        zzo = zzv + zzA4;
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (zzR(obj, i4, i3)) {
                        zzo = zzjj.zzu(i4, (zzlj) zzmv.zzf(obj, j), zzE(i3));
                        break;
                    } else {
                        continue;
                    }
                default:
            }
            i2 += zzo;
        }
        zzml zzmlVar = this.zzn;
        return zzmlVar.zza(zzmlVar.zzc(obj)) + i2;
    }

    private static int zzr(Object obj, long j) {
        return ((Integer) zzmv.zzf(obj, j)).intValue();
    }

    private final int zzs(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        Object zzF = zzF(i3);
        Object object = unsafe.getObject(obj, j);
        if (!((zzld) object).zze()) {
            zzld zzb2 = zzld.zza().zzb();
            zzle.zzb(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzlc zzlcVar = (zzlc) zzF;
        throw null;
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzio zzioVar) throws IOException {
        Unsafe unsafe = zzb;
        long j2 = this.zzc[i8 + 2] & 1048575;
        switch (i7) {
            case 51:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Double.valueOf(Double.longBitsToDouble(zzip.zzn(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 52:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Float.valueOf(Float.intBitsToFloat(zzip.zzb(bArr, i))));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 53:
            case 54:
                if (i5 == 0) {
                    int zzm = zzip.zzm(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzioVar.zzb));
                    unsafe.putInt(obj, j2, i4);
                    return zzm;
                }
                break;
            case 55:
            case 62:
                if (i5 == 0) {
                    int zzj = zzip.zzj(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzioVar.zza));
                    unsafe.putInt(obj, j2, i4);
                    return zzj;
                }
                break;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(obj, j, Long.valueOf(zzip.zzn(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 8;
                }
                break;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(obj, j, Integer.valueOf(zzip.zzb(bArr, i)));
                    unsafe.putInt(obj, j2, i4);
                    return i + 4;
                }
                break;
            case 58:
                if (i5 == 0) {
                    int zzm2 = zzip.zzm(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, Boolean.valueOf(zzioVar.zzb != 0));
                    unsafe.putInt(obj, j2, i4);
                    return zzm2;
                }
                break;
            case 59:
                if (i5 == 2) {
                    int zzj2 = zzip.zzj(bArr, i, zzioVar);
                    int i9 = zzioVar.zza;
                    if (i9 == 0) {
                        unsafe.putObject(obj, j, "");
                    } else if ((i6 & 536870912) != 0 && !zzna.zzf(bArr, zzj2, zzj2 + i9)) {
                        throw zzkm.zzc();
                    } else {
                        unsafe.putObject(obj, j, new String(bArr, zzj2, i9, zzkk.zzb));
                        zzj2 += i9;
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzj2;
                }
                break;
            case 60:
                if (i5 == 2) {
                    int zzd = zzip.zzd(zzE(i8), bArr, i, i2, zzioVar);
                    Object object = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object == null) {
                        unsafe.putObject(obj, j, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzkk.zzg(object, zzioVar.zzc));
                    }
                    unsafe.putInt(obj, j2, i4);
                    return zzd;
                }
                break;
            case 61:
                if (i5 == 2) {
                    int zza2 = zzip.zza(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, zzioVar.zzc);
                    unsafe.putInt(obj, j2, i4);
                    return zza2;
                }
                break;
            case 63:
                if (i5 == 0) {
                    int zzj3 = zzip.zzj(bArr, i, zzioVar);
                    int i10 = zzioVar.zza;
                    zzkg zzD = zzD(i8);
                    if (zzD != null && !zzD.zza(i10)) {
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
                    int zzj4 = zzip.zzj(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, Integer.valueOf(zzjf.zzb(zzioVar.zza)));
                    unsafe.putInt(obj, j2, i4);
                    return zzj4;
                }
                break;
            case 67:
                if (i5 == 0) {
                    int zzm3 = zzip.zzm(bArr, i, zzioVar);
                    unsafe.putObject(obj, j, Long.valueOf(zzjf.zzc(zzioVar.zzb)));
                    unsafe.putInt(obj, j2, i4);
                    return zzm3;
                }
                break;
            case 68:
                if (i5 == 3) {
                    int zzc = zzip.zzc(zzE(i8), bArr, i, i2, (i3 & (-8)) | 4, zzioVar);
                    Object object2 = unsafe.getInt(obj, j2) == i4 ? unsafe.getObject(obj, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(obj, j, zzioVar.zzc);
                    } else {
                        unsafe.putObject(obj, j, zzkk.zzg(object2, zzioVar.zzc));
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
    private final int zzu(Object obj, byte[] bArr, int i, int i2, zzio zzioVar) throws IOException {
        byte b;
        int i3;
        int zzw;
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
        zzlm<T> zzlmVar = this;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i14 = i2;
        zzio zzioVar2 = zzioVar;
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
                i3 = zzip.zzk(b2, bArr2, i22, zzioVar2);
                b = zzioVar2.zza;
            } else {
                b = b2;
                i3 = i22;
            }
            int i23 = b >>> 3;
            int i24 = b & 7;
            if (i23 > i18) {
                zzw = zzlmVar.zzx(i23, i19 / 3);
            } else {
                zzw = zzlmVar.zzw(i23);
            }
            int i25 = zzw;
            if (i25 == i15) {
                i9 = i3;
                i4 = i23;
                unsafe = unsafe5;
                i5 = 0;
            } else {
                int[] iArr = zzlmVar.zzc;
                int i26 = iArr[i25 + 1];
                int zzA = zzA(i26);
                Unsafe unsafe6 = unsafe5;
                long j = i26 & i16;
                if (zzA <= 17) {
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
                    switch (zzA) {
                        case 0:
                            i11 = i3;
                            i12 = i21;
                            i13 = i10;
                            i4 = i23;
                            unsafe3 = unsafe2;
                            if (i24 == 1) {
                                zzmv.zzo(obj2, j, Double.longBitsToDouble(zzip.zzn(bArr2, i11)));
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
                                zzmv.zzp(obj2, j, Float.intBitsToFloat(zzip.zzb(bArr2, i11)));
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
                                int zzm = zzip.zzm(bArr2, i11, zzioVar2);
                                unsafe3.putLong(obj, j, zzioVar2.zzb);
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
                                i17 = zzip.zzj(bArr2, i11, zzioVar2);
                                unsafe3.putInt(obj2, j, zzioVar2.zza);
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
                                unsafe3.putLong(obj, j, zzip.zzn(bArr2, i3));
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
                                unsafe3.putInt(obj2, j, zzip.zzb(bArr2, i3));
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
                                i17 = zzip.zzm(bArr2, i3, zzioVar2);
                                zzmv.zzm(obj2, j, zzioVar2.zzb != 0);
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
                                    i17 = zzip.zzg(bArr2, i3, zzioVar2);
                                } else {
                                    i17 = zzip.zzh(bArr2, i3, zzioVar2);
                                }
                                unsafe3.putObject(obj2, j, zzioVar2.zzc);
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
                                i17 = zzip.zzd(zzlmVar.zzE(i13), bArr2, i3, i14, zzioVar2);
                                Object object = unsafe3.getObject(obj2, j);
                                if (object == null) {
                                    unsafe3.putObject(obj2, j, zzioVar2.zzc);
                                } else {
                                    unsafe3.putObject(obj2, j, zzkk.zzg(object, zzioVar2.zzc));
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
                                i17 = zzip.zza(bArr2, i3, zzioVar2);
                                unsafe3.putObject(obj2, j, zzioVar2.zzc);
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
                                i17 = zzip.zzj(bArr2, i3, zzioVar2);
                                unsafe3.putInt(obj2, j, zzioVar2.zza);
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
                                i17 = zzip.zzj(bArr2, i3, zzioVar2);
                                unsafe3.putInt(obj2, j, zzjf.zzb(zzioVar2.zza));
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
                                int zzm2 = zzip.zzm(bArr2, i3, zzioVar2);
                                i12 = i21;
                                int i31 = i10;
                                i4 = i23;
                                unsafe2.putLong(obj, j, zzjf.zzc(zzioVar2.zzb));
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
                    if (zzA != 27) {
                        i5 = i25;
                        if (zzA <= 49) {
                            i7 = i20;
                            i8 = i33;
                            unsafe = unsafe6;
                            i17 = zzv(obj, bArr, i32, i2, b, i4, i24, i5, i26, zzA, j, zzioVar);
                        } else {
                            i6 = i32;
                            i7 = i20;
                            unsafe = unsafe6;
                            i8 = i33;
                            if (zzA != 50) {
                                i17 = zzt(obj, bArr, i6, i2, b, i4, i24, i26, zzA, j, i5, zzioVar);
                            } else if (i24 == 2) {
                                i17 = zzs(obj, bArr, i6, i2, i5, j, zzioVar);
                            }
                        }
                    } else if (i24 == 2) {
                        zzkj zzkjVar = (zzkj) unsafe6.getObject(obj2, j);
                        if (!zzkjVar.zzc()) {
                            int size = zzkjVar.size();
                            zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
                            unsafe6.putObject(obj2, j, zzkjVar);
                        }
                        i17 = zzip.zze(zzlmVar.zzE(i25), b, bArr, i32, i2, zzkjVar, zzioVar);
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
            i17 = zzip.zzi(b, bArr, i9, i2, zzd(obj), zzioVar);
            zzlmVar = this;
            obj2 = obj;
            bArr2 = bArr;
            i14 = i2;
            zzioVar2 = zzioVar;
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
        throw zzkm.zze();
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
    private final int zzv(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzio zzioVar) throws IOException {
        int i8;
        int i9;
        int i10;
        int i11;
        int zzj;
        int i12;
        int i13 = i;
        Unsafe unsafe = zzb;
        zzkj zzkjVar = (zzkj) unsafe.getObject(obj, j2);
        if (!zzkjVar.zzc()) {
            int size = zzkjVar.size();
            zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj, j2, zzkjVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzjl zzjlVar = (zzjl) zzkjVar;
                    int zzj2 = zzip.zzj(bArr, i13, zzioVar);
                    int i14 = zzioVar.zza + zzj2;
                    while (zzj2 < i14) {
                        zzjlVar.zze(Double.longBitsToDouble(zzip.zzn(bArr, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i14) {
                        return zzj2;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 1) {
                    zzjl zzjlVar2 = (zzjl) zzkjVar;
                    zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i)));
                    while (true) {
                        i8 = i13 + 8;
                        if (i8 < i2) {
                            i13 = zzip.zzj(bArr, i8, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzjlVar2.zze(Double.longBitsToDouble(zzip.zzn(bArr, i13)));
                            }
                        }
                    }
                    return i8;
                }
                return i13;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzjv zzjvVar = (zzjv) zzkjVar;
                    int zzj3 = zzip.zzj(bArr, i13, zzioVar);
                    int i15 = zzioVar.zza + zzj3;
                    while (zzj3 < i15) {
                        zzjvVar.zze(Float.intBitsToFloat(zzip.zzb(bArr, zzj3)));
                        zzj3 += 4;
                    }
                    if (zzj3 == i15) {
                        return zzj3;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 5) {
                    zzjv zzjvVar2 = (zzjv) zzkjVar;
                    zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i)));
                    while (true) {
                        i9 = i13 + 4;
                        if (i9 < i2) {
                            i13 = zzip.zzj(bArr, i9, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzjvVar2.zze(Float.intBitsToFloat(zzip.zzb(bArr, i13)));
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
                    zzky zzkyVar = (zzky) zzkjVar;
                    int zzj4 = zzip.zzj(bArr, i13, zzioVar);
                    int i16 = zzioVar.zza + zzj4;
                    while (zzj4 < i16) {
                        zzj4 = zzip.zzm(bArr, zzj4, zzioVar);
                        zzkyVar.zzg(zzioVar.zzb);
                    }
                    if (zzj4 == i16) {
                        return zzj4;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zzky zzkyVar2 = (zzky) zzkjVar;
                    int zzm = zzip.zzm(bArr, i13, zzioVar);
                    zzkyVar2.zzg(zzioVar.zzb);
                    while (zzm < i2) {
                        int zzj5 = zzip.zzj(bArr, zzm, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzm;
                        }
                        zzm = zzip.zzm(bArr, zzj5, zzioVar);
                        zzkyVar2.zzg(zzioVar.zzb);
                    }
                    return zzm;
                }
                return i13;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zzip.zzf(bArr, i13, zzkjVar, zzioVar);
                }
                if (i5 == 0) {
                    return zzip.zzl(i3, bArr, i, i2, zzkjVar, zzioVar);
                }
                return i13;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzky zzkyVar3 = (zzky) zzkjVar;
                    int zzj6 = zzip.zzj(bArr, i13, zzioVar);
                    int i17 = zzioVar.zza + zzj6;
                    while (zzj6 < i17) {
                        zzkyVar3.zzg(zzip.zzn(bArr, zzj6));
                        zzj6 += 8;
                    }
                    if (zzj6 == i17) {
                        return zzj6;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 1) {
                    zzky zzkyVar4 = (zzky) zzkjVar;
                    zzkyVar4.zzg(zzip.zzn(bArr, i));
                    while (true) {
                        i10 = i13 + 8;
                        if (i10 < i2) {
                            i13 = zzip.zzj(bArr, i10, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzkyVar4.zzg(zzip.zzn(bArr, i13));
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
                    zzkd zzkdVar = (zzkd) zzkjVar;
                    int zzj7 = zzip.zzj(bArr, i13, zzioVar);
                    int i18 = zzioVar.zza + zzj7;
                    while (zzj7 < i18) {
                        zzkdVar.zzh(zzip.zzb(bArr, zzj7));
                        zzj7 += 4;
                    }
                    if (zzj7 == i18) {
                        return zzj7;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 5) {
                    zzkd zzkdVar2 = (zzkd) zzkjVar;
                    zzkdVar2.zzh(zzip.zzb(bArr, i));
                    while (true) {
                        i11 = i13 + 4;
                        if (i11 < i2) {
                            i13 = zzip.zzj(bArr, i11, zzioVar);
                            if (i3 == zzioVar.zza) {
                                zzkdVar2.zzh(zzip.zzb(bArr, i13));
                            }
                        }
                    }
                    return i11;
                }
                return i13;
            case 25:
            case 42:
                if (i5 == 2) {
                    zziq zziqVar = (zziq) zzkjVar;
                    zzj = zzip.zzj(bArr, i13, zzioVar);
                    int i19 = zzioVar.zza + zzj;
                    while (zzj < i19) {
                        zzj = zzip.zzm(bArr, zzj, zzioVar);
                        zziqVar.zze(zzioVar.zzb != 0);
                    }
                    if (zzj != i19) {
                        throw zzkm.zzf();
                    }
                    return zzj;
                }
                if (i5 == 0) {
                    zziq zziqVar2 = (zziq) zzkjVar;
                    int zzm2 = zzip.zzm(bArr, i13, zzioVar);
                    zziqVar2.zze(zzioVar.zzb != 0);
                    while (zzm2 < i2) {
                        int zzj8 = zzip.zzj(bArr, zzm2, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzm2;
                        }
                        zzm2 = zzip.zzm(bArr, zzj8, zzioVar);
                        zziqVar2.zze(zzioVar.zzb != 0);
                    }
                    return zzm2;
                }
                return i13;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        i13 = zzip.zzj(bArr, i13, zzioVar);
                        int i20 = zzioVar.zza;
                        if (i20 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i20 == 0) {
                            zzkjVar.add("");
                            while (i13 < i2) {
                                int zzj9 = zzip.zzj(bArr, i13, zzioVar);
                                if (i3 == zzioVar.zza) {
                                    i13 = zzip.zzj(bArr, zzj9, zzioVar);
                                    i20 = zzioVar.zza;
                                    if (i20 < 0) {
                                        throw zzkm.zzd();
                                    }
                                    if (i20 == 0) {
                                        zzkjVar.add("");
                                    } else {
                                        zzkjVar.add(new String(bArr, i13, i20, zzkk.zzb));
                                        i13 += i20;
                                        while (i13 < i2) {
                                        }
                                    }
                                }
                            }
                        } else {
                            zzkjVar.add(new String(bArr, i13, i20, zzkk.zzb));
                            i13 += i20;
                            while (i13 < i2) {
                            }
                        }
                    } else {
                        i13 = zzip.zzj(bArr, i13, zzioVar);
                        int i21 = zzioVar.zza;
                        if (i21 < 0) {
                            throw zzkm.zzd();
                        }
                        if (i21 == 0) {
                            zzkjVar.add("");
                            while (i13 < i2) {
                                int zzj10 = zzip.zzj(bArr, i13, zzioVar);
                                if (i3 == zzioVar.zza) {
                                    i13 = zzip.zzj(bArr, zzj10, zzioVar);
                                    int i22 = zzioVar.zza;
                                    if (i22 < 0) {
                                        throw zzkm.zzd();
                                    }
                                    if (i22 == 0) {
                                        zzkjVar.add("");
                                    } else {
                                        i12 = i13 + i22;
                                        if (zzna.zzf(bArr, i13, i12)) {
                                            zzkjVar.add(new String(bArr, i13, i22, zzkk.zzb));
                                            i13 = i12;
                                            while (i13 < i2) {
                                            }
                                        } else {
                                            throw zzkm.zzc();
                                        }
                                    }
                                }
                            }
                        } else {
                            i12 = i13 + i21;
                            if (zzna.zzf(bArr, i13, i12)) {
                                zzkjVar.add(new String(bArr, i13, i21, zzkk.zzb));
                                i13 = i12;
                                while (i13 < i2) {
                                }
                            } else {
                                throw zzkm.zzc();
                            }
                        }
                    }
                }
                return i13;
            case 27:
                if (i5 == 2) {
                    return zzip.zze(zzE(i6), i3, bArr, i, i2, zzkjVar, zzioVar);
                }
                return i13;
            case 28:
                if (i5 == 2) {
                    int zzj11 = zzip.zzj(bArr, i13, zzioVar);
                    int i23 = zzioVar.zza;
                    if (i23 >= 0) {
                        if (i23 <= bArr.length - zzj11) {
                            if (i23 == 0) {
                                zzkjVar.add(zzjb.zzb);
                                while (zzj11 < i2) {
                                    int zzj12 = zzip.zzj(bArr, zzj11, zzioVar);
                                    if (i3 != zzioVar.zza) {
                                        return zzj11;
                                    }
                                    zzj11 = zzip.zzj(bArr, zzj12, zzioVar);
                                    i23 = zzioVar.zza;
                                    if (i23 >= 0) {
                                        if (i23 > bArr.length - zzj11) {
                                            throw zzkm.zzf();
                                        }
                                        if (i23 == 0) {
                                            zzkjVar.add(zzjb.zzb);
                                        } else {
                                            zzkjVar.add(zzjb.zzl(bArr, zzj11, i23));
                                            zzj11 += i23;
                                            while (zzj11 < i2) {
                                            }
                                        }
                                    } else {
                                        throw zzkm.zzd();
                                    }
                                }
                                return zzj11;
                            }
                            zzkjVar.add(zzjb.zzl(bArr, zzj11, i23));
                            zzj11 += i23;
                            while (zzj11 < i2) {
                            }
                            return zzj11;
                        }
                        throw zzkm.zzf();
                    }
                    throw zzkm.zzd();
                }
                return i13;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zzj = zzip.zzl(i3, bArr, i, i2, zzkjVar, zzioVar);
                    }
                    return i13;
                }
                zzj = zzip.zzf(bArr, i13, zzkjVar, zzioVar);
                zzkc zzkcVar = (zzkc) obj;
                zzmm zzmmVar = zzkcVar.zzc;
                if (zzmmVar == zzmm.zzc()) {
                    zzmmVar = null;
                }
                Object zzC = zzlw.zzC(i4, zzkjVar, zzD(i6), zzmmVar, this.zzn);
                if (zzC != null) {
                    zzkcVar.zzc = (zzmm) zzC;
                    return zzj;
                }
                return zzj;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzkd zzkdVar3 = (zzkd) zzkjVar;
                    int zzj13 = zzip.zzj(bArr, i13, zzioVar);
                    int i24 = zzioVar.zza + zzj13;
                    while (zzj13 < i24) {
                        zzj13 = zzip.zzj(bArr, zzj13, zzioVar);
                        zzkdVar3.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    if (zzj13 == i24) {
                        return zzj13;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zzkd zzkdVar4 = (zzkd) zzkjVar;
                    int zzj14 = zzip.zzj(bArr, i13, zzioVar);
                    zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    while (zzj14 < i2) {
                        int zzj15 = zzip.zzj(bArr, zzj14, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzj14;
                        }
                        zzj14 = zzip.zzj(bArr, zzj15, zzioVar);
                        zzkdVar4.zzh(zzjf.zzb(zzioVar.zza));
                    }
                    return zzj14;
                }
                return i13;
            case 34:
            case 48:
                if (i5 == 2) {
                    zzky zzkyVar5 = (zzky) zzkjVar;
                    int zzj16 = zzip.zzj(bArr, i13, zzioVar);
                    int i25 = zzioVar.zza + zzj16;
                    while (zzj16 < i25) {
                        zzj16 = zzip.zzm(bArr, zzj16, zzioVar);
                        zzkyVar5.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    if (zzj16 == i25) {
                        return zzj16;
                    }
                    throw zzkm.zzf();
                }
                if (i5 == 0) {
                    zzky zzkyVar6 = (zzky) zzkjVar;
                    int zzm3 = zzip.zzm(bArr, i13, zzioVar);
                    zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    while (zzm3 < i2) {
                        int zzj17 = zzip.zzj(bArr, zzm3, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzm3;
                        }
                        zzm3 = zzip.zzm(bArr, zzj17, zzioVar);
                        zzkyVar6.zzg(zzjf.zzc(zzioVar.zzb));
                    }
                    return zzm3;
                }
                return i13;
            default:
                if (i5 == 3) {
                    zzlu zzE = zzE(i6);
                    int i26 = (i3 & (-8)) | 4;
                    int zzc = zzip.zzc(zzE, bArr, i, i2, i26, zzioVar);
                    zzkjVar.add(zzioVar.zzc);
                    while (zzc < i2) {
                        int zzj18 = zzip.zzj(bArr, zzc, zzioVar);
                        if (i3 != zzioVar.zza) {
                            return zzc;
                        }
                        zzc = zzip.zzc(zzE, bArr, zzj18, i2, i26, zzioVar);
                        zzkjVar.add(zzioVar.zzc);
                    }
                    return zzc;
                }
                return i13;
        }
    }

    private final int zzw(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, 0);
    }

    private final int zzx(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzz(i, i2);
    }

    private final int zzy(int i) {
        return this.zzc[i + 2];
    }

    private final int zzz(int i, int i2) {
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

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zza(Object obj) {
        return this.zzi ? zzq(obj) : zzp(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final int zzb(Object obj) {
        int i;
        int zzc;
        int i2;
        int zzr;
        int length = this.zzc.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int zzB = zzB(i4);
            int i5 = this.zzc[i4];
            long j = 1048575 & zzB;
            int i6 = 37;
            switch (zzA(zzB)) {
                case 0:
                    i = i3 * 53;
                    zzc = zzkk.zzc(Double.doubleToLongBits(zzmv.zza(obj, j)));
                    i3 = zzc + i;
                    break;
                case 1:
                    i = i3 * 53;
                    zzc = Float.floatToIntBits(zzmv.zzb(obj, j));
                    i3 = zzc + i;
                    break;
                case 2:
                    i = i3 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i3 = zzc + i;
                    break;
                case 3:
                    i = i3 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i3 = zzc + i;
                    break;
                case 4:
                    i = i3 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i3 = zzc + i;
                    break;
                case 5:
                    i = i3 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i3 = zzc + i;
                    break;
                case 6:
                    i = i3 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i3 = zzc + i;
                    break;
                case 7:
                    i = i3 * 53;
                    zzc = zzkk.zza(zzmv.zzw(obj, j));
                    i3 = zzc + i;
                    break;
                case 8:
                    i = i3 * 53;
                    zzc = ((String) zzmv.zzf(obj, j)).hashCode();
                    i3 = zzc + i;
                    break;
                case 9:
                    Object zzf = zzmv.zzf(obj, j);
                    if (zzf != null) {
                        i6 = zzf.hashCode();
                    }
                    i3 = (i3 * 53) + i6;
                    break;
                case 10:
                    i = i3 * 53;
                    zzc = zzmv.zzf(obj, j).hashCode();
                    i3 = zzc + i;
                    break;
                case 11:
                    i = i3 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i3 = zzc + i;
                    break;
                case 12:
                    i = i3 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i3 = zzc + i;
                    break;
                case 13:
                    i = i3 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i3 = zzc + i;
                    break;
                case 14:
                    i = i3 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i3 = zzc + i;
                    break;
                case 15:
                    i = i3 * 53;
                    zzc = zzmv.zzc(obj, j);
                    i3 = zzc + i;
                    break;
                case 16:
                    i = i3 * 53;
                    zzc = zzkk.zzc(zzmv.zzd(obj, j));
                    i3 = zzc + i;
                    break;
                case 17:
                    Object zzf2 = zzmv.zzf(obj, j);
                    if (zzf2 != null) {
                        i6 = zzf2.hashCode();
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
                    zzc = zzmv.zzf(obj, j).hashCode();
                    i3 = zzc + i;
                    break;
                case 50:
                    i = i3 * 53;
                    zzc = zzmv.zzf(obj, j).hashCode();
                    i3 = zzc + i;
                    break;
                case 51:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzkk.zzc(Double.doubleToLongBits(zzn(obj, j)));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = Float.floatToIntBits(zzo(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 54:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 55:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzr = zzr(obj, j);
                        i3 = i2 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzr = zzr(obj, j);
                        i3 = i2 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzkk.zza(zzS(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = ((String) zzmv.zzf(obj, j)).hashCode();
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 60:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzmv.zzf(obj, j).hashCode();
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 61:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzmv.zzf(obj, j).hashCode();
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzr = zzr(obj, j);
                        i3 = i2 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 63:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzr = zzr(obj, j);
                        i3 = i2 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzr = zzr(obj, j);
                        i3 = i2 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 66:
                    if (zzR(obj, i5, i4)) {
                        i2 = i3 * 53;
                        zzr = zzr(obj, j);
                        i3 = i2 + zzr;
                        break;
                    } else {
                        break;
                    }
                case 67:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzkk.zzc(zzC(obj, j));
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zzR(obj, i5, i4)) {
                        i = i3 * 53;
                        zzc = zzmv.zzf(obj, j).hashCode();
                        i3 = zzc + i;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = this.zzn.zzc(obj).hashCode() + (i3 * 53);
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return hashCode;
    }

    public final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzio zzioVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        zzlm<T> zzlmVar;
        byte b;
        int zzw;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Object obj3;
        int i10;
        zzio zzioVar2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        zzlm<T> zzlmVar2 = this;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i21 = i2;
        int i22 = i3;
        zzio zzioVar3 = zzioVar;
        Unsafe unsafe2 = zzb;
        int i23 = i;
        int i24 = 0;
        int i25 = -1;
        int i26 = 0;
        int i27 = 0;
        int i28 = 1048575;
        while (true) {
            if (i23 < i21) {
                int i29 = i23 + 1;
                byte b2 = bArr2[i23];
                if (b2 < 0) {
                    int zzk = zzip.zzk(b2, bArr2, i29, zzioVar3);
                    b = zzioVar3.zza;
                    i29 = zzk;
                } else {
                    b = b2;
                }
                int i30 = b >>> 3;
                int i31 = b & 7;
                if (i30 > i25) {
                    zzw = zzlmVar2.zzx(i30, i26 / 3);
                } else {
                    zzw = zzlmVar2.zzw(i30);
                }
                if (zzw == -1) {
                    i5 = i30;
                    i6 = i29;
                    i7 = b;
                    i8 = i27;
                    unsafe = unsafe2;
                    i4 = i22;
                    i9 = 0;
                } else {
                    int[] iArr = zzlmVar2.zzc;
                    int i32 = iArr[zzw + 1];
                    int zzA = zzA(i32);
                    int i33 = i29;
                    long j = i32 & 1048575;
                    if (zzA <= 17) {
                        int i34 = iArr[zzw + 2];
                        int i35 = 1 << (i34 >>> 20);
                        int i36 = i34 & 1048575;
                        if (i36 != i28) {
                            i11 = b;
                            if (i28 != 1048575) {
                                unsafe2.putInt(obj4, i28, i27);
                            }
                            i27 = unsafe2.getInt(obj4, i36);
                            i12 = i36;
                        } else {
                            i11 = b;
                            i12 = i28;
                        }
                        int i37 = i27;
                        switch (zzA) {
                            case 0:
                                i13 = zzw;
                                i5 = i30;
                                i14 = i33;
                                if (i31 == 1) {
                                    zzmv.zzo(obj4, j, Double.longBitsToDouble(zzip.zzn(bArr2, i14)));
                                    i23 = i14 + 8;
                                    i27 = i37 | i35;
                                    i25 = i5;
                                    i22 = i3;
                                    i26 = i13;
                                    i24 = i11;
                                    i28 = i12;
                                    i21 = i2;
                                    break;
                                } else {
                                    i33 = i14;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 1:
                                i13 = zzw;
                                i5 = i30;
                                i14 = i33;
                                if (i31 == 5) {
                                    zzmv.zzp(obj4, j, Float.intBitsToFloat(zzip.zzb(bArr2, i14)));
                                    i23 = i14 + 4;
                                    i27 = i37 | i35;
                                    i25 = i5;
                                    i22 = i3;
                                    i26 = i13;
                                    i24 = i11;
                                    i28 = i12;
                                    i21 = i2;
                                    break;
                                } else {
                                    i33 = i14;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 2:
                            case 3:
                                i13 = zzw;
                                i5 = i30;
                                i14 = i33;
                                if (i31 == 0) {
                                    int zzm = zzip.zzm(bArr2, i14, zzioVar3);
                                    unsafe2.putLong(obj, j, zzioVar3.zzb);
                                    i27 = i37 | i35;
                                    i25 = i5;
                                    i22 = i3;
                                    i23 = zzm;
                                    i26 = i13;
                                    i24 = i11;
                                    i28 = i12;
                                    i21 = i2;
                                    break;
                                } else {
                                    i33 = i14;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 4:
                            case 11:
                                i13 = zzw;
                                i5 = i30;
                                i14 = i33;
                                if (i31 == 0) {
                                    i23 = zzip.zzj(bArr2, i14, zzioVar3);
                                    unsafe2.putInt(obj4, j, zzioVar3.zza);
                                    i27 = i37 | i35;
                                    i25 = i5;
                                    i22 = i3;
                                    i26 = i13;
                                    i24 = i11;
                                    i28 = i12;
                                    i21 = i2;
                                    break;
                                } else {
                                    i33 = i14;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 5:
                            case 14:
                                int i38 = i11;
                                i5 = i30;
                                if (i31 == 1) {
                                    i13 = zzw;
                                    i11 = i38;
                                    i14 = i33;
                                    unsafe2.putLong(obj, j, zzip.zzn(bArr2, i33));
                                    i23 = i14 + 8;
                                    i27 = i37 | i35;
                                    i25 = i5;
                                    i22 = i3;
                                    i26 = i13;
                                    i24 = i11;
                                    i28 = i12;
                                    i21 = i2;
                                    break;
                                } else {
                                    i13 = zzw;
                                    i11 = i38;
                                    i33 = i33;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 6:
                            case 13:
                                i15 = i11;
                                i5 = i30;
                                i16 = i33;
                                if (i31 == 5) {
                                    unsafe2.putInt(obj4, j, zzip.zzb(bArr2, i16));
                                    i23 = i16 + 4;
                                    i27 = i37 | i35;
                                    i26 = zzw;
                                    i24 = i15;
                                    i28 = i12;
                                    i25 = i5;
                                    i22 = i3;
                                    break;
                                } else {
                                    i13 = zzw;
                                    i33 = i16;
                                    i11 = i15;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 7:
                                i15 = i11;
                                i5 = i30;
                                i16 = i33;
                                if (i31 == 0) {
                                    i23 = zzip.zzm(bArr2, i16, zzioVar3);
                                    zzmv.zzm(obj4, j, zzioVar3.zzb != 0);
                                    i27 = i37 | i35;
                                    i26 = zzw;
                                    i24 = i15;
                                    i28 = i12;
                                    i25 = i5;
                                    i22 = i3;
                                    break;
                                } else {
                                    i13 = zzw;
                                    i33 = i16;
                                    i11 = i15;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 8:
                                i15 = i11;
                                i5 = i30;
                                i16 = i33;
                                if (i31 == 2) {
                                    if ((536870912 & i32) == 0) {
                                        i23 = zzip.zzg(bArr2, i16, zzioVar3);
                                    } else {
                                        i23 = zzip.zzh(bArr2, i16, zzioVar3);
                                    }
                                    unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    i27 = i37 | i35;
                                    i26 = zzw;
                                    i24 = i15;
                                    i28 = i12;
                                    i25 = i5;
                                    i22 = i3;
                                    break;
                                } else {
                                    i13 = zzw;
                                    i33 = i16;
                                    i11 = i15;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 9:
                                i17 = zzw;
                                i15 = i11;
                                i5 = i30;
                                i18 = i33;
                                if (i31 == 2) {
                                    i23 = zzip.zzd(zzlmVar2.zzE(i17), bArr2, i18, i21, zzioVar3);
                                    if ((i37 & i35) == 0) {
                                        unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j, zzkk.zzg(unsafe2.getObject(obj4, j), zzioVar3.zzc));
                                    }
                                    i27 = i37 | i35;
                                    i25 = i5;
                                    i26 = i17;
                                    i24 = i15;
                                    i28 = i12;
                                    i22 = i3;
                                    break;
                                } else {
                                    i33 = i18;
                                    i13 = i17;
                                    i11 = i15;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 10:
                                i17 = zzw;
                                i15 = i11;
                                i5 = i30;
                                i18 = i33;
                                if (i31 == 2) {
                                    i23 = zzip.zza(bArr2, i18, zzioVar3);
                                    unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    i27 = i37 | i35;
                                    i25 = i5;
                                    i26 = i17;
                                    i24 = i15;
                                    i28 = i12;
                                    i22 = i3;
                                    break;
                                } else {
                                    i33 = i18;
                                    i13 = i17;
                                    i11 = i15;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 12:
                                i17 = zzw;
                                i15 = i11;
                                i5 = i30;
                                i18 = i33;
                                if (i31 == 0) {
                                    i23 = zzip.zzj(bArr2, i18, zzioVar3);
                                    int i39 = zzioVar3.zza;
                                    zzkg zzD = zzlmVar2.zzD(i17);
                                    if (zzD != null && !zzD.zza(i39)) {
                                        zzd(obj).zzh(i15, Long.valueOf(i39));
                                        i25 = i5;
                                        i27 = i37;
                                        i26 = i17;
                                        i24 = i15;
                                        i28 = i12;
                                        i22 = i3;
                                    } else {
                                        unsafe2.putInt(obj4, j, i39);
                                        i27 = i37 | i35;
                                        i25 = i5;
                                        i26 = i17;
                                        i24 = i15;
                                        i28 = i12;
                                        i22 = i3;
                                        break;
                                    }
                                } else {
                                    i33 = i18;
                                    i13 = i17;
                                    i11 = i15;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                                break;
                            case 15:
                                i17 = zzw;
                                i15 = i11;
                                i5 = i30;
                                i18 = i33;
                                if (i31 == 0) {
                                    i23 = zzip.zzj(bArr2, i18, zzioVar3);
                                    unsafe2.putInt(obj4, j, zzjf.zzb(zzioVar3.zza));
                                    i27 = i37 | i35;
                                    i25 = i5;
                                    i26 = i17;
                                    i24 = i15;
                                    i28 = i12;
                                    i22 = i3;
                                    break;
                                } else {
                                    i33 = i18;
                                    i13 = i17;
                                    i11 = i15;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            case 16:
                                if (i31 == 0) {
                                    int zzm2 = zzip.zzm(bArr2, i33, zzioVar3);
                                    i17 = zzw;
                                    i15 = i11;
                                    unsafe2.putLong(obj, j, zzjf.zzc(zzioVar3.zzb));
                                    i27 = i37 | i35;
                                    i25 = i30;
                                    i23 = zzm2;
                                    i26 = i17;
                                    i24 = i15;
                                    i28 = i12;
                                    i22 = i3;
                                    break;
                                } else {
                                    i5 = i30;
                                    i13 = zzw;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                            default:
                                i13 = zzw;
                                i5 = i30;
                                i14 = i33;
                                if (i31 == 3) {
                                    i23 = zzip.zzc(zzlmVar2.zzE(i13), bArr, i14, i2, (i5 << 3) | 4, zzioVar);
                                    if ((i37 & i35) == 0) {
                                        unsafe2.putObject(obj4, j, zzioVar3.zzc);
                                    } else {
                                        unsafe2.putObject(obj4, j, zzkk.zzg(unsafe2.getObject(obj4, j), zzioVar3.zzc));
                                    }
                                    i27 = i37 | i35;
                                    bArr2 = bArr;
                                    i25 = i5;
                                    i22 = i3;
                                    i26 = i13;
                                    i24 = i11;
                                    i28 = i12;
                                    i21 = i2;
                                    break;
                                } else {
                                    i33 = i14;
                                    i4 = i3;
                                    i8 = i37;
                                    unsafe = unsafe2;
                                    i7 = i11;
                                    i6 = i33;
                                    i28 = i12;
                                    i9 = i13;
                                    break;
                                }
                        }
                    } else {
                        int i40 = zzw;
                        int i41 = b;
                        if (zzA != 27) {
                            i8 = i27;
                            i19 = i28;
                            if (zzA <= 49) {
                                i5 = i30;
                                unsafe = unsafe2;
                                i9 = i40;
                                i23 = zzv(obj, bArr, i33, i2, i41, i30, i31, i40, i32, zzA, j, zzioVar);
                                if (i23 != i33) {
                                    zzlmVar2 = this;
                                    obj4 = obj;
                                    bArr2 = bArr;
                                    i25 = i5;
                                    i21 = i2;
                                    i22 = i3;
                                    zzioVar3 = zzioVar;
                                    i24 = i41;
                                    i26 = i9;
                                    i27 = i8;
                                    i28 = i19;
                                    unsafe2 = unsafe;
                                } else {
                                    i4 = i3;
                                    i6 = i23;
                                    i7 = i41;
                                    i28 = i19;
                                }
                            } else {
                                i5 = i30;
                                unsafe = unsafe2;
                                i20 = i33;
                                i9 = i40;
                                if (zzA != 50) {
                                    i23 = zzt(obj, bArr, i20, i2, i41, i5, i31, i32, zzA, j, i9, zzioVar);
                                    if (i23 != i20) {
                                        zzlmVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i25 = i5;
                                        i21 = i2;
                                        i22 = i3;
                                        zzioVar3 = zzioVar;
                                        i24 = i41;
                                        i26 = i9;
                                        i27 = i8;
                                        i28 = i19;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i6 = i23;
                                        i7 = i41;
                                        i28 = i19;
                                    }
                                } else if (i31 == 2) {
                                    i23 = zzs(obj, bArr, i20, i2, i9, j, zzioVar);
                                    if (i23 != i20) {
                                        zzlmVar2 = this;
                                        obj4 = obj;
                                        bArr2 = bArr;
                                        i25 = i5;
                                        i21 = i2;
                                        i22 = i3;
                                        zzioVar3 = zzioVar;
                                        i24 = i41;
                                        i26 = i9;
                                        i27 = i8;
                                        i28 = i19;
                                        unsafe2 = unsafe;
                                    } else {
                                        i4 = i3;
                                        i6 = i23;
                                        i7 = i41;
                                        i28 = i19;
                                    }
                                }
                            }
                        } else if (i31 == 2) {
                            zzkj zzkjVar = (zzkj) unsafe2.getObject(obj4, j);
                            if (!zzkjVar.zzc()) {
                                int size = zzkjVar.size();
                                zzkjVar = zzkjVar.zzd(size == 0 ? 10 : size + size);
                                unsafe2.putObject(obj4, j, zzkjVar);
                            }
                            i24 = i41;
                            i12 = i28;
                            i23 = zzip.zze(zzlmVar2.zzE(i40), i24, bArr, i33, i2, zzkjVar, zzioVar);
                            bArr2 = bArr;
                            i22 = i3;
                            i25 = i30;
                            i26 = i40;
                            i27 = i27;
                            i28 = i12;
                            i21 = i2;
                        } else {
                            i8 = i27;
                            i19 = i28;
                            i5 = i30;
                            unsafe = unsafe2;
                            i20 = i33;
                            i9 = i40;
                        }
                        i4 = i3;
                        i6 = i20;
                        i7 = i41;
                        i28 = i19;
                    }
                }
                if (i7 != i4 || i4 == 0) {
                    if (this.zzh) {
                        zzioVar2 = zzioVar;
                        if (zzioVar2.zzd != zzjo.zza()) {
                            i10 = i5;
                            if (zzioVar2.zzd.zzc(this.zzg, i10) == null) {
                                i23 = zzip.zzi(i7, bArr, i6, i2, zzd(obj), zzioVar);
                                obj3 = obj;
                                i21 = i2;
                                i24 = i7;
                                zzlmVar2 = this;
                                zzioVar3 = zzioVar2;
                                i25 = i10;
                                obj4 = obj3;
                                i26 = i9;
                                i27 = i8;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i22 = i4;
                            } else {
                                zzjz zzjzVar = (zzjz) obj;
                                throw null;
                            }
                        } else {
                            obj3 = obj;
                            i10 = i5;
                        }
                    } else {
                        obj3 = obj;
                        i10 = i5;
                        zzioVar2 = zzioVar;
                    }
                    i23 = zzip.zzi(i7, bArr, i6, i2, zzd(obj), zzioVar);
                    i21 = i2;
                    i24 = i7;
                    zzlmVar2 = this;
                    zzioVar3 = zzioVar2;
                    i25 = i10;
                    obj4 = obj3;
                    i26 = i9;
                    i27 = i8;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i22 = i4;
                } else {
                    zzlmVar = this;
                    obj2 = obj;
                    i23 = i6;
                    i24 = i7;
                    i27 = i8;
                }
            } else {
                unsafe = unsafe2;
                i4 = i22;
                obj2 = obj4;
                zzlmVar = zzlmVar2;
            }
        }
        if (i28 != 1048575) {
            unsafe.putInt(obj2, i28, i27);
        }
        for (int i42 = zzlmVar.zzk; i42 < zzlmVar.zzl; i42++) {
            int i43 = zzlmVar.zzj[i42];
            int i44 = zzlmVar.zzc[i43];
            Object zzf = zzmv.zzf(obj2, zzlmVar.zzB(i43) & 1048575);
            if (zzf != null && zzlmVar.zzD(i43) != null) {
                zzld zzldVar = (zzld) zzf;
                zzlc zzlcVar = (zzlc) zzlmVar.zzF(i43);
                throw null;
            }
        }
        if (i4 == 0) {
            if (i23 != i2) {
                throw zzkm.zze();
            }
        } else if (i23 > i2 || i24 != i4) {
            throw zzkm.zze();
        }
        return i23;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final Object zze() {
        return ((zzkc) this.zzg).zzl(4, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzf(Object obj) {
        int i;
        int i2 = this.zzk;
        while (true) {
            i = this.zzl;
            if (i2 >= i) {
                break;
            }
            long zzB = zzB(this.zzj[i2]) & 1048575;
            Object zzf = zzmv.zzf(obj, zzB);
            if (zzf != null) {
                ((zzld) zzf).zzc();
                zzmv.zzs(obj, zzB, zzf);
            }
            i2++;
        }
        int length = this.zzj.length;
        while (i < length) {
            this.zzm.zza(obj, this.zzj[i]);
            i++;
        }
        this.zzn.zzg(obj);
        if (this.zzh) {
            this.zzo.zzb(obj);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzg(Object obj, Object obj2) {
        Objects.requireNonNull(obj2);
        for (int i = 0; i < this.zzc.length; i += 3) {
            int zzB = zzB(i);
            long j = 1048575 & zzB;
            int i2 = this.zzc[i];
            switch (zzA(zzB)) {
                case 0:
                    if (zzO(obj2, i)) {
                        zzmv.zzo(obj, j, zzmv.zza(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zzO(obj2, i)) {
                        zzmv.zzp(obj, j, zzmv.zzb(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zzO(obj2, i)) {
                        zzmv.zzm(obj, j, zzmv.zzw(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zzO(obj2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zzH(obj, obj2, i);
                    break;
                case 10:
                    if (zzO(obj2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zzO(obj2, i)) {
                        zzmv.zzq(obj, j, zzmv.zzc(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zzO(obj2, i)) {
                        zzmv.zzr(obj, j, zzmv.zzd(obj2, j));
                        zzJ(obj, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zzH(obj, obj2, i);
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
                    this.zzm.zzb(obj, obj2, j);
                    break;
                case 50:
                    zzlw.zzaa(this.zzq, obj, obj2, j);
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
                    if (zzR(obj2, i2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 60:
                    zzI(obj, obj2, i);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (zzR(obj2, i2, i)) {
                        zzmv.zzs(obj, j, zzmv.zzf(obj2, j));
                        zzK(obj, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzI(obj, obj2, i);
                    break;
            }
        }
        zzlw.zzF(this.zzn, obj, obj2);
        if (this.zzh) {
            zzlw.zzE(this.zzo, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzh(Object obj, byte[] bArr, int i, int i2, zzio zzioVar) throws IOException {
        if (this.zzi) {
            zzu(obj, bArr, i, i2, zzioVar);
        } else {
            zzc(obj, bArr, i, i2, 0, zzioVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final void zzi(Object obj, zznd zzndVar) throws IOException {
        if (!this.zzi) {
            zzL(obj, zzndVar);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzB = zzB(i);
                int i2 = this.zzc[i];
                switch (zzA(zzB)) {
                    case 0:
                        if (zzO(obj, i)) {
                            zzndVar.zzf(i2, zzmv.zza(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zzO(obj, i)) {
                            zzndVar.zzo(i2, zzmv.zzb(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zzO(obj, i)) {
                            zzndVar.zzt(i2, zzmv.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zzO(obj, i)) {
                            zzndVar.zzJ(i2, zzmv.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zzO(obj, i)) {
                            zzndVar.zzr(i2, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zzO(obj, i)) {
                            zzndVar.zzm(i2, zzmv.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zzO(obj, i)) {
                            zzndVar.zzk(i2, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zzO(obj, i)) {
                            zzndVar.zzb(i2, zzmv.zzw(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zzO(obj, i)) {
                            zzT(i2, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zzO(obj, i)) {
                            zzndVar.zzv(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zzO(obj, i)) {
                            zzndVar.zzd(i2, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zzO(obj, i)) {
                            zzndVar.zzH(i2, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zzO(obj, i)) {
                            zzndVar.zzi(i2, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zzO(obj, i)) {
                            zzndVar.zzw(i2, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zzO(obj, i)) {
                            zzndVar.zzy(i2, zzmv.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zzO(obj, i)) {
                            zzndVar.zzA(i2, zzmv.zzc(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zzO(obj, i)) {
                            zzndVar.zzC(i2, zzmv.zzd(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zzO(obj, i)) {
                            zzndVar.zzq(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzlw.zzJ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 19:
                        zzlw.zzN(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 20:
                        zzlw.zzQ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 21:
                        zzlw.zzY(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 22:
                        zzlw.zzP(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 23:
                        zzlw.zzM(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 24:
                        zzlw.zzL(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 25:
                        zzlw.zzH(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 26:
                        zzlw.zzW(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    case 27:
                        zzlw.zzR(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i));
                        break;
                    case 28:
                        zzlw.zzI(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar);
                        break;
                    case 29:
                        zzlw.zzX(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 30:
                        zzlw.zzK(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 31:
                        zzlw.zzS(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 32:
                        zzlw.zzT(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 33:
                        zzlw.zzU(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 34:
                        zzlw.zzV(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, false);
                        break;
                    case 35:
                        zzlw.zzJ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 36:
                        zzlw.zzN(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 37:
                        zzlw.zzQ(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 38:
                        zzlw.zzY(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 39:
                        zzlw.zzP(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 40:
                        zzlw.zzM(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 41:
                        zzlw.zzL(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 42:
                        zzlw.zzH(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 43:
                        zzlw.zzX(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 44:
                        zzlw.zzK(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 45:
                        zzlw.zzS(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 46:
                        zzlw.zzT(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 47:
                        zzlw.zzU(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 48:
                        zzlw.zzV(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, true);
                        break;
                    case 49:
                        zzlw.zzO(i2, (List) zzmv.zzf(obj, zzB & 1048575), zzndVar, zzE(i));
                        break;
                    case 50:
                        zzM(zzndVar, i2, zzmv.zzf(obj, zzB & 1048575), i);
                        break;
                    case 51:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzf(i2, zzn(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzo(i2, zzo(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzt(i2, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzJ(i2, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzr(i2, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzm(i2, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzk(i2, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzb(i2, zzS(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zzR(obj, i2, i)) {
                            zzT(i2, zzmv.zzf(obj, zzB & 1048575), zzndVar);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzv(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzd(i2, (zzjb) zzmv.zzf(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzH(i2, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzi(i2, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzw(i2, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzy(i2, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzA(i2, zzr(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzC(i2, zzC(obj, zzB & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zzR(obj, i2, i)) {
                            zzndVar.zzq(i2, zzmv.zzf(obj, zzB & 1048575), zzE(i));
                            break;
                        } else {
                            break;
                        }
                }
            }
            zzml zzmlVar = this.zzn;
            zzmlVar.zzi(zzmlVar.zzc(obj), zzndVar);
        } else {
            this.zzo.zza(obj);
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzj(Object obj, Object obj2) {
        boolean zzZ;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzB = zzB(i);
            long j = zzB & 1048575;
            switch (zzA(zzB)) {
                case 0:
                    if (zzN(obj, obj2, i) && Double.doubleToLongBits(zzmv.zza(obj, j)) == Double.doubleToLongBits(zzmv.zza(obj2, j))) {
                        continue;
                    }
                    return false;
                case 1:
                    if (zzN(obj, obj2, i) && Float.floatToIntBits(zzmv.zzb(obj, j)) == Float.floatToIntBits(zzmv.zzb(obj2, j))) {
                        continue;
                    }
                    return false;
                case 2:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 3:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 4:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 5:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 6:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 7:
                    if (zzN(obj, obj2, i) && zzmv.zzw(obj, j) == zzmv.zzw(obj2, j)) {
                        continue;
                    }
                    return false;
                case 8:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 9:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 10:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                case 11:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 12:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 13:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 14:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 15:
                    if (zzN(obj, obj2, i) && zzmv.zzc(obj, j) == zzmv.zzc(obj2, j)) {
                        continue;
                    }
                    return false;
                case 16:
                    if (zzN(obj, obj2, i) && zzmv.zzd(obj, j) == zzmv.zzd(obj2, j)) {
                        continue;
                    }
                    return false;
                case 17:
                    if (zzN(obj, obj2, i) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
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
                    zzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
                    break;
                case 50:
                    zzZ = zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j));
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
                    long zzy = zzy(i) & 1048575;
                    if (zzmv.zzc(obj, zzy) == zzmv.zzc(obj2, zzy) && zzlw.zzZ(zzmv.zzf(obj, j), zzmv.zzf(obj2, j))) {
                        continue;
                    }
                    return false;
                default:
            }
            if (!zzZ) {
                return false;
            }
        }
        if (this.zzn.zzc(obj).equals(this.zzn.zzc(obj2))) {
            if (this.zzh) {
                this.zzo.zza(obj);
                this.zzo.zza(obj2);
                throw null;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzlu
    public final boolean zzk(Object obj) {
        int i;
        int i2;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzk) {
            int i6 = this.zzj[i5];
            int i7 = this.zzc[i6];
            int zzB = zzB(i6);
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
            if ((268435456 & zzB) != 0 && !zzP(obj, i6, i, i2, i10)) {
                return false;
            }
            int zzA = zzA(zzB);
            if (zzA != 9 && zzA != 17) {
                if (zzA != 27) {
                    if (zzA == 60 || zzA == 68) {
                        if (zzR(obj, i7, i6) && !zzQ(obj, zzB, zzE(i6))) {
                            return false;
                        }
                    } else if (zzA != 49) {
                        if (zzA == 50 && !((zzld) zzmv.zzf(obj, zzB & 1048575)).isEmpty()) {
                            zzlc zzlcVar = (zzlc) zzF(i6);
                            throw null;
                        }
                    }
                }
                List list = (List) zzmv.zzf(obj, zzB & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    zzlu zzE = zzE(i6);
                    for (int i11 = 0; i11 < list.size(); i11++) {
                        if (!zzE.zzk(list.get(i11))) {
                            return false;
                        }
                    }
                    continue;
                }
            } else if (zzP(obj, i6, i, i2, i10) && !zzQ(obj, zzB, zzE(i6))) {
                return false;
            }
            i5++;
            i3 = i;
            i4 = i2;
        }
        if (this.zzh) {
            this.zzo.zza(obj);
            throw null;
        }
        return true;
    }
}